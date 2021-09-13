package p067c.p068a.p069a.p114b.p133z;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.p007c.ResourcesCompat;
import androidx.core.content.p007c.ResourcesCompat.C0257a;
import p067c.p068a.p069a.p114b.C1297l;

/* renamed from: c.a.a.b.z.d */
public class TextAppearance {

    /* renamed from: a */
    public final ColorStateList f9707a;

    /* renamed from: b */
    public final ColorStateList f9708b;

    /* renamed from: c */
    public final ColorStateList f9709c;

    /* renamed from: d */
    public final ColorStateList f9710d;

    /* renamed from: e */
    public final String f9711e;

    /* renamed from: f */
    public final int f9712f;

    /* renamed from: g */
    public final int f9713g;

    /* renamed from: h */
    public final boolean f9714h;

    /* renamed from: i */
    public final float f9715i;

    /* renamed from: j */
    public final float f9716j;

    /* renamed from: k */
    public final float f9717k;

    /* renamed from: l */
    public final boolean f9718l;

    /* renamed from: m */
    public final float f9719m;

    /* renamed from: n */
    public float f9720n;

    /* renamed from: o */
    private final int f9721o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f9722p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Typeface f9723q;

    /* renamed from: c.a.a.b.z.d$a */
    /* compiled from: TextAppearance */
    class C1311a extends C0257a {

        /* renamed from: a */
        final /* synthetic */ TextAppearanceFontCallback f9724a;

        C1311a(TextAppearanceFontCallback fVar) {
            this.f9724a = fVar;
        }

        /* renamed from: d */
        public void mo1886d(int i) {
            TextAppearance.this.f9722p = true;
            this.f9724a.mo8085a(i);
        }

        /* renamed from: e */
        public void mo1887e(Typeface typeface) {
            TextAppearance dVar = TextAppearance.this;
            dVar.f9723q = Typeface.create(typeface, dVar.f9712f);
            TextAppearance.this.f9722p = true;
            this.f9724a.mo8086b(TextAppearance.this.f9723q, false);
        }
    }

    /* renamed from: c.a.a.b.z.d$b */
    /* compiled from: TextAppearance */
    class C1312b extends TextAppearanceFontCallback {

        /* renamed from: a */
        final /* synthetic */ TextPaint f9726a;

        /* renamed from: b */
        final /* synthetic */ TextAppearanceFontCallback f9727b;

        C1312b(TextPaint textPaint, TextAppearanceFontCallback fVar) {
            this.f9726a = textPaint;
            this.f9727b = fVar;
        }

        /* renamed from: a */
        public void mo8085a(int i) {
            this.f9727b.mo8085a(i);
        }

        /* renamed from: b */
        public void mo8086b(Typeface typeface, boolean z) {
            TextAppearance.this.mo8095l(this.f9726a, typeface);
            this.f9727b.mo8086b(typeface, z);
        }
    }

