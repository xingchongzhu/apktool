package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.umeng.analytics.pro.bi */
public class TBinaryProtocol extends TProtocol {

    /* renamed from: a */
    protected static final int f16776a = -65536;

    /* renamed from: b */
    protected static final int f16777b = -2147418112;

    /* renamed from: h */
    private static final TStruct f16778h = new TStruct();

    /* renamed from: c */
    protected boolean f16779c;

    /* renamed from: d */
    protected boolean f16780d;

    /* renamed from: e */
    protected int f16781e;

    /* renamed from: f */
    protected boolean f16782f;

    /* renamed from: i */
    private byte[] f16783i;

    /* renamed from: j */
    private byte[] f16784j;

    /* renamed from: k */
    private byte[] f16785k;

    /* renamed from: l */
    private byte[] f16786l;

    /* renamed from: m */
    private byte[] f16787m;

    /* renamed from: n */
    private byte[] f16788n;

    /* renamed from: o */
    private byte[] f16789o;

    /* renamed from: p */
    private byte[] f16790p;

    /* renamed from: com.umeng.analytics.pro.bi$a */
    /* compiled from: TBinaryProtocol */
    public static class C3121a implements TProtocolFactory {

        /* renamed from: a */
        protected boolean f16791a;

        /* renamed from: b */
        protected boolean f16792b;

        /* renamed from: c */
        protected int f16793c;

        public C3121a() {
            this(false, true);
        }

        /* renamed from: a */
        public TProtocol mo19053a(TTransport cdVar) {
            TBinaryProtocol biVar = new TBinaryProtocol(cdVar, this.f16791a, this.f16792b);
            int i = this.f16793c;
            if (i != 0) {
                biVar.mo19028c(i);
            }
            return biVar;
        }

        public C3121a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public C3121a(boolean z, boolean z2, int i) {
            this.f16791a = false;
            this.f16792b = true;
            this.f16791a = z;
            this.f16792b = z2;
            this.f16793c = i;
        }
    }

    public TBinaryProtocol(TTransport cdVar) {
        this(cdVar, false, true);
    }

