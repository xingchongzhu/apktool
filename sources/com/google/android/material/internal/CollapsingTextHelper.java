package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import android.view.View;
import p010b.p034g.p038f.MathUtils;
import p010b.p034g.p041i.TextDirectionHeuristicsCompat;
import p010b.p034g.p042j.Preconditions;
import p010b.p034g.p043k.GravityCompat;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.p119m.AnimationUtils;
import p067c.p068a.p069a.p114b.p133z.CancelableFontCallback;
import p067c.p068a.p069a.p114b.p133z.CancelableFontCallback.C1310a;
import p067c.p068a.p069a.p114b.p133z.TextAppearance;

/* renamed from: com.google.android.material.internal.a */
public final class CollapsingTextHelper {

    /* renamed from: a */
    private static final boolean f13103a = (VERSION.SDK_INT < 18);

    /* renamed from: b */
    private static final Paint f13104b;

    /* renamed from: A */
    private CharSequence f13105A;

    /* renamed from: B */
    private boolean f13106B;

    /* renamed from: C */
    private boolean f13107C;

    /* renamed from: D */
    private Bitmap f13108D;

    /* renamed from: E */
    private Paint f13109E;

    /* renamed from: F */
    private float f13110F;

    /* renamed from: G */
    private float f13111G;

    /* renamed from: H */
    private int[] f13112H;

    /* renamed from: I */
    private boolean f13113I;

    /* renamed from: J */
    private final TextPaint f13114J;

    /* renamed from: K */
    private final TextPaint f13115K;

    /* renamed from: L */
    private TimeInterpolator f13116L;

    /* renamed from: M */
    private TimeInterpolator f13117M;

    /* renamed from: N */
    private float f13118N;

    /* renamed from: O */
    private float f13119O;

    /* renamed from: P */
    private float f13120P;

    /* renamed from: Q */
    private ColorStateList f13121Q;

    /* renamed from: R */
    private float f13122R;

    /* renamed from: S */
    private float f13123S;

    /* renamed from: T */
    private float f13124T;

    /* renamed from: U */
    private ColorStateList f13125U;

    /* renamed from: V */
    private float f13126V;

    /* renamed from: W */
    private float f13127W;

    /* renamed from: X */
    private StaticLayout f13128X;

    /* renamed from: Y */
    private float f13129Y;

    /* renamed from: Z */
    private float f13130Z;

    /* renamed from: a0 */
    private float f13131a0;

    /* renamed from: b0 */
    private CharSequence f13132b0;

    /* renamed from: c */
    private final View f13133c;

    /* renamed from: c0 */
    private int f13134c0 = 1;

    /* renamed from: d */
    private boolean f13135d;

    /* renamed from: e */
    private float f13136e;

    /* renamed from: f */
    private final Rect f13137f;

    /* renamed from: g */
    private final Rect f13138g;

    /* renamed from: h */
    private final RectF f13139h;

    /* renamed from: i */
    private int f13140i = 16;

    /* renamed from: j */
    private int f13141j = 16;

    /* renamed from: k */
    private float f13142k = 15.0f;

    /* renamed from: l */
    private float f13143l = 15.0f;

    /* renamed from: m */
    private ColorStateList f13144m;

    /* renamed from: n */
    private ColorStateList f13145n;

    /* renamed from: o */
    private float f13146o;

    /* renamed from: p */
    private float f13147p;

    /* renamed from: q */
    private float f13148q;

    /* renamed from: r */
    private float f13149r;

    /* renamed from: s */
    private float f13150s;

    /* renamed from: t */
    private float f13151t;

    /* renamed from: u */
    private Typeface f13152u;

    /* renamed from: v */
    private Typeface f13153v;

    /* renamed from: w */
    private Typeface f13154w;

    /* renamed from: x */
    private CancelableFontCallback f13155x;

    /* renamed from: y */
    private CancelableFontCallback f13156y;

    /* renamed from: z */
    private CharSequence f13157z;

    /* renamed from: com.google.android.material.internal.a$a */
    /* compiled from: CollapsingTextHelper */
    class C2047a implements C1310a {
        C2047a() {
        }

        /* renamed from: a */
        public void mo8088a(Typeface typeface) {
            CollapsingTextHelper.this.mo15954M(typeface);
        }
    }

