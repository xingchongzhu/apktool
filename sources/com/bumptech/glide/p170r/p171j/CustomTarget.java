package com.bumptech.glide.p170r.p171j;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p170r.Request;
import com.bumptech.glide.p174t.C1639k;

/* renamed from: com.bumptech.glide.r.j.c */
public abstract class CustomTarget<T> implements Target<T> {

    /* renamed from: a */
    private final int f11212a;

    /* renamed from: b */
    private final int f11213b;

    /* renamed from: c */
    private Request f11214c;

    public CustomTarget() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final Request mo9526a() {
        return this.f11214c;
    }

    /* renamed from: b */
    public void mo8741b() {
    }

    /* renamed from: c */
    public final void mo9527c(SizeReadyCallback gVar) {
    }

    /* renamed from: e */
    public void mo9522e(Drawable drawable) {
    }

    /* renamed from: f */
    public void mo8742f() {
    }

    /* renamed from: g */
    public void mo9523g(Drawable drawable) {
    }

    /* renamed from: i */
    public final void mo9528i(SizeReadyCallback gVar) {
        gVar.mo9520h(this.f11212a, this.f11213b);
    }

    /* renamed from: j */
    public final void mo9529j(Request cVar) {
        this.f11214c = cVar;
    }

    /* renamed from: k */
    public void mo8743k() {
    }

    public CustomTarget(int i, int i2) {
        if (C1639k.m14102t(i, i2)) {
            this.f11212a = i;
            this.f11213b = i2;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(i);
        sb.append(" and height: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
