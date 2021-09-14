package p067c.google.android.p114b.p115a0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

import androidx.core.graphics.drawable.TintAwareDrawable;
import p067c.google.android.p114b.p117c0.MaterialShapeDrawable;
import p067c.google.android.p114b.p117c0.ShapeAppearanceModel;
import p067c.google.android.p114b.p117c0.Shapeable;

/* renamed from: c.a.a.b.a0.a */
public class RippleDrawableCompat extends Drawable implements Shapeable, TintAwareDrawable {

    /* renamed from: a */
    private C1269b f9050a;

    /* renamed from: c.a.a.b.a0.a$b */
    /* compiled from: RippleDrawableCompat */
    static final class C1269b extends ConstantState {

        /* renamed from: a */
        MaterialShapeDrawable f9051a;

        /* renamed from: b */
        boolean f9052b;

        public C1269b(MaterialShapeDrawable gVar) {
            this.f9051a = gVar;
            this.f9052b = false;
        }

        /* renamed from: a */
        public RippleDrawableCompat newDrawable() {
            return new RippleDrawableCompat(new C1269b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public C1269b(C1269b bVar) {
            this.f9051a = (MaterialShapeDrawable) bVar.f9051a.getConstantState().newDrawable();
            this.f9052b = bVar.f9052b;
        }
    }

    /* renamed from: a */
    public RippleDrawableCompat mutate() {
        this.f9050a = new C1269b(this.f9050a);
        return this;
    }

    public void draw(Canvas canvas) {
        C1269b bVar = this.f9050a;
        if (bVar.f9052b) {
            bVar.f9051a.draw(canvas);
        }
    }

    public ConstantState getConstantState() {
        return this.f9050a;
    }

    public int getOpacity() {
        return this.f9050a.f9051a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9050a.f9051a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f9050a.f9051a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e = RippleUtils.m11254e(iArr);
        C1269b bVar = this.f9050a;
        if (bVar.f9052b == e) {
            return onStateChange;
        }
        bVar.f9052b = e;
        return true;
    }

    public void setAlpha(int i) {
        this.f9050a.f9051a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9050a.f9051a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel kVar) {
        this.f9050a.f9051a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i) {
        this.f9050a.f9051a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f9050a.f9051a.setTintList(colorStateList);
    }

    public void setTintMode(Mode mode) {
        this.f9050a.f9051a.setTintMode(mode);
    }

    public RippleDrawableCompat(ShapeAppearanceModel kVar) {
        this(new C1269b(new MaterialShapeDrawable(kVar)));
    }

    private RippleDrawableCompat(C1269b bVar) {
        this.f9050a = bVar;
    }
}
