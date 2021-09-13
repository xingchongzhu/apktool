package androidx.appcompat.widget;

import android.content.res.Resources.Theme;
import android.widget.SpinnerAdapter;

/* renamed from: androidx.appcompat.widget.t0 */
public interface ThemedSpinnerAdapter extends SpinnerAdapter {
    Theme getDropDownViewTheme();

    void setDropDownViewTheme(Theme theme);
}
