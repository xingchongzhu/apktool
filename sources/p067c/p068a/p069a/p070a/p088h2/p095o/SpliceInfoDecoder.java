package p067c.p068a.p069a.p070a.p088h2.p095o;

import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.MetadataInputBuffer;
import p067c.p068a.p069a.p070a.p088h2.SimpleMetadataDecoder;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;

/* renamed from: c.a.a.a.h2.o.c */
public final class SpliceInfoDecoder extends SimpleMetadataDecoder {

    /* renamed from: a */
    private final ParsableByteArray f7334a = new ParsableByteArray();

    /* renamed from: b */
    private final ParsableBitArray f7335b = new ParsableBitArray();

    /* renamed from: c */
    private TimestampAdjuster f7336c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Metadata mo6566b(MetadataInputBuffer eVar, ByteBuffer byteBuffer) {
        TimestampAdjuster j0Var = this.f7336c;
        if (j0Var == null || eVar.f7223i != j0Var.mo7450e()) {
            TimestampAdjuster j0Var2 = new TimestampAdjuster(eVar.f5746e);
            this.f7336c = j0Var2;
            j0Var2.mo7446a(eVar.f5746e - eVar.f7223i);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f7334a.mo7372N(array, limit);
        this.f7335b.mo7502o(array, limit);
        this.f7335b.mo7505r(39);
        long h = (((long) this.f7335b.mo7495h(1)) << 32) | ((long) this.f7335b.mo7495h(32));
        this.f7335b.mo7505r(20);
        int h2 = this.f7335b.mo7495h(12);
        int h3 = this.f7335b.mo7495h(8);
        C1034b bVar = null;
        this.f7334a.mo7375Q(14);
        if (h3 == 0) {
            bVar = new SpliceNullCommand();
        } else if (h3 == 255) {
            bVar = PrivateCommand.m8827l(this.f7334a, h2, h);
        } else if (h3 == 4) {
            bVar = SpliceScheduleCommand.m8840l(this.f7334a);
        } else if (h3 == 5) {
            bVar = SpliceInsertCommand.m8833l(this.f7334a, h, this.f7336c);
        } else if (h3 == 6) {
            bVar = TimeSignalCommand.m8853l(this.f7334a, h, this.f7336c);
        }
        if (bVar == null) {
            return new Metadata(new C1034b[0]);
        }
        return new Metadata(bVar);
    }
}
