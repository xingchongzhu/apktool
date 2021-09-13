package com.bumptech.glide.p167o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.p167o.ConnectivityMonitor.C1615a;
import com.bumptech.glide.p174t.C1638j;

/* renamed from: com.bumptech.glide.o.e */
final class DefaultConnectivityMonitor implements ConnectivityMonitor {

    /* renamed from: a */
    private final Context f11077a;

    /* renamed from: b */
    final C1615a f11078b;

    /* renamed from: c */
    boolean f11079c;

    /* renamed from: d */
    private boolean f11080d;

    /* renamed from: e */
    private final BroadcastReceiver f11081e = new C1616a();

    /* renamed from: com.bumptech.glide.o.e$a */
    /* compiled from: DefaultConnectivityMonitor */
    class C1616a extends BroadcastReceiver {
        C1616a() {
        }

        public void onReceive(Context context, Intent intent) {
            DefaultConnectivityMonitor eVar = DefaultConnectivityMonitor.this;
            boolean z = eVar.f11079c;
            eVar.f11079c = eVar.mo9373l(context);
            if (z != DefaultConnectivityMonitor.this.f11079c) {
                String str = "ConnectivityMonitor";
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("connectivity changed, isConnected: ");
                    sb.append(DefaultConnectivityMonitor.this.f11079c);
                    Log.d(str, sb.toString());
                }
                DefaultConnectivityMonitor eVar2 = DefaultConnectivityMonitor.this;
                eVar2.f11078b.mo8764a(eVar2.f11079c);
            }
        }
    }

    DefaultConnectivityMonitor(Context context, C1615a aVar) {
        this.f11077a = context.getApplicationContext();
        this.f11078b = aVar;
    }

    /* renamed from: m */
    private void m13719m() {
        if (!this.f11080d) {
            this.f11079c = mo9373l(this.f11077a);
            try {
                this.f11077a.registerReceiver(this.f11081e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f11080d = true;
            } catch (SecurityException e) {
                String str = "ConnectivityMonitor";
                if (Log.isLoggable(str, 5)) {
                    Log.w(str, "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: n */
    private void m13720n() {
        if (this.f11080d) {
            this.f11077a.unregisterReceiver(this.f11081e);
            this.f11080d = false;
        }
    }

    /* renamed from: b */
    public void mo8741b() {
        m13719m();
    }

    /* renamed from: f */
    public void mo8742f() {
        m13720n();
    }

    /* renamed from: k */
    public void mo8743k() {
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"MissingPermission"})
    /* renamed from: l */
    public boolean mo9373l(Context context) {
        boolean z = true;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) C1638j.m14081d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                z = false;
            }
            return z;
        } catch (RuntimeException e) {
            String str = "ConnectivityMonitor";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }
}
