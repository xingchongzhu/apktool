package p067c.p068a.p069a.p070a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import p067c.p068a.p069a.p070a.p111m2.Log;

/* renamed from: c.a.a.a.y1 */
final class WakeLockManager {

    /* renamed from: a */
    private final PowerManager f8977a;

    /* renamed from: b */
    private WakeLock f8978b;

    /* renamed from: c */
    private boolean f8979c;

    /* renamed from: d */
    private boolean f8980d;

    public WakeLockManager(Context context) {
        this.f8977a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    /* renamed from: c */
    private void m11233c() {
        WakeLock wakeLock = this.f8978b;
        if (wakeLock != null) {
            if (!this.f8979c || !this.f8980d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }

    /* renamed from: a */
    public void mo7772a(boolean z) {
        if (z && this.f8978b == null) {
            PowerManager powerManager = this.f8977a;
            if (powerManager == null) {
                Log.m10386h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f8978b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f8979c = z;
        m11233c();
    }

    /* renamed from: b */
    public void mo7773b(boolean z) {
        this.f8980d = z;
        m11233c();
    }
}
