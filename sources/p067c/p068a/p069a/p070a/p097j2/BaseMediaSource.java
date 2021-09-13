package p067c.p068a.p069a.p070a.p097j2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener.C0898a;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1082b;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceEventListener.C1084a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.j2.k */
public abstract class BaseMediaSource implements C1080d0 {

    /* renamed from: a */
    private final ArrayList<C1082b> f7522a = new ArrayList<>(1);

    /* renamed from: b */
    private final HashSet<C1082b> f7523b = new HashSet<>(1);

    /* renamed from: c */
    private final C1084a f7524c = new C1084a();

    /* renamed from: d */
    private final C0898a f7525d = new C0898a();

    /* renamed from: e */
    private Looper f7526e;

    /* renamed from: f */
    private Timeline f7527f;

    /* renamed from: b */
    public final void mo6828b(Handler handler, DrmSessionEventListener wVar) {
        Assertions.m10153e(handler);
        Assertions.m10153e(wVar);
        this.f7525d.mo6119a(handler, wVar);
    }

    /* renamed from: e */
    public /* synthetic */ boolean mo6831e() {
        return MediaSource.m8901b(this);
    }

    /* renamed from: g */
    public /* synthetic */ Timeline mo6833g() {
        return MediaSource.m8900a(this);
    }

    /* renamed from: h */
    public final void mo6834h(C1082b bVar, TransferListener e0Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f7526e;
        Assertions.m10149a(looper == null || looper == myLooper);
        Timeline x1Var = this.f7527f;
        this.f7522a.add(bVar);
        if (this.f7526e == null) {
            this.f7526e = myLooper;
            this.f7523b.add(bVar);
            mo6904w(e0Var);
        } else if (x1Var != null) {
            mo6835i(bVar);
            bVar.mo5606a(this, x1Var);
        }
    }

    /* renamed from: i */
    public final void mo6835i(C1082b bVar) {
        Assertions.m10153e(this.f7526e);
        boolean isEmpty = this.f7523b.isEmpty();
        this.f7523b.add(bVar);
        if (isEmpty) {
            mo6924u();
        }
    }

    /* renamed from: j */
    public final void mo6836j(C1082b bVar) {
        this.f7522a.remove(bVar);
        if (this.f7522a.isEmpty()) {
            this.f7526e = null;
            this.f7527f = null;
            this.f7523b.clear();
            mo6905y();
            return;
        }
        mo6839n(bVar);
    }

    /* renamed from: l */
    public final void mo6837l(Handler handler, MediaSourceEventListener e0Var) {
        Assertions.m10153e(handler);
        Assertions.m10153e(e0Var);
        this.f7524c.mo6848a(handler, e0Var);
    }

    /* renamed from: m */
    public final void mo6838m(MediaSourceEventListener e0Var) {
        this.f7524c.mo6844C(e0Var);
    }

    /* renamed from: n */
    public final void mo6839n(C1082b bVar) {
        boolean z = !this.f7523b.isEmpty();
        this.f7523b.remove(bVar);
        if (z && this.f7523b.isEmpty()) {
            mo6923t();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final C0898a mo6919p(int i, C1081a aVar) {
        return this.f7525d.mo6132t(i, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C0898a mo6920q(C1081a aVar) {
        return this.f7525d.mo6132t(0, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C1084a mo6921r(int i, C1081a aVar, long j) {
        return this.f7524c.mo6847F(i, aVar, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final C1084a mo6922s(C1081a aVar) {
        return this.f7524c.mo6847F(0, aVar, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo6923t() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo6924u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo6925v() {
        return !this.f7523b.isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo6904w(TransferListener e0Var);

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo6926x(Timeline x1Var) {
        this.f7527f = x1Var;
        Iterator it = this.f7522a.iterator();
        while (it.hasNext()) {
            ((C1082b) it.next()).mo5606a(this, x1Var);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo6905y();
}
