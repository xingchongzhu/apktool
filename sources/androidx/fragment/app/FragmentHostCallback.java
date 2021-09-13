package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.ContextCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p010b.p034g.p042j.Preconditions;

/* renamed from: androidx.fragment.app.k */
public abstract class FragmentHostCallback<E> extends FragmentContainer {

    /* renamed from: a */
    private final Activity f2384a;

    /* renamed from: b */
    private final Context f2385b;

    /* renamed from: c */
    private final Handler f2386c;

    /* renamed from: d */
    private final int f2387d;

    /* renamed from: e */
    final FragmentManager f2388e;

    FragmentHostCallback(FragmentActivity eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    /* renamed from: f */
    public View mo2491f(int i) {
        return null;
    }

    /* renamed from: g */
    public boolean mo2492g() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Activity mo2720h() {
        return this.f2384a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Context mo2721i() {
        return this.f2385b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Handler mo2722k() {
        return this.f2386c;
    }

    /* renamed from: l */
    public void mo2662l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: m */
    public abstract E mo2663m();

    /* renamed from: n */
    public LayoutInflater mo2664n() {
        return LayoutInflater.from(this.f2385b);
    }

    @Deprecated
    /* renamed from: o */
    public void mo2723o(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: q */
    public boolean mo2665q(Fragment fragment) {
        return true;
    }

    /* renamed from: r */
    public void mo2724r(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            ContextCompat.m1764j(this.f2385b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: s */
    public void mo2666s() {
    }

    FragmentHostCallback(Activity activity, Context context, Handler handler, int i) {
        this.f2388e = new FragmentManagerImpl();
        this.f2384a = activity;
        this.f2385b = (Context) Preconditions.m5189f(context, "context == null");
        this.f2386c = (Handler) Preconditions.m5189f(handler, "handler == null");
        this.f2387d = i;
    }
}
