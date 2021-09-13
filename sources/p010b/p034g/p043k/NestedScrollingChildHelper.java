package p010b.p034g.p043k;

import android.view.View;
import android.view.ViewParent;

/* renamed from: b.g.k.l */
public class NestedScrollingChildHelper {

    /* renamed from: a */
    private ViewParent f4725a;

    /* renamed from: b */
    private ViewParent f4726b;

    /* renamed from: c */
    private final View f4727c;

    /* renamed from: d */
    private boolean f4728d;

    /* renamed from: e */
    private int[] f4729e;

    public NestedScrollingChildHelper(View view) {
        this.f4727c = view;
    }

    /* renamed from: g */
    private boolean m5475g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (mo5136l()) {
            ViewParent h = m5476h(i5);
            if (h == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr4 != null) {
                    this.f4727c.getLocationInWindow(iArr4);
                    i7 = iArr4[0];
                    i6 = iArr4[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                if (iArr2 == null) {
                    int[] i8 = m5477i();
                    i8[0] = 0;
                    i8[1] = 0;
                    iArr3 = i8;
                } else {
                    iArr3 = iArr2;
                }
                ViewParentCompat.m5654d(h, this.f4727c, i, i2, i3, i4, i5, iArr3);
                if (iArr4 != null) {
                    this.f4727c.getLocationInWindow(iArr4);
                    iArr4[0] = iArr4[0] - i7;
                    iArr4[1] = iArr4[1] - i6;
                }
                return true;
            } else if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: h */
    private ViewParent m5476h(int i) {
        if (i == 0) {
            return this.f4725a;
        }
        if (i != 1) {
            return null;
        }
        return this.f4726b;
    }

    /* renamed from: i */
    private int[] m5477i() {
        if (this.f4729e == null) {
            this.f4729e = new int[2];
        }
        return this.f4729e;
    }

    /* renamed from: n */
    private void m5478n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f4725a = viewParent;
        } else if (i == 1) {
            this.f4726b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean mo5128a(float f, float f2, boolean z) {
        if (mo5136l()) {
            ViewParent h = m5476h(0);
            if (h != null) {
                return ViewParentCompat.m5651a(h, this.f4727c, f, f2, z);
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo5129b(float f, float f2) {
        if (mo5136l()) {
            ViewParent h = m5476h(0);
            if (h != null) {
                return ViewParentCompat.m5652b(h, this.f4727c, f, f2);
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo5130c(int i, int i2, int[] iArr, int[] iArr2) {
        return mo5131d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean mo5131d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        boolean z = false;
        if (mo5136l()) {
            ViewParent h = m5476h(i3);
            if (h == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.f4727c.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    iArr = m5477i();
                }
                iArr[0] = 0;
                iArr[1] = 0;
                ViewParentCompat.m5653c(h, this.f4727c, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.f4727c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                if (!(iArr[0] == 0 && iArr[1] == 0)) {
                    z = true;
                }
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return z;
    }

    /* renamed from: e */
    public void mo5132e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m5475g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean mo5133f(int i, int i2, int i3, int i4, int[] iArr) {
        return m5475g(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: j */
    public boolean mo5134j() {
        return mo5135k(0);
    }

    /* renamed from: k */
    public boolean mo5135k(int i) {
        return m5476h(i) != null;
    }

    /* renamed from: l */
    public boolean mo5136l() {
        return this.f4728d;
    }

    /* renamed from: m */
    public void mo5137m(boolean z) {
        if (this.f4728d) {
            ViewCompat.m5523G0(this.f4727c);
        }
        this.f4728d = z;
    }

    /* renamed from: o */
    public boolean mo5138o(int i) {
        return mo5139p(i, 0);
    }

    /* renamed from: p */
    public boolean mo5139p(int i, int i2) {
        if (mo5135k(i2)) {
            return true;
        }
        if (mo5136l()) {
            View view = this.f4727c;
            for (ViewParent parent = this.f4727c.getParent(); parent != null; parent = parent.getParent()) {
                if (ViewParentCompat.m5656f(parent, view, this.f4727c, i, i2)) {
                    m5478n(i2, parent);
                    ViewParentCompat.m5655e(parent, view, this.f4727c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public void mo5140q() {
        mo5141r(0);
    }

    /* renamed from: r */
    public void mo5141r(int i) {
        ViewParent h = m5476h(i);
        if (h != null) {
            ViewParentCompat.m5657g(h, this.f4727c, i);
            m5478n(i, null);
        }
    }
}
