package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p010b.p034g.p043k.AccessibilityDelegateCompat;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeProviderCompat;

/* renamed from: androidx.recyclerview.widget.l */
public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat {

    /* renamed from: d */
    final RecyclerView f3137d;

    /* renamed from: e */
    private final C0475a f3138e;

    /* renamed from: androidx.recyclerview.widget.l$a */
    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class C0475a extends AccessibilityDelegateCompat {

        /* renamed from: d */
        final RecyclerViewAccessibilityDelegate f3139d;

        /* renamed from: e */
        private Map<View, AccessibilityDelegateCompat> f3140e = new WeakHashMap();

        public C0475a(RecyclerViewAccessibilityDelegate lVar) {
            this.f3139d = lVar;
        }

        /* renamed from: a */
        public boolean mo3880a(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat aVar = (AccessibilityDelegateCompat) this.f3140e.get(view);
            if (aVar != null) {
                return aVar.mo3880a(view, accessibilityEvent);
            }
            return super.mo3880a(view, accessibilityEvent);
        }

        /* renamed from: b */
        public AccessibilityNodeProviderCompat mo3881b(View view) {
            AccessibilityDelegateCompat aVar = (AccessibilityDelegateCompat) this.f3140e.get(view);
            if (aVar != null) {
                return aVar.mo3881b(view);
            }
            return super.mo3881b(view);
        }

        /* renamed from: f */
        public void mo2301f(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat aVar = (AccessibilityDelegateCompat) this.f3140e.get(view);
            if (aVar != null) {
                aVar.mo2301f(view, accessibilityEvent);
            } else {
                super.mo2301f(view, accessibilityEvent);
            }
        }

        /* renamed from: g */
        public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
            if (this.f3139d.mo3879o() || this.f3139d.f3137d.getLayoutManager() == null) {
                super.mo2302g(view, cVar);
                return;
            }
            this.f3139d.f3137d.getLayoutManager().mo3501O0(view, cVar);
            AccessibilityDelegateCompat aVar = (AccessibilityDelegateCompat) this.f3140e.get(view);
            if (aVar != null) {
                aVar.mo2302g(view, cVar);
            } else {
                super.mo2302g(view, cVar);
            }
        }

        /* renamed from: h */
        public void mo3882h(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat aVar = (AccessibilityDelegateCompat) this.f3140e.get(view);
            if (aVar != null) {
                aVar.mo3882h(view, accessibilityEvent);
            } else {
                super.mo3882h(view, accessibilityEvent);
            }
        }

        /* renamed from: i */
        public boolean mo3883i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat aVar = (AccessibilityDelegateCompat) this.f3140e.get(viewGroup);
            if (aVar != null) {
                return aVar.mo3883i(viewGroup, view, accessibilityEvent);
            }
            return super.mo3883i(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: j */
        public boolean mo2303j(View view, int i, Bundle bundle) {
            if (this.f3139d.mo3879o() || this.f3139d.f3137d.getLayoutManager() == null) {
                return super.mo2303j(view, i, bundle);
            }
            AccessibilityDelegateCompat aVar = (AccessibilityDelegateCompat) this.f3140e.get(view);
            if (aVar != null) {
                if (aVar.mo2303j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo2303j(view, i, bundle)) {
                return true;
            }
            return this.f3139d.f3137d.getLayoutManager().mo3536i1(view, i, bundle);
        }

        /* renamed from: l */
        public void mo3884l(View view, int i) {
            AccessibilityDelegateCompat aVar = (AccessibilityDelegateCompat) this.f3140e.get(view);
            if (aVar != null) {
                aVar.mo3884l(view, i);
            } else {
                super.mo3884l(view, i);
            }
        }

        /* renamed from: m */
        public void mo3885m(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat aVar = (AccessibilityDelegateCompat) this.f3140e.get(view);
            if (aVar != null) {
                aVar.mo3885m(view, accessibilityEvent);
            } else {
                super.mo3885m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public AccessibilityDelegateCompat mo3886n(View view) {
            return (AccessibilityDelegateCompat) this.f3140e.remove(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public void mo3887o(View view) {
            AccessibilityDelegateCompat l = ViewCompat.m5566l(view);
            if (l != null && l != this) {
                this.f3140e.put(view, l);
            }
        }
    }

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        this.f3137d = recyclerView;
        AccessibilityDelegateCompat n = mo3878n();
        if (n == null || !(n instanceof C0475a)) {
            this.f3138e = new C0475a(this);
        } else {
            this.f3138e = (C0475a) n;
        }
    }

    /* renamed from: f */
    public void mo2301f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2301f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo3879o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo3108K0(accessibilityEvent);
            }
        }
    }

    /* renamed from: g */
    public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
        super.mo2302g(view, cVar);
        if (!mo3879o() && this.f3137d.getLayoutManager() != null) {
            this.f3137d.getLayoutManager().mo3498M0(cVar);
        }
    }

    /* renamed from: j */
    public boolean mo2303j(View view, int i, Bundle bundle) {
        if (super.mo2303j(view, i, bundle)) {
            return true;
        }
        if (mo3879o() || this.f3137d.getLayoutManager() == null) {
            return false;
        }
        return this.f3137d.getLayoutManager().mo3531g1(i, bundle);
    }

    /* renamed from: n */
    public AccessibilityDelegateCompat mo3878n() {
        return this.f3138e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo3879o() {
        return this.f3137d.mo3262o0();
    }
}
