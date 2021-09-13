package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.InternalAgent;
import com.umeng.analytics.pro.CoreProtocolImpl.C3149a;
import com.umeng.analytics.pro.SessionIdManager.C3159a;
import com.umeng.analytics.pro.UMDBConfig.C3134d.C3135a;
import com.umeng.analytics.pro.UMStoreManager.C3143a;
import com.umeng.analytics.process.UMProcessDBDatasSender;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMConstant;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.t */
public class SessionTracker implements C3159a {

    /* renamed from: a */
    public static final String f17239a = "session_start_time";

    /* renamed from: b */
    public static final String f17240b = "session_end_time";

    /* renamed from: c */
    public static final String f17241c = "session_id";

    /* renamed from: d */
    public static final String f17242d = "pre_session_id";

    /* renamed from: e */
    public static final String f17243e = "a_start_time";

    /* renamed from: f */
    public static final String f17244f = "a_end_time";

    /* renamed from: g */
    public static final String f17245g = "fg_count";

    /* renamed from: h */
    private static String f17246h = null;

    /* renamed from: i */
    private static Context f17247i = null;

    /* renamed from: j */
    private static boolean f17248j = false;

    /* renamed from: k */
    private static long f17249k = 0;

    /* renamed from: l */
    private static boolean f17250l = true;

    /* renamed from: m */
    private static long f17251m;

    /* renamed from: com.umeng.analytics.pro.t$a */
    /* compiled from: SessionTracker */
    private static class C3158a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final SessionTracker f17252a = new SessionTracker();

