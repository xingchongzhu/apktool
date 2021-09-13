package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.C2053k;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.p198a.MaterialThemeOverlay;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p041i.BidiFormatter;
import p010b.p034g.p043k.AccessibilityDelegateCompat;
import p010b.p034g.p043k.MarginLayoutParamsCompat;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p048i.p049a.AbsSavedState;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1271c;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.C1293h;
import p067c.p068a.p069a.p114b.C1295j;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeDrawable;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel.C1276b;
import p067c.p068a.p069a.p114b.p119m.AnimationUtils;
import p067c.p068a.p069a.p114b.p126s.MaterialColors;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;

public class TextInputLayout extends LinearLayout {

    /* renamed from: a */
    private static final int f13320a = C1296k.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private CharSequence f13321A;

    /* renamed from: A0 */
    private int f13322A0;

    /* renamed from: B */
    private boolean f13323B;

    /* renamed from: B0 */
    private int f13324B0;

    /* renamed from: C */
    private MaterialShapeDrawable f13325C;

    /* renamed from: C0 */
    private int f13326C0;

    /* renamed from: D */
    private MaterialShapeDrawable f13327D;

    /* renamed from: D0 */
    private int f13328D0;

    /* renamed from: E0 */
    private int f13329E0;

    /* renamed from: F0 */
    private boolean f13330F0;

    /* renamed from: G */
    private ShapeAppearanceModel f13331G;

    /* renamed from: G0 */
    final CollapsingTextHelper f13332G0;

    /* renamed from: H */
    private final int f13333H;

    /* renamed from: H0 */
    private boolean f13334H0;

    /* renamed from: I */
    private int f13335I;

    /* renamed from: I0 */
    private boolean f13336I0;

    /* renamed from: J */
    private int f13337J;

    /* renamed from: J0 */
    private ValueAnimator f13338J0;

    /* renamed from: K */
    private int f13339K;

    /* renamed from: K0 */
    private boolean f13340K0;

    /* renamed from: L */
    private int f13341L;
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public boolean f13342L0;

    /* renamed from: M */
    private int f13343M;

    /* renamed from: N */
    private int f13344N;

    /* renamed from: O */
    private int f13345O;

    /* renamed from: P */
    private final Rect f13346P;

    /* renamed from: Q */
    private final Rect f13347Q;

    /* renamed from: R */
    private final RectF f13348R;

    /* renamed from: S */
    private Typeface f13349S;

    /* renamed from: T */
    private final CheckableImageButton f13350T;

    /* renamed from: U */
    private ColorStateList f13351U;

    /* renamed from: V */
    private boolean f13352V;

    /* renamed from: W */
    private Mode f13353W;

    /* renamed from: a0 */
    private boolean f13354a0;

    /* renamed from: b */
    private final FrameLayout f13355b;

    /* renamed from: b0 */
    private Drawable f13356b0;

    /* renamed from: c */
    private final LinearLayout f13357c;

    /* renamed from: c0 */
    private int f13358c0;

    /* renamed from: d */
    private final LinearLayout f13359d;

    /* renamed from: d0 */
    private OnLongClickListener f13360d0;

    /* renamed from: e */
    private final FrameLayout f13361e;

    /* renamed from: e0 */
    private final LinkedHashSet<C2083f> f13362e0;

    /* renamed from: f */
    EditText f13363f;

    /* renamed from: f0 */
    private int f13364f0;

    /* renamed from: g */
    private CharSequence f13365g;

    /* renamed from: g0 */
    private final SparseArray<EndIconDelegate> f13366g0;

    /* renamed from: h */
    private final IndicatorViewController f13367h;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public final CheckableImageButton f13368h0;

    /* renamed from: i */
    boolean f13369i;

    /* renamed from: i0 */
    private final LinkedHashSet<C2084g> f13370i0;

    /* renamed from: j */
    private int f13371j;

    /* renamed from: j0 */
    private ColorStateList f13372j0;

    /* renamed from: k */
    private boolean f13373k;

    /* renamed from: k0 */
    private boolean f13374k0;

    /* renamed from: l */
    private TextView f13375l;

    /* renamed from: l0 */
    private Mode f13376l0;

    /* renamed from: m */
    private int f13377m;

    /* renamed from: m0 */
    private boolean f13378m0;

    /* renamed from: n */
    private int f13379n;

    /* renamed from: n0 */
    private Drawable f13380n0;

    /* renamed from: o */
    private CharSequence f13381o;

    /* renamed from: o0 */
    private int f13382o0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f13383p;

    /* renamed from: p0 */
    private Drawable f13384p0;

    /* renamed from: q */
    private TextView f13385q;

    /* renamed from: q0 */
    private OnLongClickListener f13386q0;

    /* renamed from: r */
    private ColorStateList f13387r;

    /* renamed from: r0 */
    private OnLongClickListener f13388r0;

    /* renamed from: s */
    private int f13389s;

    /* renamed from: s0 */
    private final CheckableImageButton f13390s0;

    /* renamed from: t */
    private ColorStateList f13391t;

    /* renamed from: t0 */
    private ColorStateList f13392t0;

    /* renamed from: u */
    private ColorStateList f13393u;

    /* renamed from: u0 */
    private ColorStateList f13394u0;

    /* renamed from: v */
    private CharSequence f13395v;

    /* renamed from: v0 */
    private ColorStateList f13396v0;

    /* renamed from: w */
    private final TextView f13397w;

    /* renamed from: w0 */
    private int f13398w0;

    /* renamed from: x */
    private CharSequence f13399x;

    /* renamed from: x0 */
    private int f13400x0;

    /* renamed from: y */
    private final TextView f13401y;

    /* renamed from: y0 */
    private int f13402y0;

    /* renamed from: z */
    private boolean f13403z;

