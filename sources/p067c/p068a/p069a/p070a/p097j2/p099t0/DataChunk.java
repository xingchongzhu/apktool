package p067c.p068a.p069a.p070a.p097j2.p099t0;

import com.google.android.exoplayer2.upstream.C1916m;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.j2.t0.c */
public abstract class DataChunk extends Chunk {

    /* renamed from: j */
    private byte[] f7648j;

    /* renamed from: k */
    private volatile boolean f7649k;

    public DataChunk(C1916m mVar, DataSpec pVar, int i, Format u0Var, int i2, Object obj, byte[] bArr) {
        DataChunk cVar;
        byte[] bArr2;
        super(mVar, pVar, i, u0Var, i2, obj, -9223372036854775807L, -9223372036854775807L);
        if (bArr == null) {
            bArr2 = Util.f8403f;
            cVar = this;
        } else {
            cVar = this;
            bArr2 = bArr;
        }
        cVar.f7648j = bArr2;
    }

    /* renamed from: i */
    private void m9259i(int i) {
        byte[] bArr = this.f7648j;
        if (bArr.length < i + 16384) {
            this.f7648j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    /* renamed from: a */
    public final void mo6893a() throws IOException {
        try {
            this.f7647i.mo7015e(this.f7640b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f7649k) {
                m9259i(i2);
                i = this.f7647i.mo6195b(this.f7648j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f7649k) {
                mo7011g(this.f7648j, i2);
            }
        } finally {
            Util.m10299l(this.f7647i);
        }
    }

    /* renamed from: c */
    public final void mo6895c() {
        this.f7649k = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo7011g(byte[] bArr, int i) throws IOException;

    /* renamed from: h */
    public byte[] mo7012h() {
        return this.f7648j;
    }
}
