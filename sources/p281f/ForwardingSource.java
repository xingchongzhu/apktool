package p281f;

import java.io.IOException;

/* renamed from: f.h */
public abstract class ForwardingSource implements Source {

    /* renamed from: a */
    private final Source f18758a;

    public ForwardingSource(Source sVar) {
        if (sVar != null) {
            this.f18758a = sVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: B */
    public final Source mo20257B() {
        return this.f18758a;
    }

    public void close() throws IOException {
        this.f18758a.close();
    }

    /* renamed from: d */
    public Timeout mo19738d() {
        return this.f18758a.mo19738d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.f18758a.toString());
        sb.append(")");
        return sb.toString();
    }
}
