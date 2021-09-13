package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C0491e;
import androidx.viewpager.widget.ViewPager.C0495i;
import androidx.viewpager.widget.ViewPager.C0496j;
import com.google.android.material.internal.C2053k;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.p198a.MaterialThemeOverlay;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p010b.p011a.C0511j;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p042j.C0610e;
import p010b.p034g.p042j.C0611f;
import p010b.p034g.p042j.C0612g;
import p010b.p034g.p043k.MarginLayoutParamsCompat;
import p010b.p034g.p043k.PointerIconCompat;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0634a;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0635b;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0636c;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1293h;
import p067c.p068a.p069a.p114b.C1295j;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeUtils;
import p067c.p068a.p069a.p114b.p119m.AnimationUtils;
import p067c.p068a.p069a.p114b.p120n.BadgeDrawable;
import p067c.p068a.p069a.p114b.p120n.BadgeUtils;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;

@C0491e
public class TabLayout extends HorizontalScrollView {

    /* renamed from: a */
    private static final int f13230a = C1296k.Widget_Design_TabLayout;

    /* renamed from: b */
    private static final C0610e<C2073g> f13231b = new C0612g(16);

    /* renamed from: A */
    int f13232A;

    /* renamed from: B */
    int f13233B;

    /* renamed from: C */
    boolean f13234C;

    /* renamed from: D */
    boolean f13235D;

    /* renamed from: G */
    int f13236G;

    /* renamed from: H */
    boolean f13237H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public TabIndicatorInterpolator f13238I;

    /* renamed from: J */
    private C2067c f13239J;

    /* renamed from: K */
    private final ArrayList<C2067c> f13240K;

    /* renamed from: L */
    private C2067c f13241L;

    /* renamed from: M */
    private ValueAnimator f13242M;

    /* renamed from: N */
    ViewPager f13243N;

    /* renamed from: O */
    private PagerAdapter f13244O;

    /* renamed from: P */
    private DataSetObserver f13245P;

    /* renamed from: Q */
    private C2074h f13246Q;

    /* renamed from: R */
    private C2066b f13247R;

    /* renamed from: S */
    private boolean f13248S;

    /* renamed from: T */
    private final C0610e<C2075i> f13249T;

    /* renamed from: c */
    private final ArrayList<C2073g> f13250c;

    /* renamed from: d */
    private C2073g f13251d;

    /* renamed from: e */
    final C2070f f13252e;

    /* renamed from: f */
    int f13253f;

    /* renamed from: g */
    int f13254g;

    /* renamed from: h */
    int f13255h;

    /* renamed from: i */
    int f13256i;

    /* renamed from: j */
    int f13257j;

    /* renamed from: k */
    ColorStateList f13258k;

    /* renamed from: l */
    ColorStateList f13259l;

    /* renamed from: m */
    ColorStateList f13260m;

    /* renamed from: n */
    Drawable f13261n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f13262o;

    /* renamed from: p */
    Mode f13263p;

    /* renamed from: q */
    float f13264q;

    /* renamed from: r */
    float f13265r;

    /* renamed from: s */
    final int f13266s;

    /* renamed from: t */
    int f13267t;

    /* renamed from: u */
    private final int f13268u;

    /* renamed from: v */
    private final int f13269v;

    /* renamed from: w */
    private final int f13270w;

    /* renamed from: x */
    private int f13271x;

    /* renamed from: y */
    int f13272y;

