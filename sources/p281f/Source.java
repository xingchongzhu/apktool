package p281f;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: f.s */
public interface Source extends Closeable {
    void close() throws IOException;

    /* renamed from: d */
    Timeout mo19738d();

    /* renamed from: t */
    long mo19739t(C3383c cVar, long j) throws IOException;
}
