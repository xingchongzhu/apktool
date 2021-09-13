package com.bumptech.glide.load.data.p151o;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.data.o.e */
class ThumbnailStreamOpener {

    /* renamed from: a */
    private static final FileService f10328a = new FileService();

    /* renamed from: b */
    private final FileService f10329b;

    /* renamed from: c */
    private final ThumbnailQuery f10330c;

    /* renamed from: d */
    private final ArrayPool f10331d;

    /* renamed from: e */
    private final ContentResolver f10332e;

    /* renamed from: f */
    private final List<ImageHeaderParser> f10333f;

    ThumbnailStreamOpener(List<ImageHeaderParser> list, ThumbnailQuery dVar, ArrayPool bVar, ContentResolver contentResolver) {
        this(list, f10328a, dVar, bVar, contentResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002d A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m12584b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            com.bumptech.glide.load.data.o.d r2 = r6.f10330c     // Catch:{ SecurityException -> 0x0024, all -> 0x0022 }
            android.database.Cursor r2 = r2.mo8821a(r7)     // Catch:{ SecurityException -> 0x0024, all -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            boolean r3 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x001a }
            if (r3 == 0) goto L_0x001c
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch:{ SecurityException -> 0x001a }
            r2.close()
            return r7
        L_0x001a:
            r3 = move-exception
            goto L_0x0026
        L_0x001c:
            if (r2 == 0) goto L_0x0021
            r2.close()
        L_0x0021:
            return r1
        L_0x0022:
            r7 = move-exception
            goto L_0x0049
        L_0x0024:
            r3 = move-exception
            r2 = r1
        L_0x0026:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0041
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r4.<init>()     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch:{ all -> 0x0047 }
            r4.append(r7)     // Catch:{ all -> 0x0047 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0047 }
            android.util.Log.d(r0, r7, r3)     // Catch:{ all -> 0x0047 }
        L_0x0041:
            if (r2 == 0) goto L_0x0046
            r2.close()
        L_0x0046:
            return r1
        L_0x0047:
            r7 = move-exception
            r1 = r2
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()
        L_0x004e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.p151o.ThumbnailStreamOpener.m12584b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    private boolean m12585c(File file) {
        return this.f10329b.mo8818a(file) && 0 < this.f10329b.mo8820c(file);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo8822a(Uri uri) {
        String str = "ThumbStreamOpener";
        InputStream inputStream = null;
        try {
            inputStream = this.f10332e.openInputStream(uri);
            int b = ImageHeaderParserUtils.m12589b(this.f10333f, inputStream, this.f10331d);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return b;
        } catch (IOException | NullPointerException e) {
            inputStream = Log.isLoggable(str, 3);
            if (inputStream) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to open uri: ");
                sb.append(uri);
                Log.d(str, sb.toString(), e);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            return -1;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    /* renamed from: d */
    public InputStream mo8823d(Uri uri) throws FileNotFoundException {
        String b = m12584b(uri);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        File b2 = this.f10329b.mo8819b(b);
        if (!m12585c(b2)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b2);
        try {
            return this.f10332e.openInputStream(fromFile);
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("NPE opening uri: ");
            sb.append(uri);
            sb.append(" -> ");
            sb.append(fromFile);
            throw ((FileNotFoundException) new FileNotFoundException(sb.toString()).initCause(e));
        }
    }

    ThumbnailStreamOpener(List<ImageHeaderParser> list, FileService aVar, ThumbnailQuery dVar, ArrayPool bVar, ContentResolver contentResolver) {
        this.f10329b = aVar;
        this.f10330c = dVar;
        this.f10331d = bVar;
        this.f10332e = contentResolver;
        this.f10333f = list;
    }
}
