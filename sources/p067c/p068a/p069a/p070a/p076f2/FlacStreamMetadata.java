package p067c.p068a.p069a.p070a.p076f2;

import com.p259uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.p091k.PictureFrame;
import p067c.p068a.p069a.p070a.p088h2.p091k.VorbisComment;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.s */
public final class FlacStreamMetadata {

    /* renamed from: a */
    public final int f6992a;

    /* renamed from: b */
    public final int f6993b;

    /* renamed from: c */
    public final int f6994c;

    /* renamed from: d */
    public final int f6995d;

    /* renamed from: e */
    public final int f6996e;

    /* renamed from: f */
    public final int f6997f;

    /* renamed from: g */
    public final int f6998g;

    /* renamed from: h */
    public final int f6999h;

    /* renamed from: i */
    public final int f7000i;

    /* renamed from: j */
    public final long f7001j;

    /* renamed from: k */
    public final C1001a f7002k;

    /* renamed from: l */
    private final Metadata f7003l;

    /* renamed from: c.a.a.a.f2.s$a */
    /* compiled from: FlacStreamMetadata */
    public static class C1001a {

        /* renamed from: a */
        public final long[] f7004a;

        /* renamed from: b */
        public final long[] f7005b;

        public C1001a(long[] jArr, long[] jArr2) {
            this.f7004a = jArr;
            this.f7005b = jArr2;
        }
    }

    public FlacStreamMetadata(byte[] bArr, int i) {
        ParsableBitArray zVar = new ParsableBitArray(bArr);
        zVar.mo7503p(i * 8);
        this.f6992a = zVar.mo7495h(16);
        this.f6993b = zVar.mo7495h(16);
        this.f6994c = zVar.mo7495h(24);
        this.f6995d = zVar.mo7495h(24);
        int h = zVar.mo7495h(20);
        this.f6996e = h;
        this.f6997f = m8297k(h);
        this.f6998g = zVar.mo7495h(3) + 1;
        int h2 = zVar.mo7495h(5) + 1;
        this.f6999h = h2;
        this.f7000i = m8296f(h2);
        this.f7001j = zVar.mo7497j(36);
        this.f7002k = null;
        this.f7003l = null;
    }

    /* renamed from: a */
    private static Metadata m8295a(List<String> list, List<PictureFrame> list2) {
        Metadata aVar = null;
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] E0 = Util.m10246E0(str, "=");
            if (E0.length != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to parse Vorbis comment: ");
                sb.append(str);
                Log.m10386h("FlacStreamMetadata", sb.toString());
            } else {
                arrayList.add(new VorbisComment(E0[0], E0[1]));
            }
        }
        arrayList.addAll(list2);
        if (!arrayList.isEmpty()) {
            aVar = new Metadata((List<? extends C1034b>) arrayList);
        }
        return aVar;
    }

    /* renamed from: f */
    private static int m8296f(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: k */
    private static int m8297k(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case LogType.UNEXP_KNOWN_REASON /*32000*/:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public FlacStreamMetadata mo6381b(List<PictureFrame> list) {
        FlacStreamMetadata sVar = new FlacStreamMetadata(this.f6992a, this.f6993b, this.f6994c, this.f6995d, this.f6996e, this.f6998g, this.f6999h, this.f7001j, this.f7002k, mo6387i(m8295a(Collections.emptyList(), list)));
        return sVar;
    }

    /* renamed from: c */
    public FlacStreamMetadata mo6382c(C1001a aVar) {
        FlacStreamMetadata sVar = new FlacStreamMetadata(this.f6992a, this.f6993b, this.f6994c, this.f6995d, this.f6996e, this.f6998g, this.f6999h, this.f7001j, aVar, this.f7003l);
        return sVar;
    }

    /* renamed from: d */
    public FlacStreamMetadata mo6383d(List<String> list) {
        FlacStreamMetadata sVar = new FlacStreamMetadata(this.f6992a, this.f6993b, this.f6994c, this.f6995d, this.f6996e, this.f6998g, this.f6999h, this.f7001j, this.f7002k, mo6387i(m8295a(list, Collections.emptyList())));
        return sVar;
    }

    /* renamed from: e */
    public long mo6384e() {
        long j;
        long j2;
        int i = this.f6995d;
        if (i > 0) {
            j = (((long) i) + ((long) this.f6994c)) / 2;
            j2 = 1;
        } else {
            int i2 = this.f6992a;
            j = ((((i2 != this.f6993b || i2 <= 0) ? 4096 : (long) i2) * ((long) this.f6998g)) * ((long) this.f6999h)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    /* renamed from: g */
    public long mo6385g() {
        long j = this.f7001j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f6996e);
    }

    /* renamed from: h */
    public Format mo6386h(byte[] bArr, Metadata aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f6995d;
        if (i <= 0) {
            i = -1;
        }
        return new C1245b().mo7705e0("audio/flac").mo7697W(i).mo7682H(this.f6998g).mo7706f0(this.f6996e).mo7694T(Collections.singletonList(bArr)).mo7698X(mo6387i(aVar)).mo7679E();
    }

    /* renamed from: i */
    public Metadata mo6387i(Metadata aVar) {
        Metadata aVar2 = this.f7003l;
        return aVar2 == null ? aVar : aVar2.mo6550m(aVar);
    }

    /* renamed from: j */
    public long mo6388j(long j) {
        return Util.m10309q((j * ((long) this.f6996e)) / 1000000, 0, this.f7001j - 1);
    }

    private FlacStreamMetadata(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C1001a aVar, Metadata aVar2) {
        this.f6992a = i;
        this.f6993b = i2;
        this.f6994c = i3;
        this.f6995d = i4;
        this.f6996e = i5;
        this.f6997f = m8297k(i5);
        this.f6998g = i6;
        this.f6999h = i7;
        this.f7000i = m8296f(i7);
        this.f7001j = j;
        this.f7002k = aVar;
        this.f7003l = aVar2;
    }
}
