package p067c.p068a.p069a.p070a.p076f2.p084l0;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.FlacFrameReader;
import p067c.p068a.p069a.p070a.p076f2.FlacMetadataReader;
import p067c.p068a.p069a.p070a.p076f2.FlacSeekTableSeekMap;
import p067c.p068a.p069a.p070a.p076f2.FlacStreamMetadata;
import p067c.p068a.p069a.p070a.p076f2.FlacStreamMetadata.C1001a;
import p067c.p068a.p069a.p070a.p076f2.SeekMap;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.l0.c */
final class FlacReader extends StreamReader {

    /* renamed from: n */
    private FlacStreamMetadata f6524n;

    /* renamed from: o */
    private C0966a f6525o;

    /* renamed from: c.a.a.a.f2.l0.c$a */
    /* compiled from: FlacReader */
    private static final class C0966a implements OggSeeker {

        /* renamed from: a */
        private FlacStreamMetadata f6526a;

        /* renamed from: b */
        private C1001a f6527b;

        /* renamed from: c */
        private long f6528c = -1;

        /* renamed from: d */
        private long f6529d = -1;

        public C0966a(FlacStreamMetadata sVar, C1001a aVar) {
            this.f6526a = sVar;
            this.f6527b = aVar;
        }

        /* renamed from: a */
        public long mo6293a(ExtractorInput kVar) {
            long j = this.f6529d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f6529d = -1;
            return j2;
        }

        /* renamed from: b */
        public SeekMap mo6294b() {
            Assertions.m10154f(this.f6528c != -1);
            return new FlacSeekTableSeekMap(this.f6526a, this.f6528c);
        }

        /* renamed from: c */
        public void mo6295c(long j) {
            long[] jArr = this.f6527b.f7004a;
            this.f6529d = jArr[Util.m10291h(jArr, j, true, true)];
        }

        /* renamed from: d */
        public void mo6301d(long j) {
            this.f6528c = j;
        }
    }

    FlacReader() {
    }

    /* renamed from: n */
    private int m7876n(ParsableByteArray a0Var) {
        int i = (a0Var.mo7379d()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            a0Var.mo7375Q(4);
            a0Var.mo7369K();
        }
        int j = FlacFrameReader.m8279j(a0Var, i);
        a0Var.mo7374P(0);
        return j;
    }

    /* renamed from: o */
    private static boolean m7877o(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: p */
    public static boolean m7878p(ParsableByteArray a0Var) {
        return a0Var.mo7376a() >= 5 && a0Var.mo7362D() == 127 && a0Var.mo7364F() == 1179402563;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo6298f(ParsableByteArray a0Var) {
        if (!m7877o(a0Var.mo7379d())) {
            return -1;
        }
        return (long) m7876n(a0Var);
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: i */
    public boolean mo6299i(ParsableByteArray a0Var, long j, C0968b bVar) {
        byte[] d = a0Var.mo7379d();
        FlacStreamMetadata sVar = this.f6524n;
        if (sVar == null) {
            FlacStreamMetadata sVar2 = new FlacStreamMetadata(d, 17);
            this.f6524n = sVar2;
            bVar.f6565a = sVar2.mo6386h(Arrays.copyOfRange(d, 9, a0Var.mo7381f()), null);
            return true;
        } else if ((d[0] & Byte.MAX_VALUE) == 3) {
            C1001a h = FlacMetadataReader.m8287h(a0Var);
            FlacStreamMetadata c = sVar.mo6382c(h);
            this.f6524n = c;
            this.f6525o = new C0966a(c, h);
            return true;
        } else if (!m7877o(d)) {
            return true;
        } else {
            C0966a aVar = this.f6525o;
            if (aVar != null) {
                aVar.mo6301d(j);
                bVar.f6566b = this.f6525o;
            }
            Assertions.m10153e(bVar.f6565a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6300l(boolean z) {
        super.mo6300l(z);
        if (z) {
            this.f6524n = null;
            this.f6525o = null;
        }
    }
}
