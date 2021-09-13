package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import com.bumptech.glide.p174t.C1638j;
import com.bumptech.glide.p174t.C1639k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.d.z */
public final class RoundedCorners extends BitmapTransformation {

    /* renamed from: b */
    private static final byte[] f10914b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(Key.f10343a);

    /* renamed from: c */
    private final int f10915c;

    public RoundedCorners(int i) {
        C1638j.m14078a(i > 0, "roundingRadius must be greater than 0.");
        this.f10915c = i;
    }

    /* renamed from: b */
    public void mo8826b(MessageDigest messageDigest) {
        messageDigest.update(f10914b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f10915c).array());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo9210c(BitmapPool eVar, Bitmap bitmap, int i, int i2) {
        return TransformationUtils.m13284o(eVar, bitmap, this.f10915c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RoundedCorners)) {
            return false;
        }
        if (this.f10915c == ((RoundedCorners) obj).f10915c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C1639k.m14096n(-569625254, C1639k.m14095m(this.f10915c));
    }
}
