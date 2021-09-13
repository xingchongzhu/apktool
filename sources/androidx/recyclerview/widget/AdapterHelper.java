package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.C0407d0;
import java.util.ArrayList;
import java.util.List;
import p010b.p034g.p042j.C0610e;
import p010b.p034g.p042j.C0611f;

/* renamed from: androidx.recyclerview.widget.a */
class AdapterHelper implements C0471a {

    /* renamed from: a */
    private C0610e<C0451b> f2990a;

    /* renamed from: b */
    final ArrayList<C0451b> f2991b;

    /* renamed from: c */
    final ArrayList<C0451b> f2992c;

    /* renamed from: d */
    final C0450a f2993d;

    /* renamed from: e */
    Runnable f2994e;

    /* renamed from: f */
    final boolean f2995f;

    /* renamed from: g */
    final OpReorderer f2996g;

    /* renamed from: h */
    private int f2997h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* compiled from: AdapterHelper */
    interface C0450a {
        /* renamed from: a */
        void mo3398a(int i, int i2);

        /* renamed from: b */
        void mo3399b(C0451b bVar);

        /* renamed from: c */
        C0407d0 mo3400c(int i);

        /* renamed from: d */
        void mo3401d(int i, int i2);

        /* renamed from: e */
        void mo3402e(int i, int i2);

        /* renamed from: f */
        void mo3403f(int i, int i2);

        /* renamed from: g */
        void mo3404g(C0451b bVar);

        /* renamed from: h */
        void mo3405h(int i, int i2, Object obj);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* compiled from: AdapterHelper */
    static class C0451b {

        /* renamed from: a */
        int f2998a;

        /* renamed from: b */
        int f2999b;

        /* renamed from: c */
        Object f3000c;

        /* renamed from: d */
        int f3001d;

