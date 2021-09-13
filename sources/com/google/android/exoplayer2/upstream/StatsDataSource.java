package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: com.google.android.exoplayer2.upstream.d0 */
public final class StatsDataSource implements C1916m {

    /* renamed from: b */
    private final C1916m f12301b;

    /* renamed from: c */
    private long f12302c;

    /* renamed from: d */
    private Uri f12303d = Uri.EMPTY;

    /* renamed from: e */
    private Map<String, List<String>> f12304e = Collections.emptyMap();

    public StatsDataSource(C1916m mVar) {
        this.f12301b = (C1916m) Assertions.m10153e(mVar);
    }

    /* renamed from: b */
    public int mo6195b(byte[] bArr, int i, int i2) throws IOException {
        int b = this.f12301b.mo6195b(bArr, i, i2);
        if (b != -1) {
            this.f12302c += (long) b;
        }
        return b;
    }

    public void close() throws IOException {
        this.f12301b.close();
    }

    /* renamed from: e */
    public long mo7015e(DataSpec pVar) throws IOException {
        this.f12303d = pVar.f12345a;
        this.f12304e = Collections.emptyMap();
        long e = this.f12301b.mo7015e(pVar);
        this.f12303d = (Uri) Assertions.m10153e(mo7018l());
        this.f12304e = mo7016g();
        return e;
    }

    /* renamed from: g */
    public Map<String, List<String>> mo7016g() {
        return this.f12301b.mo7016g();
    }

    /* renamed from: k */
    public void mo7017k(TransferListener e0Var) {
        Assertions.m10153e(e0Var);
        this.f12301b.mo7017k(e0Var);
    }

    /* renamed from: l */
    public Uri mo7018l() {
        return this.f12301b.mo7018l();
    }

    /* renamed from: r */
    public long mo14914r() {
        return this.f12302c;
    }

    /* renamed from: s */
    public Uri mo14915s() {
        return this.f12303d;
    }

    /* renamed from: t */
    public Map<String, List<String>> mo14916t() {
        return this.f12304e;
    }

    /* renamed from: u */
    public void mo14917u() {
        this.f12302c = 0;
    }
}
