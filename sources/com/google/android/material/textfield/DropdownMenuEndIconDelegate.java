package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.AutoCompleteTextView.OnDismissListener;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout.C2082e;
import com.google.android.material.textfield.TextInputLayout.C2083f;
import com.google.android.material.textfield.TextInputLayout.C2084g;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1290e;
import p067c.p068a.p069a.p114b.C1295j;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel;
import p067c.p068a.p069a.p114b.p119m.AnimationUtils;
import p067c.p068a.p069a.p114b.p126s.MaterialColors;

/* renamed from: com.google.android.material.textfield.d */
class DropdownMenuEndIconDelegate extends EndIconDelegate {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final boolean f13435d = (VERSION.SDK_INT >= 21);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final TextWatcher f13436e = new C2097a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final OnFocusChangeListener f13437f = new C2100c();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2082e f13438g = new C2101d(this.f13464a);

    /* renamed from: h */
    private final C2083f f13439h = new C2102e();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i */
    private final C2084g f13440i = new C2103f();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f13441j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f13442k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f13443l = Long.MAX_VALUE;

    /* renamed from: m */
    private StateListDrawable f13444m;

    /* renamed from: n */
    private MaterialShapeDrawable f13445n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public AccessibilityManager f13446o;

    /* renamed from: p */
    private ValueAnimator f13447p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ValueAnimator f13448q;

    /* renamed from: com.google.android.material.textfield.d$a */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C2097a extends TextWatcherAdapter {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        /* compiled from: DropdownMenuEndIconDelegate */
        class C2098a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AutoCompleteTextView f13450a;

            C2098a(AutoCompleteTextView autoCompleteTextView) {
                this.f13450a = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f13450a.isPopupShowing();
                DropdownMenuEndIconDelegate.this.m16484E(isPopupShowing);
                DropdownMenuEndIconDelegate.this.f13441j = isPopupShowing;
            }
        }

