package p067c.p068a.p069a.p070a;

import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.C1155l1.C1156a;
import p067c.p068a.p069a.p070a.C1155l1.C1157b;
import p067c.p068a.p069a.p070a.C1155l1.C1158c;
import p067c.p068a.p069a.p070a.C1155l1.C1159d;
import p067c.p068a.p069a.p070a.ExoPlayerImplInternal.C1236e;
import p067c.p068a.p069a.p070a.ExoPlayerImplInternal.C1237f;
import p067c.p068a.p069a.p070a.PlayerMessage.C1183b;
import p067c.p068a.p069a.p070a.Timeline.C1256b;
import p067c.p068a.p069a.p070a.p071a2.AnalyticsCollector;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p097j2.C1080d0;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceFactory;
import p067c.p068a.p069a.p070a.p097j2.ShuffleOrder;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p110l2.TrackSelectionArray;
import p067c.p068a.p069a.p070a.p110l2.TrackSelector;
import p067c.p068a.p069a.p070a.p110l2.TrackSelectorResult;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Clock;
import p067c.p068a.p069a.p070a.p111m2.HandlerWrapper;
import p067c.p068a.p069a.p070a.p111m2.ListenerSet;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p136b.ImmutableList;

/* renamed from: c.a.a.a.q0 */
final class ExoPlayerImpl extends BasePlayer implements C1155l1 {

    /* renamed from: A */
    private int f8685A;

    /* renamed from: B */
    private int f8686B;

    /* renamed from: C */
    private long f8687C;

    /* renamed from: b */
    final TrackSelectorResult f8688b;

    /* renamed from: c */
    private final C1227p1[] f8689c;

    /* renamed from: d */
    private final TrackSelector f8690d;

    /* renamed from: e */
    private final HandlerWrapper f8691e;

    /* renamed from: f */
    private final C1237f f8692f;

    /* renamed from: g */
    private final ExoPlayerImplInternal f8693g;

    /* renamed from: h */
    private final ListenerSet<C1156a, C1157b> f8694h;

    /* renamed from: i */
    private final C1256b f8695i;

    /* renamed from: j */
    private final List<C1230a> f8696j;

    /* renamed from: k */
    private final boolean f8697k;

    /* renamed from: l */
    private final MediaSourceFactory f8698l;

    /* renamed from: m */
    private final AnalyticsCollector f8699m;

    /* renamed from: n */
    private final Looper f8700n;

    /* renamed from: o */
    private final BandwidthMeter f8701o;

    /* renamed from: p */
    private final Clock f8702p;

    /* renamed from: q */
    private int f8703q;

    /* renamed from: r */
    private boolean f8704r;

    /* renamed from: s */
    private int f8705s;

    /* renamed from: t */
    private boolean f8706t;

    /* renamed from: u */
    private int f8707u;

    /* renamed from: v */
    private int f8708v;

    /* renamed from: w */
    private SeekParameters f8709w;

    /* renamed from: x */
    private ShuffleOrder f8710x;

    /* renamed from: y */
    private boolean f8711y;

    /* renamed from: z */
    private PlaybackInfo f8712z;

    /* renamed from: c.a.a.a.q0$a */
    /* compiled from: ExoPlayerImpl */
    private static final class C1230a implements MediaSourceInfoHolder {

        /* renamed from: a */
        private final Object f8713a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Timeline f8714b;

        public C1230a(Object obj, Timeline x1Var) {
            this.f8713a = obj;
            this.f8714b = x1Var;
        }

        /* renamed from: a */
        public Object mo6026a() {
            return this.f8713a;
        }

