package p010b.p062p;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p010b.p062p.Transition.C0726e;
import p010b.p062p.Transition.C0727f;

/* renamed from: b.p.q */
public class TransitionSet extends Transition {

    /* renamed from: M */
    private ArrayList<Transition> f5111M = new ArrayList<>();

    /* renamed from: N */
    private boolean f5112N = true;

    /* renamed from: O */
    int f5113O;

    /* renamed from: P */
    boolean f5114P = false;

    /* renamed from: Q */
    private int f5115Q = 0;

    /* renamed from: b.p.q$a */
    /* compiled from: TransitionSet */
    class C0730a extends TransitionListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ Transition f5116a;

        C0730a(Transition mVar) {
            this.f5116a = mVar;
        }

        /* renamed from: e */
        public void mo5338e(Transition mVar) {
            this.f5116a.mo5391W();
            mVar.mo5388O(this);
        }
    }

    /* renamed from: b.p.q$b */
    /* compiled from: TransitionSet */
    static class C0731b extends TransitionListenerAdapter {

        /* renamed from: a */
        TransitionSet f5118a;

        C0731b(TransitionSet qVar) {
            this.f5118a = qVar;
        }

        /* renamed from: a */
        public void mo5357a(Transition mVar) {
            TransitionSet qVar = this.f5118a;
            if (!qVar.f5114P) {
                qVar.mo5402d0();
                this.f5118a.f5114P = true;
            }
        }

        /* renamed from: e */
        public void mo5338e(Transition mVar) {
            TransitionSet qVar = this.f5118a;
            int i = qVar.f5113O - 1;
            qVar.f5113O = i;
            if (i == 0) {
                qVar.f5114P = false;
                qVar.mo5410o();
            }
            mVar.mo5388O(this);
        }
    }

    /* renamed from: i0 */
    private void m6074i0(Transition mVar) {
        this.f5111M.add(mVar);
        mVar.f5090u = this;
    }

    /* renamed from: r0 */
    private void m6075r0() {
        C0731b bVar = new C0731b(this);
        Iterator it = this.f5111M.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).mo5395a(bVar);
        }
        this.f5113O = this.f5111M.size();
    }

    /* renamed from: M */
    public void mo5386M(View view) {
        super.mo5386M(view);
        int size = this.f5111M.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f5111M.get(i)).mo5386M(view);
        }
    }

    /* renamed from: Q */
    public void mo5390Q(View view) {
        super.mo5390Q(view);
        int size = this.f5111M.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f5111M.get(i)).mo5390Q(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo5391W() {
        if (this.f5111M.isEmpty()) {
            mo5402d0();
            mo5410o();
            return;
        }
        m6075r0();
        if (!this.f5112N) {
            for (int i = 1; i < this.f5111M.size(); i++) {
                ((Transition) this.f5111M.get(i - 1)).mo5395a(new C0730a((Transition) this.f5111M.get(i)));
            }
            Transition mVar = (Transition) this.f5111M.get(0);
            if (mVar != null) {
                mVar.mo5391W();
            }
        } else {
            Iterator it = this.f5111M.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo5391W();
            }
        }
    }

    /* renamed from: Y */
    public void mo5393Y(C0726e eVar) {
        super.mo5393Y(eVar);
        this.f5115Q |= 8;
        int size = this.f5111M.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f5111M.get(i)).mo5393Y(eVar);
        }
    }

    /* renamed from: a0 */
    public void mo5396a0(PathMotion gVar) {
        super.mo5396a0(gVar);
        this.f5115Q |= 4;
        if (this.f5111M != null) {
            for (int i = 0; i < this.f5111M.size(); i++) {
                ((Transition) this.f5111M.get(i)).mo5396a0(gVar);
            }
        }
    }

    /* renamed from: b0 */
    public void mo5398b0(TransitionPropagation pVar) {
        super.mo5398b0(pVar);
        this.f5115Q |= 2;
        int size = this.f5111M.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f5111M.get(i)).mo5398b0(pVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e0 */
    public String mo5404e0(String str) {
        String e0 = super.mo5404e0(str);
        for (int i = 0; i < this.f5111M.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(e0);
            sb.append("\n");
            Transition mVar = (Transition) this.f5111M.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(mVar.mo5404e0(sb2.toString()));
            e0 = sb.toString();
        }
        return e0;
    }

    /* renamed from: f */
    public void mo5305f(TransitionValues sVar) {
        if (mo5385F(sVar.f5123b)) {
            Iterator it = this.f5111M.iterator();
            while (it.hasNext()) {
                Transition mVar = (Transition) it.next();
                if (mVar.mo5385F(sVar.f5123b)) {
                    mVar.mo5305f(sVar);
                    sVar.f5124c.add(mVar);
                }
            }
        }
    }

    /* renamed from: f0 */
    public TransitionSet mo5395a(C0727f fVar) {
        return (TransitionSet) super.mo5395a(fVar);
    }

    /* renamed from: g0 */
    public TransitionSet mo5397b(View view) {
        for (int i = 0; i < this.f5111M.size(); i++) {
            ((Transition) this.f5111M.get(i)).mo5397b(view);
        }
        return (TransitionSet) super.mo5397b(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo5405h(TransitionValues sVar) {
        super.mo5405h(sVar);
        int size = this.f5111M.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f5111M.get(i)).mo5405h(sVar);
        }
    }

    /* renamed from: h0 */
    public TransitionSet mo5430h0(Transition mVar) {
        m6074i0(mVar);
        long j = this.f5075f;
        if (j >= 0) {
            mVar.mo5392X(j);
        }
        if ((this.f5115Q & 1) != 0) {
            mVar.mo5394Z(mo5413r());
        }
        if ((this.f5115Q & 2) != 0) {
            mVar.mo5398b0(mo5418v());
        }
        if ((this.f5115Q & 4) != 0) {
            mVar.mo5396a0(mo5417u());
        }
        if ((this.f5115Q & 8) != 0) {
            mVar.mo5393Y(mo5412q());
        }
        return this;
    }

    /* renamed from: i */
    public void mo5306i(TransitionValues sVar) {
        if (mo5385F(sVar.f5123b)) {
            Iterator it = this.f5111M.iterator();
            while (it.hasNext()) {
                Transition mVar = (Transition) it.next();
                if (mVar.mo5385F(sVar.f5123b)) {
                    mVar.mo5306i(sVar);
                    sVar.f5124c.add(mVar);
                }
            }
        }
    }

    /* renamed from: j0 */
    public Transition mo5431j0(int i) {
        if (i < 0 || i >= this.f5111M.size()) {
            return null;
        }
        return (Transition) this.f5111M.get(i);
    }

    /* renamed from: k0 */
    public int mo5432k0() {
        return this.f5111M.size();
    }

    /* renamed from: l */
    public Transition clone() {
        TransitionSet qVar = (TransitionSet) super.clone();
        qVar.f5111M = new ArrayList<>();
        int size = this.f5111M.size();
        for (int i = 0; i < size; i++) {
            qVar.m6074i0(((Transition) this.f5111M.get(i)).clone());
        }
        return qVar;
    }

    /* renamed from: l0 */
    public TransitionSet mo5388O(C0727f fVar) {
        return (TransitionSet) super.mo5388O(fVar);
    }

    /* renamed from: m0 */
    public TransitionSet mo5389P(View view) {
        for (int i = 0; i < this.f5111M.size(); i++) {
            ((Transition) this.f5111M.get(i)).mo5389P(view);
        }
        return (TransitionSet) super.mo5389P(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo5409n(ViewGroup viewGroup, TransitionValuesMaps tVar, TransitionValuesMaps tVar2, ArrayList<TransitionValues> arrayList, ArrayList<TransitionValues> arrayList2) {
        long x = mo5419x();
        int size = this.f5111M.size();
        for (int i = 0; i < size; i++) {
            Transition mVar = (Transition) this.f5111M.get(i);
            if (x > 0 && (this.f5112N || i == 0)) {
                long x2 = mVar.mo5419x();
                if (x2 > 0) {
                    mVar.mo5399c0(x2 + x);
                } else {
                    mVar.mo5399c0(x);
                }
            }
            mVar.mo5409n(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: n0 */
    public TransitionSet mo5392X(long j) {
        super.mo5392X(j);
        if (this.f5075f >= 0) {
            ArrayList<Transition> arrayList = this.f5111M;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Transition) this.f5111M.get(i)).mo5392X(j);
                }
            }
        }
        return this;
    }

    /* renamed from: o0 */
    public TransitionSet mo5394Z(TimeInterpolator timeInterpolator) {
        this.f5115Q |= 1;
        ArrayList<Transition> arrayList = this.f5111M;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.f5111M.get(i)).mo5394Z(timeInterpolator);
            }
        }
        return (TransitionSet) super.mo5394Z(timeInterpolator);
    }

    /* renamed from: p0 */
    public TransitionSet mo5437p0(int i) {
        if (i == 0) {
            this.f5112N = true;
        } else if (i == 1) {
            this.f5112N = false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid parameter for TransitionSet ordering: ");
            sb.append(i);
            throw new AndroidRuntimeException(sb.toString());
        }
        return this;
    }

    /* renamed from: q0 */
    public TransitionSet mo5399c0(long j) {
        return (TransitionSet) super.mo5399c0(j);
    }
}
