package p010b.p034g.p043k;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p034g.C0576b;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0634a;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: b.g.k.w */
public class ViewCompat {

    /* renamed from: a */
    private static final AtomicInteger f4736a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f4737b;

    /* renamed from: c */
    private static boolean f4738c;

    /* renamed from: d */
    private static Field f4739d;

    /* renamed from: e */
    private static boolean f4740e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f4741f;

    /* renamed from: g */
    private static WeakHashMap<View, ViewPropertyAnimatorCompat> f4742g = null;

    /* renamed from: h */
    private static Field f4743h;

    /* renamed from: i */
    private static boolean f4744i = false;

    /* renamed from: j */
    private static ThreadLocal<Rect> f4745j;

    /* renamed from: k */
    private static final int[] f4746k = {C0576b.f4390b, C0576b.f4391c, C0576b.f4402n, C0576b.f4413y, C0576b.f4375B, C0576b.f4376C, C0576b.f4377D, C0576b.f4378E, C0576b.f4379F, C0576b.f4380G, C0576b.f4392d, C0576b.f4393e, C0576b.f4394f, C0576b.f4395g, C0576b.f4396h, C0576b.f4397i, C0576b.f4398j, C0576b.f4399k, C0576b.f4400l, C0576b.f4401m, C0576b.f4403o, C0576b.f4404p, C0576b.f4405q, C0576b.f4406r, C0576b.f4407s, C0576b.f4408t, C0576b.f4409u, C0576b.f4410v, C0576b.f4411w, C0576b.f4412x, C0576b.f4414z, C0576b.f4374A};

    /* renamed from: l */
    private static final OnReceiveContentViewBehavior f4747l = new C0655a();

    /* renamed from: m */
    private static C0660f f4748m = new C0660f();

    /* renamed from: b.g.k.w$a */
    /* compiled from: ViewCompat */
    class C0655a implements OnReceiveContentViewBehavior {
        C0655a() {
        }

        /* renamed from: a */
        public ContentInfoCompat mo1547a(ContentInfoCompat cVar) {
            return cVar;
        }
    }

    /* renamed from: b.g.k.w$b */
    /* compiled from: ViewCompat */
    class C0656b extends C0661g<Boolean> {
        C0656b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public Boolean mo5151d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo5152e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public boolean mo5153h(Boolean bool, Boolean bool2) {
            return !mo5169a(bool, bool2);
        }
    }

