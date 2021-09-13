package p271e.p272f0.p277i;

import com.umeng.analytics.pro.TType;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p271e.p272f0.C3310c;
import p281f.BufferedSource;
import p281f.ByteString;
import p281f.C3383c;
import p281f.Source;
import p281f.Timeout;

/* renamed from: e.f0.i.h */
final class Http2Reader implements Closeable {

    /* renamed from: a */
    static final Logger f18356a = Logger.getLogger(Http2.class.getName());

    /* renamed from: b */
    private final BufferedSource f18357b;

    /* renamed from: c */
    private final C3347a f18358c;

    /* renamed from: d */
    private final boolean f18359d;

    /* renamed from: e */
    final C3328a f18360e;

    /* renamed from: e.f0.i.h$a */
    /* compiled from: Http2Reader */
    static final class C3347a implements Source {

        /* renamed from: a */
        private final BufferedSource f18361a;

        /* renamed from: b */
        int f18362b;

        /* renamed from: c */
        byte f18363c;

        /* renamed from: d */
        int f18364d;

        /* renamed from: e */
        int f18365e;

        /* renamed from: f */
        short f18366f;

        C3347a(BufferedSource eVar) {
            this.f18361a = eVar;
        }

        /* renamed from: B */
        private void m23361B() throws IOException {
            int i = this.f18364d;
            int I = Http2Reader.m23351I(this.f18361a);
            this.f18365e = I;
            this.f18362b = I;
            byte readByte = (byte) (this.f18361a.readByte() & 255);
            this.f18363c = (byte) (this.f18361a.readByte() & 255);
            Logger logger = Http2Reader.f18356a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.m23267b(true, this.f18364d, this.f18362b, readByte, this.f18363c));
            }
            int readInt = this.f18361a.readInt() & Integer.MAX_VALUE;
            this.f18364d = readInt;
            if (readByte != 9) {
                throw Http2.m23269d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (readInt != i) {
                throw Http2.m23269d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public void close() throws IOException {
        }

        /* renamed from: d */
        public Timeout mo19738d() {
            return this.f18361a.mo19738d();
        }

        /* renamed from: t */
        public long mo19739t(C3383c cVar, long j) throws IOException {
            while (true) {
                int i = this.f18365e;
                if (i == 0) {
                    this.f18361a.mo20192a((long) this.f18366f);
                    this.f18366f = 0;
                    if ((this.f18363c & 4) != 0) {
                        return -1;
                    }
                    m23361B();
                } else {
                    long t = this.f18361a.mo19739t(cVar, Math.min(j, (long) i));
                    if (t == -1) {
                        return -1;
                    }
                    this.f18365e = (int) (((long) this.f18365e) - t);
                    return t;
                }
            }
        }
    }

    /* renamed from: e.f0.i.h$b */
    /* compiled from: Http2Reader */
    interface C3348b {
        /* renamed from: a */
        void mo19865a();

        /* renamed from: b */
        void mo19866b(boolean z, Settings mVar);

        /* renamed from: c */
        void mo19867c(boolean z, int i, BufferedSource eVar, int i2) throws IOException;

        /* renamed from: d */
        void mo19868d(boolean z, int i, int i2);

        /* renamed from: e */
        void mo19869e(int i, int i2, int i3, boolean z);

        /* renamed from: f */
        void mo19870f(int i, ErrorCode bVar);

        /* renamed from: g */
        void mo19871g(boolean z, int i, int i2, List<Header> list);

        /* renamed from: h */
        void mo19872h(int i, long j);

        /* renamed from: i */
        void mo19873i(int i, int i2, List<Header> list) throws IOException;

        /* renamed from: j */
        void mo19874j(int i, ErrorCode bVar, ByteString fVar);
    }

    Http2Reader(BufferedSource eVar, boolean z) {
        this.f18357b = eVar;
        this.f18359d = z;
        C3347a aVar = new C3347a(eVar);
        this.f18358c = aVar;
        this.f18360e = new C3328a(4096, aVar);
    }

    /* renamed from: B */
    static int m23346B(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw Http2.m23269d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* renamed from: E */
    private void m23347E(C3348b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.f18357b.readByte() & 255);
                }
                bVar.mo19867c(z2, i2, this.f18357b, m23346B(i, b, s));
                this.f18357b.mo20192a((long) s);
                return;
            }
            throw Http2.m23269d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw Http2.m23269d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    /* renamed from: F */
    private void m23348F(C3348b bVar, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            throw Http2.m23269d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int readInt = this.f18357b.readInt();
            int readInt2 = this.f18357b.readInt();
            int i3 = i - 8;
            ErrorCode a = ErrorCode.m23237a(readInt2);
            if (a != null) {
                ByteString fVar = ByteString.f18753b;
                if (i3 > 0) {
                    fVar = this.f18357b.mo20194b((long) i3);
                }
                bVar.mo19874j(readInt, a, fVar);
                return;
            }
            throw Http2.m23269d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
        } else {
            throw Http2.m23269d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
    }

    /* renamed from: G */
    private List<Header> m23349G(int i, short s, byte b, int i2) throws IOException {
        C3347a aVar = this.f18358c;
        aVar.f18365e = i;
        aVar.f18362b = i;
        aVar.f18366f = s;
        aVar.f18363c = b;
        aVar.f18364d = i2;
        this.f18360e.mo19832k();
        return this.f18360e.mo19830e();
    }

