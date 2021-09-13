package com.umeng.commonsdk.statistics.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.umeng.commonsdk.statistics.common.a */
public class AdvertisingId {

    /* renamed from: com.umeng.commonsdk.statistics.common.a$a */
    /* compiled from: AdvertisingId */
    private static final class C3224a {

        /* renamed from: a */
        private final String f17677a;

        /* renamed from: b */
        private final boolean f17678b;

        C3224a(String str, boolean z) {
            this.f17677a = str;
            this.f17678b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public String m22501b() {
            return this.f17677a;
        }

        /* renamed from: a */
        public boolean mo19307a() {
            return this.f17678b;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.common.a$b */
    /* compiled from: AdvertisingId */
    private static final class C3225b implements ServiceConnection {

        /* renamed from: a */
        boolean f17679a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f17680b;

        private C3225b() {
            this.f17679a = false;
            this.f17680b = new LinkedBlockingQueue<>(1);
        }

        /* renamed from: a */
        public IBinder mo19308a() throws InterruptedException {
            if (!this.f17679a) {
                this.f17679a = true;
                return (IBinder) this.f17680b.take();
            }
            throw new IllegalStateException();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f17680b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.common.a$c */
    /* compiled from: AdvertisingId */
    private static final class C3226c implements IInterface {

        /* renamed from: a */
        private IBinder f17681a;

        public C3226c(IBinder iBinder) {
            this.f17681a = iBinder;
        }

        /* renamed from: a */
        public String mo19311a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f17681a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f17681a;
        }

        /* renamed from: a */
        public boolean mo19312a(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z2 = true;
                obtain.writeInt(z ? 1 : 0);
                this.f17681a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z2 = false;
                }
                return z2;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: a */
    public static String m22497a(Context context) {
        try {
            C3224a c = m22499c(context);
            if (c != null && !c.mo19307a()) {
                return c.m22501b();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static String m22498b(Context context) {
        try {
            C3224a c = m22499c(context);
            if (c == null) {
                return null;
            }
            return c.m22501b();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static C3224a m22499c(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            C3225b bVar = new C3225b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (context.bindService(intent, bVar, 1)) {
                try {
                    C3226c cVar = new C3226c(bVar.mo19308a());
                    boolean a = cVar.mo19312a(true);
                    String str = "";
                    if (!a) {
                        str = cVar.mo19311a();
                    }
                    C3224a aVar = new C3224a(str, a);
                    context.unbindService(bVar);
                    return aVar;
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th) {
                    context.unbindService(bVar);
                    throw th;
                }
            } else {
                throw new IOException("Google Play connection failed");
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
