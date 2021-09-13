package p067c.p068a.p069a.p070a.p076f2;

import com.google.android.exoplayer2.upstream.DataReader;
import java.io.EOFException;
import java.io.IOException;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p076f2.C0916b0.C0917a;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.i */
public final class DummyTrackOutput implements C0916b0 {

    /* renamed from: a */
    private final byte[] f6153a = new byte[4096];

    /* renamed from: a */
    public /* synthetic */ void mo6174a(ParsableByteArray a0Var, int i) {
        TrackOutput.m7284b(this, a0Var, i);
    }

    /* renamed from: b */
    public int mo6175b(DataReader jVar, int i, boolean z, int i2) throws IOException {
        int b = jVar.mo6195b(this.f6153a, 0, Math.min(this.f6153a.length, i));
        if (b != -1) {
            return b;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public void mo6176c(long j, int i, int i2, int i3, C0917a aVar) {
    }

    /* renamed from: d */
    public void mo6177d(Format u0Var) {
    }

    /* renamed from: e */
    public void mo6178e(ParsableByteArray a0Var, int i, int i2) {
        a0Var.mo7375Q(i);
    }

    /* renamed from: f */
    public /* synthetic */ int mo6179f(DataReader jVar, int i, boolean z) {
        return TrackOutput.m7283a(this, jVar, i, z);
    }
}
