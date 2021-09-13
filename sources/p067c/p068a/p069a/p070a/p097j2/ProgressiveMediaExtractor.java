package p067c.p068a.p069a.p070a.p097j2;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;

/* renamed from: c.a.a.a.j2.g0 */
interface ProgressiveMediaExtractor {
    /* renamed from: a */
    void mo6869a();

    /* renamed from: b */
    void mo6870b(DataReader jVar, Uri uri, Map<String, List<String>> map, long j, long j2, ExtractorOutput lVar) throws IOException;

    /* renamed from: c */
    void mo6871c(long j, long j2);

    /* renamed from: d */
    int mo6872d(PositionHolder xVar) throws IOException;

    /* renamed from: e */
    long mo6873e();

    /* renamed from: f */
    void mo6874f();
}
