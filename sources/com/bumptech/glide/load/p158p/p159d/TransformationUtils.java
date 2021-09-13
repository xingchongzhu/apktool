package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.p174t.C1638j;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.p.d.b0 */
public final class TransformationUtils {

    /* renamed from: a */
    private static final Paint f10822a = new Paint(6);

    /* renamed from: b */
    private static final Paint f10823b = new Paint(7);

    /* renamed from: c */
    private static final Paint f10824c;

    /* renamed from: d */
    private static final Set<String> f10825d;

    /* renamed from: e */
    private static final Lock f10826e;

    /* renamed from: com.bumptech.glide.load.p.d.b0$a */
    /* compiled from: TransformationUtils */
    class C1567a implements C1568b {

        /* renamed from: a */
        final /* synthetic */ int f10827a;

        C1567a(int i) {
            this.f10827a = i;
        }

        /* renamed from: a */
        public void mo9188a(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.f10827a;
            canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.b0$b */
    /* compiled from: TransformationUtils */
    private interface C1568b {
        /* renamed from: a */
        void mo9188a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* renamed from: com.bumptech.glide.load.p.d.b0$c */
    /* compiled from: TransformationUtils */
    private static final class C1569c implements Lock {
        C1569c() {
        }

        public void lock() {
        }

        public void lockInterruptibly() throws InterruptedException {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f10825d = hashSet;
        f10826e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new C1569c();
        Paint paint = new Paint(7);
        f10824c = paint;
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
    }

    /* renamed from: a */
    private static void m13270a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f10826e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f10822a);
            m13274e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f10826e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m13271b(BitmapPool eVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap c = eVar.mo8882c(i, i2, m13280k(bitmap));
        m13286q(bitmap, c);
        m13270a(bitmap, c, matrix);
        return c;
    }

    /* renamed from: c */
    public static Bitmap m13272c(BitmapPool eVar, Bitmap bitmap, int i, int i2) {
        String str = "TransformationUtils";
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "requested target size too big for input, fit centering instead");
            }
            return m13275f(eVar, bitmap, i, i2);
        }
        if (Log.isLoggable(str, 2)) {
            Log.v(str, "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: d */
    public static Bitmap m13273d(BitmapPool eVar, Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap g = m13276g(eVar, bitmap);
        Bitmap c = eVar.mo8882c(min, min, m13277h(bitmap));
        c.setHasAlpha(true);
        Lock lock = f10826e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(c);
            canvas.drawCircle(f2, f2, f2, f10823b);
            canvas.drawBitmap(g, null, rectF, f10824c);
            m13274e(canvas);
            lock.unlock();
            if (!g.equals(bitmap)) {
                eVar.mo8883d(g);
            }
            return c;
        } catch (Throwable th) {
            f10826e.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    private static void m13274e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: f */
    public static Bitmap m13275f(BitmapPool eVar, Bitmap bitmap, int i, int i2) {
        String str = "TransformationUtils";
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap c = eVar.mo8882c((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m13280k(bitmap));
        m13286q(bitmap, c);
        if (Log.isLoggable(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i);
            String str2 = "x";
            sb.append(str2);
            sb.append(i2);
            Log.v(str, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append(str2);
            sb2.append(bitmap.getHeight());
            Log.v(str, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(c.getWidth());
            sb3.append(str2);
            sb3.append(c.getHeight());
            Log.v(str, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(min);
            Log.v(str, sb4.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m13270a(bitmap, c, matrix);
        return c;
    }

    /* renamed from: g */
    private static Bitmap m13276g(BitmapPool eVar, Bitmap bitmap) {
        Config h = m13277h(bitmap);
        if (h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap c = eVar.mo8882c(bitmap.getWidth(), bitmap.getHeight(), h);
        new Canvas(c).drawBitmap(bitmap, 0.0f, 0.0f, null);
        return c;
    }

    /* renamed from: h */
    private static Config m13277h(Bitmap bitmap) {
        if (VERSION.SDK_INT < 26 || !Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Config.ARGB_8888;
        }
        return Config.RGBA_F16;
    }

    /* renamed from: i */
    public static Lock m13278i() {
        return f10826e;
    }

    /* renamed from: j */
    public static int m13279j(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: k */
    private static Config m13280k(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888;
    }

    /* renamed from: l */
    static void m13281l(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: m */
    public static boolean m13282m(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: n */
    public static Bitmap m13283n(BitmapPool eVar, Bitmap bitmap, int i) {
        if (!m13282m(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m13281l(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap c = eVar.mo8882c(Math.round(rectF.width()), Math.round(rectF.height()), m13280k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        c.setHasAlpha(bitmap.hasAlpha());
        m13270a(bitmap, c, matrix);
        return c;
    }

    /* renamed from: o */
    public static Bitmap m13284o(BitmapPool eVar, Bitmap bitmap, int i) {
        C1638j.m14078a(i > 0, "roundingRadius must be greater than 0.");
        return m13285p(eVar, bitmap, new C1567a(i));
    }

    /* renamed from: p */
    private static Bitmap m13285p(BitmapPool eVar, Bitmap bitmap, C1568b bVar) {
        Config h = m13277h(bitmap);
        Bitmap g = m13276g(eVar, bitmap);
        Bitmap c = eVar.mo8882c(g.getWidth(), g.getHeight(), h);
        c.setHasAlpha(true);
        TileMode tileMode = TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(g, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) c.getWidth(), (float) c.getHeight());
        Lock lock = f10826e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(c);
            canvas.drawColor(0, Mode.CLEAR);
            bVar.mo9188a(canvas, paint, rectF);
            m13274e(canvas);
            lock.unlock();
            if (!g.equals(bitmap)) {
                eVar.mo8883d(g);
            }
            return c;
        } catch (Throwable th) {
            f10826e.unlock();
            throw th;
        }
    }

    /* renamed from: q */
    public static void m13286q(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
