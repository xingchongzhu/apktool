package p067c.p068a.p069a.p070a.p096i2;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.ParsingLoadable.C1908a;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p067c.p068a.p069a.p070a.p096i2.FilterableManifest;

/* renamed from: c.a.a.a.i2.b */
public final class FilteringManifestParser<T extends FilterableManifest<T>> implements C1908a<T> {

    /* renamed from: a */
    private final C1908a<? extends T> f7379a;

    /* renamed from: b */
    private final List<StreamKey> f7380b;

    public FilteringManifestParser(C1908a<? extends T> aVar, List<StreamKey> list) {
        this.f7379a = aVar;
        this.f7380b = list;
    }

    /* renamed from: b */
    public T mo6781a(Uri uri, InputStream inputStream) throws IOException {
        T t = (FilterableManifest) this.f7379a.mo6781a(uri, inputStream);
        List<StreamKey> list = this.f7380b;
        return (list == null || list.isEmpty()) ? t : (FilterableManifest) t.mo6780a(this.f7380b);
    }
}
