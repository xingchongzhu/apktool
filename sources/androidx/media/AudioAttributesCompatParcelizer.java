package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f2662d = (AudioAttributesImpl) bVar.mo3977v(audioAttributesCompat.f2662d, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel bVar) {
        bVar.mo3979x(false, false);
        bVar.mo3958M(audioAttributesCompat.f2662d, 1);
    }
}
