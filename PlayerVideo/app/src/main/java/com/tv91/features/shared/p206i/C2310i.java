package com.tv91.features.shared.p206i;

import androidx.recyclerview.widget.RecyclerView.C0430t;

/* renamed from: com.tv91.features.shared.i.i */
/* compiled from: Scrolls */
public enum C2310i {
    SCROLL_UP,
    SCROLL_DOWN,
    REACH_TOP,
    REACH_BOTTOM,
    AT_TOP,
    AT_BOTTOM;

    /* renamed from: c */
    public C0430t mo16855c(int i, Runnable runnable) {
        return new C2309h(i, new C2304d(this, runnable));
    }

    /* renamed from: d */
    public C0430t mo16856d(Runnable runnable) {
        return mo16855c(0, runnable);
    }
}
