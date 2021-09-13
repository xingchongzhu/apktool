package p067c.p068a.p069a.p070a.p097j2;

import android.os.Looper;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import java.io.IOException;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.FormatHolder;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p075e2.C0896v;
import p067c.p068a.p069a.p070a.p075e2.C0896v.C0897a;
import p067c.p068a.p069a.p070a.p075e2.C0900y;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener.C0898a;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.C0916b0.C0917a;
import p067c.p068a.p069a.p070a.p076f2.TrackOutput;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.j2.k0 */
public class SampleQueue implements C0916b0 {

    /* renamed from: A */
    private boolean f7528A;

    /* renamed from: B */
    private Format f7529B;

    /* renamed from: C */
    private Format f7530C;

    /* renamed from: D */
    private Format f7531D;

    /* renamed from: E */
    private int f7532E;

    /* renamed from: F */
    private boolean f7533F;

    /* renamed from: G */
    private boolean f7534G;

    /* renamed from: H */
    private long f7535H;

    /* renamed from: I */
    private boolean f7536I;

    /* renamed from: a */
    private final SampleDataQueue f7537a;

    /* renamed from: b */
    private final C1099a f7538b = new C1099a();

    /* renamed from: c */
    private final C0900y f7539c;

    /* renamed from: d */
    private final C0898a f7540d;

    /* renamed from: e */
    private final Looper f7541e;

    /* renamed from: f */
    private C1100b f7542f;

    /* renamed from: g */
    private Format f7543g;

    /* renamed from: h */
    private C0896v f7544h;

    /* renamed from: i */
    private int f7545i = 1000;

    /* renamed from: j */
    private int[] f7546j = new int[1000];

    /* renamed from: k */
    private long[] f7547k = new long[1000];

    /* renamed from: l */
    private int[] f7548l = new int[1000];

    /* renamed from: m */
    private int[] f7549m = new int[1000];

    /* renamed from: n */
    private long[] f7550n = new long[1000];

    /* renamed from: o */
    private C0917a[] f7551o = new C0917a[1000];

    /* renamed from: p */
    private Format[] f7552p = new Format[1000];

    /* renamed from: q */
    private int f7553q;

    /* renamed from: r */
    private int f7554r;

    /* renamed from: s */
    private int f7555s;

    /* renamed from: t */
    private int f7556t;

    /* renamed from: u */
    private long f7557u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f7558v = Long.MIN_VALUE;

    /* renamed from: w */
    private long f7559w = Long.MIN_VALUE;

    /* renamed from: x */
    private boolean f7560x;

    /* renamed from: y */
    private boolean f7561y = true;

    /* renamed from: z */
    private boolean f7562z = true;

    /* renamed from: c.a.a.a.j2.k0$a */
    /* compiled from: SampleQueue */
    static final class C1099a {

        /* renamed from: a */
        public int f7563a;

        /* renamed from: b */
        public long f7564b;

        /* renamed from: c */
        public C0917a f7565c;

        C1099a() {
        }
    }

    /* renamed from: c.a.a.a.j2.k0$b */
    /* compiled from: SampleQueue */
    public interface C1100b {
        /* renamed from: m */
        void mo6890m(Format u0Var);
    }

    protected SampleQueue(Allocator eVar, Looper looper, C0900y yVar, C0898a aVar) {
        this.f7541e = looper;
        this.f7539c = yVar;
        this.f7540d = aVar;
        this.f7537a = new SampleDataQueue(eVar);
    }

    /* renamed from: B */
    private boolean m9086B() {
        return this.f7556t != this.f7553q;
    }

    /* renamed from: F */
    private boolean m9087F(int i) {
        C0896v vVar = this.f7544h;
        return vVar == null || vVar.getState() == 4 || ((this.f7549m[i] & 1073741824) == 0 && this.f7544h.mo6041a());
    }

