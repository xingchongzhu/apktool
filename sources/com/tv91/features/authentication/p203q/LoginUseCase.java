package com.tv91.features.authentication.p203q;

import com.tv91.model.User;
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
import com.tv91.p253y.C3060h;
import com.tv91.p253y.SystemRepository;
import com.tv91.p255z.C3061b;
import com.tv91.utils.C3052g;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.authentication.q.x */
public final class LoginUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f13847i;

    /* renamed from: j */
    private final C3060h f13848j;

    /* renamed from: k */
    private final SystemRepository f13849k;

    /* renamed from: l */
    private Consumer<User> f13850l = ObservableUseCase.m17658b();

    /* renamed from: m */
    private final C2345e f13851m = new C2243d(this);

    public LoginUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar, SystemRepository eVar) {
        super(bVar);
        this.f13847i = bVar2;
        this.f13848j = hVar;
        this.f13849k = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo16743r(CharSequence charSequence, CharSequence charSequence2) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo16742p(charSequence, charSequence2)));
            bVar = new C2348b();
        } catch (Exception e) {
            mo17054i(new C2347a(new ErrorBundle(e)));
            bVar = new C2348b();
        } catch (Throwable th) {
            mo17054i(new C2348b());
            throw th;
        }
        mo17054i(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo16744t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f13850l.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo16741o(CharSequence charSequence, CharSequence charSequence2) {
        mo17058m(this.f13851m);
        mo17055j(new C2242c(this, charSequence, charSequence2));
    }

    /* renamed from: p */
    public User mo16742p(CharSequence charSequence, CharSequence charSequence2) throws Exception {
        if (C3052g.m20586g(charSequence)) {
            throw new InputException(InputError.EMPTY_ACCOUNT);
        } else if (C3052g.m20586g(charSequence2)) {
            throw new InputException(InputError.EMPTY_PWD);
        } else if (C3052g.m20587h(charSequence.toString())) {
            User A = this.f13847i.mo18630A(charSequence.toString(), charSequence2.toString());
            this.f13848j.mo18616f(charSequence.toString());
            this.f13848j.mo18620j(charSequence2.toString());
            this.f13848j.mo18618h(A);
            this.f13849k.mo18607d(A.sid);
            return A;
        } else {
            throw new InputException(InputError.INVALID_ACCOUNT);
        }
    }

    /* renamed from: u */
    public LoginUseCase mo16745u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public LoginUseCase mo16746v(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: w */
    public LoginUseCase mo16747w(Consumer<User> aVar) {
        this.f13850l = aVar;
        return this;
    }
}
