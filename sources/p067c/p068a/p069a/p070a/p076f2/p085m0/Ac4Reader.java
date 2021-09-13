package p067c.p068a.p069a.p070a.p076f2.p085m0;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p072b2.Ac4Util;
import p067c.p068a.p069a.p070a.p072b2.Ac4Util.C0828b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.m0.i */
public final class Ac4Reader implements ElementaryStreamReader {

    /* renamed from: a */
    private final ParsableBitArray f6678a;

    /* renamed from: b */
    private final ParsableByteArray f6679b;

    /* renamed from: c */
    private final String f6680c;

    /* renamed from: d */
    private String f6681d;

    /* renamed from: e */
    private C0916b0 f6682e;

    /* renamed from: f */
    private int f6683f;

    /* renamed from: g */
    private int f6684g;

    /* renamed from: h */
    private boolean f6685h;

    /* renamed from: i */
    private boolean f6686i;

    /* renamed from: j */
    private long f6687j;

    /* renamed from: k */
    private Format f6688k;

    /* renamed from: l */
    private int f6689l;

    /* renamed from: m */
    private long f6690m;

    public Ac4Reader() {
        this(null);
    }

    /* renamed from: b */
    private boolean m8043b(ParsableByteArray a0Var, byte[] bArr, int i) {
        int min = Math.min(a0Var.mo7376a(), i - this.f6684g);
        a0Var.mo7385j(bArr, this.f6684g, min);
        int i2 = this.f6684g + min;
        this.f6684g = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    private void m8044g() {
        this.f6678a.mo7503p(0);
        C0828b d = Ac4Util.m6637d(this.f6678a);
        Format u0Var = this.f6688k;
        String str = "audio/ac4";
        if (u0Var == null || d.f5539c != u0Var.f8827y || d.f5538b != u0Var.f8828z || !str.equals(u0Var.f8814l)) {
            Format E = new C1245b().mo7693S(this.f6681d).mo7705e0(str).mo7682H(d.f5539c).mo7706f0(d.f5538b).mo7696V(this.f6680c).mo7679E();
            this.f6688k = E;
            this.f6682e.mo6177d(E);
        }
        this.f6689l = d.f5540d;
        this.f6687j = (((long) d.f5541e) * 1000000) / ((long) this.f6688k.f8828z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8045h(p067c.p068a.p069a.p070a.p111m2.ParsableByteArray r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6.mo7376a()
            r1 = 0
            if (r0 <= 0) goto L_0x0031
            boolean r0 = r5.f6685h
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0018
            int r0 = r6.mo7362D()
            if (r0 != r2) goto L_0x0015
            r1 = 1
        L_0x0015:
            r5.f6685h = r1
            goto L_0x0000
        L_0x0018:
            int r0 = r6.mo7362D()
            if (r0 != r2) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            r5.f6685h = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L_0x002b
            if (r0 != r4) goto L_0x0000
        L_0x002b:
            if (r0 != r4) goto L_0x002e
            r1 = 1
        L_0x002e:
            r5.f6686i = r1
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p085m0.Ac4Reader.m8045h(c.a.a.a.m2.a0):boolean");
    }

    /* renamed from: a */
    public void mo6331a() {
        this.f6683f = 0;
        this.f6684g = 0;
        this.f6685h = false;
        this.f6686i = false;
    }

    /* renamed from: c */
    public void mo6332c(ParsableByteArray a0Var) {
        Assertions.m10156h(this.f6682e);
        while (a0Var.mo7376a() > 0) {
            int i = this.f6683f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(a0Var.mo7376a(), this.f6689l - this.f6684g);
                        this.f6682e.mo6174a(a0Var, min);
                        int i2 = this.f6684g + min;
                        this.f6684g = i2;
                        int i3 = this.f6689l;
                        if (i2 == i3) {
                            this.f6682e.mo6176c(this.f6690m, 1, i3, 0, null);
                            this.f6690m += this.f6687j;
                            this.f6683f = 0;
                        }
                    }
                } else if (m8043b(a0Var, this.f6679b.mo7379d(), 16)) {
                    m8044g();
                    this.f6679b.mo7374P(0);
                    this.f6682e.mo6174a(this.f6679b, 16);
                    this.f6683f = 2;
                }
            } else if (m8045h(a0Var)) {
                this.f6683f = 1;
                this.f6679b.mo7379d()[0] = -84;
                this.f6679b.mo7379d()[1] = (byte) (this.f6686i ? 65 : 64);
                this.f6684g = 2;
            }
        }
    }

    /* renamed from: d */
    public void mo6333d() {
    }

    /* renamed from: e */
    public void mo6334e(long j, int i) {
        this.f6690m = j;
    }

    /* renamed from: f */
    public void mo6335f(ExtractorOutput lVar, C0983d dVar) {
        dVar.mo6342a();
        this.f6681d = dVar.mo6343b();
        this.f6682e = lVar.mo6218q(dVar.mo6344c(), 1);
    }

    public Ac4Reader(String str) {
        ParsableBitArray zVar = new ParsableBitArray(new byte[16]);
        this.f6678a = zVar;
        this.f6679b = new ParsableByteArray(zVar.f8462a);
        this.f6683f = 0;
        this.f6684g = 0;
        this.f6685h = false;
        this.f6686i = false;
        this.f6680c = str;
    }
}
