package p010b.p062p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: b.p.r */
class TransitionUtils {

    /* renamed from: a */
    private static final boolean f5119a;

    /* renamed from: b */
    private static final boolean f5120b;

    /* renamed from: c */
    private static final boolean f5121c;

    static {
        int i = VERSION.SDK_INT;
        boolean z = true;
        f5119a = i >= 19;
        f5120b = i >= 18;
        if (i < 28) {
            z = false;
        }
        f5121c = z;
    }

    /* renamed from: a */
    static View m6109a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        C0709c0.m5915i(view, matrix);
        C0709c0.m5916j(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ScaleType.CENTER_CROP);
        Bitmap b = m6110b(view, matrix, rectF, viewGroup);
        if (b != null) {
            imageView.setImageBitmap(b);
        }
        imageView.measure(MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m6110b(android.view.View r9, android.graphics.Matrix r10, android.graphics.RectF r11, android.view.ViewGroup r12) {
        /*
            boolean r0 = f5119a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            boolean r0 = r9.isAttachedToWindow()
            r0 = r0 ^ 1
            if (r12 != 0) goto L_0x000e
            goto L_0x0014
        L_0x000e:
            boolean r2 = r12.isAttachedToWindow()
            goto L_0x0015
        L_0x0013:
            r0 = 0
        L_0x0014:
            r2 = 0
        L_0x0015:
            boolean r3 = f5120b
            r4 = 0
            if (r3 == 0) goto L_0x0031
            if (r0 == 0) goto L_0x0031
            if (r2 != 0) goto L_0x001f
            return r4
        L_0x001f:
            android.view.ViewParent r1 = r9.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.indexOfChild(r9)
            android.view.ViewGroupOverlay r5 = r12.getOverlay()
            r5.add(r9)
            goto L_0x0033
        L_0x0031:
            r1 = r4
            r2 = 0
        L_0x0033:
            float r5 = r11.width()
            int r5 = java.lang.Math.round(r5)
            float r6 = r11.height()
            int r6 = java.lang.Math.round(r6)
            if (r5 <= 0) goto L_0x0099
            if (r6 <= 0) goto L_0x0099
            r4 = 1065353216(0x3f800000, float:1.0)
            r7 = 1233125376(0x49800000, float:1048576.0)
            int r8 = r5 * r6
            float r8 = (float) r8
            float r7 = r7 / r8
            float r4 = java.lang.Math.min(r4, r7)
            float r5 = (float) r5
            float r5 = r5 * r4
            int r5 = java.lang.Math.round(r5)
            float r6 = (float) r6
            float r6 = r6 * r4
            int r6 = java.lang.Math.round(r6)
            float r7 = r11.left
            float r7 = -r7
            float r11 = r11.top
            float r11 = -r11
            r10.postTranslate(r7, r11)
            r10.postScale(r4, r4)
            boolean r11 = f5121c
            if (r11 == 0) goto L_0x0088
            android.graphics.Picture r11 = new android.graphics.Picture
            r11.<init>()
            android.graphics.Canvas r4 = r11.beginRecording(r5, r6)
            r4.concat(r10)
            r9.draw(r4)
            r11.endRecording()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r11)
            goto L_0x0099
        L_0x0088:
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r5, r6, r11)
            android.graphics.Canvas r11 = new android.graphics.Canvas
            r11.<init>(r4)
            r11.concat(r10)
            r9.draw(r11)
        L_0x0099:
            if (r3 == 0) goto L_0x00a7
            if (r0 == 0) goto L_0x00a7
            android.view.ViewGroupOverlay r10 = r12.getOverlay()
            r10.remove(r9)
            r1.addView(r9, r2)
        L_0x00a7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p062p.TransitionUtils.m6110b(android.view.View, android.graphics.Matrix, android.graphics.RectF, android.view.ViewGroup):android.graphics.Bitmap");
    }

    /* renamed from: c */
    static Animator m6111c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2});
        return animatorSet;
    }
}
