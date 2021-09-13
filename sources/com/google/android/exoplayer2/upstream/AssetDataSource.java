package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.upstream.f */
public final class AssetDataSource extends BaseDataSource {

    /* renamed from: f */
    private final AssetManager f12305f;

    /* renamed from: g */
    private Uri f12306g;

    /* renamed from: h */
    private InputStream f12307h;

    /* renamed from: i */
    private long f12308i;

    /* renamed from: j */
    private boolean f12309j;

    /* renamed from: com.google.android.exoplayer2.upstream.f$a */
    /* compiled from: AssetDataSource */
    public static final class C1909a extends IOException {
        public C1909a(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f12305f = context.getAssets();
    }

    /* renamed from: b */
    public int mo6195b(byte[] bArr, int i, int i2) throws C1909a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f12308i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C1909a(e);
            }
        }
        int read = ((InputStream) Util.m10293i(this.f12307h)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f12308i;
            if (j2 != -1) {
                this.f12308i = j2 - ((long) read);
            }
            mo14935r(read);
            return read;
        } else if (this.f12308i == -1) {
            return -1;
        } else {
            throw new C1909a(new EOFException());
        }
    }

    public void close() throws C1909a {
        this.f12306g = null;
        try {
            InputStream inputStream = this.f12307h;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f12307h = null;
            if (this.f12309j) {
                this.f12309j = false;
                mo14936s();
            }
        } catch (IOException e) {
            throw new C1909a(e);
        } catch (Throwable th) {
            this.f12307h = null;
            if (this.f12309j) {
                this.f12309j = false;
                mo14936s();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public long mo7015e(DataSpec pVar) throws C1909a {
        try {
            Uri uri = pVar.f12345a;
            this.f12306g = uri;
            String str = (String) Assertions.m10153e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            mo14937t(pVar);
            InputStream open = this.f12305f.open(str, 1);
            this.f12307h = open;
            if (open.skip(pVar.f12351g) >= pVar.f12351g) {
                long j = pVar.f12352h;
                if (j != -1) {
                    this.f12308i = j;
                } else {
                    long available = (long) this.f12307h.available();
                    this.f12308i = available;
                    if (available == 2147483647L) {
                        this.f12308i = -1;
                    }
                }
                this.f12309j = true;
                mo14938u(pVar);
                return this.f12308i;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C1909a(e);
        }
    }

    /* renamed from: l */
    public Uri mo7018l() {
        return this.f12306g;
    }
}
