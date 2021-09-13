package p067c.p068a.p069a.p070a.p072b2;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.b2.t */
final class AudioTimestampPoller {

    /* renamed from: a */
    private final C0838a f5571a;

    /* renamed from: b */
    private int f5572b;

    /* renamed from: c */
    private long f5573c;

    /* renamed from: d */
    private long f5574d;

    /* renamed from: e */
    private long f5575e;

    /* renamed from: f */
    private long f5576f;

    /* renamed from: c.a.a.a.b2.t$a */
    /* compiled from: AudioTimestampPoller */
    private static final class C0838a {

        /* renamed from: a */
        private final AudioTrack f5577a;

        /* renamed from: b */
        private final AudioTimestamp f5578b = new AudioTimestamp();

        /* renamed from: c */
        private long f5579c;

        /* renamed from: d */
        private long f5580d;

        /* renamed from: e */
        private long f5581e;

        public C0838a(AudioTrack audioTrack) {
            this.f5577a = audioTrack;
        }

        /* renamed from: a */
        public long mo5898a() {
            return this.f5581e;
        }

        /* renamed from: b */
        public long mo5899b() {
            return this.f5578b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean mo5900c() {
            boolean timestamp = this.f5577a.getTimestamp(this.f5578b);
            if (timestamp) {
                long j = this.f5578b.framePosition;
                if (this.f5580d > j) {
                    this.f5579c++;
                }
                this.f5580d = j;
                this.f5581e = j + (this.f5579c << 32);
            }
            return timestamp;
        }
    }

    public AudioTimestampPoller(AudioTrack audioTrack) {
        if (Util.f8398a >= 19) {
            this.f5571a = new C0838a(audioTrack);
            mo5897g();
            return;
        }
        this.f5571a = null;
        m6718h(3);
    }

    /* renamed from: h */
    private void m6718h(int i) {
        this.f5572b = i;
        if (i == 0) {
            this.f5575e = 0;
            this.f5576f = -1;
            this.f5573c = System.nanoTime() / 1000;
            this.f5574d = 10000;
        } else if (i == 1) {
            this.f5574d = 10000;
        } else if (i == 2 || i == 3) {
            this.f5574d = 10000000;
        } else if (i == 4) {
            this.f5574d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo5891a() {
        if (this.f5572b == 4) {
            mo5897g();
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public long mo5892b() {
        C0838a aVar = this.f5571a;
        if (aVar != null) {
            return aVar.mo5898a();
        }
        return -1;
    }

    @TargetApi(19)
    /* renamed from: c */
    public long mo5893c() {
        C0838a aVar = this.f5571a;
        if (aVar != null) {
            return aVar.mo5899b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public boolean mo5894d() {
        return this.f5572b == 2;
    }

    @TargetApi(19)
    /* renamed from: e */
    public boolean mo5895e(long j) {
        C0838a aVar = this.f5571a;
        if (aVar == null || j - this.f5575e < this.f5574d) {
            return false;
        }
        this.f5575e = j;
        boolean c = aVar.mo5900c();
        int i = this.f5572b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c) {
                        mo5897g();
                    }
                } else if (!c) {
                    mo5897g();
                }
            } else if (!c) {
                mo5897g();
            } else if (this.f5571a.mo5898a() > this.f5576f) {
                m6718h(2);
            }
        } else if (c) {
            if (this.f5571a.mo5899b() < this.f5573c) {
                return false;
            }
            this.f5576f = this.f5571a.mo5898a();
            m6718h(1);
        } else if (j - this.f5573c > 500000) {
            m6718h(3);
        }
        return c;
    }

    /* renamed from: f */
    public void mo5896f() {
        m6718h(4);
    }

    /* renamed from: g */
    public void mo5897g() {
        if (this.f5571a != null) {
            m6718h(0);
        }
    }
}
