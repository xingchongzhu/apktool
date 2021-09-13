package p282g.p283a.p284a.p285a.p286a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: g.a.a.a.a.a */
public interface IOpenID extends IInterface {

    /* renamed from: g.a.a.a.a.a$a */
    /* compiled from: IOpenID */
    public static abstract class C3389a extends Binder implements IOpenID {

        /* renamed from: g.a.a.a.a.a$a$a */
        /* compiled from: IOpenID */
        private static class C3390a implements IOpenID {

            /* renamed from: a */
            public IBinder f18797a;

            public C3390a(IBinder iBinder) {
                this.f18797a = iBinder;
            }

            public IBinder asBinder() {
                return this.f18797a;
            }

            /* renamed from: p */
            public String mo20289p(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f18797a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: p */
        public static IOpenID m24013p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOpenID)) {
                return new C3390a(iBinder);
            }
            return (IOpenID) queryLocalInterface;
        }
    }

    /* renamed from: g.a.a.a.a.a$b */
    /* compiled from: HeytapIDSDK */
    public class C3391b {

        /* renamed from: a */
        public static boolean f18798a = false;

        /* renamed from: b */
        public static boolean f18799b = false;
    }

    /* renamed from: g.a.a.a.a.a$c */
    /* compiled from: OpenIDHelper */
    public class C3392c {

        /* renamed from: a */
        public IOpenID f18800a = null;

        /* renamed from: b */
        public String f18801b = null;

        /* renamed from: c */
        public String f18802c = null;

        /* renamed from: d */
        public final Object f18803d = new Object();

        /* renamed from: e */
        public ServiceConnection f18804e = new C3393a();

        /* renamed from: g.a.a.a.a.a$c$a */
        /* compiled from: OpenIDHelper */
        class C3393a implements ServiceConnection {
            public C3393a() {
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                C3392c.this.f18800a = C3389a.m24013p(iBinder);
                synchronized (C3392c.this.f18803d) {
                    C3392c.this.f18803d.notify();
                }
            }

            public void onServiceDisconnected(ComponentName componentName) {
                C3392c.this.f18800a = null;
            }
        }

        /* renamed from: g.a.a.a.a.a$c$b */
        /* compiled from: OpenIDHelper */
        private static class C3394b {

            /* renamed from: a */
            public static final C3392c f18806a = new C3392c(null);
        }

        public /* synthetic */ C3392c(C3393a aVar) {
        }

        /* renamed from: a */
        public synchronized String mo20290a(Context context, String str) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot run on MainThread");
            } else if (this.f18800a == null) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                if (context.bindService(intent, this.f18804e, 1)) {
                    synchronized (this.f18803d) {
                        try {
                            this.f18803d.wait(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (this.f18800a == null) {
                    return "";
                }
                try {
                    return mo20292c(context, str);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    return "";
                }
            } else {
                try {
                    return mo20292c(context, str);
                } catch (RemoteException e3) {
                    e3.printStackTrace();
                    return "";
                }
            }
        }

        /* renamed from: b */
        public boolean mo20291b(Context context) {
            boolean z = false;
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
                if (VERSION.SDK_INT >= 28) {
                    if (packageInfo != null && packageInfo.getLongVersionCode() >= 1) {
                        z = true;
                    }
                    return z;
                }
                if (packageInfo != null && packageInfo.versionCode >= 1) {
                    z = true;
                }
                return z;
            } catch (NameNotFoundException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: c */
        public final String mo20292c(Context context, String str) {
            Signature[] signatureArr;
            if (TextUtils.isEmpty(this.f18801b)) {
                this.f18801b = context.getPackageName();
            }
            if (TextUtils.isEmpty(this.f18802c)) {
                String str2 = null;
                try {
                    signatureArr = context.getPackageManager().getPackageInfo(this.f18801b, 64).signatures;
                } catch (NameNotFoundException e) {
                    e.printStackTrace();
                    signatureArr = null;
                }
                if (signatureArr != null && signatureArr.length > 0) {
                    String str3 = "SHA1";
                    byte[] byteArray = signatureArr[0].toByteArray();
                    try {
                        MessageDigest instance = MessageDigest.getInstance(str3);
                        if (instance != null) {
                            byte[] digest = instance.digest(byteArray);
                            StringBuilder sb = new StringBuilder();
                            for (byte b : digest) {
                                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                            }
                            str2 = sb.toString();
                        }
                    } catch (NoSuchAlgorithmException e2) {
                        e2.printStackTrace();
                    }
                }
                this.f18802c = str2;
            }
            String p = ((C3390a) this.f18800a).mo20289p(this.f18801b, this.f18802c, str);
            return TextUtils.isEmpty(p) ? "" : p;
        }
    }
}
