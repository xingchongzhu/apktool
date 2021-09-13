package com.tv91.features.authentication;

import android.content.Context;
import androidx.activity.p005d.OnContextAvailableListener;
import com.tv91.p252x.KeyedActivity;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import p262d.p263a.p269c.GeneratedComponentManager;
import p262d.p263a.p269c.UnsafeCasts;

/* renamed from: com.tv91.features.authentication.f */
abstract class Hilt_AuthActivity extends KeyedActivity implements GeneratedComponentManager {

    /* renamed from: r */
    private volatile ActivityComponentManager f13625r;

    /* renamed from: s */
    private final Object f13626s = new Object();

    /* renamed from: t */
    private boolean f13627t = false;

    /* renamed from: com.tv91.features.authentication.f$a */
    /* compiled from: Hilt_AuthActivity */
    class C2149a implements OnContextAvailableListener {
        C2149a() {
        }

        /* renamed from: a */
        public void mo172a(Context context) {
            Hilt_AuthActivity.this.mo16497Q();
        }
    }

    Hilt_AuthActivity() {
        m16713N();
    }

    /* renamed from: N */
    private void m16713N() {
        mo136n(new C2149a());
    }

    /* renamed from: O */
    public final ActivityComponentManager mo16495O() {
        if (this.f13625r == null) {
            synchronized (this.f13626s) {
                if (this.f13625r == null) {
                    this.f13625r = mo16496P();
                }
            }
        }
        return this.f13625r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public ActivityComponentManager mo16496P() {
        return new ActivityComponentManager(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo16497Q() {
        if (!this.f13627t) {
            this.f13627t = true;
            ((AuthActivity_GeneratedInjector) mo16498g()).mo16479a((AuthActivity) UnsafeCasts.m22903a(this));
        }
    }

    /* renamed from: g */
    public final Object mo16498g() {
        return mo16495O().mo16498g();
    }
}
