package com.tv91.features.authentication.p203q;

import com.tv91.p207q.p209b.C2345e;
import com.tv91.p207q.p209b.C2346f;
import com.tv91.p207q.p209b.C2346f.C2347a;
import com.tv91.p207q.p209b.C2346f.C2348b;
import com.tv91.p207q.p209b.C2346f.C2349c;
import com.tv91.p207q.p209b.C2346f.C2350d;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p211s.InputError;
import com.tv91.p211s.InputException;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.SystemRepository;
import com.tv91.p255z.C3061b;
import com.tv91.utils.C3052g;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.authentication.q.c0 */
public final class RegisterUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f13784i;

    /* renamed from: j */
    private final SystemRepository f13785j;

    /* renamed from: k */
    private Runnable f13786k = ObservableUseCase.m17659c();

    /* renamed from: l */
    private final C2345e f13787l = new C2253m(this);

    /* renamed from: m */
    private String f13788m;

    /* renamed from: n */
    private String f13789n;

    public RegisterUseCase(Schedulers bVar, C3061b bVar2, SystemRepository eVar) {
        super(bVar);
        this.f13784i = bVar2;
        this.f13785j = eVar;
    }

    /* renamed from: o */
    private void m17067o(String str) {
        if (C3052g.m20586g(str)) {
            throw new InputException(InputError.EMPTY_ACCOUNT);
        } else if (!C3052g.m20587h(str)) {
            throw new InputException(InputError.INVALID_ACCOUNT);
        } else if (!C3052g.m20581b(this.f13788m, str)) {
            this.f13788m = null;
        } else {
            throw new InputException(InputError.USED_ACCOUNT);
        }
    }

    /* renamed from: p */
    private void m17068p(String str) {
        if (C3052g.m20586g(str)) {
            throw new InputException(InputError.EMPTY_NICKNAME);
        } else if (!C3052g.m20581b(this.f13789n, str)) {
            this.f13789n = null;
        } else {
            throw new InputException(InputError.USED_NICKNAME);
        }
    }

    /* renamed from: q */
    private void m17069q(String str, String str2) {
        if (C3052g.m20586g(str)) {
            throw new InputException(InputError.EMPTY_PWD);
        } else if (str.length() < 8) {
            throw new InputException(InputError.SHORT_PWD);
        } else if (!C3052g.m20581b(str, str2)) {
            throw new InputException(InputError.MISMATCH_PWD);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void mo16691u(String str, String str2, String str3, String str4) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo16690s(str, str2, str3, str4);
            mo17054i(new C2350d());
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (C3052g.m20581b("A000002", cVar.mo17111a())) {
                this.f13788m = str;
                mo17054i(new C2347a(new ErrorBundle(new InputException(InputError.USED_ACCOUNT))));
            } else if (C3052g.m20581b("A000003", cVar.mo17111a())) {
                this.f13789n = str2;
                mo17054i(new C2347a(new ErrorBundle(new InputException(InputError.USED_NICKNAME))));
            } else {
                mo17054i(new C2347a(cVar));
            }
            bVar = new C2348b();
        } catch (Throwable th) {
            mo17054i(new C2348b());
            throw th;
        }
        mo17054i(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void mo16692w(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f13786k.run();
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: r */
    public void mo16689r(String str, String str2, String str3, String str4) {
        mo17058m(this.f13787l);
        C2254n nVar = new C2254n(this, str, str2, str3, str4);
        mo17055j(nVar);
    }

    /* renamed from: s */
    public void mo16690s(String str, String str2, String str3, String str4) throws Exception {
        m17067o(str);
        m17068p(str2);
        m17069q(str3, str4);
        this.f13784i.mo18677u(this.f13785j.mo18606c(), 0, str, str3, str2);
    }

    /* renamed from: x */
    public RegisterUseCase mo16693x(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: y */
    public RegisterUseCase mo16694y(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: z */
    public RegisterUseCase mo16695z(Runnable runnable) {
        this.f13786k = runnable;
        return this;
    }
}
