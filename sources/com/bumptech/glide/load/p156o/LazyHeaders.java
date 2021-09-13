package com.bumptech.glide.load.p156o;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.o.j */
public final class LazyHeaders implements Headers {

    /* renamed from: c */
    private final Map<String, List<LazyHeaderFactory>> f10716c;

    /* renamed from: d */
    private volatile Map<String, String> f10717d;

    /* renamed from: com.bumptech.glide.load.o.j$a */
    /* compiled from: LazyHeaders */
    public static final class C1529a {

        /* renamed from: a */
        private static final String f10718a;

        /* renamed from: b */
        private static final Map<String, List<LazyHeaderFactory>> f10719b;

        /* renamed from: c */
        private boolean f10720c = true;

        /* renamed from: d */
        private Map<String, List<LazyHeaderFactory>> f10721d = f10719b;

        /* renamed from: e */
        private boolean f10722e = true;

        static {
            String b = m13116b();
            f10718a = b;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("User-Agent", Collections.singletonList(new C1530b(b)));
            }
            f10719b = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m13116b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public LazyHeaders mo9131a() {
            this.f10720c = true;
            return new LazyHeaders(this.f10721d);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.j$b */
    /* compiled from: LazyHeaders */
    static final class C1530b implements LazyHeaderFactory {

        /* renamed from: a */
        private final String f10723a;

        C1530b(String str) {
            this.f10723a = str;
        }

        /* renamed from: a */
        public String mo9127a() {
            return this.f10723a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1530b)) {
                return false;
            }
            return this.f10723a.equals(((C1530b) obj).f10723a);
        }

        public int hashCode() {
            return this.f10723a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StringHeaderFactory{value='");
            sb.append(this.f10723a);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    LazyHeaders(Map<String, List<LazyHeaderFactory>> map) {
        this.f10716c = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private String m13113b(List<LazyHeaderFactory> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = ((LazyHeaderFactory) list.get(i)).mo9127a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private Map<String, String> m13114c() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f10716c.entrySet()) {
            String b = m13113b((List) entry.getValue());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(entry.getKey(), b);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, String> mo9126a() {
        if (this.f10717d == null) {
            synchronized (this) {
                if (this.f10717d == null) {
                    this.f10717d = Collections.unmodifiableMap(m13114c());
                }
            }
        }
        return this.f10717d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LazyHeaders)) {
            return false;
        }
        return this.f10716c.equals(((LazyHeaders) obj).f10716c);
    }

    public int hashCode() {
        return this.f10716c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LazyHeaders{headers=");
        sb.append(this.f10716c);
        sb.append('}');
        return sb.toString();
    }
}
