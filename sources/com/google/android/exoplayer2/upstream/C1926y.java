package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.C1916m.C1917a;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p067c.p068a.p134b.p135a.Predicate;

/* renamed from: com.google.android.exoplayer2.upstream.y */
/* compiled from: HttpDataSource */
public interface C1926y extends C1916m {

    /* renamed from: a */
    public static final Predicate<String> f12448a = C1907c.f12292a;

    /* renamed from: com.google.android.exoplayer2.upstream.y$a */
    /* compiled from: HttpDataSource */
    public static final class C1927a extends C1929c {
        public C1927a(IOException iOException, DataSpec pVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, pVar, 1);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.y$b */
    /* compiled from: HttpDataSource */
    public interface C1928b extends C1917a {
        /* renamed from: a */
        C1926y mo14939a();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.y$c */
    /* compiled from: HttpDataSource */
    public static class C1929c extends IOException {

        /* renamed from: a */
        public final int f12449a;

        /* renamed from: b */
        public final DataSpec f12450b;

        public C1929c(String str, DataSpec pVar, int i) {
            super(str);
            this.f12450b = pVar;
            this.f12449a = i;
        }

        public C1929c(IOException iOException, DataSpec pVar, int i) {
            super(iOException);
            this.f12450b = pVar;
            this.f12449a = i;
        }

        public C1929c(String str, IOException iOException, DataSpec pVar, int i) {
            super(str, iOException);
            this.f12450b = pVar;
            this.f12449a = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.y$d */
    /* compiled from: HttpDataSource */
    public static final class C1930d extends C1929c {

        /* renamed from: c */
        public final String f12451c;

        public C1930d(String str, DataSpec pVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid content type: ");
            sb.append(str);
            super(sb.toString(), pVar, 1);
            this.f12451c = str;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.y$e */
    /* compiled from: HttpDataSource */
    public static final class C1931e extends C1929c {

        /* renamed from: c */
        public final int f12452c;

        /* renamed from: d */
        public final String f12453d;

        /* renamed from: e */
        public final Map<String, List<String>> f12454e;

        /* renamed from: f */
        public final byte[] f12455f;

        public C1931e(int i, String str, Map<String, List<String>> map, DataSpec pVar, byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("Response code: ");
            sb.append(i);
            super(sb.toString(), pVar, 1);
            this.f12452c = i;
            this.f12453d = str;
            this.f12454e = map;
            this.f12455f = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.y$f */
    /* compiled from: HttpDataSource */
    public static final class C1932f {

        /* renamed from: a */
        private final Map<String, String> f12456a = new HashMap();

        /* renamed from: b */
        private Map<String, String> f12457b;

        /* renamed from: a */
        public synchronized Map<String, String> mo14973a() {
            if (this.f12457b == null) {
                this.f12457b = Collections.unmodifiableMap(new HashMap(this.f12456a));
            }
            return this.f12457b;
        }
    }
}
