package p067c.p068a.p069a.p070a.p072b2;

import com.p259uc.crashsdk.export.LogType;
import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.b2.l */
public final class Ac3Util {

    /* renamed from: a */
    private static final int[] f5524a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f5525b = {48000, 44100, LogType.UNEXP_KNOWN_REASON};

    /* renamed from: c */
    private static final int[] f5526c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f5527d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f5528e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, LogType.UNEXP, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f5529f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: c.a.a.a.b2.l$b */
    /* compiled from: Ac3Util */
    public static final class C0826b {

        /* renamed from: a */
        public final String f5530a;

        /* renamed from: b */
        public final int f5531b;

        /* renamed from: c */
        public final int f5532c;

        /* renamed from: d */
        public final int f5533d;

        /* renamed from: e */
        public final int f5534e;

        /* renamed from: f */
        public final int f5535f;

        private C0826b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f5530a = str;
            this.f5531b = i;
            this.f5533d = i2;
            this.f5532c = i3;
            this.f5534e = i4;
            this.f5535f = i5;
        }
    }

    /* renamed from: a */
    public static int m6625a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((Util.m10245E(byteBuffer, i + 4) & -2) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static int m6626b(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = f5525b;
            if (i < iArr.length && i2 >= 0) {
                int[] iArr2 = f5529f;
                if (i3 < iArr2.length) {
                    int i4 = iArr[i];
                    if (i4 == 44100) {
                        return (iArr2[i3] + (i2 % 2)) * 2;
                    }
                    int i5 = f5528e[i3];
                    return i4 == 32000 ? i5 * 6 : i5 * 4;
                }
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static Format m6627c(ParsableByteArray a0Var, String str, String str2, DrmInitData tVar) {
        int i = f5525b[(a0Var.mo7362D() & 192) >> 6];
        int D = a0Var.mo7362D();
        int i2 = f5527d[(D & 56) >> 3];
        if ((D & 4) != 0) {
            i2++;
        }
        return new C1245b().mo7693S(str).mo7705e0("audio/ac3").mo7682H(i2).mo7706f0(i).mo7686L(tVar).mo7696V(str2).mo7679E();
    }

    /* renamed from: d */
    public static int m6628d(ByteBuffer byteBuffer) {
        int i = 3;
        if (!(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10)) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f5524a[i] * LogType.UNEXP;
    }

    /* renamed from: e */
    public static C0826b m6629e(ParsableBitArray zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ParsableBitArray zVar2 = zVar;
        int e = zVar.mo7492e();
        zVar2.mo7505r(40);
        boolean z = zVar2.mo7495h(5) > 10;
        zVar2.mo7503p(e);
        int i12 = -1;
        if (z) {
            zVar2.mo7505r(16);
            int h = zVar2.mo7495h(2);
            if (h == 0) {
                i12 = 0;
            } else if (h == 1) {
                i12 = 1;
            } else if (h == 2) {
                i12 = 2;
            }
            zVar2.mo7505r(3);
            int h2 = (zVar2.mo7495h(11) + 1) * 2;
            int h3 = zVar2.mo7495h(2);
            if (h3 == 3) {
                i6 = f5526c[zVar2.mo7495h(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = zVar2.mo7495h(2);
                i7 = f5524a[i8];
                i6 = f5525b[h3];
            }
            int i13 = i7 * LogType.UNEXP;
            int h4 = zVar2.mo7495h(3);
            boolean g = zVar.mo7494g();
            int i14 = f5527d[h4] + (g ? 1 : 0);
            zVar2.mo7505r(10);
            if (zVar.mo7494g()) {
                zVar2.mo7505r(8);
            }
            if (h4 == 0) {
                zVar2.mo7505r(5);
                if (zVar.mo7494g()) {
                    zVar2.mo7505r(8);
                }
            }
            if (i12 == 1 && zVar.mo7494g()) {
                zVar2.mo7505r(16);
            }
            if (zVar.mo7494g()) {
                if (h4 > 2) {
                    zVar2.mo7505r(2);
                }
                if ((h4 & 1) == 0 || h4 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    zVar2.mo7505r(6);
                }
                if ((h4 & 4) != 0) {
                    zVar2.mo7505r(i10);
                }
                if (g && zVar.mo7494g()) {
                    zVar2.mo7505r(5);
                }
                if (i12 == 0) {
                    if (zVar.mo7494g()) {
                        i11 = 6;
                        zVar2.mo7505r(6);
                    } else {
                        i11 = 6;
                    }
                    if (h4 == 0 && zVar.mo7494g()) {
                        zVar2.mo7505r(i11);
                    }
                    if (zVar.mo7494g()) {
                        zVar2.mo7505r(i11);
                    }
                    int h5 = zVar2.mo7495h(2);
                    if (h5 == 1) {
                        zVar2.mo7505r(5);
                    } else if (h5 == 2) {
                        zVar2.mo7505r(12);
                    } else if (h5 == 3) {
                        int h6 = zVar2.mo7495h(5);
                        if (zVar.mo7494g()) {
                            zVar2.mo7505r(5);
                            if (zVar.mo7494g()) {
                                zVar2.mo7505r(4);
                            }
                            if (zVar.mo7494g()) {
                                zVar2.mo7505r(4);
                            }
                            if (zVar.mo7494g()) {
                                zVar2.mo7505r(4);
                            }
                            if (zVar.mo7494g()) {
                                zVar2.mo7505r(4);
                            }
                            if (zVar.mo7494g()) {
                                zVar2.mo7505r(4);
                            }
                            if (zVar.mo7494g()) {
                                zVar2.mo7505r(4);
                            }
                            if (zVar.mo7494g()) {
                                zVar2.mo7505r(4);
                            }
                            if (zVar.mo7494g()) {
                                if (zVar.mo7494g()) {
                                    zVar2.mo7505r(4);
                                }
                                if (zVar.mo7494g()) {
                                    zVar2.mo7505r(4);
                                }
                            }
                        }
                        if (zVar.mo7494g()) {
                            zVar2.mo7505r(5);
                            if (zVar.mo7494g()) {
                                zVar2.mo7505r(7);
                                if (zVar.mo7494g()) {
                                    zVar2.mo7505r(8);
                                }
                            }
                        }
                        zVar2.mo7505r((h6 + 2) * 8);
                        zVar.mo7490c();
                    }
                    if (h4 < 2) {
                        if (zVar.mo7494g()) {
                            zVar2.mo7505r(14);
                        }
                        if (h4 == 0 && zVar.mo7494g()) {
                            zVar2.mo7505r(14);
                        }
                    }
                    if (zVar.mo7494g()) {
                        if (i8 == 0) {
                            zVar2.mo7505r(5);
                        } else {
                            for (int i15 = 0; i15 < i7; i15++) {
                                if (zVar.mo7494g()) {
                                    zVar2.mo7505r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (zVar.mo7494g()) {
                zVar2.mo7505r(5);
                if (h4 == 2) {
                    zVar2.mo7505r(4);
                }
                if (h4 >= 6) {
                    zVar2.mo7505r(2);
                }
                if (zVar.mo7494g()) {
                    zVar2.mo7505r(8);
                }
                if (h4 == 0 && zVar.mo7494g()) {
                    zVar2.mo7505r(8);
                }
                if (h3 < 3) {
                    zVar.mo7504q();
                }
            }
            if (i12 == 0 && i8 != 3) {
                zVar.mo7504q();
            }
            if (i12 != 2 || (i8 != 3 && !zVar.mo7494g())) {
                i9 = 6;
            } else {
                i9 = 6;
                zVar2.mo7505r(6);
            }
            str = (zVar.mo7494g() && zVar2.mo7495h(i9) == 1 && zVar2.mo7495h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i = i13;
            i2 = h2;
            i3 = i6;
            i4 = i14;
        } else {
            zVar2.mo7505r(32);
            int h7 = zVar2.mo7495h(2);
            String str2 = h7 == 3 ? null : "audio/ac3";
            int b = m6626b(h7, zVar2.mo7495h(6));
            zVar2.mo7505r(8);
            int h8 = zVar2.mo7495h(3);
            if (!((h8 & 1) == 0 || h8 == 1)) {
                zVar2.mo7505r(2);
            }
            if ((h8 & 4) != 0) {
                zVar2.mo7505r(2);
            }
            if (h8 == 2) {
                zVar2.mo7505r(2);
            }
            int[] iArr = f5525b;
            str = str2;
            i2 = b;
            i3 = h7 < iArr.length ? iArr[h7] : -1;
            i4 = f5527d[h8] + (zVar.mo7494g() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        C0826b bVar = new C0826b(str, i5, i4, i3, i2, i);
        return bVar;
    }

    /* renamed from: f */
    public static int m6630f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 248) >> 3) > 10)) {
            return m6626b((bArr[4] & 192) >> 6, bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    /* renamed from: g */
    public static Format m6631g(ParsableByteArray a0Var, String str, String str2, DrmInitData tVar) {
        a0Var.mo7375Q(2);
        int i = f5525b[(a0Var.mo7362D() & 192) >> 6];
        int D = a0Var.mo7362D();
        int i2 = f5527d[(D & 14) >> 1];
        if ((D & 1) != 0) {
            i2++;
        }
        if (((a0Var.mo7362D() & 30) >> 1) > 0 && (2 & a0Var.mo7362D()) != 0) {
            i2 += 2;
        }
        return new C1245b().mo7693S(str).mo7705e0((a0Var.mo7376a() <= 0 || (a0Var.mo7362D() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").mo7682H(i2).mo7706f0(i).mo7686L(tVar).mo7696V(str2).mo7679E();
    }

    /* renamed from: h */
    public static int m6632h(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* renamed from: i */
    public static int m6633i(byte[] bArr) {
        boolean z = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z = true;
        }
        return 40 << ((bArr[z ? (char) 9 : 8] >> 4) & 7);
    }
}
