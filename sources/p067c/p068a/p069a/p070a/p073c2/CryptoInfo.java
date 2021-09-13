package p067c.p068a.p069a.p070a.p073c2;

import android.media.MediaCodec.CryptoInfo.Pattern;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.c2.b */
public final class CryptoInfo {

    /* renamed from: a */
    public byte[] f5720a;

    /* renamed from: b */
    public byte[] f5721b;

    /* renamed from: c */
    public int f5722c;

    /* renamed from: d */
    public int[] f5723d;

    /* renamed from: e */
    public int[] f5724e;

    /* renamed from: f */
    public int f5725f;

    /* renamed from: g */
    public int f5726g;

    /* renamed from: h */
    public int f5727h;

    /* renamed from: i */
    private final android.media.MediaCodec.CryptoInfo f5728i;

    /* renamed from: j */
    private final C0853b f5729j;

    /* renamed from: c.a.a.a.c2.b$b */
    /* compiled from: CryptoInfo */
    private static final class C0853b {

        /* renamed from: a */
        private final android.media.MediaCodec.CryptoInfo f5730a;

        /* renamed from: b */
        private final Pattern f5731b;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m6898b(int i, int i2) {
            this.f5731b.set(i, i2);
            this.f5730a.setPattern(this.f5731b);
        }

        private C0853b(android.media.MediaCodec.CryptoInfo cryptoInfo) {
            this.f5730a = cryptoInfo;
            this.f5731b = new Pattern(0, 0);
        }
    }

    public CryptoInfo() {
        android.media.MediaCodec.CryptoInfo cryptoInfo = new android.media.MediaCodec.CryptoInfo();
        this.f5728i = cryptoInfo;
        C0853b bVar = null;
        if (Util.f8398a >= 24) {
            bVar = new C0853b(cryptoInfo);
        }
        this.f5729j = bVar;
    }

    /* renamed from: a */
    public android.media.MediaCodec.CryptoInfo mo5955a() {
        return this.f5728i;
    }

    /* renamed from: b */
    public void mo5956b(int i) {
        if (i != 0) {
            if (this.f5723d == null) {
                int[] iArr = new int[1];
                this.f5723d = iArr;
                this.f5728i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f5723d;
            iArr2[0] = iArr2[0] + i;
        }
    }

    /* renamed from: c */
    public void mo5957c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f5725f = i;
        this.f5723d = iArr;
        this.f5724e = iArr2;
        this.f5721b = bArr;
        this.f5720a = bArr2;
        this.f5722c = i2;
        this.f5726g = i3;
        this.f5727h = i4;
        android.media.MediaCodec.CryptoInfo cryptoInfo = this.f5728i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (Util.f8398a >= 24) {
            ((C0853b) Assertions.m10153e(this.f5729j)).m6898b(i3, i4);
        }
    }
}
