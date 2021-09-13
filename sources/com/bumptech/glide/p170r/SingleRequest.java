package com.bumptech.glide.p170r;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.GlideBuilder.C1408c;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p152n.Engine;
import com.bumptech.glide.load.p152n.Engine.C1495d;
import com.bumptech.glide.load.p152n.GlideException;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p158p.p161f.DrawableDecoderCompat;
import com.bumptech.glide.p170r.p171j.SizeReadyCallback;
import com.bumptech.glide.p170r.p171j.Target;
import com.bumptech.glide.p170r.p172k.TransitionFactory;
import com.bumptech.glide.p174t.C1639k;
import com.bumptech.glide.p174t.LogTime;
import com.bumptech.glide.p174t.p175l.StateVerifier;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.r.h */
public final class SingleRequest<R> implements Request, SizeReadyCallback, ResourceCallback {

    /* renamed from: a */
    private static final boolean f11168a = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private int f11169A;

    /* renamed from: B */
    private int f11170B;

    /* renamed from: C */
    private boolean f11171C;

    /* renamed from: D */
    private RuntimeException f11172D;

    /* renamed from: b */
    private final String f11173b;

    /* renamed from: c */
    private final StateVerifier f11174c;

    /* renamed from: d */
    private final Object f11175d;

    /* renamed from: e */
    private final RequestListener<R> f11176e;

    /* renamed from: f */
    private final RequestCoordinator f11177f;

    /* renamed from: g */
    private final Context f11178g;

    /* renamed from: h */
    private final GlideContext f11179h;

    /* renamed from: i */
    private final Object f11180i;

    /* renamed from: j */
    private final Class<R> f11181j;

    /* renamed from: k */
    private final BaseRequestOptions<?> f11182k;

    /* renamed from: l */
    private final int f11183l;

    /* renamed from: m */
    private final int f11184m;

    /* renamed from: n */
    private final Priority f11185n;

    /* renamed from: o */
    private final Target<R> f11186o;

    /* renamed from: p */
    private final List<RequestListener<R>> f11187p;

    /* renamed from: q */
    private final TransitionFactory<? super R> f11188q;

    /* renamed from: r */
    private final Executor f11189r;

    /* renamed from: s */
    private Resource<R> f11190s;

    /* renamed from: t */
    private C1495d f11191t;

    /* renamed from: u */
    private long f11192u;

    /* renamed from: v */
    private volatile Engine f11193v;

    /* renamed from: w */
    private C1626a f11194w;

    /* renamed from: x */
    private Drawable f11195x;

    /* renamed from: y */
    private Drawable f11196y;

    /* renamed from: z */
    private Drawable f11197z;

