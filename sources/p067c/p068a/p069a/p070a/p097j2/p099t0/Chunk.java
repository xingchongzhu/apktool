package p067c.p068a.p069a.p070a.p097j2.p099t0;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C1898b0.C1903e;
import com.google.android.exoplayer2.upstream.C1916m;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p097j2.LoadEventInfo;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.j2.t0.b */
public abstract class Chunk implements C1903e {

    /* renamed from: a */
    public final long f7639a = LoadEventInfo.m9282a();

    /* renamed from: b */
    public final DataSpec f7640b;

    /* renamed from: c */
    public final int f7641c;

    /* renamed from: d */
    public final Format f7642d;

    /* renamed from: e */
    public final int f7643e;

    /* renamed from: f */
    public final Object f7644f;

    /* renamed from: g */
    public final long f7645g;

    /* renamed from: h */
    public final long f7646h;

    /* renamed from: i */
    protected final StatsDataSource f7647i;

    public Chunk(C1916m mVar, DataSpec pVar, int i, Format u0Var, int i2, Object obj, long j, long j2) {
        this.f7647i = new StatsDataSource(mVar);
        this.f7640b = (DataSpec) Assertions.m10153e(pVar);
        this.f7641c = i;
        this.f7642d = u0Var;
        this.f7643e = i2;
        this.f7644f = obj;
        this.f7645g = j;
        this.f7646h = j2;
    }

    /* renamed from: b */
    public final long mo7007b() {
        return this.f7647i.mo14914r();
    }

    /* renamed from: d */
    public final long mo7008d() {
        return this.f7646h - this.f7645g;
    }

    /* renamed from: e */
    public final Map<String, List<String>> mo7009e() {
        return this.f7647i.mo14916t();
    }

    /* renamed from: f */
    public final Uri mo7010f() {
        return this.f7647i.mo14915s();
    }
}
