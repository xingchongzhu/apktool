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
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.authentication.q.a0 */
public final class ModifyPasswordUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f13771i;

    /* renamed from: j */
    private final C3060h f13772j;

    /* renamed from: k */
    private Runnable f13773k = ObservableUseCase.m17659c();

    /* renamed from: l */
    private final C2345e f13774l = new C2250j(this);

    public ModifyPasswordUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f13771i = bVar2;
        this.f13772j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo16676r(String str, String str2) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo16675p(str, str2);
            mo17054i(new C2350d());
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f13772j.mo18619i();
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
    public /* synthetic */ void mo16677t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f13773k.run();
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo16674o(String str, String str2) {
        mo17058m(this.f13774l);
        mo17055j(new C2249i(this, str, str2));
    }

    /* renamed from: p */
    public void mo16675p(String str, String str2) throws Exception {
        if (FragmentUtils.m20586g(str)) {
            throw new InputException(InputError.EMPTY_NEW_PWD);
        } else if (str.length() < 8) {
            throw new InputException(InputError.SHORT_PWD);
        } else if (FragmentUtils.m20581b(str, str2)) {
            this.f13771i.mo18640K(this.f13772j.mo18614d(), this.f13772j.mo18617g(), str);
            this.f13772j.mo18612b();
        } else {
            throw new InputException(InputError.MISMATCH_PWD);
        }
    }

    /* renamed from: u */
    public ModifyPasswordUseCase mo16678u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public ModifyPasswordUseCase mo16679v(Runnable runnable) {
        this.f13773k = runnable;
        return this;
    }
}
