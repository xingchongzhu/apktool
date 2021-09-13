package p281f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: f.t */
public class Timeout {

    /* renamed from: a */
    public static final Timeout f18792a = new C3387a();

    /* renamed from: b */
    private boolean f18793b;

    /* renamed from: c */
    private long f18794c;

    /* renamed from: d */
    private long f18795d;

    /* renamed from: f.t$a */
    /* compiled from: Timeout */
    class C3387a extends Timeout {
        C3387a() {
        }

        /* renamed from: d */
        public Timeout mo20262d(long j) {
            return this;
        }

        /* renamed from: f */
        public void mo20264f() throws IOException {
        }

        /* renamed from: g */
        public Timeout mo20265g(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    /* renamed from: a */
    public Timeout mo20259a() {
        this.f18793b = false;
        return this;
    }

    /* renamed from: b */
    public Timeout mo20260b() {
        this.f18795d = 0;
        return this;
    }

    /* renamed from: c */
    public long mo20261c() {
        if (this.f18793b) {
            return this.f18794c;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public Timeout mo20262d(long j) {
        this.f18793b = true;
        this.f18794c = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo20263e() {
        return this.f18793b;
    }

    /* renamed from: f */
    public void mo20264f() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f18793b && this.f18794c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public Timeout mo20265g(long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("timeout < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            this.f18795d = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: h */
    public long mo20287h() {
        return this.f18795d;
    }
}
