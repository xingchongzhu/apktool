package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.umeng.analytics.pro.TSerializer;
import com.umeng.analytics.pro.UContent;
import com.umeng.analytics.pro.UMCommonContent;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.stateless.UMSLConfig;
import com.umeng.commonsdk.stateless.UMSLNetWorkSender;
import com.umeng.commonsdk.stateless.UMSLUtils;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.IdTracker;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.statistics.b */
public class EnvelopeManager {

    /* renamed from: a */
    public static String f17646a = null;

    /* renamed from: b */
    public static String f17647b = "";

    /* renamed from: c */
    private static final String f17648c = "EnvelopeManager";

    /* renamed from: d */
    private static final String f17649d = "debug.umeng.umTaskId";

    /* renamed from: e */
    private static final String f17650e = "debug.umeng.umCaseId";

    /* renamed from: f */
    private static final String f17651f = "empty";

    /* renamed from: g */
    private static String f17652g = "";

    /* renamed from: h */
    private static String f17653h = "";

    /* renamed from: i */
    private static String f17654i;

    /* renamed from: k */
    private static boolean f17655k;

    /* renamed from: j */
    private int f17656j = 0;

    /* renamed from: a */
    public static void m22427a() {
        if (f17654i != null) {
            f17654i = null;
            IdTracker.m22567a();
        }
    }

    /* renamed from: b */
    private static boolean m22430b() {
        String str = "";
        f17652g = UMUtils.getSystemProperty(f17649d, str);
        f17653h = UMUtils.getSystemProperty(f17650e, str);
        boolean isEmpty = TextUtils.isEmpty(f17652g);
        String str2 = f17651f;
        return (!isEmpty && !str2.equals(f17652g)) && (!TextUtils.isEmpty(f17653h) && !str2.equals(f17653h));
    }

