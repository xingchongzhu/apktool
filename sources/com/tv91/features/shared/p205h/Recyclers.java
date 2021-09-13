package com.tv91.features.shared.p205h;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0410g;
import androidx.recyclerview.widget.RecyclerView.C0412i;
import androidx.recyclerview.widget.RecyclerView.C0421o;

/* renamed from: com.tv91.features.shared.h.c */
public final class Recyclers {

    /* renamed from: com.tv91.features.shared.h.c$a */
    /* compiled from: Recyclers */
    static class C2300a extends C0412i {

        /* renamed from: a */
        final /* synthetic */ C0410g f13985a;

        /* renamed from: b */
        final /* synthetic */ C0421o f13986b;

        /* renamed from: c */
        final /* synthetic */ Bundle f13987c;

        /* renamed from: d */
        final /* synthetic */ String f13988d;

        C2300a(C0410g gVar, C0421o oVar, Bundle bundle, String str) {
            this.f13985a = gVar;
            this.f13986b = oVar;
            this.f13987c = bundle;
            this.f13988d = str;
        }

        /* renamed from: f */
        private void m17378f() {
            this.f13985a.mo3429w(this);
            Recyclers.m17373c(this.f13986b, this.f13987c.getParcelable(this.f13988d));
        }

        /* renamed from: a */
        public void mo3436a() {
            m17378f();
        }

        /* renamed from: d */
        public void mo3439d(int i, int i2) {
            m17378f();
        }
    }

    /* renamed from: b */
    private static String m17372b(RecyclerView recyclerView) {
        StringBuilder sb = new StringBuilder();
        sb.append("key-scroll-position-");
        sb.append(recyclerView.getId());
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m17373c(C0421o oVar, Parcelable parcelable) {
        if (parcelable != null) {
            oVar.mo3120c1(parcelable);
        }
    }

    /* renamed from: d */
    public static void m17374d(RecyclerView recyclerView, Bundle bundle) {
        m17375e(recyclerView, bundle, m17372b(recyclerView));
    }

    /* renamed from: e */
    public static void m17375e(RecyclerView recyclerView, Bundle bundle, String str) {
        C0410g adapter = recyclerView.getAdapter();
        C0421o layoutManager = recyclerView.getLayoutManager();
        if (adapter != null && layoutManager != null) {
            if (adapter.mo3409c() > 0) {
                m17373c(layoutManager, bundle.getParcelable(str));
            } else {
                adapter.mo3427u(new C2300a(adapter, layoutManager, bundle, str));
            }
        }
    }

    /* renamed from: f */
    public static void m17376f(RecyclerView recyclerView, Bundle bundle) {
        m17377g(recyclerView, bundle, m17372b(recyclerView));
    }

    /* renamed from: g */
    public static void m17377g(RecyclerView recyclerView, Bundle bundle, String str) {
        C0421o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            bundle.putParcelable(str, layoutManager.mo3121d1());
        }
    }
}
