package com.tv91.features.authentication;

import android.content.Context;
import com.tv91.p252x.KeyedActivity;

import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.NonNull;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.UnsafeCasts;

/* renamed from: com.tv91.features.authentication.f */
abstract class Hilt_AuthActivity extends KeyedActivity implements GeneratedComponentManager {

    /* renamed from: r */
    private volatile ActivityComponentManager activityComponentManager;

    /* renamed from: s */
    private final Object object = new Object();

    /* renamed from: t */
    private boolean isAuthor = false;

    /* renamed from: com.tv91.features.authentication.f$a */
    /* compiled from: Hilt_AuthActivity */
    class OnContextAvailableImpl implements OnContextAvailableListener {
        OnContextAvailableImpl() {
        }

        @Override
        public void onContextAvailable(@NonNull Context context) {
            Hilt_AuthActivity.this.isAuthor();
        }
    }

    Hilt_AuthActivity() {
        m16713N();
    }

    /* renamed from: N */
    private void m16713N() {
        addOnContextAvailableListener(new OnContextAvailableImpl());
    }

    /* renamed from: O */
    public final ActivityComponentManager getActivityComponentManager() {
        if (this.activityComponentManager == null) {
            synchronized (this.object) {
                if (this.activityComponentManager == null) {
                    this.activityComponentManager = createActivityComponentManager();
                }
            }
        }
        return this.activityComponentManager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public ActivityComponentManager createActivityComponentManager() {
        return new ActivityComponentManager(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void isAuthor() {
        if (!this.isAuthor) {
            this.isAuthor = true;
            ((AuthActivity_GeneratedInjector) generatedComponent()).mo16479a((AuthActivity) UnsafeCasts.unsafeCast(this));
        }
    }

    /* renamed from: g */
    public final Object generatedComponent() {
        return getActivityComponentManager().generatedComponent();
    }
}
