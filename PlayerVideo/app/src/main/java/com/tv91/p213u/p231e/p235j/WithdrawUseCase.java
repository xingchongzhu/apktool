package com.tv91.p213u.p231e.p235j;

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

/* renamed from: com.tv91.u.e.j.o */
public final class WithdrawUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15684i;

    /* renamed from: j */
    private final C3060h f15685j;

    /* renamed from: k */
    private Consumer<String> f15686k = ObservableUseCase.m17658b();

    /* renamed from: l */
    private final C2345e f15687l = new C2856j(this);

    public WithdrawUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f15684i = bVar2;
        this.f15685j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18147r(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo18146p(i, str, str2, str3, str4, str5, str6, str7)));
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f15685j.mo18619i();
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
    public /* synthetic */ void mo18148t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15686k.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18145o(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        mo17058m(this.f15687l);
        C2855i iVar = new C2855i(this, i, str, str2, str3, str4, str5, str6, str7);
        mo17055j(iVar);
    }

    /* renamed from: p */
    public String mo18146p(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) throws Exception {
        if (!FragmentUtils.m20586g(str) && !FragmentUtils.m20586g(str2) && !FragmentUtils.m20586g(str3) && !FragmentUtils.m20586g(str4) && !FragmentUtils.m20586g(str5) && !FragmentUtils.m20586g(str6) && !FragmentUtils.m20586g(str7)) {
            return this.f15684i.mo18643N(this.f15685j.mo18614d(), this.f15685j.mo18617g(), i, str, str2, str3, str4, str5, str6, str7);
        }
        throw new InputException(InputError.EMPTY_WITHDRAW_ANY);
    }

    /* renamed from: u */
    public WithdrawUseCase mo18149u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public WithdrawUseCase mo18150v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public WithdrawUseCase mo18151w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public WithdrawUseCase mo18152x(Consumer<String> aVar) {
        this.f15686k = aVar;
        return this;
    }
}
