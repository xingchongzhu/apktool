package p067c.p068a.p069a.p114b.p120n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.TextDrawableHelper.C2052b;
import com.google.android.material.internal.ThemeEnforcement;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.C1294i;
import p067c.p068a.p069a.p114b.C1295j;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;
import p067c.p068a.p069a.p114b.p133z.TextAppearance;

/* renamed from: c.a.a.b.n.a */
public class BadgeDrawable extends Drawable implements C2052b {

    /* renamed from: a */
    private static final int f9634a = C1296k.Widget_MaterialComponents_Badge;

    /* renamed from: b */
    private static final int f9635b = C1270b.badgeStyle;

    /* renamed from: c */
    private final WeakReference<Context> f9636c;

    /* renamed from: d */
    private final MaterialShapeDrawable f9637d = new MaterialShapeDrawable();

    /* renamed from: e */
    private final TextDrawableHelper f9638e;

    /* renamed from: f */
    private final Rect f9639f = new Rect();

    /* renamed from: g */
    private final float f9640g;

    /* renamed from: h */
    private final float f9641h;

    /* renamed from: i */
    private final float f9642i;

    /* renamed from: j */
    private final C1299b f9643j;

    /* renamed from: k */
    private float f9644k;

    /* renamed from: l */
    private float f9645l;

    /* renamed from: m */
    private int f9646m;

    /* renamed from: n */
    private float f9647n;

    /* renamed from: o */
    private float f9648o;

    /* renamed from: p */
    private float f9649p;

    /* renamed from: q */
    private WeakReference<View> f9650q;

    /* renamed from: r */
    private WeakReference<FrameLayout> f9651r;

    /* renamed from: c.a.a.b.n.a$a */
    /* compiled from: BadgeDrawable */
    class C1298a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f9652a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f9653b;

        C1298a(View view, FrameLayout frameLayout) {
            this.f9652a = view;
            this.f9653b = frameLayout;
        }

