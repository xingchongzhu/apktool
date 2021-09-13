package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout.C2083f;
import com.google.android.material.textfield.TextInputLayout.C2084g;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p067c.p068a.p069a.p114b.C1290e;
import p067c.p068a.p069a.p114b.C1295j;

/* renamed from: com.google.android.material.textfield.i */
class PasswordToggleEndIconDelegate extends EndIconDelegate {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f13497d = new C2111a();

    /* renamed from: e */
    private final C2083f f13498e = new C2112b();

    /* renamed from: f */
    private final C2084g f13499f = new C2113c();

    /* renamed from: com.google.android.material.textfield.i$a */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C2111a extends TextWatcherAdapter {
        C2111a() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            PasswordToggleEndIconDelegate iVar = PasswordToggleEndIconDelegate.this;
            iVar.f13466c.setChecked(!iVar.m16570g());
        }
    }

    /* renamed from: com.google.android.material.textfield.i$b */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C2112b implements C2083f {
        C2112b() {
        }

        /* renamed from: a */
        public void mo16331a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            PasswordToggleEndIconDelegate iVar = PasswordToggleEndIconDelegate.this;
            iVar.f13466c.setChecked(!iVar.m16570g());
            editText.removeTextChangedListener(PasswordToggleEndIconDelegate.this.f13497d);
            editText.addTextChangedListener(PasswordToggleEndIconDelegate.this.f13497d);
        }
    }

    /* renamed from: com.google.android.material.textfield.i$c */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C2113c implements C2084g {

        /* renamed from: com.google.android.material.textfield.i$c$a */
        /* compiled from: PasswordToggleEndIconDelegate */
        class C2114a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ EditText f13503a;

            C2114a(EditText editText) {
                this.f13503a = editText;
            }

            public void run() {
                this.f13503a.removeTextChangedListener(PasswordToggleEndIconDelegate.this.f13497d);
            }
        }

        C2113c() {
        }

        /* renamed from: a */
        public void mo16332a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new C2114a(editText));
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.i$d */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C2115d implements OnClickListener {
        C2115d() {
        }

        public void onClick(View view) {
            EditText editText = PasswordToggleEndIconDelegate.this.f13464a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (PasswordToggleEndIconDelegate.this.m16570g()) {
                    editText.setTransformationMethod(null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                PasswordToggleEndIconDelegate.this.f13464a.mo16178V();
            }
        }
    }

    PasswordToggleEndIconDelegate(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m16570g() {
        EditText editText = this.f13464a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: h */
    private static boolean m16571h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16340a() {
        this.f13464a.setEndIconDrawable(AppCompatResources.m4143d(this.f13465b, C1290e.design_password_eye));
        TextInputLayout textInputLayout = this.f13464a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1295j.password_toggle_content_description));
        this.f13464a.setEndIconOnClickListener(new C2115d());
        this.f13464a.mo16186e(this.f13498e);
        this.f13464a.mo16188f(this.f13499f);
        EditText editText = this.f13464a.getEditText();
        if (m16571h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
