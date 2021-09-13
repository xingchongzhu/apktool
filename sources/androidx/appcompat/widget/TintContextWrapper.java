package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.u0 */
public class TintContextWrapper extends ContextWrapper {

    /* renamed from: a */
    private static final Object f1215a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<TintContextWrapper>> f1216b;

    /* renamed from: c */
    private final Resources f1217c;

    /* renamed from: d */
    private final Theme f1218d;

    private TintContextWrapper(Context context) {
        super(context);
        if (VectorEnabledTintResources.m1072b()) {
            VectorEnabledTintResources c1Var = new VectorEnabledTintResources(this, context.getResources());
            this.f1217c = c1Var;
            Theme newTheme = c1Var.newTheme();
            this.f1218d = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1217c = new TintResources(this, context.getResources());
        this.f1218d = null;
    }

    /* renamed from: a */
    private static boolean m1356a(Context context) {
        if ((context instanceof TintContextWrapper) || (context.getResources() instanceof TintResources) || (context.getResources() instanceof VectorEnabledTintResources)) {
            return false;
        }
        if (VERSION.SDK_INT < 21 || VectorEnabledTintResources.m1072b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Context m1357b(Context context) {
        if (!m1356a(context)) {
            return context;
        }
        synchronized (f1215a) {
            ArrayList<WeakReference<TintContextWrapper>> arrayList = f1216b;
            if (arrayList == null) {
                f1216b = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f1216b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1216b.remove(size);
                    }
                }
                for (int size2 = f1216b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f1216b.get(size2);
                    TintContextWrapper u0Var = weakReference2 != null ? (TintContextWrapper) weakReference2.get() : null;
                    if (u0Var != null && u0Var.getBaseContext() == context) {
                        return u0Var;
                    }
                }
            }
            TintContextWrapper u0Var2 = new TintContextWrapper(context);
            f1216b.add(new WeakReference(u0Var2));
            return u0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1217c.getAssets();
    }

    public Resources getResources() {
        return this.f1217c;
    }

    public Theme getTheme() {
        Theme theme = this.f1218d;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Theme theme = this.f1218d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
