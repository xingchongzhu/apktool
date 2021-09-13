package p067c.p068a.p069a.p070a.p073c2;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: c.a.a.a.c2.f */
public class DecoderInputBuffer extends Buffer {

    /* renamed from: b */
    public final CryptoInfo f5743b;

    /* renamed from: c */
    public ByteBuffer f5744c;

    /* renamed from: d */
    public boolean f5745d;

    /* renamed from: e */
    public long f5746e;

    /* renamed from: f */
    public ByteBuffer f5747f;

    /* renamed from: g */
    private final int f5748g;

    /* renamed from: h */
    private final int f5749h;

    /* renamed from: c.a.a.a.c2.f$a */
    /* compiled from: DecoderInputBuffer */
    public static final class C0854a extends IllegalStateException {

        /* renamed from: a */
        public final int f5750a;

        /* renamed from: b */
        public final int f5751b;

        public C0854a(int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Buffer too small (");
            sb.append(i);
            sb.append(" < ");
            sb.append(i2);
            sb.append(")");
            super(sb.toString());
            this.f5750a = i;
            this.f5751b = i2;
        }
    }

    public DecoderInputBuffer(int i) {
        this(i, 0);
    }

    /* renamed from: n */
    private ByteBuffer m6906n(int i) {
        int i2 = this.f5748g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f5744c;
        throw new C0854a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    /* renamed from: s */
    public static DecoderInputBuffer m6907s() {
        return new DecoderInputBuffer(0);
    }

    /* renamed from: f */
    public void mo5947f() {
        super.mo5947f();
        ByteBuffer byteBuffer = this.f5744c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f5747f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f5745d = false;
    }

    @EnsuresNonNull({"data"})
    /* renamed from: o */
    public void mo5965o(int i) {
        int i2 = i + this.f5749h;
        ByteBuffer byteBuffer = this.f5744c;
        if (byteBuffer == null) {
            this.f5744c = m6906n(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.f5744c = byteBuffer;
            return;
        }
        ByteBuffer n = m6906n(i3);
        n.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            n.put(byteBuffer);
        }
        this.f5744c = n;
    }

    /* renamed from: p */
    public final void mo5966p() {
        ByteBuffer byteBuffer = this.f5744c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f5747f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: q */
    public final boolean mo5967q() {
        return mo5949h(1073741824);
    }

    /* renamed from: r */
    public final boolean mo5968r() {
        return this.f5744c == null && this.f5748g == 0;
    }

    @EnsuresNonNull({"supplementalData"})
    /* renamed from: t */
    public void mo5969t(int i) {
        ByteBuffer byteBuffer = this.f5747f;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f5747f = ByteBuffer.allocate(i);
        } else {
            this.f5747f.clear();
        }
    }

    public DecoderInputBuffer(int i, int i2) {
        this.f5743b = new CryptoInfo();
        this.f5748g = i;
        this.f5749h = i2;
    }
}
