package p067c.p068a.p069a.p070a.p076f2.p085m0;

import com.umeng.analytics.pro.CoreProtocolImpl.C3149a;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.m0.d0 */
public final class SectionReader implements TsPayloadReader {

    /* renamed from: a */
    private final SectionPayloadReader f6609a;

    /* renamed from: b */
    private final ParsableByteArray f6610b = new ParsableByteArray(32);

    /* renamed from: c */
    private int f6611c;

    /* renamed from: d */
    private int f6612d;

    /* renamed from: e */
    private boolean f6613e;

    /* renamed from: f */
    private boolean f6614f;

    public SectionReader(SectionPayloadReader c0Var) {
        this.f6609a = c0Var;
    }

    /* renamed from: a */
    public void mo6326a() {
        this.f6614f = true;
    }

    /* renamed from: b */
    public void mo6327b(TimestampAdjuster j0Var, ExtractorOutput lVar, C0983d dVar) {
        this.f6609a.mo6324b(j0Var, lVar, dVar);
        this.f6614f = true;
    }

    /* renamed from: c */
    public void mo6328c(ParsableByteArray a0Var, int i) {
        boolean z = (i & 1) != 0;
        int e = z ? a0Var.mo7380e() + a0Var.mo7362D() : -1;
        if (this.f6614f) {
            if (z) {
                this.f6614f = false;
                a0Var.mo7374P(e);
                this.f6612d = 0;
            } else {
                return;
            }
        }
        while (a0Var.mo7376a() > 0) {
            int i2 = this.f6612d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int D = a0Var.mo7362D();
                    a0Var.mo7374P(a0Var.mo7380e() - 1);
                    if (D == 255) {
                        this.f6614f = true;
                        return;
                    }
                }
                int min = Math.min(a0Var.mo7376a(), 3 - this.f6612d);
                a0Var.mo7385j(this.f6610b.mo7379d(), this.f6612d, min);
                int i3 = this.f6612d + min;
                this.f6612d = i3;
                if (i3 == 3) {
                    this.f6610b.mo7374P(0);
                    this.f6610b.mo7373O(3);
                    this.f6610b.mo7375Q(1);
                    int D2 = this.f6610b.mo7362D();
                    int D3 = this.f6610b.mo7362D();
                    this.f6613e = (D2 & 128) != 0;
                    this.f6611c = (((D2 & 15) << 8) | D3) + 3;
                    int b = this.f6610b.mo7377b();
                    int i4 = this.f6611c;
                    if (b < i4) {
                        this.f6610b.mo7378c(Math.min(C3149a.f17186b, Math.max(i4, this.f6610b.mo7377b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(a0Var.mo7376a(), this.f6611c - this.f6612d);
                a0Var.mo7385j(this.f6610b.mo7379d(), this.f6612d, min2);
                int i5 = this.f6612d + min2;
                this.f6612d = i5;
                int i6 = this.f6611c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f6613e) {
                        this.f6610b.mo7373O(i6);
                    } else if (Util.m10313s(this.f6610b.mo7379d(), 0, this.f6611c, -1) != 0) {
                        this.f6614f = true;
                        return;
                    } else {
                        this.f6610b.mo7373O(this.f6611c - 4);
                    }
                    this.f6610b.mo7374P(0);
                    this.f6609a.mo6325c(this.f6610b);
                    this.f6612d = 0;
                }
            }
        }
    }
}
