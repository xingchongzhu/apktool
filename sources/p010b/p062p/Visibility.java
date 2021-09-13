package p010b.p062p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p010b.p062p.Transition.C0727f;

/* renamed from: b.p.j0 */
public abstract class Visibility extends Transition {

    /* renamed from: M */
    private static final String[] f5037M = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: N */
    private int f5038N = 3;

    /* renamed from: b.p.j0$a */
    /* compiled from: Visibility */
    class C0719a extends TransitionListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5039a;

        /* renamed from: b */
        final /* synthetic */ View f5040b;

        /* renamed from: c */
        final /* synthetic */ View f5041c;

        C0719a(ViewGroup viewGroup, View view, View view2) {
            this.f5039a = viewGroup;
            this.f5040b = view;
            this.f5041c = view2;
        }

        /* renamed from: c */
        public void mo5336c(Transition mVar) {
            C0732x.m6121a(this.f5039a).mo5443c(this.f5040b);
        }

        /* renamed from: d */
        public void mo5337d(Transition mVar) {
            if (this.f5040b.getParent() == null) {
                C0732x.m6121a(this.f5039a).mo5442a(this.f5040b);
            } else {
                Visibility.this.cancel();
            }
        }

        /* renamed from: e */
        public void mo5338e(Transition mVar) {
            this.f5041c.setTag(C0718j.save_overlay_view, null);
            C0732x.m6121a(this.f5039a).mo5443c(this.f5040b);
            mVar.mo5388O(this);
        }
    }

    /* renamed from: b.p.j0$b */
    /* compiled from: Visibility */
    private static class C0720b extends AnimatorListenerAdapter implements C0727f, C0697a {

        /* renamed from: a */
        private final View f5043a;

        /* renamed from: b */
        private final int f5044b;

        /* renamed from: c */
        private final ViewGroup f5045c;

        /* renamed from: d */
        private final boolean f5046d;

        /* renamed from: e */
        private boolean f5047e;

        /* renamed from: f */
        boolean f5048f = false;

        C0720b(View view, int i, boolean z) {
            this.f5043a = view;
            this.f5044b = i;
            this.f5045c = (ViewGroup) view.getParent();
            this.f5046d = z;
            m5995g(true);
        }

        /* renamed from: f */
        private void m5994f() {
            if (!this.f5048f) {
                C0709c0.m5914h(this.f5043a, this.f5044b);
                ViewGroup viewGroup = this.f5045c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m5995g(false);
        }

        /* renamed from: g */
        private void m5995g(boolean z) {
            if (this.f5046d && this.f5047e != z) {
                ViewGroup viewGroup = this.f5045c;
                if (viewGroup != null) {
                    this.f5047e = z;
                    C0732x.m6123c(viewGroup, z);
                }
            }
        }

        /* renamed from: a */
        public void mo5357a(Transition mVar) {
        }

        /* renamed from: b */
        public void mo5335b(Transition mVar) {
        }

        /* renamed from: c */
        public void mo5336c(Transition mVar) {
            m5995g(false);
        }

        /* renamed from: d */
        public void mo5337d(Transition mVar) {
            m5995g(true);
        }

        /* renamed from: e */
        public void mo5338e(Transition mVar) {
            m5994f();
            mVar.mo5388O(this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f5048f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m5994f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f5048f) {
                C0709c0.m5914h(this.f5043a, this.f5044b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f5048f) {
                C0709c0.m5914h(this.f5043a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: b.p.j0$c */
    /* compiled from: Visibility */
    private static class C0721c {

        /* renamed from: a */
        boolean f5049a;

        /* renamed from: b */
        boolean f5050b;

        /* renamed from: c */
        int f5051c;

        /* renamed from: d */
        int f5052d;

        /* renamed from: e */
        ViewGroup f5053e;

        /* renamed from: f */
        ViewGroup f5054f;

        C0721c() {
        }
    }

    /* renamed from: f0 */
    private void m5979f0(TransitionValues sVar) {
        String str = "android:visibility:visibility";
        sVar.f5122a.put(str, Integer.valueOf(sVar.f5123b.getVisibility()));
        sVar.f5122a.put("android:visibility:parent", sVar.f5123b.getParent());
        int[] iArr = new int[2];
        sVar.f5123b.getLocationOnScreen(iArr);
        sVar.f5122a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: g0 */
    private C0721c m5980g0(TransitionValues sVar, TransitionValues sVar2) {
        C0721c cVar = new C0721c();
        cVar.f5049a = false;
        cVar.f5050b = false;
        String str = "android:visibility:parent";
        String str2 = "android:visibility:visibility";
        if (sVar == null || !sVar.f5122a.containsKey(str2)) {
            cVar.f5051c = -1;
            cVar.f5053e = null;
        } else {
            cVar.f5051c = ((Integer) sVar.f5122a.get(str2)).intValue();
            cVar.f5053e = (ViewGroup) sVar.f5122a.get(str);
        }
        if (sVar2 == null || !sVar2.f5122a.containsKey(str2)) {
            cVar.f5052d = -1;
            cVar.f5054f = null;
        } else {
            cVar.f5052d = ((Integer) sVar2.f5122a.get(str2)).intValue();
            cVar.f5054f = (ViewGroup) sVar2.f5122a.get(str);
        }
        if (sVar != null && sVar2 != null) {
            int i = cVar.f5051c;
            int i2 = cVar.f5052d;
            if (i == i2 && cVar.f5053e == cVar.f5054f) {
                return cVar;
            }
            if (i != i2) {
                if (i == 0) {
                    cVar.f5050b = false;
                    cVar.f5049a = true;
                } else if (i2 == 0) {
                    cVar.f5050b = true;
                    cVar.f5049a = true;
                }
            } else if (cVar.f5054f == null) {
                cVar.f5050b = false;
                cVar.f5049a = true;
            } else if (cVar.f5053e == null) {
                cVar.f5050b = true;
                cVar.f5049a = true;
            }
        } else if (sVar == null && cVar.f5052d == 0) {
            cVar.f5050b = true;
            cVar.f5049a = true;
        } else if (sVar2 == null && cVar.f5051c == 0) {
            cVar.f5050b = false;
            cVar.f5049a = true;
        }
        return cVar;
    }

    /* renamed from: C */
    public String[] mo5304C() {
        return f5037M;
    }

    /* renamed from: E */
    public boolean mo5367E(TransitionValues sVar, TransitionValues sVar2) {
        boolean z = false;
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (!(sVar == null || sVar2 == null)) {
            String str = "android:visibility:visibility";
            if (sVar2.f5122a.containsKey(str) != sVar.f5122a.containsKey(str)) {
                return false;
            }
        }
        C0721c g0 = m5980g0(sVar, sVar2);
        if (g0.f5049a && (g0.f5051c == 0 || g0.f5052d == 0)) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public void mo5305f(TransitionValues sVar) {
        m5979f0(sVar);
    }

    /* renamed from: h0 */
    public abstract Animator mo5349h0(ViewGroup viewGroup, View view, TransitionValues sVar, TransitionValues sVar2);

    /* renamed from: i */
    public void mo5306i(TransitionValues sVar) {
        m5979f0(sVar);
    }

    /* renamed from: i0 */
    public Animator mo5368i0(ViewGroup viewGroup, TransitionValues sVar, int i, TransitionValues sVar2, int i2) {
        if ((this.f5038N & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f5123b.getParent();
            if (m5980g0(mo5414s(view, false), mo5384D(view, false)).f5049a) {
                return null;
            }
        }
        return mo5349h0(viewGroup, sVar2.f5123b, sVar, sVar2);
    }

    /* renamed from: j0 */
    public abstract Animator mo5350j0(ViewGroup viewGroup, View view, TransitionValues sVar, TransitionValues sVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f5095z != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo5369k0(android.view.ViewGroup r18, p010b.p062p.TransitionValues r19, int r20, p010b.p062p.TransitionValues r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.f5038N
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f5123b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f5123b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = p010b.p062p.C0718j.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = 1
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = 0
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = 0
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = 1
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            b.p.s r14 = r0.mo5384D(r13, r12)
            b.p.s r15 = r0.mo5414s(r13, r12)
            b.p.j0$c r14 = r0.m5980g0(r14, r15)
            boolean r14 = r14.f5049a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = p010b.p062p.TransitionUtils.m6109a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f5095z
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = 0
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = 0
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f5122a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            b.p.w r4 = p010b.p062p.C0732x.m6121a(r18)
            r4.mo5442a(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.mo5350j0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            b.p.w r1 = p010b.p062p.C0732x.m6121a(r18)
            r1.mo5443c(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            b.p.j0$a r3 = new b.p.j0$a
            r3.<init>(r1, r10, r5)
            r0.mo5395a(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            p010b.p062p.C0709c0.m5914h(r8, r11)
            android.animation.Animator r1 = r0.mo5350j0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            b.p.j0$b r2 = new b.p.j0$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            p010b.p062p.AnimatorUtils.m5874a(r1, r2)
            r0.mo5395a(r2)
            goto L_0x0106
        L_0x0103:
            p010b.p062p.C0709c0.m5914h(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p062p.Visibility.mo5369k0(android.view.ViewGroup, b.p.s, int, b.p.s, int):android.animation.Animator");
    }

    /* renamed from: l0 */
    public void mo5370l0(int i) {
        if ((i & -4) == 0) {
            this.f5038N = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: m */
    public Animator mo5307m(ViewGroup viewGroup, TransitionValues sVar, TransitionValues sVar2) {
        C0721c g0 = m5980g0(sVar, sVar2);
        if (!g0.f5049a || (g0.f5053e == null && g0.f5054f == null)) {
            return null;
        }
        if (g0.f5050b) {
            return mo5368i0(viewGroup, sVar, g0.f5051c, sVar2, g0.f5052d);
        }
        return mo5369k0(viewGroup, sVar, g0.f5051c, sVar2, g0.f5052d);
    }
}
