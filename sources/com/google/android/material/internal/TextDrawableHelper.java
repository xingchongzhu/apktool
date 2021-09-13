package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p067c.p068a.p069a.p114b.p133z.TextAppearance;
import p067c.p068a.p069a.p114b.p133z.TextAppearanceFontCallback;

/* renamed from: com.google.android.material.internal.h */
public class TextDrawableHelper {

    /* renamed from: a */
    private final TextPaint f13191a = new TextPaint(1);

    /* renamed from: b */
    private final TextAppearanceFontCallback f13192b = new C2051a();

    /* renamed from: c */
    private float f13193c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f13194d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WeakReference<C2052b> f13195e = new WeakReference<>(null);

    /* renamed from: f */
    private TextAppearance f13196f;

    /* renamed from: com.google.android.material.internal.h$a */
    /* compiled from: TextDrawableHelper */
    class C2051a extends TextAppearanceFontCallback {
        C2051a() {
        }

        /* renamed from: a */
        public void mo8085a(int i) {
            TextDrawableHelper.this.f13194d = true;
            C2052b bVar = (C2052b) TextDrawableHelper.this.f13195e.get();
            if (bVar != null) {
                bVar.mo7976a();
            }
        }

        /* renamed from: b */
        public void mo8086b(Typeface typeface, boolean z) {
            if (!z) {
                TextDrawableHelper.this.f13194d = true;
                C2052b bVar = (C2052b) TextDrawableHelper.this.f13195e.get();
                if (bVar != null) {
                    bVar.mo7976a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.h$b */
    /* compiled from: TextDrawableHelper */
    public interface C2052b {
        /* renamed from: a */
        void mo7976a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public TextDrawableHelper(C2052b bVar) {
        mo16005g(bVar);
    }

    /* renamed from: c */
    private float m16210c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f13191a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public TextAppearance mo16002d() {
        return this.f13196f;
    }

    /* renamed from: e */
    public TextPaint mo16003e() {
        return this.f13191a;
    }

    /* renamed from: f */
    public float mo16004f(String str) {
        if (!this.f13194d) {
            return this.f13193c;
        }
        float c = m16210c(str);
        this.f13193c = c;
        this.f13194d = false;
        return c;
    }

    /* renamed from: g */
    public void mo16005g(C2052b bVar) {
        this.f13195e = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public void mo16006h(TextAppearance dVar, Context context) {
        if (this.f13196f != dVar) {
            this.f13196f = dVar;
            if (dVar != null) {
                dVar.mo8094k(context, this.f13191a, this.f13192b);
                C2052b bVar = (C2052b) this.f13195e.get();
                if (bVar != null) {
                    this.f13191a.drawableState = bVar.getState();
                }
                dVar.mo8093j(context, this.f13191a, this.f13192b);
                this.f13194d = true;
            }
            C2052b bVar2 = (C2052b) this.f13195e.get();
            if (bVar2 != null) {
                bVar2.mo7976a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void mo16007i(boolean z) {
        this.f13194d = z;
    }

    /* renamed from: j */
    public void mo16008j(Context context) {
        this.f13196f.mo8093j(context, this.f13191a, this.f13192b);
    }
}
