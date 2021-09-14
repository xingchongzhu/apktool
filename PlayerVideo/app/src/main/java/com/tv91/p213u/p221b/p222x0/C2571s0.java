package com.tv91.p213u.p221b.p222x0;

import com.tv91.model.DownloadRecord;
import java.io.File;

/* renamed from: com.tv91.u.b.x0.s0 */
/* compiled from: lambda */
public final /* synthetic */ class C2571s0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ StartDownObservableUseCase f15141a;

    /* renamed from: b */
    public final /* synthetic */ DownloadRecord f15142b;

    /* renamed from: c */
    public final /* synthetic */ File f15143c;

    public /* synthetic */ C2571s0(StartDownObservableUseCase v1Var, DownloadRecord aVar, File file) {
        this.f15141a = v1Var;
        this.f15142b = aVar;
        this.f15143c = file;
    }

    public final void run() {
        this.f15141a.mo17570w(this.f15142b, this.f15143c);
    }
}
