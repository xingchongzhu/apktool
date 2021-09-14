package com.tv91.p213u.p221b.p222x0;

import com.tv91.model.DownloadInfo;
import com.tv91.model.Movie;

/* renamed from: com.tv91.u.b.x0.b */
/* compiled from: lambda */
public final /* synthetic */ class C2501b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2514f1 f15030a;

    /* renamed from: b */
    public final /* synthetic */ Movie f15031b;

    /* renamed from: c */
    public final /* synthetic */ DownloadInfo f15032c;

    /* renamed from: d */
    public final /* synthetic */ String f15033d;

    public /* synthetic */ C2501b(C2514f1 f1Var, Movie movie, DownloadInfo downloadInfo, String str) {
        this.f15030a = f1Var;
        this.f15031b = movie;
        this.f15032c = downloadInfo;
        this.f15033d = str;
    }

    public final void run() {
        this.f15030a.mo17460s(this.f15031b, this.f15032c, this.f15033d);
    }
}
