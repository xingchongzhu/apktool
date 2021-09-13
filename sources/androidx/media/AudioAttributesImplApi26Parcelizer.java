package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f2664a = (AudioAttributes) bVar.mo3973r(audioAttributesImplApi26.f2664a, 1);
        audioAttributesImplApi26.f2665b = bVar.mo3971p(audioAttributesImplApi26.f2665b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel bVar) {
        bVar.mo3979x(false, false);
        bVar.mo3953H(audioAttributesImplApi26.f2664a, 1);
        bVar.mo3951F(audioAttributesImplApi26.f2665b, 2);
    }
}
