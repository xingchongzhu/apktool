package com.tv91.p213u.p221b;

import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import com.tv91.model.DownloadInfo;
import com.tv91.model.DownloadRecord;
import com.tv91.model.DownloadRecord.C2335a;
import com.tv91.model.Movie;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p221b.p222x0.C2514f1;
import com.tv91.p213u.p221b.p222x0.C2514f1.C2515a;
import com.tv91.p213u.p221b.p222x0.C2553n1;
import com.tv91.p213u.p221b.p222x0.C2568r1;
import com.tv91.p213u.p221b.p222x0.C2568r1.C2569a;
import com.tv91.p213u.p221b.p222x0.C2574t1;
import com.tv91.p213u.p221b.p222x0.C2574t1.C2575a;
import com.tv91.p213u.p221b.p222x0.C2580v1;
import com.tv91.p213u.p221b.p222x0.C2580v1.C2581a;
import com.tv91.p213u.p221b.p222x0.LoadDownloadRecordsUseCase;
import com.tv91.p213u.p221b.p222x0.LoadDownloadRecordsUseCase.C2550e;
import com.tv91.p213u.p221b.p222x0.RemoveDownloadUseCase;
import com.tv91.p213u.p221b.p222x0.UpdateDownloadUseCase;
import com.tv91.utils.C3052g;
import com.tv91.utils.Files;
import java.io.File;
import java.util.List;

/* renamed from: com.tv91.u.b.v0 */
public final class FileDownloadManager {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final LoadDownloadRecordsUseCase f15007a;

    /* renamed from: b */
    private final C2514f1 f15008b;

    /* renamed from: c */
    private final C2580v1 f15009c;

    /* renamed from: d */
    private final C2568r1 f15010d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2574t1 f15011e;

    /* renamed from: f */
    private final UpdateDownloadUseCase f15012f;

    /* renamed from: g */
    private boolean f15013g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f15014h = -1;

    /* renamed from: com.tv91.u.b.v0$a */
    /* compiled from: FileDownloadManager */
    class C2493a implements C2575a {
        C2493a() {
        }

        /* renamed from: a */
        public void mo17367a(ErrorBundle cVar) {
        }

        /* renamed from: f */
        public /* synthetic */ void mo17371f() {
            RemoveDownloadUseCase.m18718b(this);
        }

        /* renamed from: n */
        public void mo17381n(DownloadRecord aVar) {
            FileDownloadManager.this.mo17431m(aVar);
        }

        /* renamed from: r */
        public void mo17387r() {
            FileDownloadManager.this.f15011e.mo17059n(this);
        }
    }

    /* renamed from: com.tv91.u.b.v0$b */
    /* compiled from: FileDownloadManager */
    private class C2494b implements C2550e {
        private C2494b() {
        }

        /* renamed from: a */
        public void mo17435a(ErrorBundle cVar) {
        }

        /* renamed from: b */
        public void mo17436b(List<DownloadRecord> list) {
            for (DownloadRecord aVar : list) {
                C2335a aVar2 = aVar.f14104f;
                if ((aVar2 == C2335a.DOWNLOADING || aVar2 == C2335a.QUEUED || aVar2 == C2335a.PAUSED || aVar2 == C2335a.EXPIRED) && !C3052g.m20586g(aVar.f14103e)) {
                    long j = aVar.f14101c.fileSize;
                    try {
                        File file = new File(Uri.parse(aVar.f14103e).getPath());
                        if (file.exists()) {
                            j -= file.length();
                        }
                    } catch (Exception unused) {
                    }
                    FileDownloadManager v0Var = FileDownloadManager.this;
                    v0Var.f15014h = v0Var.f15014h - j;
                }
            }
        }

        /* renamed from: c */
        public void mo17437c() {
            FileDownloadManager.this.f15007a.mo17059n(this);
        }

        /* renamed from: d */
        public /* synthetic */ void mo17438d() {
            C2553n1.m18651c(this);
        }

        /* synthetic */ C2494b(FileDownloadManager v0Var, C2493a aVar) {
            this();
        }
    }

    /* renamed from: com.tv91.u.b.v0$c */
    /* compiled from: FileDownloadManager */
    public interface C2495c extends C2515a, C2581a, C2569a, C2575a {
    }

    public FileDownloadManager(LoadDownloadRecordsUseCase m1Var, C2514f1 f1Var, C2580v1 v1Var, C2568r1 r1Var, C2574t1 t1Var, UpdateDownloadUseCase w1Var) {
        this.f15007a = m1Var;
        this.f15008b = f1Var;
        this.f15009c = v1Var;
        this.f15010d = r1Var;
        this.f15011e = t1Var;
        this.f15012f = w1Var;
        m1Var.mo17058m(new C2494b(this, null));
    }

    /* renamed from: e */
    public void mo17423e(Movie movie, DownloadInfo downloadInfo, String str) {
        this.f15008b.mo17458o(movie, downloadInfo, str);
    }

    /* renamed from: f */
    public void mo17424f(long j) {
        this.f15014h -= j;
    }

    /* renamed from: g */
    public void mo17425g(long j) {
        this.f15014h += j;
    }

    /* renamed from: h */
    public void mo17426h(Context context) {
        if (!this.f15013g) {
            this.f15013g = true;
            this.f15014h = new StatFs(Files.m20564d(context).getAbsolutePath()).getAvailableBytes();
            this.f15007a.mo17518o(null);
        }
    }

    /* renamed from: i */
    public boolean mo17427i(long j) {
        return this.f15014h - 209715200 > j;
    }

    /* renamed from: j */
    public void mo17428j(DownloadRecord aVar) {
        this.f15010d.mo17545o(aVar);
    }

    /* renamed from: k */
    public void mo17429k(DownloadRecord aVar) {
        this.f15011e.mo17554o(aVar);
    }

    /* renamed from: l */
    public void mo17430l(DownloadRecord aVar) {
        this.f15011e.mo17058m(new C2493a());
        this.f15011e.mo17554o(aVar);
    }

    /* renamed from: m */
    public void mo17431m(DownloadRecord aVar) {
        if (!aVar.mo17036a() && aVar.f14104f != C2335a.DOWNLOADING) {
            this.f15009c.mo17568q(aVar);
        }
    }

    /* renamed from: n */
    public void mo17432n(C2495c cVar) {
        this.f15008b.mo17058m(cVar);
        this.f15009c.mo17058m(cVar);
        this.f15010d.mo17058m(cVar);
        this.f15011e.mo17058m(cVar);
    }

    /* renamed from: o */
    public void mo17433o(C2495c cVar) {
        this.f15008b.mo17059n(cVar);
        this.f15009c.mo17059n(cVar);
        this.f15010d.mo17059n(cVar);
        this.f15011e.mo17059n(cVar);
    }

    /* renamed from: p */
    public void mo17434p(DownloadRecord aVar) {
        this.f15012f.mo17574o(aVar);
    }
}
