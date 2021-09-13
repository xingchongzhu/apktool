package p281f;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* renamed from: f.d */
public interface BufferedSink extends Sink, WritableByteChannel {
    /* renamed from: c */
    C3383c mo20196c();

    /* renamed from: e */
    BufferedSink mo20200e(byte[] bArr, int i, int i2) throws IOException;

    void flush() throws IOException;

    /* renamed from: g */
    BufferedSink mo20204g(long j) throws IOException;

    /* renamed from: h */
    BufferedSink mo20206h() throws IOException;

    /* renamed from: i */
    BufferedSink mo20209i(int i) throws IOException;

    /* renamed from: j */
    BufferedSink mo20212j(int i) throws IOException;

    /* renamed from: n */
    BufferedSink mo20218n(int i) throws IOException;

    /* renamed from: p */
    BufferedSink mo20220p(byte[] bArr) throws IOException;

    /* renamed from: s */
    BufferedSink mo20228s() throws IOException;

    /* renamed from: w */
    BufferedSink mo20232w(String str) throws IOException;
}
