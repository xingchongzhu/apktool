package com.bumptech.glide.load.p152n;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.bumptech.glide.load.n.y */
class ResourceRecycler {

    /* renamed from: a */
    private boolean f10674a;

    /* renamed from: b */
    private final Handler f10675b = new Handler(Looper.getMainLooper(), new C1504a());

    /* renamed from: com.bumptech.glide.load.n.y$a */
    /* compiled from: ResourceRecycler */
    private static final class C1504a implements Callback {
        C1504a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((Resource) message.obj).mo9061f();
            return true;
        }
    }

    ResourceRecycler() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo9088a(Resource<?> vVar, boolean z) {
        if (!this.f10674a) {
            if (!z) {
                this.f10674a = true;
                vVar.mo9061f();
                this.f10674a = false;
            }
        }
        this.f10675b.obtainMessage(1, vVar).sendToTarget();
    }
}