    /* renamed from: com.bumptech.glide.r.h$a */
    /* compiled from: SingleRequest */
    private enum C1626a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private SingleRequest(Context context, GlideContext dVar, Object obj, Object obj2, Class<R> cls, BaseRequestOptions<?> aVar, int i, int i2, Priority gVar, Target<R> hVar, RequestListener<R> eVar, List<RequestListener<R>> list, RequestCoordinator dVar2, Engine kVar, TransitionFactory<? super R> cVar, Executor executor) {
        this.f11173b = f11168a ? String.valueOf(super.hashCode()) : null;
        this.f11174c = StateVerifier.m14126a();
        this.f11175d = obj;
        this.f11178g = context;
        this.f11179h = dVar;
        this.f11180i = obj2;
        this.f11181j = cls;
        this.f11182k = aVar;
        this.f11183l = i;
        this.f11184m = i2;
        this.f11185n = gVar;
        this.f11186o = hVar;
        this.f11176e = eVar;
        this.f11187p = list;
        this.f11177f = dVar2;
        this.f11193v = kVar;
        this.f11188q = cVar;
        this.f11189r = executor;
        this.f11194w = C1626a.PENDING;
        if (this.f11172D == null && dVar.mo8708g().mo8711a(C1408c.class)) {
            this.f11172D = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a7 A[Catch:{ all -> 0x00b8 }] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13935A(com.bumptech.glide.load.p152n.Resource<R> r10, R r11, com.bumptech.glide.load.DataSource r12, boolean r13) {
        /*
            r9 = this;
            boolean r13 = r9.m13945s()
            com.bumptech.glide.r.h$a r0 = com.bumptech.glide.p170r.SingleRequest.C1626a.COMPLETE
            r9.f11194w = r0
            r9.f11190s = r10
            com.bumptech.glide.d r10 = r9.f11179h
            int r10 = r10.mo8709h()
            r0 = 3
            if (r10 > r0) goto L_0x006a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Finished loading "
            r10.append(r0)
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r10.append(r0)
            java.lang.String r0 = " from "
            r10.append(r0)
            r10.append(r12)
            java.lang.String r0 = " for "
            r10.append(r0)
            java.lang.Object r0 = r9.f11180i
            r10.append(r0)
            java.lang.String r0 = " with size ["
            r10.append(r0)
            int r0 = r9.f11169A
            r10.append(r0)
            java.lang.String r0 = "x"
            r10.append(r0)
            int r0 = r9.f11170B
            r10.append(r0)
            java.lang.String r0 = "] in "
            r10.append(r0)
            long r0 = r9.f11192u
            double r0 = com.bumptech.glide.p174t.LogTime.m14064a(r0)
            r10.append(r0)
            java.lang.String r0 = " ms"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r10)
        L_0x006a:
            r10 = 1
            r9.f11171C = r10
            r6 = 0
            java.util.List<com.bumptech.glide.r.e<R>> r0 = r9.f11187p     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x0090
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x00b8 }
            r8 = 0
        L_0x0077:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00b8 }
            com.bumptech.glide.r.e r0 = (com.bumptech.glide.p170r.RequestListener) r0     // Catch:{ all -> 0x00b8 }
            java.lang.Object r2 = r9.f11180i     // Catch:{ all -> 0x00b8 }
            com.bumptech.glide.r.j.h<R> r3 = r9.f11186o     // Catch:{ all -> 0x00b8 }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.mo9515a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            r8 = r8 | r0
            goto L_0x0077
        L_0x0090:
            r8 = 0
        L_0x0091:
            com.bumptech.glide.r.e<R> r0 = r9.f11176e     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r2 = r9.f11180i     // Catch:{ all -> 0x00b8 }
            com.bumptech.glide.r.j.h<R> r3 = r9.f11186o     // Catch:{ all -> 0x00b8 }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.mo9515a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r10 = 0
        L_0x00a4:
            r10 = r10 | r8
            if (r10 != 0) goto L_0x00b2
            com.bumptech.glide.r.k.c<? super R> r10 = r9.f11188q     // Catch:{ all -> 0x00b8 }
            com.bumptech.glide.r.k.b r10 = r10.mo9540a(r12, r13)     // Catch:{ all -> 0x00b8 }
            com.bumptech.glide.r.j.h<R> r12 = r9.f11186o     // Catch:{ all -> 0x00b8 }
            r12.mo9313d(r11, r10)     // Catch:{ all -> 0x00b8 }
        L_0x00b2:
            r9.f11171C = r6
            r9.m13950x()
            return
        L_0x00b8:
            r10 = move-exception
            r9.f11171C = r6
            goto L_0x00bd
        L_0x00bc:
            throw r10
        L_0x00bd:
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p170r.SingleRequest.m13935A(com.bumptech.glide.load.n.v, java.lang.Object, com.bumptech.glide.load.a, boolean):void");
    }

    /* renamed from: B */
    private void m13936B() {
        if (m13939m()) {
            Drawable drawable = null;
            if (this.f11180i == null) {
                drawable = m13943q();
            }
            if (drawable == null) {
                drawable = m13942p();
            }
            if (drawable == null) {
                drawable = m13944r();
            }
            this.f11186o.mo9522e(drawable);
        }
    }

    /* renamed from: j */
    private void m13937j() {
        if (this.f11171C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: l */
    private boolean m13938l() {
        RequestCoordinator dVar = this.f11177f;
        return dVar == null || dVar.mo9512l(this);
    }

    /* renamed from: m */
    private boolean m13939m() {
        RequestCoordinator dVar = this.f11177f;
        return dVar == null || dVar.mo9506g(this);
    }

    /* renamed from: n */
    private boolean m13940n() {
        RequestCoordinator dVar = this.f11177f;
        return dVar == null || dVar.mo9507h(this);
    }

    /* renamed from: o */
    private void m13941o() {
        m13937j();
        this.f11174c.mo9588c();
        this.f11186o.mo9527c(this);
        C1495d dVar = this.f11191t;
        if (dVar != null) {
            dVar.mo9028a();
            this.f11191t = null;
        }
    }

    /* renamed from: p */
    private Drawable m13942p() {
        if (this.f11195x == null) {
            Drawable k = this.f11182k.mo9483k();
            this.f11195x = k;
            if (k == null && this.f11182k.mo9481j() > 0) {
                this.f11195x = m13946t(this.f11182k.mo9481j());
            }
        }
        return this.f11195x;
    }

    /* renamed from: q */
    private Drawable m13943q() {
        if (this.f11197z == null) {
            Drawable l = this.f11182k.mo9484l();
            this.f11197z = l;
            if (l == null && this.f11182k.mo9485m() > 0) {
                this.f11197z = m13946t(this.f11182k.mo9485m());
            }
        }
        return this.f11197z;
    }

    /* renamed from: r */
    private Drawable m13944r() {
        if (this.f11196y == null) {
            Drawable r = this.f11182k.mo9490r();
            this.f11196y = r;
            if (r == null && this.f11182k.mo9491s() > 0) {
                this.f11196y = m13946t(this.f11182k.mo9491s());
            }
        }
        return this.f11196y;
    }

    /* renamed from: s */
    private boolean m13945s() {
        RequestCoordinator dVar = this.f11177f;
        return dVar == null || !dVar.mo9499a().mo9500b();
    }

    /* renamed from: t */
    private Drawable m13946t(int i) {
        return DrawableDecoderCompat.m13487a(this.f11179h, i, this.f11182k.mo9496x() != null ? this.f11182k.mo9496x() : this.f11178g.getTheme());
    }

    /* renamed from: u */
    private void m13947u(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f11173b);
        Log.v("Request", sb.toString());
    }

    /* renamed from: v */
    private static int m13948v(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: w */
    private void m13949w() {
        RequestCoordinator dVar = this.f11177f;
        if (dVar != null) {
            dVar.mo9501c(this);
        }
    }

    /* renamed from: x */
    private void m13950x() {
        RequestCoordinator dVar = this.f11177f;
        if (dVar != null) {
            dVar.mo9510j(this);
        }
    }

    /* renamed from: y */
    public static <R> SingleRequest<R> m13951y(Context context, GlideContext dVar, Object obj, Object obj2, Class<R> cls, BaseRequestOptions<?> aVar, int i, int i2, Priority gVar, Target<R> hVar, RequestListener<R> eVar, List<RequestListener<R>> list, RequestCoordinator dVar2, Engine kVar, TransitionFactory<? super R> cVar, Executor executor) {
        SingleRequest hVar2 = new SingleRequest(context, dVar, obj, obj2, cls, aVar, i, i2, gVar, hVar, eVar, list, dVar2, kVar, cVar, executor);
        return hVar2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: z */
    private void m13952z(GlideException qVar, int i) {
        boolean z;
        this.f11174c.mo9588c();
        synchronized (this.f11175d) {
            qVar.mo9072k(this.f11172D);
            int h = this.f11179h.mo8709h();
            if (h <= i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Load failed for ");
                sb.append(this.f11180i);
                sb.append(" with size [");
                sb.append(this.f11169A);
                sb.append("x");
                sb.append(this.f11170B);
                sb.append("]");
                Log.w("Glide", sb.toString(), qVar);
                if (h <= 4) {
                    qVar.mo9068g("Glide");
                }
            }
            this.f11191t = null;
            this.f11194w = C1626a.FAILED;
            boolean z2 = true;
            this.f11171C = true;
            try {
                List<RequestListener<R>> list = this.f11187p;
                if (list != null) {
                    z = false;
                    for (RequestListener b : list) {
                        z |= b.mo9516b(qVar, this.f11180i, this.f11186o, m13945s());
                    }
                } else {
                    z = false;
                }
                RequestListener<R> eVar = this.f11176e;
                if (eVar == null || !eVar.mo9516b(qVar, this.f11180i, this.f11186o, m13945s())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    m13936B();
                }
                this.f11171C = false;
                m13949w();
            } catch (Throwable th) {
                this.f11171C = false;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo9517a(GlideException qVar) {
        m13952z(qVar, 5);
    }

    /* renamed from: b */
    public boolean mo9500b() {
        boolean z;
        synchronized (this.f11175d) {
            z = this.f11194w == C1626a.COMPLETE;
        }
        return z;
    }

    /* renamed from: c */
    public void mo9518c(Resource<?> vVar, DataSource aVar, boolean z) {
        this.f11174c.mo9588c();
        Resource<?> vVar2 = null;
        try {
            synchronized (this.f11175d) {
                try {
                    this.f11191t = null;
                    if (vVar == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive a Resource<R> with an object of ");
                        sb.append(this.f11181j);
                        sb.append(" inside, but instead got null.");
                        mo9517a(new GlideException(sb.toString()));
                        return;
                    }
                    Object a = vVar.mo9056a();
                    if (a != null) {
                        if (this.f11181j.isAssignableFrom(a.getClass())) {
                            if (!m13940n()) {
                                try {
                                    this.f11190s = null;
                                    this.f11194w = C1626a.COMPLETE;
                                    this.f11193v.mo9023k(vVar);
                                    return;
                                } catch (Throwable th) {
                                    vVar2 = vVar;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                m13935A(vVar, a, aVar, z);
                                return;
                            }
                        }
                    }
                    this.f11190s = null;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected to receive an object of ");
                    sb2.append(this.f11181j);
                    sb2.append(" but instead got ");
                    sb2.append(a != null ? a.getClass() : "");
                    sb2.append("{");
                    sb2.append(a);
                    sb2.append("} inside Resource{");
                    sb2.append(vVar);
                    sb2.append("}.");
                    sb2.append(a != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                    mo9517a(new GlideException(sb2.toString()));
                    this.f11193v.mo9023k(vVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (vVar2 != null) {
                this.f11193v.mo9023k(vVar2);
            }
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r1 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r5.f11193v.mo9023k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f11175d
            monitor-enter(r0)
            r5.m13937j()     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.t.l.c r1 = r5.f11174c     // Catch:{ all -> 0x0039 }
            r1.mo9588c()     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.r.h$a r1 = r5.f11194w     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.r.h$a r2 = com.bumptech.glide.p170r.SingleRequest.C1626a.CLEARED     // Catch:{ all -> 0x0039 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0013:
            r5.m13941o()     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.n.v<R> r1 = r5.f11190s     // Catch:{ all -> 0x0039 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f11190s = r3     // Catch:{ all -> 0x0039 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            boolean r3 = r5.m13938l()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x002e
            com.bumptech.glide.r.j.h<R> r3 = r5.f11186o     // Catch:{ all -> 0x0039 }
            android.graphics.drawable.Drawable r4 = r5.m13944r()     // Catch:{ all -> 0x0039 }
            r3.mo9314h(r4)     // Catch:{ all -> 0x0039 }
        L_0x002e:
            r5.f11194w = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0038
            com.bumptech.glide.load.n.k r0 = r5.f11193v
            r0.mo9023k(r1)
        L_0x0038:
            return
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p170r.SingleRequest.clear():void");
    }

    /* renamed from: d */
    public void mo9503d() {
        synchronized (this.f11175d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* renamed from: e */
    public boolean mo9504e(Request cVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        BaseRequestOptions<?> aVar;
        Priority gVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        BaseRequestOptions<?> aVar2;
        Priority gVar2;
        int size2;
        Request cVar2 = cVar;
        if (!(cVar2 instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f11175d) {
            i = this.f11183l;
            i2 = this.f11184m;
            obj = this.f11180i;
            cls = this.f11181j;
            aVar = this.f11182k;
            gVar = this.f11185n;
            List<RequestListener<R>> list = this.f11187p;
            size = list != null ? list.size() : 0;
        }
        SingleRequest hVar = (SingleRequest) cVar2;
        synchronized (hVar.f11175d) {
            i3 = hVar.f11183l;
            i4 = hVar.f11184m;
            obj2 = hVar.f11180i;
            cls2 = hVar.f11181j;
            aVar2 = hVar.f11182k;
            gVar2 = hVar.f11185n;
            List<RequestListener<R>> list2 = hVar.f11187p;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && C1639k.m14084b(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2;
    }

    /* renamed from: f */
    public boolean mo9505f() {
        boolean z;
        synchronized (this.f11175d) {
            z = this.f11194w == C1626a.CLEARED;
        }
        return z;
    }

    /* renamed from: g */
    public Object mo9519g() {
        this.f11174c.mo9588c();
        return this.f11175d;
    }

    /* renamed from: h */
    public void mo9520h(int i, int i2) {
        Object obj;
        this.f11174c.mo9588c();
        Object obj2 = this.f11175d;
        synchronized (obj2) {
            try {
                boolean z = f11168a;
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got onSizeReady in ");
                    sb.append(LogTime.m14064a(this.f11192u));
                    m13947u(sb.toString());
                }
                if (this.f11194w == C1626a.WAITING_FOR_SIZE) {
                    C1626a aVar = C1626a.RUNNING;
                    this.f11194w = aVar;
                    float w = this.f11182k.mo9495w();
                    this.f11169A = m13948v(i, w);
                    this.f11170B = m13948v(i2, w);
                    if (z) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("finished setup for calling load in ");
                        sb2.append(LogTime.m14064a(this.f11192u));
                        m13947u(sb2.toString());
                    }
                    C1626a aVar2 = aVar;
                    boolean z2 = z;
                    C1626a aVar3 = aVar2;
                    obj = obj2;
                    try {
                        this.f11191t = this.f11193v.mo9022f(this.f11179h, this.f11180i, this.f11182k.mo9494v(), this.f11169A, this.f11170B, this.f11182k.mo9493u(), this.f11181j, this.f11185n, this.f11182k.mo9479i(), this.f11182k.mo9497y(), this.f11182k.mo9452I(), this.f11182k.mo9450E(), this.f11182k.mo9487o(), this.f11182k.mo9448C(), this.f11182k.mo9446A(), this.f11182k.mo9498z(), this.f11182k.mo9486n(), this, this.f11189r);
                        if (this.f11194w != aVar3) {
                            this.f11191t = null;
                        }
                        if (z2) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("finished onSizeReady in ");
                            sb3.append(LogTime.m14064a(this.f11192u));
                            m13947u(sb3.toString());
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9508i() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f11175d
            monitor-enter(r0)
            r5.m13937j()     // Catch:{ all -> 0x00a8 }
            com.bumptech.glide.t.l.c r1 = r5.f11174c     // Catch:{ all -> 0x00a8 }
            r1.mo9588c()     // Catch:{ all -> 0x00a8 }
            long r1 = com.bumptech.glide.p174t.LogTime.m14065b()     // Catch:{ all -> 0x00a8 }
            r5.f11192u = r1     // Catch:{ all -> 0x00a8 }
            java.lang.Object r1 = r5.f11180i     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x003c
            int r1 = r5.f11183l     // Catch:{ all -> 0x00a8 }
            int r2 = r5.f11184m     // Catch:{ all -> 0x00a8 }
            boolean r1 = com.bumptech.glide.p174t.C1639k.m14102t(r1, r2)     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x0027
            int r1 = r5.f11183l     // Catch:{ all -> 0x00a8 }
            r5.f11169A = r1     // Catch:{ all -> 0x00a8 }
            int r1 = r5.f11184m     // Catch:{ all -> 0x00a8 }
            r5.f11170B = r1     // Catch:{ all -> 0x00a8 }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r5.m13943q()     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            com.bumptech.glide.load.n.q r2 = new com.bumptech.glide.load.n.q     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00a8 }
            r5.m13952z(r2, r1)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x003c:
            com.bumptech.glide.r.h$a r1 = r5.f11194w     // Catch:{ all -> 0x00a8 }
            com.bumptech.glide.r.h$a r2 = com.bumptech.glide.p170r.SingleRequest.C1626a.RUNNING     // Catch:{ all -> 0x00a8 }
            if (r1 == r2) goto L_0x00a0
            com.bumptech.glide.r.h$a r3 = com.bumptech.glide.p170r.SingleRequest.C1626a.COMPLETE     // Catch:{ all -> 0x00a8 }
            if (r1 != r3) goto L_0x0050
            com.bumptech.glide.load.n.v<R> r1 = r5.f11190s     // Catch:{ all -> 0x00a8 }
            com.bumptech.glide.load.a r2 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch:{ all -> 0x00a8 }
            r3 = 0
            r5.mo9518c(r1, r2, r3)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x0050:
            com.bumptech.glide.r.h$a r1 = com.bumptech.glide.p170r.SingleRequest.C1626a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00a8 }
            r5.f11194w = r1     // Catch:{ all -> 0x00a8 }
            int r3 = r5.f11183l     // Catch:{ all -> 0x00a8 }
            int r4 = r5.f11184m     // Catch:{ all -> 0x00a8 }
            boolean r3 = com.bumptech.glide.p174t.C1639k.m14102t(r3, r4)     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x0066
            int r3 = r5.f11183l     // Catch:{ all -> 0x00a8 }
            int r4 = r5.f11184m     // Catch:{ all -> 0x00a8 }
            r5.mo9520h(r3, r4)     // Catch:{ all -> 0x00a8 }
            goto L_0x006b
        L_0x0066:
            com.bumptech.glide.r.j.h<R> r3 = r5.f11186o     // Catch:{ all -> 0x00a8 }
            r3.mo9528i(r5)     // Catch:{ all -> 0x00a8 }
        L_0x006b:
            com.bumptech.glide.r.h$a r3 = r5.f11194w     // Catch:{ all -> 0x00a8 }
            if (r3 == r2) goto L_0x0071
            if (r3 != r1) goto L_0x0080
        L_0x0071:
            boolean r1 = r5.m13939m()     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x0080
            com.bumptech.glide.r.j.h<R> r1 = r5.f11186o     // Catch:{ all -> 0x00a8 }
            android.graphics.drawable.Drawable r2 = r5.m13944r()     // Catch:{ all -> 0x00a8 }
            r1.mo9523g(r2)     // Catch:{ all -> 0x00a8 }
        L_0x0080:
            boolean r1 = f11168a     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x009e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r1.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00a8 }
            long r2 = r5.f11192u     // Catch:{ all -> 0x00a8 }
            double r2 = com.bumptech.glide.p174t.LogTime.m14064a(r2)     // Catch:{ all -> 0x00a8 }
            r1.append(r2)     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a8 }
            r5.m13947u(r1)     // Catch:{ all -> 0x00a8 }
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x00a0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00a8 }
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p170r.SingleRequest.mo9508i():void");
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f11175d) {
            C1626a aVar = this.f11194w;
            if (aVar != C1626a.RUNNING) {
                if (aVar != C1626a.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: k */
    public boolean mo9511k() {
        boolean z;
        synchronized (this.f11175d) {
            z = this.f11194w == C1626a.COMPLETE;
        }
        return z;
    }
}
