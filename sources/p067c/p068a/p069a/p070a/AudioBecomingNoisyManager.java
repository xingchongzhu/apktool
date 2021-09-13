package p067c.p068a.p069a.p070a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: c.a.a.a.e0 */
final class AudioBecomingNoisyManager {

    /* renamed from: a */
    private final Context f5795a;

    /* renamed from: b */
    private final C0859a f5796b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f5797c;

    /* renamed from: c.a.a.a.e0$a */
    /* compiled from: AudioBecomingNoisyManager */
    private final class C0859a extends BroadcastReceiver implements Runnable {

        /* renamed from: a */
        private final C0860b f5798a;

        /* renamed from: b */
        private final Handler f5799b;

        public C0859a(Handler handler, C0860b bVar) {
            this.f5799b = handler;
            this.f5798a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f5799b.post(this);
            }
        }

        public void run() {
            if (AudioBecomingNoisyManager.this.f5797c) {
                this.f5798a.mo6025C();
            }
        }
    }

    /* renamed from: c.a.a.a.e0$b */
    /* compiled from: AudioBecomingNoisyManager */
    public interface C0860b {
        /* renamed from: C */
        void mo6025C();
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, C0860b bVar) {
        this.f5795a = context.getApplicationContext();
        this.f5796b = new C0859a(handler, bVar);
    }

    /* renamed from: b */
    public void mo6022b(boolean z) {
        if (z && !this.f5797c) {
            this.f5795a.registerReceiver(this.f5796b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f5797c = true;
        } else if (!z && this.f5797c) {
            this.f5795a.unregisterReceiver(this.f5796b);
            this.f5797c = false;
        }
    }
}
