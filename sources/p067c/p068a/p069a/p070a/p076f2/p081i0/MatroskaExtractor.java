package p067c.p068a.p069a.p070a.p076f2.p081i0;

import android.util.Pair;
import android.util.SparseArray;
import com.p259uc.crashsdk.export.CrashStatKey;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p072b2.Ac3Util;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData.C0894b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.C0916b0.C0917a;
import p067c.p068a.p069a.p070a.p076f2.C0998o;
import p067c.p068a.p069a.p070a.p076f2.ChunkIndex;
import p067c.p068a.p069a.p070a.p076f2.Extractor;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p076f2.SeekMap;
import p067c.p068a.p069a.p070a.p076f2.SeekMap.C1003b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.LongArray;
import p067c.p068a.p069a.p070a.p111m2.NalUnitUtil;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.i0.e */
public class MatroskaExtractor implements Extractor {

    /* renamed from: a */
    public static final C0998o f6164a = C0932a.f6154b;

    /* renamed from: b */
    private static final byte[] f6165b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final byte[] f6166c = Util.m10290g0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d */
    private static final byte[] f6167d = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final UUID f6168e = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Map<String, Integer> f6169f;

    /* renamed from: A */
    private C0937c f6170A;

    /* renamed from: B */
    private boolean f6171B;

    /* renamed from: C */
    private int f6172C;

    /* renamed from: D */
    private long f6173D;

    /* renamed from: E */
    private boolean f6174E;

    /* renamed from: F */
    private long f6175F;

    /* renamed from: G */
    private long f6176G;

    /* renamed from: H */
    private long f6177H;

    /* renamed from: I */
    private LongArray f6178I;

    /* renamed from: J */
    private LongArray f6179J;

    /* renamed from: K */
    private boolean f6180K;

    /* renamed from: L */
    private boolean f6181L;

    /* renamed from: M */
    private int f6182M;

    /* renamed from: N */
    private long f6183N;

    /* renamed from: O */
    private long f6184O;

    /* renamed from: P */
    private int f6185P;

    /* renamed from: Q */
    private int f6186Q;

    /* renamed from: R */
    private int[] f6187R;

    /* renamed from: S */
    private int f6188S;

    /* renamed from: T */
    private int f6189T;

    /* renamed from: U */
    private int f6190U;

    /* renamed from: V */
    private int f6191V;

    /* renamed from: W */
    private boolean f6192W;

    /* renamed from: X */
    private int f6193X;

    /* renamed from: Y */
    private int f6194Y;

    /* renamed from: Z */
    private int f6195Z;

    /* renamed from: a0 */
    private boolean f6196a0;

    /* renamed from: b0 */
    private boolean f6197b0;

    /* renamed from: c0 */
    private boolean f6198c0;

    /* renamed from: d0 */
    private int f6199d0;

    /* renamed from: e0 */
    private byte f6200e0;

    /* renamed from: f0 */
    private boolean f6201f0;

    /* renamed from: g */
    private final EbmlReader f6202g;

    /* renamed from: g0 */
    private ExtractorOutput f6203g0;

    /* renamed from: h */
    private final VarintReader f6204h;

    /* renamed from: i */
    private final SparseArray<C0937c> f6205i;

    /* renamed from: j */
    private final boolean f6206j;

    /* renamed from: k */
    private final ParsableByteArray f6207k;

    /* renamed from: l */
    private final ParsableByteArray f6208l;

    /* renamed from: m */
    private final ParsableByteArray f6209m;

    /* renamed from: n */
    private final ParsableByteArray f6210n;

    /* renamed from: o */
    private final ParsableByteArray f6211o;

    /* renamed from: p */
    private final ParsableByteArray f6212p;

    /* renamed from: q */
    private final ParsableByteArray f6213q;

    /* renamed from: r */
    private final ParsableByteArray f6214r;

    /* renamed from: s */
    private final ParsableByteArray f6215s;

    /* renamed from: t */
    private final ParsableByteArray f6216t;

    /* renamed from: u */
    private ByteBuffer f6217u;

    /* renamed from: v */
    private long f6218v;

    /* renamed from: w */
    private long f6219w;

    /* renamed from: x */
    private long f6220x;

    /* renamed from: y */
    private long f6221y;

    /* renamed from: z */
    private long f6222z;

    /* renamed from: c.a.a.a.f2.i0.e$b */
    /* compiled from: MatroskaExtractor */
    private final class C0936b implements EbmlProcessor {
        private C0936b() {
        }

        /* renamed from: a */
        public void mo6222a(int i) throws ParserException {
            MatroskaExtractor.this.mo6233o(i);
        }

        /* renamed from: b */
        public int mo6223b(int i) {
            return MatroskaExtractor.this.mo6235u(i);
        }

        /* renamed from: c */
        public void mo6224c(int i, double d) throws ParserException {
            MatroskaExtractor.this.mo6234r(i, d);
        }

        /* renamed from: d */
        public boolean mo6225d(int i) {
            return MatroskaExtractor.this.mo6239z(i);
        }

        /* renamed from: e */
        public void mo6226e(int i, int i2, ExtractorInput kVar) throws IOException {
            MatroskaExtractor.this.mo6232l(i, i2, kVar);
        }

        /* renamed from: f */
        public void mo6227f(int i, String str) throws ParserException {
            MatroskaExtractor.this.mo6231H(i, str);
        }

        /* renamed from: g */
        public void mo6228g(int i, long j, long j2) throws ParserException {
            MatroskaExtractor.this.mo6230G(i, j, j2);
        }

        /* renamed from: h */
        public void mo6229h(int i, long j) throws ParserException {
            MatroskaExtractor.this.mo6238x(i, j);
        }
    }

    /* renamed from: c.a.a.a.f2.i0.e$c */
    /* compiled from: MatroskaExtractor */
    private static final class C0937c {

        /* renamed from: A */
        public int f6224A;

        /* renamed from: B */
        public int f6225B;

        /* renamed from: C */
        public int f6226C;

        /* renamed from: D */
        public float f6227D;

        /* renamed from: E */
        public float f6228E;

        /* renamed from: F */
        public float f6229F;

        /* renamed from: G */
        public float f6230G;

        /* renamed from: H */
        public float f6231H;

        /* renamed from: I */
        public float f6232I;

        /* renamed from: J */
        public float f6233J;

        /* renamed from: K */
        public float f6234K;

        /* renamed from: L */
        public float f6235L;

        /* renamed from: M */
        public float f6236M;

        /* renamed from: N */
        public byte[] f6237N;

        /* renamed from: O */
        public int f6238O;

        /* renamed from: P */
        public int f6239P;

        /* renamed from: Q */
        public int f6240Q;

        /* renamed from: R */
        public long f6241R;

        /* renamed from: S */
        public long f6242S;

        /* renamed from: T */
        public C0938d f6243T;

        /* renamed from: U */
        public boolean f6244U;

        /* renamed from: V */
        public boolean f6245V;
        /* access modifiers changed from: private */

        /* renamed from: W */
        public String f6246W;

        /* renamed from: X */
        public C0916b0 f6247X;

        /* renamed from: Y */
        public int f6248Y;

        /* renamed from: a */
        public String f6249a;

        /* renamed from: b */
        public String f6250b;

        /* renamed from: c */
        public int f6251c;

        /* renamed from: d */
        public int f6252d;

        /* renamed from: e */
        public int f6253e;

        /* renamed from: f */
        public int f6254f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6255g;

        /* renamed from: h */
        public boolean f6256h;

        /* renamed from: i */
        public byte[] f6257i;

        /* renamed from: j */
        public C0917a f6258j;

        /* renamed from: k */
        public byte[] f6259k;

        /* renamed from: l */
        public DrmInitData f6260l;

        /* renamed from: m */
        public int f6261m;

        /* renamed from: n */
        public int f6262n;

        /* renamed from: o */
        public int f6263o;

        /* renamed from: p */
        public int f6264p;

        /* renamed from: q */
        public int f6265q;

        /* renamed from: r */
        public int f6266r;

        /* renamed from: s */
        public float f6267s;

        /* renamed from: t */
        public float f6268t;

        /* renamed from: u */
        public float f6269u;

        /* renamed from: v */
        public byte[] f6270v;

        /* renamed from: w */
        public int f6271w;

        /* renamed from: x */
        public boolean f6272x;

        /* renamed from: y */
        public int f6273y;

        /* renamed from: z */
        public int f6274z;

        private C0937c() {
            this.f6261m = -1;
            this.f6262n = -1;
            this.f6263o = -1;
            this.f6264p = -1;
            this.f6265q = 0;
            this.f6266r = -1;
            this.f6267s = 0.0f;
            this.f6268t = 0.0f;
            this.f6269u = 0.0f;
            this.f6270v = null;
            this.f6271w = -1;
            this.f6272x = false;
            this.f6273y = -1;
            this.f6274z = -1;
            this.f6224A = -1;
            this.f6225B = 1000;
            this.f6226C = CrashStatKey.LOG_LEGACY_TMP_FILE;
            this.f6227D = -1.0f;
            this.f6228E = -1.0f;
            this.f6229F = -1.0f;
            this.f6230G = -1.0f;
            this.f6231H = -1.0f;
            this.f6232I = -1.0f;
            this.f6233J = -1.0f;
            this.f6234K = -1.0f;
            this.f6235L = -1.0f;
            this.f6236M = -1.0f;
            this.f6238O = 1;
            this.f6239P = -1;
            this.f6240Q = 8000;
            this.f6241R = 0;
            this.f6242S = 0;
            this.f6245V = true;
            this.f6246W = "eng";
        }

        /* access modifiers changed from: private */
        @EnsuresNonNull({"output"})
        /* renamed from: e */
        public void m7575e() {
            Assertions.m10153e(this.f6247X);
        }

