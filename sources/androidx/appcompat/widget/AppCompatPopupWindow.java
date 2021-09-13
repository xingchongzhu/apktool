package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.PopupWindowCompat;
import p010b.p011a.C0511j;

/* renamed from: androidx.appcompat.widget.q */
class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: a */
    private static final boolean f1156a = (VERSION.SDK_INT < 21);

    /* renamed from: b */
    private boolean f1157b;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1304a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1304a(Context context, AttributeSet attributeSet, int i, int i2) {
        TintTypedArray v = TintTypedArray.m1406v(context, attributeSet, C0511j.f3563b2, i, i2);
        int i3 = C0511j.f3573d2;
        if (v.mo1850s(i3)) {
            m1305b(v.mo1832a(i3, false));
        }
        setBackgroundDrawable(v.mo1838g(C0511j.f3568c2));
        v.mo1851w();
    }

    /* renamed from: b */
    private void m1305b(boolean z) {
        if (f1156a) {
            this.f1157b = z;
        } else {
            PopupWindowCompat.m1969a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1156a && this.f1157b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1156a && this.f1157b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1156a && this.f1157b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
