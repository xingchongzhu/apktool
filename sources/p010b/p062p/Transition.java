package p010b.p062p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010b.p025d.ArrayMap;
import p010b.p025d.LongSparseArray;
import p010b.p025d.SimpleArrayMap;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: b.p.m */
public abstract class Transition implements Cloneable {

    /* renamed from: a */
    private static final int[] f5060a = {2, 1, 3, 4};

    /* renamed from: b */
    private static final PathMotion f5061b = new C0722a();

    /* renamed from: c */
    private static ThreadLocal<ArrayMap<Animator, C0725d>> f5062c = new ThreadLocal<>();

    /* renamed from: A */
    ArrayList<Animator> f5063A = new ArrayList<>();

    /* renamed from: B */
    private int f5064B = 0;

    /* renamed from: C */
    private boolean f5065C = false;

    /* renamed from: D */
    private boolean f5066D = false;

    /* renamed from: G */
    private ArrayList<C0727f> f5067G = null;

    /* renamed from: H */
    private ArrayList<Animator> f5068H = new ArrayList<>();

    /* renamed from: I */
    TransitionPropagation f5069I;

    /* renamed from: J */
    private C0726e f5070J;

    /* renamed from: K */
    private ArrayMap<String, String> f5071K;

    /* renamed from: L */
    private PathMotion f5072L = f5061b;

    /* renamed from: d */
    private String f5073d = getClass().getName();

    /* renamed from: e */
    private long f5074e = -1;

    /* renamed from: f */
    long f5075f = -1;

    /* renamed from: g */
    private TimeInterpolator f5076g = null;

    /* renamed from: h */
    ArrayList<Integer> f5077h = new ArrayList<>();

    /* renamed from: i */
    ArrayList<View> f5078i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<String> f5079j = null;

    /* renamed from: k */
    private ArrayList<Class<?>> f5080k = null;

    /* renamed from: l */
    private ArrayList<Integer> f5081l = null;

    /* renamed from: m */
    private ArrayList<View> f5082m = null;

    /* renamed from: n */
    private ArrayList<Class<?>> f5083n = null;

    /* renamed from: o */
    private ArrayList<String> f5084o = null;

    /* renamed from: p */
    private ArrayList<Integer> f5085p = null;

    /* renamed from: q */
    private ArrayList<View> f5086q = null;

    /* renamed from: r */
    private ArrayList<Class<?>> f5087r = null;

    /* renamed from: s */
    private TransitionValuesMaps f5088s = new TransitionValuesMaps();

    /* renamed from: t */
    private TransitionValuesMaps f5089t = new TransitionValuesMaps();

    /* renamed from: u */
    TransitionSet f5090u = null;

    /* renamed from: v */
    private int[] f5091v = f5060a;

    /* renamed from: w */
    private ArrayList<TransitionValues> f5092w;

    /* renamed from: x */
    private ArrayList<TransitionValues> f5093x;

    /* renamed from: y */
    private ViewGroup f5094y = null;

    /* renamed from: z */
    boolean f5095z = false;

    /* renamed from: b.p.m$a */
    /* compiled from: Transition */
    static class C0722a extends PathMotion {
        C0722a() {
        }

        /* renamed from: a */
        public Path mo5361a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: b.p.m$b */
    /* compiled from: Transition */
    class C0723b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ArrayMap f5096a;

        C0723b(ArrayMap aVar) {
            this.f5096a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5096a.remove(animator);
            Transition.this.f5063A.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            Transition.this.f5063A.add(animator);
        }
    }

    /* renamed from: b.p.m$c */
    /* compiled from: Transition */
    class C0724c extends AnimatorListenerAdapter {
        C0724c() {
        }

        public void onAnimationEnd(Animator animator) {
            Transition.this.mo5410o();
            animator.removeListener(this);
        }
    }

    /* renamed from: b.p.m$d */
    /* compiled from: Transition */
    private static class C0725d {

        /* renamed from: a */
        View f5099a;

        /* renamed from: b */
        String f5100b;

        /* renamed from: c */
        TransitionValues f5101c;

        /* renamed from: d */
        WindowIdImpl f5102d;

        /* renamed from: e */
        Transition f5103e;

        C0725d(View view, String str, Transition mVar, WindowIdImpl m0Var, TransitionValues sVar) {
            this.f5099a = view;
            this.f5100b = str;
            this.f5101c = sVar;
            this.f5102d = m0Var;
            this.f5103e = mVar;
        }
    }

