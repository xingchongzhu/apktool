package p067c.p068a.p069a.p070a.p072b2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0831a;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0832b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.b2.h0 */
public final class SonicAudioProcessor implements AudioProcessor {

    /* renamed from: b */
    private int f5494b;

    /* renamed from: c */
    private float f5495c = 1.0f;

    /* renamed from: d */
    private float f5496d = 1.0f;

    /* renamed from: e */
    private C0831a f5497e;

    /* renamed from: f */
    private C0831a f5498f;

    /* renamed from: g */
    private C0831a f5499g;

    /* renamed from: h */
    private C0831a f5500h;

    /* renamed from: i */
    private boolean f5501i;

    /* renamed from: j */
    private Sonic f5502j;

    /* renamed from: k */
    private ByteBuffer f5503k;

    /* renamed from: l */
    private ShortBuffer f5504l;

    /* renamed from: m */
    private ByteBuffer f5505m;

    /* renamed from: n */
    private long f5506n;

    /* renamed from: o */
    private long f5507o;

    /* renamed from: p */
    private boolean f5508p;

    public SonicAudioProcessor() {
        C0831a aVar = C0831a.f5557a;
        this.f5497e = aVar;
        this.f5498f = aVar;
        this.f5499g = aVar;
        this.f5500h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f5556a;
        this.f5503k = byteBuffer;
        this.f5504l = byteBuffer.asShortBuffer();
        this.f5505m = byteBuffer;
        this.f5494b = -1;
    }

    /* renamed from: a */
    public ByteBuffer mo5824a() {
        Sonic g0Var = this.f5502j;
        if (g0Var != null) {
            int k = g0Var.mo5819k();
            if (k > 0) {
                if (this.f5503k.capacity() < k) {
                    ByteBuffer order = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
                    this.f5503k = order;
                    this.f5504l = order.asShortBuffer();
                } else {
                    this.f5503k.clear();
                    this.f5504l.clear();
                }
                g0Var.mo5818j(this.f5504l);
                this.f5507o += (long) k;
                this.f5503k.limit(k);
                this.f5505m = this.f5503k;
            }
        }
        ByteBuffer byteBuffer = this.f5505m;
        this.f5505m = AudioProcessor.f5556a;
        return byteBuffer;
    }

    /* renamed from: b */
    public boolean mo5825b() {
        if (this.f5508p) {
            Sonic g0Var = this.f5502j;
            if (g0Var == null || g0Var.mo5819k() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo5826c() {
        Sonic g0Var = this.f5502j;
        if (g0Var != null) {
            g0Var.mo5821s();
        }
        this.f5508p = true;
    }

    /* renamed from: d */
    public boolean mo5810d() {
        return this.f5498f.f5558b != -1 && (Math.abs(this.f5495c - 1.0f) >= 1.0E-4f || Math.abs(this.f5496d - 1.0f) >= 1.0E-4f || this.f5498f.f5558b != this.f5497e.f5558b);
    }

    /* renamed from: e */
    public void mo5765e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            Sonic g0Var = (Sonic) Assertions.m10153e(this.f5502j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f5506n += (long) remaining;
            g0Var.mo5822t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: f */
    public C0831a mo5827f(C0831a aVar) throws C0832b {
        if (aVar.f5560d == 2) {
            int i = this.f5494b;
            if (i == -1) {
                i = aVar.f5558b;
            }
            this.f5497e = aVar;
            C0831a aVar2 = new C0831a(i, aVar.f5559c, 2);
            this.f5498f = aVar2;
            this.f5501i = true;
            return aVar2;
        }
        throw new C0832b(aVar);
    }

    public void flush() {
        if (mo5810d()) {
            C0831a aVar = this.f5497e;
            this.f5499g = aVar;
            C0831a aVar2 = this.f5498f;
            this.f5500h = aVar2;
            if (this.f5501i) {
                Sonic g0Var = new Sonic(aVar.f5558b, aVar.f5559c, this.f5495c, this.f5496d, aVar2.f5558b);
                this.f5502j = g0Var;
            } else {
                Sonic g0Var2 = this.f5502j;
                if (g0Var2 != null) {
                    g0Var2.mo5817i();
                }
            }
        }
        this.f5505m = AudioProcessor.f5556a;
        this.f5506n = 0;
        this.f5507o = 0;
        this.f5508p = false;
    }

    /* renamed from: g */
    public long mo5829g(long j) {
        long j2;
        if (this.f5507o >= 1024) {
            long l = this.f5506n - ((long) ((Sonic) Assertions.m10153e(this.f5502j)).mo5820l());
            int i = this.f5500h.f5558b;
            int i2 = this.f5499g.f5558b;
            if (i == i2) {
                j2 = Util.m10240B0(j, l, this.f5507o);
            } else {
                j2 = Util.m10240B0(j, l * ((long) i), this.f5507o * ((long) i2));
            }
            return j2;
        }
        double d = (double) this.f5495c;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (long) (d * d2);
    }

    /* renamed from: h */
    public void mo5830h(float f) {
        if (this.f5496d != f) {
            this.f5496d = f;
            this.f5501i = true;
        }
    }

    /* renamed from: i */
    public void mo5831i(float f) {
        if (this.f5495c != f) {
            this.f5495c = f;
            this.f5501i = true;
        }
    }

    public void reset() {
        this.f5495c = 1.0f;
        this.f5496d = 1.0f;
        C0831a aVar = C0831a.f5557a;
        this.f5497e = aVar;
        this.f5498f = aVar;
        this.f5499g = aVar;
        this.f5500h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f5556a;
        this.f5503k = byteBuffer;
        this.f5504l = byteBuffer.asShortBuffer();
        this.f5505m = byteBuffer;
        this.f5494b = -1;
        this.f5501i = false;
        this.f5502j = null;
        this.f5506n = 0;
        this.f5507o = 0;
        this.f5508p = false;
    }
}
