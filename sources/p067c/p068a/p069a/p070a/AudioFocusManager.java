package p067c.p068a.p069a.p070a;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import p067c.p068a.p069a.p070a.p072b2.AudioAttributes;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f0 */
final class AudioFocusManager {

    /* renamed from: a */
    private final AudioManager f5935a;

    /* renamed from: b */
    private final C0903a f5936b;

    /* renamed from: c */
    private C0904b f5937c;

    /* renamed from: d */
    private AudioAttributes f5938d;

    /* renamed from: e */
    private int f5939e;

    /* renamed from: f */
    private int f5940f;

    /* renamed from: g */
    private float f5941g = 1.0f;

    /* renamed from: h */
    private AudioFocusRequest f5942h;

    /* renamed from: i */
    private boolean f5943i;

    /* renamed from: c.a.a.a.f0$a */
    /* compiled from: AudioFocusManager */
    private class C0903a implements OnAudioFocusChangeListener {

        /* renamed from: a */
        private final Handler f5944a;

        public C0903a(Handler handler) {
            this.f5944a = handler;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo6137b(int i) {
            AudioFocusManager.this.m7219h(i);
        }

        public void onAudioFocusChange(int i) {
            this.f5944a.post(new C0808b(this, i));
        }
    }

    /* renamed from: c.a.a.a.f0$b */
    /* compiled from: AudioFocusManager */
    public interface C0904b {
        /* renamed from: E */
        void mo6139E(float f);

        /* renamed from: k */
        void mo6140k(int i);
    }

    public AudioFocusManager(Context context, Handler handler, C0904b bVar) {
        this.f5935a = (AudioManager) Assertions.m10153e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f5937c = bVar;
        this.f5936b = new C0903a(handler);
        this.f5939e = 0;
    }

    /* renamed from: a */
    private void m7213a() {
        if (this.f5939e != 0) {
            if (Util.f8398a >= 26) {
                m7215c();
            } else {
                m7214b();
            }
            m7223n(0);
        }
    }

    /* renamed from: b */
    private void m7214b() {
        this.f5935a.abandonAudioFocus(this.f5936b);
    }

    /* renamed from: c */
    private void m7215c() {
        AudioFocusRequest audioFocusRequest = this.f5942h;
        if (audioFocusRequest != null) {
            this.f5935a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* renamed from: e */
    private static int m7217e(AudioAttributes nVar) {
        if (nVar == null) {
            return 0;
        }
        String str = "AudioFocusManager";
        switch (nVar.f5545d) {
            case 0:
                Log.m10386h(str, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (nVar.f5543b == 1) {
                    return 2;
                }
                break;
            case 16:
                if (Util.f8398a >= 19) {
                    return 4;
                }
                return 2;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unidentified audio usage: ");
                sb.append(nVar.f5545d);
                Log.m10386h(str, sb.toString());
                return 0;
        }
        return 3;
    }

    /* renamed from: f */
    private void m7218f(int i) {
        C0904b bVar = this.f5937c;
        if (bVar != null) {
            bVar.mo6140k(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m7219h(int i) {
        if (i == -3 || i == -2) {
            if (i == -2 || m7225q()) {
                m7218f(0);
                m7223n(2);
            } else {
                m7223n(3);
            }
        } else if (i == -1) {
            m7218f(-1);
            m7213a();
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown focus change type: ");
            sb.append(i);
            Log.m10386h("AudioFocusManager", sb.toString());
        } else {
            m7223n(1);
            m7218f(1);
        }
    }

    /* renamed from: j */
    private int m7220j() {
        if (this.f5939e == 1) {
            return 1;
        }
        if ((Util.f8398a >= 26 ? m7222l() : m7221k()) == 1) {
            m7223n(1);
            return 1;
        }
        m7223n(0);
        return -1;
    }

    /* renamed from: k */
    private int m7221k() {
        return this.f5935a.requestAudioFocus(this.f5936b, Util.m10276Z(((AudioAttributes) Assertions.m10153e(this.f5938d)).f5545d), this.f5940f);
    }

    /* renamed from: l */
    private int m7222l() {
        Builder builder;
        AudioFocusRequest audioFocusRequest = this.f5942h;
        if (audioFocusRequest == null || this.f5943i) {
            if (audioFocusRequest == null) {
                builder = new Builder(this.f5940f);
            } else {
                builder = new Builder(this.f5942h);
            }
            this.f5942h = builder.setAudioAttributes(((AudioAttributes) Assertions.m10153e(this.f5938d)).mo5838a()).setWillPauseWhenDucked(m7225q()).setOnAudioFocusChangeListener(this.f5936b).build();
            this.f5943i = false;
        }
        return this.f5935a.requestAudioFocus(this.f5942h);
    }

    /* renamed from: n */
    private void m7223n(int i) {
        if (this.f5939e != i) {
            this.f5939e = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f5941g != f) {
                this.f5941g = f;
                C0904b bVar = this.f5937c;
                if (bVar != null) {
                    bVar.mo6139E(f);
                }
            }
        }
    }

    /* renamed from: o */
    private boolean m7224o(int i) {
        return i == 1 || this.f5940f != 1;
    }

    /* renamed from: q */
    private boolean m7225q() {
        AudioAttributes nVar = this.f5938d;
        return nVar != null && nVar.f5543b == 1;
    }

    /* renamed from: g */
    public float mo6133g() {
        return this.f5941g;
    }

    /* renamed from: i */
    public void mo6134i() {
        this.f5937c = null;
        m7213a();
    }

    /* renamed from: m */
    public void mo6135m(AudioAttributes nVar) {
        if (!Util.m10279b(this.f5938d, nVar)) {
            this.f5938d = nVar;
            int e = m7217e(nVar);
            this.f5940f = e;
            boolean z = true;
            if (!(e == 1 || e == 0)) {
                z = false;
            }
            Assertions.m10150b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    /* renamed from: p */
    public int mo6136p(boolean z, int i) {
        int i2 = -1;
        if (m7224o(i)) {
            m7213a();
            if (z) {
                i2 = 1;
            }
            return i2;
        }
        if (z) {
            i2 = m7220j();
        }
        return i2;
    }
}
