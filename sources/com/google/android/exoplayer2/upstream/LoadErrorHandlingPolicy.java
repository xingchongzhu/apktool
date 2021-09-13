package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import p067c.p068a.p069a.p070a.p097j2.LoadEventInfo;
import p067c.p068a.p069a.p070a.p097j2.MediaLoadData;

/* renamed from: com.google.android.exoplayer2.upstream.a0 */
public interface LoadErrorHandlingPolicy {

    /* renamed from: com.google.android.exoplayer2.upstream.a0$a */
    /* compiled from: LoadErrorHandlingPolicy */
    public static final class C1896a {

        /* renamed from: a */
        public final LoadEventInfo f12266a;

        /* renamed from: b */
        public final MediaLoadData f12267b;

        /* renamed from: c */
        public final IOException f12268c;

        /* renamed from: d */
        public final int f12269d;

        public C1896a(LoadEventInfo wVar, MediaLoadData zVar, IOException iOException, int i) {
            this.f12266a = wVar;
            this.f12267b = zVar;
            this.f12268c = iOException;
            this.f12269d = i;
        }
    }

    /* renamed from: a */
    void mo14889a(long j);

    /* renamed from: b */
    long mo14890b(C1896a aVar);

    /* renamed from: c */
    long mo14891c(C1896a aVar);

    /* renamed from: d */
    int mo14892d(int i);
}
