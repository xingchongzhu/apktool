package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: com.google.android.exoplayer2.upstream.p */
public final class DataSpec {

    /* renamed from: a */
    public final Uri f12345a;

    /* renamed from: b */
    public final long f12346b;

    /* renamed from: c */
    public final int f12347c;

    /* renamed from: d */
    public final byte[] f12348d;

    /* renamed from: e */
    public final Map<String, String> f12349e;
    @Deprecated

    /* renamed from: f */
    public final long f12350f;

    /* renamed from: g */
    public final long f12351g;

    /* renamed from: h */
    public final long f12352h;

    /* renamed from: i */
    public final String f12353i;

    /* renamed from: j */
    public final int f12354j;

    /* renamed from: k */
    public final Object f12355k;

    /* renamed from: com.google.android.exoplayer2.upstream.p$b */
    /* compiled from: DataSpec */
    public static final class C1919b {

        /* renamed from: a */
        private Uri f12356a;

        /* renamed from: b */
        private long f12357b;

        /* renamed from: c */
        private int f12358c;

        /* renamed from: d */
        private byte[] f12359d;

        /* renamed from: e */
        private Map<String, String> f12360e;

        /* renamed from: f */
        private long f12361f;

        /* renamed from: g */
        private long f12362g;

        /* renamed from: h */
        private String f12363h;

        /* renamed from: i */
        private int f12364i;

        /* renamed from: j */
        private Object f12365j;

        /* renamed from: a */
        public DataSpec mo14951a() {
            Assertions.m10157i(this.f12356a, "The uri must be set.");
            DataSpec pVar = new DataSpec(this.f12356a, this.f12357b, this.f12358c, this.f12359d, this.f12360e, this.f12361f, this.f12362g, this.f12363h, this.f12364i, this.f12365j);
            return pVar;
        }

        /* renamed from: b */
        public C1919b mo14952b(int i) {
            this.f12364i = i;
            return this;
        }

        /* renamed from: c */
        public C1919b mo14953c(byte[] bArr) {
            this.f12359d = bArr;
            return this;
        }

        /* renamed from: d */
        public C1919b mo14954d(int i) {
            this.f12358c = i;
            return this;
        }

        /* renamed from: e */
        public C1919b mo14955e(Map<String, String> map) {
            this.f12360e = map;
            return this;
        }

        /* renamed from: f */
        public C1919b mo14956f(String str) {
            this.f12363h = str;
            return this;
        }

        /* renamed from: g */
        public C1919b mo14957g(long j) {
            this.f12362g = j;
            return this;
        }

        /* renamed from: h */
        public C1919b mo14958h(long j) {
            this.f12361f = j;
            return this;
        }

        /* renamed from: i */
        public C1919b mo14959i(Uri uri) {
            this.f12356a = uri;
            return this;
        }

        /* renamed from: j */
        public C1919b mo14960j(String str) {
            this.f12356a = Uri.parse(str);
            return this;
        }

        public C1919b() {
            this.f12358c = 1;
            this.f12360e = Collections.emptyMap();
            this.f12362g = -1;
        }

        private C1919b(DataSpec pVar) {
            this.f12356a = pVar.f12345a;
            this.f12357b = pVar.f12346b;
            this.f12358c = pVar.f12347c;
            this.f12359d = pVar.f12348d;
            this.f12360e = pVar.f12349e;
            this.f12361f = pVar.f12351g;
            this.f12362g = pVar.f12352h;
            this.f12363h = pVar.f12353i;
            this.f12364i = pVar.f12354j;
            this.f12365j = pVar.f12355k;
        }
    }

    /* renamed from: c */
    public static String m15085c(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C1919b mo14945a() {
        return new C1919b();
    }

    /* renamed from: b */
    public final String mo14946b() {
        return m15085c(this.f12347c);
    }

    /* renamed from: d */
    public boolean mo14947d(int i) {
        return (this.f12354j & i) == i;
    }

    /* renamed from: e */
    public DataSpec mo14948e(long j) {
        long j2 = this.f12352h;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return mo14949f(j, j3);
    }

    /* renamed from: f */
    public DataSpec mo14949f(long j, long j2) {
        if (j == 0 && this.f12352h == j2) {
            return this;
        }
        DataSpec pVar = new DataSpec(this.f12345a, this.f12346b, this.f12347c, this.f12348d, this.f12349e, this.f12351g + j, j2, this.f12353i, this.f12354j, this.f12355k);
        return pVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataSpec[");
        sb.append(mo14946b());
        sb.append(" ");
        sb.append(this.f12345a);
        String str = ", ";
        sb.append(str);
        sb.append(this.f12351g);
        sb.append(str);
        sb.append(this.f12352h);
        sb.append(str);
        sb.append(this.f12353i);
        sb.append(str);
        sb.append(this.f12354j);
        sb.append("]");
        return sb.toString();
    }

    public DataSpec(Uri uri, long j, long j2) {
        this(uri, 0, 1, null, Collections.emptyMap(), j, j2, null, 0, null);
    }

    private DataSpec(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j;
        byte[] bArr2 = bArr;
        long j5 = j2;
        long j6 = j3;
        long j7 = j4 + j5;
        boolean z = true;
        Assertions.m10149a(j7 >= 0);
        Assertions.m10149a(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        Assertions.m10149a(z);
        this.f12345a = uri;
        this.f12346b = j4;
        this.f12347c = i;
        if (bArr2 == null || bArr2.length == 0) {
            bArr2 = null;
        }
        this.f12348d = bArr2;
        this.f12349e = Collections.unmodifiableMap(new HashMap(map));
        this.f12351g = j5;
        this.f12350f = j7;
        this.f12352h = j6;
        this.f12353i = str;
        this.f12354j = i2;
        this.f12355k = obj;
    }
}
