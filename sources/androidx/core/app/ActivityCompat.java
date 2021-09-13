package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import java.util.Arrays;

/* renamed from: androidx.core.app.a */
public class ActivityCompat extends ContextCompat {

    /* renamed from: c */
    private static C0241d f1952c;

    /* renamed from: androidx.core.app.a$a */
    /* compiled from: ActivityCompat */
    class C0238a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String[] f1953a;

        /* renamed from: b */
        final /* synthetic */ Activity f1954b;

        /* renamed from: c */
        final /* synthetic */ int f1955c;

        C0238a(String[] strArr, Activity activity, int i) {
            this.f1953a = strArr;
            this.f1954b = activity;
            this.f1955c = i;
        }

        public void run() {
            int[] iArr = new int[this.f1953a.length];
            PackageManager packageManager = this.f1954b.getPackageManager();
            String packageName = this.f1954b.getPackageName();
            int length = this.f1953a.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f1953a[i], packageName);
            }
            ((C0240c) this.f1954b).onRequestPermissionsResult(this.f1955c, this.f1953a, iArr);
        }
    }

    /* renamed from: androidx.core.app.a$b */
    /* compiled from: ActivityCompat */
    class C0239b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f1956a;

        C0239b(Activity activity) {
            this.f1956a = activity;
        }

        public void run() {
            if (!this.f1956a.isFinishing() && !ActivityRecreator.m1724i(this.f1956a)) {
                this.f1956a.recreate();
            }
        }
    }

    /* renamed from: androidx.core.app.a$c */
    /* compiled from: ActivityCompat */
    public interface C0240c {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.a$d */
    /* compiled from: ActivityCompat */
    public interface C0241d {
        /* renamed from: a */
        boolean mo2131a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: androidx.core.app.a$e */
    /* compiled from: ActivityCompat */
    public interface C0242e {
        /* renamed from: a */
        void mo2132a(int i);
    }

    /* renamed from: k */
    public static void m1708k(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: l */
    public static void m1709l(Activity activity) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            activity.recreate();
        } else if (i <= 23) {
            new Handler(activity.getMainLooper()).post(new C0239b(activity));
        } else if (!ActivityRecreator.m1724i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: m */
    public static void m1710m(Activity activity, String[] strArr, int i) {
        C0241d dVar = f1952c;
        if (dVar == null || !dVar.mo2131a(activity, strArr, i)) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Permission request for permissions ");
                    sb.append(Arrays.toString(strArr));
                    sb.append(" must not contain null or empty values");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (VERSION.SDK_INT >= 23) {
                if (activity instanceof C0242e) {
                    ((C0242e) activity).mo2132a(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof C0240c) {
                new Handler(Looper.getMainLooper()).post(new C0238a(strArr, activity, i));
            }
        }
    }

    /* renamed from: n */
    public static boolean m1711n(Activity activity, String str) {
        if (VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: o */
    public static void m1712o(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: p */
    public static void m1713p(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }
}
