package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.AppOpsManagerCompat;

/* renamed from: androidx.core.content.b */
public final class PermissionChecker {
    /* renamed from: a */
    public static int m1765a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String b = AppOpsManagerCompat.m1726b(str);
        if (b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (AppOpsManagerCompat.m1725a(context, b, str2) != 0) {
            return -2;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m1766b(Context context, String str) {
        return m1765a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
