package p067c.p068a.p069a.p070a;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import p067c.p068a.p069a.p070a.p111m2.Log;

/* renamed from: c.a.a.a.z1 */
final class WifiLockManager {

    /* renamed from: a */
    private final WifiManager f9046a;

    /* renamed from: b */
    private WifiLock f9047b;

    /* renamed from: c */
    private boolean f9048c;

    /* renamed from: d */
    private boolean f9049d;

    public WifiLockManager(Context context) {
        this.f9046a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: c */
    private void m11245c() {
        WifiLock wifiLock = this.f9047b;
        if (wifiLock != null) {
            if (!this.f9048c || !this.f9049d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }

    /* renamed from: a */
    public void mo7796a(boolean z) {
        if (z && this.f9047b == null) {
            WifiManager wifiManager = this.f9046a;
            if (wifiManager == null) {
                Log.m10386h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f9047b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f9048c = z;
        m11245c();
    }

    /* renamed from: b */
    public void mo7797b(boolean z) {
        this.f9049d = z;
        m11245c();
    }
}
