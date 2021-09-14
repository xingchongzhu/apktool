package com.tv91.p250v;

import android.content.Context;
import android.view.animation.Animation;
import dagger.internal.Preconditions;

/* renamed from: com.tv91.v.j */
public final class ResourceModule_ProvideShakeAnimationFactory {
    /* renamed from: a */
    public static Animation m20613a(Context context) {
        return (Animation) Preconditions.checkNotNullFromProvides(ResourceModule.m20609d(context));
    }
}
