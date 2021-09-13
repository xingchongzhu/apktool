package p067c.p068a.p069a.p070a.p076f2.p086n0;

import android.util.Pair;
import java.io.IOException;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.n0.d */
final class WavHeaderReader {

    /* renamed from: c.a.a.a.f2.n0.d$a */
    /* compiled from: WavHeaderReader */
    private static final class C0997a {

        /* renamed from: a */
        public final int f6980a;

        /* renamed from: b */
        public final long f6981b;

        private C0997a(int i, long j) {
            this.f6980a = i;
            this.f6981b = j;
        }

        /* renamed from: a */
        public static C0997a m8263a(ExtractorInput kVar, ParsableByteArray a0Var) throws IOException {
            kVar.mo6204o(a0Var.mo7379d(), 0, 8);
            a0Var.mo7374P(0);
            return new C0997a(a0Var.mo7389n(), a0Var.mo7395t());
        }
    }

    /* renamed from: a */
    public static WavHeader m8261a(ExtractorInput kVar) throws IOException {
        byte[] bArr;
        Assertions.m10153e(kVar);
        ParsableByteArray a0Var = new ParsableByteArray(16);
        if (C0997a.m8263a(kVar, a0Var).f6980a != 1380533830) {
            return null;
        }
        kVar.mo6204o(a0Var.mo7379d(), 0, 4);
        a0Var.mo7374P(0);
        int n = a0Var.mo7389n();
        if (n != 1463899717) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported RIFF format: ");
            sb.append(n);
            Log.m10381c("WavHeaderReader", sb.toString());
            return null;
        }
        C0997a a = C0997a.m8263a(kVar, a0Var);
        while (a.f6980a != 1718449184) {
            kVar.mo6205p((int) a.f6981b);
            a = C0997a.m8263a(kVar, a0Var);
        }
        Assertions.m10154f(a.f6981b >= 16);
        kVar.mo6204o(a0Var.mo7379d(), 0, 16);
        a0Var.mo7374P(0);
        int v = a0Var.mo7397v();
        int v2 = a0Var.mo7397v();
        int u = a0Var.mo7396u();
        int u2 = a0Var.mo7396u();
        int v3 = a0Var.mo7397v();
        int v4 = a0Var.mo7397v();
        int i = ((int) a.f6981b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            kVar.mo6204o(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = Util.f8403f;
        }
        WavHeader cVar = new WavHeader(v, v2, u, u2, v3, v4, bArr);
        return cVar;
    }

    /* renamed from: b */
    public static Pair<Long, Long> m8262b(ExtractorInput kVar) throws IOException {
        Assertions.m10153e(kVar);
        kVar.mo6199h();
        ParsableByteArray a0Var = new ParsableByteArray(8);
        C0997a a = C0997a.m8263a(kVar, a0Var);
        while (true) {
            int i = a.f6980a;
            String str = "WavHeaderReader";
            if (i != 1684108385) {
                if (!(i == 1380533830 || i == 1718449184)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Ignoring unknown WAV chunk: ");
                    sb.append(a.f6980a);
                    Log.m10386h(str, sb.toString());
                }
                long j = a.f6981b + 8;
                if (a.f6980a == 1380533830) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    kVar.mo6200i((int) j);
                    a = C0997a.m8263a(kVar, a0Var);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                    sb2.append(a.f6980a);
                    throw new ParserException(sb2.toString());
                }
            } else {
                kVar.mo6200i(8);
                long q = kVar.mo6206q();
                long j2 = a.f6981b + q;
                long a2 = kVar.mo6194a();
                if (a2 != -1 && j2 > a2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Data exceeds input length: ");
                    sb3.append(j2);
                    sb3.append(", ");
                    sb3.append(a2);
                    Log.m10386h(str, sb3.toString());
                    j2 = a2;
                }
                return Pair.create(Long.valueOf(q), Long.valueOf(j2));
            }
        }
    }
}
