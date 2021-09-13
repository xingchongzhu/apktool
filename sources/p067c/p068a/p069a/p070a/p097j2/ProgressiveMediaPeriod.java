package p067c.p068a.p069a.p070a.p097j2;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.C1898b0;
import com.google.android.exoplayer2.upstream.C1898b0.C1900b;
import com.google.android.exoplayer2.upstream.C1898b0.C1901c;
import com.google.android.exoplayer2.upstream.C1898b0.C1903e;
import com.google.android.exoplayer2.upstream.C1898b0.C1904f;
import com.google.android.exoplayer2.upstream.C1916m;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DataSpec.C1919b;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy.C1896a;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.FormatHolder;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.SeekParameters;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p075e2.C0900y;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener.C0898a;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1002a;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.p092l.IcyHeaders;
import p067c.p068a.p069a.p070a.p097j2.IcyDataSource.C1112a;
import p067c.p068a.p069a.p070a.p097j2.MediaPeriod.C1076a;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceEventListener.C1084a;
import p067c.p068a.p069a.p070a.p097j2.SampleQueue.C1100b;
import p067c.p068a.p069a.p070a.p110l2.C1174h;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ConditionVariable;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.j2.h0 */
final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, C1900b<C1089a>, C1904f, C1100b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Map<String, String> f7424a = m8968H();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Format f7425b = new C1245b().mo7693S("icy").mo7705e0("application/x-icy").mo7679E();

    /* renamed from: A */
    private SeekMap f7426A;

    /* renamed from: B */
    private long f7427B;

    /* renamed from: C */
    private boolean f7428C;

    /* renamed from: D */
    private int f7429D;

    /* renamed from: G */
    private boolean f7430G;

    /* renamed from: H */
    private boolean f7431H;

    /* renamed from: I */
    private int f7432I;

    /* renamed from: J */
    private long f7433J;

    /* renamed from: K */
    private long f7434K;

    /* renamed from: L */
    private long f7435L;

    /* renamed from: M */
    private boolean f7436M;

    /* renamed from: N */
    private int f7437N;

    /* renamed from: O */
    private boolean f7438O;

    /* renamed from: P */
    private boolean f7439P;

    /* renamed from: c */
    private final Uri f7440c;

    /* renamed from: d */
    private final C1916m f7441d;

    /* renamed from: e */
    private final C0900y f7442e;

    /* renamed from: f */
    private final LoadErrorHandlingPolicy f7443f;

    /* renamed from: g */
    private final C1084a f7444g;

    /* renamed from: h */
    private final C0898a f7445h;

    /* renamed from: i */
    private final C1090b f7446i;

    /* renamed from: j */
    private final Allocator f7447j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final String f7448k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f7449l;

    /* renamed from: m */
    private final C1898b0 f7450m = new C1898b0("Loader:ProgressiveMediaPeriod");

    /* renamed from: n */
    private final ProgressiveMediaExtractor f7451n;

    /* renamed from: o */
    private final ConditionVariable f7452o;

    /* renamed from: p */
    private final Runnable f7453p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Runnable f7454q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Handler f7455r;

    /* renamed from: s */
    private C1076a f7456s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public IcyHeaders f7457t;

    /* renamed from: u */
    private SampleQueue[] f7458u;

    /* renamed from: v */
    private C1092d[] f7459v;

    /* renamed from: w */
    private boolean f7460w;

    /* renamed from: x */
    private boolean f7461x;

    /* renamed from: y */
    private boolean f7462y;

    /* renamed from: z */
    private C1093e f7463z;

    /* renamed from: c.a.a.a.j2.h0$a */
    /* compiled from: ProgressiveMediaPeriod */
    final class C1089a implements C1903e, C1112a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f7464a = LoadEventInfo.m9282a();

        /* renamed from: b */
        private final Uri f7465b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final StatsDataSource f7466c;

        /* renamed from: d */
        private final ProgressiveMediaExtractor f7467d;

        /* renamed from: e */
        private final ExtractorOutput f7468e;

        /* renamed from: f */
        private final ConditionVariable f7469f;

        /* renamed from: g */
        private final PositionHolder f7470g = new PositionHolder();

        /* renamed from: h */
        private volatile boolean f7471h;

        /* renamed from: i */
        private boolean f7472i = true;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public long f7473j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public DataSpec f7474k = m9027j(0);
        /* access modifiers changed from: private */

        /* renamed from: l */
        public long f7475l = -1;

        /* renamed from: m */
        private C0916b0 f7476m;

        /* renamed from: n */
        private boolean f7477n;

        public C1089a(Uri uri, C1916m mVar, ProgressiveMediaExtractor g0Var, ExtractorOutput lVar, ConditionVariable jVar) {
            this.f7465b = uri;
            this.f7466c = new StatsDataSource(mVar);
            this.f7467d = g0Var;
            this.f7468e = lVar;
            this.f7469f = jVar;
        }

        /* renamed from: j */
        private DataSpec m9027j(long j) {
            return new C1919b().mo14959i(this.f7465b).mo14958h(j).mo14956f(ProgressiveMediaPeriod.this.f7448k).mo14952b(6).mo14955e(ProgressiveMediaPeriod.f7424a).mo14951a();
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public void m9028k(long j, long j2) {
            this.f7470g.f7015a = j;
            this.f7473j = j2;
            this.f7472i = true;
            this.f7477n = false;
        }

        /* renamed from: a */
        public void mo6893a() throws IOException {
            int i = 0;
            while (i == 0 && !this.f7471h) {
                try {
                    long j = this.f7470g.f7015a;
                    DataSpec j2 = m9027j(j);
                    this.f7474k = j2;
                    long e = this.f7466c.mo7015e(j2);
                    this.f7475l = e;
                    if (e != -1) {
                        this.f7475l = e + j;
                    }
                    ProgressiveMediaPeriod.this.f7457t = IcyHeaders.m8743l(this.f7466c.mo7016g());
                    DataReader jVar = this.f7466c;
                    if (!(ProgressiveMediaPeriod.this.f7457t == null || ProgressiveMediaPeriod.this.f7457t.f7266f == -1)) {
                        jVar = new IcyDataSource(this.f7466c, ProgressiveMediaPeriod.this.f7457t.f7266f, this);
                        C0916b0 K = ProgressiveMediaPeriod.this.mo6876K();
                        this.f7476m = K;
                        K.mo6177d(ProgressiveMediaPeriod.f7425b);
                    }
                    DataReader jVar2 = jVar;
                    ProgressiveMediaExtractor g0Var = this.f7467d;
                    Uri uri = this.f7465b;
                    Map g = this.f7466c.mo7016g();
                    long j3 = this.f7475l;
                    long j4 = j;
                    g0Var.mo6870b(jVar2, uri, g, j, j3, this.f7468e);
                    if (ProgressiveMediaPeriod.this.f7457t != null) {
                        this.f7467d.mo6874f();
                    }
                    if (this.f7472i) {
                        this.f7467d.mo6871c(j4, this.f7473j);
                        this.f7472i = false;
                    }
                    while (true) {
                        long j5 = j4;
                        while (i == 0 && !this.f7471h) {
                            this.f7469f.mo7442a();
                            i = this.f7467d.mo6872d(this.f7470g);
                            j4 = this.f7467d.mo6873e();
                            if (j4 > ProgressiveMediaPeriod.this.f7449l + j5) {
                                this.f7469f.mo7443b();
                                ProgressiveMediaPeriod.this.f7455r.post(ProgressiveMediaPeriod.this.f7454q);
                            }
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.f7467d.mo6873e() != -1) {
                        this.f7470g.f7015a = this.f7467d.mo6873e();
                    }
                    Util.m10299l(this.f7466c);
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                } catch (Throwable th) {
                    if (!(i == 1 || this.f7467d.mo6873e() == -1)) {
                        this.f7470g.f7015a = this.f7467d.mo6873e();
                    }
                    Util.m10299l(this.f7466c);
                    throw th;
                }
            }
        }

        /* renamed from: b */
        public void mo6894b(ParsableByteArray a0Var) {
            long max = !this.f7477n ? this.f7473j : Math.max(ProgressiveMediaPeriod.this.m8970J(), this.f7473j);
            int a = a0Var.mo7376a();
            C0916b0 b0Var = (C0916b0) Assertions.m10153e(this.f7476m);
            b0Var.mo6174a(a0Var, a);
            b0Var.mo6176c(max, 1, a, 0, null);
            this.f7477n = true;
        }

        /* renamed from: c */
        public void mo6895c() {
            this.f7471h = true;
        }
    }

    /* renamed from: c.a.a.a.j2.h0$b */
    /* compiled from: ProgressiveMediaPeriod */
    interface C1090b {
        /* renamed from: o */
        void mo6896o(long j, boolean z, boolean z2);
    }

    /* renamed from: c.a.a.a.j2.h0$c */
    /* compiled from: ProgressiveMediaPeriod */
    private final class C1091c implements SampleStream {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f7479a;

        public C1091c(int i) {
            this.f7479a = i;
        }

        /* renamed from: a */
        public int mo6897a(FormatHolder v0Var, DecoderInputBuffer fVar, boolean z) {
            return ProgressiveMediaPeriod.this.mo6885b0(this.f7479a, v0Var, fVar, z);
        }

        /* renamed from: b */
        public void mo6898b() throws IOException {
            ProgressiveMediaPeriod.this.mo6881W(this.f7479a);
        }

        /* renamed from: c */
        public int mo6899c(long j) {
            return ProgressiveMediaPeriod.this.mo6887f0(this.f7479a, j);
        }

        /* renamed from: e */
        public boolean mo6900e() {
            return ProgressiveMediaPeriod.this.mo6877M(this.f7479a);
        }
    }

    /* renamed from: c.a.a.a.j2.h0$d */
    /* compiled from: ProgressiveMediaPeriod */
    private static final class C1092d {

        /* renamed from: a */
        public final int f7481a;

        /* renamed from: b */
        public final boolean f7482b;

        public C1092d(int i, boolean z) {
            this.f7481a = i;
            this.f7482b = z;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1092d.class != obj.getClass()) {
                return false;
            }
            C1092d dVar = (C1092d) obj;
            if (!(this.f7481a == dVar.f7481a && this.f7482b == dVar.f7482b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f7481a * 31) + (this.f7482b ? 1 : 0);
        }
    }

    /* renamed from: c.a.a.a.j2.h0$e */
    /* compiled from: ProgressiveMediaPeriod */
    private static final class C1093e {

        /* renamed from: a */
        public final TrackGroupArray f7483a;

        /* renamed from: b */
        public final boolean[] f7484b;

        /* renamed from: c */
        public final boolean[] f7485c;

        /* renamed from: d */
        public final boolean[] f7486d;

        public C1093e(TrackGroupArray q0Var, boolean[] zArr) {
            this.f7483a = q0Var;
            this.f7484b = zArr;
            int i = q0Var.f7610b;
            this.f7485c = new boolean[i];
            this.f7486d = new boolean[i];
        }
    }

    public ProgressiveMediaPeriod(Uri uri, C1916m mVar, C0998o oVar, C0900y yVar, C0898a aVar, LoadErrorHandlingPolicy a0Var, C1084a aVar2, C1090b bVar, Allocator eVar, String str, int i) {
        this.f7440c = uri;
        this.f7441d = mVar;
        this.f7442e = yVar;
        this.f7445h = aVar;
        this.f7443f = a0Var;
        this.f7444g = aVar2;
        this.f7446i = bVar;
        this.f7447j = eVar;
        this.f7448k = str;
        this.f7449l = (long) i;
        this.f7451n = new BundledExtractorsAdapter(oVar);
        this.f7452o = new ConditionVariable();
        this.f7453p = new C1088h(this);
        this.f7454q = new C1097j(this);
        this.f7455r = Util.m10319v();
        this.f7459v = new C1092d[0];
        this.f7458u = new SampleQueue[0];
        this.f7435L = -9223372036854775807L;
        this.f7433J = -1;
        this.f7427B = -9223372036854775807L;
        this.f7429D = 1;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* renamed from: E */
    private void m8965E() {
        Assertions.m10154f(this.f7461x);
        Assertions.m10153e(this.f7463z);
        Assertions.m10153e(this.f7426A);
    }

    /* renamed from: F */
    private boolean m8966F(C1089a aVar, int i) {
        if (this.f7433J == -1) {
            SeekMap yVar = this.f7426A;
            if (yVar == null || yVar.mo6169j() == -9223372036854775807L) {
                if (!this.f7461x || m8982h0()) {
                    this.f7431H = this.f7461x;
                    this.f7434K = 0;
                    this.f7437N = 0;
                    for (SampleQueue O : this.f7458u) {
                        O.mo6936O();
                    }
                    aVar.m9028k(0, 0);
                    return true;
                }
                this.f7436M = true;
                return false;
            }
        }
        this.f7437N = i;
        return true;
    }

    /* renamed from: G */
    private void m8967G(C1089a aVar) {
        if (this.f7433J == -1) {
            this.f7433J = aVar.f7475l;
        }
    }

    /* renamed from: H */
    private static Map<String, String> m8968H() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", SdkVersion.MINI_VERSION);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: I */
    private int m8969I() {
        int i = 0;
        for (SampleQueue A : this.f7458u) {
            i += A.mo6927A();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public long m8970J() {
        long j = Long.MIN_VALUE;
        for (SampleQueue t : this.f7458u) {
            j = Math.max(j, t.mo6949t());
        }
        return j;
    }

    /* renamed from: L */
    private boolean m8971L() {
        return this.f7435L != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void mo6878P() {
        if (!this.f7439P) {
            ((C1076a) Assertions.m10153e(this.f7456s)).mo6954p(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m8975S() {
        Metadata aVar;
        if (!this.f7439P && !this.f7461x && this.f7460w && this.f7426A != null) {
            SampleQueue[] k0VarArr = this.f7458u;
            int length = k0VarArr.length;
            int i = 0;
            while (i < length) {
                if (k0VarArr[i].mo6953z() != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.f7452o.mo7443b();
            int length2 = this.f7458u.length;
            TrackGroup[] p0VarArr = new TrackGroup[length2];
            boolean[] zArr = new boolean[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                Format u0Var = (Format) Assertions.m10153e(this.f7458u[i2].mo6953z());
                String str = u0Var.f8814l;
                boolean o = MimeTypes.m10409o(str);
                boolean z = o || MimeTypes.m10411q(str);
                zArr[i2] = z;
                this.f7462y = z | this.f7462y;
                IcyHeaders bVar = this.f7457t;
                if (bVar != null) {
                    if (o || this.f7459v[i2].f7482b) {
                        Metadata aVar2 = u0Var.f8812j;
                        if (aVar2 == null) {
                            aVar = new Metadata(bVar);
                        } else {
                            aVar = aVar2.mo6549l(bVar);
                        }
                        u0Var = u0Var.mo7668l().mo7698X(aVar).mo7679E();
                    }
                    if (o && u0Var.f8808f == -1 && u0Var.f8809g == -1 && bVar.f7261a != -1) {
                        u0Var = u0Var.mo7668l().mo7681G(bVar.f7261a).mo7679E();
                    }
                }
                p0VarArr[i2] = new TrackGroup(u0Var.mo7669m(this.f7442e.mo6085c(u0Var)));
            }
            this.f7463z = new C1093e(new TrackGroupArray(p0VarArr), zArr);
            this.f7461x = true;
            ((C1076a) Assertions.m10153e(this.f7456s)).mo6819m(this);
        }
    }

    /* renamed from: T */
    private void m8976T(int i) {
        m8965E();
        C1093e eVar = this.f7463z;
        boolean[] zArr = eVar.f7486d;
        if (!zArr[i]) {
            Format l = eVar.f7483a.mo6988l(i).mo6977l(0);
            this.f7444g.mo6849c(MimeTypes.m10405k(l.f8814l), l, 0, null, this.f7434K);
            zArr[i] = true;
        }
    }

    /* renamed from: U */
    private void m8977U(int i) {
        m8965E();
        boolean[] zArr = this.f7463z.f7484b;
        if (this.f7436M && zArr[i]) {
            if (!this.f7458u[i].mo6930E(false)) {
                this.f7435L = 0;
                this.f7436M = false;
                this.f7431H = true;
                this.f7434K = 0;
                this.f7437N = 0;
                for (SampleQueue O : this.f7458u) {
                    O.mo6936O();
                }
                ((C1076a) Assertions.m10153e(this.f7456s)).mo6954p(this);
            }
        }
    }

    /* renamed from: a0 */
    private C0916b0 m8978a0(C1092d dVar) {
        int length = this.f7458u.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.f7459v[i])) {
                return this.f7458u[i];
            }
        }
        SampleQueue j = SampleQueue.m9096j(this.f7447j, this.f7455r.getLooper(), this.f7442e, this.f7445h);
        j.mo6941V(this);
        int i2 = length + 1;
        C1092d[] dVarArr = (C1092d[]) Arrays.copyOf(this.f7459v, i2);
        dVarArr[length] = dVar;
        this.f7459v = (C1092d[]) Util.m10295j(dVarArr);
        SampleQueue[] k0VarArr = (SampleQueue[]) Arrays.copyOf(this.f7458u, i2);
        k0VarArr[length] = j;
        this.f7458u = (SampleQueue[]) Util.m10295j(k0VarArr);
        return j;
    }

    /* renamed from: d0 */
    private boolean m8979d0(boolean[] zArr, long j) {
        int length = this.f7458u.length;
        for (int i = 0; i < length; i++) {
            if (!this.f7458u[i].mo6938R(j, false) && (zArr[i] || !this.f7462y)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m8974Q(SeekMap yVar) {
        this.f7426A = this.f7457t == null ? yVar : new C1003b(-9223372036854775807L);
        this.f7427B = yVar.mo6169j();
        int i = 1;
        boolean z = this.f7433J == -1 && yVar.mo6169j() == -9223372036854775807L;
        this.f7428C = z;
        if (z) {
            i = 7;
        }
        this.f7429D = i;
        this.f7446i.mo6896o(this.f7427B, yVar.mo6167f(), this.f7428C);
        if (!this.f7461x) {
            m8975S();
        }
    }

    /* renamed from: g0 */
    private void m8981g0() {
        C1089a aVar = new C1089a(this.f7440c, this.f7441d, this.f7451n, this, this.f7452o);
        if (this.f7461x) {
            Assertions.m10154f(m8971L());
            long j = this.f7427B;
            if (j == -9223372036854775807L || this.f7435L <= j) {
                aVar.m9028k(((SeekMap) Assertions.m10153e(this.f7426A)).mo6168h(this.f7435L).f7016a.f7022c, this.f7435L);
                for (SampleQueue T : this.f7458u) {
                    T.mo6940T(this.f7435L);
                }
                this.f7435L = -9223372036854775807L;
            } else {
                this.f7438O = true;
                this.f7435L = -9223372036854775807L;
                return;
            }
        }
        this.f7437N = m8969I();
        long n = this.f7450m.mo14902n(aVar, this, this.f7443f.mo14892d(this.f7429D));
        DataSpec f = aVar.f7474k;
        C1084a aVar2 = this.f7444g;
        LoadEventInfo wVar = new LoadEventInfo(aVar.f7464a, f, n);
        aVar2.mo6842A(wVar, 1, -1, null, 0, null, aVar.f7473j, this.f7427B);
    }

    /* renamed from: h0 */
    private boolean m8982h0() {
        return this.f7431H || m8971L();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public C0916b0 mo6876K() {
        return m8978a0(new C1092d(0, true));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public boolean mo6877M(int i) {
        return !m8982h0() && this.f7458u[i].mo6930E(this.f7438O);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public void mo6880V() throws IOException {
        this.f7450m.mo14899k(this.f7443f.mo14892d(this.f7429D));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: W */
    public void mo6881W(int i) throws IOException {
        this.f7458u[i].mo6931G();
        mo6880V();
    }

    /* renamed from: X */
    public void mo6889j(C1089a aVar, long j, long j2, boolean z) {
        StatsDataSource d = aVar.f7466c;
        LoadEventInfo wVar = new LoadEventInfo(aVar.f7464a, aVar.f7474k, d.mo14915s(), d.mo14916t(), j, j2, d.mo14914r());
        this.f7443f.mo14889a(aVar.f7464a);
        this.f7444g.mo6858r(wVar, 1, -1, null, 0, null, aVar.f7473j, this.f7427B);
        if (!z) {
            m8967G(aVar);
            for (SampleQueue O : this.f7458u) {
                O.mo6936O();
            }
            if (this.f7432I > 0) {
                ((C1076a) Assertions.m10153e(this.f7456s)).mo6954p(this);
            }
        }
    }

    /* renamed from: Y */
    public void mo6892r(C1089a aVar, long j, long j2) {
        if (this.f7427B == -9223372036854775807L) {
            SeekMap yVar = this.f7426A;
            if (yVar != null) {
                boolean f = yVar.mo6167f();
                long J = m8970J();
                long j3 = J == Long.MIN_VALUE ? 0 : J + 10000;
                this.f7427B = j3;
                this.f7446i.mo6896o(j3, f, this.f7428C);
            }
        }
        StatsDataSource d = aVar.f7466c;
        LoadEventInfo wVar = new LoadEventInfo(aVar.f7464a, aVar.f7474k, d.mo14915s(), d.mo14916t(), j, j2, d.mo14914r());
        this.f7443f.mo14889a(aVar.f7464a);
        this.f7444g.mo6861u(wVar, 1, -1, null, 0, null, aVar.f7473j, this.f7427B);
        m8967G(aVar);
        this.f7438O = true;
        ((C1076a) Assertions.m10153e(this.f7456s)).mo6954p(this);
    }

    /* renamed from: Z */
    public C1901c mo6891p(C1089a aVar, long j, long j2, IOException iOException, int i) {
        C1901c cVar;
        C1089a aVar2;
        boolean z;
        m8967G(aVar);
        StatsDataSource d = aVar.f7466c;
        LoadEventInfo wVar = new LoadEventInfo(aVar.f7464a, aVar.f7474k, d.mo14915s(), d.mo14916t(), j, j2, d.mo14914r());
        MediaLoadData zVar = new MediaLoadData(1, -1, null, 0, null, C.m8861d(aVar.f7473j), C.m8861d(this.f7427B));
        long b = this.f7443f.mo14890b(new C1896a(wVar, zVar, iOException, i));
        if (b == -9223372036854775807L) {
            cVar = C1898b0.f12275d;
            C1089a aVar3 = aVar;
        } else {
            int I = m8969I();
            if (I > this.f7437N) {
                aVar2 = aVar;
                z = true;
            } else {
                z = false;
                aVar2 = aVar;
            }
            if (m8966F(aVar2, I)) {
                cVar = C1898b0.m14995g(z, b);
            } else {
                cVar = C1898b0.f12274c;
            }
        }
        boolean z2 = !cVar.mo14903c();
        this.f7444g.mo6863w(wVar, 1, -1, null, 0, null, aVar.f7473j, this.f7427B, iOException, z2);
        if (z2) {
            this.f7443f.mo14889a(aVar.f7464a);
        }
        return cVar;
    }

    /* renamed from: a */
    public boolean mo6806a() {
        return this.f7450m.mo14897i() && this.f7452o.mo7444c();
    }

    /* renamed from: b */
    public long mo6807b() {
        if (this.f7432I == 0) {
            return Long.MIN_VALUE;
        }
        return mo6808c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b0 */
    public int mo6885b0(int i, FormatHolder v0Var, DecoderInputBuffer fVar, boolean z) {
        if (m8982h0()) {
            return -3;
        }
        m8976T(i);
        int L = this.f7458u[i].mo6934L(v0Var, fVar, z, this.f7438O);
        if (L == -3) {
            m8977U(i);
        }
        return L;
    }

    /* renamed from: c */
    public long mo6808c() {
        long j;
        m8965E();
        boolean[] zArr = this.f7463z.f7484b;
        if (this.f7438O) {
            return Long.MIN_VALUE;
        }
        if (m8971L()) {
            return this.f7435L;
        }
        if (this.f7462y) {
            int length = this.f7458u.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f7458u[i].mo6929D()) {
                    j = Math.min(j, this.f7458u[i].mo6949t());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m8970J();
        }
        if (j == Long.MIN_VALUE) {
            j = this.f7434K;
        }
        return j;
    }

    /* renamed from: c0 */
    public void mo6886c0() {
        if (this.f7461x) {
            for (SampleQueue K : this.f7458u) {
                K.mo6933K();
            }
        }
        this.f7450m.mo14901m(this);
        this.f7455r.removeCallbacksAndMessages(null);
        this.f7456s = null;
        this.f7439P = true;
    }

    /* renamed from: d */
    public boolean mo6809d(long j) {
        if (this.f7438O || this.f7450m.mo14896h() || this.f7436M || (this.f7461x && this.f7432I == 0)) {
            return false;
        }
        boolean d = this.f7452o.mo7445d();
        if (!this.f7450m.mo14897i()) {
            m8981g0();
            d = true;
        }
        return d;
    }

    /* renamed from: e */
    public void mo6810e(long j) {
    }

    /* renamed from: f */
    public void mo6216f(SeekMap yVar) {
        this.f7455r.post(new C1094i(this, yVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f0 */
    public int mo6887f0(int i, long j) {
        if (m8982h0()) {
            return 0;
        }
        m8976T(i);
        SampleQueue k0Var = this.f7458u[i];
        int y = k0Var.mo6952y(j, this.f7438O);
        k0Var.mo6942W(y);
        if (y == 0) {
            m8977U(i);
        }
        return y;
    }

    /* renamed from: g */
    public long mo6811g(long j, SeekParameters u1Var) {
        m8965E();
        if (!this.f7426A.mo6167f()) {
            return 0;
        }
        C1002a h = this.f7426A.mo6168h(j);
        return u1Var.mo7711a(j, h.f7016a.f7021b, h.f7017b.f7021b);
    }

    /* renamed from: h */
    public void mo6217h() {
        this.f7460w = true;
        this.f7455r.post(this.f7453p);
    }

    /* renamed from: i */
    public void mo6888i() {
        for (SampleQueue M : this.f7458u) {
            M.mo6935M();
        }
        this.f7451n.mo6869a();
    }

    /* renamed from: k */
    public long mo6812k() {
        if (!this.f7431H || (!this.f7438O && m8969I() <= this.f7437N)) {
            return -9223372036854775807L;
        }
        this.f7431H = false;
        return this.f7434K;
    }

    /* renamed from: l */
    public void mo6813l(C1076a aVar, long j) {
        this.f7456s = aVar;
        this.f7452o.mo7445d();
        m8981g0();
    }

    /* renamed from: m */
    public void mo6890m(Format u0Var) {
        this.f7455r.post(this.f7453p);
    }

    /* renamed from: n */
    public long mo6814n(C1174h[] hVarArr, boolean[] zArr, SampleStream[] l0VarArr, boolean[] zArr2, long j) {
        m8965E();
        C1093e eVar = this.f7463z;
        TrackGroupArray q0Var = eVar.f7483a;
        boolean[] zArr3 = eVar.f7485c;
        int i = this.f7432I;
        int i2 = 0;
        for (int i3 = 0; i3 < hVarArr.length; i3++) {
            if (l0VarArr[i3] != null && (hVarArr[i3] == null || !zArr[i3])) {
                int d = l0VarArr[i3].f7479a;
                Assertions.m10154f(zArr3[d]);
                this.f7432I--;
                zArr3[d] = false;
                l0VarArr[i3] = null;
            }
        }
        boolean z = !this.f7430G ? j != 0 : i == 0;
        for (int i4 = 0; i4 < hVarArr.length; i4++) {
            if (l0VarArr[i4] == null && hVarArr[i4] != null) {
                C1174h hVar = hVarArr[i4];
                Assertions.m10154f(hVar.length() == 1);
                Assertions.m10154f(hVar.mo7262g(0) == 0);
                int m = q0Var.mo6989m(hVar.mo7265k());
                Assertions.m10154f(!zArr3[m]);
                this.f7432I++;
                zArr3[m] = true;
                l0VarArr[i4] = new C1091c(m);
                zArr2[i4] = true;
                if (!z) {
                    SampleQueue k0Var = this.f7458u[m];
                    z = !k0Var.mo6938R(j, true) && k0Var.mo6951w() != 0;
                }
            }
        }
        if (this.f7432I == 0) {
            this.f7436M = false;
            this.f7431H = false;
            if (this.f7450m.mo14897i()) {
                SampleQueue[] k0VarArr = this.f7458u;
                int length = k0VarArr.length;
                while (i2 < length) {
                    k0VarArr[i2].mo6946o();
                    i2++;
                }
                this.f7450m.mo14894e();
            } else {
                SampleQueue[] k0VarArr2 = this.f7458u;
                int length2 = k0VarArr2.length;
                while (i2 < length2) {
                    k0VarArr2[i2].mo6936O();
                    i2++;
                }
            }
        } else if (z) {
            j = mo6818u(j);
            while (i2 < l0VarArr.length) {
                if (l0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f7430G = true;
        return j;
    }

    /* renamed from: o */
    public TrackGroupArray mo6815o() {
        m8965E();
        return this.f7463z.f7483a;
    }

    /* renamed from: q */
    public C0916b0 mo6218q(int i, int i2) {
        return m8978a0(new C1092d(i, false));
    }

    /* renamed from: s */
    public void mo6816s() throws IOException {
        mo6880V();
        if (this.f7438O && !this.f7461x) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    /* renamed from: t */
    public void mo6817t(long j, boolean z) {
        m8965E();
        if (!m8971L()) {
            boolean[] zArr = this.f7463z.f7485c;
            int length = this.f7458u.length;
            for (int i = 0; i < length; i++) {
                this.f7458u[i].mo6945n(j, z, zArr[i]);
            }
        }
    }

    /* renamed from: u */
    public long mo6818u(long j) {
        m8965E();
        boolean[] zArr = this.f7463z.f7484b;
        if (!this.f7426A.mo6167f()) {
            j = 0;
        }
        int i = 0;
        this.f7431H = false;
        this.f7434K = j;
        if (m8971L()) {
            this.f7435L = j;
            return j;
        } else if (this.f7429D != 7 && m8979d0(zArr, j)) {
            return j;
        } else {
            this.f7436M = false;
            this.f7435L = j;
            this.f7438O = false;
            if (this.f7450m.mo14897i()) {
                SampleQueue[] k0VarArr = this.f7458u;
                int length = k0VarArr.length;
                while (i < length) {
                    k0VarArr[i].mo6946o();
                    i++;
                }
                this.f7450m.mo14894e();
            } else {
                this.f7450m.mo14895f();
                SampleQueue[] k0VarArr2 = this.f7458u;
                int length2 = k0VarArr2.length;
                while (i < length2) {
                    k0VarArr2[i].mo6936O();
                    i++;
                }
            }
            return j;
        }
    }
}
