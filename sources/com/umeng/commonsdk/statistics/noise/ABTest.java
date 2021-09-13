package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.UContent;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler.C3230a;
import com.umeng.commonsdk.statistics.internal.OnImprintChangedListener;

public class ABTest implements OnImprintChangedListener {
    private static ABTest instance;
    private Context context = null;
    private boolean isInTest = false;
    private int mGroup = -1;
    private int mInterval = -1;
    private String mPoli = null;
    private int mPolicy = -1;
    private float mProb07 = 0.0f;
    private float mProb13 = 0.0f;

    private ABTest(Context context2, String str, int i) {
        this.context = context2;
        onExperimentChanged(str, i);
    }

    public static synchronized ABTest getService(Context context2) {
        ABTest aBTest;
        synchronized (ABTest.class) {
            if (instance == null) {
                instance = new ABTest(context2, UMEnvelopeBuild.imprintProperty(context2, "client_test", null), Integer.valueOf(UMEnvelopeBuild.imprintProperty(context2, "test_report_interval", "0")).intValue());
            }
            aBTest = instance;
        }
        return aBTest;
    }

    private void parseFIXED(String str) {
        if (str != null) {
            String[] split = str.split("\\|");
            float f = 0.0f;
            if (split[2].equals("SIG13")) {
                f = Float.valueOf(split[3]).floatValue();
            }
            if (this.mProb13 > f) {
                this.isInTest = false;
                return;
            }
            int intValue = split[0].equals("FIXED") ? Integer.valueOf(split[1]).intValue() : -1;
            int[] iArr = null;
            String str2 = "RPT";
            String str3 = ",";
            if (split[4].equals(str2)) {
                this.mPoli = str2;
                String[] split2 = split[5].split(str3);
                iArr = new int[split2.length];
                for (int i = 0; i < split2.length; i++) {
                    iArr[i] = Integer.valueOf(split2[i]).intValue();
                }
            } else {
                String str4 = "DOM";
                if (split[4].equals(str4)) {
                    this.mPoli = str4;
                    this.isInTest = true;
                    try {
                        String[] split3 = split[5].split(str3);
                        iArr = new int[split3.length];
                        for (int i2 = 0; i2 < split3.length; i2++) {
                            iArr[i2] = Integer.valueOf(split3[i2]).intValue();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            if (intValue != -1) {
                this.isInTest = true;
                this.mGroup = intValue;
                if (iArr != null) {
                    this.mPolicy = iArr[intValue - 1];
                }
            } else {
                this.isInTest = false;
            }
        }
    }

    private void parseSig7(String str) {
        float[] fArr;
        if (str != null) {
            String[] split = str.split("\\|");
            float f = 0.0f;
            if (this.mProb13 > (split[2].equals("SIG13") ? Float.valueOf(split[3]).floatValue() : 0.0f)) {
                this.isInTest = false;
                return;
            }
            int[] iArr = null;
            String str2 = ",";
            if (split[0].equals("SIG7")) {
                String[] split2 = split[1].split(str2);
                fArr = new float[split2.length];
                for (int i = 0; i < split2.length; i++) {
                    fArr[i] = Float.valueOf(split2[i]).floatValue();
                }
            } else {
                fArr = null;
            }
            String str3 = "RPT";
            if (split[4].equals(str3)) {
                this.mPoli = str3;
                String[] split3 = split[5].split(str2);
                iArr = new int[split3.length];
                for (int i2 = 0; i2 < split3.length; i2++) {
                    iArr[i2] = Integer.valueOf(split3[i2]).intValue();
                }
            } else {
                String str4 = "DOM";
                if (split[4].equals(str4)) {
                    this.isInTest = true;
                    this.mPoli = str4;
                    try {
                        String[] split4 = split[5].split(str2);
                        iArr = new int[split4.length];
                        for (int i3 = 0; i3 < split4.length; i3++) {
                            iArr[i3] = Integer.valueOf(split4[i3]).intValue();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            int i4 = 0;
            while (true) {
                if (i4 >= fArr.length) {
                    i4 = -1;
                    break;
                }
                f += fArr[i4];
                if (this.mProb07 < f) {
                    break;
                }
                i4++;
            }
            if (i4 != -1) {
                this.isInTest = true;
                this.mGroup = i4 + 1;
                if (iArr != null) {
                    this.mPolicy = iArr[i4];
                }
            } else {
                this.isInTest = false;
            }
        }
    }

    private float prob(String str, int i) {
        int i2 = i * 2;
        if (str == null) {
            return 0.0f;
        }
        return ((float) Integer.valueOf(str.substring(i2, i2 + 5), 16).intValue()) / 1048576.0f;
    }

    public static boolean validate(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("\\|");
        if (split.length != 6) {
            return false;
        }
        String str2 = ",";
        if (split[0].startsWith("SIG7") && split[1].split(str2).length == split[5].split(str2).length) {
            return true;
        }
        if (split[0].startsWith("FIXED")) {
            int length = split[5].split(str2).length;
            int parseInt = Integer.parseInt(split[1]);
            if (length < parseInt || parseInt < 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int getGroup() {
        return this.mGroup;
    }

    public String getGroupInfo() {
        if (!this.isInTest) {
            return UContent.f16880O;
        }
        return String.valueOf(this.mGroup);
    }

    public int getTestInterval() {
        return this.mInterval;
    }

    public String getTestName() {
        return this.mPoli;
    }

    public int getTestPolicy() {
        return this.mPolicy;
    }

    public boolean isInTest() {
        return this.isInTest;
    }

    public void onExperimentChanged(String str, int i) {
        this.mInterval = i;
        String signature = Envelope.getSignature(this.context);
        if (TextUtils.isEmpty(signature) || TextUtils.isEmpty(str)) {
            this.isInTest = false;
            return;
        }
        try {
            this.mProb13 = prob(signature, 12);
            this.mProb07 = prob(signature, 6);
            if (str.startsWith("SIG7")) {
                parseSig7(str);
            } else if (str.startsWith("FIXED")) {
                parseFIXED(str);
            }
        } catch (Exception e) {
            this.isInTest = false;
            StringBuilder sb = new StringBuilder();
            sb.append("v:");
            sb.append(str);
            MLog.m22445e(sb.toString(), (Throwable) e);
        }
    }

    public void onImprintChanged(C3230a aVar) {
        onExperimentChanged(aVar.mo19353a("client_test", null), Integer.valueOf(aVar.mo19353a("test_report_interval", "0")).intValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" p13:");
        sb.append(this.mProb13);
        sb.append(" p07:");
        sb.append(this.mProb07);
        sb.append(" policy:");
        sb.append(this.mPolicy);
        sb.append(" interval:");
        sb.append(this.mInterval);
        return sb.toString();
    }
}
