package com.google.android.material.appbar;

import android.view.View;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: com.google.android.material.appbar.d */
class ViewOffsetHelper {

    /* renamed from: a */
    private final View f12521a;

    /* renamed from: b */
    private int f12522b;

    /* renamed from: c */
    private int f12523c;

    /* renamed from: d */
    private int f12524d;

    /* renamed from: e */
    private int f12525e;

    /* renamed from: f */
    private boolean f12526f = true;

    /* renamed from: g */
    private boolean f12527g = true;

    public ViewOffsetHelper(View view) {
        this.f12521a = view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15067a() {
        View view = this.f12521a;
        ViewCompat.m5543Z(view, this.f12524d - (view.getTop() - this.f12522b));
        View view2 = this.f12521a;
        ViewCompat.m5542Y(view2, this.f12525e - (view2.getLeft() - this.f12523c));
    }

    /* renamed from: b */
    public int mo15068b() {
        return this.f12524d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo15069c() {
        this.f12522b = this.f12521a.getTop();
        this.f12523c = this.f12521a.getLeft();
    }

    /* renamed from: d */
    public boolean mo15070d(int i) {
        if (!this.f12527g || this.f12525e == i) {
            return false;
        }
        this.f12525e = i;
        mo15067a();
        return true;
    }

    /* renamed from: e */
    public boolean mo15071e(int i) {
        if (!this.f12526f || this.f12524d == i) {
            return false;
        }
        this.f12524d = i;
        mo15067a();
        return true;
    }
}
