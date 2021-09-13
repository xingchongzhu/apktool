package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.upstream.w */
public final class FileDataSource extends BaseDataSource {

    /* renamed from: f */
    private RandomAccessFile f12444f;

    /* renamed from: g */
    private Uri f12445g;

    /* renamed from: h */
    private long f12446h;

    /* renamed from: i */
    private boolean f12447i;

    /* renamed from: com.google.android.exoplayer2.upstream.w$a */
    /* compiled from: FileDataSource */
    public static class C1925a extends IOException {
        public C1925a(IOException iOException) {
            super(iOException);
        }

        public C1925a(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public FileDataSource() {
        super(false);
    }

    /* renamed from: v */
    private static RandomAccessFile m15172v(Uri uri) throws C1925a {
        try {
            return new RandomAccessFile((String) Assertions.m10153e(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new C1925a(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e);
            }
            throw new C1925a(e);
        }
    }

    /* renamed from: b */
    public int mo6195b(byte[] bArr, int i, int i2) throws C1925a {
        if (i2 == 0) {
            return 0;
        }
        if (this.f12446h == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) Util.m10293i(this.f12444f)).read(bArr, i, (int) Math.min(this.f12446h, (long) i2));
            if (read > 0) {
                this.f12446h -= (long) read;
                mo14935r(read);
            }
            return read;
        } catch (IOException e) {
            throw new C1925a(e);
        }
    }

    public void close() throws C1925a {
        this.f12445g = null;
        try {
            RandomAccessFile randomAccessFile = this.f12444f;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f12444f = null;
            if (this.f12447i) {
                this.f12447i = false;
                mo14936s();
            }
        } catch (IOException e) {
            throw new C1925a(e);
        } catch (Throwable th) {
            this.f12444f = null;
            if (this.f12447i) {
                this.f12447i = false;
                mo14936s();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public long mo7015e(DataSpec pVar) throws C1925a {
        try {
            Uri uri = pVar.f12345a;
            this.f12445g = uri;
            mo14937t(pVar);
            RandomAccessFile v = m15172v(uri);
            this.f12444f = v;
            v.seek(pVar.f12351g);
            long j = pVar.f12352h;
            if (j == -1) {
                j = this.f12444f.length() - pVar.f12351g;
            }
            this.f12446h = j;
            if (j >= 0) {
                this.f12447i = true;
                mo14938u(pVar);
                return this.f12446h;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C1925a(e);
        }
    }

    /* renamed from: l */
    public Uri mo7018l() {
        return this.f12445g;
    }
}
