package p281f;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: f.i */
public class ForwardingTimeout extends Timeout {

    /* renamed from: e */
    private Timeout f18759e;

    public ForwardingTimeout(Timeout tVar) {
        if (tVar != null) {
            this.f18759e = tVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public Timeout mo20259a() {
        return this.f18759e.mo20259a();
    }

    /* renamed from: b */
    public Timeout mo20260b() {
        return this.f18759e.mo20260b();
    }

    /* renamed from: c */
    public long mo20261c() {
        return this.f18759e.mo20261c();
    }

    /* renamed from: d */
    public Timeout mo20262d(long j) {
        return this.f18759e.mo20262d(j);
    }

    /* renamed from: e */
    public boolean mo20263e() {
        return this.f18759e.mo20263e();
    }

    /* renamed from: f */
    public void mo20264f() throws IOException {
        this.f18759e.mo20264f();
    }

    /* renamed from: g */
    public Timeout mo20265g(long j, TimeUnit timeUnit) {
        return this.f18759e.mo20265g(j, timeUnit);
    }

    /* renamed from: i */
    public final Timeout mo20266i() {
        return this.f18759e;
    }

    /* renamed from: j */
    public final ForwardingTimeout mo20267j(Timeout tVar) {
        if (tVar != null) {
            this.f18759e = tVar;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
