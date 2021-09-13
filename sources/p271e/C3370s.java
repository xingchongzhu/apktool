package p271e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p271e.p272f0.C3310c;

/* renamed from: e.s */
/* compiled from: Headers */
public final class C3370s {

    /* renamed from: a */
    private final String[] f18625a;

    /* renamed from: e.s$a */
    /* compiled from: Headers */
    public static final class C3371a {

        /* renamed from: a */
        final List<String> f18626a = new ArrayList(20);

        /* renamed from: a */
        public C3371a mo20057a(String str, String str2) {
            C3370s.m23613a(str);
            C3370s.m23614b(str2, str);
            return mo20059c(str, str2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C3371a mo20058b(String str) {
            String str2 = ":";
            int indexOf = str.indexOf(str2, 1);
            if (indexOf != -1) {
                return mo20059c(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            String str3 = "";
            if (str.startsWith(str2)) {
                return mo20059c(str3, str.substring(1));
            }
            return mo20059c(str3, str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C3371a mo20059c(String str, String str2) {
            this.f18626a.add(str);
            this.f18626a.add(str2.trim());
            return this;
        }

        /* renamed from: d */
        public C3370s mo20060d() {
            return new C3370s(this);
        }

        /* renamed from: e */
        public C3371a mo20061e(String str) {
            int i = 0;
            while (i < this.f18626a.size()) {
                if (str.equalsIgnoreCase((String) this.f18626a.get(i))) {
                    this.f18626a.remove(i);
                    this.f18626a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: f */
        public C3371a mo20062f(String str, String str2) {
            C3370s.m23613a(str);
            C3370s.m23614b(str2, str);
            mo20061e(str);
            mo20059c(str, str2);
            return this;
        }
    }

    C3370s(C3371a aVar) {
        List<String> list = aVar.f18626a;
        this.f18625a = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: a */
    static void m23613a(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C3310c.m23063q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    /* renamed from: b */
    static void m23614b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C3310c.m23063q("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("value for name ");
        sb.append(str2);
        sb.append(" == null");
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: d */
    private static String m23615d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: c */
    public String mo20048c(String str) {
        return m23615d(this.f18625a, str);
    }

    /* renamed from: e */
    public String mo20049e(int i) {
        return this.f18625a[i * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3370s) && Arrays.equals(((C3370s) obj).f18625a, this.f18625a);
    }

    /* renamed from: f */
    public C3371a mo20051f() {
        C3371a aVar = new C3371a();
        Collections.addAll(aVar.f18626a, this.f18625a);
        return aVar;
    }

    /* renamed from: g */
    public int mo20052g() {
        return this.f18625a.length / 2;
    }

    /* renamed from: h */
    public String mo20053h(int i) {
        return this.f18625a[(i * 2) + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f18625a);
    }

    /* renamed from: i */
    public List<String> mo20055i(String str) {
        int g = mo20052g();
        ArrayList arrayList = null;
        for (int i = 0; i < g; i++) {
            if (str.equalsIgnoreCase(mo20049e(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo20053h(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int g = mo20052g();
        for (int i = 0; i < g; i++) {
            sb.append(mo20049e(i));
            sb.append(": ");
            sb.append(mo20053h(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
