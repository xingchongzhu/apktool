package p010b.p034g.p043k;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p010b.p034g.C0576b;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0634a;
import p010b.p034g.p043k.p044f0.AccessibilityNodeProviderCompat;

/* renamed from: b.g.k.a */
public class AccessibilityDelegateCompat {

    /* renamed from: a */
    private static final AccessibilityDelegate f4592a = new AccessibilityDelegate();

    /* renamed from: b */
    private final AccessibilityDelegate f4593b;

    /* renamed from: c */
    private final AccessibilityDelegate f4594c;

    /* renamed from: b.g.k.a$a */
    /* compiled from: AccessibilityDelegateCompat */
    static final class C0613a extends AccessibilityDelegate {

        /* renamed from: a */
        final AccessibilityDelegateCompat f4595a;

        C0613a(AccessibilityDelegateCompat aVar) {
            this.f4595a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f4595a.mo3880a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProviderCompat b = this.f4595a.mo3881b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.mo5107e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4595a.mo2301f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfoCompat y0 = AccessibilityNodeInfoCompat.m5349y0(accessibilityNodeInfo);
            y0.mo5081p0(ViewCompat.m5540W(view));
            y0.mo5067h0(ViewCompat.m5535R(view));
            y0.mo5074l0(ViewCompat.m5574p(view));
            y0.mo5088t0(ViewCompat.m5528K(view));
            this.f4595a.mo2302g(view, y0);
            y0.mo5061e(accessibilityNodeInfo.getText(), view);
            List c = AccessibilityDelegateCompat.m5191c(view);
            for (int i = 0; i < c.size(); i++) {
                y0.mo5056b((C0634a) c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4595a.mo3882h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f4595a.mo3883i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f4595a.mo2303j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f4595a.mo3884l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f4595a.mo3885m(view, accessibilityEvent);
        }
    }

    public AccessibilityDelegateCompat() {
        this(f4592a);
    }

    /* renamed from: c */
    static List<C0634a> m5191c(View view) {
        List<C0634a> list = (List) view.getTag(C0576b.f4381H);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m5192e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] p = AccessibilityNodeInfoCompat.m5344p(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (p != null && i < p.length) {
                if (clickableSpan.equals(p[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m5193k(int i, View view) {
        SparseArray sparseArray = (SparseArray) view.getTag(C0576b.f4382I);
        if (sparseArray != null) {
            WeakReference weakReference = (WeakReference) sparseArray.get(i);
            if (weakReference != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (m5192e(clickableSpan, view)) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3880a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4593b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public AccessibilityNodeProviderCompat mo3881b(View view) {
        if (VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider = this.f4593b.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public AccessibilityDelegate mo4948d() {
        return this.f4594c;
    }

    /* renamed from: f */
    public void mo2301f(View view, AccessibilityEvent accessibilityEvent) {
        this.f4593b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
        this.f4593b.onInitializeAccessibilityNodeInfo(view, cVar.mo5095x0());
    }

    /* renamed from: h */
    public void mo3882h(View view, AccessibilityEvent accessibilityEvent) {
        this.f4593b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo3883i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4593b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo2303j(View view, int i, Bundle bundle) {
        List c = m5191c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C0634a aVar = (C0634a) c.get(i2);
            if (aVar.mo5098b() == i) {
                z = aVar.mo5100d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && VERSION.SDK_INT >= 16) {
            z = this.f4593b.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C0576b.f4389a) ? z : m5193k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo3884l(View view, int i) {
        this.f4593b.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo3885m(View view, AccessibilityEvent accessibilityEvent) {
        this.f4593b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public AccessibilityDelegateCompat(AccessibilityDelegate accessibilityDelegate) {
        this.f4593b = accessibilityDelegate;
        this.f4594c = new C0613a(this);
    }
}
