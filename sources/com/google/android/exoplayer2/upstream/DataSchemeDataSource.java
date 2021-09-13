package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p135a.Charsets;

/* renamed from: com.google.android.exoplayer2.upstream.k */
public final class DataSchemeDataSource extends BaseDataSource {

    /* renamed from: f */
    private DataSpec f12334f;

    /* renamed from: g */
    private byte[] f12335g;

    /* renamed from: h */
    private int f12336h;

    /* renamed from: i */
    private int f12337i;

    public DataSchemeDataSource() {
        super(false);
    }

    /* renamed from: b */
    public int mo6195b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f12336h - this.f12337i;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(Util.m10293i(this.f12335g), this.f12337i, bArr, i, min);
        this.f12337i += min;
        mo14935r(min);
        return min;
    }

    public void close() {
        if (this.f12335g != null) {
            this.f12335g = null;
            mo14936s();
        }
        this.f12334f = null;
    }

    /* renamed from: e */
    public long mo7015e(DataSpec pVar) throws IOException {
        mo14937t(pVar);
        this.f12334f = pVar;
        this.f12337i = (int) pVar.f12351g;
        Uri uri = pVar.f12345a;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] D0 = Util.m10244D0(uri.getSchemeSpecificPart(), ",");
            if (D0.length == 2) {
                String str = D0[1];
                if (D0[0].contains(";base64")) {
                    try {
                        this.f12335g = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error while parsing Base64 encoded string: ");
                        sb.append(str);
                        throw new ParserException(sb.toString(), e);
                    }
                } else {
                    this.f12335g = Util.m10290g0(URLDecoder.decode(str, Charsets.f9741a.name()));
                }
                long j = pVar.f12352h;
                int length = j != -1 ? ((int) j) + this.f12337i : this.f12335g.length;
                this.f12336h = length;
                if (length > this.f12335g.length || this.f12337i > length) {
                    this.f12335g = null;
                    throw new DataSourceException(0);
                }
                mo14938u(pVar);
                return ((long) this.f12336h) - ((long) this.f12337i);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected URI format: ");
            sb2.append(uri);
            throw new ParserException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unsupported scheme: ");
        sb3.append(scheme);
        throw new ParserException(sb3.toString());
    }

    /* renamed from: l */
    public Uri mo7018l() {
        DataSpec pVar = this.f12334f;
        if (pVar != null) {
            return pVar.f12345a;
        }
        return null;
    }
}
