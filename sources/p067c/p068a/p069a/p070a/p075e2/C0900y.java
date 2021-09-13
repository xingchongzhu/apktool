package p067c.p068a.p069a.p070a.p075e2;

import android.os.Looper;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p075e2.C0896v.C0897a;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener.C0898a;

/* renamed from: c.a.a.a.e2.y */
/* compiled from: DrmSessionManager */
public interface C0900y {

    /* renamed from: a */
    public static final C0900y f5932a;
    @Deprecated

    /* renamed from: b */
    public static final C0900y f5933b;

    /* renamed from: c.a.a.a.e2.y$a */
    /* compiled from: DrmSessionManager */
    class C0901a implements C0900y {
        C0901a() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo6083a() {
            DrmSessionManager.m7202b(this);
        }

        /* renamed from: b */
        public C0896v mo6084b(Looper looper, C0898a aVar, Format u0Var) {
            if (u0Var.f8817o == null) {
                return null;
            }
            return new ErrorStateDrmSession(new C0897a(new UnsupportedDrmException(1)));
        }

        /* renamed from: c */
        public Class<UnsupportedMediaCrypto> mo6085c(Format u0Var) {
            if (u0Var.f8817o != null) {
                return UnsupportedMediaCrypto.class;
            }
            return null;
        }

        /* renamed from: d */
        public /* synthetic */ void mo6086d() {
            DrmSessionManager.m7201a(this);
        }
    }

    static {
        C0901a aVar = new C0901a();
        f5932a = aVar;
        f5933b = aVar;
    }

    /* renamed from: a */
    void mo6083a();

    /* renamed from: b */
    C0896v mo6084b(Looper looper, C0898a aVar, Format u0Var);

    /* renamed from: c */
    Class<? extends ExoMediaCrypto> mo6085c(Format u0Var);

    /* renamed from: d */
    void mo6086d();
}
