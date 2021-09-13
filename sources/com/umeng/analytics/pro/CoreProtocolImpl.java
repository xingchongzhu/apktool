package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.InternalConfig;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.common.ReportPolicy.DebugPolicy;
import com.umeng.commonsdk.statistics.common.ReportPolicy.DefconPolicy;
import com.umeng.commonsdk.statistics.common.ReportPolicy.ReportAtLaunch;
import com.umeng.commonsdk.statistics.common.ReportPolicy.ReportByInterval;
import com.umeng.commonsdk.statistics.common.ReportPolicy.ReportDaily;
import com.umeng.commonsdk.statistics.common.ReportPolicy.ReportQuasiRealtime;
import com.umeng.commonsdk.statistics.common.ReportPolicy.ReportRealtime;
import com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy;
import com.umeng.commonsdk.statistics.common.ReportPolicy.ReportWifiOnly;
import com.umeng.commonsdk.statistics.common.ReportPolicy.SmartPolicy;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.utils.JSONArraySortUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.n */
public class CoreProtocolImpl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Context f17156a = null;

    /* renamed from: l */
    private static final String f17157l = "first_activate_time";

    /* renamed from: m */
    private static final String f17158m = "ana_is_f";

    /* renamed from: n */
    private static final String f17159n = "thtstart";

    /* renamed from: o */
    private static final String f17160o = "dstk_last_time";

    /* renamed from: p */
    private static final String f17161p = "dstk_cnt";

    /* renamed from: q */
    private static final String f17162q = "gkvc";

    /* renamed from: r */
    private static final String f17163r = "ekvc";

    /* renamed from: t */
    private static final String f17164t = "-1";

    /* renamed from: x */
    private static final String f17165x = "com.umeng.umcrash.UMCrashUtils";

    /* renamed from: y */
    private static Class<?> f17166y;

    /* renamed from: z */
    private static Method f17167z;

    /* renamed from: b */
    private C3151c f17168b;

    /* renamed from: c */
    private SharedPreferences f17169c;

    /* renamed from: d */
    private String f17170d;

    /* renamed from: e */
    private String f17171e;

    /* renamed from: f */
    private int f17172f;

    /* renamed from: g */
    private JSONArray f17173g;

    /* renamed from: h */
    private final int f17174h;

    /* renamed from: i */
    private int f17175i;

    /* renamed from: j */
    private int f17176j;

    /* renamed from: k */
    private long f17177k;

    /* renamed from: s */
    private final long f17178s;

    /* renamed from: u */
    private boolean f17179u;

    /* renamed from: v */
    private boolean f17180v;

    /* renamed from: w */
    private Object f17181w;

    /* renamed from: com.umeng.analytics.pro.n$a */
    /* compiled from: CoreProtocolImpl */
    public static class C3149a {

        /* renamed from: A */
        public static final int f17182A = 8211;

        /* renamed from: B */
        public static final int f17183B = 8212;

        /* renamed from: C */
        public static final int f17184C = 8213;

        /* renamed from: a */
        public static final int f17185a = 4097;

        /* renamed from: b */
        public static final int f17186b = 4098;

        /* renamed from: c */
        public static final int f17187c = 4099;

        /* renamed from: d */
        public static final int f17188d = 4100;

        /* renamed from: e */
        public static final int f17189e = 4101;

        /* renamed from: f */
        public static final int f17190f = 4102;

        /* renamed from: g */
        public static final int f17191g = 4103;

        /* renamed from: h */
        public static final int f17192h = 4104;

        /* renamed from: i */
        public static final int f17193i = 4105;

        /* renamed from: j */
        public static final int f17194j = 4106;

        /* renamed from: k */
        public static final int f17195k = 4352;

        /* renamed from: l */
        public static final int f17196l = 4353;

        /* renamed from: m */
        public static final int f17197m = 4354;

        /* renamed from: n */
        public static final int f17198n = 4355;

        /* renamed from: o */
        public static final int f17199o = 4356;

        /* renamed from: p */
        public static final int f17200p = 8193;

        /* renamed from: q */
        public static final int f17201q = 8194;

        /* renamed from: r */
        public static final int f17202r = 8195;

        /* renamed from: s */
        public static final int f17203s = 8196;

        /* renamed from: t */
        public static final int f17204t = 8197;

        /* renamed from: u */
        public static final int f17205u = 8199;

        /* renamed from: v */
        public static final int f17206v = 8200;

        /* renamed from: w */
        public static final int f17207w = 8201;

        /* renamed from: x */
        public static final int f17208x = 8208;

        /* renamed from: y */
        public static final int f17209y = 8209;

        /* renamed from: z */
        public static final int f17210z = 8210;
    }

    /* renamed from: com.umeng.analytics.pro.n$b */
    /* compiled from: CoreProtocolImpl */
    private static class C3150b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final CoreProtocolImpl f17211a = new CoreProtocolImpl();

        private C3150b() {
        }
    }

    /* renamed from: com.umeng.analytics.pro.n$c */
    /* compiled from: CoreProtocolImpl */
    public static class C3151c {

        /* renamed from: a */
        private ReportStrategy f17212a;

        /* renamed from: b */
        private int f17213b;

        /* renamed from: c */
        private int f17214c;

        /* renamed from: d */
        private int f17215d;

        /* renamed from: e */
        private int f17216e;

        /* renamed from: f */
        private ABTest f17217f;

        public C3151c() {
            this.f17212a = null;
            this.f17213b = -1;
            this.f17214c = -1;
            this.f17215d = -1;
            this.f17216e = -1;
            this.f17217f = null;
            this.f17217f = ABTest.getService(CoreProtocolImpl.f17156a);
        }

        /* renamed from: a */
        public void mo19151a() {
            try {
                int[] a = mo19152a(-1, -1);
                this.f17213b = a[0];
                this.f17214c = a[1];
            } catch (Throwable unused) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo19153b() {
            int i;
            Defcon service = Defcon.getService(CoreProtocolImpl.f17156a);
            if (service.isOpen()) {
                ReportStrategy reportStrategy = this.f17212a;
                this.f17212a = (reportStrategy instanceof DefconPolicy) && reportStrategy.isValid() ? this.f17212a : new DefconPolicy(StatTracer.getInstance(CoreProtocolImpl.f17156a), service);
            } else {
                String str = CoreProtocolImpl.f17164t;
                boolean z = Integer.valueOf(UMEnvelopeBuild.imprintProperty(CoreProtocolImpl.f17156a, "integrated_test", str)).intValue() == 1;
                if (UMConfigure.isDebugLog() && z && !MLog.DEBUG) {
                    UMLog.mutlInfo(UMLogAnalytics.f17069K, 3, "\\|", null, null);
                }
                if (!MLog.DEBUG || !z) {
                    if (this.f17217f.isInTest()) {
                        if ("RPT".equals(this.f17217f.getTestName())) {
                            if (this.f17217f.getTestPolicy() == 6) {
                                if (Integer.valueOf(UMEnvelopeBuild.imprintProperty(CoreProtocolImpl.f17156a, "test_report_interval", str)).intValue() != -1) {
                                    i = mo19150a(90000);
                                } else {
                                    i = this.f17214c;
                                    if (i <= 0) {
                                        i = this.f17216e;
                                    }
                                }
                            } else {
                                i = 0;
                            }
                            this.f17212a = m22057b(this.f17217f.getTestPolicy(), i);
                        }
                    }
                    int i2 = this.f17215d;
                    int i3 = this.f17216e;
                    int i4 = this.f17213b;
                    if (i4 != -1) {
                        i3 = this.f17214c;
                        i2 = i4;
                    }
                    this.f17212a = m22057b(i2, i3);
                } else {
                    this.f17212a = new DebugPolicy(StatTracer.getInstance(CoreProtocolImpl.f17156a));
                }
            }
            if (UMConfigure.isDebugLog()) {
                try {
                    ReportStrategy reportStrategy2 = this.f17212a;
                    String str2 = "";
                    if (reportStrategy2 instanceof ReportAtLaunch) {
                        UMLog.mutlInfo(UMLogAnalytics.f17067I, 3, str2, null, null);
                        return;
                    }
                    String str3 = "@";
                    if (reportStrategy2 instanceof ReportByInterval) {
                        UMLog.mutlInfo(UMLogAnalytics.f17068J, 3, str2, new String[]{str3}, new String[]{String.valueOf(((ReportByInterval) reportStrategy2).getReportInterval() / 1000)});
                    } else if (reportStrategy2 instanceof DebugPolicy) {
                        UMLog.mutlInfo(UMLogAnalytics.f17070L, 3, str2, null, null);
                    } else if (reportStrategy2 instanceof ReportQuasiRealtime) {
                        String[] strArr = {str3};
                        String[] strArr2 = {String.valueOf(((ReportQuasiRealtime) reportStrategy2).getReportInterval() / 1000)};
                        UMLog uMLog = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(UMLogAnalytics.f17071M, 3, str2, strArr, strArr2);
                    } else {
                        boolean z2 = reportStrategy2 instanceof DefconPolicy;
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: c */
        public ReportStrategy mo19154c() {
            mo19153b();
            return this.f17212a;
        }

        /* renamed from: a */
        public int[] mo19152a(int i, int i2) {
            String str = CoreProtocolImpl.f17164t;
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(CoreProtocolImpl.f17156a, "report_policy", str)).intValue();
            int intValue2 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(CoreProtocolImpl.f17156a, "report_interval", str)).intValue();
            if (intValue == -1 || !ReportPolicy.isValid(intValue)) {
                return new int[]{i, i2};
            } else if (6 == intValue) {
                if (intValue2 == -1 || intValue2 < 90 || intValue2 > 86400) {
                    intValue2 = 90;
                }
                return new int[]{intValue, intValue2 * 1000};
            } else if (11 == intValue) {
                if (intValue2 == -1 || intValue2 < 15 || intValue2 > 3600) {
                    intValue2 = 15;
                }
                return new int[]{intValue, intValue2 * 1000};
            } else {
                return new int[]{i, i2};
            }
        }

        /* renamed from: a */
        public int mo19150a(int i) {
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(CoreProtocolImpl.f17156a, "test_report_interval", CoreProtocolImpl.f17164t)).intValue();
            return (intValue == -1 || intValue < 90 || intValue > 86400) ? i : intValue * 1000;
        }

        /* renamed from: b */
        private ReportStrategy m22057b(int i, int i2) {
            if (i == 0) {
                ReportStrategy reportStrategy = this.f17212a;
                return reportStrategy instanceof ReportRealtime ? reportStrategy : new ReportRealtime();
            } else if (i == 1) {
                ReportStrategy reportStrategy2 = this.f17212a;
                if (reportStrategy2 instanceof ReportAtLaunch) {
                    return reportStrategy2;
                }
                return new ReportAtLaunch();
            } else if (i == 4) {
                ReportStrategy reportStrategy3 = this.f17212a;
                if (reportStrategy3 instanceof ReportDaily) {
                    return reportStrategy3;
                }
                return new ReportDaily(StatTracer.getInstance(CoreProtocolImpl.f17156a));
            } else if (i == 5) {
                ReportStrategy reportStrategy4 = this.f17212a;
                if (reportStrategy4 instanceof ReportWifiOnly) {
                    return reportStrategy4;
                }
                return new ReportWifiOnly(CoreProtocolImpl.f17156a);
            } else if (i == 6) {
                ReportStrategy reportStrategy5 = this.f17212a;
                if (!(reportStrategy5 instanceof ReportByInterval)) {
                    return new ReportByInterval(StatTracer.getInstance(CoreProtocolImpl.f17156a), (long) i2);
                }
                ((ReportByInterval) reportStrategy5).setReportInterval((long) i2);
                return reportStrategy5;
            } else if (i == 8) {
                ReportStrategy reportStrategy6 = this.f17212a;
                if (reportStrategy6 instanceof SmartPolicy) {
                    return reportStrategy6;
                }
                return new SmartPolicy(StatTracer.getInstance(CoreProtocolImpl.f17156a));
            } else if (i != 11) {
                ReportStrategy reportStrategy7 = this.f17212a;
                if (reportStrategy7 instanceof ReportAtLaunch) {
                    return reportStrategy7;
                }
                return new ReportAtLaunch();
            } else {
                ReportStrategy reportStrategy8 = this.f17212a;
                if (reportStrategy8 instanceof ReportQuasiRealtime) {
                    ((ReportQuasiRealtime) reportStrategy8).setReportInterval((long) i2);
                    return reportStrategy8;
                }
                ReportQuasiRealtime reportQuasiRealtime = new ReportQuasiRealtime();
                reportQuasiRealtime.setReportInterval((long) i2);
                return reportQuasiRealtime;
            }
        }
    }

    /* renamed from: com.umeng.analytics.pro.n$d */
    /* compiled from: CoreProtocolImpl */
    public static class C3152d {

        /* renamed from: a */
        private Map<String, Object> f17218a = null;

        /* renamed from: b */
        private String f17219b = null;

        /* renamed from: c */
        private String f17220c = null;

        /* renamed from: d */
        private long f17221d = 0;

        private C3152d() {
        }

        /* renamed from: a */
        public Map<String, Object> mo19155a() {
            return this.f17218a;
        }

        /* renamed from: b */
        public String mo19156b() {
            return this.f17220c;
        }

        /* renamed from: c */
        public String mo19157c() {
            return this.f17219b;
        }

        /* renamed from: d */
        public long mo19158d() {
            return this.f17221d;
        }

        public C3152d(String str, Map<String, Object> map, String str2, long j) {
            this.f17218a = map;
            this.f17219b = str;
            this.f17221d = j;
            this.f17220c = str2;
        }
    }

    static {
        m22026h();
    }

    /* renamed from: a */
    public static CoreProtocolImpl m22007a(Context context) {
        if (f17156a == null && context != null) {
            f17156a = context.getApplicationContext();
        }
        return C3150b.f17211a;
    }

    /* renamed from: b */
    private void m22014b(JSONObject jSONObject) {
        if (!UMStoreManager.m21939a(UMGlobalContext.getAppContext(f17156a)).mo19102c()) {
            JSONObject f = UMStoreManager.m21939a(UMGlobalContext.getAppContext(f17156a)).mo19106f();
            if (f != null) {
                String optString = f.optString("__av");
                String optString2 = f.optString("__vc");
                try {
                    String str = "app_version";
                    if (TextUtils.isEmpty(optString)) {
                        jSONObject.put(str, UMUtils.getAppVersionName(f17156a));
                    } else {
                        jSONObject.put(str, optString);
                    }
                    String str2 = "version_code";
                    if (TextUtils.isEmpty(optString2)) {
                        jSONObject.put(str2, UMUtils.getAppVersionCode(f17156a));
                    } else {
                        jSONObject.put(str2, optString2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: e */
    private void m22019e(Object obj) {
        String str = "__t";
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (2050 == jSONObject.getInt(str)) {
                if (m22010a(this.f17177k, this.f17175i)) {
                    this.f17175i++;
                } else {
                    return;
                }
            } else if (2049 == jSONObject.getInt(str)) {
                if (m22010a(this.f17177k, this.f17176j)) {
                    this.f17176j++;
                } else {
                    return;
                }
            }
            if (this.f17173g.length() >= this.f17172f) {
                UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>>*** 超过10个事件，事件落库。");
                UMStoreManager.m21939a(f17156a).mo19092a(this.f17173g);
                this.f17173g = new JSONArray();
            }
            if (this.f17177k == 0) {
                this.f17177k = System.currentTimeMillis();
            }
            this.f17173g.put(jSONObject);
        } catch (Throwable th) {
            MLog.m22447e(th);
        }
    }

    /* renamed from: f */
    private void m22022f(JSONObject jSONObject) {
        try {
            boolean has = jSONObject.getJSONObject("header").has(UContent.f16894aB);
            String str = UContent.f16939n;
            String str2 = "analytics";
            String str3 = "content";
            if (has) {
                if (jSONObject.has(str3)) {
                    jSONObject = jSONObject.getJSONObject(str3);
                }
                boolean has2 = jSONObject.has(str2);
                String str4 = UMRTLog.RTLOG_TAG;
                if (has2) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
                    if (jSONObject2.has(str)) {
                        JSONObject optJSONObject = jSONObject2.getJSONArray(str).optJSONObject(0);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("id");
                            if (!TextUtils.isEmpty(optString)) {
                                UMRTLog.m22229i(str4, "--->>> removeAllInstantData: really delete instant session data");
                                UMStoreManager.m21939a(f17156a).mo19099b(optString);
                            }
                        }
                    }
                }
                UMStoreManager.m21939a(f17156a).mo19098b();
                UMRTLog.m22229i(str4, "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE.");
                Context context = f17156a;
                UMWorkDispatch.sendEvent(context, C3149a.f17196l, CoreProtocol.getInstance(context), null);
                return;
            }
            if (jSONObject.has(str3)) {
                jSONObject = jSONObject.getJSONObject(str3);
            }
            if (jSONObject.has(str2)) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject(str2);
                if (optJSONObject2 != null && optJSONObject2.length() > 0 && optJSONObject2.has(str)) {
                    UMStoreManager.m21939a(f17156a).mo19094a(true, false);
                }
            }
            UMStoreManager.m21939a(f17156a).mo19098b();
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private static void m22026h() {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName(f17165x);
            f17166y = cls2;
            Method declaredMethod = cls2.getDeclaredMethod("setPuidAndProvider", new Class[]{cls, cls});
            if (declaredMethod != null) {
                f17167z = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    private void m22028i() {
        String str = "exception";
        JSONObject b = mo19139b(UMEnvelopeBuild.maxDataSpace(f17156a));
        if (b != null && b.length() >= 1) {
            JSONObject jSONObject = (JSONObject) b.opt("header");
            JSONObject jSONObject2 = (JSONObject) b.opt("content");
            if (f17156a != null && jSONObject != null && jSONObject2 != null) {
                String str2 = UMRTLog.RTLOG_TAG;
                UMRTLog.m22229i(str2, "--->>> constructInstantMessage: request build envelope.");
                JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(f17156a, jSONObject, jSONObject2);
                if (buildEnvelopeWithExtHeader != null) {
                    try {
                        if (buildEnvelopeWithExtHeader.has(str)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Build envelope error code: ");
                            sb.append(buildEnvelopeWithExtHeader.getInt(str));
                            UMRTLog.m22229i(str2, sb.toString());
                        }
                    } catch (Throwable unused) {
                    }
                    if (UMConfigure.isDebugLog()) {
                        m22020e(buildEnvelopeWithExtHeader);
                    }
                    mo19143b((Object) buildEnvelopeWithExtHeader);
                }
            }
        }
    }

    /* renamed from: j */
    private void m22029j() {
        String str = "exception";
        JSONObject a = mo19133a(UMEnvelopeBuild.maxDataSpace(f17156a));
        if (a != null && a.length() >= 1) {
            JSONObject jSONObject = (JSONObject) a.opt("header");
            JSONObject jSONObject2 = (JSONObject) a.opt("content");
            Context context = f17156a;
            if (context != null && jSONObject != null && jSONObject2 != null) {
                JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2);
                if (buildEnvelopeWithExtHeader != null) {
                    try {
                        if (buildEnvelopeWithExtHeader.has(str)) {
                            String str2 = UMRTLog.RTLOG_TAG;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Build envelope error code: ");
                            sb.append(buildEnvelopeWithExtHeader.getInt(str));
                            UMRTLog.m22229i(str2, sb.toString());
                        }
                    } catch (Throwable unused) {
                    }
                    if (UMConfigure.isDebugLog()) {
                        m22017d(buildEnvelopeWithExtHeader);
                    }
                    mo19135a((Object) buildEnvelopeWithExtHeader);
                }
            }
        }
    }

    /* renamed from: k */
    private JSONObject m22030k() {
        JSONObject l = m22031l();
        if (l != null) {
            try {
                l.put("st", SdkVersion.MINI_VERSION);
            } catch (Throwable unused) {
            }
        }
        return l;
    }

    /* renamed from: l */
    private JSONObject m22031l() {
        String str = "vers_name";
        String str2 = UContent.f16938m;
        String str3 = UContent.f16937l;
        String str4 = "";
        JSONObject jSONObject = new JSONObject();
        try {
            if (AnalyticsConfig.mWrapperType != null) {
                String str5 = AnalyticsConfig.mWrapperVersion;
                if (str5 != null) {
                    jSONObject.put("wrapper_version", str5);
                    jSONObject.put("wrapper_type", AnalyticsConfig.mWrapperType);
                }
            }
            int verticalType = AnalyticsConfig.getVerticalType(f17156a);
            jSONObject.put(UContent.f16934i, verticalType);
            String str6 = "9.3.8";
            String str7 = "sdk_version";
            if (verticalType == 1) {
                String gameSdkVersion = AnalyticsConfig.getGameSdkVersion(f17156a);
                if (!TextUtils.isEmpty(gameSdkVersion)) {
                    str6 = gameSdkVersion;
                }
                jSONObject.put(str7, str6);
            } else {
                jSONObject.put(str7, str6);
            }
            String MD5 = HelperUtils.MD5(AnalyticsConfig.getSecretKey(f17156a));
            if (!TextUtils.isEmpty(MD5)) {
                jSONObject.put("secret", MD5);
            }
            String imprintProperty = UMEnvelopeBuild.imprintProperty(f17156a, "pr_ve", null);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17156a);
            String imprintProperty2 = UMEnvelopeBuild.imprintProperty(f17156a, UContent.f16914an, str4);
            if (!TextUtils.isEmpty(imprintProperty2)) {
                boolean z = AnalyticsConfig.CLEAR_EKV_BL;
                String str8 = UContent.f16916ap;
                if (z) {
                    jSONObject.put(str8, str4);
                } else {
                    jSONObject.put(str8, imprintProperty2);
                }
            }
            String imprintProperty3 = UMEnvelopeBuild.imprintProperty(f17156a, UContent.f16915ao, str4);
            if (!TextUtils.isEmpty(imprintProperty3)) {
                boolean z2 = AnalyticsConfig.CLEAR_EKV_WL;
                String str9 = UContent.f16917aq;
                if (z2) {
                    jSONObject.put(str9, str4);
                } else {
                    jSONObject.put(str9, imprintProperty3);
                }
            }
            jSONObject.put(UContent.f16908ah, "1.0.0");
            if (m22038s()) {
                jSONObject.put(UContent.f16910aj, SdkVersion.MINI_VERSION);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong(f17158m, 0).commit();
                }
            }
            jSONObject.put(str3, m22032m());
            jSONObject.put(str2, m22033n());
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(str, str4);
                if (!TextUtils.isEmpty(string)) {
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    String str10 = "vers_date";
                    String str11 = "vers_pre_version";
                    if (TextUtils.isEmpty(imprintProperty)) {
                        jSONObject.put(str3, sharedPreferences.getString(str11, "0"));
                        jSONObject.put(str2, sharedPreferences.getString(str10, format));
                    }
                    sharedPreferences.edit().putString("pre_version", string).putString("cur_version", DeviceConfig.getAppVersionName(f17156a)).putString("pre_date", format).remove(str).remove("vers_code").remove(str10).remove(str11).commit();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: m */
    private String m22032m() {
        String str = "";
        String str2 = "pre_version";
        String str3 = null;
        try {
            str3 = UMEnvelopeBuild.imprintProperty(f17156a, "pr_ve", null);
            String str4 = "0";
            if (TextUtils.isEmpty(str3)) {
                if (!TextUtils.isEmpty(this.f17170d)) {
                    return this.f17170d;
                }
                if (this.f17169c == null) {
                    this.f17169c = PreferenceWrapper.getDefault(f17156a);
                }
                String string = this.f17169c.getString(str2, str);
                String appVersionName = DeviceConfig.getAppVersionName(f17156a);
                String str5 = "cur_version";
                if (TextUtils.isEmpty(string)) {
                    this.f17169c.edit().putString(str2, str4).putString(str5, appVersionName).commit();
                    str3 = str4;
                } else {
                    String string2 = this.f17169c.getString(str5, str);
                    if (!appVersionName.equals(string2)) {
                        this.f17169c.edit().putString(str2, string2).putString(str5, appVersionName).commit();
                        str3 = string2;
                    } else {
                        str3 = string;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f17170d = str3;
        return str3;
    }

    /* renamed from: n */
    private String m22033n() {
        String str = "pre_date";
        String str2 = null;
        try {
            str2 = UMEnvelopeBuild.imprintProperty(f17156a, "ud_da", null);
            if (TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(this.f17171e)) {
                    return this.f17171e;
                }
                if (this.f17169c == null) {
                    this.f17169c = PreferenceWrapper.getDefault(f17156a);
                }
                String string = this.f17169c.getString(str, "");
                String str3 = "yyyy-MM-dd";
                if (TextUtils.isEmpty(string)) {
                    string = new SimpleDateFormat(str3, Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    this.f17169c.edit().putString(str, string).commit();
                } else {
                    String format = new SimpleDateFormat(str3, Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (!string.equals(format)) {
                        this.f17169c.edit().putString(str, format).commit();
                        str2 = format;
                    }
                }
                str2 = string;
            }
        } catch (Throwable unused) {
        }
        this.f17171e = str2;
        return str2;
    }

    /* renamed from: o */
    private void m22034o() {
        try {
            this.f17175i = 0;
            this.f17176j = 0;
            this.f17177k = System.currentTimeMillis();
            PreferenceWrapper.getDefault(f17156a).edit().putLong(f17160o, System.currentTimeMillis()).putInt(f17161p, 0).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: p */
    private boolean m22035p() {
        try {
            if (!TextUtils.isEmpty(SessionTracker.m22097a().mo19173b())) {
                mo19142b(f17156a);
            }
            if (this.f17173g.length() <= 0) {
                return false;
            }
            for (int i = 0; i < this.f17173g.length(); i++) {
                JSONObject optJSONObject = this.f17173g.optJSONObject(i);
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    String optString = optJSONObject.optString("__i");
                    if (TextUtils.isEmpty(optString) || f17164t.equals(optString)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r6.equals(r4) != false) goto L_0x0038;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22036q() {
        /*
            r7 = this;
            java.lang.String r0 = "__i"
            org.json.JSONArray r1 = r7.f17173g
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0057
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r2 = 0
        L_0x0010:
            org.json.JSONArray r3 = r7.f17173g
            int r3 = r3.length()
            if (r2 >= r3) goto L_0x0055
            org.json.JSONArray r3 = r7.f17173g     // Catch:{ all -> 0x0052 }
            org.json.JSONObject r3 = r3.getJSONObject(r2)     // Catch:{ all -> 0x0052 }
            if (r3 == 0) goto L_0x004f
            int r4 = r3.length()     // Catch:{ all -> 0x0052 }
            if (r4 <= 0) goto L_0x004f
            java.lang.String r4 = r3.optString(r0)     // Catch:{ all -> 0x0052 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0052 }
            java.lang.String r6 = "-1"
            if (r5 != 0) goto L_0x0038
            boolean r4 = r6.equals(r4)     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x004b
        L_0x0038:
            com.umeng.analytics.pro.t r4 = com.umeng.analytics.pro.SessionTracker.m22097a()     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = r4.mo19173b()     // Catch:{ all -> 0x0052 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r6 = r4
        L_0x0048:
            r3.put(r0, r6)     // Catch:{ all -> 0x0052 }
        L_0x004b:
            r1.put(r3)     // Catch:{ all -> 0x0052 }
            goto L_0x0052
        L_0x004f:
            r1.put(r3)     // Catch:{ all -> 0x0052 }
        L_0x0052:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0055:
            r7.f17173g = r1
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.CoreProtocolImpl.m22036q():void");
    }

    /* renamed from: r */
    private void m22037r() {
        String str = f17157l;
        try {
            if (m22038s()) {
                Context context = f17156a;
                if (context != null) {
                    SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                    if (sharedPreferences != null && sharedPreferences.getLong(str, 0) == 0) {
                        sharedPreferences.edit().putLong(str, System.currentTimeMillis()).commit();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: s */
    private boolean m22038s() {
        try {
            Context context = f17156a;
            if (context != null) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (!(sharedPreferences == null || sharedPreferences.getLong(f17158m, -1) == 0)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: b */
    public void mo19141b() {
    }

    /* renamed from: c */
    public void mo19144c() {
        mo19142b(f17156a);
        mo19146d();
        mo19138a(true);
    }

    /* renamed from: d */
    public void mo19146d() {
        try {
            if (this.f17173g.length() > 0) {
                UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>>*** flushMemoryData: 事件落库。");
                UMStoreManager.m21939a(f17156a).mo19092a(this.f17173g);
                this.f17173g = new JSONArray();
            }
            PreferenceWrapper.getDefault(f17156a).edit().putLong(f17159n, this.f17177k).putInt(f17162q, this.f17175i).putInt(f17163r, this.f17176j).commit();
        } catch (Throwable unused) {
        }
    }

    private CoreProtocolImpl() {
        this.f17168b = null;
        this.f17169c = null;
        this.f17170d = null;
        this.f17171e = null;
        this.f17172f = 10;
        this.f17173g = new JSONArray();
        this.f17174h = 5000;
        this.f17175i = 0;
        this.f17176j = 0;
        this.f17177k = 0;
        this.f17178s = 28800000;
        this.f17179u = false;
        this.f17180v = false;
        this.f17181w = new Object();
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17156a);
            this.f17177k = sharedPreferences.getLong(f17159n, 0);
            this.f17175i = sharedPreferences.getInt(f17162q, 0);
            this.f17176j = sharedPreferences.getInt(f17163r, 0);
            this.f17168b = new C3151c();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private void m22025g(JSONObject jSONObject) {
        try {
            boolean has = jSONObject.getJSONObject("header").has(UContent.f16894aB);
            String str = UContent.f16939n;
            String str2 = "analytics";
            String str3 = "content";
            if (has) {
                if (jSONObject.has(str3)) {
                    jSONObject = jSONObject.getJSONObject(str3);
                }
                if (!jSONObject.has(str2)) {
                    return;
                }
                if (jSONObject.getJSONObject(str2).has(str)) {
                    UMStoreManager.m21939a(f17156a).mo19109i();
                    UMStoreManager.m21939a(f17156a).mo19108h();
                    UMStoreManager.m21939a(f17156a).mo19100b(true, false);
                    UMStoreManager.m21939a(f17156a).mo19091a();
                    return;
                }
                UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>> Error, Should not go to this branch.");
                return;
            }
            if (jSONObject.has(str3)) {
                jSONObject = jSONObject.getJSONObject(str3);
            }
            if (jSONObject.has(str2)) {
                JSONObject optJSONObject = jSONObject.optJSONObject(str2);
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    if (optJSONObject.has(str)) {
                        UMStoreManager.m21939a(f17156a).mo19100b(true, false);
                    }
                    if (optJSONObject.has("ekv") || optJSONObject.has(UContent.f16885T)) {
                        UMStoreManager.m21939a(f17156a).mo19108h();
                    }
                    if (optJSONObject.has(UContent.f16880O)) {
                        UMStoreManager.m21939a(f17156a).mo19109i();
                    }
                }
            }
            UMStoreManager.m21939a(f17156a).mo19091a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m22015c(JSONObject jSONObject) {
        String str = "version_code";
        String str2 = "app_version";
        if (!UMStoreManager.m21939a(f17156a).mo19105e()) {
            JSONObject g = UMStoreManager.m21939a(f17156a).mo19107g();
            if (g != null) {
                String optString = g.optString("__av");
                String optString2 = g.optString("__vc");
                try {
                    if (TextUtils.isEmpty(optString)) {
                        jSONObject.put(str2, UMUtils.getAppVersionName(f17156a));
                    } else {
                        jSONObject.put(str2, optString);
                    }
                    if (TextUtils.isEmpty(optString2)) {
                        jSONObject.put(str, UMUtils.getAppVersionCode(f17156a));
                    } else {
                        jSONObject.put(str, optString2);
                    }
                } catch (Throwable unused) {
                }
            }
        } else {
            jSONObject.put(str2, UMUtils.getAppVersionName(f17156a));
            jSONObject.put(str, UMUtils.getAppVersionCode(f17156a));
        }
    }

    /* renamed from: a */
    public void mo19134a() {
        if (f17156a != null) {
            synchronized (this.f17181w) {
                if (this.f17179u) {
                    UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>> network is now available, rebuild instant session data packet.");
                    Context context = f17156a;
                    UMWorkDispatch.sendEvent(context, C3149a.f17196l, CoreProtocol.getInstance(context), null);
                }
            }
            synchronized (this.f17181w) {
                if (this.f17180v) {
                    Context context2 = f17156a;
                    UMWorkDispatch.sendEvent(context2, C3149a.f17197m, CoreProtocol.getInstance(context2), null);
                }
            }
        }
    }

    /* renamed from: h */
    private void m22027h(Object obj) {
        String str = "__ii";
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0 && jSONObject.has(str)) {
                String optString = jSONObject.optString(str);
                jSONObject.remove(str);
                if (!TextUtils.isEmpty(optString)) {
                    UMStoreManager.m21939a(f17156a).mo19095a(optString, obj.toString(), 2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m22017d(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        String str2 = UContent.f16946u;
        String str3 = "version_code";
        String str4 = "analytics";
        String str5 = "appkey";
        String str6 = "device_model";
        String str7 = UContent.f16877L;
        String str8 = "device_id";
        String str9 = UContent.f16874I;
        String str10 = "sdk_version";
        String str11 = UContent.f16939n;
        String str12 = UContent.f16880O;
        String str13 = UContent.f16885T;
        String str14 = "header";
        String str15 = "ekv";
        String str16 = "channel";
        String str17 = "dplus";
        if (jSONObject2 != null) {
            try {
                if (jSONObject.length() > 0) {
                    String str18 = str5;
                    JSONObject jSONObject3 = new JSONObject();
                    if (jSONObject2.has(str4)) {
                        JSONObject jSONObject4 = jSONObject2.getJSONObject(str4);
                        if (jSONObject4.has(str15)) {
                            str = str3;
                            jSONObject3.put(str15, jSONObject4.getJSONArray(str15));
                            if (jSONObject3.length() > 0) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("事件:");
                                sb.append(jSONObject3.toString());
                                MLog.m22437d(sb.toString());
                                jSONObject3 = new JSONObject();
                            }
                        } else {
                            str = str3;
                        }
                        if (jSONObject4.has(str13)) {
                            jSONObject3.put(str13, jSONObject4.getJSONArray(str13));
                            if (jSONObject3.length() > 0) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("游戏事件:");
                                sb2.append(jSONObject3.toString());
                                MLog.m22437d(sb2.toString());
                                jSONObject3 = new JSONObject();
                            }
                        }
                        if (jSONObject4.has(str12)) {
                            jSONObject3.put(str12, jSONObject4.getJSONArray(str12));
                            if (jSONObject3.length() > 0) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("错误:");
                                sb3.append(jSONObject3.toString());
                                MLog.m22437d(sb3.toString());
                                jSONObject3 = new JSONObject();
                            }
                        }
                        if (jSONObject4.has(str11)) {
                            JSONArray jSONArray = jSONObject4.getJSONArray(str11);
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                                if (jSONObject5 != null && jSONObject5.length() > 0) {
                                    if (jSONObject5.has(str2)) {
                                        jSONObject5.remove(str2);
                                    }
                                    jSONArray2.put(jSONObject5);
                                }
                            }
                            jSONObject3.put(str11, jSONArray2);
                            if (jSONObject3.length() > 0) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("会话:");
                                sb4.append(jSONObject3.toString());
                                MLog.m22437d(sb4.toString());
                                jSONObject3 = new JSONObject();
                            }
                        }
                        if (jSONObject4.has(str9)) {
                            jSONObject3.put(str9, jSONObject4.getJSONObject(str9));
                        }
                        if (jSONObject4.has(str7)) {
                            jSONObject3.put(str7, jSONObject4.getJSONObject(str7));
                            if (jSONObject3.length() > 0) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("账号:");
                                sb5.append(jSONObject3.toString());
                                MLog.m22437d(sb5.toString());
                                jSONObject3 = new JSONObject();
                            }
                        }
                    } else {
                        str = str3;
                    }
                    if (jSONObject2.has(str17)) {
                        jSONObject3.put(str17, jSONObject2.getJSONObject(str17));
                    }
                    if (jSONObject2.has(str14) && jSONObject2.has(str14)) {
                        JSONObject jSONObject6 = jSONObject2.getJSONObject(str14);
                        if (jSONObject6 != null && jSONObject6.length() > 0) {
                            if (jSONObject6.has(str10)) {
                                jSONObject3.put(str10, jSONObject6.getString(str10));
                            }
                            if (jSONObject6.has(str8)) {
                                jSONObject3.put(str8, jSONObject6.getString(str8));
                            }
                            if (jSONObject6.has(str6)) {
                                jSONObject3.put(str6, jSONObject6.getString(str6));
                            }
                            String str19 = str;
                            if (jSONObject6.has(str19)) {
                                jSONObject3.put("version", jSONObject6.getInt(str19));
                            }
                            String str20 = str18;
                            if (jSONObject6.has(str20)) {
                                jSONObject3.put(str20, jSONObject6.getString(str20));
                            }
                            String str21 = str16;
                            if (jSONObject6.has(str21)) {
                                jSONObject3.put(str21, jSONObject6.getString(str21));
                            }
                            if (jSONObject3.length() > 0) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("基础信息:");
                                sb6.append(jSONObject3.toString());
                                MLog.m22437d(sb6.toString());
                                jSONObject3 = new JSONObject();
                            }
                        }
                    }
                    jSONObject3.length();
                }
            } catch (Throwable th) {
                MLog.m22447e(th);
            }
        }
    }

    /* renamed from: b */
    public JSONObject mo19139b(long j) {
        if (TextUtils.isEmpty(SessionIdManager.m22133a().mo19196d(UMGlobalContext.getAppContext(f17156a)))) {
            return null;
        }
        JSONObject b = UMStoreManager.m21939a(UMGlobalContext.getAppContext(f17156a)).mo19097b(false);
        String[] a = InternalConfig.m21471a(f17156a);
        String str = UContent.f16877L;
        if (a != null && !TextUtils.isEmpty(a[0]) && !TextUtils.isEmpty(a[1])) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(UContent.f16878M, a[0]);
                jSONObject.put(UContent.f16879N, a[1]);
                if (jSONObject.length() > 0) {
                    b.put(str, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        int a2 = DefconProcesser.m22072a().mo19161a(f17156a);
        if (b.length() == 1 && b.optJSONObject(str) != null && a2 != 3) {
            return null;
        }
        DefconProcesser.m22072a().mo19163b(b, f17156a);
        if (b.length() <= 0 && a2 != 3) {
            return null;
        }
        JSONObject k = m22030k();
        if (k != null) {
            m22014b(k);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        String str2 = "analytics";
        if (a2 == 3) {
            try {
                jSONObject3.put(str2, new JSONObject());
            } catch (Throwable unused2) {
            }
        } else if (b.length() > 0) {
            jSONObject3.put(str2, b);
        }
        if (k != null && k.length() > 0) {
            jSONObject2.put("header", k);
        }
        if (jSONObject3.length() > 0) {
            jSONObject2.put("content", jSONObject3);
        }
        jSONObject2 = m22013b(jSONObject2, j);
        return jSONObject2;
    }

    /* renamed from: c */
    private boolean m22016c(boolean z) {
        if (m22038s()) {
            return true;
        }
        if (this.f17168b == null) {
            this.f17168b = new C3151c();
        }
        this.f17168b.mo19151a();
        ReportStrategy c = this.f17168b.mo19154c();
        boolean shouldSendMessage = c.shouldSendMessage(z);
        if (shouldSendMessage) {
            if (((c instanceof ReportByInterval) || (c instanceof DebugPolicy) || (c instanceof ReportQuasiRealtime)) && m22035p()) {
                mo19146d();
            }
            if ((c instanceof DefconPolicy) && m22035p()) {
                mo19146d();
            }
            if (UMConfigure.isDebugLog()) {
                StringBuilder sb = new StringBuilder();
                sb.append("数据发送策略 : ");
                sb.append(c.getClass().getSimpleName());
                MLog.m22437d(sb.toString());
            }
        }
        return shouldSendMessage;
    }

    /* renamed from: e */
    private void m22020e(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str = "version_code";
        String str2 = "analytics";
        String str3 = "channel";
        String str4 = "appkey";
        String str5 = "device_model";
        String str6 = "device_id";
        String str7 = "sdk_version";
        String str8 = UContent.f16877L;
        String str9 = UContent.f16939n;
        String str10 = "header";
        if (jSONObject2 != null) {
            try {
                if (jSONObject.length() > 0) {
                    JSONObject jSONObject3 = new JSONObject();
                    if (jSONObject2.has(str2)) {
                        JSONObject jSONObject4 = jSONObject2.getJSONObject(str2);
                        if (jSONObject4.has(str9)) {
                            JSONArray jSONArray = jSONObject4.getJSONArray(str9);
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                                if (jSONObject5 != null && jSONObject5.length() > 0) {
                                    jSONArray2.put(jSONObject5);
                                }
                            }
                            jSONObject3.put(str9, jSONArray2);
                            if (jSONObject3.length() > 0) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("本次启动会话:");
                                sb.append(jSONObject3.toString());
                                MLog.m22437d(sb.toString());
                                jSONObject3 = new JSONObject();
                            }
                        }
                        if (jSONObject4.has(str8)) {
                            jSONObject3.put(str8, jSONObject4.getJSONObject(str8));
                            if (jSONObject3.length() > 0) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("本次启动账号:");
                                sb2.append(jSONObject3.toString());
                                MLog.m22437d(sb2.toString());
                                jSONObject3 = new JSONObject();
                            }
                        }
                    }
                    if (jSONObject2.has(str10) && jSONObject2.has(str10)) {
                        JSONObject jSONObject6 = jSONObject2.getJSONObject(str10);
                        if (jSONObject6 != null && jSONObject6.length() > 0) {
                            if (jSONObject6.has(str7)) {
                                jSONObject3.put(str7, jSONObject6.getString(str7));
                            }
                            if (jSONObject6.has(str6)) {
                                jSONObject3.put(str6, jSONObject6.getString(str6));
                            }
                            if (jSONObject6.has(str5)) {
                                jSONObject3.put(str5, jSONObject6.getString(str5));
                            }
                            if (jSONObject6.has(str)) {
                                jSONObject3.put("version", jSONObject6.getInt(str));
                            }
                            if (jSONObject6.has(str4)) {
                                jSONObject3.put(str4, jSONObject6.getString(str4));
                            }
                            if (jSONObject6.has(str3)) {
                                jSONObject3.put(str3, jSONObject6.getString(str3));
                            }
                            if (jSONObject3.length() > 0) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("本次启动基础信息:");
                                sb3.append(jSONObject3.toString());
                                MLog.m22437d(sb3.toString());
                                jSONObject3 = new JSONObject();
                            }
                        }
                    }
                    jSONObject3.length();
                }
            } catch (Throwable th) {
                MLog.m22447e(th);
            }
        }
    }

    /* renamed from: a */
    private void m22009a(String str, String str2) {
        Class<?> cls = f17166y;
        if (cls != null) {
            Method method = f17167z;
            if (method != null) {
                try {
                    method.invoke(cls, new Object[]{str, str2});
                } catch (Throwable unused) {
                    UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "--->>> reflect call setPuidAndProvider method of crash lib failed.");
                }
            }
        }
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19136a(java.lang.Object r7, int r8) {
        /*
            r6 = this;
            boolean r0 = com.umeng.analytics.AnalyticsConfig.enable
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 8213(0x2015, float:1.1509E-41)
            if (r8 == r0) goto L_0x01cc
            r0 = 0
            r1 = 0
            r2 = 1
            switch(r8) {
                case 4097: goto L_0x0192;
                case 4098: goto L_0x0179;
                case 4099: goto L_0x0172;
                case 4100: goto L_0x016b;
                case 4101: goto L_0x015c;
                case 4102: goto L_0x014d;
                case 4103: goto L_0x0132;
                case 4104: goto L_0x0127;
                case 4105: goto L_0x0122;
                case 4106: goto L_0x011d;
                default: goto L_0x000f;
            }
        L_0x000f:
            switch(r8) {
                case 4352: goto L_0x0102;
                case 4353: goto L_0x00fd;
                case 4354: goto L_0x00f8;
                case 4355: goto L_0x00cc;
                case 4356: goto L_0x008d;
                default: goto L_0x0012;
            }
        L_0x0012:
            switch(r8) {
                case 8195: goto L_0x0084;
                case 8196: goto L_0x007b;
                case 8197: goto L_0x0072;
                default: goto L_0x0015;
            }
        L_0x0015:
            switch(r8) {
                case 8199: goto L_0x0069;
                case 8200: goto L_0x0069;
                case 8201: goto L_0x0060;
                default: goto L_0x0018;
            }
        L_0x0018:
            switch(r8) {
                case 8208: goto L_0x0041;
                case 8209: goto L_0x003c;
                case 8210: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x01ef
        L_0x001d:
            java.lang.String r7 = "MobclickRT"
            java.lang.String r8 = "--->>> recv BUILD_ENVELOPE_IMMEDIATELY."
            com.umeng.commonsdk.debug.UMRTLog.m22229i(r7, r8)
            android.content.Context r7 = f17156a     // Catch:{ all -> 0x01ef }
            boolean r7 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r7)     // Catch:{ all -> 0x01ef }
            if (r7 == 0) goto L_0x01ef
            com.umeng.analytics.pro.n$c r7 = r6.f17168b     // Catch:{ all -> 0x01ef }
            com.umeng.commonsdk.statistics.common.ReportPolicy$ReportStrategy r7 = r7.mo19154c()     // Catch:{ all -> 0x01ef }
            boolean r7 = r7 instanceof com.umeng.commonsdk.statistics.common.ReportPolicy.ReportQuasiRealtime     // Catch:{ all -> 0x01ef }
            if (r7 == 0) goto L_0x0037
            return
        L_0x0037:
            r6.mo19138a(r2)     // Catch:{ all -> 0x01ef }
            goto L_0x01ef
        L_0x003c:
            r6.mo19137a(r7, r0)
            goto L_0x01ef
        L_0x0041:
            java.lang.String r7 = "MobclickRT"
            java.lang.String r8 = "--->>> receive DELAY_BUILD_ENVELOPE event."
            com.umeng.commonsdk.debug.UMRTLog.m22229i(r7, r8)
            android.content.Context r7 = f17156a
            r8 = 8209(0x2011, float:1.1503E-41)
            com.umeng.analytics.CoreProtocol r0 = com.umeng.analytics.CoreProtocol.getInstance(r7)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r7, r8, r0, r1)
            android.content.Context r7 = f17156a
            r8 = 4354(0x1102, float:6.101E-42)
            com.umeng.analytics.CoreProtocol r0 = com.umeng.analytics.CoreProtocol.getInstance(r7)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r7, r8, r0, r1)
            goto L_0x01ef
        L_0x0060:
            com.umeng.analytics.b r7 = com.umeng.analytics.InternalAgent.m21414a()
            r7.mo18813b(r1)
            goto L_0x01ef
        L_0x0069:
            com.umeng.analytics.b r8 = com.umeng.analytics.InternalAgent.m21414a()
            r8.mo18813b(r7)
            goto L_0x01ef
        L_0x0072:
            com.umeng.analytics.b r7 = com.umeng.analytics.InternalAgent.m21414a()
            r7.mo18833k()
            goto L_0x01ef
        L_0x007b:
            com.umeng.analytics.b r7 = com.umeng.analytics.InternalAgent.m21414a()
            r7.mo18835m()
            goto L_0x01ef
        L_0x0084:
            com.umeng.analytics.b r8 = com.umeng.analytics.InternalAgent.m21414a()
            r8.mo18804a(r7)
            goto L_0x01ef
        L_0x008d:
            if (r7 != 0) goto L_0x0090
            return
        L_0x0090:
            java.lang.Class<?> r8 = f17166y
            if (r8 == 0) goto L_0x00cb
            java.lang.reflect.Method r8 = f17167z
            if (r8 != 0) goto L_0x0099
            goto L_0x00cb
        L_0x0099:
            java.lang.String r8 = "MobclickRT"
            java.lang.String r0 = "--->>> PROFILE_CHANGE_NOTIFY"
            com.umeng.commonsdk.debug.UMRTLog.m22229i(r8, r0)
            java.lang.String r8 = ""
            java.lang.String r0 = ""
            boolean r1 = r7 instanceof org.json.JSONObject     // Catch:{ all -> 0x01ef }
            if (r1 == 0) goto L_0x01ef
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ all -> 0x01ef }
            java.lang.String r1 = "uid"
            boolean r1 = r7.has(r1)     // Catch:{ all -> 0x01ef }
            if (r1 == 0) goto L_0x00c6
            java.lang.String r1 = "provider"
            boolean r1 = r7.has(r1)     // Catch:{ all -> 0x01ef }
            if (r1 == 0) goto L_0x00c6
            java.lang.String r8 = "provider"
            java.lang.String r8 = r7.getString(r8)     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = "uid"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x01ef }
        L_0x00c6:
            r6.m22009a(r0, r8)     // Catch:{ all -> 0x01ef }
            goto L_0x01ef
        L_0x00cb:
            return
        L_0x00cc:
            android.content.Context r8 = f17156a     // Catch:{ all -> 0x01ef }
            boolean r8 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r8)     // Catch:{ all -> 0x01ef }
            if (r8 == 0) goto L_0x00de
            if (r7 == 0) goto L_0x01ef
            r6.m22019e(r7)     // Catch:{ all -> 0x01ef }
            r6.mo19146d()     // Catch:{ all -> 0x01ef }
            goto L_0x01ef
        L_0x00de:
            android.content.Context r8 = f17156a     // Catch:{ all -> 0x01ef }
            com.umeng.analytics.process.UMProcessDBHelper r8 = com.umeng.analytics.process.UMProcessDBHelper.getInstance(r8)     // Catch:{ all -> 0x01ef }
            android.content.Context r0 = f17156a     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = com.umeng.commonsdk.framework.UMFrUtils.getSubProcessName(r0)     // Catch:{ all -> 0x01ef }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x01ef }
            r1.<init>()     // Catch:{ all -> 0x01ef }
            org.json.JSONArray r7 = r1.put(r7)     // Catch:{ all -> 0x01ef }
            r8.insertEventsInSubProcess(r0, r7)     // Catch:{ all -> 0x01ef }
            goto L_0x01ef
        L_0x00f8:
            r6.mo19144c()
            goto L_0x01ef
        L_0x00fd:
            r6.mo19137a(r7, r2)
            goto L_0x01ef
        L_0x0102:
            java.lang.String r8 = "MobclickRT"
            java.lang.String r0 = "--->>> INSTANT_SESSION_START"
            com.umeng.commonsdk.debug.UMRTLog.m22229i(r8, r0)
            com.umeng.analytics.pro.t r8 = com.umeng.analytics.pro.SessionTracker.m22097a()
            android.content.Context r0 = f17156a
            r8.mo19175b(r0, r7)
            java.lang.Object r8 = r6.f17181w
            monitor-enter(r8)
            r6.f17179u = r2     // Catch:{ all -> 0x011a }
            monitor-exit(r8)     // Catch:{ all -> 0x011a }
            goto L_0x01ef
        L_0x011a:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x011a }
            throw r7
        L_0x011d:
            r6.m22027h(r7)
            goto L_0x01ef
        L_0x0122:
            r6.mo19146d()
            goto L_0x01ef
        L_0x0127:
            com.umeng.analytics.pro.t r8 = com.umeng.analytics.pro.SessionTracker.m22097a()
            android.content.Context r0 = f17156a
            r8.mo19179c(r0, r7)
            goto L_0x01ef
        L_0x0132:
            java.lang.String r8 = "MobclickRT"
            java.lang.String r0 = "--->>> START_SESSION"
            com.umeng.commonsdk.debug.UMRTLog.m22229i(r8, r0)
            com.umeng.analytics.pro.t r8 = com.umeng.analytics.pro.SessionTracker.m22097a()
            android.content.Context r0 = f17156a
            r8.mo19170a(r0, r7)
            java.lang.Object r8 = r6.f17181w
            monitor-enter(r8)
            r6.f17180v = r2     // Catch:{ all -> 0x014a }
            monitor-exit(r8)     // Catch:{ all -> 0x014a }
            goto L_0x01ef
        L_0x014a:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x014a }
            throw r7
        L_0x014d:
            java.lang.String r8 = "MobclickRT"
            java.lang.String r0 = "--->>> PROFILE_SIGNOFF"
            com.umeng.commonsdk.debug.UMRTLog.m22229i(r8, r0)
            r6.mo19137a(r1, r2)
            r6.m22021f(r7)
            goto L_0x01ef
        L_0x015c:
            java.lang.String r8 = "MobclickRT"
            java.lang.String r0 = "--->>> PROFILE_SIGNIN"
            com.umeng.commonsdk.debug.UMRTLog.m22229i(r8, r0)
            r6.mo19137a(r1, r2)
            r6.m22024g(r7)
            goto L_0x01ef
        L_0x016b:
            android.content.Context r7 = f17156a
            com.umeng.analytics.pro.AutoViewPageTracker.m21986c(r7)
            goto L_0x01ef
        L_0x0172:
            android.content.Context r7 = f17156a
            com.umeng.analytics.pro.ViewPageTracker.m22117a(r7)
            goto L_0x01ef
        L_0x0179:
            if (r7 == 0) goto L_0x017e
            r6.m22019e(r7)     // Catch:{ all -> 0x01ef }
        L_0x017e:
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ all -> 0x01ef }
            java.lang.String r8 = "__i"
            java.lang.String r7 = r7.optString(r8)     // Catch:{ all -> 0x01ef }
            java.lang.String r8 = "-1"
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x01ef }
            if (r7 != 0) goto L_0x01ef
            r6.mo19138a(r0)     // Catch:{ all -> 0x01ef }
            goto L_0x01ef
        L_0x0192:
            android.content.Context r8 = f17156a     // Catch:{ all -> 0x01ef }
            boolean r8 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r8)     // Catch:{ all -> 0x01ef }
            if (r8 == 0) goto L_0x01b3
            if (r7 == 0) goto L_0x019f
            r6.m22019e(r7)     // Catch:{ all -> 0x01ef }
        L_0x019f:
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ all -> 0x01ef }
            java.lang.String r8 = "__i"
            java.lang.String r7 = r7.optString(r8)     // Catch:{ all -> 0x01ef }
            java.lang.String r8 = "-1"
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x01ef }
            if (r7 != 0) goto L_0x01ef
            r6.mo19138a(r0)     // Catch:{ all -> 0x01ef }
            goto L_0x01ef
        L_0x01b3:
            android.content.Context r8 = f17156a     // Catch:{ all -> 0x01ef }
            com.umeng.analytics.process.UMProcessDBHelper r8 = com.umeng.analytics.process.UMProcessDBHelper.getInstance(r8)     // Catch:{ all -> 0x01ef }
            android.content.Context r0 = f17156a     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = com.umeng.commonsdk.framework.UMFrUtils.getSubProcessName(r0)     // Catch:{ all -> 0x01ef }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x01ef }
            r1.<init>()     // Catch:{ all -> 0x01ef }
            org.json.JSONArray r7 = r1.put(r7)     // Catch:{ all -> 0x01ef }
            r8.insertEventsInSubProcess(r0, r7)     // Catch:{ all -> 0x01ef }
            goto L_0x01ef
        L_0x01cc:
            java.lang.String r7 = "header_foreground_count"
            boolean r7 = com.umeng.commonsdk.config.FieldManager.allow(r7)
            if (r7 == 0) goto L_0x01ef
            android.content.Context r7 = f17156a
            android.app.Activity r7 = com.umeng.commonsdk.statistics.common.DeviceConfig.getGlobleActivity(r7)
            if (r7 == 0) goto L_0x01e1
            android.content.Context r7 = f17156a
            com.umeng.analytics.pro.SessionTracker.m22100b(r7)
        L_0x01e1:
            android.content.Context r0 = f17156a
            r1 = 8213(0x2015, float:1.1509E-41)
            com.umeng.analytics.CoreProtocol r2 = com.umeng.analytics.CoreProtocol.getInstance(r0)
            r3 = 0
            r4 = 5000(0x1388, double:2.4703E-320)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEventEx(r0, r1, r2, r3, r4)
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.CoreProtocolImpl.mo19136a(java.lang.Object, int):void");
    }

    /* renamed from: g */
    private void m22024g(Object obj) {
        try {
            mo19142b(f17156a);
            mo19146d();
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.length() > 0) {
                String string = jSONObject.getString(UContent.f16878M);
                String string2 = jSONObject.getString("uid");
                long j = jSONObject.getLong("ts");
                String[] a = InternalConfig.m21471a(f17156a);
                if (a == null || !string.equals(a[0]) || !string2.equals(a[1])) {
                    SessionTracker.m22097a().mo19169a(f17156a, j);
                    String c = SessionIdManager.m22133a().mo19195c(f17156a);
                    boolean b = SessionTracker.m22097a().mo19176b(f17156a, j, false);
                    InternalConfig.m21470a(f17156a, string, string2);
                    String str = UMRTLog.RTLOG_TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("--->>> onProfileSignIn: force generate new session: session id = ");
                    sb.append(c);
                    UMRTLog.m22229i(str, sb.toString());
                    SessionTracker.m22097a().mo19168a(f17156a, j, true);
                    if (b) {
                        SessionTracker.m22097a().mo19174b(f17156a, j);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public long mo19149f() {
        String str = f17157l;
        long j = 0;
        try {
            Context context = f17156a;
            if (context == null) {
                return 0;
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null) {
                return 0;
            }
            long j2 = sharedPreferences.getLong(str, 0);
            if (j2 == 0) {
                try {
                    j = System.currentTimeMillis();
                    sharedPreferences.edit().putLong(str, j).commit();
                    return j;
                } catch (Throwable unused) {
                }
            }
            return j2;
        } catch (Throwable unused2) {
            return j;
        }
    }

    /* renamed from: c */
    public void mo19145c(Object obj) {
        mo19142b(f17156a);
        mo19146d();
        if (m22018d(false)) {
            m22029j();
        }
    }

    /* renamed from: f */
    private void m22021f(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null) {
                if (jSONObject.length() > 0) {
                    long j = jSONObject.getLong("ts");
                    mo19142b(f17156a);
                    mo19146d();
                    String[] a = InternalConfig.m21471a(f17156a);
                    if (a != null && !TextUtils.isEmpty(a[0]) && !TextUtils.isEmpty(a[1])) {
                        SessionTracker.m22097a().mo19169a(f17156a, j);
                        String c = SessionIdManager.m22133a().mo19195c(f17156a);
                        String str = UMRTLog.RTLOG_TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("--->>> onProfileSignIn: force generate new session: session id = ");
                        sb.append(c);
                        UMRTLog.m22229i(str, sb.toString());
                        boolean b = SessionTracker.m22097a().mo19176b(f17156a, j, false);
                        InternalConfig.m21472b(f17156a);
                        SessionTracker.m22097a().mo19168a(f17156a, j, true);
                        if (b) {
                            SessionTracker.m22097a().mo19174b(f17156a, j);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m22445e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* renamed from: b */
    private JSONObject m22013b(JSONObject jSONObject, long j) {
        try {
            if (DataSpliter.m22070a(jSONObject) <= j) {
                return jSONObject;
            }
            UMStoreManager.m21939a(f17156a).mo19094a(true, false);
            UMStoreManager.m21939a(f17156a).mo19098b();
            UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "--->>> Instant session packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: b */
    public JSONObject mo19140b(boolean z) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        String str = "userlevel";
        String str2 = UContent.f16946u;
        String str3 = UContent.f16939n;
        String str4 = UContent.f16945t;
        JSONObject jSONObject = null;
        try {
            jSONObject = UMStoreManager.m21939a(f17156a).mo19090a(z);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            } else if (jSONObject.has(str3)) {
                JSONArray jSONArray3 = jSONObject.getJSONArray(str3);
                JSONArray jSONArray4 = new JSONArray();
                int i = 0;
                while (i < jSONArray3.length()) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray3.get(i);
                    JSONArray optJSONArray = jSONObject2.optJSONArray(str4);
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray(str2);
                    if (optJSONArray == null && optJSONArray2 != null) {
                        jSONObject2.put(str4, optJSONArray2);
                        jSONObject2.remove(str2);
                    }
                    String str5 = UContent.f16949x;
                    if (!(optJSONArray == null || optJSONArray2 == null)) {
                        ArrayList<JSONObject> arrayList = new ArrayList<>();
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            arrayList.add((JSONObject) optJSONArray.get(i2));
                        }
                        for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                            arrayList.add((JSONObject) optJSONArray2.get(i3));
                        }
                        JSONArraySortUtil jSONArraySortUtil = new JSONArraySortUtil();
                        jSONArraySortUtil.setCompareKey(str5);
                        Collections.sort(arrayList, jSONArraySortUtil);
                        JSONArray jSONArray5 = new JSONArray();
                        for (JSONObject put : arrayList) {
                            jSONArray5.put(put);
                        }
                        jSONObject2.put(str4, jSONArray5);
                        jSONObject2.remove(str2);
                    }
                    boolean has = jSONObject2.has(str4);
                    String str6 = UContent.f16951z;
                    if (has) {
                        JSONArray optJSONArray3 = jSONObject2.optJSONArray(str4);
                        int i4 = 0;
                        while (i4 < optJSONArray3.length()) {
                            JSONObject jSONObject3 = optJSONArray3.getJSONObject(i4);
                            if (jSONObject3.has(str5)) {
                                jSONArray2 = jSONArray3;
                                jSONObject3.put("ts", jSONObject3.getLong(str5));
                                jSONObject3.remove(str5);
                            } else {
                                jSONArray2 = jSONArray3;
                            }
                            i4++;
                            jSONArray3 = jSONArray2;
                        }
                        jSONArray = jSONArray3;
                        jSONObject2.put(str4, optJSONArray3);
                        jSONObject2.put(str6, optJSONArray3.length());
                    } else {
                        jSONArray = jSONArray3;
                        jSONObject2.put(str6, 0);
                    }
                    jSONArray4.put(jSONObject2);
                    i++;
                    jSONArray3 = jSONArray;
                }
                jSONObject.put(str3, jSONArray4);
            }
        } catch (Exception e) {
            MLog.m22443e("merge pages error");
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17156a);
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put(str, string);
            }
        }
        String[] a = InternalConfig.m21471a(f17156a);
        if (a != null && !TextUtils.isEmpty(a[0]) && !TextUtils.isEmpty(a[1])) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(UContent.f16878M, a[0]);
            jSONObject4.put(UContent.f16879N, a[1]);
            if (jSONObject4.length() > 0) {
                jSONObject.put(UContent.f16877L, jSONObject4);
            }
        }
        if (ABTest.getService(f17156a).isInTest()) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(ABTest.getService(f17156a).getTestName(), ABTest.getService(f17156a).getGroupInfo());
            jSONObject.put(UContent.f16876K, jSONObject5);
        }
        DefconProcesser.m22072a().mo19162a(jSONObject, f17156a);
        return jSONObject;
    }

    /* renamed from: e */
    public void mo19148e() {
        if (m22018d(false)) {
            m22029j();
        }
    }

    /* renamed from: d */
    public void mo19147d(Object obj) {
        m22037r();
        m22032m();
        m22033n();
        mo19138a(true);
    }

    /* renamed from: d */
    private boolean m22018d(boolean z) {
        if (this.f17168b == null) {
            this.f17168b = new C3151c();
        }
        ReportStrategy c = this.f17168b.mo19154c();
        if (!(c instanceof DefconPolicy)) {
            return true;
        }
        if (z) {
            return ((DefconPolicy) c).shouldSendMessageByInstant();
        }
        return c.shouldSendMessage(false);
    }

    /* renamed from: b */
    public void mo19143b(Object obj) {
        String str = "exception";
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() <= 0) {
                    return;
                }
                if (!jSONObject.has(str)) {
                    m22022f(jSONObject);
                } else if (101 != jSONObject.getInt(str)) {
                    m22022f(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo19138a(boolean z) {
        if (m22016c(z)) {
            boolean z2 = this.f17168b.mo19154c() instanceof ReportQuasiRealtime;
            String str = UMRTLog.RTLOG_TAG;
            if (z2) {
                if (z) {
                    if (UMEnvelopeBuild.isOnline(f17156a)) {
                        UMRTLog.m22229i(str, "--->>> send session start in policy ReportQuasiRealtime.");
                        m22029j();
                    }
                } else if (UMEnvelopeBuild.isReadyBuild(f17156a, UMBusinessType.U_APP)) {
                    UMRTLog.m22229i(str, "--->>> send normal data in policy ReportQuasiRealtime.");
                    m22029j();
                }
            } else if (UMEnvelopeBuild.isReadyBuild(f17156a, UMBusinessType.U_APP)) {
                UMRTLog.m22229i(str, "--->>> constructMessage()");
                m22029j();
            }
        }
    }

    /* renamed from: b */
    public void mo19142b(Context context) {
        try {
            UMStoreManager.m21939a(context).mo19104d();
            m22036q();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private boolean m22011a(JSONArray jSONArray) {
        int length = jSONArray.length();
        List asList = Arrays.asList(new String[]{"$$_onUMengEnterForeground", "$$_onUMengEnterBackground", "$$_onUMengEnterForegroundInitError"});
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null && asList.contains(optJSONObject.optString("id"))) {
                    i++;
                }
            } catch (Throwable unused) {
            }
        }
        if (i >= length) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m22012a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("ekv");
        int length = optJSONArray.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                Iterator keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray((String) keys.next());
                    if (optJSONArray2 != null && m22011a(optJSONArray2)) {
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        if (i >= length) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject mo19133a(long j) {
        if (TextUtils.isEmpty(SessionIdManager.m22133a().mo19196d(f17156a))) {
            return null;
        }
        JSONObject b = mo19140b(false);
        int a = DefconProcesser.m22072a().mo19161a(f17156a);
        if (b.length() > 0) {
            int length = b.length();
            String str = "userlevel";
            String str2 = UContent.f16877L;
            if (length == 1) {
                if (b.optJSONObject(str2) != null && a != 3) {
                    return null;
                }
                if (!TextUtils.isEmpty(b.optString(str)) && a != 3) {
                    return null;
                }
            } else if (b.length() == 2 && b.optJSONObject(str2) != null && !TextUtils.isEmpty(b.optString(str)) && a != 3) {
                return null;
            }
            String optString = b.optString(UContent.f16939n);
            String optString2 = b.optString(UContent.f16885T);
            String optString3 = b.optString("ekv");
            if (TextUtils.isEmpty(optString) && TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && m22012a(b)) {
                return null;
            }
        } else if (a != 3) {
            return null;
        }
        JSONObject l = m22031l();
        if (l != null) {
            m22015c(l);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String str3 = "analytics";
            if (a == 3) {
                jSONObject2.put(str3, new JSONObject());
            } else if (b.length() > 0) {
                jSONObject2.put(str3, b);
            }
            if (l != null && l.length() > 0) {
                jSONObject.put("header", l);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("content", jSONObject2);
            }
            jSONObject = m22008a(jSONObject, j);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m22008a(JSONObject jSONObject, long j) {
        String str = "header";
        try {
            if (DataSpliter.m22070a(jSONObject) <= j) {
                return jSONObject;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            jSONObject2.put(UContent.f16894aB, DataSpliter.m22070a(jSONObject));
            jSONObject.put(str, jSONObject2);
            return DataSpliter.m22071a(f17156a, j, jSONObject);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    private boolean m22010a(long j, int i) {
        if (j == 0) {
            return true;
        }
        if (System.currentTimeMillis() - j > 28800000) {
            m22034o();
            return true;
        } else if (i < 5000) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public void mo19135a(Object obj) {
        String str = "exception";
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() <= 0) {
                    return;
                }
                if (!jSONObject.has(str)) {
                    m22025g(jSONObject);
                } else if (101 != jSONObject.getInt(str)) {
                    m22025g(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo19137a(Object obj, boolean z) {
        if (z) {
            if (m22018d(true)) {
                m22028i();
            }
        } else if (UMEnvelopeBuild.isOnline(f17156a) && m22018d(true)) {
            m22028i();
        }
    }
}
