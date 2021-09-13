package p271e.p272f0.p273e;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p271e.C3370s;
import p271e.C3370s.C3371a;
import p271e.C3378z;
import p271e.CacheControl;
import p271e.Response;
import p271e.Response.C3306a;
import p271e.p272f0.Internal;
import p271e.p272f0.p275g.HttpDate;
import p271e.p272f0.p275g.HttpHeaders;

/* renamed from: e.f0.e.c */
public final class CacheStrategy {

    /* renamed from: a */
    public final C3378z f18113a;

    /* renamed from: b */
    public final Response f18114b;

    /* renamed from: e.f0.e.c$a */
    /* compiled from: CacheStrategy */
    public static class C3315a {

        /* renamed from: a */
        final long f18115a;

        /* renamed from: b */
        final C3378z f18116b;

        /* renamed from: c */
        final Response f18117c;

        /* renamed from: d */
        private Date f18118d;

        /* renamed from: e */
        private String f18119e;

        /* renamed from: f */
        private Date f18120f;

        /* renamed from: g */
        private String f18121g;

        /* renamed from: h */
        private Date f18122h;

        /* renamed from: i */
        private long f18123i;

        /* renamed from: j */
        private long f18124j;

        /* renamed from: k */
        private String f18125k;

        /* renamed from: l */
        private int f18126l = -1;

        public C3315a(long j, C3378z zVar, Response b0Var) {
            this.f18115a = j;
            this.f18116b = zVar;
            this.f18117c = b0Var;
            if (b0Var != null) {
                this.f18123i = b0Var.mo19672O();
                this.f18124j = b0Var.mo19670M();
                C3370s H = b0Var.mo19665H();
                int g = H.mo20052g();
                for (int i = 0; i < g; i++) {
                    String e = H.mo20049e(i);
                    String h = H.mo20053h(i);
                    if ("Date".equalsIgnoreCase(e)) {
                        this.f18118d = HttpDate.m23167b(h);
                        this.f18119e = h;
                    } else if ("Expires".equalsIgnoreCase(e)) {
                        this.f18122h = HttpDate.m23167b(h);
                    } else if ("Last-Modified".equalsIgnoreCase(e)) {
                        this.f18120f = HttpDate.m23167b(h);
                        this.f18121g = h;
                    } else if ("ETag".equalsIgnoreCase(e)) {
                        this.f18125k = h;
                    } else if ("Age".equalsIgnoreCase(e)) {
                        this.f18126l = HttpHeaders.m23172d(h, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        private long m23086a() {
            Date date = this.f18118d;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f18124j - date.getTime());
            }
            int i = this.f18126l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f18124j;
            return j + (j2 - this.f18123i) + (this.f18115a - j2);
        }

        /* renamed from: b */
        private long m23087b() {
            long j;
            long j2;
            CacheControl C = this.f18117c.mo19660C();
            if (C.mo19697d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) C.mo19697d());
            }
            long j3 = 0;
            if (this.f18122h != null) {
                Date date = this.f18118d;
                if (date != null) {
                    j2 = date.getTime();
                } else {
                    j2 = this.f18124j;
                }
                long time = this.f18122h.getTime() - j2;
                if (time > 0) {
                    j3 = time;
                }
                return j3;
            }
            if (this.f18120f != null && this.f18117c.mo19671N().mo20147i().mo20081z() == null) {
                Date date2 = this.f18118d;
                if (date2 != null) {
                    j = date2.getTime();
                } else {
                    j = this.f18123i;
                }
                long time2 = j - this.f18120f.getTime();
                if (time2 > 0) {
                    j3 = time2 / 10;
                }
            }
            return j3;
        }

        /* renamed from: d */
        private CacheStrategy m23088d() {
            if (this.f18117c == null) {
                return new CacheStrategy(this.f18116b, null);
            }
            if (this.f18116b.mo20143e() && this.f18117c.mo19662E() == null) {
                return new CacheStrategy(this.f18116b, null);
            }
            if (!CacheStrategy.m23085a(this.f18117c, this.f18116b)) {
                return new CacheStrategy(this.f18116b, null);
            }
            CacheControl b = this.f18116b.mo20140b();
            if (b.mo19701h() || m23089e(this.f18116b)) {
                return new CacheStrategy(this.f18116b, null);
            }
            CacheControl C = this.f18117c.mo19660C();
            long a = m23086a();
            long b2 = m23087b();
            if (b.mo19697d() != -1) {
                b2 = Math.min(b2, TimeUnit.SECONDS.toMillis((long) b.mo19697d()));
            }
            long j = 0;
            long millis = b.mo19699f() != -1 ? TimeUnit.SECONDS.toMillis((long) b.mo19699f()) : 0;
            if (!C.mo19700g() && b.mo19698e() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) b.mo19698e());
            }
            if (!C.mo19701h()) {
                long j2 = millis + a;
                if (j2 < j + b2) {
                    C3306a K = this.f18117c.mo19668K();
                    String str = "Warning";
                    if (j2 >= b2) {
                        K.mo19675a(str, "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > 86400000 && m23090f()) {
                        K.mo19675a(str, "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new CacheStrategy(null, K.mo19677c());
                }
            }
            String str2 = this.f18125k;
            String str3 = "If-Modified-Since";
            if (str2 != null) {
                str3 = "If-None-Match";
            } else if (this.f18120f != null) {
                str2 = this.f18121g;
            } else if (this.f18118d == null) {
                return new CacheStrategy(this.f18116b, null);
            } else {
                str2 = this.f18119e;
            }
            C3371a f = this.f18116b.mo20142d().mo20051f();
            Internal.f18084a.mo19722b(f, str3, str2);
            return new CacheStrategy(this.f18116b.mo20145g().mo20153e(f.mo20060d()).mo20150b(), this.f18117c);
        }

        /* renamed from: e */
        private static boolean m23089e(C3378z zVar) {
            return (zVar.mo20141c("If-Modified-Since") == null && zVar.mo20141c("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        private boolean m23090f() {
            return this.f18117c.mo19660C().mo19697d() == -1 && this.f18122h == null;
        }

        /* renamed from: c */
        public CacheStrategy mo19742c() {
            CacheStrategy d = m23088d();
            return (d.f18113a == null || !this.f18116b.mo20140b().mo19703j()) ? d : new CacheStrategy(null, null);
        }
    }

    CacheStrategy(C3378z zVar, Response b0Var) {
        this.f18113a = zVar;
        this.f18114b = b0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.mo19660C().mo19695b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m23085a(p271e.Response r3, p271e.C3378z r4) {
        /*
            int r0 = r3.mo19661D()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.mo19663F(r0)
            if (r0 != 0) goto L_0x005a
            e.d r0 = r3.mo19660C()
            int r0 = r0.mo19697d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            e.d r0 = r3.mo19660C()
            boolean r0 = r0.mo19696c()
            if (r0 != 0) goto L_0x005a
            e.d r0 = r3.mo19660C()
            boolean r0 = r0.mo19695b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            e.d r3 = r3.mo19660C()
            boolean r3 = r3.mo19702i()
            if (r3 != 0) goto L_0x006f
            e.d r3 = r4.mo20140b()
            boolean r3 = r3.mo19702i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p271e.p272f0.p273e.CacheStrategy.m23085a(e.b0, e.z):boolean");
    }
}
