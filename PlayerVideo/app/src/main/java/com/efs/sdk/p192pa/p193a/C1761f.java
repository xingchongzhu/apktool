package com.efs.sdk.p192pa.p193a;

import android.util.Log;
import com.efs.sdk.p192pa.C1764b;
import com.efs.sdk.p192pa.PAMsgListener;
import java.io.BufferedOutputStream;

/* renamed from: com.efs.sdk.pa.a.f */
final class C1761f implements C1759d {

    /* renamed from: a */
    PAMsgListener f11491a;

    /* renamed from: b */
    boolean f11492b;

    /* renamed from: c */
    String f11493c;

    /* renamed from: d */
    BufferedOutputStream f11494d;

    C1761f() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036 A[SYNTHETIC, Splitter:B:17:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095 A[Catch:{ Exception -> 0x00ac }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.efs.sdk.p192pa.C1764b m14341b(String r9, long r10, long r12) {
        /*
            java.lang.String r0 = ")"
            java.lang.String r1 = "{"
            java.lang.String r2 = "("
            r3 = 0
            if (r9 != 0) goto L_0x000a
            return r3
        L_0x000a:
            com.efs.sdk.pa.b r4 = new com.efs.sdk.pa.b
            r4.<init>()
            java.lang.String r5 = ":"
            int r5 = r9.indexOf(r5)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r6 = ""
            r7 = -1
            if (r5 == r7) goto L_0x002b
            int r5 = r5 + 2
            int r8 = r9.length()     // Catch:{ Exception -> 0x00ac }
            if (r5 >= r8) goto L_0x002b
            int r8 = r9.length()     // Catch:{ Exception -> 0x00ac }
            java.lang.String r5 = r9.substring(r5, r8)     // Catch:{ Exception -> 0x00ac }
            goto L_0x002c
        L_0x002b:
            r5 = r6
        L_0x002c:
            r4.f11498a = r5     // Catch:{ Exception -> 0x00ac }
            boolean r5 = r9.contains(r2)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r8 = "}"
            if (r5 == 0) goto L_0x0057
            boolean r5 = r9.contains(r0)     // Catch:{ Exception -> 0x00ac }
            if (r5 == 0) goto L_0x0057
            int r1 = r9.indexOf(r2)     // Catch:{ Exception -> 0x00ac }
            int r0 = r9.indexOf(r0)     // Catch:{ Exception -> 0x00ac }
            if (r1 == r7) goto L_0x007e
            if (r0 == r7) goto L_0x007e
            int r1 = r1 + 1
            int r2 = r9.length()     // Catch:{ Exception -> 0x00ac }
            if (r1 >= r2) goto L_0x007e
            if (r0 <= r1) goto L_0x007e
            java.lang.String r0 = r9.substring(r1, r0)     // Catch:{ Exception -> 0x00ac }
            goto L_0x007f
        L_0x0057:
            boolean r0 = r9.contains(r1)     // Catch:{ Exception -> 0x00ac }
            if (r0 == 0) goto L_0x007e
            boolean r0 = r9.contains(r8)     // Catch:{ Exception -> 0x00ac }
            if (r0 == 0) goto L_0x007e
            int r0 = r9.indexOf(r1)     // Catch:{ Exception -> 0x00ac }
            int r1 = r9.indexOf(r8)     // Catch:{ Exception -> 0x00ac }
            if (r0 == r7) goto L_0x007e
            if (r1 == r7) goto L_0x007e
            int r0 = r0 + 1
            int r2 = r9.length()     // Catch:{ Exception -> 0x00ac }
            if (r0 >= r2) goto L_0x007e
            if (r1 <= r0) goto L_0x007e
            java.lang.String r0 = r9.substring(r0, r1)     // Catch:{ Exception -> 0x00ac }
            goto L_0x007f
        L_0x007e:
            r0 = r6
        L_0x007f:
            r4.f11499b = r0     // Catch:{ Exception -> 0x00ac }
            java.lang.String r0 = "null"
            boolean r0 = r9.contains(r0)     // Catch:{ Exception -> 0x00ac }
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r9.contains(r8)     // Catch:{ Exception -> 0x00ac }
            if (r0 == 0) goto L_0x00a5
            int r0 = r9.lastIndexOf(r8)     // Catch:{ Exception -> 0x00ac }
            if (r0 == r7) goto L_0x00a5
            int r0 = r0 + 1
            int r1 = r9.length()     // Catch:{ Exception -> 0x00ac }
            if (r0 >= r1) goto L_0x00a5
            int r1 = r9.length()     // Catch:{ Exception -> 0x00ac }
            java.lang.String r6 = r9.substring(r0, r1)     // Catch:{ Exception -> 0x00ac }
        L_0x00a5:
            r4.f11500c = r6     // Catch:{ Exception -> 0x00ac }
            r4.f11501d = r10
            r4.f11502e = r12
            return r4
        L_0x00ac:
            r9 = move-exception
            r9.printStackTrace()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.p192pa.p193a.C1761f.m14341b(java.lang.String, long, long):com.efs.sdk.pa.b");
    }

    /* renamed from: a */
    public final void mo9829a(String str, long j, long j2) {
        C1764b b = m14341b(str, j, j2);
        if (b != null) {
            if (this.f11492b) {
                Log.e("PerformanceAnalyze", b.toString());
            }
            if (this.f11493c != null) {
                try {
                    BufferedOutputStream bufferedOutputStream = this.f11494d;
                    StringBuilder sb = new StringBuilder();
                    sb.append(b.toString());
                    sb.append("\n");
                    bufferedOutputStream.write(sb.toString().getBytes());
                } catch (Exception unused) {
                }
            }
            this.f11491a.msg(b);
        }
    }
}
