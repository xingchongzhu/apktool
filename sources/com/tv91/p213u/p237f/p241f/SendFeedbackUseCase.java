package com.tv91.p213u.p237f.p241f;

import com.tv91.model.FeedbackType;
import com.tv91.p207q.p209b.C2345e;
import com.tv91.p207q.p209b.C2346f;
import com.tv91.p207q.p209b.C2346f.C2347a;
import com.tv91.p207q.p209b.C2346f.C2348b;
import com.tv91.p207q.p209b.C2346f.C2349c;
import com.tv91.p207q.p209b.C2346f.C2350d;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.C3060h;
import com.tv91.p255z.C3061b;
import com.tv91.utils.C3052g;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.f.f.i */
public final class SendFeedbackUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15801i;

    /* renamed from: j */
    private final C3060h f15802j;

    /* renamed from: k */
    private Runnable f15803k = ObservableUseCase.m17659c();

    /* renamed from: l */
    private final C2345e f15804l = new C2917f(this);

    public SendFeedbackUseCase(Schedulers bVar, C3061b bVar2, C3060h hVar) {
        super(bVar);
        this.f15801i = bVar2;
        this.f15802j = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18282r(FeedbackType feedbackType, CharSequence charSequence) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo18281p(feedbackType, charSequence);
            mo17054i(new C2350d());
            bVar = new C2348b();
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f15802j.mo18619i();
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
    public /* synthetic */ void mo18283t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15803k.run();
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18280o(FeedbackType feedbackType, CharSequence charSequence) {
        mo17058m(this.f15804l);
        mo17055j(new C2916e(this, feedbackType, charSequence));
    }

    /* renamed from: p */
    public void mo18281p(FeedbackType feedbackType, CharSequence charSequence) throws Exception {
        if (!C3052g.m20586g(charSequence)) {
            this.f15801i.mo18655Z(this.f15802j.mo18614d(), this.f15802j.mo18617g(), charSequence.toString(), feedbackType.key);
        }
    }

    /* renamed from: u */
    public SendFeedbackUseCase mo18284u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public SendFeedbackUseCase mo18285v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public SendFeedbackUseCase mo18286w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public SendFeedbackUseCase mo18287x(Runnable runnable) {
        this.f15803k = runnable;
        return this;
    }
}
