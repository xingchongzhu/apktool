package p067c.p068a.p069a.p070a.p071a2;

import android.os.Looper;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.upstream.BandwidthMeter.C1911a;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.C1155l1;
import p067c.p068a.p069a.p070a.C1155l1.C1156a;
import p067c.p068a.p069a.p070a.C1155l1.C1157b;
import p067c.p068a.p069a.p070a.ExoPlaybackException;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.MediaItem;
import p067c.p068a.p069a.p070a.PlaybackParameters;
import p067c.p068a.p069a.p070a.Player;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.Timeline.C1256b;
import p067c.p068a.p069a.p070a.Timeline.C1257c;
import p067c.p068a.p069a.p070a.p071a2.AnalyticsListener.C0762a;
import p067c.p068a.p069a.p070a.p071a2.AnalyticsListener.C0763b;
import p067c.p068a.p069a.p070a.p072b2.AudioRendererEventListener;
import p067c.p068a.p069a.p070a.p073c2.DecoderCounters;
import p067c.p068a.p069a.p070a.p073c2.DecoderReuseEvaluation;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.LoadEventInfo;
import p067c.p068a.p069a.p070a.p097j2.MediaLoadData;
import p067c.p068a.p069a.p070a.p097j2.MediaPeriodId;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceEventListener;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p110l2.TrackSelectionArray;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Clock;
import p067c.p068a.p069a.p070a.p111m2.ListenerSet;
import p067c.p068a.p069a.p070a.p111m2.ListenerSet.C1195a;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p069a.p070a.p112n2.VideoRendererEventListener;
import p067c.p068a.p134b.p135a.Objects;
import p067c.p068a.p134b.p136b.ImmutableList;
import p067c.p068a.p134b.p136b.ImmutableMap;
import p067c.p068a.p134b.p136b.ImmutableMap.C1387a;
import p067c.p068a.p134b.p136b.Iterables;

/* renamed from: c.a.a.a.a2.c1 */
public class AnalyticsCollector implements C1156a, AudioRendererEventListener, VideoRendererEventListener, MediaSourceEventListener, C1911a, DrmSessionEventListener {

    /* renamed from: a */
    private final Clock f5260a;

    /* renamed from: b */
    private final C1256b f5261b;

    /* renamed from: c */
    private final C1257c f5262c = new C1257c();

    /* renamed from: d */
    private final C0759a f5263d;

    /* renamed from: e */
    private final SparseArray<C0762a> f5264e;

    /* renamed from: f */
    private ListenerSet<AnalyticsListener, C0763b> f5265f;

    /* renamed from: g */
    private C1155l1 f5266g;

    /* renamed from: h */
    private boolean f5267h;

    /* renamed from: c.a.a.a.a2.c1$a */
    /* compiled from: AnalyticsCollector */
    private static final class C0759a {

        /* renamed from: a */
        private final C1256b f5268a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ImmutableList<C1081a> f5269b = ImmutableList.m11917p();

        /* renamed from: c */
        private ImmutableMap<C1081a, Timeline> f5270c = ImmutableMap.m11963j();

        /* renamed from: d */
        private C1081a f5271d;

        /* renamed from: e */
        private C1081a f5272e;

        /* renamed from: f */
        private C1081a f5273f;

        public C0759a(C1256b bVar) {
            this.f5268a = bVar;
        }

        /* renamed from: b */
        private void m6348b(C1387a<C1081a, Timeline> aVar, C1081a aVar2, Timeline x1Var) {
            if (aVar2 != null) {
                if (x1Var.mo5987b(aVar2.f7391a) != -1) {
                    aVar.mo8481c(aVar2, x1Var);
                } else {
                    Timeline x1Var2 = (Timeline) this.f5270c.get(aVar2);
                    if (x1Var2 != null) {
                        aVar.mo8481c(aVar2, x1Var2);
                    }
                }
            }
        }

