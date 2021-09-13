package p067c.p068a.p069a.p070a.p076f2.p083k0;

import p067c.p068a.p069a.p070a.p076f2.C0916b0.C0917a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;

/* renamed from: c.a.a.a.f2.k0.p */
public final class TrackEncryptionBox {

    /* renamed from: a */
    public final boolean f6477a;

    /* renamed from: b */
    public final String f6478b;

    /* renamed from: c */
    public final C0917a f6479c;

    /* renamed from: d */
    public final int f6480d;

    /* renamed from: e */
    public final byte[] f6481e;

    public TrackEncryptionBox(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2 = true;
        boolean z3 = i == 0;
        if (bArr2 != null) {
            z2 = false;
        }
        Assertions.m10149a(z2 ^ z3);
        this.f6477a = z;
        this.f6478b = str;
        this.f6480d = i;
        this.f6481e = bArr2;
        this.f6479c = new C0917a(m7844a(str), bArr, i2, i3);
    }

    /* renamed from: a */
    private static int m7844a(String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported protection scheme type '");
                sb.append(str);
                sb.append("'. Assuming AES-CTR crypto mode.");
                Log.m10386h("TrackEncryptionBox", sb.toString());
                break;
        }
        return 1;
    }
}
