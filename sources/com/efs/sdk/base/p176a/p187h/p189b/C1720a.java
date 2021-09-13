package com.efs.sdk.base.p176a.p187h.p189b;

import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.http.IHttpUtil;
import com.efs.sdk.base.p176a.p187h.C1719b;
import com.efs.sdk.base.p176a.p187h.C1728d;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.efs.sdk.base.a.h.b.a */
public final class C1720a implements IHttpUtil {

    /* renamed from: com.efs.sdk.base.a.h.b.a$a */
    static class C1721a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C1720a f11399a = new C1720a(0);
    }

    /* synthetic */ C1720a(byte b) {
        this();
    }

    /* renamed from: a */
    public static C1720a m14286a() {
        return C1721a.f11399a;
    }

    /* renamed from: b */
    private static void m14290b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                C1719b.m14276a((Closeable) httpURLConnection.getInputStream());
            } catch (Throwable unused) {
            }
        }
    }

    public final HttpResponse get(String str, Map<String, String> map) {
        String str2 = "' error";
        String str3 = "get request '";
        String str4 = "efs.util.http";
        HttpResponse httpResponse = new HttpResponse();
        int i = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            try {
                HttpURLConnection a = m14289a(str, map);
                a.setRequestMethod("GET");
                a.setInstanceFollowRedirects(true);
                a.setRequestProperty("Connection", "close");
                a.connect();
                httpResponse = m14288a(a);
                m14290b(a);
                break;
            } catch (UnknownHostException e) {
                httpResponse.setHttpCode(-2);
                StringBuilder sb = new StringBuilder(str3);
                sb.append(str);
                sb.append("' error， maybe network is disconnect");
                C1728d.m14309b(str4, sb.toString(), e);
            } catch (SocketTimeoutException e2) {
                httpResponse.setHttpCode(-3);
                StringBuilder sb2 = new StringBuilder("post file '");
                sb2.append(str);
                sb2.append(str2);
                C1728d.m14309b(str4, sb2.toString(), e2);
            } catch (Throwable th) {
                m14290b(null);
                throw th;
            }
            m14290b(null);
        }
        httpResponse.setReqUrl(str);
        return httpResponse;
    }

    public final HttpResponse post(String str, Map<String, String> map, File file) {
        return m14287a(str, map, file, null);
    }

    public final HttpResponse postAsFile(String str, Map<String, String> map, byte[] bArr) {
        return m14287a(str, map, null, bArr);
    }

    private C1720a() {
    }

    /* renamed from: a */
    private static HttpURLConnection m14289a(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        if (map == null) {
            map = Collections.emptyMap();
        }
        for (Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return httpURLConnection;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.Map] */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r8v9, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map<java.lang.String, java.lang.String>, code=null, for r8v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.Map] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v2
  assigns: []
  uses: []
  mth insns count: 64
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.efs.sdk.base.http.HttpResponse post(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, byte[] r9) {
        /*
            r6 = this;
            java.lang.String r0 = "' error"
            java.lang.String r1 = "efs.util.http"
            com.efs.sdk.base.http.HttpResponse r2 = new com.efs.sdk.base.http.HttpResponse
            r2.<init>()
            r3 = 0
            java.net.HttpURLConnection r8 = m14289a(r7, r8)     // Catch:{ UnknownHostException -> 0x0064, SocketTimeoutException -> 0x0049, all -> 0x0032 }
            java.lang.String r4 = "POST"
            r8.setRequestMethod(r4)     // Catch:{ UnknownHostException -> 0x0030, SocketTimeoutException -> 0x002e, all -> 0x002c }
            java.lang.String r4 = "Connection"
            java.lang.String r5 = "close"
            r8.setRequestProperty(r4, r5)     // Catch:{ UnknownHostException -> 0x0030, SocketTimeoutException -> 0x002e, all -> 0x002c }
            java.io.OutputStream r3 = r8.getOutputStream()     // Catch:{ UnknownHostException -> 0x0030, SocketTimeoutException -> 0x002e, all -> 0x002c }
            r3.write(r9)     // Catch:{ UnknownHostException -> 0x0030, SocketTimeoutException -> 0x002e, all -> 0x002c }
            com.efs.sdk.base.http.HttpResponse r2 = m14288a(r8)     // Catch:{ UnknownHostException -> 0x0030, SocketTimeoutException -> 0x002e, all -> 0x002c }
        L_0x0025:
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r3)
            m14290b(r8)
            goto L_0x0081
        L_0x002c:
            r9 = move-exception
            goto L_0x0034
        L_0x002e:
            r9 = move-exception
            goto L_0x004b
        L_0x0030:
            r9 = move-exception
            goto L_0x0066
        L_0x0032:
            r9 = move-exception
            r8 = r3
        L_0x0034:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = "post data '"
            r4.<init>(r5)     // Catch:{ all -> 0x0085 }
            r4.append(r7)     // Catch:{ all -> 0x0085 }
            r4.append(r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0085 }
            com.efs.sdk.base.p176a.p187h.C1728d.m14309b(r1, r0, r9)     // Catch:{ all -> 0x0085 }
            goto L_0x0025
        L_0x0049:
            r9 = move-exception
            r8 = r3
        L_0x004b:
            r4 = -3
            r2.setHttpCode(r4)     // Catch:{ all -> 0x0085 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = "post file '"
            r4.<init>(r5)     // Catch:{ all -> 0x0085 }
            r4.append(r7)     // Catch:{ all -> 0x0085 }
            r4.append(r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0085 }
            com.efs.sdk.base.p176a.p187h.C1728d.m14309b(r1, r0, r9)     // Catch:{ all -> 0x0085 }
            goto L_0x0025
        L_0x0064:
            r9 = move-exception
            r8 = r3
        L_0x0066:
            r0 = -2
            r2.setHttpCode(r0)     // Catch:{ all -> 0x0085 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "post data to '"
            r0.<init>(r4)     // Catch:{ all -> 0x0085 }
            r0.append(r7)     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = "' error， maybe network is disconnect"
            r0.append(r4)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0085 }
            com.efs.sdk.base.p176a.p187h.C1728d.m14309b(r1, r0, r9)     // Catch:{ all -> 0x0085 }
            goto L_0x0025
        L_0x0081:
            r2.setReqUrl(r7)
            return r2
        L_0x0085:
            r7 = move-exception
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r3)
            m14290b(r8)
            goto L_0x008e
        L_0x008d:
            throw r7
        L_0x008e:
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p176a.p187h.p189b.C1720a.post(java.lang.String, java.util.Map, byte[]):com.efs.sdk.base.http.HttpResponse");
    }

    /* renamed from: a */
    private static HttpResponse m14288a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        HttpResponse httpResponse = new HttpResponse();
        if (httpURLConnection == null) {
            return httpResponse;
        }
        try {
            httpResponse.setHttpCode(httpURLConnection.getResponseCode());
            inputStream = httpURLConnection.getInputStream();
            try {
                byte[] bArr = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            C1728d.m14309b("efs.util.http", "get response error", th);
                            C1719b.m14276a((Closeable) inputStream);
                            C1719b.m14276a((Closeable) byteArrayOutputStream);
                            return httpResponse;
                        } catch (Throwable th3) {
                            C1719b.m14276a((Closeable) inputStream);
                            C1719b.m14276a((Closeable) byteArrayOutputStream);
                            throw th3;
                        }
                    }
                }
                httpResponse.data = byteArrayOutputStream.toString();
            } catch (Throwable th4) {
                byteArrayOutputStream = null;
                th = th4;
                C1728d.m14309b("efs.util.http", "get response error", th);
                C1719b.m14276a((Closeable) inputStream);
                C1719b.m14276a((Closeable) byteArrayOutputStream);
                return httpResponse;
            }
        } catch (Throwable th5) {
            byteArrayOutputStream = null;
            th = th5;
            inputStream = null;
            C1728d.m14309b("efs.util.http", "get response error", th);
            C1719b.m14276a((Closeable) inputStream);
            C1719b.m14276a((Closeable) byteArrayOutputStream);
            return httpResponse;
        }
        C1719b.m14276a((Closeable) inputStream);
        C1719b.m14276a((Closeable) byteArrayOutputStream);
        return httpResponse;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r13v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v6, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r11v9, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r13v9 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r13v10 */
    /* JADX WARNING: type inference failed for: r13v11 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r13v12 */
    /* JADX WARNING: type inference failed for: r13v13 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r13v14 */
    /* JADX WARNING: type inference failed for: r13v15 */
    /* JADX WARNING: type inference failed for: r13v16 */
    /* JADX WARNING: type inference failed for: r13v17 */
    /* JADX WARNING: type inference failed for: r13v18 */
    /* JADX WARNING: type inference failed for: r13v19 */
    /* JADX WARNING: type inference failed for: r13v20 */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r13v24, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r13v25 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r13v26 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r13v27 */
    /* JADX WARNING: type inference failed for: r13v28 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r13v29 */
    /* JADX WARNING: type inference failed for: r13v30 */
    /* JADX WARNING: type inference failed for: r13v31 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r13v32 */
    /* JADX WARNING: type inference failed for: r13v33 */
    /* JADX WARNING: type inference failed for: r13v34 */
    /* JADX WARNING: type inference failed for: r13v35 */
    /* JADX WARNING: type inference failed for: r13v36 */
    /* JADX WARNING: type inference failed for: r13v37 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r13v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r13v2
  assigns: []
  uses: []
  mth insns count: 160
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Unknown variable types count: 19 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.efs.sdk.base.http.HttpResponse m14287a(java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, java.io.File r12, byte[] r13) {
        /*
            java.lang.String r0 = "' error"
            java.lang.String r1 = "post file '"
            java.lang.String r2 = "efs.util.http"
            com.efs.sdk.base.http.HttpResponse r3 = new com.efs.sdk.base.http.HttpResponse
            r3.<init>()
            r4 = 0
            java.net.HttpURLConnection r11 = m14289a(r10, r11)     // Catch:{ UnknownHostException -> 0x0112, SocketTimeoutException -> 0x00f7, all -> 0x00d4 }
            java.lang.String r5 = "POST"
            r11.setRequestMethod(r5)     // Catch:{ UnknownHostException -> 0x00ce, SocketTimeoutException -> 0x00c8, all -> 0x00c2 }
            java.lang.String r5 = "Connection"
            java.lang.String r6 = "close"
            r11.setRequestProperty(r5, r6)     // Catch:{ UnknownHostException -> 0x00ce, SocketTimeoutException -> 0x00c8, all -> 0x00c2 }
            java.lang.String r5 = "Content-Type"
            java.lang.String r6 = "multipart/form-data;boundary=----WebKitFormBoundaryP0Rfzlf32iRoMhmb"
            r11.setRequestProperty(r5, r6)     // Catch:{ UnknownHostException -> 0x00ce, SocketTimeoutException -> 0x00c8, all -> 0x00c2 }
            java.io.OutputStream r5 = r11.getOutputStream()     // Catch:{ UnknownHostException -> 0x00ce, SocketTimeoutException -> 0x00c8, all -> 0x00c2 }
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ UnknownHostException -> 0x00be, SocketTimeoutException -> 0x00ba, all -> 0x00b6 }
            r6.<init>(r5)     // Catch:{ UnknownHostException -> 0x00be, SocketTimeoutException -> 0x00ba, all -> 0x00b6 }
            java.lang.String r7 = "------WebKitFormBoundaryP0Rfzlf32iRoMhmb\r\n"
            r6.writeBytes(r7)     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            r7 = 0
            java.lang.String r8 = "\r\n"
            if (r13 != 0) goto L_0x0087
            if (r12 == 0) goto L_0x007a
            boolean r13 = r12.exists()     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            if (r13 != 0) goto L_0x003f
            goto L_0x007a
        L_0x003f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            java.lang.String r9 = "Content-Disposition: form-data;name=\"file\";filename=\""
            r13.<init>(r9)     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            java.lang.String r9 = r12.getName()     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            r13.append(r9)     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            java.lang.String r9 = "\"\r\n"
            r13.append(r9)     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            java.lang.String r13 = r13.toString()     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            r6.writeBytes(r13)     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            r6.writeBytes(r8)     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            r13.<init>(r12)     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            r12 = 4096(0x1000, float:5.74E-42)
            byte[] r12 = new byte[r12]     // Catch:{ UnknownHostException -> 0x0077, SocketTimeoutException -> 0x0074, all -> 0x0072 }
        L_0x0065:
            int r4 = r13.read(r12)     // Catch:{ UnknownHostException -> 0x0077, SocketTimeoutException -> 0x0074, all -> 0x0072 }
            r9 = -1
            if (r4 == r9) goto L_0x0070
            r6.write(r12, r7, r4)     // Catch:{ UnknownHostException -> 0x0077, SocketTimeoutException -> 0x0074, all -> 0x0072 }
            goto L_0x0065
        L_0x0070:
            r4 = r13
            goto L_0x0093
        L_0x0072:
            r12 = move-exception
            goto L_0x00c6
        L_0x0074:
            r12 = move-exception
            goto L_0x00cc
        L_0x0077:
            r12 = move-exception
            goto L_0x00d2
        L_0x007a:
            m14290b(r11)
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r5)
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r6)
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r4)
            return r3
        L_0x0087:
            java.lang.String r12 = "Content-Disposition: form-data;name=\"file\";filename=\"f\"\r\n"
            r6.writeBytes(r12)     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            r6.writeBytes(r8)     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            int r12 = r13.length     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            r6.write(r13, r7, r12)     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
        L_0x0093:
            r6.writeBytes(r8)     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            java.lang.String r12 = "------WebKitFormBoundaryP0Rfzlf32iRoMhmb--\r\n"
            r6.writeBytes(r12)     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            com.efs.sdk.base.http.HttpResponse r3 = m14288a(r11)     // Catch:{ UnknownHostException -> 0x00b3, SocketTimeoutException -> 0x00b0, all -> 0x00ad }
            m14290b(r11)
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r5)
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r6)
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r4)
            goto L_0x012f
        L_0x00ad:
            r12 = move-exception
            r13 = r4
            goto L_0x00c6
        L_0x00b0:
            r12 = move-exception
            r13 = r4
            goto L_0x00cc
        L_0x00b3:
            r12 = move-exception
            r13 = r4
            goto L_0x00d2
        L_0x00b6:
            r12 = move-exception
            r13 = r4
            r6 = r13
            goto L_0x00c6
        L_0x00ba:
            r12 = move-exception
            r13 = r4
            r6 = r13
            goto L_0x00cc
        L_0x00be:
            r12 = move-exception
            r13 = r4
            r6 = r13
            goto L_0x00d2
        L_0x00c2:
            r12 = move-exception
            r13 = r4
            r5 = r13
            r6 = r5
        L_0x00c6:
            r4 = r11
            goto L_0x00d8
        L_0x00c8:
            r12 = move-exception
            r13 = r4
            r5 = r13
            r6 = r5
        L_0x00cc:
            r4 = r11
            goto L_0x00fb
        L_0x00ce:
            r12 = move-exception
            r13 = r4
            r5 = r13
            r6 = r5
        L_0x00d2:
            r4 = r11
            goto L_0x0116
        L_0x00d4:
            r12 = move-exception
            r13 = r4
            r5 = r13
            r6 = r5
        L_0x00d8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r11.<init>(r1)     // Catch:{ all -> 0x0133 }
            r11.append(r10)     // Catch:{ all -> 0x0133 }
            r11.append(r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0133 }
            com.efs.sdk.base.p176a.p187h.C1728d.m14309b(r2, r11, r12)     // Catch:{ all -> 0x0133 }
        L_0x00ea:
            m14290b(r4)
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r5)
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r6)
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r13)
            goto L_0x012f
        L_0x00f7:
            r12 = move-exception
            r13 = r4
            r5 = r13
            r6 = r5
        L_0x00fb:
            r11 = -3
            r3.setHttpCode(r11)     // Catch:{ all -> 0x0133 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r11.<init>(r1)     // Catch:{ all -> 0x0133 }
            r11.append(r10)     // Catch:{ all -> 0x0133 }
            r11.append(r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0133 }
            com.efs.sdk.base.p176a.p187h.C1728d.m14309b(r2, r11, r12)     // Catch:{ all -> 0x0133 }
            goto L_0x00ea
        L_0x0112:
            r12 = move-exception
            r13 = r4
            r5 = r13
            r6 = r5
        L_0x0116:
            r11 = -2
            r3.setHttpCode(r11)     // Catch:{ all -> 0x0133 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r11.<init>(r1)     // Catch:{ all -> 0x0133 }
            r11.append(r10)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "' error， maybe network is disconnect"
            r11.append(r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0133 }
            com.efs.sdk.base.p176a.p187h.C1728d.m14309b(r2, r11, r12)     // Catch:{ all -> 0x0133 }
            goto L_0x00ea
        L_0x012f:
            r3.setReqUrl(r10)
            return r3
        L_0x0133:
            r10 = move-exception
            m14290b(r4)
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r5)
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r6)
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r13)
            goto L_0x0142
        L_0x0141:
            throw r10
        L_0x0142:
            goto L_0x0141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p176a.p187h.p189b.C1720a.m14287a(java.lang.String, java.util.Map, java.io.File, byte[]):com.efs.sdk.base.http.HttpResponse");
    }
}
