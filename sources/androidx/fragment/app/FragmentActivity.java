package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.p005d.OnContextAvailableListener;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.core.app.ActivityCompat.C0240c;
import androidx.core.app.ActivityCompat.C0242e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.Lifecycle.C0378c;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry.C0484b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p010b.p057m.p058a.LoaderManager;

/* renamed from: androidx.fragment.app.e */
public class FragmentActivity extends ComponentActivity implements C0240c, C0242e {

    /* renamed from: k */
    final FragmentController f2352k = FragmentController.m2353b(new C0321c());

    /* renamed from: l */
    final LifecycleRegistry f2353l = new LifecycleRegistry(this);

    /* renamed from: m */
    boolean f2354m;

    /* renamed from: n */
    boolean f2355n;

    /* renamed from: o */
    boolean f2356o = true;

    /* renamed from: androidx.fragment.app.e$a */
    /* compiled from: FragmentActivity */
    class C0319a implements C0484b {
        C0319a() {
        }

        /* renamed from: a */
        public Bundle mo323a() {
            Bundle bundle = new Bundle();
            FragmentActivity.this.mo2657v();
            FragmentActivity.this.f2353l.mo3004h(C0377b.ON_STOP);
            Parcelable x = FragmentActivity.this.f2352k.mo2718x();
            if (x != null) {
                bundle.putParcelable("android:support:fragments", x);
            }
            return bundle;
        }
    }

    /* renamed from: androidx.fragment.app.e$b */
    /* compiled from: FragmentActivity */
    class C0320b implements OnContextAvailableListener {
        C0320b() {
        }

        /* renamed from: a */
        public void mo172a(Context context) {
            FragmentActivity.this.f2352k.mo2696a(null);
            String str = "android:support:fragments";
            Bundle a = FragmentActivity.this.mo134d().mo3931a(str);
            if (a != null) {
                FragmentActivity.this.f2352k.mo2717w(a.getParcelable(str));
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    /* compiled from: FragmentActivity */
    class C0321c extends FragmentHostCallback<FragmentActivity> implements ViewModelStoreOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, FragmentOnAttachListener {
        public C0321c() {
            super(FragmentActivity.this);
        }

        /* renamed from: a */
        public void mo2661a(FragmentManager nVar, Fragment fragment) {
            FragmentActivity.this.mo2658x(fragment);
        }

        /* renamed from: b */
        public Lifecycle mo132b() {
            return FragmentActivity.this.f2353l;
        }

        /* renamed from: c */
        public OnBackPressedDispatcher mo133c() {
            return FragmentActivity.this.mo133c();
        }

        /* renamed from: f */
        public View mo2491f(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* renamed from: g */
        public boolean mo2492g() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: j */
        public ActivityResultRegistry mo135j() {
            return FragmentActivity.this.mo135j();
        }

        /* renamed from: l */
        public void mo2662l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: n */
        public LayoutInflater mo2664n() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        /* renamed from: p */
        public ViewModelStore mo144p() {
            return FragmentActivity.this.mo144p();
        }

        /* renamed from: q */
        public boolean mo2665q(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        /* renamed from: s */
        public void mo2666s() {
            FragmentActivity.this.mo288A();
        }

        /* renamed from: t */
        public FragmentActivity mo2663m() {
            return FragmentActivity.this;
        }
    }

    public FragmentActivity() {
        m2318u();
    }

    /* renamed from: u */
    private void m2318u() {
        mo134d().mo3934d("android:support:fragments", new C0319a());
        mo136n(new C0320b());
    }

    /* renamed from: w */
    private static boolean m2319w(FragmentManager nVar, C0378c cVar) {
        boolean z = false;
        for (Fragment fragment : nVar.mo2819t0()) {
            if (fragment != null) {
                if (fragment.mo2392R() != null) {
                    z |= m2319w(fragment.mo2364H(), cVar);
                }
                FragmentViewLifecycleOwner b0Var = fragment.f2147W;
                if (b0Var != null && b0Var.mo132b().mo3000b().mo3003a(C0378c.STARTED)) {
                    fragment.f2147W.mo2569i(cVar);
                    z = true;
                }
                if (fragment.f2146V.mo3000b().mo3003a(C0378c.STARTED)) {
                    fragment.f2146V.mo3006o(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Deprecated
    /* renamed from: A */
    public void mo288A() {
        invalidateOptionsMenu();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo2132a(int i) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        printWriter.print(sb2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2354m);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2355n);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2356o);
        if (getApplication() != null) {
            LoaderManager.m5850b(this).mo5291a(sb2, fileDescriptor, printWriter, strArr);
        }
        this.f2352k.mo2714t().mo2782X(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f2352k.mo2715u();
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2352k.mo2715u();
        this.f2352k.mo2698d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2353l.mo3004h(C0377b.ON_CREATE);
        this.f2352k.mo2700f();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.f2352k.mo2701g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View s = mo2655s(view, str, context, attributeSet);
        return s == null ? super.onCreateView(view, str, context, attributeSet) : s;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f2352k.mo2702h();
        this.f2353l.mo3004h(C0377b.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f2352k.mo2703i();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f2352k.mo2705k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f2352k.mo2699e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f2352k.mo2704j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f2352k.mo2715u();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f2352k.mo2706l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f2355n = false;
        this.f2352k.mo2707m();
        this.f2353l.mo3004h(C0377b.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f2352k.mo2708n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo2660z();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return mo2659y(view, menu) | this.f2352k.mo2709o(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2352k.mo2715u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f2355n = true;
        this.f2352k.mo2715u();
        this.f2352k.mo2713s();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f2356o = false;
        if (!this.f2354m) {
            this.f2354m = true;
            this.f2352k.mo2697c();
        }
        this.f2352k.mo2715u();
        this.f2352k.mo2713s();
        this.f2353l.mo3004h(C0377b.ON_START);
        this.f2352k.mo2711q();
    }

    public void onStateNotSaved() {
        this.f2352k.mo2715u();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f2356o = true;
        mo2657v();
        this.f2352k.mo2712r();
        this.f2353l.mo3004h(C0377b.ON_STOP);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final View mo2655s(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2352k.mo2716v(view, str, context, attributeSet);
    }

    /* renamed from: t */
    public FragmentManager mo2656t() {
        return this.f2352k.mo2714t();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo2657v() {
        do {
        } while (m2319w(mo2656t(), C0378c.CREATED));
    }

    @Deprecated
    /* renamed from: x */
    public void mo2658x(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: y */
    public boolean mo2659y(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo2660z() {
        this.f2353l.mo3004h(C0377b.ON_RESUME);
        this.f2352k.mo2710p();
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View s = mo2655s(null, str, context, attributeSet);
        return s == null ? super.onCreateView(str, context, attributeSet) : s;
    }
}
