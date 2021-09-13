package p067c.p068a.p069a.p070a.p076f2;

import com.google.android.exoplayer2.upstream.DataReader;
import java.io.IOException;

/* renamed from: c.a.a.a.f2.k */
public interface ExtractorInput extends DataReader {
    /* renamed from: a */
    long mo6194a();

    /* renamed from: b */
    int mo6195b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c */
    int mo6196c(int i) throws IOException;

    /* renamed from: d */
    boolean mo6197d(byte[] bArr, int i, int i2, boolean z) throws IOException;

    /* renamed from: f */
    int mo6198f(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: h */
    void mo6199h();

    /* renamed from: i */
    void mo6200i(int i) throws IOException;

    /* renamed from: j */
    boolean mo6201j(int i, boolean z) throws IOException;

    /* renamed from: m */
    boolean mo6202m(byte[] bArr, int i, int i2, boolean z) throws IOException;

    /* renamed from: n */
    long mo6203n();

    /* renamed from: o */
    void mo6204o(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: p */
    void mo6205p(int i) throws IOException;

    /* renamed from: q */
    long mo6206q();

    void readFully(byte[] bArr, int i, int i2) throws IOException;
}
