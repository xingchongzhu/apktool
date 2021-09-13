package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.l */
class TwilightManager {

    /* renamed from: a */
    private static TwilightManager f405a;

    /* renamed from: b */
    private final Context f406b;

    /* renamed from: c */
    private final LocationManager f407c;

    /* renamed from: d */
    private final C0089a f408d = new C0089a();

    /* renamed from: androidx.appcompat.app.l$a */
    /* compiled from: TwilightManager */
    private static class C0089a {

        /* renamed from: a */
        boolean f409a;

        /* renamed from: b */
        long f410b;

        /* renamed from: c */
        long f411c;

        /* renamed from: d */
        long f412d;

        /* renamed from: e */
        long f413e;

        /* renamed from: f */
        long f414f;

        C0089a() {
        }
    }

    TwilightManager(Context context, LocationManager locationManager) {
        this.f406b = context;
        this.f407c = locationManager;
    }

    /* renamed from: a */
    static TwilightManager m460a(Context context) {
        if (f405a == null) {
            Context applicationContext = context.getApplicationContext();
            f405a = new TwilightManager(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f405a;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m461b() {
        Location location = null;
        Location c = PermissionChecker.m1766b(this.f406b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m462c("network") : null;
        if (PermissionChecker.m1766b(this.f406b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m462c("gps");
        }
        if (location == null || c == null) {
            if (location != null) {
                c = location;
            }
            return c;
        }
        if (location.getTime() > c.getTime()) {
            c = location;
        }
        return c;
    }

    /* renamed from: c */
    private Location m462c(String str) {
        try {
            if (this.f407c.isProviderEnabled(str)) {
                return this.f407c.getLastKnownLocation(str);
            }
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    /* renamed from: e */
    private boolean m463e() {
        return this.f408d.f414f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m464f(Location location) {
        long j;
        C0089a aVar = this.f408d;
        long currentTimeMillis = System.currentTimeMillis();
        TwilightCalculator b = TwilightCalculator.m458b();
        TwilightCalculator kVar = b;
        kVar.mo451a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b.f402b;
        kVar.mo451a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b.f404d == 1;
        long j3 = b.f403c;
        long j4 = j2;
        long j5 = b.f402b;
        long j6 = j3;
        boolean z2 = z;
        b.mo451a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = b.f403c;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            long j8 = currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6;
            j = j8 + 60000;
        }
        aVar.f409a = z2;
        aVar.f410b = j4;
        aVar.f411c = j6;
        aVar.f412d = j5;
        aVar.f413e = j7;
        aVar.f414f = j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo452d() {
        C0089a aVar = this.f408d;
        if (m463e()) {
            return aVar.f409a;
        }
        Location b = m461b();
        if (b != null) {
            m464f(b);
            return aVar.f409a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
