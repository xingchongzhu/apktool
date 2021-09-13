package p271e.p272f0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p271e.C3370s;
import p271e.C3370s.C3371a;
import p271e.HttpUrl;
import p271e.RequestBody;
import p271e.ResponseBody;
import p271e.p272f0.p277i.Header;
import p281f.BufferedSource;
import p281f.ByteString;
import p281f.C3383c;
import p281f.Source;

/* renamed from: e.f0.c */
/* compiled from: Util */
public final class C3310c {

    /* renamed from: a */
    public static final byte[] f18086a;

    /* renamed from: b */
    public static final String[] f18087b = new String[0];

    /* renamed from: c */
    public static final ResponseBody f18088c;

    /* renamed from: d */
    public static final RequestBody f18089d;

    /* renamed from: e */
    private static final ByteString f18090e = ByteString.m23875d("efbbbf");

    /* renamed from: f */
    private static final ByteString f18091f = ByteString.m23875d("feff");

    /* renamed from: g */
    private static final ByteString f18092g = ByteString.m23875d("fffe");

    /* renamed from: h */
    private static final ByteString f18093h = ByteString.m23875d("0000ffff");

    /* renamed from: i */
    private static final ByteString f18094i = ByteString.m23875d("ffff0000");

    /* renamed from: j */
    public static final Charset f18095j = Charset.forName("UTF-8");

    /* renamed from: k */
    public static final Charset f18096k = Charset.forName("ISO-8859-1");

    /* renamed from: l */
    private static final Charset f18097l = Charset.forName("UTF-16BE");

    /* renamed from: m */
    private static final Charset f18098m = Charset.forName("UTF-16LE");

    /* renamed from: n */
    private static final Charset f18099n = Charset.forName("UTF-32BE");

    /* renamed from: o */
    private static final Charset f18100o = Charset.forName("UTF-32LE");

    /* renamed from: p */
    public static final TimeZone f18101p = TimeZone.getTimeZone("GMT");

    /* renamed from: q */
    public static final Comparator<String> f18102q = new C3311a();

    /* renamed from: r */
    private static final Method f18103r;

    /* renamed from: s */
    private static final Pattern f18104s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: e.f0.c$a */
    /* compiled from: Util */
    class C3311a implements Comparator<String> {
        C3311a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* renamed from: e.f0.c$b */
    /* compiled from: Util */
    class C3312b implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f18105a;

        /* renamed from: b */
        final /* synthetic */ boolean f18106b;

        C3312b(String str, boolean z) {
            this.f18105a = str;
            this.f18106b = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f18105a);
            thread.setDaemon(this.f18106b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f18086a = bArr;
        Method method = null;
        f18088c = ResponseBody.m22991G(null, bArr);
        f18089d = RequestBody.m22947c(null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f18103r = method;
    }

    /* renamed from: A */
    public static boolean m23038A(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    public static X509TrustManager m23039B() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected default trust managers:");
            sb.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(sb.toString());
        } catch (GeneralSecurityException e) {
            throw m23048b("No System TLS", e);
        }
    }

