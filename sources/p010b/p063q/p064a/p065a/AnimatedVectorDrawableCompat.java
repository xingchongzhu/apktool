package p010b.p063q.p064a.p065a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.core.content.p007c.TypedArrayUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p025d.ArrayMap;

/* renamed from: b.q.a.a.c */
public class AnimatedVectorDrawableCompat extends VectorDrawableCommon implements Animatable {

    /* renamed from: b */
    private C0736b f5155b;

    /* renamed from: c */
    private Context f5156c;

    /* renamed from: d */
    private ArgbEvaluator f5157d;

    /* renamed from: e */
    private AnimatorListener f5158e;

    /* renamed from: f */
    ArrayList<Animatable2Compat> f5159f;

    /* renamed from: g */
    final Callback f5160g;

    /* renamed from: b.q.a.a.c$a */
    /* compiled from: AnimatedVectorDrawableCompat */
    class C0735a implements Callback {
        C0735a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            AnimatedVectorDrawableCompat.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: b.q.a.a.c$b */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C0736b extends ConstantState {

        /* renamed from: a */
        int f5162a;

        /* renamed from: b */
        VectorDrawableCompat f5163b;

        /* renamed from: c */
        AnimatorSet f5164c;

        /* renamed from: d */
        ArrayList<Animator> f5165d;

        /* renamed from: e */
        ArrayMap<Animator, String> f5166e;

        public C0736b(Context context, C0736b bVar, Callback callback, Resources resources) {
            if (bVar != null) {
                this.f5162a = bVar.f5162a;
                VectorDrawableCompat iVar = bVar.f5163b;
                if (iVar != null) {
                    ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f5163b = (VectorDrawableCompat) constantState.newDrawable(resources);
                    } else {
                        this.f5163b = (VectorDrawableCompat) constantState.newDrawable();
                    }
                    VectorDrawableCompat iVar2 = (VectorDrawableCompat) this.f5163b.mutate();
                    this.f5163b = iVar2;
                    iVar2.setCallback(callback);
                    this.f5163b.setBounds(bVar.f5163b.getBounds());
                    this.f5163b.mo5521h(false);
                }
                ArrayList<Animator> arrayList = bVar.f5165d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f5165d = new ArrayList<>(size);
                    this.f5166e = new ArrayMap<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) bVar.f5165d.get(i);
                        Animator clone = animator.clone();
                        String str = (String) bVar.f5166e.get(animator);
                        clone.setTarget(this.f5163b.mo5512d(str));
                        this.f5165d.add(clone);
                        this.f5166e.put(clone, str);
                    }
                    mo5498a();
                }
            }
        }

        /* renamed from: a */
        public void mo5498a() {
            if (this.f5164c == null) {
                this.f5164c = new AnimatorSet();
            }
            this.f5164c.playTogether(this.f5165d);
        }

        public int getChangingConfigurations() {
            return this.f5162a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: b.q.a.a.c$c */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C0737c extends ConstantState {

        /* renamed from: a */
        private final ConstantState f5167a;

        public C0737c(ConstantState constantState) {
            this.f5167a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f5167a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f5167a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            AnimatedVectorDrawableCompat cVar = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f5167a.newDrawable();
            cVar.f5172a = newDrawable;
            newDrawable.setCallback(cVar.f5160g);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat cVar = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f5167a.newDrawable(resources);
            cVar.f5172a = newDrawable;
            newDrawable.setCallback(cVar.f5160g);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            AnimatedVectorDrawableCompat cVar = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f5167a.newDrawable(resources, theme);
            cVar.f5172a = newDrawable;
            newDrawable.setCallback(cVar.f5160g);
            return cVar;
        }
    }

    AnimatedVectorDrawableCompat() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static AnimatedVectorDrawableCompat m6138a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        AnimatedVectorDrawableCompat cVar = new AnimatedVectorDrawableCompat(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: b */
    private void m6139b(String str, Animator animator) {
        animator.setTarget(this.f5155b.f5163b.mo5512d(str));
        if (VERSION.SDK_INT < 21) {
            m6140c(animator);
        }
        C0736b bVar = this.f5155b;
        if (bVar.f5165d == null) {
            bVar.f5165d = new ArrayList<>();
            this.f5155b.f5166e = new ArrayMap<>();
        }
        this.f5155b.f5165d.add(animator);
        this.f5155b.f5166e.put(animator, str);
    }

    /* renamed from: c */
    private void m6140c(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m6140c((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f5157d == null) {
                    this.f5157d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f5157d);
            }
        }
    }

    public void applyTheme(Theme theme) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            DrawableCompat.m1842a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return DrawableCompat.m1843b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f5155b.f5163b.draw(canvas);
        if (this.f5155b.f5164c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return DrawableCompat.m1845d(drawable);
        }
        return this.f5155b.f5163b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5155b.f5162a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return DrawableCompat.m1846e(drawable);
        }
        return this.f5155b.f5163b.getColorFilter();
    }

    public ConstantState getConstantState() {
        if (this.f5172a == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0737c(this.f5172a.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f5155b.f5163b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f5155b.f5163b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f5155b.f5163b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            DrawableCompat.m1848g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k = TypedArrayUtils.m1835k(resources, theme, attributeSet, AndroidResources.f5147e);
                    int resourceId = k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        VectorDrawableCompat b = VectorDrawableCompat.m6170b(resources, resourceId, theme);
                        b.mo5521h(false);
                        b.setCallback(this.f5160g);
                        VectorDrawableCompat iVar = this.f5155b.f5163b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f5155b.f5163b = b;
                    }
                    k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AndroidResources.f5148f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f5156c;
                        if (context != null) {
                            m6139b(string, AnimatorInflaterCompat.m6152i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f5155b.mo5498a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return DrawableCompat.m1849h(drawable);
        }
        return this.f5155b.f5163b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f5155b.f5164c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f5155b.f5163b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5155b.f5163b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f5155b.f5163b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f5155b.f5163b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f5155b.f5163b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            DrawableCompat.m1851j(drawable, z);
        } else {
            this.f5155b.f5163b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            DrawableCompat.m1855n(drawable, i);
        } else {
            this.f5155b.f5163b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            DrawableCompat.m1856o(drawable, colorStateList);
        } else {
            this.f5155b.f5163b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            DrawableCompat.m1857p(drawable, mode);
        } else {
            this.f5155b.f5163b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f5155b.f5163b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f5155b.f5164c.isStarted()) {
            this.f5155b.f5164c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5155b.f5164c.end();
        }
    }

    private AnimatedVectorDrawableCompat(Context context) {
        this(context, null, null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5172a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5155b.f5163b.setColorFilter(colorFilter);
        }
    }

    private AnimatedVectorDrawableCompat(Context context, C0736b bVar, Resources resources) {
        this.f5157d = null;
        this.f5158e = null;
        this.f5159f = null;
        C0735a aVar = new C0735a();
        this.f5160g = aVar;
        this.f5156c = context;
        if (bVar != null) {
            this.f5155b = bVar;
        } else {
            this.f5155b = new C0736b(context, bVar, aVar, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
