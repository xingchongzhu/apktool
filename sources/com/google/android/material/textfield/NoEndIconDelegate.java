package com.google.android.material.textfield;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.material.textfield.h */
class NoEndIconDelegate extends EndIconDelegate {
    NoEndIconDelegate(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16340a() {
        this.f13464a.setEndIconOnClickListener(null);
        this.f13464a.setEndIconDrawable((Drawable) null);
        this.f13464a.setEndIconContentDescription((CharSequence) null);
    }
}
