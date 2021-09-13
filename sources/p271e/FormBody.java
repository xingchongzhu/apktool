package p271e;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p271e.p272f0.C3310c;
import p281f.BufferedSink;
import p281f.C3383c;

/* renamed from: e.q */
public final class FormBody extends RequestBody {

    /* renamed from: a */
    private static final MediaType f18615a = MediaType.m23688c("application/x-www-form-urlencoded");

    /* renamed from: b */
    private final List<String> f18616b;

    /* renamed from: c */
    private final List<String> f18617c;

    /* renamed from: e.q$a */
    /* compiled from: FormBody */
    public static final class C3369a {

        /* renamed from: a */
        private final List<String> f18618a;

        /* renamed from: b */
        private final List<String> f18619b;

        /* renamed from: c */
        private final Charset f18620c;

        public C3369a() {
            this(null);
        }

        /* renamed from: a */
        public C3369a mo20042a(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            String str3 = str;
            this.f18618a.add(HttpUrl.m23631c(str3, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f18620c));
            String str4 = str2;
            this.f18619b.add(HttpUrl.m23631c(str4, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f18620c));
            return this;
        }

        /* renamed from: b */
        public FormBody mo20043b() {
            return new FormBody(this.f18618a, this.f18619b);
        }

        public C3369a(Charset charset) {
            this.f18618a = new ArrayList();
            this.f18619b = new ArrayList();
            this.f18620c = charset;
        }
    }

    FormBody(List<String> list, List<String> list2) {
        this.f18616b = C3310c.m23065s(list);
        this.f18617c = C3310c.m23065s(list2);
    }

    /* renamed from: f */
    private long m23604f(BufferedSink dVar, boolean z) {
        C3383c cVar;
        if (z) {
            cVar = new C3383c();
        } else {
            cVar = dVar.mo20196c();
        }
        int size = this.f18616b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cVar.mo20218n(38);
            }
            cVar.mo20232w((String) this.f18616b.get(i));
            cVar.mo20218n(61);
            cVar.mo20232w((String) this.f18617c.get(i));
        }
        if (!z) {
            return 0;
        }
        long Q = cVar.mo20186Q();
        cVar.mo20171B();
        return Q;
    }

    /* renamed from: a */
    public long mo19655a() {
        return m23604f(null, true);
    }

    /* renamed from: b */
    public MediaType mo19656b() {
        return f18615a;
    }

    /* renamed from: e */
    public void mo19657e(BufferedSink dVar) throws IOException {
        m23604f(dVar, false);
    }
}
