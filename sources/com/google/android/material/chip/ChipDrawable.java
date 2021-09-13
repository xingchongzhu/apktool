package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.material.internal.C2053k;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.TextDrawableHelper.C2052b;
import com.google.android.material.internal.ThemeEnforcement;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p035d.ColorUtils;
import p010b.p034g.p041i.BidiFormatter;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p115a0.RippleUtils;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p119m.MotionSpec;
import p067c.p068a.p069a.p114b.p121o.CanvasCompat;
import p067c.p068a.p069a.p114b.p128u.C1308a;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;
import p067c.p068a.p069a.p114b.p133z.TextAppearance;

/* renamed from: com.google.android.material.chip.a */
public class ChipDrawable extends MaterialShapeDrawable implements TintAwareDrawable, Callback, C2052b {

    /* renamed from: y */
    private static final int[] f12763y = {16842910};

    /* renamed from: z */
    private static final ShapeDrawable f12764z = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    private ColorStateList f12765A;

    /* renamed from: A0 */
    private ColorFilter f12766A0;

    /* renamed from: B */
    private ColorStateList f12767B;

    /* renamed from: B0 */
    private PorterDuffColorFilter f12768B0;

    /* renamed from: C */
    private float f12769C;

    /* renamed from: C0 */
    private ColorStateList f12770C0;

    /* renamed from: D */
    private float f12771D = -1.0f;

    /* renamed from: D0 */
    private Mode f12772D0 = Mode.SRC_IN;

    /* renamed from: E0 */
    private int[] f12773E0;

    /* renamed from: F0 */
    private boolean f12774F0;

    /* renamed from: G */
    private ColorStateList f12775G;

    /* renamed from: G0 */
    private ColorStateList f12776G0;

    /* renamed from: H */
    private float f12777H;

    /* renamed from: H0 */
    private WeakReference<C1991a> f12778H0 = new WeakReference<>(null);

    /* renamed from: I */
    private ColorStateList f12779I;

    /* renamed from: I0 */
    private TruncateAt f12780I0;

    /* renamed from: J */
    private CharSequence f12781J;

    /* renamed from: J0 */
    private boolean f12782J0;

    /* renamed from: K */
    private boolean f12783K;

    /* renamed from: K0 */
    private int f12784K0;

    /* renamed from: L */
    private Drawable f12785L;

    /* renamed from: L0 */
    private boolean f12786L0;

    /* renamed from: M */
    private ColorStateList f12787M;

    /* renamed from: N */
    private float f12788N;

    /* renamed from: O */
    private boolean f12789O;

    /* renamed from: P */
    private boolean f12790P;

    /* renamed from: Q */
    private Drawable f12791Q;

    /* renamed from: R */
    private Drawable f12792R;

    /* renamed from: S */
    private ColorStateList f12793S;

    /* renamed from: T */
    private float f12794T;

    /* renamed from: U */
    private CharSequence f12795U;

    /* renamed from: V */
    private boolean f12796V;

    /* renamed from: W */
    private boolean f12797W;

    /* renamed from: X */
    private Drawable f12798X;

    /* renamed from: Y */
    private ColorStateList f12799Y;

    /* renamed from: Z */
    private MotionSpec f12800Z;

    /* renamed from: a0 */
    private MotionSpec f12801a0;

    /* renamed from: b0 */
    private float f12802b0;

    /* renamed from: c0 */
    private float f12803c0;

    /* renamed from: d0 */
    private float f12804d0;

    /* renamed from: e0 */
    private float f12805e0;

    /* renamed from: f0 */
    private float f12806f0;

    /* renamed from: g0 */
    private float f12807g0;

    /* renamed from: h0 */
    private float f12808h0;

    /* renamed from: i0 */
    private float f12809i0;

    /* renamed from: j0 */
    private final Context f12810j0;

    /* renamed from: k0 */
    private final Paint f12811k0 = new Paint(1);

    /* renamed from: l0 */
    private final Paint f12812l0;

    /* renamed from: m0 */
    private final FontMetrics f12813m0 = new FontMetrics();

    /* renamed from: n0 */
    private final RectF f12814n0 = new RectF();

    /* renamed from: o0 */
    private final PointF f12815o0 = new PointF();

    /* renamed from: p0 */
    private final Path f12816p0 = new Path();

    /* renamed from: q0 */
    private final TextDrawableHelper f12817q0;

    /* renamed from: r0 */
    private int f12818r0;

    /* renamed from: s0 */
    private int f12819s0;

    /* renamed from: t0 */
    private int f12820t0;

    /* renamed from: u0 */
    private int f12821u0;

    /* renamed from: v0 */
    private int f12822v0;

    /* renamed from: w0 */
    private int f12823w0;

    /* renamed from: x0 */
    private boolean f12824x0;

    /* renamed from: y0 */
    private int f12825y0;

    /* renamed from: z0 */
    private int f12826z0 = 255;

    /* renamed from: com.google.android.material.chip.a$a */
    /* compiled from: ChipDrawable */
    public interface C1991a {
        /* renamed from: a */
        void mo15286a();
    }

