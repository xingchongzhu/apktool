package com.umeng.analytics.pro;

import com.umeng.analytics.AnalyticsConfig;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.umeng.analytics.pro.o */
public class CrashHandler implements UncaughtExceptionHandler {

    /* renamed from: a */
    private UncaughtExceptionHandler f17222a;

    /* renamed from: b */
    private OnAppCrashHandler f17223b;

    public CrashHandler() {
        if (Thread.getDefaultUncaughtExceptionHandler() != this) {
            this.f17222a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* renamed from: a */
    public void mo19159a(OnAppCrashHandler sVar) {
        this.f17223b = sVar;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        m22067a(th);
        UncaughtExceptionHandler uncaughtExceptionHandler = this.f17222a;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != Thread.getDefaultUncaughtExceptionHandler()) {
            this.f17222a.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    private void m22067a(Throwable th) {
        if (AnalyticsConfig.CATCH_EXCEPTION) {
            this.f17223b.mo18807a(th);
        } else {
            this.f17223b.mo18807a(null);
        }
    }
}
