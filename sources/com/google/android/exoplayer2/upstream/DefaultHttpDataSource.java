package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.efs.sdk.base.Constants;
import com.google.android.exoplayer2.upstream.C1926y.C1927a;
import com.google.android.exoplayer2.upstream.C1926y.C1928b;
import com.google.android.exoplayer2.upstream.C1926y.C1929c;
import com.google.android.exoplayer2.upstream.C1926y.C1930d;
import com.google.android.exoplayer2.upstream.C1926y.C1931e;
import com.google.android.exoplayer2.upstream.C1926y.C1932f;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p135a.Predicate;

/* renamed from: com.google.android.exoplayer2.upstream.u */
public class DefaultHttpDataSource extends BaseDataSource implements C1926y {

    /* renamed from: f */
    private static final Pattern f12418f = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: g */
    private final boolean f12419g;

    /* renamed from: h */
    private final int f12420h;

    /* renamed from: i */
    private final int f12421i;

    /* renamed from: j */
    private final String f12422j;

    /* renamed from: k */
    private final C1932f f12423k;

    /* renamed from: l */
    private final C1932f f12424l;

    /* renamed from: m */
    private Predicate<String> f12425m;

    /* renamed from: n */
    private DataSpec f12426n;

    /* renamed from: o */
    private HttpURLConnection f12427o;

    /* renamed from: p */
    private InputStream f12428p;

    /* renamed from: q */
    private byte[] f12429q;

    /* renamed from: r */
    private boolean f12430r;

    /* renamed from: s */
    private int f12431s;

    /* renamed from: t */
    private long f12432t;

    /* renamed from: u */
    private long f12433u;

    /* renamed from: v */
    private long f12434v;

    /* renamed from: w */
    private long f12435w;

    /* renamed from: com.google.android.exoplayer2.upstream.u$b */
    /* compiled from: DefaultHttpDataSource */
    public static final class C1924b implements C1928b {

        /* renamed from: a */
        private final C1932f f12436a = new C1932f();

        /* renamed from: b */
        private TransferListener f12437b;

        /* renamed from: c */
        private Predicate<String> f12438c;

        /* renamed from: d */
        private String f12439d;

        /* renamed from: e */
        private int f12440e = 8000;

        /* renamed from: f */
        private int f12441f = 8000;

        /* renamed from: g */
        private boolean f12442g;

        /* renamed from: b */
        public DefaultHttpDataSource m15165a() {
            DefaultHttpDataSource uVar = new DefaultHttpDataSource(this.f12439d, this.f12440e, this.f12441f, this.f12442g, this.f12436a, this.f12438c);
            TransferListener e0Var = this.f12437b;
            if (e0Var != null) {
                uVar.mo7017k(e0Var);
            }
            return uVar;
        }

        /* renamed from: c */
        public C1924b mo14972c(String str) {
            this.f12439d = str;
            return this;
        }
    }

