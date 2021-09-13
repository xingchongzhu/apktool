package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import p262d.p263a.p269c.C3294c;

public final class ViewComponentManager$FragmentContextWrapper extends ContextWrapper {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Fragment f17984a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public LayoutInflater f17985b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public LayoutInflater f17986c;

    /* renamed from: d */
    private final LifecycleEventObserver f17987d;

    ViewComponentManager$FragmentContextWrapper(Context context, Fragment fragment) {
        super((Context) C3294c.m22900a(context));
        C32961 r2 = new LifecycleEventObserver() {
            /* renamed from: c */
            public void mo154c(LifecycleOwner iVar, C0377b bVar) {
                if (bVar == C0377b.ON_DESTROY) {
                    ViewComponentManager$FragmentContextWrapper.this.f17984a = null;
                    ViewComponentManager$FragmentContextWrapper.this.f17985b = null;
                    ViewComponentManager$FragmentContextWrapper.this.f17986c = null;
                }
            }
        };
        this.f17987d = r2;
        this.f17985b = null;
        Fragment fragment2 = (Fragment) C3294c.m22900a(fragment);
        this.f17984a = fragment2;
        fragment2.mo132b().mo2999a(r2);
    }

    public Object getSystemService(String str) {
        String str2 = "layout_inflater";
        if (!str2.equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f17986c == null) {
            if (this.f17985b == null) {
                this.f17985b = (LayoutInflater) getBaseContext().getSystemService(str2);
            }
            this.f17986c = this.f17985b.cloneInContext(this);
        }
        return this.f17986c;
    }

    ViewComponentManager$FragmentContextWrapper(LayoutInflater layoutInflater, Fragment fragment) {
        super((Context) C3294c.m22900a(((LayoutInflater) C3294c.m22900a(layoutInflater)).getContext()));
        C32961 r0 = new LifecycleEventObserver() {
            /* renamed from: c */
            public void mo154c(LifecycleOwner iVar, C0377b bVar) {
                if (bVar == C0377b.ON_DESTROY) {
                    ViewComponentManager$FragmentContextWrapper.this.f17984a = null;
                    ViewComponentManager$FragmentContextWrapper.this.f17985b = null;
                    ViewComponentManager$FragmentContextWrapper.this.f17986c = null;
                }
            }
        };
        this.f17987d = r0;
        this.f17985b = layoutInflater;
        Fragment fragment2 = (Fragment) C3294c.m22900a(fragment);
        this.f17984a = fragment2;
        fragment2.mo132b().mo2999a(r0);
    }
}
