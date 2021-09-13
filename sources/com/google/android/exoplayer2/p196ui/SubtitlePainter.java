package com.google.android.exoplayer2.p196ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.p100k2.CaptionStyleCompat;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.ui.s */
final class SubtitlePainter {

    /* renamed from: A */
    private int f12136A;

    /* renamed from: B */
    private int f12137B;

    /* renamed from: C */
    private int f12138C;

    /* renamed from: D */
    private int f12139D;

    /* renamed from: E */
    private StaticLayout f12140E;

    /* renamed from: F */
    private StaticLayout f12141F;

    /* renamed from: G */
    private int f12142G;

    /* renamed from: H */
    private int f12143H;

    /* renamed from: I */
    private int f12144I;

    /* renamed from: J */
    private Rect f12145J;

    /* renamed from: a */
    private final float f12146a;

    /* renamed from: b */
    private final float f12147b;

    /* renamed from: c */
    private final float f12148c;

    /* renamed from: d */
    private final float f12149d;

    /* renamed from: e */
    private final float f12150e;

    /* renamed from: f */
    private final TextPaint f12151f;

    /* renamed from: g */
    private final Paint f12152g;

    /* renamed from: h */
    private final Paint f12153h;

    /* renamed from: i */
    private CharSequence f12154i;

    /* renamed from: j */
    private Alignment f12155j;

    /* renamed from: k */
    private Bitmap f12156k;

    /* renamed from: l */
    private float f12157l;

    /* renamed from: m */
    private int f12158m;

    /* renamed from: n */
    private int f12159n;

    /* renamed from: o */
    private float f12160o;

    /* renamed from: p */
    private int f12161p;

    /* renamed from: q */
    private float f12162q;

    /* renamed from: r */
    private float f12163r;

    /* renamed from: s */
    private int f12164s;

    /* renamed from: t */
    private int f12165t;

    /* renamed from: u */
    private int f12166u;

    /* renamed from: v */
    private int f12167v;

    /* renamed from: w */
    private int f12168w;

    /* renamed from: x */
    private float f12169x;

    /* renamed from: y */
    private float f12170y;

    /* renamed from: z */
    private float f12171z;

    public SubtitlePainter(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f12150e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f12149d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f12146a = round;
        this.f12147b = round;
        this.f12148c = round;
        TextPaint textPaint = new TextPaint();
        this.f12151f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f12152g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Style.FILL);
        Paint paint2 = new Paint();
        this.f12153h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    private static boolean m14923a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    /* renamed from: c */
    private void m14924c(Canvas canvas) {
        canvas.drawBitmap(this.f12156k, null, this.f12145J, this.f12153h);
    }

    /* renamed from: d */
    private void m14925d(Canvas canvas, boolean z) {
        if (z) {
            m14926e(canvas);
            return;
        }
        Assertions.m10153e(this.f12145J);
        Assertions.m10153e(this.f12156k);
        m14924c(canvas);
    }

