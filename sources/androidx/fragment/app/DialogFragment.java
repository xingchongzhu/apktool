package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

/* renamed from: androidx.fragment.app.d */
public class DialogFragment extends Fragment implements OnCancelListener, OnDismissListener {

    /* renamed from: d0 */
    private Handler f2301d0;

    /* renamed from: e0 */
    private Runnable f2302e0 = new C0306a();

    /* renamed from: f0 */
    private OnCancelListener f2303f0 = new C0307b();
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public OnDismissListener f2304g0 = new C0308c();

    /* renamed from: h0 */
    private int f2305h0 = 0;

    /* renamed from: i0 */
    private int f2306i0 = 0;

    /* renamed from: j0 */
    private boolean f2307j0 = true;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public boolean f2308k0 = true;

    /* renamed from: l0 */
    private int f2309l0 = -1;

    /* renamed from: m0 */
    private boolean f2310m0;

    /* renamed from: n0 */
    private Observer<LifecycleOwner> f2311n0 = new C0309d();
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public Dialog f2312o0;

    /* renamed from: p0 */
    private boolean f2313p0;

    /* renamed from: q0 */
    private boolean f2314q0;

    /* renamed from: r0 */
    private boolean f2315r0;

    /* renamed from: s0 */
    private boolean f2316s0 = false;

