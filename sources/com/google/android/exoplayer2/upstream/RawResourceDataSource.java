package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import p067c.p068a.p069a.p070a.p111m2.Util;

public final class RawResourceDataSource extends BaseDataSource {

    /* renamed from: f */
    private final Resources f12255f;

    /* renamed from: g */
    private final String f12256g;

    /* renamed from: h */
    private Uri f12257h;

    /* renamed from: i */
    private AssetFileDescriptor f12258i;

    /* renamed from: j */
    private InputStream f12259j;

    /* renamed from: k */
    private long f12260k;

    /* renamed from: l */
    private boolean f12261l;

    /* renamed from: com.google.android.exoplayer2.upstream.RawResourceDataSource$a */
    public static class C1894a extends IOException {
        public C1894a(String str) {
            super(str);
        }

        public C1894a(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f12255f = context.getResources();
        this.f12256g = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    /* renamed from: b */
    public int mo6195b(byte[] bArr, int i, int i2) throws C1894a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f12260k;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C1894a(e);
            }
        }
        int read = ((InputStream) Util.m10293i(this.f12259j)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f12260k;
            if (j2 != -1) {
                this.f12260k = j2 - ((long) read);
            }
            mo14935r(read);
            return read;
        } else if (this.f12260k == -1) {
            return -1;
        } else {
            throw new C1894a((IOException) new EOFException());
        }
    }

    public void close() throws C1894a {
        this.f12257h = null;
        try {
            InputStream inputStream = this.f12259j;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f12259j = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f12258i;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f12258i = null;
                if (this.f12261l) {
                    this.f12261l = false;
                    mo14936s();
                }
            } catch (IOException e) {
                throw new C1894a(e);
            } catch (Throwable th) {
                this.f12258i = null;
                if (this.f12261l) {
                    this.f12261l = false;
                    mo14936s();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C1894a(e2);
        } catch (Throwable th2) {
            this.f12259j = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f12258i;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f12258i = null;
                if (this.f12261l) {
                    this.f12261l = false;
                    mo14936s();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C1894a(e3);
            } catch (Throwable th3) {
                this.f12258i = null;
                if (this.f12261l) {
                    this.f12261l = false;
                    mo14936s();
                }
                throw th3;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo7015e(com.google.android.exoplayer2.upstream.DataSpec r8) throws com.google.android.exoplayer2.upstream.RawResourceDataSource.C1894a {
        /*
            r7 = this;
            android.net.Uri r0 = r8.f12345a
            r7.f12257h = r0
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "rawresource"
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            r2 = 1
            if (r1 != 0) goto L_0x00a4
            java.lang.String r1 = r0.getScheme()
            java.lang.String r3 = "android.resource"
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x003a
            java.util.List r1 = r0.getPathSegments()
            int r1 = r1.size()
            if (r1 != r2) goto L_0x003a
            java.lang.String r1 = r0.getLastPathSegment()
            java.lang.Object r1 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = "\\d+"
            boolean r1 = r1.matches(r4)
            if (r1 == 0) goto L_0x003a
            goto L_0x00a4
        L_0x003a:
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x009c
            java.lang.String r1 = r0.getPath()
            java.lang.Object r1 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "/"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x005a
            java.lang.String r1 = r1.substring(r2)
        L_0x005a:
            java.lang.String r3 = r0.getHost()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x006c
            java.lang.String r3 = ""
            goto L_0x007d
        L_0x006c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = ":"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L_0x007d:
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.content.res.Resources r3 = r7.f12255f
            java.lang.String r4 = r7.f12256g
            java.lang.String r5 = "raw"
            int r1 = r3.getIdentifier(r1, r5, r4)
            if (r1 == 0) goto L_0x0094
            goto L_0x00b2
        L_0x0094:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$a r8 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$a
            java.lang.String r0 = "Resource not found."
            r8.<init>(r0)
            throw r8
        L_0x009c:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$a r8 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$a
            java.lang.String r0 = "URI must either use scheme rawresource or android.resource"
            r8.<init>(r0)
            throw r8
        L_0x00a4:
            java.lang.String r1 = r0.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x0123 }
            java.lang.Object r1 = p067c.p068a.p069a.p070a.p111m2.Assertions.m10153e(r1)     // Catch:{ NumberFormatException -> 0x0123 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x0123 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0123 }
        L_0x00b2:
            r7.mo14937t(r8)
            android.content.res.Resources r3 = r7.f12255f
            android.content.res.AssetFileDescriptor r1 = r3.openRawResourceFd(r1)
            r7.f12258i = r1
            if (r1 == 0) goto L_0x010c
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.FileDescriptor r3 = r1.getFileDescriptor()
            r0.<init>(r3)
            r7.f12259j = r0
            long r3 = r1.getStartOffset()     // Catch:{ IOException -> 0x0105 }
            r0.skip(r3)     // Catch:{ IOException -> 0x0105 }
            long r3 = r8.f12351g     // Catch:{ IOException -> 0x0105 }
            long r3 = r0.skip(r3)     // Catch:{ IOException -> 0x0105 }
            long r5 = r8.f12351g     // Catch:{ IOException -> 0x0105 }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00ff
            long r3 = r8.f12352h
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00e8
            r7.f12260k = r3
            goto L_0x00f7
        L_0x00e8:
            long r0 = r1.getLength()
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00f1
            goto L_0x00f5
        L_0x00f1:
            long r3 = r8.f12351g
            long r5 = r0 - r3
        L_0x00f5:
            r7.f12260k = r5
        L_0x00f7:
            r7.f12261l = r2
            r7.mo14938u(r8)
            long r0 = r7.f12260k
            return r0
        L_0x00ff:
            java.io.EOFException r8 = new java.io.EOFException     // Catch:{ IOException -> 0x0105 }
            r8.<init>()     // Catch:{ IOException -> 0x0105 }
            throw r8     // Catch:{ IOException -> 0x0105 }
        L_0x0105:
            r8 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$a r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$a
            r0.<init>(r8)
            throw r0
        L_0x010c:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$a r8 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Resource is compressed: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        L_0x0123:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$a r8 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$a
            java.lang.String r0 = "Resource identifier must be an integer."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.mo7015e(com.google.android.exoplayer2.upstream.p):long");
    }

    /* renamed from: l */
    public Uri mo7018l() {
        return this.f12257h;
    }
}
