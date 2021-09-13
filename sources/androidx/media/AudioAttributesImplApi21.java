package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import androidx.media.AudioAttributesImpl.C0388a;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f2664a;

    /* renamed from: b */
    public int f2665b;

    /* renamed from: androidx.media.AudioAttributesImplApi21$a */
    static class C0389a implements C0388a {

        /* renamed from: a */
        final Builder f2666a = new Builder();

        C0389a() {
        }

        /* renamed from: a */
        public AudioAttributesImpl mo3046a() {
            return new AudioAttributesImplApi21(this.f2666a.build());
        }

        /* renamed from: c */
        public C0389a mo3047b(int i) {
            this.f2666a.setLegacyStreamType(i);
            return this;
        }
    }

    public AudioAttributesImplApi21() {
        this.f2665b = -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f2664a.equals(((AudioAttributesImplApi21) obj).f2664a);
    }

    public int hashCode() {
        return this.f2664a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioAttributesCompat: audioattributes=");
        sb.append(this.f2664a);
        return sb.toString();
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f2665b = -1;
        this.f2664a = audioAttributes;
        this.f2665b = i;
    }
}