        /* renamed from: b */
        public Timeline mo6027b() {
            return this.f8714b;
        }
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [c.a.a.a.l1] */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"HandlerLeak"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExoPlayerImpl(p067c.p068a.p069a.p070a.C1227p1[] r19, p067c.p068a.p069a.p070a.p110l2.TrackSelector r20, p067c.p068a.p069a.p070a.p097j2.MediaSourceFactory r21, p067c.p068a.p069a.p070a.LoadControl r22, com.google.android.exoplayer2.upstream.BandwidthMeter r23, p067c.p068a.p069a.p070a.p071a2.AnalyticsCollector r24, boolean r25, p067c.p068a.p069a.p070a.SeekParameters r26, p067c.p068a.p069a.p070a.LivePlaybackSpeedControl r27, long r28, boolean r30, p067c.p068a.p069a.p070a.p111m2.Clock r31, android.os.Looper r32, p067c.p068a.p069a.p070a.C1155l1 r33) {
        /*
            r18 = this;
            r0 = r18
            r2 = r19
            r6 = r23
            r9 = r24
            r15 = r31
            r14 = r32
            r18.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Init "
            r1.append(r3)
            int r3 = java.lang.System.identityHashCode(r18)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = " ["
            r1.append(r3)
            java.lang.String r3 = "ExoPlayerLib/2.13.3"
            r1.append(r3)
            java.lang.String r3 = "] ["
            r1.append(r3)
            java.lang.String r3 = p067c.p068a.p069a.p070a.p111m2.Util.f8402e
            r1.append(r3)
            java.lang.String r3 = "]"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "ExoPlayerImpl"
            p067c.p068a.p069a.p070a.p111m2.Log.m10384f(r3, r1)
            int r1 = r2.length
            r3 = 0
            if (r1 <= 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10154f(r1)
            java.lang.Object r1 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r19)
            c.a.a.a.p1[] r1 = (p067c.p068a.p069a.p070a.C1227p1[]) r1
            r0.f8689c = r1
            java.lang.Object r1 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r20)
            c.a.a.a.l2.n r1 = (p067c.p068a.p069a.p070a.p110l2.TrackSelector) r1
            r0.f8690d = r1
            r1 = r21
            r0.f8698l = r1
            r0.f8701o = r6
            r0.f8699m = r9
            r1 = r25
            r0.f8697k = r1
            r10 = r26
            r0.f8709w = r10
            r12 = r30
            r0.f8711y = r12
            r0.f8700n = r14
            r0.f8702p = r15
            r0.f8703q = r3
            if (r33 == 0) goto L_0x007f
            r1 = r33
            goto L_0x0080
        L_0x007f:
            r1 = r0
        L_0x0080:
            c.a.a.a.m2.s r4 = new c.a.a.a.m2.s
            c.a.a.a.b0 r5 = p067c.p068a.p069a.p070a.C0809b0.f5395a
            c.a.a.a.l r7 = new c.a.a.a.l
            r7.<init>(r1)
            r4.<init>(r14, r15, r5, r7)
            r0.f8694h = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.f8696j = r4
            c.a.a.a.j2.n0$a r4 = new c.a.a.a.j2.n0$a
            r4.<init>(r3)
            r0.f8710x = r4
            c.a.a.a.l2.o r4 = new c.a.a.a.l2.o
            int r3 = r2.length
            c.a.a.a.s1[] r3 = new p067c.p068a.p069a.p070a.RendererConfiguration[r3]
            int r5 = r2.length
            c.a.a.a.l2.h[] r5 = new p067c.p068a.p069a.p070a.p110l2.C1174h[r5]
            r7 = 0
            r4.<init>(r3, r5, r7)
            r0.f8688b = r4
            c.a.a.a.x1$b r3 = new c.a.a.a.x1$b
            r3.<init>()
            r0.f8695i = r3
            r3 = -1
            r0.f8685A = r3
            c.a.a.a.m2.q r3 = r15.mo7424b(r14, r7)
            r0.f8691e = r3
            c.a.a.a.o r13 = new c.a.a.a.o
            r13.<init>(r0)
            r0.f8692f = r13
            c.a.a.a.h1 r3 = p067c.p068a.p069a.p070a.PlaybackInfo.m8677k(r4)
            r0.f8712z = r3
            if (r9 == 0) goto L_0x00d7
            r9.mo5663p1(r1, r14)
            r0.mo7192C(r9)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r14)
            r6.mo14930g(r1, r9)
        L_0x00d7:
            c.a.a.a.r0 r11 = new c.a.a.a.r0
            r1 = r11
            int r7 = r0.f8703q
            boolean r8 = r0.f8704r
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r9 = r24
            r10 = r26
            r0 = r11
            r11 = r27
            r17 = r13
            r12 = r28
            r14 = r30
            r15 = r32
            r16 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            r1 = r0
            r0 = r18
            r0.f8693g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.ExoPlayerImpl.<init>(c.a.a.a.p1[], c.a.a.a.l2.n, c.a.a.a.j2.f0, c.a.a.a.y0, com.google.android.exoplayer2.upstream.g, c.a.a.a.a2.c1, boolean, c.a.a.a.u1, c.a.a.a.x0, long, boolean, c.a.a.a.m2.g, android.os.Looper, c.a.a.a.l1):void");
    }

    /* renamed from: J0 */
    private PlaybackInfo m10714J0(PlaybackInfo h1Var, Timeline x1Var, Pair<Object, Long> pair) {
        long j;
        Timeline x1Var2 = x1Var;
        Pair<Object, Long> pair2 = pair;
        Assertions.m10149a(x1Var.mo7743q() || pair2 != null);
        Timeline x1Var3 = h1Var.f7203b;
        PlaybackInfo j2 = h1Var.mo6545j(x1Var);
        if (x1Var.mo7743q()) {
            C1081a l = PlaybackInfo.m8678l();
            PlaybackInfo b = j2.mo6538c(l, C.m8860c(this.f8687C), C.m8860c(this.f8687C), 0, TrackGroupArray.f7609a, this.f8688b, ImmutableList.m11917p()).mo6537b(l);
            b.f7218q = b.f7220s;
            return b;
        }
        Object obj = j2.f7204c.f7391a;
        boolean z = !obj.equals(((Pair) Util.m10293i(pair)).first);
        C1081a aVar = z ? new C1081a(pair2.first) : j2.f7204c;
        long longValue = ((Long) pair2.second).longValue();
        long c = C.m8860c(mo7214i());
        if (!x1Var3.mo7743q()) {
            c -= x1Var3.mo5991h(obj, this.f8695i).mo7758l();
        }
        if (z || longValue < c) {
            C1081a aVar2 = aVar;
            Assertions.m10154f(!aVar2.mo6822b());
            long j3 = longValue;
            j2 = j2.mo6538c(aVar2, longValue, longValue, 0, z ? TrackGroupArray.f7609a : j2.f7209h, z ? this.f8688b : j2.f7210i, z ? ImmutableList.m11917p() : j2.f7211j).mo6537b(aVar2);
            j2.f7218q = j3;
        } else if (longValue == c) {
            int b2 = x1Var2.mo5987b(j2.f7212k.f7391a);
            if (b2 == -1 || x1Var2.mo7738f(b2, this.f8695i).f8952c != x1Var2.mo5991h(aVar.f7391a, this.f8695i).f8952c) {
                x1Var2.mo5991h(aVar.f7391a, this.f8695i);
                if (aVar.mo6822b()) {
                    j = this.f8695i.mo7746b(aVar.f7392b, aVar.f7393c);
                } else {
                    j = this.f8695i.f8953d;
                }
                j2 = j2.mo6538c(aVar, j2.f7220s, j2.f7220s, j - j2.f7220s, j2.f7209h, j2.f7210i, j2.f7211j).mo6537b(aVar);
                j2.f7218q = j;
            }
        } else {
            C1081a aVar3 = aVar;
            Assertions.m10154f(!aVar3.mo6822b());
            long max = Math.max(0, j2.f7219r - (longValue - c));
            long j4 = j2.f7218q;
            if (j2.f7212k.equals(j2.f7204c)) {
                j4 = longValue + max;
            }
            j2 = j2.mo6538c(aVar3, longValue, longValue, max, j2.f7209h, j2.f7210i, j2.f7211j);
            j2.f7218q = j4;
        }
        return j2;
    }

    /* renamed from: K0 */
    private long m10715K0(C1081a aVar, long j) {
        long d = C.m8861d(j);
        this.f8712z.f7203b.mo5991h(aVar.f7391a, this.f8695i);
        return d + this.f8695i.mo7757k();
    }

    /* renamed from: M0 */
    private PlaybackInfo m10716M0(int i, int i2) {
        boolean z = false;
        Assertions.m10149a(i >= 0 && i2 >= i && i2 <= this.f8696j.size());
        int R = mo7203R();
        Timeline M = mo7198M();
        int size = this.f8696j.size();
        this.f8705s++;
        m10717N0(i, i2);
        Timeline d0 = m10721d0();
        PlaybackInfo J0 = m10714J0(this.f8712z, d0, m10724i0(M, d0));
        int i3 = J0.f7206e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && R >= J0.f7203b.mo6973p()) {
            z = true;
        }
        if (z) {
            J0 = J0.mo6543h(4);
        }
        this.f8693g.mo7652i0(i, i2, this.f8710x);
        return J0;
    }