    /* renamed from: z0 */
    private ColorStateList f13404z0;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C2078a implements TextWatcher {
        C2078a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo16324u0(!textInputLayout.f13342L0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f13369i) {
                textInputLayout2.mo16237n0(editable.length());
            }
            if (TextInputLayout.this.f13383p) {
                TextInputLayout.this.m16432y0(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C2079b implements Runnable {
        C2079b() {
        }

        public void run() {
            TextInputLayout.this.f13368h0.performClick();
            TextInputLayout.this.f13368h0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class C2080c implements Runnable {
        C2080c() {
        }

        public void run() {
            TextInputLayout.this.f13363f.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    class C2081d implements AnimatorUpdateListener {
        C2081d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f13332G0.mo15960V(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C2082e extends AccessibilityDelegateCompat {

        /* renamed from: d */
        private final TextInputLayout f13409d;

        public C2082e(TextInputLayout textInputLayout) {
            this.f13409d = textInputLayout;
        }

        /* renamed from: g */
        public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
            super.mo2302g(view, cVar);
            EditText editText = this.f13409d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f13409d.getHint();
            CharSequence error = this.f13409d.getError();
            CharSequence placeholderText = this.f13409d.getPlaceholderText();
            int counterMaxLength = this.f13409d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f13409d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f13409d.mo16175N();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            String str = ", ";
            if (z) {
                cVar.mo5090u0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                cVar.mo5090u0(charSequence);
                if (z3 && placeholderText != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(charSequence);
                    sb.append(str);
                    sb.append(placeholderText);
                    cVar.mo5090u0(sb.toString());
                }
            } else if (placeholderText != null) {
                cVar.mo5090u0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (VERSION.SDK_INT >= 26) {
                    cVar.mo5069i0(charSequence);
                } else {
                    if (z) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(text);
                        sb2.append(str);
                        sb2.append(charSequence);
                        charSequence = sb2.toString();
                    }
                    cVar.mo5090u0(charSequence);
                }
                cVar.mo5085r0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            cVar.mo5071j0(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cVar.mo5062e0(error);
            }
            if (VERSION.SDK_INT >= 17 && editText != null) {
                editText.setLabelFor(C1291f.textinput_helper_text);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C2083f {
        /* renamed from: a */
        void mo16331a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C2084g {
        /* renamed from: a */
        void mo16332a(TextInputLayout textInputLayout, int i);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    static class C2085h extends AbsSavedState {
        public static final Creator<C2085h> CREATOR = new C2086a();

        /* renamed from: c */
        CharSequence f13410c;

        /* renamed from: d */
        boolean f13411d;

        /* renamed from: e */
        CharSequence f13412e;

        /* renamed from: f */
        CharSequence f13413f;

        /* renamed from: g */
        CharSequence f13414g;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        static class C2086a implements ClassLoaderCreator<C2085h> {
            C2086a() {
            }

            /* renamed from: a */
            public C2085h createFromParcel(Parcel parcel) {
                return new C2085h(parcel, null);
            }

            /* renamed from: b */
            public C2085h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2085h(parcel, classLoader);
            }

            /* renamed from: c */
            public C2085h[] newArray(int i) {
                return new C2085h[i];
            }
        }

        C2085h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append(this.f13410c);
            sb.append(" hint=");
            sb.append(this.f13412e);
            sb.append(" helperText=");
            sb.append(this.f13413f);
            sb.append(" placeholderText=");
            sb.append(this.f13414g);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f13410c, parcel, i);
            parcel.writeInt(this.f13411d ? 1 : 0);
            TextUtils.writeToParcel(this.f13412e, parcel, i);
            TextUtils.writeToParcel(this.f13413f, parcel, i);
            TextUtils.writeToParcel(this.f13414g, parcel, i);
        }

        C2085h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13410c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f13411d = z;
            this.f13412e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f13413f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f13414g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1270b.textInputStyle);
    }

    /* renamed from: A */
    private boolean m16368A() {
        return this.f13403z && !TextUtils.isEmpty(this.f13321A) && (this.f13325C instanceof CutoutDrawable);
    }

    /* renamed from: A0 */
    private void m16369A0() {
        this.f13397w.setVisibility((this.f13395v == null || mo16175N()) ? 8 : 0);
        m16418q0();
    }

    /* renamed from: B */
    private void m16370B() {
        Iterator it = this.f13362e0.iterator();
        while (it.hasNext()) {
            ((C2083f) it.next()).mo16331a(this);
        }
    }

    /* renamed from: B0 */
    private void m16371B0(boolean z, boolean z2) {
        int defaultColor = this.f13404z0.getDefaultColor();
        int colorForState = this.f13404z0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f13404z0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f13344N = colorForState2;
        } else if (z2) {
            this.f13344N = colorForState;
        } else {
            this.f13344N = defaultColor;
        }
    }

    /* renamed from: C */
    private void m16372C(int i) {
        Iterator it = this.f13370i0.iterator();
        while (it.hasNext()) {
            ((C2084g) it.next()).mo16332a(this, i);
        }
    }

    /* renamed from: C0 */
    private void m16373C0() {
        if (this.f13363f != null) {
            ViewCompat.m5511A0(this.f13401y, getContext().getResources().getDimensionPixelSize(C1288d.material_input_text_to_prefix_suffix_padding), this.f13363f.getPaddingTop(), (mo16173K() || m16382L()) ? 0 : ViewCompat.m5524H(this.f13363f), this.f13363f.getPaddingBottom());
        }
    }

    /* renamed from: D */
    private void m16374D(Canvas canvas) {
        MaterialShapeDrawable gVar = this.f13327D;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f13339K;
            this.f13327D.draw(canvas);
        }
    }

    /* renamed from: D0 */
    private void m16375D0() {
        int visibility = this.f13401y.getVisibility();
        int i = 0;
        boolean z = this.f13399x != null && !mo16175N();
        TextView textView = this.f13401y;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f13401y.getVisibility()) {
            getEndIconDelegate().mo16341c(z);
        }
        m16418q0();
    }

    /* renamed from: E */
    private void m16376E(Canvas canvas) {
        if (this.f13403z) {
            this.f13332G0.mo15967j(canvas);
        }
    }

    /* renamed from: F */
    private void m16377F(boolean z) {
        ValueAnimator valueAnimator = this.f13338J0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f13338J0.cancel();
        }
        if (!z || !this.f13336I0) {
            this.f13332G0.mo15960V(0.0f);
        } else {
            mo16236i(0.0f);
        }
        if (m16368A() && ((CutoutDrawable) this.f13325C).mo16352j0()) {
            m16431y();
        }
        this.f13330F0 = true;
        m16381J();
        m16369A0();
        m16375D0();
    }

    /* renamed from: G */
    private int m16378G(int i, boolean z) {
        int compoundPaddingLeft = i + this.f13363f.getCompoundPaddingLeft();
        return (this.f13395v == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f13397w.getMeasuredWidth()) + this.f13397w.getPaddingLeft();
    }

    /* renamed from: H */
    private int m16379H(int i, boolean z) {
        int compoundPaddingRight = i - this.f13363f.getCompoundPaddingRight();
        return (this.f13395v == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f13397w.getMeasuredWidth() - this.f13397w.getPaddingRight());
    }

    /* renamed from: I */
    private boolean m16380I() {
        return this.f13364f0 != 0;
    }

    /* renamed from: J */
    private void m16381J() {
        TextView textView = this.f13385q;
        if (textView != null && this.f13383p) {
            textView.setText(null);
            this.f13385q.setVisibility(4);
        }
    }

    /* renamed from: L */
    private boolean m16382L() {
        return this.f13390s0.getVisibility() == 0;
    }

    /* renamed from: P */
    private boolean m16383P() {
        if (this.f13335I != 1 || (VERSION.SDK_INT >= 16 && this.f13363f.getMinLines() > 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    private int[] m16384R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: S */
    private void m16385S() {
        m16415p();
        m16391a0();
        mo16172E0();
        m16407k0();
        m16401h();
        if (this.f13335I != 0) {
            m16423t0();
        }
    }

    /* renamed from: T */
    private void m16386T() {
        if (m16368A()) {
            RectF rectF = this.f13348R;
            this.f13332G0.mo15968m(rectF, this.f13363f.getWidth(), this.f13363f.getGravity());
            m16408l(rectF);
            rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
            ((CutoutDrawable) this.f13325C).mo16355p0(rectF);
        }
    }

    /* renamed from: U */
    private static void m16387U(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m16387U((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: X */
    private void m16388X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(m16384R(checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = DrawableCompat.m1859r(drawable).mutate();
            DrawableCompat.m1856o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: Z */
    private void m16389Z() {
        TextView textView = this.f13385q;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: a0 */
    private void m16391a0() {
        if (m16402h0()) {
            ViewCompat.m5579r0(this.f13363f, this.f13325C);
        }
    }

    /* renamed from: b0 */
    private static void m16393b0(CheckableImageButton checkableImageButton, OnLongClickListener onLongClickListener) {
        boolean O = ViewCompat.m5532O(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (O || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(O);
        checkableImageButton.setPressable(O);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        ViewCompat.m5591x0(checkableImageButton, i);
    }

    /* renamed from: c0 */
    private static void m16395c0(CheckableImageButton checkableImageButton, OnClickListener onClickListener, OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m16393b0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: d0 */
    private static void m16397d0(CheckableImageButton checkableImageButton, OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m16393b0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: f0 */
    private boolean m16398f0() {
        return (this.f13390s0.getVisibility() == 0 || ((m16380I() && mo16173K()) || this.f13399x != null)) && this.f13359d.getMeasuredWidth() > 0;
    }

    /* renamed from: g */
    private void m16399g() {
        TextView textView = this.f13385q;
        if (textView != null) {
            this.f13355b.addView(textView);
            this.f13385q.setVisibility(0);
        }
    }

    /* renamed from: g0 */
    private boolean m16400g0() {
        return !(getStartIconDrawable() == null && this.f13395v == null) && this.f13357c.getMeasuredWidth() > 0;
    }

    private EndIconDelegate getEndIconDelegate() {
        EndIconDelegate eVar = (EndIconDelegate) this.f13366g0.get(this.f13364f0);
        return eVar != null ? eVar : (EndIconDelegate) this.f13366g0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f13390s0.getVisibility() == 0) {
            return this.f13390s0;
        }
        if (!m16380I() || !mo16173K()) {
            return null;
        }
        return this.f13368h0;
    }

    /* renamed from: h */
    private void m16401h() {
        if (this.f13363f != null && this.f13335I == 1) {
            if (MaterialResources.m11607h(getContext())) {
                EditText editText = this.f13363f;
                ViewCompat.m5511A0(editText, ViewCompat.m5526I(editText), getResources().getDimensionPixelSize(C1288d.material_filled_edittext_font_2_0_padding_top), ViewCompat.m5524H(this.f13363f), getResources().getDimensionPixelSize(C1288d.material_filled_edittext_font_2_0_padding_bottom));
            } else if (MaterialResources.m11606g(getContext())) {
                EditText editText2 = this.f13363f;
                ViewCompat.m5511A0(editText2, ViewCompat.m5526I(editText2), getResources().getDimensionPixelSize(C1288d.material_filled_edittext_font_1_3_padding_top), ViewCompat.m5524H(this.f13363f), getResources().getDimensionPixelSize(C1288d.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    /* renamed from: h0 */
    private boolean m16402h0() {
        EditText editText = this.f13363f;
        return (editText == null || this.f13325C == null || editText.getBackground() != null || this.f13335I == 0) ? false : true;
    }

    /* renamed from: i0 */
    private void m16403i0() {
        TextView textView = this.f13385q;
        if (textView != null && this.f13383p) {
            textView.setText(this.f13381o);
            this.f13385q.setVisibility(0);
            this.f13385q.bringToFront();
        }
    }

    /* renamed from: j */
    private void m16404j() {
        MaterialShapeDrawable gVar = this.f13325C;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(this.f13331G);
            if (m16427w()) {
                this.f13325C.mo7848c0((float) this.f13339K, this.f13344N);
            }
            int q = m16417q();
            this.f13345O = q;
            this.f13325C.mo7843X(ColorStateList.valueOf(q));
            if (this.f13364f0 == 3) {
                this.f13363f.getBackground().invalidateSelf();
            }
            m16406k();
            invalidate();
        }
    }

    /* renamed from: j0 */
    private void m16405j0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m16410m();
            return;
        }
        Drawable mutate = DrawableCompat.m1859r(getEndIconDrawable()).mutate();
        DrawableCompat.m1855n(mutate, this.f13367h.mo16382o());
        this.f13368h0.setImageDrawable(mutate);
    }

    /* renamed from: k */
    private void m16406k() {
        if (this.f13327D != null) {
            if (m16429x()) {
                this.f13327D.mo7843X(ColorStateList.valueOf(this.f13344N));
            }
            invalidate();
        }
    }

    /* renamed from: k0 */
    private void m16407k0() {
        if (this.f13335I != 1) {
            return;
        }
        if (MaterialResources.m11607h(getContext())) {
            this.f13337J = getResources().getDimensionPixelSize(C1288d.material_font_2_0_box_collapsed_padding_top);
        } else if (MaterialResources.m11606g(getContext())) {
            this.f13337J = getResources().getDimensionPixelSize(C1288d.material_font_1_3_box_collapsed_padding_top);
        }
    }

    /* renamed from: l */
    private void m16408l(RectF rectF) {
        float f = rectF.left;
        int i = this.f13333H;
        rectF.left = f - ((float) i);
        rectF.top -= (float) i;
        rectF.right += (float) i;
        rectF.bottom += (float) i;
    }

    /* renamed from: l0 */
    private void m16409l0(Rect rect) {
        MaterialShapeDrawable gVar = this.f13327D;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.f13343M, rect.right, i);
        }
    }

    /* renamed from: m */
    private void m16410m() {
        m16412n(this.f13368h0, this.f13374k0, this.f13372j0, this.f13378m0, this.f13376l0);
    }

    /* renamed from: m0 */
    private void m16411m0() {
        if (this.f13375l != null) {
            EditText editText = this.f13363f;
            mo16237n0(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: n */
    private void m16412n(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = DrawableCompat.m1859r(drawable).mutate();
            if (z) {
                DrawableCompat.m1856o(drawable, colorStateList);
            }
            if (z2) {
                DrawableCompat.m1857p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: o */
    private void m16413o() {
        m16412n(this.f13350T, this.f13352V, this.f13351U, this.f13354a0, this.f13353W);
    }

    /* renamed from: o0 */
    private static void m16414o0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C1295j.character_counter_overflowed_content_description : C1295j.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: p */
    private void m16415p() {
        int i = this.f13335I;
        if (i == 0) {
            this.f13325C = null;
            this.f13327D = null;
        } else if (i == 1) {
            this.f13325C = new MaterialShapeDrawable(this.f13331G);
            this.f13327D = new MaterialShapeDrawable();
        } else if (i == 2) {
            if (!this.f13403z || (this.f13325C instanceof CutoutDrawable)) {
                this.f13325C = new MaterialShapeDrawable(this.f13331G);
            } else {
                this.f13325C = new CutoutDrawable(this.f13331G);
            }
            this.f13327D = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13335I);
            sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: p0 */
    private void m16416p0() {
        TextView textView = this.f13375l;
        if (textView != null) {
            mo16187e0(textView, this.f13373k ? this.f13377m : this.f13379n);
            if (!this.f13373k) {
                ColorStateList colorStateList = this.f13391t;
                if (colorStateList != null) {
                    this.f13375l.setTextColor(colorStateList);
                }
            }
            if (this.f13373k) {
                ColorStateList colorStateList2 = this.f13393u;
                if (colorStateList2 != null) {
                    this.f13375l.setTextColor(colorStateList2);
                }
            }
        }
    }

    /* renamed from: q */
    private int m16417q() {
        return this.f13335I == 1 ? MaterialColors.m11577e(MaterialColors.m11576d(this, C1270b.colorSurface, 0), this.f13345O) : this.f13345O;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16418q0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f13363f
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.m16400g0()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0049
            android.widget.LinearLayout r0 = r10.f13357c
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f13363f
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f13356b0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f13358c0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f13356b0 = r6
            r10.f13358c0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f13363f
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.TextViewCompat.m1972a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f13356b0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f13363f
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.TextViewCompat.m1983l(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f13356b0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f13363f
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.TextViewCompat.m1972a(r0)
            android.widget.EditText r6 = r10.f13363f
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.TextViewCompat.m1983l(r6, r2, r7, r8, r0)
            r10.f13356b0 = r2
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            boolean r6 = r10.m16398f0()
            if (r6 == 0) goto L_0x00d3
            android.widget.TextView r2 = r10.f13401y
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f13363f
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = p010b.p034g.p043k.MarginLayoutParamsCompat.m5464b(r6)
            int r2 = r2 + r6
        L_0x008c:
            android.widget.EditText r6 = r10.f13363f
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.TextViewCompat.m1972a(r6)
            android.graphics.drawable.Drawable r7 = r10.f13380n0
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.f13382o0
            if (r8 == r2) goto L_0x00ad
            r10.f13382o0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f13363f
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r4 = r10.f13380n0
            r3 = r6[r3]
            androidx.core.widget.TextViewCompat.m1983l(r0, r1, r2, r4, r3)
            goto L_0x00f4
        L_0x00ad:
            if (r7 != 0) goto L_0x00bb
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f13380n0 = r7
            r10.f13382o0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bb:
            r2 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f13380n0
            if (r2 == r7) goto L_0x00d1
            r0 = r6[r4]
            r10.f13384p0 = r0
            android.widget.EditText r0 = r10.f13363f
            r1 = r6[r1]
            r2 = r6[r5]
            r3 = r6[r3]
            androidx.core.widget.TextViewCompat.m1983l(r0, r1, r2, r7, r3)
            goto L_0x00f4
        L_0x00d1:
            r5 = r0
            goto L_0x00f4
        L_0x00d3:
            android.graphics.drawable.Drawable r6 = r10.f13380n0
            if (r6 == 0) goto L_0x00f5
            android.widget.EditText r6 = r10.f13363f
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.TextViewCompat.m1972a(r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.f13380n0
            if (r4 != r7) goto L_0x00f1
            android.widget.EditText r0 = r10.f13363f
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f13384p0
            r3 = r6[r3]
            androidx.core.widget.TextViewCompat.m1983l(r0, r1, r4, r7, r3)
            goto L_0x00f2
        L_0x00f1:
            r5 = r0
        L_0x00f2:
            r10.f13380n0 = r2
        L_0x00f4:
            r0 = r5
        L_0x00f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m16418q0():boolean");
    }

    /* renamed from: r */
    private Rect m16419r(Rect rect) {
        if (this.f13363f != null) {
            Rect rect2 = this.f13347Q;
            boolean z = ViewCompat.m5514C(this) == 1;
            rect2.bottom = rect.bottom;
            int i = this.f13335I;
            if (i == 1) {
                rect2.left = m16378G(rect.left, z);
                rect2.top = rect.top + this.f13337J;
                rect2.right = m16379H(rect.right, z);
                return rect2;
            } else if (i != 2) {
                rect2.left = m16378G(rect.left, z);
                rect2.top = getPaddingTop();
                rect2.right = m16379H(rect.right, z);
                return rect2;
            } else {
                rect2.left = rect.left + this.f13363f.getPaddingLeft();
                rect2.top = rect.top - m16425v();
                rect2.right = rect.right - this.f13363f.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: s */
    private int m16420s(Rect rect, Rect rect2, float f) {
        if (m16383P()) {
            return (int) (((float) rect2.top) + f);
        }
        return rect.bottom - this.f13363f.getCompoundPaddingBottom();
    }

    /* renamed from: s0 */
    private boolean m16421s0() {
        if (this.f13363f == null) {
            return false;
        }
        int max = Math.max(this.f13359d.getMeasuredHeight(), this.f13357c.getMeasuredHeight());
        if (this.f13363f.getMeasuredHeight() >= max) {
            return false;
        }
        this.f13363f.setMinimumHeight(max);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.f13363f == null) {
            if (this.f13364f0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f13363f = editText;
            m16385S();
            setTextInputAccessibilityDelegate(new C2082e(this));
            this.f13332G0.mo15965b0(this.f13363f.getTypeface());
            this.f13332G0.mo15959T(this.f13363f.getTextSize());
            int gravity = this.f13363f.getGravity();
            this.f13332G0.mo15953L((gravity & -113) | 48);
            this.f13332G0.mo15958S(gravity);
            this.f13363f.addTextChangedListener(new C2078a());
            if (this.f13394u0 == null) {
                this.f13394u0 = this.f13363f.getHintTextColors();
            }
            if (this.f13403z) {
                if (TextUtils.isEmpty(this.f13321A)) {
                    CharSequence hint = this.f13363f.getHint();
                    this.f13365g = hint;
                    setHint(hint);
                    this.f13363f.setHint(null);
                }
                this.f13323B = true;
            }
            if (this.f13375l != null) {
                mo16237n0(this.f13363f.getText().length());
            }
            mo16242r0();
            this.f13367h.mo16377e();
            this.f13357c.bringToFront();
            this.f13359d.bringToFront();
            this.f13361e.bringToFront();
            this.f13390s0.bringToFront();
            m16370B();
            m16434z0();
            m16373C0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m16426v0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f13390s0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f13361e;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        m16373C0();
        if (!m16380I()) {
            m16418q0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f13321A)) {
            this.f13321A = charSequence;
            this.f13332G0.mo15963Z(charSequence);
            if (!this.f13330F0) {
                m16386T();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f13383p != z) {
            if (z) {
                AppCompatTextView a0Var = new AppCompatTextView(getContext());
                this.f13385q = a0Var;
                a0Var.setId(C1291f.textinput_placeholder);
                ViewCompat.m5577q0(this.f13385q, 1);
                setPlaceholderTextAppearance(this.f13389s);
                setPlaceholderTextColor(this.f13387r);
                m16399g();
            } else {
                m16389Z();
                this.f13385q = null;
            }
            this.f13383p = z;
        }
    }

    /* renamed from: t */
    private int m16422t(Rect rect, float f) {
        if (m16383P()) {
            return (int) (((float) rect.centerY()) - (f / 2.0f));
        }
        return rect.top + this.f13363f.getCompoundPaddingTop();
    }

    /* renamed from: t0 */
    private void m16423t0() {
        if (this.f13335I != 1) {
            LayoutParams layoutParams = (LayoutParams) this.f13355b.getLayoutParams();
            int v = m16425v();
            if (v != layoutParams.topMargin) {
                layoutParams.topMargin = v;
                this.f13355b.requestLayout();
            }
        }
    }

    /* renamed from: u */
    private Rect m16424u(Rect rect) {
        if (this.f13363f != null) {
            Rect rect2 = this.f13347Q;
            float u = this.f13332G0.mo15972u();
            rect2.left = rect.left + this.f13363f.getCompoundPaddingLeft();
            rect2.top = m16422t(rect, u);
            rect2.right = rect.right - this.f13363f.getCompoundPaddingRight();
            rect2.bottom = m16420s(rect, rect2, u);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: v */
    private int m16425v() {
        float o;
        if (!this.f13403z) {
            return 0;
        }
        int i = this.f13335I;
        if (i == 0 || i == 1) {
            o = this.f13332G0.mo15970o();
        } else if (i != 2) {
            return 0;
        } else {
            o = this.f13332G0.mo15970o() / 2.0f;
        }
        return (int) o;
    }

    /* renamed from: v0 */
    private void m16426v0(boolean z, boolean z2) {
        boolean isEnabled = isEnabled();
        EditText editText = this.f13363f;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f13363f;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean k = this.f13367h.mo16379k();
        ColorStateList colorStateList = this.f13394u0;
        if (colorStateList != null) {
            this.f13332G0.mo15952K(colorStateList);
            this.f13332G0.mo15957R(this.f13394u0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList2 = this.f13394u0;
            int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(new int[]{-16842910}, this.f13329E0) : this.f13329E0;
            this.f13332G0.mo15952K(ColorStateList.valueOf(colorForState));
            this.f13332G0.mo15957R(ColorStateList.valueOf(colorForState));
        } else if (k) {
            this.f13332G0.mo15952K(this.f13367h.mo16383p());
        } else {
            if (this.f13373k) {
                TextView textView = this.f13375l;
                if (textView != null) {
                    this.f13332G0.mo15952K(textView.getTextColors());
                }
            }
            if (z4) {
                ColorStateList colorStateList3 = this.f13396v0;
                if (colorStateList3 != null) {
                    this.f13332G0.mo15952K(colorStateList3);
                }
            }
        }
        if (z3 || !this.f13334H0 || (isEnabled() && z4)) {
            if (z2 || this.f13330F0) {
                m16433z(z);
            }
        } else if (z2 || !this.f13330F0) {
            m16377F(z);
        }
    }

    /* renamed from: w */
    private boolean m16427w() {
        return this.f13335I == 2 && m16429x();
    }

    /* renamed from: w0 */
    private void m16428w0() {
        if (this.f13385q != null) {
            EditText editText = this.f13363f;
            if (editText != null) {
                this.f13385q.setGravity(editText.getGravity());
                this.f13385q.setPadding(this.f13363f.getCompoundPaddingLeft(), this.f13363f.getCompoundPaddingTop(), this.f13363f.getCompoundPaddingRight(), this.f13363f.getCompoundPaddingBottom());
            }
        }
    }

    /* renamed from: x */
    private boolean m16429x() {
        return this.f13339K > -1 && this.f13344N != 0;
    }

    /* renamed from: x0 */
    private void m16430x0() {
        EditText editText = this.f13363f;
        m16432y0(editText == null ? 0 : editText.getText().length());
    }

    /* renamed from: y */
    private void m16431y() {
        if (m16368A()) {
            ((CutoutDrawable) this.f13325C).mo16353m0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m16432y0(int i) {
        if (i != 0 || this.f13330F0) {
            m16381J();
        } else {
            m16403i0();
        }
    }

    /* renamed from: z */
    private void m16433z(boolean z) {
        ValueAnimator valueAnimator = this.f13338J0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f13338J0.cancel();
        }
        if (!z || !this.f13336I0) {
            this.f13332G0.mo15960V(1.0f);
        } else {
            mo16236i(1.0f);
        }
        this.f13330F0 = false;
        if (m16368A()) {
            m16386T();
        }
        m16430x0();
        m16369A0();
        m16375D0();
    }

    /* renamed from: z0 */
    private void m16434z0() {
        if (this.f13363f != null) {
            ViewCompat.m5511A0(this.f13397w, mo16177Q() ? 0 : ViewCompat.m5526I(this.f13363f), this.f13363f.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C1288d.material_input_text_to_prefix_suffix_padding), this.f13363f.getCompoundPaddingBottom());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cc  */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16172E0() {
        /*
            r6 = this;
            c.a.a.b.c0.g r0 = r6.f13325C
            if (r0 == 0) goto L_0x00ee
            int r0 = r6.f13335I
            if (r0 != 0) goto L_0x000a
            goto L_0x00ee
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f13363f
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.f13363f
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.f13329E0
            r6.f13344N = r4
            goto L_0x0081
        L_0x003f:
            com.google.android.material.textfield.f r4 = r6.f13367h
            boolean r4 = r4.mo16379k()
            if (r4 == 0) goto L_0x0058
            android.content.res.ColorStateList r4 = r6.f13404z0
            if (r4 == 0) goto L_0x004f
            r6.m16371B0(r0, r3)
            goto L_0x0081
        L_0x004f:
            com.google.android.material.textfield.f r4 = r6.f13367h
            int r4 = r4.mo16382o()
            r6.f13344N = r4
            goto L_0x0081
        L_0x0058:
            boolean r4 = r6.f13373k
            if (r4 == 0) goto L_0x006f
            android.widget.TextView r4 = r6.f13375l
            if (r4 == 0) goto L_0x006f
            android.content.res.ColorStateList r5 = r6.f13404z0
            if (r5 == 0) goto L_0x0068
            r6.m16371B0(r0, r3)
            goto L_0x0081
        L_0x0068:
            int r4 = r4.getCurrentTextColor()
            r6.f13344N = r4
            goto L_0x0081
        L_0x006f:
            if (r0 == 0) goto L_0x0076
            int r4 = r6.f13402y0
            r6.f13344N = r4
            goto L_0x0081
        L_0x0076:
            if (r3 == 0) goto L_0x007d
            int r4 = r6.f13400x0
            r6.f13344N = r4
            goto L_0x0081
        L_0x007d:
            int r4 = r6.f13398w0
            r6.f13344N = r4
        L_0x0081:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0098
            com.google.android.material.textfield.f r4 = r6.f13367h
            boolean r4 = r4.mo16389x()
            if (r4 == 0) goto L_0x0098
            com.google.android.material.textfield.f r4 = r6.f13367h
            boolean r4 = r4.mo16379k()
            if (r4 == 0) goto L_0x0098
            r1 = 1
        L_0x0098:
            r6.setErrorIconVisible(r1)
            r6.mo16179W()
            r6.mo16180Y()
            r6.mo16178V()
            com.google.android.material.textfield.e r1 = r6.getEndIconDelegate()
            boolean r1 = r1.mo16357d()
            if (r1 == 0) goto L_0x00b7
            com.google.android.material.textfield.f r1 = r6.f13367h
            boolean r1 = r1.mo16379k()
            r6.m16405j0(r1)
        L_0x00b7:
            if (r0 == 0) goto L_0x00c4
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00c4
            int r1 = r6.f13343M
            r6.f13339K = r1
            goto L_0x00c8
        L_0x00c4:
            int r1 = r6.f13341L
            r6.f13339K = r1
        L_0x00c8:
            int r1 = r6.f13335I
            if (r1 != r2) goto L_0x00eb
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00d7
            int r0 = r6.f13324B0
            r6.f13345O = r0
            goto L_0x00eb
        L_0x00d7:
            if (r3 == 0) goto L_0x00e0
            if (r0 != 0) goto L_0x00e0
            int r0 = r6.f13328D0
            r6.f13345O = r0
            goto L_0x00eb
        L_0x00e0:
            if (r0 == 0) goto L_0x00e7
            int r0 = r6.f13326C0
            r6.f13345O = r0
            goto L_0x00eb
        L_0x00e7:
            int r0 = r6.f13322A0
            r6.f13345O = r0
        L_0x00eb:
            r6.m16404j()
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo16172E0():void");
    }

    /* renamed from: K */
    public boolean mo16173K() {
        return this.f13361e.getVisibility() == 0 && this.f13368h0.getVisibility() == 0;
    }

    /* renamed from: M */
    public boolean mo16174M() {
        return this.f13367h.mo16390y();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public final boolean mo16175N() {
        return this.f13330F0;
    }

    /* renamed from: O */
    public boolean mo16176O() {
        return this.f13323B;
    }

    /* renamed from: Q */
    public boolean mo16177Q() {
        return this.f13350T.getVisibility() == 0;
    }

    /* renamed from: V */
    public void mo16178V() {
        m16388X(this.f13368h0, this.f13372j0);
    }

    /* renamed from: W */
    public void mo16179W() {
        m16388X(this.f13390s0, this.f13392t0);
    }

    /* renamed from: Y */
    public void mo16180Y() {
        m16388X(this.f13350T, this.f13351U);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f13355b.addView(view, layoutParams2);
            this.f13355b.setLayoutParams(layoutParams);
            m16423t0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f13363f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f13365g != null) {
            boolean z = this.f13323B;
            this.f13323B = false;
            CharSequence hint = editText.getHint();
            this.f13363f.setHint(this.f13365g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f13363f.setHint(hint);
                this.f13323B = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f13355b.getChildCount());
            for (int i2 = 0; i2 < this.f13355b.getChildCount(); i2++) {
                View childAt = this.f13355b.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f13363f) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f13342L0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f13342L0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m16376E(canvas);
        m16374D(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f13340K0) {
            boolean z = true;
            this.f13340K0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            CollapsingTextHelper aVar = this.f13332G0;
            boolean Y = aVar != null ? aVar.mo15962Y(drawableState) | false : false;
            if (this.f13363f != null) {
                if (!ViewCompat.m5537T(this) || !isEnabled()) {
                    z = false;
                }
                mo16324u0(z);
            }
            mo16242r0();
            mo16172E0();
            if (Y) {
                invalidate();
            }
            this.f13340K0 = false;
        }
    }

    /* renamed from: e */
    public void mo16186e(C2083f fVar) {
        this.f13362e0.add(fVar);
        if (this.f13363f != null) {
            fVar.mo16331a(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e0 */
    public void mo16187e0(TextView textView, int i) {
        boolean z = true;
        try {
            TextViewCompat.m1988q(textView, i);
            if (VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            TextViewCompat.m1988q(textView, C1296k.f9212a);
            textView.setTextColor(ContextCompat.m1756b(getContext(), C1271c.design_error));
        }
    }

    /* renamed from: f */
    public void mo16188f(C2084g gVar) {
        this.f13370i0.add(gVar);
    }

    public int getBaseline() {
        EditText editText = this.f13363f;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m16425v();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: 0000 */
    public MaterialShapeDrawable getBoxBackground() {
        int i = this.f13335I;
        if (i == 1 || i == 2) {
            return this.f13325C;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f13345O;
    }

    public int getBoxBackgroundMode() {
        return this.f13335I;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f13325C.mo7866s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f13325C.mo7869t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f13325C.mo7833G();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f13325C.mo7832F();
    }

    public int getBoxStrokeColor() {
        return this.f13402y0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f13404z0;
    }

    public int getBoxStrokeWidth() {
        return this.f13341L;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f13343M;
    }

    public int getCounterMaxLength() {
        return this.f13371j;
    }

    /* access modifiers changed from: 0000 */
    public CharSequence getCounterOverflowDescription() {
        if (this.f13369i && this.f13373k) {
            TextView textView = this.f13375l;
            if (textView != null) {
                return textView.getContentDescription();
            }
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f13391t;
    }

    public ColorStateList getCounterTextColor() {
        return this.f13391t;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f13394u0;
    }

    public EditText getEditText() {
        return this.f13363f;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f13368h0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f13368h0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f13364f0;
    }

    /* access modifiers changed from: 0000 */
    public CheckableImageButton getEndIconView() {
        return this.f13368h0;
    }

    public CharSequence getError() {
        if (this.f13367h.mo16389x()) {
            return this.f13367h.mo16381n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f13367h.mo16380m();
    }

    public int getErrorCurrentTextColors() {
        return this.f13367h.mo16382o();
    }

    public Drawable getErrorIconDrawable() {
        return this.f13390s0.getDrawable();
    }

    /* access modifiers changed from: 0000 */
    public final int getErrorTextCurrentColor() {
        return this.f13367h.mo16382o();
    }

    public CharSequence getHelperText() {
        if (this.f13367h.mo16390y()) {
            return this.f13367h.mo16384q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f13367h.mo16385r();
    }

    public CharSequence getHint() {
        if (this.f13403z) {
            return this.f13321A;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final float getHintCollapsedTextHeight() {
        return this.f13332G0.mo15970o();
    }

    /* access modifiers changed from: 0000 */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f13332G0.mo15971r();
    }

    public ColorStateList getHintTextColor() {
        return this.f13396v0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f13368h0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f13368h0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f13383p) {
            return this.f13381o;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f13389s;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f13387r;
    }

    public CharSequence getPrefixText() {
        return this.f13395v;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f13397w.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f13397w;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f13350T.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f13350T.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f13399x;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f13401y.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f13401y;
    }

    public Typeface getTypeface() {
        return this.f13349S;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo16236i(float f) {
        if (this.f13332G0.mo15973v() != f) {
            if (this.f13338J0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f13338J0 = valueAnimator;
                valueAnimator.setInterpolator(AnimationUtils.f9612b);
                this.f13338J0.setDuration(167);
                this.f13338J0.addUpdateListener(new C2081d());
            }
            this.f13338J0.setFloatValues(new float[]{this.f13332G0.mo15973v(), f});
            this.f13338J0.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n0 */
    public void mo16237n0(int i) {
        boolean z = this.f13373k;
        int i2 = this.f13371j;
        if (i2 == -1) {
            this.f13375l.setText(String.valueOf(i));
            this.f13375l.setContentDescription(null);
            this.f13373k = false;
        } else {
            this.f13373k = i > i2;
            m16414o0(getContext(), this.f13375l, i, this.f13371j, this.f13373k);
            if (z != this.f13373k) {
                m16416p0();
            }
            this.f13375l.setText(BidiFormatter.m5125c().mo4907j(getContext().getString(C1295j.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f13371j)})));
        }
        if (this.f13363f != null && z != this.f13373k) {
            mo16324u0(false);
            mo16172E0();
            mo16242r0();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f13363f;
        if (editText != null) {
            Rect rect = this.f13346P;
            DescendantOffsetUtils.m16187a(this, editText, rect);
            m16409l0(rect);
            if (this.f13403z) {
                this.f13332G0.mo15959T(this.f13363f.getTextSize());
                int gravity = this.f13363f.getGravity();
                this.f13332G0.mo15953L((gravity & -113) | 48);
                this.f13332G0.mo15958S(gravity);
                this.f13332G0.mo15950H(m16419r(rect));
                this.f13332G0.mo15956P(m16424u(rect));
                this.f13332G0.mo15948E();
                if (m16368A() && !this.f13330F0) {
                    m16386T();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean s0 = m16421s0();
        boolean q0 = m16418q0();
        if (s0 || q0) {
            this.f13363f.post(new C2080c());
        }
        m16428w0();
        m16434z0();
        m16373C0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2085h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2085h hVar = (C2085h) parcelable;
        super.onRestoreInstanceState(hVar.mo5193l());
        setError(hVar.f13410c);
        if (hVar.f13411d) {
            this.f13368h0.post(new C2079b());
        }
        setHint(hVar.f13412e);
        setHelperText(hVar.f13413f);
        setPlaceholderText(hVar.f13414g);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C2085h hVar = new C2085h(super.onSaveInstanceState());
        if (this.f13367h.mo16379k()) {
            hVar.f13410c = getError();
        }
        hVar.f13411d = m16380I() && this.f13368h0.isChecked();
        hVar.f13412e = getHint();
        hVar.f13413f = getHelperText();
        hVar.f13414g = getPlaceholderText();
        return hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r0 */
    public void mo16242r0() {
        EditText editText = this.f13363f;
        if (editText != null && this.f13335I == 0) {
            Drawable background = editText.getBackground();
            if (background != null) {
                if (DrawableUtils.m1120a(background)) {
                    background = background.mutate();
                }
                if (this.f13367h.mo16379k()) {
                    background.setColorFilter(AppCompatDrawableManager.m1159e(this.f13367h.mo16382o(), Mode.SRC_IN));
                } else {
                    if (this.f13373k) {
                        TextView textView = this.f13375l;
                        if (textView != null) {
                            background.setColorFilter(AppCompatDrawableManager.m1159e(textView.getCurrentTextColor(), Mode.SRC_IN));
                        }
                    }
                    DrawableCompat.m1844c(background);
                    this.f13363f.refreshDrawableState();
                }
            }
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f13345O != i) {
            this.f13345O = i;
            this.f13322A0 = i;
            this.f13326C0 = i;
            this.f13328D0 = i;
            m16404j();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(ContextCompat.m1756b(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f13322A0 = defaultColor;
        this.f13345O = defaultColor;
        this.f13324B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f13326C0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f13328D0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m16404j();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f13335I) {
            this.f13335I = i;
            if (this.f13363f != null) {
                m16385S();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f13402y0 != i) {
            this.f13402y0 = i;
            mo16172E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f13398w0 = colorStateList.getDefaultColor();
            this.f13329E0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f13400x0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f13402y0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f13402y0 != colorStateList.getDefaultColor()) {
            this.f13402y0 = colorStateList.getDefaultColor();
        }
        mo16172E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f13404z0 != colorStateList) {
            this.f13404z0 = colorStateList;
            mo16172E0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f13341L = i;
        mo16172E0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f13343M = i;
        mo16172E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f13369i != z) {
            if (z) {
                AppCompatTextView a0Var = new AppCompatTextView(getContext());
                this.f13375l = a0Var;
                a0Var.setId(C1291f.textinput_counter);
                Typeface typeface = this.f13349S;
                if (typeface != null) {
                    this.f13375l.setTypeface(typeface);
                }
                this.f13375l.setMaxLines(1);
                this.f13367h.mo16376d(this.f13375l, 2);
                MarginLayoutParamsCompat.m5466d((MarginLayoutParams) this.f13375l.getLayoutParams(), getResources().getDimensionPixelOffset(C1288d.mtrl_textinput_counter_margin_start));
                m16416p0();
                m16411m0();
            } else {
                this.f13367h.mo16391z(this.f13375l, 2);
                this.f13375l = null;
            }
            this.f13369i = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f13371j != i) {
            if (i > 0) {
                this.f13371j = i;
            } else {
                this.f13371j = -1;
            }
            if (this.f13369i) {
                m16411m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f13377m != i) {
            this.f13377m = i;
            m16416p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f13393u != colorStateList) {
            this.f13393u = colorStateList;
            m16416p0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f13379n != i) {
            this.f13379n = i;
            m16416p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f13391t != colorStateList) {
            this.f13391t = colorStateList;
            m16416p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f13394u0 = colorStateList;
        this.f13396v0 = colorStateList;
        if (this.f13363f != null) {
            mo16324u0(false);
        }
    }

    public void setEnabled(boolean z) {
        m16387U(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f13368h0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f13368h0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? AppCompatResources.m4143d(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f13364f0;
        this.f13364f0 = i;
        m16372C(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo16356b(this.f13335I)) {
            getEndIconDelegate().mo16340a();
            m16410m();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The current box background mode ");
        sb.append(this.f13335I);
        sb.append(" is not supported by the end icon mode ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public void setEndIconOnClickListener(OnClickListener onClickListener) {
        m16395c0(this.f13368h0, onClickListener, this.f13386q0);
    }

    public void setEndIconOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f13386q0 = onLongClickListener;
        m16397d0(this.f13368h0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f13372j0 != colorStateList) {
            this.f13372j0 = colorStateList;
            this.f13374k0 = true;
            m16410m();
        }
    }

    public void setEndIconTintMode(Mode mode) {
        if (this.f13376l0 != mode) {
            this.f13376l0 = mode;
            this.f13378m0 = true;
            m16410m();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo16173K() != z) {
            this.f13368h0.setVisibility(z ? 0 : 8);
            m16373C0();
            m16418q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f13367h.mo16389x()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f13367h.mo16374M(charSequence);
        } else {
            this.f13367h.mo16386t();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f13367h.mo16366B(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f13367h.mo16367C(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? AppCompatResources.m4143d(getContext(), i) : null);
        mo16179W();
    }

    public void setErrorIconOnClickListener(OnClickListener onClickListener) {
        m16395c0(this.f13390s0, onClickListener, this.f13388r0);
    }

    public void setErrorIconOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f13388r0 = onLongClickListener;
        m16397d0(this.f13390s0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f13392t0 = colorStateList;
        Drawable drawable = this.f13390s0.getDrawable();
        if (drawable != null) {
            drawable = DrawableCompat.m1859r(drawable).mutate();
            DrawableCompat.m1856o(drawable, colorStateList);
        }
        if (this.f13390s0.getDrawable() != drawable) {
            this.f13390s0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(Mode mode) {
        Drawable drawable = this.f13390s0.getDrawable();
        if (drawable != null) {
            drawable = DrawableCompat.m1859r(drawable).mutate();
            DrawableCompat.m1857p(drawable, mode);
        }
        if (this.f13390s0.getDrawable() != drawable) {
            this.f13390s0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f13367h.mo16368D(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f13367h.mo16369E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f13334H0 != z) {
            this.f13334H0 = z;
            mo16324u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo16174M()) {
                setHelperTextEnabled(true);
            }
            this.f13367h.mo16375N(charSequence);
        } else if (mo16174M()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f13367h.mo16372H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f13367h.mo16371G(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f13367h.mo16370F(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f13403z) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f13336I0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f13403z) {
            this.f13403z = z;
            if (!z) {
                this.f13323B = false;
                if (!TextUtils.isEmpty(this.f13321A) && TextUtils.isEmpty(this.f13363f.getHint())) {
                    this.f13363f.setHint(this.f13321A);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f13363f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f13321A)) {
                        setHint(hint);
                    }
                    this.f13363f.setHint(null);
                }
                this.f13323B = true;
            }
            if (this.f13363f != null) {
                m16423t0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f13332G0.mo15951I(i);
        this.f13396v0 = this.f13332G0.mo15969n();
        if (this.f13363f != null) {
            mo16324u0(false);
            m16423t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f13396v0 != colorStateList) {
            if (this.f13394u0 == null) {
                this.f13332G0.mo15952K(colorStateList);
            }
            this.f13396v0 = colorStateList;
            if (this.f13363f != null) {
                mo16324u0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? AppCompatResources.m4143d(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f13364f0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f13372j0 = colorStateList;
        this.f13374k0 = true;
        m16410m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(Mode mode) {
        this.f13376l0 = mode;
        this.f13378m0 = true;
        m16410m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.f13383p || !TextUtils.isEmpty(charSequence)) {
            if (!this.f13383p) {
                setPlaceholderTextEnabled(true);
            }
            this.f13381o = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        m16430x0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f13389s = i;
        TextView textView = this.f13385q;
        if (textView != null) {
            TextViewCompat.m1988q(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f13387r != colorStateList) {
            this.f13387r = colorStateList;
            TextView textView = this.f13385q;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f13395v = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f13397w.setText(charSequence);
        m16369A0();
    }

    public void setPrefixTextAppearance(int i) {
        TextViewCompat.m1988q(this.f13397w, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f13397w.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f13350T.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AppCompatResources.m4143d(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(OnClickListener onClickListener) {
        m16395c0(this.f13350T, onClickListener, this.f13360d0);
    }

    public void setStartIconOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f13360d0 = onLongClickListener;
        m16397d0(this.f13350T, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f13351U != colorStateList) {
            this.f13351U = colorStateList;
            this.f13352V = true;
            m16413o();
        }
    }

    public void setStartIconTintMode(Mode mode) {
        if (this.f13353W != mode) {
            this.f13353W = mode;
            this.f13354a0 = true;
            m16413o();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (mo16177Q() != z) {
            this.f13350T.setVisibility(z ? 0 : 8);
            m16434z0();
            m16418q0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f13399x = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f13401y.setText(charSequence);
        m16375D0();
    }

    public void setSuffixTextAppearance(int i) {
        TextViewCompat.m1988q(this.f13401y, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f13401y.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C2082e eVar) {
        EditText editText = this.f13363f;
        if (editText != null) {
            ViewCompat.m5573o0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f13349S) {
            this.f13349S = typeface;
            this.f13332G0.mo15965b0(typeface);
            this.f13367h.mo16373J(typeface);
            TextView textView = this.f13375l;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u0 */
    public void mo16324u0(boolean z) {
        m16426v0(z, false);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        AttributeSet attributeSet2 = attributeSet;
        int i4 = i;
        int i5 = f13320a;
        super(MaterialThemeOverlay.m16587c(context, attributeSet2, i4, i5), attributeSet2, i4);
        this.f13367h = new IndicatorViewController(this);
        this.f13346P = new Rect();
        this.f13347Q = new Rect();
        this.f13348R = new RectF();
        this.f13362e0 = new LinkedHashSet<>();
        this.f13364f0 = 0;
        this.f13366g0 = new SparseArray<>();
        this.f13370i0 = new LinkedHashSet<>();
        CollapsingTextHelper aVar = new CollapsingTextHelper(this);
        this.f13332G0 = aVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f13355b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f13357c = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f13359d = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f13361e = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = AnimationUtils.f9611a;
        aVar.mo15964a0(timeInterpolator);
        aVar.mo15961X(timeInterpolator);
        aVar.mo15953L(8388659);
        int[] iArr = C1297l.f9489k5;
        int i6 = C1297l.f9244D5;
        int i7 = C1297l.f9228B5;
        int i8 = C1297l.f9339Q5;
        int i9 = C1297l.f9374V5;
        int i10 = C1297l.f9402Z5;
        int i11 = i8;
        int i12 = i7;
        int i13 = i6;
        TintTypedArray i14 = ThemeEnforcement.m16229i(context2, attributeSet, iArr, i, i5, i6, i7, i8, i9, i10);
        this.f13403z = i14.mo1832a(C1297l.f9395Y5, true);
        setHint(i14.mo1847p(C1297l.f9513n5));
        this.f13336I0 = i14.mo1832a(C1297l.f9388X5, true);
        this.f13334H0 = i14.mo1832a(C1297l.f9353S5, true);
        this.f13331G = ShapeAppearanceModel.m11345e(context2, attributeSet2, i4, i5).mo7905m();
        this.f13333H = context2.getResources().getDimensionPixelOffset(C1288d.mtrl_textinput_box_label_cutout_padding);
        this.f13337J = i14.mo1836e(C1297l.f9537q5, 0);
        this.f13341L = i14.mo1837f(C1297l.f9593x5, context2.getResources().getDimensionPixelSize(C1288d.mtrl_textinput_box_stroke_width_default));
        this.f13343M = i14.mo1837f(C1297l.f9601y5, context2.getResources().getDimensionPixelSize(C1288d.mtrl_textinput_box_stroke_width_focused));
        this.f13339K = this.f13341L;
        float d = i14.mo1835d(C1297l.f9569u5, -1.0f);
        float d2 = i14.mo1835d(C1297l.f9561t5, -1.0f);
        float d3 = i14.mo1835d(C1297l.f9545r5, -1.0f);
        float d4 = i14.mo1835d(C1297l.f9553s5, -1.0f);
        C1276b v = this.f13331G.mo7895v();
        if (d >= 0.0f) {
            v.mo7899A(d);
        }
        if (d2 >= 0.0f) {
            v.mo7903E(d2);
        }
        if (d3 >= 0.0f) {
            v.mo7914w(d3);
        }
        if (d4 >= 0.0f) {
            v.mo7910s(d4);
        }
        this.f13331G = v.mo7905m();
        ColorStateList b = MaterialResources.m11601b(context2, i14, C1297l.f9521o5);
        if (b != null) {
            int defaultColor = b.getDefaultColor();
            this.f13322A0 = defaultColor;
            this.f13345O = defaultColor;
            if (b.isStateful()) {
                this.f13324B0 = b.getColorForState(new int[]{-16842910}, -1);
                i2 = 2;
                this.f13326C0 = b.getColorForState(new int[]{16842908, 16842910}, -1);
                this.f13328D0 = b.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                i2 = 2;
                this.f13326C0 = this.f13322A0;
                ColorStateList c = AppCompatResources.m4142c(context2, C1271c.mtrl_filled_background_color);
                this.f13324B0 = c.getColorForState(new int[]{-16842910}, -1);
                this.f13328D0 = c.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            i2 = 2;
            this.f13345O = 0;
            this.f13322A0 = 0;
            this.f13324B0 = 0;
            this.f13326C0 = 0;
            this.f13328D0 = 0;
        }
        int i15 = C1297l.f9505m5;
        if (i14.mo1850s(i15)) {
            ColorStateList c2 = i14.mo1834c(i15);
            this.f13396v0 = c2;
            this.f13394u0 = c2;
        }
        int i16 = C1297l.f9577v5;
        ColorStateList b2 = MaterialResources.m11601b(context2, i14, i16);
        this.f13402y0 = i14.mo1833b(i16, 0);
        this.f13398w0 = ContextCompat.m1756b(context2, C1271c.mtrl_textinput_default_box_stroke_color);
        this.f13329E0 = ContextCompat.m1756b(context2, C1271c.mtrl_textinput_disabled_color);
        this.f13400x0 = ContextCompat.m1756b(context2, C1271c.mtrl_textinput_hovered_box_stroke_color);
        if (b2 != null) {
            setBoxStrokeColorStateList(b2);
        }
        int i17 = C1297l.f9585w5;
        if (i14.mo1850s(i17)) {
            setBoxStrokeErrorColor(MaterialResources.m11601b(context2, i14, i17));
        }
        if (i14.mo1845n(i10, -1) != -1) {
            setHintTextAppearance(i14.mo1845n(i10, 0));
        }
        int n = i14.mo1845n(i11, 0);
        CharSequence p = i14.mo1847p(C1297l.f9304L5);
        boolean a = i14.mo1832a(C1297l.f9311M5, false);
        LayoutInflater from = LayoutInflater.from(getContext());
        int i18 = C1293h.design_text_input_end_icon;
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(i18, linearLayout2, false);
        this.f13390s0 = checkableImageButton;
        checkableImageButton.setId(C1291f.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (MaterialResources.m11606g(context2)) {
            MarginLayoutParamsCompat.m5466d((MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        int i19 = C1297l.f9318N5;
        if (i14.mo1850s(i19)) {
            setErrorIconDrawable(i14.mo1838g(i19));
        }
        int i20 = C1297l.f9325O5;
        if (i14.mo1850s(i20)) {
            setErrorIconTintList(MaterialResources.m11601b(context2, i14, i20));
        }
        int i21 = C1297l.f9332P5;
        if (i14.mo1850s(i21)) {
            setErrorIconTintMode(C2053k.m16234e(i14.mo1842k(i21, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(C1295j.error_icon_content_description));
        ViewCompat.m5591x0(checkableImageButton, i2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int n2 = i14.mo1845n(i9, 0);
        boolean a2 = i14.mo1832a(C1297l.f9367U5, false);
        CharSequence p2 = i14.mo1847p(C1297l.f9360T5);
        int n3 = i14.mo1845n(C1297l.f9466h6, 0);
        CharSequence p3 = i14.mo1847p(C1297l.f9458g6);
        int n4 = i14.mo1845n(C1297l.f9490k6, 0);
        CharSequence p4 = i14.mo1847p(C1297l.f9482j6);
        int n5 = i14.mo1845n(C1297l.f9554s6, 0);
        int i22 = n5;
        CharSequence p5 = i14.mo1847p(C1297l.f9546r6);
        boolean a3 = i14.mo1832a(C1297l.f9609z5, false);
        setCounterMaxLength(i14.mo1842k(C1297l.f9220A5, -1));
        this.f13379n = i14.mo1845n(i13, 0);
        this.f13377m = i14.mo1845n(i12, 0);
        int i23 = n4;
        CharSequence charSequence = p4;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C1293h.design_text_input_start_icon, this.f13357c, false);
        this.f13350T = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (MaterialResources.m11606g(context2)) {
            MarginLayoutParamsCompat.m5465c((MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i24 = C1297l.f9522o6;
        if (i14.mo1850s(i24)) {
            setStartIconDrawable(i14.mo1838g(i24));
            int i25 = C1297l.f9514n6;
            if (i14.mo1850s(i25)) {
                setStartIconContentDescription(i14.mo1847p(i25));
            }
            setStartIconCheckable(i14.mo1832a(C1297l.f9506m6, true));
        }
        int i26 = C1297l.f9530p6;
        if (i14.mo1850s(i26)) {
            setStartIconTintList(MaterialResources.m11601b(context2, i14, i26));
        }
        int i27 = C1297l.f9538q6;
        if (i14.mo1850s(i27)) {
            setStartIconTintMode(C2053k.m16234e(i14.mo1842k(i27, -1), null));
        }
        setBoxBackgroundMode(i14.mo1842k(C1297l.f9529p5, 0));
        this.f13368h0 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(i18, this.f13361e, false);
        this.f13361e.addView(this.f13368h0);
        this.f13368h0.setVisibility(8);
        if (MaterialResources.m11606g(context2)) {
            i3 = 0;
            MarginLayoutParamsCompat.m5466d((MarginLayoutParams) this.f13368h0.getLayoutParams(), 0);
        } else {
            i3 = 0;
        }
        this.f13366g0.append(-1, new CustomEndIconDelegate(this));
        this.f13366g0.append(i3, new NoEndIconDelegate(this));
        this.f13366g0.append(1, new PasswordToggleEndIconDelegate(this));
        this.f13366g0.append(2, new ClearTextEndIconDelegate(this));
        this.f13366g0.append(3, new DropdownMenuEndIconDelegate(this));
        int i28 = C1297l.f9283I5;
        if (i14.mo1850s(i28)) {
            setEndIconMode(i14.mo1842k(i28, 0));
            int i29 = C1297l.f9276H5;
            if (i14.mo1850s(i29)) {
                setEndIconDrawable(i14.mo1838g(i29));
            }
            int i30 = C1297l.f9268G5;
            if (i14.mo1850s(i30)) {
                setEndIconContentDescription(i14.mo1847p(i30));
            }
            setEndIconCheckable(i14.mo1832a(C1297l.f9260F5, true));
        } else {
            int i31 = C1297l.f9434d6;
            if (i14.mo1850s(i31)) {
                setEndIconMode(i14.mo1832a(i31, false) ? 1 : 0);
                setEndIconDrawable(i14.mo1838g(C1297l.f9426c6));
                setEndIconContentDescription(i14.mo1847p(C1297l.f9418b6));
                int i32 = C1297l.f9442e6;
                if (i14.mo1850s(i32)) {
                    setEndIconTintList(MaterialResources.m11601b(context2, i14, i32));
                }
                int i33 = C1297l.f9450f6;
                if (i14.mo1850s(i33)) {
                    setEndIconTintMode(C2053k.m16234e(i14.mo1842k(i33, -1), null));
                }
            }
        }
        if (!i14.mo1850s(C1297l.f9434d6)) {
            int i34 = C1297l.f9290J5;
            if (i14.mo1850s(i34)) {
                setEndIconTintList(MaterialResources.m11601b(context2, i14, i34));
            }
            int i35 = C1297l.f9297K5;
            if (i14.mo1850s(i35)) {
                setEndIconTintMode(C2053k.m16234e(i14.mo1842k(i35, -1), null));
            }
        }
        AppCompatTextView a0Var = new AppCompatTextView(context2);
        this.f13397w = a0Var;
        a0Var.setId(C1291f.textinput_prefix_text);
        a0Var.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        ViewCompat.m5577q0(a0Var, 1);
        this.f13357c.addView(this.f13350T);
        this.f13357c.addView(a0Var);
        AppCompatTextView a0Var2 = new AppCompatTextView(context2);
        this.f13401y = a0Var2;
        a0Var2.setId(C1291f.textinput_suffix_text);
        a0Var2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        ViewCompat.m5577q0(a0Var2, 1);
        this.f13359d.addView(a0Var2);
        this.f13359d.addView(this.f13390s0);
        this.f13359d.addView(this.f13361e);
        setHelperTextEnabled(a2);
        setHelperText(p2);
        setHelperTextTextAppearance(n2);
        setErrorEnabled(a);
        setErrorTextAppearance(n);
        setErrorContentDescription(p);
        setCounterTextAppearance(this.f13379n);
        setCounterOverflowTextAppearance(this.f13377m);
        setPlaceholderText(p3);
        setPlaceholderTextAppearance(n3);
        setPrefixText(charSequence);
        setPrefixTextAppearance(i23);
        setSuffixText(p5);
        setSuffixTextAppearance(i22);
        int i36 = C1297l.f9346R5;
        if (i14.mo1850s(i36)) {
            setErrorTextColor(i14.mo1834c(i36));
        }
        int i37 = C1297l.f9381W5;
        if (i14.mo1850s(i37)) {
            setHelperTextColor(i14.mo1834c(i37));
        }
        int i38 = C1297l.f9410a6;
        if (i14.mo1850s(i38)) {
            setHintTextColor(i14.mo1834c(i38));
        }
        int i39 = C1297l.f9252E5;
        if (i14.mo1850s(i39)) {
            setCounterTextColor(i14.mo1834c(i39));
        }
        int i40 = C1297l.f9236C5;
        if (i14.mo1850s(i40)) {
            setCounterOverflowTextColor(i14.mo1834c(i40));
        }
        int i41 = C1297l.f9474i6;
        if (i14.mo1850s(i41)) {
            setPlaceholderTextColor(i14.mo1834c(i41));
        }
        int i42 = C1297l.f9498l6;
        if (i14.mo1850s(i42)) {
            setPrefixTextColor(i14.mo1834c(i42));
        }
        int i43 = C1297l.f9562t6;
        if (i14.mo1850s(i43)) {
            setSuffixTextColor(i14.mo1834c(i43));
        }
        setCounterEnabled(a3);
        setEnabled(i14.mo1832a(C1297l.f9497l5, true));
        i14.mo1851w();
        ViewCompat.m5591x0(this, 2);
        if (VERSION.SDK_INT >= 26) {
            ViewCompat.m5593y0(this, 1);
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f13368h0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f13368h0.setImageDrawable(drawable);
        mo16178V();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f13350T.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f13350T.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            mo16180Y();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f13390s0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f13367h.mo16389x());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f13368h0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f13368h0.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
