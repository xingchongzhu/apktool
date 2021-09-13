package p010b.p011a.p014l.p015a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.p007c.TypedArrayUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p011a.p016m.C0526b;
import p010b.p025d.LongSparseArray;
import p010b.p025d.SparseArrayCompat;
import p010b.p063q.p064a.p065a.AnimatedVectorDrawableCompat;
import p010b.p063q.p064a.p065a.VectorDrawableCompat;

@SuppressLint({"RestrictedAPI"})
/* renamed from: b.a.l.a.a */
public class AnimatedStateListDrawableCompat extends StateListDrawable implements TintAwareDrawable {

    /* renamed from: o */
    private static final String f3690o = AnimatedStateListDrawableCompat.class.getSimpleName();

    /* renamed from: p */
    private C0515c f3691p;

    /* renamed from: q */
    private C0519g f3692q;

    /* renamed from: r */
    private int f3693r;

    /* renamed from: s */
    private int f3694s;

    /* renamed from: t */
    private boolean f3695t;

    /* renamed from: b.a.l.a.a$b */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C0514b extends C0519g {

        /* renamed from: a */
        private final Animatable f3696a;

        C0514b(Animatable animatable) {
            super();
            this.f3696a = animatable;
        }

        /* renamed from: c */
        public void mo4106c() {
            this.f3696a.start();
        }

        /* renamed from: d */
        public void mo4107d() {
            this.f3696a.stop();
        }
    }

    /* renamed from: b.a.l.a.a$c */
    /* compiled from: AnimatedStateListDrawableCompat */
    static class C0515c extends C0524a {

        /* renamed from: K */
        LongSparseArray<Long> f3697K;

        /* renamed from: L */
        SparseArrayCompat<Integer> f3698L;

        C0515c(C0515c cVar, AnimatedStateListDrawableCompat aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f3697K = cVar.f3697K;
                this.f3698L = cVar.f3698L;
                return;
            }
            this.f3697K = new LongSparseArray<>();
            this.f3698L = new SparseArrayCompat<>();
        }