        @EnsuresNonNull({"codecPrivate"})
        /* renamed from: f */
        private byte[] m7576f(String str) throws ParserException {
            byte[] bArr = this.f6259k;
            if (bArr != null) {
                return bArr;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Missing CodecPrivate for codec ");
            sb.append(str);
            throw new ParserException(sb.toString());
        }

        /* renamed from: g */
        private byte[] m7577g() {
            if (this.f6227D == -1.0f || this.f6228E == -1.0f || this.f6229F == -1.0f || this.f6230G == -1.0f || this.f6231H == -1.0f || this.f6232I == -1.0f || this.f6233J == -1.0f || this.f6234K == -1.0f || this.f6235L == -1.0f || this.f6236M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put(0);
            order.putShort((short) ((int) ((this.f6227D * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f6228E * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f6229F * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f6230G * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f6231H * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f6232I * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f6233J * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f6234K * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) (this.f6235L + 0.5f)));
            order.putShort((short) ((int) (this.f6236M + 0.5f)));
            order.putShort((short) this.f6225B);
            order.putShort((short) this.f6226C);
            return bArr;
        }

        /* renamed from: j */
        private static Pair<String, List<byte[]>> m7578j(ParsableByteArray a0Var) throws ParserException {
            try {
                a0Var.mo7375Q(16);
                long t = a0Var.mo7395t();
                if (t == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (t == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (t == 826496599) {
                    byte[] d = a0Var.mo7379d();
                    for (int e = a0Var.mo7380e() + 20; e < d.length - 4; e++) {
                        if (d[e] == 0 && d[e + 1] == 0 && d[e + 2] == 1 && d[e + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d, e, d.length)));
                        }
                    }
                    throw new ParserException("Failed to find FourCC VC1 initialization data");
                }
                Log.m10386h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing FourCC private data");
            }
        }

        /* renamed from: k */
        private static boolean m7579k(ParsableByteArray a0Var) throws ParserException {
            try {
                int v = a0Var.mo7397v();
                boolean z = true;
                if (v == 1) {
                    return true;
                }
                if (v != 65534) {
                    return false;
                }
                a0Var.mo7374P(24);
                if (!(a0Var.mo7398w() == MatroskaExtractor.f6168e.getMostSignificantBits() && a0Var.mo7398w() == MatroskaExtractor.f6168e.getLeastSignificantBits())) {
                    z = false;
                }
                return z;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing MS/ACM codec private");
            }
        }

        /* renamed from: l */
        private static List<byte[]> m7580l(byte[] bArr) throws ParserException {
            String str = "Error parsing vorbis codec private";
            try {
                if (bArr[0] == 2) {
                    int i = 1;
                    int i2 = 0;
                    while ((bArr[i] & 255) == 255) {
                        i2 += 255;
                        i++;
                    }
                    int i3 = i + 1;
                    int i4 = i2 + (bArr[i] & 255);
                    int i5 = 0;
                    while ((bArr[i3] & 255) == 255) {
                        i5 += 255;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + (bArr[i3] & 255);
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i9)];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new ParserException(str);
                        }
                        throw new ParserException(str);
                    }
                    throw new ParserException(str);
                }
                throw new ParserException(str);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException(str);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:113:0x029a, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x030b, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x030e, code lost:
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x030f, code lost:
            r15 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x036f, code lost:
            r7 = -1;
            r15 = -1;
            r19 = r3;
            r3 = r1;
            r1 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x03a7, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x03b4, code lost:
            r1 = null;
            r3 = null;
            r7 = -1;
            r15 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x03cc, code lost:
            r3 = null;
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x042a, code lost:
            r16 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x043f, code lost:
            r4 = r0.f6237N;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0441, code lost:
            if (r4 == null) goto L_0x0452;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0443, code lost:
            r4 = p067c.p068a.p069a.p070a.p112n2.DolbyVisionConfig.m10504a(new p067c.p068a.p069a.p070a.p111m2.ParsableByteArray(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x044c, code lost:
            if (r4 == null) goto L_0x0452;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x044e, code lost:
            r3 = r4.f8537c;
            r16 = "video/dolby-vision";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0452, code lost:
            r4 = r16;
            r5 = r0.f6245V | false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0459, code lost:
            if (r0.f6244U == false) goto L_0x045d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x045b, code lost:
            r6 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x045d, code lost:
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x045e, code lost:
            r5 = r5 | r6;
            r6 = new p067c.p068a.p069a.p070a.Format.C1245b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0468, code lost:
            if (p067c.p068a.p069a.p070a.p111m2.MimeTypes.m10409o(r4) == false) goto L_0x047c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x046a, code lost:
            r6.mo7682H(r0.f6238O).mo7706f0(r0.f6240Q).mo7699Y(r7);
            r8 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0480, code lost:
            if (p067c.p068a.p069a.p070a.p111m2.MimeTypes.m10411q(r4) == false) goto L_0x055a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x0484, code lost:
            if (r0.f6265q != 0) goto L_0x0498;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x0486, code lost:
            r2 = r0.f6263o;
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0489, code lost:
            if (r2 != -1) goto L_0x048d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x048b, code lost:
            r2 = r0.f6261m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x048d, code lost:
            r0.f6263o = r2;
            r2 = r0.f6264p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x0491, code lost:
            if (r2 != -1) goto L_0x0495;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x0493, code lost:
            r2 = r0.f6262n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x0495, code lost:
            r0.f6264p = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x0498, code lost:
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0499, code lost:
            r2 = -1.0f;
            r8 = r0.f6263o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x049d, code lost:
            if (r8 == r7) goto L_0x04ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x049f, code lost:
            r10 = r0.f6264p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x04a1, code lost:
            if (r10 == r7) goto L_0x04ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x04a3, code lost:
            r2 = ((float) (r0.f6262n * r8)) / ((float) (r0.f6261m * r10));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x04b0, code lost:
            if (r0.f6272x == false) goto L_0x04c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x04b2, code lost:
            r10 = new p067c.p068a.p069a.p070a.p112n2.ColorInfo(r0.f6273y, r0.f6224A, r0.f6274z, m7577g());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x04c2, code lost:
            r10 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x04c6, code lost:
            if (r0.f6249a == null) goto L_0x04e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x04d2, code lost:
            if (p067c.p068a.p069a.p070a.p076f2.p081i0.MatroskaExtractor.m7536f().containsKey(r0.f6249a) == false) goto L_0x04e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x04d4, code lost:
            r7 = ((java.lang.Integer) p067c.p068a.p069a.p070a.p076f2.p081i0.MatroskaExtractor.m7536f().get(r0.f6249a)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x04e6, code lost:
            if (r0.f6266r != 0) goto L_0x0534;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x04ef, code lost:
            if (java.lang.Float.compare(r0.f6267s, 0.0f) != 0) goto L_0x0534;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x04f7, code lost:
            if (java.lang.Float.compare(r0.f6268t, 0.0f) != 0) goto L_0x0534;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x04ff, code lost:
            if (java.lang.Float.compare(r0.f6269u, 0.0f) != 0) goto L_0x0502;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x050a, code lost:
            if (java.lang.Float.compare(r0.f6268t, 90.0f) != 0) goto L_0x050f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x050c, code lost:
            r9 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0517, code lost:
            if (java.lang.Float.compare(r0.f6268t, -180.0f) == 0) goto L_0x0531;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0521, code lost:
            if (java.lang.Float.compare(r0.f6268t, 180.0f) != 0) goto L_0x0524;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x052c, code lost:
            if (java.lang.Float.compare(r0.f6268t, -90.0f) != 0) goto L_0x0534;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x052e, code lost:
            r9 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0531, code lost:
            r9 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x0534, code lost:
            r9 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x0535, code lost:
            r6.mo7710j0(r0.f6261m).mo7691Q(r0.f6262n).mo7701a0(r2).mo7704d0(r9).mo7702b0(r0.f6270v).mo7708h0(r0.f6271w).mo7684J(r10);
            r8 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x055e, code lost:
            if (r14.equals(r4) != false) goto L_0x0583;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x0564, code lost:
            if (r13.equals(r4) != false) goto L_0x0583;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x056a, code lost:
            if (r12.equals(r4) != false) goto L_0x0583;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x0572, code lost:
            if (r18.equals(r4) != false) goto L_0x0583;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x0578, code lost:
            if (r2.equals(r4) == false) goto L_0x057b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x0582, code lost:
            throw new p067c.p068a.p069a.p070a.ParserException("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x0585, code lost:
            if (r0.f6249a == null) goto L_0x0598;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x0591, code lost:
            if (p067c.p068a.p069a.p070a.p076f2.p081i0.MatroskaExtractor.m7536f().containsKey(r0.f6249a) != false) goto L_0x0598;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x0593, code lost:
            r6.mo7695U(r0.f6249a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x0598, code lost:
            r1 = r6.mo7692R(r22).mo7705e0(r4).mo7697W(r15).mo7696V(r0.f6246W).mo7707g0(r5 ? 1 : 0).mo7694T(r1).mo7683I(r3).mo7686L(r0.f6260l).mo7679E();
            r2 = r21.mo6218q(r0.f6251c, r8);
            r0.f6247X = r2;
            r2.mo6177d(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x05cf, code lost:
            return;
         */
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo6240h(p067c.p068a.p069a.p070a.p076f2.ExtractorOutput r21, int r22) throws p067c.p068a.p069a.p070a.ParserException {
            /*
                r20 = this;
                r0 = r20
                java.lang.String r1 = r0.f6250b
                r1.hashCode()
                int r2 = r1.hashCode()
                r3 = 16
                r6 = 8
                r7 = 4
                r8 = 3
                r9 = 0
                switch(r2) {
                    case -2095576542: goto L_0x01b3;
                    case -2095575984: goto L_0x01a7;
                    case -1985379776: goto L_0x019b;
                    case -1784763192: goto L_0x018f;
                    case -1730367663: goto L_0x0183;
                    case -1482641358: goto L_0x0177;
                    case -1482641357: goto L_0x016b;
                    case -1373388978: goto L_0x015f;
                    case -933872740: goto L_0x0151;
                    case -538363189: goto L_0x0143;
                    case -538363109: goto L_0x0135;
                    case -425012669: goto L_0x0127;
                    case -356037306: goto L_0x0119;
                    case 62923557: goto L_0x010b;
                    case 62923603: goto L_0x00fd;
                    case 62927045: goto L_0x00ef;
                    case 82318131: goto L_0x00e1;
                    case 82338133: goto L_0x00d3;
                    case 82338134: goto L_0x00c5;
                    case 99146302: goto L_0x00b7;
                    case 444813526: goto L_0x00a9;
                    case 542569478: goto L_0x009b;
                    case 635596514: goto L_0x008d;
                    case 725948237: goto L_0x0080;
                    case 725957860: goto L_0x0073;
                    case 738597099: goto L_0x0066;
                    case 855502857: goto L_0x0059;
                    case 1422270023: goto L_0x004c;
                    case 1809237540: goto L_0x003f;
                    case 1950749482: goto L_0x0032;
                    case 1950789798: goto L_0x0025;
                    case 1951062397: goto L_0x0018;
                    default: goto L_0x0015;
                }
            L_0x0015:
                r1 = -1
                goto L_0x01be
            L_0x0018:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0021
                goto L_0x0015
            L_0x0021:
                r1 = 31
                goto L_0x01be
            L_0x0025:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x002e
                goto L_0x0015
            L_0x002e:
                r1 = 30
                goto L_0x01be
            L_0x0032:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x003b
                goto L_0x0015
            L_0x003b:
                r1 = 29
                goto L_0x01be
            L_0x003f:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0048
                goto L_0x0015
            L_0x0048:
                r1 = 28
                goto L_0x01be
            L_0x004c:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0055
                goto L_0x0015
            L_0x0055:
                r1 = 27
                goto L_0x01be
            L_0x0059:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0062
                goto L_0x0015
            L_0x0062:
                r1 = 26
                goto L_0x01be
            L_0x0066:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x006f
                goto L_0x0015
            L_0x006f:
                r1 = 25
                goto L_0x01be
            L_0x0073:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x007c
                goto L_0x0015
            L_0x007c:
                r1 = 24
                goto L_0x01be
            L_0x0080:
                java.lang.String r2 = "A_PCM/INT/BIG"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0089
                goto L_0x0015
            L_0x0089:
                r1 = 23
                goto L_0x01be
            L_0x008d:
                java.lang.String r2 = "A_PCM/FLOAT/IEEE"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0097
                goto L_0x0015
            L_0x0097:
                r1 = 22
                goto L_0x01be
            L_0x009b:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00a5
                goto L_0x0015
            L_0x00a5:
                r1 = 21
                goto L_0x01be
            L_0x00a9:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00b3
                goto L_0x0015
            L_0x00b3:
                r1 = 20
                goto L_0x01be
            L_0x00b7:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00c1
                goto L_0x0015
            L_0x00c1:
                r1 = 19
                goto L_0x01be
            L_0x00c5:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00cf
                goto L_0x0015
            L_0x00cf:
                r1 = 18
                goto L_0x01be
            L_0x00d3:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00dd
                goto L_0x0015
            L_0x00dd:
                r1 = 17
                goto L_0x01be
            L_0x00e1:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00eb
                goto L_0x0015
            L_0x00eb:
                r1 = 16
                goto L_0x01be
            L_0x00ef:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00f9
                goto L_0x0015
            L_0x00f9:
                r1 = 15
                goto L_0x01be
            L_0x00fd:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0107
                goto L_0x0015
            L_0x0107:
                r1 = 14
                goto L_0x01be
            L_0x010b:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0115
                goto L_0x0015
            L_0x0115:
                r1 = 13
                goto L_0x01be
            L_0x0119:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0123
                goto L_0x0015
            L_0x0123:
                r1 = 12
                goto L_0x01be
            L_0x0127:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0131
                goto L_0x0015
            L_0x0131:
                r1 = 11
                goto L_0x01be
            L_0x0135:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x013f
                goto L_0x0015
            L_0x013f:
                r1 = 10
                goto L_0x01be
            L_0x0143:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x014d
                goto L_0x0015
            L_0x014d:
                r1 = 9
                goto L_0x01be
            L_0x0151:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x015b
                goto L_0x0015
            L_0x015b:
                r1 = 8
                goto L_0x01be
            L_0x015f:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0169
                goto L_0x0015
            L_0x0169:
                r1 = 7
                goto L_0x01be
            L_0x016b:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0175
                goto L_0x0015
            L_0x0175:
                r1 = 6
                goto L_0x01be
            L_0x0177:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0181
                goto L_0x0015
            L_0x0181:
                r1 = 5
                goto L_0x01be
            L_0x0183:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x018d
                goto L_0x0015
            L_0x018d:
                r1 = 4
                goto L_0x01be
            L_0x018f:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0199
                goto L_0x0015
            L_0x0199:
                r1 = 3
                goto L_0x01be
            L_0x019b:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01a5
                goto L_0x0015
            L_0x01a5:
                r1 = 2
                goto L_0x01be
            L_0x01a7:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01b1
                goto L_0x0015
            L_0x01b1:
                r1 = 1
                goto L_0x01be
            L_0x01b3:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01bd
                goto L_0x0015
            L_0x01bd:
                r1 = 0
            L_0x01be:
                java.lang.String r2 = "application/dvbsubs"
                java.lang.String r11 = "application/pgs"
                java.lang.String r12 = "application/vobsub"
                java.lang.String r13 = "text/x-ssa"
                java.lang.String r14 = "application/x-subrip"
                java.lang.String r4 = ". Setting mimeType to "
                java.lang.String r16 = "audio/raw"
                r17 = 0
                java.lang.String r5 = "MatroskaExtractor"
                java.lang.String r15 = "audio/x-unknown"
                switch(r1) {
                    case 0: goto L_0x042e;
                    case 1: goto L_0x042e;
                    case 2: goto L_0x03de;
                    case 3: goto L_0x03d1;
                    case 4: goto L_0x03bc;
                    case 5: goto L_0x03b0;
                    case 6: goto L_0x03ab;
                    case 7: goto L_0x038c;
                    case 8: goto L_0x0378;
                    case 9: goto L_0x042e;
                    case 10: goto L_0x0354;
                    case 11: goto L_0x0345;
                    case 12: goto L_0x0340;
                    case 13: goto L_0x0321;
                    case 14: goto L_0x031c;
                    case 15: goto L_0x0317;
                    case 16: goto L_0x0312;
                    case 17: goto L_0x0307;
                    case 18: goto L_0x0302;
                    case 19: goto L_0x02fa;
                    case 20: goto L_0x02f5;
                    case 21: goto L_0x0317;
                    case 22: goto L_0x02ce;
                    case 23: goto L_0x029f;
                    case 24: goto L_0x0272;
                    case 25: goto L_0x025e;
                    case 26: goto L_0x0241;
                    case 27: goto L_0x023b;
                    case 28: goto L_0x0235;
                    case 29: goto L_0x022f;
                    case 30: goto L_0x021f;
                    case 31: goto L_0x01dd;
                    default: goto L_0x01d5;
                }
            L_0x01d5:
                c.a.a.a.g1 r1 = new c.a.a.a.g1
                java.lang.String r2 = "Unrecognized codec identifier."
                r1.<init>(r2)
                throw r1
            L_0x01dd:
                r15 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r8)
                java.lang.String r3 = r0.f6250b
                byte[] r3 = r0.m7576f(r3)
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r6)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                r18 = r11
                long r10 = r0.f6241R
                java.nio.ByteBuffer r3 = r3.putLong(r10)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r6)
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r4 = r0.f6242S
                java.nio.ByteBuffer r3 = r3.putLong(r4)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.lang.String r16 = "audio/opus"
                goto L_0x03cc
            L_0x021f:
                r18 = r11
                java.lang.String r1 = r0.f6250b
                byte[] r1 = r0.m7576f(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
                goto L_0x03a7
            L_0x022f:
                r18 = r11
                java.lang.String r16 = "audio/eac3"
                goto L_0x030b
            L_0x0235:
                r18 = r11
                java.lang.String r16 = "video/mpeg2"
                goto L_0x030b
            L_0x023b:
                r18 = r11
                r16 = r14
                goto L_0x030b
            L_0x0241:
                r18 = r11
                c.a.a.a.m2.a0 r1 = new c.a.a.a.m2.a0
                java.lang.String r3 = r0.f6250b
                byte[] r3 = r0.m7576f(r3)
                r1.<init>(r3)
                c.a.a.a.n2.o r1 = p067c.p068a.p069a.p070a.p112n2.HevcConfig.m10526a(r1)
                java.util.List<byte[]> r3 = r1.f8562a
                int r4 = r1.f8563b
                r0.f6248Y = r4
                java.lang.String r1 = r1.f8564c
                java.lang.String r16 = "video/hevc"
                goto L_0x036f
            L_0x025e:
                r18 = r11
                byte[] r1 = p067c.p068a.p069a.p070a.p076f2.p081i0.MatroskaExtractor.f6166c
                java.lang.String r3 = r0.f6250b
                byte[] r3 = r0.m7576f(r3)
                c.a.b.b.r r1 = p067c.p068a.p134b.p136b.ImmutableList.m11919r(r1, r3)
                r16 = r13
                goto L_0x03a7
            L_0x0272:
                r18 = r11
                int r1 = r0.f6239P
                int r7 = p067c.p068a.p069a.p070a.p111m2.Util.m10272V(r1)
                if (r7 != 0) goto L_0x029a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported little endian PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f6239P
                r1.append(r3)
                r1.append(r4)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r1)
                goto L_0x042a
            L_0x029a:
                r1 = r17
                r3 = r1
                goto L_0x030f
            L_0x029f:
                r18 = r11
                int r1 = r0.f6239P
                if (r1 != r6) goto L_0x02ab
                r1 = r17
                r3 = r1
                r7 = 3
                goto L_0x030f
            L_0x02ab:
                if (r1 != r3) goto L_0x02b0
                r7 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x029a
            L_0x02b0:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported big endian PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f6239P
                r1.append(r3)
                r1.append(r4)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r1)
                goto L_0x042a
            L_0x02ce:
                r18 = r11
                int r1 = r0.f6239P
                r3 = 32
                if (r1 != r3) goto L_0x02d7
                goto L_0x029a
            L_0x02d7:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported floating point PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f6239P
                r1.append(r3)
                r1.append(r4)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r1)
                goto L_0x042a
            L_0x02f5:
                r18 = r11
                java.lang.String r16 = "video/x-unknown"
                goto L_0x030b
            L_0x02fa:
                r18 = r11
                r1 = r17
                r3 = r1
                r16 = r18
                goto L_0x030e
            L_0x0302:
                r18 = r11
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x030b
            L_0x0307:
                r18 = r11
                java.lang.String r16 = "video/x-vnd.on2.vp8"
            L_0x030b:
                r1 = r17
                r3 = r1
            L_0x030e:
                r7 = -1
            L_0x030f:
                r15 = -1
                goto L_0x043f
            L_0x0312:
                r18 = r11
                java.lang.String r16 = "video/av01"
                goto L_0x030b
            L_0x0317:
                r18 = r11
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x030b
            L_0x031c:
                r18 = r11
                java.lang.String r16 = "audio/ac3"
                goto L_0x030b
            L_0x0321:
                r18 = r11
                java.lang.String r1 = r0.f6250b
                byte[] r1 = r0.m7576f(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r3 = r0.f6259k
                c.a.a.a.b2.k$b r3 = p067c.p068a.p069a.p070a.p072b2.AacUtil.m6623f(r3)
                int r4 = r3.f5521a
                r0.f6240Q = r4
                int r4 = r3.f5522b
                r0.f6238O = r4
                java.lang.String r3 = r3.f5523c
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x030e
            L_0x0340:
                r18 = r11
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x030b
            L_0x0345:
                r18 = r11
                java.lang.String r1 = r0.f6250b
                byte[] r1 = r0.m7576f(r1)
                c.a.b.b.r r1 = p067c.p068a.p134b.p136b.ImmutableList.m11918q(r1)
                r16 = r12
                goto L_0x03a7
            L_0x0354:
                r18 = r11
                c.a.a.a.m2.a0 r1 = new c.a.a.a.m2.a0
                java.lang.String r3 = r0.f6250b
                byte[] r3 = r0.m7576f(r3)
                r1.<init>(r3)
                c.a.a.a.n2.j r1 = p067c.p068a.p069a.p070a.p112n2.AvcConfig.m10501b(r1)
                java.util.List<byte[]> r3 = r1.f8524a
                int r4 = r1.f8525b
                r0.f6248Y = r4
                java.lang.String r1 = r1.f8529f
                java.lang.String r16 = "video/avc"
            L_0x036f:
                r7 = -1
                r15 = -1
                r19 = r3
                r3 = r1
                r1 = r19
                goto L_0x043f
            L_0x0378:
                r18 = r11
                byte[] r1 = new byte[r7]
                java.lang.String r3 = r0.f6250b
                byte[] r3 = r0.m7576f(r3)
                java.lang.System.arraycopy(r3, r9, r1, r9, r7)
                c.a.b.b.r r1 = p067c.p068a.p134b.p136b.ImmutableList.m11918q(r1)
                r16 = r2
                goto L_0x03a7
            L_0x038c:
                r18 = r11
                c.a.a.a.m2.a0 r1 = new c.a.a.a.m2.a0
                java.lang.String r3 = r0.f6250b
                byte[] r3 = r0.m7576f(r3)
                r1.<init>(r3)
                android.util.Pair r1 = m7578j(r1)
                java.lang.Object r3 = r1.first
                r16 = r3
                java.lang.String r16 = (java.lang.String) r16
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
            L_0x03a7:
                r3 = r17
                goto L_0x030e
            L_0x03ab:
                r18 = r11
                java.lang.String r16 = "audio/mpeg"
                goto L_0x03b4
            L_0x03b0:
                r18 = r11
                java.lang.String r16 = "audio/mpeg-L2"
            L_0x03b4:
                r1 = r17
                r3 = r1
                r7 = -1
                r15 = 4096(0x1000, float:5.74E-42)
                goto L_0x043f
            L_0x03bc:
                r18 = r11
                r15 = 8192(0x2000, float:1.14794E-41)
                java.lang.String r1 = r0.f6250b
                byte[] r1 = r0.m7576f(r1)
                java.util.List r1 = m7580l(r1)
                java.lang.String r16 = "audio/vorbis"
            L_0x03cc:
                r3 = r17
                r7 = -1
                goto L_0x043f
            L_0x03d1:
                r18 = r11
                c.a.a.a.f2.i0.e$d r1 = new c.a.a.a.f2.i0.e$d
                r1.<init>()
                r0.f6243T = r1
                java.lang.String r16 = "audio/true-hd"
                goto L_0x030b
            L_0x03de:
                r18 = r11
                c.a.a.a.m2.a0 r1 = new c.a.a.a.m2.a0
                java.lang.String r3 = r0.f6250b
                byte[] r3 = r0.m7576f(r3)
                r1.<init>(r3)
                boolean r1 = m7579k(r1)
                if (r1 == 0) goto L_0x0416
                int r1 = r0.f6239P
                int r7 = p067c.p068a.p069a.p070a.p111m2.Util.m10272V(r1)
                if (r7 != 0) goto L_0x029a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f6239P
                r1.append(r3)
                r1.append(r4)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r1)
                goto L_0x042a
            L_0x0416:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r1.append(r3)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r5, r1)
            L_0x042a:
                r16 = r15
                goto L_0x030b
            L_0x042e:
                r18 = r11
                byte[] r1 = r0.f6259k
                if (r1 != 0) goto L_0x0437
                r1 = r17
                goto L_0x043b
            L_0x0437:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x043b:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x03a7
            L_0x043f:
                byte[] r4 = r0.f6237N
                if (r4 == 0) goto L_0x0452
                c.a.a.a.m2.a0 r5 = new c.a.a.a.m2.a0
                r5.<init>(r4)
                c.a.a.a.n2.l r4 = p067c.p068a.p069a.p070a.p112n2.DolbyVisionConfig.m10504a(r5)
                if (r4 == 0) goto L_0x0452
                java.lang.String r3 = r4.f8537c
                java.lang.String r16 = "video/dolby-vision"
            L_0x0452:
                r4 = r16
                boolean r5 = r0.f6245V
                r5 = r5 | r9
                boolean r6 = r0.f6244U
                if (r6 == 0) goto L_0x045d
                r6 = 2
                goto L_0x045e
            L_0x045d:
                r6 = 0
            L_0x045e:
                r5 = r5 | r6
                c.a.a.a.u0$b r6 = new c.a.a.a.u0$b
                r6.<init>()
                boolean r10 = p067c.p068a.p069a.p070a.p111m2.MimeTypes.m10409o(r4)
                if (r10 == 0) goto L_0x047c
                int r2 = r0.f6238O
                c.a.a.a.u0$b r2 = r6.mo7682H(r2)
                int r8 = r0.f6240Q
                c.a.a.a.u0$b r2 = r2.mo7706f0(r8)
                r2.mo7699Y(r7)
                r8 = 1
                goto L_0x0583
            L_0x047c:
                boolean r7 = p067c.p068a.p069a.p070a.p111m2.MimeTypes.m10411q(r4)
                if (r7 == 0) goto L_0x055a
                int r2 = r0.f6265q
                if (r2 != 0) goto L_0x0498
                int r2 = r0.f6263o
                r7 = -1
                if (r2 != r7) goto L_0x048d
                int r2 = r0.f6261m
            L_0x048d:
                r0.f6263o = r2
                int r2 = r0.f6264p
                if (r2 != r7) goto L_0x0495
                int r2 = r0.f6262n
            L_0x0495:
                r0.f6264p = r2
                goto L_0x0499
            L_0x0498:
                r7 = -1
            L_0x0499:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r8 = r0.f6263o
                if (r8 == r7) goto L_0x04ae
                int r10 = r0.f6264p
                if (r10 == r7) goto L_0x04ae
                int r2 = r0.f6262n
                int r2 = r2 * r8
                float r2 = (float) r2
                int r8 = r0.f6261m
                int r8 = r8 * r10
                float r8 = (float) r8
                float r2 = r2 / r8
            L_0x04ae:
                boolean r8 = r0.f6272x
                if (r8 == 0) goto L_0x04c2
                byte[] r8 = r20.m7577g()
                c.a.a.a.n2.k r10 = new c.a.a.a.n2.k
                int r11 = r0.f6273y
                int r12 = r0.f6224A
                int r13 = r0.f6274z
                r10.<init>(r11, r12, r13, r8)
                goto L_0x04c4
            L_0x04c2:
                r10 = r17
            L_0x04c4:
                java.lang.String r8 = r0.f6249a
                if (r8 == 0) goto L_0x04e4
                java.util.Map r8 = p067c.p068a.p069a.p070a.p076f2.p081i0.MatroskaExtractor.f6169f
                java.lang.String r11 = r0.f6249a
                boolean r8 = r8.containsKey(r11)
                if (r8 == 0) goto L_0x04e4
                java.util.Map r7 = p067c.p068a.p069a.p070a.p076f2.p081i0.MatroskaExtractor.f6169f
                java.lang.String r8 = r0.f6249a
                java.lang.Object r7 = r7.get(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
            L_0x04e4:
                int r8 = r0.f6266r
                if (r8 != 0) goto L_0x0534
                float r8 = r0.f6267s
                r11 = 0
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x0534
                float r8 = r0.f6268t
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x0534
                float r8 = r0.f6269u
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x0502
                goto L_0x0535
            L_0x0502:
                float r8 = r0.f6268t
                r9 = 1119092736(0x42b40000, float:90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x050f
                r9 = 90
                goto L_0x0535
            L_0x050f:
                float r8 = r0.f6268t
                r9 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 == 0) goto L_0x0531
                float r8 = r0.f6268t
                r9 = 1127481344(0x43340000, float:180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x0524
                goto L_0x0531
            L_0x0524:
                float r8 = r0.f6268t
                r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x0534
                r9 = 270(0x10e, float:3.78E-43)
                goto L_0x0535
            L_0x0531:
                r9 = 180(0xb4, float:2.52E-43)
                goto L_0x0535
            L_0x0534:
                r9 = r7
            L_0x0535:
                int r7 = r0.f6261m
                c.a.a.a.u0$b r7 = r6.mo7710j0(r7)
                int r8 = r0.f6262n
                c.a.a.a.u0$b r7 = r7.mo7691Q(r8)
                c.a.a.a.u0$b r2 = r7.mo7701a0(r2)
                c.a.a.a.u0$b r2 = r2.mo7704d0(r9)
                byte[] r7 = r0.f6270v
                c.a.a.a.u0$b r2 = r2.mo7702b0(r7)
                int r7 = r0.f6271w
                c.a.a.a.u0$b r2 = r2.mo7708h0(r7)
                r2.mo7684J(r10)
                r8 = 2
                goto L_0x0583
            L_0x055a:
                boolean r7 = r14.equals(r4)
                if (r7 != 0) goto L_0x0583
                boolean r7 = r13.equals(r4)
                if (r7 != 0) goto L_0x0583
                boolean r7 = r12.equals(r4)
                if (r7 != 0) goto L_0x0583
                r7 = r18
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x0583
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x057b
                goto L_0x0583
            L_0x057b:
                c.a.a.a.g1 r1 = new c.a.a.a.g1
                java.lang.String r2 = "Unexpected MIME type."
                r1.<init>(r2)
                throw r1
            L_0x0583:
                java.lang.String r2 = r0.f6249a
                if (r2 == 0) goto L_0x0598
                java.util.Map r2 = p067c.p068a.p069a.p070a.p076f2.p081i0.MatroskaExtractor.f6169f
                java.lang.String r7 = r0.f6249a
                boolean r2 = r2.containsKey(r7)
                if (r2 != 0) goto L_0x0598
                java.lang.String r2 = r0.f6249a
                r6.mo7695U(r2)
            L_0x0598:
                r2 = r22
                c.a.a.a.u0$b r2 = r6.mo7692R(r2)
                c.a.a.a.u0$b r2 = r2.mo7705e0(r4)
                c.a.a.a.u0$b r2 = r2.mo7697W(r15)
                java.lang.String r4 = r0.f6246W
                c.a.a.a.u0$b r2 = r2.mo7696V(r4)
                c.a.a.a.u0$b r2 = r2.mo7707g0(r5)
                c.a.a.a.u0$b r1 = r2.mo7694T(r1)
                c.a.a.a.u0$b r1 = r1.mo7683I(r3)
                c.a.a.a.e2.t r2 = r0.f6260l
                c.a.a.a.u0$b r1 = r1.mo7686L(r2)
                c.a.a.a.u0 r1 = r1.mo7679E()
                int r2 = r0.f6251c
                r3 = r21
                c.a.a.a.f2.b0 r2 = r3.mo6218q(r2, r8)
                r0.f6247X = r2
                r2.mo6177d(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p081i0.MatroskaExtractor.C0937c.mo6240h(c.a.a.a.f2.l, int):void");
        }

        @RequiresNonNull({"output"})
        /* renamed from: i */
        public void mo6241i() {
            C0938d dVar = this.f6243T;
            if (dVar != null) {
                dVar.mo6243a(this);
            }
        }

        /* renamed from: m */
        public void mo6242m() {
            C0938d dVar = this.f6243T;
            if (dVar != null) {
                dVar.mo6244b();
            }
        }
    }

    /* renamed from: c.a.a.a.f2.i0.e$d */
    /* compiled from: MatroskaExtractor */
    private static final class C0938d {

        /* renamed from: a */
        private final byte[] f6275a = new byte[10];

        /* renamed from: b */
        private boolean f6276b;

        /* renamed from: c */
        private int f6277c;

        /* renamed from: d */
        private long f6278d;

        /* renamed from: e */
        private int f6279e;

        /* renamed from: f */
        private int f6280f;

        /* renamed from: g */
        private int f6281g;

        @RequiresNonNull({"#1.output"})
        /* renamed from: a */
        public void mo6243a(C0937c cVar) {
            if (this.f6277c > 0) {
                cVar.f6247X.mo6176c(this.f6278d, this.f6279e, this.f6280f, this.f6281g, cVar.f6258j);
                this.f6277c = 0;
            }
        }

        /* renamed from: b */
        public void mo6244b() {
            this.f6276b = false;
            this.f6277c = 0;
        }

        @RequiresNonNull({"#1.output"})
        /* renamed from: c */
        public void mo6245c(C0937c cVar, long j, int i, int i2, int i3) {
            if (this.f6276b) {
                int i4 = this.f6277c;
                int i5 = i4 + 1;
                this.f6277c = i5;
                if (i4 == 0) {
                    this.f6278d = j;
                    this.f6279e = i;
                    this.f6280f = 0;
                }
                this.f6280f += i2;
                this.f6281g = i3;
                if (i5 >= 16) {
                    mo6243a(cVar);
                }
            }
        }

        /* renamed from: d */
        public void mo6246d(ExtractorInput kVar) throws IOException {
            if (!this.f6276b) {
                kVar.mo6204o(this.f6275a, 0, 10);
                kVar.mo6199h();
                if (Ac3Util.m6633i(this.f6275a) != 0) {
                    this.f6276b = true;
                }
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", Integer.valueOf(0));
        hashMap.put("htc_video_rotA-090", Integer.valueOf(90));
        hashMap.put("htc_video_rotA-180", Integer.valueOf(180));
        hashMap.put("htc_video_rotA-270", Integer.valueOf(270));
        f6169f = Collections.unmodifiableMap(hashMap);
    }

    public MatroskaExtractor() {
        this(0);
    }

    /* renamed from: A */
    static /* synthetic */ Extractor[] m7525A() {
        return new Extractor[]{new MatroskaExtractor()};
    }

    /* renamed from: B */
    private boolean m7526B(PositionHolder xVar, long j) {
        if (this.f6174E) {
            this.f6176G = j;
            xVar.f7015a = this.f6175F;
            this.f6174E = false;
            return true;
        }
        if (this.f6171B) {
            long j2 = this.f6176G;
            if (j2 != -1) {
                xVar.f7015a = j2;
                this.f6176G = -1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    private void m7527C(ExtractorInput kVar, int i) throws IOException {
        if (this.f6209m.mo7381f() < i) {
            if (this.f6209m.mo7377b() < i) {
                ParsableByteArray a0Var = this.f6209m;
                a0Var.mo7378c(Math.max(a0Var.mo7377b() * 2, i));
            }
            kVar.readFully(this.f6209m.mo7379d(), this.f6209m.mo7381f(), i - this.f6209m.mo7381f());
            this.f6209m.mo7373O(i);
        }
    }

    /* renamed from: D */
    private void m7528D() {
        this.f6193X = 0;
        this.f6194Y = 0;
        this.f6195Z = 0;
        this.f6196a0 = false;
        this.f6197b0 = false;
        this.f6198c0 = false;
        this.f6199d0 = 0;
        this.f6200e0 = 0;
        this.f6201f0 = false;
        this.f6212p.mo7370L(0);
    }

    /* renamed from: E */
    private long m7529E(long j) throws ParserException {
        long j2 = this.f6220x;
        if (j2 != -9223372036854775807L) {
            return Util.m10240B0(j, j2, 1000);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: F */
    private static void m7530F(String str, long j, byte[] bArr) {
        int i;
        byte[] bArr2;
        str.hashCode();
        if (str.equals("S_TEXT/ASS")) {
            bArr2 = m7545s(j, "%01d:%02d:%02d:%02d", 10000);
            i = 21;
        } else if (!str.equals("S_TEXT/UTF8")) {
            throw new IllegalArgumentException();
        } else {
            bArr2 = m7545s(j, "%02d:%02d:%02d,%03d", 1000);
            i = 19;
        }
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
    }

    /* JADX WARNING: Removed duplicated region for block: B:85:0x027b  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#2.output"})
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m7531I(p067c.p068a.p069a.p070a.p076f2.ExtractorInput r11, p067c.p068a.p069a.p070a.p076f2.p081i0.MatroskaExtractor.C0937c r12, int r13) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = r12.f6250b
            java.lang.String r1 = "S_TEXT/UTF8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0014
            byte[] r12 = f6165b
            r10.m7532J(r11, r12, r13)
            int r11 = r10.m7544q()
            return r11
        L_0x0014:
            java.lang.String r0 = r12.f6250b
            java.lang.String r1 = "S_TEXT/ASS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0028
            byte[] r12 = f6167d
            r10.m7532J(r11, r12, r13)
            int r11 = r10.m7544q()
            return r11
        L_0x0028:
            c.a.a.a.f2.b0 r0 = r12.f6247X
            boolean r1 = r10.f6196a0
            r2 = 4
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x01d9
            boolean r1 = r12.f6256h
            if (r1 == 0) goto L_0x017b
            int r1 = r10.f6190U
            r6 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r1 = r1 & r6
            r10.f6190U = r1
            boolean r1 = r10.f6197b0
            r6 = 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L_0x0072
            c.a.a.a.m2.a0 r1 = r10.f6209m
            byte[] r1 = r1.mo7379d()
            r11.readFully(r1, r5, r4)
            int r1 = r10.f6193X
            int r1 = r1 + r4
            r10.f6193X = r1
            c.a.a.a.m2.a0 r1 = r10.f6209m
            byte[] r1 = r1.mo7379d()
            byte r1 = r1[r5]
            r1 = r1 & r6
            if (r1 == r6) goto L_0x006a
            c.a.a.a.m2.a0 r1 = r10.f6209m
            byte[] r1 = r1.mo7379d()
            byte r1 = r1[r5]
            r10.f6200e0 = r1
            r10.f6197b0 = r4
            goto L_0x0072
        L_0x006a:
            c.a.a.a.g1 r11 = new c.a.a.a.g1
            java.lang.String r12 = "Extension bit is set in signal byte"
            r11.<init>(r12)
            throw r11
        L_0x0072:
            byte r1 = r10.f6200e0
            r7 = r1 & 1
            if (r7 != r4) goto L_0x007a
            r7 = 1
            goto L_0x007b
        L_0x007a:
            r7 = 0
        L_0x007b:
            if (r7 == 0) goto L_0x0185
            r1 = r1 & r3
            if (r1 != r3) goto L_0x0082
            r1 = 1
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            int r7 = r10.f6190U
            r8 = 1073741824(0x40000000, float:2.0)
            r7 = r7 | r8
            r10.f6190U = r7
            boolean r7 = r10.f6201f0
            if (r7 != 0) goto L_0x00cc
            c.a.a.a.m2.a0 r7 = r10.f6214r
            byte[] r7 = r7.mo7379d()
            r8 = 8
            r11.readFully(r7, r5, r8)
            int r7 = r10.f6193X
            int r7 = r7 + r8
            r10.f6193X = r7
            r10.f6201f0 = r4
            c.a.a.a.m2.a0 r7 = r10.f6209m
            byte[] r7 = r7.mo7379d()
            if (r1 == 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            r6 = r6 | r8
            byte r6 = (byte) r6
            r7[r5] = r6
            c.a.a.a.m2.a0 r6 = r10.f6209m
            r6.mo7374P(r5)
            c.a.a.a.m2.a0 r6 = r10.f6209m
            r0.mo6178e(r6, r4, r4)
            int r6 = r10.f6194Y
            int r6 = r6 + r4
            r10.f6194Y = r6
            c.a.a.a.m2.a0 r6 = r10.f6214r
            r6.mo7374P(r5)
            c.a.a.a.m2.a0 r6 = r10.f6214r
            r0.mo6178e(r6, r8, r4)
            int r6 = r10.f6194Y
            int r6 = r6 + r8
            r10.f6194Y = r6
        L_0x00cc:
            if (r1 == 0) goto L_0x0185
            boolean r1 = r10.f6198c0
            if (r1 != 0) goto L_0x00ef
            c.a.a.a.m2.a0 r1 = r10.f6209m
            byte[] r1 = r1.mo7379d()
            r11.readFully(r1, r5, r4)
            int r1 = r10.f6193X
            int r1 = r1 + r4
            r10.f6193X = r1
            c.a.a.a.m2.a0 r1 = r10.f6209m
            r1.mo7374P(r5)
            c.a.a.a.m2.a0 r1 = r10.f6209m
            int r1 = r1.mo7362D()
            r10.f6199d0 = r1
            r10.f6198c0 = r4
        L_0x00ef:
            int r1 = r10.f6199d0
            int r1 = r1 * 4
            c.a.a.a.m2.a0 r6 = r10.f6209m
            r6.mo7370L(r1)
            c.a.a.a.m2.a0 r6 = r10.f6209m
            byte[] r6 = r6.mo7379d()
            r11.readFully(r6, r5, r1)
            int r6 = r10.f6193X
            int r6 = r6 + r1
            r10.f6193X = r6
            int r1 = r10.f6199d0
            int r1 = r1 / r3
            int r1 = r1 + r4
            short r1 = (short) r1
            int r6 = r1 * 6
            int r6 = r6 + r3
            java.nio.ByteBuffer r7 = r10.f6217u
            if (r7 == 0) goto L_0x0118
            int r7 = r7.capacity()
            if (r7 >= r6) goto L_0x011e
        L_0x0118:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r6)
            r10.f6217u = r7
        L_0x011e:
            java.nio.ByteBuffer r7 = r10.f6217u
            r7.position(r5)
            java.nio.ByteBuffer r7 = r10.f6217u
            r7.putShort(r1)
            r1 = 0
            r7 = 0
        L_0x012a:
            int r8 = r10.f6199d0
            if (r1 >= r8) goto L_0x014c
            c.a.a.a.m2.a0 r8 = r10.f6209m
            int r8 = r8.mo7366H()
            int r9 = r1 % 2
            if (r9 != 0) goto L_0x0141
            java.nio.ByteBuffer r9 = r10.f6217u
            int r7 = r8 - r7
            short r7 = (short) r7
            r9.putShort(r7)
            goto L_0x0148
        L_0x0141:
            java.nio.ByteBuffer r9 = r10.f6217u
            int r7 = r8 - r7
            r9.putInt(r7)
        L_0x0148:
            int r1 = r1 + 1
            r7 = r8
            goto L_0x012a
        L_0x014c:
            int r1 = r10.f6193X
            int r1 = r13 - r1
            int r1 = r1 - r7
            int r8 = r8 % r3
            if (r8 != r4) goto L_0x015a
            java.nio.ByteBuffer r7 = r10.f6217u
            r7.putInt(r1)
            goto L_0x0165
        L_0x015a:
            java.nio.ByteBuffer r7 = r10.f6217u
            short r1 = (short) r1
            r7.putShort(r1)
            java.nio.ByteBuffer r1 = r10.f6217u
            r1.putInt(r5)
        L_0x0165:
            c.a.a.a.m2.a0 r1 = r10.f6215s
            java.nio.ByteBuffer r7 = r10.f6217u
            byte[] r7 = r7.array()
            r1.mo7372N(r7, r6)
            c.a.a.a.m2.a0 r1 = r10.f6215s
            r0.mo6178e(r1, r6, r4)
            int r1 = r10.f6194Y
            int r1 = r1 + r6
            r10.f6194Y = r1
            goto L_0x0185
        L_0x017b:
            byte[] r1 = r12.f6257i
            if (r1 == 0) goto L_0x0185
            c.a.a.a.m2.a0 r6 = r10.f6212p
            int r7 = r1.length
            r6.mo7372N(r1, r7)
        L_0x0185:
            int r1 = r12.f6254f
            if (r1 <= 0) goto L_0x01d7
            int r1 = r10.f6190U
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 | r6
            r10.f6190U = r1
            c.a.a.a.m2.a0 r1 = r10.f6216t
            r1.mo7370L(r5)
            c.a.a.a.m2.a0 r1 = r10.f6209m
            r1.mo7370L(r2)
            c.a.a.a.m2.a0 r1 = r10.f6209m
            byte[] r1 = r1.mo7379d()
            int r6 = r13 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r5] = r6
            c.a.a.a.m2.a0 r1 = r10.f6209m
            byte[] r1 = r1.mo7379d()
            int r6 = r13 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r4] = r6
            c.a.a.a.m2.a0 r1 = r10.f6209m
            byte[] r1 = r1.mo7379d()
            int r6 = r13 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r3] = r6
            c.a.a.a.m2.a0 r1 = r10.f6209m
            byte[] r1 = r1.mo7379d()
            r6 = 3
            r7 = r13 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r1[r6] = r7
            c.a.a.a.m2.a0 r1 = r10.f6209m
            r0.mo6178e(r1, r2, r3)
            int r1 = r10.f6194Y
            int r1 = r1 + r2
            r10.f6194Y = r1
        L_0x01d7:
            r10.f6196a0 = r4
        L_0x01d9:
            c.a.a.a.m2.a0 r1 = r10.f6212p
            int r1 = r1.mo7381f()
            int r13 = r13 + r1
            java.lang.String r1 = r12.f6250b
            java.lang.String r6 = "V_MPEG4/ISO/AVC"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x0220
            java.lang.String r1 = r12.f6250b
            java.lang.String r6 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x01f5
            goto L_0x0220
        L_0x01f5:
            c.a.a.a.f2.i0.e$d r1 = r12.f6243T
            if (r1 == 0) goto L_0x020b
            c.a.a.a.m2.a0 r1 = r10.f6212p
            int r1 = r1.mo7381f()
            if (r1 != 0) goto L_0x0202
            goto L_0x0203
        L_0x0202:
            r4 = 0
        L_0x0203:
            p067c.p068a.p069a.p070a.p111m2.Assertions.m10154f(r4)
            c.a.a.a.f2.i0.e$d r1 = r12.f6243T
            r1.mo6246d(r11)
        L_0x020b:
            int r1 = r10.f6193X
            if (r1 >= r13) goto L_0x0271
            int r1 = r13 - r1
            int r1 = r10.m7533K(r11, r0, r1)
            int r3 = r10.f6193X
            int r3 = r3 + r1
            r10.f6193X = r3
            int r3 = r10.f6194Y
            int r3 = r3 + r1
            r10.f6194Y = r3
            goto L_0x020b
        L_0x0220:
            c.a.a.a.m2.a0 r1 = r10.f6208l
            byte[] r1 = r1.mo7379d()
            r1[r5] = r5
            r1[r4] = r5
            r1[r3] = r5
            int r3 = r12.f6248Y
            int r4 = 4 - r3
        L_0x0230:
            int r6 = r10.f6193X
            if (r6 >= r13) goto L_0x0271
            int r6 = r10.f6195Z
            if (r6 != 0) goto L_0x025d
            r10.m7534L(r11, r1, r4, r3)
            int r6 = r10.f6193X
            int r6 = r6 + r3
            r10.f6193X = r6
            c.a.a.a.m2.a0 r6 = r10.f6208l
            r6.mo7374P(r5)
            c.a.a.a.m2.a0 r6 = r10.f6208l
            int r6 = r6.mo7366H()
            r10.f6195Z = r6
            c.a.a.a.m2.a0 r6 = r10.f6207k
            r6.mo7374P(r5)
            c.a.a.a.m2.a0 r6 = r10.f6207k
            r0.mo6174a(r6, r2)
            int r6 = r10.f6194Y
            int r6 = r6 + r2
            r10.f6194Y = r6
            goto L_0x0230
        L_0x025d:
            int r6 = r10.m7533K(r11, r0, r6)
            int r7 = r10.f6193X
            int r7 = r7 + r6
            r10.f6193X = r7
            int r7 = r10.f6194Y
            int r7 = r7 + r6
            r10.f6194Y = r7
            int r7 = r10.f6195Z
            int r7 = r7 - r6
            r10.f6195Z = r7
            goto L_0x0230
        L_0x0271:
            java.lang.String r11 = r12.f6250b
            java.lang.String r12 = "A_VORBIS"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x028a
            c.a.a.a.m2.a0 r11 = r10.f6210n
            r11.mo7374P(r5)
            c.a.a.a.m2.a0 r11 = r10.f6210n
            r0.mo6174a(r11, r2)
            int r11 = r10.f6194Y
            int r11 = r11 + r2
            r10.f6194Y = r11
        L_0x028a:
            int r11 = r10.m7544q()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p081i0.MatroskaExtractor.m7531I(c.a.a.a.f2.k, c.a.a.a.f2.i0.e$c, int):int");
    }

    /* renamed from: J */
    private void m7532J(ExtractorInput kVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.f6213q.mo7377b() < length) {
            this.f6213q.mo7371M(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.f6213q.mo7379d(), 0, bArr.length);
        }
        kVar.readFully(this.f6213q.mo7379d(), bArr.length, i);
        this.f6213q.mo7374P(0);
        this.f6213q.mo7373O(length);
    }

    /* renamed from: K */
    private int m7533K(ExtractorInput kVar, C0916b0 b0Var, int i) throws IOException {
        int a = this.f6212p.mo7376a();
        if (a <= 0) {
            return b0Var.mo6179f(kVar, i, false);
        }
        int min = Math.min(i, a);
        b0Var.mo6174a(this.f6212p, min);
        return min;
    }

    /* renamed from: L */
    private void m7534L(ExtractorInput kVar, byte[] bArr, int i, int i2) throws IOException {
        int min = Math.min(i2, this.f6212p.mo7376a());
        kVar.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f6212p.mo7385j(bArr, i, min);
        }
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* renamed from: h */
    private void m7538h(int i) throws ParserException {
        if (this.f6178I == null || this.f6179J == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw new ParserException(sb.toString());
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* renamed from: j */
    private void m7539j(int i) throws ParserException {
        if (this.f6170A == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a TrackEntry");
            throw new ParserException(sb.toString());
        }
    }

    @EnsuresNonNull({"extractorOutput"})
    /* renamed from: k */
    private void m7540k() {
        Assertions.m10156h(this.f6203g0);
    }

    /* renamed from: m */
    private SeekMap m7541m(LongArray uVar, LongArray uVar2) {
        int i;
        if (this.f6219w == -1 || this.f6222z == -9223372036854775807L || uVar == null || uVar.mo7483c() == 0 || uVar2 == null || uVar2.mo7483c() != uVar.mo7483c()) {
            return new C1003b(this.f6222z);
        }
        int c = uVar.mo7483c();
        int[] iArr = new int[c];
        long[] jArr = new long[c];
        long[] jArr2 = new long[c];
        long[] jArr3 = new long[c];
        int i2 = 0;
        for (int i3 = 0; i3 < c; i3++) {
            jArr3[i3] = uVar.mo7482b(i3);
            jArr[i3] = this.f6219w + uVar2.mo7482b(i3);
        }
        while (true) {
            i = c - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArr[i2] = (int) (jArr[i4] - jArr[i2]);
            jArr2[i2] = jArr3[i4] - jArr3[i2];
            i2 = i4;
        }
        iArr[i] = (int) ((this.f6219w + this.f6218v) - jArr[i]);
        jArr2[i] = this.f6222z - jArr3[i];
        long j = jArr2[i];
        if (j <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Discarding last cue point with unexpected duration: ");
            sb.append(j);
            Log.m10386h("MatroskaExtractor", sb.toString());
            iArr = Arrays.copyOf(iArr, i);
            jArr = Arrays.copyOf(jArr, i);
            jArr2 = Arrays.copyOf(jArr2, i);
            jArr3 = Arrays.copyOf(jArr3, i);
        }
        return new ChunkIndex(iArr, jArr, jArr2, jArr3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if ("S_TEXT/ASS".equals(r9.f6250b) != false) goto L_0x0023;
     */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7542n(p067c.p068a.p069a.p070a.p076f2.p081i0.MatroskaExtractor.C0937c r9, long r10, int r12, int r13, int r14) {
        /*
            r8 = this;
            c.a.a.a.f2.i0.e$d r0 = r9.f6243T
            r7 = 1
            if (r0 == 0) goto L_0x000f
            r1 = r9
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.mo6245c(r1, r2, r4, r5, r6)
            goto L_0x00a6
        L_0x000f:
            java.lang.String r0 = r9.f6250b
            java.lang.String r1 = "S_TEXT/UTF8"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = r9.f6250b
            java.lang.String r1 = "S_TEXT/ASS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007e
        L_0x0023:
            int r0 = r8.f6186Q
            java.lang.String r1 = "MatroskaExtractor"
            if (r0 <= r7) goto L_0x002f
            java.lang.String r0 = "Skipping subtitle sample in laced block."
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r1, r0)
            goto L_0x007e
        L_0x002f:
            long r2 = r8.f6184O
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = "Skipping subtitle sample with no duration."
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r1, r0)
            goto L_0x007e
        L_0x0040:
            java.lang.String r0 = r9.f6250b
            c.a.a.a.m2.a0 r1 = r8.f6213q
            byte[] r1 = r1.mo7379d()
            m7530F(r0, r2, r1)
            c.a.a.a.m2.a0 r0 = r8.f6213q
            int r0 = r0.mo7380e()
        L_0x0051:
            c.a.a.a.m2.a0 r1 = r8.f6213q
            int r1 = r1.mo7381f()
            if (r0 >= r1) goto L_0x006c
            c.a.a.a.m2.a0 r1 = r8.f6213q
            byte[] r1 = r1.mo7379d()
            byte r1 = r1[r0]
            if (r1 != 0) goto L_0x0069
            c.a.a.a.m2.a0 r1 = r8.f6213q
            r1.mo7373O(r0)
            goto L_0x006c
        L_0x0069:
            int r0 = r0 + 1
            goto L_0x0051
        L_0x006c:
            c.a.a.a.f2.b0 r0 = r9.f6247X
            c.a.a.a.m2.a0 r1 = r8.f6213q
            int r2 = r1.mo7381f()
            r0.mo6174a(r1, r2)
            c.a.a.a.m2.a0 r0 = r8.f6213q
            int r0 = r0.mo7381f()
            int r13 = r13 + r0
        L_0x007e:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r12
            if (r0 == 0) goto L_0x009b
            int r0 = r8.f6186Q
            if (r0 <= r7) goto L_0x008c
            r0 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r12 = r12 & r0
            goto L_0x009b
        L_0x008c:
            c.a.a.a.m2.a0 r0 = r8.f6216t
            int r0 = r0.mo7381f()
            c.a.a.a.f2.b0 r1 = r9.f6247X
            c.a.a.a.m2.a0 r2 = r8.f6216t
            r3 = 2
            r1.mo6178e(r2, r0, r3)
            int r13 = r13 + r0
        L_0x009b:
            r3 = r12
            r4 = r13
            c.a.a.a.f2.b0 r0 = r9.f6247X
            c.a.a.a.f2.b0$a r6 = r9.f6258j
            r1 = r10
            r5 = r14
            r0.mo6176c(r1, r3, r4, r5, r6)
        L_0x00a6:
            r8.f6181L = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p081i0.MatroskaExtractor.m7542n(c.a.a.a.f2.i0.e$c, long, int, int, int):void");
    }

    /* renamed from: p */
    private static int[] m7543p(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    /* renamed from: q */
    private int m7544q() {
        int i = this.f6194Y;
        m7528D();
        return i;
    }

    /* renamed from: s */
    private static byte[] m7545s(long j, String str, long j2) {
        Assertions.m10149a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return Util.m10290g0(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* renamed from: t */
    private C0937c m7546t(int i) throws ParserException {
        m7539j(i);
        return this.f6170A;
    }

    /* renamed from: y */
    private static boolean m7547y(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = 8;
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = 9;
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = 10;
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = 12;
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = 13;
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c = 26;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 28;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 29;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 30;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = 31;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo6230G(int i, long j, long j2) throws ParserException {
        m7540k();
        if (i == 160) {
            this.f6192W = false;
        } else if (i == 174) {
            this.f6170A = new C0937c();
        } else if (i == 187) {
            this.f6180K = false;
        } else if (i == 19899) {
            this.f6172C = -1;
            this.f6173D = -1;
        } else if (i == 20533) {
            m7546t(i).f6256h = true;
        } else if (i == 21968) {
            m7546t(i).f6272x = true;
        } else if (i == 408125543) {
            long j3 = this.f6219w;
            if (j3 == -1 || j3 == j) {
                this.f6219w = j;
                this.f6218v = j2;
                return;
            }
            throw new ParserException("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.f6178I = new LongArray();
            this.f6179J = new LongArray();
        } else if (i != 524531317 || this.f6171B) {
        } else {
            if (!this.f6206j || this.f6175F == -1) {
                this.f6203g0.mo6216f(new C1003b(this.f6222z));
                this.f6171B = true;
                return;
            }
            this.f6174E = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo6231H(int i, String str) throws ParserException {
        if (i == 134) {
            m7546t(i).f6250b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                m7546t(i).f6249a = str;
            } else if (i == 2274716) {
                m7546t(i).f6246W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new ParserException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo6188a() {
    }

    /* renamed from: b */
    public final void mo6189b(ExtractorOutput lVar) {
        this.f6203g0 = lVar;
    }

    /* renamed from: c */
    public void mo6190c(long j, long j2) {
        this.f6177H = -9223372036854775807L;
        this.f6182M = 0;
        this.f6202g.reset();
        this.f6204h.mo6250e();
        m7528D();
        for (int i = 0; i < this.f6205i.size(); i++) {
            ((C0937c) this.f6205i.valueAt(i)).mo6242m();
        }
    }

    /* renamed from: e */
    public final boolean mo6191e(ExtractorInput kVar) throws IOException {
        return new Sniffer().mo6247b(kVar);
    }

    /* renamed from: i */
    public final int mo6192i(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        this.f6181L = false;
        boolean z = true;
        while (z && !this.f6181L) {
            z = this.f6202g.mo6219a(kVar);
            if (z && m7526B(xVar, kVar.mo6206q())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.f6205i.size(); i++) {
            C0937c cVar = (C0937c) this.f6205i.valueAt(i);
            cVar.m7575e();
            cVar.mo6241i();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6232l(int i, int i2, ExtractorInput kVar) throws IOException {
        long j;
        long j2;
        int i3;
        byte b;
        int[] iArr;
        int i4 = i;
        int i5 = i2;
        ExtractorInput kVar2 = kVar;
        int i6 = 0;
        int i7 = 1;
        if (i4 == 161 || i4 == 163) {
            if (this.f6182M == 0) {
                this.f6188S = (int) this.f6204h.mo6249d(kVar2, false, true, 8);
                this.f6189T = this.f6204h.mo6248b();
                this.f6184O = -9223372036854775807L;
                this.f6182M = 1;
                this.f6209m.mo7370L(0);
            }
            C0937c cVar = (C0937c) this.f6205i.get(this.f6188S);
            if (cVar != null) {
                cVar.m7575e();
                if (this.f6182M == 1) {
                    m7527C(kVar2, 3);
                    int i8 = (this.f6209m.mo7379d()[2] & 6) >> 1;
                    byte b2 = 255;
                    if (i8 == 0) {
                        this.f6186Q = 1;
                        int[] p = m7543p(this.f6187R, 1);
                        this.f6187R = p;
                        p[0] = (i5 - this.f6189T) - 3;
                    } else {
                        int i9 = 4;
                        m7527C(kVar2, 4);
                        int i10 = (this.f6209m.mo7379d()[3] & 255) + 1;
                        this.f6186Q = i10;
                        int[] p2 = m7543p(this.f6187R, i10);
                        this.f6187R = p2;
                        if (i8 == 2) {
                            int i11 = (i5 - this.f6189T) - 4;
                            int i12 = this.f6186Q;
                            Arrays.fill(p2, 0, i12, i11 / i12);
                        } else if (i8 == 1) {
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                i3 = this.f6186Q;
                                if (i13 >= i3 - 1) {
                                    break;
                                }
                                this.f6187R[i13] = 0;
                                do {
                                    i9++;
                                    m7527C(kVar2, i9);
                                    b = this.f6209m.mo7379d()[i9 - 1] & 255;
                                    iArr = this.f6187R;
                                    iArr[i13] = iArr[i13] + b;
                                } while (b == 255);
                                i14 += iArr[i13];
                                i13++;
                            }
                            this.f6187R[i3 - 1] = ((i5 - this.f6189T) - i9) - i14;
                        } else if (i8 == 3) {
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                int i17 = this.f6186Q;
                                if (i15 >= i17 - 1) {
                                    this.f6187R[i17 - 1] = ((i5 - this.f6189T) - i9) - i16;
                                    break;
                                }
                                this.f6187R[i15] = i6;
                                i9++;
                                m7527C(kVar2, i9);
                                int i18 = i9 - 1;
                                if (this.f6209m.mo7379d()[i18] != 0) {
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= 8) {
                                            j = 0;
                                            break;
                                        }
                                        int i20 = i7 << (7 - i19);
                                        if ((this.f6209m.mo7379d()[i18] & i20) != 0) {
                                            int i21 = i9 + i19;
                                            m7527C(kVar2, i21);
                                            long j3 = (long) (this.f6209m.mo7379d()[i18] & b2 & (i20 ^ -1));
                                            int i22 = i18 + 1;
                                            while (true) {
                                                j2 = j3;
                                                if (i22 >= i21) {
                                                    break;
                                                }
                                                j3 = (j2 << 8) | ((long) (this.f6209m.mo7379d()[i22] & b2));
                                                i22++;
                                                i21 = i21;
                                                b2 = 255;
                                            }
                                            int i23 = i21;
                                            if (i15 > 0) {
                                                j2 -= (1 << ((i19 * 7) + 6)) - 1;
                                            }
                                            j = j2;
                                            i9 = i23;
                                        } else {
                                            i19++;
                                            i7 = 1;
                                            b2 = 255;
                                        }
                                    }
                                    if (j >= -2147483648L && j <= 2147483647L) {
                                        int i24 = (int) j;
                                        int[] iArr2 = this.f6187R;
                                        if (i15 != 0) {
                                            i24 += iArr2[i15 - 1];
                                        }
                                        iArr2[i15] = i24;
                                        i16 += iArr2[i15];
                                        i15++;
                                        i6 = 0;
                                        i7 = 1;
                                        b2 = 255;
                                    }
                                } else {
                                    throw new ParserException("No valid varint length mask found");
                                }
                            }
                            throw new ParserException("EBML lacing sample size out of range.");
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected lacing value: ");
                            sb.append(i8);
                            throw new ParserException(sb.toString());
                        }
                    }
                    this.f6183N = this.f6177H + m7529E((long) ((this.f6209m.mo7379d()[0] << 8) | (this.f6209m.mo7379d()[1] & 255)));
                    this.f6190U = (cVar.f6252d == 2 || (i4 == 163 && (this.f6209m.mo7379d()[2] & 128) == 128)) ? 1 : 0;
                    this.f6182M = 2;
                    this.f6185P = 0;
                }
                if (i4 != 163) {
                    while (true) {
                        int i25 = this.f6185P;
                        if (i25 >= this.f6186Q) {
                            break;
                        }
                        int[] iArr3 = this.f6187R;
                        iArr3[i25] = m7531I(kVar2, cVar, iArr3[i25]);
                        this.f6185P++;
                    }
                } else {
                    while (true) {
                        int i26 = this.f6185P;
                        if (i26 >= this.f6186Q) {
                            break;
                        }
                        m7542n(cVar, ((long) ((this.f6185P * cVar.f6253e) / 1000)) + this.f6183N, this.f6190U, m7531I(kVar2, cVar, this.f6187R[i26]), 0);
                        this.f6185P++;
                    }
                    this.f6182M = 0;
                }
            } else {
                kVar2.mo6200i(i5 - this.f6189T);
                this.f6182M = 0;
            }
        } else if (i4 != 165) {
            if (i4 == 16877) {
                mo6236v(m7546t(i), kVar2, i5);
            } else if (i4 == 16981) {
                m7539j(i);
                byte[] bArr = new byte[i5];
                this.f6170A.f6257i = bArr;
                kVar2.readFully(bArr, 0, i5);
            } else if (i4 == 18402) {
                byte[] bArr2 = new byte[i5];
                kVar2.readFully(bArr2, 0, i5);
                m7546t(i).f6258j = new C0917a(1, bArr2, 0, 0);
            } else if (i4 == 21419) {
                Arrays.fill(this.f6211o.mo7379d(), 0);
                kVar2.readFully(this.f6211o.mo7379d(), 4 - i5, i5);
                this.f6211o.mo7374P(0);
                this.f6172C = (int) this.f6211o.mo7364F();
            } else if (i4 == 25506) {
                m7539j(i);
                byte[] bArr3 = new byte[i5];
                this.f6170A.f6259k = bArr3;
                kVar2.readFully(bArr3, 0, i5);
            } else if (i4 == 30322) {
                m7539j(i);
                byte[] bArr4 = new byte[i5];
                this.f6170A.f6270v = bArr4;
                kVar2.readFully(bArr4, 0, i5);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected id: ");
                sb2.append(i4);
                throw new ParserException(sb2.toString());
            }
        } else if (this.f6182M == 2) {
            mo6237w((C0937c) this.f6205i.get(this.f6188S), this.f6191V, kVar2, i5);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo6233o(int i) throws ParserException {
        m7540k();
        if (i != 160) {
            if (i == 174) {
                C0937c cVar = (C0937c) Assertions.m10156h(this.f6170A);
                String str = cVar.f6250b;
                if (str != null) {
                    if (m7547y(str)) {
                        cVar.mo6240h(this.f6203g0, cVar.f6251c);
                        this.f6205i.put(cVar.f6251c, cVar);
                    }
                    this.f6170A = null;
                } else {
                    throw new ParserException("CodecId is missing in TrackEntry element");
                }
            } else if (i == 19899) {
                int i2 = this.f6172C;
                if (i2 != -1) {
                    long j = this.f6173D;
                    if (j != -1) {
                        if (i2 == 475249515) {
                            this.f6175F = j;
                        }
                    }
                }
                throw new ParserException("Mandatory element SeekID or SeekPosition not found");
            } else if (i == 25152) {
                m7539j(i);
                C0937c cVar2 = this.f6170A;
                if (cVar2.f6256h) {
                    if (cVar2.f6258j != null) {
                        cVar2.f6260l = new DrmInitData(new C0894b(C.f7370a, "video/webm", this.f6170A.f6258j.f5994b));
                    } else {
                        throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
                    }
                }
            } else if (i == 28032) {
                m7539j(i);
                C0937c cVar3 = this.f6170A;
                if (cVar3.f6256h && cVar3.f6257i != null) {
                    throw new ParserException("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.f6220x == -9223372036854775807L) {
                    this.f6220x = 1000000;
                }
                long j2 = this.f6221y;
                if (j2 != -9223372036854775807L) {
                    this.f6222z = m7529E(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515) {
                    if (!this.f6171B) {
                        this.f6203g0.mo6216f(m7541m(this.f6178I, this.f6179J));
                        this.f6171B = true;
                    }
                    this.f6178I = null;
                    this.f6179J = null;
                }
            } else if (this.f6205i.size() != 0) {
                this.f6203g0.mo6217h();
            } else {
                throw new ParserException("No valid tracks were found");
            }
        } else if (this.f6182M == 2) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f6186Q; i4++) {
                i3 += this.f6187R[i4];
            }
            C0937c cVar4 = (C0937c) this.f6205i.get(this.f6188S);
            cVar4.m7575e();
            for (int i5 = 0; i5 < this.f6186Q; i5++) {
                long j3 = ((long) ((cVar4.f6253e * i5) / 1000)) + this.f6183N;
                int i6 = this.f6190U;
                if (i5 == 0 && !this.f6192W) {
                    i6 |= 1;
                }
                int i7 = i6;
                int i8 = this.f6187R[i5];
                i3 -= i8;
                m7542n(cVar4, j3, i7, i8, i3);
            }
            this.f6182M = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo6234r(int i, double d) throws ParserException {
        if (i == 181) {
            m7546t(i).f6240Q = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    m7546t(i).f6227D = (float) d;
                    return;
                case 21970:
                    m7546t(i).f6228E = (float) d;
                    return;
                case 21971:
                    m7546t(i).f6229F = (float) d;
                    return;
                case 21972:
                    m7546t(i).f6230G = (float) d;
                    return;
                case 21973:
                    m7546t(i).f6231H = (float) d;
                    return;
                case 21974:
                    m7546t(i).f6232I = (float) d;
                    return;
                case 21975:
                    m7546t(i).f6233J = (float) d;
                    return;
                case 21976:
                    m7546t(i).f6234K = (float) d;
                    return;
                case 21977:
                    m7546t(i).f6235L = (float) d;
                    return;
                case 21978:
                    m7546t(i).f6236M = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            m7546t(i).f6267s = (float) d;
                            return;
                        case 30324:
                            m7546t(i).f6268t = (float) d;
                            return;
                        case 30325:
                            m7546t(i).f6269u = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f6221y = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public int mo6235u(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo6236v(C0937c cVar, ExtractorInput kVar, int i) throws IOException {
        if (cVar.f6255g == 1685485123 || cVar.f6255g == 1685480259) {
            byte[] bArr = new byte[i];
            cVar.f6237N = bArr;
            kVar.readFully(bArr, 0, i);
            return;
        }
        kVar.mo6200i(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo6237w(C0937c cVar, int i, ExtractorInput kVar, int i2) throws IOException {
        if (i == 4) {
            if ("V_VP9".equals(cVar.f6250b)) {
                this.f6216t.mo7370L(i2);
                kVar.readFully(this.f6216t.mo7379d(), 0, i2);
                return;
            }
        }
        kVar.mo6200i(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo6238x(int i, long j) throws ParserException {
        String str = " not supported";
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        m7546t(i).f6252d = (int) j;
                        return;
                    case 136:
                        C0937c t = m7546t(i);
                        if (j == 1) {
                            z = true;
                        }
                        t.f6245V = z;
                        return;
                    case 155:
                        this.f6184O = m7529E(j);
                        return;
                    case 159:
                        m7546t(i).f6238O = (int) j;
                        return;
                    case 176:
                        m7546t(i).f6261m = (int) j;
                        return;
                    case 179:
                        m7538h(i);
                        this.f6178I.mo7481a(m7529E(j));
                        return;
                    case 186:
                        m7546t(i).f6262n = (int) j;
                        return;
                    case 215:
                        m7546t(i).f6251c = (int) j;
                        return;
                    case 231:
                        this.f6177H = m7529E(j);
                        return;
                    case 238:
                        this.f6191V = (int) j;
                        return;
                    case 241:
                        if (!this.f6180K) {
                            m7538h(i);
                            this.f6179J.mo7481a(j);
                            this.f6180K = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f6192W = true;
                        return;
                    case 16871:
                        m7546t(i).f6255g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(str);
                            throw new ParserException(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(str);
                            throw new ParserException(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(str);
                            throw new ParserException(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(str);
                            throw new ParserException(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(str);
                            throw new ParserException(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.f6173D = j + this.f6219w;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        m7539j(i);
                        if (i2 == 0) {
                            this.f6170A.f6271w = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f6170A.f6271w = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f6170A.f6271w = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f6170A.f6271w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        m7546t(i).f6263o = (int) j;
                        return;
                    case 21682:
                        m7546t(i).f6265q = (int) j;
                        return;
                    case 21690:
                        m7546t(i).f6264p = (int) j;
                        return;
                    case 21930:
                        C0937c t2 = m7546t(i);
                        if (j == 1) {
                            z = true;
                        }
                        t2.f6244U = z;
                        return;
                    case 21998:
                        m7546t(i).f6254f = (int) j;
                        return;
                    case 22186:
                        m7546t(i).f6241R = j;
                        return;
                    case 22203:
                        m7546t(i).f6242S = j;
                        return;
                    case 25188:
                        m7546t(i).f6239P = (int) j;
                        return;
                    case 30321:
                        m7539j(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f6170A.f6266r = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f6170A.f6266r = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f6170A.f6266r = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f6170A.f6266r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        m7546t(i).f6253e = (int) j;
                        return;
                    case 2807729:
                        this.f6220x = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                m7539j(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f6170A.f6224A = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f6170A.f6224A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                m7539j(i);
                                int i5 = (int) j;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.f6170A.f6274z = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.f6170A.f6274z = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.f6170A.f6274z = 3;
                                return;
                            case 21947:
                                m7539j(i);
                                C0937c cVar = this.f6170A;
                                cVar.f6272x = true;
                                int i6 = (int) j;
                                if (i6 == 1) {
                                    cVar.f6273y = 1;
                                    return;
                                } else if (i6 == 9) {
                                    cVar.f6273y = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    cVar.f6273y = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                m7546t(i).f6225B = (int) j;
                                return;
                            case 21949:
                                m7546t(i).f6226C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(str);
                throw new ParserException(sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(str);
            throw new ParserException(sb7.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo6239z(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public MatroskaExtractor(int i) {
        this(new DefaultEbmlReader(), i);
    }

    MatroskaExtractor(EbmlReader dVar, int i) {
        this.f6219w = -1;
        this.f6220x = -9223372036854775807L;
        this.f6221y = -9223372036854775807L;
        this.f6222z = -9223372036854775807L;
        this.f6175F = -1;
        this.f6176G = -1;
        this.f6177H = -9223372036854775807L;
        this.f6202g = dVar;
        dVar.mo6220b(new C0936b());
        this.f6206j = (i & 1) == 0;
        this.f6204h = new VarintReader();
        this.f6205i = new SparseArray<>();
        this.f6209m = new ParsableByteArray(4);
        this.f6210n = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.f6211o = new ParsableByteArray(4);
        this.f6207k = new ParsableByteArray(NalUnitUtil.f8442a);
        this.f6208l = new ParsableByteArray(4);
        this.f6212p = new ParsableByteArray();
        this.f6213q = new ParsableByteArray();
        this.f6214r = new ParsableByteArray(8);
        this.f6215s = new ParsableByteArray();
        this.f6216t = new ParsableByteArray();
        this.f6187R = new int[1];
    }
}
