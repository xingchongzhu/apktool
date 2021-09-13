package p010b.p062p;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentTransitionImpl;
import java.util.ArrayList;
import java.util.List;
import p010b.p062p.Transition.C0726e;
import p010b.p062p.Transition.C0727f;

@SuppressLint({"RestrictedApi"})
/* renamed from: b.p.e */
public class FragmentTransitionSupport extends FragmentTransitionImpl {

    /* renamed from: b.p.e$a */
    /* compiled from: FragmentTransitionSupport */
    class C0714a extends C0726e {

        /* renamed from: a */
        final /* synthetic */ Rect f5009a;

        C0714a(Rect rect) {
            this.f5009a = rect;
        }
    }

    /* renamed from: b.p.e$b */
    /* compiled from: FragmentTransitionSupport */
    class C0715b implements C0727f {

        /* renamed from: a */
        final /* synthetic */ View f5011a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5012b;

        C0715b(View view, ArrayList arrayList) {
            this.f5011a = view;
            this.f5012b = arrayList;
        }

        /* renamed from: a */
        public void mo5357a(Transition mVar) {
        }

        /* renamed from: b */
        public void mo5335b(Transition mVar) {
        }

        /* renamed from: c */
        public void mo5336c(Transition mVar) {
        }

        /* renamed from: d */
        public void mo5337d(Transition mVar) {
        }

        /* renamed from: e */
        public void mo5338e(Transition mVar) {
            mVar.mo5388O(this);
            this.f5011a.setVisibility(8);
            int size = this.f5012b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f5012b.get(i)).setVisibility(0);
            }
        }
    }

    /* renamed from: b.p.e$c */
    /* compiled from: FragmentTransitionSupport */
    class C0716c extends TransitionListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ Object f5014a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5015b;

        /* renamed from: c */
        final /* synthetic */ Object f5016c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f5017d;

        /* renamed from: e */
        final /* synthetic */ Object f5018e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f5019f;

        C0716c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f5014a = obj;
            this.f5015b = arrayList;
            this.f5016c = obj2;
            this.f5017d = arrayList2;
            this.f5018e = obj3;
            this.f5019f = arrayList3;
        }

        /* renamed from: a */
        public void mo5357a(Transition mVar) {
            Object obj = this.f5014a;
            if (obj != null) {
                FragmentTransitionSupport.this.mo2544q(obj, this.f5015b, null);
            }
            Object obj2 = this.f5016c;
            if (obj2 != null) {
                FragmentTransitionSupport.this.mo2544q(obj2, this.f5017d, null);
            }
            Object obj3 = this.f5018e;
            if (obj3 != null) {
                FragmentTransitionSupport.this.mo2544q(obj3, this.f5019f, null);
            }
        }

        /* renamed from: e */
        public void mo5338e(Transition mVar) {
            mVar.mo5388O(this);
        }
    }

    /* renamed from: b.p.e$d */
    /* compiled from: FragmentTransitionSupport */
    class C0717d extends C0726e {

        /* renamed from: a */
        final /* synthetic */ Rect f5021a;

        C0717d(Rect rect) {
            this.f5021a = rect;
        }
    }

    /* renamed from: C */
    private static boolean m5931C(Transition mVar) {
        return !FragmentTransitionImpl.m2194l(mVar.mo5420y()) || !FragmentTransitionImpl.m2194l(mVar.mo5421z()) || !FragmentTransitionImpl.m2194l(mVar.mo5382A());
    }

    /* renamed from: A */
    public void mo2530A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet qVar = (TransitionSet) obj;
        if (qVar != null) {
            qVar.mo5383B().clear();
            qVar.mo5383B().addAll(arrayList2);
            mo2544q(qVar, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo2531B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet qVar = new TransitionSet();
        qVar.mo5430h0((Transition) obj);
        return qVar;
    }

    /* renamed from: a */
    public void mo2532a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo5397b(view);
        }
    }

    /* renamed from: b */
    public void mo2533b(Object obj, ArrayList<View> arrayList) {
        Transition mVar = (Transition) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof TransitionSet) {
                TransitionSet qVar = (TransitionSet) mVar;
                int k0 = qVar.mo5432k0();
                while (i < k0) {
                    mo2533b(qVar.mo5431j0(i), arrayList);
                    i++;
                }
            } else if (!m5931C(mVar) && FragmentTransitionImpl.m2194l(mVar.mo5383B())) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.mo5397b((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2534c(ViewGroup viewGroup, Object obj) {
        TransitionManager.m6068a(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo2535e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: g */
    public Object mo2537g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: m */
    public Object mo2540m(Object obj, Object obj2, Object obj3) {
        Transition mVar = (Transition) obj;
        Transition mVar2 = (Transition) obj2;
        Transition mVar3 = (Transition) obj3;
        if (mVar != null && mVar2 != null) {
            mVar = new TransitionSet().mo5430h0(mVar).mo5430h0(mVar2).mo5437p0(1);
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        TransitionSet qVar = new TransitionSet();
        if (mVar != null) {
            qVar.mo5430h0(mVar);
        }
        qVar.mo5430h0(mVar3);
        return qVar;
    }

    /* renamed from: n */
    public Object mo2541n(Object obj, Object obj2, Object obj3) {
        TransitionSet qVar = new TransitionSet();
        if (obj != null) {
            qVar.mo5430h0((Transition) obj);
        }
        if (obj2 != null) {
            qVar.mo5430h0((Transition) obj2);
        }
        if (obj3 != null) {
            qVar.mo5430h0((Transition) obj3);
        }
        return qVar;
    }

    /* renamed from: p */
    public void mo2543p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo5389P(view);
        }
    }

    /* renamed from: q */
    public void mo2544q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition mVar = (Transition) obj;
        int i2 = 0;
        if (mVar instanceof TransitionSet) {
            TransitionSet qVar = (TransitionSet) mVar;
            int k0 = qVar.mo5432k0();
            while (i2 < k0) {
                mo2544q(qVar.mo5431j0(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m5931C(mVar)) {
            List B = mVar.mo5383B();
            if (B.size() == arrayList.size() && B.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    mVar.mo5397b((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    mVar.mo5389P((View) arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: r */
    public void mo2545r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).mo5395a(new C0715b(view, arrayList));
    }

    /* renamed from: t */
    public void mo2547t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        Transition mVar = (Transition) obj;
        C0716c cVar = new C0716c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        mVar.mo5395a(cVar);
    }

    /* renamed from: u */
    public void mo2548u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo5393Y(new C0717d(rect));
        }
    }

    /* renamed from: v */
    public void mo2549v(Object obj, View view) {
        if (view != null) {
            Transition mVar = (Transition) obj;
            Rect rect = new Rect();
            mo2539k(view, rect);
            mVar.mo5393Y(new C0714a(rect));
        }
    }

    /* renamed from: z */
    public void mo2553z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet qVar = (TransitionSet) obj;
        List B = qVar.mo5383B();
        B.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentTransitionImpl.m2191d(B, (View) arrayList.get(i));
        }
        B.add(view);
        arrayList.add(view);
        mo2533b(qVar, arrayList);
    }
}
