package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;

/* renamed from: androidx.core.graphics.drawable.f */
final class WrappedDrawableState extends ConstantState {

    /* renamed from: a */
    int f2037a;

    /* renamed from: b */
    ConstantState f2038b;

    /* renamed from: c */
    ColorStateList f2039c = null;

    /* renamed from: d */
    Mode f2040d = WrappedDrawableApi14.f2029a;

    WrappedDrawableState(WrappedDrawableState fVar) {
        if (fVar != null) {
            this.f2037a = fVar.f2037a;
            this.f2038b = fVar.f2038b;
            this.f2039c = fVar.f2039c;
            this.f2040d = fVar.f2040d;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2228a() {
        return this.f2038b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f2037a;
        ConstantState constantState = this.f2038b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public Drawable newDrawable(Resources resources) {
        if (VERSION.SDK_INT >= 21) {
            return new WrappedDrawableApi21(this, resources);
        }
        return new WrappedDrawableApi14(this, resources);
    }
}
