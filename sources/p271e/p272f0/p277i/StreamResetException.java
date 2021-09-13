package p271e.p272f0.p277i;

import java.io.IOException;

/* renamed from: e.f0.i.n */
public final class StreamResetException extends IOException {

    /* renamed from: a */
    public final ErrorCode f18407a;

    public StreamResetException(ErrorCode bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("stream was reset: ");
        sb.append(bVar);
        super(sb.toString());
        this.f18407a = bVar;
    }
}
