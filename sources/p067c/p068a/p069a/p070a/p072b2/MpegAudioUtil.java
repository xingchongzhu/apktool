package p067c.p068a.p069a.p070a.p072b2;

import com.p259uc.crashsdk.export.LogType;

/* renamed from: c.a.a.a.b2.c0 */
public final class MpegAudioUtil {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String[] f5431a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final int[] f5432b = {44100, 48000, LogType.UNEXP_KNOWN_REASON};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final int[] f5433c = {LogType.UNEXP_KNOWN_REASON, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int[] f5434d = {LogType.UNEXP_KNOWN_REASON, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final int[] f5435e = {LogType.UNEXP_KNOWN_REASON, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final int[] f5436f = {LogType.UNEXP_KNOWN_REASON, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final int[] f5437g = {8000, 16000, 24000, LogType.UNEXP_KNOWN_REASON, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: c.a.a.a.b2.c0$a */
    /* compiled from: MpegAudioUtil */
    public static final class C0815a {

        /* renamed from: a */
        public int f5438a;

        /* renamed from: b */
        public String f5439b;

        /* renamed from: c */
        public int f5440c;

        /* renamed from: d */
        public int f5441d;

        /* renamed from: e */
        public int f5442e;

        /* renamed from: f */
        public int f5443f;

        /* renamed from: g */
        public int f5444g;

        /* renamed from: a */
        public boolean mo5806a(int i) {
            if (!MpegAudioUtil.m6548l(i)) {
                return false;
            }
            int i2 = (i >>> 19) & 3;
            if (i2 == 1) {
                return false;
            }
            int i3 = (i >>> 17) & 3;
            if (i3 == 0) {
                return false;
            }
            int i4 = (i >>> 12) & 15;
            if (i4 == 0 || i4 == 15) {
                return false;
            }
            int i5 = (i >>> 10) & 3;
            if (i5 == 3) {
                return false;
            }
            this.f5438a = i2;
            this.f5439b = MpegAudioUtil.f5431a[3 - i3];
            int i6 = MpegAudioUtil.f5432b[i5];
            this.f5441d = i6;
            int i7 = 2;
            if (i2 == 2) {
                this.f5441d = i6 / 2;
            } else if (i2 == 0) {
                this.f5441d = i6 / 4;
            }
            int i8 = (i >>> 9) & 1;
            this.f5444g = MpegAudioUtil.m6547k(i2, i3);
            if (i3 == 3) {
                int i9 = i2 == 3 ? MpegAudioUtil.f5433c[i4 - 1] : MpegAudioUtil.f5434d[i4 - 1];
                this.f5443f = i9;
                this.f5440c = (((i9 * 12) / this.f5441d) + i8) * 4;
            } else {
                int i10 = 144;
                if (i2 == 3) {
                    int i11 = i3 == 2 ? MpegAudioUtil.f5435e[i4 - 1] : MpegAudioUtil.f5436f[i4 - 1];
                    this.f5443f = i11;
                    this.f5440c = ((i11 * 144) / this.f5441d) + i8;
                } else {
                    int i12 = MpegAudioUtil.f5437g[i4 - 1];
                    this.f5443f = i12;
                    if (i3 == 1) {
                        i10 = 72;
                    }
                    this.f5440c = ((i10 * i12) / this.f5441d) + i8;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i7 = 1;
            }
            this.f5442e = i7;
            return true;
        }
    }

    /* renamed from: j */
    public static int m6546j(int i) {
        if (!m6548l(i)) {
            return -1;
        }
        int i2 = (i >>> 19) & 3;
        if (i2 == 1) {
            return -1;
        }
        int i3 = (i >>> 17) & 3;
        if (i3 == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        if (i4 == 0 || i4 == 15) {
            return -1;
        }
        int i5 = (i >>> 10) & 3;
        if (i5 == 3) {
            return -1;
        }
        int i6 = f5432b[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f5433c[i4 - 1] : f5434d[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f5435e[i4 - 1] : f5436f[i4 - 1] : f5437g[i4 - 1];
        int i9 = 144;
        if (i2 == 3) {
            return ((i8 * 144) / i6) + i7;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i8) / i6) + i7;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static int m6547k(int i, int i2) {
        int i3 = 1152;
        if (i2 == 1) {
            if (i != 3) {
                i3 = 576;
            }
            return i3;
        } else if (i2 == 2) {
            return 1152;
        } else {
            if (i2 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m6548l(int i) {
        return (i & -2097152) == -2097152;
    }

    /* renamed from: m */
    public static int m6549m(int i) {
        if (!m6548l(i)) {
            return -1;
        }
        int i2 = (i >>> 19) & 3;
        if (i2 == 1) {
            return -1;
        }
        int i3 = (i >>> 17) & 3;
        if (i3 == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m6547k(i2, i3);
    }
}
