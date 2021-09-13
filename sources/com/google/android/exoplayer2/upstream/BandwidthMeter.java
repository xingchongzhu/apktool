package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: com.google.android.exoplayer2.upstream.g */
public interface BandwidthMeter {

    /* renamed from: com.google.android.exoplayer2.upstream.g$a */
    /* compiled from: BandwidthMeter */
    public interface C1911a {

        /* renamed from: com.google.android.exoplayer2.upstream.g$a$a */
        /* compiled from: BandwidthMeter */
        public static final class C1912a {

            /* renamed from: a */
            private final CopyOnWriteArrayList<C1913a> f12320a = new CopyOnWriteArrayList<>();

            /* renamed from: com.google.android.exoplayer2.upstream.g$a$a$a */
            /* compiled from: BandwidthMeter */
            private static final class C1913a {
                /* access modifiers changed from: private */

                /* renamed from: a */
                public final Handler f12321a;
                /* access modifiers changed from: private */

                /* renamed from: b */
                public final C1911a f12322b;
                /* access modifiers changed from: private */

                /* renamed from: c */
                public boolean f12323c;

                public C1913a(Handler handler, C1911a aVar) {
                    this.f12321a = handler;
                    this.f12322b = aVar;
                }

                /* renamed from: d */
                public void mo14934d() {
                    this.f12323c = true;
                }
            }

            /* renamed from: a */
            public void mo14931a(Handler handler, C1911a aVar) {
                Assertions.m10153e(handler);
                Assertions.m10153e(aVar);
                mo14933d(aVar);
                this.f12320a.add(new C1913a(handler, aVar));
            }

            /* renamed from: b */
            public void mo14932b(int i, long j, long j2) {
                Iterator it = this.f12320a.iterator();
                while (it.hasNext()) {
                    C1913a aVar = (C1913a) it.next();
                    if (!aVar.f12323c) {
                        Handler c = aVar.f12321a;
                        C1895a aVar2 = new C1895a(aVar, i, j, j2);
                        c.post(aVar2);
                    }
                }
            }

            /* renamed from: d */
            public void mo14933d(C1911a aVar) {
                Iterator it = this.f12320a.iterator();
                while (it.hasNext()) {
                    C1913a aVar2 = (C1913a) it.next();
                    if (aVar2.f12322b == aVar) {
                        aVar2.mo14934d();
                        this.f12320a.remove(aVar2);
                    }
                }
            }
        }

        /* renamed from: K */
        void mo5622K(int i, long j, long j2);
    }

    /* renamed from: a */
    TransferListener mo14927a();

    /* renamed from: b */
    void mo14928b(C1911a aVar);

    /* renamed from: c */
    long mo14929c();

    /* renamed from: g */
    void mo14930g(Handler handler, C1911a aVar);
}
