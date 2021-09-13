package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.umeng.analytics.pro.a */
public interface IDeviceIdService extends IInterface {

    /* renamed from: com.umeng.analytics.pro.a$a */
    /* compiled from: IDeviceIdService */
    public static abstract class C3102a extends Binder implements IDeviceIdService {

        /* renamed from: a */
        static final int f16529a = 1;

        /* renamed from: b */
        static final int f16530b = 2;

        /* renamed from: c */
        static final int f16531c = 3;

        /* renamed from: d */
        private static final String f16532d = "com.samsung.android.deviceidservice.IDeviceIdService";

        /* renamed from: com.umeng.analytics.pro.a$a$a */
        /* compiled from: IDeviceIdService */
        private static class C3103a implements IDeviceIdService {

            /* renamed from: a */
            private IBinder f16533a;

            C3103a(IBinder iBinder) {
                this.f16533a = iBinder;
            }

            /* renamed from: a */
            public String mo18852a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C3102a.f16532d);
                    this.f16533a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f16533a;
            }

            /* renamed from: b */
            public String mo18858b() {
                return C3102a.f16532d;
            }

            /* renamed from: b */
            public String mo18854b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C3102a.f16532d);
                    obtain.writeString(str);
                    this.f16533a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public String mo18853a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C3102a.f16532d);
                    obtain.writeString(str);
                    this.f16533a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3102a() {
            attachInterface(this, f16532d);
        }

        /* renamed from: a */
        public static IDeviceIdService m21480a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f16532d);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDeviceIdService)) {
                return new C3103a(iBinder);
            }
            return (IDeviceIdService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f16532d;
            if (i == 1) {
                parcel.enforceInterface(str);
                String a = mo18852a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(str);
                String a2 = mo18853a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(str);
                String b = mo18854b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    String mo18852a() throws RemoteException;

    /* renamed from: a */
    String mo18853a(String str) throws RemoteException;

    /* renamed from: b */
    String mo18854b(String str) throws RemoteException;
}
