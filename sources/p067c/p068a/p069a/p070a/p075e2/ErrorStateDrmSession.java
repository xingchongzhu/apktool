package p067c.p068a.p069a.p070a.p075e2;

import java.util.Map;
import java.util.UUID;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.p075e2.C0896v.C0897a;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener.C0898a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.e2.b0 */
public final class ErrorStateDrmSession implements C0896v {

    /* renamed from: a */
    private final C0897a f5803a;

    public ErrorStateDrmSession(C0897a aVar) {
        this.f5803a = (C0897a) Assertions.m10153e(aVar);
    }

    /* renamed from: a */
    public boolean mo6041a() {
        return false;
    }

    /* renamed from: b */
    public void mo6042b(C0898a aVar) {
    }

    /* renamed from: c */
    public Map<String, String> mo6043c() {
        return null;
    }

    /* renamed from: d */
    public void mo6044d(C0898a aVar) {
    }

    /* renamed from: e */
    public final UUID mo6045e() {
        return C.f7370a;
    }

    /* renamed from: f */
    public ExoMediaCrypto mo6046f() {
        return null;
    }

    /* renamed from: g */
    public C0897a mo6047g() {
        return this.f5803a;
    }

    public int getState() {
        return 1;
    }
}
