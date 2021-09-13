package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.EnvelopeManager;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.stateless.c */
public class UMSLNetWorkSenderHelper {

    /* renamed from: a */
    private String f17635a = "10.0.0.172";

    /* renamed from: b */
    private int f17636b = 80;

    /* renamed from: c */
    private Context f17637c;

    public UMSLNetWorkSenderHelper(Context context) {
        this.f17637c = context;
    }

    /* renamed from: a */
    private void m22395a() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f17637c, "sl_domain_p", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMSLConfig.f17618i = DataHelper.assembleStatelessURL(imprintProperty);
        }
    }

    /* renamed from: b */
    private void m22396b() {
        String str = "";
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f17637c, "sl_domain_p", str);
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f17637c, "oversea_sl_domain_p", str);
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMSLConfig.f17617h = DataHelper.assembleStatelessURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            UMSLConfig.f17620k = DataHelper.assembleStatelessURL(imprintProperty2);
        }
        UMSLConfig.f17618i = UMSLConfig.f17620k;
        if (TextUtils.isEmpty(EnvelopeManager.f17647b)) {
            return;
        }
        if (EnvelopeManager.f17647b.startsWith("460") || EnvelopeManager.f17647b.startsWith("461")) {
            UMSLConfig.f17618i = UMSLConfig.f17617h;
        }
    }

    /* renamed from: c */
    private boolean m22397c() {
        Context context = this.f17637c;
        if (context != null) {
            String str = "android.permission.ACCESS_NETWORK_STATE";
            if (context.getPackageManager().checkPermission(str, this.f17637c.getPackageName()) != 0) {
                return false;
            }
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f17637c.getSystemService("connectivity");
                if (!DeviceConfig.checkPermission(this.f17637c, str) || connectivityManager == null) {
                    return false;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (!(activeNetworkInfo == null || activeNetworkInfo.getType() == 1)) {
                    String extraInfo = activeNetworkInfo.getExtraInfo();
                    if (extraInfo == null || (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap") && !extraInfo.equals("uniwap"))) {
                        return false;
                    }
                    return true;
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(this.f17637c, th);
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.OutputStream, javax.net.ssl.TrustManager[], javax.net.ssl.KeyManager[]] */
    /* JADX WARNING: type inference failed for: r13v2, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r13v7, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARNING: type inference failed for: r13v8, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARNING: type inference failed for: r13v12, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARNING: type inference failed for: r13v16, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARNING: type inference failed for: r13v18 */
    /* JADX WARNING: type inference failed for: r13v19 */
    /* JADX WARNING: type inference failed for: r13v20 */
    /* JADX WARNING: type inference failed for: r13v21 */
    /* JADX WARNING: type inference failed for: r13v22 */
    /* JADX WARNING: type inference failed for: r13v23 */
    /* JADX WARNING: type inference failed for: r13v24 */
    /* JADX WARNING: type inference failed for: r13v25 */
    /* JADX WARNING: type inference failed for: r13v26 */
    /* JADX WARNING: type inference failed for: r13v27 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0125, code lost:
        if (r13 != 0) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0136, code lost:
        if (r13 != 0) goto L_0x010c;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x010c */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v2, types: [java.io.OutputStream, javax.net.ssl.TrustManager[], javax.net.ssl.KeyManager[]]
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.io.OutputStream, ?[OBJECT, ARRAY], javax.net.ssl.KeyManager[], javax.net.ssl.TrustManager[]]
  mth insns count: 131
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0120 A[SYNTHETIC, Splitter:B:33:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0131 A[SYNTHETIC, Splitter:B:43:0x0131] */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19282a(byte[] r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r10 = this;
            java.lang.String r0 = "--->>> stateless: disconnect connection."
            java.lang.String r1 = "MobclickRT"
            r2 = 0
            r3 = 1
            if (r11 == 0) goto L_0x014b
            if (r12 != 0) goto L_0x000c
            goto L_0x014b
        L_0x000c:
            int r4 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE
            if (r4 != 0) goto L_0x0014
            r10.m22395a()
            goto L_0x001b
        L_0x0014:
            java.lang.String r4 = com.umeng.commonsdk.stateless.UMSLConfig.f17620k
            com.umeng.commonsdk.stateless.UMSLConfig.f17617h = r4
            r10.m22396b()
        L_0x001b:
            java.lang.String r4 = com.umeng.commonsdk.stateless.UMSLConfig.f17618i
            boolean r5 = android.text.TextUtils.isEmpty(r13)
            if (r5 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r13 = r4
        L_0x0025:
            r4 = 0
            boolean r5 = r10.m22397c()     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            if (r5 == 0) goto L_0x005c
            java.net.Proxy r5 = new java.net.Proxy     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            java.net.Proxy$Type r6 = java.net.Proxy.Type.HTTP     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            java.net.InetSocketAddress r7 = new java.net.InetSocketAddress     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            java.lang.String r8 = r10.f17635a     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            int r9 = r10.f17636b     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            r7.<init>(r8, r9)     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            r5.<init>(r6, r7)     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            java.net.URL r6 = new java.net.URL     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            r7.<init>()     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            r7.append(r13)     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            java.lang.String r13 = java.io.File.separator     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            r7.append(r13)     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            r7.append(r12)     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            java.lang.String r13 = r7.toString()     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            r6.<init>(r13)     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            java.net.URLConnection r13 = r6.openConnection(r5)     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            javax.net.ssl.HttpsURLConnection r13 = (javax.net.ssl.HttpsURLConnection) r13     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            goto L_0x007b
        L_0x005c:
            java.net.URL r5 = new java.net.URL     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            r6.<init>()     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            r6.append(r13)     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            java.lang.String r13 = java.io.File.separator     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            r6.append(r13)     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            r6.append(r12)     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            java.lang.String r13 = r6.toString()     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            r5.<init>(r13)     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            java.net.URLConnection r13 = r5.openConnection()     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
            javax.net.ssl.HttpsURLConnection r13 = (javax.net.ssl.HttpsURLConnection) r13     // Catch:{ SSLHandshakeException -> 0x0128, all -> 0x0117 }
        L_0x007b:
            org.apache.http.conn.ssl.X509HostnameVerifier r5 = org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r13.setHostnameVerifier(r5)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.lang.String r5 = "TLS"
            javax.net.ssl.SSLContext r5 = javax.net.ssl.SSLContext.getInstance(r5)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.security.SecureRandom r6 = new java.security.SecureRandom     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r6.<init>()     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r5.init(r4, r4, r6)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            javax.net.ssl.SSLSocketFactory r5 = r5.getSocketFactory()     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r13.setSSLSocketFactory(r5)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.lang.String r5 = "X-Umeng-UTC"
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r13.setRequestProperty(r5, r6)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.lang.String r5 = "Msg-Type"
            java.lang.String r6 = "envelope/json"
            r13.setRequestProperty(r5, r6)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.lang.String r5 = "Content-Type"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r6.<init>()     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.lang.String r7 = "ut/"
            r6.append(r7)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r6.append(r14)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.lang.String r14 = r6.toString()     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r13.setRequestProperty(r5, r14)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r14 = 30000(0x7530, float:4.2039E-41)
            r13.setConnectTimeout(r14)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r13.setReadTimeout(r14)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.lang.String r14 = "POST"
            r13.setRequestMethod(r14)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r13.setDoOutput(r3)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r13.setDoInput(r3)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r13.setUseCaches(r2)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.io.OutputStream r4 = r13.getOutputStream()     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r4.write(r11)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r4.flush()     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r13.connect()     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            int r11 = r13.getResponseCode()     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r14 = 200(0xc8, float:2.8E-43)
            if (r11 != r14) goto L_0x0109
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r11.<init>()     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.lang.String r14 = "--->>> send stateless message success : "
            r11.append(r14)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.lang.String r14 = com.umeng.commonsdk.stateless.UMSLConfig.f17618i     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r11.append(r14)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.lang.String r14 = "/"
            r11.append(r14)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r11.append(r12)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            java.lang.String r11 = r11.toString()     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            com.umeng.commonsdk.debug.UMRTLog.m22229i(r1, r11)     // Catch:{ SSLHandshakeException -> 0x0115, all -> 0x0113 }
            r2 = 1
        L_0x0109:
            r4.close()     // Catch:{ Exception -> 0x010c }
        L_0x010c:
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r1, r0)     // Catch:{ all -> 0x0139 }
            r13.disconnect()     // Catch:{ all -> 0x0139 }
            goto L_0x0139
        L_0x0113:
            r11 = move-exception
            goto L_0x0119
        L_0x0115:
            r11 = move-exception
            goto L_0x012a
        L_0x0117:
            r11 = move-exception
            r13 = r4
        L_0x0119:
            java.lang.String r12 = "Exception,Failed to send message."
            com.umeng.commonsdk.statistics.common.MLog.m22445e(r12, r11)     // Catch:{ all -> 0x013a }
            if (r4 == 0) goto L_0x0125
            r4.close()     // Catch:{ Exception -> 0x0124 }
            goto L_0x0125
        L_0x0124:
        L_0x0125:
            if (r13 == 0) goto L_0x0139
            goto L_0x010c
        L_0x0128:
            r11 = move-exception
            r13 = r4
        L_0x012a:
            java.lang.String r12 = "SSLHandshakeException, Failed to send message."
            com.umeng.commonsdk.statistics.common.MLog.m22445e(r12, r11)     // Catch:{ all -> 0x013a }
            if (r4 == 0) goto L_0x0136
            r4.close()     // Catch:{ Exception -> 0x0135 }
            goto L_0x0136
        L_0x0135:
        L_0x0136:
            if (r13 == 0) goto L_0x0139
            goto L_0x010c
        L_0x0139:
            return r2
        L_0x013a:
            r11 = move-exception
            if (r4 == 0) goto L_0x0142
            r4.close()     // Catch:{ Exception -> 0x0141 }
            goto L_0x0142
        L_0x0141:
        L_0x0142:
            if (r13 == 0) goto L_0x014a
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r1, r0)     // Catch:{ all -> 0x014a }
            r13.disconnect()     // Catch:{ all -> 0x014a }
        L_0x014a:
            throw r11
        L_0x014b:
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r12 = "[stateless] sendMessage, envelopeByte == null || path == null "
            r11[r2] = r12
            java.lang.String r12 = "walle"
            com.umeng.commonsdk.statistics.common.ULog.m22482i(r12, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.UMSLNetWorkSenderHelper.mo19282a(byte[], java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
