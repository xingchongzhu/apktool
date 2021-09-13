package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.pro.TSerializer;
import com.umeng.analytics.pro.UMCommonContent;
import com.umeng.analytics.pro.UMEnvelope;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeflaterHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.umcrash.BuildConfig;
import java.io.File;
import org.json.JSONObject;

public class Envelope {
    private static final String dummyID1 = "1234567890987654321";
    private static final String dummyID2 = "02:00:00:00:00:00";
    private final int CODEX_ENCRYPT = 1;
    private final int CODEX_NORMAL = 0;
    private final byte[] SEED = {0, 0, 0, 0, 0, 0, 0, 0};
    private boolean encrypt = false;
    private byte[] identity = null;
    private String mAddress = null;
    private byte[] mChecksum = null;
    private byte[] mEntity = null;
    private byte[] mGuid = null;
    private int mLength = 0;
    private int mSerialNo = 0;
    private byte[] mSignature = null;
    private int mTimestamp = 0;
    private String mVersion = BuildConfig.VERSION_NAME;

    private Envelope(byte[] bArr, String str, byte[] bArr2) throws Exception {
        if (bArr == null || bArr.length == 0) {
            throw new Exception("entity is null or empty");
        }
        this.mAddress = str;
        this.mLength = bArr.length;
        this.mEntity = DeflaterHelper.m22508a(bArr);
        this.mTimestamp = (int) (System.currentTimeMillis() / 1000);
        this.identity = bArr2;
    }

