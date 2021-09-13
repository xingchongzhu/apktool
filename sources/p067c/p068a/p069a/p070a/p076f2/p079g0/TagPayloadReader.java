package p067c.p068a.p069a.p070a.p076f2.p079g0;

import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.g0.e */
abstract class TagPayloadReader {

    /* renamed from: a */
    protected final C0916b0 f6109a;

    /* renamed from: c.a.a.a.f2.g0.e$a */
    /* compiled from: TagPayloadReader */
    public static final class C0929a extends ParserException {
        public C0929a(String str) {
            super(str);
        }
    }

    protected TagPayloadReader(C0916b0 b0Var) {
        this.f6109a = b0Var;
    }

    /* renamed from: a */
    public final boolean mo6214a(ParsableByteArray a0Var, long j) throws ParserException {
        return mo6209b(a0Var) && mo6210c(a0Var, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo6209b(ParsableByteArray a0Var) throws ParserException;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo6210c(ParsableByteArray a0Var, long j) throws ParserException;
}
