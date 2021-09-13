package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p152n.DiskCacheStrategy;
import com.bumptech.glide.load.p158p.p163h.GifDrawable;
import com.bumptech.glide.p167o.C1617l;
import com.bumptech.glide.p167o.ConnectivityMonitor;
import com.bumptech.glide.p167o.ConnectivityMonitor.C1615a;
import com.bumptech.glide.p167o.ConnectivityMonitorFactory;
import com.bumptech.glide.p167o.LifecycleListener;
import com.bumptech.glide.p167o.RequestManagerTreeNode;
import com.bumptech.glide.p167o.RequestTracker;
import com.bumptech.glide.p167o.TargetTracker;
import com.bumptech.glide.p170r.Request;
import com.bumptech.glide.p170r.RequestListener;
import com.bumptech.glide.p170r.RequestOptions;
import com.bumptech.glide.p170r.p171j.Target;
import com.bumptech.glide.p174t.C1639k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bumptech.glide.k */
public class RequestManager implements ComponentCallbacks2, LifecycleListener {

    /* renamed from: a */
    private static final RequestOptions f10258a = ((RequestOptions) RequestOptions.m13929k0(Bitmap.class).mo9455L());

    /* renamed from: b */
    private static final RequestOptions f10259b = ((RequestOptions) RequestOptions.m13929k0(GifDrawable.class).mo9455L());

    /* renamed from: c */
    private static final RequestOptions f10260c = ((RequestOptions) ((RequestOptions) RequestOptions.m13930l0(DiskCacheStrategy.f10557c).mo9462X(Priority.LOW)).mo9470e0(true));

    /* renamed from: d */
    protected final Glide f10261d;

    /* renamed from: e */
    protected final Context f10262e;

    /* renamed from: f */
    final C1617l f10263f;

    /* renamed from: g */
    private final RequestTracker f10264g;

    /* renamed from: h */
    private final RequestManagerTreeNode f10265h;

    /* renamed from: i */
    private final TargetTracker f10266i;

    /* renamed from: j */
    private final Runnable f10267j;

    /* renamed from: k */
    private final ConnectivityMonitor f10268k;

    /* renamed from: l */
    private final CopyOnWriteArrayList<RequestListener<Object>> f10269l;

    /* renamed from: m */
    private RequestOptions f10270m;

    /* renamed from: n */
    private boolean f10271n;

    /* renamed from: com.bumptech.glide.k$a */
    /* compiled from: RequestManager */
    class C1418a implements Runnable {
        C1418a() {
        }

        public void run() {
            RequestManager kVar = RequestManager.this;
            kVar.f10263f.mo9367a(kVar);
        }
    }

    /* renamed from: com.bumptech.glide.k$b */
    /* compiled from: RequestManager */
    private class C1419b implements C1615a {

        /* renamed from: a */
        private final RequestTracker f10273a;

        C1419b(RequestTracker rVar) {
            this.f10273a = rVar;
        }

        /* renamed from: a */
        public void mo8764a(boolean z) {
            if (z) {
                synchronized (RequestManager.this) {
                    this.f10273a.mo9407e();
                }
            }
        }
    }

    public RequestManager(Glide bVar, C1617l lVar, RequestManagerTreeNode qVar, Context context) {
        this(bVar, lVar, qVar, new RequestTracker(), bVar.mo8687g(), context);
    }

    /* renamed from: A */
    private void m12457A(Target<?> hVar) {
        boolean z = mo8762z(hVar);
        Request a = hVar.mo9526a();
        if (!z && !this.f10261d.mo8696p(hVar) && a != null) {
            hVar.mo9529j(null);
            a.clear();
        }
    }

    /* renamed from: b */
    public synchronized void mo8741b() {
        mo8759w();
        this.f10266i.mo8741b();
    }

    /* renamed from: f */
    public synchronized void mo8742f() {
        mo8758v();
        this.f10266i.mo8742f();
    }

