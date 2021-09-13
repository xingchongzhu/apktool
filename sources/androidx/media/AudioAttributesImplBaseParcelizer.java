package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2667a = bVar.mo3971p(audioAttributesImplBase.f2667a, 1);
        audioAttributesImplBase.f2668b = bVar.mo3971p(audioAttributesImplBase.f2668b, 2);
        audioAttributesImplBase.f2669c = bVar.mo3971p(audioAttributesImplBase.f2669c, 3);
        audioAttributesImplBase.f2670d = bVar.mo3971p(audioAttributesImplBase.f2670d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel bVar) {
        bVar.mo3979x(false, false);
        bVar.mo3951F(audioAttributesImplBase.f2667a, 1);
        bVar.mo3951F(audioAttributesImplBase.f2668b, 2);
        bVar.mo3951F(audioAttributesImplBase.f2669c, 3);
        bVar.mo3951F(audioAttributesImplBase.f2670d, 4);
    }
}
