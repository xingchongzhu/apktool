package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.umeng.analytics.pro.IDeviceIdService.C3102a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.umeng.analytics.pro.ae */
public class SamsungDeviceIdSupplier implements IDeviceIdSupplier {

    /* renamed from: a */
    private static final String f16541a = "DeviceIdService";

    /* renamed from: b */
    private static final String f16542b = "com.samsung.android.deviceidservice";

    /* renamed from: c */
    private static final String f16543c = "com.samsung.android.deviceidservice.DeviceIdService";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f16544d = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public CountDownLatch f16545e;

    /* renamed from: f */
    private final ServiceConnection f16546f = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str = SamsungDeviceIdSupplier.f16541a;
            try {
                SamsungDeviceIdSupplier.this.f16544d = C3102a.m21480a(iBinder).mo18852a();
                Log.d(str, "onServiceConnected");
            } catch (RemoteException | NullPointerException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("onServiceConnected failed e=");
                sb.append(e.getMessage());
                Log.e(str, sb.toString());
            }
            SamsungDeviceIdSupplier.this.f16545e.countDown();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(SamsungDeviceIdSupplier.f16541a, "onServiceDisconnected");
        }
    };

    /* renamed from: b */
    private void m21494b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClassName(f16542b, f16543c);
            if (!context.bindService(intent, this.f16546f, 1)) {
                throw new UnsupportedOperationException("not supported service");
            }
        } catch (Error | Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("bindService failed. e=");
            sb.append(e.getMessage());
            Log.e(f16541a, sb.toString());
            this.f16545e.countDown();
        }
    }

    /* renamed from: c */
    private void m21495c(Context context) {
        try {
            context.unbindService(this.f16546f);
        } catch (Error | Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("unbindService failed. e=");
            sb.append(e.getMessage());
            Log.e(f16541a, sb.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public String mo18859a(Context context) {
        String str = f16541a;
        this.f16545e = new CountDownLatch(1);
        try {
            m21494b(context);
            if (!this.f16545e.await(500, TimeUnit.MILLISECONDS)) {
                Log.e(str, "getOAID time-out");
            }
            String str2 = this.f16544d;
            m21495c(context);
            return str2;
        } catch (InterruptedException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getOAID interrupted. e=");
            sb.append(e.getMessage());
            Log.e(str, sb.toString());
            m21495c(context);
            return null;
        } catch (Throwable th) {
            m21495c(context);
            throw th;
        }
    }
}
