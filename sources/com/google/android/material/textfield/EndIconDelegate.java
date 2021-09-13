package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.e */
abstract class EndIconDelegate {

    /* renamed from: a */
    TextInputLayout f13464a;

    /* renamed from: b */
    Context f13465b;

    /* renamed from: c */
    CheckableImageButton f13466c;

    EndIconDelegate(TextInputLayout textInputLayout) {
        this.f13464a = textInputLayout;
        this.f13465b = textInputLayout.getContext();
        this.f13466c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo16340a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo16356b(int i) {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo16341c(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo16357d() {
        return false;
    }
}
