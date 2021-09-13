package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.p */
class ViewBoundsCheck {

    /* renamed from: a */
    final C0478b f3147a;

    /* renamed from: b */
    C0477a f3148b = new C0477a();

    /* renamed from: androidx.recyclerview.widget.p$a */
    /* compiled from: ViewBoundsCheck */
    static class C0477a {

        /* renamed from: a */
        int f3149a = 0;

        /* renamed from: b */
        int f3150b;

        /* renamed from: c */
        int f3151c;

        /* renamed from: d */
        int f3152d;

        /* renamed from: e */
        int f3153e;

        C0477a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3909a(int i) {
            this.f3149a = i | this.f3149a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo3910b() {
            int i = this.f3149a;
            if ((i & 7) != 0 && (i & (mo3911c(this.f3152d, this.f3150b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f3149a;
            if ((i2 & 112) != 0 && (i2 & (mo3911c(this.f3152d, this.f3151c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f3149a;
            if ((i3 & 1792) != 0 && (i3 & (mo3911c(this.f3153e, this.f3150b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f3149a;
            if ((i4 & 28672) == 0 || (i4 & (mo3911c(this.f3153e, this.f3151c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo3911c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo3912d() {
            this.f3149a = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo3913e(int i, int i2, int i3, int i4) {
            this.f3150b = i;
            this.f3151c = i2;
            this.f3152d = i3;
            this.f3153e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$b */
    /* compiled from: ViewBoundsCheck */
    interface C0478b {
        /* renamed from: a */
        View mo3567a(int i);

        /* renamed from: b */
        int mo3568b();

        /* renamed from: c */
        int mo3569c(View view);

        /* renamed from: d */
        int mo3570d();

        /* renamed from: e */
        int mo3571e(View view);
    }

    ViewBoundsCheck(C0478b bVar) {
        this.f3147a = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo3907a(int i, int i2, int i3, int i4) {
        int d = this.f3147a.mo3570d();
        int b = this.f3147a.mo3568b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = this.f3147a.mo3567a(i);
            this.f3148b.mo3913e(d, b, this.f3147a.mo3569c(a), this.f3147a.mo3571e(a));
            if (i3 != 0) {
                this.f3148b.mo3912d();
                this.f3148b.mo3909a(i3);
                if (this.f3148b.mo3910b()) {
                    return a;
                }
            }
            if (i4 != 0) {
                this.f3148b.mo3912d();
                this.f3148b.mo3909a(i4);
                if (this.f3148b.mo3910b()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3908b(View view, int i) {
        this.f3148b.mo3913e(this.f3147a.mo3570d(), this.f3147a.mo3568b(), this.f3147a.mo3569c(view), this.f3147a.mo3571e(view));
        if (i == 0) {
            return false;
        }
        this.f3148b.mo3912d();
        this.f3148b.mo3909a(i);
        return this.f3148b.mo3910b();
    }
}
