package p067c.p068a.p069a.p070a.p100k2.p109v;

import java.util.ArrayList;
import java.util.Collections;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Cue.C1119b;
import p067c.p068a.p069a.p070a.p100k2.SimpleSubtitleDecoder;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p100k2.SubtitleDecoderException;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.v.d */
public final class Mp4WebvttDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    private final ParsableByteArray f8060o = new ParsableByteArray();

    public Mp4WebvttDecoder() {
        super("Mp4WebvttDecoder");
    }

    /* renamed from: C */
    private static Cue m9744C(ParsableByteArray a0Var, int i) throws SubtitleDecoderException {
        CharSequence charSequence = null;
        C1119b bVar = null;
        while (i > 0) {
            if (i >= 8) {
                int n = a0Var.mo7389n();
                int n2 = a0Var.mo7389n();
                int i2 = i - 8;
                int i3 = n - 8;
                String C = Util.m10241C(a0Var.mo7379d(), a0Var.mo7380e(), i3);
                a0Var.mo7375Q(i3);
                i = i2 - i3;
                if (n2 == 1937011815) {
                    bVar = WebvttCueParser.m9790o(C);
                } else if (n2 == 1885436268) {
                    charSequence = WebvttCueParser.m9792q(null, C.trim(), Collections.emptyList());
                }
            } else {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (bVar != null) {
            return bVar.mo7049n(charSequence).mo7036a();
        }
        return WebvttCueParser.m9787l(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Subtitle mo7059z(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f8060o.mo7372N(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f8060o.mo7376a() > 0) {
            if (this.f8060o.mo7376a() >= 8) {
                int n = this.f8060o.mo7389n();
                if (this.f8060o.mo7389n() == 1987343459) {
                    arrayList.add(m9744C(this.f8060o, n - 8));
                } else {
                    this.f8060o.mo7375Q(n - 8);
                }
            } else {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new Mp4WebvttSubtitle(arrayList);
    }
}
