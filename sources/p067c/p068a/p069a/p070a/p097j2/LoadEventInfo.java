package p067c.p068a.p069a.p070a.p097j2;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: c.a.a.a.j2.w */
public final class LoadEventInfo {

    /* renamed from: a */
    private static final AtomicLong f7658a = new AtomicLong();

    /* renamed from: b */
    public final long f7659b;

    /* renamed from: c */
    public final DataSpec f7660c;

    /* renamed from: d */
    public final Uri f7661d;

    /* renamed from: e */
    public final Map<String, List<String>> f7662e;

    /* renamed from: f */
    public final long f7663f;

    /* renamed from: g */
    public final long f7664g;

    /* renamed from: h */
    public final long f7665h;

    public LoadEventInfo(long j, DataSpec pVar, long j2) {
        DataSpec pVar2 = pVar;
        this(j, pVar2, pVar2.f12345a, Collections.emptyMap(), j2, 0, 0);
    }

    /* renamed from: a */
    public static long m9282a() {
        return f7658a.getAndIncrement();
    }

    public LoadEventInfo(long j, DataSpec pVar, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f7659b = j;
        this.f7660c = pVar;
        this.f7661d = uri;
        this.f7662e = map;
        this.f7663f = j2;
        this.f7664g = j3;
        this.f7665h = j4;
    }
}
