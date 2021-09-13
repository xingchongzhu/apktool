package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.C0407d0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.b */
class ChildHelper {

    /* renamed from: a */
    final C0453b f3002a;

    /* renamed from: b */
    final C0452a f3003b = new C0452a();

    /* renamed from: c */
    final List<View> f3004c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    /* compiled from: ChildHelper */
    static class C0452a {

        /* renamed from: a */
        long f3005a = 0;

        /* renamed from: b */
        C0452a f3006b;

        C0452a() {
        }

        /* renamed from: c */
        private void m3719c() {
            if (this.f3006b == null) {
                this.f3006b = new C0452a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3784a(int i) {
            if (i >= 64) {
                C0452a aVar = this.f3006b;
                if (aVar != null) {
                    aVar.mo3784a(i - 64);
                    return;
                }
                return;
            }
            this.f3005a &= (1 << i) ^ -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo3785b(int i) {
            C0452a aVar = this.f3006b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f3005a);
                }
                return Long.bitCount(this.f3005a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f3005a & ((1 << i) - 1));
            } else {
                return aVar.mo3785b(i - 64) + Long.bitCount(this.f3005a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo3786d(int i) {
            if (i >= 64) {
                m3719c();
                return this.f3006b.mo3786d(i - 64);
            }
            return (this.f3005a & (1 << i)) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo3787e(int i, boolean z) {
            if (i >= 64) {
                m3719c();
                this.f3006b.mo3787e(i - 64, z);
                return;
            }
            long j = this.f3005a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f3005a = ((j & (j2 ^ -1)) << 1) | (j & j2);
            if (z) {
                mo3790h(i);
            } else {
                mo3784a(i);
            }
            if (z2 || this.f3006b != null) {
                m3719c();
                this.f3006b.mo3787e(0, z2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo3788f(int i) {
            if (i >= 64) {
                m3719c();
                return this.f3006b.mo3788f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f3005a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (j ^ -1);
            this.f3005a = j3;
            long j4 = j - 1;
            this.f3005a = (j3 & j4) | Long.rotateRight((j4 ^ -1) & j3, 1);
            C0452a aVar = this.f3006b;
            if (aVar != null) {
                if (aVar.mo3786d(0)) {
                    mo3790h(63);
                }
                this.f3006b.mo3788f(0);
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo3789g() {
            this.f3005a = 0;
            C0452a aVar = this.f3006b;
            if (aVar != null) {
                aVar.mo3789g();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo3790h(int i) {
            if (i >= 64) {
                m3719c();
                this.f3006b.mo3790h(i - 64);
                return;
            }
            this.f3005a |= 1 << i;
        }

        public String toString() {
            if (this.f3006b == null) {
                return Long.toBinaryString(this.f3005a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3006b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.f3005a));
            return sb.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    /* compiled from: ChildHelper */
    interface C0453b {
        /* renamed from: a */
        View mo3387a(int i);

        /* renamed from: b */
        void mo3388b(View view);

        /* renamed from: c */
        C0407d0 mo3389c(View view);

        /* renamed from: d */
        void mo3390d(int i);

        /* renamed from: e */
        void mo3391e(View view);

        /* renamed from: f */
        void mo3392f(View view, int i);

        /* renamed from: g */
        int mo3393g();

        /* renamed from: h */
        void mo3394h(int i);

        /* renamed from: i */
        void mo3395i();

        /* renamed from: j */
        void mo3396j(View view, int i, LayoutParams layoutParams);

        /* renamed from: k */
        int mo3397k(View view);
    }

    ChildHelper(C0453b bVar) {
        this.f3002a = bVar;
    }

    /* renamed from: h */
    private int m3699h(int i) {
        if (i < 0) {
            return -1;
        }
        int g = this.f3002a.mo3393g();
        int i2 = i;
        while (i2 < g) {
            int b = i - (i2 - this.f3003b.mo3785b(i2));
            if (b == 0) {
                while (this.f3003b.mo3786d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m3700l(View view) {
        this.f3004c.add(view);
        this.f3002a.mo3388b(view);
    }

    /* renamed from: t */
    private boolean m3701t(View view) {
        if (!this.f3004c.remove(view)) {
            return false;
        }
        this.f3002a.mo3391e(view);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3766a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f3002a.mo3393g();
        } else {
            i2 = m3699h(i);
        }
        this.f3003b.mo3787e(i2, z);
        if (z) {
            m3700l(view);
        }
        this.f3002a.mo3392f(view, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3767b(View view, boolean z) {
        mo3766a(view, -1, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3768c(View view, int i, LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f3002a.mo3393g();
        } else {
            i2 = m3699h(i);
        }
        this.f3003b.mo3787e(i2, z);
        if (z) {
            m3700l(view);
        }
        this.f3002a.mo3396j(view, i2, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3769d(int i) {
        int h = m3699h(i);
        this.f3003b.mo3788f(h);
        this.f3002a.mo3390d(h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public View mo3770e(int i) {
        int size = this.f3004c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f3004c.get(i2);
            C0407d0 c = this.f3002a.mo3389c(view);
            if (c.mo3372m() == i && !c.mo3379t() && !c.mo3382v()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public View mo3771f(int i) {
        return this.f3002a.mo3387a(m3699h(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo3772g() {
        return this.f3002a.mo3393g() - this.f3004c.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public View mo3773i(int i) {
        return this.f3002a.mo3387a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo3774j() {
        return this.f3002a.mo3393g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo3775k(View view) {
        int k = this.f3002a.mo3397k(view);
        if (k >= 0) {
            this.f3003b.mo3790h(k);
            m3700l(view);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("view is not a child, cannot hide ");
        sb.append(view);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public int mo3776m(View view) {
        int k = this.f3002a.mo3397k(view);
        if (k != -1 && !this.f3003b.mo3786d(k)) {
            return k - this.f3003b.mo3785b(k);
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo3777n(View view) {
        return this.f3004c.contains(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo3778o() {
        this.f3003b.mo3789g();
        for (int size = this.f3004c.size() - 1; size >= 0; size--) {
            this.f3002a.mo3391e((View) this.f3004c.get(size));
            this.f3004c.remove(size);
        }
        this.f3002a.mo3395i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo3779p(View view) {
        int k = this.f3002a.mo3397k(view);
        if (k >= 0) {
            if (this.f3003b.mo3788f(k)) {
                m3701t(view);
            }
            this.f3002a.mo3394h(k);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo3780q(int i) {
        int h = m3699h(i);
        View a = this.f3002a.mo3387a(h);
        if (a != null) {
            if (this.f3003b.mo3788f(h)) {
                m3701t(a);
            }
            this.f3002a.mo3394h(h);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public boolean mo3781r(View view) {
        int k = this.f3002a.mo3397k(view);
        if (k == -1) {
            m3701t(view);
            return true;
        } else if (!this.f3003b.mo3786d(k)) {
            return false;
        } else {
            this.f3003b.mo3788f(k);
            m3701t(view);
            this.f3002a.mo3394h(k);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo3782s(View view) {
        int k = this.f3002a.mo3397k(view);
        if (k < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f3003b.mo3786d(k)) {
            this.f3003b.mo3784a(k);
            m3701t(view);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("trying to unhide a view that was not hidden");
            sb2.append(view);
            throw new RuntimeException(sb2.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3003b.toString());
        sb.append(", hidden list:");
        sb.append(this.f3004c.size());
        return sb.toString();
    }
}
