package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C1898b0.C1903e;
import com.google.android.exoplayer2.upstream.DataSpec.C1919b;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.p097j2.LoadEventInfo;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.upstream.c0 */
public final class ParsingLoadable<T> implements C1903e {

    /* renamed from: a */
    public final long f12293a;

    /* renamed from: b */
    public final DataSpec f12294b;

    /* renamed from: c */
    public final int f12295c;

    /* renamed from: d */
    private final StatsDataSource f12296d;

    /* renamed from: e */
    private final C1908a<? extends T> f12297e;

    /* renamed from: f */
    private volatile T f12298f;

    /* renamed from: com.google.android.exoplayer2.upstream.c0$a */
    /* compiled from: ParsingLoadable */
    public interface C1908a<T> {
        /* renamed from: a */
        T mo6781a(Uri uri, InputStream inputStream) throws IOException;
    }

    public ParsingLoadable(C1916m mVar, Uri uri, int i, C1908a<? extends T> aVar) {
        this(mVar, new C1919b().mo14959i(uri).mo14952b(1).mo14951a(), i, aVar);
    }

    /* renamed from: a */
    public final void mo6893a() throws IOException {
        this.f12296d.mo14917u();
        DataSourceInputStream oVar = new DataSourceInputStream(this.f12296d, this.f12294b);
        try {
            oVar.mo14940C();
            this.f12298f = this.f12297e.mo6781a((Uri) Assertions.m10153e(this.f12296d.mo7018l()), oVar);
        } finally {
            Util.m10301m(oVar);
        }
    }

    /* renamed from: b */
    public long mo14910b() {
        return this.f12296d.mo14914r();
    }

    /* renamed from: c */
    public final void mo6895c() {
    }

    /* renamed from: d */
    public Map<String, List<String>> mo14911d() {
        return this.f12296d.mo14916t();
    }

    /* renamed from: e */
    public final T mo14912e() {
        return this.f12298f;
    }

    /* renamed from: f */
    public Uri mo14913f() {
        return this.f12296d.mo14915s();
    }

    public ParsingLoadable(C1916m mVar, DataSpec pVar, int i, C1908a<? extends T> aVar) {
        this.f12296d = new StatsDataSource(mVar);
        this.f12294b = pVar;
        this.f12295c = i;
        this.f12297e = aVar;
        this.f12293a = LoadEventInfo.m9282a();
    }
}
