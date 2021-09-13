package p067c.p068a.p069a.p070a.p071a2;

import android.util.SparseArray;
import android.view.Surface;
import java.io.IOException;
import java.util.List;
import p067c.p068a.p069a.p070a.C1155l1;
import p067c.p068a.p069a.p070a.ExoPlaybackException;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.MediaItem;
import p067c.p068a.p069a.p070a.PlaybackParameters;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.p073c2.DecoderCounters;
import p067c.p068a.p069a.p070a.p073c2.DecoderReuseEvaluation;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.LoadEventInfo;
import p067c.p068a.p069a.p070a.p097j2.MediaLoadData;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p110l2.TrackSelectionArray;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.MutableFlags;
import p067c.p068a.p134b.p135a.Objects;

/* renamed from: c.a.a.a.a2.d1 */
public interface AnalyticsListener {

    /* renamed from: c.a.a.a.a2.d1$a */
    /* compiled from: AnalyticsListener */
    public static final class C0762a {

        /* renamed from: a */
        public final long f5278a;

        /* renamed from: b */
        public final Timeline f5279b;

        /* renamed from: c */
        public final int f5280c;

        /* renamed from: d */
        public final C1081a f5281d;

        /* renamed from: e */
        public final long f5282e;

        /* renamed from: f */
        public final Timeline f5283f;

        /* renamed from: g */
        public final int f5284g;

        /* renamed from: h */
        public final C1081a f5285h;

        /* renamed from: i */
        public final long f5286i;

        /* renamed from: j */
        public final long f5287j;

        public C0762a(long j, Timeline x1Var, int i, C1081a aVar, long j2, Timeline x1Var2, int i2, C1081a aVar2, long j3, long j4) {
            this.f5278a = j;
            this.f5279b = x1Var;
            this.f5280c = i;
            this.f5281d = aVar;
            this.f5282e = j2;
            this.f5283f = x1Var2;
            this.f5284g = i2;
            this.f5285h = aVar2;
            this.f5286i = j3;
            this.f5287j = j4;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C0762a.class != obj.getClass()) {
                return false;
            }
            C0762a aVar = (C0762a) obj;
            if (!(this.f5278a == aVar.f5278a && this.f5280c == aVar.f5280c && this.f5282e == aVar.f5282e && this.f5284g == aVar.f5284g && this.f5286i == aVar.f5286i && this.f5287j == aVar.f5287j && Objects.m11640a(this.f5279b, aVar.f5279b) && Objects.m11640a(this.f5281d, aVar.f5281d) && Objects.m11640a(this.f5283f, aVar.f5283f) && Objects.m11640a(this.f5285h, aVar.f5285h))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return Objects.m11641b(Long.valueOf(this.f5278a), this.f5279b, Integer.valueOf(this.f5280c), this.f5281d, Long.valueOf(this.f5282e), this.f5283f, Integer.valueOf(this.f5284g), this.f5285h, Long.valueOf(this.f5286i), Long.valueOf(this.f5287j));
        }
    }

    /* renamed from: c.a.a.a.a2.d1$b */
    /* compiled from: AnalyticsListener */
    public static final class C0763b extends MutableFlags {

        /* renamed from: b */
        private final SparseArray<C0762a> f5288b = new SparseArray<>(0);

        /* renamed from: b */
        public boolean mo5741b(int i) {
            return super.mo5741b(i);
        }

        /* renamed from: d */
        public int mo5742d(int i) {
            return super.mo5742d(i);
        }

        /* renamed from: f */
        public void mo5743f(SparseArray<C0762a> sparseArray) {
            this.f5288b.clear();
            for (int i = 0; i < mo7486e(); i++) {
                int d = mo5742d(i);
                this.f5288b.append(d, (C0762a) Assertions.m10153e((C0762a) sparseArray.get(d)));
            }
        }
    }

    /* renamed from: A */
    void mo5683A(C0762a aVar, String str, long j);

    /* renamed from: B */
    void mo5684B(C0762a aVar, PlaybackParameters i1Var);

    /* renamed from: C */
    void mo5685C(C0762a aVar);

    /* renamed from: D */
    void mo5686D(C0762a aVar, MediaItem z0Var, int i);

    /* renamed from: E */
    void mo5687E(C0762a aVar, int i, long j, long j2);

    /* renamed from: F */
    void mo5688F(C0762a aVar, Surface surface);

    /* renamed from: G */
    void mo5689G(C0762a aVar, DecoderCounters dVar);

    /* renamed from: H */
    void mo5690H(C0762a aVar, DecoderCounters dVar);

