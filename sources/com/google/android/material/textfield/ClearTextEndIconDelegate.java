package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout.C2083f;
import com.google.android.material.textfield.TextInputLayout.C2084g;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p067c.p068a.p069a.p114b.C1290e;
import p067c.p068a.p069a.p114b.C1295j;
import p067c.p068a.p069a.p114b.p119m.AnimationUtils;

/* renamed from: com.google.android.material.textfield.a */
class ClearTextEndIconDelegate extends EndIconDelegate {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f13415d = new C2087a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final OnFocusChangeListener f13416e = new C2088b();

    /* renamed from: f */
    private final C2083f f13417f = new C2089c();

    /* renamed from: g */
    private final C2084g f13418g = new C2090d();

    /* renamed from: h */
    private AnimatorSet f13419h;

    /* renamed from: i */
    private ValueAnimator f13420i;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* compiled from: ClearTextEndIconDelegate */
    class C2087a implements TextWatcher {
        C2087a() {
        }

        public void afterTextChanged(Editable editable) {
            if (ClearTextEndIconDelegate.this.f13464a.getSuffixText() == null) {
                ClearTextEndIconDelegate.this.m16461i(ClearTextEndIconDelegate.m16464l(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* compiled from: ClearTextEndIconDelegate */
    class C2088b implements OnFocusChangeListener {
        C2088b() {
        }

        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            ClearTextEndIconDelegate aVar = ClearTextEndIconDelegate.this;
            if (!z3 || !z) {
                z2 = false;
            }
            aVar.m16461i(z2);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* compiled from: ClearTextEndIconDelegate */
    class C2089c implements C2083f {
        C2089c() {
        }

        /* renamed from: a */
        public void mo16331a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && ClearTextEndIconDelegate.m16464l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(ClearTextEndIconDelegate.this.f13416e);
            editText.removeTextChangedListener(ClearTextEndIconDelegate.this.f13415d);
            editText.addTextChangedListener(ClearTextEndIconDelegate.this.f13415d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* compiled from: ClearTextEndIconDelegate */
    class C2090d implements C2084g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* compiled from: ClearTextEndIconDelegate */
        class C2091a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ EditText f13425a;

            C2091a(EditText editText) {
                this.f13425a = editText;
            }

            public void run() {
                this.f13425a.removeTextChangedListener(ClearTextEndIconDelegate.this.f13415d);
            }
        }

        C2090d() {
        }

        /* renamed from: a */
        public void mo16332a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.post(new C2091a(editText));
                if (editText.getOnFocusChangeListener() == ClearTextEndIconDelegate.this.f13416e) {
                    editText.setOnFocusChangeListener(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    /* compiled from: ClearTextEndIconDelegate */
    class C2092e implements OnClickListener {
        C2092e() {
        }

        public void onClick(View view) {
            Editable text = ClearTextEndIconDelegate.this.f13464a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            ClearTextEndIconDelegate.this.f13464a.mo16178V();
        }
    }

    /* renamed from: com.google.android.material.textfield.a$f */
    /* compiled from: ClearTextEndIconDelegate */
    class C2093f extends AnimatorListenerAdapter {
        C2093f() {
        }

        public void onAnimationStart(Animator animator) {
            ClearTextEndIconDelegate.this.f13464a.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$g */
    /* compiled from: ClearTextEndIconDelegate */
    class C2094g extends AnimatorListenerAdapter {
        C2094g() {
        }

        public void onAnimationEnd(Animator animator) {
            ClearTextEndIconDelegate.this.f13464a.setEndIconVisible(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$h */
    /* compiled from: ClearTextEndIconDelegate */
    class C2095h implements AnimatorUpdateListener {
        C2095h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClearTextEndIconDelegate.this.f13466c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$i */
    /* compiled from: ClearTextEndIconDelegate */
    class C2096i implements AnimatorUpdateListener {
        C2096i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ClearTextEndIconDelegate.this.f13466c.setScaleX(floatValue);
            ClearTextEndIconDelegate.this.f13466c.setScaleY(floatValue);
        }
    }

    ClearTextEndIconDelegate(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m16461i(boolean z) {
        boolean z2 = this.f13464a.mo16173K() == z;
        if (z && !this.f13419h.isRunning()) {
            this.f13420i.cancel();
            this.f13419h.start();
            if (z2) {
                this.f13419h.end();
            }
        } else if (!z) {
            this.f13419h.cancel();
            this.f13420i.start();
            if (z2) {
                this.f13420i.end();
            }
        }
    }

    /* renamed from: j */
    private ValueAnimator m16462j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(AnimationUtils.f9611a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C2095h());
        return ofFloat;
    }

    /* renamed from: k */
    private ValueAnimator m16463k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(AnimationUtils.f9614d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C2096i());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m16464l(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: m */
    private void m16465m() {
        ValueAnimator k = m16463k();
        ValueAnimator j = m16462j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f13419h = animatorSet;
        animatorSet.playTogether(new Animator[]{k, j});
        this.f13419h.addListener(new C2093f());
        ValueAnimator j2 = m16462j(1.0f, 0.0f);
        this.f13420i = j2;
        j2.addListener(new C2094g());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16340a() {
        this.f13464a.setEndIconDrawable(AppCompatResources.m4143d(this.f13465b, C1290e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f13464a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1295j.clear_text_end_icon_content_description));
        this.f13464a.setEndIconOnClickListener(new C2092e());
        this.f13464a.mo16186e(this.f13417f);
        this.f13464a.mo16188f(this.f13418g);
        m16465m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo16341c(boolean z) {
        if (this.f13464a.getSuffixText() != null) {
            m16461i(z);
        }
    }
}
