package p067c.p068a.p069a.p070a.p097j2;

/* renamed from: c.a.a.a.j2.p */
public class CompositeSequenceableLoader implements SequenceableLoader {

    /* renamed from: a */
    protected final SequenceableLoader[] f7605a;

    public CompositeSequenceableLoader(SequenceableLoader[] m0VarArr) {
        this.f7605a = m0VarArr;
    }

    /* renamed from: a */
    public boolean mo6806a() {
        for (SequenceableLoader a : this.f7605a) {
            if (a.mo6806a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final long mo6807b() {
        long j = Long.MAX_VALUE;
        for (SequenceableLoader b : this.f7605a) {
            long b2 = b.mo6807b();
            if (b2 != Long.MIN_VALUE) {
                j = Math.min(j, b2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: c */
    public final long mo6808c() {
        long j = Long.MAX_VALUE;
        for (SequenceableLoader c : this.f7605a) {
            long c2 = c.mo6808c();
            if (c2 != Long.MIN_VALUE) {
                j = Math.min(j, c2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: d */
    public boolean mo6809d(long j) {
        SequenceableLoader[] m0VarArr;
        long j2 = j;
        boolean z = false;
        while (true) {
            long b = mo6807b();
            if (b != Long.MIN_VALUE) {
                boolean z2 = false;
                for (SequenceableLoader m0Var : this.f7605a) {
                    long b2 = m0Var.mo6807b();
                    boolean z3 = b2 != Long.MIN_VALUE && b2 <= j2;
                    if (b2 == b || z3) {
                        z2 |= m0Var.mo6809d(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: e */
    public final void mo6810e(long j) {
        for (SequenceableLoader e : this.f7605a) {
            e.mo6810e(j);
        }
    }
}
