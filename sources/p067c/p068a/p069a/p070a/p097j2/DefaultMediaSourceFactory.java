package p067c.p068a.p069a.p070a.p097j2;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.C1916m.C1917a;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p097j2.ProgressiveMediaSource.C1096b;

/* renamed from: c.a.a.a.j2.s */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {

    /* renamed from: a */
    private final C1917a f7614a;

    /* renamed from: b */
    private final SparseArray<MediaSourceFactory> f7615b;

    /* renamed from: c */
    private final int[] f7616c;

    /* renamed from: d */
    private long f7617d;

    /* renamed from: e */
    private long f7618e;

    /* renamed from: f */
    private long f7619f;

    /* renamed from: g */
    private float f7620g;

    /* renamed from: h */
    private float f7621h;

    public DefaultMediaSourceFactory(Context context, C0998o oVar) {
        this((C1917a) new DefaultDataSourceFactory(context), oVar);
    }

    /* renamed from: a */
    private static SparseArray<MediaSourceFactory> m9242a(C1917a aVar, C0998o oVar) {
        Class<C1917a> cls = C1917a.class;
        Class<MediaSourceFactory> cls2 = MediaSourceFactory.class;
        SparseArray<MediaSourceFactory> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (MediaSourceFactory) Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{aVar}));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (MediaSourceFactory) Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{aVar}));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (MediaSourceFactory) Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{aVar}));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new C1096b(aVar, oVar));
        return sparseArray;
    }

    public DefaultMediaSourceFactory(C1917a aVar, C0998o oVar) {
        this.f7614a = aVar;
        SparseArray<MediaSourceFactory> a = m9242a(aVar, oVar);
        this.f7615b = a;
        this.f7616c = new int[a.size()];
        for (int i = 0; i < this.f7615b.size(); i++) {
            this.f7616c[i] = this.f7615b.keyAt(i);
        }
        this.f7617d = -9223372036854775807L;
        this.f7618e = -9223372036854775807L;
        this.f7619f = -9223372036854775807L;
        this.f7620g = -3.4028235E38f;
        this.f7621h = -3.4028235E38f;
    }
}
