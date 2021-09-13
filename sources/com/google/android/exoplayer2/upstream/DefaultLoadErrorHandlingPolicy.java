package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.C1898b0.C1906h;
import com.google.android.exoplayer2.upstream.C1926y.C1927a;
import com.google.android.exoplayer2.upstream.C1926y.C1931e;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.C1896a;
import java.io.FileNotFoundException;
import java.io.IOException;
import p067c.p068a.p069a.p070a.ParserException;

/* renamed from: com.google.android.exoplayer2.upstream.v */
public class DefaultLoadErrorHandlingPolicy implements LoadErrorHandlingPolicy {

    /* renamed from: a */
    private final int f12443a;

    public DefaultLoadErrorHandlingPolicy() {
        this(-1);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14889a(long j) {
        C1933z.m15179a(this, j);
    }

    /* renamed from: b */
    public long mo14890b(C1896a aVar) {
        IOException iOException = aVar.f12268c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof C1927a) || (iOException instanceof C1906h)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((aVar.f12269d - 1) * 1000, 5000);
    }

    /* renamed from: c */
    public long mo14891c(C1896a aVar) {
        IOException iOException = aVar.f12268c;
        if (!(iOException instanceof C1931e)) {
            return -9223372036854775807L;
        }
        int i = ((C1931e) iOException).f12452c;
        if (i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) {
            return 60000;
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public int mo14892d(int i) {
        int i2 = this.f12443a;
        if (i2 != -1) {
            return i2;
        }
        return i == 7 ? 6 : 3;
    }

    public DefaultLoadErrorHandlingPolicy(int i) {
        this.f12443a = i;
    }
}
