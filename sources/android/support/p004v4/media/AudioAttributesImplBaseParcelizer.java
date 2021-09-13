package android.support.p004v4.media;

import androidx.media.AudioAttributesImplBase;
import androidx.versionedparcelable.VersionedParcel;

/* renamed from: android.support.v4.media.AudioAttributesImplBaseParcelizer */
public final class AudioAttributesImplBaseParcelizer extends androidx.media.AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel bVar) {
        return androidx.media.AudioAttributesImplBaseParcelizer.read(bVar);
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel bVar) {
        androidx.media.AudioAttributesImplBaseParcelizer.write(audioAttributesImplBase, bVar);
    }
}
