package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMConstant;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.umeng.analytics.pro.x */
public class SessionIdManager {

    /* renamed from: c */
    private static volatile SessionIdManager f17260c;

    /* renamed from: a */
    private SessionIdGenerateService f17261a = new SessionIdGenerateServiceImpl();

    /* renamed from: b */
    private String f17262b;

    /* renamed from: d */
    private List<C3159a> f17263d;

    /* renamed from: e */
    private String f17264e;

    /* renamed from: com.umeng.analytics.pro.x$a */
    /* compiled from: SessionIdManager */
    public interface C3159a {
        /* renamed from: a */
        void mo19171a(String str, long j, long j2, long j3);

        /* renamed from: a */
        void mo19172a(String str, String str2, long j, long j2, long j3);
    }

    private SessionIdManager() {
    }

    /* renamed from: a */
    public static SessionIdManager m22133a() {
        if (f17260c == null) {
            synchronized (SessionIdManager.class) {
                if (f17260c == null) {
                    f17260c = new SessionIdManager();
                }
            }
        }
        return f17260c;
    }

    /* renamed from: f */
    private String m22135f(Context context) {
        Context context2 = context;
        try {
            Editor edit = PreferenceWrapper.getDefault(context).edit();
            edit.putString(SessionTracker.f17242d, mo19196d(context));
            edit.commit();
        } catch (Exception unused) {
        }
        long h = m22137h(context);
        long i = m22138i(context);
        String str = this.f17262b;
        long a = SessionTracker.m22096a(context);
        long j = a * 5000;
        StringBuilder sb = new StringBuilder();
        sb.append("--->>>*** 读取 foreground count 值完成，count次数：");
        sb.append(a);
        String sb2 = sb.toString();
        String str2 = UMRTLog.RTLOG_TAG;
        UMRTLog.m22228e(str2, sb2);
        if (!FieldManager.allow(UMConstant.f17887E)) {
            UMRTLog.m22228e(str2, "--->>>*** foreground count druation云控参数关闭。");
        } else if (UMWorkDispatch.eventHasExist()) {
            UMRTLog.m22228e(str2, "--->>>*** 读取 foreground count druation值完成，终止checker timer.");
            UMWorkDispatch.removeEvent();
        } else {
            UMRTLog.m22228e(str2, "--->>>*** 读取 foreground count druation值完成，无未处理check timer事件。");
        }
        long j2 = i;
        long j3 = h;
        long j4 = j;
        String str3 = str;
        m22134a(j2, j3, j4, str3, false);
        this.f17262b = this.f17261a.mo19184a(context2);
        m22134a(j2, j3, j4, str3, true);
        this.f17261a.mo19186a(context2, this.f17262b);
        return this.f17262b;
    }

    /* renamed from: g */
    private boolean m22136g(Context context) {
        if (!TextUtils.isEmpty(this.f17262b) && UMStoreManager.m21939a(context).mo19089a(this.f17262b) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private long m22137h(Context context) {
        return m22132a(context, SessionTracker.f17244f);
    }

    /* renamed from: i */
    private long m22138i(Context context) {
        return m22132a(context, SessionTracker.f17239a);
    }

    /* renamed from: j */
    private boolean m22139j(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(appContext);
            long j = sharedPreferences.getLong(SessionTracker.f17243e, 0);
            long j2 = sharedPreferences.getLong(SessionTracker.f17244f, 0);
            boolean allow = FieldManager.allow(UMConstant.f17887E);
            String str = UMRTLog.RTLOG_TAG;
            if (allow && j > 0 && j2 == 0) {
                long a = SessionTracker.m22096a(appContext);
                if (a > 0) {
                    long j3 = a * 5000;
                    UMRTLog.m22228e(str, "--->>> last session end time stamp = 0, reconstruct it by foreground count value.");
                    j2 = j + j3;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("--->>> interval of last session is: ");
            sb.append(j2 - j);
            UMRTLog.m22229i(str, sb.toString());
            return this.f17261a.mo19187a(j, j2);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public long mo19192b() {
        return this.f17261a.mo19183a();
    }

    /* renamed from: c */
    public String mo19195c(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        try {
            this.f17262b = m22135f(appContext);
        } catch (Exception unused) {
        }
        return this.f17262b;
    }

    /* renamed from: d */
    public String mo19196d(Context context) {
        if (TextUtils.isEmpty(this.f17262b)) {
            try {
                this.f17262b = PreferenceWrapper.getDefault(context).getString("session_id", null);
            } catch (Exception unused) {
            }
        }
        return this.f17262b;
    }

    /* renamed from: e */
    public boolean mo19197e(Context context) {
        if (TextUtils.isEmpty(this.f17262b)) {
            this.f17262b = mo19196d(context);
        }
        return TextUtils.isEmpty(this.f17262b) || m22139j(context) || m22136g(context);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001d */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String mo19193b(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.content.Context r2 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r2)     // Catch:{ all -> 0x0021 }
            if (r2 != 0) goto L_0x000b
            java.lang.String r2 = ""
            monitor-exit(r1)
            return r2
        L_0x000b:
            java.lang.String r0 = r1.mo19196d(r2)     // Catch:{ all -> 0x0021 }
            r1.f17262b = r0     // Catch:{ all -> 0x0021 }
            boolean r0 = r1.mo19197e(r2)     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001d
            java.lang.String r2 = r1.m22135f(r2)     // Catch:{ Exception -> 0x001d }
            r1.f17262b = r2     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.lang.String r2 = r1.f17262b     // Catch:{ all -> 0x0021 }
            monitor-exit(r1)
            return r2
        L_0x0021:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.SessionIdManager.mo19193b(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public void mo19190a(long j) {
        this.f17261a.mo19185a(j);
    }

    /* renamed from: a */
    public String mo19188a(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        String str = "";
        try {
            synchronized (SessionIdManager.class) {
                str = PreferenceWrapper.getDefault(appContext).getString(SessionTracker.f17242d, "");
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: b */
    public void mo19194b(C3159a aVar) {
        if (aVar != null) {
            List<C3159a> list = this.f17263d;
            if (list != null && list.size() != 0) {
                this.f17263d.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    public String mo19189a(Context context, long j) {
        if (TextUtils.isEmpty(this.f17264e)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SUB");
            sb.append(j);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("%0");
            sb4.append(32 - sb2.length());
            sb4.append("d");
            sb3.append(String.format(sb4.toString(), new Object[]{Integer.valueOf(0)}));
            this.f17264e = sb3.toString();
        }
        return this.f17264e;
    }

    /* renamed from: a */
    private long m22132a(Context context, String str) {
        long j;
        try {
            j = PreferenceWrapper.getDefault(context).getLong(str, 0);
        } catch (Exception unused) {
            j = 0;
        }
        return j <= 0 ? System.currentTimeMillis() : j;
    }

    /* renamed from: a */
    private void m22134a(long j, long j2, long j3, String str, boolean z) {
        List<C3159a> list = this.f17263d;
        if (list != null) {
            for (C3159a aVar : list) {
                if (z) {
                    try {
                        aVar.mo19172a(str, this.f17262b, j, j2, j3);
                    } catch (Exception unused) {
                    }
                } else {
                    aVar.mo19171a(this.f17262b, j, j2, j3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19191a(C3159a aVar) {
        if (aVar != null) {
            if (this.f17263d == null) {
                this.f17263d = new ArrayList();
            }
            if (!this.f17263d.contains(aVar)) {
                this.f17263d.add(aVar);
            }
        }
    }
}
