package com.tv91.p213u.p242g.p243f0;

import com.tv91.p207q.p209b.C2345e;
import com.tv91.p207q.p209b.C2346f;
import com.tv91.p207q.p209b.C2346f.C2347a;
import com.tv91.p207q.p209b.C2346f.C2348b;
import com.tv91.p207q.p209b.C2346f.C2349c;
import com.tv91.p207q.p209b.C2346f.C2350d;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p255z.C3061b;
import com.tv91.utils.FragmentUtils;
import com.tv91.utils.Utils;

/* renamed from: com.tv91.u.g.f0.l */
public final class ReportServerDownUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15859i;

    /* renamed from: j */
    private Runnable f15860j = ObservableUseCase.m17659c();

    /* renamed from: k */
    private final C2345e f15861k = new C2932g(this);

    public ReportServerDownUseCase(Schedulers bVar, C3061b bVar2) {
        super(bVar);
        this.f15859i = bVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18356r(String str, String str2) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo18355p(str, str2);
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
    public /* synthetic */ void mo18357t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15860j.run();
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18354o(String str, String str2) {
        mo17058m(this.f15861k);
        mo17055j(new C2933h(this, str, str2));
    }

    /* renamed from: p */
    public void mo18355p(String str, String str2) throws Exception {
        this.f15859i.mo18679w(str, FragmentUtils.m20582c("%s:%s:%s:%s:%s:failed", str2, Utils.m20591b(), Utils.m20590a(), Utils.m20594e(), "3.3"));
    }
}
