package p067c.p068a.p069a.p070a.p072b2;

import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0831a;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0832b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.b2.f0 */
public final class SilenceSkippingAudioProcessor extends BaseAudioProcessor {

    /* renamed from: i */
    private final long f5454i;

    /* renamed from: j */
    private final long f5455j;

    /* renamed from: k */
    private final short f5456k;

    /* renamed from: l */
    private int f5457l;

    /* renamed from: m */
    private boolean f5458m;

    /* renamed from: n */
    private byte[] f5459n;

    /* renamed from: o */
    private byte[] f5460o;

    /* renamed from: p */
    private int f5461p;

    /* renamed from: q */
    private int f5462q;

    /* renamed from: r */
    private int f5463r;

    /* renamed from: s */
    private boolean f5464s;

    /* renamed from: t */
    private long f5465t;

    public SilenceSkippingAudioProcessor() {
        this(150000, 20000, 1024);
    }

    /* renamed from: m */
    private int m6558m(long j) {
        return (int) ((j * ((long) this.f5616b.f5558b)) / 1000000);
    }

    /* renamed from: n */
    private int m6559n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs(byteBuffer.getShort(limit)) > this.f5456k) {
                int i = this.f5457l;
                return ((limit / i) * i) + i;
            }
        }
    }

    /* renamed from: o */
    private int m6560o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.f5456k) {
                int i = this.f5457l;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: q */
    private void m6561q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        mo5922l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f5464s = true;
        }
    }

    /* renamed from: r */
    private void m6562r(byte[] bArr, int i) {
        mo5922l(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f5464s = true;
        }
    }

    /* renamed from: s */
    private void m6563s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o = m6560o(byteBuffer);
        int position = o - byteBuffer.position();
        byte[] bArr = this.f5459n;
        int length = bArr.length;
        int i = this.f5462q;
        int i2 = length - i;
        if (o >= limit || position >= i2) {
            int min = Math.min(position, i2);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f5459n, this.f5462q, min);
            int i3 = this.f5462q + min;
            this.f5462q = i3;
            byte[] bArr2 = this.f5459n;
            if (i3 == bArr2.length) {
                if (this.f5464s) {
                    m6562r(bArr2, this.f5463r);
                    this.f5465t += (long) ((this.f5462q - (this.f5463r * 2)) / this.f5457l);
                } else {
                    this.f5465t += (long) ((i3 - this.f5463r) / this.f5457l);
                }
                m6566w(byteBuffer, this.f5459n, this.f5462q);
                this.f5462q = 0;
                this.f5461p = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        m6562r(bArr, i);
        this.f5462q = 0;
        this.f5461p = 0;
    }

    /* renamed from: t */
    private void m6564t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f5459n.length));
        int n = m6559n(byteBuffer);
        if (n == byteBuffer.position()) {
            this.f5461p = 1;
        } else {
            byteBuffer.limit(n);
            m6561q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: u */
    private void m6565u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o = m6560o(byteBuffer);
        byteBuffer.limit(o);
        this.f5465t += (long) (byteBuffer.remaining() / this.f5457l);
        m6566w(byteBuffer, this.f5460o, this.f5463r);
        if (o < limit) {
            m6562r(this.f5460o, this.f5463r);
            this.f5461p = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: w */
    private void m6566w(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f5463r);
        int i2 = this.f5463r - min;
        System.arraycopy(bArr, i - i2, this.f5460o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f5460o, i2, min);
    }

    /* renamed from: d */
    public boolean mo5810d() {
        return this.f5458m;
    }

    /* renamed from: e */
    public void mo5765e(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !mo5921g()) {
            int i = this.f5461p;
            if (i == 0) {
                m6564t(byteBuffer);
            } else if (i == 1) {
                m6563s(byteBuffer);
            } else if (i == 2) {
                m6565u(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: h */
    public C0831a mo5766h(C0831a aVar) throws C0832b {
        if (aVar.f5560d == 2) {
            return this.f5458m ? aVar : C0831a.f5557a;
        }
        throw new C0832b(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo5811i() {
        if (this.f5458m) {
            this.f5457l = this.f5616b.f5561e;
            int m = m6558m(this.f5454i) * this.f5457l;
            if (this.f5459n.length != m) {
                this.f5459n = new byte[m];
            }
            int m2 = m6558m(this.f5455j) * this.f5457l;
            this.f5463r = m2;
            if (this.f5460o.length != m2) {
                this.f5460o = new byte[m2];
            }
        }
        this.f5461p = 0;
        this.f5465t = 0;
        this.f5462q = 0;
        this.f5464s = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo5812j() {
        int i = this.f5462q;
        if (i > 0) {
            m6562r(this.f5459n, i);
        }
        if (!this.f5464s) {
            this.f5465t += (long) (this.f5463r / this.f5457l);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo5813k() {
        this.f5458m = false;
        this.f5463r = 0;
        byte[] bArr = Util.f8403f;
        this.f5459n = bArr;
        this.f5460o = bArr;
    }

    /* renamed from: p */
    public long mo5814p() {
        return this.f5465t;
    }

    /* renamed from: v */
    public void mo5815v(boolean z) {
        this.f5458m = z;
    }

    public SilenceSkippingAudioProcessor(long j, long j2, short s) {
        Assertions.m10149a(j2 <= j);
        this.f5454i = j;
        this.f5455j = j2;
        this.f5456k = s;
        byte[] bArr = Util.f8403f;
        this.f5459n = bArr;
        this.f5460o = bArr;
    }
}
