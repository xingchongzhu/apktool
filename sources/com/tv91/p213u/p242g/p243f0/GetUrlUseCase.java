package com.tv91.p213u.p242g.p243f0;

import android.util.Base64;
import com.tv91.model.Url;
import com.tv91.p207q.p209b.C2345e;
import com.tv91.p207q.p209b.C2346f;
import com.tv91.p207q.p209b.C2346f.C2347a;
import com.tv91.p207q.p209b.C2346f.C2348b;
import com.tv91.p207q.p209b.C2346f.C2349c;
import com.tv91.p207q.p209b.C2346f.C2350d;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p211s.JsonException;
import com.tv91.p212t.Schedulers;
import com.tv91.p253y.SystemRepository;
import com.tv91.p255z.C3061b;
import com.tv91.utils.C3052g;
import java.nio.charset.Charset;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.g.f0.k */
public final class GetUrlUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15855i;

    /* renamed from: j */
    private final SystemRepository f15856j;

    /* renamed from: k */
    private Consumer<Url> f15857k = ObservableUseCase.m17658b();

    /* renamed from: l */
    private final C2345e f15858l = new C2930e(this);

    public GetUrlUseCase(Schedulers bVar, C3061b bVar2, SystemRepository eVar) {
        super(bVar);
        this.f15855i = bVar2;
        this.f15856j = eVar;
    }

    /* renamed from: o */
    private String m20154o(String str) {
        return new String(Base64.decode(str, 0), Charset.defaultCharset());
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void mo18349s(String str) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo18348q(str)));
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
    /* renamed from: t */
    public /* synthetic */ void mo18350u(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15857k.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: p */
    public void mo18347p(String str) {
        mo17058m(this.f15858l);
        mo17055j(new C2931f(this, str));
    }

    /* renamed from: q */
    public Url mo18348q(String str) throws Exception {
        Url X = this.f15855i.mo18653X(str);
        if (X == null || C3052g.m20586g(X.apiUrl) || C3052g.m20586g(X.webUrl)) {
            throw new JsonException("url or url.apiUrl or url.webUrl is empty");
        }
        Url url = new Url(m20154o(X.apiUrl).toLowerCase(), m20154o(X.webUrl).toLowerCase(), C3052g.m20586g(X.novelUrl) ? "" : m20154o(X.novelUrl).toLowerCase(), m20154o(X.apiUrl2), m20154o(X.reportUrl));
        this.f15856j.mo18605b(url.webUrl);
        this.f15856j.mo18604a(url.novelUrl);
        return url;
    }

    /* renamed from: v */
    public GetUrlUseCase mo18351v(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: w */
    public GetUrlUseCase mo18352w(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: x */
    public GetUrlUseCase mo18353x(Consumer<Url> aVar) {
        this.f15857k = aVar;
        return this;
    }
}
