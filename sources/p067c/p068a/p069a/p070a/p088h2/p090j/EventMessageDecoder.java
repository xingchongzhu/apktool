package p067c.p068a.p069a.p070a.p088h2.p090j;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.MetadataInputBuffer;
import p067c.p068a.p069a.p070a.p088h2.SimpleMetadataDecoder;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.h2.j.b */
public final class EventMessageDecoder extends SimpleMetadataDecoder {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Metadata mo6566b(MetadataInputBuffer eVar, ByteBuffer byteBuffer) {
        return new Metadata(mo6583c(new ParsableByteArray(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: c */
    public EventMessage mo6583c(ParsableByteArray a0Var) {
        EventMessage aVar = new EventMessage((String) Assertions.m10153e(a0Var.mo7399x()), (String) Assertions.m10153e(a0Var.mo7399x()), a0Var.mo7364F(), a0Var.mo7364F(), Arrays.copyOfRange(a0Var.mo7379d(), a0Var.mo7380e(), a0Var.mo7381f()));
        return aVar;
    }
}
