package com.google.android.exoplayer2.source.hls;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.p082j0.Mp3Extractor;
import p067c.p068a.p069a.p070a.p076f2.p083k0.FragmentedMp4Extractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.Ac3Extractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.Ac4Extractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.AdtsExtractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.DefaultTsPayloadReaderFactory;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsExtractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0982c;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.FileTypes;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;
import p067c.p068a.p134b.p137c.Ints;

/* renamed from: com.google.android.exoplayer2.source.hls.g */
public final class DefaultHlsExtractorFactory implements HlsExtractorFactory {

    /* renamed from: b */
    private static final int[] f11570b = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: c */
    private final int f11571c;

    /* renamed from: d */
    private final boolean f11572d;

    public DefaultHlsExtractorFactory() {
        this(0, true);
    }

    /* renamed from: b */
    private static void m14383b(int i, List<Integer> list) {
        if (Ints.m12039f(f11570b, i) != -1 && !list.contains(Integer.valueOf(i))) {
            list.add(Integer.valueOf(i));
        }
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: d */
    private Extractor m14384d(int i, Format u0Var, List<Format> list, TimestampAdjuster j0Var) {
        if (i == 0) {
            return new Ac3Extractor();
        }
        if (i == 1) {
            return new Ac4Extractor();
        }
        if (i == 2) {
            return new AdtsExtractor();
        }
        if (i == 7) {
            return new Mp3Extractor(0, 0);
        }
        if (i == 8) {
            return m14385e(j0Var, u0Var, list);
        }
        if (i == 11) {
            return m14386f(this.f11571c, this.f11572d, u0Var, list, j0Var);
        }
        if (i != 13) {
            return null;
        }
        return new WebvttExtractor(u0Var.f8805c, j0Var);
    }

    /* renamed from: e */
    private static FragmentedMp4Extractor m14385e(TimestampAdjuster j0Var, Format u0Var, List<Format> list) {
        int i = m14387g(u0Var) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new FragmentedMp4Extractor(i, j0Var, null, list);
    }

    /* renamed from: f */
    private static TsExtractor m14386f(int i, boolean z, Format u0Var, List<Format> list, TimestampAdjuster j0Var) {
        int i2 = i | 16;
        if (list != null) {
            i2 |= 32;
        } else if (z) {
            list = Collections.singletonList(new C1245b().mo7705e0("application/cea-608").mo7679E());
        } else {
            list = Collections.emptyList();
        }
        String str = u0Var.f8811i;
        if (!TextUtils.isEmpty(str)) {
            if (!MimeTypes.m10396b(str, "audio/mp4a-latm")) {
                i2 |= 2;
            }
            if (!MimeTypes.m10396b(str, "video/avc")) {
                i2 |= 4;
            }
        }
        return new TsExtractor(2, j0Var, (C0982c) new DefaultTsPayloadReaderFactory(i2, list));
    }

    /* renamed from: g */
    private static boolean m14387g(Format u0Var) {
        Metadata aVar = u0Var.f8812j;
        if (aVar == null) {
            return false;
        }
        for (int i = 0; i < aVar.mo6552o(); i++) {
            C1034b n = aVar.mo6551n(i);
            if (n instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) n).f11725c.isEmpty();
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    private static boolean m14388h(Extractor jVar, ExtractorInput kVar) throws IOException {
        try {
            boolean e = jVar.mo6191e(kVar);
            kVar.mo6199h();
            return e;
        } catch (EOFException unused) {
            kVar.mo6199h();
            return false;
        } catch (Throwable th) {
            kVar.mo6199h();
            throw th;
        }
    }

    /* renamed from: c */
    public BundledHlsMediaChunkExtractor mo14573a(Uri uri, Format u0Var, List<Format> list, TimestampAdjuster j0Var, Map<String, List<String>> map, ExtractorInput kVar) throws IOException {
        int a = FileTypes.m10335a(u0Var.f8814l);
        int b = FileTypes.m10336b(map);
        int c = FileTypes.m10337c(uri);
        int[] iArr = f11570b;
        ArrayList arrayList = new ArrayList(iArr.length);
        m14383b(a, arrayList);
        m14383b(b, arrayList);
        m14383b(c, arrayList);
        for (int b2 : iArr) {
            m14383b(b2, arrayList);
        }
        Extractor jVar = null;
        kVar.mo6199h();
        for (int i = 0; i < arrayList.size(); i++) {
            int intValue = ((Integer) arrayList.get(i)).intValue();
            Extractor jVar2 = (Extractor) Assertions.m10153e(m14384d(intValue, u0Var, list, j0Var));
            if (m14388h(jVar2, kVar)) {
                return new BundledHlsMediaChunkExtractor(jVar2, u0Var, j0Var);
            }
            if (jVar == null && (intValue == a || intValue == b || intValue == c || intValue == 11)) {
                jVar = jVar2;
            }
        }
        return new BundledHlsMediaChunkExtractor((Extractor) Assertions.m10153e(jVar), u0Var, j0Var);
    }

    public DefaultHlsExtractorFactory(int i, boolean z) {
        this.f11571c = i;
        this.f11572d = z;
    }
}
