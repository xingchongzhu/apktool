package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.activity.p005d.ContextAwareHelper;
import androidx.activity.p005d.OnContextAvailableListener;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.p006f.ActivityResultContract;
import androidx.activity.result.p006f.ActivityResultContract.C0041a;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.Lifecycle.C0378c;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p061o.Trace;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner {

    /* renamed from: c */
    final ContextAwareHelper f84c = new ContextAwareHelper();

    /* renamed from: d */
    private final LifecycleRegistry f85d = new LifecycleRegistry(this);

    /* renamed from: e */
    final SavedStateRegistryController f86e = SavedStateRegistryController.m3996a(this);

    /* renamed from: f */
    private ViewModelStore f87f;

    /* renamed from: g */
    private final OnBackPressedDispatcher f88g = new OnBackPressedDispatcher(new C0027a());

    /* renamed from: h */
    private int f89h;

    /* renamed from: i */
    private final AtomicInteger f90i = new AtomicInteger();

    /* renamed from: j */
    private final ActivityResultRegistry f91j = new C0028b();

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0027a implements Runnable {
        C0027a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    class C0028b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        class C0029a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f97a;

            /* renamed from: b */
            final /* synthetic */ C0041a f98b;

            C0029a(int i, C0041a aVar) {
                this.f97a = i;
                this.f98b = aVar;
            }

            public void run() {
                C0028b.this.mo174c(this.f97a, this.f98b.mo211a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        class C0030b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f100a;

            /* renamed from: b */
            final /* synthetic */ SendIntentException f101b;

            C0030b(int i, SendIntentException sendIntentException) {
                this.f100a = i;
                this.f101b = sendIntentException;
            }

            public void run() {
                C0028b.this.mo173b(this.f100a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f101b));
            }
        }

        C0028b() {
        }

        /* renamed from: f */
        public <I, O> void mo156f(int i, ActivityResultContract<I, O> aVar, I i2, ActivityOptionsCompat bVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            C0041a b = aVar.mo209b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new C0029a(i, b));
                return;
            }
            Intent a = aVar.mo208a(componentActivity, i2);
            if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            String str = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";
            if (a.hasExtra(str)) {
                Bundle bundleExtra = a.getBundleExtra(str);
                a.removeExtra(str);
                bundle = bundleExtra;
            } else if (bVar == null) {
                bundle = null;
            } else {
                throw null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                ActivityCompat.m1710m(componentActivity, stringArrayExtra, i);
            } else {
                if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
                    IntentSenderRequest eVar = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    try {
                        ActivityCompat.m1713p(componentActivity, eVar.mo199o(), i, eVar.mo196l(), eVar.mo197m(), eVar.mo198n(), 0, bundle);
                    } catch (SendIntentException e) {
                        new Handler(Looper.getMainLooper()).post(new C0030b(i, e));
                    }
                } else {
                    ActivityCompat.m1712o(componentActivity, a, i, bundle);
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    static final class C0031c {

        /* renamed from: a */
        Object f103a;

        /* renamed from: b */
        ViewModelStore f104b;

        C0031c() {
        }
    }

    public ComponentActivity() {
        if (mo132b() != null) {
            int i = VERSION.SDK_INT;
            if (i >= 19) {
                mo132b().mo2999a(new LifecycleEventObserver() {
                    /* renamed from: c */
                    public void mo154c(LifecycleOwner iVar, C0377b bVar) {
                        if (bVar == C0377b.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            mo132b().mo2999a(new LifecycleEventObserver() {
                /* renamed from: c */
                public void mo154c(LifecycleOwner iVar, C0377b bVar) {
                    if (bVar == C0377b.ON_DESTROY) {
                        ComponentActivity.this.f84c.mo170b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.mo144p().mo3037a();
                        }
                    }
                }
            });
            mo132b().mo2999a(new LifecycleEventObserver() {
                /* renamed from: c */
                public void mo154c(LifecycleOwner iVar, C0377b bVar) {
                    ComponentActivity.this.mo137o();
                    ComponentActivity.this.mo132b().mo3001c(this);
                }
            });
            if (19 <= i && i <= 23) {
                mo132b().mo2999a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: q */
    private void m97q() {
        ViewTreeLifecycleOwner.m2808a(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.m2809a(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.m4001a(getWindow().getDecorView(), this);
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) LayoutParams layoutParams) {
        m97q();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: b */
    public Lifecycle mo132b() {
        return this.f85d;
    }

    /* renamed from: c */
    public final OnBackPressedDispatcher mo133c() {
        return this.f88g;
    }

    /* renamed from: d */
    public final SavedStateRegistry mo134d() {
        return this.f86e.mo3936b();
    }

    /* renamed from: j */
    public final ActivityResultRegistry mo135j() {
        return this.f91j;
    }

    /* renamed from: n */
    public final void mo136n(OnContextAvailableListener bVar) {
        this.f84c.mo169a(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo137o() {
        if (this.f87f == null) {
            C0031c cVar = (C0031c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f87f = cVar.f104b;
            }
            if (this.f87f == null) {
                this.f87f = new ViewModelStore();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f91j.mo173b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.f88g.mo161c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f86e.mo3937c(bundle);
        this.f84c.mo171c(this);
        super.onCreate(bundle);
        this.f91j.mo175g(bundle);
        ReportFragment.m2789f(this);
        int i = this.f89h;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f91j.mo173b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        Object r = mo145r();
        ViewModelStore tVar = this.f87f;
        if (tVar == null) {
            C0031c cVar = (C0031c) getLastNonConfigurationInstance();
            if (cVar != null) {
                tVar = cVar.f104b;
            }
        }
        if (tVar == null && r == null) {
            return null;
        }
        C0031c cVar2 = new C0031c();
        cVar2.f103a = r;
        cVar2.f104b = tVar;
        return cVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle b = mo132b();
        if (b instanceof LifecycleRegistry) {
            ((LifecycleRegistry) b).mo3006o(C0378c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f86e.mo3938d(bundle);
        this.f91j.mo176h(bundle);
    }

    /* renamed from: p */
    public ViewModelStore mo144p() {
        if (getApplication() != null) {
            mo137o();
            return this.f87f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    /* renamed from: r */
    public Object mo145r() {
        return null;
    }

    public void reportFullyDrawn() {
        try {
            if (Trace.m5870d()) {
                StringBuilder sb = new StringBuilder();
                sb.append("reportFullyDrawn() for ");
                sb.append(getComponentName());
                Trace.m5867a(sb.toString());
            }
            int i = VERSION.SDK_INT;
            if (i > 19) {
                super.reportFullyDrawn();
            } else if (i == 19 && ContextCompat.m1755a(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
        } finally {
            Trace.m5868b();
        }
    }

    public void setContentView(int i) {
        m97q();
        super.setContentView(i);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m97q();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) LayoutParams layoutParams) {
        m97q();
        super.setContentView(view, layoutParams);
    }
}
