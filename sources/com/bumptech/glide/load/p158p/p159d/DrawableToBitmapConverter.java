package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.load.p152n.p153a0.BitmapPoolAdapter;
import java.util.concurrent.locks.Lock;

/* renamed from: com.bumptech.glide.load.p.d.o */
final class DrawableToBitmapConverter {

    /* renamed from: a */
    private static final BitmapPool f10881a = new C1594a();

    /* renamed from: com.bumptech.glide.load.p.d.o$a */
    /* compiled from: DrawableToBitmapConverter */
    class C1594a extends BitmapPoolAdapter {
        C1594a() {
        }

        /* renamed from: d */
        public void mo8883d(Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    static Resource<Bitmap> m13418a(BitmapPool eVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m13419b(eVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            eVar = f10881a;
        }
        return BitmapResource.m13323g(bitmap, eVar);
    }

    /* renamed from: b */
    private static Bitmap m13419b(BitmapPool eVar, Drawable drawable, int i, int i2) {
        String str = "Unable to draw ";
        String str2 = "DrawableToBitmap";
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(str2, 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                Log.w(str2, sb.toString());
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock i3 = TransformationUtils.m13278i();
            i3.lock();
            Bitmap c = eVar.mo8882c(i, i2, Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(c);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return c;
            } finally {
                i3.unlock();
            }
        } else {
            if (Log.isLoggable(str2, 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                Log.w(str2, sb2.toString());
            }
            return null;
        }
    }
}
