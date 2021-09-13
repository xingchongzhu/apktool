package com.tv91.p213u.p223c.p229k;

import com.tv91.model.Category;
import com.tv91.model.Movie;
import com.tv91.model.Paging;
import com.tv91.model.RankType;
import com.tv91.p207q.p209b.C2345e;
import com.tv91.p207q.p209b.C2346f;
import com.tv91.p207q.p209b.C2346f.C2347a;
import com.tv91.p207q.p209b.C2346f.C2348b;
import com.tv91.p207q.p209b.C2346f.C2349c;
import com.tv91.p207q.p209b.C2346f.C2350d;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import com.tv91.p255z.C3061b;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.c.k.t */
public final class LoadMoviesUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15529i;

    /* renamed from: j */
    private Consumer<Paging<Movie>> f15530j = ObservableUseCase.m17658b();

    /* renamed from: k */
    private final C2345e f15531k = new C2788k(this);

    /* renamed from: com.tv91.u.c.k.t$a */
    /* compiled from: LoadMoviesUseCase */
    public enum C2792a {
        CHANNEL(1),
        CATEGORY(2),
        SERIES(3),
        SUPPLIER(4),
        ACTOR(5),
        KEYWORD(1),
        SOURCE(2),
        RANK(0);
        

        /* renamed from: j */
        final int f15541j;

        private C2792a(int i) {
            this.f15541j = i;
        }
    }

    public LoadMoviesUseCase(Schedulers bVar, C3061b bVar2) {
        super(bVar);
        this.f15529i = bVar2;
    }

    /* renamed from: o */
    private void m19521o(int i, int i2, C2792a aVar, int[] iArr, String str) {
        mo17058m(this.f15531k);
        C2789l lVar = new C2789l(this, i, i2, aVar, iArr, str);
        mo17055j(lVar);
    }

    /* renamed from: t */
    private Paging<Movie> m19522t(int i, int i2, C2792a aVar, int[] iArr, String str) throws Exception {
        if (aVar == C2792a.RANK) {
            List m = this.f15529i.mo18669m(iArr[0]);
            return new Paging<>(m.size(), 1, m);
        } else if (aVar == C2792a.SOURCE) {
            return this.f15529i.mo18658b(i, i2, iArr[0], aVar.f15541j);
        } else {
            return this.f15529i.mo18654Y(i, i2, aVar.f15541j, iArr, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void mo17988v(int i, int i2, C2792a aVar, int[] iArr, String str) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(m19522t(i, i2, aVar, iArr, str)));
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
    /* renamed from: w */
    public /* synthetic */ void mo17989x(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15530j.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: A */
    public LoadMoviesUseCase mo17982A(Runnable runnable) {
        this.f14275c = runnable;
        return this;
    }

    /* renamed from: B */
    public LoadMoviesUseCase mo17983B(Consumer<Paging<Movie>> aVar) {
        this.f15530j = aVar;
        return this;
    }

    /* renamed from: p */
    public void mo17984p(int i, int i2, String str) {
        m19521o(i, i2, C2792a.CHANNEL, new int[]{-1}, str);
    }

    /* renamed from: q */
    public void mo17985q(int i, int i2, List<Category> list) {
        if (list == null || list.isEmpty()) {
            mo17054i(new C2349c());
            mo17054i(new C2350d(Paging.empty()));
            mo17054i(new C2348b());
            return;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((Category) list.get(i3)).key;
        }
        m19521o(i, i2, C2792a.CATEGORY, iArr, "");
    }

    /* renamed from: r */
    public void mo17986r(C2792a aVar, int i, int i2, int i3) {
        int i4 = i2;
        int i5 = i3;
        C2792a aVar2 = aVar;
        m19521o(i4, i5, aVar2, new int[]{i}, "");
    }

    /* renamed from: s */
    public void mo17987s(RankType cVar) {
        m19521o(0, 0, C2792a.RANK, new int[]{cVar.f14118e}, "");
    }

    /* renamed from: y */
    public LoadMoviesUseCase mo17990y(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: z */
    public LoadMoviesUseCase mo17991z(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }
}
