package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.w0 */
class TintResources extends ResourcesWrapper {

    /* renamed from: b */
    private final WeakReference<Context> f1230b;

    public TintResources(Context context, Resources resources) {
        super(resources);
        this.f1230b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1230b.get();
        if (!(drawable == null || context == null)) {
            ResourceManagerInternal.m1267h().mo1632x(context, i, drawable);
        }
        return drawable;
    }
}