    /* renamed from: A */
    public ByteBuffer mo19009A() throws TException {
        int w = mo19049w();
        mo19030d(w);
        if (this.f16839g.mo19078h() >= w) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f16839g.mo19076f(), this.f16839g.mo19077g(), w);
            this.f16839g.mo19072a(w);
            return wrap;
        }
        byte[] bArr = new byte[w];
        this.f16839g.mo19080d(bArr, 0, w);
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public void mo19010a() {
    }

    /* renamed from: a */
    public void mo19018a(TMessage bnVar) throws TException {
        if (this.f16780d) {
            mo19013a((int) f16777b | bnVar.f16833b);
            mo19021a(bnVar.f16832a);
            mo19013a(bnVar.f16834c);
            return;
        }
        mo19021a(bnVar.f16832a);
        mo19011a(bnVar.f16833b);
        mo19013a(bnVar.f16834c);
    }

    /* renamed from: a */
    public void mo19020a(TStruct buVar) {
    }

    /* renamed from: b */
    public String mo19025b(int i) throws TException {
        try {
            mo19030d(i);
            byte[] bArr = new byte[i];
            this.f16839g.mo19080d(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: b */
    public void mo19026b() {
    }

    /* renamed from: c */
    public void mo19027c() {
    }

    /* renamed from: c */
    public void mo19028c(int i) {
        this.f16781e = i;
        this.f16782f = true;
    }

    /* renamed from: d */
    public void mo19029d() throws TException {
        mo19011a(0);
    }

    /* renamed from: e */
    public void mo19031e() {
    }

    /* renamed from: f */
    public void mo19032f() {
    }

    /* renamed from: g */
    public void mo19033g() {
    }

    /* renamed from: h */
    public TMessage mo19034h() throws TException {
        int w = mo19049w();
        if (w < 0) {
            if ((f16776a & w) == f16777b) {
                return new TMessage(mo19052z(), (byte) (w & 255), mo19049w());
            }
            throw new TProtocolException(4, "Bad version in readMessageBegin");
        } else if (!this.f16779c) {
            return new TMessage(mo19025b(w), mo19047u(), mo19049w());
        } else {
            throw new TProtocolException(4, "Missing version in readMessageBegin, old client?");
        }
    }

    /* renamed from: i */
    public void mo19035i() {
    }

    /* renamed from: j */
    public TStruct mo19036j() {
        return f16778h;
    }

    /* renamed from: k */
    public void mo19037k() {
    }

    /* renamed from: l */
    public TField mo19038l() throws TException {
        short s;
        byte u = mo19047u();
        if (u == 0) {
            s = 0;
        } else {
            s = mo19048v();
        }
        return new TField("", u, s);
    }

    /* renamed from: m */
    public void mo19039m() {
    }

    /* renamed from: n */
    public TMap mo19040n() throws TException {
        return new TMap(mo19047u(), mo19047u(), mo19049w());
    }

    /* renamed from: o */
    public void mo19041o() {
    }

    /* renamed from: p */
    public TList mo19042p() throws TException {
        return new TList(mo19047u(), mo19049w());
    }

    /* renamed from: q */
    public void mo19043q() {
    }

    /* renamed from: r */
    public TSet mo19044r() throws TException {
        return new TSet(mo19047u(), mo19049w());
    }

    /* renamed from: s */
    public void mo19045s() {
    }

    /* renamed from: t */
    public boolean mo19046t() throws TException {
        return mo19047u() == 1;
    }

    /* renamed from: u */
    public byte mo19047u() throws TException {
        if (this.f16839g.mo19078h() >= 1) {
            byte b = this.f16839g.mo19076f()[this.f16839g.mo19077g()];
            this.f16839g.mo19072a(1);
            return b;
        }
        m21712a(this.f16787m, 0, 1);
        return this.f16787m[0];
    }

    /* renamed from: v */
    public short mo19048v() throws TException {
        byte[] bArr = this.f16788n;
        int i = 0;
        if (this.f16839g.mo19078h() >= 2) {
            bArr = this.f16839g.mo19076f();
            i = this.f16839g.mo19077g();
            this.f16839g.mo19072a(2);
        } else {
            m21712a(this.f16788n, 0, 2);
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: w */
    public int mo19049w() throws TException {
        byte[] bArr = this.f16789o;
        int i = 0;
        if (this.f16839g.mo19078h() >= 4) {
            bArr = this.f16839g.mo19076f();
            i = this.f16839g.mo19077g();
            this.f16839g.mo19072a(4);
        } else {
            m21712a(this.f16789o, 0, 4);
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << TType.f16865n) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: x */
    public long mo19050x() throws TException {
        byte[] bArr = this.f16790p;
        int i = 0;
        if (this.f16839g.mo19078h() >= 8) {
            bArr = this.f16839g.mo19076f();
            i = this.f16839g.mo19077g();
            this.f16839g.mo19072a(8);
        } else {
            m21712a(this.f16790p, 0, 8);
        }
        return ((long) (bArr[i + 7] & 255)) | (((long) (bArr[i] & 255)) << 56) | (((long) (bArr[i + 1] & 255)) << 48) | (((long) (bArr[i + 2] & 255)) << 40) | (((long) (bArr[i + 3] & 255)) << 32) | (((long) (bArr[i + 4] & 255)) << 24) | (((long) (bArr[i + 5] & 255)) << 16) | (((long) (bArr[i + 6] & 255)) << 8);
    }

    /* renamed from: y */
    public double mo19051y() throws TException {
        return Double.longBitsToDouble(mo19050x());
    }

    /* renamed from: z */
    public String mo19052z() throws TException {
        int w = mo19049w();
        if (this.f16839g.mo19078h() < w) {
            return mo19025b(w);
        }
        try {
            String str = new String(this.f16839g.mo19076f(), this.f16839g.mo19077g(), w, "UTF-8");
            this.f16839g.mo19072a(w);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public TBinaryProtocol(TTransport cdVar, boolean z, boolean z2) {
        super(cdVar);
        this.f16779c = false;
        this.f16780d = true;
        this.f16782f = false;
        this.f16783i = new byte[1];
        this.f16784j = new byte[2];
        this.f16785k = new byte[4];
        this.f16786l = new byte[8];
        this.f16787m = new byte[1];
        this.f16788n = new byte[2];
        this.f16789o = new byte[4];
        this.f16790p = new byte[8];
        this.f16779c = z;
        this.f16780d = z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo19030d(int i) throws TException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Negative length: ");
            sb.append(i);
            throw new TProtocolException(sb.toString());
        } else if (this.f16782f) {
            int i2 = this.f16781e - i;
            this.f16781e = i2;
            if (i2 < 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Message length exceeded: ");
                sb2.append(i);
                throw new TProtocolException(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo19015a(TField bkVar) throws TException {
        mo19011a(bkVar.f16825b);
        mo19023a(bkVar.f16826c);
    }

    /* renamed from: a */
    public void mo19017a(TMap bmVar) throws TException {
        mo19011a(bmVar.f16829a);
        mo19011a(bmVar.f16830b);
        mo19013a(bmVar.f16831c);
    }

    /* renamed from: a */
    public void mo19016a(TList blVar) throws TException {
        mo19011a(blVar.f16827a);
        mo19013a(blVar.f16828b);
    }

    /* renamed from: a */
    public void mo19019a(TSet btVar) throws TException {
        mo19011a(btVar.f16849a);
        mo19013a(btVar.f16850b);
    }

    /* renamed from: a */
    public void mo19024a(boolean z) throws TException {
        mo19011a(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public void mo19011a(byte b) throws TException {
        byte[] bArr = this.f16783i;
        bArr[0] = b;
        this.f16839g.mo19069b(bArr, 0, 1);
    }

    /* renamed from: a */
    public void mo19023a(short s) throws TException {
        byte[] bArr = this.f16784j;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.f16839g.mo19069b(bArr, 0, 2);
    }

    /* renamed from: a */
    public void mo19013a(int i) throws TException {
        byte[] bArr = this.f16785k;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.f16839g.mo19069b(bArr, 0, 4);
    }

    /* renamed from: a */
    public void mo19014a(long j) throws TException {
        byte[] bArr = this.f16786l;
        bArr[0] = (byte) ((int) ((j >> 56) & 255));
        bArr[1] = (byte) ((int) ((j >> 48) & 255));
        bArr[2] = (byte) ((int) ((j >> 40) & 255));
        bArr[3] = (byte) ((int) ((j >> 32) & 255));
        bArr[4] = (byte) ((int) ((j >> 24) & 255));
        bArr[5] = (byte) ((int) ((j >> 16) & 255));
        bArr[6] = (byte) ((int) ((j >> 8) & 255));
        bArr[7] = (byte) ((int) (j & 255));
        this.f16839g.mo19069b(bArr, 0, 8);
    }

    /* renamed from: a */
    public void mo19012a(double d) throws TException {
        mo19014a(Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public void mo19021a(String str) throws TException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo19013a(bytes.length);
            this.f16839g.mo19069b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: a */
    public void mo19022a(ByteBuffer byteBuffer) throws TException {
        int limit = byteBuffer.limit() - byteBuffer.position();
        mo19013a(limit);
        this.f16839g.mo19069b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    /* renamed from: a */
    private int m21712a(byte[] bArr, int i, int i2) throws TException {
        mo19030d(i2);
        return this.f16839g.mo19080d(bArr, i, i2);
    }
}
