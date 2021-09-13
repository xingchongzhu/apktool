package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl.C0388a;
import com.umeng.commonsdk.stateless.UMSLNetWorkSender;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f2667a = 0;

    /* renamed from: b */
    public int f2668b = 0;

    /* renamed from: c */
    public int f2669c = 0;

    /* renamed from: d */
    public int f2670d = -1;

    /* renamed from: androidx.media.AudioAttributesImplBase$a */
    static class C0391a implements C0388a {

        /* renamed from: a */
        private int f2671a = 0;

        /* renamed from: b */
        private int f2672b = 0;

        /* renamed from: c */
        private int f2673c = 0;

        /* renamed from: d */
        private int f2674d = -1;

        C0391a() {
        }

        /* renamed from: c */
        private C0391a m2826c(int i) {
            switch (i) {
                case 0:
                    this.f2672b = 1;
                    break;
                case 1:
                    break;
                case 2:
                    this.f2672b = 4;
                    break;
                case 3:
                    this.f2672b = 2;
                    break;
                case 4:
                    this.f2672b = 4;
                    break;
                case 5:
                    this.f2672b = 4;
                    break;
                case 6:
                    this.f2672b = 1;
                    this.f2673c |= 4;
                    break;
                case 7:
                    this.f2673c = 1 | this.f2673c;
                    break;
                case 8:
                    this.f2672b = 4;
                    break;
                case 9:
                    this.f2672b = 4;
                    break;
                case 10:
                    this.f2672b = 1;
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid stream type ");
                    sb.append(i);
                    sb.append(" for AudioAttributesCompat");
                    Log.e("AudioAttributesCompat", sb.toString());
                    break;
            }
            this.f2672b = 4;
            this.f2671a = AudioAttributesImplBase.m2821e(i);
            return this;
        }

        /* renamed from: a */
        public AudioAttributesImpl mo3046a() {
            return new AudioAttributesImplBase(this.f2672b, this.f2673c, this.f2671a, this.f2674d);
        }

        /* renamed from: d */
        public C0391a mo3047b(int i) {
            if (i != 10) {
                this.f2674d = i;
                return m2826c(i);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }
    }

    public AudioAttributesImplBase() {
    }

    /* renamed from: e */
    static int m2821e(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public int mo3052a() {
        return this.f2668b;
    }

    /* renamed from: b */
    public int mo3053b() {
        int i = this.f2669c;
        int c = mo3054c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & UMSLNetWorkSender.f17621a;
    }

    /* renamed from: c */
    public int mo3054c() {
        int i = this.f2670d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m2810a(false, this.f2669c, this.f2667a);
    }

    /* renamed from: d */
    public int mo3055d() {
        return this.f2667a;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2668b == audioAttributesImplBase.mo3052a() && this.f2669c == audioAttributesImplBase.mo3053b() && this.f2667a == audioAttributesImplBase.mo3055d() && this.f2670d == audioAttributesImplBase.f2670d) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2668b), Integer.valueOf(this.f2669c), Integer.valueOf(this.f2667a), Integer.valueOf(this.f2670d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2670d != -1) {
            sb.append(" stream=");
            sb.append(this.f2670d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m2811b(this.f2667a));
        sb.append(" content=");
        sb.append(this.f2668b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2669c).toUpperCase());
        return sb.toString();
    }

    AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.f2668b = i;
        this.f2669c = i2;
        this.f2667a = i3;
        this.f2670d = i4;
    }
}
