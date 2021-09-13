package p067c.p068a.p069a.p070a.p076f2.p084l0;

import java.io.IOException;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.l0.e */
final class OggPacket {

    /* renamed from: a */
    private final OggPageHeader f6534a = new OggPageHeader();

    /* renamed from: b */
    private final ParsableByteArray f6535b = new ParsableByteArray(new byte[65025], 0);

    /* renamed from: c */
    private int f6536c = -1;

    /* renamed from: d */
    private int f6537d;

    /* renamed from: e */
    private boolean f6538e;

    OggPacket() {
    }

    /* renamed from: a */
    private int m7894a(int i) {
        int i2;
        int i3 = 0;
        this.f6537d = 0;
        do {
            int i4 = this.f6537d;
            int i5 = i + i4;
            OggPageHeader fVar = this.f6534a;
            if (i5 >= fVar.f6545g) {
                break;
            }
            int[] iArr = fVar.f6548j;
            this.f6537d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: b */
    public OggPageHeader mo6302b() {
        return this.f6534a;
    }

    /* renamed from: c */
    public ParsableByteArray mo6303c() {
        return this.f6535b;
    }

    /* renamed from: d */
    public boolean mo6304d(ExtractorInput kVar) throws IOException {
        int i;
        Assertions.m10154f(kVar != null);
        if (this.f6538e) {
            this.f6538e = false;
            this.f6535b.mo7370L(0);
        }
        while (!this.f6538e) {
            if (this.f6536c < 0) {
                if (!this.f6534a.mo6309d(kVar) || !this.f6534a.mo6307b(kVar, true)) {
                    return false;
                }
                OggPageHeader fVar = this.f6534a;
                int i2 = fVar.f6546h;
                if ((fVar.f6540b & 1) == 1 && this.f6535b.mo7381f() == 0) {
                    i2 += m7894a(0);
                    i = this.f6537d + 0;
                } else {
                    i = 0;
                }
                kVar.mo6200i(i2);
                this.f6536c = i;
            }
            int a = m7894a(this.f6536c);
            int i3 = this.f6536c + this.f6537d;
            if (a > 0) {
                ParsableByteArray a0Var = this.f6535b;
                a0Var.mo7378c(a0Var.mo7381f() + a);
                kVar.readFully(this.f6535b.mo7379d(), this.f6535b.mo7381f(), a);
                ParsableByteArray a0Var2 = this.f6535b;
                a0Var2.mo7373O(a0Var2.mo7381f() + a);
                this.f6538e = this.f6534a.f6548j[i3 + -1] != 255;
            }
            if (i3 == this.f6534a.f6545g) {
                i3 = -1;
            }
            this.f6536c = i3;
        }
        return true;
    }

    /* renamed from: e */
    public void mo6305e() {
        this.f6534a.mo6308c();
        this.f6535b.mo7370L(0);
        this.f6536c = -1;
        this.f6538e = false;
    }

    /* renamed from: f */
    public void mo6306f() {
        if (this.f6535b.mo7379d().length != 65025) {
            ParsableByteArray a0Var = this.f6535b;
            a0Var.mo7372N(Arrays.copyOf(a0Var.mo7379d(), Math.max(65025, this.f6535b.mo7381f())), this.f6535b.mo7381f());
        }
    }
}
