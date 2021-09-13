package p010b.p034g.p043k.p044f0;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b.g.k.f0.d */
public class AccessibilityNodeProviderCompat {

    /* renamed from: a */
    private final Object f4712a;

    /* renamed from: b.g.k.f0.d$a */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C0637a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final AccessibilityNodeProviderCompat f4713a;

        C0637a(AccessibilityNodeProviderCompat dVar) {
            this.f4713a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            AccessibilityNodeInfoCompat b = this.f4713a.mo5104b(i);
            if (b == null) {
                return null;
            }
            return b.mo5095x0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List c = this.f4713a.mo5105c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((AccessibilityNodeInfoCompat) c.get(i2)).mo5095x0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f4713a.mo5108f(i, i2, bundle);
        }
    }

    /* renamed from: b.g.k.f0.d$b */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C0638b extends C0637a {
        C0638b(AccessibilityNodeProviderCompat dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            AccessibilityNodeInfoCompat d = this.f4713a.mo5106d(i);
            if (d == null) {
                return null;
            }
            return d.mo5095x0();
        }
    }

    /* renamed from: b.g.k.f0.d$c */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C0639c extends C0638b {
        C0639c(AccessibilityNodeProviderCompat dVar) {
            super(dVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f4713a.mo5103a(i, AccessibilityNodeInfoCompat.m5349y0(accessibilityNodeInfo), str, bundle);
        }
    }

    public AccessibilityNodeProviderCompat() {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            this.f4712a = new C0639c(this);
        } else if (i >= 19) {
            this.f4712a = new C0638b(this);
        } else if (i >= 16) {
            this.f4712a = new C0637a(this);
        } else {
            this.f4712a = null;
        }
    }

    /* renamed from: a */
    public void mo5103a(int i, AccessibilityNodeInfoCompat cVar, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public AccessibilityNodeInfoCompat mo5104b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<AccessibilityNodeInfoCompat> mo5105c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public AccessibilityNodeInfoCompat mo5106d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object mo5107e() {
        return this.f4712a;
    }

    /* renamed from: f */
    public boolean mo5108f(int i, int i2, Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat(Object obj) {
        this.f4712a = obj;
    }
}
