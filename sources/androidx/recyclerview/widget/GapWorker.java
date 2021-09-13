package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView.C0407d0;
import androidx.recyclerview.widget.RecyclerView.C0421o;
import androidx.recyclerview.widget.RecyclerView.C0421o.C0424c;
import androidx.recyclerview.widget.RecyclerView.C0433v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p010b.p034g.p039g.TraceCompat;

/* renamed from: androidx.recyclerview.widget.f */
final class GapWorker implements Runnable {

    /* renamed from: a */
    static final ThreadLocal<GapWorker> f3098a = new ThreadLocal<>();

    /* renamed from: b */
    static Comparator<C0470c> f3099b = new C0468a();

    /* renamed from: c */
    ArrayList<RecyclerView> f3100c = new ArrayList<>();

    /* renamed from: d */
    long f3101d;

    /* renamed from: e */
    long f3102e;

    /* renamed from: f */
    private ArrayList<C0470c> f3103f = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.f$a */
    /* compiled from: GapWorker */
    static class C0468a implements Comparator<C0470c> {
        C0468a() {
        }

        /* renamed from: a */
        public int compare(C0470c cVar, C0470c cVar2) {
            RecyclerView recyclerView = cVar.f3111d;
            int i = 1;
            if ((recyclerView == null) != (cVar2.f3111d == null)) {
                if (recyclerView != null) {
                    i = -1;
                }
                return i;
            }
            boolean z = cVar.f3108a;
            if (z != cVar2.f3108a) {
                if (z) {
                    i = -1;
                }
                return i;
            }
            int i2 = cVar2.f3109b - cVar.f3109b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = cVar.f3110c - cVar2.f3110c;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.f$b */
    /* compiled from: GapWorker */
    static class C0469b implements C0424c {

        /* renamed from: a */
        int f3104a;

        /* renamed from: b */
        int f3105b;

        /* renamed from: c */
        int[] f3106c;

        /* renamed from: d */
        int f3107d;

        C0469b() {
        }

        /* renamed from: a */
        public void mo3572a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f3107d * 2;
                int[] iArr = this.f3106c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f3106c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f3106c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f3106c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f3107d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3838b() {
            int[] iArr = this.f3106c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3107d = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3839c(RecyclerView recyclerView, boolean z) {
            this.f3107d = 0;
            int[] iArr = this.f3106c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            C0421o oVar = recyclerView.f2803v;
            if (recyclerView.f2801u != null && oVar != null && oVar.mo3557u0()) {
                if (z) {
                    if (!recyclerView.f2785m.mo3754p()) {
                        oVar.mo3129p(recyclerView.f2801u.mo3409c(), this);
                    }
                } else if (!recyclerView.mo3262o0()) {
                    oVar.mo3128o(this.f3104a, this.f3105b, recyclerView.f2798s0, this);
                }
                int i = this.f3107d;
                if (i > oVar.f2886m) {
                    oVar.f2886m = i;
                    oVar.f2887n = z;
                    recyclerView.f2781k.mo3605K();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo3840d(int i) {
            if (this.f3106c != null) {
                int i2 = this.f3107d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f3106c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo3841e(int i, int i2) {
            this.f3104a = i;
            this.f3105b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$c */
    /* compiled from: GapWorker */
    static class C0470c {

        /* renamed from: a */
        public boolean f3108a;

        /* renamed from: b */
        public int f3109b;

        /* renamed from: c */
        public int f3110c;

        /* renamed from: d */
        public RecyclerView f3111d;

        /* renamed from: e */
        public int f3112e;

        C0470c() {
        }

        /* renamed from: a */
        public void mo3842a() {
            this.f3108a = false;
            this.f3109b = 0;
            this.f3110c = 0;
            this.f3111d = null;
            this.f3112e = 0;
        }
    }

    GapWorker() {
    }

    /* renamed from: b */
    private void m3788b() {
        C0470c cVar;
        int size = this.f3100c.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f3100c.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f2796r0.mo3839c(recyclerView, false);
                i += recyclerView.f2796r0.f3107d;
            }
        }
        this.f3103f.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f3100c.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0469b bVar = recyclerView2.f2796r0;
                int abs = Math.abs(bVar.f3104a) + Math.abs(bVar.f3105b);
                for (int i5 = 0; i5 < bVar.f3107d * 2; i5 += 2) {
                    if (i3 >= this.f3103f.size()) {
                        cVar = new C0470c();
                        this.f3103f.add(cVar);
                    } else {
                        cVar = (C0470c) this.f3103f.get(i3);
                    }
                    int[] iArr = bVar.f3106c;
                    int i6 = iArr[i5 + 1];
                    cVar.f3108a = i6 <= abs;
                    cVar.f3109b = abs;
                    cVar.f3110c = i6;
                    cVar.f3111d = recyclerView2;
                    cVar.f3112e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f3103f, f3099b);
    }

    /* renamed from: c */
    private void m3789c(C0470c cVar, long j) {
        C0407d0 i = m3793i(cVar.f3111d, cVar.f3112e, cVar.f3108a ? Long.MAX_VALUE : j);
        if (i != null && i.f2842c != null && i.mo3378s() && !i.mo3379t()) {
            m3792h((RecyclerView) i.f2842c.get(), j);
        }
    }

    /* renamed from: d */
    private void m3790d(long j) {
        int i = 0;
        while (i < this.f3103f.size()) {
            C0470c cVar = (C0470c) this.f3103f.get(i);
            if (cVar.f3111d != null) {
                m3789c(cVar, j);
                cVar.mo3842a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m3791e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f2787n.mo3774j();
        for (int i2 = 0; i2 < j; i2++) {
            C0407d0 h0 = RecyclerView.m3012h0(recyclerView.f2787n.mo3773i(i2));
            if (h0.f2843d == i && !h0.mo3379t()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m3792h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f2761O && recyclerView.f2787n.mo3774j() != 0) {
                recyclerView.mo3189W0();
            }
            C0469b bVar = recyclerView.f2796r0;
            bVar.mo3839c(recyclerView, true);
            if (bVar.f3107d != 0) {
                try {
                    TraceCompat.m5076a("RV Nested Prefetch");
                    recyclerView.f2798s0.mo3335f(recyclerView.f2801u);
                    for (int i = 0; i < bVar.f3107d * 2; i += 2) {
                        m3793i(recyclerView, bVar.f3106c[i], j);
                    }
                } finally {
                    TraceCompat.m5077b();
                }
            }
        }
    }

    /* renamed from: i */
    private C0407d0 m3793i(RecyclerView recyclerView, int i, long j) {
        if (m3791e(recyclerView, i)) {
            return null;
        }
        C0433v vVar = recyclerView.f2781k;
        try {
            recyclerView.mo3171I0();
            C0407d0 I = vVar.mo3603I(i, false, j);
            if (I != null) {
                if (!I.mo3378s() || I.mo3379t()) {
                    vVar.mo3608a(I, false);
                } else {
                    vVar.mo3597B(I.f2841b);
                }
            }
            return I;
        } finally {
            recyclerView.mo3175K0(false);
        }
    }

    /* renamed from: a */
    public void mo3831a(RecyclerView recyclerView) {
        this.f3100c.add(recyclerView);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo3832f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3101d == 0) {
            this.f3101d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f2796r0.mo3841e(i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo3833g(long j) {
        m3788b();
        m3790d(j);
    }

    /* renamed from: j */
    public void mo3834j(RecyclerView recyclerView) {
        this.f3100c.remove(recyclerView);
    }

    public void run() {
        try {
            TraceCompat.m5076a("RV Prefetch");
            if (!this.f3100c.isEmpty()) {
                int size = this.f3100c.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f3100c.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo3833g(TimeUnit.MILLISECONDS.toNanos(j) + this.f3102e);
                    this.f3101d = 0;
                    TraceCompat.m5077b();
                }
            }
        } finally {
            this.f3101d = 0;
            TraceCompat.m5077b();
        }
    }
}
