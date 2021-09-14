package com.tv91.p213u.p221b.p222x0;

import com.tv91.model.DownloadRecord;
import com.tv91.model.DownloadRecord.C2335a;
import com.tv91.model.User;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ApiException;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.C3058c;
import com.tv91.p253y.C3060h;
import java.util.Iterator;
import java.util.List;

import androidx.core.util.Consumer;

/* renamed from: com.tv91.u.b.x0.m1 */
public final class LoadDownloadRecordsUseCase extends ObservableUseCase<LoadDownloadRecordsUseCase.C2550e> {

    /* renamed from: i */
    private final C3060h f15102i;

    /* renamed from: j */
    private final C3058c f15103j;

    /* renamed from: com.tv91.u.b.x0.m1$a */
    /* compiled from: LoadDownloadRecordsUseCase */
    class C2546a implements C2550e {

        /* renamed from: a */
        final /* synthetic */ Runnable f15104a;

        C2546a(Runnable runnable) {
            this.f15104a = runnable;
        }

        /* renamed from: a */
        public /* synthetic */ void mo17435a(ErrorBundle cVar) {
            C2553n1.m18649a(this, cVar);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17436b(List list) {
            C2553n1.m18652d(this, list);
        }

        /* renamed from: c */
        public /* synthetic */ void mo17437c() {
            C2553n1.m18650b(this);
        }

        /* renamed from: d */
        public void mo17438d() {
            this.f15104a.run();
        }
    }

    /* renamed from: com.tv91.u.b.x0.m1$b */
    /* compiled from: LoadDownloadRecordsUseCase */
    class C2547b implements C2550e {

        /* renamed from: a */
        final /* synthetic */ Runnable f15106a;

        C2547b(Runnable runnable) {
            this.f15106a = runnable;
        }

        /* renamed from: a */
        public /* synthetic */ void mo17435a(ErrorBundle cVar) {
            C2553n1.m18649a(this, cVar);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17436b(List list) {
            C2553n1.m18652d(this, list);
        }

        /* renamed from: c */
        public void mo17437c() {
            this.f15106a.run();
        }

        /* renamed from: d */
        public /* synthetic */ void mo17438d() {
            C2553n1.m18651c(this);
        }
    }

    /* renamed from: com.tv91.u.b.x0.m1$c */
    /* compiled from: LoadDownloadRecordsUseCase */
    class C2548c implements C2550e {

        /* renamed from: a */
        final /* synthetic */ Consumer f15108a;

        C2548c(Consumer aVar) {
            this.f15108a = aVar;
        }

        /* renamed from: a */
        public /* synthetic */ void mo17435a(ErrorBundle cVar) {
            C2553n1.m18649a(this, cVar);
        }

        /* renamed from: b */
        public void mo17436b(List<DownloadRecord> list) {
            this.f15108a.accept(list);
        }

        /* renamed from: c */
        public /* synthetic */ void mo17437c() {
            C2553n1.m18650b(this);
        }

        /* renamed from: d */
        public /* synthetic */ void mo17438d() {
            C2553n1.m18651c(this);
        }
    }

    /* renamed from: com.tv91.u.b.x0.m1$d */
    /* compiled from: LoadDownloadRecordsUseCase */
    class C2549d implements C2550e {

        /* renamed from: a */
        final /* synthetic */ Consumer f15110a;

        C2549d(Consumer aVar) {
            this.f15110a = aVar;
        }

        /* renamed from: a */
        public void mo17435a(ErrorBundle cVar) {
            this.f15110a.accept(cVar);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17436b(List list) {
            C2553n1.m18652d(this, list);
        }

        /* renamed from: c */
        public /* synthetic */ void mo17437c() {
            C2553n1.m18650b(this);
        }

        /* renamed from: d */
        public /* synthetic */ void mo17438d() {
            C2553n1.m18651c(this);
        }
    }

    /* renamed from: com.tv91.u.b.x0.m1$e */
    /* compiled from: LoadDownloadRecordsUseCase */
    public interface C2550e {
        /* renamed from: a */
        void mo17435a(ErrorBundle cVar);

        /* renamed from: b */
        void mo17436b(List<DownloadRecord> list);

        /* renamed from: c */
        void mo17437c();

        /* renamed from: d */
        void mo17438d();
    }

    public LoadDownloadRecordsUseCase(Schedulers bVar, C3060h hVar, C3058c cVar) {
        super(bVar);
        this.f15102i = hVar;
        this.f15103j = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m18611A() {
        for (C2550e d : mo17052d()) {
            d.mo17438d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m18615t(List<DownloadRecord> list) {
        for (C2550e b : mo17052d()) {
            b.mo17436b(list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void mo17520s(C2335a aVar) {
        C2587y yVar;
        try {
            mo17057l(new C2576u(this));
            mo17057l(new C2582w(this, mo17519p(aVar)));
            yVar = new C2587y(this);
        } catch (Exception e) {
            ErrorBundle cVar = new ErrorBundle(e);
            if (cVar.mo17116f()) {
                this.f15102i.mo18619i();
            }
            mo17057l(new C2578v(this, cVar));
            yVar = new C2587y(this);
        } catch (Throwable th) {
            mo17057l(new C2587y(this));
            throw th;
        }
        mo17057l(yVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m18616v(ErrorBundle cVar) {
        for (C2550e a : mo17052d()) {
            a.mo17435a(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m18619z() {
        for (C2550e c : mo17052d()) {
            c.mo17437c();
        }
        mo17051a();
    }

    /* renamed from: C */
    public LoadDownloadRecordsUseCase mo17514C(Consumer<ErrorBundle> aVar) {
        mo17058m(new C2549d(aVar));
        return this;
    }

    /* renamed from: D */
    public LoadDownloadRecordsUseCase mo17515D(Runnable runnable) {
        mo17058m(new C2547b(runnable));
        return this;
    }

    /* renamed from: E */
    public LoadDownloadRecordsUseCase mo17516E(Runnable runnable) {
        mo17058m(new C2546a(runnable));
        return this;
    }

    /* renamed from: F */
    public LoadDownloadRecordsUseCase mo17517F(Consumer<List<DownloadRecord>> aVar) {
        mo17058m(new C2548c(aVar));
        return this;
    }

    /* renamed from: o */
    public void mo17518o(C2335a aVar) {
        mo17055j(new C2585x(this, aVar));
    }

    /* renamed from: p */
    public List<DownloadRecord> mo17519p(C2335a aVar) throws Exception {
        User e = this.f15102i.mo18615e();
        if (e == null && aVar == null) {
            throw new ApiException("NotLogin");
        }
        List<DownloadRecord> b = this.f15103j.mo18594b(e == null ? "" : e.f14097id);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            b.set(i, ((DownloadRecord) b.get(i)).mo17039d(e));
        }
        if (aVar != null) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                if (aVar != ((DownloadRecord) it.next()).f14104f) {
                    it.remove();
                }
            }
        }
        return b;
    }
}
