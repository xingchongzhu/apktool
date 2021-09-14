package com.tv91.p250v;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.chip.ninetyonetv.R;
import com.tv91.App;

/* renamed from: com.tv91.v.f */
public final class ResourceModule {
    /* renamed from: a */
    public static String m20606a(Context context) {
        return App.getAppApplicationContext(context).mo16463c();
    }

    /* renamed from: b */
    public static String m20607b(Context context) {
        return App.getAppApplicationContext(context).mo16464d();
    }

    /* renamed from: c */
    public static String m20608c(Context context) {
        return App.getAppApplicationContext(context).mo16465e();
    }

    /* renamed from: d */
    public static Animation m20609d(Context context) {
        return AnimationUtils.loadAnimation(context, R.anim.shake);
    }
}
