package android.support.p004v4.app;

import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.VersionedParcel;

/* renamed from: android.support.v4.app.RemoteActionCompatParcelizer */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel bVar) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(bVar);
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel bVar) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, bVar);
    }
}
