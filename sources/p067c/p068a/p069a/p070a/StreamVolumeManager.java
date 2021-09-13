package p067c.p068a.p069a.p070a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.w1 */
final class StreamVolumeManager {

    /* renamed from: a */
    private final Context f8939a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f8940b;

    /* renamed from: c */
    private final C1252b f8941c;

    /* renamed from: d */
    private final AudioManager f8942d;

    /* renamed from: e */
    private C1253c f8943e;

    /* renamed from: f */
    private int f8944f = 3;

    /* renamed from: g */
    private int f8945g;

    /* renamed from: h */
    private boolean f8946h;

    /* renamed from: c.a.a.a.w1$b */
    /* compiled from: StreamVolumeManager */
    public interface C1252b {
        /* renamed from: s */
        void mo7726s(int i, boolean z);

        /* renamed from: v */
        void mo7730v(int i);
    }

    /* renamed from: c.a.a.a.w1$c */
    /* compiled from: StreamVolumeManager */
    private final class C1253c extends BroadcastReceiver {
        private C1253c() {
        }

        public void onReceive(Context context, Intent intent) {
            StreamVolumeManager.this.f8940b.post(new C0851c0(StreamVolumeManager.this));
        }
    }

    public StreamVolumeManager(Context context, Handler handler, C1252b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f8939a = applicationContext;
        this.f8940b = handler;
        this.f8941c = bVar;
        AudioManager audioManager = (AudioManager) Assertions.m10156h((AudioManager) applicationContext.getSystemService("audio"));
        this.f8942d = audioManager;
        this.f8945g = m11163f(audioManager, 3);
        this.f8946h = m11162e(audioManager, this.f8944f);
        C1253c cVar = new C1253c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f8943e = cVar;
        } catch (RuntimeException e) {
            Log.m10387i("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: e */
    private static boolean m11162e(AudioManager audioManager, int i) {
        if (Util.f8398a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return m11163f(audioManager, i) == 0;
    }

    /* renamed from: f */
    private static int m11163f(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            Log.m10387i("StreamVolumeManager", sb.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m11164i() {
        int f = m11163f(this.f8942d, this.f8944f);
        boolean e = m11162e(this.f8942d, this.f8944f);
        if (this.f8945g != f || this.f8946h != e) {
            this.f8945g = f;
            this.f8946h = e;
            this.f8941c.mo7726s(f, e);
        }
    }

    /* renamed from: c */
    public int mo7731c() {
        return this.f8942d.getStreamMaxVolume(this.f8944f);
    }

    /* renamed from: d */
    public int mo7732d() {
        if (Util.f8398a >= 28) {
            return this.f8942d.getStreamMinVolume(this.f8944f);
        }
        return 0;
    }

    /* renamed from: g */
    public void mo7733g() {
        C1253c cVar = this.f8943e;
        if (cVar != null) {
            try {
                this.f8939a.unregisterReceiver(cVar);
            } catch (RuntimeException e) {
                Log.m10387i("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f8943e = null;
        }
    }

    /* renamed from: h */
    public void mo7734h(int i) {
        if (this.f8944f != i) {
            this.f8944f = i;
            m11164i();
            this.f8941c.mo7730v(i);
        }
    }
}
