package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* renamed from: androidx.media.AudioAttributesImplApi26$a */
    static class C0390a extends C0389a {
        C0390a() {
        }

        /* renamed from: a */
        public AudioAttributesImpl mo3046a() {
            return new AudioAttributesImplApi26(this.f2666a.build());
        }
    }

    public AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
