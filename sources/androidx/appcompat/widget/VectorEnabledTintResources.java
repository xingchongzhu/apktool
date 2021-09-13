package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.c1 */
public class VectorEnabledTintResources extends Resources {

    /* renamed from: a */
    private static boolean f994a = false;

    /* renamed from: b */
    private final WeakReference<Context> f995b;

    public VectorEnabledTintResources(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f995b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m1071a() {
        return f994a;
    }

    /* renamed from: b */
    public static boolean m1072b() {
        return m1071a() && VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Drawable mo1380c(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Context context = (Context) this.f995b.get();
        if (context != null) {
            return ResourceManagerInternal.m1267h().mo1630t(context, this, i);
        }
        return super.getDrawable(i);
    }
}
