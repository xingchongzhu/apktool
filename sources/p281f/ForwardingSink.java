package p281f;

import java.io.IOException;

/* renamed from: f.g */
public abstract class ForwardingSink implements Sink {

    /* renamed from: a */
    private final Sink f18757a;

    public ForwardingSink(Sink rVar) {
        if (rVar != null) {
            this.f18757a = rVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() throws IOException {
        this.f18757a.close();
    }

    /* renamed from: d */
    public Timeout mo19824d() {
        return this.f18757a.mo19824d();
    }

    /* renamed from: f */
    public void mo19789f(C3383c cVar, long j) throws IOException {
        this.f18757a.mo19789f(cVar, j);
    }

    public void flush() throws IOException {
        this.f18757a.flush();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.f18757a.toString());
        sb.append(")");
        return sb.toString();
    }
}
