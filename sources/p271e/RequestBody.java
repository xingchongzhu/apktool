package p271e;

import java.io.IOException;
import java.util.Objects;
import p271e.p272f0.C3310c;
import p281f.BufferedSink;

/* renamed from: e.a0 */
public abstract class RequestBody {

    /* renamed from: e.a0$a */
    /* compiled from: RequestBody */
    class C3304a extends RequestBody {

        /* renamed from: a */
        final /* synthetic */ MediaType f18018a;

        /* renamed from: b */
        final /* synthetic */ int f18019b;

        /* renamed from: c */
        final /* synthetic */ byte[] f18020c;

        /* renamed from: d */
        final /* synthetic */ int f18021d;

        C3304a(MediaType vVar, int i, byte[] bArr, int i2) {
            this.f18018a = vVar;
            this.f18019b = i;
            this.f18020c = bArr;
            this.f18021d = i2;
        }

        /* renamed from: a */
        public long mo19655a() {
            return (long) this.f18019b;
        }

        /* renamed from: b */
        public MediaType mo19656b() {
            return this.f18018a;
        }

        /* renamed from: e */
        public void mo19657e(BufferedSink dVar) throws IOException {
            dVar.mo20200e(this.f18020c, this.f18021d, this.f18019b);
        }
    }

    /* renamed from: c */
    public static RequestBody m22947c(MediaType vVar, byte[] bArr) {
        return m22948d(vVar, bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static RequestBody m22948d(MediaType vVar, byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "content == null");
        C3310c.m23051e((long) bArr.length, (long) i, (long) i2);
        return new C3304a(vVar, i2, bArr, i);
    }

    /* renamed from: a */
    public abstract long mo19655a() throws IOException;

    /* renamed from: b */
    public abstract MediaType mo19656b();

    /* renamed from: e */
    public abstract void mo19657e(BufferedSink dVar) throws IOException;
}