    static {
        Paint paint = null;
        f13104b = paint;
        if (paint != null) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public CollapsingTextHelper(View view) {
        this.f13133c = view;
        TextPaint textPaint = new TextPaint(129);
        this.f13114J = textPaint;
        this.f13115K = new TextPaint(textPaint);
        this.f13138g = new Rect();
        this.f13137f = new Rect();
        this.f13139h = new RectF();
    }

    /* renamed from: A */
    private boolean m16131A() {
        return ViewCompat.m5514C(this.f13133c) == 1;
    }

    /* renamed from: C */
    private static float m16132C(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AnimationUtils.m11472a(f, f2, f3);
    }

    /* renamed from: F */
    private static boolean m16133F(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: J */
    private void m16134J(float f) {
        this.f13129Y = f;
        ViewCompat.m5555f0(this.f13133c);
    }

    /* renamed from: N */
    private boolean m16135N(Typeface typeface) {
        CancelableFontCallback aVar = this.f13156y;
        if (aVar != null) {
            aVar.mo8087c();
        }
        if (this.f13152u == typeface) {
            return false;
        }
        this.f13152u = typeface;
        return true;
    }

    /* renamed from: Q */
    private void m16136Q(float f) {
        this.f13130Z = f;
        ViewCompat.m5555f0(this.f13133c);
    }

    /* renamed from: U */
    private boolean m16137U(Typeface typeface) {
        CancelableFontCallback aVar = this.f13155x;
        if (aVar != null) {
            aVar.mo8087c();
        }
        if (this.f13153v == typeface) {
            return false;
        }
        this.f13153v = typeface;
        return true;
    }

    /* renamed from: W */
    private void m16138W(float f) {
        m16145g(f);
        boolean z = f13103a && this.f13110F != 1.0f;
        this.f13107C = z;
        if (z) {
            m16149l();
        }
        ViewCompat.m5555f0(this.f13133c);
    }

    /* renamed from: a */
    private static int m16139a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: b */
    private void m16140b() {
        float f = this.f13111G;
        m16145g(this.f13143l);
        CharSequence charSequence = this.f13105A;
        if (charSequence != null) {
            StaticLayout staticLayout = this.f13128X;
            if (staticLayout != null) {
                this.f13132b0 = TextUtils.ellipsize(charSequence, this.f13114J, (float) staticLayout.getWidth(), TruncateAt.END);
            }
        }
        CharSequence charSequence2 = this.f13132b0;
        float f2 = 0.0f;
        float measureText = charSequence2 != null ? this.f13114J.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int b = GravityCompat.m5245b(this.f13141j, this.f13106B ? 1 : 0);
        int i = b & 112;
        if (i == 48) {
            this.f13147p = (float) this.f13138g.top;
        } else if (i != 80) {
            this.f13147p = ((float) this.f13138g.centerY()) - ((this.f13114J.descent() - this.f13114J.ascent()) / 2.0f);
        } else {
            this.f13147p = ((float) this.f13138g.bottom) + this.f13114J.ascent();
        }
        int i2 = b & 8388615;
        if (i2 == 1) {
            this.f13149r = ((float) this.f13138g.centerX()) - (measureText / 2.0f);
        } else if (i2 != 5) {
            this.f13149r = (float) this.f13138g.left;
        } else {
            this.f13149r = ((float) this.f13138g.right) - measureText;
        }
        m16145g(this.f13142k);
        StaticLayout staticLayout2 = this.f13128X;
        float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
        CharSequence charSequence3 = this.f13105A;
        float measureText2 = charSequence3 != null ? this.f13114J.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.f13128X;
        if (staticLayout3 != null && this.f13134c0 > 1 && !this.f13106B) {
            measureText2 = (float) staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f13128X;
        if (staticLayout4 != null) {
            f2 = staticLayout4.getLineLeft(0);
        }
        this.f13131a0 = f2;
        int b2 = GravityCompat.m5245b(this.f13140i, this.f13106B ? 1 : 0);
        int i3 = b2 & 112;
        if (i3 == 48) {
            this.f13146o = (float) this.f13137f.top;
        } else if (i3 != 80) {
            this.f13146o = ((float) this.f13137f.centerY()) - (height / 2.0f);
        } else {
            this.f13146o = (((float) this.f13137f.bottom) - height) + this.f13114J.descent();
        }
        int i4 = b2 & 8388615;
        if (i4 == 1) {
            this.f13148q = ((float) this.f13137f.centerX()) - (measureText2 / 2.0f);
        } else if (i4 != 5) {
            this.f13148q = (float) this.f13137f.left;
        } else {
            this.f13148q = ((float) this.f13137f.right) - measureText2;
        }
        m16146h();
        m16138W(f);
    }

    /* renamed from: c0 */
    private boolean m16141c0() {
        return this.f13134c0 > 1 && !this.f13106B && !this.f13107C;
    }

    /* renamed from: d */
    private void m16142d() {
        m16144f(this.f13136e);
    }

    /* renamed from: e */
    private boolean m16143e(CharSequence charSequence) {
        return (m16131A() ? TextDirectionHeuristicsCompat.f4577d : TextDirectionHeuristicsCompat.f4576c).mo4939a(charSequence, 0, charSequence.length());
    }

    /* renamed from: f */
    private void m16144f(float f) {
        m16156y(f);
        this.f13150s = m16132C(this.f13148q, this.f13149r, f, this.f13116L);
        this.f13151t = m16132C(this.f13146o, this.f13147p, f, this.f13116L);
        m16138W(m16132C(this.f13142k, this.f13143l, f, this.f13117M));
        float f2 = 1.0f - f;
        TimeInterpolator timeInterpolator = AnimationUtils.f9612b;
        m16134J(1.0f - m16132C(0.0f, 1.0f, f2, timeInterpolator));
        m16136Q(m16132C(1.0f, 0.0f, f, timeInterpolator));
        if (this.f13145n != this.f13144m) {
            this.f13114J.setColor(m16139a(m16153t(), mo15971r(), f));
        } else {
            this.f13114J.setColor(mo15971r());
        }
        if (VERSION.SDK_INT >= 21) {
            float f3 = this.f13126V;
            float f4 = this.f13127W;
            if (f3 != f4) {
                this.f13114J.setLetterSpacing(m16132C(f4, f3, f, timeInterpolator));
            } else {
                this.f13114J.setLetterSpacing(f3);
            }
        }
        this.f13114J.setShadowLayer(m16132C(this.f13122R, this.f13118N, f, null), m16132C(this.f13123S, this.f13119O, f, null), m16132C(this.f13124T, this.f13120P, f, null), m16139a(m16152s(this.f13125U), m16152s(this.f13121Q), f));
        ViewCompat.m5555f0(this.f13133c);
    }

    /* renamed from: g */
    private void m16145g(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.f13157z != null) {
            float width = (float) this.f13138g.width();
            float width2 = (float) this.f13137f.width();
            boolean z3 = false;
            int i = 1;
            if (m16157z(f, this.f13143l)) {
                f2 = this.f13143l;
                this.f13110F = 1.0f;
                Typeface typeface = this.f13154w;
                Typeface typeface2 = this.f13152u;
                if (typeface != typeface2) {
                    this.f13154w = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.f13142k;
                Typeface typeface3 = this.f13154w;
                Typeface typeface4 = this.f13153v;
                if (typeface3 != typeface4) {
                    this.f13154w = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m16157z(f, f3)) {
                    this.f13110F = 1.0f;
                } else {
                    this.f13110F = f / this.f13142k;
                }
                float f4 = this.f13143l / this.f13142k;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
                z = z2;
            }
            if (width > 0.0f) {
                z = this.f13111G != f2 || this.f13113I || z;
                this.f13111G = f2;
                this.f13113I = false;
            }
            if (this.f13105A == null || z) {
                this.f13114J.setTextSize(this.f13111G);
                this.f13114J.setTypeface(this.f13154w);
                TextPaint textPaint = this.f13114J;
                if (this.f13110F != 1.0f) {
                    z3 = true;
                }
                textPaint.setLinearText(z3);
                this.f13106B = m16143e(this.f13157z);
                if (m16141c0()) {
                    i = this.f13134c0;
                }
                StaticLayout i2 = m16147i(i, width, this.f13106B);
                this.f13128X = i2;
                this.f13105A = i2.getText();
            }
        }
    }

    /* renamed from: h */
    private void m16146h() {
        Bitmap bitmap = this.f13108D;
        if (bitmap != null) {
            bitmap.recycle();
            this.f13108D = null;
        }
    }

    /* renamed from: i */
    private StaticLayout m16147i(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = StaticLayoutBuilderCompat.m16201c(this.f13157z, this.f13114J, (int) f).mo15998e(TruncateAt.END).mo16000g(z).mo15997d(Alignment.ALIGN_NORMAL).mo15999f(false).mo16001h(i).mo15996a();
        } catch (C2050a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) Preconditions.m5188e(staticLayout);
    }

    /* renamed from: k */
    private void m16148k(Canvas canvas, float f, float f2) {
        int alpha = this.f13114J.getAlpha();
        canvas.translate(f, f2);
        float f3 = (float) alpha;
        this.f13114J.setAlpha((int) (this.f13130Z * f3));
        this.f13128X.draw(canvas);
        this.f13114J.setAlpha((int) (this.f13129Y * f3));
        int lineBaseline = this.f13128X.getLineBaseline(0);
        CharSequence charSequence = this.f13132b0;
        float f4 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f13114J);
        String trim = this.f13132b0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.f13114J.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f13128X.getLineEnd(0), str.length()), 0.0f, f4, this.f13114J);
    }

    /* renamed from: l */
    private void m16149l() {
        if (this.f13108D == null && !this.f13137f.isEmpty() && !TextUtils.isEmpty(this.f13105A)) {
            m16144f(0.0f);
            int width = this.f13128X.getWidth();
            int height = this.f13128X.getHeight();
            if (width > 0 && height > 0) {
                this.f13108D = Bitmap.createBitmap(width, height, Config.ARGB_8888);
                this.f13128X.draw(new Canvas(this.f13108D));
                if (this.f13109E == null) {
                    this.f13109E = new Paint(3);
                }
            }
        }
    }

    /* renamed from: p */
    private float m16150p(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) - (mo15966c() / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            return this.f13106B ? (float) this.f13138g.left : ((float) this.f13138g.right) - mo15966c();
        }
        return this.f13106B ? ((float) this.f13138g.right) - mo15966c() : (float) this.f13138g.left;
    }

    /* renamed from: q */
    private float m16151q(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) + (mo15966c() / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            return this.f13106B ? rectF.left + mo15966c() : (float) this.f13138g.right;
        }
        return this.f13106B ? (float) this.f13138g.right : rectF.left + mo15966c();
    }

    /* renamed from: s */
    private int m16152s(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f13112H;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: t */
    private int m16153t() {
        return m16152s(this.f13144m);
    }

    /* renamed from: w */
    private void m16154w(TextPaint textPaint) {
        textPaint.setTextSize(this.f13143l);
        textPaint.setTypeface(this.f13152u);
        if (VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f13126V);
        }
    }

    /* renamed from: x */
    private void m16155x(TextPaint textPaint) {
        textPaint.setTextSize(this.f13142k);
        textPaint.setTypeface(this.f13153v);
        if (VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f13127W);
        }
    }

    /* renamed from: y */
    private void m16156y(float f) {
        this.f13139h.left = m16132C((float) this.f13137f.left, (float) this.f13138g.left, f, this.f13116L);
        this.f13139h.top = m16132C(this.f13146o, this.f13147p, f, this.f13116L);
        this.f13139h.right = m16132C((float) this.f13137f.right, (float) this.f13138g.right, f, this.f13116L);
        this.f13139h.bottom = m16132C((float) this.f13137f.bottom, (float) this.f13138g.bottom, f, this.f13116L);
    }

    /* renamed from: z */
    private static boolean m16157z(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: B */
    public final boolean mo15946B() {
        ColorStateList colorStateList = this.f13145n;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f13144m;
            if (colorStateList2 == null || !colorStateList2.isStateful()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public void mo15947D() {
        this.f13135d = this.f13138g.width() > 0 && this.f13138g.height() > 0 && this.f13137f.width() > 0 && this.f13137f.height() > 0;
    }

    /* renamed from: E */
    public void mo15948E() {
        if (this.f13133c.getHeight() > 0 && this.f13133c.getWidth() > 0) {
            m16140b();
            m16142d();
        }
    }

    /* renamed from: G */
    public void mo15949G(int i, int i2, int i3, int i4) {
        if (!m16133F(this.f13138g, i, i2, i3, i4)) {
            this.f13138g.set(i, i2, i3, i4);
            this.f13113I = true;
            mo15947D();
        }
    }

    /* renamed from: H */
    public void mo15950H(Rect rect) {
        mo15949G(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: I */
    public void mo15951I(int i) {
        TextAppearance dVar = new TextAppearance(this.f13133c.getContext(), i);
        ColorStateList colorStateList = dVar.f9707a;
        if (colorStateList != null) {
            this.f13145n = colorStateList;
        }
        float f = dVar.f9720n;
        if (f != 0.0f) {
            this.f13143l = f;
        }
        ColorStateList colorStateList2 = dVar.f9710d;
        if (colorStateList2 != null) {
            this.f13121Q = colorStateList2;
        }
        this.f13119O = dVar.f9715i;
        this.f13120P = dVar.f9716j;
        this.f13118N = dVar.f9717k;
        this.f13126V = dVar.f9719m;
        CancelableFontCallback aVar = this.f13156y;
        if (aVar != null) {
            aVar.mo8087c();
        }
        this.f13156y = new CancelableFontCallback(new C2047a(), dVar.mo8089e());
        dVar.mo8092h(this.f13133c.getContext(), this.f13156y);
        mo15948E();
    }

    /* renamed from: K */
    public void mo15952K(ColorStateList colorStateList) {
        if (this.f13145n != colorStateList) {
            this.f13145n = colorStateList;
            mo15948E();
        }
    }

    /* renamed from: L */
    public void mo15953L(int i) {
        if (this.f13141j != i) {
            this.f13141j = i;
            mo15948E();
        }
    }

    /* renamed from: M */
    public void mo15954M(Typeface typeface) {
        if (m16135N(typeface)) {
            mo15948E();
        }
    }

    /* renamed from: O */
    public void mo15955O(int i, int i2, int i3, int i4) {
        if (!m16133F(this.f13137f, i, i2, i3, i4)) {
            this.f13137f.set(i, i2, i3, i4);
            this.f13113I = true;
            mo15947D();
        }
    }

    /* renamed from: P */
    public void mo15956P(Rect rect) {
        mo15955O(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: R */
    public void mo15957R(ColorStateList colorStateList) {
        if (this.f13144m != colorStateList) {
            this.f13144m = colorStateList;
            mo15948E();
        }
    }

    /* renamed from: S */
    public void mo15958S(int i) {
        if (this.f13140i != i) {
            this.f13140i = i;
            mo15948E();
        }
    }

    /* renamed from: T */
    public void mo15959T(float f) {
        if (this.f13142k != f) {
            this.f13142k = f;
            mo15948E();
        }
    }

    /* renamed from: V */
    public void mo15960V(float f) {
        float a = MathUtils.m5068a(f, 0.0f, 1.0f);
        if (a != this.f13136e) {
            this.f13136e = a;
            m16142d();
        }
    }

    /* renamed from: X */
    public void mo15961X(TimeInterpolator timeInterpolator) {
        this.f13116L = timeInterpolator;
        mo15948E();
    }

    /* renamed from: Y */
    public final boolean mo15962Y(int[] iArr) {
        this.f13112H = iArr;
        if (!mo15946B()) {
            return false;
        }
        mo15948E();
        return true;
    }

    /* renamed from: Z */
    public void mo15963Z(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f13157z, charSequence)) {
            this.f13157z = charSequence;
            this.f13105A = null;
            m16146h();
            mo15948E();
        }
    }

    /* renamed from: a0 */
    public void mo15964a0(TimeInterpolator timeInterpolator) {
        this.f13117M = timeInterpolator;
        mo15948E();
    }

    /* renamed from: b0 */
    public void mo15965b0(Typeface typeface) {
        boolean N = m16135N(typeface);
        boolean U = m16137U(typeface);
        if (N || U) {
            mo15948E();
        }
    }

    /* renamed from: c */
    public float mo15966c() {
        if (this.f13157z == null) {
            return 0.0f;
        }
        m16154w(this.f13115K);
        TextPaint textPaint = this.f13115K;
        CharSequence charSequence = this.f13157z;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: j */
    public void mo15967j(Canvas canvas) {
        int save = canvas.save();
        if (this.f13105A != null && this.f13135d) {
            boolean z = false;
            float lineLeft = (this.f13150s + this.f13128X.getLineLeft(0)) - (this.f13131a0 * 2.0f);
            this.f13114J.setTextSize(this.f13111G);
            float f = this.f13150s;
            float f2 = this.f13151t;
            if (this.f13107C && this.f13108D != null) {
                z = true;
            }
            float f3 = this.f13110F;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f13108D, f, f2, this.f13109E);
                canvas.restoreToCount(save);
                return;
            }
            if (m16141c0()) {
                m16148k(canvas, lineLeft, f2);
            } else {
                canvas.translate(f, f2);
                this.f13128X.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: m */
    public void mo15968m(RectF rectF, int i, int i2) {
        this.f13106B = m16143e(this.f13157z);
        rectF.left = m16150p(i, i2);
        rectF.top = (float) this.f13138g.top;
        rectF.right = m16151q(rectF, i, i2);
        rectF.bottom = ((float) this.f13138g.top) + mo15970o();
    }

    /* renamed from: n */
    public ColorStateList mo15969n() {
        return this.f13145n;
    }

    /* renamed from: o */
    public float mo15970o() {
        m16154w(this.f13115K);
        return -this.f13115K.ascent();
    }

    /* renamed from: r */
    public int mo15971r() {
        return m16152s(this.f13145n);
    }

    /* renamed from: u */
    public float mo15972u() {
        m16155x(this.f13115K);
        return -this.f13115K.ascent();
    }

    /* renamed from: v */
    public float mo15973v() {
        return this.f13136e;
    }
}
