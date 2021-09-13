package com.tv91;

import android.app.Application;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import p262d.p263a.p264b.p266d.p268c.ApplicationContextModule;
import p262d.p263a.p269c.GeneratedComponentManager;
import p262d.p263a.p269c.UnsafeCasts;

/* renamed from: com.tv91.l */
abstract class Hilt_App extends Application implements GeneratedComponentManager {

    /* renamed from: a */
    private final ApplicationComponentManager f14073a = new ApplicationComponentManager(new C2331a());

    /* renamed from: com.tv91.l$a */
    /* compiled from: Hilt_App */
    class C2331a implements ComponentSupplier {
        C2331a() {
        }

        /* renamed from: a */
        public Object mo16956a() {
            return DaggerApp_HiltComponents_SingletonC.m17481r().mo16953a(new ApplicationContextModule(Hilt_App.this)).mo16954b();
        }
    }

    Hilt_App() {
    }

    /* renamed from: a */
    public final ApplicationComponentManager mo16955a() {
        return this.f14073a;
    }

    /* renamed from: g */
    public final Object mo16498g() {
        return mo16955a().mo16498g();
    }

    public void onCreate() {
        ((App_GeneratedInjector) mo16498g()).mo16472b((App) UnsafeCasts.m22903a(this));
        super.onCreate();
    }
}