    /* renamed from: a */
    public static long m22423a(Context context) {
        long j = DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
        if (ULog.DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("free size is ");
            sb.append(j);
            Log.i(f17648c, sb.toString());
        }
        return j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(30:9|10|11|(2:13|14)(1:15)|16|(1:18)|19|(1:21)|22|(1:24)|25|(1:27)|28|29|(3:31|32|33)(2:34|(1:36)(1:37))|38|(1:40)|41|(1:43)|44|(1:46)|47|(1:49)|50|51|(1:53)|54|55|56|57) */
    /* JADX WARNING: Can't wrap try/catch for region: R(57:60|61|62|63|(5:65|66|(1:68)|69|(1:71))|72|74|75|76|77|(1:79)|(3:83|84|(1:86))|90|91|92|93|94|95|(3:97|98|99)(1:100)|101|102|(1:104)|105|106|(1:108)|109|(1:111)|112|(1:114)|115|(1:117)|118|(1:120)|121|(1:123)|124|(1:126)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(1:141)|142|143|144|(1:146)|147|148|(3:152|153|154)|158|(2:160|161)|164) */
    /* JADX WARNING: Can't wrap try/catch for region: R(61:60|61|62|63|65|66|(1:68)|69|(1:71)|72|74|75|76|77|(1:79)|(3:83|84|(1:86))|90|91|92|93|94|95|(3:97|98|99)(1:100)|101|102|(1:104)|105|106|(1:108)|109|(1:111)|112|(1:114)|115|(1:117)|118|(1:120)|121|(1:123)|124|(1:126)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(1:141)|142|143|144|(1:146)|147|148|(3:152|153|154)|158|(2:160|161)|164) */
    /* JADX WARNING: Can't wrap try/catch for region: R(63:60|61|62|63|65|66|(1:68)|69|(1:71)|72|74|75|76|77|(1:79)|83|84|(1:86)|90|91|92|93|94|95|(3:97|98|99)(1:100)|101|102|(1:104)|105|106|(1:108)|109|(1:111)|112|(1:114)|115|(1:117)|118|(1:120)|121|(1:123)|124|(1:126)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(1:141)|142|143|144|(1:146)|147|148|(3:152|153|154)|158|(2:160|161)|164) */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03c7, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x026f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r13, r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x02b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x02c5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x038a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x0399 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x01ff */
    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0293 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ac A[Catch:{ all -> 0x02b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02b7 A[Catch:{ all -> 0x02c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02d9 A[Catch:{ all -> 0x038a }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02e8 A[Catch:{ all -> 0x038a }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02f7 A[Catch:{ all -> 0x038a }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0306 A[Catch:{ all -> 0x038a }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0315 A[Catch:{ all -> 0x038a }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0324 A[Catch:{ all -> 0x038a }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0333 A[Catch:{ all -> 0x038a }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0342 A[Catch:{ all -> 0x038a }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0351 A[Catch:{ all -> 0x038a }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0360 A[Catch:{ all -> 0x038a }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x036f A[Catch:{ all -> 0x038a }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x037e A[Catch:{ all -> 0x038a }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0394 A[Catch:{ all -> 0x0399 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03ba A[Catch:{ Exception -> 0x026f, all -> 0x03c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02a6  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject m22429b(android.content.Context r13) {
        /*
            java.lang.String r0 = "2G/3G"
            java.lang.String r1 = "Android"
            java.lang.String r2 = "umid"
            java.lang.String r3 = "failed_requests"
            r4 = 0
            android.content.SharedPreferences r5 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r13)     // Catch:{ all -> 0x03c6 }
            java.lang.String r6 = f17654i     // Catch:{ all -> 0x03c6 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x03c6 }
            r7 = 0
            if (r6 != 0) goto L_0x0022
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x001f }
            java.lang.String r1 = f17654i     // Catch:{ Exception -> 0x001f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x001f }
            goto L_0x0206
        L_0x001f:
            r0 = r4
            goto L_0x0206
        L_0x0022:
            com.umeng.commonsdk.utils.UMUtils.saveSDKComponent()     // Catch:{ all -> 0x03c6 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x03c6 }
            r6.<init>()     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "app_signature"
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppMD5Signature(r13)     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "app_sig_sha1"
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppSHA1Key(r13)     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "app_sig_sha"
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppHashKey(r13)     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "app_version"
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionName(r13)     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "version_code"
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionCode(r13)     // Catch:{ all -> 0x03c6 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "idmd5"
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceIdUmengMD5(r13)     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "cpu"
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.getCPU()     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMCCMNC(r13)     // Catch:{ all -> 0x03c6 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x03c6 }
            java.lang.String r10 = ""
            java.lang.String r11 = "mccmnc"
            if (r9 != 0) goto L_0x0081
            r6.put(r11, r8)     // Catch:{ all -> 0x03c6 }
            f17647b = r8     // Catch:{ all -> 0x03c6 }
            goto L_0x0084
        L_0x0081:
            r6.put(r11, r10)     // Catch:{ all -> 0x03c6 }
        L_0x0084:
            java.lang.String r8 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSubOSName(r13)     // Catch:{ all -> 0x03c6 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x03c6 }
            if (r9 != 0) goto L_0x0093
            java.lang.String r9 = "sub_os_name"
            r6.put(r9, r8)     // Catch:{ all -> 0x03c6 }
        L_0x0093:
            java.lang.String r8 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSubOSVersion(r13)     // Catch:{ all -> 0x03c6 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x03c6 }
            if (r9 != 0) goto L_0x00a2
            java.lang.String r9 = "sub_os_version"
            r6.put(r9, r8)     // Catch:{ all -> 0x03c6 }
        L_0x00a2:
            java.lang.String r8 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceType(r13)     // Catch:{ all -> 0x03c6 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x03c6 }
            if (r9 != 0) goto L_0x00b1
            java.lang.String r9 = "device_type"
            r6.put(r9, r8)     // Catch:{ all -> 0x03c6 }
        L_0x00b1:
            java.lang.String r8 = "package_name"
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.getPackageName(r13)     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "sdk_type"
            r6.put(r8, r1)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "device_id"
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceId(r13)     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "device_model"
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "device_board"
            java.lang.String r9 = android.os.Build.BOARD     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "device_brand"
            java.lang.String r9 = android.os.Build.BRAND     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "device_manutime"
            long r11 = android.os.Build.TIME     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r11)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "device_manufacturer"
            java.lang.String r9 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "device_manuid"
            java.lang.String r9 = android.os.Build.ID     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "device_name"
            java.lang.String r9 = android.os.Build.DEVICE     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "os_version"
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x03c6 }
            r6.put(r8, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r8 = "os"
            r6.put(r8, r1)     // Catch:{ all -> 0x03c6 }
            int[] r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.getResolutionArray(r13)     // Catch:{ all -> 0x03c6 }
            r8 = 1
            if (r1 == 0) goto L_0x0129
            java.lang.String r9 = "resolution"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c6 }
            r11.<init>()     // Catch:{ all -> 0x03c6 }
            r12 = r1[r8]     // Catch:{ all -> 0x03c6 }
            r11.append(r12)     // Catch:{ all -> 0x03c6 }
            java.lang.String r12 = "*"
            r11.append(r12)     // Catch:{ all -> 0x03c6 }
            r1 = r1[r7]     // Catch:{ all -> 0x03c6 }
            r11.append(r1)     // Catch:{ all -> 0x03c6 }
            java.lang.String r1 = r11.toString()     // Catch:{ all -> 0x03c6 }
            r6.put(r9, r1)     // Catch:{ all -> 0x03c6 }
        L_0x0129:
            java.lang.String r1 = "mc"
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMac(r13)     // Catch:{ all -> 0x03c6 }
            r6.put(r1, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r1 = "timezone"
            int r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.getTimeZone(r13)     // Catch:{ all -> 0x03c6 }
            r6.put(r1, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String[] r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.getLocaleInfo(r13)     // Catch:{ all -> 0x03c6 }
            java.lang.String r9 = "country"
            r11 = r1[r7]     // Catch:{ all -> 0x03c6 }
            r6.put(r9, r11)     // Catch:{ all -> 0x03c6 }
            java.lang.String r9 = "language"
            r1 = r1[r8]     // Catch:{ all -> 0x03c6 }
            r6.put(r9, r1)     // Catch:{ all -> 0x03c6 }
            java.lang.String r1 = "carrier"
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkOperatorName(r13)     // Catch:{ all -> 0x03c6 }
            r6.put(r1, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String r1 = "display_name"
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppName(r13)     // Catch:{ all -> 0x03c6 }
            r6.put(r1, r9)     // Catch:{ all -> 0x03c6 }
            java.lang.String[] r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkAccessMode(r13)     // Catch:{ all -> 0x03c6 }
            java.lang.String r9 = "Wi-Fi"
            r11 = r1[r7]     // Catch:{ all -> 0x03c6 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x03c6 }
            java.lang.String r11 = "access"
            if (r9 == 0) goto L_0x0175
            java.lang.String r0 = "wifi"
            r6.put(r11, r0)     // Catch:{ all -> 0x03c6 }
            goto L_0x0186
        L_0x0175:
            r9 = r1[r7]     // Catch:{ all -> 0x03c6 }
            boolean r9 = r0.equals(r9)     // Catch:{ all -> 0x03c6 }
            if (r9 == 0) goto L_0x0181
            r6.put(r11, r0)     // Catch:{ all -> 0x03c6 }
            goto L_0x0186
        L_0x0181:
            java.lang.String r0 = "unknow"
            r6.put(r11, r0)     // Catch:{ all -> 0x03c6 }
        L_0x0186:
            r0 = r1[r8]     // Catch:{ all -> 0x03c6 }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x03c6 }
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = "access_subtype"
            r1 = r1[r8]     // Catch:{ all -> 0x03c6 }
            r6.put(r0, r1)     // Catch:{ all -> 0x03c6 }
        L_0x0195:
            java.lang.String r0 = "header_local_ip"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)     // Catch:{ all -> 0x03c6 }
            if (r0 == 0) goto L_0x01a6
            java.lang.String r0 = "local_ip"
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.getIPAddress(r13)     // Catch:{ all -> 0x03c6 }
            r6.put(r0, r1)     // Catch:{ all -> 0x03c6 }
        L_0x01a6:
            java.lang.String r0 = "network_type"
            int r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkType(r13)     // Catch:{ all -> 0x03c6 }
            r6.put(r0, r1)     // Catch:{ all -> 0x03c6 }
            java.lang.String r0 = "com_ver"
            java.lang.String r1 = "9.3.8"
            r6.put(r0, r1)     // Catch:{ all -> 0x03c6 }
            java.lang.String r0 = "com_type"
            int r1 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE     // Catch:{ all -> 0x03c6 }
            r6.put(r0, r1)     // Catch:{ all -> 0x03c6 }
            java.lang.String r0 = "mini_ver"
            java.lang.String r1 = "1"
            r6.put(r0, r1)     // Catch:{ all -> 0x03c6 }
            java.lang.String r0 = f17646a     // Catch:{ all -> 0x03c6 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03c6 }
            if (r0 != 0) goto L_0x01d3
            java.lang.String r0 = "module"
            java.lang.String r1 = f17646a     // Catch:{ all -> 0x03c6 }
            r6.put(r0, r1)     // Catch:{ all -> 0x03c6 }
        L_0x01d3:
            java.lang.String r0 = "api_level"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03c6 }
            r6.put(r0, r1)     // Catch:{ all -> 0x03c6 }
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.VALUE_REC_VERSION_NAME     // Catch:{ all -> 0x03c6 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03c6 }
            if (r0 != 0) goto L_0x01e9
            java.lang.String r0 = "urec_ver"
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_REC_VERSION_NAME     // Catch:{ all -> 0x03c6 }
            r6.put(r0, r1)     // Catch:{ all -> 0x03c6 }
        L_0x01e9:
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getUUIDForZid(r13)     // Catch:{ all -> 0x01ff }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01ff }
            if (r1 == 0) goto L_0x01fa
            com.umeng.commonsdk.utils.UMUtils.setUUIDForZid(r13)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getUUIDForZid(r13)     // Catch:{ all -> 0x01ff }
        L_0x01fa:
            java.lang.String r1 = "session_id"
            r6.put(r1, r0)     // Catch:{ all -> 0x01ff }
        L_0x01ff:
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x03c6 }
            f17654i = r0     // Catch:{ all -> 0x03c6 }
            r0 = r6
        L_0x0206:
            if (r0 != 0) goto L_0x0209
            return r4
        L_0x0209:
            java.lang.String r1 = "oaid_required_time"
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getOaidRequiredTime(r13)     // Catch:{ Exception -> 0x0212 }
            r0.put(r1, r6)     // Catch:{ Exception -> 0x0212 }
        L_0x0212:
            java.lang.String r1 = "successful_requests"
            java.lang.String r6 = "successful_request"
            int r6 = r5.getInt(r6, r7)     // Catch:{ Exception -> 0x024d }
            r0.put(r1, r6)     // Catch:{ Exception -> 0x024d }
            int r1 = r5.getInt(r3, r7)     // Catch:{ Exception -> 0x024d }
            r0.put(r3, r1)     // Catch:{ Exception -> 0x024d }
            java.lang.String r1 = "req_time"
            java.lang.String r3 = "last_request_spent_ms"
            int r3 = r5.getInt(r3, r7)     // Catch:{ Exception -> 0x024d }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x024d }
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getZid(r13)     // Catch:{ Exception -> 0x024d }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x024d }
            if (r3 != 0) goto L_0x023e
            java.lang.String r3 = "zid"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x024d }
        L_0x023e:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.VALUE_ASMS_VERSION     // Catch:{ Exception -> 0x024d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x024d }
            if (r1 != 0) goto L_0x024d
            java.lang.String r1 = "zid_sdk_version"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_ASMS_VERSION     // Catch:{ Exception -> 0x024d }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x024d }
        L_0x024d:
            java.lang.String r1 = "channel"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getChannel(r13)     // Catch:{ all -> 0x03c6 }
            r0.put(r1, r3)     // Catch:{ all -> 0x03c6 }
            java.lang.String r1 = "appkey"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r13)     // Catch:{ all -> 0x03c6 }
            r0.put(r1, r3)     // Catch:{ all -> 0x03c6 }
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getDeviceToken(r13)     // Catch:{ Exception -> 0x026f }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x026f }
            if (r3 != 0) goto L_0x0273
            java.lang.String r3 = "devicetoken"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x026f }
            goto L_0x0273
        L_0x026f:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r13, r1)     // Catch:{ all -> 0x03c6 }
        L_0x0273:
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r13, r2, r4)     // Catch:{ Exception -> 0x0281 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0281 }
            if (r3 != 0) goto L_0x0285
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0281 }
            goto L_0x0285
        L_0x0281:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r13, r1)     // Catch:{ all -> 0x03c6 }
        L_0x0285:
            java.lang.String r1 = "wrapper_type"
            java.lang.String r2 = com.umeng.commonsdk.statistics.BusinessWrapperConfig.f17643a     // Catch:{ Exception -> 0x0293 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0293 }
            java.lang.String r1 = "wrapper_version"
            java.lang.String r2 = com.umeng.commonsdk.statistics.BusinessWrapperConfig.f17644b     // Catch:{ Exception -> 0x0293 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0293 }
        L_0x0293:
            int r1 = com.umeng.commonsdk.utils.UMUtils.getTargetSdkVersion(r13)     // Catch:{ all -> 0x02b1 }
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r2 = com.umeng.commonsdk.utils.UMUtils.checkPermission(r13, r2)     // Catch:{ all -> 0x02b1 }
            java.lang.String r3 = "targetSdkVer"
            r0.put(r3, r1)     // Catch:{ all -> 0x02b1 }
            java.lang.String r1 = "rps_pr"
            if (r2 == 0) goto L_0x02ac
            java.lang.String r2 = "yes"
            r0.put(r1, r2)     // Catch:{ all -> 0x02b1 }
            goto L_0x02b1
        L_0x02ac:
            java.lang.String r2 = "no"
            r0.put(r1, r2)     // Catch:{ all -> 0x02b1 }
        L_0x02b1:
            boolean r1 = m22430b()     // Catch:{ all -> 0x02c5 }
            if (r1 == 0) goto L_0x02c5
            java.lang.String r1 = "umTaskId"
            java.lang.String r2 = f17652g     // Catch:{ all -> 0x02c5 }
            r0.put(r1, r2)     // Catch:{ all -> 0x02c5 }
            java.lang.String r1 = "umCaseId"
            java.lang.String r2 = f17653h     // Catch:{ all -> 0x02c5 }
            r0.put(r1, r2)     // Catch:{ all -> 0x02c5 }
        L_0x02c5:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x038a }
            r1.<init>()     // Catch:{ all -> 0x038a }
            java.lang.String r2 = "i_ver"
            java.lang.String r3 = "1.2.0"
            r1.put(r2, r3)     // Catch:{ all -> 0x038a }
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_ANALYTICS_VERSION     // Catch:{ all -> 0x038a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x038a }
            if (r2 != 0) goto L_0x02e0
            java.lang.String r2 = "a_ver"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_ANALYTICS_VERSION     // Catch:{ all -> 0x038a }
            r1.put(r2, r3)     // Catch:{ all -> 0x038a }
        L_0x02e0:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_GAME_VERSION     // Catch:{ all -> 0x038a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x038a }
            if (r2 != 0) goto L_0x02ef
            java.lang.String r2 = "g_ver"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_GAME_VERSION     // Catch:{ all -> 0x038a }
            r1.put(r2, r3)     // Catch:{ all -> 0x038a }
        L_0x02ef:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_PUSH_VERSION     // Catch:{ all -> 0x038a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x038a }
            if (r2 != 0) goto L_0x02fe
            java.lang.String r2 = "p_ver"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_PUSH_VERSION     // Catch:{ all -> 0x038a }
            r1.put(r2, r3)     // Catch:{ all -> 0x038a }
        L_0x02fe:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_SHARE_VERSION     // Catch:{ all -> 0x038a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x038a }
            if (r2 != 0) goto L_0x030d
            java.lang.String r2 = "s_ver"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_SHARE_VERSION     // Catch:{ all -> 0x038a }
            r1.put(r2, r3)     // Catch:{ all -> 0x038a }
        L_0x030d:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_APM_VERSION     // Catch:{ all -> 0x038a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x038a }
            if (r2 != 0) goto L_0x031c
            java.lang.String r2 = "c_ver"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_APM_VERSION     // Catch:{ all -> 0x038a }
            r1.put(r2, r3)     // Catch:{ all -> 0x038a }
        L_0x031c:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_VERIFY_VERSION     // Catch:{ all -> 0x038a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x038a }
            if (r2 != 0) goto L_0x032b
            java.lang.String r2 = "n_ver"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_VERIFY_VERSION     // Catch:{ all -> 0x038a }
            r1.put(r2, r3)     // Catch:{ all -> 0x038a }
        L_0x032b:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_SMS_VERSION     // Catch:{ all -> 0x038a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x038a }
            if (r2 != 0) goto L_0x033a
            java.lang.String r2 = "m_ver"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_SMS_VERSION     // Catch:{ all -> 0x038a }
            r1.put(r2, r3)     // Catch:{ all -> 0x038a }
        L_0x033a:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_REC_VERSION_NAME     // Catch:{ all -> 0x038a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x038a }
            if (r2 != 0) goto L_0x0349
            java.lang.String r2 = "u_ver"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_REC_VERSION_NAME     // Catch:{ all -> 0x038a }
            r1.put(r2, r3)     // Catch:{ all -> 0x038a }
        L_0x0349:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_VISUAL_VERSION     // Catch:{ all -> 0x038a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x038a }
            if (r2 != 0) goto L_0x0358
            java.lang.String r2 = "v_ver"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_VISUAL_VERSION     // Catch:{ all -> 0x038a }
            r1.put(r2, r3)     // Catch:{ all -> 0x038a }
        L_0x0358:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_ASMS_VERSION     // Catch:{ all -> 0x038a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x038a }
            if (r2 != 0) goto L_0x0367
            java.lang.String r2 = "z_ver"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_ASMS_VERSION     // Catch:{ all -> 0x038a }
            r1.put(r2, r3)     // Catch:{ all -> 0x038a }
        L_0x0367:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_LINK_VERSION     // Catch:{ all -> 0x038a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x038a }
            if (r2 != 0) goto L_0x0376
            java.lang.String r2 = "l_ver"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_LINK_VERSION     // Catch:{ all -> 0x038a }
            r1.put(r2, r3)     // Catch:{ all -> 0x038a }
        L_0x0376:
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.VALUE_ABTEST_VERSION     // Catch:{ all -> 0x038a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x038a }
            if (r2 != 0) goto L_0x0385
            java.lang.String r2 = "t_ver"
            java.lang.String r3 = com.umeng.commonsdk.utils.UMUtils.VALUE_ABTEST_VERSION     // Catch:{ all -> 0x038a }
            r1.put(r2, r3)     // Catch:{ all -> 0x038a }
        L_0x0385:
            java.lang.String r2 = "module_ver"
            r0.put(r2, r1)     // Catch:{ all -> 0x038a }
        L_0x038a:
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getApmFlag()     // Catch:{ all -> 0x0399 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0399 }
            if (r2 != 0) goto L_0x0399
            java.lang.String r2 = "_$apmflag"
            r0.put(r2, r1)     // Catch:{ all -> 0x0399 }
        L_0x0399:
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r1 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r13)     // Catch:{ all -> 0x03c6 }
            byte[] r1 = r1.mo19344a()     // Catch:{ all -> 0x03c6 }
            if (r1 == 0) goto L_0x03b4
            int r2 = r1.length     // Catch:{ all -> 0x03c6 }
            if (r2 <= 0) goto L_0x03b4
            java.lang.String r2 = "imprint"
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r7)     // Catch:{ JSONException -> 0x03b0 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x03b0 }
            goto L_0x03b4
        L_0x03b0:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r13, r1)     // Catch:{ all -> 0x03c6 }
        L_0x03b4:
            int r1 = r0.length()     // Catch:{ all -> 0x03c6 }
            if (r1 <= 0) goto L_0x03ca
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x03c6 }
            r1.<init>()     // Catch:{ all -> 0x03c6 }
            java.lang.String r2 = "header"
            org.json.JSONObject r13 = r1.put(r2, r0)     // Catch:{ all -> 0x03c6 }
            return r13
        L_0x03c6:
            r0 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r13, r0)
        L_0x03ca:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.EnvelopeManager.m22429b(android.content.Context):org.json.JSONObject");
    }

    /* renamed from: a */
    private JSONObject m22425a(int i, JSONObject jSONObject) {
        String str = "exception";
        if (jSONObject != null) {
            try {
                jSONObject.put(str, i);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(str, i);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public JSONObject mo19295a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        String str4;
        Envelope envelope;
        Context context2 = context;
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        String str5 = "serial";
        String str6 = "&=";
        String str7 = "header";
        boolean z = ULog.DEBUG;
        String str8 = f17648c;
        if (!(!z || jSONObject3 == null || jSONObject4 == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("headerJSONObject size is ");
            sb.append(jSONObject.toString().getBytes().length);
            Log.i(str8, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bodyJSONObject size is ");
            sb2.append(jSONObject2.toString().getBytes().length);
            Log.i(str8, sb2.toString());
        }
        JSONObject jSONObject5 = null;
        if (context2 == null || jSONObject4 == null) {
            return m22425a(110, (JSONObject) null);
        }
        try {
            JSONObject b = m22429b(context);
            if (!(b == null || jSONObject3 == null)) {
                b = m22426a(b, jSONObject3);
            }
            JSONObject jSONObject6 = b;
            if (jSONObject6 != null) {
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    Object next = keys.next();
                    if (next != null && (next instanceof String)) {
                        String str9 = (String) next;
                        if (jSONObject4.opt(str9) != null) {
                            try {
                                jSONObject6.put(str9, jSONObject4.opt(str9));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            String str10 = UMCommonContent.f16581aE;
            String str11 = "1.0.0";
            if (!TextUtils.isEmpty(str2)) {
                str10 = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                str11 = str3;
            }
            if (jSONObject6 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str10);
                sb3.append("==");
                sb3.append(str11);
                sb3.append(str6);
                String sb4 = sb3.toString();
                if (TextUtils.isEmpty(sb4)) {
                    return m22425a(101, jSONObject6);
                }
                if (sb4.endsWith(str6)) {
                    sb4 = sb4.substring(0, sb4.length() - 2);
                }
                str4 = sb4;
            } else {
                str4 = null;
            }
            if (jSONObject6 != null) {
                try {
                    IdTracker a = IdTracker.m22566a(context);
                    if (a != null) {
                        a.mo19367b();
                        String encodeToString = Base64.encodeToString(new TSerializer().mo18975a(a.mo19368c()), 0);
                        if (!TextUtils.isEmpty(encodeToString)) {
                            JSONObject jSONObject7 = jSONObject6.getJSONObject(str7);
                            jSONObject7.put(UMCommonContent.f16574Y, encodeToString);
                            jSONObject6.put(str7, jSONObject7);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (jSONObject6 != null) {
                if (DataHelper.largeThanMaxSize((long) jSONObject6.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                    SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putInt(str5, sharedPreferences.getInt(str5, 1) + 1).commit();
                    }
                    return m22425a(113, jSONObject6);
                }
            }
            if (jSONObject6 != null) {
                Envelope a2 = m22424a(context2, jSONObject6.toString().getBytes());
                if (a2 == null) {
                    return m22425a(111, jSONObject6);
                }
                envelope = a2;
            } else {
                envelope = null;
            }
            if (envelope != null && DataHelper.largeThanMaxSize((long) envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return m22425a(114, jSONObject6);
            }
            String str12 = str4;
            int a3 = m22422a(context, envelope, str4, jSONObject6 != null ? jSONObject6.optJSONObject(str7).optString("app_version") : null, str);
            if (a3 != 0) {
                return m22425a(a3, jSONObject6);
            }
            if (ULog.DEBUG) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("constructHeader size is ");
                sb5.append(jSONObject6.toString().getBytes().length);
                Log.i(str8, sb5.toString());
            }
            if (!str12.startsWith(UMCommonContent.f16578aB) && !str12.startsWith(UMCommonContent.f16577aA) && !str12.startsWith(UMCommonContent.f16582aF)) {
                if (!str12.startsWith(UMCommonContent.f16622at)) {
                    if (!UMSLNetWorkSender.m22375a()) {
                        new UMSLNetWorkSender(context2);
                        UMSLNetWorkSender.m22377b();
                    }
                }
            }
            return jSONObject6;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context2, th);
            if (jSONObject3 != null) {
                try {
                    JSONObject jSONObject8 = new JSONObject();
                    try {
                        jSONObject8.put(str7, jSONObject3);
                    } catch (JSONException unused3) {
                    } catch (Exception e) {
                        e = e;
                        jSONObject5 = jSONObject8;
                        UMCrashManager.reportCrash(context2, e);
                        return m22425a(110, jSONObject5);
                    }
                    jSONObject5 = jSONObject8;
                } catch (Exception e2) {
                    e = e2;
                    UMCrashManager.reportCrash(context2, e);
                    return m22425a(110, jSONObject5);
                }
            }
            if (jSONObject5 == null) {
                jSONObject5 = new JSONObject();
            }
            Iterator keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                Object next2 = keys2.next();
                if (next2 != null && (next2 instanceof String)) {
                    String str13 = (String) next2;
                    if (jSONObject4.opt(str13) != null) {
                        try {
                            jSONObject5.put(str13, jSONObject4.opt(str13));
                        } catch (Exception unused4) {
                        }
                    }
                }
            }
            return m22425a(110, jSONObject5);
        }
    }

    /* renamed from: a */
    public JSONObject mo19294a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelope;
        String str2 = "serial";
        String str3 = "header";
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(str3, new JSONObject());
            try {
                if (m22430b()) {
                    jSONObject.put("umTaskId", f17652g);
                    jSONObject.put("umCaseId", f17653h);
                }
            } catch (Throwable unused) {
            }
            if (jSONObject != null) {
                jSONObject3 = m22426a(jSONObject3, jSONObject);
            }
            if (!(jSONObject3 == null || jSONObject2 == null)) {
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    Object next = keys.next();
                    if (next != null && (next instanceof String)) {
                        String str4 = (String) next;
                        if (jSONObject2.opt(str4) != null) {
                            try {
                                jSONObject3.put(str4, jSONObject2.opt(str4));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
            String str5 = "z==1.2.0";
            if (jSONObject3 != null) {
                if (DataHelper.largeThanMaxSize((long) jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                    SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putInt(str2, sharedPreferences.getInt(str2, 1) + 1).commit();
                    }
                    return m22425a(113, jSONObject3);
                }
            }
            String str6 = null;
            if (jSONObject3 != null) {
                Envelope a = m22424a(context, jSONObject3.toString().getBytes());
                if (a == null) {
                    return m22425a(111, jSONObject3);
                }
                envelope = a;
            } else {
                envelope = null;
            }
            if (envelope != null && DataHelper.largeThanMaxSize((long) envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return m22425a(114, jSONObject3);
            }
            if (jSONObject3 != null) {
                str6 = jSONObject3.optJSONObject(str3).optString("app_version");
            }
            int a2 = m22422a(context, envelope, str5, str6, str);
            if (a2 != 0) {
                return m22425a(a2, jSONObject3);
            }
            if (ULog.DEBUG) {
                String str7 = f17648c;
                StringBuilder sb = new StringBuilder();
                sb.append("constructHeader size is ");
                sb.append(jSONObject3.toString().getBytes().length);
                Log.i(str7, sb.toString());
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return m22425a(110, new JSONObject());
        }
    }

    /* renamed from: a */
    private JSONObject m22426a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!(jSONObject == null || jSONObject2 == null)) {
            String str = "header";
            if (jSONObject.opt(str) != null && (jSONObject.opt(str) instanceof JSONObject)) {
                JSONObject jSONObject3 = (JSONObject) jSONObject.opt(str);
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    Object next = keys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = (String) next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                                if (str2.equals(UContent.f16934i) && (jSONObject2.opt(str2) instanceof Integer)) {
                                    this.f17656j = ((Integer) jSONObject2.opt(str2)).intValue();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private Envelope m22424a(Context context, byte[] bArr) {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int i = -1;
        try {
            if (!TextUtils.isEmpty(imprintProperty)) {
                i = Integer.valueOf(imprintProperty).intValue();
            }
        } catch (NumberFormatException e) {
            UMCrashManager.reportCrash(context, e);
        }
        if (i == 0) {
            return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (i == 1) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (f17655k) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    /* renamed from: a */
    private int m22422a(Context context, Envelope envelope, String str, String str2, String str3) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        String b = UMSLUtils.m22410b(str3);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&&");
        sb.append(str2);
        String str4 = "_";
        sb.append(str4);
        sb.append(System.currentTimeMillis());
        sb.append(str4);
        sb.append(b);
        sb.append(".log");
        byte[] binary = envelope.toBinary();
        if (str.startsWith(UMCommonContent.f16578aB) || str.startsWith(UMCommonContent.f16577aA) || str.startsWith(UMCommonContent.f16622at) || str.startsWith(UMCommonContent.f16582aF)) {
            return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
        }
        return UMSLUtils.m22399a(context, UMSLConfig.f17615f, sb.toString(), binary);
    }

    /* renamed from: a */
    public static void m22428a(boolean z) {
        f17655k = z;
    }
}
