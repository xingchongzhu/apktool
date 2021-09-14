package com.tv91.p253y;

import com.tv91.model.DownloadRecord;
import com.tv91.model.DownloadRecord.C2335a;

/* renamed from: com.tv91.y.b */
public final /* synthetic */ class MovieRepository {
    /* renamed from: a */
    public static DownloadRecord m20655a(C3058c _this, DownloadRecord aVar) throws Exception {
        DownloadRecord b = aVar.mo17037b(C2335a.DONE);
        _this.mo18600h(b);
        return b;
    }

    /* renamed from: b */
    public static DownloadRecord m20656b(C3058c _this, DownloadRecord aVar, String str) throws Exception {
        DownloadRecord e = aVar.mo17040e(str, C2335a.MOVED);
        _this.mo18600h(e);
        return e;
    }

    /* renamed from: c */
    public static DownloadRecord m20657c(C3058c _this, DownloadRecord aVar) throws Exception {
        DownloadRecord b = aVar.mo17037b(C2335a.PAUSED);
        _this.mo18600h(b);
        return b;
    }

    /* renamed from: d */
    public static DownloadRecord m20658d(C3058c _this, DownloadRecord aVar) throws Exception {
        DownloadRecord b = aVar.mo17037b(C2335a.DELETED);
        _this.mo18600h(b);
        return b;
    }

    /* renamed from: e */
    public static DownloadRecord m20659e(C3058c _this, DownloadRecord aVar) throws Exception {
        DownloadRecord b = aVar.mo17037b(C2335a.DOWNLOADING);
        _this.mo18600h(b);
        return b;
    }
}
