package com.tv91.p253y;

import com.tv91.model.DownloadInfo;
import com.tv91.model.DownloadRecord;
import com.tv91.model.DownloadRecord.C2335a;
import com.tv91.model.Movie;
import com.tv91.model.User;
import com.tv91.p253y.p254i.DBHelper;
import com.tv91.p253y.p254i.DownloadRecordProvider;
import com.tv91.p253y.p254i.FavoriteMovieProvider;
import com.tv91.utils.FragmentUtils;
import java.util.List;

/* renamed from: com.tv91.y.a */
public final class MovieDatabase implements C3058c {

    /* renamed from: a */
    private final FavoriteMovieProvider f16087a;

    /* renamed from: b */
    private final DownloadRecordProvider f16088b;

    public MovieDatabase(DBHelper aVar) {
        this.f16087a = new FavoriteMovieProvider(aVar);
        this.f16088b = new DownloadRecordProvider(aVar);
    }

    /* renamed from: b */
    public List<DownloadRecord> mo18594b(String str) {
        if (FragmentUtils.m20586g(str)) {
            return this.f16088b.mo18626d();
        }
        return this.f16088b.mo18627e(str);
    }

    /* renamed from: c */
    public /* synthetic */ DownloadRecord mo18595c(DownloadRecord aVar) {
        return MovieRepository.m20659e(this, aVar);
    }

    /* renamed from: d */
    public DownloadRecord mo18596d(String str, int i) {
        return this.f16088b.mo18625c(str, i);
    }

    /* renamed from: e */
    public /* synthetic */ DownloadRecord mo18597e(DownloadRecord aVar) {
        return MovieRepository.m20657c(this, aVar);
    }

    /* renamed from: f */
    public /* synthetic */ DownloadRecord mo18598f(DownloadRecord aVar, String str) {
        return MovieRepository.m20656b(this, aVar, str);
    }

    /* renamed from: g */
    public Movie mo18599g(String str, int i) {
        return this.f16087a.mo18629b(str, i);
    }

    /* renamed from: h */
    public void mo18600h(DownloadRecord aVar) {
        this.f16088b.mo18628f(aVar);
    }

    /* renamed from: i */
    public DownloadRecord mo18601i(User user, Movie movie, DownloadInfo downloadInfo, String str) {
        DownloadRecord aVar = new DownloadRecord(1, user, movie, downloadInfo, str, C2335a.QUEUED);
        this.f16088b.mo18624a(aVar);
        return aVar;
    }

    /* renamed from: j */
    public /* synthetic */ DownloadRecord mo18602j(DownloadRecord aVar) {
        return MovieRepository.m20655a(this, aVar);
    }

    /* renamed from: k */
    public /* synthetic */ DownloadRecord mo18603k(DownloadRecord aVar) {
        return MovieRepository.m20658d(this, aVar);
    }
}
