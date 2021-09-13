package p067c.p068a.p069a.p070a.p076f2;

import com.google.android.exoplayer2.upstream.DataReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.g */
public final class DefaultExtractorInput implements ExtractorInput {

    /* renamed from: b */
    private final byte[] f6077b = new byte[4096];

    /* renamed from: c */
    private final DataReader f6078c;

    /* renamed from: d */
    private final long f6079d;

    /* renamed from: e */
    private long f6080e;

    /* renamed from: f */
    private byte[] f6081f = new byte[65536];

    /* renamed from: g */
    private int f6082g;

    /* renamed from: h */
    private int f6083h;

    public DefaultExtractorInput(DataReader jVar, long j, long j2) {
        this.f6078c = jVar;
        this.f6080e = j;
        this.f6079d = j2;
    }

    /* renamed from: r */
    private void m7408r(int i) {
        if (i != -1) {
            this.f6080e += (long) i;
        }
    }

    /* renamed from: s */
    private void m7409s(int i) {
        int i2 = this.f6082g + i;
        byte[] bArr = this.f6081f;
        if (i2 > bArr.length) {
            this.f6081f = Arrays.copyOf(this.f6081f, Util.m10307p(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: t */
    private int m7410t(byte[] bArr, int i, int i2) {
        int i3 = this.f6083h;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f6081f, 0, bArr, i, min);
        m7413x(min);
        return min;
    }

    /* renamed from: u */
    private int m7411u(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int b = this.f6078c.mo6195b(bArr, i + i3, i2 - i3);
            if (b != -1) {
                return i3 + b;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: v */
    private int m7412v(int i) {
        int min = Math.min(this.f6083h, i);
        m7413x(min);
        return min;
    }

    /* renamed from: x */
    private void m7413x(int i) {
        int i2 = this.f6083h - i;
        this.f6083h = i2;
        this.f6082g = 0;
        byte[] bArr = this.f6081f;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f6081f = bArr2;
    }

    /* renamed from: a */
    public long mo6194a() {
        return this.f6079d;
    }

    /* renamed from: b */
    public int mo6195b(byte[] bArr, int i, int i2) throws IOException {
        int t = m7410t(bArr, i, i2);
        if (t == 0) {
            t = m7411u(bArr, i, i2, 0, true);
        }
        m7408r(t);
        return t;
    }

    /* renamed from: c */
    public int mo6196c(int i) throws IOException {
        int v = m7412v(i);
        if (v == 0) {
            byte[] bArr = this.f6077b;
            v = m7411u(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m7408r(v);
        return v;
    }

    /* renamed from: d */
    public boolean mo6197d(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int t = m7410t(bArr, i, i2);
        while (t < i2 && t != -1) {
            t = m7411u(bArr, i, i2, t, z);
        }
        m7408r(t);
        return t != -1;
    }

    /* renamed from: f */
    public int mo6198f(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        m7409s(i2);
        int i4 = this.f6083h;
        int i5 = this.f6082g;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m7411u(this.f6081f, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f6083h += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f6081f, this.f6082g, bArr, i, i3);
        this.f6082g += i3;
        return i3;
    }

    /* renamed from: h */
    public void mo6199h() {
        this.f6082g = 0;
    }

    /* renamed from: i */
    public void mo6200i(int i) throws IOException {
        mo6208w(i, false);
    }

    /* renamed from: j */
    public boolean mo6201j(int i, boolean z) throws IOException {
        m7409s(i);
        int i2 = this.f6083h - this.f6082g;
        while (i2 < i) {
            i2 = m7411u(this.f6081f, this.f6082g, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f6083h = this.f6082g + i2;
        }
        this.f6082g += i;
        return true;
    }

    /* renamed from: m */
    public boolean mo6202m(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!mo6201j(i2, z)) {
            return false;
        }
        System.arraycopy(this.f6081f, this.f6082g - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: n */
    public long mo6203n() {
        return this.f6080e + ((long) this.f6082g);
    }

    /* renamed from: o */
    public void mo6204o(byte[] bArr, int i, int i2) throws IOException {
        mo6202m(bArr, i, i2, false);
    }

    /* renamed from: p */
    public void mo6205p(int i) throws IOException {
        mo6201j(i, false);
    }

    /* renamed from: q */
    public long mo6206q() {
        return this.f6080e;
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        mo6197d(bArr, i, i2, false);
    }

    /* renamed from: w */
    public boolean mo6208w(int i, boolean z) throws IOException {
        int v = m7412v(i);
        while (v < i && v != -1) {
            v = m7411u(this.f6077b, -v, Math.min(i, this.f6077b.length + v), v, z);
        }
        m7408r(v);
        return v != -1;
    }
}
