package p067c.p068a.p069a.p070a;

import android.util.Pair;
import p067c.p068a.p069a.p070a.Timeline.C1256b;
import p067c.p068a.p069a.p070a.Timeline.C1257c;
import p067c.p068a.p069a.p070a.p097j2.ShuffleOrder;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.d0 */
public abstract class AbstractConcatenatedTimeline extends Timeline {

    /* renamed from: b */
    private final int f5774b;

    /* renamed from: c */
    private final ShuffleOrder f5775c;

    /* renamed from: d */
    private final boolean f5776d;

    public AbstractConcatenatedTimeline(boolean z, ShuffleOrder n0Var) {
        this.f5776d = z;
        this.f5775c = n0Var;
        this.f5774b = n0Var.mo6958a();
    }

    /* renamed from: B */
    private int m6938B(int i, boolean z) {
        if (z) {
            return this.f5775c.mo6960c(i);
        }
        if (i < this.f5774b - 1) {
            return i + 1;
        }
        return -1;
    }

    /* renamed from: C */
    private int m6939C(int i, boolean z) {
        if (z) {
            return this.f5775c.mo6963f(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* renamed from: v */
    public static Object m6940v(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: w */
    public static Object m6941w(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: y */
    public static Object m6942y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract int mo5984A(int i);

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract Timeline mo5985D(int i);

    /* renamed from: a */
    public int mo5986a(boolean z) {
        if (this.f5774b == 0) {
            return -1;
        }
        int i = 0;
        if (this.f5776d) {
            z = false;
        }
        if (z) {
            i = this.f5775c.mo6962e();
        }
        while (mo5985D(i).mo7743q()) {
            i = m6938B(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo5984A(i) + mo5985D(i).mo5986a(z);
    }

    /* renamed from: b */
    public final int mo5987b(Object obj) {
        int i = -1;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object w = m6941w(obj);
        Object v = m6940v(obj);
        int s = mo5995s(w);
        if (s == -1) {
            return -1;
        }
        int b = mo5985D(s).mo5987b(v);
        if (b != -1) {
            i = mo5999z(s) + b;
        }
        return i;
    }

    /* renamed from: c */
    public int mo5988c(boolean z) {
        int i = this.f5774b;
        if (i == 0) {
            return -1;
        }
        if (this.f5776d) {
            z = false;
        }
        int g = z ? this.f5775c.mo6964g() : i - 1;
        while (mo5985D(g).mo7743q()) {
            g = m6939C(g, z);
            if (g == -1) {
                return -1;
            }
        }
        return mo5984A(g) + mo5985D(g).mo5988c(z);
    }

    /* renamed from: e */
    public int mo5989e(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f5776d) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int u = mo5997u(i);
        int A = mo5984A(u);
        Timeline D = mo5985D(u);
        int i4 = i - A;
        if (i2 != 2) {
            i3 = i2;
        }
        int e = D.mo5989e(i4, i3, z);
        if (e != -1) {
            return A + e;
        }
        int B = m6938B(u, z);
        while (B != -1 && mo5985D(B).mo7743q()) {
            B = m6938B(B, z);
        }
        if (B != -1) {
            return mo5984A(B) + mo5985D(B).mo5986a(z);
        }
        if (i2 == 2) {
            return mo5986a(z);
        }
        return -1;
    }

    /* renamed from: g */
    public final C1256b mo5990g(int i, C1256b bVar, boolean z) {
        int t = mo5996t(i);
        int A = mo5984A(t);
        mo5985D(t).mo5990g(i - mo5999z(t), bVar, z);
        bVar.f8952c += A;
        if (z) {
            bVar.f8951b = m6942y(mo5998x(t), Assertions.m10153e(bVar.f8951b));
        }
        return bVar;
    }

    /* renamed from: h */
    public final C1256b mo5991h(Object obj, C1256b bVar) {
        Object w = m6941w(obj);
        Object v = m6940v(obj);
        int s = mo5995s(w);
        int A = mo5984A(s);
        mo5985D(s).mo5991h(v, bVar);
        bVar.f8952c += A;
        bVar.f8951b = obj;
        return bVar;
    }

    /* renamed from: l */
    public int mo5992l(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f5776d) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int u = mo5997u(i);
        int A = mo5984A(u);
        Timeline D = mo5985D(u);
        int i4 = i - A;
        if (i2 != 2) {
            i3 = i2;
        }
        int l = D.mo5992l(i4, i3, z);
        if (l != -1) {
            return A + l;
        }
        int C = m6939C(u, z);
        while (C != -1 && mo5985D(C).mo7743q()) {
            C = m6939C(C, z);
        }
        if (C != -1) {
            return mo5984A(C) + mo5985D(C).mo5988c(z);
        }
        if (i2 == 2) {
            return mo5988c(z);
        }
        return -1;
    }

    /* renamed from: m */
    public final Object mo5993m(int i) {
        int t = mo5996t(i);
        return m6942y(mo5998x(t), mo5985D(t).mo5993m(i - mo5999z(t)));
    }

    /* renamed from: o */
    public final C1257c mo5994o(int i, C1257c cVar, long j) {
        int u = mo5997u(i);
        int A = mo5984A(u);
        int z = mo5999z(u);
        mo5985D(u).mo5994o(i - A, cVar, j);
        Object x = mo5998x(u);
        if (!C1257c.f8956a.equals(cVar.f8958c)) {
            x = m6942y(x, cVar.f8958c);
        }
        cVar.f8958c = x;
        cVar.f8970o += z;
        cVar.f8971p += z;
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract int mo5995s(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo5996t(int i);

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract int mo5997u(int i);

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract Object mo5998x(int i);

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract int mo5999z(int i);
}
