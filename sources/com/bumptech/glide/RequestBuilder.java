package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.load.p152n.DiskCacheStrategy;
import com.bumptech.glide.p170r.BaseRequestOptions;
import com.bumptech.glide.p170r.Request;
import com.bumptech.glide.p170r.RequestCoordinator;
import com.bumptech.glide.p170r.RequestListener;
import com.bumptech.glide.p170r.RequestOptions;
import com.bumptech.glide.p170r.SingleRequest;
import com.bumptech.glide.p170r.ThumbnailRequestCoordinator;
import com.bumptech.glide.p170r.p171j.Target;
import com.bumptech.glide.p170r.p171j.ViewTarget;
import com.bumptech.glide.p174t.C1638j;
import com.bumptech.glide.p174t.C1639k;
import com.bumptech.glide.p174t.Executors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.j */
public class RequestBuilder<TranscodeType> extends BaseRequestOptions<RequestBuilder<TranscodeType>> implements Cloneable {

    /* renamed from: A */
    protected static final RequestOptions f10241A = ((RequestOptions) ((RequestOptions) ((RequestOptions) new RequestOptions().mo9472f(DiskCacheStrategy.f10557c)).mo9462X(Priority.LOW)).mo9470e0(true));

    /* renamed from: B */
    private final Context f10242B;

    /* renamed from: C */
    private final RequestManager f10243C;

    /* renamed from: D */
    private final Class<TranscodeType> f10244D;

    /* renamed from: G */
    private final Glide f10245G;

    /* renamed from: H */
    private final GlideContext f10246H;

    /* renamed from: I */
    private TransitionOptions<?, ? super TranscodeType> f10247I;

    /* renamed from: J */
    private Object f10248J;

    /* renamed from: K */
    private List<RequestListener<TranscodeType>> f10249K;

    /* renamed from: L */
    private RequestBuilder<TranscodeType> f10250L;

    /* renamed from: M */
    private RequestBuilder<TranscodeType> f10251M;

    /* renamed from: N */
    private Float f10252N;

    /* renamed from: O */
    private boolean f10253O = true;

    /* renamed from: P */
    private boolean f10254P;

    /* renamed from: Q */
    private boolean f10255Q;

