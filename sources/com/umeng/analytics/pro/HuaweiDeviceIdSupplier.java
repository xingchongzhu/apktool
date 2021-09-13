package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.umeng.analytics.pro.ab */
class HuaweiDeviceIdSupplier implements IDeviceIdSupplier {

    /* renamed from: a */
    private static final String f16534a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

    /* renamed from: b */
    private static final int f16535b = 1;

    /* renamed from: c */
    private static final int f16536c = 2;

    /* renamed from: com.umeng.analytics.pro.ab$a */
    /* compiled from: HuaweiDeviceIdSupplier */
    private static final class C3105a implements ServiceConnection {

        /* renamed from: a */
        boolean f16537a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f16538b;

        private C3105a() {
            this.f16537a = false;
            this.f16538b = new LinkedBlockingQueue<>();
        }

        /* renamed from: a */
        public IBinder mo18860a() throws InterruptedException {
            if (!this.f16537a) {
                this.f16537a = true;
                return (IBinder) this.f16538b.poll(5, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f16538b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.umeng.analytics.pro.ab$b */
    /* compiled from: HuaweiDeviceIdSupplier */
    private static final class C3106b implements IInterface {

        /* renamed from: a */
        private IBinder f16539a;

        public C3106b(IBinder iBinder) {
            this.f16539a = iBinder;
        }

        /* renamed from: a */
        public String mo18863a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(HuaweiDeviceIdSupplier.f16534a);
                this.f16539a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f16539a;
        }

        /* renamed from: b */
        public boolean mo18865b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(HuaweiDeviceIdSupplier.f16534a);
                boolean z = false;
                this.f16539a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z = true;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    HuaweiDeviceIdSupplier() {
    }

    /* renamed from: a */
    public String mo18859a(Context context) {
        C3105a aVar = new C3105a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, aVar, 1)) {
            try {
                return new C3106b(aVar.mo18860a()).mo18863a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }
}
