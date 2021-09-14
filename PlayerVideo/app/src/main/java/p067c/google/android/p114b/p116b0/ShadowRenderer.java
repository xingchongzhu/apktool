package p067c.google.android.p114b.p116b0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader.TileMode;
import p010b.p034g.p035d.ColorUtils;

/* renamed from: c.a.a.b.b0.a */
public class ShadowRenderer {

    /* renamed from: a */
    private static final int[] f9074a = new int[3];

    /* renamed from: b */
    private static final float[] f9075b = {0.0f, 0.5f, 1.0f};

    /* renamed from: c */
    private static final int[] f9076c = new int[4];

    /* renamed from: d */
    private static final float[] f9077d = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: e */
    private final Paint f9078e;

    /* renamed from: f */
    private final Paint f9079f;

    /* renamed from: g */
    private final Paint f9080g;

    /* renamed from: h */
    private int f9081h;

    /* renamed from: i */
    private int f9082i;

    /* renamed from: j */
    private int f9083j;

    /* renamed from: k */
    private final Path f9084k;

    /* renamed from: l */
    private Paint f9085l;

    public ShadowRenderer() {
        this(-16777216);
    }

    /* renamed from: a */
    public void mo7812a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        boolean z = f3 < 0.0f;
        Path path = this.f9084k;
        if (z) {
            int[] iArr = f9076c;
            iArr[0] = 0;
            iArr[1] = this.f9083j;
            iArr[2] = this.f9082i;
            iArr[3] = this.f9081h;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f9076c;
            iArr2[0] = 0;
            iArr2[1] = this.f9081h;
            iArr2[2] = this.f9082i;
            iArr2[3] = this.f9083j;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f6 = 1.0f - (((float) i2) / width);
            float f7 = ((1.0f - f6) / 2.0f) + f6;
            float[] fArr = f9077d;
            fArr[1] = f6;
            fArr[2] = f7;
            Paint paint = this.f9079f;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, f9076c, fArr, TileMode.CLAMP);
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas2.clipPath(path, Op.DIFFERENCE);
                canvas2.drawPath(path, this.f9085l);
            }
            canvas.drawArc(rectF, f, f2, true, this.f9079f);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo7813b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f9074a;
        iArr[0] = this.f9083j;
        iArr[1] = this.f9082i;
        iArr[2] = this.f9081h;
        Paint paint = this.f9080g;
        float f = rectF.left;
        LinearGradient linearGradient = new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f9075b, TileMode.CLAMP);
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f9080g);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint mo7814c() {
        return this.f9078e;
    }

    /* renamed from: d */
    public void mo7815d(int i) {
        this.f9081h = ColorUtils.m4970d(i, 68);
        this.f9082i = ColorUtils.m4970d(i, 20);
        this.f9083j = ColorUtils.m4970d(i, 0);
        this.f9078e.setColor(this.f9081h);
    }

    public ShadowRenderer(int i) {
        this.f9084k = new Path();
        this.f9085l = new Paint();
        this.f9078e = new Paint();
        mo7815d(i);
        this.f9085l.setColor(0);
        Paint paint = new Paint(4);
        this.f9079f = paint;
        paint.setStyle(Style.FILL);
        this.f9080g = new Paint(paint);
    }
}
