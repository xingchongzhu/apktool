package com.tv91;

import android.content.Context;
import androidx.activity.p005d.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatActivity;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import p262d.p263a.p269c.GeneratedComponentManager;
import p262d.p263a.p269c.UnsafeCasts;

/* renamed from: com.tv91.m */
abstract class Hilt_MainActivity extends AppCompatActivity implements GeneratedComponentManager {

    /* renamed from: r */
    private volatile ActivityComponentManager f14075r;

    /* renamed from: s */
    private final Object f14076s = new Object();

    /* renamed from: t */
    private boolean f14077t = false;

    /* renamed from: com.tv91.m$a */
    /* compiled from: Hilt_MainActivity */
    class C2332a implements OnContextAvailableListener {
        C2332a() {
        }

        /* renamed from: a */
        public void mo172a(Context context) {
            Hilt_MainActivity.this.mo16959P();
        }
    }

    Hilt_MainActivity() {
        m17613M();
    }

    /* renamed from: M */
    private void m17613M() {
        mo136n(new C2332a());
    }

    /* renamed from: N */
    public final ActivityComponentManager mo16957N() {
        if (this.f14075r == null) {
            synchronized (this.f14076s) {
                if (this.f14075r == null) {
                    this.f14075r = mo16958O();
                }
            }
        }
        return this.f14075r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public ActivityComponentManager mo16958O() {
        return new ActivityComponentManager(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo16959P() {
        if (!this.f14077t) {
            this.f14077t = true;
            ((MainActivity_GeneratedInjector) mo16498g()).mo16927c((MainActivity) UnsafeCasts.m22903a(this));
        }
    }

    /* renamed from: g */
    public final Object mo16498g() {
        return mo16957N().mo16498g();
    }
}
