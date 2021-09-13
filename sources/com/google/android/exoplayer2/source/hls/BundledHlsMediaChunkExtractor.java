package com.google.android.exoplayer2.source.hls;

import java.io.IOException;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.p082j0.Mp3Extractor;
import p067c.p068a.p069a.p070a.p076f2.p083k0.FragmentedMp4Extractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.Ac3Extractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.Ac4Extractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.AdtsExtractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsExtractor;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;

/* renamed from: com.google.android.exoplayer2.source.hls.e */
public final class BundledHlsMediaChunkExtractor implements HlsMediaChunkExtractor {

    /* renamed from: a */
    private static final PositionHolder f11565a = new PositionHolder();

    /* renamed from: b */
    final Extractor f11566b;

    /* renamed from: c */
    private final Format f11567c;

    /* renamed from: d */
    private final TimestampAdjuster f11568d;

    public BundledHlsMediaChunkExtractor(Extractor jVar, Format u0Var, TimestampAdjuster j0Var) {
        this.f11566b = jVar;
        this.f11567c = u0Var;
        this.f11568d = j0Var;
    }

    /* renamed from: a */
    public boolean mo14566a(ExtractorInput kVar) throws IOException {
        return this.f11566b.mo6192i(kVar, f11565a) == 0;
    }

    /* renamed from: b */
    public void mo14567b(ExtractorOutput lVar) {
        this.f11566b.mo6189b(lVar);
    }

    /* renamed from: c */
    public boolean mo14568c() {
        Extractor jVar = this.f11566b;
        return (jVar instanceof AdtsExtractor) || (jVar instanceof Ac3Extractor) || (jVar instanceof Ac4Extractor) || (jVar instanceof Mp3Extractor);
    }

    /* renamed from: d */
    public void mo14569d() {
        this.f11566b.mo6190c(0, 0);
    }

    /* renamed from: e */
    public boolean mo14570e() {
        Extractor jVar = this.f11566b;
        return (jVar instanceof TsExtractor) || (jVar instanceof FragmentedMp4Extractor);
    }

    /* renamed from: f */
    public HlsMediaChunkExtractor mo14571f() {
        Extractor jVar;
        Assertions.m10154f(!mo14570e());
        Extractor jVar2 = this.f11566b;
        if (jVar2 instanceof WebvttExtractor) {
            jVar = new WebvttExtractor(this.f11567c.f8805c, this.f11568d);
        } else if (jVar2 instanceof AdtsExtractor) {
            jVar = new AdtsExtractor();
        } else if (jVar2 instanceof Ac3Extractor) {
            jVar = new Ac3Extractor();
        } else if (jVar2 instanceof Ac4Extractor) {
            jVar = new Ac4Extractor();
        } else if (jVar2 instanceof Mp3Extractor) {
            jVar = new Mp3Extractor();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected extractor type for recreation: ");
            sb.append(this.f11566b.getClass().getSimpleName());
            throw new IllegalStateException(sb.toString());
        }
        return new BundledHlsMediaChunkExtractor(jVar, this.f11567c, this.f11568d);
    }
}
