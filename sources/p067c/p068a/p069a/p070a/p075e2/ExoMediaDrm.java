package p067c.p068a.p069a.p070a.p075e2;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData.C0894b;

/* renamed from: c.a.a.a.e2.d0 */
public interface ExoMediaDrm {

    /* renamed from: c.a.a.a.e2.d0$a */
    /* compiled from: ExoMediaDrm */
    public static final class C0865a {

        /* renamed from: a */
        private final byte[] f5806a;

        /* renamed from: b */
        private final String f5807b;

        /* renamed from: c */
        private final int f5808c;

        public C0865a(byte[] bArr, String str, int i) {
            this.f5806a = bArr;
            this.f5807b = str;
            this.f5808c = i;
        }

        /* renamed from: a */
        public byte[] mo6050a() {
            return this.f5806a;
        }

        /* renamed from: b */
        public String mo6051b() {
            return this.f5807b;
        }
    }

    /* renamed from: c.a.a.a.e2.d0$b */
    /* compiled from: ExoMediaDrm */
    public interface C0866b {
        /* renamed from: a */
        void mo6052a(ExoMediaDrm d0Var, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* renamed from: c.a.a.a.e2.d0$c */
    /* compiled from: ExoMediaDrm */
    public interface C0867c {
        /* renamed from: a */
        ExoMediaDrm mo6053a(UUID uuid);
    }

    /* renamed from: c.a.a.a.e2.d0$d */
    /* compiled from: ExoMediaDrm */
    public static final class C0868d {

        /* renamed from: a */
        private final byte[] f5809a;

        /* renamed from: b */
        private final String f5810b;

        public C0868d(byte[] bArr, String str) {
            this.f5809a = bArr;
            this.f5810b = str;
        }

        /* renamed from: a */
        public byte[] mo6054a() {
            return this.f5809a;
        }

        /* renamed from: b */
        public String mo6055b() {
            return this.f5810b;
        }
    }

    /* renamed from: a */
    void mo6029a();

    /* renamed from: b */
    Class<? extends ExoMediaCrypto> mo6030b();

    /* renamed from: c */
    void mo6031c(byte[] bArr, byte[] bArr2);

    /* renamed from: d */
    Map<String, String> mo6032d(byte[] bArr);

    /* renamed from: e */
    void mo6033e(byte[] bArr);

    /* renamed from: f */
    void mo6034f(C0866b bVar);

    /* renamed from: g */
    byte[] mo6035g(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    /* renamed from: h */
    ExoMediaCrypto mo6036h(byte[] bArr) throws MediaCryptoException;

    /* renamed from: i */
    C0868d mo6037i();

    /* renamed from: j */
    void mo6038j(byte[] bArr) throws DeniedByServerException;

    /* renamed from: k */
    C0865a mo6039k(byte[] bArr, List<C0894b> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    /* renamed from: l */
    byte[] mo6040l() throws MediaDrmException;
}
