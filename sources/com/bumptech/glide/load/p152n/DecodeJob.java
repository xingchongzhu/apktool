package com.bumptech.glide.load.p152n;

import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.p152n.DataFetcherGenerator.C1475a;
import com.bumptech.glide.load.p152n.p154b0.DiskCache;
import com.bumptech.glide.load.p158p.p159d.Downsampler;
import com.bumptech.glide.p174t.LogTime;
import com.bumptech.glide.p174t.p175l.FactoryPools.C1646f;
import com.bumptech.glide.p174t.p175l.GlideTrace;
import com.bumptech.glide.p174t.p175l.StateVerifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p010b.p034g.p042j.C0610e;

/* renamed from: com.bumptech.glide.load.n.h */
class DecodeJob<R> implements C1475a, Runnable, Comparable<DecodeJob<?>>, C1646f {

    /* renamed from: A */
    private DataSource f10496A;

    /* renamed from: B */
    private DataFetcher<?> f10497B;

    /* renamed from: C */
    private volatile DataFetcherGenerator f10498C;

    /* renamed from: D */
    private volatile boolean f10499D;

    /* renamed from: G */
    private volatile boolean f10500G;

    /* renamed from: H */
    private boolean f10501H;

    /* renamed from: a */
    private final DecodeHelper<R> f10502a = new DecodeHelper<>();

    /* renamed from: b */
    private final List<Throwable> f10503b = new ArrayList();

    /* renamed from: c */
    private final StateVerifier f10504c = StateVerifier.m14126a();

    /* renamed from: d */
    private final C1480e f10505d;

    /* renamed from: e */
    private final C0610e<DecodeJob<?>> f10506e;

    /* renamed from: f */
    private final C1479d<?> f10507f = new C1479d<>();

    /* renamed from: g */
    private final C1481f f10508g = new C1481f();

    /* renamed from: h */
    private GlideContext f10509h;

    /* renamed from: i */
    private Key f10510i;

    /* renamed from: j */
    private Priority f10511j;

    /* renamed from: k */
    private EngineKey f10512k;

    /* renamed from: l */
    private int f10513l;

    /* renamed from: m */
    private int f10514m;

    /* renamed from: n */
    private DiskCacheStrategy f10515n;

    /* renamed from: o */
    private Options f10516o;

    /* renamed from: p */
    private C1477b<R> f10517p;

    /* renamed from: q */
    private int f10518q;

    /* renamed from: r */
    private C1483h f10519r;

    /* renamed from: s */
    private C1482g f10520s;

    /* renamed from: t */
    private long f10521t;

    /* renamed from: u */
    private boolean f10522u;

    /* renamed from: v */
    private Object f10523v;

    /* renamed from: w */
    private Thread f10524w;

    /* renamed from: x */
    private Key f10525x;

    /* renamed from: y */
    private Key f10526y;

    /* renamed from: z */
    private Object f10527z;

    /* renamed from: com.bumptech.glide.load.n.h$a */
    /* compiled from: DecodeJob */
    static /* synthetic */ class C1476a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10528a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10529b;

        /* renamed from: c */
        static final /* synthetic */ int[] f10530c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.bumptech.glide.load.c[] r0 = com.bumptech.glide.load.EncodeStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10530c = r0
                r1 = 1
                com.bumptech.glide.load.c r2 = com.bumptech.glide.load.EncodeStrategy.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10530c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.c r3 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.n.h$h[] r2 = com.bumptech.glide.load.p152n.DecodeJob.C1483h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f10529b = r2
                com.bumptech.glide.load.n.h$h r3 = com.bumptech.glide.load.p152n.DecodeJob.C1483h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f10529b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.n.h$h r3 = com.bumptech.glide.load.p152n.DecodeJob.C1483h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f10529b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.n.h$h r4 = com.bumptech.glide.load.p152n.DecodeJob.C1483h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f10529b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.n.h$h r4 = com.bumptech.glide.load.p152n.DecodeJob.C1483h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f10529b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.n.h$h r4 = com.bumptech.glide.load.p152n.DecodeJob.C1483h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.n.h$g[] r3 = com.bumptech.glide.load.p152n.DecodeJob.C1482g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f10528a = r3
                com.bumptech.glide.load.n.h$g r4 = com.bumptech.glide.load.p152n.DecodeJob.C1482g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f10528a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.n.h$g r3 = com.bumptech.glide.load.p152n.DecodeJob.C1482g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f10528a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.n.h$g r1 = com.bumptech.glide.load.p152n.DecodeJob.C1482g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p152n.DecodeJob.C1476a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.n.h$b */
    /* compiled from: DecodeJob */
    interface C1477b<R> {
        /* renamed from: a */
        void mo9000a(GlideException qVar);

