package p010b.p011a.p017n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import p010b.p011a.C0510i;

/* renamed from: b.a.n.d */
public class ContextThemeWrapper extends ContextWrapper {

    /* renamed from: a */
    private int f3784a;

    /* renamed from: b */
    private Theme f3785b;

    /* renamed from: c */
    private LayoutInflater f3786c;

    /* renamed from: d */
    private Configuration f3787d;

    /* renamed from: e */
    private Resources f3788e;

    public ContextThemeWrapper() {
        super(null);
    }

    /* renamed from: b */
    private Resources m4262b() {
        if (this.f3788e == null) {
            Configuration configuration = this.f3787d;
            if (configuration == null) {
                this.f3788e = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                this.f3788e = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f3787d);
                this.f3788e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f3788e;
    }

    /* renamed from: d */
    private void m4263d() {
        boolean z = this.f3785b == null;
        if (z) {
            this.f3785b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3785b.setTo(theme);
            }
        }
        mo4205e(this.f3785b, this.f3784a, z);
    }

    /* renamed from: a */
    public void mo4202a(Configuration configuration) {
        if (this.f3788e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f3787d == null) {
            this.f3787d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int mo4204c() {
        return this.f3784a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo4205e(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m4262b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3786c == null) {
            this.f3786c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3786c;
    }

    public Theme getTheme() {
        Theme theme = this.f3785b;
        if (theme != null) {
            return theme;
        }
        if (this.f3784a == 0) {
            this.f3784a = C0510i.f3439d;
        }
        m4263d();
        return this.f3785b;
    }

    public void setTheme(int i) {
        if (this.f3784a != i) {
            this.f3784a = i;
            m4263d();
        }
    }

    public ContextThemeWrapper(Context context, int i) {
        super(context);
        this.f3784a = i;
    }

    public ContextThemeWrapper(Context context, Theme theme) {
        super(context);
        this.f3785b = theme;
    }
}
