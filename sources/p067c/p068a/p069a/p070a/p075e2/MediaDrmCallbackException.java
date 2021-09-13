package p067c.p068a.p069a.p070a.p075e2;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: c.a.a.a.e2.j0 */
public final class MediaDrmCallbackException extends IOException {

    /* renamed from: a */
    public final DataSpec f5836a;

    /* renamed from: b */
    public final Uri f5837b;

    /* renamed from: c */
    public final Map<String, List<String>> f5838c;

    /* renamed from: d */
    public final long f5839d;

    public MediaDrmCallbackException(DataSpec pVar, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.f5836a = pVar;
        this.f5837b = uri;
        this.f5838c = map;
        this.f5839d = j;
    }
}
