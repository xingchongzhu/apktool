package com.google.android.exoplayer2.p196ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.google.android.exoplayer2.ui.c */
/* compiled from: lambda */
public final /* synthetic */ class C1865c implements AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ DefaultTimeBar f12007a;

    public /* synthetic */ C1865c(DefaultTimeBar defaultTimeBar) {
        this.f12007a = defaultTimeBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f12007a.mo14709j(valueAnimator);
    }
}
