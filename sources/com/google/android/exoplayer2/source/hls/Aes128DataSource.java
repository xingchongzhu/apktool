package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C1916m;
import com.google.android.exoplayer2.upstream.DataSourceInputStream;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: com.google.android.exoplayer2.source.hls.d */
class Aes128DataSource implements C1916m {

    /* renamed from: b */
    private final C1916m f11561b;

    /* renamed from: c */
    private final byte[] f11562c;

    /* renamed from: d */
    private final byte[] f11563d;

    /* renamed from: e */
    private CipherInputStream f11564e;

    public Aes128DataSource(C1916m mVar, byte[] bArr, byte[] bArr2) {
        this.f11561b = mVar;
        this.f11562c = bArr;
        this.f11563d = bArr2;
    }

    /* renamed from: b */
    public final int mo6195b(byte[] bArr, int i, int i2) throws IOException {
        Assertions.m10153e(this.f11564e);
        int read = this.f11564e.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    public void close() throws IOException {
        if (this.f11564e != null) {
            this.f11564e = null;
            this.f11561b.close();
        }
    }

    /* renamed from: e */
    public final long mo7015e(DataSpec pVar) throws IOException {
        try {
            Cipher r = mo14565r();
            try {
                r.init(2, new SecretKeySpec(this.f11562c, "AES"), new IvParameterSpec(this.f11563d));
                DataSourceInputStream oVar = new DataSourceInputStream(this.f11561b, pVar);
                this.f11564e = new CipherInputStream(oVar, r);
                oVar.mo14940C();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: g */
    public final Map<String, List<String>> mo7016g() {
        return this.f11561b.mo7016g();
    }

    /* renamed from: k */
    public final void mo7017k(TransferListener e0Var) {
        Assertions.m10153e(e0Var);
        this.f11561b.mo7017k(e0Var);
    }

    /* renamed from: l */
    public final Uri mo7018l() {
        return this.f11561b.mo7018l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Cipher mo14565r() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }
}
