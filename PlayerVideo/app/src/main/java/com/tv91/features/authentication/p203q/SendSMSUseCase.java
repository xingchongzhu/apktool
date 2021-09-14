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
import com.tv91.p253y.C3060h;
import com.tv91.p255z.C3061b;
import com.tv91.utils.FragmentUtils;

import androidx.core.util.Consumer;

/* renamed from: com.tv91.features.authentication.q.f0 */
public final class SendSMSUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f13799i;

    /* renamed from: j */
    private final C3060h f13800j;

    /* renamed from: k */
    private Runnable f13801k = ObservableUseCase.m17659c();

    /* renamed from: l */
    private final C2345e f13802l = new C2260t(this);

    /* renamed from: com.tv91.features.authentication.q.f0$a */
    /* compiled from: SendSMSUseCase */
    public enum C2246a {
        LOGIN,
        VERIFY
    }

    public SendSMSUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f13799i = bVar2;
        this.f13800j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo16713r(C2246a aVar, String str) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo16712p(aVar, str);
            mo17054i(new C2350d());
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f13800j.mo18619i();
            }
            mo17054i(new C2347a(cVar));
            bVar = new C2348b();
        } catch (Throwable th) {
            mo17054i(new C2348b());
            throw th;
        }
        mo17054i(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo16714t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f13801k.run();
        } else if (fVar instanceof C2347a) {
            this.f14277e.accept(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo16711o(C2246a aVar, String str) {
        mo17058m(this.f13802l);
        mo17055j(new C2259s(this, aVar, str));
    }

    /* renamed from: p */
    public void mo16712p(C2246a aVar, String str) throws Exception {
        if (FragmentUtils.m20586g(str)) {
            throw new InputException(InputError.EMPTY_PHONE);
        } else if (aVar == C2246a.LOGIN) {
            this.f13799i.mo18631B(str);
        } else if (aVar == C2246a.VERIFY) {
            this.f13799i.mo18633D(this.f13800j.mo18614d(), this.f13800j.mo18617g(), str);
        }
    }

    /* renamed from: u */
    public SendSMSUseCase mo16715u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public SendSMSUseCase mo16716v(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: w */
    public SendSMSUseCase mo16717w(Runnable runnable) {
        this.f13801k = runnable;
        return this;
    }
}
