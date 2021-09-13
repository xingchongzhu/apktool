package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2664a = (AudioAttributes) bVar.mo3973r(audioAttributesImplApi21.f2664a, 1);
        audioAttributesImplApi21.f2665b = bVar.mo3971p(audioAttributesImplApi21.f2665b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel bVar) {
        bVar.mo3979x(false, false);
        bVar.mo3953H(audioAttributesImplApi21.f2664a, 1);
        bVar.mo3951F(audioAttributesImplApi21.f2665b, 2);
    }
}
