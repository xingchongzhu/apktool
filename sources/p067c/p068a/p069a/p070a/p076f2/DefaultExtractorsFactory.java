package p067c.p068a.p069a.p070a.p076f2;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.p076f2.p077e0.AmrExtractor;
import p067c.p068a.p069a.p070a.p076f2.p078f0.FlacExtractor;
import p067c.p068a.p069a.p070a.p076f2.p079g0.FlvExtractor;
import p067c.p068a.p069a.p070a.p076f2.p080h0.JpegExtractor;
import p067c.p068a.p069a.p070a.p076f2.p081i0.MatroskaExtractor;
import p067c.p068a.p069a.p070a.p076f2.p082j0.Mp3Extractor;
import p067c.p068a.p069a.p070a.p076f2.p083k0.FragmentedMp4Extractor;
import p067c.p068a.p069a.p070a.p076f2.p083k0.Mp4Extractor;
import p067c.p068a.p069a.p070a.p076f2.p084l0.OggExtractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.Ac3Extractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.Ac4Extractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.AdtsExtractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.PsExtractor;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsExtractor;
import p067c.p068a.p069a.p070a.p076f2.p086n0.WavExtractor;
import p067c.p068a.p069a.p070a.p111m2.FileTypes;

/* renamed from: c.a.a.a.f2.h */
public final class DefaultExtractorsFactory implements C0998o {

    /* renamed from: b */
    private static final int[] f6116b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: c */
    private static final Constructor<? extends Extractor> f6117c;

    /* renamed from: d */
    private boolean f6118d;

    /* renamed from: e */
    private int f6119e;

    /* renamed from: f */
    private int f6120f;

    /* renamed from: g */
    private int f6121g;

    /* renamed from: h */
    private int f6122h;

    /* renamed from: i */
    private int f6123i;

    /* renamed from: j */
    private int f6124j;

    /* renamed from: k */
    private int f6125k;

    /* renamed from: l */
    private int f6126l = 1;

    /* renamed from: m */
    private int f6127m;

    /* renamed from: n */
    private int f6128n = 112800;

    static {
        Constructor<? extends Extractor> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(new Class[]{Integer.TYPE});
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f6117c = constructor;
    }

    /* renamed from: c */
    private void m7464c(int i, List<Extractor> list) {
        switch (i) {
            case 0:
                list.add(new Ac3Extractor());
                return;
            case 1:
                list.add(new Ac4Extractor());
                return;
            case 2:
                list.add(new AdtsExtractor(this.f6119e | this.f6118d ? 1 : 0));
                return;
            case 3:
                list.add(new AmrExtractor(this.f6120f | this.f6118d ? 1 : 0));
                return;
            case 4:
                Constructor<? extends Extractor> constructor = f6117c;
                if (constructor != null) {
                    try {
                        list.add((Extractor) constructor.newInstance(new Object[]{Integer.valueOf(this.f6121g)}));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                } else {
                    list.add(new FlacExtractor(this.f6121g));
                    return;
                }
            case 5:
                list.add(new FlvExtractor());
                return;
            case 6:
                list.add(new MatroskaExtractor(this.f6122h));
                return;
            case 7:
                list.add(new Mp3Extractor(this.f6125k | this.f6118d ? 1 : 0));
                return;
            case 8:
                list.add(new FragmentedMp4Extractor(this.f6124j));
                list.add(new Mp4Extractor(this.f6123i));
                return;
            case 9:
                list.add(new OggExtractor());
                return;
            case 10:
                list.add(new PsExtractor());
                return;
            case 11:
                list.add(new TsExtractor(this.f6126l, this.f6127m, this.f6128n));
                return;
            case 12:
                list.add(new WavExtractor());
                return;
            case 14:
                list.add(new JpegExtractor());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public synchronized Extractor[] mo6156a() {
        return mo6157b(Uri.EMPTY, new HashMap());
    }

    /* renamed from: b */
    public synchronized Extractor[] mo6157b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr;
        arrayList = new ArrayList(14);
        int b = FileTypes.m10336b(map);
        if (b != -1) {
            m7464c(b, arrayList);
        }
        int c = FileTypes.m10337c(uri);
        if (!(c == -1 || c == b)) {
            m7464c(c, arrayList);
        }
        for (int i : f6116b) {
            if (!(i == b || i == c)) {
                m7464c(i, arrayList);
            }
        }
        return (Extractor[]) arrayList.toArray(new Extractor[arrayList.size()]);
    }
}
