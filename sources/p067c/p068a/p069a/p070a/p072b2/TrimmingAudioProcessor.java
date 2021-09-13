package p067c.p068a.p069a.p070a.p072b2;

import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0831a;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0832b;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.b2.i0 */
final class TrimmingAudioProcessor extends BaseAudioProcessor {

    /* renamed from: i */
    private int f5511i;

    /* renamed from: j */
    private int f5512j;

    /* renamed from: k */
    private boolean f5513k;

    /* renamed from: l */
    private int f5514l;

    /* renamed from: m */
    private byte[] f5515m = Util.f8403f;

    /* renamed from: n */
    private int f5516n;

    /* renamed from: o */
    private long f5517o;

    /* renamed from: a */
    public ByteBuffer mo5824a() {
        if (super.mo5825b()) {
            int i = this.f5516n;
            if (i > 0) {
                mo5922l(i).put(this.f5515m, 0, this.f5516n).flip();
                this.f5516n = 0;
            }
        }
        return super.mo5824a();
    }

    /* renamed from: b */
    public boolean mo5825b() {
        return super.mo5825b() && this.f5516n == 0;
    }

    /* renamed from: e */
    public void mo5765e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f5514l);
            this.f5517o += (long) (min / this.f5616b.f5561e);
            this.f5514l -= min;
            byteBuffer.position(position + min);
            if (this.f5514l <= 0) {
                int i2 = i - min;
                int length = (this.f5516n + i2) - this.f5515m.length;
                ByteBuffer l = mo5922l(length);
                int p = Util.m10307p(length, 0, this.f5516n);
                l.put(this.f5515m, 0, p);
                int p2 = Util.m10307p(length - p, 0, i2);
                byteBuffer.limit(byteBuffer.position() + p2);
                l.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - p2;
                int i4 = this.f5516n - p;
                this.f5516n = i4;
                byte[] bArr = this.f5515m;
                System.arraycopy(bArr, p, bArr, 0, i4);
                byteBuffer.get(this.f5515m, this.f5516n, i3);
                this.f5516n += i3;
                l.flip();
            }
        }
    }

    /* renamed from: h */
    public C0831a mo5766h(C0831a aVar) throws C0832b {
        if (aVar.f5560d == 2) {
            this.f5513k = true;
            return (this.f5511i == 0 && this.f5512j == 0) ? C0831a.f5557a : aVar;
        }
        throw new C0832b(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo5811i() {
        if (this.f5513k) {
            this.f5513k = false;
            int i = this.f5512j;
            int i2 = this.f5616b.f5561e;
            this.f5515m = new byte[(i * i2)];
            this.f5514l = this.f5511i * i2;
        }
        this.f5516n = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo5812j() {
        if (this.f5513k) {
            int i = this.f5516n;
            if (i > 0) {
                this.f5517o += (long) (i / this.f5616b.f5561e);
            }
            this.f5516n = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo5813k() {
        this.f5515m = Util.f8403f;
    }

    /* renamed from: m */
    public long mo5834m() {
        return this.f5517o;
    }

    /* renamed from: n */
    public void mo5835n() {
        this.f5517o = 0;
    }

    /* renamed from: o */
    public void mo5836o(int i, int i2) {
        this.f5511i = i;
        this.f5512j = i2;
    }
}
