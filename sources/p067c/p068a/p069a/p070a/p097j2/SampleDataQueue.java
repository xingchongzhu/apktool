package p067c.p068a.p069a.p070a.p097j2;

import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p073c2.CryptoInfo;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p076f2.C0916b0.C0917a;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.j2.j0 */
class SampleDataQueue {

    /* renamed from: a */
    private final Allocator f7510a;

    /* renamed from: b */
    private final int f7511b;

    /* renamed from: c */
    private final ParsableByteArray f7512c = new ParsableByteArray(32);

    /* renamed from: d */
    private C1098a f7513d;

    /* renamed from: e */
    private C1098a f7514e;

    /* renamed from: f */
    private C1098a f7515f;

    /* renamed from: g */
    private long f7516g;

    /* renamed from: c.a.a.a.j2.j0$a */
    /* compiled from: SampleDataQueue */
    private static final class C1098a {

        /* renamed from: a */
        public final long f7517a;

        /* renamed from: b */
        public final long f7518b;

        /* renamed from: c */
        public boolean f7519c;

        /* renamed from: d */
        public Allocation f7520d;

        /* renamed from: e */
        public C1098a f7521e;

        public C1098a(long j, int i) {
            this.f7517a = j;
            this.f7518b = j + ((long) i);
        }

        /* renamed from: a */
        public C1098a mo6916a() {
            this.f7520d = null;
            C1098a aVar = this.f7521e;
            this.f7521e = null;
            return aVar;
        }

        /* renamed from: b */
        public void mo6917b(Allocation dVar, C1098a aVar) {
            this.f7520d = dVar;
            this.f7521e = aVar;
            this.f7519c = true;
        }

        /* renamed from: c */
        public int mo6918c(long j) {
            return ((int) (j - this.f7517a)) + this.f7520d.f12300b;
        }
    }

    public SampleDataQueue(Allocator eVar) {
        this.f7510a = eVar;
        int e = eVar.mo14922e();
        this.f7511b = e;
        C1098a aVar = new C1098a(0, e);
        this.f7513d = aVar;
        this.f7514e = aVar;
        this.f7515f = aVar;
    }

    /* renamed from: a */
    private void m9048a(C1098a aVar) {
        if (aVar.f7519c) {
            C1098a aVar2 = this.f7515f;
            boolean z = aVar2.f7519c;
            int i = (z ? 1 : 0) + (((int) (aVar2.f7517a - aVar.f7517a)) / this.f7511b);
            Allocation[] dVarArr = new Allocation[i];
            for (int i2 = 0; i2 < i; i2++) {
                dVarArr[i2] = aVar.f7520d;
                aVar = aVar.mo6916a();
            }
            this.f7510a.mo14920c(dVarArr);
        }
    }

    /* renamed from: d */
    private static C1098a m9049d(C1098a aVar, long j) {
        while (j >= aVar.f7518b) {
            aVar = aVar.f7521e;
        }
        return aVar;
    }

    /* renamed from: f */
    private void m9050f(int i) {
        long j = this.f7516g + ((long) i);
        this.f7516g = j;
        C1098a aVar = this.f7515f;
        if (j == aVar.f7518b) {
            this.f7515f = aVar.f7521e;
        }
    }

    /* renamed from: g */
    private int m9051g(int i) {
        C1098a aVar = this.f7515f;
        if (!aVar.f7519c) {
            aVar.mo6917b(this.f7510a.mo14921d(), new C1098a(this.f7515f.f7518b, this.f7511b));
        }
        return Math.min(i, (int) (this.f7515f.f7518b - this.f7516g));
    }