        /* renamed from: c */
        private static C1081a m6349c(C1155l1 l1Var, ImmutableList<C1081a> rVar, C1081a aVar, C1256b bVar) {
            Timeline M = l1Var.mo7198M();
            int u = l1Var.mo7221u();
            Object m = M.mo7743q() ? null : M.mo5993m(u);
            int d = (l1Var.mo7213h() || M.mo7743q()) ? -1 : M.mo7738f(u, bVar).mo7748d(C.m8860c(l1Var.mo7206W()) - bVar.mo7758l());
            for (int i = 0; i < rVar.size(); i++) {
                C1081a aVar2 = (C1081a) rVar.get(i);
                if (m6350i(aVar2, m, l1Var.mo7213h(), l1Var.mo7222z(), l1Var.mo7193D(), d)) {
                    return aVar2;
                }
            }
            if (rVar.isEmpty() && aVar != null) {
                if (m6350i(aVar, m, l1Var.mo7213h(), l1Var.mo7222z(), l1Var.mo7193D(), d)) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: i */
        private static boolean m6350i(C1081a aVar, Object obj, boolean z, int i, int i2, int i3) {
            boolean z2 = false;
            if (!aVar.f7391a.equals(obj)) {
                return false;
            }
            if ((z && aVar.f7392b == i && aVar.f7393c == i2) || (!z && aVar.f7392b == -1 && aVar.f7395e == i3)) {
                z2 = true;
            }
            return z2;
        }

        /* renamed from: m */
        private void m6351m(Timeline x1Var) {
            C1387a a = ImmutableMap.m11960a();
            if (this.f5269b.isEmpty()) {
                m6348b(a, this.f5272e, x1Var);
                if (!Objects.m11640a(this.f5273f, this.f5272e)) {
                    m6348b(a, this.f5273f, x1Var);
                }
                if (!Objects.m11640a(this.f5271d, this.f5272e) && !Objects.m11640a(this.f5271d, this.f5273f)) {
                    m6348b(a, this.f5271d, x1Var);
                }
            } else {
                for (int i = 0; i < this.f5269b.size(); i++) {
                    m6348b(a, (C1081a) this.f5269b.get(i), x1Var);
                }
                if (!this.f5269b.contains(this.f5271d)) {
                    m6348b(a, this.f5271d, x1Var);
                }
            }
            this.f5270c = a.mo8480a();
        }

        /* renamed from: d */
        public C1081a mo5675d() {
            return this.f5271d;
        }

        /* renamed from: e */
        public C1081a mo5676e() {
            if (this.f5269b.isEmpty()) {
                return null;
            }
            return (C1081a) Iterables.m12008c(this.f5269b);
        }

        /* renamed from: f */
        public Timeline mo5677f(C1081a aVar) {
            return (Timeline) this.f5270c.get(aVar);
        }

        /* renamed from: g */
        public C1081a mo5678g() {
            return this.f5272e;
        }

        /* renamed from: h */
        public C1081a mo5679h() {
            return this.f5273f;
        }

        /* renamed from: j */
        public void mo5680j(C1155l1 l1Var) {
            this.f5271d = m6349c(l1Var, this.f5269b, this.f5272e, this.f5268a);
        }

        /* renamed from: k */
        public void mo5681k(List<C1081a> list, C1081a aVar, C1155l1 l1Var) {
            this.f5269b = ImmutableList.m11916m(list);
            if (!list.isEmpty()) {
                this.f5272e = (C1081a) list.get(0);
                this.f5273f = (C1081a) Assertions.m10153e(aVar);
            }
            if (this.f5271d == null) {
                this.f5271d = m6349c(l1Var, this.f5269b, this.f5272e, this.f5268a);
            }
            m6351m(l1Var.mo7198M());
        }

        /* renamed from: l */
        public void mo5682l(C1155l1 l1Var) {
            this.f5271d = m6349c(l1Var, this.f5269b, this.f5272e, this.f5268a);
            m6351m(l1Var.mo7198M());
        }
    }

    public AnalyticsCollector(Clock gVar) {
        this.f5260a = (Clock) Assertions.m10153e(gVar);
        this.f5265f = new ListenerSet<>(Util.m10259L(), gVar, C0751a.f5246a, C0778l.f5325a);
        C1256b bVar = new C1256b();
        this.f5261b = bVar;
        this.f5263d = new C0759a(bVar);
        this.f5264e = new SparseArray<>();
    }

    /* renamed from: Z0 */
    static /* synthetic */ void m6251Z0(C0762a aVar, String str, long j, AnalyticsListener d1Var) {
        d1Var.mo5683A(aVar, str, j);
        d1Var.mo5732t(aVar, 2, str, j);
    }

    /* renamed from: b1 */
    static /* synthetic */ void m6253b1(C0762a aVar, DecoderCounters dVar, AnalyticsListener d1Var) {
        d1Var.mo5707Y(aVar, dVar);
        d1Var.mo5698P(aVar, 2, dVar);
    }

    /* renamed from: c0 */
    private C0762a m6254c0(C1081a aVar) {
        Timeline x1Var;
        Assertions.m10153e(this.f5266g);
        if (aVar == null) {
            x1Var = null;
        } else {
            x1Var = this.f5263d.mo5677f(aVar);
        }
        if (aVar != null && x1Var != null) {
            return mo5641b0(x1Var, x1Var.mo5991h(aVar.f7391a, this.f5261b).f8952c, aVar);
        }
        int R = this.f5266g.mo7203R();
        Timeline M = this.f5266g.mo7198M();
        if (!(R < M.mo6973p())) {
            M = Timeline.f8949a;
        }
        return mo5641b0(M, R, null);
    }

    /* renamed from: c1 */
    static /* synthetic */ void m6255c1(C0762a aVar, DecoderCounters dVar, AnalyticsListener d1Var) {
        d1Var.mo5694L(aVar, dVar);
        d1Var.mo5692J(aVar, 2, dVar);
    }

    /* renamed from: d0 */
    private C0762a m6256d0() {
        return m6254c0(this.f5263d.mo5676e());
    }

    /* renamed from: e0 */
    private C0762a m6258e0(int i, C1081a aVar) {
        C0762a aVar2;
        Assertions.m10153e(this.f5266g);
        boolean z = true;
        if (aVar != null) {
            if (this.f5263d.mo5677f(aVar) == null) {
                z = false;
            }
            if (z) {
                aVar2 = m6254c0(aVar);
            } else {
                aVar2 = mo5641b0(Timeline.f8949a, i, aVar);
            }
            return aVar2;
        }
        Timeline M = this.f5266g.mo7198M();
        if (i >= M.mo6973p()) {
            z = false;
        }
        if (!z) {
            M = Timeline.f8949a;
        }
        return mo5641b0(M, i, null);
    }

    /* renamed from: e1 */
    static /* synthetic */ void m6259e1(C0762a aVar, Format u0Var, DecoderReuseEvaluation gVar, AnalyticsListener d1Var) {
        d1Var.mo5731s(aVar, u0Var, gVar);
        d1Var.mo5725m(aVar, 2, u0Var);
    }

    /* renamed from: f0 */
    private C0762a m6260f0() {
        return m6254c0(this.f5263d.mo5678g());
    }

    /* renamed from: g0 */
    private C0762a m6262g0() {
        return m6254c0(this.f5263d.mo5679h());
    }

    /* renamed from: h0 */
    static /* synthetic */ void m6264h0(AnalyticsListener d1Var, C0763b bVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ void mo5649i1(C1155l1 l1Var, AnalyticsListener d1Var, C0763b bVar) {
        bVar.mo5743f(this.f5264e);
        d1Var.mo5700R(l1Var, bVar);
    }

    /* renamed from: j0 */
    static /* synthetic */ void m6267j0(C0762a aVar, String str, long j, AnalyticsListener d1Var) {
        d1Var.mo5695M(aVar, str, j);
        d1Var.mo5732t(aVar, 1, str, j);
    }

    /* renamed from: l0 */
    static /* synthetic */ void m6269l0(C0762a aVar, DecoderCounters dVar, AnalyticsListener d1Var) {
        d1Var.mo5689G(aVar, dVar);
        d1Var.mo5698P(aVar, 1, dVar);
    }

    /* renamed from: m0 */
    static /* synthetic */ void m6270m0(C0762a aVar, DecoderCounters dVar, AnalyticsListener d1Var) {
        d1Var.mo5690H(aVar, dVar);
        d1Var.mo5692J(aVar, 1, dVar);
    }

    /* renamed from: n0 */
    static /* synthetic */ void m6271n0(C0762a aVar, Format u0Var, DecoderReuseEvaluation gVar, AnalyticsListener d1Var) {
        d1Var.mo5693K(aVar, u0Var, gVar);
        d1Var.mo5725m(aVar, 1, u0Var);
    }

    /* renamed from: A */
    public final void mo5612A(Format u0Var, DecoderReuseEvaluation gVar) {
        C0762a g0 = m6262g0();
        mo5661o1(g0, 1022, new C0781m0(g0, u0Var, gVar));
    }

    /* renamed from: B */
    public final void mo5613B(long j) {
        C0762a g0 = m6262g0();
        mo5661o1(g0, 1011, new C0805y0(g0, j));
    }

    /* renamed from: C */
    public final void mo5614C(int i, C1081a aVar, Exception exc) {
        C0762a e0 = m6258e0(i, aVar);
        mo5661o1(e0, 1032, new C0792s(e0, exc));
    }

    /* renamed from: D */
    public final void mo5615D(Timeline x1Var, int i) {
        this.f5263d.mo5682l((C1155l1) Assertions.m10153e(this.f5266g));
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 0, new C0796u(a0, i));
    }

    /* renamed from: E */
    public final void mo5616E(int i, C1081a aVar) {
        C0762a e0 = m6258e0(i, aVar);
        mo5661o1(e0, 1031, new C0804y(e0));
    }

    /* renamed from: F */
    public final void mo5617F(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar) {
        C0762a e0 = m6258e0(i, aVar);
        mo5661o1(e0, 1000, new C0785o0(e0, wVar, zVar));
    }

    /* renamed from: G */
    public final void mo5618G(int i) {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 5, new C0755b0(a0, i));
    }

