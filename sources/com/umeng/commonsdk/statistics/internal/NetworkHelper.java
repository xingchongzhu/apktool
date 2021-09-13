package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.AutoViewPageTracker;
import com.umeng.analytics.pro.CoreProtocolImpl.C3149a;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.UMInternalConfig;
import com.umeng.commonsdk.internal.UMInternalData;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.EnvelopeManager;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.utils.UMConstant;
import java.io.File;

/* renamed from: com.umeng.commonsdk.statistics.internal.c */
public class NetworkHelper {

    /* renamed from: e */
    private static boolean f17757e = false;

    /* renamed from: f */
    private static boolean f17758f = false;

    /* renamed from: g */
    private static boolean f17759g = false;

    /* renamed from: a */
    private String f17760a = "10.0.0.172";

    /* renamed from: b */
    private int f17761b = 80;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f17762c;

    /* renamed from: d */
    private IRequestStat f17763d;

    public NetworkHelper(Context context) {
        this.f17762c = context;
    }

    /* renamed from: b */
    private void m22611b() {
        String str = "";
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f17762c, "domain_p", str);
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f17762c, "domain_s", str);
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(imprintProperty2);
        }
        String imprintProperty3 = UMEnvelopeBuild.imprintProperty(this.f17762c, "oversea_domain_p", str);
        String imprintProperty4 = UMEnvelopeBuild.imprintProperty(this.f17762c, "oversea_domain_s", str);
        if (!TextUtils.isEmpty(imprintProperty3)) {
            UMServerURL.OVERSEA_DEFAULT_URL = DataHelper.assembleURL(imprintProperty3);
        }
        if (!TextUtils.isEmpty(imprintProperty4)) {
            UMServerURL.OVERSEA_SECONDARY_URL = DataHelper.assembleURL(imprintProperty4);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.OVERSEA_DEFAULT_URL, UMServerURL.OVERSEA_SECONDARY_URL};
        if (TextUtils.isEmpty(EnvelopeManager.f17647b)) {
            return;
        }
        if (EnvelopeManager.f17647b.startsWith("460") || EnvelopeManager.f17647b.startsWith("461")) {
            AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
        }
    }

    /* renamed from: c */
    private void m22612c() {
        if (!f17759g) {
            ImprintHandler.getImprintService(this.f17762c).registImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, new UMImprintChangeCallback() {
                public void onImprintValueChanged(String str, String str2) {
                    if (FieldManager.m22200b()) {
                        FieldManager.m22199a().mo19241a(NetworkHelper.this.f17762c, str2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("--->>> apply imprint change and exit: key=");
                        sb.append(str);
                        sb.append("; value= ");
                        sb.append(str2);
                        UMRTLog.m22228e(UMRTLog.RTLOG_TAG, sb.toString());
                        UMWorkDispatch.sendEvent(NetworkHelper.this.f17762c, UMInternalConfig.f17515w, UMInternalData.m22265a(NetworkHelper.this.f17762c).mo19254a(), null);
                    }
                }
            });
            f17759g = true;
        }
    }

    /* renamed from: d */
    private void m22613d() {
        if (!f17758f) {
            UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "--->>> 注册零号报文 imprint 应答处理回调。");
            ImprintHandler.getImprintService(this.f17762c).registPreProcessCallback(AnalyticsConstants.ZERO_RESPONSE_FLAG, new UMImprintPreProcessCallback() {
                public boolean onPreProcessImprintKey(String str, String str2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("--->>> onImprintValueChanged: key=");
                    sb.append(str);
                    sb.append("; value= ");
                    sb.append(str2);
                    UMRTLog.m22228e(UMRTLog.RTLOG_TAG, sb.toString());
                    FieldManager.m22199a().mo19240a(NetworkHelper.this.f17762c);
                    UMWorkDispatch.sendEvent(NetworkHelper.this.f17762c, UMInternalConfig.f17511s, UMInternalData.m22265a(NetworkHelper.this.f17762c).mo19254a(), null);
                    ImprintHandler.getImprintService(NetworkHelper.this.f17762c).mo19343a(AnalyticsConstants.ZERO_RESPONSE_FLAG);
                    return true;
                }
            });
            ImprintHandler.getImprintService(this.f17762c).registImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, new UMImprintChangeCallback() {
                public void onImprintValueChanged(String str, String str2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("--->>> first onImprintValueChanged: key=");
                    sb.append(str);
                    sb.append("; value= ");
                    sb.append(str2);
                    String sb2 = sb.toString();
                    String str3 = UMRTLog.RTLOG_TAG;
                    UMRTLog.m22228e(str3, sb2);
                    FieldManager.m22199a().mo19241a(NetworkHelper.this.f17762c, str2);
                    UMWorkDispatch.sendEvent(NetworkHelper.this.f17762c, UMInternalConfig.f17511s, UMInternalData.m22265a(NetworkHelper.this.f17762c).mo19254a(), null);
                    if (FieldManager.allow(UMConstant.f17887E)) {
                        UMRTLog.m22229i(str3, "--->>> recv zcfg response: foregound count timer enabled.");
                        if (!UMWorkDispatch.eventHasExist()) {
                            UMWorkDispatch.sendEventEx(NetworkHelper.this.f17762c, C3149a.f17184C, CoreProtocol.getInstance(NetworkHelper.this.f17762c), null, 0);
                        }
                    }
                    if (FieldManager.allow(UMConstant.f17888F)) {
                        UMRTLog.m22229i(str3, "--->>> recv zcfg response: FirstResumeTrigger enabled.");
                        AutoViewPageTracker.m21976a(NetworkHelper.this.f17762c).mo19114b(NetworkHelper.this.f17762c);
                    }
                    ImprintHandler.getImprintService(NetworkHelper.this.f17762c).unregistImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, this);
                }
            });
            f17758f = true;
        }
    }

    /* renamed from: e */
    private boolean m22614e() {
        String str = "android.permission.ACCESS_NETWORK_STATE";
        if (this.f17762c.getPackageManager().checkPermission(str, this.f17762c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f17762c.getSystemService("connectivity");
            if (!DeviceConfig.checkPermission(this.f17762c, str) || connectivityManager == null) {
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
            return false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f17762c, th);
        }
    }

    /* renamed from: a */
    public void mo19400a(IRequestStat bVar) {
        this.f17763d = bVar;
    }

    /* renamed from: a */
    private void m22610a() {
        String str = "";
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f17762c, "domain_p", str);
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f17762c, "domain_s", str);
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(imprintProperty2);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
    }

    /* renamed from: a */
    public byte[] mo19402a(byte[] bArr, boolean z, boolean z2, String str) {
        if (SdkVersion.SDK_TYPE == 0) {
            m22610a();
        } else {
            UMServerURL.DEFAULT_URL = UMServerURL.OVERSEA_DEFAULT_URL;
            UMServerURL.SECONDARY_URL = UMServerURL.OVERSEA_SECONDARY_URL;
            m22611b();
        }
        int i = 0;
        byte[] bArr2 = null;
        while (true) {
            String[] strArr = AnalyticsConstants.APPLOG_URL_LIST;
            if (i >= strArr.length) {
                break;
            }
            String str2 = strArr[i];
            if (z2) {
                m22613d();
            } else {
                m22612c();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(File.separator);
            sb.append(str);
            bArr2 = mo19401a(bArr, sb.toString());
            if (bArr2 != null) {
                IRequestStat bVar = this.f17763d;
                if (bVar != null) {
                    bVar.onRequestSucceed(z);
                }
            } else {
                IRequestStat bVar2 = this.f17763d;
                if (bVar2 != null) {
                    bVar2.onRequestFailed();
                }
                i++;
            }
        }
        return bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x016f A[SYNTHETIC, Splitter:B:103:0x016f] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0123 A[SYNTHETIC, Splitter:B:64:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012f A[SYNTHETIC, Splitter:B:69:0x012f] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0143 A[SYNTHETIC, Splitter:B:81:0x0143] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x014f A[SYNTHETIC, Splitter:B:86:0x014f] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0163 A[SYNTHETIC, Splitter:B:98:0x0163] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo19401a(byte[] r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "\\|"
            r2 = 2
            r3 = 0
            com.umeng.commonsdk.statistics.internal.b r4 = r9.f17763d     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            if (r4 == 0) goto L_0x000d
            r4.onRequestStart()     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
        L_0x000d:
            boolean r4 = r9.m22614e()     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            if (r4 == 0) goto L_0x002f
            java.net.Proxy r4 = new java.net.Proxy     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            java.net.Proxy$Type r5 = java.net.Proxy.Type.HTTP     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            java.net.InetSocketAddress r6 = new java.net.InetSocketAddress     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            java.lang.String r7 = r9.f17760a     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            int r8 = r9.f17761b     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            r6.<init>(r7, r8)     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            r4.<init>(r5, r6)     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            java.net.URL r5 = new java.net.URL     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            r5.<init>(r11)     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            java.net.URLConnection r11 = r5.openConnection(r4)     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            javax.net.ssl.HttpsURLConnection r11 = (javax.net.ssl.HttpsURLConnection) r11     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            goto L_0x003a
        L_0x002f:
            java.net.URL r4 = new java.net.URL     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            r4.<init>(r11)     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            java.net.URLConnection r11 = r4.openConnection()     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
            javax.net.ssl.HttpsURLConnection r11 = (javax.net.ssl.HttpsURLConnection) r11     // Catch:{ SSLHandshakeException -> 0x015a, UnknownHostException -> 0x013a, all -> 0x011f }
        L_0x003a:
            boolean r4 = f17757e     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r5 = 1
            if (r4 != 0) goto L_0x005b
            org.apache.http.conn.ssl.X509HostnameVerifier r4 = org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r11.setHostnameVerifier(r4)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            java.lang.String r4 = "TLS"
            javax.net.ssl.SSLContext r4 = javax.net.ssl.SSLContext.getInstance(r4)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            java.security.SecureRandom r6 = new java.security.SecureRandom     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r6.<init>()     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r4.init(r3, r3, r6)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            javax.net.ssl.SSLSocketFactory r4 = r4.getSocketFactory()     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r11.setSSLSocketFactory(r4)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            f17757e = r5     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
        L_0x005b:
            java.lang.String r4 = "X-Umeng-UTC"
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r11.setRequestProperty(r4, r6)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            java.lang.String r4 = "X-Umeng-Sdk"
            android.content.Context r6 = r9.f17762c     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            com.umeng.commonsdk.statistics.internal.a r6 = com.umeng.commonsdk.statistics.internal.HeaderHelper.m22599a(r6)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            java.lang.String r6 = r6.mo19396b()     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r11.setRequestProperty(r4, r6)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            android.content.Context r4 = r9.f17762c     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            com.umeng.commonsdk.statistics.internal.a r4 = com.umeng.commonsdk.statistics.internal.HeaderHelper.m22599a(r4)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            java.lang.String r4 = r4.mo19394a()     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r11.setRequestProperty(r0, r4)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            java.lang.String r4 = "Msg-Type"
            java.lang.String r6 = "envelope/json"
            r11.setRequestProperty(r4, r6)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            java.lang.String r4 = "X-Umeng-Pro-Ver"
            java.lang.String r6 = "1.0.0"
            r11.setRequestProperty(r4, r6)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r4 = 30000(0x7530, float:4.2039E-41)
            r11.setConnectTimeout(r4)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r11.setReadTimeout(r4)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            java.lang.String r4 = "POST"
            r11.setRequestMethod(r4)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r11.setDoOutput(r5)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r11.setDoInput(r5)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r4 = 0
            r11.setUseCaches(r4)     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            java.io.OutputStream r6 = r11.getOutputStream()     // Catch:{ SSLHandshakeException -> 0x011d, UnknownHostException -> 0x011b, all -> 0x0119 }
            r6.write(r10)     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
            r6.flush()     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
            r11.connect()     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
            com.umeng.commonsdk.statistics.internal.b r10 = r9.f17763d     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
            if (r10 == 0) goto L_0x00bd
            r10.onRequestEnd()     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
        L_0x00bd:
            int r10 = r11.getResponseCode()     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
            java.lang.String r0 = r11.getHeaderField(r0)     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
            if (r7 != 0) goto L_0x00d4
            java.lang.String r7 = "application/thrift"
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
            if (r0 == 0) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r5 = 0
        L_0x00d5:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r10 != r0) goto L_0x0102
            if (r5 == 0) goto L_0x0102
            java.io.InputStream r10 = r11.getInputStream()     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
            byte[] r0 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r10)     // Catch:{ all -> 0x00fd }
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r10)     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
            r6.close()     // Catch:{ Exception -> 0x00ec }
            goto L_0x00f2
        L_0x00ec:
            r10 = move-exception
            android.content.Context r1 = r9.f17762c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r10)
        L_0x00f2:
            java.io.InputStream r10 = r11.getInputStream()     // Catch:{ IOException -> 0x00f9 }
            r10.close()     // Catch:{ IOException -> 0x00f9 }
        L_0x00f9:
            r11.disconnect()
            return r0
        L_0x00fd:
            r0 = move-exception
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r10)     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
            throw r0     // Catch:{ SSLHandshakeException -> 0x015c, UnknownHostException -> 0x013c, all -> 0x0117 }
        L_0x0102:
            r6.close()     // Catch:{ Exception -> 0x0106 }
            goto L_0x010c
        L_0x0106:
            r10 = move-exception
            android.content.Context r0 = r9.f17762c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r10)
        L_0x010c:
            java.io.InputStream r10 = r11.getInputStream()     // Catch:{ IOException -> 0x0113 }
            r10.close()     // Catch:{ IOException -> 0x0113 }
        L_0x0113:
            r11.disconnect()
            return r3
        L_0x0117:
            goto L_0x0121
        L_0x0119:
            r6 = r3
            goto L_0x0121
        L_0x011b:
            r6 = r3
            goto L_0x013c
        L_0x011d:
            r6 = r3
            goto L_0x015c
        L_0x011f:
            r11 = r3
            r6 = r11
        L_0x0121:
            if (r6 == 0) goto L_0x012d
            r6.close()     // Catch:{ Exception -> 0x0127 }
            goto L_0x012d
        L_0x0127:
            r10 = move-exception
            android.content.Context r0 = r9.f17762c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r10)
        L_0x012d:
            if (r11 == 0) goto L_0x0139
            java.io.InputStream r10 = r11.getInputStream()     // Catch:{ IOException -> 0x0136 }
            r10.close()     // Catch:{ IOException -> 0x0136 }
        L_0x0136:
            r11.disconnect()
        L_0x0139:
            return r3
        L_0x013a:
            r11 = r3
            r6 = r11
        L_0x013c:
            java.lang.String r10 = "A_10200"
            com.umeng.commonsdk.debug.UMLog.m22222aq(r10, r2, r1)     // Catch:{ all -> 0x017a }
            if (r6 == 0) goto L_0x014d
            r6.close()     // Catch:{ Exception -> 0x0147 }
            goto L_0x014d
        L_0x0147:
            r10 = move-exception
            android.content.Context r0 = r9.f17762c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r10)
        L_0x014d:
            if (r11 == 0) goto L_0x0159
            java.io.InputStream r10 = r11.getInputStream()     // Catch:{ IOException -> 0x0156 }
            r10.close()     // Catch:{ IOException -> 0x0156 }
        L_0x0156:
            r11.disconnect()
        L_0x0159:
            return r3
        L_0x015a:
            r11 = r3
            r6 = r11
        L_0x015c:
            java.lang.String r10 = "A_10201"
            com.umeng.commonsdk.debug.UMLog.m22222aq(r10, r2, r1)     // Catch:{ all -> 0x017a }
            if (r6 == 0) goto L_0x016d
            r6.close()     // Catch:{ Exception -> 0x0167 }
            goto L_0x016d
        L_0x0167:
            r10 = move-exception
            android.content.Context r0 = r9.f17762c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r10)
        L_0x016d:
            if (r11 == 0) goto L_0x0179
            java.io.InputStream r10 = r11.getInputStream()     // Catch:{ IOException -> 0x0176 }
            r10.close()     // Catch:{ IOException -> 0x0176 }
        L_0x0176:
            r11.disconnect()
        L_0x0179:
            return r3
        L_0x017a:
            r10 = move-exception
            if (r6 == 0) goto L_0x0187
            r6.close()     // Catch:{ Exception -> 0x0181 }
            goto L_0x0187
        L_0x0181:
            r0 = move-exception
            android.content.Context r1 = r9.f17762c
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)
        L_0x0187:
            if (r11 == 0) goto L_0x0193
            java.io.InputStream r0 = r11.getInputStream()     // Catch:{ IOException -> 0x0190 }
            r0.close()     // Catch:{ IOException -> 0x0190 }
        L_0x0190:
            r11.disconnect()
        L_0x0193:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.internal.NetworkHelper.mo19401a(byte[], java.lang.String):byte[]");
    }
}
