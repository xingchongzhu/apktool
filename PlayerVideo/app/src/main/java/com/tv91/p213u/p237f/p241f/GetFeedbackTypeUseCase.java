package com.tv91.p213u.p237f.p241f;

import com.tv91.model.FeedbackType;
import com.tv91.p207q.p209b.C2345e;
import com.tv91.p207q.p209b.C2346f;
import com.tv91.p207q.p209b.C2346f.C2347a;
import com.tv91.p207q.p209b.C2346f.C2348b;
import com.tv91.p207q.p209b.C2346f.C2349c;
import com.tv91.p207q.p209b.C2346f.C2350d;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p212t.Schedulers;
import com.tv91.p255z.C3061b;
import java.util.List;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.u.f.f.g */
public final class GetFeedbackTypeUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final C3061b f15794i;

    /* renamed from: j */
    private Consumer<List<FeedbackType>> f15795j = ObservableUseCase.m17658b();

    /* renamed from: k */
    private final C2345e f15796k = new C2913b(this);

    public GetFeedbackTypeUseCase(Schedulers bVar, C3061b bVar2) {
        super(bVar);
        this.f15794i = bVar2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        mo17054i(new com.tv91.p207q.p209b.C2346f.C2350d(java.util.Collections.singletonList(new com.tv91.model.FeedbackType(1, ""))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        r0 = new com.tv91.p207q.p209b.C2346f.C2348b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        mo17054i(new com.tv91.p207q.p209b.C2346f.C2348b());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void mo18269r() {
        /*
            r4 = this;
            com.tv91.q.b.f$c r0 = new com.tv91.q.b.f$c     // Catch:{ Exception -> 0x001f }
            r0.<init>()     // Catch:{ Exception -> 0x001f }
            r4.mo17054i(r0)     // Catch:{ Exception -> 0x001f }
            java.util.List r0 = r4.mo18268p()     // Catch:{ Exception -> 0x001f }
            com.tv91.q.b.f$d r1 = new com.tv91.q.b.f$d     // Catch:{ Exception -> 0x001f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x001f }
            r4.mo17054i(r1)     // Catch:{ Exception -> 0x001f }
            com.tv91.q.b.f$b r0 = new com.tv91.q.b.f$b
            r0.<init>()
        L_0x0019:
            r4.mo17054i(r0)
            goto L_0x0039
        L_0x001d:
            r0 = move-exception
            goto L_0x003a
        L_0x001f:
            com.tv91.q.b.f$d r0 = new com.tv91.q.b.f$d     // Catch:{ all -> 0x001d }
            com.tv91.model.FeedbackType r1 = new com.tv91.model.FeedbackType     // Catch:{ all -> 0x001d }
            r2 = 1
            java.lang.String r3 = ""
            r1.<init>(r2, r3)     // Catch:{ all -> 0x001d }
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ all -> 0x001d }
            r0.<init>(r1)     // Catch:{ all -> 0x001d }
            r4.mo17054i(r0)     // Catch:{ all -> 0x001d }
            com.tv91.q.b.f$b r0 = new com.tv91.q.b.f$b
            r0.<init>()
            goto L_0x0019
        L_0x0039:
            return
        L_0x003a:
            com.tv91.q.b.f$b r1 = new com.tv91.q.b.f$b
            r1.<init>()
            r4.mo17054i(r1)
            goto L_0x0044
        L_0x0043:
            throw r0
        L_0x0044:
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tv91.p213u.p237f.p241f.GetFeedbackTypeUseCase.mo18269r():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo18270t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15795j.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18267o() {
        mo17058m(this.f15796k);
        mo17055j(new C2912a(this));
    }

    /* renamed from: p */
    public List<FeedbackType> mo18268p() throws Exception {
        return this.f15794i.mo18635F();
    }

    /* renamed from: u */
    public GetFeedbackTypeUseCase mo18271u(Consumer<List<FeedbackType>> aVar) {
        this.f15795j = aVar;
        return this;
    }
}
