package p067c.p068a.p069a.p070a.p097j2;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C1916m;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.j2.v */
final class IcyDataSource implements C1916m {

    /* renamed from: b */
    private final C1916m f7653b;

    /* renamed from: c */
    private final int f7654c;

    /* renamed from: d */
    private final C1112a f7655d;

    /* renamed from: e */
    private final byte[] f7656e;

    /* renamed from: f */
    private int f7657f;

    /* renamed from: c.a.a.a.j2.v$a */
    /* compiled from: IcyDataSource */
    public interface C1112a {
        /* renamed from: b */
        void mo6894b(ParsableByteArray a0Var);
    }

    public IcyDataSource(C1916m mVar, int i, C1112a aVar) {
        Assertions.m10149a(i > 0);
        this.f7653b = mVar;
        this.f7654c = i;
        this.f7655d = aVar;
        this.f7656e = new byte[1];
        this.f7657f = i;
    }

    /* renamed from: r */
    private boolean m9275r() throws IOException {
        if (this.f7653b.mo6195b(this.f7656e, 0, 1) == -1) {
            return false;
        }
        int i = (this.f7656e[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int b = this.f7653b.mo6195b(bArr, i3, i2);
            if (b == -1) {
                return false;
            }
            i3 += b;
            i2 -= b;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f7655d.mo6894b(new ParsableByteArray(bArr, i));
        }
        return true;
    }

    /* renamed from: b */
    public int mo6195b(byte[] bArr, int i, int i2) throws IOException {
        if (this.f7657f == 0) {
            if (!m9275r()) {
                return -1;
            }
            this.f7657f = this.f7654c;
        }
        int b = this.f7653b.mo6195b(bArr, i, Math.min(this.f7657f, i2));
        if (b != -1) {
            this.f7657f -= b;
        }
        return b;
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public long mo7015e(DataSpec pVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public Map<String, List<String>> mo7016g() {
        return this.f7653b.mo7016g();
    }

    /* renamed from: k */
    public void mo7017k(TransferListener e0Var) {
        Assertions.m10153e(e0Var);
        this.f7653b.mo7017k(e0Var);
    }

    /* renamed from: l */
    public Uri mo7018l() {
        return this.f7653b.mo7018l();
    }
}
