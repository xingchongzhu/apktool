package com.tv91;

import android.app.Application;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: com.tv91.l */
abstract class Hilt_App extends Application implements GeneratedComponentManager {

    /* renamed from: a */
    private final ApplicationComponentManager applicationComponentManager = new ApplicationComponentManager(new BaseComponentSupplier());

    /* renamed from: com.tv91.l$a */
    /* compiled from: Hilt_App */
    class BaseComponentSupplier implements ComponentSupplier {
        BaseComponentSupplier() {
        }

        @Override
        public Object get() {
            return DaggerApp_HiltComponents_SingletonC.m17481r().mo16953a(new ApplicationContextModule(Hilt_App.this)).mo16954b();
        }
    }

    Hilt_App() {
    }

    /* renamed from: a */
    public final ApplicationComponentManager getApplicationComponentManager() {
        return this.applicationComponentManager;
    }

    /* renamed from: g */
    public final Object generatedComponent() {
        return getApplicationComponentManager().generatedComponent();
    }

    public void onCreate() {
        ((App_GeneratedInjector) generatedComponent()).mo16472b((App) UnsafeCasts.unsafeCast(this));
        super.onCreate();
    }
}