    /* renamed from: H */
    private void m9088H(Format u0Var, FormatHolder v0Var) {
        DrmInitData tVar;
        Format u0Var2 = this.f7543g;
        boolean z = u0Var2 == null;
        if (z) {
            tVar = null;
        } else {
            tVar = u0Var2.f8817o;
        }
        this.f7543g = u0Var;
        DrmInitData tVar2 = u0Var.f8817o;
        C0900y yVar = this.f7539c;
        v0Var.f8869b = yVar != null ? u0Var.mo7669m(yVar.mo6085c(u0Var)) : u0Var;
        v0Var.f8868a = this.f7544h;
        if (this.f7539c != null) {
            if (z || !Util.m10279b(tVar, tVar2)) {
                C0896v vVar = this.f7544h;
                C0896v b = this.f7539c.mo6084b((Looper) Assertions.m10153e(this.f7541e), this.f7540d, u0Var);
                this.f7544h = b;
                v0Var.f8868a = b;
                if (vVar != null) {
                    vVar.mo6044d(this.f7540d);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        return -3;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int m9089I(p067c.p068a.p069a.p070a.FormatHolder r7, p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer r8, boolean r9, boolean r10, p067c.p068a.p069a.p070a.p097j2.SampleQueue.C1099a r11) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r8.f5745d = r0     // Catch:{ all -> 0x0082 }
            boolean r0 = r6.m9086B()     // Catch:{ all -> 0x0082 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0031
            if (r10 != 0) goto L_0x002b
            boolean r10 = r6.f7560x     // Catch:{ all -> 0x0082 }
            if (r10 == 0) goto L_0x0014
            goto L_0x002b
        L_0x0014:
            c.a.a.a.u0 r8 = r6.f7530C     // Catch:{ all -> 0x0082 }
            if (r8 == 0) goto L_0x0029
            if (r9 != 0) goto L_0x001e
            c.a.a.a.u0 r9 = r6.f7543g     // Catch:{ all -> 0x0082 }
            if (r8 == r9) goto L_0x0029
        L_0x001e:
            java.lang.Object r8 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r8)     // Catch:{ all -> 0x0082 }
            c.a.a.a.u0 r8 = (p067c.p068a.p069a.p070a.Format) r8     // Catch:{ all -> 0x0082 }
            r6.m9088H(r8, r7)     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)
            return r1
        L_0x0029:
            monitor-exit(r6)
            return r2
        L_0x002b:
            r7 = 4
            r8.mo5954m(r7)     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)
            return r3
        L_0x0031:
            int r10 = r6.f7556t     // Catch:{ all -> 0x0082 }
            int r10 = r6.m9103x(r10)     // Catch:{ all -> 0x0082 }
            if (r9 != 0) goto L_0x0079
            c.a.a.a.u0[] r9 = r6.f7552p     // Catch:{ all -> 0x0082 }
            r9 = r9[r10]     // Catch:{ all -> 0x0082 }
            c.a.a.a.u0 r0 = r6.f7543g     // Catch:{ all -> 0x0082 }
            if (r9 == r0) goto L_0x0042
            goto L_0x0079
        L_0x0042:
            boolean r7 = r6.m9087F(r10)     // Catch:{ all -> 0x0082 }
            if (r7 != 0) goto L_0x004d
            r7 = 1
            r8.f5745d = r7     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)
            return r2
        L_0x004d:
            int[] r7 = r6.f7549m     // Catch:{ all -> 0x0082 }
            r7 = r7[r10]     // Catch:{ all -> 0x0082 }
            r8.mo5954m(r7)     // Catch:{ all -> 0x0082 }
            long[] r7 = r6.f7550n     // Catch:{ all -> 0x0082 }
            r0 = r7[r10]     // Catch:{ all -> 0x0082 }
            r8.f5746e = r0     // Catch:{ all -> 0x0082 }
            long r4 = r6.f7557u     // Catch:{ all -> 0x0082 }
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0065
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.mo5946e(r7)     // Catch:{ all -> 0x0082 }
        L_0x0065:
            int[] r7 = r6.f7548l     // Catch:{ all -> 0x0082 }
            r7 = r7[r10]     // Catch:{ all -> 0x0082 }
            r11.f7563a = r7     // Catch:{ all -> 0x0082 }
            long[] r7 = r6.f7547k     // Catch:{ all -> 0x0082 }
            r8 = r7[r10]     // Catch:{ all -> 0x0082 }
            r11.f7564b = r8     // Catch:{ all -> 0x0082 }
            c.a.a.a.f2.b0$a[] r7 = r6.f7551o     // Catch:{ all -> 0x0082 }
            r7 = r7[r10]     // Catch:{ all -> 0x0082 }
            r11.f7565c = r7     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)
            return r3
        L_0x0079:
            c.a.a.a.u0[] r8 = r6.f7552p     // Catch:{ all -> 0x0082 }
            r8 = r8[r10]     // Catch:{ all -> 0x0082 }
            r6.m9088H(r8, r7)     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)
            return r1
        L_0x0082:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p097j2.SampleQueue.m9089I(c.a.a.a.v0, c.a.a.a.c2.f, boolean, boolean, c.a.a.a.j2.k0$a):int");
    }

    /* renamed from: N */
    private void m9090N() {
        C0896v vVar = this.f7544h;
        if (vVar != null) {
            vVar.mo6044d(this.f7540d);
            this.f7544h = null;
            this.f7543g = null;
        }
    }

    /* renamed from: Q */
    private synchronized void m9091Q() {
        this.f7556t = 0;
        this.f7537a.mo6913n();
    }

    /* renamed from: U */
    private synchronized boolean m9092U(Format u0Var) {
        this.f7562z = false;
        if (Util.m10279b(u0Var, this.f7530C)) {
            return false;
        }
        if (Util.m10279b(u0Var, this.f7531D)) {
            this.f7530C = this.f7531D;
        } else {
            this.f7530C = u0Var;
        }
        Format u0Var2 = this.f7530C;
        this.f7533F = MimeTypes.m10395a(u0Var2.f8814l, u0Var2.f8811i);
        this.f7534G = false;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        return r1;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m9093g(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f7553q     // Catch:{ all -> 0x0027 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            long r3 = r5.f7558v     // Catch:{ all -> 0x0027 }
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            monitor-exit(r5)
            return r1
        L_0x0011:
            long r3 = r5.mo6950u()     // Catch:{ all -> 0x0027 }
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            monitor-exit(r5)
            return r2
        L_0x001b:
            int r6 = r5.m9095i(r6)     // Catch:{ all -> 0x0027 }
            int r7 = r5.f7554r     // Catch:{ all -> 0x0027 }
            int r7 = r7 + r6
            r5.m9100p(r7)     // Catch:{ all -> 0x0027 }
            monitor-exit(r5)
            return r1
        L_0x0027:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p097j2.SampleQueue.m9093g(long):boolean");
    }

    /* renamed from: h */
    private synchronized void m9094h(long j, int i, long j2, int i2, C0917a aVar) {
        int i3 = this.f7553q;
        if (i3 > 0) {
            int x = m9103x(i3 - 1);
            Assertions.m10149a(this.f7547k[x] + ((long) this.f7548l[x]) <= j2);
        }
        this.f7560x = (536870912 & i) != 0;
        this.f7559w = Math.max(this.f7559w, j);
        int x2 = m9103x(this.f7553q);
        this.f7550n[x2] = j;
        long[] jArr = this.f7547k;
        jArr[x2] = j2;
        this.f7548l[x2] = i2;
        this.f7549m[x2] = i;
        this.f7551o[x2] = aVar;
        Format[] u0VarArr = this.f7552p;
        Format u0Var = this.f7530C;
        u0VarArr[x2] = u0Var;
        this.f7546j[x2] = this.f7532E;
        this.f7531D = u0Var;
        int i4 = this.f7553q + 1;
        this.f7553q = i4;
        int i5 = this.f7545i;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            C0917a[] aVarArr = new C0917a[i6];
            Format[] u0VarArr2 = new Format[i6];
            int i7 = this.f7555s;
            int i8 = i5 - i7;
            System.arraycopy(jArr, i7, jArr2, 0, i8);
            System.arraycopy(this.f7550n, this.f7555s, jArr3, 0, i8);
            System.arraycopy(this.f7549m, this.f7555s, iArr2, 0, i8);
            System.arraycopy(this.f7548l, this.f7555s, iArr3, 0, i8);
            System.arraycopy(this.f7551o, this.f7555s, aVarArr, 0, i8);
            System.arraycopy(this.f7552p, this.f7555s, u0VarArr2, 0, i8);
            System.arraycopy(this.f7546j, this.f7555s, iArr, 0, i8);
            int i9 = this.f7555s;
            System.arraycopy(this.f7547k, 0, jArr2, i8, i9);
            System.arraycopy(this.f7550n, 0, jArr3, i8, i9);
            System.arraycopy(this.f7549m, 0, iArr2, i8, i9);
            System.arraycopy(this.f7548l, 0, iArr3, i8, i9);
            System.arraycopy(this.f7551o, 0, aVarArr, i8, i9);
            System.arraycopy(this.f7552p, 0, u0VarArr2, i8, i9);
            System.arraycopy(this.f7546j, 0, iArr, i8, i9);
            this.f7547k = jArr2;
            this.f7550n = jArr3;
            this.f7549m = iArr2;
            this.f7548l = iArr3;
            this.f7551o = aVarArr;
            this.f7552p = u0VarArr2;
            this.f7546j = iArr;
            this.f7555s = 0;
            this.f7545i = i6;
        }
    }

    /* renamed from: i */
    private int m9095i(long j) {
        int i = this.f7553q;
        int x = m9103x(i - 1);
        while (i > this.f7556t && this.f7550n[x] >= j) {
            i--;
            x--;
            if (x == -1) {
                x = this.f7545i - 1;
            }
        }
        return i;
    }

    /* renamed from: j */
    public static SampleQueue m9096j(Allocator eVar, Looper looper, C0900y yVar, C0898a aVar) {
        return new SampleQueue(eVar, (Looper) Assertions.m10153e(looper), (C0900y) Assertions.m10153e(yVar), (C0898a) Assertions.m10153e(aVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long m9097k(long r11, boolean r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f7553q     // Catch:{ all -> 0x002f }
            r1 = -1
            if (r0 == 0) goto L_0x002d
            long[] r3 = r10.f7550n     // Catch:{ all -> 0x002f }
            int r5 = r10.f7555s     // Catch:{ all -> 0x002f }
            r6 = r3[r5]     // Catch:{ all -> 0x002f }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r14 == 0) goto L_0x001a
            int r14 = r10.f7556t     // Catch:{ all -> 0x002f }
            if (r14 == r0) goto L_0x001a
            int r0 = r14 + 1
        L_0x001a:
            r6 = r0
            r4 = r10
            r7 = r11
            r9 = r13
            int r11 = r4.m9101r(r5, r6, r7, r9)     // Catch:{ all -> 0x002f }
            r12 = -1
            if (r11 != r12) goto L_0x0027
            monitor-exit(r10)
            return r1
        L_0x0027:
            long r11 = r10.m9099m(r11)     // Catch:{ all -> 0x002f }
            monitor-exit(r10)
            return r11
        L_0x002d:
            monitor-exit(r10)
            return r1
        L_0x002f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p097j2.SampleQueue.m9097k(long, boolean, boolean):long");
    }

    /* renamed from: l */
    private synchronized long m9098l() {
        int i = this.f7553q;
        if (i == 0) {
            return -1;
        }
        return m9099m(i);
    }

    /* renamed from: m */
    private long m9099m(int i) {
        this.f7558v = Math.max(this.f7558v, m9102v(i));
        int i2 = this.f7553q - i;
        this.f7553q = i2;
        this.f7554r += i;
        int i3 = this.f7555s + i;
        this.f7555s = i3;
        int i4 = this.f7545i;
        if (i3 >= i4) {
            this.f7555s = i3 - i4;
        }
        int i5 = this.f7556t - i;
        this.f7556t = i5;
        if (i5 < 0) {
            this.f7556t = 0;
        }
        if (i2 != 0) {
            return this.f7547k[this.f7555s];
        }
        int i6 = this.f7555s;
        if (i6 != 0) {
            i4 = i6;
        }
        int i7 = i4 - 1;
        return this.f7547k[i7] + ((long) this.f7548l[i7]);
    }

    /* renamed from: p */
    private long m9100p(int i) {
        int A = mo6927A() - i;
        boolean z = false;
        Assertions.m10149a(A >= 0 && A <= this.f7553q - this.f7556t);
        int i2 = this.f7553q - A;
        this.f7553q = i2;
        this.f7559w = Math.max(this.f7558v, m9102v(i2));
        if (A == 0 && this.f7560x) {
            z = true;
        }
        this.f7560x = z;
        int i3 = this.f7553q;
        if (i3 == 0) {
            return 0;
        }
        int x = m9103x(i3 - 1);
        return this.f7547k[x] + ((long) this.f7548l[x]);
    }

    /* renamed from: r */
    private int m9101r(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long[] jArr = this.f7550n;
            if (jArr[i] > j) {
                return i3;
            }
            if (!z || (this.f7549m[i] & 1) != 0) {
                if (jArr[i] == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f7545i) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: v */
    private long m9102v(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int x = m9103x(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f7550n[x]);
            if ((this.f7549m[x] & 1) != 0) {
                break;
            }
            x--;
            if (x == -1) {
                x = this.f7545i - 1;
            }
        }
        return j;
    }

    /* renamed from: x */
    private int m9103x(int i) {
        int i2 = this.f7555s + i;
        int i3 = this.f7545i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* renamed from: A */
    public final int mo6927A() {
        return this.f7554r + this.f7553q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo6928C() {
        this.f7528A = true;
    }

    /* renamed from: D */
    public final synchronized boolean mo6929D() {
        return this.f7560x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return r1;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo6930E(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m9086B()     // Catch:{ all -> 0x0030 }
            r1 = 1
            if (r0 != 0) goto L_0x001a
            if (r4 != 0) goto L_0x0018
            boolean r4 = r3.f7560x     // Catch:{ all -> 0x0030 }
            if (r4 != 0) goto L_0x0018
            c.a.a.a.u0 r4 = r3.f7530C     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x0017
            c.a.a.a.u0 r0 = r3.f7543g     // Catch:{ all -> 0x0030 }
            if (r4 == r0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            monitor-exit(r3)
            return r1
        L_0x001a:
            int r4 = r3.f7556t     // Catch:{ all -> 0x0030 }
            int r4 = r3.m9103x(r4)     // Catch:{ all -> 0x0030 }
            c.a.a.a.u0[] r0 = r3.f7552p     // Catch:{ all -> 0x0030 }
            r0 = r0[r4]     // Catch:{ all -> 0x0030 }
            c.a.a.a.u0 r2 = r3.f7543g     // Catch:{ all -> 0x0030 }
            if (r0 == r2) goto L_0x002a
            monitor-exit(r3)
            return r1
        L_0x002a:
            boolean r4 = r3.m9087F(r4)     // Catch:{ all -> 0x0030 }
            monitor-exit(r3)
            return r4
        L_0x0030:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p097j2.SampleQueue.mo6930E(boolean):boolean");
    }

    /* renamed from: G */
    public void mo6931G() throws IOException {
        C0896v vVar = this.f7544h;
        if (vVar != null && vVar.getState() == 1) {
            throw ((C0897a) Assertions.m10153e(this.f7544h.mo6047g()));
        }
    }

    /* renamed from: J */
    public final synchronized int mo6932J() {
        return m9086B() ? this.f7546j[m9103x(this.f7556t)] : this.f7532E;
    }

    /* renamed from: K */
    public void mo6933K() {
        mo6946o();
        m9090N();
    }

    /* renamed from: L */
    public int mo6934L(FormatHolder v0Var, DecoderInputBuffer fVar, boolean z, boolean z2) {
        int I = m9089I(v0Var, fVar, z, z2, this.f7538b);
        if (I == -4 && !fVar.mo5952k() && !fVar.mo5968r()) {
            this.f7537a.mo6911l(fVar, this.f7538b);
            this.f7556t++;
        }
        return I;
    }

    /* renamed from: M */
    public void mo6935M() {
        mo6937P(true);
        m9090N();
    }

    /* renamed from: O */
    public final void mo6936O() {
        mo6937P(false);
    }

    /* renamed from: P */
    public void mo6937P(boolean z) {
        this.f7537a.mo6912m();
        this.f7553q = 0;
        this.f7554r = 0;
        this.f7555s = 0;
        this.f7556t = 0;
        this.f7561y = true;
        this.f7557u = Long.MIN_VALUE;
        this.f7558v = Long.MIN_VALUE;
        this.f7559w = Long.MIN_VALUE;
        this.f7560x = false;
        this.f7531D = null;
        if (z) {
            this.f7529B = null;
            this.f7530C = null;
            this.f7562z = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return false;
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo6938R(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m9091Q()     // Catch:{ all -> 0x0040 }
            int r0 = r8.f7556t     // Catch:{ all -> 0x0040 }
            int r2 = r8.m9103x(r0)     // Catch:{ all -> 0x0040 }
            boolean r0 = r8.m9086B()     // Catch:{ all -> 0x0040 }
            r7 = 0
            if (r0 == 0) goto L_0x003e
            long[] r0 = r8.f7550n     // Catch:{ all -> 0x0040 }
            r3 = r0[r2]     // Catch:{ all -> 0x0040 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            long r0 = r8.f7559w     // Catch:{ all -> 0x0040 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            int r11 = r8.f7553q     // Catch:{ all -> 0x0040 }
            int r0 = r8.f7556t     // Catch:{ all -> 0x0040 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.m9101r(r2, r3, r4, r6)     // Catch:{ all -> 0x0040 }
            r0 = -1
            if (r11 != r0) goto L_0x0034
            monitor-exit(r8)
            return r7
        L_0x0034:
            r8.f7557u = r9     // Catch:{ all -> 0x0040 }
            int r9 = r8.f7556t     // Catch:{ all -> 0x0040 }
            int r9 = r9 + r11
            r8.f7556t = r9     // Catch:{ all -> 0x0040 }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003e:
            monitor-exit(r8)
            return r7
        L_0x0040:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p097j2.SampleQueue.mo6938R(long, boolean):boolean");
    }

    /* renamed from: S */
    public final void mo6939S(long j) {
        if (this.f7535H != j) {
            this.f7535H = j;
            mo6928C();
        }
    }

    /* renamed from: T */
    public final void mo6940T(long j) {
        this.f7557u = j;
    }

    /* renamed from: V */
    public final void mo6941V(C1100b bVar) {
        this.f7542f = bVar;
    }

    /* renamed from: W */
    public final synchronized void mo6942W(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f7556t + i <= this.f7553q) {
                    z = true;
                    Assertions.m10149a(z);
                    this.f7556t += i;
                }
            } finally {
            }
        }
        z = false;
        Assertions.m10149a(z);
        this.f7556t += i;
    }

    /* renamed from: X */
    public final void mo6943X(int i) {
        this.f7532E = i;
    }

    /* renamed from: Y */
    public final void mo6944Y() {
        this.f7536I = true;
    }

    /* renamed from: a */
    public /* synthetic */ void mo6174a(ParsableByteArray a0Var, int i) {
        TrackOutput.m7284b(this, a0Var, i);
    }

    /* renamed from: b */
    public final int mo6175b(DataReader jVar, int i, boolean z, int i2) throws IOException {
        return this.f7537a.mo6914o(jVar, i, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6176c(long r12, int r14, int r15, int r16, p067c.p068a.p069a.p070a.p076f2.C0916b0.C0917a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f7528A
            if (r0 == 0) goto L_0x0010
            c.a.a.a.u0 r0 = r8.f7529B
            java.lang.Object r0 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10156h(r0)
            c.a.a.a.u0 r0 = (p067c.p068a.p069a.p070a.Format) r0
            r11.mo6177d(r0)
        L_0x0010:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            boolean r4 = r8.f7561y
            if (r4 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            r8.f7561y = r1
        L_0x0022:
            long r4 = r8.f7535H
            long r4 = r4 + r12
            boolean r6 = r8.f7533F
            if (r6 == 0) goto L_0x0054
            long r6 = r8.f7557u
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0030
            return
        L_0x0030:
            if (r0 != 0) goto L_0x0054
            boolean r0 = r8.f7534G
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            c.a.a.a.u0 r6 = r8.f7530C
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            android.util.Log.w(r6, r0)
            r8.f7534G = r2
        L_0x0050:
            r0 = r14 | 1
            r6 = r0
            goto L_0x0055
        L_0x0054:
            r6 = r14
        L_0x0055:
            boolean r0 = r8.f7536I
            if (r0 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0065
            boolean r0 = r11.m9093g(r4)
            if (r0 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r8.f7536I = r1
            goto L_0x0066
        L_0x0065:
            return
        L_0x0066:
            c.a.a.a.j2.j0 r0 = r8.f7537a
            long r0 = r0.mo6910e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.m9094h(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p097j2.SampleQueue.mo6176c(long, int, int, int, c.a.a.a.f2.b0$a):void");
    }

    /* renamed from: d */
    public final void mo6177d(Format u0Var) {
        Format s = mo6948s(u0Var);
        this.f7528A = false;
        this.f7529B = u0Var;
        boolean U = m9092U(s);
        C1100b bVar = this.f7542f;
        if (bVar != null && U) {
            bVar.mo6890m(s);
        }
    }

    /* renamed from: e */
    public final void mo6178e(ParsableByteArray a0Var, int i, int i2) {
        this.f7537a.mo6915p(a0Var, i);
    }

    /* renamed from: f */
    public /* synthetic */ int mo6179f(DataReader jVar, int i, boolean z) {
        return TrackOutput.m7283a(this, jVar, i, z);
    }

    /* renamed from: n */
    public final void mo6945n(long j, boolean z, boolean z2) {
        this.f7537a.mo6908b(m9097k(j, z, z2));
    }

    /* renamed from: o */
    public final void mo6946o() {
        this.f7537a.mo6908b(m9098l());
    }

    /* renamed from: q */
    public final void mo6947q(int i) {
        this.f7537a.mo6909c(m9100p(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Format mo6948s(Format u0Var) {
        return (this.f7535H == 0 || u0Var.f8818p == Long.MAX_VALUE) ? u0Var : u0Var.mo7668l().mo7709i0(u0Var.f8818p + this.f7535H).mo7679E();
    }

    /* renamed from: t */
    public final synchronized long mo6949t() {
        return this.f7559w;
    }

    /* renamed from: u */
    public final synchronized long mo6950u() {
        return Math.max(this.f7558v, m9102v(this.f7556t));
    }

    /* renamed from: w */
    public final int mo6951w() {
        return this.f7554r + this.f7556t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return 0;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo6952y(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f7556t     // Catch:{ all -> 0x003c }
            int r2 = r8.m9103x(r0)     // Catch:{ all -> 0x003c }
            boolean r0 = r8.m9086B()     // Catch:{ all -> 0x003c }
            r7 = 0
            if (r0 == 0) goto L_0x003a
            long[] r0 = r8.f7550n     // Catch:{ all -> 0x003c }
            r3 = r0[r2]     // Catch:{ all -> 0x003c }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            long r0 = r8.f7559w     // Catch:{ all -> 0x003c }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0026
            if (r11 == 0) goto L_0x0026
            int r9 = r8.f7553q     // Catch:{ all -> 0x003c }
            int r10 = r8.f7556t     // Catch:{ all -> 0x003c }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            int r11 = r8.f7553q     // Catch:{ all -> 0x003c }
            int r0 = r8.f7556t     // Catch:{ all -> 0x003c }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.m9101r(r2, r3, r4, r6)     // Catch:{ all -> 0x003c }
            r10 = -1
            if (r9 != r10) goto L_0x0038
            monitor-exit(r8)
            return r7
        L_0x0038:
            monitor-exit(r8)
            return r9
        L_0x003a:
            monitor-exit(r8)
            return r7
        L_0x003c:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p097j2.SampleQueue.mo6952y(long, boolean):int");
    }

    /* renamed from: z */
    public final synchronized Format mo6953z() {
        return this.f7562z ? null : this.f7530C;
    }
}
