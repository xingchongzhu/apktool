package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.theme.p198a.MaterialThemeOverlay;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearancePathProvider;
import p067c.p068a.p069a.p114b.p117c0.Shapeable;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;

public class ShapeableImageView extends AppCompatImageView implements Shapeable {

    /* renamed from: c */
    private static final int f13063c = C1296k.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: d */
    private final ShapeAppearancePathProvider f13064d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final RectF f13065e;

    /* renamed from: f */
    private final RectF f13066f;

    /* renamed from: g */
    private final Paint f13067g;

    /* renamed from: h */
    private final Paint f13068h;

    /* renamed from: i */
    private final Path f13069i;

    /* renamed from: j */
    private ColorStateList f13070j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MaterialShapeDrawable f13071k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ShapeAppearanceModel f13072l;

    /* renamed from: m */
    private float f13073m;

    /* renamed from: n */
    private Path f13074n;

    /* renamed from: o */
    private int f13075o;

    /* renamed from: p */
    private int f13076p;

    /* renamed from: q */
    private int f13077q;

    /* renamed from: r */
    private int f13078r;

    /* renamed from: s */
    private int f13079s;

    /* renamed from: t */
    private int f13080t;

    /* renamed from: u */
    private boolean f13081u;

    @TargetApi(21)
    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    class C2042a extends ViewOutlineProvider {

        /* renamed from: a */
        private final Rect f13082a = new Rect();

        C2042a() {
        }

        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f13072l != null) {
                if (ShapeableImageView.this.f13071k == null) {
                    ShapeableImageView.this.f13071k = new MaterialShapeDrawable(ShapeableImageView.this.f13072l);
                }
                ShapeableImageView.this.f13065e.round(this.f13082a);
                ShapeableImageView.this.f13071k.setBounds(this.f13082a);
                ShapeableImageView.this.f13071k.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    /* renamed from: g */
    private void m16113g(Canvas canvas) {
        if (this.f13070j != null) {
            this.f13067g.setStrokeWidth(this.f13073m);
            int colorForState = this.f13070j.getColorForState(getDrawableState(), this.f13070j.getDefaultColor());
            if (this.f13073m > 0.0f && colorForState != 0) {
                this.f13067g.setColor(colorForState);
                canvas.drawPath(this.f13069i, this.f13067g);
            }
        }
    }

    /* renamed from: h */
    private boolean m16114h() {
        return (this.f13079s == Integer.MIN_VALUE && this.f13080t == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: i */
    private boolean m16115i() {
        return VERSION.SDK_INT >= 17 && getLayoutDirection() == 1;
    }

    /* renamed from: j */
    private void m16116j(int i, int i2) {
        this.f13065e.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        this.f13064d.mo7918d(this.f13072l, 1.0f, this.f13065e, this.f13069i);
        this.f13074n.rewind();
        this.f13074n.addPath(this.f13069i);
        this.f13066f.set(0.0f, 0.0f, (float) i, (float) i2);
        this.f13074n.addRect(this.f13066f, Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f13078r;
    }

    public final int getContentPaddingEnd() {
        int i = this.f13080t;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m16115i() ? this.f13075o : this.f13077q;
    }

    public int getContentPaddingLeft() {
        if (m16114h()) {
            if (m16115i()) {
                int i = this.f13080t;
                if (i != Integer.MIN_VALUE) {
                    return i;
                }
            }
            if (!m16115i()) {
                int i2 = this.f13079s;
                if (i2 != Integer.MIN_VALUE) {
                    return i2;
                }
            }
        }
        return this.f13075o;
    }

    public int getContentPaddingRight() {
        if (m16114h()) {
            if (m16115i()) {
                int i = this.f13079s;
                if (i != Integer.MIN_VALUE) {
                    return i;
                }
            }
            if (!m16115i()) {
                int i2 = this.f13080t;
                if (i2 != Integer.MIN_VALUE) {
                    return i2;
                }
            }
        }
        return this.f13077q;
    }

    public final int getContentPaddingStart() {
        int i = this.f13079s;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m16115i() ? this.f13077q : this.f13075o;
    }

    public int getContentPaddingTop() {
        return this.f13076p;
    }

    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f13072l;
    }

    public ColorStateList getStrokeColor() {
        return this.f13070j;
    }

    public float getStrokeWidth() {
        return this.f13073m;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f13074n, this.f13068h);
        m16113g(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f13081u) {
            int i3 = VERSION.SDK_INT;
            if (i3 <= 19 || isLayoutDirectionResolved()) {
                this.f13081u = true;
                if (i3 < 21 || (!isPaddingRelative() && !m16114h())) {
                    setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
                } else {
                    setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m16116j(i, i2);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + getContentPaddingTop(), i3 + getContentPaddingRight(), i4 + getContentPaddingBottom());
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + getContentPaddingTop(), i3 + getContentPaddingEnd(), i4 + getContentPaddingBottom());
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel kVar) {
        this.f13072l = kVar;
        MaterialShapeDrawable gVar = this.f13071k;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        m16116j(getWidth(), getHeight());
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f13070j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(AppCompatResources.m4142c(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f13073m != f) {
            this.f13073m = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        int i2 = f13063c;
        super(MaterialThemeOverlay.m16587c(context, attributeSet, i, i2), attributeSet, i);
        this.f13064d = ShapeAppearancePathProvider.m11407k();
        this.f13069i = new Path();
        this.f13081u = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f13068h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        this.f13065e = new RectF();
        this.f13066f = new RectF();
        this.f13074n = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1297l.f9337Q3, i, i2);
        this.f13070j = MaterialResources.m11600a(context2, obtainStyledAttributes, C1297l.f9393Y3);
        this.f13073m = (float) obtainStyledAttributes.getDimensionPixelSize(C1297l.f9400Z3, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9344R3, 0);
        this.f13075o = dimensionPixelSize;
        this.f13076p = dimensionPixelSize;
        this.f13077q = dimensionPixelSize;
        this.f13078r = dimensionPixelSize;
        this.f13075o = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9365U3, dimensionPixelSize);
        this.f13076p = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9386X3, dimensionPixelSize);
        this.f13077q = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9372V3, dimensionPixelSize);
        this.f13078r = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9351S3, dimensionPixelSize);
        this.f13079s = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9379W3, Integer.MIN_VALUE);
        this.f13080t = obtainStyledAttributes.getDimensionPixelSize(C1297l.f9358T3, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f13067g = paint2;
        paint2.setStyle(Style.STROKE);
        paint2.setAntiAlias(true);
        this.f13072l = ShapeAppearanceModel.m11345e(context2, attributeSet, i, i2).mo7905m();
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C2042a());
        }
    }
}
