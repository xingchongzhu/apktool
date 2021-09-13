package p000a.p001a.p002a.p003a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: a.a.a.a.a */
public interface IResultReceiver extends IInterface {

    /* renamed from: a.a.a.a.a$a */
    /* compiled from: IResultReceiver */
    public static abstract class C0000a extends Binder implements IResultReceiver {

        /* renamed from: a.a.a.a.a$a$a */
        /* compiled from: IResultReceiver */
        private static class C0001a implements IResultReceiver {

            /* renamed from: a */
            private IBinder f0a;

            C0001a(IBinder iBinder) {
                this.f0a = iBinder;
            }

            public IBinder asBinder() {
                return this.f0a;
            }
        }

        public C0000a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: p */
        public static IResultReceiver m1p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver)) {
                return new C0001a(iBinder);
            }
            return (IResultReceiver) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "android.support.v4.os.IResultReceiver";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo1b(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: b */
    void mo1b(int i, Bundle bundle) throws RemoteException;
}
