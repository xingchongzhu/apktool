package p067c.p068a.p069a.p070a.p100k2.p102o;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.p259uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.TType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Cue.C1119b;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.o.b */
final class DvbParser {

    /* renamed from: a */
    private static final byte[] f7861a = {0, 7, 8, TType.f16864m};

    /* renamed from: b */
    private static final byte[] f7862b = {0, 119, -120, -1};

    /* renamed from: c */
    private static final byte[] f7863c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, ByteSourceJsonBootstrapper.UTF8_BOM_2, -52, -35, -18, -1};

    /* renamed from: d */
    private final Paint f7864d;

    /* renamed from: e */
    private final Paint f7865e;

    /* renamed from: f */
    private final Canvas f7866f = new Canvas();

    /* renamed from: g */
    private final C1132b f7867g;

    /* renamed from: h */
    private final C1131a f7868h;

    /* renamed from: i */
    private final C1138h f7869i;

    /* renamed from: j */
    private Bitmap f7870j;

    /* renamed from: c.a.a.a.k2.o.b$a */
    /* compiled from: DvbParser */
    private static final class C1131a {

        /* renamed from: a */
        public final int f7871a;

        /* renamed from: b */
        public final int[] f7872b;

        /* renamed from: c */
        public final int[] f7873c;

        /* renamed from: d */
        public final int[] f7874d;

        public C1131a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f7871a = i;
            this.f7872b = iArr;
            this.f7873c = iArr2;
            this.f7874d = iArr3;
        }
    }

    /* renamed from: c.a.a.a.k2.o.b$b */
    /* compiled from: DvbParser */
    private static final class C1132b {

        /* renamed from: a */
        public final int f7875a;

        /* renamed from: b */
        public final int f7876b;

        /* renamed from: c */
        public final int f7877c;

        /* renamed from: d */
        public final int f7878d;

        /* renamed from: e */
        public final int f7879e;

        /* renamed from: f */
        public final int f7880f;

        public C1132b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f7875a = i;
            this.f7876b = i2;
            this.f7877c = i3;
            this.f7878d = i4;
            this.f7879e = i5;
            this.f7880f = i6;
        }
    }

    /* renamed from: c.a.a.a.k2.o.b$c */
    /* compiled from: DvbParser */
    private static final class C1133c {

        /* renamed from: a */
        public final int f7881a;

        /* renamed from: b */
        public final boolean f7882b;

        /* renamed from: c */
        public final byte[] f7883c;

        /* renamed from: d */
        public final byte[] f7884d;

        public C1133c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f7881a = i;
            this.f7882b = z;
            this.f7883c = bArr;
            this.f7884d = bArr2;
        }
    }

    /* renamed from: c.a.a.a.k2.o.b$d */
    /* compiled from: DvbParser */
    private static final class C1134d {

        /* renamed from: a */
        public final int f7885a;

        /* renamed from: b */
        public final int f7886b;

        /* renamed from: c */
        public final int f7887c;

        /* renamed from: d */
        public final SparseArray<C1135e> f7888d;

        public C1134d(int i, int i2, int i3, SparseArray<C1135e> sparseArray) {
            this.f7885a = i;
            this.f7886b = i2;
            this.f7887c = i3;
            this.f7888d = sparseArray;
        }
    }

    /* renamed from: c.a.a.a.k2.o.b$e */
    /* compiled from: DvbParser */
    private static final class C1135e {

        /* renamed from: a */
        public final int f7889a;

        /* renamed from: b */
        public final int f7890b;

        public C1135e(int i, int i2) {
            this.f7889a = i;
            this.f7890b = i2;
        }
    }

    /* renamed from: c.a.a.a.k2.o.b$f */
    /* compiled from: DvbParser */
    private static final class C1136f {

        /* renamed from: a */
        public final int f7891a;

        /* renamed from: b */
        public final boolean f7892b;

        /* renamed from: c */
        public final int f7893c;

        /* renamed from: d */
        public final int f7894d;

        /* renamed from: e */
        public final int f7895e;

        /* renamed from: f */
        public final int f7896f;

        /* renamed from: g */
        public final int f7897g;

        /* renamed from: h */
        public final int f7898h;

        /* renamed from: i */
        public final int f7899i;

        /* renamed from: j */
        public final int f7900j;

        /* renamed from: k */
        public final SparseArray<C1137g> f7901k;

        public C1136f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C1137g> sparseArray) {
            this.f7891a = i;
            this.f7892b = z;
            this.f7893c = i2;
            this.f7894d = i3;
            this.f7895e = i4;
            this.f7896f = i5;
            this.f7897g = i6;
            this.f7898h = i7;
            this.f7899i = i8;
            this.f7900j = i9;
            this.f7901k = sparseArray;
        }

        /* renamed from: a */
        public void mo7108a(C1136f fVar) {
            SparseArray<C1137g> sparseArray = fVar.f7901k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f7901k.put(sparseArray.keyAt(i), (C1137g) sparseArray.valueAt(i));
            }
        }
    }

    /* renamed from: c.a.a.a.k2.o.b$g */
    /* compiled from: DvbParser */
    private static final class C1137g {

        /* renamed from: a */
        public final int f7902a;

        /* renamed from: b */
        public final int f7903b;

        /* renamed from: c */
        public final int f7904c;

        /* renamed from: d */
        public final int f7905d;

        /* renamed from: e */
        public final int f7906e;

        /* renamed from: f */
        public final int f7907f;

        public C1137g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f7902a = i;
            this.f7903b = i2;
            this.f7904c = i3;
            this.f7905d = i4;
            this.f7906e = i5;
            this.f7907f = i6;
        }
    }

    /* renamed from: c.a.a.a.k2.o.b$h */
    /* compiled from: DvbParser */
    private static final class C1138h {

        /* renamed from: a */
        public final int f7908a;

        /* renamed from: b */
        public final int f7909b;

        /* renamed from: c */
        public final SparseArray<C1136f> f7910c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C1131a> f7911d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C1133c> f7912e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C1131a> f7913f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C1133c> f7914g = new SparseArray<>();

        /* renamed from: h */
        public C1132b f7915h;

        /* renamed from: i */
        public C1134d f7916i;

        public C1138h(int i, int i2) {
            this.f7908a = i;
            this.f7909b = i2;
        }

        /* renamed from: a */
        public void mo7109a() {
            this.f7910c.clear();
            this.f7911d.clear();
            this.f7912e.clear();
            this.f7913f.clear();
            this.f7914g.clear();
            this.f7915h = null;
            this.f7916i = null;
        }
    }

    public DvbParser(int i, int i2) {
        Paint paint = new Paint();
        this.f7864d = paint;
        paint.setStyle(Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f7865e = paint2;
        paint2.setStyle(Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        paint2.setPathEffect(null);
        C1132b bVar = new C1132b(719, 575, 0, 719, 0, 575);
        this.f7867g = bVar;
        this.f7868h = new C1131a(0, m9564c(), m9565d(), m9566e());
        this.f7869i = new C1138h(i, i2);
    }

    /* renamed from: a */
    private static byte[] m9563a(int i, int i2, ParsableBitArray zVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zVar.mo7495h(i2);
        }
        return bArr;
    }

    /* renamed from: c */
    private static int[] m9564c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: d */
    private static int[] m9565d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m9567f(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m9567f(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    /* renamed from: e */
    private static int[] m9566e() {
        int[] iArr = new int[LogType.UNEXP];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m9567f(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m9567f(255, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m9567f(255, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m9567f(255, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m9567f(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    /* renamed from: f */
    private static int m9567f(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r4v0, types: [int] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v4, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v3, types: [int] */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r3v5, types: [int] */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v4, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r15v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v9
  assigns: []
  uses: []
  mth insns count: 72
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083 A[LOOP:0: B:1:0x0009->B:31:0x0083, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 13 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m9568g(p067c.p068a.p069a.p070a.p111m2.ParsableBitArray r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 2
            int r4 = r13.mo7495h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
        L_0x0012:
            r12 = 1
            goto L_0x0061
        L_0x0014:
            boolean r4 = r13.mo7494g()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.mo7495h(r6)
            int r4 = r4 + r6
            int r3 = r13.mo7495h(r3)
        L_0x0024:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0061
        L_0x0028:
            boolean r4 = r13.mo7494g()
            if (r4 == 0) goto L_0x0031
            r11 = r2
            r4 = 0
            goto L_0x0012
        L_0x0031:
            int r4 = r13.mo7495h(r3)
            if (r4 == 0) goto L_0x005e
            if (r4 == r5) goto L_0x005a
            if (r4 == r3) goto L_0x004e
            if (r4 == r6) goto L_0x0041
            r11 = r2
            r4 = 0
        L_0x003f:
            r12 = 0
            goto L_0x0061
        L_0x0041:
            r4 = 8
            int r4 = r13.mo7495h(r4)
            int r4 = r4 + 29
            int r3 = r13.mo7495h(r3)
            goto L_0x0024
        L_0x004e:
            r4 = 4
            int r4 = r13.mo7495h(r4)
            int r4 = r4 + 12
            int r3 = r13.mo7495h(r3)
            goto L_0x0024
        L_0x005a:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0061
        L_0x005e:
            r4 = 0
            r11 = 1
            goto L_0x003f
        L_0x0061:
            if (r12 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            if (r15 == 0) goto L_0x0069
            byte r4 = r15[r4]
        L_0x0069:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x007f:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0083
            return r10
        L_0x0083:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p102o.DvbParser.m9568g(c.a.a.a.m2.z, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r4v0, types: [int] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v4, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v12, types: [int] */
    /* JADX WARNING: type inference failed for: r4v15, types: [int] */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v19, types: [int] */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v35 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v4, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r15v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v6
  assigns: []
  uses: []
  mth insns count: 77
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[LOOP:0: B:1:0x0009->B:34:0x008e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 14 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m9569h(p067c.p068a.p069a.p070a.p111m2.ParsableBitArray r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 4
            int r4 = r13.mo7495h(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0016
            r11 = r2
        L_0x0013:
            r12 = 1
            goto L_0x006e
        L_0x0016:
            boolean r4 = r13.mo7494g()
            r7 = 3
            if (r4 != 0) goto L_0x002c
            int r3 = r13.mo7495h(r7)
            if (r3 == 0) goto L_0x0029
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L_0x006e
        L_0x0029:
            r4 = 0
            r11 = 1
            goto L_0x004d
        L_0x002c:
            boolean r4 = r13.mo7494g()
            if (r4 != 0) goto L_0x003f
            int r4 = r13.mo7495h(r5)
            int r5 = r4 + 4
            int r4 = r13.mo7495h(r3)
        L_0x003c:
            r11 = r2
            r12 = r5
            goto L_0x006e
        L_0x003f:
            int r4 = r13.mo7495h(r5)
            if (r4 == 0) goto L_0x006b
            if (r4 == r6) goto L_0x0067
            if (r4 == r5) goto L_0x005c
            if (r4 == r7) goto L_0x004f
            r11 = r2
            r4 = 0
        L_0x004d:
            r12 = 0
            goto L_0x006e
        L_0x004f:
            r4 = 8
            int r4 = r13.mo7495h(r4)
            int r5 = r4 + 25
            int r4 = r13.mo7495h(r3)
            goto L_0x003c
        L_0x005c:
            int r4 = r13.mo7495h(r3)
            int r5 = r4 + 9
            int r4 = r13.mo7495h(r3)
            goto L_0x003c
        L_0x0067:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x006e
        L_0x006b:
            r11 = r2
            r4 = 0
            goto L_0x0013
        L_0x006e:
            if (r12 == 0) goto L_0x008a
            if (r8 == 0) goto L_0x008a
            if (r15 == 0) goto L_0x0076
            byte r4 = r15[r4]
        L_0x0076:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x008a:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x008e
            return r10
        L_0x008e:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p102o.DvbParser.m9569h(c.a.a.a.m2.z, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r4v4, types: [byte] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m9570i(p067c.p068a.p069a.p070a.p111m2.ParsableBitArray r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 8
            int r4 = r13.mo7495h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = 1
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.mo7494g()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.mo7495h(r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = 0
            goto L_0x0035
        L_0x0026:
            r4 = 0
            r11 = 1
            r12 = 0
            goto L_0x0035
        L_0x002a:
            int r4 = r13.mo7495h(r6)
            int r3 = r13.mo7495h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p100k2.p102o.DvbParser.m9570i(c.a.a.a.m2.z, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: j */
    private static void m9571j(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int i4 = i;
        byte[] bArr5 = bArr;
        ParsableBitArray zVar = new ParsableBitArray(bArr);
        int i5 = i2;
        int i6 = i3;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        while (zVar.mo7489b() != 0) {
            int h = zVar.mo7495h(8);
            if (h != 240) {
                switch (h) {
                    case 16:
                        if (i4 != 3) {
                            if (i4 != 2) {
                                bArr2 = null;
                                i5 = m9568g(zVar, iArr, bArr2, i5, i6, paint, canvas);
                                zVar.mo7490c();
                                break;
                            } else {
                                bArr3 = bArr8 == null ? f7861a : bArr8;
                            }
                        } else {
                            bArr3 = bArr6 == null ? f7862b : bArr6;
                        }
                        bArr2 = bArr3;
                        i5 = m9568g(zVar, iArr, bArr2, i5, i6, paint, canvas);
                        zVar.mo7490c();
                    case 17:
                        if (i4 == 3) {
                            bArr4 = bArr7 == null ? f7863c : bArr7;
                        } else {
                            bArr4 = null;
                        }
                        i5 = m9569h(zVar, iArr, bArr4, i5, i6, paint, canvas);
                        zVar.mo7490c();
                        break;
                    case 18:
                        i5 = m9570i(zVar, iArr, null, i5, i6, paint, canvas);
                        break;
                    default:
                        switch (h) {
                            case 32:
                                bArr8 = m9563a(4, 4, zVar);
                                break;
                            case 33:
                                bArr6 = m9563a(4, 8, zVar);
                                break;
                            case 34:
                                bArr7 = m9563a(16, 8, zVar);
                                break;
                        }
                }
            } else {
                i6 += 2;
                i5 = i2;
            }
        }
    }

    /* renamed from: k */
    private static void m9572k(C1133c cVar, C1131a aVar, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = aVar.f7874d;
        } else if (i == 2) {
            iArr = aVar.f7873c;
        } else {
            iArr = aVar.f7872b;
        }
        int[] iArr2 = iArr;
        int i4 = i;
        int i5 = i2;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        m9571j(cVar.f7883c, iArr2, i4, i5, i3, paint2, canvas2);
        m9571j(cVar.f7884d, iArr2, i4, i5, i3 + 1, paint2, canvas2);
    }

    /* renamed from: l */
    private static C1131a m9573l(ParsableBitArray zVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ParsableBitArray zVar2 = zVar;
        int i7 = 8;
        int h = zVar2.mo7495h(8);
        zVar2.mo7505r(8);
        int i8 = 2;
        int i9 = i - 2;
        int[] c = m9564c();
        int[] d = m9565d();
        int[] e = m9566e();
        while (i9 > 0) {
            int h2 = zVar2.mo7495h(i7);
            int h3 = zVar2.mo7495h(i7);
            int i10 = i9 - 2;
            int[] iArr = (h3 & 128) != 0 ? c : (h3 & 64) != 0 ? d : e;
            if ((h3 & 1) != 0) {
                i5 = zVar2.mo7495h(i7);
                i4 = zVar2.mo7495h(i7);
                i3 = zVar2.mo7495h(i7);
                i2 = zVar2.mo7495h(i7);
                i6 = i10 - 4;
            } else {
                i3 = zVar2.mo7495h(4) << 4;
                i6 = i10 - 2;
                i2 = zVar2.mo7495h(i8) << 6;
                i5 = zVar2.mo7495h(6) << i8;
                i4 = zVar2.mo7495h(4) << 4;
            }
            if (i5 == 0) {
                i4 = 0;
                i3 = 0;
                i2 = 255;
            }
            byte b = (byte) (255 - (i2 & 255));
            int i11 = i6;
            double d2 = (double) i5;
            int i12 = h;
            double d3 = (double) (i4 - 128);
            Double.isNaN(d3);
            double d4 = 1.402d * d3;
            Double.isNaN(d2);
            int[] iArr2 = iArr;
            int i13 = (int) (d2 + d4);
            double d5 = (double) (i3 - 128);
            Double.isNaN(d5);
            double d6 = 0.34414d * d5;
            Double.isNaN(d2);
            double d7 = d2 - d6;
            Double.isNaN(d3);
            int i14 = (int) (d7 - (d3 * 0.71414d));
            Double.isNaN(d5);
            double d8 = d5 * 1.772d;
            Double.isNaN(d2);
            iArr2[h2] = m9567f(b, Util.m10307p(i13, 0, 255), Util.m10307p(i14, 0, 255), Util.m10307p((int) (d2 + d8), 0, 255));
            i9 = i11;
            h = i12;
            i7 = 8;
            i8 = 2;
        }
        return new C1131a(h, c, d, e);
    }

    /* renamed from: m */
    private static C1132b m9574m(ParsableBitArray zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        zVar.mo7505r(4);
        boolean g = zVar.mo7494g();
        zVar.mo7505r(3);
        int h = zVar.mo7495h(16);
        int h2 = zVar.mo7495h(16);
        if (g) {
            int h3 = zVar.mo7495h(16);
            int h4 = zVar.mo7495h(16);
            int h5 = zVar.mo7495h(16);
            i = zVar.mo7495h(16);
            i3 = h4;
            i2 = h5;
            i4 = h3;
        } else {
            i3 = h;
            i = h2;
            i4 = 0;
            i2 = 0;
        }
        C1132b bVar = new C1132b(h, h2, i4, i3, i2, i);
        return bVar;
    }

    /* renamed from: n */
    private static C1133c m9575n(ParsableBitArray zVar) {
        byte[] bArr;
        int h = zVar.mo7495h(16);
        zVar.mo7505r(4);
        int h2 = zVar.mo7495h(2);
        boolean g = zVar.mo7494g();
        zVar.mo7505r(1);
        byte[] bArr2 = Util.f8403f;
        if (h2 == 1) {
            zVar.mo7505r(zVar.mo7495h(8) * 16);
        } else if (h2 == 0) {
            int h3 = zVar.mo7495h(16);
            int h4 = zVar.mo7495h(16);
            if (h3 > 0) {
                bArr2 = new byte[h3];
                zVar.mo7498k(bArr2, 0, h3);
            }
            if (h4 > 0) {
                bArr = new byte[h4];
                zVar.mo7498k(bArr, 0, h4);
                return new C1133c(h, g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C1133c(h, g, bArr2, bArr);
    }

    /* renamed from: o */
    private static C1134d m9576o(ParsableBitArray zVar, int i) {
        int h = zVar.mo7495h(8);
        int h2 = zVar.mo7495h(4);
        int h3 = zVar.mo7495h(2);
        zVar.mo7505r(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int h4 = zVar.mo7495h(8);
            zVar.mo7505r(8);
            i2 -= 6;
            sparseArray.put(h4, new C1135e(zVar.mo7495h(16), zVar.mo7495h(16)));
        }
        return new C1134d(h, h2, h3, sparseArray);
    }

    /* renamed from: p */
    private static C1136f m9577p(ParsableBitArray zVar, int i) {
        int i2;
        int i3;
        ParsableBitArray zVar2 = zVar;
        int h = zVar2.mo7495h(8);
        zVar2.mo7505r(4);
        boolean g = zVar.mo7494g();
        zVar2.mo7505r(3);
        int i4 = 16;
        int h2 = zVar2.mo7495h(16);
        int h3 = zVar2.mo7495h(16);
        int h4 = zVar2.mo7495h(3);
        int h5 = zVar2.mo7495h(3);
        int i5 = 2;
        zVar2.mo7505r(2);
        int h6 = zVar2.mo7495h(8);
        int h7 = zVar2.mo7495h(8);
        int h8 = zVar2.mo7495h(4);
        int h9 = zVar2.mo7495h(2);
        zVar2.mo7505r(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int h10 = zVar2.mo7495h(i4);
            int h11 = zVar2.mo7495h(i5);
            int h12 = zVar2.mo7495h(i5);
            int h13 = zVar2.mo7495h(12);
            int i7 = h9;
            zVar2.mo7505r(4);
            int h14 = zVar2.mo7495h(12);
            i6 -= 6;
            if (h11 == 1 || h11 == 2) {
                i6 -= 2;
                i3 = zVar2.mo7495h(8);
                i2 = zVar2.mo7495h(8);
            } else {
                i3 = 0;
                i2 = 0;
            }
            C1137g gVar = new C1137g(h11, h12, h13, h14, i3, i2);
            sparseArray.put(h10, gVar);
            h9 = i7;
            i5 = 2;
            i4 = 16;
        }
        C1136f fVar = new C1136f(h, g, h2, h3, h4, h5, h6, h7, h8, h9, sparseArray);
        return fVar;
    }

    /* renamed from: q */
    private static void m9578q(ParsableBitArray zVar, C1138h hVar) {
        int h = zVar.mo7495h(8);
        int h2 = zVar.mo7495h(16);
        int h3 = zVar.mo7495h(16);
        int d = zVar.mo7491d() + h3;
        if (h3 * 8 > zVar.mo7489b()) {
            Log.m10386h("DvbParser", "Data field length exceeds limit");
            zVar.mo7505r(zVar.mo7489b());
            return;
        }
        switch (h) {
            case 16:
                if (h2 == hVar.f7908a) {
                    C1134d dVar = hVar.f7916i;
                    C1134d o = m9576o(zVar, h3);
                    if (o.f7887c == 0) {
                        if (!(dVar == null || dVar.f7886b == o.f7886b)) {
                            hVar.f7916i = o;
                            break;
                        }
                    } else {
                        hVar.f7916i = o;
                        hVar.f7910c.clear();
                        hVar.f7911d.clear();
                        hVar.f7912e.clear();
                        break;
                    }
                }
                break;
            case 17:
                C1134d dVar2 = hVar.f7916i;
                if (h2 == hVar.f7908a && dVar2 != null) {
                    C1136f p = m9577p(zVar, h3);
                    if (dVar2.f7887c == 0) {
                        C1136f fVar = (C1136f) hVar.f7910c.get(p.f7891a);
                        if (fVar != null) {
                            p.mo7108a(fVar);
                        }
                    }
                    hVar.f7910c.put(p.f7891a, p);
                    break;
                }
            case 18:
                if (h2 != hVar.f7908a) {
                    if (h2 == hVar.f7909b) {
                        C1131a l = m9573l(zVar, h3);
                        hVar.f7913f.put(l.f7871a, l);
                        break;
                    }
                } else {
                    C1131a l2 = m9573l(zVar, h3);
                    hVar.f7911d.put(l2.f7871a, l2);
                    break;
                }
                break;
            case 19:
                if (h2 != hVar.f7908a) {
                    if (h2 == hVar.f7909b) {
                        C1133c n = m9575n(zVar);
                        hVar.f7914g.put(n.f7881a, n);
                        break;
                    }
                } else {
                    C1133c n2 = m9575n(zVar);
                    hVar.f7912e.put(n2.f7881a, n2);
                    break;
                }
                break;
            case 20:
                if (h2 == hVar.f7908a) {
                    hVar.f7915h = m9574m(zVar);
                    break;
                }
                break;
        }
        zVar.mo7506s(d - zVar.mo7491d());
    }

    /* renamed from: b */
    public List<Cue> mo7106b(byte[] bArr, int i) {
        int i2;
        int i3;
        SparseArray<C1137g> sparseArray;
        ParsableBitArray zVar = new ParsableBitArray(bArr, i);
        while (zVar.mo7489b() >= 48 && zVar.mo7495h(8) == 15) {
            m9578q(zVar, this.f7869i);
        }
        C1138h hVar = this.f7869i;
        C1134d dVar = hVar.f7916i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C1132b bVar = hVar.f7915h;
        if (bVar == null) {
            bVar = this.f7867g;
        }
        Bitmap bitmap = this.f7870j;
        if (!(bitmap != null && bVar.f7875a + 1 == bitmap.getWidth() && bVar.f7876b + 1 == this.f7870j.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f7875a + 1, bVar.f7876b + 1, Config.ARGB_8888);
            this.f7870j = createBitmap;
            this.f7866f.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C1135e> sparseArray2 = dVar.f7888d;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f7866f.save();
            C1135e eVar = (C1135e) sparseArray2.valueAt(i4);
            C1136f fVar = (C1136f) this.f7869i.f7910c.get(sparseArray2.keyAt(i4));
            int i5 = eVar.f7889a + bVar.f7877c;
            int i6 = eVar.f7890b + bVar.f7879e;
            this.f7866f.clipRect(i5, i6, Math.min(fVar.f7893c + i5, bVar.f7878d), Math.min(fVar.f7894d + i6, bVar.f7880f));
            C1131a aVar = (C1131a) this.f7869i.f7911d.get(fVar.f7897g);
            if (aVar == null) {
                aVar = (C1131a) this.f7869i.f7913f.get(fVar.f7897g);
                if (aVar == null) {
                    aVar = this.f7868h;
                }
            }
            SparseArray<C1137g> sparseArray3 = fVar.f7901k;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                C1137g gVar = (C1137g) sparseArray3.valueAt(i7);
                C1133c cVar = (C1133c) this.f7869i.f7912e.get(keyAt);
                C1133c cVar2 = cVar == null ? (C1133c) this.f7869i.f7914g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    m9572k(cVar2, aVar, fVar.f7896f, gVar.f7904c + i5, i6 + gVar.f7905d, cVar2.f7882b ? null : this.f7864d, this.f7866f);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f7892b) {
                int i8 = fVar.f7896f;
                if (i8 == 3) {
                    i2 = aVar.f7874d[fVar.f7898h];
                } else if (i8 == 2) {
                    i2 = aVar.f7873c[fVar.f7899i];
                } else {
                    i2 = aVar.f7872b[fVar.f7900j];
                }
                this.f7865e.setColor(i2);
                this.f7866f.drawRect((float) i5, (float) i6, (float) (fVar.f7893c + i5), (float) (fVar.f7894d + i6), this.f7865e);
            }
            arrayList.add(new C1119b().mo7041f(Bitmap.createBitmap(this.f7870j, i5, i6, fVar.f7893c, fVar.f7894d)).mo7045j(((float) i5) / ((float) bVar.f7875a)).mo7046k(0).mo7043h(((float) i6) / ((float) bVar.f7876b), 0).mo7044i(0).mo7048m(((float) fVar.f7893c) / ((float) bVar.f7875a)).mo7042g(((float) fVar.f7894d) / ((float) bVar.f7876b)).mo7036a());
            this.f7866f.drawColor(0, Mode.CLEAR);
            this.f7866f.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: r */
    public void mo7107r() {
        this.f7869i.mo7109a();
    }
}