    /* renamed from: h */
    private static C1098a m9052h(C1098a aVar, long j, ByteBuffer byteBuffer, int i) {
        C1098a d = m9049d(aVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (d.f7518b - j));
            byteBuffer.put(d.f7520d.f12299a, d.mo6918c(j), min);
            i -= min;
            j += (long) min;
            if (j == d.f7518b) {
                d = d.f7521e;
            }
        }
        return d;
    }

    /* renamed from: i */
    private static C1098a m9053i(C1098a aVar, long j, byte[] bArr, int i) {
        C1098a d = m9049d(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (d.f7518b - j));
            System.arraycopy(d.f7520d.f12299a, d.mo6918c(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == d.f7518b) {
                d = d.f7521e;
            }
        }
        return d;
    }

    /* renamed from: j */
    private static C1098a m9054j(C1098a aVar, DecoderInputBuffer fVar, C1099a aVar2, ParsableByteArray a0Var) {
        int i;
        C1099a aVar3 = aVar2;
        ParsableByteArray a0Var2 = a0Var;
        long j = aVar3.f7564b;
        a0Var2.mo7370L(1);
        C1098a i2 = m9053i(aVar, j, a0Var.mo7379d(), 1);
        long j2 = j + 1;
        byte b = a0Var.mo7379d()[0];
        boolean z = (b & 128) != 0;
        byte b2 = b & Byte.MAX_VALUE;
        CryptoInfo bVar = fVar.f5743b;
        byte[] bArr = bVar.f5720a;
        if (bArr == null) {
            bVar.f5720a = new byte[16];
        } else {
            Arrays.fill(bArr, 0);
        }
        C1098a i3 = m9053i(i2, j2, bVar.f5720a, b2);
        long j3 = j2 + ((long) b2);
        if (z) {
            a0Var2.mo7370L(2);
            i3 = m9053i(i3, j3, a0Var.mo7379d(), 2);
            j3 += 2;
            i = a0Var.mo7368J();
        } else {
            i = 1;
        }
        int[] iArr = bVar.f5723d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar.f5724e;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i4 = i * 6;
            a0Var2.mo7370L(i4);
            i3 = m9053i(i3, j3, a0Var.mo7379d(), i4);
            j3 += (long) i4;
            a0Var2.mo7374P(0);
            for (int i5 = 0; i5 < i; i5++) {
                iArr2[i5] = a0Var.mo7368J();
                iArr4[i5] = a0Var.mo7366H();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar3.f7563a - ((int) (j3 - aVar3.f7564b));
        }
        C0917a aVar4 = (C0917a) Util.m10293i(aVar3.f7565c);
        bVar.mo5957c(i, iArr2, iArr4, aVar4.f5994b, bVar.f5720a, aVar4.f5993a, aVar4.f5995c, aVar4.f5996d);
        long j4 = aVar3.f7564b;
        int i6 = (int) (j3 - j4);
        aVar3.f7564b = j4 + ((long) i6);
        aVar3.f7563a -= i6;
        return i3;
    }

    /* renamed from: k */
    private static C1098a m9055k(C1098a aVar, DecoderInputBuffer fVar, C1099a aVar2, ParsableByteArray a0Var) {
        if (fVar.mo5967q()) {
            aVar = m9054j(aVar, fVar, aVar2, a0Var);
        }
        if (fVar.mo5950i()) {
            a0Var.mo7370L(4);
            C1098a i = m9053i(aVar, aVar2.f7564b, a0Var.mo7379d(), 4);
            int H = a0Var.mo7366H();
            aVar2.f7564b += 4;
            aVar2.f7563a -= 4;
            fVar.mo5965o(H);
            C1098a h = m9052h(i, aVar2.f7564b, fVar.f5744c, H);
            aVar2.f7564b += (long) H;
            int i2 = aVar2.f7563a - H;
            aVar2.f7563a = i2;
            fVar.mo5969t(i2);
            return m9052h(h, aVar2.f7564b, fVar.f5747f, aVar2.f7563a);
        }
        fVar.mo5965o(aVar2.f7563a);
        return m9052h(aVar, aVar2.f7564b, fVar.f5744c, aVar2.f7563a);
    }

    /* renamed from: b */
    public void mo6908b(long j) {
        C1098a aVar;
        if (j != -1) {
            while (true) {
                aVar = this.f7513d;
                if (j < aVar.f7518b) {
                    break;
                }
                this.f7510a.mo14919b(aVar.f7520d);
                this.f7513d = this.f7513d.mo6916a();
            }
            if (this.f7514e.f7517a < aVar.f7517a) {
                this.f7514e = aVar;
            }
        }
    }

    /* renamed from: c */
    public void mo6909c(long j) {
        this.f7516g = j;
        if (j != 0) {
            C1098a aVar = this.f7513d;
            if (j != aVar.f7517a) {
                while (this.f7516g > aVar.f7518b) {
                    aVar = aVar.f7521e;
                }
                C1098a aVar2 = aVar.f7521e;
                m9048a(aVar2);
                C1098a aVar3 = new C1098a(aVar.f7518b, this.f7511b);
                aVar.f7521e = aVar3;
                if (this.f7516g == aVar.f7518b) {
                    aVar = aVar3;
                }
                this.f7515f = aVar;
                if (this.f7514e == aVar2) {
                    this.f7514e = aVar3;
                    return;
                }
                return;
            }
        }
        m9048a(this.f7513d);
        C1098a aVar4 = new C1098a(this.f7516g, this.f7511b);
        this.f7513d = aVar4;
        this.f7514e = aVar4;
        this.f7515f = aVar4;
    }

    /* renamed from: e */
    public long mo6910e() {
        return this.f7516g;
    }

    /* renamed from: l */
    public void mo6911l(DecoderInputBuffer fVar, C1099a aVar) {
        this.f7514e = m9055k(this.f7514e, fVar, aVar, this.f7512c);
    }

    /* renamed from: m */
    public void mo6912m() {
        m9048a(this.f7513d);
        C1098a aVar = new C1098a(0, this.f7511b);
        this.f7513d = aVar;
        this.f7514e = aVar;
        this.f7515f = aVar;
        this.f7516g = 0;
        this.f7510a.mo14918a();
    }

    /* renamed from: n */
    public void mo6913n() {
        this.f7514e = this.f7513d;
    }

    /* renamed from: o */
    public int mo6914o(DataReader jVar, int i, boolean z) throws IOException {
        int g = m9051g(i);
        C1098a aVar = this.f7515f;
        int b = jVar.mo6195b(aVar.f7520d.f12299a, aVar.mo6918c(this.f7516g), g);
        if (b != -1) {
            m9050f(b);
            return b;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: p */
    public void mo6915p(ParsableByteArray a0Var, int i) {
        while (i > 0) {
            int g = m9051g(i);
            C1098a aVar = this.f7515f;
            a0Var.mo7385j(aVar.f7520d.f12299a, aVar.mo6918c(this.f7516g), g);
            i -= g;
            m9050f(g);
        }
    }
}
