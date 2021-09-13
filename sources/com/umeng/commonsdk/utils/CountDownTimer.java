package com.umeng.commonsdk.utils;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.umeng.commonsdk.utils.a */
public abstract class CountDownTimer {

    /* renamed from: e */
    private static final int f17874e = 1;

    /* renamed from: a */
    private final long f17875a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f17876b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f17877c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f17878d = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public HandlerThread f17879f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Handler f17880g;

    /* renamed from: h */
    private Callback f17881h = new Callback() {
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
            return false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r9) {
            /*
                r8 = this;
                com.umeng.commonsdk.utils.a r9 = com.umeng.commonsdk.utils.CountDownTimer.this
                monitor-enter(r9)
                com.umeng.commonsdk.utils.a r0 = com.umeng.commonsdk.utils.CountDownTimer.this     // Catch:{ all -> 0x008b }
                boolean r0 = r0.f17878d     // Catch:{ all -> 0x008b }
                r1 = 1
                if (r0 == 0) goto L_0x000e
                monitor-exit(r9)     // Catch:{ all -> 0x008b }
                return r1
            L_0x000e:
                com.umeng.commonsdk.utils.a r0 = com.umeng.commonsdk.utils.CountDownTimer.this     // Catch:{ all -> 0x008b }
                long r2 = r0.f17877c     // Catch:{ all -> 0x008b }
                long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x008b }
                long r2 = r2 - r4
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L_0x0036
                com.umeng.commonsdk.utils.a r0 = com.umeng.commonsdk.utils.CountDownTimer.this     // Catch:{ all -> 0x008b }
                r0.mo19591c()     // Catch:{ all -> 0x008b }
                com.umeng.commonsdk.utils.a r0 = com.umeng.commonsdk.utils.CountDownTimer.this     // Catch:{ all -> 0x008b }
                android.os.HandlerThread r0 = r0.f17879f     // Catch:{ all -> 0x008b }
                if (r0 == 0) goto L_0x0088
                com.umeng.commonsdk.utils.a r0 = com.umeng.commonsdk.utils.CountDownTimer.this     // Catch:{ all -> 0x008b }
                android.os.HandlerThread r0 = r0.f17879f     // Catch:{ all -> 0x008b }
                r0.quit()     // Catch:{ all -> 0x008b }
                goto L_0x0088
            L_0x0036:
                com.umeng.commonsdk.utils.a r0 = com.umeng.commonsdk.utils.CountDownTimer.this     // Catch:{ all -> 0x008b }
                long r6 = r0.f17876b     // Catch:{ all -> 0x008b }
                int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r0 >= 0) goto L_0x0054
                com.umeng.commonsdk.utils.a r0 = com.umeng.commonsdk.utils.CountDownTimer.this     // Catch:{ all -> 0x008b }
                android.os.Handler r0 = r0.f17880g     // Catch:{ all -> 0x008b }
                com.umeng.commonsdk.utils.a r4 = com.umeng.commonsdk.utils.CountDownTimer.this     // Catch:{ all -> 0x008b }
                android.os.Handler r4 = r4.f17880g     // Catch:{ all -> 0x008b }
                android.os.Message r1 = r4.obtainMessage(r1)     // Catch:{ all -> 0x008b }
                r0.sendMessageDelayed(r1, r2)     // Catch:{ all -> 0x008b }
                goto L_0x0088
            L_0x0054:
                long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x008b }
                com.umeng.commonsdk.utils.a r0 = com.umeng.commonsdk.utils.CountDownTimer.this     // Catch:{ all -> 0x008b }
                r0.mo19589a(r2)     // Catch:{ all -> 0x008b }
                com.umeng.commonsdk.utils.a r0 = com.umeng.commonsdk.utils.CountDownTimer.this     // Catch:{ all -> 0x008b }
                long r2 = r0.f17876b     // Catch:{ all -> 0x008b }
                long r6 = r6 + r2
                long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x008b }
                long r6 = r6 - r2
            L_0x0069:
                int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r0 >= 0) goto L_0x0075
                com.umeng.commonsdk.utils.a r0 = com.umeng.commonsdk.utils.CountDownTimer.this     // Catch:{ all -> 0x008b }
                long r2 = r0.f17876b     // Catch:{ all -> 0x008b }
                long r6 = r6 + r2
                goto L_0x0069
            L_0x0075:
                com.umeng.commonsdk.utils.a r0 = com.umeng.commonsdk.utils.CountDownTimer.this     // Catch:{ all -> 0x008b }
                android.os.Handler r0 = r0.f17880g     // Catch:{ all -> 0x008b }
                com.umeng.commonsdk.utils.a r2 = com.umeng.commonsdk.utils.CountDownTimer.this     // Catch:{ all -> 0x008b }
                android.os.Handler r2 = r2.f17880g     // Catch:{ all -> 0x008b }
                android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ all -> 0x008b }
                r0.sendMessageDelayed(r1, r6)     // Catch:{ all -> 0x008b }
            L_0x0088:
                monitor-exit(r9)     // Catch:{ all -> 0x008b }
                r9 = 0
                return r9
            L_0x008b:
                r0 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x008b }
                goto L_0x008f
            L_0x008e:
                throw r0
            L_0x008f:
                goto L_0x008e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.CountDownTimer.C32751.handleMessage(android.os.Message):boolean");
        }
    };

    public CountDownTimer(long j, long j2) {
        this.f17875a = j;
        this.f17876b = j2;
        if (!m22857d()) {
            HandlerThread handlerThread = new HandlerThread("CountDownTimerThread");
            this.f17879f = handlerThread;
            handlerThread.start();
            this.f17880g = new Handler(this.f17879f.getLooper(), this.f17881h);
            return;
        }
        this.f17880g = new Handler(this.f17881h);
    }

    /* renamed from: a */
    public abstract void mo19589a(long j);

    /* renamed from: c */
    public abstract void mo19591c();

    /* renamed from: d */
    private boolean m22857d() {
        return Looper.getMainLooper().getThread().equals(Thread.currentThread());
    }

    /* renamed from: a */
    public final synchronized void mo19588a() {
        this.f17878d = true;
        this.f17880g.removeMessages(1);
    }

    /* renamed from: b */
    public final synchronized CountDownTimer mo19590b() {
        this.f17878d = false;
        if (this.f17875a <= 0) {
            mo19591c();
            return this;
        }
        this.f17877c = SystemClock.elapsedRealtime() + this.f17875a;
        Handler handler = this.f17880g;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }
}
