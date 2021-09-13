package p067c.p068a.p069a.p070a.p076f2.p084l0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.VorbisUtil;
import p067c.p068a.p069a.p070a.p076f2.VorbisUtil.C0920b;
import p067c.p068a.p069a.p070a.p076f2.VorbisUtil.C0921c;
import p067c.p068a.p069a.p070a.p076f2.VorbisUtil.C0922d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.l0.j */
final class VorbisReader extends StreamReader {

    /* renamed from: n */
    private C0970a f6567n;

    /* renamed from: o */
    private int f6568o;

    /* renamed from: p */
    private boolean f6569p;

    /* renamed from: q */
    private C0922d f6570q;

    /* renamed from: r */
    private C0920b f6571r;

    /* renamed from: c.a.a.a.f2.l0.j$a */
    /* compiled from: VorbisReader */
    static final class C0970a {

        /* renamed from: a */
        public final C0922d f6572a;

        /* renamed from: b */
        public final C0920b f6573b;

        /* renamed from: c */
        public final byte[] f6574c;

        /* renamed from: d */
        public final C0921c[] f6575d;

        /* renamed from: e */
        public final int f6576e;

        public C0970a(C0922d dVar, C0920b bVar, byte[] bArr, C0921c[] cVarArr, int i) {
            this.f6572a = dVar;
            this.f6573b = bVar;
            this.f6574c = bArr;
            this.f6575d = cVarArr;
            this.f6576e = i;
        }
    }

    VorbisReader() {
    }

    /* renamed from: n */
    static void m7929n(ParsableByteArray a0Var, long j) {
        if (a0Var.mo7377b() < a0Var.mo7381f() + 4) {
            a0Var.mo7371M(Arrays.copyOf(a0Var.mo7379d(), a0Var.mo7381f() + 4));
        } else {
            a0Var.mo7373O(a0Var.mo7381f() + 4);
        }
        byte[] d = a0Var.mo7379d();
        d[a0Var.mo7381f() - 4] = (byte) ((int) (j & 255));
        d[a0Var.mo7381f() - 3] = (byte) ((int) ((j >>> 8) & 255));
        d[a0Var.mo7381f() - 2] = (byte) ((int) ((j >>> 16) & 255));
        d[a0Var.mo7381f() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    /* renamed from: o */
    private static int m7930o(byte b, C0970a aVar) {
        if (!aVar.f6575d[m7931p(b, aVar.f6576e, 1)].f6009a) {
            return aVar.f6572a.f6019g;
        }
        return aVar.f6572a.f6020h;
    }

    /* renamed from: p */
    static int m7931p(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    /* renamed from: r */
    public static boolean m7932r(ParsableByteArray a0Var) {
        try {
            return VorbisUtil.m7355l(1, a0Var, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo6314e(long j) {
        super.mo6314e(j);
        int i = 0;
        this.f6569p = j != 0;
        C0922d dVar = this.f6570q;
        if (dVar != null) {
            i = dVar.f6019g;
        }
        this.f6568o = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo6298f(ParsableByteArray a0Var) {
        int i = 0;
        if ((a0Var.mo7379d()[0] & 1) == 1) {
            return -1;
        }
        int o = m7930o(a0Var.mo7379d()[0], (C0970a) Assertions.m10156h(this.f6567n));
        if (this.f6569p) {
            i = (this.f6568o + o) / 4;
        }
        long j = (long) i;
        m7929n(a0Var, j);
        this.f6569p = true;
        this.f6568o = o;
        return j;
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: i */
    public boolean mo6299i(ParsableByteArray a0Var, long j, C0968b bVar) throws IOException {
        if (this.f6567n != null) {
            Assertions.m10153e(bVar.f6565a);
            return false;
        }
        C0970a q = mo6317q(a0Var);
        this.f6567n = q;
        if (q == null) {
            return true;
        }
        C0922d dVar = q.f6572a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f6022j);
        arrayList.add(q.f6574c);
        bVar.f6565a = new C1245b().mo7705e0("audio/vorbis").mo7681G(dVar.f6017e).mo7700Z(dVar.f6016d).mo7682H(dVar.f6014b).mo7706f0(dVar.f6015c).mo7694T(arrayList).mo7679E();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6300l(boolean z) {
        super.mo6300l(z);
        if (z) {
            this.f6567n = null;
            this.f6570q = null;
            this.f6571r = null;
        }
        this.f6568o = 0;
        this.f6569p = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public C0970a mo6317q(ParsableByteArray a0Var) throws IOException {
        C0922d dVar = this.f6570q;
        if (dVar == null) {
            this.f6570q = VorbisUtil.m7353j(a0Var);
            return null;
        }
        C0920b bVar = this.f6571r;
        if (bVar == null) {
            this.f6571r = VorbisUtil.m7351h(a0Var);
            return null;
        }
        byte[] bArr = new byte[a0Var.mo7381f()];
        System.arraycopy(a0Var.mo7379d(), 0, bArr, 0, a0Var.mo7381f());
        C0921c[] k = VorbisUtil.m7354k(a0Var, dVar.f6014b);
        C0970a aVar = new C0970a(dVar, bVar, bArr, k, VorbisUtil.m7344a(k.length - 1));
        return aVar;
    }
}
