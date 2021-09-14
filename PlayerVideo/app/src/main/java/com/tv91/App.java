package com.tv91;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import com.tv91.p213u.p221b.FileDownloadManager;
import com.tv91.p253y.SystemRepository;
import com.tv91.p255z.C3061b;
import com.tv91.utils.FragmentUtils;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.MobclickAgent.PageMode;
import com.umeng.commonsdk.UMConfigure;

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
        System.loadLibrary("libarg");
        System.loadLibrary("libcrashsdk");
        System.loadLibrary("libumeng-spy");
    }
    /* renamed from: b */
    public static App getAppApplicationContext(Context context) {
        if (context instanceof Activity) {
            return (App) ((Activity) context).getApplication();
        }
        if (context instanceof Service) {
            return (App) ((Service) context).getApplication();
        }
        return (App) context.getApplicationContext();
    }

    private void m16680f() {

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
        this.f13607e = FragmentUtils.m20585f(FragmentUtils.m20580a(loadApiUrl()));
        this.f13608f = FragmentUtils.m20585f(FragmentUtils.m20580a(loadBackupApiUrl()));
        this.f13609g = FragmentUtils.m20585f(FragmentUtils.m20580a(loadDomainName()));
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(C2141a.f13614a);
        m16680f();
        UMConfigure.setLogEnabled(false);
        UMConfigure.setEncryptEnabled(true);
        UMConfigure.init(this, loadUmengKey(), "91WEB", 1, "");
        MobclickAgent.setPageCollectionMode(PageMode.LEGACY_MANUAL);
        this.f13606d.mo17426h(this);
    }
}
