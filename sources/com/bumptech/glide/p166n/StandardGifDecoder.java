package com.bumptech.glide.p166n;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.p166n.GifDecoder.C1614a;
import com.p259uc.crashsdk.export.LogType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.n.e */
public class StandardGifDecoder implements GifDecoder {

    /* renamed from: a */
    private static final String f11053a = "e";

    /* renamed from: b */
    private int[] f11054b;

    /* renamed from: c */
    private final int[] f11055c;

    /* renamed from: d */
    private final C1614a f11056d;

    /* renamed from: e */
    private ByteBuffer f11057e;

    /* renamed from: f */
    private byte[] f11058f;

    /* renamed from: g */
    private short[] f11059g;

    /* renamed from: h */
    private byte[] f11060h;

    /* renamed from: i */
    private byte[] f11061i;

    /* renamed from: j */
    private byte[] f11062j;

    /* renamed from: k */
    private int[] f11063k;

    /* renamed from: l */
    private int f11064l;

    /* renamed from: m */
    private GifHeader f11065m;

    /* renamed from: n */
    private Bitmap f11066n;

    /* renamed from: o */
    private boolean f11067o;

    /* renamed from: p */
    private int f11068p;

    /* renamed from: q */
    private int f11069q;

    /* renamed from: r */
    private int f11070r;

    /* renamed from: s */
    private int f11071s;

    /* renamed from: t */
    private Boolean f11072t;

    /* renamed from: u */
    private Config f11073u;

    public StandardGifDecoder(C1614a aVar, GifHeader cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo9366r(cVar, byteBuffer, i);
    }

    /* renamed from: j */
    private int m13691j(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f11069q + i; i9++) {
            byte[] bArr = this.f11062j;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f11054b[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f11069q + i11; i12++) {
            byte[] bArr2 = this.f11062j;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f11054b[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: k */
    private void m13692k(GifFrame bVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        GifFrame bVar2 = bVar;
        int[] iArr = this.f11063k;
        int i6 = bVar2.f11028d;
        int i7 = this.f11069q;
        int i8 = i6 / i7;
        int i9 = bVar2.f11026b / i7;
        int i10 = bVar2.f11027c / i7;
        int i11 = bVar2.f11025a / i7;
        boolean z2 = this.f11064l == 0;
        int i12 = this.f11071s;
        int i13 = this.f11070r;
        byte[] bArr = this.f11062j;
        int[] iArr2 = this.f11054b;
        Boolean bool = this.f11072t;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i15 < i8) {
            Boolean bool2 = bool;
            if (bVar2.f11029e) {
                if (i16 >= i8) {
                    i = i8;
                    int i18 = i17 + 1;
                    if (i18 == 2) {
                        i17 = i18;
                        i16 = 4;
                    } else if (i18 == 3) {
                        i17 = i18;
                        i16 = 2;
                        i14 = 4;
                    } else if (i18 != 4) {
                        i17 = i18;
                    } else {
                        i17 = i18;
                        i16 = 1;
                        i14 = 2;
                    }
                } else {
                    i = i8;
                }
                i2 = i16 + i14;
            } else {
                i = i8;
                i2 = i16;
                i16 = i15;
            }
            int i19 = i16 + i9;
            boolean z3 = i7 == 1;
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i15 * i7 * bVar2.f11027c;
                if (z3) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & 255];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i22 - i21) * i7) + i24;
                    int i29 = i21;
                    while (true) {
                        i4 = i10;
                        if (i29 >= i22) {
                            break;
                        }
                        int j = m13691j(i24, i28, bVar2.f11027c);
                        if (j != 0) {
                            iArr[i29] = j;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i29++;
                        i10 = i4;
                    }
                    bool = bool2;
                    i15++;
                    i9 = i5;
                    i10 = i4;
                    i8 = i;
                    i16 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i15++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i16 = i3;
        }
        Boolean bool3 = bool;
        if (this.f11072t == null) {
            if (bool3 == null) {
                z = false;
            } else {
                z = bool3.booleanValue();
            }
            this.f11072t = Boolean.valueOf(z);
        }
    }