    /* renamed from: k */
    public synchronized void mo8743k() {
        this.f10266i.mo8743k();
        for (Target o : this.f10266i.mo9419m()) {
            mo8747o(o);
        }
        this.f10266i.mo9418l();
        this.f10264g.mo9404b();
        this.f10263f.mo9368b(this);
        this.f10263f.mo9368b(this.f10268k);
        C1639k.m14104v(this.f10267j);
        this.f10261d.mo8698s(this);
    }

    /* renamed from: l */
    public <ResourceType> RequestBuilder<ResourceType> mo8744l(Class<ResourceType> cls) {
        return new RequestBuilder<>(this.f10261d, this, cls, this.f10262e);
    }

    /* renamed from: m */
    public RequestBuilder<Bitmap> mo8745m() {
        return mo8744l(Bitmap.class).mo8730a(f10258a);
    }

    /* renamed from: n */
    public RequestBuilder<Drawable> mo8746n() {
        return mo8744l(Drawable.class);
    }

    /* renamed from: o */
    public void mo8747o(Target<?> hVar) {
        if (hVar != null) {
            m12457A(hVar);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.f10271n) {
            mo8757u();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public List<RequestListener<Object>> mo8751p() {
        return this.f10269l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public synchronized RequestOptions mo8752q() {
        return this.f10270m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public <T> TransitionOptions<?, T> mo8753r(Class<T> cls) {
        return this.f10261d.mo8689i().mo8706e(cls);
    }

    /* renamed from: s */
    public RequestBuilder<Drawable> mo8754s(String str) {
        return mo8746n().mo8740y0(str);
    }

    /* renamed from: t */
    public synchronized void mo8755t() {
        this.f10264g.mo9405c();
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{tracker=");
        sb.append(this.f10264g);
        sb.append(", treeNode=");
        sb.append(this.f10265h);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public synchronized void mo8757u() {
        mo8755t();
        for (RequestManager t : this.f10265h.mo9376a()) {
            t.mo8755t();
        }
    }

    /* renamed from: v */
    public synchronized void mo8758v() {
        this.f10264g.mo9406d();
    }

    /* renamed from: w */
    public synchronized void mo8759w() {
        this.f10264g.mo9408f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public synchronized void mo8760x(RequestOptions fVar) {
        this.f10270m = (RequestOptions) ((RequestOptions) fVar.clone()).mo9464b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public synchronized void mo8761y(Target<?> hVar, Request cVar) {
        this.f10266i.mo9420n(hVar);
        this.f10264g.mo9409g(cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public synchronized boolean mo8762z(Target<?> hVar) {
        Request a = hVar.mo9526a();
        if (a == null) {
            return true;
        }
        if (!this.f10264g.mo9403a(a)) {
            return false;
        }
        this.f10266i.mo9421o(hVar);
        hVar.mo9529j(null);
        return true;
    }

    RequestManager(Glide bVar, C1617l lVar, RequestManagerTreeNode qVar, RequestTracker rVar, ConnectivityMonitorFactory dVar, Context context) {
        this.f10266i = new TargetTracker();
        C1418a aVar = new C1418a();
        this.f10267j = aVar;
        this.f10261d = bVar;
        this.f10263f = lVar;
        this.f10265h = qVar;
        this.f10264g = rVar;
        this.f10262e = context;
        ConnectivityMonitor a = dVar.mo9372a(context.getApplicationContext(), new C1419b(rVar));
        this.f10268k = a;
        if (C1639k.m14099q()) {
            C1639k.m14103u(aVar);
        } else {
            lVar.mo9367a(this);
        }
        lVar.mo9367a(a);
        this.f10269l = new CopyOnWriteArrayList<>(bVar.mo8689i().mo8704c());
        mo8760x(bVar.mo8689i().mo8705d());
        bVar.mo8692o(this);
    }
}
