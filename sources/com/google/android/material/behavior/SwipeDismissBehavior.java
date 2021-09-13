package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0229c;
import com.p259uc.crashsdk.export.LogType;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0634a;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand.C0640a;
import p010b.p048i.p050b.ViewDragHelper;
import p010b.p048i.p050b.ViewDragHelper.C0681c;

public class SwipeDismissBehavior<V extends View> extends C0229c<V> {

    /* renamed from: a */
    ViewDragHelper f12534a;

    /* renamed from: b */
    C1947c f12535b;

    /* renamed from: c */
    private boolean f12536c;

    /* renamed from: d */
    private float f12537d = 0.0f;

    /* renamed from: e */
    private boolean f12538e;

    /* renamed from: f */
    int f12539f = 2;

    /* renamed from: g */
    float f12540g = 0.5f;

    /* renamed from: h */
    float f12541h = 0.0f;

    /* renamed from: i */
    float f12542i = 0.5f;

    /* renamed from: j */
    private final C0681c f12543j = new C1945a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C1945a extends C0681c {

        /* renamed from: a */
        private int f12544a;

        /* renamed from: b */
        private int f12545b = -1;

        C1945a() {
        }

        /* renamed from: n */
        private boolean m15330n(View view, float f) {
            boolean z = false;
            if (f != 0.0f) {
                boolean z2 = ViewCompat.m5514C(view) == 1;
                int i = SwipeDismissBehavior.this.f12539f;
                if (i == 2) {
                    return true;
                }
                if (i == 0) {
                    return z2 ? z : z;
                    z = true;
                }
                if (i == 1) {
                    if (z2) {
                    }
                    z = true;
                }
                return z;
            }
            if (Math.abs(view.getLeft() - this.f12544a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f12540g)) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        public int mo5241a(View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            boolean z = ViewCompat.m5514C(view) == 1;
            int i5 = SwipeDismissBehavior.this.f12539f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f12544a - view.getWidth();
                    i4 = view.getWidth() + this.f12544a;
                } else if (z) {
                    i3 = this.f12544a;
                    width = view.getWidth();
                } else {
                    i3 = this.f12544a - view.getWidth();
                    i4 = this.f12544a;
                }
                return SwipeDismissBehavior.m15319G(i3, i, i4);
            } else if (z) {
                i3 = this.f12544a - view.getWidth();
                i4 = this.f12544a;
                return SwipeDismissBehavior.m15319G(i3, i, i4);
            } else {
                i3 = this.f12544a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.m15319G(i3, i, i4);
        }

        /* renamed from: b */
        public int mo5242b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo5244d(View view) {
            return view.getWidth();
        }

        /* renamed from: i */
        public void mo5249i(View view, int i) {
            this.f12545b = i;
            this.f12544a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: j */
        public void mo5250j(int i) {
            C1947c cVar = SwipeDismissBehavior.this.f12535b;
            if (cVar != null) {
                cVar.mo15081b(i);
            }
        }

        /* renamed from: k */
        public void mo5251k(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f12544a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f12541h);
            float width2 = ((float) this.f12544a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f12542i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m15318F(0.0f, 1.0f - SwipeDismissBehavior.m15321I(width, width2, f), 1.0f));
            }
        }

        /* renamed from: l */
        public void mo5252l(View view, float f, float f2) {
            boolean z;
            int i;
            this.f12545b = -1;
            int width = view.getWidth();
            if (m15330n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f12544a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f12544a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f12534a.mo5226F(i, view.getTop())) {
                ViewCompat.m5557g0(view, new C1948d(view, z));
            } else if (z) {
                C1947c cVar = SwipeDismissBehavior.this.f12535b;
                if (cVar != null) {
                    cVar.mo15080a(view);
                }
            }
        }

        /* renamed from: m */
        public boolean mo5253m(View view, int i) {
            int i2 = this.f12545b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo15076E(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    class C1946b implements AccessibilityViewCommand {
        C1946b() {
        }

        /* renamed from: a */
        public boolean mo5114a(View view, C0640a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.mo15076E(view)) {
                return false;
            }
            boolean z2 = ViewCompat.m5514C(view) == 1;
            int i = SwipeDismissBehavior.this.f12539f;
            if ((i == 0 && z2) || (i == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            ViewCompat.m5542Y(view, width);
            view.setAlpha(0.0f);
            C1947c cVar = SwipeDismissBehavior.this.f12535b;
            if (cVar != null) {
                cVar.mo15080a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface C1947c {
        /* renamed from: a */
        void mo15080a(View view);

        /* renamed from: b */
        void mo15081b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    private class C1948d implements Runnable {

        /* renamed from: a */
        private final View f12548a;

        /* renamed from: b */
        private final boolean f12549b;

        C1948d(View view, boolean z) {
            this.f12548a = view;
            this.f12549b = z;
        }

        public void run() {
            ViewDragHelper cVar = SwipeDismissBehavior.this.f12534a;
            if (cVar != null && cVar.mo5232k(true)) {
                ViewCompat.m5557g0(this.f12548a, this);
            } else if (this.f12549b) {
                C1947c cVar2 = SwipeDismissBehavior.this.f12535b;
                if (cVar2 != null) {
                    cVar2.mo15080a(this.f12548a);
                }
            }
        }
    }

    /* renamed from: F */
    static float m15318F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    static int m15319G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: H */
    private void m15320H(ViewGroup viewGroup) {
        ViewDragHelper cVar;
        if (this.f12534a == null) {
            if (this.f12538e) {
                cVar = ViewDragHelper.m5755l(viewGroup, this.f12537d, this.f12543j);
            } else {
                cVar = ViewDragHelper.m5756m(viewGroup, this.f12543j);
            }
            this.f12534a = cVar;
        }
    }

    /* renamed from: I */
    static float m15321I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: M */
    private void m15322M(View view) {
        ViewCompat.m5561i0(view, LogType.ANR);
        if (mo15076E(view)) {
            ViewCompat.m5565k0(view, C0634a.f4700u, null, new C1946b());
        }
    }

    /* renamed from: D */
    public boolean mo2058D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper cVar = this.f12534a;
        if (cVar == null) {
            return false;
        }
        cVar.mo5238z(motionEvent);
        return true;
    }

    /* renamed from: E */
    public boolean mo15076E(View view) {
        return true;
    }

    /* renamed from: J */
    public void mo15077J(float f) {
        this.f12542i = m15318F(0.0f, f, 1.0f);
    }

    /* renamed from: K */
    public void mo15078K(float f) {
        this.f12541h = m15318F(0.0f, f, 1.0f);
    }

    /* renamed from: L */
    public void mo15079L(int i) {
        this.f12539f = i;
    }

    /* renamed from: k */
    public boolean mo2069k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f12536c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo2003B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f12536c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f12536c = false;
        }
        if (!z) {
            return false;
        }
        m15320H(coordinatorLayout);
        return this.f12534a.mo5227G(motionEvent);
    }

    /* renamed from: l */
    public boolean mo2070l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean l = super.mo2070l(coordinatorLayout, v, i);
        if (ViewCompat.m5510A(v) == 0) {
            ViewCompat.m5591x0(v, 1);
            m15322M(v);
        }
        return l;
    }
}