    /* renamed from: C */
    public static boolean m23040C(Source sVar, int i, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long c = sVar.mo19738d().mo20263e() ? sVar.mo19738d().mo20261c() - nanoTime : Long.MAX_VALUE;
        sVar.mo19738d().mo20262d(Math.min(c, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C3383c cVar = new C3383c();
            while (sVar.mo19739t(cVar, 8192) != -1) {
                cVar.mo20171B();
            }
            if (c == Long.MAX_VALUE) {
                sVar.mo19738d().mo20259a();
            } else {
                sVar.mo19738d().mo20262d(nanoTime + c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c == Long.MAX_VALUE) {
                sVar.mo19738d().mo20259a();
            } else {
                sVar.mo19738d().mo20262d(nanoTime + c);
            }
            return false;
        } catch (Throwable th) {
            if (c == Long.MAX_VALUE) {
                sVar.mo19738d().mo20259a();
            } else {
                sVar.mo19738d().mo20262d(nanoTime + c);
            }
            throw th;
        }
    }

    /* renamed from: D */
    public static int m23041D(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: E */
    public static int m23042E(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static ThreadFactory m23043F(String str, boolean z) {
        return new C3312b(str, z);
    }

    /* renamed from: G */
    public static C3370s m23044G(List<Header> list) {
        C3371a aVar = new C3371a();
        for (Header cVar : list) {
            Internal.f18084a.mo19722b(aVar, cVar.f18249g.mo20253t(), cVar.f18250h.mo20253t());
        }
        return aVar.mo20060d();
    }

    /* renamed from: H */
    public static String m23045H(String str, int i, int i2) {
        int D = m23041D(str, i, i2);
        return str.substring(D, m23042E(str, D, i2));
    }

    /* renamed from: I */
    public static boolean m23046I(String str) {
        return f18104s.matcher(str).matches();
    }

    /* renamed from: a */
    public static void m23047a(Throwable th, Throwable th2) {
        Method method = f18103r;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: b */
    public static AssertionError m23048b(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* renamed from: c */
    public static Charset m23049c(BufferedSource eVar, Charset charset) throws IOException {
        ByteString fVar = f18090e;
        if (eVar.mo20235y(0, fVar)) {
            eVar.mo20192a((long) fVar.mo20248o());
            return f18095j;
        }
        ByteString fVar2 = f18091f;
        if (eVar.mo20235y(0, fVar2)) {
            eVar.mo20192a((long) fVar2.mo20248o());
            return f18097l;
        }
        ByteString fVar3 = f18092g;
        if (eVar.mo20235y(0, fVar3)) {
            eVar.mo20192a((long) fVar3.mo20248o());
            return f18098m;
        }
        ByteString fVar4 = f18093h;
        if (eVar.mo20235y(0, fVar4)) {
            eVar.mo20192a((long) fVar4.mo20248o());
            return f18099n;
        }
        ByteString fVar5 = f18094i;
        if (!eVar.mo20235y(0, fVar5)) {
            return charset;
        }
        eVar.mo20192a((long) fVar5.mo20248o());
        return f18100o;
    }

    /* renamed from: d */
    public static String m23050d(String str) {
        InetAddress inetAddress;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = m23058l(str, 0, str.length());
            } else {
                inetAddress = m23058l(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return m23070x(address);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid IPv6 address: '");
            sb.append(str);
            sb.append("'");
            throw new AssertionError(sb.toString());
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !m23055i(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m23051e(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: f */
    public static void m23052f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public static void m23053g(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m23072z(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                if (!"bio == null".equals(e2.getMessage())) {
                    throw e2;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static String[] m23054h(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    /* renamed from: i */
    private static boolean m23055i(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static int m23056j(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: k */
    private static boolean m23057k(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if (i6 == 0 && i != i5) {
                    return false;
                } else {
                    i6 = ((i6 * 10) + charAt) - 48;
                    if (i6 > 255) {
                        return false;
                    }
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            int i7 = i4 + 1;
            bArr[i4] = (byte) i6;
            i4 = i7;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private static InetAddress m23058l(String str, int i, int i2) {
        byte[] bArr = new byte[16];
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            if (i >= i2) {
                break;
            } else if (i3 == 16) {
                return null;
            } else {
                int i6 = i + 2;
                if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                    if (i3 != 0) {
                        if (str.regionMatches(i, ":", 0, 1)) {
                            i++;
                        } else if (!str.regionMatches(i, ".", 0, 1) || !m23057k(str, i5, i2, bArr, i3 - 2)) {
                            return null;
                        } else {
                            i3 += 2;
                        }
                    }
                    i5 = i;
                } else if (i4 != -1) {
                    return null;
                } else {
                    i3 += 2;
                    i4 = i3;
                    if (i6 == i2) {
                        break;
                    }
                    i5 = i6;
                }
                i = i5;
                int i7 = 0;
                while (i < i2) {
                    int j = m23056j(str.charAt(i));
                    if (j == -1) {
                        break;
                    }
                    i7 = (i7 << 4) + j;
                    i++;
                }
                int i8 = i - i5;
                if (i8 == 0 || i8 > 4) {
                    return null;
                }
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((i7 >>> 8) & 255);
                i3 = i9 + 1;
                bArr[i9] = (byte) (i7 & 255);
            }
        }
        if (i3 != 16) {
            if (i4 == -1) {
                return null;
            }
            int i10 = i3 - i4;
            System.arraycopy(bArr, i4, bArr, 16 - i10, i10);
            Arrays.fill(bArr, i4, (16 - i3) + i4, 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: m */
    public static int m23059m(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: n */
    public static int m23060n(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: o */
    public static boolean m23061o(Source sVar, int i, TimeUnit timeUnit) {
        try {
            return m23040C(sVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public static boolean m23062p(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: q */
    public static String m23063q(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: r */
    public static String m23064r(HttpUrl tVar, boolean z) {
        String str;
        String str2 = ":";
        if (tVar.mo20075m().contains(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(tVar.mo20075m());
            sb.append("]");
            str = sb.toString();
        } else {
            str = tVar.mo20075m();
        }
        if (!z && tVar.mo20080y() == HttpUrl.m23633e(tVar.mo20065D())) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append(tVar.mo20080y());
        return sb2.toString();
    }

    /* renamed from: s */
    public static <T> List<T> m23065s(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: t */
    public static <T> List<T> m23066t(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: u */
    public static <K, V> Map<K, V> m23067u(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: v */
    public static int m23068v(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: w */
    public static int m23069w(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: x */
    private static String m23070x(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C3383c cVar = new C3383c();
        while (i < bArr.length) {
            if (i == i2) {
                cVar.mo20218n(58);
                i += i4;
                if (i == 16) {
                    cVar.mo20218n(58);
                }
            } else {
                if (i > 0) {
                    cVar.mo20218n(58);
                }
                cVar.mo20204g((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                i += 2;
            }
        }
        return cVar.mo20183N();
    }

    /* renamed from: y */
    public static String[] m23071y(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: z */
    public static boolean m23072z(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