    private ChipDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo7836M(context);
        this.f12810j0 = context;
        TextDrawableHelper hVar = new TextDrawableHelper(this);
        this.f12817q0 = hVar;
        this.f12781J = "";
        hVar.mo16003e().density = context.getResources().getDisplayMetrics().density;
        this.f12812l0 = null;
        int[] iArr = f12763y;
        setState(iArr);
        mo15547k2(iArr);
        this.f12782J0 = true;
        if (RippleUtils.f9053a) {
            f12764z.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private void m15630A0(Canvas canvas, Rect rect) {
        if (m15636N2()) {
            m15648n0(rect, this.f12814n0);
            RectF rectF = this.f12814n0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f12791Q.setBounds(0, 0, (int) this.f12814n0.width(), (int) this.f12814n0.height());
            if (RippleUtils.f9053a) {
                this.f12792R.setBounds(this.f12791Q.getBounds());
                this.f12792R.jumpToCurrentState();
                this.f12792R.draw(canvas);
            } else {
                this.f12791Q.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: B0 */
    private void m15631B0(Canvas canvas, Rect rect) {
        this.f12811k0.setColor(this.f12822v0);
        this.f12811k0.setStyle(Style.FILL);
        this.f12814n0.set(rect);
        if (!this.f12786L0) {
            canvas.drawRoundRect(this.f12814n0, mo15483H0(), mo15483H0(), this.f12811k0);
            return;
        }
        mo7858h(new RectF(rect), this.f12816p0);
        super.mo7865p(canvas, this.f12811k0, this.f12816p0, mo7870u());
    }

    /* renamed from: C0 */
    private void m15632C0(Canvas canvas, Rect rect) {
        Paint paint = this.f12812l0;
        if (paint != null) {
            paint.setColor(ColorUtils.m4970d(-16777216, 127));
            canvas.drawRect(rect, this.f12812l0);
            if (m15635M2() || m15634L2()) {
                m15644k0(rect, this.f12814n0);
                canvas.drawRect(this.f12814n0, this.f12812l0);
            }
            if (this.f12781J != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f12812l0);
            }
            if (m15636N2()) {
                m15648n0(rect, this.f12814n0);
                canvas.drawRect(this.f12814n0, this.f12812l0);
            }
            this.f12812l0.setColor(ColorUtils.m4970d(-65536, 127));
            m15646m0(rect, this.f12814n0);
            canvas.drawRect(this.f12814n0, this.f12812l0);
            this.f12812l0.setColor(ColorUtils.m4970d(-16711936, 127));
            m15649o0(rect, this.f12814n0);
            canvas.drawRect(this.f12814n0, this.f12812l0);
        }
    }

    /* renamed from: D0 */
    private void m15633D0(Canvas canvas, Rect rect) {
        if (this.f12781J != null) {
            Align s0 = mo15563s0(rect, this.f12815o0);
            m15650q0(rect, this.f12814n0);
            if (this.f12817q0.mo16002d() != null) {
                this.f12817q0.mo16003e().drawableState = getState();
                this.f12817q0.mo16008j(this.f12810j0);
            }
            this.f12817q0.mo16003e().setTextAlign(s0);
            int i = 0;
            boolean z = Math.round(this.f12817q0.mo16004f(mo15534g1().toString())) > Math.round(this.f12814n0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f12814n0);
            }
            CharSequence charSequence = this.f12781J;
            if (z && this.f12780I0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f12817q0.mo16003e(), this.f12814n0.width(), this.f12780I0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f12815o0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f12817q0.mo16003e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: L2 */
    private boolean m15634L2() {
        return this.f12797W && this.f12798X != null && this.f12824x0;
    }

    /* renamed from: M2 */
    private boolean m15635M2() {
        return this.f12783K && this.f12785L != null;
    }

    /* renamed from: N2 */
    private boolean m15636N2() {
        return this.f12790P && this.f12791Q != null;
    }

    /* renamed from: O2 */
    private void m15637O2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: P2 */
    private void m15638P2() {
        this.f12776G0 = this.f12774F0 ? RippleUtils.m11253d(this.f12779I) : null;
    }

    @TargetApi(21)
    /* renamed from: Q2 */
    private void m15639Q2() {
        this.f12792R = new RippleDrawable(RippleUtils.m11253d(mo15530e1()), this.f12791Q, f12764z);
    }

    /* renamed from: Y0 */
    private float m15640Y0() {
        Drawable drawable = this.f12824x0 ? this.f12798X : this.f12785L;
        float f = this.f12788N;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil((double) C2053k.m16231b(this.f12810j0, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: Z0 */
    private float m15641Z0() {
        Drawable drawable = this.f12824x0 ? this.f12798X : this.f12785L;
        float f = this.f12788N;
        return (f > 0.0f || drawable == null) ? f : (float) drawable.getIntrinsicWidth();
    }

    /* renamed from: a2 */
    private void m15642a2(ColorStateList colorStateList) {
        if (this.f12765A != colorStateList) {
            this.f12765A = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: j0 */
    private void m15643j0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            DrawableCompat.m1854m(drawable, DrawableCompat.m1847f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f12791Q) {
                if (drawable.isStateful()) {
                    drawable.setState(mo15515V0());
                }
                DrawableCompat.m1856o(drawable, this.f12793S);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f12785L;
            if (drawable == drawable2 && this.f12789O) {
                DrawableCompat.m1856o(drawable2, this.f12787M);
            }
        }
    }

    /* renamed from: k0 */
    private void m15644k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m15635M2() || m15634L2()) {
            float f = this.f12802b0 + this.f12803c0;
            float Z0 = m15641Z0();
            if (DrawableCompat.m1847f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + Z0;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - Z0;
            }
            float Y0 = m15640Y0();
            float exactCenterY = rect.exactCenterY() - (Y0 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + Y0;
        }
    }

    /* renamed from: k1 */
    private ColorFilter m15645k1() {
        ColorFilter colorFilter = this.f12766A0;
        return colorFilter != null ? colorFilter : this.f12768B0;
    }

    /* renamed from: m0 */
    private void m15646m0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m15636N2()) {
            float f = this.f12809i0 + this.f12808h0 + this.f12794T + this.f12807g0 + this.f12806f0;
            if (DrawableCompat.m1847f(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: m1 */
    private static boolean m15647m1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n0 */
    private void m15648n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m15636N2()) {
            float f = this.f12809i0 + this.f12808h0;
            if (DrawableCompat.m1847f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f12794T;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f12794T;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f12794T;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: o0 */
    private void m15649o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m15636N2()) {
            float f = this.f12809i0 + this.f12808h0 + this.f12794T + this.f12807g0 + this.f12806f0;
            if (DrawableCompat.m1847f(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: q0 */
    private void m15650q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f12781J != null) {
            float l0 = this.f12802b0 + mo15548l0() + this.f12805e0;
            float p0 = this.f12809i0 + mo15558p0() + this.f12806f0;
            if (DrawableCompat.m1847f(this) == 0) {
                rectF.left = ((float) rect.left) + l0;
                rectF.right = ((float) rect.right) - p0;
            } else {
                rectF.left = ((float) rect.left) + p0;
                rectF.right = ((float) rect.right) - l0;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: q1 */
    private static boolean m15651q1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: r0 */
    private float m15652r0() {
        this.f12817q0.mo16003e().getFontMetrics(this.f12813m0);
        FontMetrics fontMetrics = this.f12813m0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: r1 */
    private static boolean m15653r1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: s1 */
    private static boolean m15654s1(TextAppearance dVar) {
        if (dVar != null) {
            ColorStateList colorStateList = dVar.f9707a;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t0 */
    private boolean m15655t0() {
        return this.f12797W && this.f12798X != null && this.f12796V;
    }

    /* renamed from: t1 */
    private void m15656t1(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = ThemeEnforcement.m16228h(this.f12810j0, attributeSet, C1297l.f9361U, i, i2, new int[0]);
        this.f12786L0 = h.hasValue(C1297l.f9263G0);
        m15642a2(MaterialResources.m11600a(this.f12810j0, h, C1297l.f9556t0));
        mo15475E1(MaterialResources.m11600a(this.f12810j0, h, C1297l.f9452g0));
        mo15510S1(h.getDimension(C1297l.f9516o0, 0.0f));
        int i3 = C1297l.f9460h0;
        if (h.hasValue(i3)) {
            mo15481G1(h.getDimension(i3, 0.0f));
        }
        mo15518W1(MaterialResources.m11600a(this.f12810j0, h, C1297l.f9540r0));
        mo15521Y1(h.getDimension(C1297l.f9548s0, 0.0f));
        mo15575x2(MaterialResources.m11600a(this.f12810j0, h, C1297l.f9255F0));
        mo15471C2(h.getText(C1297l.f9404a0));
        TextAppearance f = MaterialResources.m11605f(this.f12810j0, h, C1297l.f9368V);
        f.f9720n = h.getDimension(C1297l.f9375W, f.f9720n);
        mo15473D2(f);
        int i4 = h.getInt(C1297l.f9389Y, 0);
        if (i4 == 1) {
            mo15560p2(TruncateAt.START);
        } else if (i4 == 2) {
            mo15560p2(TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            mo15560p2(TruncateAt.END);
        }
        mo15508R1(h.getBoolean(C1297l.f9508n0, false));
        String str = "http://schemas.android.com/apk/res-auto";
        if (!(attributeSet == null || attributeSet.getAttributeValue(str, "chipIconEnabled") == null || attributeSet.getAttributeValue(str, "chipIconVisible") != null)) {
            mo15508R1(h.getBoolean(C1297l.f9484k0, false));
        }
        mo15493K1(MaterialResources.m11603d(this.f12810j0, h, C1297l.f9476j0));
        int i5 = C1297l.f9500m0;
        if (h.hasValue(i5)) {
            mo15502O1(MaterialResources.m11600a(this.f12810j0, h, i5));
        }
        mo15498M1(h.getDimension(C1297l.f9492l0, -1.0f));
        mo15553n2(h.getBoolean(C1297l.f9215A0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue(str, "closeIconEnabled") == null || attributeSet.getAttributeValue(str, "closeIconVisible") != null)) {
            mo15553n2(h.getBoolean(C1297l.f9572v0, false));
        }
        mo15525b2(MaterialResources.m11603d(this.f12810j0, h, C1297l.f9564u0));
        mo15550l2(MaterialResources.m11600a(this.f12810j0, h, C1297l.f9604z0));
        mo15535g2(h.getDimension(C1297l.f9588x0, 0.0f));
        mo15572w1(h.getBoolean(C1297l.f9412b0, false));
        mo15472D1(h.getBoolean(C1297l.f9444f0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue(str, "checkedIconEnabled") == null || attributeSet.getAttributeValue(str, "checkedIconVisible") != null)) {
            mo15472D1(h.getBoolean(C1297l.f9428d0, false));
        }
        mo15576y1(MaterialResources.m11603d(this.f12810j0, h, C1297l.f9420c0));
        int i6 = C1297l.f9436e0;
        if (h.hasValue(i6)) {
            mo15466A1(MaterialResources.m11600a(this.f12810j0, h, i6));
        }
        mo15467A2(MotionSpec.m11485b(this.f12810j0, h, C1297l.f9271H0));
        mo15561q2(MotionSpec.m11485b(this.f12810j0, h, C1297l.f9231C0));
        mo15514U1(h.getDimension(C1297l.f9532q0, 0.0f));
        mo15569u2(h.getDimension(C1297l.f9247E0, 0.0f));
        mo15564s2(h.getDimension(C1297l.f9239D0, 0.0f));
        mo15485H2(h.getDimension(C1297l.f9285J0, 0.0f));
        mo15479F2(h.getDimension(C1297l.f9278I0, 0.0f));
        mo15543i2(h.getDimension(C1297l.f9596y0, 0.0f));
        mo15529d2(h.getDimension(C1297l.f9580w0, 0.0f));
        mo15487I1(h.getDimension(C1297l.f9468i0, 0.0f));
        mo15573w2(h.getDimensionPixelSize(C1297l.f9396Z, Integer.MAX_VALUE));
        h.recycle();
    }

    /* renamed from: u0 */
    public static ChipDrawable m15657u0(Context context, AttributeSet attributeSet, int i, int i2) {
        ChipDrawable aVar = new ChipDrawable(context, attributeSet, i, i2);
        aVar.m15656t1(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: v0 */
    private void m15658v0(Canvas canvas, Rect rect) {
        if (m15634L2()) {
            m15644k0(rect, this.f12814n0);
            RectF rectF = this.f12814n0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f12798X.setBounds(0, 0, (int) this.f12814n0.width(), (int) this.f12814n0.height());
            this.f12798X.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0152  */
    /* renamed from: v1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15659v1(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f12765A
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f12818r0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r1 = r6.mo7861l(r1)
            int r3 = r6.f12818r0
            r4 = 1
            if (r3 == r1) goto L_0x001d
            r6.f12818r0 = r1
            r0 = 1
        L_0x001d:
            android.content.res.ColorStateList r3 = r6.f12767B
            if (r3 == 0) goto L_0x0028
            int r5 = r6.f12819s0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            int r3 = r6.mo7861l(r3)
            int r5 = r6.f12819s0
            if (r5 == r3) goto L_0x0034
            r6.f12819s0 = r3
            r0 = 1
        L_0x0034:
            int r1 = p067c.p068a.p069a.p114b.p126s.MaterialColors.m11577e(r1, r3)
            int r3 = r6.f12820t0
            if (r3 == r1) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            android.content.res.ColorStateList r5 = r6.mo7872x()
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x0055
            r6.f12820t0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.mo7843X(r0)
            r0 = 1
        L_0x0055:
            android.content.res.ColorStateList r1 = r6.f12775G
            if (r1 == 0) goto L_0x0060
            int r3 = r6.f12821u0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            int r3 = r6.f12821u0
            if (r3 == r1) goto L_0x0068
            r6.f12821u0 = r1
            r0 = 1
        L_0x0068:
            android.content.res.ColorStateList r1 = r6.f12776G0
            if (r1 == 0) goto L_0x007b
            boolean r1 = p067c.p068a.p069a.p114b.p115a0.RippleUtils.m11254e(r7)
            if (r1 == 0) goto L_0x007b
            android.content.res.ColorStateList r1 = r6.f12776G0
            int r3 = r6.f12822v0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            int r3 = r6.f12822v0
            if (r3 == r1) goto L_0x0087
            r6.f12822v0 = r1
            boolean r1 = r6.f12774F0
            if (r1 == 0) goto L_0x0087
            r0 = 1
        L_0x0087:
            com.google.android.material.internal.h r1 = r6.f12817q0
            c.a.a.b.z.d r1 = r1.mo16002d()
            if (r1 == 0) goto L_0x00a8
            com.google.android.material.internal.h r1 = r6.f12817q0
            c.a.a.b.z.d r1 = r1.mo16002d()
            android.content.res.ColorStateList r1 = r1.f9707a
            if (r1 == 0) goto L_0x00a8
            com.google.android.material.internal.h r1 = r6.f12817q0
            c.a.a.b.z.d r1 = r1.mo16002d()
            android.content.res.ColorStateList r1 = r1.f9707a
            int r3 = r6.f12823w0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00a9
        L_0x00a8:
            r1 = 0
        L_0x00a9:
            int r3 = r6.f12823w0
            if (r3 == r1) goto L_0x00b0
            r6.f12823w0 = r1
            r0 = 1
        L_0x00b0:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m15647m1(r1, r3)
            if (r1 == 0) goto L_0x00c3
            boolean r1 = r6.f12796V
            if (r1 == 0) goto L_0x00c3
            r1 = 1
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            boolean r3 = r6.f12824x0
            if (r3 == r1) goto L_0x00de
            android.graphics.drawable.Drawable r3 = r6.f12798X
            if (r3 == 0) goto L_0x00de
            float r0 = r6.mo15548l0()
            r6.f12824x0 = r1
            float r1 = r6.mo15548l0()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00dd
            r0 = 1
            r1 = 1
            goto L_0x00df
        L_0x00dd:
            r0 = 1
        L_0x00de:
            r1 = 0
        L_0x00df:
            android.content.res.ColorStateList r3 = r6.f12770C0
            if (r3 == 0) goto L_0x00ea
            int r5 = r6.f12825y0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00eb
        L_0x00ea:
            r3 = 0
        L_0x00eb:
            int r5 = r6.f12825y0
            if (r5 == r3) goto L_0x00fc
            r6.f12825y0 = r3
            android.content.res.ColorStateList r0 = r6.f12770C0
            android.graphics.PorterDuff$Mode r3 = r6.f12772D0
            android.graphics.PorterDuffColorFilter r0 = p067c.p068a.p069a.p114b.p128u.C1308a.m11580a(r6, r0, r3)
            r6.f12768B0 = r0
            goto L_0x00fd
        L_0x00fc:
            r4 = r0
        L_0x00fd:
            android.graphics.drawable.Drawable r0 = r6.f12785L
            boolean r0 = m15653r1(r0)
            if (r0 == 0) goto L_0x010c
            android.graphics.drawable.Drawable r0 = r6.f12785L
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x010c:
            android.graphics.drawable.Drawable r0 = r6.f12798X
            boolean r0 = m15653r1(r0)
            if (r0 == 0) goto L_0x011b
            android.graphics.drawable.Drawable r0 = r6.f12798X
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x011b:
            android.graphics.drawable.Drawable r0 = r6.f12791Q
            boolean r0 = m15653r1(r0)
            if (r0 == 0) goto L_0x0138
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.f12791Q
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x0138:
            boolean r7 = p067c.p068a.p069a.p114b.p115a0.RippleUtils.f9053a
            if (r7 == 0) goto L_0x014b
            android.graphics.drawable.Drawable r7 = r6.f12792R
            boolean r7 = m15653r1(r7)
            if (r7 == 0) goto L_0x014b
            android.graphics.drawable.Drawable r7 = r6.f12792R
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x014b:
            if (r4 == 0) goto L_0x0150
            r6.invalidateSelf()
        L_0x0150:
            if (r1 == 0) goto L_0x0155
            r6.mo15568u1()
        L_0x0155:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipDrawable.m15659v1(int[], int[]):boolean");
    }

    /* renamed from: w0 */
    private void m15660w0(Canvas canvas, Rect rect) {
        if (!this.f12786L0) {
            this.f12811k0.setColor(this.f12819s0);
            this.f12811k0.setStyle(Style.FILL);
            this.f12811k0.setColorFilter(m15645k1());
            this.f12814n0.set(rect);
            canvas.drawRoundRect(this.f12814n0, mo15483H0(), mo15483H0(), this.f12811k0);
        }
    }

    /* renamed from: x0 */
    private void m15661x0(Canvas canvas, Rect rect) {
        if (m15635M2()) {
            m15644k0(rect, this.f12814n0);
            RectF rectF = this.f12814n0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f12785L.setBounds(0, 0, (int) this.f12814n0.width(), (int) this.f12814n0.height());
            this.f12785L.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: y0 */
    private void m15662y0(Canvas canvas, Rect rect) {
        if (this.f12777H > 0.0f && !this.f12786L0) {
            this.f12811k0.setColor(this.f12821u0);
            this.f12811k0.setStyle(Style.STROKE);
            if (!this.f12786L0) {
                this.f12811k0.setColorFilter(m15645k1());
            }
            RectF rectF = this.f12814n0;
            float f = (float) rect.left;
            float f2 = this.f12777H;
            rectF.set(f + (f2 / 2.0f), ((float) rect.top) + (f2 / 2.0f), ((float) rect.right) - (f2 / 2.0f), ((float) rect.bottom) - (f2 / 2.0f));
            float f3 = this.f12771D - (this.f12777H / 2.0f);
            canvas.drawRoundRect(this.f12814n0, f3, f3, this.f12811k0);
        }
    }

    /* renamed from: z0 */
    private void m15663z0(Canvas canvas, Rect rect) {
        if (!this.f12786L0) {
            this.f12811k0.setColor(this.f12818r0);
            this.f12811k0.setStyle(Style.FILL);
            this.f12814n0.set(rect);
            canvas.drawRoundRect(this.f12814n0, mo15483H0(), mo15483H0(), this.f12811k0);
        }
    }

    /* renamed from: A1 */
    public void mo15466A1(ColorStateList colorStateList) {
        if (this.f12799Y != colorStateList) {
            this.f12799Y = colorStateList;
            if (m15655t0()) {
                DrawableCompat.m1856o(this.f12798X, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: A2 */
    public void mo15467A2(MotionSpec hVar) {
        this.f12800Z = hVar;
    }

    /* renamed from: B1 */
    public void mo15468B1(int i) {
        mo15466A1(AppCompatResources.m4142c(this.f12810j0, i));
    }

    /* renamed from: B2 */
    public void mo15469B2(int i) {
        mo15467A2(MotionSpec.m11486c(this.f12810j0, i));
    }

    /* renamed from: C1 */
    public void mo15470C1(int i) {
        mo15472D1(this.f12810j0.getResources().getBoolean(i));
    }

    /* renamed from: C2 */
    public void mo15471C2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f12781J, charSequence)) {
            this.f12781J = charSequence;
            this.f12817q0.mo16007i(true);
            invalidateSelf();
            mo15568u1();
        }
    }

    /* renamed from: D1 */
    public void mo15472D1(boolean z) {
        if (this.f12797W != z) {
            boolean L2 = m15634L2();
            this.f12797W = z;
            boolean L22 = m15634L2();
            if (L2 != L22) {
                if (L22) {
                    m15643j0(this.f12798X);
                } else {
                    m15637O2(this.f12798X);
                }
                invalidateSelf();
                mo15568u1();
            }
        }
    }

    /* renamed from: D2 */
    public void mo15473D2(TextAppearance dVar) {
        this.f12817q0.mo16006h(dVar, this.f12810j0);
    }

    /* renamed from: E0 */
    public Drawable mo15474E0() {
        return this.f12798X;
    }

    /* renamed from: E1 */
    public void mo15475E1(ColorStateList colorStateList) {
        if (this.f12767B != colorStateList) {
            this.f12767B = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: E2 */
    public void mo15476E2(int i) {
        mo15473D2(new TextAppearance(this.f12810j0, i));
    }

    /* renamed from: F0 */
    public ColorStateList mo15477F0() {
        return this.f12799Y;
    }

    /* renamed from: F1 */
    public void mo15478F1(int i) {
        mo15475E1(AppCompatResources.m4142c(this.f12810j0, i));
    }

    /* renamed from: F2 */
    public void mo15479F2(float f) {
        if (this.f12806f0 != f) {
            this.f12806f0 = f;
            invalidateSelf();
            mo15568u1();
        }
    }

    /* renamed from: G0 */
    public ColorStateList mo15480G0() {
        return this.f12767B;
    }

    @Deprecated
    /* renamed from: G1 */
    public void mo15481G1(float f) {
        if (this.f12771D != f) {
            this.f12771D = f;
            setShapeAppearanceModel(mo7830C().mo7896w(f));
        }
    }

    /* renamed from: G2 */
    public void mo15482G2(int i) {
        mo15479F2(this.f12810j0.getResources().getDimension(i));
    }

    /* renamed from: H0 */
    public float mo15483H0() {
        return this.f12786L0 ? mo7832F() : this.f12771D;
    }

    @Deprecated
    /* renamed from: H1 */
    public void mo15484H1(int i) {
        mo15481G1(this.f12810j0.getResources().getDimension(i));
    }

    /* renamed from: H2 */
    public void mo15485H2(float f) {
        if (this.f12805e0 != f) {
            this.f12805e0 = f;
            invalidateSelf();
            mo15568u1();
        }
    }

    /* renamed from: I0 */
    public float mo15486I0() {
        return this.f12809i0;
    }

    /* renamed from: I1 */
    public void mo15487I1(float f) {
        if (this.f12809i0 != f) {
            this.f12809i0 = f;
            invalidateSelf();
            mo15568u1();
        }
    }

    /* renamed from: I2 */
    public void mo15488I2(int i) {
        mo15485H2(this.f12810j0.getResources().getDimension(i));
    }

    /* renamed from: J0 */
    public Drawable mo15489J0() {
        Drawable drawable = this.f12785L;
        if (drawable != null) {
            return DrawableCompat.m1858q(drawable);
        }
        return null;
    }

    /* renamed from: J1 */
    public void mo15490J1(int i) {
        mo15487I1(this.f12810j0.getResources().getDimension(i));
    }

    /* renamed from: J2 */
    public void mo15491J2(boolean z) {
        if (this.f12774F0 != z) {
            this.f12774F0 = z;
            m15638P2();
            onStateChange(getState());
        }
    }

    /* renamed from: K0 */
    public float mo15492K0() {
        return this.f12788N;
    }

    /* renamed from: K1 */
    public void mo15493K1(Drawable drawable) {
        Drawable J0 = mo15489J0();
        if (J0 != drawable) {
            float l0 = mo15548l0();
            this.f12785L = drawable != null ? DrawableCompat.m1859r(drawable).mutate() : null;
            float l02 = mo15548l0();
            m15637O2(J0);
            if (m15635M2()) {
                m15643j0(this.f12785L);
            }
            invalidateSelf();
            if (l0 != l02) {
                mo15568u1();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K2 */
    public boolean mo15494K2() {
        return this.f12782J0;
    }

    /* renamed from: L0 */
    public ColorStateList mo15495L0() {
        return this.f12787M;
    }

    /* renamed from: L1 */
    public void mo15496L1(int i) {
        mo15493K1(AppCompatResources.m4143d(this.f12810j0, i));
    }

    /* renamed from: M0 */
    public float mo15497M0() {
        return this.f12769C;
    }

    /* renamed from: M1 */
    public void mo15498M1(float f) {
        if (this.f12788N != f) {
            float l0 = mo15548l0();
            this.f12788N = f;
            float l02 = mo15548l0();
            invalidateSelf();
            if (l0 != l02) {
                mo15568u1();
            }
        }
    }

    /* renamed from: N0 */
    public float mo15499N0() {
        return this.f12802b0;
    }

    /* renamed from: N1 */
    public void mo15500N1(int i) {
        mo15498M1(this.f12810j0.getResources().getDimension(i));
    }

    /* renamed from: O0 */
    public ColorStateList mo15501O0() {
        return this.f12775G;
    }

    /* renamed from: O1 */
    public void mo15502O1(ColorStateList colorStateList) {
        this.f12789O = true;
        if (this.f12787M != colorStateList) {
            this.f12787M = colorStateList;
            if (m15635M2()) {
                DrawableCompat.m1856o(this.f12785L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: P0 */
    public float mo15503P0() {
        return this.f12777H;
    }

    /* renamed from: P1 */
    public void mo15504P1(int i) {
        mo15502O1(AppCompatResources.m4142c(this.f12810j0, i));
    }

    /* renamed from: Q0 */
    public Drawable mo15505Q0() {
        Drawable drawable = this.f12791Q;
        if (drawable != null) {
            return DrawableCompat.m1858q(drawable);
        }
        return null;
    }

    /* renamed from: Q1 */
    public void mo15506Q1(int i) {
        mo15508R1(this.f12810j0.getResources().getBoolean(i));
    }

    /* renamed from: R0 */
    public CharSequence mo15507R0() {
        return this.f12795U;
    }

    /* renamed from: R1 */
    public void mo15508R1(boolean z) {
        if (this.f12783K != z) {
            boolean M2 = m15635M2();
            this.f12783K = z;
            boolean M22 = m15635M2();
            if (M2 != M22) {
                if (M22) {
                    m15643j0(this.f12785L);
                } else {
                    m15637O2(this.f12785L);
                }
                invalidateSelf();
                mo15568u1();
            }
        }
    }

    /* renamed from: S0 */
    public float mo15509S0() {
        return this.f12808h0;
    }

    /* renamed from: S1 */
    public void mo15510S1(float f) {
        if (this.f12769C != f) {
            this.f12769C = f;
            invalidateSelf();
            mo15568u1();
        }
    }

    /* renamed from: T0 */
    public float mo15511T0() {
        return this.f12794T;
    }

    /* renamed from: T1 */
    public void mo15512T1(int i) {
        mo15510S1(this.f12810j0.getResources().getDimension(i));
    }

    /* renamed from: U0 */
    public float mo15513U0() {
        return this.f12807g0;
    }

    /* renamed from: U1 */
    public void mo15514U1(float f) {
        if (this.f12802b0 != f) {
            this.f12802b0 = f;
            invalidateSelf();
            mo15568u1();
        }
    }

    /* renamed from: V0 */
    public int[] mo15515V0() {
        return this.f12773E0;
    }

    /* renamed from: V1 */
    public void mo15516V1(int i) {
        mo15514U1(this.f12810j0.getResources().getDimension(i));
    }

    /* renamed from: W0 */
    public ColorStateList mo15517W0() {
        return this.f12793S;
    }

    /* renamed from: W1 */
    public void mo15518W1(ColorStateList colorStateList) {
        if (this.f12775G != colorStateList) {
            this.f12775G = colorStateList;
            if (this.f12786L0) {
                mo7851e0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: X0 */
    public void mo15519X0(RectF rectF) {
        m15649o0(getBounds(), rectF);
    }

    /* renamed from: X1 */
    public void mo15520X1(int i) {
        mo15518W1(AppCompatResources.m4142c(this.f12810j0, i));
    }

    /* renamed from: Y1 */
    public void mo15521Y1(float f) {
        if (this.f12777H != f) {
            this.f12777H = f;
            this.f12811k0.setStrokeWidth(f);
            if (this.f12786L0) {
                super.mo7852f0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: Z1 */
    public void mo15522Z1(int i) {
        mo15521Y1(this.f12810j0.getResources().getDimension(i));
    }

    /* renamed from: a */
    public void mo7976a() {
        mo15568u1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public TruncateAt mo15523a1() {
        return this.f12780I0;
    }

    /* renamed from: b1 */
    public MotionSpec mo15524b1() {
        return this.f12801a0;
    }

    /* renamed from: b2 */
    public void mo15525b2(Drawable drawable) {
        Drawable Q0 = mo15505Q0();
        if (Q0 != drawable) {
            float p0 = mo15558p0();
            this.f12791Q = drawable != null ? DrawableCompat.m1859r(drawable).mutate() : null;
            if (RippleUtils.f9053a) {
                m15639Q2();
            }
            float p02 = mo15558p0();
            m15637O2(Q0);
            if (m15636N2()) {
                m15643j0(this.f12791Q);
            }
            invalidateSelf();
            if (p0 != p02) {
                mo15568u1();
            }
        }
    }

    /* renamed from: c1 */
    public float mo15526c1() {
        return this.f12804d0;
    }

    /* renamed from: c2 */
    public void mo15527c2(CharSequence charSequence) {
        if (this.f12795U != charSequence) {
            this.f12795U = BidiFormatter.m5125c().mo4905h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: d1 */
    public float mo15528d1() {
        return this.f12803c0;
    }

    /* renamed from: d2 */
    public void mo15529d2(float f) {
        if (this.f12808h0 != f) {
            this.f12808h0 = f;
            invalidateSelf();
            if (m15636N2()) {
                mo15568u1();
            }
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f12826z0;
            if (i2 < 255) {
                i = CanvasCompat.m11553a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m15663z0(canvas, bounds);
            m15660w0(canvas, bounds);
            if (this.f12786L0) {
                super.draw(canvas);
            }
            m15662y0(canvas, bounds);
            m15631B0(canvas, bounds);
            m15661x0(canvas, bounds);
            m15658v0(canvas, bounds);
            if (this.f12782J0) {
                m15633D0(canvas, bounds);
            }
            m15630A0(canvas, bounds);
            m15632C0(canvas, bounds);
            if (this.f12826z0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public ColorStateList mo15530e1() {
        return this.f12779I;
    }

    /* renamed from: e2 */
    public void mo15531e2(int i) {
        mo15529d2(this.f12810j0.getResources().getDimension(i));
    }

    /* renamed from: f1 */
    public MotionSpec mo15532f1() {
        return this.f12800Z;
    }

    /* renamed from: f2 */
    public void mo15533f2(int i) {
        mo15525b2(AppCompatResources.m4143d(this.f12810j0, i));
    }

    /* renamed from: g1 */
    public CharSequence mo15534g1() {
        return this.f12781J;
    }

    /* renamed from: g2 */
    public void mo15535g2(float f) {
        if (this.f12794T != f) {
            this.f12794T = f;
            invalidateSelf();
            if (m15636N2()) {
                mo15568u1();
            }
        }
    }

    public int getAlpha() {
        return this.f12826z0;
    }

    public ColorFilter getColorFilter() {
        return this.f12766A0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f12769C;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f12802b0 + mo15548l0() + this.f12805e0 + this.f12817q0.mo16004f(mo15534g1().toString()) + this.f12806f0 + mo15558p0() + this.f12809i0), this.f12784K0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f12786L0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f12771D);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f12771D);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h1 */
    public TextAppearance mo15540h1() {
        return this.f12817q0.mo16002d();
    }

    /* renamed from: h2 */
    public void mo15541h2(int i) {
        mo15535g2(this.f12810j0.getResources().getDimension(i));
    }

    /* renamed from: i1 */
    public float mo15542i1() {
        return this.f12806f0;
    }

    /* renamed from: i2 */
    public void mo15543i2(float f) {
        if (this.f12807g0 != f) {
            this.f12807g0 = f;
            invalidateSelf();
            if (m15636N2()) {
                mo15568u1();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m15651q1(this.f12765A) || m15651q1(this.f12767B) || m15651q1(this.f12775G) || (this.f12774F0 && m15651q1(this.f12776G0)) || m15654s1(this.f12817q0.mo16002d()) || m15655t0() || m15653r1(this.f12785L) || m15653r1(this.f12798X) || m15651q1(this.f12770C0);
    }

    /* renamed from: j1 */
    public float mo15545j1() {
        return this.f12805e0;
    }

    /* renamed from: j2 */
    public void mo15546j2(int i) {
        mo15543i2(this.f12810j0.getResources().getDimension(i));
    }

    /* renamed from: k2 */
    public boolean mo15547k2(int[] iArr) {
        if (!Arrays.equals(this.f12773E0, iArr)) {
            this.f12773E0 = iArr;
            if (m15636N2()) {
                return m15659v1(getState(), iArr);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l0 */
    public float mo15548l0() {
        if (m15635M2() || m15634L2()) {
            return this.f12803c0 + m15641Z0() + this.f12804d0;
        }
        return 0.0f;
    }

    /* renamed from: l1 */
    public boolean mo15549l1() {
        return this.f12774F0;
    }

    /* renamed from: l2 */
    public void mo15550l2(ColorStateList colorStateList) {
        if (this.f12793S != colorStateList) {
            this.f12793S = colorStateList;
            if (m15636N2()) {
                DrawableCompat.m1856o(this.f12791Q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: m2 */
    public void mo15551m2(int i) {
        mo15550l2(AppCompatResources.m4142c(this.f12810j0, i));
    }

    /* renamed from: n1 */
    public boolean mo15552n1() {
        return this.f12796V;
    }

    /* renamed from: n2 */
    public void mo15553n2(boolean z) {
        if (this.f12790P != z) {
            boolean N2 = m15636N2();
            this.f12790P = z;
            boolean N22 = m15636N2();
            if (N2 != N22) {
                if (N22) {
                    m15643j0(this.f12791Q);
                } else {
                    m15637O2(this.f12791Q);
                }
                invalidateSelf();
                mo15568u1();
            }
        }
    }

    /* renamed from: o1 */
    public boolean mo15554o1() {
        return m15653r1(this.f12791Q);
    }

    /* renamed from: o2 */
    public void mo15555o2(C1991a aVar) {
        this.f12778H0 = new WeakReference<>(aVar);
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m15635M2()) {
            onLayoutDirectionChanged |= DrawableCompat.m1854m(this.f12785L, i);
        }
        if (m15634L2()) {
            onLayoutDirectionChanged |= DrawableCompat.m1854m(this.f12798X, i);
        }
        if (m15636N2()) {
            onLayoutDirectionChanged |= DrawableCompat.m1854m(this.f12791Q, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m15635M2()) {
            onLevelChange |= this.f12785L.setLevel(i);
        }
        if (m15634L2()) {
            onLevelChange |= this.f12798X.setLevel(i);
        }
        if (m15636N2()) {
            onLevelChange |= this.f12791Q.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f12786L0) {
            super.onStateChange(iArr);
        }
        return m15659v1(iArr, mo15515V0());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p0 */
    public float mo15558p0() {
        if (m15636N2()) {
            return this.f12807g0 + this.f12794T + this.f12808h0;
        }
        return 0.0f;
    }

    /* renamed from: p1 */
    public boolean mo15559p1() {
        return this.f12790P;
    }

    /* renamed from: p2 */
    public void mo15560p2(TruncateAt truncateAt) {
        this.f12780I0 = truncateAt;
    }

    /* renamed from: q2 */
    public void mo15561q2(MotionSpec hVar) {
        this.f12801a0 = hVar;
    }

    /* renamed from: r2 */
    public void mo15562r2(int i) {
        mo15561q2(MotionSpec.m11486c(this.f12810j0, i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s0 */
    public Align mo15563s0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Align align = Align.LEFT;
        if (this.f12781J != null) {
            float l0 = this.f12802b0 + mo15548l0() + this.f12805e0;
            if (DrawableCompat.m1847f(this) == 0) {
                pointF.x = ((float) rect.left) + l0;
                align = Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - l0;
                align = Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m15652r0();
        }
        return align;
    }

    /* renamed from: s2 */
    public void mo15564s2(float f) {
        if (this.f12804d0 != f) {
            float l0 = mo15548l0();
            this.f12804d0 = f;
            float l02 = mo15548l0();
            invalidateSelf();
            if (l0 != l02) {
                mo15568u1();
            }
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f12826z0 != i) {
            this.f12826z0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f12766A0 != colorFilter) {
            this.f12766A0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f12770C0 != colorStateList) {
            this.f12770C0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(Mode mode) {
        if (this.f12772D0 != mode) {
            this.f12772D0 = mode;
            this.f12768B0 = C1308a.m11580a(this, this.f12770C0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m15635M2()) {
            visible |= this.f12785L.setVisible(z, z2);
        }
        if (m15634L2()) {
            visible |= this.f12798X.setVisible(z, z2);
        }
        if (m15636N2()) {
            visible |= this.f12791Q.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t2 */
    public void mo15567t2(int i) {
        mo15564s2(this.f12810j0.getResources().getDimension(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo15568u1() {
        C1991a aVar = (C1991a) this.f12778H0.get();
        if (aVar != null) {
            aVar.mo15286a();
        }
    }

    /* renamed from: u2 */
    public void mo15569u2(float f) {
        if (this.f12803c0 != f) {
            float l0 = mo15548l0();
            this.f12803c0 = f;
            float l02 = mo15548l0();
            invalidateSelf();
            if (l0 != l02) {
                mo15568u1();
            }
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v2 */
    public void mo15571v2(int i) {
        mo15569u2(this.f12810j0.getResources().getDimension(i));
    }

    /* renamed from: w1 */
    public void mo15572w1(boolean z) {
        if (this.f12796V != z) {
            this.f12796V = z;
            float l0 = mo15548l0();
            if (!z && this.f12824x0) {
                this.f12824x0 = false;
            }
            float l02 = mo15548l0();
            invalidateSelf();
            if (l0 != l02) {
                mo15568u1();
            }
        }
    }

    /* renamed from: w2 */
    public void mo15573w2(int i) {
        this.f12784K0 = i;
    }

    /* renamed from: x1 */
    public void mo15574x1(int i) {
        mo15572w1(this.f12810j0.getResources().getBoolean(i));
    }

    /* renamed from: x2 */
    public void mo15575x2(ColorStateList colorStateList) {
        if (this.f12779I != colorStateList) {
            this.f12779I = colorStateList;
            m15638P2();
            onStateChange(getState());
        }
    }

    /* renamed from: y1 */
    public void mo15576y1(Drawable drawable) {
        if (this.f12798X != drawable) {
            float l0 = mo15548l0();
            this.f12798X = drawable;
            float l02 = mo15548l0();
            m15637O2(this.f12798X);
            m15643j0(this.f12798X);
            invalidateSelf();
            if (l0 != l02) {
                mo15568u1();
            }
        }
    }

    /* renamed from: y2 */
    public void mo15577y2(int i) {
        mo15575x2(AppCompatResources.m4142c(this.f12810j0, i));
    }

    /* renamed from: z1 */
    public void mo15578z1(int i) {
        mo15576y1(AppCompatResources.m4143d(this.f12810j0, i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z2 */
    public void mo15579z2(boolean z) {
        this.f12782J0 = z;
    }
}
