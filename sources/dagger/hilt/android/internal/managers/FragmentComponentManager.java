package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import p262d.p263a.EntryPoints;
import p262d.p263a.p264b.p266d.p267b.FragmentComponentBuilder;
import p262d.p263a.p269c.C3294c;
import p262d.p263a.p269c.GeneratedComponentManager;

/* renamed from: dagger.hilt.android.internal.managers.f */
public class FragmentComponentManager implements GeneratedComponentManager<Object> {

    /* renamed from: a */
    private volatile Object f18004a;

    /* renamed from: b */
    private final Object f18005b = new Object();

    /* renamed from: c */
    private final Fragment f18006c;

    /* renamed from: dagger.hilt.android.internal.managers.f$a */
    /* compiled from: FragmentComponentManager */
    public interface C3303a {
        /* renamed from: b */
        FragmentComponentBuilder mo16926b();
    }

    public FragmentComponentManager(Fragment fragment) {
        this.f18006c = fragment;
    }

    /* renamed from: a */
    private Object m22928a() {
        C3294c.m22901b(this.f18006c.mo2392R(), "Hilt Fragments must be attached before creating the component.");
        C3294c.m22902c(this.f18006c.mo2392R() instanceof GeneratedComponentManager, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f18006c.mo2392R().getClass());
        mo19639e(this.f18006c);
        return ((C3303a) EntryPoints.m22887a(this.f18006c.mo2392R(), C3303a.class)).mo16926b().mo16929b(this.f18006c).mo16928a();
    }

    /* renamed from: b */
    public static ContextWrapper m22929b(Context context, Fragment fragment) {
        return new ViewComponentManager$FragmentContextWrapper(context, fragment);
    }

    /* renamed from: c */
    public static ContextWrapper m22930c(LayoutInflater layoutInflater, Fragment fragment) {
        return new ViewComponentManager$FragmentContextWrapper(layoutInflater, fragment);
    }

    /* renamed from: d */
    public static final Context m22931d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo19639e(Fragment fragment) {
    }

    /* renamed from: g */
    public Object mo16498g() {
        if (this.f18004a == null) {
            synchronized (this.f18005b) {
                if (this.f18004a == null) {
                    this.f18004a = m22928a();
                }
            }
        }
        return this.f18004a;
    }
}
