package p010b.p048i.p050b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.p259uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.List;
import p010b.p025d.SparseArrayCompat;
import p010b.p034g.p043k.AccessibilityDelegateCompat;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.ViewParentCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeProviderCompat;
import p010b.p034g.p043k.p044f0.AccessibilityRecordCompat;
import p010b.p048i.p050b.FocusStrategy.C0676a;
import p010b.p048i.p050b.FocusStrategy.C0677b;

/* renamed from: b.i.b.a */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {

    /* renamed from: d */
    private static final Rect f4778d = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: e */
    private static final C0676a<AccessibilityNodeInfoCompat> f4779e = new C0673a();

    /* renamed from: f */
    private static final C0677b<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> f4780f = new C0674b();

    /* renamed from: g */
    private final Rect f4781g = new Rect();

    /* renamed from: h */
    private final Rect f4782h = new Rect();

    /* renamed from: i */
    private final Rect f4783i = new Rect();

    /* renamed from: j */
    private final int[] f4784j = new int[2];

    /* renamed from: k */
    private final AccessibilityManager f4785k;

    /* renamed from: l */
    private final View f4786l;

    /* renamed from: m */
    private C0675c f4787m;

    /* renamed from: n */
    int f4788n = Integer.MIN_VALUE;

    /* renamed from: o */
    int f4789o = Integer.MIN_VALUE;

    /* renamed from: p */
    private int f4790p = Integer.MIN_VALUE;

    /* renamed from: b.i.b.a$a */
    /* compiled from: ExploreByTouchHelper */
    static class C0673a implements C0676a<AccessibilityNodeInfoCompat> {
        C0673a() {
        }

        /* renamed from: b */
        public void mo5218a(AccessibilityNodeInfoCompat cVar, Rect rect) {
            cVar.mo5073l(rect);
        }
    }

    /* renamed from: b.i.b.a$b */
    /* compiled from: ExploreByTouchHelper */
    static class C0674b implements C0677b<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> {
        C0674b() {
        }

        /* renamed from: c */
        public AccessibilityNodeInfoCompat mo5220a(SparseArrayCompat<AccessibilityNodeInfoCompat> hVar, int i) {
            return (AccessibilityNodeInfoCompat) hVar.mo4532k(i);
        }

        /* renamed from: d */
        public int mo5221b(SparseArrayCompat<AccessibilityNodeInfoCompat> hVar) {
            return hVar.mo4531j();
        }
    }

    /* renamed from: b.i.b.a$c */
    /* compiled from: ExploreByTouchHelper */
    private class C0675c extends AccessibilityNodeProviderCompat {
        C0675c() {
        }

        /* renamed from: b */
        public AccessibilityNodeInfoCompat mo5104b(int i) {
            return AccessibilityNodeInfoCompat.m5336M(ExploreByTouchHelper.this.mo5203H(i));
        }

        /* renamed from: d */
        public AccessibilityNodeInfoCompat mo5106d(int i) {
            int i2 = i == 2 ? ExploreByTouchHelper.this.f4788n : ExploreByTouchHelper.this.f4789o;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo5104b(i2);
        }

        /* renamed from: f */
        public boolean mo5108f(int i, int i2, Bundle bundle) {
            return ExploreByTouchHelper.this.mo5211P(i, i2, bundle);
        }
    }

    public ExploreByTouchHelper(View view) {
        if (view != null) {
            this.f4786l = view;
            this.f4785k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (ViewCompat.m5510A(view) == 0) {
                ViewCompat.m5591x0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: D */
    private static Rect m5678D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: E */
    private boolean m5679E(Rect rect) {
        boolean z = false;
        if (rect != null && !rect.isEmpty()) {
            if (this.f4786l.getWindowVisibility() != 0) {
                return false;
            }
            ViewParent parent = this.f4786l.getParent();
            while (parent instanceof View) {
                View view = (View) parent;
                if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                    return false;
                }
                parent = view.getParent();
            }
            if (parent != null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: F */
    private static int m5680F(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: G */
    private boolean m5681G(int i, Rect rect) {
        AccessibilityNodeInfoCompat cVar;
        AccessibilityNodeInfoCompat cVar2;
        SparseArrayCompat y = m5693y();
        int i2 = this.f4789o;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            cVar = null;
        } else {
            cVar = (AccessibilityNodeInfoCompat) y.mo4526e(i2);
        }
        Object obj = cVar;
        if (i == 1 || i == 2) {
            cVar2 = (AccessibilityNodeInfoCompat) FocusStrategy.m5728d(y, f4780f, f4779e, obj, i, ViewCompat.m5514C(this.f4786l) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f4789o;
            if (i4 != Integer.MIN_VALUE) {
                m5694z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m5678D(this.f4786l, i, rect2);
            }
            cVar2 = (AccessibilityNodeInfoCompat) FocusStrategy.m5727c(y, f4780f, f4779e, obj, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (cVar2 != null) {
            i3 = y.mo4529h(y.mo4528g(cVar2));
        }
        return mo5212T(i3);
    }

    /* renamed from: Q */
    private boolean m5682Q(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return mo5212T(i);
        }
        if (i2 == 2) {
            return mo5214o(i);
        }
        if (i2 == 64) {
            return m5684S(i);
        }
        if (i2 != 128) {
            return mo5205J(i, i2, bundle);
        }
        return m5686n(i);
    }

    /* renamed from: R */
    private boolean m5683R(int i, Bundle bundle) {
        return ViewCompat.m5551d0(this.f4786l, i, bundle);
    }

    /* renamed from: S */
    private boolean m5684S(int i) {
        if (this.f4785k.isEnabled() && this.f4785k.isTouchExplorationEnabled()) {
            int i2 = this.f4788n;
            if (i2 != i) {
                if (i2 != Integer.MIN_VALUE) {
                    m5686n(i2);
                }
                this.f4788n = i;
                this.f4786l.invalidate();
                mo5213U(i, 32768);
                return true;
            }
        }
        return false;
    }

    /* renamed from: V */
    private void m5685V(int i) {
        int i2 = this.f4790p;
        if (i2 != i) {
            this.f4790p = i;
            mo5213U(i, 128);
            mo5213U(i2, LogType.UNEXP);
        }
    }

    /* renamed from: n */
    private boolean m5686n(int i) {
        if (this.f4788n != i) {
            return false;
        }
        this.f4788n = Integer.MIN_VALUE;
        this.f4786l.invalidate();
        mo5213U(i, 65536);
        return true;
    }

    /* renamed from: p */
    private boolean m5687p() {
        int i = this.f4789o;
        return i != Integer.MIN_VALUE && mo5205J(i, 16, null);
    }

    /* renamed from: q */
    private AccessibilityEvent m5688q(int i, int i2) {
        if (i != -1) {
            return m5689r(i, i2);
        }
        return m5690s(i2);
    }

    /* renamed from: r */
    private AccessibilityEvent m5689r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        AccessibilityNodeInfoCompat H = mo5203H(i);
        obtain.getText().add(H.mo5091v());
        obtain.setContentDescription(H.mo5082q());
        obtain.setScrollable(H.mo5040H());
        obtain.setPassword(H.mo5039G());
        obtain.setEnabled(H.mo5035C());
        obtain.setChecked(H.mo5033A());
        mo5207L(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H.mo5079o());
            AccessibilityRecordCompat.m5425c(obtain, this.f4786l, i);
            obtain.setPackageName(this.f4786l.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: s */
    private AccessibilityEvent m5690s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f4786l.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    private AccessibilityNodeInfoCompat m5691t(int i) {
        AccessibilityNodeInfoCompat K = AccessibilityNodeInfoCompat.m5334K();
        K.mo5060d0(true);
        K.mo5064f0(true);
        K.mo5051X("android.view.View");
        Rect rect = f4778d;
        K.mo5047T(rect);
        K.mo5048U(rect);
        K.mo5076m0(this.f4786l);
        mo5209N(i, K);
        if (K.mo5091v() == null && K.mo5082q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        K.mo5073l(this.f4782h);
        if (!this.f4782h.equals(rect)) {
            int j = K.mo5070j();
            if ((j & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((j & 128) == 0) {
                K.mo5072k0(this.f4786l.getContext().getPackageName());
                K.mo5086s0(this.f4786l, i);
                if (this.f4788n == i) {
                    K.mo5046R(true);
                    K.mo5054a(128);
                } else {
                    K.mo5046R(false);
                    K.mo5054a(64);
                }
                boolean z = this.f4789o == i;
                if (z) {
                    K.mo5054a(2);
                } else if (K.mo5036D()) {
                    K.mo5054a(1);
                }
                K.mo5065g0(z);
                this.f4786l.getLocationOnScreen(this.f4784j);
                K.mo5075m(this.f4781g);
                if (this.f4781g.equals(rect)) {
                    K.mo5073l(this.f4781g);
                    if (K.f4665c != -1) {
                        AccessibilityNodeInfoCompat K2 = AccessibilityNodeInfoCompat.m5334K();
                        for (int i2 = K.f4665c; i2 != -1; i2 = K2.f4665c) {
                            K2.mo5078n0(this.f4786l, -1);
                            K2.mo5047T(f4778d);
                            mo5209N(i2, K2);
                            K2.mo5073l(this.f4782h);
                            Rect rect2 = this.f4781g;
                            Rect rect3 = this.f4782h;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        K2.mo5044O();
                    }
                    this.f4781g.offset(this.f4784j[0] - this.f4786l.getScrollX(), this.f4784j[1] - this.f4786l.getScrollY());
                }
                if (this.f4786l.getLocalVisibleRect(this.f4783i)) {
                    this.f4783i.offset(this.f4784j[0] - this.f4786l.getScrollX(), this.f4784j[1] - this.f4786l.getScrollY());
                    if (this.f4781g.intersect(this.f4783i)) {
                        K.mo5048U(this.f4781g);
                        if (m5679E(this.f4781g)) {
                            K.mo5094w0(true);
                        }
                    }
                }
                return K;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: u */
    private AccessibilityNodeInfoCompat m5692u() {
        AccessibilityNodeInfoCompat L = AccessibilityNodeInfoCompat.m5335L(this.f4786l);
        ViewCompat.m5547b0(this.f4786l, L);
        ArrayList arrayList = new ArrayList();
        mo5202C(arrayList);
        if (L.mo5077n() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                L.mo5058c(this.f4786l, ((Integer) arrayList.get(i)).intValue());
            }
            return L;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: y */
    private SparseArrayCompat<AccessibilityNodeInfoCompat> m5693y() {
        ArrayList arrayList = new ArrayList();
        mo5202C(arrayList);
        SparseArrayCompat<AccessibilityNodeInfoCompat> hVar = new SparseArrayCompat<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.mo4530i(i, m5691t(i));
        }
        return hVar;
    }

    /* renamed from: z */
    private void m5694z(int i, Rect rect) {
        mo5203H(i).mo5073l(rect);
    }

    /* renamed from: A */
    public final int mo5200A() {
        return this.f4789o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract int mo5201B(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo5202C(List<Integer> list);

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public AccessibilityNodeInfoCompat mo5203H(int i) {
        if (i == -1) {
            return m5692u();
        }
        return m5691t(i);
    }

    /* renamed from: I */
    public final void mo5204I(boolean z, int i, Rect rect) {
        int i2 = this.f4789o;
        if (i2 != Integer.MIN_VALUE) {
            mo5214o(i2);
        }
        if (z) {
            m5681G(i, rect);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract boolean mo5205J(int i, int i2, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo5206K(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo5207L(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo5208M(AccessibilityNodeInfoCompat cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract void mo5209N(int i, AccessibilityNodeInfoCompat cVar);

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo5210O(int i, boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public boolean mo5211P(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m5682Q(i, i2, bundle);
        }
        return m5683R(i2, bundle);
    }

    /* renamed from: T */
    public final boolean mo5212T(int i) {
        if (!this.f4786l.isFocused() && !this.f4786l.requestFocus()) {
            return false;
        }
        int i2 = this.f4789o;
        if (i2 == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo5214o(i2);
        }
        this.f4789o = i;
        mo5210O(i, true);
        mo5213U(i, 8);
        return true;
    }

    /* renamed from: U */
    public final boolean mo5213U(int i, int i2) {
        if (i == Integer.MIN_VALUE || !this.f4785k.isEnabled()) {
            return false;
        }
        ViewParent parent = this.f4786l.getParent();
        if (parent == null) {
            return false;
        }
        return ViewParentCompat.m5658h(parent, this.f4786l, m5688q(i, i2));
    }

    /* renamed from: b */
    public AccessibilityNodeProviderCompat mo3881b(View view) {
        if (this.f4787m == null) {
            this.f4787m = new C0675c();
        }
        return this.f4787m;
    }

    /* renamed from: f */
    public void mo2301f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2301f(view, accessibilityEvent);
        mo5206K(accessibilityEvent);
    }

    /* renamed from: g */
    public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
        super.mo2302g(view, cVar);
        mo5208M(cVar);
    }

    /* renamed from: o */
    public final boolean mo5214o(int i) {
        if (this.f4789o != i) {
            return false;
        }
        this.f4789o = Integer.MIN_VALUE;
        mo5210O(i, false);
        mo5213U(i, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean mo5215v(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f4785k.isEnabled() && this.f4785k.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int B = mo5201B(motionEvent.getX(), motionEvent.getY());
                m5685V(B);
                if (B != Integer.MIN_VALUE) {
                    z = true;
                }
            } else if (action != 10 || this.f4790p == Integer.MIN_VALUE) {
                return false;
            } else {
                m5685V(Integer.MIN_VALUE);
                return true;
            }
        }
        return z;
    }

    /* renamed from: w */
    public final boolean mo5216w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F = m5680F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m5681G(F, null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m5687p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m5681G(2, null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m5681G(1, null);
            }
            return false;
        }
    }

    /* renamed from: x */
    public final int mo5217x() {
        return this.f4788n;
    }
}
