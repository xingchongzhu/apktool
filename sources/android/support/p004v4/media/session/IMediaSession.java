package android.support.p004v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.media.session.b */
public interface IMediaSession extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* compiled from: IMediaSession */
    public static abstract class C0018a extends Binder implements IMediaSession {

        /* renamed from: android.support.v4.media.session.b$a$a */
        /* compiled from: IMediaSession */
        private static class C0019a implements IMediaSession {

            /* renamed from: a */
            public static IMediaSession f72a;

            /* renamed from: b */
            private IBinder f73b;

            C0019a(IBinder iBinder) {
                this.f73b = iBinder;
            }

            /* renamed from: a */
            public void mo111a(IMediaControllerCallback aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f73b.transact(3, obtain, obtain2, 0) || C0018a.m72q() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0018a.m72q().mo111a(aVar);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f73b;
            }
        }

        /* renamed from: p */
        public static IMediaSession m71p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IMediaSession)) {
                return new C0019a(iBinder);
            }
            return (IMediaSession) queryLocalInterface;
        }

        /* renamed from: q */
        public static IMediaSession m72q() {
            return C0019a.f72a;
        }
    }

    /* renamed from: a */
    void mo111a(IMediaControllerCallback aVar) throws RemoteException;
}
