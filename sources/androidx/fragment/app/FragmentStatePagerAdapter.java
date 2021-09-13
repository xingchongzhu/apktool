package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment.C0286l;
import androidx.lifecycle.Lifecycle.C0378c;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;

@Deprecated
/* renamed from: androidx.fragment.app.v */
public abstract class FragmentStatePagerAdapter extends PagerAdapter {

    /* renamed from: c */
    private final FragmentManager f2498c;

    /* renamed from: d */
    private final int f2499d;

    /* renamed from: e */
    private FragmentTransaction f2500e = null;

    /* renamed from: f */
    private ArrayList<C0286l> f2501f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<Fragment> f2502g = new ArrayList<>();

    /* renamed from: h */
    private Fragment f2503h = null;

    /* renamed from: i */
    private boolean f2504i;

    public FragmentStatePagerAdapter(FragmentManager nVar, int i) {
        this.f2498c = nVar;
        this.f2499d = i;
    }

    /* renamed from: a */
    public void mo2902a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f2500e == null) {
            this.f2500e = this.f2498c.mo2808m();
        }
        while (this.f2501f.size() <= i) {
            this.f2501f.add(null);
        }
        this.f2501f.set(i, fragment.mo2465r0() ? this.f2498c.mo2803j1(fragment) : null);
        this.f2502g.set(i, null);
        this.f2500e.mo2522o(fragment);
        if (fragment.equals(this.f2503h)) {
            this.f2503h = null;
        }
    }

    /* renamed from: b */
    public void mo2903b(ViewGroup viewGroup) {
        FragmentTransaction xVar = this.f2500e;
        if (xVar != null) {
            if (!this.f2504i) {
                try {
                    this.f2504i = true;
                    xVar.mo2519k();
                } finally {
                    this.f2504i = false;
                }
            }
            this.f2500e = null;
        }
    }

    /* renamed from: g */
    public Object mo2904g(ViewGroup viewGroup, int i) {
        if (this.f2502g.size() > i) {
            Fragment fragment = (Fragment) this.f2502g.get(i);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.f2500e == null) {
            this.f2500e = this.f2498c.mo2808m();
        }
        Fragment p = mo2910p(i);
        if (this.f2501f.size() > i) {
            C0286l lVar = (C0286l) this.f2501f.get(i);
            if (lVar != null) {
                p.mo2416Z1(lVar);
            }
        }
        while (this.f2502g.size() <= i) {
            this.f2502g.add(null);
        }
        p.mo2419a2(false);
        if (this.f2499d == 0) {
            p.mo2441h2(false);
        }
        this.f2502g.set(i, p);
        this.f2500e.mo2935b(viewGroup.getId(), p);
        if (this.f2499d == 1) {
            this.f2500e.mo2523t(p, C0378c.STARTED);
        }
        return p;
    }

    /* renamed from: h */
    public boolean mo2905h(View view, Object obj) {
        return ((Fragment) obj).mo2452l0() == view;
    }

    /* renamed from: j */
    public void mo2906j(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f2501f.clear();
            this.f2502g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f2501f.add((C0286l) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment p0 = this.f2498c.mo2814p0(bundle, str);
                    if (p0 != null) {
                        while (this.f2502g.size() <= parseInt) {
                            this.f2502g.add(null);
                        }
                        p0.mo2419a2(false);
                        this.f2502g.set(parseInt, p0);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Bad fragment at key ");
                        sb.append(str);
                        Log.w("FragmentStatePagerAdapt", sb.toString());
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public Parcelable mo2907k() {
        Bundle bundle;
        if (this.f2501f.size() > 0) {
            bundle = new Bundle();
            C0286l[] lVarArr = new C0286l[this.f2501f.size()];
            this.f2501f.toArray(lVarArr);
            bundle.putParcelableArray("states", lVarArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f2502g.size(); i++) {
            Fragment fragment = (Fragment) this.f2502g.get(i);
            if (fragment != null && fragment.mo2465r0()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("f");
                sb.append(i);
                this.f2498c.mo2785a1(bundle, sb.toString(), fragment);
            }
        }
        return bundle;
    }

    /* renamed from: l */
    public void mo2908l(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f2503h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.mo2419a2(false);
                if (this.f2499d == 1) {
                    if (this.f2500e == null) {
                        this.f2500e = this.f2498c.mo2808m();
                    }
                    this.f2500e.mo2523t(this.f2503h, C0378c.STARTED);
                } else {
                    this.f2503h.mo2441h2(false);
                }
            }
            fragment.mo2419a2(true);
            if (this.f2499d == 1) {
                if (this.f2500e == null) {
                    this.f2500e = this.f2498c.mo2808m();
                }
                this.f2500e.mo2523t(fragment, C0378c.RESUMED);
            } else {
                fragment.mo2441h2(true);
            }
            this.f2503h = fragment;
        }
    }

    /* renamed from: n */
    public void mo2909n(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: p */
    public abstract Fragment mo2910p(int i);
}
