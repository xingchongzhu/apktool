package p067c.p068a.p069a.p070a.p075e2;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener.C0898a;

/* renamed from: c.a.a.a.e2.v */
/* compiled from: DrmSession */
public interface C0896v {

    /* renamed from: c.a.a.a.e2.v$a */
    /* compiled from: DrmSession */
    public static class C0897a extends IOException {
        public C0897a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: a */
    boolean mo6041a();

    /* renamed from: b */
    void mo6042b(C0898a aVar);

    /* renamed from: c */
    Map<String, String> mo6043c();

    /* renamed from: d */
    void mo6044d(C0898a aVar);

    /* renamed from: e */
    UUID mo6045e();

    /* renamed from: f */
    ExoMediaCrypto mo6046f();

    /* renamed from: g */
    C0897a mo6047g();

    int getState();
}
