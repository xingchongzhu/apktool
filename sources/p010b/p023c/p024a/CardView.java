package p010b.p023c.p024a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

/* renamed from: b.c.a.a */
public class CardView extends FrameLayout {

    /* renamed from: a */
    private static final int[] f3877a = {16842801};

    /* renamed from: b */
    private static final CardViewImpl f3878b;

    /* renamed from: c */
    private boolean f3879c;

    /* renamed from: d */
    private boolean f3880d;

    /* renamed from: e */
    int f3881e;

    /* renamed from: f */
    int f3882f;

    /* renamed from: g */
    final Rect f3883g;

    /* renamed from: h */
    private final CardViewDelegate f3884h;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f3878b = new CardViewApi21Impl();
        } else if (i >= 17) {
            f3878b = new CardViewApi17Impl();
        } else {
            f3878b = new CardViewBaseImpl();
        }
        f3878b.mo4321e();
    }

    public ColorStateList getCardBackgroundColor() {
        return f3878b.mo4324b(this.f3884h);
    }

    public float getCardElevation() {
        return f3878b.mo4326d(this.f3884h);
    }

    public int getContentPaddingBottom() {
        return this.f3883g.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f3883g.left;
    }

    public int getContentPaddingRight() {
        return this.f3883g.right;
    }

    public int getContentPaddingTop() {
        return this.f3883g.top;
    }

    public float getMaxCardElevation() {
        return f3878b.mo4323a(this.f3884h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f3880d;
    }

    public float getRadius() {
        return f3878b.mo4327f(this.f3884h);
    }

    public boolean getUseCompatPadding() {
        return this.f3879c;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        CardViewImpl fVar = f3878b;
        if (!(fVar instanceof CardViewApi21Impl)) {
            int mode = MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.mo4329h(this.f3884h)), MeasureSpec.getSize(i)), mode);
            }
            int mode2 = MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.mo4328g(this.f3884h)), MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f3878b.mo4333l(this.f3884h, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f3878b.mo4331j(this.f3884h, f);
    }

    public void setMaxCardElevation(float f) {
        f3878b.mo4334m(this.f3884h, f);
    }

    public void setMinimumHeight(int i) {
        this.f3882f = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f3881e = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f3880d) {
            this.f3880d = z;
            f3878b.mo4332k(this.f3884h);
        }
    }

    public void setRadius(float f) {
        f3878b.mo4325c(this.f3884h, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f3879c != z) {
            this.f3879c = z;
            f3878b.mo4330i(this.f3884h);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f3878b.mo4333l(this.f3884h, colorStateList);
    }
}