    /* renamed from: com.bumptech.glide.j$a */
    /* compiled from: RequestBuilder */
    static /* synthetic */ class C1417a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10256a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10257b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.g[] r0 = com.bumptech.glide.Priority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10257b = r0
                r1 = 1
                com.bumptech.glide.g r2 = com.bumptech.glide.Priority.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10257b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.g r3 = com.bumptech.glide.Priority.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f10257b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.g r4 = com.bumptech.glide.Priority.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f10257b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.g r5 = com.bumptech.glide.Priority.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f10256a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f10256a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f10256a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f10256a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f10256a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f10256a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f10256a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f10256a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.RequestBuilder.C1417a.<clinit>():void");
        }
    }

    @SuppressLint({"CheckResult"})
    protected RequestBuilder(Glide bVar, RequestManager kVar, Class<TranscodeType> cls, Context context) {
        this.f10245G = bVar;
        this.f10243C = kVar;
        this.f10244D = cls;
        this.f10242B = context;
        this.f10247I = kVar.mo8753r(cls);
        this.f10246H = bVar.mo8689i();
        m12443r0(kVar.mo8751p());
        mo8730a(kVar.mo8752q());
    }

    /* renamed from: A0 */
    private Request m12438A0(Object obj, Target<TranscodeType> hVar, RequestListener<TranscodeType> eVar, BaseRequestOptions<?> aVar, RequestCoordinator dVar, TransitionOptions<?, ? super TranscodeType> lVar, Priority gVar, int i, int i2, Executor executor) {
        Context context = this.f10242B;
        GlideContext dVar2 = this.f10246H;
        return SingleRequest.m13951y(context, dVar2, obj, this.f10248J, this.f10244D, aVar, i, i2, gVar, hVar, eVar, this.f10249K, dVar, dVar2.mo8707f(), lVar.mo8766b(), executor);
    }

    /* renamed from: m0 */
    private Request m12439m0(Target<TranscodeType> hVar, RequestListener<TranscodeType> eVar, BaseRequestOptions<?> aVar, Executor executor) {
        return m12440n0(new Object(), hVar, eVar, null, this.f10247I, aVar.mo9492t(), aVar.mo9489q(), aVar.mo9488p(), aVar, executor);
    }

    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.bumptech.glide.r.d] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.bumptech.glide.r.b] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.p170r.Request m12440n0(java.lang.Object r24, com.bumptech.glide.p170r.p171j.Target<TranscodeType> r25, com.bumptech.glide.p170r.RequestListener<TranscodeType> r26, com.bumptech.glide.p170r.RequestCoordinator r27, com.bumptech.glide.TransitionOptions<?, ? super TranscodeType> r28, com.bumptech.glide.Priority r29, int r30, int r31, com.bumptech.glide.p170r.BaseRequestOptions<?> r32, java.util.concurrent.Executor r33) {
        /*
            r23 = this;
            r11 = r23
            com.bumptech.glide.j<TranscodeType> r0 = r11.f10251M
            if (r0 == 0) goto L_0x0012
            com.bumptech.glide.r.b r0 = new com.bumptech.glide.r.b
            r13 = r24
            r1 = r27
            r0.<init>(r13, r1)
            r4 = r0
            r15 = r4
            goto L_0x0019
        L_0x0012:
            r13 = r24
            r1 = r27
            r0 = 0
            r15 = r0
            r4 = r1
        L_0x0019:
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            com.bumptech.glide.r.c r0 = r0.m12441o0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r15 != 0) goto L_0x0034
            return r0
        L_0x0034:
            com.bumptech.glide.j<TranscodeType> r1 = r11.f10251M
            int r1 = r1.mo9489q()
            com.bumptech.glide.j<TranscodeType> r2 = r11.f10251M
            int r2 = r2.mo9488p()
            boolean r3 = com.bumptech.glide.p174t.C1639k.m14102t(r30, r31)
            if (r3 == 0) goto L_0x0056
            com.bumptech.glide.j<TranscodeType> r3 = r11.f10251M
            boolean r3 = r3.mo9454K()
            if (r3 != 0) goto L_0x0056
            int r1 = r32.mo9489q()
            int r2 = r32.mo9488p()
        L_0x0056:
            r19 = r1
            r20 = r2
            com.bumptech.glide.j<TranscodeType> r12 = r11.f10251M
            com.bumptech.glide.l<?, ? super TranscodeType> r1 = r12.f10247I
            com.bumptech.glide.g r18 = r12.mo9492t()
            com.bumptech.glide.j<TranscodeType> r2 = r11.f10251M
            r13 = r24
            r14 = r25
            r3 = r15
            r15 = r26
            r16 = r3
            r17 = r1
            r21 = r2
            r22 = r33
            com.bumptech.glide.r.c r1 = r12.m12440n0(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.mo9513q(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.RequestBuilder.m12440n0(java.lang.Object, com.bumptech.glide.r.j.h, com.bumptech.glide.r.e, com.bumptech.glide.r.d, com.bumptech.glide.l, com.bumptech.glide.g, int, int, com.bumptech.glide.r.a, java.util.concurrent.Executor):com.bumptech.glide.r.c");
    }

    /* renamed from: o0 */
    private Request m12441o0(Object obj, Target<TranscodeType> hVar, RequestListener<TranscodeType> eVar, RequestCoordinator dVar, TransitionOptions<?, ? super TranscodeType> lVar, Priority gVar, int i, int i2, BaseRequestOptions<?> aVar, Executor executor) {
        Priority gVar2;
        Object obj2 = obj;
        RequestCoordinator dVar2 = dVar;
        Priority gVar3 = gVar;
        RequestBuilder<TranscodeType> jVar = this.f10250L;
        if (jVar != null) {
            if (!this.f10255Q) {
                TransitionOptions<?, ? super TranscodeType> lVar2 = jVar.f10253O ? lVar : jVar.f10247I;
                if (jVar.mo9449D()) {
                    gVar2 = this.f10250L.mo9492t();
                } else {
                    gVar2 = m12442q0(gVar3);
                }
                Priority gVar4 = gVar2;
                int q = this.f10250L.mo9489q();
                int p = this.f10250L.mo9488p();
                if (C1639k.m14102t(i, i2) && !this.f10250L.mo9454K()) {
                    q = aVar.mo9489q();
                    p = aVar.mo9488p();
                }
                int i3 = q;
                int i4 = p;
                ThumbnailRequestCoordinator iVar = new ThumbnailRequestCoordinator(obj2, dVar2);
                Object obj3 = obj;
                Target<TranscodeType> hVar2 = hVar;
                RequestListener<TranscodeType> eVar2 = eVar;
                ThumbnailRequestCoordinator iVar2 = iVar;
                Request A0 = m12438A0(obj3, hVar2, eVar2, aVar, iVar, lVar, gVar, i, i2, executor);
                this.f10255Q = true;
                RequestBuilder<TranscodeType> jVar2 = this.f10250L;
                Request cVar = A0;
                Request n0 = jVar2.m12440n0(obj3, hVar2, eVar2, iVar2, lVar2, gVar4, i3, i4, jVar2, executor);
                this.f10255Q = false;
                iVar2.mo9521p(cVar, n0);
                return iVar2;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f10252N == null) {
            return m12438A0(obj, hVar, eVar, aVar, dVar, lVar, gVar, i, i2, executor);
        } else {
            ThumbnailRequestCoordinator iVar3 = new ThumbnailRequestCoordinator(obj2, dVar2);
            Target<TranscodeType> hVar3 = hVar;
            RequestListener<TranscodeType> eVar3 = eVar;
            ThumbnailRequestCoordinator iVar4 = iVar3;
            TransitionOptions<?, ? super TranscodeType> lVar3 = lVar;
            int i5 = i;
            int i6 = i2;
            Executor executor2 = executor;
            iVar3.mo9521p(m12438A0(obj, hVar3, eVar3, aVar, iVar4, lVar3, gVar, i5, i6, executor2), m12438A0(obj, hVar3, eVar3, aVar.clone().mo9468d0(this.f10252N.floatValue()), iVar4, lVar3, m12442q0(gVar3), i5, i6, executor2));
            return iVar3;
        }
    }

    /* renamed from: q0 */
    private Priority m12442q0(Priority gVar) {
        int i = C1417a.f10257b[gVar.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown priority: ");
        sb.append(mo9492t());
        throw new IllegalArgumentException(sb.toString());
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: r0 */
    private void m12443r0(List<RequestListener<Object>> list) {
        for (RequestListener k0 : list) {
            mo8733k0(k0);
        }
    }

    /* renamed from: t0 */
    private <Y extends Target<TranscodeType>> Y m12444t0(Y y, RequestListener<TranscodeType> eVar, BaseRequestOptions<?> aVar, Executor executor) {
        C1638j.m14081d(y);
        if (this.f10254P) {
            Request m0 = m12439m0(y, eVar, aVar, executor);
            Request a = y.mo9526a();
            if (!m0.mo9504e(a) || m12445w0(aVar, a)) {
                this.f10243C.mo8747o(y);
                y.mo9529j(m0);
                this.f10243C.mo8761y(y, m0);
                return y;
            }
            if (!((Request) C1638j.m14081d(a)).isRunning()) {
                a.mo9508i();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: w0 */
    private boolean m12445w0(BaseRequestOptions<?> aVar, Request cVar) {
        return !aVar.mo9448C() && cVar.mo9511k();
    }

    /* renamed from: z0 */
    private RequestBuilder<TranscodeType> m12446z0(Object obj) {
        if (mo9447B()) {
            return mo8732d().m12446z0(obj);
        }
        this.f10248J = obj;
        this.f10254P = true;
        return (RequestBuilder) mo9463a0();
    }

    /* renamed from: k0 */
    public RequestBuilder<TranscodeType> mo8733k0(RequestListener<TranscodeType> eVar) {
        if (mo9447B()) {
            return mo8732d().mo8733k0(eVar);
        }
        if (eVar != null) {
            if (this.f10249K == null) {
                this.f10249K = new ArrayList();
            }
            this.f10249K.add(eVar);
        }
        return (RequestBuilder) mo9463a0();
    }

    /* renamed from: l0 */
    public RequestBuilder<TranscodeType> mo8730a(BaseRequestOptions<?> aVar) {
        C1638j.m14081d(aVar);
        return (RequestBuilder) super.mo8730a(aVar);
    }

    /* renamed from: p0 */
    public RequestBuilder<TranscodeType> mo8732d() {
        RequestBuilder<TranscodeType> jVar = (RequestBuilder) super.clone();
        jVar.f10247I = jVar.f10247I.clone();
        if (jVar.f10249K != null) {
            jVar.f10249K = new ArrayList(jVar.f10249K);
        }
        RequestBuilder<TranscodeType> jVar2 = jVar.f10250L;
        if (jVar2 != null) {
            jVar.f10250L = jVar2.mo8732d();
        }
        RequestBuilder<TranscodeType> jVar3 = jVar.f10251M;
        if (jVar3 != null) {
            jVar.f10251M = jVar3.mo8732d();
        }
        return jVar;
    }

    /* renamed from: s0 */
    public <Y extends Target<TranscodeType>> Y mo8736s0(Y y) {
        return mo8737u0(y, null, Executors.m14063b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u0 */
    public <Y extends Target<TranscodeType>> Y mo8737u0(Y y, RequestListener<TranscodeType> eVar, Executor executor) {
        return m12444t0(y, eVar, this, executor);
    }

    /* renamed from: v0 */
    public ViewTarget<ImageView, TranscodeType> mo8738v0(ImageView imageView) {
        BaseRequestOptions aVar;
        C1639k.m14083a();
        C1638j.m14081d(imageView);
        if (!mo9453J() && mo9451H() && imageView.getScaleType() != null) {
            switch (C1417a.f10256a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().mo9456M();
                    break;
                case 2:
                    aVar = clone().mo9457N();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().mo9458O();
                    break;
                case 6:
                    aVar = clone().mo9457N();
                    break;
            }
        }
        aVar = this;
        return (ViewTarget) m12444t0(this.f10246H.mo8702a(imageView, this.f10244D), null, aVar, Executors.m14063b());
    }

    /* renamed from: x0 */
    public RequestBuilder<TranscodeType> mo8739x0(Object obj) {
        return m12446z0(obj);
    }

    /* renamed from: y0 */
    public RequestBuilder<TranscodeType> mo8740y0(String str) {
        return m12446z0(str);
    }
}
