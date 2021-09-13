package p067c.p068a.p069a.p070a.p088h2.p089i;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.MetadataInputBuffer;
import p067c.p068a.p069a.p070a.p088h2.SimpleMetadataDecoder;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p134b.p135a.Charsets;

/* renamed from: c.a.a.a.h2.i.b */
public final class AppInfoTableDecoder extends SimpleMetadataDecoder {
    /* renamed from: c */
    private static Metadata m8722c(ParsableBitArray zVar) {
        zVar.mo7505r(12);
        int d = (zVar.mo7491d() + zVar.mo7495h(12)) - 4;
        zVar.mo7505r(44);
        zVar.mo7506s(zVar.mo7495h(12));
        zVar.mo7505r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (zVar.mo7491d() >= d) {
                break;
            }
            zVar.mo7505r(48);
            int h = zVar.mo7495h(8);
            zVar.mo7505r(4);
            int d2 = zVar.mo7491d() + zVar.mo7495h(12);
            String str2 = null;
            while (zVar.mo7491d() < d2) {
                int h2 = zVar.mo7495h(8);
                int h3 = zVar.mo7495h(8);
                int d3 = zVar.mo7491d() + h3;
                if (h2 == 2) {
                    int h4 = zVar.mo7495h(16);
                    zVar.mo7505r(8);
                    if (h4 != 3) {
                    }
                    while (zVar.mo7491d() < d3) {
                        str = zVar.mo7499l(zVar.mo7495h(8), Charsets.f9741a);
                        int h5 = zVar.mo7495h(8);
                        for (int i = 0; i < h5; i++) {
                            zVar.mo7506s(zVar.mo7495h(8));
                        }
                    }
                } else if (h2 == 21) {
                    str2 = zVar.mo7499l(h3, Charsets.f9741a);
                }
                zVar.mo7503p(d3 * 8);
            }
            zVar.mo7503p(d2 * 8);
            if (!(str == null || str2 == null)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                arrayList.add(new AppInfoTable(h, sb.toString()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends C1034b>) arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Metadata mo6566b(MetadataInputBuffer eVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m8722c(new ParsableBitArray(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
