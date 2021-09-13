package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import p010b.p053k.C0689c;

/* renamed from: androidx.fragment.app.l */
class FragmentLayoutInflaterFactory implements Factory2 {

    /* renamed from: a */
    final FragmentManager f2389a;

    /* renamed from: androidx.fragment.app.l$a */
    /* compiled from: FragmentLayoutInflaterFactory */
    class C0328a implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ FragmentStateManager f2390a;

        C0328a(FragmentStateManager uVar) {
            this.f2390a = uVar;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k = this.f2390a.mo2889k();
            this.f2390a.mo2890m();
            SpecialEffectsController.m2285n((ViewGroup) k.f2135K.getParent(), FragmentLayoutInflaterFactory.this.f2389a).mo2621j();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    FragmentLayoutInflaterFactory(FragmentManager nVar) {
        this.f2389a = nVar;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        FragmentStateManager uVar;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f2389a);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0689c.f4917d);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C0689c.f4918e);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C0689c.f4919f, -1);
        String string = obtainStyledAttributes.getString(C0689c.f4920g);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !FragmentFactory.m2377b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(attributeValue);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            fragment = this.f2389a.mo2797h0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f2389a.mo2799i0(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f2389a.mo2797h0(id);
        }
        String str2 = "Fragment ";
        String str3 = "FragmentManager";
        if (fragment == null) {
            fragment = this.f2389a.mo2817r0().mo2719a(context.getClassLoader(), attributeValue);
            fragment.f2167o = true;
            fragment.f2176x = resourceId != 0 ? resourceId : id;
            fragment.f2177y = id;
            fragment.f2178z = string;
            fragment.f2168p = true;
            FragmentManager nVar = this.f2389a;
            fragment.f2172t = nVar;
            fragment.f2173u = nVar.mo2822u0();
            fragment.mo2403V0(this.f2389a.mo2822u0().mo2721i(), attributeSet, fragment.f2154c);
            uVar = this.f2389a.mo2793g(fragment);
            if (FragmentManager.m2408G0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(fragment);
                sb2.append(" has been inflated via the <fragment> tag: id=0x");
                sb2.append(Integer.toHexString(resourceId));
                Log.v(str3, sb2.toString());
            }
        } else if (!fragment.f2168p) {
            fragment.f2168p = true;
            FragmentManager nVar2 = this.f2389a;
            fragment.f2172t = nVar2;
            fragment.f2173u = nVar2.mo2822u0();
            fragment.mo2403V0(this.f2389a.mo2822u0().mo2721i(), attributeSet, fragment.f2154c);
            uVar = this.f2389a.mo2824w(fragment);
            if (FragmentManager.m2408G0(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Retained Fragment ");
                sb3.append(fragment);
                sb3.append(" has been re-attached via the <fragment> tag: id=0x");
                sb3.append(Integer.toHexString(resourceId));
                Log.v(str3, sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(attributeSet.getPositionDescription());
            sb4.append(": Duplicate id 0x");
            sb4.append(Integer.toHexString(resourceId));
            sb4.append(", tag ");
            sb4.append(string);
            sb4.append(", or parent id 0x");
            sb4.append(Integer.toHexString(id));
            sb4.append(" with another fragment for ");
            sb4.append(attributeValue);
            throw new IllegalArgumentException(sb4.toString());
        }
        fragment.f2134J = (ViewGroup) view;
        uVar.mo2890m();
        uVar.mo2888j();
        View view2 = fragment.f2135K;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.f2135K.getTag() == null) {
                fragment.f2135K.setTag(string);
            }
            fragment.f2135K.addOnAttachStateChangeListener(new C0328a(uVar));
            return fragment.f2135K;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str2);
        sb5.append(attributeValue);
        sb5.append(" did not create a view.");
        throw new IllegalStateException(sb5.toString());
    }
}
