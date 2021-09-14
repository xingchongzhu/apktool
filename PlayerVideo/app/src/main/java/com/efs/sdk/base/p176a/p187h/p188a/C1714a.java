package com.efs.sdk.base.p176a.p187h.p188a;

import android.os.HandlerThread;

/* renamed from: com.efs.sdk.base.a.h.a.a */
public final class C1714a {

    /* renamed from: a */
    public static HandlerThread f11394a;

    static {
        HandlerThread handlerThread = new HandlerThread("efs-base", 10);
        f11394a = handlerThread;
        handlerThread.start();
    }
}
