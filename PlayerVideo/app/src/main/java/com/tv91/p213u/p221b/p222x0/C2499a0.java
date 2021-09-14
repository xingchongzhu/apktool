package com.tv91.p213u.p221b.p222x0;

import android.os.ParcelFileDescriptor;
import com.tv91.model.DownloadRecord;

/* renamed from: com.tv91.u.b.x0.a0 */
/* compiled from: lambda */
public final /* synthetic */ class C2499a0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MoveDownloadUseCase f15025a;

    /* renamed from: b */
    public final /* synthetic */ DownloadRecord f15026b;

    /* renamed from: c */
    public final /* synthetic */ ParcelFileDescriptor f15027c;

    /* renamed from: d */
    public final /* synthetic */ String f15028d;

    public /* synthetic */ C2499a0(MoveDownloadUseCase o1Var, DownloadRecord aVar, ParcelFileDescriptor parcelFileDescriptor, String str) {
        this.f15025a = o1Var;
        this.f15026b = aVar;
        this.f15027c = parcelFileDescriptor;
        this.f15028d = str;
    }

    public final void run() {
        this.f15025a.mo17533s(this.f15026b, this.f15027c, this.f15028d);
    }
}
