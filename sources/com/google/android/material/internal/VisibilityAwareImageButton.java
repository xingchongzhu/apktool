package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.google.android.material.internal.l */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: a */
    private int f13206a;

    /* renamed from: b */
    public final void mo16015b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f13206a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f13206a;
    }

    public void setVisibility(int i) {
        mo16015b(i, true);
    }
}
