package p281f;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: f.l */
public final class Okio {

    /* renamed from: a */
    static final Logger f18769a = Logger.getLogger(Okio.class.getName());

    /* renamed from: f.l$a */
    /* compiled from: Okio */
    class C3384a implements Sink {

        /* renamed from: a */
        final /* synthetic */ Timeout f18770a;

        /* renamed from: b */
        final /* synthetic */ OutputStream f18771b;

        C3384a(Timeout tVar, OutputStream outputStream) {
            this.f18770a = tVar;
            this.f18771b = outputStream;
        }

        public void close() throws IOException {
            this.f18771b.close();
        }

        /* renamed from: d */
        public Timeout mo19824d() {
            return this.f18770a;
        }

        /* renamed from: f */
        public void mo19789f(C3383c cVar, long j) throws IOException {
            C3388u.m24008b(cVar.f18751c, 0, j);
            while (j > 0) {
                this.f18770a.mo20264f();
                Segment oVar = cVar.f18750b;
                int min = (int) Math.min(j, (long) (oVar.f18783c - oVar.f18782b));
                this.f18771b.write(oVar.f18781a, oVar.f18782b, min);
                int i = oVar.f18782b + min;
                oVar.f18782b = i;
                long j2 = (long) min;
                j -= j2;
                cVar.f18751c -= j2;
                if (i == oVar.f18783c) {
                    cVar.f18750b = oVar.mo20282b();
                    SegmentPool.m23975a(oVar);
                }
            }
        }

        public void flush() throws IOException {
            this.f18771b.flush();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("sink(");
            sb.append(this.f18771b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: f.l$b */
    /* compiled from: Okio */
    class C3385b implements Source {

        /* renamed from: a */
        final /* synthetic */ Timeout f18772a;

        /* renamed from: b */
        final /* synthetic */ InputStream f18773b;

        C3385b(Timeout tVar, InputStream inputStream) {
            this.f18772a = tVar;
            this.f18773b = inputStream;
        }

        public void close() throws IOException {
            this.f18773b.close();
        }

        /* renamed from: d */
        public Timeout mo19738d() {
            return this.f18772a;
        }

        /* renamed from: t */
        public long mo19739t(C3383c cVar, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (j == 0) {
                return 0;
            } else {
                try {
                    this.f18772a.mo20264f();
                    Segment X = cVar.mo20189X(1);
                    int read = this.f18773b.read(X.f18781a, X.f18783c, (int) Math.min(j, (long) (8192 - X.f18783c)));
                    if (read == -1) {
                        return -1;
                    }
                    X.f18783c += read;
                    long j2 = (long) read;
                    cVar.f18751c += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (Okio.m23921d(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("source(");
            sb.append(this.f18773b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: f.l$c */
    /* compiled from: Okio */
    class C3386c extends AsyncTimeout {

        /* renamed from: k */
        final /* synthetic */ Socket f18774k;

        C3386c(Socket socket) {
            this.f18774k = socket;
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public IOException mo19898o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo19899t() {
            String str = "Failed to close timed out socket ";
            try {
                this.f18774k.close();
            } catch (Exception e) {
                Logger logger = Okio.f18769a;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f18774k);
                logger.log(level, sb.toString(), e);
            } catch (AssertionError e2) {
                if (Okio.m23921d(e2)) {
                    Logger logger2 = Okio.f18769a;
                    Level level2 = Level.WARNING;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(this.f18774k);
                    logger2.log(level2, sb2.toString(), e2);
                    return;
                }
                throw e2;
            }
        }
    }

    private Okio() {
    }

    /* renamed from: a */
    public static Sink m23918a(File file) throws FileNotFoundException {
        if (file != null) {
            return m23923f(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: b */
    public static BufferedSink m23919b(Sink rVar) {
        return new RealBufferedSink(rVar);
    }

    /* renamed from: c */
    public static BufferedSource m23920c(Source sVar) {
        return new RealBufferedSource(sVar);
    }

    /* renamed from: d */
    static boolean m23921d(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: e */
    public static Sink m23922e(File file) throws FileNotFoundException {
        if (file != null) {
            return m23923f(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: f */
    public static Sink m23923f(OutputStream outputStream) {
        return m23924g(outputStream, new Timeout());
    }

    /* renamed from: g */
    private static Sink m23924g(OutputStream outputStream, Timeout tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (tVar != null) {
            return new C3384a(tVar, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: h */
    public static Sink m23925h(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            AsyncTimeout l = m23929l(socket);
            return l.mo20165r(m23924g(socket.getOutputStream(), l));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: i */
    public static Source m23926i(InputStream inputStream) {
        return m23927j(inputStream, new Timeout());
    }

    /* renamed from: j */
    private static Source m23927j(InputStream inputStream, Timeout tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (tVar != null) {
            return new C3385b(tVar, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: k */
    public static Source m23928k(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            AsyncTimeout l = m23929l(socket);
            return l.mo20166s(m23927j(socket.getInputStream(), l));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* renamed from: l */
    private static AsyncTimeout m23929l(Socket socket) {
        return new C3386c(socket);
    }
}
