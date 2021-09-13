package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.umeng.analytics.pro.bj */
public class TCompactProtocol extends TProtocol {

    /* renamed from: d */
    private static final TStruct f16794d;

    /* renamed from: e */
    private static final TField f16795e;

    /* renamed from: f */
    private static final byte[] f16796f;

    /* renamed from: h */
    private static final byte f16797h = -126;

    /* renamed from: i */
    private static final byte f16798i = 1;

    /* renamed from: j */
    private static final byte f16799j = 31;

    /* renamed from: k */
    private static final byte f16800k = -32;

    /* renamed from: l */
    private static final int f16801l = 5;

    /* renamed from: a */
    byte[] f16802a;

    /* renamed from: b */
    byte[] f16803b;

    /* renamed from: c */
    byte[] f16804c;

    /* renamed from: m */
    private ShortStack f16805m;

    /* renamed from: n */
    private short f16806n;

    /* renamed from: o */
    private TField f16807o;

    /* renamed from: p */
    private Boolean f16808p;

    /* renamed from: q */
    private final long f16809q;

    /* renamed from: r */
    private byte[] f16810r;

    /* renamed from: com.umeng.analytics.pro.bj$a */
    /* compiled from: TCompactProtocol */
    public static class C3122a implements TProtocolFactory {

        /* renamed from: a */
        private final long f16811a;

        public C3122a() {
            this.f16811a = -1;
        }

        /* renamed from: a */
        public TProtocol mo19053a(TTransport cdVar) {
            return new TCompactProtocol(cdVar, this.f16811a);
        }

        public C3122a(int i) {
            this.f16811a = (long) i;
        }
    }

    /* renamed from: com.umeng.analytics.pro.bj$b */
    /* compiled from: TCompactProtocol */
    private static class C3123b {

        /* renamed from: a */
        public static final byte f16812a = 1;

        /* renamed from: b */
        public static final byte f16813b = 2;

        /* renamed from: c */
        public static final byte f16814c = 3;

        /* renamed from: d */
        public static final byte f16815d = 4;

        /* renamed from: e */
        public static final byte f16816e = 5;

        /* renamed from: f */
        public static final byte f16817f = 6;

        /* renamed from: g */
        public static final byte f16818g = 7;

        /* renamed from: h */
        public static final byte f16819h = 8;

        /* renamed from: i */
        public static final byte f16820i = 9;

        /* renamed from: j */
        public static final byte f16821j = 10;

        /* renamed from: k */
        public static final byte f16822k = 11;

        /* renamed from: l */
        public static final byte f16823l = 12;

        private C3123b() {
        }
    }

    static {
        String str = "";
        f16794d = new TStruct(str);
        f16795e = new TField(str, 0, 0);
        byte[] bArr = new byte[16];
        f16796f = bArr;
        bArr[0] = 0;
        bArr[2] = 1;
        bArr[3] = 3;
        bArr[6] = 4;
        bArr[8] = 5;
        bArr[10] = 6;
        bArr[4] = 7;
        bArr[11] = 8;
        bArr[15] = 9;
        bArr[14] = 10;
        bArr[13] = 11;
        bArr[12] = 12;
    }

    public TCompactProtocol(TTransport cdVar, long j) {
        super(cdVar);
        this.f16805m = new ShortStack(15);
        this.f16806n = 0;
        this.f16807o = null;
        this.f16808p = null;
        this.f16802a = new byte[5];
        this.f16803b = new byte[10];
        this.f16810r = new byte[1];
        this.f16804c = new byte[1];
        this.f16809q = j;
    }

