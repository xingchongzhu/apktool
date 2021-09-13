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

/* renamed from: com.tv91.features.authentication.q.z */
public final class MobileLoginUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f13855i;

    /* renamed from: j */
    private final C3060h f13856j;

    /* renamed from: k */
    private final SystemRepository f13857k;

    /* renamed from: l */
    private Consumer<User> f13858l = ObservableUseCase.m17658b();

    /* renamed from: m */
    private final C2345e f13859m = new C2248h(this);

    public MobileLoginUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar, SystemRepository eVar) {
        super(bVar);
        this.f13855i = bVar2;
        this.f13856j = hVar;
        this.f13857k = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo16755r(CharSequence charSequence, CharSequence charSequence2) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo16754p(charSequence, charSequence2)));
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
    public /* synthetic */ void mo16756t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f13858l.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo16753o(CharSequence charSequence, CharSequence charSequence2) {
        mo17058m(this.f13859m);
        mo17055j(new C2247g(this, charSequence, charSequence2));
    }

    /* renamed from: p */
    public User mo16754p(CharSequence charSequence, CharSequence charSequence2) throws Exception {
        if (C3052g.m20586g(charSequence)) {
            throw new InputException(InputError.EMPTY_PHONE);
        } else if (!C3052g.m20586g(charSequence2)) {
            User J = this.f13855i.mo18639J(charSequence.toString(), charSequence2.toString());
            this.f13856j.mo18616f(charSequence.toString());
            this.f13856j.mo18618h(J);
            this.f13857k.mo18607d(J.sid);
            return J;
        } else {
            throw new InputException(InputError.EMPTY_SMS);
        }
    }

    /* renamed from: u */
    public MobileLoginUseCase mo16757u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public MobileLoginUseCase mo16758v(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: w */
    public MobileLoginUseCase mo16759w(Consumer<User> aVar) {
        this.f13858l = aVar;
        return this;
    }
}