    /* renamed from: androidx.fragment.app.d$a */
    /* compiled from: DialogFragment */
    class C0306a implements Runnable {
        C0306a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogFragment.this.f2304g0.onDismiss(DialogFragment.this.f2312o0);
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    /* compiled from: DialogFragment */
    class C0307b implements OnCancelListener {
        C0307b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogFragment.this.f2312o0 != null) {
                DialogFragment dVar = DialogFragment.this;
                dVar.onCancel(dVar.f2312o0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    /* compiled from: DialogFragment */
    class C0308c implements OnDismissListener {
        C0308c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogFragment.this.f2312o0 != null) {
                DialogFragment dVar = DialogFragment.this;
                dVar.onDismiss(dVar.f2312o0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d */
    /* compiled from: DialogFragment */
    class C0309d implements Observer<LifecycleOwner> {
        C0309d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void mo2614a(LifecycleOwner iVar) {
            if (iVar != null && DialogFragment.this.f2308k0) {
                View P1 = DialogFragment.this.mo2388P1();
                if (P1.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (DialogFragment.this.f2312o0 != null) {
                    if (FragmentManager.m2408G0(3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DialogFragment ");
                        sb.append(this);
                        sb.append(" setting the content view on ");
                        sb.append(DialogFragment.this.f2312o0);
                        Log.d("FragmentManager", sb.toString());
                    }
                    DialogFragment.this.f2312o0.setContentView(P1);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    /* compiled from: DialogFragment */
    class C0310e extends FragmentContainer {

        /* renamed from: a */
        final /* synthetic */ FragmentContainer f2321a;

        C0310e(FragmentContainer gVar) {
            this.f2321a = gVar;
        }

        /* renamed from: f */
        public View mo2491f(int i) {
            if (this.f2321a.mo2492g()) {
                return this.f2321a.mo2491f(i);
            }
            return DialogFragment.this.mo2605t2(i);
        }

        /* renamed from: g */
        public boolean mo2492g() {
            return this.f2321a.mo2492g() || DialogFragment.this.mo2606u2();
        }
    }

    /* renamed from: p2 */
    private void m2255p2(boolean z, boolean z2) {
        if (!this.f2314q0) {
            this.f2314q0 = true;
            this.f2315r0 = false;
            Dialog dialog = this.f2312o0;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.f2312o0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f2301d0.getLooper()) {
                        onDismiss(this.f2312o0);
                    } else {
                        this.f2301d0.post(this.f2302e0);
                    }
                }
            }
            this.f2313p0 = true;
            if (this.f2309l0 >= 0) {
                mo2405W().mo2780V0(this.f2309l0, 1);
                this.f2309l0 = -1;
            } else {
                FragmentTransaction m = mo2405W().mo2808m();
                m.mo2522o(this);
                if (z) {
                    m.mo2517i();
                } else {
                    m.mo2516h();
                }
            }
        }
    }

    /* renamed from: v2 */
    private void m2256v2(Bundle bundle) {
        if (this.f2308k0 && !this.f2316s0) {
            try {
                this.f2310m0 = true;
                Dialog s2 = mo2604s2(bundle);
                this.f2312o0 = s2;
                if (this.f2308k0) {
                    mo2610z2(s2, this.f2305h0);
                    Context I = mo2367I();
                    if (I instanceof Activity) {
                        this.f2312o0.setOwnerActivity((Activity) I);
                    }
                    this.f2312o0.setCancelable(this.f2307j0);
                    this.f2312o0.setOnCancelListener(this.f2303f0);
                    this.f2312o0.setOnDismissListener(this.f2304g0);
                    this.f2316s0 = true;
                } else {
                    this.f2312o0 = null;
                }
            } finally {
                this.f2310m0 = false;
            }
        }
    }

    /* renamed from: G0 */
    public void mo2362G0(Context context) {
        super.mo2362G0(context);
        mo2456n0().mo2973f(this.f2311n0);
        if (!this.f2315r0) {
            this.f2314q0 = false;
        }
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        this.f2301d0 = new Handler();
        this.f2308k0 = this.f2177y == 0;
        if (bundle != null) {
            this.f2305h0 = bundle.getInt("android:style", 0);
            this.f2306i0 = bundle.getInt("android:theme", 0);
            this.f2307j0 = bundle.getBoolean("android:cancelable", true);
            this.f2308k0 = bundle.getBoolean("android:showsDialog", this.f2308k0);
            this.f2309l0 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: Q0 */
    public void mo2390Q0() {
        super.mo2390Q0();
        Dialog dialog = this.f2312o0;
        if (dialog != null) {
            this.f2313p0 = true;
            dialog.setOnDismissListener(null);
            this.f2312o0.dismiss();
            if (!this.f2314q0) {
                onDismiss(this.f2312o0);
            }
            this.f2312o0 = null;
            this.f2316s0 = false;
        }
    }

    /* renamed from: R0 */
    public void mo2393R0() {
        super.mo2393R0();
        if (!this.f2315r0 && !this.f2314q0) {
            this.f2314q0 = true;
        }
        mo2456n0().mo2976i(this.f2311n0);
    }

    /* renamed from: S0 */
    public LayoutInflater mo2395S0(Bundle bundle) {
        LayoutInflater S0 = super.mo2395S0(bundle);
        String str = "FragmentManager";
        if (!this.f2308k0 || this.f2310m0) {
            if (FragmentManager.m2408G0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("getting layout inflater for DialogFragment ");
                sb.append(this);
                String sb2 = sb.toString();
                if (!this.f2308k0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("mShowsDialog = false: ");
                    sb3.append(sb2);
                    Log.d(str, sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("mCreatingDialog = true: ");
                    sb4.append(sb2);
                    Log.d(str, sb4.toString());
                }
            }
            return S0;
        }
        m2256v2(bundle);
        if (FragmentManager.m2408G0(2)) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("get layout inflater for DialogFragment ");
            sb5.append(this);
            sb5.append(" from dialog context");
            Log.d(str, sb5.toString());
        }
        Dialog dialog = this.f2312o0;
        if (dialog != null) {
            S0 = S0.cloneInContext(dialog.getContext());
        }
        return S0;
    }

    /* renamed from: f1 */
    public void mo2434f1(Bundle bundle) {
        super.mo2434f1(bundle);
        Dialog dialog = this.f2312o0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f2305h0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f2306i0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f2307j0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f2308k0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f2309l0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        Dialog dialog = this.f2312o0;
        if (dialog != null) {
            this.f2313p0 = false;
            dialog.show();
            View decorView = this.f2312o0.getWindow().getDecorView();
            ViewTreeLifecycleOwner.m2808a(decorView, this);
            ViewTreeViewModelStoreOwner.m2809a(decorView, this);
            ViewTreeSavedStateRegistryOwner.m4001a(decorView, this);
        }
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        Dialog dialog = this.f2312o0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: j1 */
    public void mo2447j1(Bundle bundle) {
        super.mo2447j1(bundle);
        if (this.f2312o0 != null && bundle != null) {
            Bundle bundle2 = bundle.getBundle("android:savedDialogState");
            if (bundle2 != null) {
                this.f2312o0.onRestoreInstanceState(bundle2);
            }
        }
    }

    /* renamed from: o2 */
    public void mo2599o2() {
        m2255p2(false, false);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f2313p0) {
            if (FragmentManager.m2408G0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            m2255p2(true, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q1 */
    public void mo2464q1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo2464q1(layoutInflater, viewGroup, bundle);
        if (this.f2135K == null && this.f2312o0 != null && bundle != null) {
            Bundle bundle2 = bundle.getBundle("android:savedDialogState");
            if (bundle2 != null) {
                this.f2312o0.onRestoreInstanceState(bundle2);
            }
        }
    }

    /* renamed from: q2 */
    public Dialog mo2602q2() {
        return this.f2312o0;
    }

    /* renamed from: r2 */
    public int mo2603r2() {
        return this.f2306i0;
    }

    /* renamed from: s2 */
    public Dialog mo2604s2(Bundle bundle) {
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        return new Dialog(mo2385O1(), mo2603r2());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t2 */
    public View mo2605t2(int i) {
        Dialog dialog = this.f2312o0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u2 */
    public boolean mo2606u2() {
        return this.f2316s0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public FragmentContainer mo2477w() {
        return new C0310e(super.mo2477w());
    }

    /* renamed from: w2 */
    public final Dialog mo2607w2() {
        Dialog q2 = mo2602q2();
        if (q2 != null) {
            return q2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: x2 */
    public void mo2608x2(boolean z) {
        this.f2307j0 = z;
        Dialog dialog = this.f2312o0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* renamed from: y2 */
    public void mo2609y2(int i, int i2) {
        if (FragmentManager.m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            Log.d("FragmentManager", sb.toString());
        }
        this.f2305h0 = i;
        if (i == 2 || i == 3) {
            this.f2306i0 = 16973913;
        }
        if (i2 != 0) {
            this.f2306i0 = i2;
        }
    }

    /* renamed from: z2 */
    public void mo2610z2(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }
}
