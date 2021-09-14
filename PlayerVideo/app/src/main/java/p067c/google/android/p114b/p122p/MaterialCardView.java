package p067c.google.android.p114b.p122p;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p023c.p024a.CardView;
import p067c.google.android.p114b.C1270b;
import p067c.google.android.p114b.C1296k;
import p067c.google.android.p114b.p117c0.ShapeAppearanceModel;
import p067c.google.android.p114b.p117c0.Shapeable;

/* renamed from: c.a.a.b.p.a */
public class MaterialCardView extends CardView implements Checkable, Shapeable {

    /* renamed from: i */
    private static final int[] f9668i = {16842911};

    /* renamed from: j */
    private static final int[] f9669j = {16842912};

    /* renamed from: k */
    private static final int[] f9670k = {C1270b.state_dragged};

    /* renamed from: l */
    private static final int f9671l = C1296k.Widget_MaterialComponents_CardView;

    /* renamed from: m */
    private final MaterialCardViewHelper f9672m;

    /* renamed from: n */
    private boolean f9673n;

    /* renamed from: o */
    private boolean f9674o;

    /* renamed from: p */
    private boolean f9675p;

    /* renamed from: q */
    private C1301a f9676q;

    /* renamed from: c.a.a.b.p.a$a */
    /* compiled from: MaterialCardView */
    public interface C1301a {
        /* renamed from: a */
        void mo8048a(MaterialCardView aVar, boolean z);
    }

    /* renamed from: d */
    private void m11555d() {
        if (VERSION.SDK_INT > 26) {
            throw null;
        }
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    /* renamed from: e */
    public boolean mo8006e() {
        if (this.f9672m == null) {
            return false;
        }
        throw null;
    }

    /* renamed from: f */
    public boolean mo8007f() {
        return this.f9675p;
    }

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    /* access modifiers changed from: 0000 */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    public boolean isChecked() {
        return this.f9674o;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo8006e()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f9668i);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f9669j);
        }
        if (mo8007f()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f9670k);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(mo8006e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f9673n) {
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z) {
        throw null;
    }

    public void setChecked(boolean z) {
        if (this.f9674o != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconMargin(int i) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            getResources().getDimensionPixelSize(i);
            throw null;
        }
    }

    public void setCheckedIconResource(int i) {
        AppCompatResources.m4143d(getContext(), i);
        throw null;
    }

    public void setCheckedIconSize(int i) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            getResources().getDimensionPixelSize(i);
            throw null;
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        if (this.f9672m != null) {
            throw null;
        }
    }

    public void setDragged(boolean z) {
        if (this.f9675p != z) {
            this.f9675p = z;
            refreshDrawableState();
            m11555d();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        throw null;
    }

    public void setOnCheckedChangeListener(C1301a aVar) {
        this.f9676q = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        throw null;
    }

    public void setProgress(float f) {
        throw null;
    }

    public void setRadius(float f) {
        super.setRadius(f);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i) {
        AppCompatResources.m4142c(getContext(), i);
        throw null;
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel kVar) {
        if (VERSION.SDK_INT >= 21) {
            setClipToOutline(kVar.mo7894u(getBoundsAsRectF()));
        }
        throw null;
    }

    public void setStrokeColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setStrokeWidth(int i) {
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        throw null;
    }

    public void toggle() {
        if (mo8006e() && isEnabled()) {
            this.f9674o = !this.f9674o;
            refreshDrawableState();
            m11555d();
            C1301a aVar = this.f9676q;
            if (aVar != null) {
                aVar.mo8048a(this, this.f9674o);
            }
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }
}
