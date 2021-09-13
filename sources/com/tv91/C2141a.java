package com.tv91;

import java.lang.Thread.UncaughtExceptionHandler;
import p295h.p296a.Timber;

/* renamed from: com.tv91.a */
/* compiled from: lambda */
public final /* synthetic */ class C2141a implements UncaughtExceptionHandler {

    /* renamed from: a */
    public static final /* synthetic */ C2141a f13614a = new C2141a();

    private /* synthetic */ C2141a() {
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Timber.m24045g(th);
    }
}