    /* renamed from: H */
    public final void mo5619H(boolean z, int i) {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 6, new C0795t0(a0, z, i));
    }

    /* renamed from: I */
    public final void mo5620I(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar) {
        C0762a e0 = m6258e0(i, aVar);
        mo5661o1(e0, 1001, new C0800w(e0, wVar, zVar));
    }

    /* renamed from: J */
    public final void mo5621J(Surface surface) {
        C0762a g0 = m6262g0();
        mo5661o1(g0, 1027, new C0797u0(g0, surface));
    }

    /* renamed from: K */
    public final void mo5622K(int i, long j, long j2) {
        C0762a d0 = m6256d0();
        C0776k kVar = new C0776k(d0, i, j, j2);
        mo5661o1(d0, 1006, kVar);
    }

    /* renamed from: L */
    public final void mo5623L(TrackGroupArray q0Var, TrackSelectionArray lVar) {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 2, new C0770h(a0, q0Var, lVar));
    }

    /* renamed from: M */
    public final void mo5624M(DecoderCounters dVar) {
        C0762a f0 = m6260f0();
        mo5661o1(f0, 1025, new C0772i(f0, dVar));
    }

    /* renamed from: N */
    public final void mo5625N(String str) {
        C0762a g0 = m6262g0();
        mo5661o1(g0, 1013, new C0766f(g0, str));
    }

    /* renamed from: O */
    public final void mo5626O(String str, long j, long j2) {
        C0762a g0 = m6262g0();
        mo5661o1(g0, 1009, new C0799v0(g0, str, j2));
    }

    /* renamed from: P */
    public final void mo5627P(boolean z) {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 10, new C0798v(a0, z));
    }

    /* renamed from: Q */
    public final void mo5628Q(int i, C1081a aVar) {
        C0762a e0 = m6258e0(i, aVar);
        mo5661o1(e0, 1035, new C0779l0(e0));
    }

    /* renamed from: R */
    public /* synthetic */ void mo5629R(C1155l1 l1Var, C1157b bVar) {
        Player.m9352a(this, l1Var, bVar);
    }

    /* renamed from: S */
    public /* synthetic */ void mo5630S(boolean z) {
        Player.m9353b(this, z);
    }

    /* renamed from: T */
    public final void mo5631T(int i, long j, long j2) {
        C0762a g0 = m6262g0();
        C0807z0 z0Var = new C0807z0(g0, i, j, j2);
        mo5661o1(g0, 1012, z0Var);
    }

    /* renamed from: U */
    public final void mo5632U(int i, long j) {
        C0762a f0 = m6260f0();
        mo5661o1(f0, 1023, new C0806z(f0, i, j));
    }

    /* renamed from: V */
    public final void mo5633V(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar, IOException iOException, boolean z) {
        C0762a e0 = m6258e0(i, aVar);
        C0767f0 f0Var = new C0767f0(e0, wVar, zVar, iOException, z);
        mo5661o1(e0, 1003, f0Var);
    }

    /* renamed from: W */
    public /* synthetic */ void mo5634W(boolean z) {
        Player.m9354c(this, z);
    }

    /* renamed from: X */
    public final void mo5635X(long j, int i) {
        C0762a f0 = m6260f0();
        mo5661o1(f0, 1026, new C0787p0(f0, j, i));
    }

    /* renamed from: Y */
    public final void mo5636Y(int i, C1081a aVar) {
        C0762a e0 = m6258e0(i, aVar);
        mo5661o1(e0, 1033, new C0786p(e0));
    }

    /* renamed from: Z */
    public void mo5637Z(boolean z) {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 8, new C0803x0(a0, z));
    }

    /* renamed from: a */
    public final void mo5638a(boolean z) {
        C0762a g0 = m6262g0();
        mo5661o1(g0, 1017, new C0769g0(g0, z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public final C0762a mo5639a0() {
        return m6254c0(this.f5263d.mo5675d());
    }

    /* renamed from: b */
    public final void mo5640b(int i, int i2, int i3, float f) {
        C0762a g0 = m6262g0();
        C0774j jVar = new C0774j(g0, i, i2, i3, f);
        mo5661o1(g0, 1028, jVar);
    }

    /* access modifiers changed from: protected */
    @RequiresNonNull({"player"})
    /* renamed from: b0 */
    public final C0762a mo5641b0(Timeline x1Var, int i, C1081a aVar) {
        long j;
        Timeline x1Var2 = x1Var;
        int i2 = i;
        C1081a aVar2 = x1Var.mo7743q() ? null : aVar;
        long c = this.f5260a.mo7425c();
        boolean z = true;
        boolean z2 = x1Var2.equals(this.f5266g.mo7198M()) && i2 == this.f5266g.mo7203R();
        long j2 = 0;
        if (aVar2 != null && aVar2.mo6822b()) {
            if (!(z2 && this.f5266g.mo7222z() == aVar2.f7392b && this.f5266g.mo7193D() == aVar2.f7393c)) {
                z = false;
            }
            if (z) {
                j2 = this.f5266g.mo7206W();
            }
        } else if (z2) {
            j = this.f5266g.mo7214i();
            C0762a aVar3 = new C0762a(c, x1Var, i, aVar2, j, this.f5266g.mo7198M(), this.f5266g.mo7203R(), this.f5263d.mo5675d(), this.f5266g.mo7206W(), this.f5266g.mo7215j());
            return aVar3;
        } else if (!x1Var.mo7743q()) {
            j2 = x1Var2.mo7742n(i2, this.f5262c).mo7763b();
        }
        j = j2;
        C0762a aVar32 = new C0762a(c, x1Var, i, aVar2, j, this.f5266g.mo7198M(), this.f5266g.mo7203R(), this.f5263d.mo5675d(), this.f5266g.mo7206W(), this.f5266g.mo7215j());
        return aVar32;
    }

    /* renamed from: c */
    public final void mo5642c(int i) {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 9, new C0789q0(a0, i));
    }

    /* renamed from: d */
    public final void mo5643d(Exception exc) {
        C0762a g0 = m6262g0();
        mo5661o1(g0, 1018, new C0768g(g0, exc));
    }

    /* renamed from: e */
    public final void mo5644e(PlaybackParameters i1Var) {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 13, new C0758c0(a0, i1Var));
    }

    /* renamed from: f */
    public final void mo5645f(int i) {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 7, new C0757c(a0, i));
    }

    /* renamed from: g */
    public final void mo5646g(boolean z, int i) {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, -1, new C0793s0(a0, z, i));
    }

    /* renamed from: h */
    public final void mo5647h(Format u0Var, DecoderReuseEvaluation gVar) {
        C0762a g0 = m6262g0();
        mo5661o1(g0, 1010, new C0783n0(g0, u0Var, gVar));
    }

    /* renamed from: i */
    public /* synthetic */ void mo5648i(boolean z) {
        Player.m9357f(this, z);
    }

    /* renamed from: j */
    public final void mo5650j(int i) {
        if (i == 1) {
            this.f5267h = false;
        }
        this.f5263d.mo5680j((C1155l1) Assertions.m10153e(this.f5266g));
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 12, new C0791r0(a0, i));
    }

    /* renamed from: j1 */
    public final void mo5651j1() {
        if (!this.f5267h) {
            C0762a a0 = mo5639a0();
            this.f5267h = true;
            mo5661o1(a0, -1, new C0801w0(a0));
        }
    }

    /* renamed from: k */
    public final void mo5652k(int i, C1081a aVar) {
        C0762a e0 = m6258e0(i, aVar);
        mo5661o1(e0, 1034, new C0765e0(e0));
    }

    /* renamed from: k1 */
    public final void mo5653k1(Metadata aVar) {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 1007, new C0760d(a0, aVar));
    }

    /* renamed from: l */
    public final void mo5654l(DecoderCounters dVar) {
        C0762a f0 = m6260f0();
        mo5661o1(f0, 1014, new C0794t(f0, dVar));
    }

    /* renamed from: l1 */
    public void mo5655l1(int i, int i2) {
        C0762a g0 = m6262g0();
        mo5661o1(g0, 1029, new C0782n(g0, i, i2));
    }

    /* renamed from: m */
    public final void mo5656m(String str) {
        C0762a g0 = m6262g0();
        mo5661o1(g0, 1024, new C0771h0(g0, str));
    }

    /* renamed from: m1 */
    public void mo5657m1() {
        C0762a a0 = mo5639a0();
        this.f5264e.put(1036, a0);
        this.f5265f.mo7471g(1036, new C0802x(a0));
    }

    /* renamed from: n */
    public final void mo5658n(DecoderCounters dVar) {
        C0762a g0 = m6262g0();
        mo5661o1(g0, 1008, new C0790r(g0, dVar));
    }

    /* renamed from: n1 */
    public final void mo5659n1() {
    }

    /* renamed from: o */
    public final void mo5660o(List<Metadata> list) {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 3, new C0761d0(a0, list));
    }

    /* access modifiers changed from: protected */
    /* renamed from: o1 */
    public final void mo5661o1(C0762a aVar, int i, C1195a<AnalyticsListener> aVar2) {
        this.f5264e.put(i, aVar);
        this.f5265f.mo7475k(i, aVar2);
    }

    /* renamed from: p */
    public final void mo5662p(String str, long j, long j2) {
        C0762a g0 = m6262g0();
        mo5661o1(g0, 1021, new C0780m(g0, str, j2));
    }

    /* renamed from: p1 */
    public void mo5663p1(C1155l1 l1Var, Looper looper) {
        Assertions.m10154f(this.f5266g == null || this.f5263d.f5269b.isEmpty());
        this.f5266g = (C1155l1) Assertions.m10153e(l1Var);
        this.f5265f = this.f5265f.mo7469b(looper, new C0756b1(this, l1Var));
    }

    /* renamed from: q */
    public /* synthetic */ void mo5664q(Timeline x1Var, Object obj, int i) {
        Player.m9371t(this, x1Var, obj, i);
    }

    /* renamed from: q1 */
    public final void mo5665q1(List<C1081a> list, C1081a aVar) {
        this.f5263d.mo5681k(list, aVar, (C1155l1) Assertions.m10153e(this.f5266g));
    }

    /* renamed from: r */
    public final void mo5666r(ExoPlaybackException p0Var) {
        C0762a aVar;
        MediaPeriodId b0Var = p0Var.f8681g;
        if (b0Var != null) {
            aVar = m6254c0(new C1081a(b0Var));
        } else {
            aVar = mo5639a0();
        }
        mo5661o1(aVar, 11, new C0788q(aVar, p0Var));
    }

    /* renamed from: s */
    public final void mo5667s(int i, C1081a aVar, MediaLoadData zVar) {
        C0762a e0 = m6258e0(i, aVar);
        mo5661o1(e0, 1004, new C0764e(e0, zVar));
    }

    /* renamed from: t */
    public final void mo5668t(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar) {
        C0762a e0 = m6258e0(i, aVar);
        mo5661o1(e0, 1002, new C0775j0(e0, wVar, zVar));
    }

    /* renamed from: u */
    public final void mo5669u(boolean z) {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 4, new C0754b(a0, z));
    }

    /* renamed from: v */
    public final void mo5670v(int i, C1081a aVar, MediaLoadData zVar) {
        C0762a e0 = m6258e0(i, aVar);
        mo5661o1(e0, 1005, new C0773i0(e0, zVar));
    }

    /* renamed from: w */
    public final void mo5671w() {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, -1, new C0777k0(a0));
    }

    /* renamed from: x */
    public final void mo5672x(MediaItem z0Var, int i) {
        C0762a a0 = mo5639a0();
        mo5661o1(a0, 1, new C0784o(a0, z0Var, i));
    }

    /* renamed from: y */
    public final void mo5673y(int i, C1081a aVar) {
        C0762a e0 = m6258e0(i, aVar);
        mo5661o1(e0, 1030, new C0752a0(e0));
    }

    /* renamed from: z */
    public final void mo5674z(DecoderCounters dVar) {
        C0762a g0 = m6262g0();
        mo5661o1(g0, 1020, new C0753a1(g0, dVar));
    }
}
