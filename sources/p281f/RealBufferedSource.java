package p281f;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: f.n */
final class RealBufferedSource implements BufferedSource {

    /* renamed from: a */
    public final C3383c f18778a = new C3383c();

    /* renamed from: b */
    public final Source f18779b;

    /* renamed from: c */
    boolean f18780c;

    RealBufferedSource(Source sVar) {
        Objects.requireNonNull(sVar, "source == null");
        this.f18779b = sVar;
    }

    /* renamed from: A */
    public String mo20170A(Charset charset) throws IOException {
        if (charset != null) {
            this.f18778a.mo20195b0(this.f18779b);
            return this.f18778a.mo20170A(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* renamed from: B */
    public long mo20274B(byte b, long j, long j2) throws IOException {
        if (this.f18780c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long H = this.f18778a.mo20177H(b, j, j2);
                if (H == -1) {
                    C3383c cVar = this.f18778a;
                    long j3 = cVar.f18751c;
                    if (j3 >= j2 || this.f18779b.mo19739t(cVar, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return H;
                }
            }
            return -1;
        }
    }

    /* renamed from: C */
    public boolean mo20275C(long j, ByteString fVar, int i, int i2) throws IOException {
        if (this.f18780c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || fVar.mo20248o() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!mo20277E(1 + j2) || this.f18778a.mo20176G(j2) != fVar.mo20241h(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: D */
    public String mo20276D(long j) throws IOException {
        mo20231v(j);
        return this.f18778a.mo20184O(j);
    }

    /* renamed from: E */
    public boolean mo20277E(long j) throws IOException {
        C3383c cVar;
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f18780c) {
            do {
                cVar = this.f18778a;
                if (cVar.f18751c >= j) {
                    return true;
                }
            } while (this.f18779b.mo19739t(cVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: a */
    public void mo20192a(long j) throws IOException {
        if (!this.f18780c) {
            while (j > 0) {
                C3383c cVar = this.f18778a;
                if (cVar.f18751c == 0 && this.f18779b.mo19739t(cVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f18778a.mo20186Q());
                this.f18778a.mo20192a(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    public ByteString mo20194b(long j) throws IOException {
        mo20231v(j);
        return this.f18778a.mo20194b(j);
    }

    /* renamed from: c */
    public C3383c mo20196c() {
        return this.f18778a;
    }

    public void close() throws IOException {
        if (!this.f18780c) {
            this.f18780c = true;
            this.f18779b.close();
            this.f18778a.mo20171B();
        }
    }

    /* renamed from: d */
    public Timeout mo19738d() {
        return this.f18779b.mo19738d();
    }

    public boolean isOpen() {
        return !this.f18780c;
    }

    /* renamed from: k */
    public String mo20214k() throws IOException {
        return mo20230u(Long.MAX_VALUE);
    }

    /* renamed from: l */
    public int mo20216l() throws IOException {
        mo20231v(4);
        return this.f18778a.mo20216l();
    }

    /* renamed from: m */
    public boolean mo20217m() throws IOException {
        if (!this.f18780c) {
            return this.f18778a.mo20217m() && this.f18779b.mo19739t(this.f18778a, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: o */
    public byte[] mo20219o(long j) throws IOException {
        mo20231v(j);
        return this.f18778a.mo20219o(j);
    }

    /* renamed from: q */
    public short mo20221q() throws IOException {
        mo20231v(2);
        return this.f18778a.mo20221q();
    }

    /* renamed from: r */
    public String mo20222r() throws IOException {
        long x = mo20234x(10);
        if (x != -1) {
            return this.f18778a.mo20185P(x);
        }
        long j = this.f18778a.f18751c;
        return j != 0 ? mo20276D(j) : null;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C3383c cVar = this.f18778a;
        if (cVar.f18751c == 0 && this.f18779b.mo19739t(cVar, 8192) == -1) {
            return -1;
        }
        return this.f18778a.read(byteBuffer);
    }

    public byte readByte() throws IOException {
        mo20231v(1);
        return this.f18778a.readByte();
    }

    public void readFully(byte[] bArr) throws IOException {
        try {
            mo20231v((long) bArr.length);
            this.f18778a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C3383c cVar = this.f18778a;
                long j = cVar.f18751c;
                if (j > 0) {
                    int J = cVar.mo20179J(bArr, i, (int) j);
                    if (J != -1) {
                        i += J;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public int readInt() throws IOException {
        mo20231v(4);
        return this.f18778a.readInt();
    }

    public short readShort() throws IOException {
        mo20231v(2);
        return this.f18778a.readShort();
    }

    /* renamed from: t */
    public long mo19739t(C3383c cVar, long j) throws IOException {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f18780c) {
            C3383c cVar2 = this.f18778a;
            if (cVar2.f18751c == 0 && this.f18779b.mo19739t(cVar2, 8192) == -1) {
                return -1;
            }
            return this.f18778a.mo19739t(cVar, Math.min(j, this.f18778a.f18751c));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.f18779b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public String mo20230u(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long B = mo20274B(10, 0, j2);
            if (B != -1) {
                return this.f18778a.mo20185P(B);
            }
            if (j2 < Long.MAX_VALUE && mo20277E(j2) && this.f18778a.mo20176G(j2 - 1) == 13 && mo20277E(1 + j2) && this.f18778a.mo20176G(j2) == 10) {
                return this.f18778a.mo20185P(j2);
            }
            C3383c cVar = new C3383c();
            C3383c cVar2 = this.f18778a;
            cVar2.mo20174E(cVar, 0, Math.min(32, cVar2.mo20186Q()));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(this.f18778a.mo20186Q(), j));
            sb.append(" content=");
            sb.append(cVar.mo20181L().mo20243i());
            sb.append(8230);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: v */
    public void mo20231v(long j) throws IOException {
        if (!mo20277E(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: x */
    public long mo20234x(byte b) throws IOException {
        return mo20274B(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: y */
    public boolean mo20235y(long j, ByteString fVar) throws IOException {
        return mo20275C(j, fVar, 0, fVar.mo20248o());
    }

    /* renamed from: z */
    public long mo20236z() throws IOException {
        mo20231v(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo20277E((long) i2)) {
                break;
            }
            byte G = this.f18778a.mo20176G((long) i);
            if ((G >= 48 && G <= 57) || ((G >= 97 && G <= 102) || (G >= 65 && G <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(G)}));
            }
        }
        return this.f18778a.mo20236z();
    }
}
