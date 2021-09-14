package com.tv91.p213u.p242g.p243f0;

import com.tv91.p207q.p209b.C2345e;
import com.tv91.p207q.p209b.C2346f;
import com.tv91.p207q.p209b.C2346f.C2347a;
import com.tv91.p207q.p209b.C2346f.C2348b;
import com.tv91.p207q.p209b.C2346f.C2349c;
import com.tv91.p207q.p209b.C2346f.C2350d;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p255z.DownloadApi;
import java.io.File;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.g.f0.j */
public final class DownloadApkUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final DownloadApi f15852i;

    /* renamed from: j */
    private Consumer<File> f15853j = ObservableUseCase.m17658b();

    /* renamed from: k */
    private final C2345e f15854k = new C2928c(this);

    public DownloadApkUseCase(Schedulers bVar, DownloadApi cVar) {
        super(bVar);
        this.f15852i = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18341r(String str, File file) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo18340p(str, file)));
            bVar = new C2348b();
        } catch (Exception e) {
            mo17054i(new C2347a(new ErrorBundle(e)));
            bVar = new C2348b();
        } catch (Throwable th) {
            mo17054i(new C2348b());
            throw th;
        }
        mo17054i(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo18342t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15853j.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18339o(String str, File file) {
        mo17058m(this.f15854k);
        mo17055j(new C2929d(this, str, file));
    }

    /* renamed from: p */
    public File mo18340p(String str, File file) throws Exception {
        return this.f15852i.mo18690g(str, new File(file, "91TV.apk"));
    }

    /* renamed from: u */
    public DownloadApkUseCase mo18343u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public DownloadApkUseCase mo18344v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public DownloadApkUseCase mo18345w(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: x */
    public DownloadApkUseCase mo18346x(Consumer<File> aVar) {
        this.f15853j = aVar;
        return this;
    }
}
