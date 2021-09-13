package p010b.p026e.p030b.p031k.p032m;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p010b.p026e.p030b.LinearSystem;
import p010b.p026e.p030b.p031k.Chain;
import p010b.p026e.p030b.p031k.ConstraintWidget;
import p010b.p026e.p030b.p031k.ConstraintWidgetContainer;

/* renamed from: b.e.b.k.m.o */
public class WidgetGroup {

    /* renamed from: a */
    static int f4326a;

    /* renamed from: b */
    ArrayList<ConstraintWidget> f4327b = new ArrayList<>();

    /* renamed from: c */
    int f4328c = -1;

    /* renamed from: d */
    boolean f4329d = false;

    /* renamed from: e */
    int f4330e = 0;

    /* renamed from: f */
    ArrayList<C0569a> f4331f = null;

    /* renamed from: g */
    private int f4332g = -1;

    /* renamed from: b.e.b.k.m.o$a */
    /* compiled from: WidgetGroup */
    class C0569a {

        /* renamed from: a */
        WeakReference<ConstraintWidget> f4333a;

        /* renamed from: b */
        int f4334b;

        /* renamed from: c */
        int f4335c;

        /* renamed from: d */
        int f4336d;

        /* renamed from: e */
        int f4337e;

        /* renamed from: f */
        int f4338f;

        /* renamed from: g */
        int f4339g;

        public C0569a(ConstraintWidget eVar, LinearSystem dVar, int i) {
            this.f4333a = new WeakReference<>(eVar);
            this.f4334b = dVar.mo4599x(eVar.f4133I);
            this.f4335c = dVar.mo4599x(eVar.f4134J);
            this.f4336d = dVar.mo4599x(eVar.f4135K);
            this.f4337e = dVar.mo4599x(eVar.f4136L);
            this.f4338f = dVar.mo4599x(eVar.f4137M);
            this.f4339g = i;
        }
    }

    public WidgetGroup(int i) {
        int i2 = f4326a;
        f4326a = i2 + 1;
        this.f4328c = i2;
        this.f4330e = i;
    }

    /* renamed from: e */
    private String m4941e() {
        int i = this.f4330e;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        return i == 2 ? "Both" : "Unknown";
    }

    /* renamed from: j */
    private int m4942j(LinearSystem dVar, ArrayList<ConstraintWidget> arrayList, int i) {
        int x;
        int x2;
        ConstraintWidgetContainer fVar = (ConstraintWidgetContainer) ((ConstraintWidget) arrayList.get(0)).mo4673I();
        dVar.mo4581D();
        fVar.mo4628g(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ConstraintWidget) arrayList.get(i2)).mo4628g(dVar, false);
        }
        if (i == 0 && fVar.f4219O0 > 0) {
            Chain.m4670b(fVar, dVar, arrayList, 0);
        }
        if (i == 1 && fVar.f4220P0 > 0) {
            Chain.m4670b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.mo4600z();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f4331f = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f4331f.add(new C0569a((ConstraintWidget) arrayList.get(i3), dVar, i));
        }
        if (i == 0) {
            x = dVar.mo4599x(fVar.f4133I);
            x2 = dVar.mo4599x(fVar.f4135K);
            dVar.mo4581D();
        } else {
            x = dVar.mo4599x(fVar.f4134J);
            x2 = dVar.mo4599x(fVar.f4136L);
            dVar.mo4581D();
        }
        return x2 - x;
    }

    /* renamed from: a */
    public boolean mo4825a(ConstraintWidget eVar) {
        if (this.f4327b.contains(eVar)) {
            return false;
        }
        this.f4327b.add(eVar);
        return true;
    }

    /* renamed from: b */
    public void mo4826b(ArrayList<WidgetGroup> arrayList) {
        int size = this.f4327b.size();
        if (this.f4332g != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                WidgetGroup oVar = (WidgetGroup) arrayList.get(i);
                if (this.f4332g == oVar.f4328c) {
                    mo4830g(this.f4330e, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int mo4827c() {
        return this.f4328c;
    }

    /* renamed from: d */
    public int mo4828d() {
        return this.f4330e;
    }

    /* renamed from: f */
    public int mo4829f(LinearSystem dVar, int i) {
        if (this.f4327b.size() == 0) {
            return 0;
        }
        return m4942j(dVar, this.f4327b, i);
    }

    /* renamed from: g */
    public void mo4830g(int i, WidgetGroup oVar) {
        Iterator it = this.f4327b.iterator();
        while (it.hasNext()) {
            ConstraintWidget eVar = (ConstraintWidget) it.next();
            oVar.mo4825a(eVar);
            if (i == 0) {
                eVar.f4125B0 = oVar.mo4827c();
            } else {
                eVar.f4127C0 = oVar.mo4827c();
            }
        }
        this.f4332g = oVar.f4328c;
    }

    /* renamed from: h */
    public void mo4831h(boolean z) {
        this.f4329d = z;
    }

    /* renamed from: i */
    public void mo4832i(int i) {
        this.f4330e = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m4941e());
        sb.append(" [");
        sb.append(this.f4328c);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f4327b.iterator();
        while (it.hasNext()) {
            ConstraintWidget eVar = (ConstraintWidget) it.next();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(" ");
            sb3.append(eVar.mo4733r());
            sb2 = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb2);
        sb4.append(" >");
        return sb4.toString();
    }
}
