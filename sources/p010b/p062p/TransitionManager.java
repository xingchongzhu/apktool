package p010b.p062p;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p010b.p025d.ArrayMap;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: b.p.o */
public class TransitionManager {

    /* renamed from: a */
    private static Transition f5104a = new AutoTransition();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>>> f5105b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f5106c = new ArrayList<>();

    /* renamed from: b.p.o$a */
    /* compiled from: TransitionManager */
    private static class C0728a implements OnPreDrawListener, OnAttachStateChangeListener {

        /* renamed from: a */
        Transition f5107a;

        /* renamed from: b */
        ViewGroup f5108b;

        /* renamed from: b.p.o$a$a */
        /* compiled from: TransitionManager */
        class C0729a extends TransitionListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ ArrayMap f5109a;

            C0729a(ArrayMap aVar) {
                this.f5109a = aVar;
            }

            /* renamed from: e */
            public void mo5338e(Transition mVar) {
                ((ArrayList) this.f5109a.get(C0728a.this.f5108b)).remove(mVar);
                mVar.mo5388O(this);
            }
        }

        C0728a(Transition mVar, ViewGroup viewGroup) {
            this.f5107a = mVar;
            this.f5108b = viewGroup;
        }

        /* renamed from: a */
        private void m6072a() {
            this.f5108b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f5108b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m6072a();
            if (!TransitionManager.f5106c.remove(this.f5108b)) {
                return true;
            }
            ArrayMap b = TransitionManager.m6069b();
            ArrayList arrayList = (ArrayList) b.get(this.f5108b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b.put(this.f5108b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f5107a);
            this.f5107a.mo5395a(new C0729a(b));
            this.f5107a.mo5406j(this.f5108b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo5390Q(this.f5108b);
                }
            }
            this.f5107a.mo5387N(this.f5108b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m6072a();
            TransitionManager.f5106c.remove(this.f5108b);
            ArrayList arrayList = (ArrayList) TransitionManager.m6069b().get(this.f5108b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo5390Q(this.f5108b);
                }
            }
            this.f5107a.mo5407k(true);
        }
    }

    /* renamed from: a */
    public static void m6068a(ViewGroup viewGroup, Transition mVar) {
        if (!f5106c.contains(viewGroup) && ViewCompat.m5537T(viewGroup)) {
            f5106c.add(viewGroup);
            if (mVar == null) {
                mVar = f5104a;
            }
            Transition l = mVar.clone();
            m6071d(viewGroup, l);
            Scene.m6003c(viewGroup, null);
            m6070c(viewGroup, l);
        }
    }

    /* renamed from: b */
    static ArrayMap<ViewGroup, ArrayList<Transition>> m6069b() {
        WeakReference weakReference = (WeakReference) f5105b.get();
        if (weakReference != null) {
            ArrayMap<ViewGroup, ArrayList<Transition>> aVar = (ArrayMap) weakReference.get();
            if (aVar != null) {
                return aVar;
            }
        }
        ArrayMap<ViewGroup, ArrayList<Transition>> aVar2 = new ArrayMap<>();
        f5105b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: c */
    private static void m6070c(ViewGroup viewGroup, Transition mVar) {
        if (mVar != null && viewGroup != null) {
            C0728a aVar = new C0728a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: d */
    private static void m6071d(ViewGroup viewGroup, Transition mVar) {
        ArrayList arrayList = (ArrayList) m6069b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo5386M(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.mo5406j(viewGroup, true);
        }
        Scene b = Scene.m6002b(viewGroup);
        if (b != null) {
            b.mo5379a();
        }
    }
}
