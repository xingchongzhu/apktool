package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import java.util.ArrayList;
import java.util.List;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.p119m.AnimationUtils;
import p067c.p068a.p069a.p114b.p119m.AnimatorSetCompat;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;

/* renamed from: com.google.android.material.textfield.f */
final class IndicatorViewController {

    /* renamed from: a */
    private final Context f13467a;

    /* renamed from: b */
    private final TextInputLayout f13468b;

    /* renamed from: c */
    private LinearLayout f13469c;

    /* renamed from: d */
    private int f13470d;

    /* renamed from: e */
    private FrameLayout f13471e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Animator f13472f;

    /* renamed from: g */
    private final float f13473g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f13474h;

    /* renamed from: i */
    private int f13475i;

    /* renamed from: j */
    private CharSequence f13476j;

    /* renamed from: k */
    private boolean f13477k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public TextView f13478l;

    /* renamed from: m */
    private CharSequence f13479m;

    /* renamed from: n */
    private int f13480n;

    /* renamed from: o */
    private ColorStateList f13481o;

    /* renamed from: p */
    private CharSequence f13482p;

    /* renamed from: q */
    private boolean f13483q;

    /* renamed from: r */
    private TextView f13484r;

    /* renamed from: s */
    private int f13485s;

    /* renamed from: t */
    private ColorStateList f13486t;

    /* renamed from: u */
    private Typeface f13487u;

    /* renamed from: com.google.android.material.textfield.f$a */
    /* compiled from: IndicatorViewController */
    class C2109a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f13488a;

        /* renamed from: b */
        final /* synthetic */ TextView f13489b;

        /* renamed from: c */
        final /* synthetic */ int f13490c;

        /* renamed from: d */
        final /* synthetic */ TextView f13491d;