    public TextAppearance(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1297l.f9366U4);
        this.f9720n = obtainStyledAttributes.getDimension(C1297l.f9373V4, 0.0f);
        this.f9707a = MaterialResources.m11600a(context, obtainStyledAttributes, C1297l.f9394Y4);
        this.f9708b = MaterialResources.m11600a(context, obtainStyledAttributes, C1297l.f9401Z4);
        this.f9709c = MaterialResources.m11600a(context, obtainStyledAttributes, C1297l.f9409a5);
        this.f9712f = obtainStyledAttributes.getInt(C1297l.f9387X4, 0);
        this.f9713g = obtainStyledAttributes.getInt(C1297l.f9380W4, 1);
        int e = MaterialResources.m11604e(obtainStyledAttributes, C1297l.f9457g5, C1297l.f9449f5);
        this.f9721o = obtainStyledAttributes.getResourceId(e, 0);
        this.f9711e = obtainStyledAttributes.getString(e);
        this.f9714h = obtainStyledAttributes.getBoolean(C1297l.f9465h5, false);
        this.f9710d = MaterialResources.m11600a(context, obtainStyledAttributes, C1297l.f9417b5);
        this.f9715i = obtainStyledAttributes.getFloat(C1297l.f9425c5, 0.0f);
        this.f9716j = obtainStyledAttributes.getFloat(C1297l.f9433d5, 0.0f);
        this.f9717k = obtainStyledAttributes.getFloat(C1297l.f9441e5, 0.0f);
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C1297l.f9378W2);
            int i2 = C1297l.f9385X2;
            this.f9718l = obtainStyledAttributes2.hasValue(i2);
            this.f9719m = obtainStyledAttributes2.getFloat(i2, 0.0f);
            obtainStyledAttributes2.recycle();
            return;
        }
        this.f9718l = false;
        this.f9719m = 0.0f;
    }

    /* renamed from: d */
    private void m11611d() {
        if (this.f9723q == null) {
            String str = this.f9711e;
            if (str != null) {
                this.f9723q = Typeface.create(str, this.f9712f);
            }
        }
        if (this.f9723q == null) {
            int i = this.f9713g;
            if (i == 1) {
                this.f9723q = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f9723q = Typeface.SERIF;
            } else if (i != 3) {
                this.f9723q = Typeface.DEFAULT;
            } else {
                this.f9723q = Typeface.MONOSPACE;
            }
            this.f9723q = Typeface.create(this.f9723q, this.f9712f);
        }
    }

    /* renamed from: i */
    private boolean m11612i(Context context) {
        return TextAppearanceConfig.m11624a();
    }

    /* renamed from: e */
    public Typeface mo8089e() {
        m11611d();
        return this.f9723q;
    }

    /* renamed from: f */
    public Typeface mo8090f(Context context) {
        if (this.f9722p) {
            return this.f9723q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b = ResourcesCompat.m1812b(context, this.f9721o);
                this.f9723q = b;
                if (b != null) {
                    this.f9723q = Typeface.create(b, this.f9712f);
                }
            } catch (NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.f9711e);
                Log.d("TextAppearance", sb.toString(), e);
            }
        }
        m11611d();
        this.f9722p = true;
        return this.f9723q;
    }

    /* renamed from: g */
    public void mo8091g(Context context, TextPaint textPaint, TextAppearanceFontCallback fVar) {
        mo8095l(textPaint, mo8089e());
        mo8092h(context, new C1312b(textPaint, fVar));
    }

    /* renamed from: h */
    public void mo8092h(Context context, TextAppearanceFontCallback fVar) {
        if (m11612i(context)) {
            mo8090f(context);
        } else {
            m11611d();
        }
        int i = this.f9721o;
        if (i == 0) {
            this.f9722p = true;
        }
        if (this.f9722p) {
            fVar.mo8086b(this.f9723q, true);
            return;
        }
        try {
            ResourcesCompat.m1814d(context, i, new C1311a(fVar), null);
        } catch (NotFoundException unused) {
            this.f9722p = true;
            fVar.mo8085a(1);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.f9711e);
            Log.d("TextAppearance", sb.toString(), e);
            this.f9722p = true;
            fVar.mo8085a(-3);
        }
    }

    /* renamed from: j */
    public void mo8093j(Context context, TextPaint textPaint, TextAppearanceFontCallback fVar) {
        mo8094k(context, textPaint, fVar);
        ColorStateList colorStateList = this.f9707a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f9717k;
        float f2 = this.f9715i;
        float f3 = this.f9716j;
        ColorStateList colorStateList2 = this.f9710d;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: k */
    public void mo8094k(Context context, TextPaint textPaint, TextAppearanceFontCallback fVar) {
        if (m11612i(context)) {
            mo8095l(textPaint, mo8090f(context));
        } else {
            mo8091g(context, textPaint, fVar);
        }
    }

    /* renamed from: l */
    public void mo8095l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.f9712f;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f9720n);
        if (VERSION.SDK_INT >= 21 && this.f9718l) {
            textPaint.setLetterSpacing(this.f9719m);
        }
    }
}