        /* renamed from: D */
        private static long m4161D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: B */
        public int mo4108B(int[] iArr, Drawable drawable, int i) {
            int z = super.mo4191z(iArr, drawable);
            this.f3698L.mo4530i(z, Integer.valueOf(i));
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: C */
        public int mo4109C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo4136a(drawable);
            long D = m4161D(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f3697K.mo4413a(D, Long.valueOf(j2 | j));
            if (z) {
                this.f3697K.mo4413a(m4161D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: E */
        public int mo4110E(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f3698L.mo4527f(i, Integer.valueOf(0))).intValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: F */
        public int mo4111F(int[] iArr) {
            int A = super.mo4190A(iArr);
            if (A >= 0) {
                return A;
            }
            return super.mo4190A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: G */
        public int mo4112G(int i, int i2) {
            return (int) ((Long) this.f3697K.mo4418f(m4161D(i, i2), Long.valueOf(-1))).longValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: H */
        public boolean mo4113H(int i, int i2) {
            return (((Long) this.f3697K.mo4418f(m4161D(i, i2), Long.valueOf(-1))).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: I */
        public boolean mo4114I(int i, int i2) {
            return (((Long) this.f3697K.mo4418f(m4161D(i, i2), Long.valueOf(-1))).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public void mo4117r() {
            this.f3697K = this.f3697K.clone();
            this.f3698L = this.f3698L.clone();
        }

        public Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    /* renamed from: b.a.l.a.a$d */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C0516d extends C0519g {

        /* renamed from: a */
        private final AnimatedVectorDrawableCompat f3699a;

        C0516d(AnimatedVectorDrawableCompat cVar) {
            super();
            this.f3699a = cVar;
        }

        /* renamed from: c */
        public void mo4106c() {
            this.f3699a.start();
        }

        /* renamed from: d */
        public void mo4107d() {
            this.f3699a.stop();
        }
    }

    /* renamed from: b.a.l.a.a$e */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C0517e extends C0519g {

        /* renamed from: a */
        private final ObjectAnimator f3700a;

        /* renamed from: b */
        private final boolean f3701b;

        C0517e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C0518f fVar = new C0518f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.mo4120a());
            ofInt.setInterpolator(fVar);
            this.f3701b = z2;
            this.f3700a = ofInt;
        }

        /* renamed from: a */
        public boolean mo4118a() {
            return this.f3701b;
        }

        /* renamed from: b */
        public void mo4119b() {
            this.f3700a.reverse();
        }

        /* renamed from: c */
        public void mo4106c() {
            this.f3700a.start();
        }

        /* renamed from: d */
        public void mo4107d() {
            this.f3700a.cancel();
        }
    }

    /* renamed from: b.a.l.a.a$f */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C0518f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f3702a;

        /* renamed from: b */
        private int f3703b;

        /* renamed from: c */
        private int f3704c;

        C0518f(AnimationDrawable animationDrawable, boolean z) {
            mo4121b(animationDrawable, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4120a() {
            return this.f3704c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo4121b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f3703b = numberOfFrames;
            int[] iArr = this.f3702a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f3702a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f3702a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f3704c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f3704c)) + 0.5f);
            int i2 = this.f3703b;
            int[] iArr = this.f3702a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f3704c) : 0.0f);
        }
    }

    /* renamed from: b.a.l.a.a$g */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static abstract class C0519g {
        private C0519g() {
        }

        /* renamed from: a */
        public boolean mo4118a() {
            return false;
        }

        /* renamed from: b */
        public void mo4119b() {
        }

        /* renamed from: c */
        public abstract void mo4106c();

        /* renamed from: d */
        public abstract void mo4107d();
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    /* renamed from: m */
    public static AnimatedStateListDrawableCompat m4147m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            AnimatedStateListDrawableCompat aVar = new AnimatedStateListDrawableCompat();
            aVar.mo4094n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: o */
    private void m4148o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m4150q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m4151r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private void m4149p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m4150q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k = TypedArrayUtils.m1835k(resources, theme, attributeSet, C0526b.f3766h);
        int resourceId = k.getResourceId(C0526b.f3767i, 0);
        int resourceId2 = k.getResourceId(C0526b.f3768j, -1);
        Drawable j = resourceId2 > 0 ? ResourceManagerInternal.m1267h().mo1625j(context, resourceId2) : null;
        k.recycle();
        int[] k2 = mo4189k(attributeSet);
        String str = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("vector")) {
                j = VectorDrawableCompat.m6171c(resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j != null) {
            return this.f3691p.mo4108B(k2, j, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(str);
        throw new XmlPullParserException(sb2.toString());
    }

    /* renamed from: r */
    private int m4151r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k = TypedArrayUtils.m1835k(resources, theme, attributeSet, C0526b.f3769k);
        int resourceId = k.getResourceId(C0526b.f3772n, -1);
        int resourceId2 = k.getResourceId(C0526b.f3771m, -1);
        int resourceId3 = k.getResourceId(C0526b.f3770l, -1);
        Drawable j = resourceId3 > 0 ? ResourceManagerInternal.m1267h().mo1625j(context, resourceId3) : null;
        boolean z = k.getBoolean(C0526b.f3773o, false);
        k.recycle();
        String str = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                j = AnimatedVectorDrawableCompat.m6138a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(str);
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f3691p.mo4109C(resourceId, resourceId2, j, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    /* renamed from: s */
    private boolean m4152s(int i) {
        int i2;
        C0519g gVar;
        C0519g gVar2 = this.f3692q;
        if (gVar2 == null) {
            i2 = mo4124c();
        } else if (i == this.f3693r) {
            return true;
        } else {
            if (i != this.f3694s || !gVar2.mo4118a()) {
                i2 = this.f3693r;
                gVar2.mo4107d();
            } else {
                gVar2.mo4119b();
                this.f3693r = this.f3694s;
                this.f3694s = i;
                return true;
            }
        }
        this.f3692q = null;
        this.f3694s = -1;
        this.f3693r = -1;
        C0515c cVar = this.f3691p;
        int E = cVar.mo4110E(i2);
        int E2 = cVar.mo4110E(i);
        if (!(E2 == 0 || E == 0)) {
            int G = cVar.mo4112G(E, E2);
            if (G < 0) {
                return false;
            }
            boolean I = cVar.mo4114I(E, E2);
            mo4125g(G);
            Drawable current = getCurrent();
            if (current instanceof AnimationDrawable) {
                gVar = new C0517e((AnimationDrawable) current, cVar.mo4113H(E, E2), I);
            } else if (current instanceof AnimatedVectorDrawableCompat) {
                gVar = new C0516d((AnimatedVectorDrawableCompat) current);
            } else if (current instanceof Animatable) {
                gVar = new C0514b((Animatable) current);
            }
            gVar.mo4106c();
            this.f3692q = gVar;
            this.f3694s = i2;
            this.f3693r = i;
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private void m4153t(TypedArray typedArray) {
        C0515c cVar = this.f3691p;
        if (VERSION.SDK_INT >= 21) {
            cVar.f3731d |= typedArray.getChangingConfigurations();
        }
        cVar.mo4158x(typedArray.getBoolean(C0526b.f3762d, cVar.f3736i));
        cVar.mo4154t(typedArray.getBoolean(C0526b.f3763e, cVar.f3739l));
        cVar.mo4155u(typedArray.getInt(C0526b.f3764f, cVar.f3719A));
        cVar.mo4156v(typedArray.getInt(C0526b.f3765g, cVar.f3720B));
        setDither(typedArray.getBoolean(C0526b.f3760b, cVar.f3751x));
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4086h(C0523d dVar) {
        super.mo4086h(dVar);
        if (dVar instanceof C0515c) {
            this.f3691p = (C0515c) dVar;
        }
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C0519g gVar = this.f3692q;
        if (gVar != null) {
            gVar.mo4107d();
            this.f3692q = null;
            mo4125g(this.f3693r);
            this.f3693r = -1;
            this.f3694s = -1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public C0515c mo4090j() {
        return new C0515c(this.f3691p, this, null);
    }

    public Drawable mutate() {
        if (!this.f3695t && super.mutate() == this) {
            this.f3691p.mo4117r();
            this.f3695t = true;
        }
        return this;
    }

    /* renamed from: n */
    public void mo4094n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        TypedArray k = TypedArrayUtils.m1835k(resources, theme, attributeSet, C0526b.f3759a);
        setVisible(k.getBoolean(C0526b.f3761c, true), true);
        m4153t(k);
        mo4127i(resources);
        k.recycle();
        m4148o(context, resources, xmlPullParser, attributeSet, theme);
        m4149p();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F = this.f3691p.mo4111F(iArr);
        boolean z = F != mo4124c() && (m4152s(F) || mo4125g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C0519g gVar = this.f3692q;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo4106c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    AnimatedStateListDrawableCompat(C0515c cVar, Resources resources) {
        super(null);
        this.f3693r = -1;
        this.f3694s = -1;
        mo4086h(new C0515c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
