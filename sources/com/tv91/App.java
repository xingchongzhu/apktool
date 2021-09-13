package com.tv91;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import com.tv91.p213u.p221b.FileDownloadManager;
import com.tv91.p251w.CrashReportTree;
import com.tv91.p253y.SystemRepository;
import com.tv91.p255z.C3061b;
import com.tv91.utils.C3052g;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.MobclickAgent.PageMode;
import com.umeng.commonsdk.UMConfigure;
import p295h.p296a.Timber;

public class App extends Hilt_App {

    /* renamed from: b */
    C3061b f13604b;

    /* renamed from: c */
    SystemRepository f13605c;

    /* renamed from: d */
    FileDownloadManager f13606d;

    /* renamed from: e */
    private String f13607e;

    /* renamed from: f */
    private String f13608f;

    /* renamed from: g */
    private String f13609g;

    static {
        System.loadLibrary("arg");
    }

    /* renamed from: b */
    public static App m16679b(Context context) {
        if (context instanceof Activity) {
            return (App) ((Activity) context).getApplication();
        }
        if (context instanceof Service) {
            return (App) ((Service) context).getApplication();
        }
        return (App) context.getApplicationContext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (r3 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r4.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0053, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        if (r2 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005e, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0061, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0062, code lost:
        if (r1 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x006c, code lost:
        throw r3;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16680f() {
        /*
            r6 = this;
            com.tv91.y.e r0 = r6.f13605c
            int r0 = r0.mo18606c()
            r1 = -1
            if (r0 != r1) goto L_0x0072
            r0 = 0
            android.content.res.Resources r1 = r6.getResources()     // Catch:{ NotFoundException | IOException | NumberFormatException -> 0x006d }
            r2 = 2131820544(0x7f110000, float:1.9273806E38)
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch:{ NotFoundException | IOException | NumberFormatException -> 0x006d }
            f.s r2 = p281f.Okio.m23926i(r1)     // Catch:{ all -> 0x005f }
            f.e r3 = p281f.Okio.m23920c(r2)     // Catch:{ all -> 0x0051 }
            java.lang.String r4 = r3.mo20222r()     // Catch:{ all -> 0x0043 }
            boolean r5 = com.tv91.utils.C3052g.m20586g(r4)     // Catch:{ all -> 0x0043 }
            if (r5 != 0) goto L_0x0030
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x0043 }
            com.tv91.y.e r5 = r6.f13605c     // Catch:{ all -> 0x0043 }
            r5.mo18607d(r4)     // Catch:{ all -> 0x0043 }
            goto L_0x0035
        L_0x0030:
            com.tv91.y.e r4 = r6.f13605c     // Catch:{ all -> 0x0043 }
            r4.mo18607d(r0)     // Catch:{ all -> 0x0043 }
        L_0x0035:
            r3.close()     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x003d
            r2.close()     // Catch:{ all -> 0x005f }
        L_0x003d:
            if (r1 == 0) goto L_0x0072
            r1.close()     // Catch:{ NotFoundException | IOException | NumberFormatException -> 0x006d }
            goto L_0x0072
        L_0x0043:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r5 = move-exception
            if (r3 == 0) goto L_0x0050
            r3.close()     // Catch:{ all -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ all -> 0x0051 }
        L_0x0050:
            throw r5     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r4 = move-exception
            if (r2 == 0) goto L_0x005e
            r2.close()     // Catch:{ all -> 0x005a }
            goto L_0x005e
        L_0x005a:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ all -> 0x005f }
        L_0x005e:
            throw r4     // Catch:{ all -> 0x005f }
        L_0x005f:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r3 = move-exception
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ all -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ NotFoundException | IOException | NumberFormatException -> 0x006d }
        L_0x006c:
            throw r3     // Catch:{ NotFoundException | IOException | NumberFormatException -> 0x006d }
        L_0x006d:
            com.tv91.y.e r1 = r6.f13605c
            r1.mo18607d(r0)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tv91.App.m16680f():void");
    }

    private native String loadApiUrl();

    private native String loadBackupApiUrl();

    private native String loadDomainName();

    private native String loadUmengKey();

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public String mo16463c() {
        return this.f13607e;
    }

    /* renamed from: d */
    public String mo16464d() {
        return this.f13608f;
    }

    /* renamed from: e */
    public String mo16465e() {
        return this.f13609g;
    }

    public void onCreate() {
        this.f13607e = C3052g.m20585f(C3052g.m20580a(loadApiUrl()));
        this.f13608f = C3052g.m20585f(C3052g.m20580a(loadBackupApiUrl()));
        this.f13609g = C3052g.m20585f(C3052g.m20580a(loadDomainName()));
        super.onCreate();
        Timber.m24043e(new CrashReportTree());
        Thread.setDefaultUncaughtExceptionHandler(C2141a.f13614a);
        m16680f();
        UMConfigure.setLogEnabled(false);
        UMConfigure.setEncryptEnabled(true);
        UMConfigure.init(this, loadUmengKey(), "91WEB", 1, "");
        MobclickAgent.setPageCollectionMode(PageMode.LEGACY_MANUAL);
        this.f13606d.mo17426h(this);
    }
}
