package p067c.p068a.p069a.p070a.p076f2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.FlacStreamMetadata.C1001a;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.p091k.PictureFrame;
import p067c.p068a.p069a.p070a.p088h2.p093m.Id3Decoder;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p134b.p135a.Charsets;

/* renamed from: c.a.a.a.f2.q */
public final class FlacMetadataReader {

    /* renamed from: c.a.a.a.f2.q$a */
    /* compiled from: FlacMetadataReader */
    public static final class C1000a {

        /* renamed from: a */
        public FlacStreamMetadata f6989a;

        public C1000a(FlacStreamMetadata sVar) {
            this.f6989a = sVar;
        }
    }

    /* renamed from: a */
    public static boolean m8280a(ExtractorInput kVar) throws IOException {
        ParsableByteArray a0Var = new ParsableByteArray(4);
        kVar.mo6204o(a0Var.mo7379d(), 0, 4);
        if (a0Var.mo7364F() == 1716281667) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m8281b(ExtractorInput kVar) throws IOException {
        kVar.mo6199h();
        ParsableByteArray a0Var = new ParsableByteArray(2);
        kVar.mo6204o(a0Var.mo7379d(), 0, 2);
        int J = a0Var.mo7368J();
        if ((J >> 2) == 16382) {
            kVar.mo6199h();
            return J;
        }
        kVar.mo6199h();
        throw new ParserException("First frame does not start with sync code.");
    }

    /* renamed from: c */
    public static Metadata m8282c(ExtractorInput kVar, boolean z) throws IOException {
        Metadata a = new Id3Peeker().mo6392a(kVar, z ? null : Id3Decoder.f7294a);
        if (a == null || a.mo6552o() == 0) {
            return null;
        }
        return a;
    }

    /* renamed from: d */
    public static Metadata m8283d(ExtractorInput kVar, boolean z) throws IOException {
        kVar.mo6199h();
        long n = kVar.mo6203n();
        Metadata c = m8282c(kVar, z);
        kVar.mo6200i((int) (kVar.mo6203n() - n));
        return c;
    }

    /* renamed from: e */
    public static boolean m8284e(ExtractorInput kVar, C1000a aVar) throws IOException {
        kVar.mo6199h();
        ParsableBitArray zVar = new ParsableBitArray(new byte[4]);
        kVar.mo6204o(zVar.f8462a, 0, 4);
        boolean g = zVar.mo7494g();
        int h = zVar.mo7495h(7);
        int h2 = zVar.mo7495h(24) + 4;
        if (h == 0) {
            aVar.f6989a = m8288i(kVar);
        } else {
            FlacStreamMetadata sVar = aVar.f6989a;
            if (sVar == null) {
                throw new IllegalArgumentException();
            } else if (h == 3) {
                aVar.f6989a = sVar.mo6382c(m8286g(kVar, h2));
            } else if (h == 4) {
                aVar.f6989a = sVar.mo6383d(m8290k(kVar, h2));
            } else if (h == 6) {
                aVar.f6989a = sVar.mo6381b(Collections.singletonList(m8285f(kVar, h2)));
            } else {
                kVar.mo6200i(h2);
            }
        }
        return g;
    }

    /* renamed from: f */
    private static PictureFrame m8285f(ExtractorInput kVar, int i) throws IOException {
        ParsableByteArray a0Var = new ParsableByteArray(i);
        kVar.readFully(a0Var.mo7379d(), 0, i);
        a0Var.mo7375Q(4);
        int n = a0Var.mo7389n();
        String B = a0Var.mo7360B(a0Var.mo7389n(), Charsets.f9741a);
        String A = a0Var.mo7359A(a0Var.mo7389n());
        int n2 = a0Var.mo7389n();
        int n3 = a0Var.mo7389n();
        int n4 = a0Var.mo7389n();
        int n5 = a0Var.mo7389n();
        int n6 = a0Var.mo7389n();
        byte[] bArr = new byte[n6];
        a0Var.mo7385j(bArr, 0, n6);
        PictureFrame aVar = new PictureFrame(n, B, A, n2, n3, n4, n5, bArr);
        return aVar;
    }

    /* renamed from: g */
    private static C1001a m8286g(ExtractorInput kVar, int i) throws IOException {
        ParsableByteArray a0Var = new ParsableByteArray(i);
        kVar.readFully(a0Var.mo7379d(), 0, i);
        return m8287h(a0Var);
    }

    /* renamed from: h */
    public static C1001a m8287h(ParsableByteArray a0Var) {
        a0Var.mo7375Q(1);
        int G = a0Var.mo7365G();
        long e = ((long) a0Var.mo7380e()) + ((long) G);
        int i = G / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long w = a0Var.mo7398w();
            if (w == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = w;
            jArr2[i2] = a0Var.mo7398w();
            a0Var.mo7375Q(2);
            i2++;
        }
        a0Var.mo7375Q((int) (e - ((long) a0Var.mo7380e())));
        return new C1001a(jArr, jArr2);
    }

    /* renamed from: i */
    private static FlacStreamMetadata m8288i(ExtractorInput kVar) throws IOException {
        byte[] bArr = new byte[38];
        kVar.readFully(bArr, 0, 38);
        return new FlacStreamMetadata(bArr, 4);
    }

    /* renamed from: j */
    public static void m8289j(ExtractorInput kVar) throws IOException {
        ParsableByteArray a0Var = new ParsableByteArray(4);
        kVar.readFully(a0Var.mo7379d(), 0, 4);
        if (a0Var.mo7364F() != 1716281667) {
            throw new ParserException("Failed to read FLAC stream marker.");
        }
    }

    /* renamed from: k */
    private static List<String> m8290k(ExtractorInput kVar, int i) throws IOException {
        ParsableByteArray a0Var = new ParsableByteArray(i);
        kVar.readFully(a0Var.mo7379d(), 0, i);
        a0Var.mo7375Q(4);
        return Arrays.asList(VorbisUtil.m7352i(a0Var, false, false).f6007b);
    }
}