    /* renamed from: A */
    private HttpURLConnection m15149A(DataSpec pVar) throws IOException {
        HttpURLConnection B;
        DataSpec pVar2 = pVar;
        URL url = new URL(pVar2.f12345a.toString());
        int i = pVar2.f12347c;
        byte[] bArr = pVar2.f12348d;
        long j = pVar2.f12351g;
        long j2 = pVar2.f12352h;
        boolean d = pVar2.mo14947d(1);
        if (!this.f12419g) {
            return m15150B(url, i, bArr, j, j2, d, true, pVar2.f12349e);
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 <= 20) {
                Map<String, String> map = pVar2.f12349e;
                int i4 = i3;
                byte[] bArr2 = bArr;
                long j3 = j2;
                long j4 = j;
                B = m15150B(url, i, bArr, j, j2, d, false, map);
                int responseCode = B.getResponseCode();
                String headerField = B.getHeaderField("Location");
                if ((i == 1 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    B.disconnect();
                    url = m15156y(url, headerField);
                } else if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return B;
                } else {
                    B.disconnect();
                    url = m15156y(url, headerField);
                    bArr2 = null;
                    i = 1;
                }
                i2 = i4;
                bArr = bArr2;
                j2 = j3;
                j = j4;
                pVar2 = pVar;
            } else {
                int i5 = i3;
                StringBuilder sb = new StringBuilder();
                sb.append("Too many redirects: ");
                sb.append(i5);
                throw new NoRouteToHostException(sb.toString());
            }
        }
        return B;
    }

    /* renamed from: B */
    private HttpURLConnection m15150B(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection D = mo14969D(url);
        D.setConnectTimeout(this.f12420h);
        D.setReadTimeout(this.f12421i);
        HashMap hashMap = new HashMap();
        C1932f fVar = this.f12423k;
        if (fVar != null) {
            hashMap.putAll(fVar.mo14973a());
        }
        hashMap.putAll(this.f12424l.mo14973a());
        hashMap.putAll(map);
        for (Entry entry : hashMap.entrySet()) {
            D.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            String sb2 = sb.toString();
            if (j2 != -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append((j + j2) - 1);
                sb2 = sb3.toString();
            }
            D.setRequestProperty("Range", sb2);
        }
        String str = this.f12422j;
        if (str != null) {
            D.setRequestProperty("User-Agent", str);
        }
        D.setRequestProperty("Accept-Encoding", z ? Constants.CP_GZIP : "identity");
        D.setInstanceFollowRedirects(z2);
        D.setDoOutput(bArr != null);
        D.setRequestMethod(DataSpec.m15085c(i));
        if (bArr != null) {
            D.setFixedLengthStreamingMode(bArr.length);
            D.connect();
            OutputStream outputStream = D.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            D.connect();
        }
        return D;
    }

    /* renamed from: C */
    private static void m15151C(HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection != null) {
            int i = Util.f8398a;
            if (i >= 19 && i <= 20) {
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (j == -1) {
                        if (inputStream.read() == -1) {
                            return;
                        }
                    } else if (j <= 2048) {
                        return;
                    }
                    String name = inputStream.getClass().getName();
                    if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                        Method declaredMethod = ((Class) Assertions.m10153e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(inputStream, new Object[0]);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: E */
    private int m15152E(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f12433u;
        if (j != -1) {
            long j2 = j - this.f12435w;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j2);
        }
        int read = ((InputStream) Util.m10293i(this.f12428p)).read(bArr, i, i2);
        if (read != -1) {
            this.f12435w += (long) read;
            mo14935r(read);
            return read;
        } else if (this.f12433u == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: F */
    private void m15153F() throws IOException {
        if (this.f12434v != this.f12432t) {
            if (this.f12429q == null) {
                this.f12429q = new byte[4096];
            }
            while (true) {
                long j = this.f12434v;
                long j2 = this.f12432t;
                if (j != j2) {
                    int read = ((InputStream) Util.m10293i(this.f12428p)).read(this.f12429q, 0, (int) Math.min(j2 - j, (long) this.f12429q.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f12434v += (long) read;
                        mo14935r(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: w */
    private void m15154w() {
        HttpURLConnection httpURLConnection = this.f12427o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.m10382d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f12427o = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m15155x(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x002c
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x002e
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.append(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10381c(r3, r1)
        L_0x002c:
            r4 = -1
        L_0x002e:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00b0
            java.util.regex.Pattern r1 = f12418f
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x00b0
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.Object r6 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r6)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x0099 }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0099 }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.Object r1 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r1)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x0099 }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0099 }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0070
            r4 = r6
            goto L_0x00b0
        L_0x0070:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00b0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0099 }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.String r8 = "Inconsistent headers ["
            r1.append(r8)     // Catch:{ NumberFormatException -> 0x0099 }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0099 }
            r1.append(r10)     // Catch:{ NumberFormatException -> 0x0099 }
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.String r0 = r1.toString()     // Catch:{ NumberFormatException -> 0x0099 }
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r3, r0)     // Catch:{ NumberFormatException -> 0x0099 }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x0099 }
            r4 = r0
            goto L_0x00b0
        L_0x0099:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.append(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            p067c.p068a.p069a.p070a.p111m2.Log.m10381c(r3, r10)
        L_0x00b0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.DefaultHttpDataSource.m15155x(java.net.HttpURLConnection):long");
    }

    /* renamed from: y */
    private static URL m15156y(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported protocol redirect: ");
            sb.append(protocol);
            throw new ProtocolException(sb.toString());
        }
        throw new ProtocolException("Null location redirect");
    }

    /* renamed from: z */
    private static boolean m15157z(HttpURLConnection httpURLConnection) {
        return Constants.CP_GZIP.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public HttpURLConnection mo14969D(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: b */
    public int mo6195b(byte[] bArr, int i, int i2) throws C1929c {
        try {
            m15153F();
            return m15152E(bArr, i, i2);
        } catch (IOException e) {
            throw new C1929c(e, (DataSpec) Util.m10293i(this.f12426n), 2);
        }
    }

    public void close() throws C1929c {
        try {
            InputStream inputStream = this.f12428p;
            if (inputStream != null) {
                m15151C(this.f12427o, mo14970v());
                inputStream.close();
            }
            this.f12428p = null;
            m15154w();
            if (this.f12430r) {
                this.f12430r = false;
                mo14936s();
            }
        } catch (IOException e) {
            throw new C1929c(e, (DataSpec) Util.m10293i(this.f12426n), 3);
        } catch (Throwable th) {
            this.f12428p = null;
            m15154w();
            if (this.f12430r) {
                this.f12430r = false;
                mo14936s();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public long mo7015e(DataSpec pVar) throws C1929c {
        byte[] bArr;
        String str = "Unable to connect";
        this.f12426n = pVar;
        long j = 0;
        this.f12435w = 0;
        this.f12434v = 0;
        mo14937t(pVar);
        try {
            HttpURLConnection A = m15149A(pVar);
            this.f12427o = A;
            try {
                this.f12431s = A.getResponseCode();
                String responseMessage = A.getResponseMessage();
                int i = this.f12431s;
                if (i < 200 || i > 299) {
                    Map headerFields = A.getHeaderFields();
                    InputStream errorStream = A.getErrorStream();
                    if (errorStream != null) {
                        try {
                            bArr = Util.m10252H0(errorStream);
                        } catch (IOException unused) {
                            bArr = Util.f8403f;
                        }
                    } else {
                        bArr = Util.f8403f;
                    }
                    byte[] bArr2 = bArr;
                    m15154w();
                    C1931e eVar = new C1931e(this.f12431s, responseMessage, headerFields, pVar, bArr2);
                    if (this.f12431s == 416) {
                        eVar.initCause(new DataSourceException(0));
                    }
                    throw eVar;
                }
                String contentType = A.getContentType();
                Predicate<String> hVar = this.f12425m;
                if (hVar == null || hVar.apply(contentType)) {
                    if (this.f12431s == 200) {
                        long j2 = pVar.f12351g;
                        if (j2 != 0) {
                            j = j2;
                        }
                    }
                    this.f12432t = j;
                    boolean z = m15157z(A);
                    if (!z) {
                        long j3 = pVar.f12352h;
                        long j4 = -1;
                        if (j3 != -1) {
                            this.f12433u = j3;
                        } else {
                            long x = m15155x(A);
                            if (x != -1) {
                                j4 = x - this.f12432t;
                            }
                            this.f12433u = j4;
                        }
                    } else {
                        this.f12433u = pVar.f12352h;
                    }
                    try {
                        this.f12428p = A.getInputStream();
                        if (z) {
                            this.f12428p = new GZIPInputStream(this.f12428p);
                        }
                        this.f12430r = true;
                        mo14938u(pVar);
                        return this.f12433u;
                    } catch (IOException e) {
                        m15154w();
                        throw new C1929c(e, pVar, 1);
                    }
                } else {
                    m15154w();
                    throw new C1930d(contentType, pVar);
                }
            } catch (IOException e2) {
                m15154w();
                throw new C1929c(str, e2, pVar, 1);
            }
        } catch (IOException e3) {
            String message = e3.getMessage();
            if (message == null || !Util.m10256J0(message).matches("cleartext http traffic.*not permitted.*")) {
                throw new C1929c(str, e3, pVar, 1);
            }
            throw new C1927a(e3, pVar);
        }
    }

    /* renamed from: g */
    public Map<String, List<String>> mo7016g() {
        HttpURLConnection httpURLConnection = this.f12427o;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* renamed from: l */
    public Uri mo7018l() {
        HttpURLConnection httpURLConnection = this.f12427o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final long mo14970v() {
        long j = this.f12433u;
        return j == -1 ? j : j - this.f12435w;
    }

    private DefaultHttpDataSource(String str, int i, int i2, boolean z, C1932f fVar, Predicate<String> hVar) {
        super(true);
        this.f12422j = str;
        this.f12420h = i;
        this.f12421i = i2;
        this.f12419g = z;
        this.f12423k = fVar;
        this.f12425m = hVar;
        this.f12424l = new C1932f();
    }
}
