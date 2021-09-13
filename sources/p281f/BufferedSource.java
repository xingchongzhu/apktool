package p281f;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: f.e */
public interface BufferedSource extends Source, ReadableByteChannel {
    /* renamed from: A */
    String mo20170A(Charset charset) throws IOException;

    /* renamed from: a */
    void mo20192a(long j) throws IOException;

    /* renamed from: b */
    ByteString mo20194b(long j) throws IOException;

    /* renamed from: c */
    C3383c mo20196c();

    /* renamed from: k */
    String mo20214k() throws IOException;

    /* renamed from: l */
    int mo20216l() throws IOException;

    /* renamed from: m */
    boolean mo20217m() throws IOException;

    /* renamed from: o */
    byte[] mo20219o(long j) throws IOException;

    /* renamed from: q */
    short mo20221q() throws IOException;

    /* renamed from: r */
    String mo20222r() throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    /* renamed from: u */
    String mo20230u(long j) throws IOException;

    /* renamed from: v */
    void mo20231v(long j) throws IOException;

    /* renamed from: x */
    long mo20234x(byte b) throws IOException;

    /* renamed from: y */
    boolean mo20235y(long j, ByteString fVar) throws IOException;

    /* renamed from: z */
    long mo20236z() throws IOException;
}
