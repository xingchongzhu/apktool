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
import com.tv91.utils.C3052g;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.authentication.q.g0 */
public final class VerifyMobileUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f13809i;

    /* renamed from: j */
    private final C3060h f13810j;

    /* renamed from: k */
    private Runnable f13811k = ObservableUseCase.m17659c();

    /* renamed from: l */
    private final C2345e f13812l = new C2262v(this);

    public VerifyMobileUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f13809i = bVar2;
        this.f13810j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo16721r(String str, String str2) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo16720p(str, str2);
            mo17054i(new C2350d());
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f13810j.mo18619i();
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
    public /* synthetic */ void mo16722t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f13811k.run();
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo16719o(String str, String str2) {
        mo17058m(this.f13812l);
        mo17055j(new C2261u(this, str, str2));
    }

    /* renamed from: p */
    public void mo16720p(String str, String str2) throws Exception {
        if (C3052g.m20586g(str)) {
            throw new InputException(InputError.EMPTY_PHONE);
        } else if (!C3052g.m20586g(str2)) {
            this.f13809i.mo18675s(this.f13810j.mo18614d(), this.f13810j.mo18617g(), str, str2);
            C3060h hVar = this.f13810j;
            hVar.mo18618h(hVar.mo18615e().newBuilder().isCertified(true).build());
        } else {
            throw new InputException(InputError.EMPTY_SMS);
        }
    }

    /* renamed from: u */
    public VerifyMobileUseCase mo16723u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public VerifyMobileUseCase mo16724v(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: w */
    public VerifyMobileUseCase mo16725w(Runnable runnable) {
        this.f13811k = runnable;
        return this;
    }
}