        private C3158a() {
        }
    }

    /* renamed from: a */
    public static SessionTracker m22097a() {
        return C3158a.f17252a;
    }

    /* renamed from: b */
    public static void m22100b(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17247i);
        if (sharedPreferences != null) {
            String str = f17245g;
            long j = sharedPreferences.getLong(str, 0);
            Editor edit = sharedPreferences.edit();
            if (edit != null) {
                edit.putLong(str, j + 1);
                edit.commit();
            }
        }
    }

    /* renamed from: d */
    private void m22101d(Context context) {
        try {
            Editor edit = PreferenceWrapper.getDefault(context).edit();
            edit.putLong(f17245g, 0);
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private String m22102e(Context context) {
        if (f17247i == null && context != null) {
            f17247i = context.getApplicationContext();
        }
        String d = SessionIdManager.m22133a().mo19196d(f17247i);
        try {
            m22103f(context);
            CoreProtocolImpl.m22007a(f17247i).mo19147d((Object) null);
        } catch (Throwable unused) {
        }
        return d;
    }

    /* renamed from: f */
    private void m22103f(Context context) {
        CoreProtocolImpl.m22007a(context).mo19142b(context);
        CoreProtocolImpl.m22007a(context).mo19146d();
    }

    /* renamed from: c */
    public void mo19179c(Context context, Object obj) {
        try {
            if (f17247i == null && context != null) {
                f17247i = context.getApplicationContext();
            }
            long longValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences != null) {
                if (sharedPreferences.getLong(f17243e, 0) == 0) {
                    MLog.m22443e("onPause called before onResume");
                } else {
                    Editor edit = sharedPreferences.edit();
                    String str = UMRTLog.RTLOG_TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("--->>> onEndSessionInternal: write activity end time = ");
                    sb.append(longValue);
                    UMRTLog.m22229i(str, sb.toString());
                    edit.putLong(f17244f, longValue);
                    edit.putLong(f17240b, longValue);
                    edit.commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    private SessionTracker() {
        SessionIdManager.m22133a().mo19191a((C3159a) this);
    }

    /* renamed from: a */
    public static long m22096a(Context context) {
        try {
            return PreferenceWrapper.getDefault(context).getLong(f17245g, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo19169a(Context context, long j) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17247i);
        if (sharedPreferences != null) {
            Editor edit = sharedPreferences.edit();
            if (edit != null) {
                edit.putLong(f17239a, j);
                edit.commit();
            }
        }
    }

    /* renamed from: b */
    public void mo19175b(Context context, Object obj) {
        long j;
        String str = UMRTLog.RTLOG_TAG;
        try {
            if (f17247i == null) {
                f17247i = UMGlobalContext.getAppContext(context);
            }
            if (obj == null) {
                j = System.currentTimeMillis();
            } else {
                j = ((Long) obj).longValue();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17247i);
            if (sharedPreferences != null) {
                f17249k = sharedPreferences.getLong(f17244f, 0);
                StringBuilder sb = new StringBuilder();
                sb.append("------>>> lastActivityEndTime: ");
                sb.append(f17249k);
                UMRTLog.m22229i(str, sb.toString());
                String string = sharedPreferences.getString(UContent.f16926az, "");
                String appVersionName = UMUtils.getAppVersionName(f17247i);
                Editor edit = sharedPreferences.edit();
                if (edit != null) {
                    boolean isEmpty = TextUtils.isEmpty(string);
                    String str2 = f17239a;
                    if (!isEmpty) {
                        if (!string.equals(appVersionName)) {
                            UMRTLog.m22229i(str, "--->>> requestNewInstantSessionIf: version upgrade");
                            edit.putLong(str2, j);
                            edit.commit();
                            CoreProtocolImpl.m22007a(f17247i).mo19137a((Object) null, true);
                            String c = SessionIdManager.m22133a().mo19195c(f17247i);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("--->>> force generate new session: session id = ");
                            sb2.append(c);
                            UMRTLog.m22229i(str, sb2.toString());
                            f17248j = true;
                            mo19168a(f17247i, j, true);
                            return;
                        }
                    }
                    if (SessionIdManager.m22133a().mo19197e(f17247i)) {
                        UMRTLog.m22229i(str, "--->>> More then 30 sec from last session.");
                        f17248j = true;
                        edit.putLong(str2, j);
                        edit.commit();
                        mo19168a(f17247i, j, false);
                    } else {
                        UMRTLog.m22229i(str, "--->>> less then 30 sec from last session, do nothing.");
                        f17248j = false;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo19170a(Context context, Object obj) {
        String str = "";
        String str2 = UContent.f16926az;
        try {
            if (f17247i == null && context != null) {
                f17247i = context.getApplicationContext();
            }
            long longValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17247i);
            if (sharedPreferences != null) {
                Editor edit = sharedPreferences.edit();
                if (edit != null) {
                    String string = sharedPreferences.getString(str2, str);
                    String appVersionName = UMUtils.getAppVersionName(f17247i);
                    boolean isEmpty = TextUtils.isEmpty(string);
                    String str3 = UMRTLog.RTLOG_TAG;
                    String str4 = "versioncode";
                    if (isEmpty) {
                        edit.putInt(str4, Integer.parseInt(UMUtils.getAppVersionCode(context)));
                        edit.putString(str2, appVersionName);
                        edit.commit();
                    } else if (!string.equals(appVersionName)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("--->>> onStartSessionInternal: upgrade version: ");
                        sb.append(string);
                        sb.append("-> ");
                        sb.append(appVersionName);
                        UMRTLog.m22229i(str3, sb.toString());
                        int i = sharedPreferences.getInt(str4, 0);
                        String string2 = sharedPreferences.getString("pre_date", str);
                        String string3 = sharedPreferences.getString("pre_version", str);
                        String string4 = sharedPreferences.getString(str2, str);
                        edit.putInt(str4, Integer.parseInt(UMUtils.getAppVersionCode(context)));
                        edit.putString(str2, appVersionName);
                        edit.putString("vers_date", string2);
                        edit.putString("vers_pre_version", string3);
                        edit.putString("cur_version", string4);
                        edit.putInt("vers_code", i);
                        edit.putString("vers_name", string);
                        edit.commit();
                        if (f17250l) {
                            f17250l = false;
                        }
                        if (f17248j) {
                            f17248j = false;
                            mo19176b(f17247i, longValue, true);
                            mo19174b(f17247i, longValue);
                        }
                        return;
                    }
                    if (f17248j) {
                        f17248j = false;
                        if (f17250l) {
                            f17250l = false;
                        }
                        f17246h = m22102e(context);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("创建新会话: ");
                        sb2.append(f17246h);
                        MLog.m22437d(sb2.toString());
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("mSessionChanged flag has been set, Start new session: ");
                        sb3.append(f17246h);
                        UMRTLog.m22229i(str3, sb3.toString());
                    } else {
                        f17246h = sharedPreferences.getString("session_id", null);
                        edit.putLong(f17243e, longValue);
                        edit.putLong(f17244f, 0);
                        edit.commit();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("延续上一个会话: ");
                        sb4.append(f17246h);
                        MLog.m22437d(sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Extend current session: ");
                        sb5.append(f17246h);
                        UMRTLog.m22229i(str3, sb5.toString());
                        if (f17250l) {
                            f17250l = false;
                            if (FieldManager.allow(UMConstant.f17887E)) {
                                Context context2 = f17247i;
                                UMWorkDispatch.sendEventEx(context2, C3149a.f17184C, CoreProtocol.getInstance(context2), null, 0);
                            }
                        }
                        m22103f(context);
                        CoreProtocolImpl.m22007a(f17247i).mo19138a(false);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public String mo19178c(Context context) {
        try {
            if (f17246h == null) {
                return PreferenceWrapper.getDefault(context).getString("session_id", null);
            }
        } catch (Throwable unused) {
        }
        return f17246h;
    }

    /* renamed from: c */
    public String mo19177c() {
        return mo19178c(f17247i);
    }

    /* renamed from: b */
    public boolean mo19176b(Context context, long j, boolean z) {
        long j2;
        boolean z2 = false;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null) {
                return false;
            }
            String a = SessionIdManager.m22133a().mo19188a(f17247i);
            if (a == null) {
                return false;
            }
            long j3 = sharedPreferences.getLong(f17243e, 0);
            long j4 = sharedPreferences.getLong(f17244f, 0);
            if (j3 > 0 && j4 == 0) {
                z2 = true;
                String str = UMRTLog.RTLOG_TAG;
                if (z) {
                    j2 = f17249k;
                    if (j2 == 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("------>>> lastActivityEndTime = 0, In-app upgrade, use currentTime: = ");
                        sb.append(j);
                        UMRTLog.m22229i(str, sb.toString());
                        j2 = j;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("------>>> lastActivityEndTime != 0, app upgrade, use lastActivityEndTime: = ");
                        sb2.append(f17249k);
                        UMRTLog.m22229i(str, sb2.toString());
                    }
                    mo19179c(f17247i, Long.valueOf(j2));
                } else {
                    mo19179c(f17247i, Long.valueOf(j));
                    j2 = j;
                }
                JSONObject jSONObject = new JSONObject();
                String str2 = C3135a.f17013g;
                if (z) {
                    jSONObject.put(str2, j2);
                } else {
                    jSONObject.put(str2, j);
                }
                JSONObject b = InternalAgent.m21414a().mo18810b();
                if (b != null && b.length() > 0) {
                    jSONObject.put("__sp", b);
                }
                JSONObject c = InternalAgent.m21414a().mo18815c();
                if (c != null && c.length() > 0) {
                    jSONObject.put("__pp", c);
                }
                boolean allow = FieldManager.allow(UMConstant.f17887E);
                String str3 = C3135a.f17014h;
                if (allow) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("--->>>*** foregroundCount = ");
                    sb3.append(f17251m);
                    UMRTLog.m22228e(str, sb3.toString());
                    jSONObject.put(str3, f17251m);
                    f17251m = 0;
                } else {
                    jSONObject.put(str3, 0);
                }
                UMStoreManager.m21939a(context).mo19096a(a, jSONObject, C3143a.END);
                CoreProtocolImpl.m22007a(f17247i).mo19148e();
            }
            return z2;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo19174b(Context context, long j) {
        if (PreferenceWrapper.getDefault(context) != null) {
            try {
                CoreProtocolImpl.m22007a(f17247i).mo19145c((Object) null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public String mo19168a(Context context, long j, boolean z) {
        String b = SessionIdManager.m22133a().mo19193b(context);
        StringBuilder sb = new StringBuilder();
        sb.append("--->>> onInstantSessionInternal: current session id = ");
        sb.append(b);
        UMRTLog.m22229i(UMRTLog.RTLOG_TAG, sb.toString());
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j);
            JSONObject b2 = InternalAgent.m21414a().mo18810b();
            if (b2 != null && b2.length() > 0) {
                jSONObject.put("__sp", b2);
            }
            JSONObject c = InternalAgent.m21414a().mo18815c();
            if (c != null && c.length() > 0) {
                jSONObject.put("__pp", c);
            }
            UMStoreManager.m21939a(context).mo19096a(b, jSONObject, C3143a.INSTANTSESSIONBEGIN);
            CoreProtocolImpl.m22007a(context).mo19137a((Object) jSONObject, z);
        } catch (Throwable unused) {
        }
        return b;
    }

    /* renamed from: b */
    public String mo19173b() {
        return f17246h;
    }

    /* renamed from: a */
    public void mo19172a(String str, String str2, long j, long j2, long j3) {
        m22098a(f17247i, str2, j, j2, j3);
        UMRTLog.m22229i(UMRTLog.RTLOG_TAG, "saveSessionToDB: complete");
        if (AnalyticsConstants.SUB_PROCESS_EVENT) {
            Context context = f17247i;
            UMWorkDispatch.sendEvent(context, UMProcessDBDatasSender.UM_PROCESS_EVENT_KEY, UMProcessDBDatasSender.getInstance(context), Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    public void mo19171a(String str, long j, long j2, long j3) {
        if (!TextUtils.isEmpty(str)) {
            m22099a(str, j);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0067 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082 A[Catch:{ Exception -> 0x0095 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22098a(android.content.Context r7, java.lang.String r8, long r9, long r11, long r13) {
        /*
            r6 = this;
            java.lang.String r0 = f17246h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0014
            com.umeng.analytics.pro.x r0 = com.umeng.analytics.pro.SessionIdManager.m22133a()
            android.content.Context r1 = f17247i
            java.lang.String r0 = r0.mo19188a(r1)
            f17246h = r0
        L_0x0014:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = f17246h
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0023
            goto L_0x0097
        L_0x0023:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0067 }
            r0.<init>()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = "__f"
            r0.put(r1, r11)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r11 = "__g"
            r0.put(r11, r13)     // Catch:{ Exception -> 0x0067 }
            com.umeng.analytics.b r11 = com.umeng.analytics.InternalAgent.m21414a()     // Catch:{ Exception -> 0x0067 }
            org.json.JSONObject r11 = r11.mo18810b()     // Catch:{ Exception -> 0x0067 }
            if (r11 == 0) goto L_0x0047
            int r12 = r11.length()     // Catch:{ Exception -> 0x0067 }
            if (r12 <= 0) goto L_0x0047
            java.lang.String r12 = "__sp"
            r0.put(r12, r11)     // Catch:{ Exception -> 0x0067 }
        L_0x0047:
            com.umeng.analytics.b r11 = com.umeng.analytics.InternalAgent.m21414a()     // Catch:{ Exception -> 0x0067 }
            org.json.JSONObject r11 = r11.mo18815c()     // Catch:{ Exception -> 0x0067 }
            if (r11 == 0) goto L_0x005c
            int r12 = r11.length()     // Catch:{ Exception -> 0x0067 }
            if (r12 <= 0) goto L_0x005c
            java.lang.String r12 = "__pp"
            r0.put(r12, r11)     // Catch:{ Exception -> 0x0067 }
        L_0x005c:
            com.umeng.analytics.pro.h r11 = com.umeng.analytics.pro.UMStoreManager.m21939a(r7)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r12 = f17246h     // Catch:{ Exception -> 0x0067 }
            com.umeng.analytics.pro.h$a r1 = com.umeng.analytics.pro.UMStoreManager.C3143a.END     // Catch:{ Exception -> 0x0067 }
            r11.mo19096a(r12, r0, r1)     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0095 }
            r11.<init>()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r12 = "__e"
            r11.put(r12, r9)     // Catch:{ Exception -> 0x0095 }
            com.umeng.analytics.pro.h r9 = com.umeng.analytics.pro.UMStoreManager.m21939a(r7)     // Catch:{ Exception -> 0x0095 }
            com.umeng.analytics.pro.h$a r10 = com.umeng.analytics.pro.UMStoreManager.C3143a.BEGIN     // Catch:{ Exception -> 0x0095 }
            r9.mo19096a(r8, r11, r10)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r9 = "header_foreground_count"
            boolean r9 = com.umeng.commonsdk.config.FieldManager.allow(r9)     // Catch:{ Exception -> 0x0095 }
            if (r9 == 0) goto L_0x0095
            f17251m = r13     // Catch:{ Exception -> 0x0095 }
            r6.m22101d(r7)     // Catch:{ Exception -> 0x0095 }
            android.content.Context r0 = f17247i     // Catch:{ Exception -> 0x0095 }
            r1 = 8213(0x2015, float:1.1509E-41)
            com.umeng.analytics.CoreProtocol r2 = com.umeng.analytics.CoreProtocol.getInstance(r0)     // Catch:{ Exception -> 0x0095 }
            r3 = 0
            r4 = 0
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEventEx(r0, r1, r2, r3, r4)     // Catch:{ Exception -> 0x0095 }
        L_0x0095:
            f17246h = r8
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.SessionTracker.m22098a(android.content.Context, java.lang.String, long, long, long):void");
    }

    /* renamed from: a */
    private void m22099a(String str, long j) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f17247i);
        if (sharedPreferences != null) {
            long j2 = sharedPreferences.getLong(f17240b, 0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("__ii", str);
                jSONObject.put("__e", j);
                jSONObject.put(C3135a.f17013g, j2);
                double[] location = AnalyticsConfig.getLocation();
                if (location != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(UContent.f16868C, location[0]);
                    jSONObject2.put(UContent.f16869D, location[1]);
                    jSONObject2.put("ts", System.currentTimeMillis());
                    jSONObject.put(C3135a.f17011e, jSONObject2);
                }
                Class cls = Class.forName("android.net.TrafficStats");
                Class cls2 = Integer.TYPE;
                Method method = cls.getMethod("getUidRxBytes", new Class[]{cls2});
                Method method2 = cls.getMethod("getUidTxBytes", new Class[]{cls2});
                int i = f17247i.getApplicationInfo().uid;
                if (i != -1) {
                    long longValue = ((Long) method.invoke(null, new Object[]{Integer.valueOf(i)})).longValue();
                    long longValue2 = ((Long) method2.invoke(null, new Object[]{Integer.valueOf(i)})).longValue();
                    if (longValue > 0) {
                        if (longValue2 > 0) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(UContent.f16873H, longValue);
                            jSONObject3.put(UContent.f16872G, longValue2);
                            jSONObject.put(C3135a.f17010d, jSONObject3);
                        }
                    }
                    UMStoreManager.m21939a(f17247i).mo19096a(str, jSONObject, C3143a.NEWSESSION);
                    ViewPageTracker.m22117a(f17247i);
                    AutoViewPageTracker.m21986c(f17247i);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
