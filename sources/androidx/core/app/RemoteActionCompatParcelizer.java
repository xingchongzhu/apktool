package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1946a = (IconCompat) bVar.mo3977v(remoteActionCompat.f1946a, 1);
        remoteActionCompat.f1947b = bVar.mo3967l(remoteActionCompat.f1947b, 2);
        remoteActionCompat.f1948c = bVar.mo3967l(remoteActionCompat.f1948c, 3);
        remoteActionCompat.f1949d = (PendingIntent) bVar.mo3973r(remoteActionCompat.f1949d, 4);
        remoteActionCompat.f1950e = bVar.mo3963h(remoteActionCompat.f1950e, 5);
        remoteActionCompat.f1951f = bVar.mo3963h(remoteActionCompat.f1951f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel bVar) {
        bVar.mo3979x(false, false);
        bVar.mo3958M(remoteActionCompat.f1946a, 1);
        bVar.mo3949D(remoteActionCompat.f1947b, 2);
        bVar.mo3949D(remoteActionCompat.f1948c, 3);
        bVar.mo3953H(remoteActionCompat.f1949d, 4);
        bVar.mo3981z(remoteActionCompat.f1950e, 5);
        bVar.mo3981z(remoteActionCompat.f1951f, 6);
    }
}
