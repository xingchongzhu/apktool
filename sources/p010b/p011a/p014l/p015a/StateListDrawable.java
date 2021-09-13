package p010b.p011a.p014l.p015a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

@SuppressLint({"RestrictedAPI"})
/* renamed from: b.a.l.a.d */
class StateListDrawable extends DrawableContainer {

    /* renamed from: m */
    private C0524a f3755m;

    /* renamed from: n */
    private boolean f3756n;

    /* renamed from: b.a.l.a.d$a */
    /* compiled from: StateListDrawable */
    static class C0524a extends C0523d {

        /* renamed from: J */
        int[][] f3757J;

        C0524a(C0524a aVar, StateListDrawable dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f3757J = aVar.f3757J;
            } else {
                this.f3757J = new int[mo4141f()][];
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: A */
        public int mo4190A(int[] iArr) {
            int[][] iArr2 = this.f3757J;
            int h = mo4144h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new StateListDrawable(this, null);
        }

        /* renamed from: o */
        public void mo4151o(int i, int i2) {
            super.mo4151o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f3757J, 0, iArr, 0, i);
            this.f3757J = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public void mo4117r() {
            int[][] iArr = this.f3757J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f3757J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f3757J = iArr2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: z */
        public int mo4191z(int[] iArr, Drawable drawable) {
            int a = mo4136a(drawable);
            this.f3757J[a] = iArr;
            return a;
        }

        public Drawable newDrawable(Resources resources) {
            return new StateListDrawable(this, resources);
        }
    }

    StateListDrawable(C0524a aVar, Resources resources) {
        mo4086h(new C0524a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4086h(C0523d dVar) {
        super.mo4086h(dVar);
        if (dVar instanceof C0524a) {
            this.f3755m = (C0524a) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public C0524a mo4072b() {
        return new C0524a(this.f3755m, this, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public int[] mo4189k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.f3756n && super.mutate() == this) {
            this.f3755m.mo4117r();
            this.f3756n = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f3755m.mo4190A(iArr);
        if (A < 0) {
            A = this.f3755m.mo4190A(StateSet.WILD_CARD);
        }
        return mo4125g(A) || onStateChange;
    }

    StateListDrawable(C0524a aVar) {
        if (aVar != null) {
            mo4086h(aVar);
        }
    }
}
