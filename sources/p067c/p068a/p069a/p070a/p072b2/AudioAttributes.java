package p067c.p068a.p069a.p070a.p072b2;

import android.media.AudioAttributes.Builder;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.b2.n */
public final class AudioAttributes {

    /* renamed from: a */
    public static final AudioAttributes f5542a = new C0830b().mo5841a();

    /* renamed from: b */
    public final int f5543b;

    /* renamed from: c */
    public final int f5544c;

    /* renamed from: d */
    public final int f5545d;

    /* renamed from: e */
    public final int f5546e;

    /* renamed from: f */
    private android.media.AudioAttributes f5547f;

    /* renamed from: c.a.a.a.b2.n$b */
    /* compiled from: AudioAttributes */
    public static final class C0830b {

        /* renamed from: a */
        private int f5548a = 0;

        /* renamed from: b */
        private int f5549b = 0;

        /* renamed from: c */
        private int f5550c = 1;

        /* renamed from: d */
        private int f5551d = 1;

        /* renamed from: a */
        public AudioAttributes mo5841a() {
            AudioAttributes nVar = new AudioAttributes(this.f5548a, this.f5549b, this.f5550c, this.f5551d);
            return nVar;
        }
    }

    /* renamed from: a */
    public android.media.AudioAttributes mo5838a() {
        if (this.f5547f == null) {
            Builder usage = new Builder().setContentType(this.f5543b).setFlags(this.f5544c).setUsage(this.f5545d);
            if (Util.f8398a >= 29) {
                usage.setAllowedCapturePolicy(this.f5546e);
            }
            this.f5547f = usage.build();
        }
        return this.f5547f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioAttributes.class != obj.getClass()) {
            return false;
        }
        AudioAttributes nVar = (AudioAttributes) obj;
        if (!(this.f5543b == nVar.f5543b && this.f5544c == nVar.f5544c && this.f5545d == nVar.f5545d && this.f5546e == nVar.f5546e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((527 + this.f5543b) * 31) + this.f5544c) * 31) + this.f5545d) * 31) + this.f5546e;
    }

    private AudioAttributes(int i, int i2, int i3, int i4) {
        this.f5543b = i;
        this.f5544c = i2;
        this.f5545d = i3;
        this.f5546e = i4;
    }
}