    /* renamed from: N0 */
    private void m10717N0(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.f8696j.remove(i3);
        }
        this.f8710x = this.f8710x.mo6959b(i, i2);
    }

    /* renamed from: Q0 */
    private void m10718Q0(List<C1080d0> list, int i, long j, boolean z) {
        int i2 = i;
        int h0 = m10723h0();
        long W = mo7206W();
        this.f8705s++;
        if (!this.f8696j.isEmpty()) {
            m10717N0(0, this.f8696j.size());
        }
        List<C1080d0> list2 = list;
        List c0 = m10720c0(0, list);
        Timeline d0 = m10721d0();
        if (d0.mo7743q() || i2 < d0.mo6973p()) {
            long j2 = j;
            if (z) {
                i2 = d0.mo5986a(this.f8704r);
                j2 = -9223372036854775807L;
            } else if (i2 == -1) {
                i2 = h0;
                j2 = W;
            }
            PlaybackInfo J0 = m10714J0(this.f8712z, d0, m10725j0(d0, i2, j2));
            int i3 = J0.f7206e;
            if (!(i2 == -1 || i3 == 1)) {
                i3 = (d0.mo7743q() || i2 >= d0.mo6973p()) ? 4 : 2;
            }
            PlaybackInfo h = J0.mo6543h(i3);
            this.f8693g.mo7641H0(c0, i2, C.m8860c(j2), this.f8710x);
            m10719T0(h, false, 4, 0, 1, false);
            return;
        }
        throw new IllegalSeekPositionException(d0, i2, j);
    }

