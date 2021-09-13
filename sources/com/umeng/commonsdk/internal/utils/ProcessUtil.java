package com.umeng.commonsdk.internal.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* renamed from: com.umeng.commonsdk.internal.utils.g */
public class ProcessUtil {

    /* renamed from: a */
    private static final String f17594a = "\n";

    /* renamed from: b */
    private static final byte[] f17595b = "\nexit\n".getBytes();

    /* renamed from: c */
    private static byte[] f17596c = new byte[32];

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.StringBuilder] */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r4v8, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r3v10, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v18, types: [java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10, types: [java.lang.StringBuilder] */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r1v27 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r2v29 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: type inference failed for: r1v43 */
    /* JADX WARNING: type inference failed for: r1v44 */
    /* JADX WARNING: type inference failed for: r1v45 */
    /* JADX WARNING: type inference failed for: r1v46 */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r1v48 */
    /* JADX WARNING: type inference failed for: r2v30 */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r2v32 */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: type inference failed for: r2v34 */
    /* JADX WARNING: type inference failed for: r2v35 */
    /* JADX WARNING: type inference failed for: r2v36 */
    /* JADX WARNING: type inference failed for: r2v37 */
    /* JADX WARNING: type inference failed for: r2v38 */
    /* JADX WARNING: type inference failed for: r2v39 */
    /* JADX WARNING: type inference failed for: r2v40 */
    /* JADX WARNING: type inference failed for: r2v41 */
    /* JADX WARNING: type inference failed for: r2v42 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: type inference failed for: r3v32 */
    /* JADX WARNING: type inference failed for: r3v33 */
    /* JADX WARNING: type inference failed for: r3v34 */
    /* JADX WARNING: type inference failed for: r3v35 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        r0 = th;
        r1 = r1;
        r2 = r2;
        r3 = r3;
        r4 = r4;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        r7 = 0;
        r1 = r1;
        r2 = r2;
        r3 = r3;
        r4 = r4;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        r7 = 0;
        r1 = r1;
        r2 = r2;
        r3 = r3;
        r4 = r4;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00ca, code lost:
        if (r9 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00d7, code lost:
        if (r9 != null) goto L_0x0061;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1
  assigns: []
  uses: []
  mth insns count: 199
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:13:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARNING: Unknown variable types count: 63 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m22351a(java.lang.String... r9) {
        /*
            r0 = 0
            java.lang.ProcessBuilder r1 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x00cd, Exception -> 0x00c0, all -> 0x00af }
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ IOException -> 0x00cd, Exception -> 0x00c0, all -> 0x00af }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00cd, Exception -> 0x00c0, all -> 0x00af }
            java.lang.ProcessBuilder r9 = r1.command(r9)     // Catch:{ IOException -> 0x00cd, Exception -> 0x00c0, all -> 0x00af }
            java.lang.Process r9 = r9.start()     // Catch:{ IOException -> 0x00cd, Exception -> 0x00c0, all -> 0x00af }
            java.io.OutputStream r1 = r9.getOutputStream()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00ab, all -> 0x00a3 }
            java.io.InputStream r2 = r9.getInputStream()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009f, all -> 0x0098 }
            java.io.InputStream r3 = r9.getErrorStream()     // Catch:{ IOException -> 0x0095, Exception -> 0x0093, all -> 0x008d }
            byte[] r4 = f17595b     // Catch:{ IOException -> 0x008a, Exception -> 0x0087, all -> 0x0081 }
            r1.write(r4)     // Catch:{ IOException -> 0x008a, Exception -> 0x0087, all -> 0x0081 }
            r1.flush()     // Catch:{ IOException -> 0x008a, Exception -> 0x0087, all -> 0x0081 }
            r9.waitFor()     // Catch:{ IOException -> 0x008a, Exception -> 0x0087, all -> 0x0081 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x008a, Exception -> 0x0087, all -> 0x0081 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x008a, Exception -> 0x0087, all -> 0x0081 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x007e, Exception -> 0x007b, all -> 0x0075 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x007e, Exception -> 0x007b, all -> 0x0075 }
            java.lang.String r6 = r5.readLine()     // Catch:{ IOException -> 0x0072, Exception -> 0x006f, all -> 0x006c }
            if (r6 == 0) goto L_0x0054
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0072, Exception -> 0x006f, all -> 0x006c }
            r7.<init>()     // Catch:{ IOException -> 0x0072, Exception -> 0x006f, all -> 0x006c }
            r7.append(r6)     // Catch:{ IOException -> 0x0069, Exception -> 0x0066, all -> 0x006c }
            java.lang.String r6 = f17594a     // Catch:{ IOException -> 0x0069, Exception -> 0x0066, all -> 0x006c }
            r7.append(r6)     // Catch:{ IOException -> 0x0069, Exception -> 0x0066, all -> 0x006c }
        L_0x0045:
            java.lang.String r6 = r5.readLine()     // Catch:{ IOException -> 0x0069, Exception -> 0x0066, all -> 0x006c }
            if (r6 == 0) goto L_0x0055
            r7.append(r6)     // Catch:{ IOException -> 0x0069, Exception -> 0x0066, all -> 0x006c }
            java.lang.String r6 = f17594a     // Catch:{ IOException -> 0x0069, Exception -> 0x0066, all -> 0x006c }
            r7.append(r6)     // Catch:{ IOException -> 0x0069, Exception -> 0x0066, all -> 0x006c }
            goto L_0x0045
        L_0x0054:
            r7 = r0
        L_0x0055:
            byte[] r6 = f17596c     // Catch:{ IOException -> 0x0069, Exception -> 0x0066, all -> 0x006c }
            int r6 = r3.read(r6)     // Catch:{ IOException -> 0x0069, Exception -> 0x0066, all -> 0x006c }
            if (r6 <= 0) goto L_0x005e
            goto L_0x0055
        L_0x005e:
            m22352a(r1, r3, r2, r4, r5)
        L_0x0061:
            m22355c(r9)
            goto L_0x00da
        L_0x0066:
            goto L_0x00c7
        L_0x0069:
            goto L_0x00d4
        L_0x006c:
            r0 = move-exception
            goto L_0x00b7
        L_0x006f:
            r7 = r0
            goto L_0x00c7
        L_0x0072:
            r7 = r0
            goto L_0x00d4
        L_0x0075:
            r5 = move-exception
            r8 = r5
            r5 = r0
            r0 = r8
            goto L_0x00b7
        L_0x007b:
            r5 = r0
            goto L_0x00c6
        L_0x007e:
            r5 = r0
            goto L_0x00d3
        L_0x0081:
            r4 = move-exception
            r5 = r0
            r0 = r4
            r4 = r5
            goto L_0x00b7
        L_0x0087:
            r4 = r0
            goto L_0x00c5
        L_0x008a:
            r4 = r0
            goto L_0x00d2
        L_0x008d:
            r3 = move-exception
            r4 = r0
            r5 = r4
            r0 = r3
            r3 = r5
            goto L_0x00b7
        L_0x0093:
            r3 = r0
            goto L_0x00c4
        L_0x0095:
            r3 = r0
            goto L_0x00d1
        L_0x0098:
            r2 = move-exception
            r3 = r0
            r4 = r3
            r5 = r4
            r0 = r2
            r2 = r5
            goto L_0x00b7
        L_0x009f:
            r2 = r0
            goto L_0x00c3
        L_0x00a1:
            r2 = r0
            goto L_0x00d0
        L_0x00a3:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r0 = r1
            r1 = r5
            goto L_0x00b7
        L_0x00ab:
            r1 = r0
            goto L_0x00c2
        L_0x00ad:
            r1 = r0
            goto L_0x00cf
        L_0x00af:
            r9 = move-exception
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r0 = r9
            r9 = r5
        L_0x00b7:
            m22352a(r1, r3, r2, r4, r5)
            if (r9 == 0) goto L_0x00bf
            m22355c(r9)
        L_0x00bf:
            throw r0
        L_0x00c0:
            r9 = r0
            r1 = r9
        L_0x00c2:
            r2 = r1
        L_0x00c3:
            r3 = r2
        L_0x00c4:
            r4 = r3
        L_0x00c5:
            r5 = r4
        L_0x00c6:
            r7 = r5
        L_0x00c7:
            m22352a(r1, r3, r2, r4, r5)
            if (r9 == 0) goto L_0x00da
            goto L_0x0061
        L_0x00cd:
            r9 = r0
            r1 = r9
        L_0x00cf:
            r2 = r1
        L_0x00d0:
            r3 = r2
        L_0x00d1:
            r4 = r3
        L_0x00d2:
            r5 = r4
        L_0x00d3:
            r7 = r5
        L_0x00d4:
            m22352a(r1, r3, r2, r4, r5)
            if (r9 == 0) goto L_0x00da
            goto L_0x0061
        L_0x00da:
            if (r7 != 0) goto L_0x00dd
            return r0
        L_0x00dd:
            java.lang.String r9 = r7.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.ProcessUtil.m22351a(java.lang.String[]):java.lang.String");
    }

    /* renamed from: b */
    private static int m22354b(Process process) {
        String obj = process.toString();
        try {
            return Integer.parseInt(obj.substring(obj.indexOf("=") + 1, obj.indexOf("]")));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    private static void m22355c(Process process) {
        if (process != null) {
            try {
                if (process.exitValue() != 0) {
                    m22353a(process);
                }
            } catch (IllegalThreadStateException unused) {
                m22353a(process);
            }
        }
    }

    /* renamed from: a */
    private static void m22352a(OutputStream outputStream, InputStream inputStream, InputStream inputStream2, InputStreamReader inputStreamReader, BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused3) {
            }
        }
        if (inputStreamReader != null) {
            try {
                inputStreamReader.close();
            } catch (IOException unused4) {
            }
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused5) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|4|5|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m22353a(java.lang.Process r1) {
        /*
            int r0 = m22354b(r1)
            if (r0 == 0) goto L_0x000d
            android.os.Process.killProcess(r0)     // Catch:{ Exception -> 0x000a }
            goto L_0x000d
        L_0x000a:
            r1.destroy()     // Catch:{ Exception -> 0x000d }
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.ProcessUtil.m22353a(java.lang.Process):void");
    }
}