    /* renamed from: z */
    int f13273z;

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    class C2065a implements AnimatorUpdateListener {
        C2065a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    private class C2066b implements C0495i {

        /* renamed from: a */
        private boolean f13275a;

        C2066b() {
        }

        /* renamed from: a */
        public void mo4048a(ViewPager viewPager, PagerAdapter aVar, PagerAdapter aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f13243N == viewPager) {
                tabLayout.mo16056I(aVar2, this.f13275a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo16117b(boolean z) {
            this.f13275a = z;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface C2067c<T extends C2073g> {
        /* renamed from: a */
        void mo16118a(T t);

        /* renamed from: b */
        void mo16119b(T t);

        /* renamed from: c */
        void mo16120c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface C2068d extends C2067c<C2073g> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    private class C2069e extends DataSetObserver {
        C2069e() {
        }

        public void onChanged() {
            TabLayout.this.mo16050B();
        }

        public void onInvalidated() {
            TabLayout.this.mo16050B();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    class C2070f extends LinearLayout {

        /* renamed from: a */
        ValueAnimator f13278a;

        /* renamed from: b */
        int f13279b = -1;

        /* renamed from: c */
        float f13280c;

        /* renamed from: d */
        private int f13281d = -1;

        /* renamed from: com.google.android.material.tabs.TabLayout$f$a */
        class C2071a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ View f13283a;

            /* renamed from: b */
            final /* synthetic */ View f13284b;

            C2071a(View view, View view2) {
                this.f13283a = view;
                this.f13284b = view2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2070f.this.m16305g(this.f13283a, this.f13284b, valueAnimator.getAnimatedFraction());
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$f$b */
        class C2072b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f13286a;

            C2072b(int i) {
                this.f13286a = i;
            }

            public void onAnimationEnd(Animator animator) {
                C2070f.this.f13279b = this.f13286a;
            }

            public void onAnimationStart(Animator animator) {
                C2070f.this.f13279b = this.f13286a;
            }
        }

        C2070f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        /* renamed from: d */
        private void m16304d() {
            View childAt = getChildAt(this.f13279b);
            TabIndicatorInterpolator a = TabLayout.this.f13238I;
            TabLayout tabLayout = TabLayout.this;
            a.mo16164d(tabLayout, childAt, tabLayout.f13261n);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m16305g(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                TabIndicatorInterpolator a = TabLayout.this.f13238I;
                TabLayout tabLayout = TabLayout.this;
                a.mo16163c(tabLayout, view, view2, f, tabLayout.f13261n);
            } else {
                Drawable drawable = TabLayout.this.f13261n;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f13261n.getBounds().bottom);
            }
            ViewCompat.m5555f0(this);
        }

        /* renamed from: h */
        private void m16306h(boolean z, int i, int i2) {
            View childAt = getChildAt(this.f13279b);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                m16304d();
                return;
            }
            C2071a aVar = new C2071a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f13278a = valueAnimator;
                valueAnimator.setInterpolator(AnimationUtils.f9612b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new C2072b(i));
                valueAnimator.start();
            } else {
                this.f13278a.removeAllUpdateListeners();
                this.f13278a.addUpdateListener(aVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo16123b(int i, int i2) {
            ValueAnimator valueAnimator = this.f13278a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f13278a.cancel();
            }
            m16306h(true, i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo16124c() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public void draw(Canvas canvas) {
            int height = TabLayout.this.f13261n.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f13261n.getIntrinsicHeight();
            }
            int i = TabLayout.this.f13232A;
            int i2 = 0;
            if (i == 0) {
                i2 = getHeight() - height;
                height = getHeight();
            } else if (i == 1) {
                i2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i != 2) {
                if (i != 3) {
                    height = 0;
                } else {
                    height = getHeight();
                }
            }
            if (TabLayout.this.f13261n.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f13261n.getBounds();
                TabLayout.this.f13261n.setBounds(bounds.left, i2, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f13261n;
                if (tabLayout.f13262o != 0) {
                    drawable = DrawableCompat.m1859r(drawable);
                    if (VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.f13262o, Mode.SRC_IN);
                    } else {
                        DrawableCompat.m1855n(drawable, TabLayout.this.f13262o);
                    }
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo16126e(int i, float f) {
            ValueAnimator valueAnimator = this.f13278a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f13278a.cancel();
            }
            this.f13279b = i;
            this.f13280c = f;
            m16305g(getChildAt(i), getChildAt(this.f13279b + 1), this.f13280c);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo16127f(int i) {
            Rect bounds = TabLayout.this.f13261n.getBounds();
            TabLayout.this.f13261n.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f13278a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m16304d();
            } else {
                m16306h(false, this.f13279b, -1);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f13272y == 1 || tabLayout.f13233B == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) C2053k.m16231b(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f13272y = 0;
                            tabLayout2.mo16060P(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f13281d != i) {
                requestLayout();
                this.f13281d = i;
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C2073g {

        /* renamed from: a */
        private Object f13288a;

        /* renamed from: b */
        private Drawable f13289b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CharSequence f13290c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CharSequence f13291d;

        /* renamed from: e */
        private int f13292e = -1;

        /* renamed from: f */
        private View f13293f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f13294g = 1;

        /* renamed from: h */
        public TabLayout f13295h;

        /* renamed from: i */
        public C2075i f13296i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f13297j = -1;

        /* renamed from: e */
        public View mo16134e() {
            return this.f13293f;
        }

        /* renamed from: f */
        public Drawable mo16135f() {
            return this.f13289b;
        }

        /* renamed from: g */
        public int mo16136g() {
            return this.f13292e;
        }

        /* renamed from: h */
        public int mo16137h() {
            return this.f13294g;
        }

        /* renamed from: i */
        public CharSequence mo16138i() {
            return this.f13290c;
        }

        /* renamed from: j */
        public boolean mo16139j() {
            TabLayout tabLayout = this.f13295h;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f13292e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo16140k() {
            this.f13295h = null;
            this.f13296i = null;
            this.f13288a = null;
            this.f13289b = null;
            this.f13297j = -1;
            this.f13290c = null;
            this.f13291d = null;
            this.f13292e = -1;
            this.f13293f = null;
        }

        /* renamed from: l */
        public void mo16141l() {
            TabLayout tabLayout = this.f13295h;
            if (tabLayout != null) {
                tabLayout.mo16054G(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: m */
        public C2073g mo16142m(CharSequence charSequence) {
            this.f13291d = charSequence;
            mo16148s();
            return this;
        }

        /* renamed from: n */
        public C2073g mo16143n(int i) {
            return mo16144o(LayoutInflater.from(this.f13296i.getContext()).inflate(i, this.f13296i, false));
        }

        /* renamed from: o */
        public C2073g mo16144o(View view) {
            this.f13293f = view;
            mo16148s();
            return this;
        }

        /* renamed from: p */
        public C2073g mo16145p(Drawable drawable) {
            this.f13289b = drawable;
            TabLayout tabLayout = this.f13295h;
            if (tabLayout.f13272y == 1 || tabLayout.f13233B == 2) {
                tabLayout.mo16060P(true);
            }
            mo16148s();
            if (BadgeUtils.f9667a && this.f13296i.m16345l() && this.f13296i.f13305e.isVisible()) {
                this.f13296i.invalidate();
            }
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public void mo16146q(int i) {
            this.f13292e = i;
        }

        /* renamed from: r */
        public C2073g mo16147r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f13291d) && !TextUtils.isEmpty(charSequence)) {
                this.f13296i.setContentDescription(charSequence);
            }
            this.f13290c = charSequence;
            mo16148s();
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: s */
        public void mo16148s() {
            C2075i iVar = this.f13296i;
            if (iVar != null) {
                iVar.mo16160t();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C2074h implements C0496j {

        /* renamed from: a */
        private final WeakReference<TabLayout> f13298a;

        /* renamed from: b */
        private int f13299b;

        /* renamed from: c */
        private int f13300c;

        public C2074h(TabLayout tabLayout) {
            this.f13298a = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        public void mo4049a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f13298a.get();
            if (tabLayout != null) {
                int i3 = this.f13300c;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f13299b == 1;
                if (!(i3 == 2 && this.f13299b == 0)) {
                    z = true;
                }
                tabLayout.mo16058K(i, f, z2, z);
            }
        }

        /* renamed from: b */
        public void mo4050b(int i) {
            this.f13299b = this.f13300c;
            this.f13300c = i;
        }

        /* renamed from: c */
        public void mo4051c(int i) {
            TabLayout tabLayout = (TabLayout) this.f13298a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f13300c;
                tabLayout.mo16055H(tabLayout.mo16114y(i), i2 == 0 || (i2 == 2 && this.f13299b == 0));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo16149d() {
            this.f13300c = 0;
            this.f13299b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public final class C2075i extends LinearLayout {

        /* renamed from: a */
        private C2073g f13301a;

        /* renamed from: b */
        private TextView f13302b;

        /* renamed from: c */
        private ImageView f13303c;

        /* renamed from: d */
        private View f13304d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public BadgeDrawable f13305e;

        /* renamed from: f */
        private View f13306f;

        /* renamed from: g */
        private TextView f13307g;

        /* renamed from: h */
        private ImageView f13308h;

        /* renamed from: i */
        private Drawable f13309i;

        /* renamed from: j */
        private int f13310j = 2;

        /* renamed from: com.google.android.material.tabs.TabLayout$i$a */
        class C2076a implements OnLayoutChangeListener {

            /* renamed from: a */
            final /* synthetic */ View f13312a;

            C2076a(View view) {
                this.f13312a = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f13312a.getVisibility() == 0) {
                    C2075i.this.m16351s(this.f13312a);
                }
            }
        }

        public C2075i(Context context) {
            super(context);
            m16352u(context);
            ViewCompat.m5511A0(this, TabLayout.this.f13253f, TabLayout.this.f13254g, TabLayout.this.f13255h, TabLayout.this.f13256i);
            setGravity(17);
            setOrientation(TabLayout.this.f13234C ^ true ? 1 : 0);
            setClickable(true);
            ViewCompat.m5513B0(this, PointerIconCompat.m5508b(getContext(), 1002));
        }

        /* renamed from: f */
        private void m16339f(View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new C2076a(view));
            }
        }

        /* renamed from: g */
        private float m16340g(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        private BadgeDrawable getBadge() {
            return this.f13305e;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.f13305e == null) {
                this.f13305e = BadgeDrawable.m11505c(getContext());
            }
            m16350r();
            BadgeDrawable aVar = this.f13305e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: h */
        private void m16341h(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* renamed from: i */
        private FrameLayout m16342i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public void m16343j(Canvas canvas) {
            Drawable drawable = this.f13309i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f13309i.draw(canvas);
            }
        }

        /* renamed from: k */
        private FrameLayout m16344k(View view) {
            FrameLayout frameLayout = null;
            if (view != this.f13303c && view != this.f13302b) {
                return null;
            }
            if (BadgeUtils.f9667a) {
                frameLayout = (FrameLayout) view.getParent();
            }
            return frameLayout;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public boolean m16345l() {
            return this.f13305e != null;
        }

        /* renamed from: m */
        private void m16346m() {
            ViewGroup viewGroup;
            if (BadgeUtils.f9667a) {
                ViewGroup i = m16342i();
                addView(i, 0);
                viewGroup = i;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C1293h.design_layout_tab_icon, viewGroup, false);
            this.f13303c = imageView;
            viewGroup.addView(imageView, 0);
        }

        /* renamed from: n */
        private void m16347n() {
            ViewGroup viewGroup;
            if (BadgeUtils.f9667a) {
                ViewGroup i = m16342i();
                addView(i);
                viewGroup = i;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C1293h.design_layout_tab_text, viewGroup, false);
            this.f13302b = textView;
            viewGroup.addView(textView);
        }

        /* renamed from: p */
        private void m16348p(View view) {
            if (m16345l() && view != null) {
                m16341h(false);
                BadgeUtils.m11549a(this.f13305e, view, m16344k(view));
                this.f13304d = view;
            }
        }

        /* renamed from: q */
        private void m16349q() {
            if (m16345l()) {
                m16341h(true);
                View view = this.f13304d;
                if (view != null) {
                    BadgeUtils.m11550b(this.f13305e, view);
                    this.f13304d = null;
                }
            }
        }

        /* renamed from: r */
        private void m16350r() {
            if (m16345l()) {
                if (this.f13306f != null) {
                    m16349q();
                } else {
                    if (this.f13303c != null) {
                        C2073g gVar = this.f13301a;
                        if (!(gVar == null || gVar.mo16135f() == null)) {
                            View view = this.f13304d;
                            ImageView imageView = this.f13303c;
                            if (view != imageView) {
                                m16349q();
                                m16348p(this.f13303c);
                            } else {
                                m16351s(imageView);
                            }
                        }
                    }
                    if (this.f13302b != null) {
                        C2073g gVar2 = this.f13301a;
                        if (gVar2 != null && gVar2.mo16137h() == 1) {
                            View view2 = this.f13304d;
                            TextView textView = this.f13302b;
                            if (view2 != textView) {
                                m16349q();
                                m16348p(this.f13302b);
                            } else {
                                m16351s(textView);
                            }
                        }
                    }
                    m16349q();
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m16351s(View view) {
            if (m16345l() && view == this.f13304d) {
                BadgeUtils.m11551c(this.f13305e, view, m16344k(view));
            }
        }

        /* JADX WARNING: type inference failed for: r7v2, types: [android.graphics.drawable.Drawable] */
        /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: type inference failed for: r7v6, types: [android.graphics.drawable.Drawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: u */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m16352u(android.content.Context r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f13266s
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r7 = p010b.p011a.p012k.p013a.AppCompatResources.m4143d(r7, r0)
                r6.f13309i = r7
                if (r7 == 0) goto L_0x0021
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r7 = r6.f13309i
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0021
            L_0x001f:
                r6.f13309i = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = 0
                r7.setColor(r0)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f13260m
                if (r2 == 0) goto L_0x0074
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r3 = r3.f13260m
                android.content.res.ColorStateList r3 = p067c.p068a.p069a.p114b.p115a0.RippleUtils.m11250a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x005f
                android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f13237H
                if (r4 == 0) goto L_0x0056
                r7 = r1
            L_0x0056:
                if (r4 == 0) goto L_0x0059
                goto L_0x005a
            L_0x0059:
                r1 = r2
            L_0x005a:
                r0.<init>(r3, r7, r1)
                r7 = r0
                goto L_0x0074
            L_0x005f:
                android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.DrawableCompat.m1859r(r2)
                androidx.core.graphics.drawable.DrawableCompat.m1856o(r1, r3)
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r0] = r7
                r7 = 1
                r3[r7] = r1
                r2.<init>(r3)
                r7 = r2
            L_0x0074:
                p010b.p034g.p043k.ViewCompat.m5579r0(r6, r7)
                com.google.android.material.tabs.TabLayout r7 = com.google.android.material.tabs.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C2075i.m16352u(android.content.Context):void");
        }

        /* renamed from: w */
        private void m16353w(TextView textView, ImageView imageView) {
            C2073g gVar = this.f13301a;
            CharSequence charSequence = null;
            Drawable mutate = (gVar == null || gVar.mo16135f() == null) ? null : DrawableCompat.m1859r(this.f13301a.mo16135f()).mutate();
            C2073g gVar2 = this.f13301a;
            CharSequence i = gVar2 != null ? gVar2.mo16138i() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(i);
            if (textView != null) {
                if (z) {
                    textView.setText(i);
                    if (this.f13301a.f13294g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                int b = (!z || imageView.getVisibility() != 0) ? 0 : (int) C2053k.m16231b(getContext(), 8);
                if (TabLayout.this.f13234C) {
                    if (b != MarginLayoutParamsCompat.m5463a(marginLayoutParams)) {
                        MarginLayoutParamsCompat.m5465c(marginLayoutParams, b);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (b != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = b;
                    MarginLayoutParamsCompat.m5465c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C2073g gVar3 = this.f13301a;
            if (gVar3 != null) {
                charSequence = gVar3.f13291d;
            }
            if (!z) {
                i = charSequence;
            }
            TooltipCompat.m1498a(this, i);
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f13309i;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f13309i.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* access modifiers changed from: 0000 */
        public int getContentHeight() {
            View[] viewArr = {this.f13302b, this.f13303c, this.f13306f};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        /* access modifiers changed from: 0000 */
        public int getContentWidth() {
            View[] viewArr = {this.f13302b, this.f13303c, this.f13306f};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        public C2073g getTab() {
            return this.f13301a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public void mo16154o() {
            setTab(null);
            setSelected(false);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable aVar = this.f13305e;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                StringBuilder sb = new StringBuilder();
                sb.append(contentDescription);
                sb.append(", ");
                sb.append(this.f13305e.mo7978g());
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
            AccessibilityNodeInfoCompat y0 = AccessibilityNodeInfoCompat.m5349y0(accessibilityNodeInfo);
            y0.mo5055a0(C0636c.m5416a(0, 1, this.f13301a.mo16136g(), 1, false, isSelected()));
            if (isSelected()) {
                y0.mo5052Y(false);
                y0.mo5045P(C0634a.f4684e);
            }
            y0.mo5080o0(getResources().getString(C1295j.item_view_role_description));
        }

        public void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(TabLayout.this.f13267t, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f13302b != null) {
                float f = TabLayout.this.f13264q;
                int i3 = this.f13310j;
                ImageView imageView = this.f13303c;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f13302b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f13265r;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f13302b.getTextSize();
                int lineCount = this.f13302b.getLineCount();
                int d = TextViewCompat.m1975d(this.f13302b);
                if (f != textSize || (d >= 0 && i3 != d)) {
                    if (TabLayout.this.f13233B == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f13302b.getLayout();
                        if (layout == null || m16340g(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f13302b.setTextSize(0, f);
                        this.f13302b.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f13301a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f13301a.mo16141l();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f13302b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f13303c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f13306f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* access modifiers changed from: 0000 */
        public void setTab(C2073g gVar) {
            if (gVar != this.f13301a) {
                this.f13301a = gVar;
                mo16160t();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public final void mo16160t() {
            C2073g gVar = this.f13301a;
            Drawable drawable = null;
            View e = gVar != null ? gVar.mo16134e() : null;
            if (e != null) {
                ViewParent parent = e.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(e);
                    }
                    addView(e);
                }
                this.f13306f = e;
                TextView textView = this.f13302b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f13303c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f13303c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) e.findViewById(16908308);
                this.f13307g = textView2;
                if (textView2 != null) {
                    this.f13310j = TextViewCompat.m1975d(textView2);
                }
                this.f13308h = (ImageView) e.findViewById(16908294);
            } else {
                View view = this.f13306f;
                if (view != null) {
                    removeView(view);
                    this.f13306f = null;
                }
                this.f13307g = null;
                this.f13308h = null;
            }
            if (this.f13306f == null) {
                if (this.f13303c == null) {
                    m16346m();
                }
                if (!(gVar == null || gVar.mo16135f() == null)) {
                    drawable = DrawableCompat.m1859r(gVar.mo16135f()).mutate();
                }
                if (drawable != null) {
                    DrawableCompat.m1856o(drawable, TabLayout.this.f13259l);
                    Mode mode = TabLayout.this.f13263p;
                    if (mode != null) {
                        DrawableCompat.m1857p(drawable, mode);
                    }
                }
                if (this.f13302b == null) {
                    m16347n();
                    this.f13310j = TextViewCompat.m1975d(this.f13302b);
                }
                TextViewCompat.m1988q(this.f13302b, TabLayout.this.f13257j);
                ColorStateList colorStateList = TabLayout.this.f13258k;
                if (colorStateList != null) {
                    this.f13302b.setTextColor(colorStateList);
                }
                m16353w(this.f13302b, this.f13303c);
                m16350r();
                m16339f(this.f13303c);
                m16339f(this.f13302b);
            } else {
                TextView textView3 = this.f13307g;
                if (!(textView3 == null && this.f13308h == null)) {
                    m16353w(textView3, this.f13308h);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f13291d)) {
                setContentDescription(gVar.f13291d);
            }
            setSelected(gVar != null && gVar.mo16139j());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public final void mo16161v() {
            setOrientation(TabLayout.this.f13234C ^ true ? 1 : 0);
            TextView textView = this.f13307g;
            if (textView == null && this.f13308h == null) {
                m16353w(this.f13302b, this.f13303c);
            } else {
                m16353w(textView, this.f13308h);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    public static class C2077j implements C2068d {

        /* renamed from: a */
        private final ViewPager f13314a;

        public C2077j(ViewPager viewPager) {
            this.f13314a = viewPager;
        }

        /* renamed from: a */
        public void mo16118a(C2073g gVar) {
        }

        /* renamed from: b */
        public void mo16119b(C2073g gVar) {
        }

        /* renamed from: c */
        public void mo16120c(C2073g gVar) {
            this.f13314a.setCurrentItem(gVar.mo16136g());
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1270b.tabStyle);
    }

    /* renamed from: F */
    private void m16256F(int i) {
        C2075i iVar = (C2075i) this.f13252e.getChildAt(i);
        this.f13252e.removeViewAt(i);
        if (iVar != null) {
            iVar.mo16154o();
            this.f13249T.mo4945a(iVar);
        }
        requestLayout();
    }

    /* renamed from: M */
    private void m16257M(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f13243N;
        if (viewPager2 != null) {
            C2074h hVar = this.f13246Q;
            if (hVar != null) {
                viewPager2.mo3987J(hVar);
            }
            C2066b bVar = this.f13247R;
            if (bVar != null) {
                this.f13243N.mo3986I(bVar);
            }
        }
        C2067c cVar = this.f13241L;
        if (cVar != null) {
            mo16053E(cVar);
            this.f13241L = null;
        }
        if (viewPager != null) {
            this.f13243N = viewPager;
            if (this.f13246Q == null) {
                this.f13246Q = new C2074h(this);
            }
            this.f13246Q.mo16149d();
            viewPager.mo3997c(this.f13246Q);
            C2077j jVar = new C2077j(viewPager);
            this.f13241L = jVar;
            mo16065c(jVar);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo16056I(adapter, z);
            }
            if (this.f13247R == null) {
                this.f13247R = new C2066b();
            }
            this.f13247R.mo16117b(z);
            viewPager.mo3996b(this.f13247R);
            mo16057J(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f13243N = null;
            mo16056I(null, false);
        }
        this.f13248S = z2;
    }

    /* renamed from: N */
    private void m16258N() {
        int size = this.f13250c.size();
        for (int i = 0; i < size; i++) {
            ((C2073g) this.f13250c.get(i)).mo16148s();
        }
    }

    /* renamed from: O */
    private void m16259O(LayoutParams layoutParams) {
        if (this.f13233B == 1 && this.f13272y == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private int getDefaultHeight() {
        int size = this.f13250c.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C2073g gVar = (C2073g) this.f13250c.get(i);
            if (gVar != null && gVar.mo16135f() != null && !TextUtils.isEmpty(gVar.mo16138i())) {
                z = true;
                break;
            }
            i++;
        }
        return (!z || this.f13234C) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f13268u;
        if (i != -1) {
            return i;
        }
        int i2 = this.f13233B;
        return (i2 == 0 || i2 == 2) ? this.f13270w : 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f13252e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m16262h(TabItem cVar) {
        C2073g A = mo16049A();
        CharSequence charSequence = cVar.f13315a;
        if (charSequence != null) {
            A.mo16147r(charSequence);
        }
        Drawable drawable = cVar.f13316b;
        if (drawable != null) {
            A.mo16145p(drawable);
        }
        int i = cVar.f13317c;
        if (i != 0) {
            A.mo16143n(i);
        }
        if (!TextUtils.isEmpty(cVar.getContentDescription())) {
            A.mo16142m(cVar.getContentDescription());
        }
        mo16067e(A);
    }

    /* renamed from: i */
    private void m16263i(C2073g gVar) {
        C2075i iVar = gVar.f13296i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f13252e.addView(iVar, gVar.mo16136g(), m16271r());
    }

    /* renamed from: j */
    private void m16264j(View view) {
        if (view instanceof TabItem) {
            m16262h((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: k */
    private void m16265k(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !ViewCompat.m5537T(this) || this.f13252e.mo16124c()) {
                mo16057J(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int n = m16268n(i, 0.0f);
            if (scrollX != n) {
                m16276x();
                this.f13242M.setIntValues(new int[]{scrollX, n});
                this.f13242M.start();
            }
            this.f13252e.mo16123b(i, this.f13273z);
        }
    }

    /* renamed from: l */
    private void m16266l(int i) {
        if (i == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i == 1) {
            this.f13252e.setGravity(1);
            return;
        } else if (i != 2) {
            return;
        }
        this.f13252e.setGravity(8388611);
    }

    /* renamed from: m */
    private void m16267m() {
        int i;
        int i2 = this.f13233B;
        if (i2 == 0 || i2 == 2) {
            i = Math.max(0, this.f13271x - this.f13253f);
        } else {
            i = 0;
        }
        ViewCompat.m5511A0(this.f13252e, i, 0, 0, 0);
        int i3 = this.f13233B;
        if (i3 == 0) {
            m16266l(this.f13272y);
        } else if (i3 == 1 || i3 == 2) {
            if (this.f13272y == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f13252e.setGravity(1);
        }
        mo16060P(true);
    }

    /* renamed from: n */
    private int m16268n(int i, float f) {
        int i2 = this.f13233B;
        int i3 = 0;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f13252e.getChildAt(i);
        int i4 = i + 1;
        View childAt2 = i4 < this.f13252e.getChildCount() ? this.f13252e.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        return ViewCompat.m5514C(this) == 0 ? left + i5 : left - i5;
    }

    /* renamed from: p */
    private void m16269p(C2073g gVar, int i) {
        gVar.mo16146q(i);
        this.f13250c.add(i, gVar);
        int size = this.f13250c.size();
        while (true) {
            i++;
            if (i < size) {
                ((C2073g) this.f13250c.get(i)).mo16146q(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: q */
    private static ColorStateList m16270q(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: r */
    private LayoutParams m16271r() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m16259O(layoutParams);
        return layoutParams;
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f13252e.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f13252e.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: t */
    private C2075i m16272t(C2073g gVar) {
        C0610e<C2075i> eVar = this.f13249T;
        C2075i iVar = eVar != null ? (C2075i) eVar.mo4946b() : null;
        if (iVar == null) {
            iVar = new C2075i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f13291d)) {
            iVar.setContentDescription(gVar.f13290c);
        } else {
            iVar.setContentDescription(gVar.f13291d);
        }
        return iVar;
    }

    /* renamed from: u */
    private void m16273u(C2073g gVar) {
        for (int size = this.f13240K.size() - 1; size >= 0; size--) {
            ((C2067c) this.f13240K.get(size)).mo16118a(gVar);
        }
    }

    /* renamed from: v */
    private void m16274v(C2073g gVar) {
        for (int size = this.f13240K.size() - 1; size >= 0; size--) {
            ((C2067c) this.f13240K.get(size)).mo16120c(gVar);
        }
    }

    /* renamed from: w */
    private void m16275w(C2073g gVar) {
        for (int size = this.f13240K.size() - 1; size >= 0; size--) {
            ((C2067c) this.f13240K.get(size)).mo16119b(gVar);
        }
    }

    /* renamed from: x */
    private void m16276x() {
        if (this.f13242M == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f13242M = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.f9612b);
            this.f13242M.setDuration((long) this.f13273z);
            this.f13242M.addUpdateListener(new C2065a());
        }
    }

    /* renamed from: A */
    public C2073g mo16049A() {
        C2073g s = mo16088s();
        s.f13295h = this;
        s.f13296i = m16272t(s);
        if (s.f13297j != -1) {
            s.f13296i.setId(s.f13297j);
        }
        return s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo16050B() {
        mo16052D();
        PagerAdapter aVar = this.f13244O;
        if (aVar != null) {
            int c = aVar.mo4064c();
            for (int i = 0; i < c; i++) {
                mo16069g(mo16049A().mo16147r(this.f13244O.mo4066e(i)), false);
            }
            ViewPager viewPager = this.f13243N;
            if (viewPager != null && c > 0) {
                int currentItem = viewPager.getCurrentItem();
                if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                    mo16054G(mo16114y(currentItem));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo16051C(C2073g gVar) {
        return f13231b.mo4945a(gVar);
    }

    /* renamed from: D */
    public void mo16052D() {
        for (int childCount = this.f13252e.getChildCount() - 1; childCount >= 0; childCount--) {
            m16256F(childCount);
        }
        Iterator it = this.f13250c.iterator();
        while (it.hasNext()) {
            C2073g gVar = (C2073g) it.next();
            it.remove();
            gVar.mo16140k();
            mo16051C(gVar);
        }
        this.f13251d = null;
    }

    @Deprecated
    /* renamed from: E */
    public void mo16053E(C2067c cVar) {
        this.f13240K.remove(cVar);
    }

    /* renamed from: G */
    public void mo16054G(C2073g gVar) {
        mo16055H(gVar, true);
    }

    /* renamed from: H */
    public void mo16055H(C2073g gVar, boolean z) {
        C2073g gVar2 = this.f13251d;
        if (gVar2 != gVar) {
            int g = gVar != null ? gVar.mo16136g() : -1;
            if (z) {
                if ((gVar2 == null || gVar2.mo16136g() == -1) && g != -1) {
                    mo16057J(g, 0.0f, true);
                } else {
                    m16265k(g);
                }
                if (g != -1) {
                    setSelectedTabView(g);
                }
            }
            this.f13251d = gVar;
            if (gVar2 != null) {
                m16275w(gVar2);
            }
            if (gVar != null) {
                m16274v(gVar);
            }
        } else if (gVar2 != null) {
            m16273u(gVar);
            m16265k(gVar.mo16136g());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public void mo16056I(PagerAdapter aVar, boolean z) {
        PagerAdapter aVar2 = this.f13244O;
        if (aVar2 != null) {
            DataSetObserver dataSetObserver = this.f13245P;
            if (dataSetObserver != null) {
                aVar2.mo4070o(dataSetObserver);
            }
        }
        this.f13244O = aVar;
        if (z && aVar != null) {
            if (this.f13245P == null) {
                this.f13245P = new C2069e();
            }
            aVar.mo4068i(this.f13245P);
        }
        mo16050B();
    }

    /* renamed from: J */
    public void mo16057J(int i, float f, boolean z) {
        mo16058K(i, f, z, true);
    }

    /* renamed from: K */
    public void mo16058K(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f13252e.getChildCount()) {
            if (z2) {
                this.f13252e.mo16126e(i, f);
            }
            ValueAnimator valueAnimator = this.f13242M;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f13242M.cancel();
            }
            scrollTo(m16268n(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: L */
    public void mo16059L(ViewPager viewPager, boolean z) {
        m16257M(viewPager, z, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public void mo16060P(boolean z) {
        for (int i = 0; i < this.f13252e.getChildCount(); i++) {
            View childAt = this.f13252e.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m16259O((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        m16264j(view);
    }

    @Deprecated
    /* renamed from: c */
    public void mo16065c(C2067c cVar) {
        if (!this.f13240K.contains(cVar)) {
            this.f13240K.add(cVar);
        }
    }

    /* renamed from: d */
    public void mo16066d(C2068d dVar) {
        mo16065c(dVar);
    }

    /* renamed from: e */
    public void mo16067e(C2073g gVar) {
        mo16069g(gVar, this.f13250c.isEmpty());
    }

    /* renamed from: f */
    public void mo16068f(C2073g gVar, int i, boolean z) {
        if (gVar.f13295h == this) {
            m16269p(gVar, i);
            m16263i(gVar);
            if (z) {
                gVar.mo16141l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: g */
    public void mo16069g(C2073g gVar, boolean z) {
        mo16068f(gVar, this.f13250c.size(), z);
    }

    public int getSelectedTabPosition() {
        C2073g gVar = this.f13251d;
        if (gVar != null) {
            return gVar.mo16136g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f13250c.size();
    }

    public int getTabGravity() {
        return this.f13272y;
    }

    public ColorStateList getTabIconTint() {
        return this.f13259l;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f13236G;
    }

    public int getTabIndicatorGravity() {
        return this.f13232A;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.f13267t;
    }

    public int getTabMode() {
        return this.f13233B;
    }

    public ColorStateList getTabRippleColor() {
        return this.f13260m;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f13261n;
    }

    public ColorStateList getTabTextColors() {
        return this.f13258k;
    }

    /* renamed from: o */
    public void mo16082o() {
        this.f13240K.clear();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m11337e(this);
        if (this.f13243N == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m16257M((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f13248S) {
            setupWithViewPager(null);
            this.f13248S = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f13252e.getChildCount(); i++) {
            View childAt = this.f13252e.getChildAt(i);
            if (childAt instanceof C2075i) {
                ((C2075i) childAt).m16343j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.m5349y0(accessibilityNodeInfo).mo5053Z(C0635b.m5415a(1, getTabCount(), false, 1));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C2053k.m16231b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.f13269v
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C2053k.m16231b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.f13267t = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f13233B
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = 1
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public C2073g mo16088s() {
        C2073g gVar = (C2073g) f13231b.mo4946b();
        return gVar == null ? new C2073g() : gVar;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.m11336d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f13234C != z) {
            this.f13234C = z;
            for (int i = 0; i < this.f13252e.getChildCount(); i++) {
                View childAt = this.f13252e.getChildAt(i);
                if (childAt instanceof C2075i) {
                    ((C2075i) childAt).mo16161v();
                }
            }
            m16267m();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(C2068d dVar) {
        setOnTabSelectedListener((C2067c) dVar);
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m16276x();
        this.f13242M.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f13261n != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f13261n = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f13262o = i;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f13232A != i) {
            this.f13232A = i;
            ViewCompat.m5555f0(this.f13252e);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f13252e.mo16127f(i);
    }

    public void setTabGravity(int i) {
        if (this.f13272y != i) {
            this.f13272y = i;
            m16267m();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f13259l != colorStateList) {
            this.f13259l = colorStateList;
            m16258N();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(AppCompatResources.m4142c(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f13236G = i;
        if (i == 0) {
            this.f13238I = new TabIndicatorInterpolator();
        } else if (i == 1) {
            this.f13238I = new ElasticTabIndicatorInterpolator();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is not a valid TabIndicatorAnimationMode");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f13235D = z;
        ViewCompat.m5555f0(this.f13252e);
    }

    public void setTabMode(int i) {
        if (i != this.f13233B) {
            this.f13233B = i;
            m16267m();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f13260m != colorStateList) {
            this.f13260m = colorStateList;
            for (int i = 0; i < this.f13252e.getChildCount(); i++) {
                View childAt = this.f13252e.getChildAt(i);
                if (childAt instanceof C2075i) {
                    ((C2075i) childAt).m16352u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(AppCompatResources.m4142c(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f13258k != colorStateList) {
            this.f13258k = colorStateList;
            m16258N();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(PagerAdapter aVar) {
        mo16056I(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f13237H != z) {
            this.f13237H = z;
            for (int i = 0; i < this.f13252e.getChildCount(); i++) {
                View childAt = this.f13252e.getChildAt(i);
                if (childAt instanceof C2075i) {
                    ((C2075i) childAt).m16352u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        mo16059L(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* renamed from: y */
    public C2073g mo16114y(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C2073g) this.f13250c.get(i);
    }

    /* renamed from: z */
    public boolean mo16115z() {
        return this.f13235D;
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = f13230a;
        super(MaterialThemeOverlay.m16587c(context, attributeSet, i, i2), attributeSet, i);
        this.f13250c = new ArrayList<>();
        this.f13261n = new GradientDrawable();
        this.f13262o = 0;
        this.f13267t = Integer.MAX_VALUE;
        this.f13240K = new ArrayList<>();
        this.f13249T = new C0611f(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C2070f fVar = new C2070f(context2);
        this.f13252e = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = C1297l.f9560t4;
        int i3 = C1297l.f9345R4;
        TypedArray h = ThemeEnforcement.m16228h(context2, attributeSet, iArr, i, i2, i3);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            MaterialShapeDrawable gVar = new MaterialShapeDrawable();
            gVar.mo7843X(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.mo7836M(context2);
            gVar.mo7842W(ViewCompat.m5588w(this));
            ViewCompat.m5579r0(this, gVar);
        }
        setSelectedTabIndicator(MaterialResources.m11603d(context2, h, C1297l.f9608z4));
        setSelectedTabIndicatorColor(h.getColor(C1297l.f9235C4, 0));
        fVar.mo16127f(h.getDimensionPixelSize(C1297l.f9259F4, -1));
        setSelectedTabIndicatorGravity(h.getInt(C1297l.f9251E4, 0));
        setTabIndicatorFullWidth(h.getBoolean(C1297l.f9243D4, true));
        setTabIndicatorAnimationMode(h.getInt(C1297l.f9227B4, 0));
        int dimensionPixelSize = h.getDimensionPixelSize(C1297l.f9296K4, 0);
        this.f13256i = dimensionPixelSize;
        this.f13255h = dimensionPixelSize;
        this.f13254g = dimensionPixelSize;
        this.f13253f = dimensionPixelSize;
        this.f13253f = h.getDimensionPixelSize(C1297l.f9317N4, dimensionPixelSize);
        this.f13254g = h.getDimensionPixelSize(C1297l.f9324O4, this.f13254g);
        this.f13255h = h.getDimensionPixelSize(C1297l.f9310M4, this.f13255h);
        this.f13256i = h.getDimensionPixelSize(C1297l.f9303L4, this.f13256i);
        int resourceId = h.getResourceId(i3, C1296k.TextAppearance_Design_Tab);
        this.f13257j = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C0511j.f3488J2);
        try {
            this.f13264q = (float) obtainStyledAttributes.getDimensionPixelSize(C0511j.f3493K2, 0);
            this.f13258k = MaterialResources.m11600a(context2, obtainStyledAttributes, C0511j.f3506N2);
            obtainStyledAttributes.recycle();
            int i4 = C1297l.f9352S4;
            if (h.hasValue(i4)) {
                this.f13258k = MaterialResources.m11600a(context2, h, i4);
            }
            int i5 = C1297l.f9338Q4;
            if (h.hasValue(i5)) {
                this.f13258k = m16270q(this.f13258k.getDefaultColor(), h.getColor(i5, 0));
            }
            this.f13259l = MaterialResources.m11600a(context2, h, C1297l.f9592x4);
            this.f13263p = C2053k.m16234e(h.getInt(C1297l.f9600y4, -1), null);
            this.f13260m = MaterialResources.m11600a(context2, h, C1297l.f9331P4);
            this.f13273z = h.getInt(C1297l.f9219A4, 300);
            this.f13268u = h.getDimensionPixelSize(C1297l.f9282I4, -1);
            this.f13269v = h.getDimensionPixelSize(C1297l.f9275H4, -1);
            this.f13266s = h.getResourceId(C1297l.f9568u4, 0);
            this.f13271x = h.getDimensionPixelSize(C1297l.f9576v4, 0);
            this.f13233B = h.getInt(C1297l.f9289J4, 1);
            this.f13272y = h.getInt(C1297l.f9584w4, 0);
            this.f13234C = h.getBoolean(C1297l.f9267G4, false);
            this.f13237H = h.getBoolean(C1297l.f9359T4, false);
            h.recycle();
            Resources resources = getResources();
            this.f13265r = (float) resources.getDimensionPixelSize(C1288d.design_tab_text_size_2line);
            this.f13270w = resources.getDimensionPixelSize(C1288d.design_tab_scrollable_min_width);
            m16267m();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void addView(View view, int i) {
        m16264j(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(C2067c cVar) {
        C2067c cVar2 = this.f13239J;
        if (cVar2 != null) {
            mo16053E(cVar2);
        }
        this.f13239J = cVar;
        if (cVar != null) {
            mo16065c(cVar);
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m16264j(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(AppCompatResources.m4143d(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m16264j(view);
    }
}