    /* renamed from: H */
    private void m23350H(C3348b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.f18357b.readByte() & 255);
            }
            if ((b & 32) != 0) {
                m23353K(bVar, i2);
                i -= 5;
            }
            bVar.mo19871g(z, i2, -1, m23349G(m23346B(i, b, s), s, b, i2));
            return;
        }
        throw Http2.m23269d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    /* renamed from: I */
    static int m23351I(BufferedSource eVar) throws IOException {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << TType.f16865n) | ((eVar.readByte() & 255) << 8);
    }

    /* renamed from: J */
    private void m23352J(C3348b bVar, int i, byte b, int i2) throws IOException {
        boolean z = false;
        if (i != 8) {
            throw Http2.m23269d("TYPE_PING length != 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int readInt = this.f18357b.readInt();
            int readInt2 = this.f18357b.readInt();
            if ((b & 1) != 0) {
                z = true;
            }
            bVar.mo19868d(z, readInt, readInt2);
        } else {
            throw Http2.m23269d("TYPE_PING streamId != 0", new Object[0]);
        }
    }

    /* renamed from: K */
    private void m23353K(C3348b bVar, int i) throws IOException {
        int readInt = this.f18357b.readInt();
        bVar.mo19869e(i, readInt & Integer.MAX_VALUE, (this.f18357b.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: L */
    private void m23354L(C3348b bVar, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            throw Http2.m23269d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        } else if (i2 != 0) {
            m23353K(bVar, i2);
        } else {
            throw Http2.m23269d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
    }

    /* renamed from: M */
    private void m23355M(C3348b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.f18357b.readByte() & 255);
            }
            bVar.mo19873i(i2, this.f18357b.readInt() & Integer.MAX_VALUE, m23349G(m23346B(i - 4, b, s), s, b, i2));
            return;
        }
        throw Http2.m23269d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    /* renamed from: N */
    private void m23356N(C3348b bVar, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw Http2.m23269d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        } else if (i2 != 0) {
            int readInt = this.f18357b.readInt();
            ErrorCode a = ErrorCode.m23237a(readInt);
            if (a != null) {
                bVar.mo19870f(i2, a);
            } else {
                throw Http2.m23269d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
        } else {
            throw Http2.m23269d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
    }

    /* renamed from: O */
    private void m23357O(C3348b bVar, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            throw Http2.m23269d("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b & 1) != 0) {
            if (i == 0) {
                bVar.mo19865a();
            } else {
                throw Http2.m23269d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
        } else if (i % 6 == 0) {
            Settings mVar = new Settings();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.f18357b.readShort() & 65535;
                int readInt = this.f18357b.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            throw Http2.m23269d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        throw Http2.m23269d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                    }
                } else if (!(readInt == 0 || readInt == 1)) {
                    throw Http2.m23269d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
                mVar.mo19932i(readShort, readInt);
            }
            bVar.mo19866b(false, mVar);
        } else {
            throw Http2.m23269d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: P */
    private void m23358P(C3348b bVar, int i, byte b, int i2) throws IOException {
        if (i == 4) {
            long readInt = ((long) this.f18357b.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.mo19872h(i2, readInt);
            } else {
                throw Http2.m23269d("windowSizeIncrement was 0", Long.valueOf(readInt));
            }
        } else {
            throw Http2.m23269d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: C */
    public boolean mo19876C(boolean z, C3348b bVar) throws IOException {
        try {
            this.f18357b.mo20231v(9);
            int I = m23351I(this.f18357b);
            if (I < 0 || I > 16384) {
                throw Http2.m23269d("FRAME_SIZE_ERROR: %s", Integer.valueOf(I));
            }
            byte readByte = (byte) (this.f18357b.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f18357b.readByte() & 255);
                int readInt = this.f18357b.readInt() & Integer.MAX_VALUE;
                Logger logger = f18356a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Http2.m23267b(true, readInt, I, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m23347E(bVar, I, readByte2, readInt);
                        break;
                    case 1:
                        m23350H(bVar, I, readByte2, readInt);
                        break;
                    case 2:
                        m23354L(bVar, I, readByte2, readInt);
                        break;
                    case 3:
                        m23356N(bVar, I, readByte2, readInt);
                        break;
                    case 4:
                        m23357O(bVar, I, readByte2, readInt);
                        break;
                    case 5:
                        m23355M(bVar, I, readByte2, readInt);
                        break;
                    case 6:
                        m23352J(bVar, I, readByte2, readInt);
                        break;
                    case 7:
                        m23348F(bVar, I, readByte2, readInt);
                        break;
                    case 8:
                        m23358P(bVar, I, readByte2, readInt);
                        break;
                    default:
                        this.f18357b.mo20192a((long) I);
                        break;
                }
                return true;
            }
            throw Http2.m23269d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: D */
    public void mo19877D(C3348b bVar) throws IOException {
        if (!this.f18359d) {
            BufferedSource eVar = this.f18357b;
            ByteString fVar = Http2.f18272a;
            ByteString b = eVar.mo20194b((long) fVar.mo20248o());
            Logger logger = f18356a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C3310c.m23063q("<< CONNECTION %s", b.mo20243i()));
            }
            if (!fVar.equals(b)) {
                throw Http2.m23269d("Expected a connection header but was %s", b.mo20253t());
            }
        } else if (!mo19876C(true, bVar)) {
            throw Http2.m23269d("Required SETTINGS preface not received", new Object[0]);
        }
    }

    public void close() throws IOException {
        this.f18357b.close();
    }
}
