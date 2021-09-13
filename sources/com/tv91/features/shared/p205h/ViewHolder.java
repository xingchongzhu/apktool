package com.tv91.features.shared.p205h;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.C0407d0;
import com.tv91.p255z.C3066f;
import com.tv91.p255z.ImageLoader;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.features.shared.h.d */
public abstract class ViewHolder<ITEM> extends C0407d0 {

    /* renamed from: t */
    private static final Drawable f13989t = new ColorDrawable(0);

    /* renamed from: u */
    protected final Context f13990u;

    /* renamed from: v */
    protected final C3066f f13991v;

    public <VB extends ViewBinding> ViewHolder(VB vb) {
        this(vb.mo5604a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo16844M(ITEM item) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public int mo16845N(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, this.f13990u.getResources().getDisplayMetrics());
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public int mo16846O(int i) {
        return ContextCompat.m1756b(this.f13990u, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public int mo16847P(int i) {
        return this.f13990u.getResources().getDimensionPixelOffset(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public Drawable mo16848Q(int i) {
        Drawable d = ContextCompat.m1758d(this.f13990u, i);
        return d == null ? f13989t : d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public String mo16849R(int i, Object... objArr) {
        return this.f13990u.getString(i, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public Drawable mo16850S(int i, int i2) {
        PaintDrawable paintDrawable = new PaintDrawable(mo16846O(i));
        paintDrawable.setCornerRadius((float) i2);
        return paintDrawable;
    }

    public ViewHolder(View view) {
        super(view);
        Context context = view.getContext();
        this.f13990u = context;
        this.f13991v = ImageLoader.m20833e(context);
    }
}
