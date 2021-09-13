package com.p259uc.crashsdk.p260a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: com.uc.crashsdk.a.f */
/* compiled from: ProGuard */
public class C3080f {

    /* renamed from: a */
    static final /* synthetic */ boolean f16269a = true;

    /* renamed from: b */
    private static volatile HandlerThread f16270b;

    /* renamed from: c */
    private static volatile HandlerThread f16271c;

    /* renamed from: d */
    private static volatile HandlerThread f16272d;

    /* renamed from: e */
    private static Handler f16273e;

    /* renamed from: f */
    private static Handler f16274f;

    /* renamed from: g */
    private static Handler f16275g;

    /* renamed from: h */
    private static Handler f16276h;

    /* renamed from: i */
    private static final HashMap<Object, Object[]> f16277i = new HashMap<>();

    /* renamed from: a */
    public static Handler m21009a(int i) {
        if (i == 0) {
            if (f16270b == null) {
                m21010a();
            }
            return f16273e;
        } else if (i == 1) {
            if (f16271c == null) {
                m21015b();
            }
            return f16274f;
        } else if (i == 2) {
            if (f16275g == null) {
                f16275g = new Handler(Looper.getMainLooper());
            }
            return f16275g;
        } else if (i == 3) {
            if (f16276h == null) {
                m21017c();
            }
            return f16276h;
        } else {
            StringBuilder sb = new StringBuilder("unknown thread type: ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: b */
    public static boolean m21016b(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return false;
        }
        HashMap<Object, Object[]> hashMap = f16277i;
        synchronized (hashMap) {
            objArr = (Object[]) hashMap.get(runnable);
        }
        if (objArr != null) {
            return f16269a;
        }
        return false;
    }

    /* renamed from: c */
    private static synchronized void m21017c() {
        synchronized (C3080f.class) {
            if (f16272d == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKAnrHandler", 0);
                f16272d = handlerThread;
                handlerThread.start();
                f16276h = new Handler(f16272d.getLooper());
            }
        }
    }

    /* renamed from: b */
    private static synchronized void m21015b() {
        synchronized (C3080f.class) {
            if (f16271c == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKNormalHandler", 0);
                f16271c = handlerThread;
                handlerThread.start();
                f16274f = new Handler(f16271c.getLooper());
            }
        }
    }

    /* renamed from: a */
    public static boolean m21014a(int i, Runnable runnable, long j) {
        if (runnable == null) {
            return false;
        }
        Handler a = m21009a(i);
        if (a == null) {
            return false;
        }
        C3079e eVar = new C3079e(10, new Object[]{runnable});
        HashMap<Object, Object[]> hashMap = f16277i;
        synchronized (hashMap) {
            hashMap.put(runnable, new Object[]{eVar, Integer.valueOf(i)});
        }
        return a.postDelayed(eVar, j);
    }

    /* renamed from: a */
    public static void m21011a(int i, Object[] objArr) {
        if (i != 10) {
            if (!f16269a) {
                throw new AssertionError();
            }
        } else if (f16269a || objArr != null) {
            Runnable runnable = objArr[0];
            HashMap<Object, Object[]> hashMap = f16277i;
            synchronized (hashMap) {
                if (hashMap.get(runnable) != null) {
                    hashMap.remove(runnable);
                }
            }
            runnable.run();
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public static boolean m21013a(int i, Runnable runnable) {
        return m21014a(i, runnable, 0);
    }

    /* renamed from: a */
    public static void m21012a(Runnable runnable) {
        Object[] objArr;
        if (runnable != null) {
            HashMap<Object, Object[]> hashMap = f16277i;
            synchronized (hashMap) {
                objArr = (Object[]) hashMap.get(runnable);
            }
            if (objArr != null) {
                int intValue = ((Integer) objArr[1]).intValue();
                Handler handler = null;
                if (intValue == 0) {
                    handler = f16273e;
                } else if (intValue == 1) {
                    handler = f16274f;
                } else if (intValue == 2) {
                    handler = f16275g;
                }
                if (handler != null) {
                    handler.removeCallbacks((Runnable) objArr[0]);
                }
                synchronized (hashMap) {
                    if (hashMap.get(runnable) != null) {
                        hashMap.remove(runnable);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static synchronized void m21010a() {
        synchronized (C3080f.class) {
            if (f16270b == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKBkgdHandler", 10);
                f16270b = handlerThread;
                handlerThread.start();
                f16273e = new Handler(f16270b.getLooper());
            }
        }
    }
}
