package p067c.p068a.p069a.p070a.p072b2;

import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.PlaybackParameters;

/* renamed from: c.a.a.a.b2.s */
public interface AudioSink {

    /* renamed from: c.a.a.a.b2.s$a */
    /* compiled from: AudioSink */
    public static final class C0834a extends Exception {

        /* renamed from: a */
        public final Format f5564a;

        public C0834a(Throwable th, Format u0Var) {
            super(th);
            this.f5564a = u0Var;
        }

        public C0834a(String str, Format u0Var) {
            super(str);
            this.f5564a = u0Var;
        }
    }

    /* renamed from: c.a.a.a.b2.s$b */
    /* compiled from: AudioSink */
    public static final class C0835b extends Exception {

        /* renamed from: a */
        public final int f5565a;

        /* renamed from: b */
        public final boolean f5566b;

        /* renamed from: c */
        public final Format f5567c;

        public C0835b(int i, int i2, int i3, int i4, Format u0Var, boolean z, Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(i);
            sb.append(" ");
            sb.append("Config(");
            sb.append(i2);
            String str = ", ";
            sb.append(str);
            sb.append(i3);
            sb.append(str);
            sb.append(i4);
            sb.append(")");
            sb.append(z ? " (recoverable)" : "");
            super(sb.toString(), exc);
            this.f5565a = i;
            this.f5566b = z;
            this.f5567c = u0Var;
        }
    }

    /* renamed from: c.a.a.a.b2.s$c */
    /* compiled from: AudioSink */
    public interface C0836c {
        /* renamed from: a */
        void mo5799a(boolean z);

        /* renamed from: b */
        void mo5800b(long j);

        /* renamed from: c */
        void mo5801c(long j);

        /* renamed from: d */
        void mo5802d(Exception exc);

        /* renamed from: e */
        void mo5803e();

        /* renamed from: f */
        void mo5804f(int i, long j, long j2);
    }

    /* renamed from: c.a.a.a.b2.s$d */
    /* compiled from: AudioSink */
    public static final class C0837d extends Exception {

        /* renamed from: a */
        public final int f5568a;

        /* renamed from: b */
        public final boolean f5569b;

        /* renamed from: c */
        public final Format f5570c;

        public C0837d(int i, Format u0Var, boolean z) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack write failed: ");
            sb.append(i);
            super(sb.toString());
            this.f5569b = z;
            this.f5568a = i;
            this.f5570c = u0Var;
        }
    }

    /* renamed from: a */
    boolean mo5867a(Format u0Var);

    /* renamed from: b */
    boolean mo5868b();

    /* renamed from: c */
    PlaybackParameters mo5869c();

    /* renamed from: d */
    void mo5870d();

    /* renamed from: f */
    void mo5871f(PlaybackParameters i1Var);

    void flush();

    /* renamed from: g */
    void mo5873g();

    /* renamed from: h */
    void mo5874h() throws C0837d;

    /* renamed from: i */
    boolean mo5875i();

    /* renamed from: j */
    void mo5876j(int i);

    /* renamed from: k */
    void mo5877k();

    /* renamed from: l */
    boolean mo5878l(ByteBuffer byteBuffer, long j, int i) throws C0835b, C0837d;

    /* renamed from: m */
    long mo5879m(boolean z);

    /* renamed from: n */
    void mo5880n();

    /* renamed from: o */
    void mo5881o(C0836c cVar);

    /* renamed from: p */
    void mo5882p(AudioAttributes nVar);

    /* renamed from: q */
    int mo5883q(Format u0Var);

    /* renamed from: r */
    void mo5884r(Format u0Var, int i, int[] iArr) throws C0834a;

    void reset();

    /* renamed from: s */
    void mo5886s();

    /* renamed from: t */
    void mo5887t(boolean z);

    /* renamed from: u */
    void mo5888u(AuxEffectInfo vVar);

    /* renamed from: v */
    void mo5889v();

    /* renamed from: w */
    void mo5890w(float f);
}
