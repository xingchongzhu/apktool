package p067c.p068a.p069a.p070a.p072b2;

import com.p259uc.crashsdk.export.LogType;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;

/* renamed from: c.a.a.a.b2.k */
public final class AacUtil {

    /* renamed from: a */
    private static final int[] f5519a = {96000, 88200, 64000, 48000, 44100, LogType.UNEXP_KNOWN_REASON, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f5520b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c.a.a.a.b2.k$b */
    /* compiled from: AacUtil */
    public static final class C0824b {

        /* renamed from: a */
        public final int f5521a;

        /* renamed from: b */
        public final int f5522b;

        /* renamed from: c */
        public final String f5523c;

        private C0824b(int i, int i2, String str) {
            this.f5521a = i;
            this.f5522b = i2;
            this.f5523c = str;
        }
    }

    /* renamed from: a */
    public static byte[] m6618a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: b */
    private static int m6619b(ParsableBitArray zVar) {
        int h = zVar.mo7495h(5);
        return h == 31 ? zVar.mo7495h(6) + 32 : h;
    }

    /* renamed from: c */
    public static int m6620c(int i) {
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    /* renamed from: d */
    private static int m6621d(ParsableBitArray zVar) throws ParserException {
        int h = zVar.mo7495h(4);
        if (h == 15) {
            return zVar.mo7495h(24);
        }
        if (h < 13) {
            return f5519a[h];
        }
        throw new ParserException();
    }

    /* renamed from: e */
    public static C0824b m6622e(ParsableBitArray zVar, boolean z) throws ParserException {
        int b = m6619b(zVar);
        int d = m6621d(zVar);
        int h = zVar.mo7495h(4);
        StringBuilder sb = new StringBuilder();
        sb.append("mp4a.40.");
        sb.append(b);
        String sb2 = sb.toString();
        if (b == 5 || b == 29) {
            d = m6621d(zVar);
            b = m6619b(zVar);
            if (b == 22) {
                h = zVar.mo7495h(4);
            }
        }
        if (z) {
            if (!(b == 1 || b == 2 || b == 3 || b == 4 || b == 6 || b == 7 || b == 17)) {
                switch (b) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Unsupported audio object type: ");
                        sb3.append(b);
                        throw new ParserException(sb3.toString());
                }
            }
            m6624g(zVar, b, h);
            switch (b) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h2 = zVar.mo7495h(2);
                    if (h2 == 2 || h2 == 3) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Unsupported epConfig: ");
                        sb4.append(h2);
                        throw new ParserException(sb4.toString());
                    }
            }
        }
        int i = f5520b[h];
        if (i != -1) {
            return new C0824b(d, i, sb2);
        }
        throw new ParserException();
    }

    /* renamed from: f */
    public static C0824b m6623f(byte[] bArr) throws ParserException {
        return m6622e(new ParsableBitArray(bArr), false);
    }

    /* renamed from: g */
    private static void m6624g(ParsableBitArray zVar, int i, int i2) {
        if (zVar.mo7494g()) {
            Log.m10386h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (zVar.mo7494g()) {
            zVar.mo7505r(14);
        }
        boolean g = zVar.mo7494g();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                zVar.mo7505r(3);
            }
            if (g) {
                if (i == 22) {
                    zVar.mo7505r(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    zVar.mo7505r(3);
                }
                zVar.mo7505r(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
