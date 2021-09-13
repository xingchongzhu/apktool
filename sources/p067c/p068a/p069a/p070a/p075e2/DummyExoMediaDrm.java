package p067c.p068a.p069a.p070a.p075e2;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData.C0894b;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0865a;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0866b;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0868d;

/* renamed from: c.a.a.a.e2.a0 */
public final class DummyExoMediaDrm implements ExoMediaDrm {
    /* renamed from: a */
    public void mo6029a() {
    }

    /* renamed from: b */
    public Class<UnsupportedMediaCrypto> mo6030b() {
        return UnsupportedMediaCrypto.class;
    }

    /* renamed from: c */
    public void mo6031c(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public Map<String, String> mo6032d(byte[] bArr) {
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public void mo6033e(byte[] bArr) {
    }

    /* renamed from: f */
    public void mo6034f(C0866b bVar) {
    }

    /* renamed from: g */
    public byte[] mo6035g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public ExoMediaCrypto mo6036h(byte[] bArr) {
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public C0868d mo6037i() {
        throw new IllegalStateException();
    }

    /* renamed from: j */
    public void mo6038j(byte[] bArr) {
        throw new IllegalStateException();
    }

    /* renamed from: k */
    public C0865a mo6039k(byte[] bArr, List<C0894b> list, int i, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    /* renamed from: l */
    public byte[] mo6040l() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }
}
