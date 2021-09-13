package p281f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: f.j */
public final class GzipSource implements Source {

    /* renamed from: a */
    private int f18760a = 0;

    /* renamed from: b */
    private final BufferedSource f18761b;

    /* renamed from: c */
    private final Inflater f18762c;

    /* renamed from: d */
    private final InflaterSource f18763d;

    /* renamed from: e */
    private final CRC32 f18764e = new CRC32();

    public GzipSource(Source sVar) {
        if (sVar != null) {
            Inflater inflater = new Inflater(true);
            this.f18762c = inflater;
            BufferedSource c = Okio.m23920c(sVar);
            this.f18761b = c;
            this.f18763d = new InflaterSource(c, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: B */
    private void m23908B(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    /* renamed from: C */
    private void m23909C() throws IOException {
        this.f18761b.mo20231v(10);
        byte G = this.f18761b.mo20196c().mo20176G(3);
        boolean z = ((G >> 1) & 1) == 1;
        if (z) {
            m23911E(this.f18761b.mo20196c(), 0, 10);
        }
        m23908B("ID1ID2", 8075, this.f18761b.readShort());
        this.f18761b.mo20192a(8);
        if (((G >> 2) & 1) == 1) {
            this.f18761b.mo20231v(2);
            if (z) {
                m23911E(this.f18761b.mo20196c(), 0, 2);
            }
            long q = (long) this.f18761b.mo20196c().mo20221q();
            this.f18761b.mo20231v(q);
            if (z) {
                m23911E(this.f18761b.mo20196c(), 0, q);
            }
            this.f18761b.mo20192a(q);
        }
        if (((G >> 3) & 1) == 1) {
            long x = this.f18761b.mo20234x(0);
            if (x != -1) {
                if (z) {
                    m23911E(this.f18761b.mo20196c(), 0, x + 1);
                }
                this.f18761b.mo20192a(x + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((G >> 4) & 1) == 1) {
            long x2 = this.f18761b.mo20234x(0);
            if (x2 != -1) {
                if (z) {
                    m23911E(this.f18761b.mo20196c(), 0, x2 + 1);
                }
                this.f18761b.mo20192a(x2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m23908B("FHCRC", this.f18761b.mo20221q(), (short) ((int) this.f18764e.getValue()));
            this.f18764e.reset();
        }
    }

    /* renamed from: D */
    private void m23910D() throws IOException {
        m23908B("CRC", this.f18761b.mo20216l(), (int) this.f18764e.getValue());
        m23908B("ISIZE", this.f18761b.mo20216l(), (int) this.f18762c.getBytesWritten());
    }

    /* renamed from: E */
    private void m23911E(C3383c cVar, long j, long j2) {
        Segment oVar = cVar.f18750b;
        while (true) {
            int i = oVar.f18783c;
            int i2 = oVar.f18782b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            oVar = oVar.f18786f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) oVar.f18782b) + j);
            int min = (int) Math.min((long) (oVar.f18783c - i3), j2);
            this.f18764e.update(oVar.f18781a, i3, min);
            j2 -= (long) min;
            oVar = oVar.f18786f;
            j = 0;
        }
    }

    public void close() throws IOException {
        this.f18763d.close();
    }

    /* renamed from: d */
    public Timeout mo19738d() {
        return this.f18761b.mo19738d();
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
            if (this.f18760a == 0) {
                m23909C();
                this.f18760a = 1;
            }
            if (this.f18760a == 1) {
                long j2 = cVar.f18751c;
                long t = this.f18763d.mo19739t(cVar, j);
                if (t != -1) {
                    m23911E(cVar, j2, t);
                    return t;
                }
                this.f18760a = 2;
            }
            if (this.f18760a == 2) {
                m23910D();
                this.f18760a = 3;
                if (!this.f18761b.mo20217m()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }
}