        /* renamed from: c */
        void mo9001c(Resource<R> vVar, DataSource aVar, boolean z);

        /* renamed from: e */
        void mo9002e(DecodeJob<?> hVar);
    }

    /* renamed from: com.bumptech.glide.load.n.h$c */
    /* compiled from: DecodeJob */
    private final class C1478c<Z> implements C1484a<Z> {

        /* renamed from: a */
        private final DataSource f10531a;

        C1478c(DataSource aVar) {
            this.f10531a = aVar;
        }

        /* renamed from: a */
        public Resource<Z> mo9003a(Resource<Z> vVar) {
            return DecodeJob.this.mo8998v(this.f10531a, vVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.h$d */
    /* compiled from: DecodeJob */
    private static class C1479d<Z> {

        /* renamed from: a */
        private Key f10533a;

        /* renamed from: b */
        private ResourceEncoder<Z> f10534b;

        /* renamed from: c */
        private LockedResource<Z> f10535c;

        C1479d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9004a() {
            this.f10533a = null;
            this.f10534b = null;
            this.f10535c = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo9005b(C1480e eVar, Options iVar) {
            GlideTrace.m14122a("DecodeJob.encode");
            try {
                eVar.mo9008a().mo8912a(this.f10533a, new DataCacheWriter(this.f10534b, this.f10535c, iVar));
            } finally {
                this.f10535c.mo9085i();
                GlideTrace.m14125d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo9006c() {
            return this.f10535c != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public <X> void mo9007d(Key gVar, ResourceEncoder<X> lVar, LockedResource<X> uVar) {
            this.f10533a = gVar;
            this.f10534b = lVar;
            this.f10535c = uVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.h$e */
    /* compiled from: DecodeJob */
    interface C1480e {
        /* renamed from: a */
        DiskCache mo9008a();
    }

    /* renamed from: com.bumptech.glide.load.n.h$f */
    /* compiled from: DecodeJob */
    private static class C1481f {

        /* renamed from: a */
        private boolean f10536a;

        /* renamed from: b */
        private boolean f10537b;

        /* renamed from: c */
        private boolean f10538c;

        C1481f() {
        }

        /* renamed from: a */
        private boolean m12884a(boolean z) {
            return (this.f10538c || z || this.f10537b) && this.f10536a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public synchronized boolean mo9009b() {
            this.f10537b = true;
            return m12884a(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public synchronized boolean mo9010c() {
            this.f10538c = true;
            return m12884a(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public synchronized boolean mo9011d(boolean z) {
            this.f10536a = true;
            return m12884a(z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public synchronized void mo9012e() {
            this.f10537b = false;
            this.f10536a = false;
            this.f10538c = false;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.h$g */
    /* compiled from: DecodeJob */
    private enum C1482g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.n.h$h */
    /* compiled from: DecodeJob */
    private enum C1483h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    DecodeJob(C1480e eVar, C0610e<DecodeJob<?>> eVar2) {
        this.f10505d = eVar;
        this.f10506e = eVar2;
    }

    /* renamed from: A */
    private void m12846A() {
        int i = C1476a.f10528a[this.f10520s.ordinal()];
        if (i == 1) {
            this.f10519r = m12852k(C1483h.INITIALIZE);
            this.f10498C = m12851j();
            m12863y();
        } else if (i == 2) {
            m12863y();
        } else if (i == 3) {
            m12850i();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized run reason: ");
            sb.append(this.f10520s);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: B */
    private void m12847B() {
        Throwable th;
        this.f10504c.mo9588c();
        if (this.f10499D) {
            if (this.f10503b.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f10503b;
                th = (Throwable) list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f10499D = true;
    }

    /* renamed from: g */
    private <Data> Resource<R> m12848g(DataFetcher<?> dVar, Data data, DataSource aVar) throws GlideException {
        if (data == null) {
            dVar.mo8785b();
            return null;
        }
        try {
            long b = LogTime.m14065b();
            Resource<R> h = m12849h(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Decoded result ");
                sb.append(h);
                m12855o(sb.toString(), b);
            }
            return h;
        } finally {
            dVar.mo8785b();
        }
    }

    /* renamed from: h */
    private <Data> Resource<R> m12849h(Data data, DataSource aVar) throws GlideException {
        return m12864z(data, aVar, this.f10502a.mo8975h(data.getClass()));
    }

    /* renamed from: i */
    private void m12850i() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f10521t;
            StringBuilder sb = new StringBuilder();
            sb.append("data: ");
            sb.append(this.f10527z);
            sb.append(", cache key: ");
            sb.append(this.f10525x);
            sb.append(", fetcher: ");
            sb.append(this.f10497B);
            m12856p("Retrieved data", j, sb.toString());
        }
        Resource vVar = null;
        try {
            vVar = m12848g(this.f10497B, this.f10527z, this.f10496A);
        } catch (GlideException e) {
            e.mo9070i(this.f10526y, this.f10496A);
            this.f10503b.add(e);
        }
        if (vVar != null) {
            m12858r(vVar, this.f10496A, this.f10501H);
        } else {
            m12863y();
        }
    }

    /* renamed from: j */
    private DataFetcherGenerator m12851j() {
        int i = C1476a.f10529b[this.f10519r.ordinal()];
        if (i == 1) {
            return new ResourceCacheGenerator(this.f10502a, this);
        }
        if (i == 2) {
            return new DataCacheGenerator(this.f10502a, this);
        }
        if (i == 3) {
            return new SourceGenerator(this.f10502a, this);
        }
        if (i == 4) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized stage: ");
        sb.append(this.f10519r);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: k */
    private C1483h m12852k(C1483h hVar) {
        C1483h hVar2;
        C1483h hVar3;
        int i = C1476a.f10529b[hVar.ordinal()];
        if (i == 1) {
            if (this.f10515n.mo9015a()) {
                hVar2 = C1483h.DATA_CACHE;
            } else {
                hVar2 = m12852k(C1483h.DATA_CACHE);
            }
            return hVar2;
        } else if (i == 2) {
            return this.f10522u ? C1483h.FINISHED : C1483h.SOURCE;
        } else if (i == 3 || i == 4) {
            return C1483h.FINISHED;
        } else {
            if (i == 5) {
                if (this.f10515n.mo9016b()) {
                    hVar3 = C1483h.RESOURCE_CACHE;
                } else {
                    hVar3 = m12852k(C1483h.RESOURCE_CACHE);
                }
                return hVar3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized stage: ");
            sb.append(hVar);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: l */
    private Options m12853l(DataSource aVar) {
        Options iVar = this.f10516o;
        if (VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z = aVar == DataSource.RESOURCE_DISK_CACHE || this.f10502a.mo8990w();
        Option<Boolean> hVar = Downsampler.f10871e;
        Boolean bool = (Boolean) iVar.mo8835c(hVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return iVar;
        }
        Options iVar2 = new Options();
        iVar2.mo8836d(this.f10516o);
        iVar2.mo8837e(hVar, Boolean.valueOf(z));
        return iVar2;
    }

    /* renamed from: m */
    private int m12854m() {
        return this.f10511j.ordinal();
    }

    /* renamed from: o */
    private void m12855o(String str, long j) {
        m12856p(str, j, null);
    }

    /* renamed from: p */
    private void m12856p(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(LogTime.m14064a(j));
        sb.append(", load key: ");
        sb.append(this.f10512k);
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(str2);
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* renamed from: q */
    private void m12857q(Resource<R> vVar, DataSource aVar, boolean z) {
        m12847B();
        this.f10517p.mo9001c(vVar, aVar, z);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.bumptech.glide.load.n.v] */
    /* JADX WARNING: type inference failed for: r3v7, types: [com.bumptech.glide.load.n.u] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12858r(com.bumptech.glide.load.p152n.Resource<R> r3, com.bumptech.glide.load.DataSource r4, boolean r5) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.bumptech.glide.load.p152n.Initializable
            if (r0 == 0) goto L_0x000a
            r0 = r3
            com.bumptech.glide.load.n.r r0 = (com.bumptech.glide.load.p152n.Initializable) r0
            r0.mo9079b()
        L_0x000a:
            r0 = 0
            com.bumptech.glide.load.n.h$d<?> r1 = r2.f10507f
            boolean r1 = r1.mo9006c()
            if (r1 == 0) goto L_0x0018
            com.bumptech.glide.load.n.u r3 = com.bumptech.glide.load.p152n.LockedResource.m12995g(r3)
            r0 = r3
        L_0x0018:
            r2.m12857q(r3, r4, r5)
            com.bumptech.glide.load.n.h$h r3 = com.bumptech.glide.load.p152n.DecodeJob.C1483h.ENCODE
            r2.f10519r = r3
            com.bumptech.glide.load.n.h$d<?> r3 = r2.f10507f     // Catch:{ all -> 0x0039 }
            boolean r3 = r3.mo9006c()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0030
            com.bumptech.glide.load.n.h$d<?> r3 = r2.f10507f     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.n.h$e r4 = r2.f10505d     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.i r5 = r2.f10516o     // Catch:{ all -> 0x0039 }
            r3.mo9005b(r4, r5)     // Catch:{ all -> 0x0039 }
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.mo9085i()
        L_0x0035:
            r2.m12860t()
            return
        L_0x0039:
            r3 = move-exception
            if (r0 == 0) goto L_0x003f
            r0.mo9085i()
        L_0x003f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p152n.DecodeJob.m12858r(com.bumptech.glide.load.n.v, com.bumptech.glide.load.a, boolean):void");
    }

    /* renamed from: s */
    private void m12859s() {
        m12847B();
        this.f10517p.mo9000a(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList<Throwable>(this.f10503b)));
        m12861u();
    }

    /* renamed from: t */
    private void m12860t() {
        if (this.f10508g.mo9009b()) {
            m12862x();
        }
    }

    /* renamed from: u */
    private void m12861u() {
        if (this.f10508g.mo9010c()) {
            m12862x();
        }
    }

    /* renamed from: x */
    private void m12862x() {
        this.f10508g.mo9012e();
        this.f10507f.mo9004a();
        this.f10502a.mo8968a();
        this.f10499D = false;
        this.f10509h = null;
        this.f10510i = null;
        this.f10516o = null;
        this.f10511j = null;
        this.f10512k = null;
        this.f10517p = null;
        this.f10519r = null;
        this.f10498C = null;
        this.f10524w = null;
        this.f10525x = null;
        this.f10527z = null;
        this.f10496A = null;
        this.f10497B = null;
        this.f10521t = 0;
        this.f10500G = false;
        this.f10523v = null;
        this.f10503b.clear();
        this.f10506e.mo4945a(this);
    }

    /* renamed from: y */
    private void m12863y() {
        this.f10524w = Thread.currentThread();
        this.f10521t = LogTime.m14065b();
        boolean z = false;
        while (!this.f10500G && this.f10498C != null) {
            z = this.f10498C.mo8942e();
            if (z) {
                break;
            }
            this.f10519r = m12852k(this.f10519r);
            this.f10498C = m12851j();
            if (this.f10519r == C1483h.SOURCE) {
                mo8965a();
                return;
            }
        }
        if ((this.f10519r == C1483h.FINISHED || this.f10500G) && !z) {
            m12859s();
        }
    }

    /* renamed from: z */
    private <Data, ResourceType> Resource<R> m12864z(Data data, DataSource aVar, LoadPath<Data, ResourceType, R> tVar) throws GlideException {
        Options l = m12853l(aVar);
        DataRewinder l2 = this.f10509h.mo8710i().mo8723l(data);
        try {
            return tVar.mo9083a(l2, l, this.f10513l, this.f10514m, new C1478c(aVar));
        } finally {
            l2.mo8774b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public boolean mo8992C() {
        C1483h k = m12852k(C1483h.INITIALIZE);
        return k == C1483h.RESOURCE_CACHE || k == C1483h.DATA_CACHE;
    }

    /* renamed from: a */
    public void mo8965a() {
        this.f10520s = C1482g.SWITCH_TO_SOURCE_SERVICE;
        this.f10517p.mo9002e(this);
    }

    /* renamed from: b */
    public void mo8966b(Key gVar, Exception exc, DataFetcher<?> dVar, DataSource aVar) {
        dVar.mo8785b();
        GlideException qVar = new GlideException("Fetching data failed", (Throwable) exc);
        qVar.mo9071j(gVar, aVar, dVar.mo8780a());
        this.f10503b.add(qVar);
        if (Thread.currentThread() != this.f10524w) {
            this.f10520s = C1482g.SWITCH_TO_SOURCE_SERVICE;
            this.f10517p.mo9002e(this);
            return;
        }
        m12863y();
    }

    /* renamed from: c */
    public void mo8967c(Key gVar, Object obj, DataFetcher<?> dVar, DataSource aVar, Key gVar2) {
        this.f10525x = gVar;
        this.f10527z = obj;
        this.f10497B = dVar;
        this.f10496A = aVar;
        this.f10526y = gVar2;
        boolean z = false;
        if (gVar != this.f10502a.mo8970c().get(0)) {
            z = true;
        }
        this.f10501H = z;
        if (Thread.currentThread() != this.f10524w) {
            this.f10520s = C1482g.DECODE_DATA;
            this.f10517p.mo9002e(this);
            return;
        }
        GlideTrace.m14122a("DecodeJob.decodeFromRetrievedData");
        try {
            m12850i();
        } finally {
            GlideTrace.m14125d();
        }
    }

    /* renamed from: d */
    public StateVerifier mo8940d() {
        return this.f10504c;
    }

    /* renamed from: e */
    public void mo8994e() {
        this.f10500G = true;
        DataFetcherGenerator fVar = this.f10498C;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* renamed from: f */
    public int compareTo(DecodeJob<?> hVar) {
        int m = m12854m() - hVar.m12854m();
        return m == 0 ? this.f10518q - hVar.f10518q : m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public DecodeJob<R> mo8996n(GlideContext dVar, Object obj, EngineKey nVar, Key gVar, int i, int i2, Class<?> cls, Class<R> cls2, Priority gVar2, DiskCacheStrategy jVar, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, boolean z3, Options iVar, C1477b<R> bVar, int i3) {
        this.f10502a.mo8988u(dVar, obj, gVar, i, i2, jVar, cls, cls2, gVar2, iVar, map, z, z2, this.f10505d);
        this.f10509h = dVar;
        this.f10510i = gVar;
        this.f10511j = gVar2;
        this.f10512k = nVar;
        this.f10513l = i;
        this.f10514m = i2;
        this.f10515n = jVar;
        this.f10522u = z3;
        this.f10516o = iVar;
        this.f10517p = bVar;
        this.f10518q = i3;
        this.f10520s = C1482g.INITIALIZE;
        this.f10523v = obj;
        return this;
    }

    public void run() {
        String str = "DecodeJob";
        GlideTrace.m14123b("DecodeJob#run(model=%s)", this.f10523v);
        DataFetcher<?> dVar = this.f10497B;
        try {
            if (this.f10500G) {
                m12859s();
                if (dVar != null) {
                    dVar.mo8785b();
                }
                GlideTrace.m14125d();
                return;
            }
            m12846A();
            if (dVar != null) {
                dVar.mo8785b();
            }
            GlideTrace.m14125d();
        } catch (CallbackException e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo8785b();
            }
            GlideTrace.m14125d();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [com.bumptech.glide.load.n.d] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> com.bumptech.glide.load.p152n.Resource<Z> mo8998v(com.bumptech.glide.load.DataSource r12, com.bumptech.glide.load.p152n.Resource<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.mo9056a()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.n.g<R> r0 = r11.f10502a
            com.bumptech.glide.load.m r0 = r0.mo8985r(r8)
            com.bumptech.glide.d r2 = r11.f10509h
            int r3 = r11.f10513l
            int r4 = r11.f10514m
            com.bumptech.glide.load.n.v r2 = r0.mo8842a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.mo9061f()
        L_0x002b:
            com.bumptech.glide.load.n.g<R> r13 = r11.f10502a
            boolean r13 = r13.mo8989v(r0)
            if (r13 == 0) goto L_0x0040
            com.bumptech.glide.load.n.g<R> r13 = r11.f10502a
            com.bumptech.glide.load.l r1 = r13.mo8981n(r0)
            com.bumptech.glide.load.i r13 = r11.f10516o
            com.bumptech.glide.load.c r13 = r1.mo8841b(r13)
            goto L_0x0042
        L_0x0040:
            com.bumptech.glide.load.c r13 = com.bumptech.glide.load.EncodeStrategy.NONE
        L_0x0042:
            r10 = r1
            com.bumptech.glide.load.n.g<R> r1 = r11.f10502a
            com.bumptech.glide.load.g r2 = r11.f10525x
            boolean r1 = r1.mo8991x(r2)
            r2 = 1
            r1 = r1 ^ r2
            com.bumptech.glide.load.n.j r3 = r11.f10515n
            boolean r12 = r3.mo9018d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.bumptech.glide.load.p152n.DecodeJob.C1476a.f10530c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            com.bumptech.glide.load.n.x r12 = new com.bumptech.glide.load.n.x
            com.bumptech.glide.load.n.g<R> r13 = r11.f10502a
            com.bumptech.glide.load.n.a0.b r2 = r13.mo8969b()
            com.bumptech.glide.load.g r3 = r11.f10525x
            com.bumptech.glide.load.g r4 = r11.f10510i
            int r5 = r11.f10513l
            int r6 = r11.f10514m
            com.bumptech.glide.load.i r9 = r11.f10516o
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            com.bumptech.glide.load.n.d r12 = new com.bumptech.glide.load.n.d
            com.bumptech.glide.load.g r13 = r11.f10525x
            com.bumptech.glide.load.g r1 = r11.f10510i
            r12.<init>(r13, r1)
        L_0x009b:
            com.bumptech.glide.load.n.u r0 = com.bumptech.glide.load.p152n.LockedResource.m12995g(r0)
            com.bumptech.glide.load.n.h$d<?> r13 = r11.f10507f
            r13.mo9007d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.i$d r12 = new com.bumptech.glide.i$d
            java.lang.Object r13 = r0.mo9056a()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p152n.DecodeJob.mo8998v(com.bumptech.glide.load.a, com.bumptech.glide.load.n.v):com.bumptech.glide.load.n.v");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo8999w(boolean z) {
        if (this.f10508g.mo9011d(z)) {
            m12862x();
        }
    }
}
