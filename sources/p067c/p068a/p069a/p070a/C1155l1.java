package p067c.p068a.p069a.p070a;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.TextOutput;
import p067c.p068a.p069a.p070a.p110l2.TrackSelectionArray;
import p067c.p068a.p069a.p070a.p111m2.MutableFlags;
import p067c.p068a.p069a.p070a.p112n2.C1223y;
import p067c.p068a.p069a.p070a.p112n2.VideoFrameMetadataListener;
import p067c.p068a.p069a.p070a.p112n2.p113a0.CameraMotionListener;

/* renamed from: c.a.a.a.l1 */
/* compiled from: Player */
public interface C1155l1 {

    /* renamed from: c.a.a.a.l1$a */
    /* compiled from: Player */
    public interface C1156a {
        /* renamed from: D */
        void mo5615D(Timeline x1Var, int i);

        /* renamed from: G */
        void mo5618G(int i);

        /* renamed from: H */
        void mo5619H(boolean z, int i);

        /* renamed from: L */
        void mo5623L(TrackGroupArray q0Var, TrackSelectionArray lVar);

        /* renamed from: P */
        void mo5627P(boolean z);

        /* renamed from: R */
        void mo5629R(C1155l1 l1Var, C1157b bVar);

        /* renamed from: S */
        void mo5630S(boolean z);

        /* renamed from: W */
        void mo5634W(boolean z);

        /* renamed from: Z */
        void mo5637Z(boolean z);

        /* renamed from: c */
        void mo5642c(int i);

        /* renamed from: e */
        void mo5644e(PlaybackParameters i1Var);

        /* renamed from: f */
        void mo5645f(int i);

        @Deprecated
        /* renamed from: g */
        void mo5646g(boolean z, int i);

        @Deprecated
        /* renamed from: i */
        void mo5648i(boolean z);

        /* renamed from: j */
        void mo5650j(int i);

        /* renamed from: o */
        void mo5660o(List<Metadata> list);

        @Deprecated
        /* renamed from: q */
        void mo5664q(Timeline x1Var, Object obj, int i);

        /* renamed from: r */
        void mo5666r(ExoPlaybackException p0Var);

        /* renamed from: u */
        void mo5669u(boolean z);

        @Deprecated
        /* renamed from: w */
        void mo5671w();

        /* renamed from: x */
        void mo5672x(MediaItem z0Var, int i);
    }

    /* renamed from: c.a.a.a.l1$b */
    /* compiled from: Player */
    public static final class C1157b extends MutableFlags {
        /* renamed from: b */
        public boolean mo5741b(int i) {
            return super.mo5741b(i);
        }

        /* renamed from: c */
        public boolean mo7223c(int... iArr) {
            return super.mo7223c(iArr);
        }
    }

    /* renamed from: c.a.a.a.l1$c */
    /* compiled from: Player */
    public interface C1158c {
        /* renamed from: G */
        void mo7224G(TextOutput lVar);

        /* renamed from: J */
        void mo7225J(TextOutput lVar);

        /* renamed from: v */
        List<Cue> mo7226v();
    }

    /* renamed from: c.a.a.a.l1$d */
    /* compiled from: Player */
    public interface C1159d {
        /* renamed from: E */
        void mo7227E(SurfaceView surfaceView);

        /* renamed from: F */
        void mo7228F(SurfaceView surfaceView);

        /* renamed from: S */
        void mo7229S(TextureView textureView);

        /* renamed from: V */
        void mo7230V(C1223y yVar);

        /* renamed from: X */
        void mo7231X(C1223y yVar);

        /* renamed from: a */
        void mo7232a(Surface surface);

        /* renamed from: b */
        void mo7233b(CameraMotionListener aVar);

        /* renamed from: m */
        void mo7234m(VideoFrameMetadataListener vVar);

        /* renamed from: o */
        void mo7235o(Surface surface);

        /* renamed from: s */
        void mo7236s(CameraMotionListener aVar);

        /* renamed from: x */
        void mo7237x(TextureView textureView);

        /* renamed from: y */
        void mo7238y(VideoFrameMetadataListener vVar);
    }

    /* renamed from: A */
    void mo7191A(int i);

    /* renamed from: B */
    int mo6399B();

    /* renamed from: C */
    void mo7192C(C1156a aVar);

    /* renamed from: D */
    int mo7193D();

    /* renamed from: H */
    int mo7194H();

    /* renamed from: I */
    TrackGroupArray mo7195I();

    /* renamed from: K */
    int mo7196K();

    /* renamed from: L */
    long mo7197L();

    /* renamed from: M */
    Timeline mo7198M();

    /* renamed from: N */
    Looper mo7199N();

    /* renamed from: O */
    boolean mo7200O();

    /* renamed from: P */
    void mo7201P(C1156a aVar);

    /* renamed from: Q */
    long mo7202Q();

    /* renamed from: R */
    int mo7203R();

    /* renamed from: T */
    TrackSelectionArray mo7204T();

    /* renamed from: U */
    int mo7205U(int i);

    /* renamed from: W */
    long mo7206W();

    /* renamed from: Y */
    C1158c mo7207Y();

    /* renamed from: c */
    PlaybackParameters mo7208c();

    /* renamed from: d */
    void mo7209d();

    /* renamed from: e */
    ExoPlaybackException mo7210e();

    /* renamed from: f */
    void mo7211f(boolean z);

    /* renamed from: g */
    C1159d mo7212g();

    /* renamed from: h */
    boolean mo7213h();

    boolean hasNext();

    boolean hasPrevious();

    /* renamed from: i */
    long mo7214i();

    /* renamed from: j */
    long mo7215j();

    /* renamed from: k */
    void mo7216k(int i, long j);

    /* renamed from: l */
    int mo6404l();

    /* renamed from: n */
    boolean mo7217n();

    /* renamed from: p */
    void mo7218p(boolean z);

    /* renamed from: q */
    int mo7219q();

    /* renamed from: r */
    List<Metadata> mo7220r();

    /* renamed from: t */
    boolean mo6405t();

    /* renamed from: u */
    int mo7221u();

    /* renamed from: w */
    boolean mo6406w();

    /* renamed from: z */
    int mo7222z();
}
