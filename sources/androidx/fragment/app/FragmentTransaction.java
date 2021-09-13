package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle.C0378c;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.x */
public abstract class FragmentTransaction {

    /* renamed from: a */
    private final FragmentFactory f2508a;

    /* renamed from: b */
    private final ClassLoader f2509b;

    /* renamed from: c */
    ArrayList<C0353a> f2510c = new ArrayList<>();

    /* renamed from: d */
    int f2511d;

    /* renamed from: e */
    int f2512e;

    /* renamed from: f */
    int f2513f;

    /* renamed from: g */
    int f2514g;

    /* renamed from: h */
    int f2515h;

    /* renamed from: i */
    boolean f2516i;

    /* renamed from: j */
    boolean f2517j = true;

    /* renamed from: k */
    String f2518k;

    /* renamed from: l */
    int f2519l;

    /* renamed from: m */
    CharSequence f2520m;

    /* renamed from: n */
    int f2521n;

    /* renamed from: o */
    CharSequence f2522o;

    /* renamed from: p */
    ArrayList<String> f2523p;

    /* renamed from: q */
    ArrayList<String> f2524q;

    /* renamed from: r */
    boolean f2525r = false;

    /* renamed from: s */
    ArrayList<Runnable> f2526s;

    /* renamed from: androidx.fragment.app.x$a */
    /* compiled from: FragmentTransaction */
    static final class C0353a {

        /* renamed from: a */
        int f2527a;

        /* renamed from: b */
        Fragment f2528b;

        /* renamed from: c */
        int f2529c;

        /* renamed from: d */
        int f2530d;

        /* renamed from: e */
        int f2531e;

        /* renamed from: f */
        int f2532f;

        /* renamed from: g */
        C0378c f2533g;

        /* renamed from: h */
        C0378c f2534h;

        C0353a() {
        }

        C0353a(int i, Fragment fragment) {
            this.f2527a = i;
            this.f2528b = fragment;
            C0378c cVar = C0378c.RESUMED;
            this.f2533g = cVar;
            this.f2534h = cVar;
        }

        C0353a(int i, Fragment fragment, C0378c cVar) {
            this.f2527a = i;
            this.f2528b = fragment;
            this.f2533g = fragment.f2145U;
            this.f2534h = cVar;
        }
    }

    FragmentTransaction(FragmentFactory jVar, ClassLoader classLoader) {
        this.f2508a = jVar;
        this.f2509b = classLoader;
    }

    /* renamed from: b */
    public FragmentTransaction mo2935b(int i, Fragment fragment) {
        mo2521n(i, fragment, null, 1);
        return this;
    }

    /* renamed from: c */
    public FragmentTransaction mo2936c(int i, Fragment fragment, String str) {
        mo2521n(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public FragmentTransaction mo2937d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f2134J = viewGroup;
        return mo2936c(viewGroup.getId(), fragment, str);
    }

    /* renamed from: e */
    public FragmentTransaction mo2938e(Fragment fragment, String str) {
        mo2521n(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2939f(C0353a aVar) {
        this.f2510c.add(aVar);
        aVar.f2529c = this.f2511d;
        aVar.f2530d = this.f2512e;
        aVar.f2531e = this.f2513f;
        aVar.f2532f = this.f2514g;
    }

    /* renamed from: g */
    public FragmentTransaction mo2940g(Fragment fragment) {
        mo2939f(new C0353a(7, fragment));
        return this;
    }

    /* renamed from: h */
    public abstract int mo2516h();

    /* renamed from: i */
    public abstract int mo2517i();

    /* renamed from: j */
    public abstract void mo2518j();

    /* renamed from: k */
    public abstract void mo2519k();

    /* renamed from: l */
    public FragmentTransaction mo2520l(Fragment fragment) {
        mo2939f(new C0353a(6, fragment));
        return this;
    }

    /* renamed from: m */
    public FragmentTransaction mo2941m() {
        if (!this.f2516i) {
            this.f2517j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo2521n(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        String str2 = " now ";
        String str3 = ": was ";
        if (str != null) {
            String str4 = fragment.f2178z;
            if (str4 == null || str.equals(str4)) {
                fragment.f2178z = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(str3);
                sb2.append(fragment.f2178z);
                sb2.append(str2);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f2176x;
                if (i3 == 0 || i3 == i) {
                    fragment.f2176x = i;
                    fragment.f2177y = i;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(fragment);
                    sb3.append(str3);
                    sb3.append(fragment.f2176x);
                    sb3.append(str2);
                    sb3.append(i);
                    throw new IllegalStateException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't add fragment ");
                sb4.append(fragment);
                sb4.append(" with tag ");
                sb4.append(str);
                sb4.append(" to container view with no id");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
        mo2939f(new C0353a(i2, fragment));
    }

    /* renamed from: o */
    public FragmentTransaction mo2522o(Fragment fragment) {
        mo2939f(new C0353a(3, fragment));
        return this;
    }

    /* renamed from: p */
    public FragmentTransaction mo2942p(int i, Fragment fragment) {
        return mo2943q(i, fragment, null);
    }

    /* renamed from: q */
    public FragmentTransaction mo2943q(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo2521n(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: r */
    public FragmentTransaction mo2944r(int i, int i2) {
        return mo2945s(i, i2, 0, 0);
    }

    /* renamed from: s */
    public FragmentTransaction mo2945s(int i, int i2, int i3, int i4) {
        this.f2511d = i;
        this.f2512e = i2;
        this.f2513f = i3;
        this.f2514g = i4;
        return this;
    }

    /* renamed from: t */
    public FragmentTransaction mo2523t(Fragment fragment, C0378c cVar) {
        mo2939f(new C0353a(10, fragment, cVar));
        return this;
    }

    /* renamed from: u */
    public FragmentTransaction mo2946u(boolean z) {
        this.f2525r = z;
        return this;
    }
}