    /* renamed from: b.g.k.w$c */
    /* compiled from: ViewCompat */
    class C0657c extends C0661g<CharSequence> {
        C0657c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public CharSequence mo5151d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo5152e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public boolean mo5153h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: b.g.k.w$d */
    /* compiled from: ViewCompat */
    class C0658d extends C0661g<CharSequence> {
        C0658d(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public CharSequence mo5151d(View view) {
            return view.getStateDescription();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo5152e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public boolean mo5153h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: b.g.k.w$e */
    /* compiled from: ViewCompat */
    class C0659e extends C0661g<Boolean> {
        C0659e(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public Boolean mo5151d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo5152e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public boolean mo5153h(Boolean bool, Boolean bool2) {
            return !mo5169a(bool, bool2);
        }
    }

    /* renamed from: b.g.k.w$f */
    /* compiled from: ViewCompat */
    static class C0660f implements OnGlobalLayoutListener, OnAttachStateChangeListener {

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f4749a = new WeakHashMap<>();

        C0660f() {
        }

        /* renamed from: a */
        private void m5621a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                ViewCompat.m5541X(view, z2 ? 16 : 32);
                this.f4749a.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: b */
        private void m5622b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            if (VERSION.SDK_INT < 28) {
                for (Entry entry : this.f4749a.entrySet()) {
                    m5621a((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            m5622b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: b.g.k.w$g */
    /* compiled from: ViewCompat */
    static abstract class C0661g<T> {

        /* renamed from: a */
        private final int f4750a;

        /* renamed from: b */
        private final Class<T> f4751b;

        /* renamed from: c */
        private final int f4752c;

        /* renamed from: d */
        private final int f4753d;

        C0661g(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: b */
        private boolean m5623b() {
            return VERSION.SDK_INT >= 19;
        }

        /* renamed from: c */
        private boolean m5624c() {
            return VERSION.SDK_INT >= this.f4752c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5169a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (bool2 == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            if (booleanValue == z) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract T mo5151d(View view);

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public abstract void mo5152e(View view, T t);

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public T mo5170f(View view) {
            if (m5624c()) {
                return mo5151d(view);
            }
            if (m5623b()) {
                T tag = view.getTag(this.f4750a);
                if (this.f4751b.isInstance(tag)) {
                    return tag;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo5171g(View view, T t) {
            if (m5624c()) {
                mo5152e(view, t);
            } else if (m5623b() && mo5153h(mo5170f(view), t)) {
                ViewCompat.m5522G(view);
                view.setTag(this.f4750a, t);
                ViewCompat.m5541X(view, this.f4753d);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public abstract boolean mo5153h(T t, T t2);

        C0661g(int i, Class<T> cls, int i2, int i3) {
            this.f4750a = i;
            this.f4751b = cls;
            this.f4753d = i2;
            this.f4752c = i3;
        }
    }

    /* renamed from: b.g.k.w$h */
    /* compiled from: ViewCompat */
    private static class C0662h {

        /* renamed from: b.g.k.w$h$a */
        /* compiled from: ViewCompat */
        class C0663a implements OnApplyWindowInsetsListener {

            /* renamed from: a */
            WindowInsetsCompat f4754a = null;

            /* renamed from: b */
            final /* synthetic */ View f4755b;

            /* renamed from: c */
            final /* synthetic */ OnApplyWindowInsetsListener f4756c;

            C0663a(View view, OnApplyWindowInsetsListener qVar) {
                this.f4755b = view;
                this.f4756c = qVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat t = WindowInsetsCompat.m5248t(windowInsets, view);
                int i = VERSION.SDK_INT;
                if (i < 30) {
                    C0662h.m5631a(windowInsets, this.f4755b);
                    if (t.equals(this.f4754a)) {
                        return this.f4756c.mo382a(view, t).mo5003r();
                    }
                }
                this.f4754a = t;
                WindowInsetsCompat a = this.f4756c.mo382a(view, t);
                if (i >= 30) {
                    return a.mo5003r();
                }
                ViewCompat.m5567l0(view);
                return a.mo5003r();
            }
        }

        /* renamed from: a */
        static void m5631a(WindowInsets windowInsets, View view) {
            OnApplyWindowInsetsListener onApplyWindowInsetsListener = (OnApplyWindowInsetsListener) view.getTag(C0576b.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static WindowInsetsCompat m5632b(View view, WindowInsetsCompat e0Var, Rect rect) {
            WindowInsets r = e0Var.mo5003r();
            if (r != null) {
                return WindowInsetsCompat.m5248t(view.computeSystemWindowInsets(r, rect), view);
            }
            rect.setEmpty();
            return e0Var;
        }

        /* renamed from: c */
        public static WindowInsetsCompat m5633c(View view) {
            return C0620a.m5266a(view);
        }

        /* renamed from: d */
        static void m5634d(View view, OnApplyWindowInsetsListener qVar) {
            if (VERSION.SDK_INT < 30) {
                view.setTag(C0576b.tag_on_apply_window_listener, qVar);
            }
            if (qVar == null) {
                view.setOnApplyWindowInsetsListener((OnApplyWindowInsetsListener) view.getTag(C0576b.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new C0663a(view, qVar));
            }
        }
    }

    /* renamed from: b.g.k.w$i */
    /* compiled from: ViewCompat */
    private static class C0664i {
        /* renamed from: a */
        public static WindowInsetsCompat m5635a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat s = WindowInsetsCompat.m5247s(rootWindowInsets);
            s.mo5001p(s);
            s.mo4988d(view.getRootView());
            return s;
        }
    }

    /* renamed from: b.g.k.w$j */
    /* compiled from: ViewCompat */
    private static class C0665j {
        /* renamed from: a */
        static void m5636a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: b.g.k.w$k */
    /* compiled from: ViewCompat */
    public interface C0666k {
        /* renamed from: a */
        boolean mo5173a(View view, KeyEvent keyEvent);
    }

    /* renamed from: b.g.k.w$l */
    /* compiled from: ViewCompat */
    static class C0667l {

        /* renamed from: a */
        private static final ArrayList<WeakReference<View>> f4757a = new ArrayList<>();

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f4758b = null;

        /* renamed from: c */
        private SparseArray<WeakReference<View>> f4759c = null;

        /* renamed from: d */
        private WeakReference<KeyEvent> f4760d = null;

        C0667l() {
        }

        /* renamed from: a */
        static C0667l m5638a(View view) {
            int i = C0576b.f4387R;
            C0667l lVar = (C0667l) view.getTag(i);
            if (lVar != null) {
                return lVar;
            }
            C0667l lVar2 = new C0667l();
            view.setTag(i, lVar2);
            return lVar2;
        }

        /* renamed from: c */
        private View m5639c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f4758b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = m5639c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (m5641e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m5640d() {
            if (this.f4759c == null) {
                this.f4759c = new SparseArray<>();
            }
            return this.f4759c;
        }

        /* renamed from: e */
        private boolean m5641e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0576b.f4388S);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((C0666k) arrayList.get(size)).mo5173a(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m5642g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f4758b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f4757a;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f4758b == null) {
                        this.f4758b = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f4757a;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f4758b.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f4758b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo5174b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m5642g();
            }
            View c = m5639c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m5640d().put(keyCode, new WeakReference(c));
                }
            }
            return c != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo5175f(KeyEvent keyEvent) {
            WeakReference<KeyEvent> weakReference = this.f4760d;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f4760d = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray d = m5640d();
            if (keyEvent.getAction() == 1) {
                int indexOfKey = d.indexOfKey(keyEvent.getKeyCode());
                if (indexOfKey >= 0) {
                    weakReference2 = (WeakReference) d.valueAt(indexOfKey);
                    d.removeAt(indexOfKey);
                }
            }
            if (weakReference2 == null) {
                weakReference2 = (WeakReference) d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && ViewCompat.m5536S(view)) {
                m5641e(view, keyEvent);
            }
            return true;
        }
    }

    /* renamed from: A */
    public static int m5510A(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: A0 */
    public static void m5511A0(View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: B */
    public static int m5512B(View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: B0 */
    public static void m5513B0(View view, PointerIconCompat uVar) {
        if (VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (uVar != null ? uVar.mo5150a() : null));
        }
    }

    /* renamed from: C */
    public static int m5514C(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: C0 */
    public static void m5515C0(View view, int i, int i2) {
        if (VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: D */
    public static int m5516D(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f4740e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f4739d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4740e = true;
        }
        Field field = f4739d;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: D0 */
    public static void m5517D0(View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f4741f == null) {
            f4741f = new WeakHashMap<>();
        }
        f4741f.put(view, str);
    }

    /* renamed from: E */
    public static int m5518E(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f4738c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f4737b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4738c = true;
        }
        Field field = f4737b;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: E0 */
    private static void m5519E0(View view) {
        if (m5510A(view) == 0) {
            m5591x0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m5510A((View) parent) == 4) {
                m5591x0(view, 2);
                return;
            }
        }
    }

    /* renamed from: F */
    public static String[] m5520F(View view) {
        return (String[]) view.getTag(C0576b.tag_on_receive_content_mime_types);
    }

    /* renamed from: F0 */
    private static C0661g<CharSequence> m5521F0() {
        return new C0658d(C0576b.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: G */
    static AccessibilityDelegateCompat m5522G(View view) {
        AccessibilityDelegateCompat l = m5566l(view);
        if (l == null) {
            l = new AccessibilityDelegateCompat();
        }
        m5573o0(view, l);
        return l;
    }

    /* renamed from: G0 */
    public static void m5523G0(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof NestedScrollingChild) {
            ((NestedScrollingChild) view).stopNestedScroll();
        }
    }

    /* renamed from: H */
    public static int m5524H(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: H0 */
    private static void m5525H0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: I */
    public static int m5526I(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: J */
    public static WindowInsetsCompat m5527J(View view) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            return C0664i.m5635a(view);
        }
        if (i >= 21) {
            return C0662h.m5633c(view);
        }
        return null;
    }

    /* renamed from: K */
    public static final CharSequence m5528K(View view) {
        return (CharSequence) m5521F0().mo5170f(view);
    }

    /* renamed from: L */
    public static String m5529L(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f4741f;
        if (weakHashMap == null) {
            return null;
        }
        return (String) weakHashMap.get(view);
    }

    /* renamed from: M */
    public static int m5530M(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: N */
    public static float m5531N(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: O */
    public static boolean m5532O(View view) {
        if (VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: P */
    public static boolean m5533P(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: Q */
    public static boolean m5534Q(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: R */
    public static boolean m5535R(View view) {
        Boolean bool = (Boolean) m5544a().mo5170f(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: S */
    public static boolean m5536S(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: T */
    public static boolean m5537T(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: U */
    public static boolean m5538U(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof NestedScrollingChild) {
            return ((NestedScrollingChild) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: V */
    public static boolean m5539V(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: W */
    public static boolean m5540W(View view) {
        Boolean bool = (Boolean) m5571n0().mo5170f(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: X */
    static void m5541X(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m5574p(view) != null && view.getVisibility() == 0;
            int i2 = 32;
            if (m5572o(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(m5574p(view));
                    m5519E0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m5574p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: Y */
    public static void m5542Y(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect x = m5590x();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m5552e(view, i);
            if (z && x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(x);
            }
        } else {
            m5552e(view, i);
        }
    }

    /* renamed from: Z */
    public static void m5543Z(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect x = m5590x();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m5554f(view, i);
            if (z && x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(x);
            }
        } else {
            m5554f(view, i);
        }
    }

    /* renamed from: a */
    private static C0661g<Boolean> m5544a() {
        return new C0659e(C0576b.f4383J, Boolean.class, 28);
    }

    /* renamed from: a0 */
    public static WindowInsetsCompat m5545a0(View view, WindowInsetsCompat e0Var) {
        if (VERSION.SDK_INT >= 21) {
            WindowInsets r = e0Var.mo5003r();
            if (r != null) {
                WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(r);
                if (!onApplyWindowInsets.equals(r)) {
                    return WindowInsetsCompat.m5248t(onApplyWindowInsets, view);
                }
            }
        }
        return e0Var;
    }

    /* renamed from: b */
    public static int m5546b(View view, CharSequence charSequence, AccessibilityViewCommand fVar) {
        int r = m5578r(view);
        if (r != -1) {
            m5548c(view, new C0634a(r, charSequence, fVar));
        }
        return r;
    }

    /* renamed from: b0 */
    public static void m5547b0(View view, AccessibilityNodeInfoCompat cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.mo5095x0());
    }

    /* renamed from: c */
    private static void m5548c(View view, C0634a aVar) {
        if (VERSION.SDK_INT >= 21) {
            m5522G(view);
            m5563j0(aVar.mo5098b(), view);
            m5576q(view).add(aVar);
            m5541X(view, 0);
        }
    }

    /* renamed from: c0 */
    private static C0661g<CharSequence> m5549c0() {
        return new C0657c(C0576b.f4384K, CharSequence.class, 8, 28);
    }

    /* renamed from: d */
    public static ViewPropertyAnimatorCompat m5550d(View view) {
        if (f4742g == null) {
            f4742g = new WeakHashMap<>();
        }
        ViewPropertyAnimatorCompat a0Var = (ViewPropertyAnimatorCompat) f4742g.get(view);
        if (a0Var != null) {
            return a0Var;
        }
        ViewPropertyAnimatorCompat a0Var2 = new ViewPropertyAnimatorCompat(view);
        f4742g.put(view, a0Var2);
        return a0Var2;
    }

    /* renamed from: d0 */
    public static boolean m5551d0(View view, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: e */
    private static void m5552e(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m5525H0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m5525H0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    public static ContentInfoCompat m5553e0(View view, ContentInfoCompat cVar) {
        ContentInfoCompat cVar2;
        String str = "ViewCompat";
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(cVar);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
            Log.d(str, sb.toString());
        }
        OnReceiveContentListener rVar = (OnReceiveContentListener) view.getTag(C0576b.tag_on_receive_content_listener);
        if (rVar == null) {
            return m5592y(view).mo1547a(cVar);
        }
        ContentInfoCompat a = rVar.mo2342a(view, cVar);
        if (a == null) {
            cVar2 = null;
        } else {
            cVar2 = m5592y(view).mo1547a(a);
        }
        return cVar2;
    }

    /* renamed from: f */
    private static void m5554f(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m5525H0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m5525H0((View) parent);
            }
        }
    }

    /* renamed from: f0 */
    public static void m5555f0(View view) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: g */
    public static WindowInsetsCompat m5556g(View view, WindowInsetsCompat e0Var, Rect rect) {
        return VERSION.SDK_INT >= 21 ? C0662h.m5632b(view, e0Var, rect) : e0Var;
    }

    /* renamed from: g0 */
    public static void m5557g0(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: h */
    public static WindowInsetsCompat m5558h(View view, WindowInsetsCompat e0Var) {
        if (VERSION.SDK_INT >= 21) {
            WindowInsets r = e0Var.mo5003r();
            if (r != null) {
                WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(r);
                if (!dispatchApplyWindowInsets.equals(r)) {
                    return WindowInsetsCompat.m5248t(dispatchApplyWindowInsets, view);
                }
            }
        }
        return e0Var;
    }

    /* renamed from: h0 */
    public static void m5559h0(View view, Runnable runnable, long j) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: i */
    static boolean m5560i(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0667l.m5638a(view).mo5174b(view, keyEvent);
    }

    /* renamed from: i0 */
    public static void m5561i0(View view, int i) {
        if (VERSION.SDK_INT >= 21) {
            m5563j0(i, view);
            m5541X(view, 0);
        }
    }

    /* renamed from: j */
    static boolean m5562j(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0667l.m5638a(view).mo5175f(keyEvent);
    }

    /* renamed from: j0 */
    private static void m5563j0(int i, View view) {
        List q = m5576q(view);
        for (int i2 = 0; i2 < q.size(); i2++) {
            if (((C0634a) q.get(i2)).mo5098b() == i) {
                q.remove(i2);
                return;
            }
        }
    }

    /* renamed from: k */
    public static int m5564k() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = f4736a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: k0 */
    public static void m5565k0(View view, C0634a aVar, CharSequence charSequence, AccessibilityViewCommand fVar) {
        if (fVar == null && charSequence == null) {
            m5561i0(view, aVar.mo5098b());
        } else {
            m5548c(view, aVar.mo5097a(charSequence, fVar));
        }
    }

    /* renamed from: l */
    public static AccessibilityDelegateCompat m5566l(View view) {
        AccessibilityDelegate m = m5568m(view);
        if (m == null) {
            return null;
        }
        if (m instanceof C0613a) {
            return ((C0613a) m).f4595a;
        }
        return new AccessibilityDelegateCompat(m);
    }

    /* renamed from: l0 */
    public static void m5567l0(View view) {
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: m */
    private static AccessibilityDelegate m5568m(View view) {
        if (VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return m5570n(view);
    }

    /* renamed from: m0 */
    public static void m5569m0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (VERSION.SDK_INT >= 29) {
            C0665j.m5636a(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: n */
    private static AccessibilityDelegate m5570n(View view) {
        if (f4744i) {
            return null;
        }
        if (f4743h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4743h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4744i = true;
                return null;
            }
        }
        try {
            Object obj = f4743h.get(view);
            if (obj instanceof AccessibilityDelegate) {
                return (AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4744i = true;
            return null;
        }
    }

    /* renamed from: n0 */
    private static C0661g<Boolean> m5571n0() {
        return new C0656b(C0576b.f4385O, Boolean.class, 28);
    }

    /* renamed from: o */
    public static int m5572o(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: o0 */
    public static void m5573o0(View view, AccessibilityDelegateCompat aVar) {
        AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m5568m(view) instanceof C0613a)) {
            aVar = new AccessibilityDelegateCompat();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.mo4948d();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: p */
    public static CharSequence m5574p(View view) {
        return (CharSequence) m5549c0().mo5170f(view);
    }

    /* renamed from: p0 */
    public static void m5575p0(View view, boolean z) {
        m5544a().mo5171g(view, Boolean.valueOf(z));
    }

    /* renamed from: q */
    private static List<C0634a> m5576q(View view) {
        int i = C0576b.f4381H;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    /* renamed from: q0 */
    public static void m5577q0(View view, int i) {
        if (VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: r */
    private static int m5578r(View view) {
        List q = m5576q(view);
        int i = 0;
        int i2 = -1;
        while (true) {
            int[] iArr = f4746k;
            if (i >= iArr.length || i2 != -1) {
                return i2;
            }
            int i3 = iArr[i];
            boolean z = true;
            for (int i4 = 0; i4 < q.size(); i4++) {
                z &= ((C0634a) q.get(i4)).mo5098b() != i3;
            }
            if (z) {
                i2 = i3;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: r0 */
    public static void m5579r0(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: s */
    public static ColorStateList m5580s(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        return view instanceof TintableBackgroundView ? ((TintableBackgroundView) view).getSupportBackgroundTintList() : null;
    }

    /* renamed from: s0 */
    public static void m5581s0(View view, ColorStateList colorStateList) {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof TintableBackgroundView) {
            ((TintableBackgroundView) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: t */
    public static Mode m5582t(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        return view instanceof TintableBackgroundView ? ((TintableBackgroundView) view).getSupportBackgroundTintMode() : null;
    }

    /* renamed from: t0 */
    public static void m5583t0(View view, Mode mode) {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            view.setBackgroundTintMode(mode);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof TintableBackgroundView) {
            ((TintableBackgroundView) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: u */
    public static Rect m5584u(View view) {
        if (VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: u0 */
    public static void m5585u0(View view, Rect rect) {
        if (VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: v */
    public static Display m5586v(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m5536S(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: v0 */
    public static void m5587v0(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: w */
    public static float m5588w(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: w0 */
    public static void m5589w0(View view, boolean z) {
        if (VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: x */
    private static Rect m5590x() {
        if (f4745j == null) {
            f4745j = new ThreadLocal<>();
        }
        Rect rect = (Rect) f4745j.get();
        if (rect == null) {
            rect = new Rect();
            f4745j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: x0 */
    public static void m5591x0(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 19) {
            view.setImportantForAccessibility(i);
        } else if (i2 >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: y */
    private static OnReceiveContentViewBehavior m5592y(View view) {
        if (view instanceof OnReceiveContentViewBehavior) {
            return (OnReceiveContentViewBehavior) view;
        }
        return f4747l;
    }

    /* renamed from: y0 */
    public static void m5593y0(View view, int i) {
        if (VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: z */
    public static boolean m5594z(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: z0 */
    public static void m5595z0(View view, OnApplyWindowInsetsListener qVar) {
        if (VERSION.SDK_INT >= 21) {
            C0662h.m5634d(view, qVar);
        }
    }
}