        C0451b(int i, int i2, int i3, Object obj) {
            this.f2998a = i;
            this.f2999b = i2;
            this.f3001d = i3;
            this.f3000c = obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo3762a() {
            int i = this.f2998a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0451b.class != obj.getClass()) {
                return false;
            }
            C0451b bVar = (C0451b) obj;
            int i = this.f2998a;
            if (i != bVar.f2998a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3001d - this.f2999b) == 1 && this.f3001d == bVar.f2999b && this.f2999b == bVar.f3001d) {
                return true;
            }
            if (this.f3001d != bVar.f3001d || this.f2999b != bVar.f2999b) {
                return false;
            }
            Object obj2 = this.f3000c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f3000c)) {
                    return false;
                }
            } else if (bVar.f3000c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2998a * 31) + this.f2999b) * 31) + this.f3001d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            sb.append(mo3762a());
            sb.append(",s:");
            sb.append(this.f2999b);
            sb.append("c:");
            sb.append(this.f3001d);
            sb.append(",p:");
            sb.append(this.f3000c);
            sb.append("]");
            return sb.toString();
        }
    }

    AdapterHelper(C0450a aVar) {
        this(aVar, false);
    }

    /* renamed from: c */
    private void m3665c(C0451b bVar) {
        m3671u(bVar);
    }

    /* renamed from: d */
    private void m3666d(C0451b bVar) {
        m3671u(bVar);
    }

    /* renamed from: f */
    private void m3667f(C0451b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f2999b;
        int i2 = bVar.f3001d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f2993d.mo3400c(i3) != null || m3669h(i3)) {
                if (c2 == 0) {
                    m3670k(mo3746b(2, i, i4, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m3671u(mo3746b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f3001d) {
            mo3745a(bVar);
            bVar = mo3746b(2, i, i4, null);
        }
        if (c2 == 0) {
            m3670k(bVar);
        } else {
            m3671u(bVar);
        }
    }

    /* renamed from: g */
    private void m3668g(C0451b bVar) {
        int i = bVar.f2999b;
        int i2 = bVar.f3001d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f2993d.mo3400c(i) != null || m3669h(i)) {
                if (c == 0) {
                    m3670k(mo3746b(4, i3, i4, bVar.f3000c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m3671u(mo3746b(4, i3, i4, bVar.f3000c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f3001d) {
            Object obj = bVar.f3000c;
            mo3745a(bVar);
            bVar = mo3746b(4, i3, i4, obj);
        }
        if (c == 0) {
            m3670k(bVar);
        } else {
            m3671u(bVar);
        }
    }

    /* renamed from: h */
    private boolean m3669h(int i) {
        int size = this.f2992c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0451b bVar = (C0451b) this.f2992c.get(i2);
            int i3 = bVar.f2998a;
            if (i3 == 8) {
                if (mo3752n(bVar.f3001d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f2999b;
                int i5 = bVar.f3001d + i4;
                while (i4 < i5) {
                    if (mo3752n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m3670k(C0451b bVar) {
        int i;
        int i2 = bVar.f2998a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int y = m3672y(bVar.f2999b, i2);
        int i3 = bVar.f2999b;
        int i4 = bVar.f2998a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("op should be remove or update.");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f3001d; i6++) {
            int y2 = m3672y(bVar.f2999b + (i * i6), bVar.f2998a);
            int i7 = bVar.f2998a;
            if (i7 == 2 ? y2 == y : i7 == 4 && y2 == y + 1) {
                i5++;
            } else {
                C0451b b = mo3746b(i7, y, i5, bVar.f3000c);
                mo3750l(b, i3);
                mo3745a(b);
                if (bVar.f2998a == 4) {
                    i3 += i5;
                }
                y = y2;
                i5 = 1;
            }
        }
        Object obj = bVar.f3000c;
        mo3745a(bVar);
        if (i5 > 0) {
            C0451b b2 = mo3746b(bVar.f2998a, y, i5, obj);
            mo3750l(b2, i3);
            mo3745a(b2);
        }
    }

    /* renamed from: u */
    private void m3671u(C0451b bVar) {
        this.f2992c.add(bVar);
        int i = bVar.f2998a;
        if (i == 1) {
            this.f2993d.mo3402e(bVar.f2999b, bVar.f3001d);
        } else if (i == 2) {
            this.f2993d.mo3401d(bVar.f2999b, bVar.f3001d);
        } else if (i == 4) {
            this.f2993d.mo3405h(bVar.f2999b, bVar.f3001d, bVar.f3000c);
        } else if (i == 8) {
            this.f2993d.mo3398a(bVar.f2999b, bVar.f3001d);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown update op type for ");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: y */
    private int m3672y(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f2992c.size() - 1; size >= 0; size--) {
            C0451b bVar = (C0451b) this.f2992c.get(size);
            int i5 = bVar.f2998a;
            if (i5 == 8) {
                int i6 = bVar.f2999b;
                int i7 = bVar.f3001d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f2999b = i6 + 1;
                            bVar.f3001d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f2999b = i6 - 1;
                            bVar.f3001d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.f3001d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f3001d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f2999b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f2999b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f2999b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.f3001d;
                    } else if (i5 == 2) {
                        i += bVar.f3001d;
                    }
                } else if (i2 == 1) {
                    bVar.f2999b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f2999b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f2992c.size() - 1; size2 >= 0; size2--) {
            C0451b bVar2 = (C0451b) this.f2992c.get(size2);
            if (bVar2.f2998a == 8) {
                int i9 = bVar2.f3001d;
                if (i9 == bVar2.f2999b || i9 < 0) {
                    this.f2992c.remove(size2);
                    mo3745a(bVar2);
                }
            } else if (bVar2.f3001d <= 0) {
                this.f2992c.remove(size2);
                mo3745a(bVar2);
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo3745a(C0451b bVar) {
        if (!this.f2995f) {
            bVar.f3000c = null;
            this.f2990a.mo4945a(bVar);
        }
    }

    /* renamed from: b */
    public C0451b mo3746b(int i, int i2, int i3, Object obj) {
        C0451b bVar = (C0451b) this.f2990a.mo4946b();
        if (bVar == null) {
            return new C0451b(i, i2, i3, obj);
        }
        bVar.f2998a = i;
        bVar.f2999b = i2;
        bVar.f3001d = i3;
        bVar.f3000c = obj;
        return bVar;
    }

    /* renamed from: e */
    public int mo3747e(int i) {
        int size = this.f2991b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0451b bVar = (C0451b) this.f2991b.get(i2);
            int i3 = bVar.f2998a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f2999b;
                    if (i4 <= i) {
                        int i5 = bVar.f3001d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f2999b;
                    if (i6 == i) {
                        i = bVar.f3001d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f3001d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f2999b <= i) {
                i += bVar.f3001d;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo3748i() {
        int size = this.f2992c.size();
        for (int i = 0; i < size; i++) {
            this.f2993d.mo3399b((C0451b) this.f2992c.get(i));
        }
        mo3760w(this.f2992c);
        this.f2997h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo3749j() {
        mo3748i();
        int size = this.f2991b.size();
        for (int i = 0; i < size; i++) {
            C0451b bVar = (C0451b) this.f2991b.get(i);
            int i2 = bVar.f2998a;
            if (i2 == 1) {
                this.f2993d.mo3399b(bVar);
                this.f2993d.mo3402e(bVar.f2999b, bVar.f3001d);
            } else if (i2 == 2) {
                this.f2993d.mo3399b(bVar);
                this.f2993d.mo3403f(bVar.f2999b, bVar.f3001d);
            } else if (i2 == 4) {
                this.f2993d.mo3399b(bVar);
                this.f2993d.mo3405h(bVar.f2999b, bVar.f3001d, bVar.f3000c);
            } else if (i2 == 8) {
                this.f2993d.mo3399b(bVar);
                this.f2993d.mo3398a(bVar.f2999b, bVar.f3001d);
            }
            Runnable runnable = this.f2994e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo3760w(this.f2991b);
        this.f2997h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo3750l(C0451b bVar, int i) {
        this.f2993d.mo3404g(bVar);
        int i2 = bVar.f2998a;
        if (i2 == 2) {
            this.f2993d.mo3403f(i, bVar.f3001d);
        } else if (i2 == 4) {
            this.f2993d.mo3405h(i, bVar.f3001d, bVar.f3000c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public int mo3751m(int i) {
        return mo3752n(i, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public int mo3752n(int i, int i2) {
        int size = this.f2992c.size();
        while (i2 < size) {
            C0451b bVar = (C0451b) this.f2992c.get(i2);
            int i3 = bVar.f2998a;
            if (i3 == 8) {
                int i4 = bVar.f2999b;
                if (i4 == i) {
                    i = bVar.f3001d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f3001d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f2999b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f3001d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f3001d;
                }
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo3753o(int i) {
        return (i & this.f2997h) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo3754p() {
        return this.f2991b.size() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo3755q() {
        return !this.f2992c.isEmpty() && !this.f2991b.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public boolean mo3756r(int i, int i2, Object obj) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f2991b.add(mo3746b(4, i, i2, obj));
        this.f2997h |= 4;
        if (this.f2991b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo3757s(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f2991b.add(mo3746b(1, i, i2, null));
        this.f2997h |= 1;
        if (this.f2991b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public boolean mo3758t(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f2991b.add(mo3746b(2, i, i2, null));
        this.f2997h |= 2;
        if (this.f2991b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo3759v() {
        this.f2996g.mo3855b(this.f2991b);
        int size = this.f2991b.size();
        for (int i = 0; i < size; i++) {
            C0451b bVar = (C0451b) this.f2991b.get(i);
            int i2 = bVar.f2998a;
            if (i2 == 1) {
                m3665c(bVar);
            } else if (i2 == 2) {
                m3667f(bVar);
            } else if (i2 == 4) {
                m3668g(bVar);
            } else if (i2 == 8) {
                m3666d(bVar);
            }
            Runnable runnable = this.f2994e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2991b.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo3760w(List<C0451b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo3745a((C0451b) list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo3761x() {
        mo3760w(this.f2991b);
        mo3760w(this.f2992c);
        this.f2997h = 0;
    }

    AdapterHelper(C0450a aVar, boolean z) {
        this.f2990a = new C0611f(30);
        this.f2991b = new ArrayList<>();
        this.f2992c = new ArrayList<>();
        this.f2997h = 0;
        this.f2993d = aVar;
        this.f2995f = z;
        this.f2996g = new OpReorderer(this);
    }
}
