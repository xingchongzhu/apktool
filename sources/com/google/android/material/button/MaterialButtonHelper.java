package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.internal.C2053k;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p115a0.RippleDrawableCompat;
import p067c.p068a.p069a.p114b.p115a0.RippleUtils;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel;
import p067c.p068a.p069a.p114b.p117c0.Shapeable;
import p067c.p068a.p069a.p114b.p126s.MaterialColors;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;

/* renamed from: com.google.android.material.button.a */
class MaterialButtonHelper {

    /* renamed from: a */
    private static final boolean f12707a = (VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private final MaterialButton f12708b;

    /* renamed from: c */
    private ShapeAppearanceModel f12709c;

    /* renamed from: d */
    private int f12710d;

    /* renamed from: e */
    private int f12711e;

    /* renamed from: f */
    private int f12712f;

    /* renamed from: g */
    private int f12713g;

    /* renamed from: h */
    private int f12714h;

    /* renamed from: i */
    private int f12715i;

    /* renamed from: j */
    private Mode f12716j;

    /* renamed from: k */
    private ColorStateList f12717k;

    /* renamed from: l */
    private ColorStateList f12718l;

    /* renamed from: m */
    private ColorStateList f12719m;

    /* renamed from: n */
    private Drawable f12720n;

    /* renamed from: o */
    private boolean f12721o = false;

    /* renamed from: p */
    private boolean f12722p = false;

    /* renamed from: q */
    private boolean f12723q = false;

    /* renamed from: r */
    private boolean f12724r;

    /* renamed from: s */
    private LayerDrawable f12725s;

    /* renamed from: t */
    private int f12726t;

    MaterialButtonHelper(MaterialButton materialButton, ShapeAppearanceModel kVar) {
        this.f12708b = materialButton;
        this.f12709c = kVar;
    }

    /* renamed from: E */
    private void m15540E(int i, int i2) {
        int I = ViewCompat.m5526I(this.f12708b);
        int paddingTop = this.f12708b.getPaddingTop();
        int H = ViewCompat.m5524H(this.f12708b);
        int paddingBottom = this.f12708b.getPaddingBottom();
        int i3 = this.f12712f;
        int i4 = this.f12713g;
        this.f12713g = i2;
        this.f12712f = i;
        if (!this.f12722p) {
            m15541F();
        }
        ViewCompat.m5511A0(this.f12708b, I, (paddingTop + i) - i3, H, (paddingBottom + i2) - i4);
    }

    /* renamed from: F */
    private void m15541F() {
        this.f12708b.setInternalBackground(m15545a());
        MaterialShapeDrawable f = mo15267f();
        if (f != null) {
            f.mo7842W((float) this.f12726t);
        }
    }

    /* renamed from: G */
    private void m15542G(ShapeAppearanceModel kVar) {
        if (mo15267f() != null) {
            mo15267f().setShapeAppearanceModel(kVar);
        }
        if (m15547n() != null) {
            m15547n().setShapeAppearanceModel(kVar);
        }
        if (mo15266e() != null) {
            mo15266e().setShapeAppearanceModel(kVar);
        }
    }

    /* renamed from: I */
    private void m15543I() {
        MaterialShapeDrawable f = mo15267f();
        MaterialShapeDrawable n = m15547n();
        if (f != null) {
            f.mo7849d0((float) this.f12715i, this.f12718l);
            if (n != null) {
                n.mo7848c0((float) this.f12715i, this.f12721o ? MaterialColors.m11575c(this.f12708b, C1270b.colorSurface) : 0);
            }
        }
    }

    /* renamed from: J */
    private InsetDrawable m15544J(Drawable drawable) {
        InsetDrawable insetDrawable = new InsetDrawable(drawable, this.f12710d, this.f12712f, this.f12711e, this.f12713g);
        return insetDrawable;
    }

    /* renamed from: a */
    private Drawable m15545a() {
        MaterialShapeDrawable gVar = new MaterialShapeDrawable(this.f12709c);
        gVar.mo7836M(this.f12708b.getContext());
        DrawableCompat.m1856o(gVar, this.f12717k);
        Mode mode = this.f12716j;
        if (mode != null) {
            DrawableCompat.m1857p(gVar, mode);
        }
        gVar.mo7849d0((float) this.f12715i, this.f12718l);
        MaterialShapeDrawable gVar2 = new MaterialShapeDrawable(this.f12709c);
        gVar2.setTint(0);
        gVar2.mo7848c0((float) this.f12715i, this.f12721o ? MaterialColors.m11575c(this.f12708b, C1270b.colorSurface) : 0);
        if (f12707a) {
            MaterialShapeDrawable gVar3 = new MaterialShapeDrawable(this.f12709c);
            this.f12720n = gVar3;
            DrawableCompat.m1855n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.m11253d(this.f12719m), m15544J(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f12720n);
            this.f12725s = rippleDrawable;
            return rippleDrawable;
        }
        RippleDrawableCompat aVar = new RippleDrawableCompat(this.f12709c);
        this.f12720n = aVar;
        DrawableCompat.m1856o(aVar, RippleUtils.m11253d(this.f12719m));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f12720n});
        this.f12725s = layerDrawable;
        return m15544J(layerDrawable);
    }

    /* renamed from: g */
    private MaterialShapeDrawable m15546g(boolean z) {
        LayerDrawable layerDrawable = this.f12725s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f12707a) {
            return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f12725s.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (MaterialShapeDrawable) this.f12725s.getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: n */
    private MaterialShapeDrawable m15547n() {
        return m15546g(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public void mo15258A(ColorStateList colorStateList) {
        if (this.f12718l != colorStateList) {
            this.f12718l = colorStateList;
            m15543I();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo15259B(int i) {
        if (this.f12715i != i) {
            this.f12715i = i;
            m15543I();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public void mo15260C(ColorStateList colorStateList) {
        if (this.f12717k != colorStateList) {
            this.f12717k = colorStateList;
            if (mo15267f() != null) {
                DrawableCompat.m1856o(mo15267f(), this.f12717k);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public void mo15261D(Mode mode) {
        if (this.f12716j != mode) {
            this.f12716j = mode;
            if (mo15267f() != null && this.f12716j != null) {
                DrawableCompat.m1857p(mo15267f(), this.f12716j);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public void mo15262H(int i, int i2) {
        Drawable drawable = this.f12720n;
        if (drawable != null) {
            drawable.setBounds(this.f12710d, this.f12712f, i2 - this.f12711e, i - this.f12713g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo15263b() {
        return this.f12714h;
    }

    /* renamed from: c */
    public int mo15264c() {
        return this.f12713g;
    }

    /* renamed from: d */
    public int mo15265d() {
        return this.f12712f;
    }

    /* renamed from: e */
    public Shapeable mo15266e() {
        LayerDrawable layerDrawable = this.f12725s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f12725s.getNumberOfLayers() > 2) {
            return (Shapeable) this.f12725s.getDrawable(2);
        }
        return (Shapeable) this.f12725s.getDrawable(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public MaterialShapeDrawable mo15267f() {
        return m15546g(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public ColorStateList mo15268h() {
        return this.f12719m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public ShapeAppearanceModel mo15269i() {
        return this.f12709c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public ColorStateList mo15270j() {
        return this.f12718l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public int mo15271k() {
        return this.f12715i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public ColorStateList mo15272l() {
        return this.f12717k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public Mode mo15273m() {
        return this.f12716j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo15274o() {
        return this.f12722p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo15275p() {
        return this.f12724r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo15276q(TypedArray typedArray) {
        this.f12710d = typedArray.getDimensionPixelOffset(C1297l.f9377W1, 0);
        this.f12711e = typedArray.getDimensionPixelOffset(C1297l.f9384X1, 0);
        this.f12712f = typedArray.getDimensionPixelOffset(C1297l.f9391Y1, 0);
        this.f12713g = typedArray.getDimensionPixelOffset(C1297l.f9398Z1, 0);
        int i = C1297l.f9430d2;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f12714h = dimensionPixelSize;
            mo15284y(this.f12709c.mo7896w((float) dimensionPixelSize));
            this.f12723q = true;
        }
        this.f12715i = typedArray.getDimensionPixelSize(C1297l.f9510n2, 0);
        this.f12716j = C2053k.m16234e(typedArray.getInt(C1297l.f9422c2, -1), Mode.SRC_IN);
        this.f12717k = MaterialResources.m11600a(this.f12708b.getContext(), typedArray, C1297l.f9414b2);
        this.f12718l = MaterialResources.m11600a(this.f12708b.getContext(), typedArray, C1297l.f9502m2);
        this.f12719m = MaterialResources.m11600a(this.f12708b.getContext(), typedArray, C1297l.f9494l2);
        this.f12724r = typedArray.getBoolean(C1297l.f9406a2, false);
        this.f12726t = typedArray.getDimensionPixelSize(C1297l.f9438e2, 0);
        int I = ViewCompat.m5526I(this.f12708b);
        int paddingTop = this.f12708b.getPaddingTop();
        int H = ViewCompat.m5524H(this.f12708b);
        int paddingBottom = this.f12708b.getPaddingBottom();
        if (typedArray.hasValue(C1297l.f9370V1)) {
            mo15278s();
        } else {
            m15541F();
        }
        ViewCompat.m5511A0(this.f12708b, I + this.f12710d, paddingTop + this.f12712f, H + this.f12711e, paddingBottom + this.f12713g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo15277r(int i) {
        if (mo15267f() != null) {
            mo15267f().setTint(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo15278s() {
        this.f12722p = true;
        this.f12708b.setSupportBackgroundTintList(this.f12717k);
        this.f12708b.setSupportBackgroundTintMode(this.f12716j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo15279t(boolean z) {
        this.f12724r = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo15280u(int i) {
        if (!this.f12723q || this.f12714h != i) {
            this.f12714h = i;
            this.f12723q = true;
            mo15284y(this.f12709c.mo7896w((float) i));
        }
    }

    /* renamed from: v */
    public void mo15281v(int i) {
        m15540E(this.f12712f, i);
    }

    /* renamed from: w */
    public void mo15282w(int i) {
        m15540E(i, this.f12713g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo15283x(ColorStateList colorStateList) {
        if (this.f12719m != colorStateList) {
            this.f12719m = colorStateList;
            boolean z = f12707a;
            if (z && (this.f12708b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f12708b.getBackground()).setColor(RippleUtils.m11253d(colorStateList));
            } else if (!z && (this.f12708b.getBackground() instanceof RippleDrawableCompat)) {
                ((RippleDrawableCompat) this.f12708b.getBackground()).setTintList(RippleUtils.m11253d(colorStateList));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public void mo15284y(ShapeAppearanceModel kVar) {
        this.f12709c = kVar;
        m15542G(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public void mo15285z(boolean z) {
        this.f12721o = z;
        m15543I();
    }
}
