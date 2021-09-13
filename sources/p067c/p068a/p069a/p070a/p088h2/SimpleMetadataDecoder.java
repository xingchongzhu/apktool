package p067c.p068a.p069a.p070a.p088h2;

import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.h2.h */
public abstract class SimpleMetadataDecoder implements MetadataDecoder {
    /* renamed from: a */
    public final Metadata mo6561a(MetadataInputBuffer eVar) {
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.m10153e(eVar.f5744c);
        Assertions.m10149a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.mo5951j()) {
            return null;
        }
        return mo6566b(eVar, byteBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Metadata mo6566b(MetadataInputBuffer eVar, ByteBuffer byteBuffer);
}
