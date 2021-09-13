package p271e;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p271e.C3370s.C3371a;
import p271e.p272f0.C3310c;
import p271e.p272f0.p275g.HttpMethod;

/* renamed from: e.z */
/* compiled from: Request */
public final class C3378z {

    /* renamed from: a */
    final HttpUrl f18726a;

    /* renamed from: b */
    final String f18727b;

    /* renamed from: c */
    final C3370s f18728c;

    /* renamed from: d */
    final RequestBody f18729d;

    /* renamed from: e */
    final Map<Class<?>, Object> f18730e;

    /* renamed from: f */
    private volatile CacheControl f18731f;

    /* renamed from: e.z$a */
    /* compiled from: Request */
    public static class C3379a {

        /* renamed from: a */
        HttpUrl f18732a;

        /* renamed from: b */
        String f18733b;

        /* renamed from: c */
        C3371a f18734c;

        /* renamed from: d */
        RequestBody f18735d;

        /* renamed from: e */
        Map<Class<?>, Object> f18736e;

        public C3379a() {
            this.f18736e = Collections.emptyMap();
            this.f18733b = "GET";
            this.f18734c = new C3371a();
        }

        /* renamed from: a */
        public C3379a mo20149a(String str, String str2) {
            this.f18734c.mo20057a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C3378z mo20150b() {
            if (this.f18732a != null) {
                return new C3378z(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: c */
        public C3379a mo20151c() {
            return mo20154f("GET", null);
        }

        /* renamed from: d */
        public C3379a mo20152d(String str, String str2) {
            this.f18734c.mo20062f(str, str2);
            return this;
        }

        /* renamed from: e */
        public C3379a mo20153e(C3370s sVar) {
            this.f18734c = sVar.mo20051f();
            return this;
        }

        /* renamed from: f */
        public C3379a mo20154f(String str, RequestBody a0Var) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() != 0) {
                String str2 = "method ";
                if (a0Var != null && !HttpMethod.m23178b(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    sb.append(" must not have a request body.");
                    throw new IllegalArgumentException(sb.toString());
                } else if (a0Var != null || !HttpMethod.m23181e(str)) {
                    this.f18733b = str;
                    this.f18735d = a0Var;
                    return this;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(str);
                    sb2.append(" must have a request body.");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                throw new IllegalArgumentException("method.length() == 0");
            }
        }

        /* renamed from: g */
        public C3379a mo20155g(RequestBody a0Var) {
            return mo20154f("POST", a0Var);
        }

        /* renamed from: h */
        public C3379a mo20156h(String str) {
            this.f18734c.mo20061e(str);
            return this;
        }

        /* renamed from: i */
        public <T> C3379a mo20157i(Class<? super T> cls, T t) {
            Objects.requireNonNull(cls, "type == null");
            if (t == null) {
                this.f18736e.remove(cls);
            } else {
                if (this.f18736e.isEmpty()) {
                    this.f18736e = new LinkedHashMap();
                }
                this.f18736e.put(cls, cls.cast(t));
            }
            return this;
        }

        /* renamed from: j */
        public C3379a mo20158j(Object obj) {
            return mo20157i(Object.class, obj);
        }

        /* renamed from: k */
        public C3379a mo20159k(String str) {
            Objects.requireNonNull(str, "url == null");
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                sb.append(str.substring(3));
                str = sb.toString();
            } else {
                if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("https:");
                    sb2.append(str.substring(4));
                    str = sb2.toString();
                }
            }
            return mo20160l(HttpUrl.m23634l(str));
        }

        /* renamed from: l */
        public C3379a mo20160l(HttpUrl tVar) {
            Objects.requireNonNull(tVar, "url == null");
            this.f18732a = tVar;
            return this;
        }

        C3379a(C3378z zVar) {
            Map<Class<?>, Object> map;
            this.f18736e = Collections.emptyMap();
            this.f18732a = zVar.f18726a;
            this.f18733b = zVar.f18727b;
            this.f18735d = zVar.f18729d;
            if (zVar.f18730e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(zVar.f18730e);
            }
            this.f18736e = map;
            this.f18734c = zVar.f18728c.mo20051f();
        }
    }

    C3378z(C3379a aVar) {
        this.f18726a = aVar.f18732a;
        this.f18727b = aVar.f18733b;
        this.f18728c = aVar.f18734c.mo20060d();
        this.f18729d = aVar.f18735d;
        this.f18730e = C3310c.m23067u(aVar.f18736e);
    }

    /* renamed from: a */
    public RequestBody mo20139a() {
        return this.f18729d;
    }

    /* renamed from: b */
    public CacheControl mo20140b() {
        CacheControl dVar = this.f18731f;
        if (dVar != null) {
            return dVar;
        }
        CacheControl k = CacheControl.m23000k(this.f18728c);
        this.f18731f = k;
        return k;
    }

    /* renamed from: c */
    public String mo20141c(String str) {
        return this.f18728c.mo20048c(str);
    }

    /* renamed from: d */
    public C3370s mo20142d() {
        return this.f18728c;
    }

    /* renamed from: e */
    public boolean mo20143e() {
        return this.f18726a.mo20076n();
    }

    /* renamed from: f */
    public String mo20144f() {
        return this.f18727b;
    }

    /* renamed from: g */
    public C3379a mo20145g() {
        return new C3379a(this);
    }

    /* renamed from: h */
    public <T> T mo20146h(Class<? extends T> cls) {
        return cls.cast(this.f18730e.get(cls));
    }

    /* renamed from: i */
    public HttpUrl mo20147i() {
        return this.f18726a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f18727b);
        sb.append(", url=");
        sb.append(this.f18726a);
        sb.append(", tags=");
        sb.append(this.f18730e);
        sb.append('}');
        return sb.toString();
    }
}
