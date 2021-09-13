package p010b.p034g.p043k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;

/* renamed from: b.g.k.v */
public interface TintableBackgroundView {
    ColorStateList getSupportBackgroundTintList();

    Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(ColorStateList colorStateList);

    void setSupportBackgroundTintMode(Mode mode);
}
