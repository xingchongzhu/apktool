package p281f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: f.k */
public final class InflaterSource implements Source {

    /* renamed from: a */
    private final BufferedSource f18765a;

    /* renamed from: b */
    private final Inflater f18766b;

    /* renamed from: c */
    private int f18767c;

    /* renamed from: d */
    private boolean f18768d;

    InflaterSource(BufferedSource eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f18765a = eVar;
            this.f18766b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    /* renamed from: C */
    private void m23914C() throws IOException {
        int i = this.f18767c;
        if (i != 0) {
            int remaining = i - this.f18766b.getRemaining();
            this.f18767c -= remaining;
            this.f18765a.mo20192a((long) remaining);
        }
    }

    /* renamed from: B */
    public final boolean mo20268B() throws IOException {
        if (!this.f18766b.needsInput()) {
            return false;
        }
        m23914C();
        if (this.f18766b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f18765a.mo20217m()) {
            return true;
        } else {
            Segment oVar = this.f18765a.mo20196c().f18750b;
            int i = oVar.f18783c;
            int i2 = oVar.f18782b;
            int i3 = i - i2;
            this.f18767c = i3;
            this.f18766b.setInput(oVar.f18781a, i2, i3);
            return false;
        }
    }

    public void close() throws IOException {
        if (!this.f18768d) {
            this.f18766b.end();
            this.f18768d = true;
            this.f18765a.close();
        }
    }

    /* renamed from: d */
    public Timeout mo19738d() {
        return this.f18765a.mo19738d();
    }

    /* renamed from: t */
    public long mo19739t(C3383c cVar, long j) throws IOException {
        Segment X;
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f18768d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean B = mo20268B();
                try {
                    X = cVar.mo20189X(1);
                    int inflate = this.f18766b.inflate(X.f18781a, X.f18783c, (int) Math.min(j, (long) (8192 - X.f18783c)));
                    if (inflate > 0) {
                        X.f18783c += inflate;
                        long j2 = (long) inflate;
                        cVar.f18751c += j2;
                        return j2;
                    } else if (this.f18766b.finished()) {
                        break;
                    } else if (this.f18766b.needsDictionary()) {
                        break;
                    } else if (B) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m23914C();
            if (X.f18782b == X.f18783c) {
                cVar.f18750b = X.mo20282b();
                SegmentPool.m23975a(X);
            }
            return -1;
        }
    }
}
