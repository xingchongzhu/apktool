package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.C0407d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.recyclerview.widget.c */
public class DefaultItemAnimator extends SimpleItemAnimator {

    /* renamed from: h */
    private static TimeInterpolator f3007h;

    /* renamed from: i */
    private ArrayList<C0407d0> f3008i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0407d0> f3009j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0463j> f3010k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<C0462i> f3011l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C0407d0>> f3012m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C0463j>> f3013n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<ArrayList<C0462i>> f3014o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<C0407d0> f3015p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<C0407d0> f3016q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<C0407d0> f3017r = new ArrayList<>();

    /* renamed from: s */
    ArrayList<C0407d0> f3018s = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* compiled from: DefaultItemAnimator */
    class C0454a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3019a;

        C0454a(ArrayList arrayList) {
            this.f3019a = arrayList;
        }

        public void run() {
            Iterator it = this.f3019a.iterator();
            while (it.hasNext()) {
                C0463j jVar = (C0463j) it.next();
                DefaultItemAnimator.this.mo3794S(jVar.f3053a, jVar.f3054b, jVar.f3055c, jVar.f3056d, jVar.f3057e);
            }
            this.f3019a.clear();
            DefaultItemAnimator.this.f3013n.remove(this.f3019a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    /* compiled from: DefaultItemAnimator */
    class C0455b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3021a;

        C0455b(ArrayList arrayList) {
            this.f3021a = arrayList;
        }

        public void run() {
            Iterator it = this.f3021a.iterator();
            while (it.hasNext()) {
                DefaultItemAnimator.this.mo3793R((C0462i) it.next());
            }
            this.f3021a.clear();
            DefaultItemAnimator.this.f3014o.remove(this.f3021a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    /* compiled from: DefaultItemAnimator */
    class C0456c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f3023a;

        C0456c(ArrayList arrayList) {
            this.f3023a = arrayList;
        }

        public void run() {
            Iterator it = this.f3023a.iterator();
            while (it.hasNext()) {
                DefaultItemAnimator.this.mo3792Q((C0407d0) it.next());
            }
            this.f3023a.clear();
            DefaultItemAnimator.this.f3012m.remove(this.f3023a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$d */
    /* compiled from: DefaultItemAnimator */
    class C0457d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0407d0 f3025a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3026b;

        /* renamed from: c */
        final /* synthetic */ View f3027c;

        C0457d(C0407d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3025a = d0Var;
            this.f3026b = viewPropertyAnimator;
            this.f3027c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3026b.setListener(null);
            this.f3027c.setAlpha(1.0f);
            DefaultItemAnimator.this.mo3894G(this.f3025a);
            DefaultItemAnimator.this.f3017r.remove(this.f3025a);
            DefaultItemAnimator.this.mo3796V();
        }

        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.mo3895H(this.f3025a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$e */
    /* compiled from: DefaultItemAnimator */
    class C0458e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0407d0 f3029a;

        /* renamed from: b */
        final /* synthetic */ View f3030b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f3031c;

        C0458e(C0407d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3029a = d0Var;
            this.f3030b = view;
            this.f3031c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3030b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3031c.setListener(null);
            DefaultItemAnimator.this.mo3888A(this.f3029a);
            DefaultItemAnimator.this.f3015p.remove(this.f3029a);
            DefaultItemAnimator.this.mo3796V();
        }

        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.mo3889B(this.f3029a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$f */
    /* compiled from: DefaultItemAnimator */
    class C0459f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0407d0 f3033a;

        /* renamed from: b */
        final /* synthetic */ int f3034b;

        /* renamed from: c */
        final /* synthetic */ View f3035c;

        /* renamed from: d */
        final /* synthetic */ int f3036d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f3037e;

        C0459f(C0407d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3033a = d0Var;
            this.f3034b = i;
            this.f3035c = view;
            this.f3036d = i2;
            this.f3037e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f3034b != 0) {
                this.f3035c.setTranslationX(0.0f);
            }
            if (this.f3036d != 0) {
                this.f3035c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f3037e.setListener(null);
            DefaultItemAnimator.this.mo3892E(this.f3033a);
            DefaultItemAnimator.this.f3016q.remove(this.f3033a);
            DefaultItemAnimator.this.mo3796V();
        }

        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.mo3893F(this.f3033a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$g */
    /* compiled from: DefaultItemAnimator */
    class C0460g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0462i f3039a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3040b;

        /* renamed from: c */
        final /* synthetic */ View f3041c;

        C0460g(C0462i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3039a = iVar;
            this.f3040b = viewPropertyAnimator;
            this.f3041c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3040b.setListener(null);
            this.f3041c.setAlpha(1.0f);
            this.f3041c.setTranslationX(0.0f);
            this.f3041c.setTranslationY(0.0f);
            DefaultItemAnimator.this.mo3890C(this.f3039a.f3047a, true);
            DefaultItemAnimator.this.f3018s.remove(this.f3039a.f3047a);
            DefaultItemAnimator.this.mo3796V();
        }

        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.mo3891D(this.f3039a.f3047a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$h */
    /* compiled from: DefaultItemAnimator */
    class C0461h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0462i f3043a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3044b;

        /* renamed from: c */
        final /* synthetic */ View f3045c;

        C0461h(C0462i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3043a = iVar;
            this.f3044b = viewPropertyAnimator;
            this.f3045c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3044b.setListener(null);
            this.f3045c.setAlpha(1.0f);
            this.f3045c.setTranslationX(0.0f);
            this.f3045c.setTranslationY(0.0f);
            DefaultItemAnimator.this.mo3890C(this.f3043a.f3048b, false);
            DefaultItemAnimator.this.f3018s.remove(this.f3043a.f3048b);
            DefaultItemAnimator.this.mo3796V();
        }

        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.mo3891D(this.f3043a.f3048b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$i */
    /* compiled from: DefaultItemAnimator */
    private static class C0462i {

        /* renamed from: a */
        public C0407d0 f3047a;

        /* renamed from: b */
        public C0407d0 f3048b;

        /* renamed from: c */
        public int f3049c;

        /* renamed from: d */
        public int f3050d;

        /* renamed from: e */
        public int f3051e;

        /* renamed from: f */
        public int f3052f;

        private C0462i(C0407d0 d0Var, C0407d0 d0Var2) {
            this.f3047a = d0Var;
            this.f3048b = d0Var2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangeInfo{oldHolder=");
            sb.append(this.f3047a);
            sb.append(", newHolder=");
            sb.append(this.f3048b);
            sb.append(", fromX=");
            sb.append(this.f3049c);
            sb.append(", fromY=");
            sb.append(this.f3050d);
            sb.append(", toX=");
            sb.append(this.f3051e);
            sb.append(", toY=");
            sb.append(this.f3052f);
            sb.append('}');
            return sb.toString();
        }

        C0462i(C0407d0 d0Var, C0407d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f3049c = i;
            this.f3050d = i2;
            this.f3051e = i3;
            this.f3052f = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$j */
    /* compiled from: DefaultItemAnimator */
    private static class C0463j {

        /* renamed from: a */
        public C0407d0 f3053a;

        /* renamed from: b */
        public int f3054b;

        /* renamed from: c */
        public int f3055c;

        /* renamed from: d */
        public int f3056d;

        /* renamed from: e */
        public int f3057e;

        C0463j(C0407d0 d0Var, int i, int i2, int i3, int i4) {
            this.f3053a = d0Var;
            this.f3054b = i;
            this.f3055c = i2;
            this.f3056d = i3;
            this.f3057e = i4;
        }
    }

    /* renamed from: T */
    private void m3738T(C0407d0 d0Var) {
        View view = d0Var.f2841b;
        ViewPropertyAnimator animate = view.animate();
        this.f3017r.add(d0Var);
        animate.setDuration(mo3456o()).alpha(0.0f).setListener(new C0457d(d0Var, animate, view)).start();
    }

    /* renamed from: W */
    private void m3739W(List<C0462i> list, C0407d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0462i iVar = (C0462i) list.get(size);
            if (m3741Y(iVar, d0Var) && iVar.f3047a == null && iVar.f3048b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: X */
    private void m3740X(C0462i iVar) {
        C0407d0 d0Var = iVar.f3047a;
        if (d0Var != null) {
            m3741Y(iVar, d0Var);
        }
        C0407d0 d0Var2 = iVar.f3048b;
        if (d0Var2 != null) {
            m3741Y(iVar, d0Var2);
        }
    }

    /* renamed from: Y */
    private boolean m3741Y(C0462i iVar, C0407d0 d0Var) {
        boolean z = false;
        if (iVar.f3048b == d0Var) {
            iVar.f3048b = null;
        } else if (iVar.f3047a != d0Var) {
            return false;
        } else {
            iVar.f3047a = null;
            z = true;
        }
        d0Var.f2841b.setAlpha(1.0f);
        d0Var.f2841b.setTranslationX(0.0f);
        d0Var.f2841b.setTranslationY(0.0f);
        mo3890C(d0Var, z);
        return true;
    }

    /* renamed from: Z */
    private void m3742Z(C0407d0 d0Var) {
        if (f3007h == null) {
            f3007h = new ValueAnimator().getInterpolator();
        }
        d0Var.f2841b.animate().setInterpolator(f3007h);
        mo3451j(d0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public void mo3792Q(C0407d0 d0Var) {
        View view = d0Var.f2841b;
        ViewPropertyAnimator animate = view.animate();
        this.f3015p.add(d0Var);
        animate.alpha(1.0f).setDuration(mo3453l()).setListener(new C0458e(d0Var, view, animate)).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R */
    public void mo3793R(C0462i iVar) {
        View view;
        C0407d0 d0Var = iVar.f3047a;
        View view2 = null;
        if (d0Var == null) {
            view = null;
        } else {
            view = d0Var.f2841b;
        }
        C0407d0 d0Var2 = iVar.f3048b;
        if (d0Var2 != null) {
            view2 = d0Var2.f2841b;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(mo3454m());
            this.f3018s.add(iVar.f3047a);
            duration.translationX((float) (iVar.f3051e - iVar.f3049c));
            duration.translationY((float) (iVar.f3052f - iVar.f3050d));
            duration.alpha(0.0f).setListener(new C0460g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f3018s.add(iVar.f3048b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo3454m()).alpha(1.0f).setListener(new C0461h(iVar, animate, view2)).start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: S */
    public void mo3794S(C0407d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f2841b;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3016q.add(d0Var);
        ViewPropertyAnimator duration = animate.setDuration(mo3455n());
        C0459f fVar = new C0459f(d0Var, i5, view, i6, animate);
        duration.setListener(fVar).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U */
    public void mo3795U(List<C0407d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C0407d0) list.get(size)).f2841b.animate().cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public void mo3796V() {
        if (!mo3457p()) {
            mo3450i();
        }
    }

    /* renamed from: g */
    public boolean mo3448g(C0407d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.mo3448g(d0Var, list);
    }

    /* renamed from: j */
    public void mo3451j(C0407d0 d0Var) {
        View view = d0Var.f2841b;
        view.animate().cancel();
        int size = this.f3010k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C0463j) this.f3010k.get(size)).f3053a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo3892E(d0Var);
                this.f3010k.remove(size);
            }
        }
        m3739W(this.f3011l, d0Var);
        if (this.f3008i.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo3894G(d0Var);
        }
        if (this.f3009j.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo3888A(d0Var);
        }
        for (int size2 = this.f3014o.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f3014o.get(size2);
            m3739W(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f3014o.remove(size2);
            }
        }
        for (int size3 = this.f3013n.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f3013n.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0463j) arrayList2.get(size4)).f3053a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo3892E(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3013n.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3012m.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f3012m.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                mo3888A(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f3012m.remove(size5);
                }
            }
        }
        this.f3017r.remove(d0Var);
        this.f3015p.remove(d0Var);
        this.f3018s.remove(d0Var);
        this.f3016q.remove(d0Var);
        mo3796V();
    }

    /* renamed from: k */
    public void mo3452k() {
        int size = this.f3010k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0463j jVar = (C0463j) this.f3010k.get(size);
            View view = jVar.f3053a.f2841b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo3892E(jVar.f3053a);
            this.f3010k.remove(size);
        }
        for (int size2 = this.f3008i.size() - 1; size2 >= 0; size2--) {
            mo3894G((C0407d0) this.f3008i.get(size2));
            this.f3008i.remove(size2);
        }
        int size3 = this.f3009j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0407d0 d0Var = (C0407d0) this.f3009j.get(size3);
            d0Var.f2841b.setAlpha(1.0f);
            mo3888A(d0Var);
            this.f3009j.remove(size3);
        }
        for (int size4 = this.f3011l.size() - 1; size4 >= 0; size4--) {
            m3740X((C0462i) this.f3011l.get(size4));
        }
        this.f3011l.clear();
        if (mo3457p()) {
            for (int size5 = this.f3013n.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f3013n.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0463j jVar2 = (C0463j) arrayList.get(size6);
                    View view2 = jVar2.f3053a.f2841b;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo3892E(jVar2.f3053a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3013n.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3012m.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f3012m.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C0407d0 d0Var2 = (C0407d0) arrayList2.get(size8);
                    d0Var2.f2841b.setAlpha(1.0f);
                    mo3888A(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3012m.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3014o.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f3014o.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m3740X((C0462i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3014o.remove(arrayList3);
                    }
                }
            }
            mo3795U(this.f3017r);
            mo3795U(this.f3016q);
            mo3795U(this.f3015p);
            mo3795U(this.f3018s);
            mo3450i();
        }
    }

    /* renamed from: p */
    public boolean mo3457p() {
        return !this.f3009j.isEmpty() || !this.f3011l.isEmpty() || !this.f3010k.isEmpty() || !this.f3008i.isEmpty() || !this.f3016q.isEmpty() || !this.f3017r.isEmpty() || !this.f3015p.isEmpty() || !this.f3018s.isEmpty() || !this.f3013n.isEmpty() || !this.f3012m.isEmpty() || !this.f3014o.isEmpty();
    }

    /* renamed from: u */
    public void mo3462u() {
        boolean z = !this.f3008i.isEmpty();
        boolean z2 = !this.f3010k.isEmpty();
        boolean z3 = !this.f3011l.isEmpty();
        boolean z4 = !this.f3009j.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f3008i.iterator();
            while (it.hasNext()) {
                m3738T((C0407d0) it.next());
            }
            this.f3008i.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3010k);
                this.f3013n.add(arrayList);
                this.f3010k.clear();
                C0454a aVar = new C0454a(arrayList);
                if (z) {
                    ViewCompat.m5559h0(((C0463j) arrayList.get(0)).f3053a.f2841b, aVar, mo3456o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3011l);
                this.f3014o.add(arrayList2);
                this.f3011l.clear();
                C0455b bVar = new C0455b(arrayList2);
                if (z) {
                    ViewCompat.m5559h0(((C0462i) arrayList2.get(0)).f3047a.f2841b, bVar, mo3456o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3009j);
                this.f3012m.add(arrayList3);
                this.f3009j.clear();
                C0456c cVar = new C0456c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long o = z ? mo3456o() : 0;
                    long n = z2 ? mo3455n() : 0;
                    if (z3) {
                        j = mo3454m();
                    }
                    ViewCompat.m5559h0(((C0407d0) arrayList3.get(0)).f2841b, cVar, o + Math.max(n, j));
                } else {
                    cVar.run();
                }
            }
        }
    }

    /* renamed from: w */
    public boolean mo3797w(C0407d0 d0Var) {
        m3742Z(d0Var);
        d0Var.f2841b.setAlpha(0.0f);
        this.f3009j.add(d0Var);
        return true;
    }

    /* renamed from: x */
    public boolean mo3798x(C0407d0 d0Var, C0407d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return mo3799y(d0Var, i, i2, i3, i4);
        }
        float translationX = d0Var.f2841b.getTranslationX();
        float translationY = d0Var.f2841b.getTranslationY();
        float alpha = d0Var.f2841b.getAlpha();
        m3742Z(d0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        d0Var.f2841b.setTranslationX(translationX);
        d0Var.f2841b.setTranslationY(translationY);
        d0Var.f2841b.setAlpha(alpha);
        if (d0Var2 != null) {
            m3742Z(d0Var2);
            d0Var2.f2841b.setTranslationX((float) (-i5));
            d0Var2.f2841b.setTranslationY((float) (-i6));
            d0Var2.f2841b.setAlpha(0.0f);
        }
        ArrayList<C0462i> arrayList = this.f3011l;
        C0462i iVar = new C0462i(d0Var, d0Var2, i, i2, i3, i4);
        arrayList.add(iVar);
        return true;
    }

    /* renamed from: y */
    public boolean mo3799y(C0407d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f2841b;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.f2841b.getTranslationY());
        m3742Z(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo3892E(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        ArrayList<C0463j> arrayList = this.f3010k;
        C0463j jVar = new C0463j(d0Var, translationX, translationY, i3, i4);
        arrayList.add(jVar);
        return true;
    }

    /* renamed from: z */
    public boolean mo3800z(C0407d0 d0Var) {
        m3742Z(d0Var);
        this.f3008i.add(d0Var);
        return true;
    }
}