        C2097a() {
        }

        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView e = DropdownMenuEndIconDelegate.m16508y(DropdownMenuEndIconDelegate.this.f13464a.getEditText());
            if (DropdownMenuEndIconDelegate.this.f13446o.isTouchExplorationEnabled() && DropdownMenuEndIconDelegate.m16483D(e) && !DropdownMenuEndIconDelegate.this.f13466c.hasFocus()) {
                e.dismissDropDown();
            }
            e.post(new C2098a(e));
        }
    }

    /* renamed from: com.google.android.material.textfield.d$b */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C2099b implements AnimatorUpdateListener {
        C2099b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            DropdownMenuEndIconDelegate.this.f13466c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C2100c implements OnFocusChangeListener {
        C2100c() {
        }

        public void onFocusChange(View view, boolean z) {
            DropdownMenuEndIconDelegate.this.f13464a.setEndIconActivated(z);
            if (!z) {
                DropdownMenuEndIconDelegate.this.m16484E(false);
                DropdownMenuEndIconDelegate.this.f13441j = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C2101d extends C2082e {
        C2101d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: g */
        public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
            super.mo2302g(view, cVar);
            if (!DropdownMenuEndIconDelegate.m16483D(DropdownMenuEndIconDelegate.this.f13464a.getEditText())) {
                cVar.mo5051X(Spinner.class.getName());
            }
            if (cVar.mo5042J()) {
                cVar.mo5069i0(null);
            }
        }

        /* renamed from: h */
        public void mo3882h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3882h(view, accessibilityEvent);
            AutoCompleteTextView e = DropdownMenuEndIconDelegate.m16508y(DropdownMenuEndIconDelegate.this.f13464a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && DropdownMenuEndIconDelegate.this.f13446o.isTouchExplorationEnabled() && !DropdownMenuEndIconDelegate.m16483D(DropdownMenuEndIconDelegate.this.f13464a.getEditText())) {
                DropdownMenuEndIconDelegate.this.m16487H(e);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C2102e implements C2083f {
        C2102e() {
        }

        /* renamed from: a */
        public void mo16331a(TextInputLayout textInputLayout) {
            AutoCompleteTextView e = DropdownMenuEndIconDelegate.m16508y(textInputLayout.getEditText());
            DropdownMenuEndIconDelegate.this.m16485F(e);
            DropdownMenuEndIconDelegate.this.m16505v(e);
            DropdownMenuEndIconDelegate.this.m16486G(e);
            e.setThreshold(0);
            e.removeTextChangedListener(DropdownMenuEndIconDelegate.this.f13436e);
            e.addTextChangedListener(DropdownMenuEndIconDelegate.this.f13436e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!DropdownMenuEndIconDelegate.m16483D(e)) {
                ViewCompat.m5591x0(DropdownMenuEndIconDelegate.this.f13466c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(DropdownMenuEndIconDelegate.this.f13438g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C2103f implements C2084g {

        /* renamed from: com.google.android.material.textfield.d$f$a */
        /* compiled from: DropdownMenuEndIconDelegate */
        class C2104a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AutoCompleteTextView f13457a;

            C2104a(AutoCompleteTextView autoCompleteTextView) {
                this.f13457a = autoCompleteTextView;
            }

            public void run() {
                this.f13457a.removeTextChangedListener(DropdownMenuEndIconDelegate.this.f13436e);
            }
        }

        C2103f() {
        }

        /* renamed from: a */
        public void mo16332a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new C2104a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == DropdownMenuEndIconDelegate.this.f13437f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (DropdownMenuEndIconDelegate.f13435d) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C2105g implements OnClickListener {
        C2105g() {
        }

        public void onClick(View view) {
            DropdownMenuEndIconDelegate.this.m16487H((AutoCompleteTextView) DropdownMenuEndIconDelegate.this.f13464a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$h */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C2106h implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ AutoCompleteTextView f13460a;

        C2106h(AutoCompleteTextView autoCompleteTextView) {
            this.f13460a = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (DropdownMenuEndIconDelegate.this.m16482C()) {
                    DropdownMenuEndIconDelegate.this.f13441j = false;
                }
                DropdownMenuEndIconDelegate.this.m16487H(this.f13460a);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$i */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C2107i implements OnDismissListener {
        C2107i() {
        }

        public void onDismiss() {
            DropdownMenuEndIconDelegate.this.f13441j = true;
            DropdownMenuEndIconDelegate.this.f13443l = System.currentTimeMillis();
            DropdownMenuEndIconDelegate.this.m16484E(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$j */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C2108j extends AnimatorListenerAdapter {
        C2108j() {
        }

        public void onAnimationEnd(Animator animator) {
            DropdownMenuEndIconDelegate dVar = DropdownMenuEndIconDelegate.this;
            dVar.f13466c.setChecked(dVar.f13442k);
            DropdownMenuEndIconDelegate.this.f13448q.start();
        }
    }

    DropdownMenuEndIconDelegate(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: A */
    private MaterialShapeDrawable m16480A(float f, float f2, float f3, int i) {
        ShapeAppearanceModel m = ShapeAppearanceModel.m11341a().mo7899A(f).mo7903E(f).mo7910s(f2).mo7914w(f2).mo7905m();
        MaterialShapeDrawable m2 = MaterialShapeDrawable.m11290m(this.f13465b, f3);
        m2.setShapeAppearanceModel(m);
        m2.mo7845Z(0, i, 0, i);
        return m2;
    }

    /* renamed from: B */
    private void m16481B() {
        this.f13448q = m16509z(67, 0.0f, 1.0f);
        ValueAnimator z = m16509z(50, 1.0f, 0.0f);
        this.f13447p = z;
        z.addListener(new C2108j());
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public boolean m16482C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f13443l;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static boolean m16483D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m16484E(boolean z) {
        if (this.f13442k != z) {
            this.f13442k = z;
            this.f13448q.cancel();
            this.f13447p.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m16485F(AutoCompleteTextView autoCompleteTextView) {
        if (f13435d) {
            int boxBackgroundMode = this.f13464a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f13445n);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f13444m);
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: G */
    public void m16486G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new C2106h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f13437f);
        if (f13435d) {
            autoCompleteTextView.setOnDismissListener(new C2107i());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m16487H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (m16482C()) {
                this.f13441j = false;
            }
            if (!this.f13441j) {
                if (f13435d) {
                    m16484E(!this.f13442k);
                } else {
                    this.f13442k = !this.f13442k;
                    this.f13466c.toggle();
                }
                if (this.f13442k) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                } else {
                    autoCompleteTextView.dismissDropDown();
                }
            } else {
                this.f13441j = false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m16505v(AutoCompleteTextView autoCompleteTextView) {
        if (!m16483D(autoCompleteTextView)) {
            int boxBackgroundMode = this.f13464a.getBoxBackgroundMode();
            MaterialShapeDrawable boxBackground = this.f13464a.getBoxBackground();
            int c = MaterialColors.m11575c(autoCompleteTextView, C1270b.f9070i);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m16507x(autoCompleteTextView, c, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m16506w(autoCompleteTextView, c, iArr, boxBackground);
            }
        }
    }

    /* renamed from: w */
    private void m16506w(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, MaterialShapeDrawable gVar) {
        int boxBackgroundColor = this.f13464a.getBoxBackgroundColor();
        int[] iArr2 = {MaterialColors.m11578f(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f13435d) {
            ViewCompat.m5579r0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        MaterialShapeDrawable gVar2 = new MaterialShapeDrawable(gVar.mo7830C());
        gVar2.mo7843X(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int I = ViewCompat.m5526I(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int H = ViewCompat.m5524H(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        ViewCompat.m5579r0(autoCompleteTextView, layerDrawable);
        ViewCompat.m5511A0(autoCompleteTextView, I, paddingTop, H, paddingBottom);
    }

    /* renamed from: x */
    private void m16507x(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, MaterialShapeDrawable gVar) {
        LayerDrawable layerDrawable;
        int c = MaterialColors.m11575c(autoCompleteTextView, C1270b.colorSurface);
        MaterialShapeDrawable gVar2 = new MaterialShapeDrawable(gVar.mo7830C());
        int f = MaterialColors.m11578f(i, c, 0.1f);
        gVar2.mo7843X(new ColorStateList(iArr, new int[]{f, 0}));
        if (f13435d) {
            gVar2.setTint(c);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f, c});
            MaterialShapeDrawable gVar3 = new MaterialShapeDrawable(gVar.mo7830C());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        ViewCompat.m5579r0(autoCompleteTextView, layerDrawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static AutoCompleteTextView m16508y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: z */
    private ValueAnimator m16509z(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AnimationUtils.f9611a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C2099b());
        return ofFloat;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16340a() {
        float dimensionPixelOffset = (float) this.f13465b.getResources().getDimensionPixelOffset(C1288d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f13465b.getResources().getDimensionPixelOffset(C1288d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f13465b.getResources().getDimensionPixelOffset(C1288d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        MaterialShapeDrawable A = m16480A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        MaterialShapeDrawable A2 = m16480A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f13445n = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f13444m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A);
        this.f13444m.addState(new int[0], A2);
        this.f13464a.setEndIconDrawable(AppCompatResources.m4143d(this.f13465b, f13435d ? C1290e.mtrl_dropdown_arrow : C1290e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f13464a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1295j.exposed_dropdown_menu_content_description));
        this.f13464a.setEndIconOnClickListener(new C2105g());
        this.f13464a.mo16186e(this.f13439h);
        this.f13464a.mo16188f(this.f13440i);
        m16481B();
        this.f13446o = (AccessibilityManager) this.f13465b.getSystemService("accessibility");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo16356b(int i) {
        return i != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo16357d() {
        return true;
    }
}
