package p067c.p068a.p069a.p070a.p087g2;

import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.g2.o */
final class BatchBuffer extends DecoderInputBuffer {

    /* renamed from: i */
    private long f7078i;

    /* renamed from: j */
    private int f7079j;

    /* renamed from: k */
    private int f7080k = 32;

    public BatchBuffer() {
        super(2);
    }

    /* renamed from: v */
    private boolean m8412v(DecoderInputBuffer fVar) {
        if (!mo6459z()) {
            return true;
        }
        if (this.f7079j >= this.f7080k || fVar.mo5951j() != mo5951j()) {
            return false;
        }
        ByteBuffer byteBuffer = fVar.f5744c;
        if (byteBuffer != null) {
            ByteBuffer byteBuffer2 = this.f5744c;
            if (byteBuffer2 == null || byteBuffer2.position() + byteBuffer.remaining() <= 3072000) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public void mo6454A(int i) {
        Assertions.m10149a(i > 0);
        this.f7080k = i;
    }

    /* renamed from: f */
    public void mo5947f() {
        super.mo5947f();
        this.f7079j = 0;
    }

    /* renamed from: u */
    public boolean mo6455u(DecoderInputBuffer fVar) {
        Assertions.m10149a(!fVar.mo5967q());
        Assertions.m10149a(!fVar.mo5950i());
        Assertions.m10149a(!fVar.mo5952k());
        if (!m8412v(fVar)) {
            return false;
        }
        int i = this.f7079j;
        this.f7079j = i + 1;
        if (i == 0) {
            this.f5746e = fVar.f5746e;
            if (fVar.mo5953l()) {
                mo5954m(1);
            }
        }
        if (fVar.mo5951j()) {
            mo5954m(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = fVar.f5744c;
        if (byteBuffer != null) {
            mo5965o(byteBuffer.remaining());
            this.f5744c.put(byteBuffer);
        }
        this.f7078i = fVar.f5746e;
        return true;
    }

    /* renamed from: w */
    public long mo6456w() {
        return this.f5746e;
    }

    /* renamed from: x */
    public long mo6457x() {
        return this.f7078i;
    }

    /* renamed from: y */
    public int mo6458y() {
        return this.f7079j;
    }

    /* renamed from: z */
    public boolean mo6459z() {
        return this.f7079j > 0;
    }
}
