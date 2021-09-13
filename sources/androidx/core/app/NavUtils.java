package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;

/* renamed from: androidx.core.app.g */
public final class NavUtils {
    /* renamed from: a */
    public static Intent m1730a(Activity activity) {
        Intent intent;
        if (VERSION.SDK_INT >= 16) {
            Intent parentActivityIntent = activity.getParentActivityIntent();
            if (parentActivityIntent != null) {
                return parentActivityIntent;
            }
        }
        String c = m1732c(activity);
        if (c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, c);
        try {
            if (m1733d(activity, componentName) == null) {
                intent = Intent.makeMainActivity(componentName);
            } else {
                intent = new Intent().setComponent(componentName);
            }
            return intent;
        } catch (NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("getParentActivityIntent: bad parentActivityName '");
            sb.append(c);
            sb.append("' in manifest");
            Log.e("NavUtils", sb.toString());
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m1731b(Context context, ComponentName componentName) throws NameNotFoundException {
        Intent intent;
        String d = m1733d(context, componentName);
        if (d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), d);
        if (m1733d(context, componentName2) == null) {
            intent = Intent.makeMainActivity(componentName2);
        } else {
            intent = new Intent().setComponent(componentName2);
        }
        return intent;
    }

    /* renamed from: c */
    public static String m1732c(Activity activity) {
        try {
            return m1733d(activity, activity.getComponentName());
        } catch (NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public static String m1733d(Context context, ComponentName componentName) throws NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        int i = VERSION.SDK_INT;
        int i2 = 640;
        if (i >= 29) {
            i2 = 269222528;
        } else if (i >= 24) {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        if (i >= 16) {
            String str = activityInfo.parentActivityName;
            if (str != null) {
                return str;
            }
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(string);
            string = sb.toString();
        }
        return string;
    }

    /* renamed from: e */
    public static void m1734e(Activity activity, Intent intent) {
        if (VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    /* renamed from: f */
    public static boolean m1735f(Activity activity, Intent intent) {
        if (VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        String action = activity.getIntent().getAction();
        return action != null && !action.equals("android.intent.action.MAIN");
    }
}
