package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p010b.p034g.p039g.CancellationSignal;

/* renamed from: androidx.fragment.app.z */
class FragmentTransitionCompat21 extends FragmentTransitionImpl {

    /* renamed from: androidx.fragment.app.z$a */
    /* compiled from: FragmentTransitionCompat21 */
    class C0362a extends EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2578a;

        C0362a(Rect rect) {
            this.f2578a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f2578a;
        }
    }

    /* renamed from: androidx.fragment.app.z$b */
    /* compiled from: FragmentTransitionCompat21 */
    class C0363b implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f2580a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2581b;

        C0363b(View view, ArrayList arrayList) {
            this.f2580a = view;
            this.f2581b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f2580a.setVisibility(8);
            int size = this.f2581b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f2581b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.z$c */
    /* compiled from: FragmentTransitionCompat21 */
    class C0364c implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f2583a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2584b;

        /* renamed from: c */
        final /* synthetic */ Object f2585c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f2586d;

        /* renamed from: e */
        final /* synthetic */ Object f2587e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2588f;

        C0364c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2583a = obj;
            this.f2584b = arrayList;
            this.f2585c = obj2;
            this.f2586d = arrayList2;
            this.f2587e = obj3;
            this.f2588f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f2583a;
            if (obj != null) {
                FragmentTransitionCompat21.this.mo2544q(obj, this.f2584b, null);
            }
            Object obj2 = this.f2585c;
            if (obj2 != null) {
                FragmentTransitionCompat21.this.mo2544q(obj2, this.f2586d, null);
            }
            Object obj3 = this.f2587e;
            if (obj3 != null) {
                FragmentTransitionCompat21.this.mo2544q(obj3, this.f2588f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.z$d */
    /* compiled from: FragmentTransitionCompat21 */
    class C0365d implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f2590a;

        C0365d(Runnable runnable) {
            this.f2590a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f2590a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.z$e */
    /* compiled from: FragmentTransitionCompat21 */
    class C0366e extends EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2592a;

        C0366e(Rect rect) {
            this.f2592a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f2592a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f2592a;
        }
    }

    FragmentTransitionCompat21() {
    }

    /* renamed from: C */
    private static boolean m2681C(Transition transition) {
        return !FragmentTransitionImpl.m2194l(transition.getTargetIds()) || !FragmentTransitionImpl.m2194l(transition.getTargetNames()) || !FragmentTransitionImpl.m2194l(transition.getTargetTypes());
    }

    /* renamed from: A */
    public void mo2530A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo2544q(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo2531B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo2532a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo2533b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo2533b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m2681C(transition) && FragmentTransitionImpl.m2194l(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2534c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
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
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: n */
    public Object mo2541n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: p */
    public void mo2543p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: q */
    public void mo2544q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo2544q(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m2681C(transition)) {
            List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    transition.addTarget((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    transition.removeTarget((View) arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: r */
    public void mo2545r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0363b(view, arrayList));
    }

    /* renamed from: t */
    public void mo2547t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        Transition transition = (Transition) obj;
        C0364c cVar = new C0364c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        transition.addListener(cVar);
    }

    /* renamed from: u */
    public void mo2548u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0366e(rect));
        }
    }

    /* renamed from: v */
    public void mo2549v(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            Rect rect = new Rect();
            mo2539k(view, rect);
            transition.setEpicenterCallback(new C0362a(rect));
        }
    }

    /* renamed from: w */
    public void mo2550w(Fragment fragment, Object obj, CancellationSignal bVar, Runnable runnable) {
        ((Transition) obj).addListener(new C0365d(runnable));
    }

    /* renamed from: z */
    public void mo2553z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentTransitionImpl.m2191d(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo2533b(transitionSet, arrayList);
    }
}
