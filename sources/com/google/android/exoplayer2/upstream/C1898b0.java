package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.TraceUtil;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.upstream.b0 */
/* compiled from: Loader */
public final class C1898b0 {

    /* renamed from: a */
    public static final C1901c f12272a = m14995g(false, -9223372036854775807L);

    /* renamed from: b */
    public static final C1901c f12273b = m14995g(true, -9223372036854775807L);

    /* renamed from: c */
    public static final C1901c f12274c = new C1901c(2, -9223372036854775807L);

    /* renamed from: d */
    public static final C1901c f12275d = new C1901c(3, -9223372036854775807L);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ExecutorService f12276e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1902d<? extends C1903e> f12277f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public IOException f12278g;

    /* renamed from: com.google.android.exoplayer2.upstream.b0$b */
    /* compiled from: Loader */
    public interface C1900b<T extends C1903e> {
        /* renamed from: j */
        void mo6889j(T t, long j, long j2, boolean z);

        /* renamed from: p */
        C1901c mo6891p(T t, long j, long j2, IOException iOException, int i);

        /* renamed from: r */
        void mo6892r(T t, long j, long j2);
    }

    /* renamed from: com.google.android.exoplayer2.upstream.b0$c */
    /* compiled from: Loader */
    public static final class C1901c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f12279a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f12280b;

        /* renamed from: c */
        public boolean mo14903c() {
            int i = this.f12279a;
            return i == 0 || i == 1;
        }

