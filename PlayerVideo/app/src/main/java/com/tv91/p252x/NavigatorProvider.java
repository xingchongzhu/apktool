package com.tv91.p252x;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import dagger.hilt.EntryPointAccessors;

/* renamed from: com.tv91.x.i */
public final class NavigatorProvider {

    /* renamed from: a */
    private final Map<String, Navigator> f16086a = new HashMap();

    /* renamed from: com.tv91.x.i$a */
    /* compiled from: NavigatorProvider */
    interface C3057a {
        /* renamed from: c */
        NavigatorProvider mo16915c();
    }

    /* renamed from: c */
    public static NavigatorProvider m20640c(Context context) {
        return ((C3057a) EntryPointAccessors.m22889a(context, C3057a.class)).mo16915c();
    }

    /* renamed from: a */
    public Navigator mo18591a(FragmentActivity eVar) {
        Navigator hVar = (Navigator) this.f16086a.get(eVar.getClass().getName());
        Objects.requireNonNull(hVar, "Navigator didn't init.");
        return hVar;
    }

    /* renamed from: b */
    public Navigator mo18592b(FragmentActivity eVar, int i) {
        String name = eVar.getClass().getName();
        Navigator hVar = (Navigator) this.f16086a.get(name);
        if (hVar != null) {
            return hVar;
        }
        Navigator hVar2 = new Navigator(eVar, i);
        this.f16086a.put(name, hVar2);
        return hVar2;
    }

    /* renamed from: d */
    public void mo18593d(FragmentActivity eVar) {
        this.f16086a.remove(eVar.getClass().getName());
    }
}
