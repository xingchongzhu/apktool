package p067c.p068a.p069a.p070a.p097j2;

import java.io.IOException;
import p067c.p068a.p069a.p070a.SeekParameters;
import p067c.p068a.p069a.p070a.p097j2.SequenceableLoader.C1101a;
import p067c.p068a.p069a.p070a.p110l2.C1174h;

/* renamed from: c.a.a.a.j2.a0 */
public interface MediaPeriod extends SequenceableLoader {

    /* renamed from: c.a.a.a.j2.a0$a */
    /* compiled from: MediaPeriod */
    public interface C1076a extends C1101a<MediaPeriod> {
        /* renamed from: m */
        void mo6819m(MediaPeriod a0Var);
    }

    /* renamed from: a */
    boolean mo6806a();

    /* renamed from: b */
    long mo6807b();

    /* renamed from: c */
    long mo6808c();

    /* renamed from: d */
    boolean mo6809d(long j);

    /* renamed from: e */
    void mo6810e(long j);

    /* renamed from: g */
    long mo6811g(long j, SeekParameters u1Var);

    /* renamed from: k */
    long mo6812k();

    /* renamed from: l */
    void mo6813l(C1076a aVar, long j);

    /* renamed from: n */
    long mo6814n(C1174h[] hVarArr, boolean[] zArr, SampleStream[] l0VarArr, boolean[] zArr2, long j);

    /* renamed from: o */
    TrackGroupArray mo6815o();

    /* renamed from: s */
    void mo6816s() throws IOException;

    /* renamed from: t */
    void mo6817t(long j, boolean z);

    /* renamed from: u */
    long mo6818u(long j);
}
