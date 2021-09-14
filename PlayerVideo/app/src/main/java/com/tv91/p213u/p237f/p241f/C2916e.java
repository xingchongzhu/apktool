package com.tv91.p213u.p237f.p241f;

import com.tv91.model.FeedbackType;

/* renamed from: com.tv91.u.f.f.e */
/* compiled from: lambda */
public final /* synthetic */ class C2916e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SendFeedbackUseCase f15790a;

    /* renamed from: b */
    public final /* synthetic */ FeedbackType f15791b;

    /* renamed from: c */
    public final /* synthetic */ CharSequence f15792c;

    public /* synthetic */ C2916e(SendFeedbackUseCase iVar, FeedbackType feedbackType, CharSequence charSequence) {
        this.f15790a = iVar;
        this.f15791b = feedbackType;
        this.f15792c = charSequence;
    }

    public final void run() {
        this.f15790a.mo18282r(this.f15791b, this.f15792c);
    }
}