    /* renamed from: l */
    private void m13693l(GifFrame bVar) {
        GifFrame bVar2 = bVar;
        int[] iArr = this.f11063k;
        int i = bVar2.f11028d;
        int i2 = bVar2.f11026b;
        int i3 = bVar2.f11027c;
        int i4 = bVar2.f11025a;
        boolean z = this.f11064l == 0;
        int i5 = this.f11071s;
        byte[] bArr = this.f11062j;
        int[] iArr2 = this.f11054b;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = bVar2.f11027c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i14 = iArr2[b3];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                GifFrame bVar3 = bVar;
                i = i13;
            }
            int i15 = i;
            i6++;
            bVar2 = bVar;
        }
        Boolean bool = this.f11072t;
        this.f11072t = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f11072t == null && z && b != -1));
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [short[]] */
    /* JADX WARNING: type inference failed for: r25v0 */
    /* JADX WARNING: type inference failed for: r25v1 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4, types: [int] */
    /* JADX WARNING: type inference failed for: r25v3 */
    /* JADX WARNING: type inference failed for: r25v4 */
    /* JADX WARNING: type inference failed for: r18v4 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r25v5 */
    /* JADX WARNING: type inference failed for: r7v13, types: [short] */
    /* JADX WARNING: type inference failed for: r25v7 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r25v8 */
    /* JADX WARNING: type inference failed for: r18v6 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short[], code=null, for r3v1, types: [short[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r25v4
  assigns: []
  uses: []
  mth insns count: 164
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
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13694m(com.bumptech.glide.p166n.GifFrame r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f11057e
            int r3 = r1.f11034j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            com.bumptech.glide.n.c r1 = r0.f11065m
            int r2 = r1.f11041f
            int r1 = r1.f11042g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f11027c
            int r1 = r1.f11028d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f11062j
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            com.bumptech.glide.n.a$a r1 = r0.f11056d
            byte[] r1 = r1.mo9272c(r2)
            r0.f11062j = r1
        L_0x002b:
            byte[] r1 = r0.f11062j
            short[] r3 = r0.f11059g
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f11059g = r3
        L_0x0037:
            short[] r3 = r0.f11059g
            byte[] r5 = r0.f11060h
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.f11060h = r5
        L_0x0041:
            byte[] r5 = r0.f11060h
            byte[] r6 = r0.f11061i
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f11061i = r6
        L_0x004d:
            byte[] r6 = r0.f11061i
            int r7 = r28.m13697q()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.f11058f
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r24 = -1
            r25 = 0
            r26 = 0
        L_0x0083:
            if (r13 >= r2) goto L_0x014c
            if (r16 != 0) goto L_0x0094
            int r16 = r28.m13696p()
            if (r16 > 0) goto L_0x0092
            r3 = 3
            r0.f11068p = r3
            goto L_0x014c
        L_0x0092:
            r17 = 0
        L_0x0094:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00ae:
            if (r4 < r15) goto L_0x0136
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c2
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00ae
        L_0x00c2:
            if (r11 != r10) goto L_0x00d9
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0083
        L_0x00d9:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ed
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00ae
        L_0x00ed:
            if (r11 < r8) goto L_0x00f6
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00f7
        L_0x00f6:
            r7 = r11
        L_0x00f7:
            if (r7 < r9) goto L_0x0102
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00f7
        L_0x0102:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0109:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0116
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x0109
        L_0x0116:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012d
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x012d
            if (r8 >= r6) goto L_0x012d
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x012d:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00ae
        L_0x0136:
            r25 = r4
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0083
        L_0x014c:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p166n.StandardGifDecoder.m13694m(com.bumptech.glide.n.b):void");
    }

    /* renamed from: o */
    private Bitmap m13695o() {
        Boolean bool = this.f11072t;
        Bitmap a = this.f11056d.mo9270a(this.f11071s, this.f11070r, (bool == null || bool.booleanValue()) ? Config.ARGB_8888 : this.f11073u);
        a.setHasAlpha(true);
        return a;
    }

    /* renamed from: p */
    private int m13696p() {
        int q = m13697q();
        if (q <= 0) {
            return q;
        }
        ByteBuffer byteBuffer = this.f11057e;
        byteBuffer.get(this.f11058f, 0, Math.min(q, byteBuffer.remaining()));
        return q;
    }

    /* renamed from: q */
    private int m13697q() {
        return this.f11057e.get() & 255;
    }

    /* renamed from: s */
    private Bitmap m13698s(GifFrame bVar, GifFrame bVar2) {
        int[] iArr = this.f11063k;
        int i = 0;
        if (bVar2 == null) {
            Bitmap bitmap = this.f11066n;
            if (bitmap != null) {
                this.f11056d.mo9275f(bitmap);
            }
            this.f11066n = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f11031g == 3 && this.f11066n == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null) {
            int i2 = bVar2.f11031g;
            if (i2 > 0) {
                if (i2 == 2) {
                    if (!bVar.f11030f) {
                        GifHeader cVar = this.f11065m;
                        int i3 = cVar.f11047l;
                        if (bVar.f11035k == null || cVar.f11045j != bVar.f11032h) {
                            i = i3;
                        }
                    }
                    int i4 = bVar2.f11028d;
                    int i5 = this.f11069q;
                    int i6 = i4 / i5;
                    int i7 = bVar2.f11026b / i5;
                    int i8 = bVar2.f11027c / i5;
                    int i9 = bVar2.f11025a / i5;
                    int i10 = this.f11071s;
                    int i11 = (i7 * i10) + i9;
                    int i12 = (i6 * i10) + i11;
                    while (i11 < i12) {
                        int i13 = i11 + i8;
                        for (int i14 = i11; i14 < i13; i14++) {
                            iArr[i14] = i;
                        }
                        i11 += this.f11071s;
                    }
                } else if (i2 == 3) {
                    Bitmap bitmap2 = this.f11066n;
                    if (bitmap2 != null) {
                        int i15 = this.f11071s;
                        bitmap2.getPixels(iArr, 0, i15, 0, 0, i15, this.f11070r);
                    }
                }
            }
        }
        m13694m(bVar);
        if (bVar.f11029e || this.f11069q != 1) {
            m13692k(bVar);
        } else {
            m13693l(bVar);
        }
        if (this.f11067o) {
            int i16 = bVar.f11031g;
            if (i16 == 0 || i16 == 1) {
                if (this.f11066n == null) {
                    this.f11066n = m13695o();
                }
                Bitmap bitmap3 = this.f11066n;
                int i17 = this.f11071s;
                bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f11070r);
            }
        }
        Bitmap o = m13695o();
        int i18 = this.f11071s;
        o.setPixels(iArr, 0, i18, 0, 0, i18, this.f11070r);
        return o;
    }

    /* renamed from: a */
    public int mo9348a() {
        return this.f11064l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo9349b() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.bumptech.glide.n.c r0 = r8.f11065m     // Catch:{ all -> 0x00e4 }
            int r0 = r0.f11038c     // Catch:{ all -> 0x00e4 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f11064l     // Catch:{ all -> 0x00e4 }
            if (r0 >= 0) goto L_0x0039
        L_0x000d:
            java.lang.String r0 = f11053a     // Catch:{ all -> 0x00e4 }
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r3 == 0) goto L_0x0037
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r3.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            com.bumptech.glide.n.c r4 = r8.f11065m     // Catch:{ all -> 0x00e4 }
            int r4 = r4.f11038c     // Catch:{ all -> 0x00e4 }
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            int r4 = r8.f11064l     // Catch:{ all -> 0x00e4 }
            r3.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00e4 }
        L_0x0037:
            r8.f11068p = r2     // Catch:{ all -> 0x00e4 }
        L_0x0039:
            int r0 = r8.f11068p     // Catch:{ all -> 0x00e4 }
            r3 = 0
            if (r0 == r2) goto L_0x00c4
            r4 = 2
            if (r0 != r4) goto L_0x0043
            goto L_0x00c4
        L_0x0043:
            r0 = 0
            r8.f11068p = r0     // Catch:{ all -> 0x00e4 }
            byte[] r5 = r8.f11058f     // Catch:{ all -> 0x00e4 }
            if (r5 != 0) goto L_0x0054
            com.bumptech.glide.n.a$a r5 = r8.f11056d     // Catch:{ all -> 0x00e4 }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.mo9272c(r6)     // Catch:{ all -> 0x00e4 }
            r8.f11058f = r5     // Catch:{ all -> 0x00e4 }
        L_0x0054:
            com.bumptech.glide.n.c r5 = r8.f11065m     // Catch:{ all -> 0x00e4 }
            java.util.List<com.bumptech.glide.n.b> r5 = r5.f11040e     // Catch:{ all -> 0x00e4 }
            int r6 = r8.f11064l     // Catch:{ all -> 0x00e4 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00e4 }
            com.bumptech.glide.n.b r5 = (com.bumptech.glide.p166n.GifFrame) r5     // Catch:{ all -> 0x00e4 }
            int r6 = r8.f11064l     // Catch:{ all -> 0x00e4 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0070
            com.bumptech.glide.n.c r7 = r8.f11065m     // Catch:{ all -> 0x00e4 }
            java.util.List<com.bumptech.glide.n.b> r7 = r7.f11040e     // Catch:{ all -> 0x00e4 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00e4 }
            com.bumptech.glide.n.b r6 = (com.bumptech.glide.p166n.GifFrame) r6     // Catch:{ all -> 0x00e4 }
            goto L_0x0071
        L_0x0070:
            r6 = r3
        L_0x0071:
            int[] r7 = r5.f11035k     // Catch:{ all -> 0x00e4 }
            if (r7 == 0) goto L_0x0076
            goto L_0x007a
        L_0x0076:
            com.bumptech.glide.n.c r7 = r8.f11065m     // Catch:{ all -> 0x00e4 }
            int[] r7 = r7.f11036a     // Catch:{ all -> 0x00e4 }
        L_0x007a:
            r8.f11054b = r7     // Catch:{ all -> 0x00e4 }
            if (r7 != 0) goto L_0x00a0
            java.lang.String r0 = f11053a     // Catch:{ all -> 0x00e4 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x009c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00e4 }
            int r4 = r8.f11064l     // Catch:{ all -> 0x00e4 }
            r1.append(r4)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e4 }
        L_0x009c:
            r8.f11068p = r2     // Catch:{ all -> 0x00e4 }
            monitor-exit(r8)
            return r3
        L_0x00a0:
            boolean r1 = r5.f11030f     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00be
            int[] r1 = r8.f11055c     // Catch:{ all -> 0x00e4 }
            int r2 = r7.length     // Catch:{ all -> 0x00e4 }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00e4 }
            int[] r1 = r8.f11055c     // Catch:{ all -> 0x00e4 }
            r8.f11054b = r1     // Catch:{ all -> 0x00e4 }
            int r2 = r5.f11032h     // Catch:{ all -> 0x00e4 }
            r1[r2] = r0     // Catch:{ all -> 0x00e4 }
            int r0 = r5.f11031g     // Catch:{ all -> 0x00e4 }
            if (r0 != r4) goto L_0x00be
            int r0 = r8.f11064l     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00be
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00e4 }
            r8.f11072t = r0     // Catch:{ all -> 0x00e4 }
        L_0x00be:
            android.graphics.Bitmap r0 = r8.m13698s(r5, r6)     // Catch:{ all -> 0x00e4 }
            monitor-exit(r8)
            return r0
        L_0x00c4:
            java.lang.String r0 = f11053a     // Catch:{ all -> 0x00e4 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e4 }
            if (r1 == 0) goto L_0x00e2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            int r2 = r8.f11068p     // Catch:{ all -> 0x00e4 }
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e4 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e4 }
        L_0x00e2:
            monitor-exit(r8)
            return r3
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p166n.StandardGifDecoder.mo9349b():android.graphics.Bitmap");
    }

    /* renamed from: c */
    public void mo9350c() {
        this.f11064l = (this.f11064l + 1) % this.f11065m.f11038c;
    }

    public void clear() {
        this.f11065m = null;
        byte[] bArr = this.f11062j;
        if (bArr != null) {
            this.f11056d.mo9271b(bArr);
        }
        int[] iArr = this.f11063k;
        if (iArr != null) {
            this.f11056d.mo9273d(iArr);
        }
        Bitmap bitmap = this.f11066n;
        if (bitmap != null) {
            this.f11056d.mo9275f(bitmap);
        }
        this.f11066n = null;
        this.f11057e = null;
        this.f11072t = null;
        byte[] bArr2 = this.f11058f;
        if (bArr2 != null) {
            this.f11056d.mo9271b(bArr2);
        }
    }

    /* renamed from: d */
    public int mo9352d() {
        return this.f11065m.f11038c;
    }

    /* renamed from: e */
    public int mo9353e() {
        if (this.f11065m.f11038c > 0) {
            int i = this.f11064l;
            if (i >= 0) {
                return mo9365n(i);
            }
        }
        return 0;
    }

    /* renamed from: f */
    public int mo9354f() {
        return this.f11057e.limit() + this.f11062j.length + (this.f11063k.length * 4);
    }

    /* renamed from: g */
    public void mo9355g(Config config) {
        if (config == Config.ARGB_8888 || config == Config.RGB_565) {
            this.f11073u = config;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported format: ");
        sb.append(config);
        sb.append(", must be one of ");
        sb.append(Config.ARGB_8888);
        sb.append(" or ");
        sb.append(Config.RGB_565);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    public ByteBuffer mo9356h() {
        return this.f11057e;
    }

    /* renamed from: i */
    public void mo9357i() {
        this.f11064l = -1;
    }

    /* renamed from: n */
    public int mo9365n(int i) {
        if (i >= 0) {
            GifHeader cVar = this.f11065m;
            if (i < cVar.f11038c) {
                return ((GifFrame) cVar.f11040e.get(i)).f11033i;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public synchronized void mo9366r(GifHeader cVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f11068p = 0;
            this.f11065m = cVar;
            this.f11064l = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f11057e = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f11057e.order(ByteOrder.LITTLE_ENDIAN);
            this.f11067o = false;
            Iterator it = cVar.f11040e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((GifFrame) it.next()).f11031g == 3) {
                        this.f11067o = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f11069q = highestOneBit;
            int i2 = cVar.f11041f;
            this.f11071s = i2 / highestOneBit;
            int i3 = cVar.f11042g;
            this.f11070r = i3 / highestOneBit;
            this.f11062j = this.f11056d.mo9272c(i2 * i3);
            this.f11063k = this.f11056d.mo9274e(this.f11071s * this.f11070r);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Sample size must be >=0, not: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public StandardGifDecoder(C1614a aVar) {
        this.f11055c = new int[LogType.UNEXP];
        this.f11073u = Config.ARGB_8888;
        this.f11056d = aVar;
        this.f11065m = new GifHeader();
    }
}
