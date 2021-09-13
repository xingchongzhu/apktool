package com.tv91.p213u.p244h.p248k;

import com.tv91.model.Movie;
import com.tv91.model.PurchasePackage;

/* renamed from: com.tv91.u.h.k.k */
/* compiled from: lambda */
public final /* synthetic */ class C3046k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PurchaseMovieUseCase f16041a;

    /* renamed from: b */
    public final /* synthetic */ Movie f16042b;

    /* renamed from: c */
    public final /* synthetic */ PurchasePackage f16043c;

    public /* synthetic */ C3046k(PurchaseMovieUseCase rVar, Movie movie, PurchasePackage purchasePackage) {
        this.f16041a = rVar;
        this.f16042b = movie;
        this.f16043c = purchasePackage;
    }

    public final void run() {
        this.f16041a.mo18563r(this.f16042b, this.f16043c);
    }
}