    /* renamed from: b.p.m$e */
    /* compiled from: Transition */
    public static abstract class C0726e {
    }

    /* renamed from: b.p.m$f */
    /* compiled from: Transition */
    public interface C0727f {
        /* renamed from: a */
        void mo5357a(Transition mVar);

        /* renamed from: b */
        void mo5335b(Transition mVar);

        /* renamed from: c */
        void mo5336c(Transition mVar);

        /* renamed from: d */
        void mo5337d(Transition mVar);

        /* renamed from: e */
        void mo5338e(Transition mVar);
    }

    /* renamed from: G */
    private static boolean m6005G(TransitionValues sVar, TransitionValues sVar2, String str) {
        Object obj = sVar.f5122a.get(str);
        Object obj2 = sVar2.f5122a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: H */
    private void m6006H(ArrayMap<View, TransitionValues> aVar, ArrayMap<View, TransitionValues> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view = (View) sparseArray.valueAt(i);
            if (view != null && mo5385F(view)) {
                View view2 = (View) sparseArray2.get(sparseArray.keyAt(i));
                if (view2 != null && mo5385F(view2)) {
                    TransitionValues sVar = (TransitionValues) aVar.get(view);
                    TransitionValues sVar2 = (TransitionValues) aVar2.get(view2);
                    if (!(sVar == null || sVar2 == null)) {
                        this.f5092w.add(sVar);
                        this.f5093x.add(sVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: I */
    private void m6007I(ArrayMap<View, TransitionValues> aVar, ArrayMap<View, TransitionValues> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo4508i(size);
            if (view != null && mo5385F(view)) {
                TransitionValues sVar = (TransitionValues) aVar2.remove(view);
                if (sVar != null && mo5385F(sVar.f5123b)) {
                    this.f5092w.add((TransitionValues) aVar.mo4511k(size));
                    this.f5093x.add(sVar);
                }
            }
        }
    }

    /* renamed from: J */
    private void m6008J(ArrayMap<View, TransitionValues> aVar, ArrayMap<View, TransitionValues> aVar2, LongSparseArray<View> dVar, LongSparseArray<View> dVar2) {
        int l = dVar.mo4424l();
        for (int i = 0; i < l; i++) {
            View view = (View) dVar.mo4425m(i);
            if (view != null && mo5385F(view)) {
                View view2 = (View) dVar2.mo4417e(dVar.mo4420h(i));
                if (view2 != null && mo5385F(view2)) {
                    TransitionValues sVar = (TransitionValues) aVar.get(view);
                    TransitionValues sVar2 = (TransitionValues) aVar2.get(view2);
                    if (!(sVar == null || sVar2 == null)) {
                        this.f5092w.add(sVar);
                        this.f5093x.add(sVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: K */
    private void m6009K(ArrayMap<View, TransitionValues> aVar, ArrayMap<View, TransitionValues> aVar2, ArrayMap<String, View> aVar3, ArrayMap<String, View> aVar4) {
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) aVar3.mo4513m(i);
            if (view != null && mo5385F(view)) {
                View view2 = (View) aVar4.get(aVar3.mo4508i(i));
                if (view2 != null && mo5385F(view2)) {
                    TransitionValues sVar = (TransitionValues) aVar.get(view);
                    TransitionValues sVar2 = (TransitionValues) aVar2.get(view2);
                    if (!(sVar == null || sVar2 == null)) {
                        this.f5092w.add(sVar);
                        this.f5093x.add(sVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: L */
    private void m6010L(TransitionValuesMaps tVar, TransitionValuesMaps tVar2) {
        ArrayMap aVar = new ArrayMap((SimpleArrayMap) tVar.f5125a);
        ArrayMap aVar2 = new ArrayMap((SimpleArrayMap) tVar2.f5125a);
        int i = 0;
        while (true) {
            int[] iArr = this.f5091v;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m6007I(aVar, aVar2);
                } else if (i2 == 2) {
                    m6009K(aVar, aVar2, tVar.f5128d, tVar2.f5128d);
                } else if (i2 == 3) {
                    m6006H(aVar, aVar2, tVar.f5126b, tVar2.f5126b);
                } else if (i2 == 4) {
                    m6008J(aVar, aVar2, tVar.f5127c, tVar2.f5127c);
                }
                i++;
            } else {
                m6012c(aVar, aVar2);
                return;
            }
        }
    }

    /* renamed from: R */
    private void m6011R(Animator animator, ArrayMap<Animator, C0725d> aVar) {
        if (animator != null) {
            animator.addListener(new C0723b(aVar));
            mo5403e(animator);
        }
    }

    /* renamed from: c */
    private void m6012c(ArrayMap<View, TransitionValues> aVar, ArrayMap<View, TransitionValues> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            TransitionValues sVar = (TransitionValues) aVar.mo4513m(i);
            if (mo5385F(sVar.f5123b)) {
                this.f5092w.add(sVar);
                this.f5093x.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            TransitionValues sVar2 = (TransitionValues) aVar2.mo4513m(i2);
            if (mo5385F(sVar2.f5123b)) {
                this.f5093x.add(sVar2);
                this.f5092w.add(null);
            }
        }
    }

    /* renamed from: d */
    private static void m6013d(TransitionValuesMaps tVar, View view, TransitionValues sVar) {
        tVar.f5125a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f5126b.indexOfKey(id) >= 0) {
                tVar.f5126b.put(id, null);
            } else {
                tVar.f5126b.put(id, view);
            }
        }
        String L = ViewCompat.m5529L(view);
        if (L != null) {
            if (tVar.f5128d.containsKey(L)) {
                tVar.f5128d.put(L, null);
            } else {
                tVar.f5128d.put(L, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f5127c.mo4419g(itemIdAtPosition) >= 0) {
                    View view2 = (View) tVar.f5127c.mo4417e(itemIdAtPosition);
                    if (view2 != null) {
                        ViewCompat.m5589w0(view2, false);
                        tVar.f5127c.mo4421i(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ViewCompat.m5589w0(view, true);
                tVar.f5127c.mo4421i(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: g */
    private void m6014g(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f5081l;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f5082m;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f5083n;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!((Class) this.f5083n.get(i)).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        TransitionValues sVar = new TransitionValues(view);
                        if (z) {
                            mo5306i(sVar);
                        } else {
                            mo5305f(sVar);
                        }
                        sVar.f5124c.add(this);
                        mo5405h(sVar);
                        if (z) {
                            m6013d(this.f5088s, view, sVar);
                        } else {
                            m6013d(this.f5089t, view, sVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f5085p;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f5086q;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f5087r;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!((Class) this.f5087r.get(i2)).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m6014g(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: w */
    private static ArrayMap<Animator, C0725d> m6015w() {
        ArrayMap<Animator, C0725d> aVar = (ArrayMap) f5062c.get();
        if (aVar != null) {
            return aVar;
        }
        ArrayMap<Animator, C0725d> aVar2 = new ArrayMap<>();
        f5062c.set(aVar2);
        return aVar2;
    }

    /* renamed from: A */
    public List<Class<?>> mo5382A() {
        return this.f5080k;
    }

    /* renamed from: B */
    public List<View> mo5383B() {
        return this.f5078i;
    }

    /* renamed from: C */
    public String[] mo5304C() {
        return null;
    }

    /* renamed from: D */
    public TransitionValues mo5384D(View view, boolean z) {
        TransitionSet qVar = this.f5090u;
        if (qVar != null) {
            return qVar.mo5384D(view, z);
        }
        return (TransitionValues) (z ? this.f5088s : this.f5089t).f5125a.get(view);
    }

    /* renamed from: E */
    public boolean mo5367E(TransitionValues sVar, TransitionValues sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] C = mo5304C();
        if (C != null) {
            int length = C.length;
            int i = 0;
            while (i < length) {
                if (!m6005G(sVar, sVar2, C[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String G : sVar.f5122a.keySet()) {
            if (m6005G(sVar, sVar2, G)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public boolean mo5385F(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f5081l;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList2 = this.f5082m;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList3 = this.f5083n;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f5083n.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f5084o != null && ViewCompat.m5529L(view) != null && this.f5084o.contains(ViewCompat.m5529L(view))) {
            return false;
        }
        if (this.f5077h.size() == 0 && this.f5078i.size() == 0) {
            ArrayList<Class<?>> arrayList4 = this.f5080k;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                ArrayList<String> arrayList5 = this.f5079j;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    return true;
                }
            }
        }
        if (this.f5077h.contains(Integer.valueOf(id)) || this.f5078i.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f5079j;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.m5529L(view))) {
            return true;
        }
        if (this.f5080k != null) {
            for (int i2 = 0; i2 < this.f5080k.size(); i2++) {
                if (((Class) this.f5080k.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: M */
    public void mo5386M(View view) {
        if (!this.f5066D) {
            ArrayMap w = m6015w();
            int size = w.size();
            WindowIdImpl d = C0709c0.m5910d(view);
            for (int i = size - 1; i >= 0; i--) {
                C0725d dVar = (C0725d) w.mo4513m(i);
                if (dVar.f5099a != null && d.equals(dVar.f5102d)) {
                    AnimatorUtils.m5875b((Animator) w.mo4508i(i));
                }
            }
            ArrayList<C0727f> arrayList = this.f5067G;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5067G.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C0727f) arrayList2.get(i2)).mo5336c(this);
                }
            }
            this.f5065C = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public void mo5387N(ViewGroup viewGroup) {
        this.f5092w = new ArrayList<>();
        this.f5093x = new ArrayList<>();
        m6010L(this.f5088s, this.f5089t);
        ArrayMap w = m6015w();
        int size = w.size();
        WindowIdImpl d = C0709c0.m5910d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) w.mo4508i(i);
            if (animator != null) {
                C0725d dVar = (C0725d) w.get(animator);
                if (!(dVar == null || dVar.f5099a == null || !d.equals(dVar.f5102d))) {
                    TransitionValues sVar = dVar.f5101c;
                    View view = dVar.f5099a;
                    TransitionValues D = mo5384D(view, true);
                    TransitionValues s = mo5414s(view, true);
                    if (D == null && s == null) {
                        s = (TransitionValues) this.f5089t.f5125a.get(view);
                    }
                    if (!(D == null && s == null) && dVar.f5103e.mo5367E(sVar, s)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            w.remove(animator);
                        }
                    }
                }
            }
        }
        mo5409n(viewGroup, this.f5088s, this.f5089t, this.f5092w, this.f5093x);
        mo5391W();
    }

    /* renamed from: O */
    public Transition mo5388O(C0727f fVar) {
        ArrayList<C0727f> arrayList = this.f5067G;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f5067G.size() == 0) {
            this.f5067G = null;
        }
        return this;
    }

    /* renamed from: P */
    public Transition mo5389P(View view) {
        this.f5078i.remove(view);
        return this;
    }

    /* renamed from: Q */
    public void mo5390Q(View view) {
        if (this.f5065C) {
            if (!this.f5066D) {
                ArrayMap w = m6015w();
                int size = w.size();
                WindowIdImpl d = C0709c0.m5910d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C0725d dVar = (C0725d) w.mo4513m(i);
                    if (dVar.f5099a != null && d.equals(dVar.f5102d)) {
                        AnimatorUtils.m5876c((Animator) w.mo4508i(i));
                    }
                }
                ArrayList<C0727f> arrayList = this.f5067G;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f5067G.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C0727f) arrayList2.get(i2)).mo5337d(this);
                    }
                }
            }
            this.f5065C = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo5391W() {
        mo5402d0();
        ArrayMap w = m6015w();
        Iterator it = this.f5068H.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (w.containsKey(animator)) {
                mo5402d0();
                m6011R(animator, w);
            }
        }
        this.f5068H.clear();
        mo5410o();
    }

    /* renamed from: X */
    public Transition mo5392X(long j) {
        this.f5075f = j;
        return this;
    }

    /* renamed from: Y */
    public void mo5393Y(C0726e eVar) {
        this.f5070J = eVar;
    }

    /* renamed from: Z */
    public Transition mo5394Z(TimeInterpolator timeInterpolator) {
        this.f5076g = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public Transition mo5395a(C0727f fVar) {
        if (this.f5067G == null) {
            this.f5067G = new ArrayList<>();
        }
        this.f5067G.add(fVar);
        return this;
    }

    /* renamed from: a0 */
    public void mo5396a0(PathMotion gVar) {
        if (gVar == null) {
            this.f5072L = f5061b;
        } else {
            this.f5072L = gVar;
        }
    }

    /* renamed from: b */
    public Transition mo5397b(View view) {
        this.f5078i.add(view);
        return this;
    }

    /* renamed from: b0 */
    public void mo5398b0(TransitionPropagation pVar) {
    }

    /* renamed from: c0 */
    public Transition mo5399c0(long j) {
        this.f5074e = j;
        return this;
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f5063A.size() - 1; size >= 0; size--) {
            ((Animator) this.f5063A.get(size)).cancel();
        }
        ArrayList<C0727f> arrayList = this.f5067G;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f5067G.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C0727f) arrayList2.get(i)).mo5335b(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo5402d0() {
        if (this.f5064B == 0) {
            ArrayList<C0727f> arrayList = this.f5067G;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5067G.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C0727f) arrayList2.get(i)).mo5357a(this);
                }
            }
            this.f5066D = false;
        }
        this.f5064B++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo5403e(Animator animator) {
        if (animator == null) {
            mo5410o();
            return;
        }
        if (mo5411p() >= 0) {
            animator.setDuration(mo5411p());
        }
        if (mo5419x() >= 0) {
            animator.setStartDelay(mo5419x() + animator.getStartDelay());
        }
        if (mo5413r() != null) {
            animator.setInterpolator(mo5413r());
        }
        animator.addListener(new C0724c());
        animator.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e0 */
    public String mo5404e0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String sb2 = sb.toString();
        String str2 = ") ";
        if (this.f5075f != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("dur(");
            sb3.append(this.f5075f);
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        if (this.f5074e != -1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("dly(");
            sb4.append(this.f5074e);
            sb4.append(str2);
            sb2 = sb4.toString();
        }
        if (this.f5076g != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append("interp(");
            sb5.append(this.f5076g);
            sb5.append(str2);
            sb2 = sb5.toString();
        }
        if (this.f5077h.size() <= 0 && this.f5078i.size() <= 0) {
            return sb2;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb2);
        sb6.append("tgts(");
        String sb7 = sb6.toString();
        String str3 = ", ";
        if (this.f5077h.size() > 0) {
            for (int i = 0; i < this.f5077h.size(); i++) {
                if (i > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(sb7);
                    sb8.append(str3);
                    sb7 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(sb7);
                sb9.append(this.f5077h.get(i));
                sb7 = sb9.toString();
            }
        }
        if (this.f5078i.size() > 0) {
            for (int i2 = 0; i2 < this.f5078i.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(sb7);
                    sb10.append(str3);
                    sb7 = sb10.toString();
                }
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb7);
                sb11.append(this.f5078i.get(i2));
                sb7 = sb11.toString();
            }
        }
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb7);
        sb12.append(")");
        return sb12.toString();
    }

    /* renamed from: f */
    public abstract void mo5305f(TransitionValues sVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo5405h(TransitionValues sVar) {
        if (this.f5069I != null && !sVar.f5122a.isEmpty()) {
            throw null;
        }
    }

    /* renamed from: i */
    public abstract void mo5306i(TransitionValues sVar);

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5406j(android.view.ViewGroup r6, boolean r7) {
        /*
            r5 = this;
            r5.mo5407k(r7)
            java.util.ArrayList<java.lang.Integer> r0 = r5.f5077h
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto L_0x0014
            java.util.ArrayList<android.view.View> r0 = r5.f5078i
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0029
        L_0x0014:
            java.util.ArrayList<java.lang.String> r0 = r5.f5079j
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
        L_0x001e:
            java.util.ArrayList<java.lang.Class<?>> r0 = r5.f5080k
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r5.m6014g(r6, r7)
            goto L_0x00a6
        L_0x002e:
            r0 = 0
        L_0x002f:
            java.util.ArrayList<java.lang.Integer> r2 = r5.f5077h
            int r2 = r2.size()
            if (r0 >= r2) goto L_0x006f
            java.util.ArrayList<java.lang.Integer> r2 = r5.f5077h
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.view.View r2 = r6.findViewById(r2)
            if (r2 == 0) goto L_0x006c
            b.p.s r3 = new b.p.s
            r3.<init>(r2)
            if (r7 == 0) goto L_0x0054
            r5.mo5306i(r3)
            goto L_0x0057
        L_0x0054:
            r5.mo5305f(r3)
        L_0x0057:
            java.util.ArrayList<b.p.m> r4 = r3.f5124c
            r4.add(r5)
            r5.mo5405h(r3)
            if (r7 == 0) goto L_0x0067
            b.p.t r4 = r5.f5088s
            m6013d(r4, r2, r3)
            goto L_0x006c
        L_0x0067:
            b.p.t r4 = r5.f5089t
            m6013d(r4, r2, r3)
        L_0x006c:
            int r0 = r0 + 1
            goto L_0x002f
        L_0x006f:
            r6 = 0
        L_0x0070:
            java.util.ArrayList<android.view.View> r0 = r5.f5078i
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x00a6
            java.util.ArrayList<android.view.View> r0 = r5.f5078i
            java.lang.Object r0 = r0.get(r6)
            android.view.View r0 = (android.view.View) r0
            b.p.s r2 = new b.p.s
            r2.<init>(r0)
            if (r7 == 0) goto L_0x008b
            r5.mo5306i(r2)
            goto L_0x008e
        L_0x008b:
            r5.mo5305f(r2)
        L_0x008e:
            java.util.ArrayList<b.p.m> r3 = r2.f5124c
            r3.add(r5)
            r5.mo5405h(r2)
            if (r7 == 0) goto L_0x009e
            b.p.t r3 = r5.f5088s
            m6013d(r3, r0, r2)
            goto L_0x00a3
        L_0x009e:
            b.p.t r3 = r5.f5089t
            m6013d(r3, r0, r2)
        L_0x00a3:
            int r6 = r6 + 1
            goto L_0x0070
        L_0x00a6:
            if (r7 != 0) goto L_0x00ea
            b.d.a<java.lang.String, java.lang.String> r6 = r5.f5071K
            if (r6 == 0) goto L_0x00ea
            int r6 = r6.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
            r0 = 0
        L_0x00b6:
            if (r0 >= r6) goto L_0x00ce
            b.d.a<java.lang.String, java.lang.String> r2 = r5.f5071K
            java.lang.Object r2 = r2.mo4508i(r0)
            java.lang.String r2 = (java.lang.String) r2
            b.p.t r3 = r5.f5088s
            b.d.a<java.lang.String, android.view.View> r3 = r3.f5128d
            java.lang.Object r2 = r3.remove(r2)
            r7.add(r2)
            int r0 = r0 + 1
            goto L_0x00b6
        L_0x00ce:
            if (r1 >= r6) goto L_0x00ea
            java.lang.Object r0 = r7.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x00e7
            b.d.a<java.lang.String, java.lang.String> r2 = r5.f5071K
            java.lang.Object r2 = r2.mo4513m(r1)
            java.lang.String r2 = (java.lang.String) r2
            b.p.t r3 = r5.f5088s
            b.d.a<java.lang.String, android.view.View> r3 = r3.f5128d
            r3.put(r2, r0)
        L_0x00e7:
            int r1 = r1 + 1
            goto L_0x00ce
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p010b.p062p.Transition.mo5406j(android.view.ViewGroup, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo5407k(boolean z) {
        if (z) {
            this.f5088s.f5125a.clear();
            this.f5088s.f5126b.clear();
            this.f5088s.f5127c.mo4414b();
            return;
        }
        this.f5089t.f5125a.clear();
        this.f5089t.f5126b.clear();
        this.f5089t.f5127c.mo4414b();
    }

    /* renamed from: l */
    public Transition clone() {
        try {
            Transition mVar = (Transition) super.clone();
            mVar.f5068H = new ArrayList<>();
            mVar.f5088s = new TransitionValuesMaps();
            mVar.f5089t = new TransitionValuesMaps();
            mVar.f5092w = null;
            mVar.f5093x = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public Animator mo5307m(ViewGroup viewGroup, TransitionValues sVar, TransitionValues sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo5409n(ViewGroup viewGroup, TransitionValuesMaps tVar, TransitionValuesMaps tVar2, ArrayList<TransitionValues> arrayList, ArrayList<TransitionValues> arrayList2) {
        int i;
        Animator animator;
        TransitionValues sVar;
        View view;
        TransitionValues sVar2;
        Animator animator2;
        ArrayMap w = m6015w();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            TransitionValues sVar3 = (TransitionValues) arrayList.get(i2);
            TransitionValues sVar4 = (TransitionValues) arrayList2.get(i2);
            if (sVar3 != null && !sVar3.f5124c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f5124c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if (sVar3 == null || sVar4 == null || mo5367E(sVar3, sVar4)) {
                    Animator m = mo5307m(viewGroup, sVar3, sVar4);
                    if (m != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f5123b;
                            String[] C = mo5304C();
                            if (C != null && C.length > 0) {
                                sVar2 = new TransitionValues(view2);
                                TransitionValues sVar5 = (TransitionValues) tVar2.f5125a.get(view2);
                                if (sVar5 != null) {
                                    int i3 = 0;
                                    while (i3 < C.length) {
                                        Animator animator3 = m;
                                        int i4 = size;
                                        TransitionValues sVar6 = sVar5;
                                        sVar2.f5122a.put(C[i3], sVar5.f5122a.get(C[i3]));
                                        i3++;
                                        m = animator3;
                                        size = i4;
                                        sVar5 = sVar6;
                                    }
                                }
                                Animator animator4 = m;
                                i = size;
                                int size2 = w.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size2) {
                                        animator2 = animator4;
                                        break;
                                    }
                                    C0725d dVar = (C0725d) w.get((Animator) w.mo4508i(i5));
                                    if (dVar.f5101c != null && dVar.f5099a == view2 && dVar.f5100b.equals(mo5415t()) && dVar.f5101c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                TransitionValuesMaps tVar3 = tVar2;
                                i = size;
                                animator2 = m;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            TransitionValuesMaps tVar4 = tVar2;
                            Animator animator5 = m;
                            i = size;
                            view = sVar3.f5123b;
                            animator = animator5;
                            sVar = null;
                        }
                        if (animator == null) {
                            continue;
                        } else if (this.f5069I == null) {
                            C0725d dVar2 = new C0725d(view, mo5415t(), this, C0709c0.m5910d(viewGroup), sVar);
                            w.put(animator, dVar2);
                            this.f5068H.add(animator);
                        } else {
                            throw null;
                        }
                        i2++;
                        size = i;
                    }
                    TransitionValuesMaps tVar5 = tVar2;
                    i = size;
                    i2++;
                    size = i;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            TransitionValuesMaps tVar52 = tVar2;
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator6 = (Animator) this.f5068H.get(sparseIntArray.keyAt(i6));
                animator6.setStartDelay((((long) sparseIntArray.valueAt(i6)) - Long.MAX_VALUE) + animator6.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo5410o() {
        int i = this.f5064B - 1;
        this.f5064B = i;
        if (i == 0) {
            ArrayList<C0727f> arrayList = this.f5067G;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5067G.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0727f) arrayList2.get(i2)).mo5338e(this);
                }
            }
            for (int i3 = 0; i3 < this.f5088s.f5127c.mo4424l(); i3++) {
                View view = (View) this.f5088s.f5127c.mo4425m(i3);
                if (view != null) {
                    ViewCompat.m5589w0(view, false);
                }
            }
            for (int i4 = 0; i4 < this.f5089t.f5127c.mo4424l(); i4++) {
                View view2 = (View) this.f5089t.f5127c.mo4425m(i4);
                if (view2 != null) {
                    ViewCompat.m5589w0(view2, false);
                }
            }
            this.f5066D = true;
        }
    }

    /* renamed from: p */
    public long mo5411p() {
        return this.f5075f;
    }

    /* renamed from: q */
    public C0726e mo5412q() {
        return this.f5070J;
    }

    /* renamed from: r */
    public TimeInterpolator mo5413r() {
        return this.f5076g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public TransitionValues mo5414s(View view, boolean z) {
        TransitionSet qVar = this.f5090u;
        if (qVar != null) {
            return qVar.mo5414s(view, z);
        }
        ArrayList<TransitionValues> arrayList = z ? this.f5092w : this.f5093x;
        TransitionValues sVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            TransitionValues sVar2 = (TransitionValues) arrayList.get(i2);
            if (sVar2 == null) {
                return null;
            }
            if (sVar2.f5123b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            sVar = (TransitionValues) (z ? this.f5093x : this.f5092w).get(i);
        }
        return sVar;
    }

    /* renamed from: t */
    public String mo5415t() {
        return this.f5073d;
    }

    public String toString() {
        return mo5404e0("");
    }

    /* renamed from: u */
    public PathMotion mo5417u() {
        return this.f5072L;
    }

    /* renamed from: v */
    public TransitionPropagation mo5418v() {
        return this.f5069I;
    }

    /* renamed from: x */
    public long mo5419x() {
        return this.f5074e;
    }

    /* renamed from: y */
    public List<Integer> mo5420y() {
        return this.f5077h;
    }

    /* renamed from: z */
    public List<String> mo5421z() {
        return this.f5079j;
    }
}
