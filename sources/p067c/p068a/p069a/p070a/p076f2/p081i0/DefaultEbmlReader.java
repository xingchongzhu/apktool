package p067c.p068a.p069a.p070a.p076f2.p081i0;

import java.io.IOException;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.f2.i0.b */
final class DefaultEbmlReader implements EbmlReader {

    /* renamed from: a */
    private final byte[] f6155a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<C0934b> f6156b = new ArrayDeque<>();

    /* renamed from: c */
    private final VarintReader f6157c = new VarintReader();

    /* renamed from: d */
    private EbmlProcessor f6158d;

    /* renamed from: e */
    private int f6159e;

    /* renamed from: f */
    private int f6160f;

    /* renamed from: g */
    private long f6161g;

    /* renamed from: c.a.a.a.f2.i0.b$b */
    /* compiled from: DefaultEbmlReader */
    private static final class C0934b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f6162a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f6163b;

        private C0934b(int i, long j) {
            this.f6162a = i;
            this.f6163b = j;
        }
    }

    @RequiresNonNull({"processor"})
    /* renamed from: c */
    private long m7507c(ExtractorInput kVar) throws IOException {
        kVar.mo6199h();
        while (true) {
            kVar.mo6204o(this.f6155a, 0, 4);
            int c = VarintReader.m7591c(this.f6155a[0]);
            if (c != -1 && c <= 4) {
                int a = (int) VarintReader.m7590a(this.f6155a, c, false);
                if (this.f6158d.mo6225d(a)) {
                    kVar.mo6200i(c);
                    return (long) a;
                }
            }
            kVar.mo6200i(1);
        }
    }

    /* renamed from: d */
    private double m7508d(ExtractorInput kVar, int i) throws IOException {
        long e = m7509e(kVar, i);
        if (i == 4) {
            return (double) Float.intBitsToFloat((int) e);
        }
        return Double.longBitsToDouble(e);
    }

    /* renamed from: e */
    private long m7509e(ExtractorInput kVar, int i) throws IOException {
        kVar.readFully(this.f6155a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f6155a[i2] & 255));
        }
        return j;
    }

    /* renamed from: f */
    private static String m7510f(ExtractorInput kVar, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        kVar.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    /* renamed from: a */
    public boolean mo6219a(ExtractorInput kVar) throws IOException {
        Assertions.m10156h(this.f6158d);
        while (true) {
            C0934b bVar = (C0934b) this.f6156b.peek();
            if (bVar == null || kVar.mo6206q() < bVar.f6163b) {
                if (this.f6159e == 0) {
                    long d = this.f6157c.mo6249d(kVar, true, false, 4);
                    if (d == -2) {
                        d = m7507c(kVar);
                    }
                    if (d == -1) {
                        return false;
                    }
                    this.f6160f = (int) d;
                    this.f6159e = 1;
                }
                if (this.f6159e == 1) {
                    this.f6161g = this.f6157c.mo6249d(kVar, false, true, 8);
                    this.f6159e = 2;
                }
                int b = this.f6158d.mo6223b(this.f6160f);
                if (b == 0) {
                    kVar.mo6200i((int) this.f6161g);
                    this.f6159e = 0;
                } else if (b == 1) {
                    long q = kVar.mo6206q();
                    this.f6156b.push(new C0934b(this.f6160f, this.f6161g + q));
                    this.f6158d.mo6228g(this.f6160f, q, this.f6161g);
                    this.f6159e = 0;
                    return true;
                } else if (b == 2) {
                    long j = this.f6161g;
                    if (j <= 8) {
                        this.f6158d.mo6229h(this.f6160f, m7509e(kVar, (int) j));
                        this.f6159e = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid integer size: ");
                    sb.append(this.f6161g);
                    throw new ParserException(sb.toString());
                } else if (b == 3) {
                    long j2 = this.f6161g;
                    if (j2 <= 2147483647L) {
                        this.f6158d.mo6227f(this.f6160f, m7510f(kVar, (int) j2));
                        this.f6159e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("String element size: ");
                    sb2.append(this.f6161g);
                    throw new ParserException(sb2.toString());
                } else if (b == 4) {
                    this.f6158d.mo6226e(this.f6160f, (int) this.f6161g, kVar);
                    this.f6159e = 0;
                    return true;
                } else if (b == 5) {
                    long j3 = this.f6161g;
                    if (j3 == 4 || j3 == 8) {
                        this.f6158d.mo6224c(this.f6160f, m7508d(kVar, (int) j3));
                        this.f6159e = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid float size: ");
                    sb3.append(this.f6161g);
                    throw new ParserException(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid element type ");
                    sb4.append(b);
                    throw new ParserException(sb4.toString());
                }
            } else {
                this.f6158d.mo6222a(((C0934b) this.f6156b.pop()).f6162a);
                return true;
            }
        }
    }

    /* renamed from: b */
    public void mo6220b(EbmlProcessor cVar) {
        this.f6158d = cVar;
    }

    public void reset() {
        this.f6159e = 0;
        this.f6156b.clear();
        this.f6157c.mo6250e();
    }
}
