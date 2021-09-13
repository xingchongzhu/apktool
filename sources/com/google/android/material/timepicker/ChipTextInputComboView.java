package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.C1293h;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Chip f13508a;

    /* renamed from: b */
    private final TextInputLayout f13509b;

    /* renamed from: c */
    private final EditText f13510c;

    /* renamed from: d */
    private TextWatcher f13511d;

    /* renamed from: e */
    private TextView f13512e;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    private class C2117b extends TextWatcherAdapter {
        private C2117b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f13508a.setText(ChipTextInputComboView.this.m16590c("00"));
            } else {
                ChipTextInputComboView.this.f13508a.setText(ChipTextInputComboView.this.m16590c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String m16590c(CharSequence charSequence) {
        return TimeModel.m16633l(getResources(), charSequence);
    }

    /* renamed from: d */
    private void m16591d() {
        if (VERSION.SDK_INT >= 24) {
            this.f13510c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public boolean isChecked() {
        return this.f13508a.isChecked();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m16591d();
    }

    public void setChecked(boolean z) {
        this.f13508a.setChecked(z);
        int i = 0;
        this.f13510c.setVisibility(z ? 0 : 4);
        Chip chip = this.f13508a;
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            this.f13510c.requestFocus();
            if (!TextUtils.isEmpty(this.f13510c.getText())) {
                EditText editText = this.f13510c;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f13508a.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.f13508a.setTag(i, obj);
    }

    public void toggle() {
        this.f13508a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C1293h.material_time_chip, this, false);
        this.f13508a = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C1293h.material_time_input, this, false);
        this.f13509b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f13510c = editText;
        editText.setVisibility(4);
        C2117b bVar = new C2117b();
        this.f13511d = bVar;
        editText.addTextChangedListener(bVar);
        m16591d();
        addView(chip);
        addView(textInputLayout);
        this.f13512e = (TextView) findViewById(C1291f.material_label);
        editText.setSaveEnabled(false);
    }
}
