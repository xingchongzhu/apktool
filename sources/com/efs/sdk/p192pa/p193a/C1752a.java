package com.efs.sdk.p192pa.p193a;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.efs.sdk.p192pa.PAANRListener;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.efs.sdk.pa.a.a */
public final class C1752a {

    /* renamed from: a */
    volatile boolean f11451a;

    /* renamed from: b */
    final Handler f11452b;

    /* renamed from: c */
    final Thread f11453c;

    /* renamed from: d */
    long f11454d;

    /* renamed from: e */
    long f11455e;

    /* renamed from: f */
    boolean f11456f;

    /* renamed from: g */
    Handler f11457g;

    /* renamed from: h */
    PAANRListener f11458h;

    /* renamed from: i */
    long f11459i;

    /* renamed from: j */
    long f11460j;

    /* renamed from: k */
    final long f11461k;

    /* renamed from: l */
    boolean f11462l;

    /* renamed from: m */
    final Runnable f11463m;

    /* renamed from: n */
    final Runnable f11464n;

    /* renamed from: o */
    private HandlerThread f11465o;

    /* renamed from: p */
    private Application f11466p;

    public C1752a(Application application, long j) {
        this(application, j, true);
    }

    /* renamed from: a */
    static boolean m14339a(StringBuilder sb) {
        Set<Entry> entrySet = Thread.getAllStackTraces().entrySet();
        if (entrySet.size() == 0) {
            return false;
        }
        boolean z = false;
        for (Entry entry : entrySet) {
            Thread thread = (Thread) entry.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            String str = "  at  ";
            String str2 = "\n";
            String str3 = " ";
            if (thread.getId() == Looper.getMainLooper().getThread().getId()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(thread.getName());
                sb2.append(str3);
                sb2.append(thread.getPriority());
                sb2.append(str3);
                sb2.append(thread.getState());
                sb2.append(str2);
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    String stackTraceElement2 = stackTraceElement.toString();
                    sb2.append(str);
                    sb2.append(stackTraceElement2);
                    sb2.append(10);
                }
                sb2.append(str2);
                sb.insert(0, sb2);
                z = true;
            } else {
                sb.append(thread.getName());
                sb.append(str3);
                sb.append(thread.getPriority());
                sb.append(str3);
                sb.append(thread.getState());
                sb.append(str2);
                for (StackTraceElement stackTraceElement3 : stackTraceElementArr) {
                    String stackTraceElement4 = stackTraceElement3.toString();
                    sb.append(str);
                    sb.append(stackTraceElement4);
                    sb.append(10);
                }
                sb.append(str2);
            }
        }
        if (!z) {
            sb.insert(0, m14338a(Looper.getMainLooper().getThread()));
        }
        return true;
    }

    public C1752a(Application application, long j, boolean z) {
        this.f11451a = true;
        this.f11455e = 4;
        this.f11456f = true;
        this.f11459i = 0;
        this.f11463m = new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
                if (com.efs.sdk.p192pa.p193a.C1752a.m14339a(r1) != false) goto L_0x006e;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.p192pa.p193a.C1752a.this
                    boolean r0 = r0.f11456f
                    if (r0 == 0) goto L_0x0007
                    return
                L_0x0007:
                    long r0 = android.os.SystemClock.uptimeMillis()
                    com.efs.sdk.pa.a.a r2 = com.efs.sdk.p192pa.p193a.C1752a.this
                    long r3 = r2.f11460j
                    long r0 = r0 - r3
                    long r3 = r2.f11461k
                    int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                    if (r5 <= 0) goto L_0x0021
                    com.efs.sdk.pa.PAANRListener r2 = r2.f11458h
                    if (r2 == 0) goto L_0x0021
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    r2.unexcept(r0)
                L_0x0021:
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.p192pa.p193a.C1752a.this
                    boolean r0 = r0.f11451a
                    if (r0 == 0) goto L_0x003a
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.p192pa.p193a.C1752a.this
                    r1 = 0
                    r0.f11459i = r1
                    r1 = 0
                    r0.f11451a = r1
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.p192pa.p193a.C1752a.this
                    android.os.Handler r1 = r0.f11452b
                    java.lang.Runnable r0 = r0.f11464n
                    r1.postAtFrontOfQueue(r0)
                    goto L_0x0081
                L_0x003a:
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.p192pa.p193a.C1752a.this
                    long r1 = r0.f11459i
                    r3 = 1
                    long r1 = r1 + r3
                    r0.f11459i = r1
                    boolean r0 = r0.f11451a
                    if (r0 != 0) goto L_0x0081
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.p192pa.p193a.C1752a.this
                    long r1 = r0.f11459i
                    long r3 = r0.f11455e
                    int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r5 < 0) goto L_0x0081
                    int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r5 != 0) goto L_0x0081
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    boolean r2 = r0.f11462l
                    if (r2 == 0) goto L_0x0068
                    java.lang.Thread r2 = r0.f11453c
                    java.lang.String r2 = com.efs.sdk.p192pa.p193a.C1752a.m14338a(r2)
                    r1.append(r2)
                    goto L_0x006e
                L_0x0068:
                    boolean r2 = com.efs.sdk.p192pa.p193a.C1752a.m14339a(r1)
                    if (r2 == 0) goto L_0x0081
                L_0x006e:
                    com.efs.sdk.pa.PAANRListener r2 = r0.f11458h
                    if (r2 == 0) goto L_0x0081
                    int r2 = r1.length()
                    if (r2 <= 0) goto L_0x0081
                    com.efs.sdk.pa.PAANRListener r0 = r0.f11458h
                    java.lang.String r1 = r1.toString()
                    r0.anrStack(r1)
                L_0x0081:
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.p192pa.p193a.C1752a.this
                    long r1 = android.os.SystemClock.uptimeMillis()
                    r0.f11460j = r1
                    com.efs.sdk.pa.a.a r0 = com.efs.sdk.p192pa.p193a.C1752a.this
                    android.os.Handler r1 = r0.f11457g
                    java.lang.Runnable r2 = r0.f11463m
                    long r3 = r0.f11454d
                    r1.postDelayed(r2, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.p192pa.p193a.C1752a.C17531.run():void");
            }
        };
        this.f11464n = new Runnable() {
            public final void run() {
                C1752a.this.f11451a = true;
            }
        };
        this.f11461k = j;
        this.f11466p = application;
        this.f11462l = z;
        long j2 = ((long) (((float) j) * 0.8f)) / this.f11455e;
        this.f11454d = j2;
        if (j2 < 100) {
            this.f11454d = 100;
            this.f11455e = j / 100;
        }
        StringBuilder sb = new StringBuilder("anrTrace, final mAnrBeatTime:");
        sb.append(this.f11454d);
        sb.append(", mAnrBeatRate:");
        sb.append(this.f11454d);
        Log.i("Matrix.AnrTracer", sb.toString());
        this.f11453c = Looper.getMainLooper().getThread();
        this.f11452b = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("ANR HANDLER THREAD");
        this.f11465o = handlerThread;
        handlerThread.start();
        this.f11457g = new Handler(this.f11465o.getLooper());
    }

    /* renamed from: a */
    static String m14338a(Thread thread) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        sb.append(thread.getName());
        String str = " ";
        sb.append(str);
        sb.append(thread.getPriority());
        sb.append(str);
        sb.append(thread.getState());
        String str2 = "\n";
        sb.append(str2);
        for (StackTraceElement stackTraceElement : stackTrace) {
            String stackTraceElement2 = stackTraceElement.toString();
            sb.append("  at  ");
            sb.append(stackTraceElement2);
            sb.append(10);
        }
        sb.append(str2);
        return sb.toString();
    }
}
