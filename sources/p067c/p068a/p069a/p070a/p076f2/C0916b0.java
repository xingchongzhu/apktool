package p067c.p068a.p069a.p070a.p076f2;

import com.google.android.exoplayer2.upstream.DataReader;
import java.io.IOException;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.b0 */
/* compiled from: TrackOutput */
public interface C0916b0 {

    /* renamed from: c.a.a.a.f2.b0$a */
    /* compiled from: TrackOutput */
    public static final class C0917a {

        /* renamed from: a */
        public final int f5993a;

        /* renamed from: b */
        public final byte[] f5994b;

        /* renamed from: c */
        public final int f5995c;

        /* renamed from: d */
        public final int f5996d;

        public C0917a(int i, byte[] bArr, int i2, int i3) {
            this.f5993a = i;
            this.f5994b = bArr;
            this.f5995c = i2;
            this.f5996d = i3;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C0917a.class != obj.getClass()) {
                return false;
            }
            C0917a aVar = (C0917a) obj;
            if (!(this.f5993a == aVar.f5993a && this.f5995c == aVar.f5995c && this.f5996d == aVar.f5996d && Arrays.equals(this.f5994b, aVar.f5994b))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((this.f5993a * 31) + Arrays.hashCode(this.f5994b)) * 31) + this.f5995c) * 31) + this.f5996d;
        }
    }

    /* renamed from: a */
    void mo6174a(ParsableByteArray a0Var, int i);

    /* renamed from: b */
    int mo6175b(DataReader jVar, int i, boolean z, int i2) throws IOException;

    /* renamed from: c */
    void mo6176c(long j, int i, int i2, int i3, C0917a aVar);

    /* renamed from: d */
    void mo6177d(Format u0Var);

    /* renamed from: e */
    void mo6178e(ParsableByteArray a0Var, int i, int i2);

    /* renamed from: f */
    int mo6179f(DataReader jVar, int i, boolean z) throws IOException;
}
