package com.tv91.p252x;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.tv91.x.h */
public final class Navigator {

    /* renamed from: a */
    private final Deque<FragmentKey> f16077a = new LinkedList();

    /* renamed from: b */
    private final FragmentActivity f16078b;

    /* renamed from: c */
    private final FragmentManager f16079c;

    /* renamed from: d */
    private final int f16080d;

    /* renamed from: com.tv91.x.h$a */
    /* compiled from: Navigator */
    static /* synthetic */ class C3055a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16081a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tv91.x.h$b[] r0 = com.tv91.p252x.Navigator.C3056b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16081a = r0
                com.tv91.x.h$b r1 = com.tv91.p252x.Navigator.C3056b.FORWARD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16081a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tv91.x.h$b r1 = com.tv91.p252x.Navigator.C3056b.BACKWARD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16081a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tv91.x.h$b r1 = com.tv91.p252x.Navigator.C3056b.REPLACE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tv91.p252x.Navigator.C3055a.<clinit>():void");
        }
    }

    /* renamed from: com.tv91.x.h$b */
    /* compiled from: Navigator */
    private enum C3056b {
        FORWARD,
        BACKWARD,
        REPLACE
    }

    public Navigator(FragmentActivity eVar, int i) {
        this.f16078b = eVar;
        this.f16079c = eVar.mo2656t();
        this.f16080d = i;
    }

    /* renamed from: b */
    public static Navigator m20631b(Fragment fragment) {
        Objects.requireNonNull(fragment);
        FragmentActivity M1 = fragment.mo2379M1();
        return NavigatorProvider.m20640c(M1).mo18591a(M1);
    }

    /* renamed from: f */
    public static Navigator m20632f(FragmentActivity eVar, int i, FragmentKey... cVarArr) {
        Objects.requireNonNull(eVar, "activity can't be null.");
        Navigator b = NavigatorProvider.m20640c(eVar).mo18592b(eVar, i);
        if (cVarArr.length > 0) {
            b.mo18590i(Arrays.asList(cVarArr));
        }
        return b;
    }

    /* renamed from: g */
    private void m20633g(C3056b bVar, FragmentKey cVar, FragmentKey cVar2) {
        FragmentTransaction m = this.f16079c.mo2808m().mo2941m();
        if (cVar != null) {
            int i = C3055a.f16081a[bVar.ordinal()];
            if (i == 1) {
                cVar.mo16546p(m, false);
            } else if (i == 2) {
                cVar.mo16545o(m, false);
            } else if (i == 3) {
                cVar.mo18582q(m, false);
            }
            Fragment i0 = this.f16079c.mo2799i0(cVar.mo18581m());
            if (i0 != null) {
                if (!this.f16077a.contains(cVar)) {
                    m.mo2522o(i0);
                } else if (!i0.mo2467s0()) {
                    m.mo2520l(i0);
                }
            }
        }
        Fragment i02 = this.f16079c.mo2799i0(cVar2.mo18581m());
        int i2 = C3055a.f16081a[bVar.ordinal()];
        if (i2 == 1) {
            cVar2.mo16546p(m, true);
        } else if (i2 == 2) {
            cVar2.mo16545o(m, true);
        } else if (i2 == 3) {
            cVar2.mo18582q(m, true);
        }
        if (i02 == null) {
            m.mo2936c(this.f16080d, cVar2.mo18580l(), cVar2.mo18581m());
        } else if (i02.mo2483y0()) {
            m.mo2943q(this.f16080d, cVar2.mo18580l(), cVar2.mo18581m());
        } else if (i02.mo2467s0()) {
            m.mo2940g(i02);
        }
        m.mo2517i();
    }

    /* renamed from: a */
    public void mo18585a() {
        NavigatorProvider.m20640c(this.f16078b).mo18593d(this.f16078b);
        this.f16077a.clear();
        this.f16078b.finish();
    }

    /* renamed from: c */
    public List<FragmentKey> mo18586c() {
        return new LinkedList(this.f16077a);
    }

    /* renamed from: d */
    public boolean mo18587d() {
        if (this.f16077a.isEmpty() || this.f16077a.size() == 1) {
            return false;
        }
        m20633g(C3056b.BACKWARD, (FragmentKey) this.f16077a.pop(), (FragmentKey) this.f16077a.peek());
        return true;
    }

    /* renamed from: e */
    public void mo18588e(NavKey gVar) {
        if (gVar instanceof ActivityKey) {
            ActivityKey aVar = (ActivityKey) gVar;
            FragmentActivity eVar = this.f16078b;
            eVar.startActivity(aVar.mo18572l(eVar), aVar.mo18573m(this.f16078b));
        } else if (gVar instanceof FragmentKey) {
            FragmentKey cVar = (FragmentKey) gVar;
            m20633g(C3056b.FORWARD, (FragmentKey) this.f16077a.peek(), cVar);
            this.f16077a.push(cVar);
        }
    }

    /* renamed from: h */
    public void mo18589h(NavKey gVar) {
        if (gVar instanceof FragmentKey) {
            FragmentKey cVar = (FragmentKey) gVar;
            m20633g(C3056b.REPLACE, (FragmentKey) this.f16077a.pop(), cVar);
            this.f16077a.push(cVar);
            return;
        }
        throw new IllegalArgumentException("only FragmentKey can perform replace top action");
    }

    /* renamed from: i */
    public void mo18590i(List<FragmentKey> list) {
        this.f16077a.clear();
        for (FragmentKey push : list) {
            this.f16077a.push(push);
        }
        if (!this.f16077a.isEmpty()) {
            m20633g(C3056b.REPLACE, null, (FragmentKey) this.f16077a.peek());
        }
    }
}
