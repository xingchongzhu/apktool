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
import com.tv91.utils.C3052g;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.authentication.q.d0 */
public final class ResetPasswordUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f13791i;

    /* renamed from: j */
    private Runnable f13792j = ObservableUseCase.m17659c();

    /* renamed from: k */
    private final C2345e f13793k = new C2255o(this);

    public ResetPasswordUseCase(Schedulers bVar, C3061b bVar2) {
        super(bVar);
        this.f13791i = bVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo16698r(String str, String str2, String str3, String str4) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo16697p(str, str2, str3, str4);
            mo17054i(new C2350d());
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
    public /* synthetic */ void mo16699t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f13792j.run();
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo16696o(String str, String str2, String str3, String str4) {
        mo17058m(this.f13793k);
        C2256p pVar = new C2256p(this, str, str2, str3, str4);
        mo17055j(pVar);
    }

    /* renamed from: p */
    public void mo16697p(String str, String str2, String str3, String str4) throws Exception {
        if (C3052g.m20586g(str2)) {
            throw new InputException(InputError.EMPTY_CODE);
        } else if (C3052g.m20586g(str3)) {
            throw new InputException(InputError.EMPTY_PWD);
        } else if (str3.length() < 8) {
            throw new InputException(InputError.SHORT_PWD);
        } else if (C3052g.m20581b(str3, str4)) {
            this.f13791i.mo18651V(str, str2, str3);
        } else {
            throw new InputException(InputError.MISMATCH_PWD);
        }
    }

    /* renamed from: u */
    public ResetPasswordUseCase mo16700u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public ResetPasswordUseCase mo16701v(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: w */
    public ResetPasswordUseCase mo16702w(Runnable runnable) {
        this.f13792j = runnable;
        return this;
    }
}