        C2109a(int i, TextView textView, int i2, TextView textView2) {
            this.f13488a = i;
            this.f13489b = textView;
            this.f13490c = i2;
            this.f13491d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            IndicatorViewController.this.f13474h = this.f13488a;
            IndicatorViewController.this.f13472f = null;
            TextView textView = this.f13489b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f13490c == 1 && IndicatorViewController.this.f13478l != null) {
                    IndicatorViewController.this.f13478l.setText(null);
                }
            }
            TextView textView2 = this.f13491d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f13491d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f13491d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public IndicatorViewController(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f13467a = context;
        this.f13468b = textInputLayout;
        this.f13473g = (float) context.getResources().getDimensionPixelSize(C1288d.design_textinput_caption_translate_y);
    }

    /* renamed from: A */
    private void m16521A(int i, int i2) {
        if (i != i2) {
            if (i2 != 0) {
                TextView l = m16533l(i2);
                if (l != null) {
                    l.setVisibility(0);
                    l.setAlpha(1.0f);
                }
            }
            if (i != 0) {
                TextView l2 = m16533l(i);
                if (l2 != null) {
                    l2.setVisibility(4);
                    if (i == 1) {
                        l2.setText(null);
                    }
                }
            }
            this.f13474h = i2;
        }
    }

    /* renamed from: I */
    private void m16522I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: K */
    private void m16523K(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: L */
    private boolean m16524L(TextView textView, CharSequence charSequence) {
        return ViewCompat.m5537T(this.f13468b) && this.f13468b.isEnabled() && (this.f13475i != this.f13474h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: O */
    private void m16525O(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f13472f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                m16530h(arrayList2, this.f13483q, this.f13484r, 2, i3, i4);
                m16530h(arrayList2, this.f13477k, this.f13478l, 1, i3, i4);
                AnimatorSetCompat.m11474a(animatorSet, arrayList);
                C2109a aVar = new C2109a(i2, m16533l(i), i, m16533l(i2));
                animatorSet.addListener(aVar);
                animatorSet.start();
            } else {
                m16521A(i, i2);
            }
            this.f13468b.mo16242r0();
            this.f13468b.mo16324u0(z2);
            this.f13468b.mo16172E0();
        }
    }

    /* renamed from: f */
    private boolean m16529f() {
        return (this.f13469c == null || this.f13468b.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    private void m16530h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m16531i(textView, i3 == i));
                if (i3 == i) {
                    list.add(m16532j(textView));
                }
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m16531i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(AnimationUtils.f9611a);
        return ofFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m16532j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f13473g, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(AnimationUtils.f9614d);
        return ofFloat;
    }

    /* renamed from: l */
    private TextView m16533l(int i) {
        if (i == 1) {
            return this.f13478l;
        }
        if (i != 2) {
            return null;
        }
        return this.f13484r;
    }

    /* renamed from: s */
    private int m16534s(boolean z, int i, int i2) {
        return z ? this.f13467a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: v */
    private boolean m16535v(int i) {
        if (i != 1 || this.f13478l == null || TextUtils.isEmpty(this.f13476j)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo16366B(CharSequence charSequence) {
        this.f13479m = charSequence;
        TextView textView = this.f13478l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public void mo16367C(boolean z) {
        if (this.f13477k != z) {
            mo16378g();
            if (z) {
                AppCompatTextView a0Var = new AppCompatTextView(this.f13467a);
                this.f13478l = a0Var;
                a0Var.setId(C1291f.textinput_error);
                if (VERSION.SDK_INT >= 17) {
                    this.f13478l.setTextAlignment(5);
                }
                Typeface typeface = this.f13487u;
                if (typeface != null) {
                    this.f13478l.setTypeface(typeface);
                }
                mo16368D(this.f13480n);
                mo16369E(this.f13481o);
                mo16366B(this.f13479m);
                this.f13478l.setVisibility(4);
                ViewCompat.m5577q0(this.f13478l, 1);
                mo16376d(this.f13478l, 0);
            } else {
                mo16386t();
                mo16391z(this.f13478l, 0);
                this.f13478l = null;
                this.f13468b.mo16242r0();
                this.f13468b.mo16172E0();
            }
            this.f13477k = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public void mo16368D(int i) {
        this.f13480n = i;
        TextView textView = this.f13478l;
        if (textView != null) {
            this.f13468b.mo16187e0(textView, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public void mo16369E(ColorStateList colorStateList) {
        this.f13481o = colorStateList;
        TextView textView = this.f13478l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public void mo16370F(int i) {
        this.f13485s = i;
        TextView textView = this.f13484r;
        if (textView != null) {
            TextViewCompat.m1988q(textView, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public void mo16371G(boolean z) {
        if (this.f13483q != z) {
            mo16378g();
            if (z) {
                AppCompatTextView a0Var = new AppCompatTextView(this.f13467a);
                this.f13484r = a0Var;
                a0Var.setId(C1291f.textinput_helper_text);
                if (VERSION.SDK_INT >= 17) {
                    this.f13484r.setTextAlignment(5);
                }
                Typeface typeface = this.f13487u;
                if (typeface != null) {
                    this.f13484r.setTypeface(typeface);
                }
                this.f13484r.setVisibility(4);
                ViewCompat.m5577q0(this.f13484r, 1);
                mo16370F(this.f13485s);
                mo16372H(this.f13486t);
                mo16376d(this.f13484r, 1);
            } else {
                mo16387u();
                mo16391z(this.f13484r, 1);
                this.f13484r = null;
                this.f13468b.mo16242r0();
                this.f13468b.mo16172E0();
            }
            this.f13483q = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public void mo16372H(ColorStateList colorStateList) {
        this.f13486t = colorStateList;
        TextView textView = this.f13484r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public void mo16373J(Typeface typeface) {
        if (typeface != this.f13487u) {
            this.f13487u = typeface;
            m16522I(this.f13478l, typeface);
            m16522I(this.f13484r, typeface);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public void mo16374M(CharSequence charSequence) {
        mo16378g();
        this.f13476j = charSequence;
        this.f13478l.setText(charSequence);
        int i = this.f13474h;
        if (i != 1) {
            this.f13475i = 1;
        }
        m16525O(i, this.f13475i, m16524L(this.f13478l, charSequence));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public void mo16375N(CharSequence charSequence) {
        mo16378g();
        this.f13482p = charSequence;
        this.f13484r.setText(charSequence);
        int i = this.f13474h;
        if (i != 2) {
            this.f13475i = 2;
        }
        m16525O(i, this.f13475i, m16524L(this.f13484r, charSequence));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo16376d(TextView textView, int i) {
        if (this.f13469c == null && this.f13471e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f13467a);
            this.f13469c = linearLayout;
            linearLayout.setOrientation(0);
            this.f13468b.addView(this.f13469c, -1, -2);
            this.f13471e = new FrameLayout(this.f13467a);
            this.f13469c.addView(this.f13471e, new LayoutParams(0, -2, 1.0f));
            if (this.f13468b.getEditText() != null) {
                mo16377e();
            }
        }
        if (mo16388w(i)) {
            this.f13471e.setVisibility(0);
            this.f13471e.addView(textView);
        } else {
            this.f13469c.addView(textView, new LayoutParams(-2, -2));
        }
        this.f13469c.setVisibility(0);
        this.f13470d++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo16377e() {
        if (m16529f()) {
            EditText editText = this.f13468b.getEditText();
            boolean g = MaterialResources.m11606g(this.f13467a);
            LinearLayout linearLayout = this.f13469c;
            int i = C1288d.material_helper_text_font_1_3_padding_horizontal;
            ViewCompat.m5511A0(linearLayout, m16534s(g, i, ViewCompat.m5526I(editText)), m16534s(g, C1288d.material_helper_text_font_1_3_padding_top, this.f13467a.getResources().getDimensionPixelSize(C1288d.material_helper_text_default_padding_top)), m16534s(g, i, ViewCompat.m5524H(editText)), 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo16378g() {
        Animator animator = this.f13472f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo16379k() {
        return m16535v(this.f13475i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public CharSequence mo16380m() {
        return this.f13479m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public CharSequence mo16381n() {
        return this.f13476j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public int mo16382o() {
        TextView textView = this.f13478l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public ColorStateList mo16383p() {
        TextView textView = this.f13478l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public CharSequence mo16384q() {
        return this.f13482p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public int mo16385r() {
        TextView textView = this.f13484r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo16386t() {
        this.f13476j = null;
        mo16378g();
        if (this.f13474h == 1) {
            if (!this.f13483q || TextUtils.isEmpty(this.f13482p)) {
                this.f13475i = 0;
            } else {
                this.f13475i = 2;
            }
        }
        m16525O(this.f13474h, this.f13475i, m16524L(this.f13478l, null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo16387u() {
        mo16378g();
        int i = this.f13474h;
        if (i == 2) {
            this.f13475i = 0;
        }
        m16525O(i, this.f13475i, m16524L(this.f13484r, null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public boolean mo16388w(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public boolean mo16389x() {
        return this.f13477k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public boolean mo16390y() {
        return this.f13483q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public void mo16391z(TextView textView, int i) {
        if (this.f13469c != null) {
            if (mo16388w(i)) {
                FrameLayout frameLayout = this.f13471e;
                if (frameLayout != null) {
                    frameLayout.removeView(textView);
                    int i2 = this.f13470d - 1;
                    this.f13470d = i2;
                    m16523K(this.f13469c, i2);
                }
            }
            this.f13469c.removeView(textView);
            int i22 = this.f13470d - 1;
            this.f13470d = i22;
            m16523K(this.f13469c, i22);
        }
    }
}
