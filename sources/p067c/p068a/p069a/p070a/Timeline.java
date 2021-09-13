package p067c.p068a.p069a.p070a;

import android.net.Uri;
import android.util.Pair;
import p067c.p068a.p069a.p070a.MediaItem.C1262c;
import p067c.p068a.p069a.p070a.MediaItem.C1265f;
import p067c.p068a.p069a.p070a.p097j2.p098s0.AdPlaybackState;
import p067c.p068a.p069a.p070a.p097j2.p098s0.AdPlaybackState.C1108a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.x1 */
public abstract class Timeline {

    /* renamed from: a */
    public static final Timeline f8949a = new C1255a();

    /* renamed from: c.a.a.a.x1$a */
    /* compiled from: Timeline */
    class C1255a extends Timeline {
        C1255a() {
        }

        /* renamed from: b */
        public int mo5987b(Object obj) {
            return -1;
        }

        /* renamed from: g */
        public C1256b mo5990g(int i, C1256b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: i */
        public int mo6972i() {
            return 0;
        }

        /* renamed from: m */
        public Object mo5993m(int i) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: o */
        public C1257c mo5994o(int i, C1257c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: p */
        public int mo6973p() {
            return 0;
        }
    }

    /* renamed from: c.a.a.a.x1$b */
    /* compiled from: Timeline */
    public static final class C1256b {

        /* renamed from: a */
        public Object f8950a;

        /* renamed from: b */
        public Object f8951b;

        /* renamed from: c */
        public int f8952c;

        /* renamed from: d */
        public long f8953d;

        /* renamed from: e */
        private long f8954e;

        /* renamed from: f */
        private AdPlaybackState f8955f = AdPlaybackState.f7622a;

        /* renamed from: a */
        public int mo7745a(int i) {
            return this.f8955f.f7626e[i].f7629a;
        }

        /* renamed from: b */
        public long mo7746b(int i, int i2) {
            C1108a aVar = this.f8955f.f7626e[i];
            if (aVar.f7629a != -1) {
                return aVar.f7632d[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: c */
        public int mo7747c() {
            return this.f8955f.f7624c;
        }

        /* renamed from: d */
        public int mo7748d(long j) {
            return this.f8955f.mo6996a(j, this.f8953d);
        }

        /* renamed from: e */
        public int mo7749e(long j) {
            return this.f8955f.mo6997b(j, this.f8953d);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || !C1256b.class.equals(obj.getClass())) {
                return false;
            }
            C1256b bVar = (C1256b) obj;
            if (!Util.m10279b(this.f8950a, bVar.f8950a) || !Util.m10279b(this.f8951b, bVar.f8951b) || this.f8952c != bVar.f8952c || this.f8953d != bVar.f8953d || this.f8954e != bVar.f8954e || !Util.m10279b(this.f8955f, bVar.f8955f)) {
                z = false;
            }
            return z;
        }

        /* renamed from: f */
        public long mo7751f(int i) {
            return this.f8955f.f7625d[i];
        }

        /* renamed from: g */
        public long mo7752g() {
            return this.f8955f.f7627f;
        }

        /* renamed from: h */
        public long mo7753h() {
            return this.f8953d;
        }

        public int hashCode() {
            Object obj = this.f8950a;
            int i = 0;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f8951b;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            int i2 = (((hashCode + i) * 31) + this.f8952c) * 31;
            long j = this.f8953d;
            int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f8954e;
            return ((i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f8955f.hashCode();
        }

        /* renamed from: i */
        public int mo7755i(int i) {
            return this.f8955f.f7626e[i].mo7001a();
        }

        /* renamed from: j */
        public int mo7756j(int i, int i2) {
            return this.f8955f.f7626e[i].mo7002b(i2);
        }

        /* renamed from: k */
        public long mo7757k() {
            return C.m8861d(this.f8954e);
        }

        /* renamed from: l */
        public long mo7758l() {
            return this.f8954e;
        }

        /* renamed from: m */
        public boolean mo7759m(int i) {
            return !this.f8955f.f7626e[i].mo7003c();
        }

        /* renamed from: n */
        public C1256b mo7760n(Object obj, Object obj2, int i, long j, long j2) {
            return mo7761o(obj, obj2, i, j, j2, AdPlaybackState.f7622a);
        }

        /* renamed from: o */
        public C1256b mo7761o(Object obj, Object obj2, int i, long j, long j2, AdPlaybackState aVar) {
            this.f8950a = obj;
            this.f8951b = obj2;
            this.f8952c = i;
            this.f8953d = j;
            this.f8954e = j2;
            this.f8955f = aVar;
            return this;
        }
    }

    /* renamed from: c.a.a.a.x1$c */
    /* compiled from: Timeline */
    public static final class C1257c {

        /* renamed from: a */
        public static final Object f8956a = new Object();

        /* renamed from: b */
        private static final MediaItem f8957b = new C1262c().mo7783d("com.google.android.exoplayer2.Timeline").mo7786g(Uri.EMPTY).mo7780a();

        /* renamed from: c */
        public Object f8958c = f8956a;
        @Deprecated

        /* renamed from: d */
        public Object f8959d;

        /* renamed from: e */
        public MediaItem f8960e = f8957b;

        /* renamed from: f */
        public Object f8961f;

        /* renamed from: g */
        public long f8962g;

        /* renamed from: h */
        public long f8963h;

        /* renamed from: i */
        public long f8964i;

        /* renamed from: j */
        public boolean f8965j;

        /* renamed from: k */
        public boolean f8966k;
        @Deprecated

        /* renamed from: l */
        public boolean f8967l;

        /* renamed from: m */
        public C1265f f8968m;

        /* renamed from: n */
        public boolean f8969n;

        /* renamed from: o */
        public int f8970o;

        /* renamed from: p */
        public int f8971p;

        /* renamed from: q */
        public long f8972q;

        /* renamed from: r */
        public long f8973r;

        /* renamed from: s */
        public long f8974s;

        /* renamed from: a */
        public long mo7762a() {
            return Util.m10271U(this.f8964i);
        }

        /* renamed from: b */
        public long mo7763b() {
            return C.m8861d(this.f8972q);
        }

        /* renamed from: c */
        public long mo7764c() {
            return this.f8972q;
        }

        /* renamed from: d */
        public long mo7765d() {
            return C.m8861d(this.f8973r);
        }

        /* renamed from: e */
        public long mo7766e() {
            return this.f8974s;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || !C1257c.class.equals(obj.getClass())) {
                return false;
            }
            C1257c cVar = (C1257c) obj;
            if (!(Util.m10279b(this.f8958c, cVar.f8958c) && Util.m10279b(this.f8960e, cVar.f8960e) && Util.m10279b(this.f8961f, cVar.f8961f) && Util.m10279b(this.f8968m, cVar.f8968m) && this.f8962g == cVar.f8962g && this.f8963h == cVar.f8963h && this.f8964i == cVar.f8964i && this.f8965j == cVar.f8965j && this.f8966k == cVar.f8966k && this.f8969n == cVar.f8969n && this.f8972q == cVar.f8972q && this.f8973r == cVar.f8973r && this.f8970o == cVar.f8970o && this.f8971p == cVar.f8971p && this.f8974s == cVar.f8974s)) {
                z = false;
            }
            return z;
        }

        /* renamed from: f */
        public boolean mo7768f() {
            Assertions.m10154f(this.f8967l == (this.f8968m != null));
            if (this.f8968m != null) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p067c.p068a.p069a.p070a.Timeline.C1257c mo7769g(java.lang.Object r6, p067c.p068a.p069a.p070a.MediaItem r7, java.lang.Object r8, long r9, long r11, long r13, boolean r15, boolean r16, p067c.p068a.p069a.p070a.MediaItem.C1265f r17, long r18, long r20, int r22, int r23, long r24) {
            /*
                r5 = this;
                r0 = r5
                r1 = r7
                r2 = r17
                r3 = r6
                r0.f8958c = r3
                if (r1 == 0) goto L_0x000b
                r3 = r1
                goto L_0x000d
            L_0x000b:
                c.a.a.a.z0 r3 = f8957b
            L_0x000d:
                r0.f8960e = r3
                if (r1 == 0) goto L_0x0018
                c.a.a.a.z0$g r1 = r1.f8985b
                if (r1 == 0) goto L_0x0018
                java.lang.Object r1 = r1.f9045h
                goto L_0x0019
            L_0x0018:
                r1 = 0
            L_0x0019:
                r0.f8959d = r1
                r1 = r8
                r0.f8961f = r1
                r3 = r9
                r0.f8962g = r3
                r3 = r11
                r0.f8963h = r3
                r3 = r13
                r0.f8964i = r3
                r1 = r15
                r0.f8965j = r1
                r1 = r16
                r0.f8966k = r1
                r1 = 0
                if (r2 == 0) goto L_0x0033
                r3 = 1
                goto L_0x0034
            L_0x0033:
                r3 = 0
            L_0x0034:
                r0.f8967l = r3
                r0.f8968m = r2
                r2 = r18
                r0.f8972q = r2
                r2 = r20
                r0.f8973r = r2
                r2 = r22
                r0.f8970o = r2
                r2 = r23
                r0.f8971p = r2
                r2 = r24
                r0.f8974s = r2
                r0.f8969n = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.Timeline.C1257c.mo7769g(java.lang.Object, c.a.a.a.z0, java.lang.Object, long, long, long, boolean, boolean, c.a.a.a.z0$f, long, long, int, int, long):c.a.a.a.x1$c");
        }

        public int hashCode() {
            int hashCode = (((217 + this.f8958c.hashCode()) * 31) + this.f8960e.hashCode()) * 31;
            Object obj = this.f8961f;
            int i = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C1265f fVar = this.f8968m;
            if (fVar != null) {
                i = fVar.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            long j = this.f8962g;
            int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f8963h;
            int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f8964i;
            int i5 = (((((((i4 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f8965j ? 1 : 0)) * 31) + (this.f8966k ? 1 : 0)) * 31) + (this.f8969n ? 1 : 0)) * 31;
            long j4 = this.f8972q;
            int i6 = (i5 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f8973r;
            int i7 = (((((i6 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f8970o) * 31) + this.f8971p) * 31;
            long j6 = this.f8974s;
            return i7 + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    /* renamed from: a */
    public int mo5986a(boolean z) {
        return mo7743q() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo5987b(Object obj);

    /* renamed from: c */
    public int mo5988c(boolean z) {
        if (mo7743q()) {
            return -1;
        }
        return mo6973p() - 1;
    }

    /* renamed from: d */
    public final int mo7736d(int i, C1256b bVar, C1257c cVar, int i2, boolean z) {
        int i3 = mo7738f(i, bVar).f8952c;
        if (mo7742n(i3, cVar).f8971p != i) {
            return i + 1;
        }
        int e = mo5989e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return mo7742n(e, cVar).f8970o;
    }

    /* renamed from: e */
    public int mo5989e(int i, int i2, boolean z) {
        if (i2 == 0) {
            return i == mo5988c(z) ? -1 : i + 1;
        } else if (i2 == 1) {
            return i;
        } else {
            if (i2 == 2) {
                return i == mo5988c(z) ? mo5986a(z) : i + 1;
            }
            throw new IllegalStateException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline x1Var = (Timeline) obj;
        if (x1Var.mo6973p() != mo6973p() || x1Var.mo6972i() != mo6972i()) {
            return false;
        }
        C1257c cVar = new C1257c();
        C1256b bVar = new C1256b();
        C1257c cVar2 = new C1257c();
        C1256b bVar2 = new C1256b();
        for (int i = 0; i < mo6973p(); i++) {
            if (!mo7742n(i, cVar).equals(x1Var.mo7742n(i, cVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo6972i(); i2++) {
            if (!mo5990g(i2, bVar, true).equals(x1Var.mo5990g(i2, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final C1256b mo7738f(int i, C1256b bVar) {
        return mo5990g(i, bVar, false);
    }

    /* renamed from: g */
    public abstract C1256b mo5990g(int i, C1256b bVar, boolean z);

    /* renamed from: h */
    public C1256b mo5991h(Object obj, C1256b bVar) {
        return mo5990g(mo5987b(obj), bVar, true);
    }

    public int hashCode() {
        C1257c cVar = new C1257c();
        C1256b bVar = new C1256b();
        int p = 217 + mo6973p();
        for (int i = 0; i < mo6973p(); i++) {
            p = (p * 31) + mo7742n(i, cVar).hashCode();
        }
        int i2 = (p * 31) + mo6972i();
        for (int i3 = 0; i3 < mo6972i(); i3++) {
            i2 = (i2 * 31) + mo5990g(i3, bVar, true).hashCode();
        }
        return i2;
    }

    /* renamed from: i */
    public abstract int mo6972i();

    /* renamed from: j */
    public final Pair<Object, Long> mo7740j(C1257c cVar, C1256b bVar, int i, long j) {
        return (Pair) Assertions.m10153e(mo7741k(cVar, bVar, i, j, 0));
    }

    /* renamed from: k */
    public final Pair<Object, Long> mo7741k(C1257c cVar, C1256b bVar, int i, long j, long j2) {
        Assertions.m10151c(i, 0, mo6973p());
        mo5994o(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.mo7764c();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f8970o;
        long e = cVar.mo7766e() + j;
        long h = mo5990g(i2, bVar, true).mo7753h();
        while (h != -9223372036854775807L && e >= h && i2 < cVar.f8971p) {
            e -= h;
            i2++;
            h = mo5990g(i2, bVar, true).mo7753h();
        }
        return Pair.create(Assertions.m10153e(bVar.f8951b), Long.valueOf(e));
    }

    /* renamed from: l */
    public int mo5992l(int i, int i2, boolean z) {
        if (i2 == 0) {
            return i == mo5986a(z) ? -1 : i - 1;
        } else if (i2 == 1) {
            return i;
        } else {
            if (i2 == 2) {
                return i == mo5986a(z) ? mo5988c(z) : i - 1;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: m */
    public abstract Object mo5993m(int i);

    /* renamed from: n */
    public final C1257c mo7742n(int i, C1257c cVar) {
        return mo5994o(i, cVar, 0);
    }

    /* renamed from: o */
    public abstract C1257c mo5994o(int i, C1257c cVar, long j);

    /* renamed from: p */
    public abstract int mo6973p();

    /* renamed from: q */
    public final boolean mo7743q() {
        return mo6973p() == 0;
    }

    /* renamed from: r */
    public final boolean mo7744r(int i, C1256b bVar, C1257c cVar, int i2, boolean z) {
        return mo7736d(i, bVar, cVar, i2, z) == -1;
    }
}