        private C1901c(int i, long j) {
            this.f12279a = i;
            this.f12280b = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.upstream.b0$d */
    /* compiled from: Loader */
    private final class C1902d<T extends C1903e> extends Handler implements Runnable {

        /* renamed from: a */
        public final int f12281a;

        /* renamed from: b */
        private final T f12282b;

        /* renamed from: c */
        private final long f12283c;

        /* renamed from: d */
        private C1900b<T> f12284d;

        /* renamed from: e */
        private IOException f12285e;

        /* renamed from: f */
        private int f12286f;

        /* renamed from: g */
        private Thread f12287g;

        /* renamed from: h */
        private boolean f12288h;

        /* renamed from: i */
        private volatile boolean f12289i;

        public C1902d(Looper looper, T t, C1900b<T> bVar, int i, long j) {
            super(looper);
            this.f12282b = t;
            this.f12284d = bVar;
            this.f12281a = i;
            this.f12283c = j;
        }

        /* renamed from: b */
        private void m15011b() {
            this.f12285e = null;
            C1898b0.this.f12276e.execute((Runnable) Assertions.m10153e(C1898b0.this.f12277f));
        }

        /* renamed from: c */
        private void m15012c() {
            C1898b0.this.f12277f = null;
        }

        /* renamed from: d */
        private long m15013d() {
            return (long) Math.min((this.f12286f - 1) * 1000, 5000);
        }

        /* renamed from: a */
        public void mo14904a(boolean z) {
            this.f12289i = z;
            this.f12285e = null;
            if (hasMessages(0)) {
                this.f12288h = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f12288h = true;
                    this.f12282b.mo6895c();
                    Thread thread = this.f12287g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                m15012c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((C1900b) Assertions.m10153e(this.f12284d)).mo6889j(this.f12282b, elapsedRealtime, elapsedRealtime - this.f12283c, true);
                this.f12284d = null;
            }
        }

        /* renamed from: e */
        public void mo14905e(int i) throws IOException {
            IOException iOException = this.f12285e;
            if (iOException != null && this.f12286f > i) {
                throw iOException;
            }
        }

        /* renamed from: f */
        public void mo14906f(long j) {
            Assertions.m10154f(C1898b0.this.f12277f == null);
            C1898b0.this.f12277f = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m15011b();
            }
        }

        public void handleMessage(Message message) {
            long j;
            if (!this.f12289i) {
                int i = message.what;
                if (i == 0) {
                    m15011b();
                } else if (i != 3) {
                    m15012c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.f12283c;
                    C1900b bVar = (C1900b) Assertions.m10153e(this.f12284d);
                    if (this.f12288h) {
                        bVar.mo6889j(this.f12282b, elapsedRealtime, j2, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        try {
                            bVar.mo6892r(this.f12282b, elapsedRealtime, j2);
                        } catch (RuntimeException e) {
                            Log.m10382d("LoadTask", "Unexpected exception handling load completed", e);
                            C1898b0.this.f12278g = new C1906h(e);
                        }
                    } else if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f12285e = iOException;
                        int i3 = this.f12286f + 1;
                        this.f12286f = i3;
                        C1901c p = bVar.mo6891p(this.f12282b, elapsedRealtime, j2, iOException, i3);
                        if (p.f12279a == 3) {
                            C1898b0.this.f12278g = this.f12285e;
                        } else if (p.f12279a != 2) {
                            if (p.f12279a == 1) {
                                this.f12286f = 1;
                            }
                            if (p.f12280b != -9223372036854775807L) {
                                j = p.f12280b;
                            } else {
                                j = m15013d();
                            }
                            mo14906f(j);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f12288h;
                    this.f12287g = Thread.currentThread();
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("load:");
                    sb.append(this.f12282b.getClass().getSimpleName());
                    TraceUtil.m10216a(sb.toString());
                    this.f12282b.mo6893a();
                    TraceUtil.m10218c();
                }
                synchronized (this) {
                    this.f12287g = null;
                    Thread.interrupted();
                }
                if (!this.f12289i) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.f12289i) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Exception e2) {
                Log.m10382d("LoadTask", "Unexpected exception loading stream", e2);
                if (!this.f12289i) {
                    obtainMessage(2, new C1906h(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                Log.m10382d("LoadTask", "OutOfMemory error loading stream", e3);
                if (!this.f12289i) {
                    obtainMessage(2, new C1906h(e3)).sendToTarget();
                }
            } catch (Error e4) {
                Log.m10382d("LoadTask", "Unexpected error loading stream", e4);
                if (!this.f12289i) {
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                TraceUtil.m10218c();
                throw th;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.b0$e */
    /* compiled from: Loader */
    public interface C1903e {
        /* renamed from: a */
        void mo6893a() throws IOException;

        /* renamed from: c */
        void mo6895c();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.b0$f */
    /* compiled from: Loader */
    public interface C1904f {
        /* renamed from: i */
        void mo6888i();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.b0$g */
    /* compiled from: Loader */
    private static final class C1905g implements Runnable {

        /* renamed from: a */
        private final C1904f f12291a;

        public C1905g(C1904f fVar) {
            this.f12291a = fVar;
        }

        public void run() {
            this.f12291a.mo6888i();
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.b0$h */
    /* compiled from: Loader */
    public static final class C1906h extends IOException {
        public C1906h(Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            sb.append(": ");
            sb.append(th.getMessage());
            super(sb.toString(), th);
        }
    }

    public C1898b0(String str) {
        this.f12276e = Util.m10312r0(str);
    }

    /* renamed from: g */
    public static C1901c m14995g(boolean z, long j) {
        return new C1901c(z ? 1 : 0, j);
    }

    /* renamed from: e */
    public void mo14894e() {
        ((C1902d) Assertions.m10156h(this.f12277f)).mo14904a(false);
    }

    /* renamed from: f */
    public void mo14895f() {
        this.f12278g = null;
    }

    /* renamed from: h */
    public boolean mo14896h() {
        return this.f12278g != null;
    }

    /* renamed from: i */
    public boolean mo14897i() {
        return this.f12277f != null;
    }

    /* renamed from: j */
    public void mo14898j() throws IOException {
        mo14899k(Integer.MIN_VALUE);
    }

    /* renamed from: k */
    public void mo14899k(int i) throws IOException {
        IOException iOException = this.f12278g;
        if (iOException == null) {
            C1902d<? extends C1903e> dVar = this.f12277f;
            if (dVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = dVar.f12281a;
                }
                dVar.mo14905e(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: l */
    public void mo14900l() {
        mo14901m(null);
    }

    /* renamed from: m */
    public void mo14901m(C1904f fVar) {
        C1902d<? extends C1903e> dVar = this.f12277f;
        if (dVar != null) {
            dVar.mo14904a(true);
        }
        if (fVar != null) {
            this.f12276e.execute(new C1905g(fVar));
        }
        this.f12276e.shutdown();
    }

    /* renamed from: n */
    public <T extends C1903e> long mo14902n(T t, C1900b<T> bVar, int i) {
        Looper looper = (Looper) Assertions.m10156h(Looper.myLooper());
        this.f12278g = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C1902d dVar = new C1902d(looper, t, bVar, i, elapsedRealtime);
        dVar.mo14906f(0);
        return elapsedRealtime;
    }
}