    /* renamed from: e */
    private void m14926e(Canvas canvas) {
        int i;
        StaticLayout staticLayout = this.f12140E;
        StaticLayout staticLayout2 = this.f12141F;
        if (staticLayout != null && staticLayout2 != null) {
            int save = canvas.save();
            canvas.translate((float) this.f12142G, (float) this.f12143H);
            if (Color.alpha(this.f12166u) > 0) {
                this.f12152g.setColor(this.f12166u);
                canvas.drawRect((float) (-this.f12144I), 0.0f, (float) (staticLayout.getWidth() + this.f12144I), (float) staticLayout.getHeight(), this.f12152g);
            }
            int i2 = this.f12168w;
            boolean z = true;
            if (i2 == 1) {
                this.f12151f.setStrokeJoin(Join.ROUND);
                this.f12151f.setStrokeWidth(this.f12146a);
                this.f12151f.setColor(this.f12167v);
                this.f12151f.setStyle(Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (i2 == 2) {
                TextPaint textPaint = this.f12151f;
                float f = this.f12147b;
                float f2 = this.f12148c;
                textPaint.setShadowLayer(f, f2, f2, this.f12167v);
            } else if (i2 == 3 || i2 == 4) {
                if (i2 != 3) {
                    z = false;
                }
                int i3 = -1;
                if (z) {
                    i = -1;
                } else {
                    i = this.f12167v;
                }
                if (z) {
                    i3 = this.f12167v;
                }
                float f3 = this.f12147b / 2.0f;
                this.f12151f.setColor(this.f12164s);
                this.f12151f.setStyle(Style.FILL);
                float f4 = -f3;
                this.f12151f.setShadowLayer(this.f12147b, f4, f4, i);
                staticLayout2.draw(canvas);
                this.f12151f.setShadowLayer(this.f12147b, f3, f3, i3);
            }
            this.f12151f.setColor(this.f12164s);
            this.f12151f.setStyle(Style.FILL);
            staticLayout.draw(canvas);
            this.f12151f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap"})
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14927f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f12156k
            int r1 = r7.f12138C
            int r2 = r7.f12136A
            int r1 = r1 - r2
            int r3 = r7.f12139D
            int r4 = r7.f12137B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f12160o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f12157l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f12162q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f12163r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0032
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L_0x0044
        L_0x0032:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L_0x0044:
            int r3 = r7.f12161p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L_0x004d
            float r3 = (float) r1
        L_0x004b:
            float r2 = r2 - r3
            goto L_0x0053
        L_0x004d:
            if (r3 != r5) goto L_0x0053
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L_0x004b
        L_0x0053:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f12159n
            if (r3 != r6) goto L_0x005e
            float r3 = (float) r0
        L_0x005c:
            float r4 = r4 - r3
            goto L_0x0064
        L_0x005e:
            if (r3 != r5) goto L_0x0064
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L_0x005c
        L_0x0064:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f12145J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p196ui.SubtitlePainter.m14927f():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a8  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueText"})
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14928g() {
        /*
            r26 = this;
            r0 = r26
            java.lang.CharSequence r1 = r0.f12154i
            boolean r2 = r1 instanceof android.text.SpannableStringBuilder
            if (r2 == 0) goto L_0x000b
            android.text.SpannableStringBuilder r1 = (android.text.SpannableStringBuilder) r1
            goto L_0x0012
        L_0x000b:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r2 = r0.f12154i
            r1.<init>(r2)
        L_0x0012:
            int r2 = r0.f12138C
            int r3 = r0.f12136A
            int r2 = r2 - r3
            int r3 = r0.f12139D
            int r4 = r0.f12137B
            int r11 = r3 - r4
            android.text.TextPaint r3 = r0.f12151f
            float r4 = r0.f12169x
            r3.setTextSize(r4)
            float r3 = r0.f12169x
            r4 = 1040187392(0x3e000000, float:0.125)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r12 = (int) r3
            int r13 = r12 * 2
            int r3 = r2 - r13
            float r4 = r0.f12162q
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = (int) r3
        L_0x003f:
            r15 = r3
            java.lang.String r10 = "SubtitlePainter"
            if (r15 > 0) goto L_0x004a
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r10, r1)
            return
        L_0x004a:
            float r3 = r0.f12170y
            r16 = 0
            r4 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = 0
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0064
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            float r5 = r0.f12170y
            int r5 = (int) r5
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x0064:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r1)
            int r3 = r0.f12168w
            r7 = 1
            if (r3 != r7) goto L_0x0087
            int r3 = r8.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r5 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r3 = r8.getSpans(r9, r3, r5)
            android.text.style.ForegroundColorSpan[] r3 = (android.text.style.ForegroundColorSpan[]) r3
            int r5 = r3.length
            r6 = 0
        L_0x007c:
            if (r6 >= r5) goto L_0x0087
            r7 = r3[r6]
            r8.removeSpan(r7)
            int r6 = r6 + 1
            r7 = 1
            goto L_0x007c
        L_0x0087:
            int r3 = r0.f12165t
            int r3 = android.graphics.Color.alpha(r3)
            r7 = 2
            if (r3 <= 0) goto L_0x00b4
            int r3 = r0.f12168w
            if (r3 == 0) goto L_0x00a6
            if (r3 != r7) goto L_0x0097
            goto L_0x00a6
        L_0x0097:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.f12165t
            r3.<init>(r5)
            int r5 = r8.length()
            r8.setSpan(r3, r9, r5, r4)
            goto L_0x00b4
        L_0x00a6:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.f12165t
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x00b4:
            android.text.Layout$Alignment r3 = r0.f12155j
            if (r3 != 0) goto L_0x00ba
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00ba:
            r21 = r3
            android.text.StaticLayout r6 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f12151f
            float r4 = r0.f12149d
            float r3 = r0.f12150e
            r18 = 1
            r19 = r3
            r3 = r6
            r20 = r4
            r4 = r1
            r14 = r6
            r6 = r15
            r7 = r21
            r23 = r8
            r8 = r20
            r25 = r12
            r12 = 0
            r9 = r19
            r12 = r10
            r10 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f12140E = r14
            int r3 = r14.getHeight()
            android.text.StaticLayout r4 = r0.f12140E
            int r4 = r4.getLineCount()
            r5 = 0
            r9 = 0
        L_0x00ed:
            if (r9 >= r4) goto L_0x0102
            android.text.StaticLayout r6 = r0.f12140E
            float r6 = r6.getLineWidth(r9)
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r5 = java.lang.Math.max(r6, r5)
            int r9 = r9 + 1
            goto L_0x00ed
        L_0x0102:
            float r4 = r0.f12162q
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x010e
            if (r5 >= r15) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r15 = r5
        L_0x010f:
            int r15 = r15 + r13
            float r4 = r0.f12160o
            int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x013c
            float r2 = (float) r2
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r0.f12136A
            int r2 = r2 + r4
            int r5 = r0.f12161p
            r6 = 1
            if (r5 == r6) goto L_0x012b
            r7 = 2
            if (r5 == r7) goto L_0x0129
            goto L_0x0130
        L_0x0129:
            int r2 = r2 - r15
            goto L_0x0130
        L_0x012b:
            r7 = 2
            int r2 = r2 * 2
            int r2 = r2 - r15
            int r2 = r2 / r7
        L_0x0130:
            int r2 = java.lang.Math.max(r2, r4)
            int r15 = r15 + r2
            int r4 = r0.f12138C
            int r4 = java.lang.Math.min(r15, r4)
            goto L_0x0145
        L_0x013c:
            r6 = 1
            r7 = 2
            int r2 = r2 - r15
            int r2 = r2 / r7
            int r4 = r0.f12136A
            int r2 = r2 + r4
            int r4 = r2 + r15
        L_0x0145:
            int r20 = r4 - r2
            if (r20 > 0) goto L_0x014f
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r12, r1)
            return
        L_0x014f:
            float r4 = r0.f12157l
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x01ae
            int r5 = r0.f12158m
            if (r5 != 0) goto L_0x0172
            float r5 = (float) r11
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f12137B
            int r4 = r4 + r5
            int r5 = r0.f12159n
            if (r5 != r7) goto L_0x016b
            goto L_0x019e
        L_0x016b:
            if (r5 != r6) goto L_0x019f
            int r4 = r4 * 2
            int r4 = r4 - r3
            int r4 = r4 / r7
            goto L_0x019f
        L_0x0172:
            android.text.StaticLayout r4 = r0.f12140E
            r5 = 0
            int r4 = r4.getLineBottom(r5)
            android.text.StaticLayout r6 = r0.f12140E
            int r5 = r6.getLineTop(r5)
            int r4 = r4 - r5
            float r5 = r0.f12157l
            int r6 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r6 < 0) goto L_0x0191
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f12137B
            int r4 = r4 + r5
            goto L_0x019f
        L_0x0191:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f12139D
            int r4 = r4 + r5
        L_0x019e:
            int r4 = r4 - r3
        L_0x019f:
            int r5 = r4 + r3
            int r6 = r0.f12139D
            if (r5 <= r6) goto L_0x01a8
            int r4 = r6 - r3
            goto L_0x01b8
        L_0x01a8:
            int r3 = r0.f12137B
            if (r4 >= r3) goto L_0x01b8
            r11 = r3
            goto L_0x01b9
        L_0x01ae:
            int r4 = r0.f12139D
            int r4 = r4 - r3
            float r3 = (float) r11
            float r5 = r0.f12171z
            float r3 = r3 * r5
            int r3 = (int) r3
            int r4 = r4 - r3
        L_0x01b8:
            r11 = r4
        L_0x01b9:
            android.text.StaticLayout r12 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f12151f
            float r8 = r0.f12149d
            float r9 = r0.f12150e
            r10 = 1
            r3 = r12
            r4 = r1
            r6 = r20
            r7 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f12140E = r12
            android.text.StaticLayout r1 = new android.text.StaticLayout
            android.text.TextPaint r3 = r0.f12151f
            float r4 = r0.f12149d
            float r5 = r0.f12150e
            r24 = 1
            r17 = r1
            r18 = r23
            r19 = r3
            r22 = r4
            r23 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.f12141F = r1
            r0.f12142G = r2
            r0.f12143H = r11
            r1 = r25
            r0.f12144I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p196ui.SubtitlePainter.m14928g():void");
    }

    /* renamed from: b */
    public void mo14852b(Cue cVar, CaptionStyleCompat bVar, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z = cVar.f7710d == null;
        int i5 = -16777216;
        if (z) {
            if (!TextUtils.isEmpty(cVar.f7708b)) {
                i5 = cVar.f7718l ? cVar.f7719m : bVar.f7703d;
            } else {
                return;
            }
        }
        if (m14923a(this.f12154i, cVar.f7708b) && Util.m10279b(this.f12155j, cVar.f7709c) && this.f12156k == cVar.f7710d && this.f12157l == cVar.f7711e && this.f12158m == cVar.f7712f && Util.m10279b(Integer.valueOf(this.f12159n), Integer.valueOf(cVar.f7713g)) && this.f12160o == cVar.f7714h && Util.m10279b(Integer.valueOf(this.f12161p), Integer.valueOf(cVar.f7715i)) && this.f12162q == cVar.f7716j && this.f12163r == cVar.f7717k && this.f12164s == bVar.f7701b && this.f12165t == bVar.f7702c && this.f12166u == i5 && this.f12168w == bVar.f7704e && this.f12167v == bVar.f7705f && Util.m10279b(this.f12151f.getTypeface(), bVar.f7706g) && this.f12169x == f && this.f12170y == f2 && this.f12171z == f3 && this.f12136A == i && this.f12137B == i2 && this.f12138C == i3 && this.f12139D == i4) {
            m14925d(canvas, z);
            return;
        }
        this.f12154i = cVar.f7708b;
        this.f12155j = cVar.f7709c;
        this.f12156k = cVar.f7710d;
        this.f12157l = cVar.f7711e;
        this.f12158m = cVar.f7712f;
        this.f12159n = cVar.f7713g;
        this.f12160o = cVar.f7714h;
        this.f12161p = cVar.f7715i;
        this.f12162q = cVar.f7716j;
        this.f12163r = cVar.f7717k;
        this.f12164s = bVar.f7701b;
        this.f12165t = bVar.f7702c;
        this.f12166u = i5;
        this.f12168w = bVar.f7704e;
        this.f12167v = bVar.f7705f;
        this.f12151f.setTypeface(bVar.f7706g);
        this.f12169x = f;
        this.f12170y = f2;
        this.f12171z = f3;
        this.f12136A = i;
        this.f12137B = i2;
        this.f12138C = i3;
        this.f12139D = i4;
        if (z) {
            Assertions.m10153e(this.f12154i);
            m14928g();
        } else {
            Assertions.m10153e(this.f12156k);
            m14927f();
        }
        m14925d(canvas, z);
    }
}
