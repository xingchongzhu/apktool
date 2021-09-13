package p067c.p068a.p069a.p070a.p097j2;

import android.net.Uri;
import p067c.p068a.p069a.p070a.MediaItem;
import p067c.p068a.p069a.p070a.MediaItem.C1262c;
import p067c.p068a.p069a.p070a.MediaItem.C1265f;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.Timeline.C1256b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.j2.o0 */
public final class SinglePeriodTimeline extends Timeline {

    /* renamed from: b */
    private static final Object f7591b = new Object();

    /* renamed from: c */
    private static final MediaItem f7592c = new C1262c().mo7783d("SinglePeriodTimeline").mo7786g(Uri.EMPTY).mo7780a();

    /* renamed from: d */
    private final long f7593d;

    /* renamed from: e */
    private final long f7594e;

    /* renamed from: f */
    private final long f7595f;

    /* renamed from: g */
    private final long f7596g;

    /* renamed from: h */
    private final long f7597h;

    /* renamed from: i */
    private final long f7598i;

    /* renamed from: j */
    private final long f7599j;

    /* renamed from: k */
    private final boolean f7600k;

    /* renamed from: l */
    private final boolean f7601l;

    /* renamed from: m */
    private final Object f7602m;

    /* renamed from: n */
    private final MediaItem f7603n;

    /* renamed from: o */
    private final C1265f f7604o;

    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, Object obj, MediaItem z0Var) {
        this(j, j, 0, 0, z, z2, z3, obj, z0Var);
    }

    /* renamed from: b */
    public int mo5987b(Object obj) {
        return f7591b.equals(obj) ? 0 : -1;
    }

    /* renamed from: g */
    public C1256b mo5990g(int i, C1256b bVar, boolean z) {
        Assertions.m10151c(i, 0, 1);
        return bVar.mo7760n(null, z ? f7591b : null, 0, this.f7596g, -this.f7598i);
    }

    /* renamed from: i */
    public int mo6972i() {
        return 1;
    }

    /* renamed from: m */
    public Object mo5993m(int i) {
        Assertions.m10151c(i, 0, 1);
        return f7591b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r1 > r5) goto L_0x0020;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p067c.p068a.p069a.p070a.Timeline.C1257c mo5994o(int r25, p067c.p068a.p069a.p070a.Timeline.C1257c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10151c(r3, r1, r2)
            long r1 = r0.f7599j
            boolean r14 = r0.f7601l
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L_0x002a
            r5 = 0
            int r7 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x002a
            long r5 = r0.f7597h
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0023
        L_0x0020:
            r16 = r3
            goto L_0x002c
        L_0x0023:
            long r1 = r1 + r27
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x002a
            goto L_0x0020
        L_0x002a:
            r16 = r1
        L_0x002c:
            java.lang.Object r4 = p067c.p068a.p069a.p070a.Timeline.C1257c.f8956a
            c.a.a.a.z0 r5 = r0.f7603n
            java.lang.Object r6 = r0.f7602m
            long r7 = r0.f7593d
            long r9 = r0.f7594e
            long r11 = r0.f7595f
            boolean r13 = r0.f7600k
            c.a.a.a.z0$f r15 = r0.f7604o
            long r1 = r0.f7597h
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f7598i
            r22 = r1
            r3 = r26
            c.a.a.a.x1$c r1 = r3.mo7769g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p097j2.SinglePeriodTimeline.mo5994o(int, c.a.a.a.x1$c, long):c.a.a.a.x1$c");
    }

    /* renamed from: p */
    public int mo6973p() {
        return 1;
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, MediaItem z0Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj, z0Var, z3 ? z0Var.f8986c : null);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, Object obj, MediaItem z0Var, C1265f fVar) {
        this.f7593d = j;
        this.f7594e = j2;
        this.f7595f = j3;
        this.f7596g = j4;
        this.f7597h = j5;
        this.f7598i = j6;
        this.f7599j = j7;
        this.f7600k = z;
        this.f7601l = z2;
        this.f7602m = obj;
        this.f7603n = (MediaItem) Assertions.m10153e(z0Var);
        this.f7604o = fVar;
    }
}
