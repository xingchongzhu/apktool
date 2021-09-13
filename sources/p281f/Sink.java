package p281f;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: f.r */
public interface Sink extends Closeable, Flushable {
    void close() throws IOException;

    /* renamed from: d */
    Timeout mo19824d();

    /* renamed from: f */
    void mo19789f(C3383c cVar, long j) throws IOException;

    void flush() throws IOException;
}
