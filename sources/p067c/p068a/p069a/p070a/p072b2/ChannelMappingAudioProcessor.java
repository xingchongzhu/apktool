package p067c.p068a.p069a.p070a.p072b2;

import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0831a;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0832b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.b2.x */
final class ChannelMappingAudioProcessor extends BaseAudioProcessor {

    /* renamed from: i */
    private int[] f5623i;

    /* renamed from: j */
    private int[] f5624j;

    ChannelMappingAudioProcessor() {
    }

    /* renamed from: e */
    public void mo5765e(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) Assertions.m10153e(this.f5624j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l = mo5922l(((limit - position) / this.f5616b.f5561e) * this.f5617c.f5561e);
        while (position < limit) {
            for (int i : iArr) {
                l.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f5616b.f5561e;
        }
        byteBuffer.position(limit);
        l.flip();
    }

    /* renamed from: h */
    public C0831a mo5766h(C0831a aVar) throws C0832b {
        C0831a aVar2;
        int[] iArr = this.f5623i;
        if (iArr == null) {
            return C0831a.f5557a;
        }
        if (aVar.f5560d == 2) {
            boolean z = aVar.f5559c != iArr.length;
            int i = 0;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 < aVar.f5559c) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new C0832b(aVar);
                }
            }
            if (z) {
                aVar2 = new C0831a(aVar.f5558b, iArr.length, 2);
            } else {
                aVar2 = C0831a.f5557a;
            }
            return aVar2;
        }
        throw new C0832b(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo5811i() {
        this.f5624j = this.f5623i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo5813k() {
        this.f5624j = null;
        this.f5623i = null;
    }

    /* renamed from: m */
    public void mo5923m(int[] iArr) {
        this.f5623i = iArr;
    }
}
