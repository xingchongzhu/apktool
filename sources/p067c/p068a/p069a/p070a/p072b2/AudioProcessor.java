package p067c.p068a.p069a.p070a.p072b2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.b2.q */
public interface AudioProcessor {

    /* renamed from: a */
    public static final ByteBuffer f5556a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: c.a.a.a.b2.q$a */
    /* compiled from: AudioProcessor */
    public static final class C0831a {

        /* renamed from: a */
        public static final C0831a f5557a = new C0831a(-1, -1, -1);

        /* renamed from: b */
        public final int f5558b;

        /* renamed from: c */
        public final int f5559c;

        /* renamed from: d */
        public final int f5560d;

        /* renamed from: e */
        public final int f5561e;

        public C0831a(int i, int i2, int i3) {
            this.f5558b = i;
            this.f5559c = i2;
            this.f5560d = i3;
            this.f5561e = Util.m10296j0(i3) ? Util.m10274X(i3, i2) : -1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioFormat[sampleRate=");
            sb.append(this.f5558b);
            sb.append(", channelCount=");
            sb.append(this.f5559c);
            sb.append(", encoding=");
            sb.append(this.f5560d);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: c.a.a.a.b2.q$b */
    /* compiled from: AudioProcessor */
    public static final class C0832b extends Exception {
        public C0832b(C0831a aVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unhandled format: ");
            sb.append(aVar);
            super(sb.toString());
        }
    }

    /* renamed from: a */
    ByteBuffer mo5824a();

    /* renamed from: b */
    boolean mo5825b();

    /* renamed from: c */
    void mo5826c();

    /* renamed from: d */
    boolean mo5810d();

    /* renamed from: e */
    void mo5765e(ByteBuffer byteBuffer);

    /* renamed from: f */
    C0831a mo5827f(C0831a aVar) throws C0832b;

    void flush();

    void reset();
}
