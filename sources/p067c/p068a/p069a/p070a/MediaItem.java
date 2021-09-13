package p067c.p068a.p069a.p070a;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p067c.p068a.p069a.p070a.MediaMetadata.C0750b;
import p067c.p068a.p069a.p070a.p096i2.StreamKey;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.z0 */
public final class MediaItem {

    /* renamed from: a */
    public final String f8984a;

    /* renamed from: b */
    public final C1266g f8985b;

    /* renamed from: c */
    public final C1265f f8986c;

    /* renamed from: d */
    public final MediaMetadata f8987d;

    /* renamed from: e */
    public final C1263d f8988e;

    /* renamed from: c.a.a.a.z0$b */
    /* compiled from: MediaItem */
    public static final class C1261b {

        /* renamed from: a */
        public final Uri f8989a;

        /* renamed from: b */
        public final Object f8990b;

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1261b)) {
                return false;
            }
            C1261b bVar = (C1261b) obj;
            if (!this.f8989a.equals(bVar.f8989a) || !Util.m10279b(this.f8990b, bVar.f8990b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            int hashCode = this.f8989a.hashCode() * 31;
            Object obj = this.f8990b;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }

        private C1261b(Uri uri, Object obj) {
            this.f8989a = uri;
            this.f8990b = obj;
        }
    }

    /* renamed from: c.a.a.a.z0$c */
    /* compiled from: MediaItem */
    public static final class C1262c {

        /* renamed from: A */
        private float f8991A;

        /* renamed from: B */
        private float f8992B;

        /* renamed from: a */
        private String f8993a;

        /* renamed from: b */
        private Uri f8994b;

        /* renamed from: c */
        private String f8995c;

        /* renamed from: d */
        private long f8996d;

        /* renamed from: e */
        private long f8997e;

        /* renamed from: f */
        private boolean f8998f;

        /* renamed from: g */
        private boolean f8999g;

        /* renamed from: h */
        private boolean f9000h;

        /* renamed from: i */
        private Uri f9001i;

        /* renamed from: j */
        private Map<String, String> f9002j;

        /* renamed from: k */
        private UUID f9003k;

        /* renamed from: l */
        private boolean f9004l;

        /* renamed from: m */
        private boolean f9005m;

        /* renamed from: n */
        private boolean f9006n;

        /* renamed from: o */
        private List<Integer> f9007o;

        /* renamed from: p */
        private byte[] f9008p;

        /* renamed from: q */
        private List<StreamKey> f9009q;

        /* renamed from: r */
        private String f9010r;

        /* renamed from: s */
        private List<?> f9011s;

        /* renamed from: t */
        private Uri f9012t;

        /* renamed from: u */
        private Object f9013u;

        /* renamed from: v */
        private Object f9014v;

        /* renamed from: w */
        private MediaMetadata f9015w;

        /* renamed from: x */
        private long f9016x;

        /* renamed from: y */
        private long f9017y;

        /* renamed from: z */
        private long f9018z;

        /* renamed from: a */
        public MediaItem mo7780a() {
            C1266g gVar;
            C1264e eVar;
            Assertions.m10154f(this.f9001i == null || this.f9003k != null);
            Uri uri = this.f8994b;
            if (uri != null) {
                String str = this.f8995c;
                UUID uuid = this.f9003k;
                if (uuid != null) {
                    C1264e eVar2 = new C1264e(uuid, this.f9001i, this.f9002j, this.f9004l, this.f9006n, this.f9005m, this.f9007o, this.f9008p);
                    eVar = eVar2;
                } else {
                    eVar = null;
                }
                Uri uri2 = this.f9012t;
                C1266g gVar2 = new C1266g(uri, str, eVar, uri2 != null ? new C1261b(uri2, this.f9013u) : null, this.f9009q, this.f9010r, this.f9011s, this.f9014v);
                String str2 = this.f8993a;
                if (str2 == null) {
                    str2 = uri.toString();
                }
                this.f8993a = str2;
                gVar = gVar2;
            } else {
                gVar = null;
            }
            String str3 = (String) Assertions.m10153e(this.f8993a);
            C1263d dVar = new C1263d(this.f8996d, this.f8997e, this.f8998f, this.f8999g, this.f9000h);
            C1265f fVar = new C1265f(this.f9016x, this.f9017y, this.f9018z, this.f8991A, this.f8992B);
            MediaMetadata a1Var = this.f9015w;
            if (a1Var == null) {
                a1Var = new C0750b().mo5609a();
            }
            MediaItem z0Var = new MediaItem(str3, dVar, gVar, fVar, a1Var);
            return z0Var;
        }

        /* renamed from: b */
        public C1262c mo7781b(String str) {
            this.f9010r = str;
            return this;
        }

        /* renamed from: c */
        public C1262c mo7782c(long j) {
            this.f9016x = j;
            return this;
        }

        /* renamed from: d */
        public C1262c mo7783d(String str) {
            this.f8993a = str;
            return this;
        }

        /* renamed from: e */
        public C1262c mo7784e(List<StreamKey> list) {
            List<StreamKey> list2;
            if (list == null || list.isEmpty()) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(new ArrayList(list));
            }
            this.f9009q = list2;
            return this;
        }

        /* renamed from: f */
        public C1262c mo7785f(Object obj) {
            this.f9014v = obj;
            return this;
        }

        /* renamed from: g */
        public C1262c mo7786g(Uri uri) {
            this.f8994b = uri;
            return this;
        }

        public C1262c() {
            this.f8997e = Long.MIN_VALUE;
            this.f9007o = Collections.emptyList();
            this.f9002j = Collections.emptyMap();
            this.f9009q = Collections.emptyList();
            this.f9011s = Collections.emptyList();
            this.f9016x = -9223372036854775807L;
            this.f9017y = -9223372036854775807L;
            this.f9018z = -9223372036854775807L;
            this.f8991A = -3.4028235E38f;
            this.f8992B = -3.4028235E38f;
        }

        private C1262c(MediaItem z0Var) {
            this();
            C1263d dVar = z0Var.f8988e;
            this.f8997e = dVar.f9020b;
            this.f8998f = dVar.f9021c;
            this.f8999g = dVar.f9022d;
            this.f8996d = dVar.f9019a;
            this.f9000h = dVar.f9023e;
            this.f8993a = z0Var.f8984a;
            this.f9015w = z0Var.f8987d;
            C1265f fVar = z0Var.f8986c;
            this.f9016x = fVar.f9033b;
            this.f9017y = fVar.f9034c;
            this.f9018z = fVar.f9035d;
            this.f8991A = fVar.f9036e;
            this.f8992B = fVar.f9037f;
            C1266g gVar = z0Var.f8985b;
            if (gVar != null) {
                this.f9010r = gVar.f9043f;
                this.f8995c = gVar.f9039b;
                this.f8994b = gVar.f9038a;
                this.f9009q = gVar.f9042e;
                this.f9011s = gVar.f9044g;
                this.f9014v = gVar.f9045h;
                C1264e eVar = gVar.f9040c;
                if (eVar != null) {
                    this.f9001i = eVar.f9025b;
                    this.f9002j = eVar.f9026c;
                    this.f9004l = eVar.f9027d;
                    this.f9006n = eVar.f9029f;
                    this.f9005m = eVar.f9028e;
                    this.f9007o = eVar.f9030g;
                    this.f9003k = eVar.f9024a;
                    this.f9008p = eVar.mo7789a();
                }
                C1261b bVar = gVar.f9041d;
                if (bVar != null) {
                    this.f9012t = bVar.f8989a;
                    this.f9013u = bVar.f8990b;
                }
            }
        }
    }

    /* renamed from: c.a.a.a.z0$d */
    /* compiled from: MediaItem */
    public static final class C1263d {

        /* renamed from: a */
        public final long f9019a;

        /* renamed from: b */
        public final long f9020b;

        /* renamed from: c */
        public final boolean f9021c;

        /* renamed from: d */
        public final boolean f9022d;

        /* renamed from: e */
        public final boolean f9023e;

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1263d)) {
                return false;
            }
            C1263d dVar = (C1263d) obj;
            if (!(this.f9019a == dVar.f9019a && this.f9020b == dVar.f9020b && this.f9021c == dVar.f9021c && this.f9022d == dVar.f9022d && this.f9023e == dVar.f9023e)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            long j = this.f9019a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f9020b;
            return ((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f9021c ? 1 : 0)) * 31) + (this.f9022d ? 1 : 0)) * 31) + (this.f9023e ? 1 : 0);
        }

        private C1263d(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f9019a = j;
            this.f9020b = j2;
            this.f9021c = z;
            this.f9022d = z2;
            this.f9023e = z3;
        }
    }

    /* renamed from: c.a.a.a.z0$e */
    /* compiled from: MediaItem */
    public static final class C1264e {

        /* renamed from: a */
        public final UUID f9024a;

        /* renamed from: b */
        public final Uri f9025b;

        /* renamed from: c */
        public final Map<String, String> f9026c;

        /* renamed from: d */
        public final boolean f9027d;

        /* renamed from: e */
        public final boolean f9028e;

        /* renamed from: f */
        public final boolean f9029f;

        /* renamed from: g */
        public final List<Integer> f9030g;

        /* renamed from: h */
        private final byte[] f9031h;

        /* renamed from: a */
        public byte[] mo7789a() {
            byte[] bArr = this.f9031h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1264e)) {
                return false;
            }
            C1264e eVar = (C1264e) obj;
            if (!this.f9024a.equals(eVar.f9024a) || !Util.m10279b(this.f9025b, eVar.f9025b) || !Util.m10279b(this.f9026c, eVar.f9026c) || this.f9027d != eVar.f9027d || this.f9029f != eVar.f9029f || this.f9028e != eVar.f9028e || !this.f9030g.equals(eVar.f9030g) || !Arrays.equals(this.f9031h, eVar.f9031h)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            int hashCode = this.f9024a.hashCode() * 31;
            Uri uri = this.f9025b;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f9026c.hashCode()) * 31) + (this.f9027d ? 1 : 0)) * 31) + (this.f9029f ? 1 : 0)) * 31) + (this.f9028e ? 1 : 0)) * 31) + this.f9030g.hashCode()) * 31) + Arrays.hashCode(this.f9031h);
        }

        private C1264e(UUID uuid, Uri uri, Map<String, String> map, boolean z, boolean z2, boolean z3, List<Integer> list, byte[] bArr) {
            Assertions.m10149a(!z2 || uri != null);
            this.f9024a = uuid;
            this.f9025b = uri;
            this.f9026c = map;
            this.f9027d = z;
            this.f9029f = z2;
            this.f9028e = z3;
            this.f9030g = list;
            this.f9031h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }
    }

    /* renamed from: c.a.a.a.z0$f */
    /* compiled from: MediaItem */
    public static final class C1265f {

        /* renamed from: a */
        public static final C1265f f9032a;

        /* renamed from: b */
        public final long f9033b;

        /* renamed from: c */
        public final long f9034c;

        /* renamed from: d */
        public final long f9035d;

        /* renamed from: e */
        public final float f9036e;

        /* renamed from: f */
        public final float f9037f;

        static {
            C1265f fVar = new C1265f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
            f9032a = fVar;
        }

        public C1265f(long j, long j2, long j3, float f, float f2) {
            this.f9033b = j;
            this.f9034c = j2;
            this.f9035d = j3;
            this.f9036e = f;
            this.f9037f = f2;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1265f)) {
                return false;
            }
            C1265f fVar = (C1265f) obj;
            if (!(this.f9033b == fVar.f9033b && this.f9034c == fVar.f9034c && this.f9035d == fVar.f9035d && this.f9036e == fVar.f9036e && this.f9037f == fVar.f9037f)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            long j = this.f9033b;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f9034c;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f9035d;
            int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            float f = this.f9036e;
            int i4 = 0;
            int floatToIntBits = (i3 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f9037f;
            if (f2 != 0.0f) {
                i4 = Float.floatToIntBits(f2);
            }
            return floatToIntBits + i4;
        }
    }

    /* renamed from: c.a.a.a.z0$g */
    /* compiled from: MediaItem */
    public static final class C1266g {

        /* renamed from: a */
        public final Uri f9038a;

        /* renamed from: b */
        public final String f9039b;

        /* renamed from: c */
        public final C1264e f9040c;

        /* renamed from: d */
        public final C1261b f9041d;

        /* renamed from: e */
        public final List<StreamKey> f9042e;

        /* renamed from: f */
        public final String f9043f;

        /* renamed from: g */
        public final List<?> f9044g;

        /* renamed from: h */
        public final Object f9045h;

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1266g)) {
                return false;
            }
            C1266g gVar = (C1266g) obj;
            if (!this.f9038a.equals(gVar.f9038a) || !Util.m10279b(this.f9039b, gVar.f9039b) || !Util.m10279b(this.f9040c, gVar.f9040c) || !Util.m10279b(this.f9041d, gVar.f9041d) || !this.f9042e.equals(gVar.f9042e) || !Util.m10279b(this.f9043f, gVar.f9043f) || !this.f9044g.equals(gVar.f9044g) || !Util.m10279b(this.f9045h, gVar.f9045h)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            int hashCode = this.f9038a.hashCode() * 31;
            String str = this.f9039b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C1264e eVar = this.f9040c;
            int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            C1261b bVar = this.f9041d;
            int hashCode4 = (((hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f9042e.hashCode()) * 31;
            String str2 = this.f9043f;
            int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f9044g.hashCode()) * 31;
            Object obj = this.f9045h;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode5 + i;
        }

        private C1266g(Uri uri, String str, C1264e eVar, C1261b bVar, List<StreamKey> list, String str2, List<?> list2, Object obj) {
            this.f9038a = uri;
            this.f9039b = str;
            this.f9040c = eVar;
            this.f9041d = bVar;
            this.f9042e = list;
            this.f9043f = str2;
            this.f9044g = list2;
            this.f9045h = obj;
        }
    }

    /* renamed from: a */
    public C1262c mo7775a() {
        return new C1262c();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem z0Var = (MediaItem) obj;
        if (!Util.m10279b(this.f8984a, z0Var.f8984a) || !this.f8988e.equals(z0Var.f8988e) || !Util.m10279b(this.f8985b, z0Var.f8985b) || !Util.m10279b(this.f8986c, z0Var.f8986c) || !Util.m10279b(this.f8987d, z0Var.f8987d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = this.f8984a.hashCode() * 31;
        C1266g gVar = this.f8985b;
        return ((((((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f8986c.hashCode()) * 31) + this.f8988e.hashCode()) * 31) + this.f8987d.hashCode();
    }

    private MediaItem(String str, C1263d dVar, C1266g gVar, C1265f fVar, MediaMetadata a1Var) {
        this.f8984a = str;
        this.f8985b = gVar;
        this.f8986c = fVar;
        this.f8987d = a1Var;
        this.f8988e = dVar;
    }
}
