package p067c.p068a.p069a.p070a.p097j2;

import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.MediaItem;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.Timeline.C1256b;
import p067c.p068a.p069a.p070a.Timeline.C1257c;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.j2.y */
public final class MaskingMediaSource extends CompositeMediaSource<Void> {

    /* renamed from: j */
    private final C1080d0 f7675j;

    /* renamed from: k */
    private final boolean f7676k;

    /* renamed from: l */
    private final C1257c f7677l;

    /* renamed from: m */
    private final C1256b f7678m;

    /* renamed from: n */
    private C1114a f7679n;

    /* renamed from: o */
    private MaskingMediaPeriod f7680o;

    /* renamed from: p */
    private boolean f7681p;

    /* renamed from: q */
    private boolean f7682q;

    /* renamed from: r */
    private boolean f7683r;

    /* renamed from: c.a.a.a.j2.y$a */
    /* compiled from: MaskingMediaSource */
    private static final class C1114a extends ForwardingTimeline {

        /* renamed from: c */
        public static final Object f7684c = new Object();

        /* renamed from: d */
        private final Object f7685d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final Object f7686e;

        private C1114a(Timeline x1Var, Object obj, Object obj2) {
            super(x1Var);
            this.f7685d = obj;
            this.f7686e = obj2;
        }

        /* renamed from: u */
        public static C1114a m9324u(MediaItem z0Var) {
            return new C1114a(new C1115b(z0Var), C1257c.f8956a, f7684c);
        }

        /* renamed from: v */
        public static C1114a m9325v(Timeline x1Var, Object obj, Object obj2) {
            return new C1114a(x1Var, obj, obj2);
        }

        /* renamed from: b */
        public int mo5987b(Object obj) {
            Timeline x1Var = this.f7652b;
            if (f7684c.equals(obj)) {
                Object obj2 = this.f7686e;
                if (obj2 != null) {
                    obj = obj2;
                }
            }
            return x1Var.mo5987b(obj);
        }

        /* renamed from: g */
        public C1256b mo5990g(int i, C1256b bVar, boolean z) {
            this.f7652b.mo5990g(i, bVar, z);
            if (Util.m10279b(bVar.f8951b, this.f7686e) && z) {
                bVar.f8951b = f7684c;
            }
            return bVar;
        }

        /* renamed from: m */
        public Object mo5993m(int i) {
            Object m = this.f7652b.mo5993m(i);
            return Util.m10279b(m, this.f7686e) ? f7684c : m;
        }

        /* renamed from: o */
        public C1257c mo5994o(int i, C1257c cVar, long j) {
            this.f7652b.mo5994o(i, cVar, j);
            if (Util.m10279b(cVar.f8958c, this.f7685d)) {
                cVar.f8958c = C1257c.f8956a;
            }
            return cVar;
        }

        /* renamed from: t */
        public C1114a mo7032t(Timeline x1Var) {
            return new C1114a(x1Var, this.f7685d, this.f7686e);
        }
    }

    /* renamed from: c.a.a.a.j2.y$b */
    /* compiled from: MaskingMediaSource */
    public static final class C1115b extends Timeline {

        /* renamed from: b */
        private final MediaItem f7687b;

        public C1115b(MediaItem z0Var) {
            this.f7687b = z0Var;
        }

        /* renamed from: b */
        public int mo5987b(Object obj) {
            return obj == C1114a.f7684c ? 0 : -1;
        }

        /* renamed from: g */
        public C1256b mo5990g(int i, C1256b bVar, boolean z) {
            Object obj = null;
            Object valueOf = z ? Integer.valueOf(0) : null;
            if (z) {
                obj = C1114a.f7684c;
            }
            return bVar.mo7760n(valueOf, obj, 0, -9223372036854775807L, 0);
        }

        /* renamed from: i */
        public int mo6972i() {
            return 1;
        }

        /* renamed from: m */
        public Object mo5993m(int i) {
            return C1114a.f7684c;
        }

