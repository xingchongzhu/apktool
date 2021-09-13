package p067c.p068a.p069a.p070a.p111m2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: c.a.a.a.m2.e0 */
public class SlidingPercentile {

    /* renamed from: a */
    private static final Comparator<C1190b> f8351a = C1186c.f8345a;

    /* renamed from: b */
    private static final Comparator<C1190b> f8352b = C1187d.f8349a;

    /* renamed from: c */
    private final int f8353c;

    /* renamed from: d */
    private final ArrayList<C1190b> f8354d = new ArrayList<>();

    /* renamed from: e */
    private final C1190b[] f8355e = new C1190b[5];

    /* renamed from: f */
    private int f8356f = -1;

    /* renamed from: g */
    private int f8357g;

    /* renamed from: h */
    private int f8358h;

    /* renamed from: i */
    private int f8359i;

    /* renamed from: c.a.a.a.m2.e0$b */
    /* compiled from: SlidingPercentile */
    private static class C1190b {

        /* renamed from: a */
        public int f8360a;

        /* renamed from: b */
        public int f8361b;

        /* renamed from: c */
        public float f8362c;

        private C1190b() {
        }
    }

    public SlidingPercentile(int i) {
        this.f8353c = i;
    }

    /* renamed from: b */
    private void m10142b() {
        if (this.f8356f != 1) {
            Collections.sort(this.f8354d, f8351a);
            this.f8356f = 1;
        }
    }

    /* renamed from: c */
    private void m10143c() {
        if (this.f8356f != 0) {
            Collections.sort(this.f8354d, f8352b);
            this.f8356f = 0;
        }
    }

    /* renamed from: e */
    static /* synthetic */ int m10144e(C1190b bVar, C1190b bVar2) {
        return bVar.f8360a - bVar2.f8360a;
    }

    /* renamed from: a */
    public void mo7417a(int i, float f) {
        C1190b bVar;
        m10142b();
        int i2 = this.f8359i;
        if (i2 > 0) {
            C1190b[] bVarArr = this.f8355e;
            int i3 = i2 - 1;
            this.f8359i = i3;
            bVar = bVarArr[i3];
        } else {
            bVar = new C1190b();
        }
        int i4 = this.f8357g;
        this.f8357g = i4 + 1;
        bVar.f8360a = i4;
        bVar.f8361b = i;
        bVar.f8362c = f;
        this.f8354d.add(bVar);
        this.f8358h += i;
        while (true) {
            int i5 = this.f8358h;
            int i6 = this.f8353c;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C1190b bVar2 = (C1190b) this.f8354d.get(0);
                int i8 = bVar2.f8361b;
                if (i8 <= i7) {
                    this.f8358h -= i8;
                    this.f8354d.remove(0);
                    int i9 = this.f8359i;
                    if (i9 < 5) {
                        C1190b[] bVarArr2 = this.f8355e;
                        this.f8359i = i9 + 1;
                        bVarArr2[i9] = bVar2;
                    }
                } else {
                    bVar2.f8361b = i8 - i7;
                    this.f8358h -= i7;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public float mo7418d(float f) {
        float f2;
        m10143c();
        float f3 = f * ((float) this.f8358h);
        int i = 0;
        for (int i2 = 0; i2 < this.f8354d.size(); i2++) {
            C1190b bVar = (C1190b) this.f8354d.get(i2);
            i += bVar.f8361b;
            if (((float) i) >= f3) {
                return bVar.f8362c;
            }
        }
        if (this.f8354d.isEmpty()) {
            f2 = Float.NaN;
        } else {
            ArrayList<C1190b> arrayList = this.f8354d;
            f2 = ((C1190b) arrayList.get(arrayList.size() - 1)).f8362c;
        }
        return f2;
    }

    /* renamed from: g */
    public void mo7419g() {
        this.f8354d.clear();
        this.f8356f = -1;
        this.f8357g = 0;
        this.f8358h = 0;
    }
}