    /* renamed from: I */
    void mo5691I(C0762a aVar, LoadEventInfo wVar, MediaLoadData zVar, IOException iOException, boolean z);

    @Deprecated
    /* renamed from: J */
    void mo5692J(C0762a aVar, int i, DecoderCounters dVar);

    /* renamed from: K */
    void mo5693K(C0762a aVar, Format u0Var, DecoderReuseEvaluation gVar);

    /* renamed from: L */
    void mo5694L(C0762a aVar, DecoderCounters dVar);

    /* renamed from: M */
    void mo5695M(C0762a aVar, String str, long j);

    /* renamed from: N */
    void mo5696N(C0762a aVar, Metadata aVar2);

    /* renamed from: O */
    void mo5697O(C0762a aVar, int i);

    @Deprecated
    /* renamed from: P */
    void mo5698P(C0762a aVar, int i, DecoderCounters dVar);

    /* renamed from: Q */
    void mo5699Q(C0762a aVar);

    /* renamed from: R */
    void mo5700R(C1155l1 l1Var, C0763b bVar);

    /* renamed from: S */
    void mo5701S(C0762a aVar, List<Metadata> list);

    @Deprecated
    /* renamed from: T */
    void mo5702T(C0762a aVar, boolean z, int i);

    /* renamed from: U */
    void mo5703U(C0762a aVar);

    /* renamed from: V */
    void mo5704V(C0762a aVar, boolean z);

    /* renamed from: W */
    void mo5705W(C0762a aVar, int i);

    /* renamed from: X */
    void mo5706X(C0762a aVar);

    /* renamed from: Y */
    void mo5707Y(C0762a aVar, DecoderCounters dVar);

    /* renamed from: Z */
    void mo5708Z(C0762a aVar, LoadEventInfo wVar, MediaLoadData zVar);

    /* renamed from: a */
    void mo5709a(C0762a aVar, int i, long j, long j2);

    /* renamed from: a0 */
    void mo5710a0(C0762a aVar, TrackGroupArray q0Var, TrackSelectionArray lVar);

    /* renamed from: b */
    void mo5711b(C0762a aVar, int i, int i2);

    /* renamed from: b0 */
    void mo5712b0(C0762a aVar, long j);

    /* renamed from: c */
    void mo5713c(C0762a aVar, boolean z);

    /* renamed from: c0 */
    void mo5714c0(C0762a aVar);

    /* renamed from: d */
    void mo5715d(C0762a aVar, int i, int i2, int i3, float f);

    /* renamed from: d0 */
    void mo5716d0(C0762a aVar, ExoPlaybackException p0Var);

    /* renamed from: e */
    void mo5717e(C0762a aVar, boolean z);

    /* renamed from: f */
    void mo5718f(C0762a aVar, MediaLoadData zVar);

    /* renamed from: g */
    void mo5719g(C0762a aVar, LoadEventInfo wVar, MediaLoadData zVar);

    /* renamed from: h */
    void mo5720h(C0762a aVar, MediaLoadData zVar);

    /* renamed from: i */
    void mo5721i(C0762a aVar, int i, long j);

    /* renamed from: j */
    void mo5722j(C0762a aVar, Exception exc);

    /* renamed from: k */
    void mo5723k(C0762a aVar, boolean z);

    /* renamed from: l */
    void mo5724l(C0762a aVar, String str);

    @Deprecated
    /* renamed from: m */
    void mo5725m(C0762a aVar, int i, Format u0Var);

    /* renamed from: n */
    void mo5726n(C0762a aVar, long j, int i);

    /* renamed from: o */
    void mo5727o(C0762a aVar, String str);

    @Deprecated
    /* renamed from: p */
    void mo5728p(C0762a aVar);

    /* renamed from: q */
    void mo5729q(C0762a aVar, LoadEventInfo wVar, MediaLoadData zVar);

    /* renamed from: r */
    void mo5730r(C0762a aVar, boolean z, int i);

    /* renamed from: s */
    void mo5731s(C0762a aVar, Format u0Var, DecoderReuseEvaluation gVar);

    @Deprecated
    /* renamed from: t */
    void mo5732t(C0762a aVar, int i, String str, long j);

    /* renamed from: u */
    void mo5733u(C0762a aVar, int i);

    /* renamed from: v */
    void mo5734v(C0762a aVar, Exception exc);

    /* renamed from: w */
    void mo5735w(C0762a aVar);

    /* renamed from: x */
    void mo5736x(C0762a aVar, int i);

    /* renamed from: y */
    void mo5737y(C0762a aVar);

    /* renamed from: z */
    void mo5738z(C0762a aVar, int i);
}