    private byte[] genCheckSum() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataHelper.toHexString(this.mSignature));
        sb.append(this.mSerialNo);
        sb.append(this.mTimestamp);
        sb.append(this.mLength);
        sb.append(DataHelper.toHexString(this.mGuid));
        return DataHelper.hash(sb.toString().getBytes());
    }

    public static Envelope genEncryptEnvelope(Context context, String str, byte[] bArr) {
        String str2 = "serial";
        String str3 = "signature";
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            String string = sharedPreferences.getString(str3, null);
            int i = sharedPreferences.getInt(str2, 1);
            Envelope envelope = new Envelope(bArr, str, "123456789098765432102:00:00:00:00:00".getBytes());
            envelope.setEncrypt(true);
            envelope.setSignature(string);
            envelope.setSerialNumber(i);
            envelope.seal();
            sharedPreferences.edit().putInt(str2, i + 1).putString(str3, envelope.getSignature()).commit();
            envelope.export(context);
            return envelope;
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            return null;
        }
    }

    public static Envelope genEnvelope(Context context, String str, byte[] bArr) {
        String str2 = "serial";
        String str3 = "signature";
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            String string = sharedPreferences.getString(str3, null);
            int i = sharedPreferences.getInt(str2, 1);
            Envelope envelope = new Envelope(bArr, str, "123456789098765432102:00:00:00:00:00".getBytes());
            envelope.setSignature(string);
            envelope.setSerialNumber(i);
            envelope.seal();
            sharedPreferences.edit().putInt(str2, i + 1).putString(str3, envelope.getSignature()).commit();
            envelope.export(context);
            return envelope;
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            return null;
        }
    }

    private byte[] genGuid(byte[] bArr, int i) {
        byte[] hash = DataHelper.hash(this.identity);
        byte[] hash2 = DataHelper.hash(this.mEntity);
        int length = hash.length;
        int i2 = length * 2;
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 2;
            bArr2[i4] = hash2[i3];
            bArr2[i4 + 1] = hash[i3];
        }
        for (int i5 = 0; i5 < 2; i5++) {
            bArr2[i5] = bArr[i5];
            bArr2[(i2 - i5) - 1] = bArr[(bArr.length - i5) - 1];
        }
        byte[] bArr3 = {(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) (i >>> 24)};
        for (int i6 = 0; i6 < i2; i6++) {
            bArr2[i6] = (byte) (bArr2[i6] ^ bArr3[i6 % 4]);
        }
        return bArr2;
    }

    private byte[] genSignature() {
        return genGuid(this.SEED, (int) (System.currentTimeMillis() / 1000));
    }

    public static String getSignature(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("signature", null);
    }

    public void export(Context context) {
        String str = "appkey";
        String str2 = this.mAddress;
        String str3 = UMCommonContent.f16645g;
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, str3, null);
        String hexString = DataHelper.toHexString(this.mSignature);
        byte[] bArr = new byte[16];
        System.arraycopy(this.mSignature, 2, bArr, 0, 16);
        String hexString2 = DataHelper.toHexString(DataHelper.hash(bArr));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, str2);
            if (imprintProperty != null) {
                jSONObject.put(str3, imprintProperty);
            }
            jSONObject.put("signature", hexString);
            jSONObject.put("checksum", hexString2);
            File file = new File(context.getFilesDir(), ".umeng");
            if (!file.exists()) {
                file.mkdir();
            }
            HelperUtils.writeFile(new File(file, "exchangeIdentity.json"), jSONObject.toString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str, str2);
            jSONObject2.put("channel", UMUtils.getChannel(context));
            if (imprintProperty != null) {
                jSONObject2.put(str3, HelperUtils.getUmengMD5(imprintProperty));
            }
            HelperUtils.writeFile(new File(context.getFilesDir(), "exid.dat"), jSONObject2.toString());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void seal() {
        if (this.mSignature == null) {
            this.mSignature = genSignature();
        }
        if (this.encrypt) {
            byte[] bArr = new byte[16];
            try {
                System.arraycopy(this.mSignature, 1, bArr, 0, 16);
                this.mEntity = DataHelper.encrypt(this.mEntity, bArr);
            } catch (Exception unused) {
            }
        }
        this.mGuid = genGuid(this.mSignature, this.mTimestamp);
        this.mChecksum = genCheckSum();
    }

    public void setEncrypt(boolean z) {
        this.encrypt = z;
    }

    public void setSerialNumber(int i) {
        this.mSerialNo = i;
    }

    public void setSignature(String str) {
        this.mSignature = DataHelper.reverseHexString(str);
    }

    public byte[] toBinary() {
        UMEnvelope ajVar = new UMEnvelope();
        ajVar.mo18877a(this.mVersion);
        ajVar.mo18882b(this.mAddress);
        ajVar.mo18886c(DataHelper.toHexString(this.mSignature));
        ajVar.mo18876a(this.mSerialNo);
        ajVar.mo18881b(this.mTimestamp);
        ajVar.mo18885c(this.mLength);
        ajVar.mo18879a(this.mEntity);
        ajVar.mo18890d(this.encrypt ? 1 : 0);
        ajVar.mo18891d(DataHelper.toHexString(this.mGuid));
        ajVar.mo18896e(DataHelper.toHexString(this.mChecksum));
        try {
            return new TSerializer().mo18975a(ajVar);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("version : %s\n", new Object[]{this.mVersion}));
        sb.append(String.format("address : %s\n", new Object[]{this.mAddress}));
        sb.append(String.format("signature : %s\n", new Object[]{DataHelper.toHexString(this.mSignature)}));
        sb.append(String.format("serial : %s\n", new Object[]{Integer.valueOf(this.mSerialNo)}));
        sb.append(String.format("timestamp : %d\n", new Object[]{Integer.valueOf(this.mTimestamp)}));
        sb.append(String.format("length : %d\n", new Object[]{Integer.valueOf(this.mLength)}));
        sb.append(String.format("guid : %s\n", new Object[]{DataHelper.toHexString(this.mGuid)}));
        sb.append(String.format("checksum : %s ", new Object[]{DataHelper.toHexString(this.mChecksum)}));
        sb.append(String.format("codex : %d", new Object[]{Integer.valueOf(this.encrypt ? 1 : 0)}));
        return sb.toString();
    }

    public String getSignature() {
        return DataHelper.toHexString(this.mSignature);
    }
}
