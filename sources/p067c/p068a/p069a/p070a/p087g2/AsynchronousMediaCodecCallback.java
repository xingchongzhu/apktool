package p067c.p068a.p069a.p070a.p087g2;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.IntArrayQueue;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.g2.n */
final class AsynchronousMediaCodecCallback extends Callback {

    /* renamed from: a */
    private final Object f7065a = new Object();

    /* renamed from: b */
    private final HandlerThread f7066b;

    /* renamed from: c */
    private Handler f7067c;

    /* renamed from: d */
    private final IntArrayQueue f7068d;

    /* renamed from: e */
    private final IntArrayQueue f7069e;

    /* renamed from: f */
    private final ArrayDeque<BufferInfo> f7070f;

    /* renamed from: g */
    private final ArrayDeque<MediaFormat> f7071g;

    /* renamed from: h */
    private MediaFormat f7072h;

    /* renamed from: i */
    private MediaFormat f7073i;

    /* renamed from: j */
    private CodecException f7074j;

    /* renamed from: k */
    private long f7075k;

    /* renamed from: l */
    private boolean f7076l;

    /* renamed from: m */
    private IllegalStateException f7077m;

    AsynchronousMediaCodecCallback(HandlerThread handlerThread) {
        this.f7066b = handlerThread;
        this.f7068d = new IntArrayQueue();
        this.f7069e = new IntArrayQueue();
        this.f7070f = new ArrayDeque<>();
        this.f7071g = new ArrayDeque<>();
    }

    /* renamed from: a */
    private void m8395a(MediaFormat mediaFormat) {
        this.f7069e.mo7464a(-2);
        this.f7071g.add(mediaFormat);
    }

    /* renamed from: e */
    private void m8396e() {
        if (!this.f7071g.isEmpty()) {
            this.f7073i = (MediaFormat) this.f7071g.getLast();
        }
        this.f7068d.mo7465b();
        this.f7069e.mo7465b();
        this.f7070f.clear();
        this.f7071g.clear();
        this.f7074j = null;
    }

    /* renamed from: h */
    private boolean m8397h() {
        return this.f7075k > 0 || this.f7076l;
    }

    /* renamed from: k */
    private void m8399k() {
        m8400l();
        m8401m();
    }

    /* renamed from: l */
    private void m8400l() {
        IllegalStateException illegalStateException = this.f7077m;
        if (illegalStateException != null) {
            this.f7077m = null;
            throw illegalStateException;
        }
    }

    /* renamed from: m */
    private void m8401m() {
        CodecException codecException = this.f7074j;
        if (codecException != null) {
            this.f7074j = null;
            throw codecException;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m8398i(Runnable runnable) {
        synchronized (this.f7065a) {
            m8403o(runnable);
        }
    }

    /* renamed from: o */
    private void m8403o(Runnable runnable) {
        if (!this.f7076l) {
            long j = this.f7075k - 1;
            this.f7075k = j;
            if (j <= 0) {
                if (j < 0) {
                    m8404p(new IllegalStateException());
                    return;
                }
                m8396e();
                try {
                    runnable.run();
                } catch (IllegalStateException e) {
                    m8404p(e);
                } catch (Exception e2) {
                    m8404p(new IllegalStateException(e2));
                }
            }
        }
    }

    /* renamed from: p */
    private void m8404p(IllegalStateException illegalStateException) {
        synchronized (this.f7065a) {
            this.f7077m = illegalStateException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo6443b() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f7065a
            monitor-enter(r0)
            boolean r1 = r3.m8397h()     // Catch:{ all -> 0x0020 }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x000c:
            r3.m8399k()     // Catch:{ all -> 0x0020 }
            c.a.a.a.m2.r r1 = r3.f7068d     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.mo7466d()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            c.a.a.a.m2.r r1 = r3.f7068d     // Catch:{ all -> 0x0020 }
            int r2 = r1.mo7467e()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p087g2.AsynchronousMediaCodecCallback.mo6443b():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        return r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo6444c(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f7065a
            monitor-enter(r0)
            boolean r1 = r9.m8397h()     // Catch:{ all -> 0x004a }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x000c:
            r9.m8399k()     // Catch:{ all -> 0x004a }
            c.a.a.a.m2.r r1 = r9.f7069e     // Catch:{ all -> 0x004a }
            boolean r1 = r1.mo7466d()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x0019:
            c.a.a.a.m2.r r1 = r9.f7069e     // Catch:{ all -> 0x004a }
            int r1 = r1.mo7467e()     // Catch:{ all -> 0x004a }
            if (r1 < 0) goto L_0x003b
            android.media.MediaFormat r2 = r9.f7072h     // Catch:{ all -> 0x004a }
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10156h(r2)     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r2 = r9.f7070f     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x004a }
            int r4 = r2.offset     // Catch:{ all -> 0x004a }
            int r5 = r2.size     // Catch:{ all -> 0x004a }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x004a }
            int r8 = r2.flags     // Catch:{ all -> 0x004a }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x004a }
            goto L_0x0048
        L_0x003b:
            r10 = -2
            if (r1 != r10) goto L_0x0048
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r9.f7071g     // Catch:{ all -> 0x004a }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004a }
            r9.f7072h = r10     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x004a:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p087g2.AsynchronousMediaCodecCallback.mo6444c(android.media.MediaCodec$BufferInfo):int");
    }

    /* renamed from: d */
    public void mo6445d(Runnable runnable) {
        synchronized (this.f7065a) {
            this.f7075k++;
            ((Handler) Util.m10293i(this.f7067c)).post(new C1008d(this, runnable));
        }
    }

    /* renamed from: f */
    public MediaFormat mo6446f() {
        MediaFormat mediaFormat;
        synchronized (this.f7065a) {
            mediaFormat = this.f7072h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: g */
    public void mo6447g(MediaCodec mediaCodec) {
        Assertions.m10154f(this.f7067c == null);
        this.f7066b.start();
        Handler handler = new Handler(this.f7066b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f7067c = handler;
    }

    public void onError(MediaCodec mediaCodec, CodecException codecException) {
        synchronized (this.f7065a) {
            this.f7074j = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f7065a) {
            this.f7068d.mo7464a(i);
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
        synchronized (this.f7065a) {
            MediaFormat mediaFormat = this.f7073i;
            if (mediaFormat != null) {
                m8395a(mediaFormat);
                this.f7073i = null;
            }
            this.f7069e.mo7464a(i);
            this.f7070f.add(bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f7065a) {
            m8395a(mediaFormat);
            this.f7073i = null;
        }
    }

    /* renamed from: q */
    public void mo6453q() {
        synchronized (this.f7065a) {
            this.f7076l = true;
            this.f7066b.quit();
            m8396e();
        }
    }
}
