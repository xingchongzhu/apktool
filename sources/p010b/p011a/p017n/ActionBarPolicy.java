package p010b.p011a.p017n;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.ViewConfiguration;
import p010b.p011a.C0502a;
import p010b.p011a.C0503b;
import p010b.p011a.C0505d;
import p010b.p011a.C0511j;

/* renamed from: b.a.n.a */
public class ActionBarPolicy {

    /* renamed from: a */
    private Context f3781a;

    private ActionBarPolicy(Context context) {
        this.f3781a = context;
    }

    /* renamed from: b */
    public static ActionBarPolicy m4231b(Context context) {
        return new ActionBarPolicy(context);
    }

    /* renamed from: a */
    public boolean mo4192a() {
        return this.f3781a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int mo4193c() {
        return this.f3781a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo4194d() {
        Configuration configuration = this.f3781a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    /* renamed from: e */
    public int mo4195e() {
        return this.f3781a.getResources().getDimensionPixelSize(C0505d.f3312b);
    }

    /* renamed from: f */
    public int mo4196f() {
        TypedArray obtainStyledAttributes = this.f3781a.obtainStyledAttributes(null, C0511j.f3555a, C0502a.f3280c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0511j.f3600j, 0);
        Resources resources = this.f3781a.getResources();
        if (!mo4197g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0505d.f3311a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean mo4197g() {
        return this.f3781a.getResources().getBoolean(C0503b.f3304a);
    }

    /* renamed from: h */
    public boolean mo4198h() {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f3781a).hasPermanentMenuKey();
    }
}