        public void run() {
            BadgeDrawable.this.mo7998y(this.f9652a, this.f9653b);
        }
    }

    /* renamed from: c.a.a.b.n.a$b */
    /* compiled from: BadgeDrawable */
    public static final class C1299b implements Parcelable {
        public static final Creator<C1299b> CREATOR = new C1300a();
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f9655a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f9656b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f9657c = 255;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f9658d = -1;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f9659e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public CharSequence f9660f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f9661g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f9662h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f9663i;

        /* renamed from: j */
        private boolean f9664j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f9665k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f9666l;

        /* renamed from: c.a.a.b.n.a$b$a */
        /* compiled from: BadgeDrawable */
        static class C1300a implements Creator<C1299b> {
            C1300a() {
            }

            /* renamed from: a */
            public C1299b createFromParcel(Parcel parcel) {
                return new C1299b(parcel);
            }

            /* renamed from: b */
            public C1299b[] newArray(int i) {
                return new C1299b[i];
            }
        }

        public C1299b(Context context) {
            this.f9656b = new TextAppearance(context, C1296k.TextAppearance_MaterialComponents_Badge).f9707a.getDefaultColor();
            this.f9660f = context.getString(C1295j.mtrl_badge_numberless_content_description);
            this.f9661g = C1294i.mtrl_badge_content_description;
            this.f9662h = C1295j.mtrl_exceed_max_badge_number_content_description;
            this.f9664j = true;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9655a);
            parcel.writeInt(this.f9656b);
            parcel.writeInt(this.f9657c);
            parcel.writeInt(this.f9658d);
            parcel.writeInt(this.f9659e);
            parcel.writeString(this.f9660f.toString());
            parcel.writeInt(this.f9661g);
            parcel.writeInt(this.f9663i);
            parcel.writeInt(this.f9665k);
            parcel.writeInt(this.f9666l);
            parcel.writeInt(this.f9664j ? 1 : 0);
        }

        protected C1299b(Parcel parcel) {
            this.f9655a = parcel.readInt();
            this.f9656b = parcel.readInt();
            this.f9657c = parcel.readInt();
            this.f9658d = parcel.readInt();
            this.f9659e = parcel.readInt();
            this.f9660f = parcel.readString();
            this.f9661g = parcel.readInt();
            this.f9663i = parcel.readInt();
            this.f9665k = parcel.readInt();
            this.f9666l = parcel.readInt();
            this.f9664j = parcel.readInt() != 0;
        }
    }

    private BadgeDrawable(Context context) {
        this.f9636c = new WeakReference<>(context);
        ThemeEnforcement.m16223c(context);
        Resources resources = context.getResources();
        this.f9640g = (float) resources.getDimensionPixelSize(C1288d.mtrl_badge_radius);
        this.f9642i = (float) resources.getDimensionPixelSize(C1288d.mtrl_badge_long_text_horizontal_padding);
        this.f9641h = (float) resources.getDimensionPixelSize(C1288d.mtrl_badge_with_text_radius);
        TextDrawableHelper hVar = new TextDrawableHelper(this);
        this.f9638e = hVar;
        hVar.mo16003e().setTextAlign(Align.CENTER);
        this.f9643j = new C1299b(context);
        m11512u(C1296k.TextAppearance_MaterialComponents_Badge);
    }

    /* renamed from: A */
    private void m11503A() {
        double i = (double) mo7984i();
        Double.isNaN(i);
        this.f9646m = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
    }

    /* renamed from: b */
    private void m11504b(Context context, Rect rect, View view) {
        float f;
        float f2;
        int t = this.f9643j.f9663i;
        if (t == 8388691 || t == 8388693) {
            this.f9645l = (float) (rect.bottom - this.f9643j.f9666l);
        } else {
            this.f9645l = (float) (rect.top + this.f9643j.f9666l);
        }
        if (mo7986j() <= 9) {
            float f3 = !mo7987k() ? this.f9640g : this.f9641h;
            this.f9647n = f3;
            this.f9649p = f3;
            this.f9648o = f3;
        } else {
            float f4 = this.f9641h;
            this.f9647n = f4;
            this.f9649p = f4;
            this.f9648o = (this.f9638e.mo16004f(m11508f()) / 2.0f) + this.f9642i;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mo7987k() ? C1288d.mtrl_badge_text_horizontal_edge_offset : C1288d.mtrl_badge_horizontal_edge_offset);
        int t2 = this.f9643j.f9663i;
        if (t2 == 8388659 || t2 == 8388691) {
            if (ViewCompat.m5514C(view) == 0) {
                f = (((float) rect.left) - this.f9648o) + ((float) dimensionPixelSize) + ((float) this.f9643j.f9665k);
            } else {
                f = ((((float) rect.right) + this.f9648o) - ((float) dimensionPixelSize)) - ((float) this.f9643j.f9665k);
            }
            this.f9644k = f;
            return;
        }
        if (ViewCompat.m5514C(view) == 0) {
            f2 = ((((float) rect.right) + this.f9648o) - ((float) dimensionPixelSize)) - ((float) this.f9643j.f9665k);
        } else {
            f2 = (((float) rect.left) - this.f9648o) + ((float) dimensionPixelSize) + ((float) this.f9643j.f9665k);
        }
        this.f9644k = f2;
    }

    /* renamed from: c */
    public static BadgeDrawable m11505c(Context context) {
        return m11506d(context, null, f9635b, f9634a);
    }

    /* renamed from: d */
    private static BadgeDrawable m11506d(Context context, AttributeSet attributeSet, int i, int i2) {
        BadgeDrawable aVar = new BadgeDrawable(context);
        aVar.m11509l(context, attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: e */
    private void m11507e(Canvas canvas) {
        Rect rect = new Rect();
        String f = m11508f();
        this.f9638e.mo16003e().getTextBounds(f, 0, f.length(), rect);
        canvas.drawText(f, this.f9644k, this.f9645l + ((float) (rect.height() / 2)), this.f9638e.mo16003e());
    }

    /* renamed from: f */
    private String m11508f() {
        if (mo7986j() <= this.f9646m) {
            return NumberFormat.getInstance().format((long) mo7986j());
        }
        Context context = (Context) this.f9636c.get();
        if (context == null) {
            return "";
        }
        return context.getString(C1295j.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.f9646m), "+"});
    }

    /* renamed from: l */
    private void m11509l(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray h = ThemeEnforcement.m16228h(context, attributeSet, C1297l.f9563u, i, i2, new int[0]);
        mo7993r(h.getInt(C1297l.f9603z, 4));
        int i3 = C1297l.f9214A;
        if (h.hasValue(i3)) {
            mo7994s(h.getInt(i3, 0));
        }
        mo7988n(m11510m(context, h, C1297l.f9571v));
        int i4 = C1297l.f9587x;
        if (h.hasValue(i4)) {
            mo7991p(m11510m(context, h, i4));
        }
        mo7989o(h.getInt(C1297l.f9579w, 8388661));
        mo7992q(h.getDimensionPixelOffset(C1297l.f9595y, 0));
        mo7997v(h.getDimensionPixelOffset(C1297l.f9222B, 0));
        h.recycle();
    }

    /* renamed from: m */
    private static int m11510m(Context context, TypedArray typedArray, int i) {
        return MaterialResources.m11600a(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: t */
    private void m11511t(TextAppearance dVar) {
        if (this.f9638e.mo16002d() != dVar) {
            Context context = (Context) this.f9636c.get();
            if (context != null) {
                this.f9638e.mo16006h(dVar, context);
                m11515z();
            }
        }
    }

    /* renamed from: u */
    private void m11512u(int i) {
        Context context = (Context) this.f9636c.get();
        if (context != null) {
            m11511t(new TextAppearance(context, i));
        }
    }

    /* renamed from: w */
    private void m11513w(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C1291f.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.f9651r;
            if (weakReference == null || weakReference.get() != viewGroup) {
                m11514x(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C1291f.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f9651r = new WeakReference<>(frameLayout);
                frameLayout.post(new C1298a(view, frameLayout));
            }
        }
    }

    /* renamed from: x */
    private static void m11514x(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: z */
    private void m11515z() {
        Context context = (Context) this.f9636c.get();
        WeakReference<View> weakReference = this.f9650q;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f9639f);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f9651r;
            if (weakReference2 != null) {
                viewGroup = (FrameLayout) weakReference2.get();
            }
            if (viewGroup != null || BadgeUtils.f9667a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m11504b(context, rect2, view);
            BadgeUtils.m11552d(this.f9639f, this.f9644k, this.f9645l, this.f9648o, this.f9649p);
            this.f9637d.mo7840U(this.f9647n);
            if (!rect.equals(this.f9639f)) {
                this.f9637d.setBounds(this.f9639f);
            }
        }
    }

    /* renamed from: a */
    public void mo7976a() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f9637d.draw(canvas);
            if (mo7987k()) {
                m11507e(canvas);
            }
        }
    }

    /* renamed from: g */
    public CharSequence mo7978g() {
        if (!isVisible()) {
            return null;
        }
        if (!mo7987k()) {
            return this.f9643j.f9660f;
        }
        if (this.f9643j.f9661g <= 0) {
            return null;
        }
        Context context = (Context) this.f9636c.get();
        if (context == null) {
            return null;
        }
        if (mo7986j() <= this.f9646m) {
            return context.getResources().getQuantityString(this.f9643j.f9661g, mo7986j(), new Object[]{Integer.valueOf(mo7986j())});
        }
        return context.getString(this.f9643j.f9662h, new Object[]{Integer.valueOf(this.f9646m)});
    }

    public int getAlpha() {
        return this.f9643j.f9657c;
    }

    public int getIntrinsicHeight() {
        return this.f9639f.height();
    }

    public int getIntrinsicWidth() {
        return this.f9639f.width();
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public FrameLayout mo7983h() {
        WeakReference<FrameLayout> weakReference = this.f9651r;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    /* renamed from: i */
    public int mo7984i() {
        return this.f9643j.f9659e;
    }

    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public int mo7986j() {
        if (!mo7987k()) {
            return 0;
        }
        return this.f9643j.f9658d;
    }

    /* renamed from: k */
    public boolean mo7987k() {
        return this.f9643j.f9658d != -1;
    }

    /* renamed from: n */
    public void mo7988n(int i) {
        this.f9643j.f9655a = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f9637d.mo7872x() != valueOf) {
            this.f9637d.mo7843X(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public void mo7989o(int i) {
        if (this.f9643j.f9663i != i) {
            this.f9643j.f9663i = i;
            WeakReference<View> weakReference = this.f9650q;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f9650q.get();
                WeakReference<FrameLayout> weakReference2 = this.f9651r;
                mo7998y(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
            }
        }
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: p */
    public void mo7991p(int i) {
        this.f9643j.f9656b = i;
        if (this.f9638e.mo16003e().getColor() != i) {
            this.f9638e.mo16003e().setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public void mo7992q(int i) {
        this.f9643j.f9665k = i;
        m11515z();
    }

    /* renamed from: r */
    public void mo7993r(int i) {
        if (this.f9643j.f9659e != i) {
            this.f9643j.f9659e = i;
            m11503A();
            this.f9638e.mo16007i(true);
            m11515z();
            invalidateSelf();
        }
    }

    /* renamed from: s */
    public void mo7994s(int i) {
        int max = Math.max(0, i);
        if (this.f9643j.f9658d != max) {
            this.f9643j.f9658d = max;
            this.f9638e.mo16007i(true);
            m11515z();
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        this.f9643j.f9657c = i;
        this.f9638e.mo16003e().setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: v */
    public void mo7997v(int i) {
        this.f9643j.f9666l = i;
        m11515z();
    }

    /* renamed from: y */
    public void mo7998y(View view, FrameLayout frameLayout) {
        this.f9650q = new WeakReference<>(view);
        boolean z = BadgeUtils.f9667a;
        if (!z || frameLayout != null) {
            this.f9651r = new WeakReference<>(frameLayout);
        } else {
            m11513w(view);
        }
        if (!z) {
            m11514x(view);
        }
        m11515z();
        invalidateSelf();
    }
}
