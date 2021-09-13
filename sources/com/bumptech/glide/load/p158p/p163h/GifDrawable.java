package com.bumptech.glide.load.p158p.p163h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.p158p.p163h.GifFrameLoader.C1603b;
import com.bumptech.glide.p166n.GifDecoder;
import com.bumptech.glide.p174t.C1638j;
import java.nio.ByteBuffer;
import java.util.List;
import p010b.p063q.p064a.p065a.Animatable2Compat;

/* renamed from: com.bumptech.glide.load.p.h.c */
public class GifDrawable extends Drawable implements C1603b, Animatable {

    /* renamed from: a */
    private final C1601a f10931a;

    /* renamed from: b */
    private boolean f10932b;

    /* renamed from: c */
    private boolean f10933c;

    /* renamed from: d */
    private boolean f10934d;

    /* renamed from: e */
    private boolean f10935e;

    /* renamed from: f */
    private int f10936f;

    /* renamed from: g */
    private int f10937g;

    /* renamed from: h */
    private boolean f10938h;

    /* renamed from: i */
    private Paint f10939i;

    /* renamed from: j */
    private Rect f10940j;

    /* renamed from: k */
    private List<Animatable2Compat> f10941k;

    /* renamed from: com.bumptech.glide.load.p.h.c$a */
    /* compiled from: GifDrawable */
    static final class C1601a extends ConstantState {

        /* renamed from: a */
        final GifFrameLoader f10942a;

        C1601a(GifFrameLoader gVar) {
            this.f10942a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new GifDrawable(this);
        }
    }

    public GifDrawable(Context context, GifDecoder aVar, Transformation<Bitmap> mVar, int i, int i2, Bitmap bitmap) {
        GifFrameLoader gVar = new GifFrameLoader(Glide.m12384c(context), aVar, i, i2, mVar, bitmap);
        this(new C1601a(gVar));
    }

    /* renamed from: b */
    private Callback m13530b() {
        Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: d */
    private Rect m13531d() {
        if (this.f10940j == null) {
            this.f10940j = new Rect();
        }
        return this.f10940j;
    }

    /* renamed from: h */
    private Paint m13532h() {
        if (this.f10939i == null) {
            this.f10939i = new Paint(2);
        }
        return this.f10939i;
    }

    /* renamed from: j */
    private void m13533j() {
        List<Animatable2Compat> list = this.f10941k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Animatable2Compat) this.f10941k.get(i)).mo5455a(this);
            }
        }
    }

    /* renamed from: l */
    private void m13534l() {
        this.f10936f = 0;
    }

    /* renamed from: n */
    private void m13535n() {
        C1638j.m14078a(!this.f10934d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f10931a.f10942a.mo9305f() == 1) {
            invalidateSelf();
        } else if (!this.f10932b) {
            this.f10932b = true;
            this.f10931a.f10942a.mo9311r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    private void m13536o() {
        this.f10932b = false;
        this.f10931a.f10942a.mo9312s(this);
    }

    /* renamed from: a */
    public void mo9276a() {
        if (m13530b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo9281g() == mo9280f() - 1) {
            this.f10936f++;
        }
        int i = this.f10937g;
        if (i != -1 && this.f10936f >= i) {
            m13533j();
            stop();
        }
    }

    /* renamed from: c */
    public ByteBuffer mo9277c() {
        return this.f10931a.f10942a.mo9301b();
    }

    public void draw(Canvas canvas) {
        if (!this.f10934d) {
            if (this.f10938h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m13531d());
                this.f10938h = false;
            }
            canvas.drawBitmap(this.f10931a.f10942a.mo9302c(), null, m13531d(), m13532h());
        }
    }

    /* renamed from: e */
    public Bitmap mo9279e() {
        return this.f10931a.f10942a.mo9304e();
    }

    /* renamed from: f */
    public int mo9280f() {
        return this.f10931a.f10942a.mo9305f();
    }

    /* renamed from: g */
    public int mo9281g() {
        return this.f10931a.f10942a.mo9303d();
    }

    public ConstantState getConstantState() {
        return this.f10931a;
    }

    public int getIntrinsicHeight() {
        return this.f10931a.f10942a.mo9306h();
    }

    public int getIntrinsicWidth() {
        return this.f10931a.f10942a.mo9308k();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    public int mo9286i() {
        return this.f10931a.f10942a.mo9307j();
    }

    public boolean isRunning() {
        return this.f10932b;
    }

    /* renamed from: k */
    public void mo9288k() {
        this.f10934d = true;
        this.f10931a.f10942a.mo9300a();
    }

    /* renamed from: m */
    public void mo9289m(Transformation<Bitmap> mVar, Bitmap bitmap) {
        this.f10931a.f10942a.mo9310o(mVar, bitmap);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f10938h = true;
    }

    public void setAlpha(int i) {
        m13532h().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m13532h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C1638j.m14078a(!this.f10934d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f10935e = z;
        if (!z) {
            m13536o();
        } else if (this.f10933c) {
            m13535n();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f10933c = true;
        m13534l();
        if (this.f10935e) {
            m13535n();
        }
    }

    public void stop() {
        this.f10933c = false;
        m13536o();
    }

    GifDrawable(C1601a aVar) {
        this.f10935e = true;
        this.f10937g = -1;
        this.f10931a = (C1601a) C1638j.m14081d(aVar);
    }
}
