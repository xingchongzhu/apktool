package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p010b.p025d.ArraySet;

/* renamed from: androidx.appcompat.app.e */
public abstract class AppCompatDelegate {

    /* renamed from: a */
    private static int f280a = -100;

    /* renamed from: b */
    private static final ArraySet<WeakReference<AppCompatDelegate>> f281b = new ArraySet<>();

    /* renamed from: c */
    private static final Object f282c = new Object();

    AppCompatDelegate() {
    }

    /* renamed from: c */
    static void m266c(AppCompatDelegate eVar) {
        synchronized (f282c) {
            m271y(eVar);
            f281b.add(new WeakReference(eVar));
        }
    }

    /* renamed from: g */
    public static AppCompatDelegate m267g(Activity activity, AppCompatCallback dVar) {
        return new AppCompatDelegateImpl(activity, dVar);
    }

    /* renamed from: h */
    public static AppCompatDelegate m268h(Dialog dialog, AppCompatCallback dVar) {
        return new AppCompatDelegateImpl(dialog, dVar);
    }

    /* renamed from: j */
    public static int m269j() {
        return f280a;
    }

    /* renamed from: x */
    static void m270x(AppCompatDelegate eVar) {
        synchronized (f282c) {
            m271y(eVar);
        }
    }

    /* renamed from: y */
    private static void m271y(AppCompatDelegate eVar) {
        synchronized (f282c) {
            Iterator it = f281b.iterator();
            while (it.hasNext()) {
                AppCompatDelegate eVar2 = (AppCompatDelegate) ((WeakReference) it.next()).get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract void mo324A(int i);

    /* renamed from: B */
    public abstract void mo325B(View view);

    /* renamed from: C */
    public abstract void mo326C(View view, LayoutParams layoutParams);

    /* renamed from: D */
    public void mo327D(int i) {
    }

    /* renamed from: E */
    public abstract void mo328E(CharSequence charSequence);

    /* renamed from: d */
    public abstract void mo329d(View view, LayoutParams layoutParams);

    @Deprecated
    /* renamed from: e */
    public void mo330e(Context context) {
    }

    /* renamed from: f */
    public Context mo331f(Context context) {
        mo330e(context);
        return context;
    }

    /* renamed from: i */
    public abstract <T extends View> T mo332i(int i);

    /* renamed from: k */
    public int mo333k() {
        return -100;
    }

    /* renamed from: l */
    public abstract MenuInflater mo334l();

    /* renamed from: m */
    public abstract ActionBar mo335m();

    /* renamed from: n */
    public abstract void mo336n();

    /* renamed from: o */
    public abstract void mo337o();

    /* renamed from: p */
    public abstract void mo338p(Configuration configuration);

    /* renamed from: q */
    public abstract void mo339q(Bundle bundle);

    /* renamed from: r */
    public abstract void mo340r();

    /* renamed from: s */
    public abstract void mo341s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo342t();

    /* renamed from: u */
    public abstract void mo343u(Bundle bundle);

    /* renamed from: v */
    public abstract void mo344v();

    /* renamed from: w */
    public abstract void mo345w();

    /* renamed from: z */
    public abstract boolean mo346z(int i);
}
