package com.bumptech.glide.load.p158p.p159d;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import com.bumptech.glide.p174t.C1638j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.load.p.d.l */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f10850a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f10851b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: com.bumptech.glide.load.p.d.l$a */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C1580a implements C1582c {

        /* renamed from: a */
        private final ByteBuffer f10852a;

        C1580a(ByteBuffer byteBuffer) {
            this.f10852a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public long mo9215a(long j) {
            int min = (int) Math.min((long) this.f10852a.remaining(), j);
            ByteBuffer byteBuffer = this.f10852a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        /* renamed from: b */
        public int mo9216b(byte[] bArr, int i) {
            int min = Math.min(i, this.f10852a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f10852a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: c */
        public short mo9217c() throws C1583a {
            if (this.f10852a.remaining() >= 1) {
                return (short) (this.f10852a.get() & 255);
            }
            throw new C1583a();
        }

        /* renamed from: d */
        public int mo9218d() throws C1583a {
            return (mo9217c() << 8) | mo9217c();
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.l$b */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C1581b {

        /* renamed from: a */
        private final ByteBuffer f10853a;

        C1581b(byte[] bArr, int i) {
            this.f10853a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: c */
        private boolean m13361c(int i, int i2) {
            return this.f10853a.remaining() - i >= i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public short mo9219a(int i) {
            if (m13361c(i, 2)) {
                return this.f10853a.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo9220b(int i) {
            if (m13361c(i, 4)) {
                return this.f10853a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo9221d() {
            return this.f10853a.remaining();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo9222e(ByteOrder byteOrder) {
            this.f10853a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.l$c */
    /* compiled from: DefaultImageHeaderParser */
    private interface C1582c {

        /* renamed from: com.bumptech.glide.load.p.d.l$c$a */
        /* compiled from: DefaultImageHeaderParser */
        public static final class C1583a extends IOException {
            C1583a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        long mo9215a(long j) throws IOException;

        /* renamed from: b */
        int mo9216b(byte[] bArr, int i) throws IOException;

        /* renamed from: c */
        short mo9217c() throws IOException;

        /* renamed from: d */
        int mo9218d() throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.p.d.l$d */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C1584d implements C1582c {

        /* renamed from: a */
        private final InputStream f10854a;

        C1584d(InputStream inputStream) {
            this.f10854a = inputStream;
        }

        /* renamed from: a */
        public long mo9215a(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f10854a.skip(j2);
                if (skip <= 0) {
                    if (this.f10854a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        /* renamed from: b */
        public int mo9216b(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                i3 = this.f10854a.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new C1583a();
        }

        /* renamed from: c */
        public short mo9217c() throws IOException {
            int read = this.f10854a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new C1583a();
        }

        /* renamed from: d */
        public int mo9218d() throws IOException {
            return (mo9217c() << 8) | mo9217c();
        }
    }

    /* renamed from: d */
    private static int m13346d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: e */
    private int m13347e(C1582c cVar, ArrayPool bVar) throws IOException {
        byte[] bArr;
        try {
            int d = cVar.mo9218d();
            String str = "DfltImageHeaderParser";
            if (!m13349g(d)) {
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parser doesn't handle magic number: ");
                    sb.append(d);
                    Log.d(str, sb.toString());
                }
                return -1;
            }
            int i = m13351i(cVar);
            if (i == -1) {
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) bVar.mo8862e(i, byte[].class);
            int k = m13353k(cVar, bArr, i);
            bVar.mo8861d(bArr);
            return k;
        } catch (C1583a unused) {
            return -1;
        } catch (Throwable th) {
            bVar.mo8861d(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0039 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.load.ImageHeaderParser.ImageType m13348f(com.bumptech.glide.load.p158p.p159d.DefaultImageHeaderParser.C1582c r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r6.mo9218d()     // Catch:{ a -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.mo9217c()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.mo9217c()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.mo9215a(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo9217c()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0044:
            r0 = 4
            r6.mo9215a(r0)     // Catch:{ a -> 0x00a0 }
            int r2 = r6.mo9218d()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo9218d()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x005c:
            int r2 = r6.mo9218d()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo9218d()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r6.mo9215a(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo9217c()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x0087:
            return r6
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r6.mo9215a(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo9217c()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x009c:
            return r6
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p158p.p159d.DefaultImageHeaderParser.m13348f(com.bumptech.glide.load.p.d.l$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* renamed from: g */
    private static boolean m13349g(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: h */
    private boolean m13350h(byte[] bArr, int i) {
        boolean z = bArr != null && i > f10850a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f10850a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: i */
    private int m13351i(C1582c cVar) throws IOException {
        String str;
        short c;
        int d;
        long j;
        long a;
        do {
            short c2 = cVar.mo9217c();
            str = "DfltImageHeaderParser";
            if (c2 != 255) {
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append(c2);
                    Log.d(str, sb.toString());
                }
                return -1;
            }
            c = cVar.mo9217c();
            if (c == 218) {
                return -1;
            }
            if (c == 217) {
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            d = cVar.mo9218d() - 2;
            if (c == 225) {
                return d;
            }
            j = (long) d;
            a = cVar.mo9215a(j);
        } while (a == j);
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append(c);
            sb2.append(", wanted to skip: ");
            sb2.append(d);
            sb2.append(", but actually skipped: ");
            sb2.append(a);
            Log.d(str, sb2.toString());
        }
        return -1;
    }

    /* renamed from: j */
    private static int m13352j(C1581b bVar) {
        ByteOrder byteOrder;
        short a = bVar.mo9219a(6);
        String str = "DfltImageHeaderParser";
        if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a != 19789) {
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append(a);
                Log.d(str, sb.toString());
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.mo9222e(byteOrder);
        int b = bVar.mo9220b(10) + 6;
        short a2 = bVar.mo9219a(b);
        for (int i = 0; i < a2; i++) {
            int d = m13346d(b, i);
            short a3 = bVar.mo9219a(d);
            if (a3 == 274) {
                short a4 = bVar.mo9219a(d + 2);
                if (a4 >= 1 && a4 <= 12) {
                    int b2 = bVar.mo9220b(d + 4);
                    if (b2 >= 0) {
                        String str2 = " tagType=";
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i);
                            sb2.append(str2);
                            sb2.append(a3);
                            sb2.append(" formatCode=");
                            sb2.append(a4);
                            sb2.append(" componentCount=");
                            sb2.append(b2);
                            Log.d(str, sb2.toString());
                        }
                        int i2 = b2 + f10851b[a4];
                        if (i2 <= 4) {
                            int i3 = d + 8;
                            if (i3 < 0 || i3 > bVar.mo9221d()) {
                                if (Log.isLoggable(str, 3)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Illegal tagValueOffset=");
                                    sb3.append(i3);
                                    sb3.append(str2);
                                    sb3.append(a3);
                                    Log.d(str, sb3.toString());
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo9221d()) {
                                return bVar.mo9219a(i3);
                            } else {
                                if (Log.isLoggable(str, 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal number of bytes for TI tag data tagType=");
                                    sb4.append(a3);
                                    Log.d(str, sb4.toString());
                                }
                            }
                        } else if (Log.isLoggable(str, 3)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Got byte count > 4, not orientation, continuing, formatCode=");
                            sb5.append(a4);
                            Log.d(str, sb5.toString());
                        }
                    } else if (Log.isLoggable(str, 3)) {
                        Log.d(str, "Negative tiff component count");
                    }
                } else if (Log.isLoggable(str, 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append(a4);
                    Log.d(str, sb6.toString());
                }
            }
        }
        return -1;
    }

    /* renamed from: k */
    private int m13353k(C1582c cVar, byte[] bArr, int i) throws IOException {
        int b = cVar.mo9216b(bArr, i);
        String str = "DfltImageHeaderParser";
        if (b != i) {
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to read exif segment data, length: ");
                sb.append(i);
                sb.append(", actually read: ");
                sb.append(b);
                Log.d(str, sb.toString());
            }
            return -1;
        } else if (m13350h(bArr, i)) {
            return m13352j(new C1581b(bArr, i));
        } else {
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: a */
    public ImageType mo8768a(ByteBuffer byteBuffer) throws IOException {
        return m13348f(new C1580a((ByteBuffer) C1638j.m14081d(byteBuffer)));
    }

    /* renamed from: b */
    public int mo8769b(InputStream inputStream, ArrayPool bVar) throws IOException {
        return m13347e(new C1584d((InputStream) C1638j.m14081d(inputStream)), (ArrayPool) C1638j.m14081d(bVar));
    }

    /* renamed from: c */
    public ImageType mo8770c(InputStream inputStream) throws IOException {
        return m13348f(new C1584d((InputStream) C1638j.m14081d(inputStream)));
    }
}