    /* renamed from: E */
    private int m21758E() throws TException {
        int i = 0;
        if (this.f16839g.mo19078h() >= 5) {
            byte[] f = this.f16839g.mo19076f();
            int g = this.f16839g.mo19077g();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte b = f[g + i];
                i2 |= (b & Byte.MAX_VALUE) << i3;
                if ((b & 128) != 128) {
                    this.f16839g.mo19072a(i + 1);
                    return i2;
                }
                i3 += 7;
                i++;
            }
        } else {
            int i4 = 0;
            while (true) {
                byte u = mo19047u();
                i |= (u & Byte.MAX_VALUE) << i4;
                if ((u & 128) != 128) {
                    return i;
                }
                i4 += 7;
            }
        }
    }

    /* renamed from: F */
    private long m21759F() throws TException {
        int i = 0;
        long j = 0;
        if (this.f16839g.mo19078h() >= 10) {
            byte[] f = this.f16839g.mo19076f();
            int g = this.f16839g.mo19077g();
            long j2 = 0;
            int i2 = 0;
            while (true) {
                byte b = f[g + i];
                j2 |= ((long) (b & Byte.MAX_VALUE)) << i2;
                if ((b & 128) != 128) {
                    this.f16839g.mo19072a(i + 1);
                    return j2;
                }
                i2 += 7;
                i++;
            }
        } else {
            while (true) {
                byte u = mo19047u();
                j |= ((long) (u & Byte.MAX_VALUE)) << i;
                if ((u & 128) != 128) {
                    return j;
                }
                i += 7;
            }
        }
    }

    /* renamed from: c */
    private int m21767c(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: c */
    private long m21768c(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: c */
    private boolean m21769c(byte b) {
        byte b2 = b & TType.f16864m;
        return b2 == 1 || b2 == 2;
    }

    /* renamed from: d */
    private long m21771d(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: e */
    private byte[] m21774e(int i) throws TException {
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        this.f16839g.mo19080d(bArr, 0, i);
        return bArr;
    }

    /* renamed from: f */
    private void m21775f(int i) throws TProtocolException {
        if (i >= 0) {
            long j = this.f16809q;
            if (j != -1 && ((long) i) > j) {
                StringBuilder sb = new StringBuilder();
                sb.append("Length exceeded max allowed: ");
                sb.append(i);
                throw new TProtocolException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Negative length: ");
        sb2.append(i);
        throw new TProtocolException(sb2.toString());
    }

    /* renamed from: g */
    private int m21776g(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: A */
    public ByteBuffer mo19009A() throws TException {
        int E = m21758E();
        m21775f(E);
        if (E == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[E];
        this.f16839g.mo19080d(bArr, 0, E);
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: B */
    public void mo19054B() {
        this.f16805m.mo18953c();
        this.f16806n = 0;
    }

    /* renamed from: a */
    public void mo19010a() throws TException {
    }

    /* renamed from: a */
    public void mo19018a(TMessage bnVar) throws TException {
        m21764b((byte) f16797h);
        m21772d(((bnVar.f16833b << 5) & -32) | 1);
        mo19065b(bnVar.f16834c);
        mo19021a(bnVar.f16832a);
    }

    /* renamed from: b */
    public void mo19026b() throws TException {
        this.f16806n = this.f16805m.mo18950a();
    }

    /* renamed from: c */
    public void mo19027c() throws TException {
    }

    /* renamed from: d */
    public void mo19029d() throws TException {
        m21764b(0);
    }

    /* renamed from: e */
    public void mo19031e() throws TException {
    }

    /* renamed from: f */
    public void mo19032f() throws TException {
    }

    /* renamed from: g */
    public void mo19033g() throws TException {
    }

    /* renamed from: h */
    public TMessage mo19034h() throws TException {
        byte u = mo19047u();
        if (u == -126) {
            byte u2 = mo19047u();
            byte b = (byte) (u2 & f16799j);
            if (b == 1) {
                return new TMessage(mo19052z(), (byte) ((u2 >> 5) & 3), m21758E());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected version 1 but got ");
            sb.append(b);
            throw new TProtocolException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected protocol id ");
        sb2.append(Integer.toHexString(-126));
        sb2.append(" but got ");
        sb2.append(Integer.toHexString(u));
        throw new TProtocolException(sb2.toString());
    }

    /* renamed from: i */
    public void mo19035i() throws TException {
    }

    /* renamed from: j */
    public TStruct mo19036j() throws TException {
        this.f16805m.mo18951a(this.f16806n);
        this.f16806n = 0;
        return f16794d;
    }

    /* renamed from: k */
    public void mo19037k() throws TException {
        this.f16806n = this.f16805m.mo18950a();
    }

    /* renamed from: l */
    public TField mo19038l() throws TException {
        short s;
        byte u = mo19047u();
        if (u == 0) {
            return f16795e;
        }
        short s2 = (short) ((u & 240) >> 4);
        if (s2 == 0) {
            s = mo19048v();
        } else {
            s = (short) (this.f16806n + s2);
        }
        byte b = (byte) (u & TType.f16864m);
        TField bkVar = new TField("", m21770d(b), s);
        if (m21769c(u)) {
            this.f16808p = b == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.f16806n = bkVar.f16826c;
        return bkVar;
    }

    /* renamed from: m */
    public void mo19039m() throws TException {
    }

    /* renamed from: n */
    public TMap mo19040n() throws TException {
        byte b;
        int E = m21758E();
        if (E == 0) {
            b = 0;
        } else {
            b = mo19047u();
        }
        return new TMap(m21770d((byte) (b >> 4)), m21770d((byte) (b & TType.f16864m)), E);
    }

    /* renamed from: o */
    public void mo19041o() throws TException {
    }

    /* renamed from: p */
    public TList mo19042p() throws TException {
        byte u = mo19047u();
        int i = (u >> 4) & 15;
        if (i == 15) {
            i = m21758E();
        }
        return new TList(m21770d(u), i);
    }

    /* renamed from: q */
    public void mo19043q() throws TException {
    }

    /* renamed from: r */
    public TSet mo19044r() throws TException {
        return new TSet(mo19042p());
    }

    /* renamed from: s */
    public void mo19045s() throws TException {
    }

    /* renamed from: t */
    public boolean mo19046t() throws TException {
        Boolean bool = this.f16808p;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f16808p = null;
            return booleanValue;
        }
        boolean z = true;
        if (mo19047u() != 1) {
            z = false;
        }
        return z;
    }

    /* renamed from: u */
    public byte mo19047u() throws TException {
        if (this.f16839g.mo19078h() > 0) {
            byte b = this.f16839g.mo19076f()[this.f16839g.mo19077g()];
            this.f16839g.mo19072a(1);
            return b;
        }
        this.f16839g.mo19080d(this.f16804c, 0, 1);
        return this.f16804c[0];
    }

    /* renamed from: v */
    public short mo19048v() throws TException {
        return (short) m21776g(m21758E());
    }

    /* renamed from: w */
    public int mo19049w() throws TException {
        return m21776g(m21758E());
    }

    /* renamed from: x */
    public long mo19050x() throws TException {
        return m21771d(m21759F());
    }

    /* renamed from: y */
    public double mo19051y() throws TException {
        byte[] bArr = new byte[8];
        this.f16839g.mo19080d(bArr, 0, 8);
        return Double.longBitsToDouble(m21760a(bArr));
    }

    /* renamed from: z */
    public String mo19052z() throws TException {
        int E = m21758E();
        m21775f(E);
        if (E == 0) {
            return "";
        }
        try {
            String str = "UTF-8";
            if (this.f16839g.mo19078h() < E) {
                return new String(m21774e(E), str);
            }
            String str2 = new String(this.f16839g.mo19076f(), this.f16839g.mo19077g(), E, str);
            this.f16839g.mo19072a(E);
            return str2;
        } catch (UnsupportedEncodingException unused) {
            throw new TException("UTF-8 not supported!");
        }
    }

    /* renamed from: b */
    private void mo19065b(int i) throws TException {
        int i2 = 0;
        while ((i & -128) != 0) {
            int i3 = i2 + 1;
            this.f16802a[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
            i2 = i3;
        }
        byte[] bArr = this.f16802a;
        int i4 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f16839g.mo19069b(bArr, 0, i4);
    }

    /* renamed from: d */
    private void m21772d(int i) throws TException {
        m21764b((byte) i);
    }

    /* renamed from: d */
    private byte m21770d(byte b) throws TProtocolException {
        byte b2 = (byte) (b & TType.f16864m);
        switch (b2) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 8;
            case 6:
                return 10;
            case 7:
                return 4;
            case 8:
                return 11;
            case 9:
                return TType.f16864m;
            case 10:
                return TType.f16863l;
            case 11:
                return TType.f16862k;
            case 12:
                return 12;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("don't know what type: ");
                sb.append(b2);
                throw new TProtocolException(sb.toString());
        }
    }

    /* renamed from: e */
    private byte m21773e(byte b) {
        return f16796f[b];
    }

    /* renamed from: b */
    private void m21766b(long j) throws TException {
        int i = 0;
        while ((-128 & j) != 0) {
            int i2 = i + 1;
            this.f16803b[i] = (byte) ((int) ((127 & j) | 128));
            j >>>= 7;
            i = i2;
        }
        byte[] bArr = this.f16803b;
        int i3 = i + 1;
        bArr[i] = (byte) ((int) j);
        this.f16839g.mo19069b(bArr, 0, i3);
    }

    /* renamed from: a */
    public void mo19020a(TStruct buVar) throws TException {
        this.f16805m.mo18951a(this.f16806n);
        this.f16806n = 0;
    }

    /* renamed from: a */
    public void mo19015a(TField bkVar) throws TException {
        if (bkVar.f16825b == 2) {
            this.f16807o = bkVar;
        } else {
            m21762a(bkVar, -1);
        }
    }

    /* renamed from: b */
    private void m21764b(byte b) throws TException {
        byte[] bArr = this.f16810r;
        bArr[0] = b;
        this.f16839g.mo19079b(bArr);
    }

    /* renamed from: a */
    private void m21762a(TField bkVar, byte b) throws TException {
        if (b == -1) {
            b = m21773e(bkVar.f16825b);
        }
        short s = bkVar.f16826c;
        short s2 = this.f16806n;
        if (s <= s2 || s - s2 > 15) {
            m21764b(b);
            mo19023a(bkVar.f16826c);
        } else {
            m21772d((int) b | ((s - s2) << 4));
        }
        this.f16806n = bkVar.f16826c;
    }

    public TCompactProtocol(TTransport cdVar) {
        this(cdVar, -1);
    }

    /* renamed from: a */
    public void mo19017a(TMap bmVar) throws TException {
        int i = bmVar.f16831c;
        if (i == 0) {
            m21772d(0);
            return;
        }
        mo19065b(i);
        m21772d((int) m21773e(bmVar.f16830b) | (m21773e(bmVar.f16829a) << 4));
    }

    /* renamed from: a */
    public void mo19016a(TList blVar) throws TException {
        mo19055a(blVar.f16827a, blVar.f16828b);
    }

    /* renamed from: a */
    public void mo19019a(TSet btVar) throws TException {
        mo19055a(btVar.f16849a, btVar.f16850b);
    }

    /* renamed from: a */
    public void mo19024a(boolean z) throws TException {
        TField bkVar = this.f16807o;
        byte b = 1;
        if (bkVar != null) {
            if (!z) {
                b = 2;
            }
            m21762a(bkVar, b);
            this.f16807o = null;
            return;
        }
        if (!z) {
            b = 2;
        }
        m21764b(b);
    }

    /* renamed from: a */
    public void mo19011a(byte b) throws TException {
        m21764b(b);
    }

    /* renamed from: a */
    public void mo19023a(short s) throws TException {
        mo19065b(m21767c((int) s));
    }

    /* renamed from: a */
    public void mo19013a(int i) throws TException {
        mo19065b(m21767c(i));
    }

    /* renamed from: a */
    public void mo19014a(long j) throws TException {
        m21766b(m21768c(j));
    }

    /* renamed from: a */
    public void mo19012a(double d) throws TException {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        m21761a(Double.doubleToLongBits(d), bArr, 0);
        this.f16839g.mo19079b(bArr);
    }

    /* renamed from: a */
    public void mo19021a(String str) throws TException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            m21763a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new TException("UTF-8 not supported!");
        }
    }

    /* renamed from: a */
    public void mo19022a(ByteBuffer byteBuffer) throws TException {
        m21763a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    /* renamed from: a */
    private void m21763a(byte[] bArr, int i, int i2) throws TException {
        mo19065b(i2);
        this.f16839g.mo19069b(bArr, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19055a(byte b, int i) throws TException {
        if (i <= 14) {
            m21772d((int) m21773e(b) | (i << 4));
            return;
        }
        m21772d((int) m21773e(b) | 240);
        mo19065b(i);
    }

    /* renamed from: a */
    private void m21761a(long j, byte[] bArr, int i) {
        bArr[i + 0] = (byte) ((int) (j & 255));
        bArr[i + 1] = (byte) ((int) ((j >> 8) & 255));
        bArr[i + 2] = (byte) ((int) ((j >> 16) & 255));
        bArr[i + 3] = (byte) ((int) ((j >> 24) & 255));
        bArr[i + 4] = (byte) ((int) ((j >> 32) & 255));
        bArr[i + 5] = (byte) ((int) ((j >> 40) & 255));
        bArr[i + 6] = (byte) ((int) ((j >> 48) & 255));
        bArr[i + 7] = (byte) ((int) ((j >> 56) & 255));
    }

    /* renamed from: a */
    private long m21760a(byte[] bArr) {
        return ((((long) bArr[7]) & 255) << 56) | ((((long) bArr[6]) & 255) << 48) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[1]) & 255) << 8) | (255 & ((long) bArr[0]));
    }
}
