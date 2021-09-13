package p067c.p068a.p069a.p070a;

import java.io.IOException;
import p067c.p068a.p069a.p070a.PlayerMessage.C1183b;
import p067c.p068a.p069a.p070a.p097j2.SampleStream;
import p067c.p068a.p069a.p070a.p111m2.MediaClock;

/* renamed from: c.a.a.a.p1 */
/* compiled from: Renderer */
public interface C1227p1 extends C1183b {

    /* renamed from: c.a.a.a.p1$a */
    /* compiled from: Renderer */
    public interface C1228a {
        /* renamed from: a */
        void mo7631a(long j);
    }

    /* renamed from: b */
    boolean mo5784b();

    /* renamed from: d */
    void mo6517d();

    /* renamed from: e */
    boolean mo5786e();

    /* renamed from: g */
    int mo6518g();

    String getName();

    int getState();

    /* renamed from: h */
    void mo6520h(int i);

    /* renamed from: i */
    boolean mo6521i();

    /* renamed from: j */
    void mo6522j(RendererConfiguration s1Var, Format[] u0VarArr, SampleStream l0Var, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException;

    /* renamed from: l */
    void mo6490l(long j, long j2) throws ExoPlaybackException;

    /* renamed from: n */
    SampleStream mo6523n();

    /* renamed from: o */
    void mo6524o(Format[] u0VarArr, SampleStream l0Var, long j, long j2) throws ExoPlaybackException;

    /* renamed from: p */
    void mo6525p();

    /* renamed from: q */
    void mo6526q() throws IOException;

    /* renamed from: r */
    long mo6527r();

    void reset();

    /* renamed from: s */
    void mo6529s(long j) throws ExoPlaybackException;

    void start() throws ExoPlaybackException;

    void stop();

    /* renamed from: t */
    boolean mo6532t();

    /* renamed from: u */
    MediaClock mo5794u();

    /* renamed from: v */
    C1240r1 mo6533v();

    /* renamed from: x */
    void mo6498x(float f, float f2) throws ExoPlaybackException;
}
