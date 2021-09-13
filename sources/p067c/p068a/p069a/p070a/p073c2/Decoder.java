package p067c.p068a.p069a.p070a.p073c2;

import p067c.p068a.p069a.p070a.p073c2.DecoderException;

/* renamed from: c.a.a.a.c2.c */
public interface Decoder<I, O, E extends DecoderException> {
    /* renamed from: a */
    void mo5958a();

    /* renamed from: c */
    void mo5959c(I i) throws DecoderException;

    /* renamed from: d */
    O mo5960d() throws DecoderException;

    /* renamed from: e */
    I mo5961e() throws DecoderException;

    void flush();
}