        /* renamed from: o */
        public C1257c mo5994o(int i, C1257c cVar, long j) {
            C1257c cVar2 = cVar;
            cVar.mo7769g(C1257c.f8956a, this.f7687b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0, -9223372036854775807L, 0, 0, 0);
            C1257c cVar3 = cVar;
            cVar3.f8969n = true;
            return cVar3;
        }

        /* renamed from: p */
        public int mo6973p() {
            return 1;
        }
    }

    public MaskingMediaSource(C1080d0 d0Var, boolean z) {
        this.f7675j = d0Var;
        this.f7676k = z && d0Var.mo6831e();
        this.f7677l = new C1257c();
        this.f7678m = new C1256b();
        Timeline g = d0Var.mo6833g();
        if (g != null) {
            this.f7679n = C1114a.m9325v(g, null, null);
            this.f7683r = true;
            return;
        }
        this.f7679n = C1114a.m9324u(d0Var.mo6827a());
    }

    /* renamed from: H */
    private Object m9308H(Object obj) {
        return (this.f7679n.f7686e == null || !this.f7679n.f7686e.equals(obj)) ? obj : C1114a.f7684c;
    }

    /* renamed from: I */
    private Object m9309I(Object obj) {
        return (this.f7679n.f7686e == null || !obj.equals(C1114a.f7684c)) ? obj : this.f7679n.f7686e;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* renamed from: M */
    private void m9310M(long j) {
        MaskingMediaPeriod xVar = this.f7680o;
        int b = this.f7679n.mo5987b(xVar.f7666a.f7391a);
        if (b != -1) {
            long j2 = this.f7679n.mo7738f(b, this.f7678m).f8953d;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            xVar.mo7023w(j);
        }
    }

    /* renamed from: G */
    public MaskingMediaPeriod mo6830d(C1081a aVar, Allocator eVar, long j) {
        MaskingMediaPeriod xVar = new MaskingMediaPeriod(aVar, eVar, j);
        xVar.mo7025y(this.f7675j);
        if (this.f7682q) {
            xVar.mo7019h(aVar.mo6840c(m9309I(aVar.f7391a)));
        } else {
            this.f7680o = xVar;
            if (!this.f7681p) {
                this.f7681p = true;
                mo6970F(null, this.f7675j);
            }
        }
        return xVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public C1081a mo6971z(Void voidR, C1081a aVar) {
        return aVar.mo6840c(m9308H(aVar.f7391a));
    }

    /* renamed from: K */
    public Timeline mo7030K() {
        return this.f7679n;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6969E(java.lang.Void r13, p067c.p068a.p069a.p070a.p097j2.C1080d0 r14, p067c.p068a.p069a.p070a.Timeline r15) {
        /*
            r12 = this;
            boolean r13 = r12.f7682q
            if (r13 == 0) goto L_0x0019
            c.a.a.a.j2.y$a r13 = r12.f7679n
            c.a.a.a.j2.y$a r13 = r13.mo7032t(r15)
            r12.f7679n = r13
            c.a.a.a.j2.x r13 = r12.f7680o
            if (r13 == 0) goto L_0x00ae
            long r13 = r13.mo7020i()
            r12.m9310M(r13)
            goto L_0x00ae
        L_0x0019:
            boolean r13 = r15.mo7743q()
            if (r13 == 0) goto L_0x0036
            boolean r13 = r12.f7683r
            if (r13 == 0) goto L_0x002a
            c.a.a.a.j2.y$a r13 = r12.f7679n
            c.a.a.a.j2.y$a r13 = r13.mo7032t(r15)
            goto L_0x0032
        L_0x002a:
            java.lang.Object r13 = p067c.p068a.p069a.p070a.Timeline.C1257c.f8956a
            java.lang.Object r14 = p067c.p068a.p069a.p070a.p097j2.MaskingMediaSource.C1114a.f7684c
            c.a.a.a.j2.y$a r13 = p067c.p068a.p069a.p070a.p097j2.MaskingMediaSource.C1114a.m9325v(r15, r13, r14)
        L_0x0032:
            r12.f7679n = r13
            goto L_0x00ae
        L_0x0036:
            c.a.a.a.x1$c r13 = r12.f7677l
            r14 = 0
            r15.mo7742n(r14, r13)
            c.a.a.a.x1$c r13 = r12.f7677l
            long r0 = r13.mo7764c()
            c.a.a.a.x1$c r13 = r12.f7677l
            java.lang.Object r13 = r13.f8958c
            c.a.a.a.j2.x r2 = r12.f7680o
            if (r2 == 0) goto L_0x0074
            long r2 = r2.mo7021q()
            c.a.a.a.j2.y$a r4 = r12.f7679n
            c.a.a.a.j2.x r5 = r12.f7680o
            c.a.a.a.j2.d0$a r5 = r5.f7666a
            java.lang.Object r5 = r5.f7391a
            c.a.a.a.x1$b r6 = r12.f7678m
            r4.mo5991h(r5, r6)
            c.a.a.a.x1$b r4 = r12.f7678m
            long r4 = r4.mo7758l()
            long r4 = r4 + r2
            c.a.a.a.j2.y$a r2 = r12.f7679n
            c.a.a.a.x1$c r3 = r12.f7677l
            c.a.a.a.x1$c r14 = r2.mo7742n(r14, r3)
            long r2 = r14.mo7764c()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0074
            r10 = r4
            goto L_0x0075
        L_0x0074:
            r10 = r0
        L_0x0075:
            c.a.a.a.x1$c r7 = r12.f7677l
            c.a.a.a.x1$b r8 = r12.f7678m
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.mo7740j(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f7683r
            if (r14 == 0) goto L_0x0094
            c.a.a.a.j2.y$a r13 = r12.f7679n
            c.a.a.a.j2.y$a r13 = r13.mo7032t(r15)
            goto L_0x0098
        L_0x0094:
            c.a.a.a.j2.y$a r13 = p067c.p068a.p069a.p070a.p097j2.MaskingMediaSource.C1114a.m9325v(r15, r13, r0)
        L_0x0098:
            r12.f7679n = r13
            c.a.a.a.j2.x r13 = r12.f7680o
            if (r13 == 0) goto L_0x00ae
            r12.m9310M(r1)
            c.a.a.a.j2.d0$a r13 = r13.f7666a
            java.lang.Object r14 = r13.f7391a
            java.lang.Object r14 = r12.m9309I(r14)
            c.a.a.a.j2.d0$a r13 = r13.mo6840c(r14)
            goto L_0x00af
        L_0x00ae:
            r13 = 0
        L_0x00af:
            r14 = 1
            r12.f7683r = r14
            r12.f7682q = r14
            c.a.a.a.j2.y$a r14 = r12.f7679n
            r12.mo6926x(r14)
            if (r13 == 0) goto L_0x00c6
            c.a.a.a.j2.x r14 = r12.f7680o
            java.lang.Object r14 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r14)
            c.a.a.a.j2.x r14 = (p067c.p068a.p069a.p070a.p097j2.MaskingMediaPeriod) r14
            r14.mo7019h(r13)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p097j2.MaskingMediaSource.mo6969E(java.lang.Void, c.a.a.a.j2.d0, c.a.a.a.x1):void");
    }

    /* renamed from: a */
    public MediaItem mo6827a() {
        return this.f7675j.mo6827a();
    }

    /* renamed from: c */
    public void mo6829c() {
    }

    /* renamed from: f */
    public void mo6832f(MediaPeriod a0Var) {
        ((MaskingMediaPeriod) a0Var).mo7024x();
        if (a0Var == this.f7680o) {
            this.f7680o = null;
        }
    }

    /* renamed from: w */
    public void mo6904w(TransferListener e0Var) {
        super.mo6904w(e0Var);
        if (!this.f7676k) {
            this.f7681p = true;
            mo6970F(null, this.f7675j);
        }
    }

    /* renamed from: y */
    public void mo6905y() {
        this.f7682q = false;
        this.f7681p = false;
        super.mo6905y();
    }
}
