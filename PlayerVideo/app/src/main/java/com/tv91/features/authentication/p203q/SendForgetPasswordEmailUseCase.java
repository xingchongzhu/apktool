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
import com.tv91.p255z.C3061b;
import com.tv91.utils.FragmentUtils;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.authentication.q.e0 */
public final class SendForgetPasswordEmailUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f13795i;

    /* renamed from: j */
    private Consumer<String> f13796j = ObservableUseCase.m17658b();

    /* renamed from: k */
    private final C2345e f13797k = new C2258r(this);

    public SendForgetPasswordEmailUseCase(Schedulers bVar, C3061b bVar2) {
        super(bVar);
        this.f13795i = bVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo16705r(String str) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo16704p(str)));
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
    public /* synthetic */ void mo16706t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f13796j.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo16703o(String str) {
        mo17058m(this.f13797k);
        mo17055j(new C2257q(this, str));
    }

    /* renamed from: p */
    public String mo16704p(String str) throws Exception {
        if (FragmentUtils.m20586g(str)) {
            throw new InputException(InputError.EMPTY_EMAIL);
        } else if (FragmentUtils.m20587h(str)) {
            return this.f13795i.mo18676t(str);
        } else {
            throw new InputException(InputError.INVALID_EMAIL);
        }
    }

    /* renamed from: u */
    public SendForgetPasswordEmailUseCase mo16707u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public SendForgetPasswordEmailUseCase mo16708v(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: w */
    public SendForgetPasswordEmailUseCase mo16709w(Consumer<String> aVar) {
        this.f13796j = aVar;
        return this;
    }
}