    /* renamed from: T0 */
    private void m10719T0(PlaybackInfo h1Var, boolean z, int i, int i2, int i3, boolean z2) {
        MediaItem z0Var;
        PlaybackInfo h1Var2 = this.f8712z;
        this.f8712z = h1Var;
        Pair f0 = m10722f0(h1Var, h1Var2, z, i, !h1Var2.f7203b.equals(h1Var.f7203b));
        boolean booleanValue = ((Boolean) f0.first).booleanValue();
        int intValue = ((Integer) f0.second).intValue();
        if (!h1Var2.f7203b.equals(h1Var.f7203b)) {
            this.f8694h.mo7472h(0, new C0850c(h1Var, i2));
        }
        if (z) {
            this.f8694h.mo7472h(12, new C0857d(i));
        }
        if (booleanValue) {
            if (!h1Var.f7203b.mo7743q()) {
                z0Var = h1Var.f7203b.mo7742n(h1Var.f7203b.mo5991h(h1Var.f7204c.f7391a, this.f8695i).f8952c, this.f7024a).f8960e;
            } else {
                z0Var = null;
            }
            this.f8694h.mo7472h(1, new C1231r(z0Var, intValue));
        }
        ExoPlaybackException p0Var = h1Var2.f7207f;
        ExoPlaybackException p0Var2 = h1Var.f7207f;
        if (!(p0Var == p0Var2 || p0Var2 == null)) {
            this.f8694h.mo7472h(11, new C1202n(h1Var));
        }
        TrackSelectorResult oVar = h1Var2.f7210i;
        TrackSelectorResult oVar2 = h1Var.f7210i;
        if (oVar != oVar2) {
            this.f8690d.mo7313c(oVar2.f8306d);
            this.f8694h.mo7472h(2, new C1181m(h1Var, new TrackSelectionArray(h1Var.f7210i.f8305c)));
        }
        if (!h1Var2.f7211j.equals(h1Var.f7211j)) {
            this.f8694h.mo7472h(3, new C1074j(h1Var));
        }
        if (h1Var2.f7208g != h1Var.f7208g) {
            this.f8694h.mo7472h(4, new C0902f(h1Var));
        }
        if (!(h1Var2.f7206e == h1Var.f7206e && h1Var2.f7213l == h1Var.f7213l)) {
            this.f8694h.mo7472h(-1, new C1226p(h1Var));
        }
        if (h1Var2.f7206e != h1Var.f7206e) {
            this.f8694h.mo7472h(5, new C1116k(h1Var));
        }
        if (h1Var2.f7213l != h1Var.f7213l) {
            this.f8694h.mo7472h(6, new C1246v(h1Var, i3));
        }
        if (h1Var2.f7214m != h1Var.f7214m) {
            this.f8694h.mo7472h(7, new C1241s(h1Var));
        }
        if (m10727l0(h1Var2) != m10727l0(h1Var)) {
            this.f8694h.mo7472h(8, new C1072i(h1Var));
        }
        if (!h1Var2.f7215n.equals(h1Var.f7215n)) {
            this.f8694h.mo7472h(13, new C1250w(h1Var));
        }
        if (z2) {
            this.f8694h.mo7472h(-1, lambda.f5242a);
        }
        if (h1Var2.f7216o != h1Var.f7216o) {
            this.f8694h.mo7472h(-1, new C1004g(h1Var));
        }
        if (h1Var2.f7217p != h1Var.f7217p) {
            this.f8694h.mo7472h(-1, new C1243u(h1Var));
        }
        this.f8694h.mo7470c();
    }

