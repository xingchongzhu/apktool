package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: com.google.android.material.timepicker.a */
class MaxInputValidator implements InputFilter {

    /* renamed from: a */
    private int f13560a;

    public MaxInputValidator(int i) {
        this.f13560a = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f13560a) {
                return null;
            }
        } catch (NumberFormatException unused) {
        }
        return "";
    }
}
