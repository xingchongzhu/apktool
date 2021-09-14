package com.tv91.p253y;

import com.tv91.model.DownloadInfo;
import com.tv91.model.DownloadRecord;
import com.tv91.model.Movie;
import com.tv91.model.User;
import java.util.List;

/* renamed from: com.tv91.y.c */
/* compiled from: MovieRepository */
public interface C3058c {
    /* renamed from: b */
    List<DownloadRecord> mo18594b(String str);

    /* renamed from: c */
    DownloadRecord mo18595c(DownloadRecord aVar) throws Exception;

    /* renamed from: d */
    DownloadRecord mo18596d(String str, int i);

    /* renamed from: e */
    DownloadRecord mo18597e(DownloadRecord aVar) throws Exception;

    /* renamed from: f */
    DownloadRecord mo18598f(DownloadRecord aVar, String str) throws Exception;

    /* renamed from: g */
    Movie mo18599g(String str, int i);

    /* renamed from: h */
    void mo18600h(DownloadRecord aVar) throws Exception;

    /* renamed from: i */
    DownloadRecord mo18601i(User user, Movie movie, DownloadInfo downloadInfo, String str) throws Exception;

    /* renamed from: j */
    DownloadRecord mo18602j(DownloadRecord aVar) throws Exception;

    /* renamed from: k */
    DownloadRecord mo18603k(DownloadRecord aVar) throws Exception;
}
