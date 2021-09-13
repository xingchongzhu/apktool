package com.bumptech.glide.load.p158p.p159d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace.Named;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.load.p158p.p159d.DownsampleStrategy.C1591g;
import com.bumptech.glide.load.p158p.p159d.ImageReader.C1595a;
import com.bumptech.glide.load.p158p.p159d.ImageReader.C1596b;
import com.bumptech.glide.p174t.C1638j;
import com.bumptech.glide.p174t.C1639k;
import com.bumptech.glide.p174t.LogTime;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.p.d.n */
public final class Downsampler {

    /* renamed from: a */
    public static final Option<DecodeFormat> f10867a = Option.m12607f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.f10285c);

    /* renamed from: b */
    public static final Option<PreferredColorSpace> f10868b = Option.m12607f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", PreferredColorSpace.SRGB);
    @Deprecated

    /* renamed from: c */
    public static final Option<DownsampleStrategy> f10869c = DownsampleStrategy.f10862h;

    /* renamed from: d */
    public static final Option<Boolean> f10870d;

    /* renamed from: e */
    public static final Option<Boolean> f10871e;

    /* renamed from: f */
    private static final Set<String> f10872f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: g */
    private static final C1593b f10873g = new C1592a();

    /* renamed from: h */
    private static final Set<ImageType> f10874h = Collections.unmodifiableSet(EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG));

    /* renamed from: i */
    private static final Queue<Options> f10875i = C1639k.m14087e(0);

    /* renamed from: j */
    private final BitmapPool f10876j;

    /* renamed from: k */
    private final DisplayMetrics f10877k;

    /* renamed from: l */
    private final ArrayPool f10878l;

    /* renamed from: m */
    private final List<ImageHeaderParser> f10879m;

    /* renamed from: n */
    private final HardwareConfigState f10880n = HardwareConfigState.m13431b();

    /* renamed from: com.bumptech.glide.load.p.d.n$a */
    /* compiled from: Downsampler */
    class C1592a implements C1593b {
        C1592a() {
        }

        /* renamed from: a */
        public void mo9185a(BitmapPool eVar, Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo9186b() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.n$b */
    /* compiled from: Downsampler */
    public interface C1593b {
        /* renamed from: a */
        void mo9185a(BitmapPool eVar, Bitmap bitmap) throws IOException;

        /* renamed from: b */
        void mo9186b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f10870d = Option.m12607f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f10871e = Option.m12607f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public Downsampler(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, BitmapPool eVar, ArrayPool bVar) {
        this.f10879m = list;
        this.f10877k = (DisplayMetrics) C1638j.m14081d(displayMetrics);
        this.f10876j = (BitmapPool) C1638j.m14081d(eVar);
        this.f10878l = (ArrayPool) C1638j.m14081d(bVar);
    }

    /* renamed from: a */
    private static int m13388a(double d) {
        int l = m13396l(d);
        double d2 = (double) l;
        Double.isNaN(d2);
        int x = m13405x(d2 * d);
        double d3 = (double) (((float) x) / ((float) l));
        Double.isNaN(d3);
        double d4 = d / d3;
        double d5 = (double) x;
        Double.isNaN(d5);
        return m13405x(d4 * d5);
    }

    /* renamed from: b */
    private void m13389b(ImageReader tVar, DecodeFormat bVar, boolean z, boolean z2, Options options, int i, int i2) {
        if (!this.f10880n.mo9233i(i, i2, options, z, z2)) {
            if (bVar == DecodeFormat.PREFER_ARGB_8888 || VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = tVar.mo9237d().hasAlpha();
            } catch (IOException e) {
                String str = "Downsampler";
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot determine whether the image has alpha or not from header, format ");
                    sb.append(bVar);
                    Log.d(str, sb.toString(), e);
                }
            }
            Config config = z3 ? Config.ARGB_8888 : Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    /* renamed from: c */
    private static void m13390c(ImageType imageType, ImageReader tVar, C1593b bVar, BitmapPool eVar, DownsampleStrategy mVar, int i, int i2, int i3, int i4, int i5, Options options) throws IOException {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        double d;
        ImageType imageType2 = imageType;
        DownsampleStrategy mVar2 = mVar;
        int i12 = i2;
        int i13 = i3;
        int i14 = i4;
        int i15 = i5;
        Options options2 = options;
        String str = "]";
        String str2 = "Downsampler";
        String str3 = "x";
        if (i12 <= 0 || i13 <= 0) {
            String str4 = str2;
            String str5 = str3;
            if (Log.isLoggable(str4, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(imageType2);
                sb.append(" with target [");
                sb.append(i14);
                sb.append(str5);
                sb.append(i15);
                sb.append(str);
                Log.d(str4, sb.toString());
            }
            return;
        }
        if (m13399r(i)) {
            i6 = i12;
            i7 = i13;
        } else {
            i7 = i12;
            i6 = i13;
        }
        float b = mVar2.mo9224b(i7, i6, i14, i15);
        if (b > 0.0f) {
            C1591g a = mVar2.mo9223a(i7, i6, i14, i15);
            if (a != null) {
                float f = (float) i7;
                float f2 = (float) i6;
                int x = i7 / m13405x((double) (b * f));
                int x2 = i6 / m13405x((double) (b * f2));
                C1591g gVar = C1591g.MEMORY;
                if (a == gVar) {
                    i8 = Math.max(x, x2);
                } else {
                    i8 = Math.min(x, x2);
                }
                int i16 = VERSION.SDK_INT;
                String str6 = str3;
                String str7 = str2;
                if (i16 > 23 || !f10872f.contains(options2.outMimeType)) {
                    int max = Math.max(1, Integer.highestOneBit(i8));
                    if (a == gVar && ((float) max) < 1.0f / b) {
                        max <<= 1;
                    }
                    i9 = max;
                } else {
                    i9 = 1;
                }
                options2.inSampleSize = i9;
                if (imageType2 == ImageType.JPEG) {
                    float min = (float) Math.min(i9, 8);
                    i10 = (int) Math.ceil((double) (f / min));
                    i11 = (int) Math.ceil((double) (f2 / min));
                    int i17 = i9 / 8;
                    if (i17 > 0) {
                        i10 /= i17;
                        i11 /= i17;
                    }
                } else {
                    if (imageType2 == ImageType.PNG || imageType2 == ImageType.PNG_A) {
                        float f3 = (float) i9;
                        i10 = (int) Math.floor((double) (f / f3));
                        d = Math.floor((double) (f2 / f3));
                    } else if (imageType2 == ImageType.WEBP || imageType2 == ImageType.WEBP_A) {
                        if (i16 >= 24) {
                            float f4 = (float) i9;
                            i10 = Math.round(f / f4);
                            i11 = Math.round(f2 / f4);
                        } else {
                            float f5 = (float) i9;
                            i10 = (int) Math.floor((double) (f / f5));
                            d = Math.floor((double) (f2 / f5));
                        }
                    } else if (i7 % i9 == 0 && i6 % i9 == 0) {
                        i10 = i7 / i9;
                        i11 = i6 / i9;
                    } else {
                        int[] m = m13397m(tVar, options2, bVar, eVar);
                        i10 = m[0];
                        i11 = m[1];
                    }
                    i11 = (int) d;
                }
                double b2 = (double) mVar2.mo9224b(i10, i11, i14, i15);
                if (i16 >= 19) {
                    options2.inTargetDensity = m13388a(b2);
                    options2.inDensity = m13396l(b2);
                }
                if (m13400s(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                String str8 = str7;
                if (Log.isLoggable(str8, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculate scaling, source: [");
                    sb2.append(i2);
                    String str9 = str6;
                    sb2.append(str9);
                    sb2.append(i3);
                    sb2.append("], degreesToRotate: ");
                    sb2.append(i);
                    sb2.append(", target: [");
                    sb2.append(i14);
                    sb2.append(str9);
                    sb2.append(i15);
                    sb2.append("], power of two scaled: [");
                    sb2.append(i10);
                    sb2.append(str9);
                    sb2.append(i11);
                    sb2.append("], exact scale factor: ");
                    sb2.append(b);
                    sb2.append(", power of 2 sample size: ");
                    sb2.append(i9);
                    sb2.append(", adjusted scale factor: ");
                    sb2.append(b2);
                    sb2.append(", target density: ");
                    sb2.append(options2.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options2.inDensity);
                    Log.v(str8, sb2.toString());
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        int i18 = i12;
        int i19 = i13;
        String str10 = str3;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Cannot scale with factor: ");
        sb3.append(b);
        sb3.append(" from: ");
        sb3.append(mVar2);
        sb3.append(", source: [");
        sb3.append(i18);
        sb3.append(str10);
        sb3.append(i19);
        sb3.append("], target: [");
        sb3.append(i14);
        sb3.append(str10);
        sb3.append(i15);
        sb3.append(str);
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: e */
    private Resource<Bitmap> m13391e(ImageReader tVar, int i, int i2, com.bumptech.glide.load.Options iVar, C1593b bVar) throws IOException {
        com.bumptech.glide.load.Options iVar2 = iVar;
        byte[] bArr = (byte[]) this.f10878l.mo8862e(65536, byte[].class);
        Options k = m13395k();
        k.inTempStorage = bArr;
        DecodeFormat bVar2 = (DecodeFormat) iVar2.mo8835c(f10867a);
        PreferredColorSpace jVar = (PreferredColorSpace) iVar2.mo8835c(f10868b);
        DownsampleStrategy mVar = (DownsampleStrategy) iVar2.mo8835c(DownsampleStrategy.f10862h);
        boolean booleanValue = ((Boolean) iVar2.mo8835c(f10870d)).booleanValue();
        Option<Boolean> hVar = f10871e;
        boolean z = iVar2.mo8835c(hVar) != null && ((Boolean) iVar2.mo8835c(hVar)).booleanValue();
        try {
            return BitmapResource.m13323g(m13392h(tVar, k, mVar, bVar2, jVar, z, i, i2, booleanValue, bVar), this.f10876j);
        } finally {
            m13403v(k);
            this.f10878l.mo8861d(bArr);
        }
    }

    /* renamed from: h */
    private Bitmap m13392h(ImageReader tVar, Options options, DownsampleStrategy mVar, DecodeFormat bVar, PreferredColorSpace jVar, boolean z, int i, int i2, boolean z2, C1593b bVar2) throws IOException {
        int i3;
        int i4;
        Downsampler nVar;
        int i5;
        int i6;
        int i7;
        ImageReader tVar2 = tVar;
        Options options2 = options;
        C1593b bVar3 = bVar2;
        long b = LogTime.m14065b();
        int[] m = m13397m(tVar2, options2, bVar3, this.f10876j);
        boolean z3 = false;
        int i8 = m[0];
        int i9 = m[1];
        String str = options2.outMimeType;
        boolean z4 = (i8 == -1 || i9 == -1) ? false : z;
        int c = tVar.mo9236c();
        int j = TransformationUtils.m13279j(c);
        boolean m2 = TransformationUtils.m13282m(c);
        int i10 = i;
        if (i10 == Integer.MIN_VALUE) {
            i4 = i2;
            i3 = m13399r(j) ? i9 : i8;
        } else {
            i4 = i2;
            i3 = i10;
        }
        int i11 = i4 == Integer.MIN_VALUE ? m13399r(j) ? i8 : i9 : i4;
        ImageType d = tVar.mo9237d();
        BitmapPool eVar = this.f10876j;
        ImageType imageType = d;
        m13390c(d, tVar, bVar2, eVar, mVar, j, i8, i9, i3, i11, options);
        int i12 = c;
        String str2 = str;
        int i13 = i9;
        int i14 = i8;
        C1593b bVar4 = bVar3;
        Options options3 = options2;
        m13389b(tVar, bVar, z4, m2, options, i3, i11);
        int i15 = VERSION.SDK_INT;
        boolean z5 = i15 >= 19;
        String str3 = "Downsampler";
        if (options3.inSampleSize == 1 || z5) {
            nVar = this;
            if (nVar.m13407z(imageType)) {
                if (i14 < 0 || i13 < 0 || !z2 || !z5) {
                    float f = m13400s(options) ? ((float) options3.inTargetDensity) / ((float) options3.inDensity) : 1.0f;
                    int i16 = options3.inSampleSize;
                    float f2 = (float) i16;
                    float f3 = f;
                    int ceil = (int) Math.ceil((double) (((float) i13) / f2));
                    i7 = Math.round(((float) ((int) Math.ceil((double) (((float) i14) / f2)))) * f3);
                    i6 = Math.round(((float) ceil) * f3);
                    if (Log.isLoggable(str3, 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Calculated target [");
                        sb.append(i7);
                        String str4 = "x";
                        sb.append(str4);
                        sb.append(i6);
                        sb.append("] for source [");
                        sb.append(i14);
                        sb.append(str4);
                        sb.append(i13);
                        sb.append("], sampleSize: ");
                        sb.append(i16);
                        sb.append(", targetDensity: ");
                        sb.append(options3.inTargetDensity);
                        sb.append(", density: ");
                        sb.append(options3.inDensity);
                        sb.append(", density multiplier: ");
                        sb.append(f3);
                        Log.v(str3, sb.toString());
                    }
                } else {
                    i7 = i3;
                    i6 = i11;
                }
                if (i7 > 0 && i6 > 0) {
                    m13406y(options3, nVar.f10876j, i7, i6);
                }
            }
        } else {
            nVar = this;
        }
        if (i15 >= 28) {
            if (jVar == PreferredColorSpace.DISPLAY_P3) {
                ColorSpace colorSpace = options3.outColorSpace;
                if (colorSpace != null && colorSpace.isWideGamut()) {
                    z3 = true;
                }
            }
            options3.inPreferredColorSpace = ColorSpace.get(z3 ? Named.DISPLAY_P3 : Named.SRGB);
        } else if (i15 >= 26) {
            options3.inPreferredColorSpace = ColorSpace.get(Named.SRGB);
        }
        Bitmap i17 = m13393i(tVar, options3, bVar4, nVar.f10876j);
        bVar4.mo9185a(nVar.f10876j, i17);
        if (Log.isLoggable(str3, 2)) {
            i5 = i12;
            m13401t(i14, i13, str2, options, i17, i, i2, b);
        } else {
            i5 = i12;
        }
        Bitmap bitmap = null;
        if (i17 != null) {
            i17.setDensity(nVar.f10877k.densityDpi);
            bitmap = TransformationUtils.m13283n(nVar.f10876j, i17, i5);
            if (!i17.equals(bitmap)) {
                nVar.f10876j.mo8883d(i17);
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004e */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m13393i(com.bumptech.glide.load.p158p.p159d.ImageReader r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.p158p.p159d.Downsampler.C1593b r7, com.bumptech.glide.load.p152n.p153a0.BitmapPool r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.mo9186b()
            r5.mo9235b()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.p158p.p159d.TransformationUtils.m13278i()
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo9234a(r6)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.p158p.p159d.TransformationUtils.m13278i()
            r6.unlock()
            return r5
        L_0x0025:
            r5 = move-exception
            goto L_0x0050
        L_0x0027:
            r4 = move-exception
            java.io.IOException r1 = m13402u(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x0025 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0025 }
        L_0x0038:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x004f
            r8.mo8883d(r0)     // Catch:{ IOException -> 0x004e }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x004e }
            android.graphics.Bitmap r5 = m13393i(r5, r6, r7, r8)     // Catch:{ IOException -> 0x004e }
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.p158p.p159d.TransformationUtils.m13278i()
            r6.unlock()
            return r5
        L_0x004e:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x004f:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0050:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.p158p.p159d.TransformationUtils.m13278i()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p158p.p159d.Downsampler.m13393i(com.bumptech.glide.load.p.d.t, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.p.d.n$b, com.bumptech.glide.load.n.a0.e):android.graphics.Bitmap");
    }

    @TargetApi(19)
    /* renamed from: j */
    private static String m13394j(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (VERSION.SDK_INT >= 19) {
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(bitmap.getAllocationByteCount());
            sb.append(")");
            str = sb.toString();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(bitmap.getWidth());
        sb2.append("x");
        sb2.append(bitmap.getHeight());
        sb2.append("] ");
        sb2.append(bitmap.getConfig());
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: k */
    private static synchronized Options m13395k() {
        Options options;
        synchronized (Downsampler.class) {
            Queue<Options> queue = f10875i;
            synchronized (queue) {
                options = (Options) queue.poll();
            }
            if (options == null) {
                options = new Options();
                m13404w(options);
            }
        }
        return options;
    }

    /* renamed from: l */
    private static int m13396l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: m */
    private static int[] m13397m(ImageReader tVar, Options options, C1593b bVar, BitmapPool eVar) throws IOException {
        options.inJustDecodeBounds = true;
        m13393i(tVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    private static String m13398n(Options options) {
        return m13394j(options.inBitmap);
    }

    /* renamed from: r */
    private static boolean m13399r(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: s */
    private static boolean m13400s(Options options) {
        int i = options.inTargetDensity;
        if (i > 0) {
            int i2 = options.inDensity;
            if (i2 > 0 && i != i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    private static void m13401t(int i, int i2, String str, Options options, Bitmap bitmap, int i3, int i4, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(m13394j(bitmap));
        sb.append(" from [");
        sb.append(i);
        String str2 = "x";
        sb.append(str2);
        sb.append(i2);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(m13398n(options));
        sb.append(" for [");
        sb.append(i3);
        sb.append(str2);
        sb.append(i4);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(LogTime.m14064a(j));
        Log.v("Downsampler", sb.toString());
    }

    /* renamed from: u */
    private static IOException m13402u(IllegalArgumentException illegalArgumentException, int i, int i2, String str, Options options) {
        StringBuilder sb = new StringBuilder();
        sb.append("Exception decoding bitmap, outWidth: ");
        sb.append(i);
        sb.append(", outHeight: ");
        sb.append(i2);
        sb.append(", outMimeType: ");
        sb.append(str);
        sb.append(", inBitmap: ");
        sb.append(m13398n(options));
        return new IOException(sb.toString(), illegalArgumentException);
    }

    /* renamed from: v */
    private static void m13403v(Options options) {
        m13404w(options);
        Queue<Options> queue = f10875i;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    private static void m13404w(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: x */
    private static int m13405x(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    /* renamed from: y */
    private static void m13406y(Options options, BitmapPool eVar, int i, int i2) {
        Config config;
        if (VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.mo8884e(i, i2, config);
    }

    /* renamed from: z */
    private boolean m13407z(ImageType imageType) {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return f10874h.contains(imageType);
    }

    /* renamed from: d */
    public Resource<Bitmap> mo9225d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, com.bumptech.glide.load.Options iVar) throws IOException {
        return m13391e(new C1596b(parcelFileDescriptor, this.f10879m, this.f10878l), i, i2, iVar, f10873g);
    }

    /* renamed from: f */
    public Resource<Bitmap> mo9226f(InputStream inputStream, int i, int i2, com.bumptech.glide.load.Options iVar) throws IOException {
        return mo9227g(inputStream, i, i2, iVar, f10873g);
    }

    /* renamed from: g */
    public Resource<Bitmap> mo9227g(InputStream inputStream, int i, int i2, com.bumptech.glide.load.Options iVar, C1593b bVar) throws IOException {
        return m13391e(new C1595a(inputStream, this.f10879m, this.f10878l), i, i2, iVar, bVar);
    }

    /* renamed from: o */
    public boolean mo9228o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m12483c();
    }

    /* renamed from: p */
    public boolean mo9229p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean mo9230q(ByteBuffer byteBuffer) {
        return true;
    }
}
