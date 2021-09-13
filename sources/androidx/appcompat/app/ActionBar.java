package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import p010b.p011a.C0511j;
import p010b.p011a.p017n.ActionMode;
import p010b.p011a.p017n.ActionMode.C0527a;

/* renamed from: androidx.appcompat.app.a */
public abstract class ActionBar {

    /* renamed from: androidx.appcompat.app.a$a */
    /* compiled from: ActionBar */
    public static class C0057a extends MarginLayoutParams {

        /* renamed from: a */
        public int f272a;

        public C0057a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f272a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0511j.f3650t);
            this.f272a = obtainStyledAttributes.getInt(C0511j.f3655u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0057a(int i, int i2) {
            super(i, i2);
            this.f272a = 0;
            this.f272a = 8388627;
        }

        public C0057a(C0057a aVar) {
            super(aVar);
            this.f272a = 0;
            this.f272a = aVar.f272a;
        }

        public C0057a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f272a = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    /* compiled from: ActionBar */
    public interface C0058b {
        /* renamed from: a */
        void mo266a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    /* compiled from: ActionBar */
    public static abstract class C0059c {
        /* renamed from: a */
        public abstract CharSequence mo267a();

        /* renamed from: b */
        public abstract View mo268b();

        /* renamed from: c */
        public abstract Drawable mo269c();

        /* renamed from: d */
        public abstract CharSequence mo270d();

        /* renamed from: e */
        public abstract void mo271e();
    }

    /* renamed from: g */
    public boolean mo251g() {
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo252h();

    /* renamed from: i */
    public abstract void mo253i(boolean z);

    /* renamed from: j */
    public abstract int mo254j();

    /* renamed from: k */
    public abstract Context mo255k();

    /* renamed from: l */
    public boolean mo256l() {
        return false;
    }

    /* renamed from: m */
    public abstract void mo257m(Configuration configuration);

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo258n() {
    }

    /* renamed from: o */
    public abstract boolean mo259o(int i, KeyEvent keyEvent);

    /* renamed from: p */
    public boolean mo260p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean mo261q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo262r(boolean z);

    /* renamed from: s */
    public abstract void mo263s(boolean z);

    /* renamed from: t */
    public abstract void mo264t(CharSequence charSequence);

    /* renamed from: u */
    public abstract ActionMode mo265u(C0527a aVar);
}
