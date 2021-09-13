package p067c.p068a.p069a.p070a.p072b2;

import com.umeng.analytics.pro.TType;
import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0831a;
import p067c.p068a.p069a.p070a.p072b2.AudioProcessor.C0832b;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.b2.a0 */
final class FloatResamplingAudioProcessor extends BaseAudioProcessor {

    /* renamed from: i */
    private static final int f5413i = Float.floatToIntBits(Float.NaN);

    FloatResamplingAudioProcessor() {
    }

    /* renamed from: m */
    private static void m6492m(int i, ByteBuffer byteBuffer) {
        double d = (double) i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == f5413i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: e */
    public void mo5765e(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f5616b.f5560d;
        if (i2 == 536870912) {
            byteBuffer2 = mo5922l((i / 3) * 4);
            while (position < limit) {
                m6492m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << TType.f16865n) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo5922l(i);
            while (position < limit) {
                m6492m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << TType.f16865n) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    /* renamed from: h */
    public C0831a mo5766h(C0831a aVar) throws C0832b {
        int i = aVar.f5560d;
        if (!Util.m10294i0(i)) {
            throw new C0832b(aVar);
        } else if (i != 4) {
            return new C0831a(aVar.f5558b, aVar.f5559c, 4);
        } else {
            return C0831a.f5557a;
        }
    }
}
