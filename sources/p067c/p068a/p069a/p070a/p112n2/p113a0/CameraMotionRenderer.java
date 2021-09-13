package p067c.p068a.p069a.p070a.p112n2.p113a0;

import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.BaseRenderer;
import p067c.p068a.p069a.p070a.ExoPlaybackException;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.RendererCapabilities;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.n2.a0.b */
public final class CameraMotionRenderer extends BaseRenderer {

    /* renamed from: m */
    private final DecoderInputBuffer f8482m = new DecoderInputBuffer(1);

    /* renamed from: n */
    private final ParsableByteArray f8483n = new ParsableByteArray();

    /* renamed from: o */
    private long f8484o;

    /* renamed from: p */
    private CameraMotionListener f8485p;

    /* renamed from: q */
    private long f8486q;

    public CameraMotionRenderer() {
        super(6);
    }

    /* renamed from: O */
    private float[] m10473O(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f8483n.mo7372N(byteBuffer.array(), byteBuffer.limit());
        this.f8483n.mo7374P(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f8483n.mo7392q());
        }
        return fArr;
    }

    /* renamed from: P */
    private void m10474P() {
        CameraMotionListener aVar = this.f8485p;
        if (aVar != null) {
            aVar.mo7517b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo5768F() {
        m10474P();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo5770H(long j, boolean z) {
        this.f8486q = Long.MIN_VALUE;
        m10474P();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6476L(Format[] u0VarArr, long j, long j2) {
        this.f8484o = j2;
    }

    /* renamed from: a */
    public int mo6481a(Format u0Var) {
        if ("application/x-camera-motion".equals(u0Var.f8814l)) {
            return RendererCapabilities.m10784a(4);
        }
        return RendererCapabilities.m10784a(0);
    }

    /* renamed from: b */
    public boolean mo5784b() {
        return mo6521i();
    }

    /* renamed from: e */
    public boolean mo5786e() {
        return true;
    }

    public String getName() {
        return "CameraMotionRenderer";
    }

    /* renamed from: l */
    public void mo6490l(long j, long j2) {
        while (!mo6521i() && this.f8486q < 100000 + j) {
            this.f8482m.mo5947f();
            if (mo6515M(mo6511B(), this.f8482m, false) == -4 && !this.f8482m.mo5952k()) {
                DecoderInputBuffer fVar = this.f8482m;
                this.f8486q = fVar.f5746e;
                if (this.f8485p != null && !fVar.mo5951j()) {
                    this.f8482m.mo5966p();
                    float[] O = m10473O((ByteBuffer) Util.m10293i(this.f8482m.f5744c));
                    if (O != null) {
                        ((CameraMotionListener) Util.m10293i(this.f8485p)).mo7516a(this.f8486q - this.f8484o, O);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    public void mo5791m(int i, Object obj) throws ExoPlaybackException {
        if (i == 7) {
            this.f8485p = (CameraMotionListener) obj;
        } else {
            super.mo5791m(i, obj);
        }
    }
}
