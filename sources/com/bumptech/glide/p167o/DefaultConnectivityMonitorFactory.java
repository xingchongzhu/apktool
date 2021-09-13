package com.bumptech.glide.p167o;

import android.content.Context;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.p167o.ConnectivityMonitor.C1615a;

/* renamed from: com.bumptech.glide.o.f */
public class DefaultConnectivityMonitorFactory implements ConnectivityMonitorFactory {
    /* renamed from: a */
    public ConnectivityMonitor mo9372a(Context context, C1615a aVar) {
        boolean z = ContextCompat.m1755a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        String str = "ConnectivityMonitor";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (z) {
            return new DefaultConnectivityMonitor(context, aVar);
        }
        return new NullConnectivityMonitor();
    }
}
