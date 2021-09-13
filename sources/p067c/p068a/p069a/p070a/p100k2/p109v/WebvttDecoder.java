package p067c.p068a.p069a.p070a.p100k2.p109v;

import android.text.TextUtils;
import java.util.ArrayList;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p100k2.SimpleSubtitleDecoder;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p100k2.SubtitleDecoderException;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.k2.v.i */
public final class WebvttDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    private final ParsableByteArray f8106o = new ParsableByteArray();

    /* renamed from: p */
    private final CssParser f8107p = new CssParser();

    public WebvttDecoder() {
        super("WebvttDecoder");
    }

    /* renamed from: C */
    private static int m9813C(ParsableByteArray a0Var) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = a0Var.mo7380e();
            String p = a0Var.mo7391p();
            i = p == null ? 0 : "STYLE".equals(p) ? 2 : p.startsWith("NOTE") ? 1 : 3;
        }
        a0Var.mo7374P(i2);
        return i;
    }

    /* renamed from: D */
    private static void m9814D(ParsableByteArray a0Var) {
        do {
        } while (!TextUtils.isEmpty(a0Var.mo7391p()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Subtitle mo7059z(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f8106o.mo7372N(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            WebvttParserUtil.m9820e(this.f8106o);
            do {
            } while (!TextUtils.isEmpty(this.f8106o.mo7391p()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int C = m9813C(this.f8106o);
                if (C == 0) {
                    return new WebvttSubtitle(arrayList2);
                }
                if (C == 1) {
                    m9814D(this.f8106o);
                } else if (C == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f8106o.mo7391p();
                        arrayList.addAll(this.f8107p.mo7155d(this.f8106o));
                    } else {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                } else if (C == 3) {
                    WebvttCueInfo m = WebvttCueParser.m9788m(this.f8106o, arrayList);
                    if (m != null) {
                        arrayList2.add(m);
                    }
                }
            }
        } catch (ParserException e) {
            throw new SubtitleDecoderException((Throwable) e);
        }
    }
}
