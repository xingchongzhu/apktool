package com.tv91.features.shared;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import com.tv91.p207q.p208a.BaseView;
import com.tv91.p207q.p208a.C2341f;
import com.tv91.p255z.C3066f;
import com.tv91.p255z.ImageLoader;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.features.shared.f */
public abstract class BasicView implements C2341f {

    /* renamed from: a */
    private static final Drawable f13973a = new ColorDrawable(0);

    /* renamed from: b */
    protected final Context f13974b;

    /* renamed from: c */
    protected final C3066f f13975c;

    /* renamed from: d */
    private final View f13976d;

    public <VB extends ViewBinding> BasicView(VB vb) {
        this(vb.mo5604a());
    }

    /* renamed from: J */
    public /* synthetic */ void mo16635J(Bundle bundle) {
        BaseView.m17641a(this, bundle);
    }

    /* renamed from: g0 */
    public /* synthetic */ void mo16552g0(String str) {
        BaseView.m17643c(this, str);
    }

    /* renamed from: h2 */
    public /* synthetic */ void mo16553h2(Bundle bundle) {
        BaseView.m17642b(this, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l2 */
    public int mo16812l2(int i) {
        return ContextCompat.m1756b(this.f13974b, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m2 */
    public int mo16813m2(int i) {
        return this.f13974b.getResources().getDimensionPixelOffset(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public Drawable mo16814n2(int i) {
        Drawable d = ContextCompat.m1758d(this.f13974b, i);
        return d == null ? f13973a : d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public String mo16815o2(int i, Object... objArr) {
        return this.f13974b.getString(i, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo16816p2(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.m1761g(this.f13974b, InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }

    public BasicView(View view) {
        this.f13976d = view;
        Context context = view.getContext();
        this.f13974b = context;
        this.f13975c = ImageLoader.m20833e(context);
    }
}
