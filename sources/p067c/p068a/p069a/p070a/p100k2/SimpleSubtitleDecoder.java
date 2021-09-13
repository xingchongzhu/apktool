package p067c.p068a.p069a.p070a.p100k2;

import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.p073c2.SimpleDecoder;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.k2.d */
public abstract class SimpleSubtitleDecoder extends SimpleDecoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> implements SubtitleDecoder {

    /* renamed from: n */
    private final String f7740n;

    protected SimpleSubtitleDecoder(String str) {
        super(new SubtitleInputBuffer[2], new SubtitleOutputBuffer[2]);
        this.f7740n = str;
        mo5982v(1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final SubtitleDecoderException mo5977k(SubtitleInputBuffer jVar, SubtitleOutputBuffer kVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.m10153e(jVar.f5744c);
            SubtitleOutputBuffer kVar2 = kVar;
            kVar2.mo7066o(jVar.f5746e, mo7059z(byteBuffer.array(), byteBuffer.limit(), z), jVar.f7743i);
            kVar.mo5948g(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    /* renamed from: b */
    public void mo7055b(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final SubtitleInputBuffer mo5974h() {
        return new SubtitleInputBuffer();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final SubtitleOutputBuffer mo5975i() {
        return new SimpleSubtitleOutputBuffer(new C1117a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final SubtitleDecoderException mo5976j(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract Subtitle mo7059z(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;
}