    /* renamed from: c0 */
    private List<C0907c> m10720c0(int i, List<C1080d0> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C0907c cVar = new C0907c((C1080d0) list.get(i2), this.f8697k);
            arrayList.add(cVar);
            this.f8696j.add(i2 + i, new C1230a(cVar.f5965b, cVar.f5964a.mo7030K()));
        }
        this.f8710x = this.f8710x.mo6961d(i, arrayList.size());
        return arrayList;
    }

    /* renamed from: d0 */
    private Timeline m10721d0() {
        return new PlaylistTimeline(this.f8696j, this.f8710x);
    }

    /* renamed from: f0 */
    private Pair<Boolean, Integer> m10722f0(PlaybackInfo h1Var, PlaybackInfo h1Var2, boolean z, int i, boolean z2) {
        Timeline x1Var = h1Var2.f7203b;
        Timeline x1Var2 = h1Var.f7203b;
        boolean q = x1Var2.mo7743q();
        Integer valueOf = Integer.valueOf(-1);
        if (q && x1Var.mo7743q()) {
            return new Pair<>(Boolean.FALSE, valueOf);
        }
        int i2 = 3;
        if (x1Var2.mo7743q() != x1Var.mo7743q()) {
            return new Pair<>(Boolean.TRUE, Integer.valueOf(3));
        }
        Object obj = x1Var.mo7742n(x1Var.mo5991h(h1Var2.f7204c.f7391a, this.f8695i).f8952c, this.f7024a).f8958c;
        Object obj2 = x1Var2.mo7742n(x1Var2.mo5991h(h1Var.f7204c.f7391a, this.f8695i).f8952c, this.f7024a).f8958c;
        int i3 = this.f7024a.f8970o;
        if (!obj.equals(obj2)) {
            if (z && i == 0) {
                i2 = 1;
            } else if (z && i == 1) {
                i2 = 2;
            } else if (!z2) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
        } else if (z && i == 0 && x1Var2.mo5987b(h1Var.f7204c.f7391a) == i3) {
            return new Pair<>(Boolean.TRUE, Integer.valueOf(0));
        } else {
            return new Pair<>(Boolean.FALSE, valueOf);
        }
    }

    /* renamed from: h0 */
    private int m10723h0() {
        if (this.f8712z.f7203b.mo7743q()) {
            return this.f8685A;
        }
        PlaybackInfo h1Var = this.f8712z;
        return h1Var.f7203b.mo5991h(h1Var.f7204c.f7391a, this.f8695i).f8952c;
    }

    /* renamed from: i0 */
    private Pair<Object, Long> m10724i0(Timeline x1Var, Timeline x1Var2) {
        long i = mo7214i();
        int i2 = -1;
        if (x1Var.mo7743q() || x1Var2.mo7743q()) {
            boolean z = !x1Var.mo7743q() && x1Var2.mo7743q();
            if (!z) {
                i2 = m10723h0();
            }
            if (z) {
                i = -9223372036854775807L;
            }
            return m10725j0(x1Var2, i2, i);
        }
        Pair<Object, Long> j = x1Var.mo7740j(this.f7024a, this.f8695i, mo7203R(), C.m8860c(i));
        Object obj = ((Pair) Util.m10293i(j)).first;
        if (x1Var2.mo5987b(obj) != -1) {
            return j;
        }
        Object t0 = ExoPlayerImplInternal.m10874t0(this.f7024a, this.f8695i, this.f8703q, this.f8704r, obj, x1Var, x1Var2);
        if (t0 == null) {
            return m10725j0(x1Var2, -1, -9223372036854775807L);
        }
        x1Var2.mo5991h(t0, this.f8695i);
        int i3 = this.f8695i.f8952c;
        return m10725j0(x1Var2, i3, x1Var2.mo7742n(i3, this.f7024a).mo7763b());
    }

    /* renamed from: j0 */
    private Pair<Object, Long> m10725j0(Timeline x1Var, int i, long j) {
        if (x1Var.mo7743q()) {
            this.f8685A = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f8687C = j;
            this.f8686B = 0;
            return null;
        }
        if (i == -1 || i >= x1Var.mo6973p()) {
            i = x1Var.mo5986a(this.f8704r);
            j = x1Var.mo7742n(i, this.f7024a).mo7763b();
        }
        return x1Var.mo7740j(this.f7024a, this.f8695i, i, C.m8860c(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m10729n0(C1236e eVar) {
        int i = this.f8705s - eVar.f8773c;
        this.f8705s = i;
        boolean z = true;
        if (eVar.f8774d) {
            this.f8706t = true;
            this.f8707u = eVar.f8775e;
        }
        if (eVar.f8776f) {
            this.f8708v = eVar.f8777g;
        }
        if (i == 0) {
            Timeline x1Var = eVar.f8772b.f7203b;
            if (!this.f8712z.f7203b.mo7743q() && x1Var.mo7743q()) {
                this.f8685A = -1;
                this.f8687C = 0;
                this.f8686B = 0;
            }
            if (!x1Var.mo7743q()) {
                List E = ((PlaylistTimeline) x1Var).mo7514E();
                if (E.size() != this.f8696j.size()) {
                    z = false;
                }
                Assertions.m10154f(z);
                for (int i2 = 0; i2 < E.size(); i2++) {
                    ((C1230a) this.f8696j.get(i2)).f8714b = (Timeline) E.get(i2);
                }
            }
            boolean z2 = this.f8706t;
            this.f8706t = false;
            m10719T0(eVar.f8772b, z2, this.f8707u, 1, this.f8708v, false);
        }
    }

    /* renamed from: l0 */
    private static boolean m10727l0(PlaybackInfo h1Var) {
        return h1Var.f7206e == 3 && h1Var.f7213l && h1Var.f7214m == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public /* synthetic */ void mo7640q0(C1236e eVar) {
        this.f8691e.mo7434i(new C1242t(this, eVar));
    }

    /* renamed from: A */
    public void mo7191A(int i) {
        if (this.f8703q != i) {
            this.f8703q = i;
            this.f8693g.mo7644N0(i);
            this.f8694h.mo7475k(9, new C0858e(i));
        }
    }

    /* renamed from: C */
    public void mo7192C(C1156a aVar) {
        this.f8694h.mo7468a(aVar);
    }

    /* renamed from: D */
    public int mo7193D() {
        if (mo7213h()) {
            return this.f8712z.f7204c.f7393c;
        }
        return -1;
    }

    /* renamed from: H */
    public int mo7194H() {
        return this.f8712z.f7214m;
    }

    /* renamed from: I */
    public TrackGroupArray mo7195I() {
        return this.f8712z.f7209h;
    }

    /* renamed from: K */
    public int mo7196K() {
        return this.f8703q;
    }

    /* renamed from: L */
    public long mo7197L() {
        if (!mo7213h()) {
            return mo6400Z();
        }
        PlaybackInfo h1Var = this.f8712z;
        C1081a aVar = h1Var.f7204c;
        h1Var.f7203b.mo5991h(aVar.f7391a, this.f8695i);
        return C.m8861d(this.f8695i.mo7746b(aVar.f7392b, aVar.f7393c));
    }

    /* renamed from: L0 */
    public void mo7632L0() {
        StringBuilder sb = new StringBuilder();
        sb.append("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [");
        sb.append("ExoPlayerLib/2.13.3");
        String str = "] [";
        sb.append(str);
        sb.append(Util.f8402e);
        sb.append(str);
        sb.append(ExoPlayerLibraryInfo.m10921b());
        sb.append("]");
        Log.m10384f("ExoPlayerImpl", sb.toString());
        if (!this.f8693g.mo7650f0()) {
            this.f8694h.mo7475k(11, C1229q.f8684a);
        }
        this.f8694h.mo7473i();
        this.f8691e.mo7433h(null);
        AnalyticsCollector c1Var = this.f8699m;
        if (c1Var != null) {
            this.f8701o.mo14928b(c1Var);
        }
        PlaybackInfo h = this.f8712z.mo6543h(1);
        this.f8712z = h;
        PlaybackInfo b = h.mo6537b(h.f7204c);
        this.f8712z = b;
        b.f7218q = b.f7220s;
        this.f8712z.f7219r = 0;
    }

    /* renamed from: M */
    public Timeline mo7198M() {
        return this.f8712z.f7203b;
    }

    /* renamed from: N */
    public Looper mo7199N() {
        return this.f8700n;
    }

    /* renamed from: O */
    public boolean mo7200O() {
        return this.f8704r;
    }

    /* renamed from: O0 */
    public void mo7633O0(C1080d0 d0Var, boolean z) {
        mo7634P0(Collections.singletonList(d0Var), z);
    }

    /* renamed from: P */
    public void mo7201P(C1156a aVar) {
        this.f8694h.mo7474j(aVar);
    }

    /* renamed from: P0 */
    public void mo7634P0(List<C1080d0> list, boolean z) {
        m10718Q0(list, -1, -9223372036854775807L, z);
    }

    /* renamed from: Q */
    public long mo7202Q() {
        if (this.f8712z.f7203b.mo7743q()) {
            return this.f8687C;
        }
        PlaybackInfo h1Var = this.f8712z;
        if (h1Var.f7212k.f7394d != h1Var.f7204c.f7394d) {
            return h1Var.f7203b.mo7742n(mo7203R(), this.f7024a).mo7765d();
        }
        long j = h1Var.f7218q;
        if (this.f8712z.f7212k.mo6822b()) {
            PlaybackInfo h1Var2 = this.f8712z;
            C1256b h = h1Var2.f7203b.mo5991h(h1Var2.f7212k.f7391a, this.f8695i);
            long f = h.mo7751f(this.f8712z.f7212k.f7392b);
            j = f == Long.MIN_VALUE ? h.f8953d : f;
        }
        return m10715K0(this.f8712z.f7212k, j);
    }

    /* renamed from: R */
    public int mo7203R() {
        int h0 = m10723h0();
        if (h0 == -1) {
            return 0;
        }
        return h0;
    }

    /* renamed from: R0 */
    public void mo7635R0(boolean z, int i, int i2) {
        PlaybackInfo h1Var = this.f8712z;
        if (h1Var.f7213l != z || h1Var.f7214m != i) {
            this.f8705s++;
            PlaybackInfo e = h1Var.mo6540e(z, i);
            this.f8693g.mo7642K0(z, i);
            m10719T0(e, false, 4, 0, i2, false);
        }
    }

    /* renamed from: S0 */
    public void mo7636S0(boolean z, ExoPlaybackException p0Var) {
        PlaybackInfo h1Var;
        if (z) {
            h1Var = m10716M0(0, this.f8696j.size()).mo6541f(null);
        } else {
            PlaybackInfo h1Var2 = this.f8712z;
            h1Var = h1Var2.mo6537b(h1Var2.f7204c);
            h1Var.f7218q = h1Var.f7220s;
            h1Var.f7219r = 0;
        }
        PlaybackInfo h = h1Var.mo6543h(1);
        if (p0Var != null) {
            h = h.mo6541f(p0Var);
        }
        PlaybackInfo h1Var3 = h;
        this.f8705s++;
        this.f8693g.mo7647b1();
        m10719T0(h1Var3, false, 4, 0, 1, false);
    }

    /* renamed from: T */
    public TrackSelectionArray mo7204T() {
        return new TrackSelectionArray(this.f8712z.f7210i.f8305c);
    }

    /* renamed from: U */
    public int mo7205U(int i) {
        return this.f8689c[i].mo6518g();
    }

    /* renamed from: W */
    public long mo7206W() {
        if (this.f8712z.f7203b.mo7743q()) {
            return this.f8687C;
        }
        if (this.f8712z.f7204c.mo6822b()) {
            return C.m8861d(this.f8712z.f7220s);
        }
        PlaybackInfo h1Var = this.f8712z;
        return m10715K0(h1Var.f7204c, h1Var.f7220s);
    }

    /* renamed from: Y */
    public C1158c mo7207Y() {
        return null;
    }

    /* renamed from: c */
    public PlaybackParameters mo7208c() {
        return this.f8712z.f7215n;
    }

    /* renamed from: d */
    public void mo7209d() {
        PlaybackInfo h1Var = this.f8712z;
        if (h1Var.f7206e == 1) {
            PlaybackInfo f = h1Var.mo6541f(null);
            PlaybackInfo h = f.mo6543h(f.f7203b.mo7743q() ? 4 : 2);
            this.f8705s++;
            this.f8693g.mo7649d0();
            m10719T0(h, false, 4, 1, 1, false);
        }
    }

    /* renamed from: e */
    public ExoPlaybackException mo7210e() {
        return this.f8712z.f7207f;
    }

    /* renamed from: e0 */
    public PlayerMessage mo7637e0(C1183b bVar) {
        PlayerMessage m1Var = new PlayerMessage(this.f8693g, bVar, this.f8712z.f7203b, mo7203R(), this.f8702p, this.f8693g.mo7654x());
        return m1Var;
    }

    /* renamed from: f */
    public void mo7211f(boolean z) {
        mo7635R0(z, 0, 1);
    }

    /* renamed from: g */
    public C1159d mo7212g() {
        return null;
    }

    /* renamed from: g0 */
    public boolean mo7638g0() {
        return this.f8712z.f7217p;
    }

    /* renamed from: h */
    public boolean mo7213h() {
        return this.f8712z.f7204c.mo6822b();
    }

    /* renamed from: i */
    public long mo7214i() {
        long j;
        if (!mo7213h()) {
            return mo7206W();
        }
        PlaybackInfo h1Var = this.f8712z;
        h1Var.f7203b.mo5991h(h1Var.f7204c.f7391a, this.f8695i);
        PlaybackInfo h1Var2 = this.f8712z;
        if (h1Var2.f7205d == -9223372036854775807L) {
            j = h1Var2.f7203b.mo7742n(mo7203R(), this.f7024a).mo7763b();
        } else {
            j = this.f8695i.mo7757k() + C.m8861d(this.f8712z.f7205d);
        }
        return j;
    }

    /* renamed from: j */
    public long mo7215j() {
        return C.m8861d(this.f8712z.f7219r);
    }

    /* renamed from: k */
    public void mo7216k(int i, long j) {
        Timeline x1Var = this.f8712z.f7203b;
        if (i < 0 || (!x1Var.mo7743q() && i >= x1Var.mo6973p())) {
            throw new IllegalSeekPositionException(x1Var, i, j);
        }
        int i2 = 1;
        this.f8705s++;
        if (mo7213h()) {
            Log.m10386h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            C1236e eVar = new C1236e(this.f8712z);
            eVar.mo7658b(1);
            this.f8692f.mo7620a(eVar);
            return;
        }
        if (mo7219q() != 1) {
            i2 = 2;
        }
        PlaybackInfo J0 = m10714J0(this.f8712z.mo6543h(i2), x1Var, m10725j0(x1Var, i, j));
        this.f8693g.mo7653v0(x1Var, i, C.m8860c(j));
        m10719T0(J0, true, 1, 0, 1, true);
    }

    /* renamed from: n */
    public boolean mo7217n() {
        return this.f8712z.f7213l;
    }

    /* renamed from: p */
    public void mo7218p(boolean z) {
        if (this.f8704r != z) {
            this.f8704r = z;
            this.f8693g.mo7646Q0(z);
            this.f8694h.mo7475k(10, new C1032h(z));
        }
    }

    /* renamed from: q */
    public int mo7219q() {
        return this.f8712z.f7206e;
    }

    /* renamed from: r */
    public List<Metadata> mo7220r() {
        return this.f8712z.f7211j;
    }

    /* renamed from: u */
    public int mo7221u() {
        if (this.f8712z.f7203b.mo7743q()) {
            return this.f8686B;
        }
        PlaybackInfo h1Var = this.f8712z;
        return h1Var.f7203b.mo5987b(h1Var.f7204c.f7391a);
    }

    /* renamed from: z */
    public int mo7222z() {
        if (mo7213h()) {
            return this.f8712z.f7204c.f7392b;
        }
        return -1;
    }
}
