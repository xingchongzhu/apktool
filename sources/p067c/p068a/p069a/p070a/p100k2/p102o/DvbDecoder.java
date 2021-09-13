package p067c.p068a.p069a.p070a.p100k2.p102o;

import java.util.List;
import p067c.p068a.p069a.p070a.p100k2.SimpleSubtitleDecoder;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.k2.o.a */
public final class DvbDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    private final DvbParser f7860o;

    public DvbDecoder(List<byte[]> list) {
        super("DvbDecoder");
        ParsableByteArray a0Var = new ParsableByteArray((byte[]) list.get(0));
        this.f7860o = new DvbParser(a0Var.mo7368J(), a0Var.mo7368J());
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Subtitle mo7059z(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f7860o.mo7107r();
        }
        return new DvbSubtitle(this.f7860o.mo7106b(bArr, i));
    }
}
