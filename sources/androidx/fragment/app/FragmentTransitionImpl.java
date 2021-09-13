package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p010b.p034g.p039g.CancellationSignal;
import p010b.p034g.p043k.OneShotPreDrawListener;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.ViewGroupCompat;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.a0 */
public abstract class FragmentTransitionImpl {

    /* renamed from: androidx.fragment.app.a0$a */
    /* compiled from: FragmentTransitionImpl */
    class C0288a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f2227a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2228b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f2229c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f2230d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f2231e;

        C0288a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2227a = i;
            this.f2228b = arrayList;
            this.f2229c = arrayList2;
            this.f2230d = arrayList3;
            this.f2231e = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f2227a; i++) {
                ViewCompat.m5517D0((View) this.f2228b.get(i), (String) this.f2229c.get(i));
                ViewCompat.m5517D0((View) this.f2230d.get(i), (String) this.f2231e.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.a0$b */
    /* compiled from: FragmentTransitionImpl */
    class C0289b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f2233a;

        /* renamed from: b */
        final /* synthetic */ Map f2234b;

        C0289b(ArrayList arrayList, Map map) {
            this.f2233a = arrayList;
            this.f2234b = map;
        }

        public void run() {
            int size = this.f2233a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2233a.get(i);
                String L = ViewCompat.m5529L(view);
                if (L != null) {
                    ViewCompat.m5517D0(view, FragmentTransitionImpl.m2193i(this.f2234b, L));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.a0$c */
    /* compiled from: FragmentTransitionImpl */
    class C0290c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f2236a;

        /* renamed from: b */
        final /* synthetic */ Map f2237b;

        C0290c(ArrayList arrayList, Map map) {
            this.f2236a = arrayList;
            this.f2237b = map;
        }

        public void run() {
            int size = this.f2236a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2236a.get(i);
                ViewCompat.m5517D0(view, (String) this.f2237b.get(ViewCompat.m5529L(view)));
            }
        }
    }

    /* renamed from: d */
    protected static void m2191d(List<View> list, View view) {
        int size = list.size();
        if (!m2192h(list, view, size)) {
            if (ViewCompat.m5529L(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m2192h(list, childAt, size) && ViewCompat.m5529L(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m2192h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m2193i(Map<String, String> map, String str) {
        for (Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: l */
    protected static boolean m2194l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo2530A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo2531B(Object obj);

    /* renamed from: a */
    public abstract void mo2532a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo2533b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo2534c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo2535e(Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2536f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.m5650a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo2536f(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* renamed from: g */
    public abstract Object mo2537g(Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo2538j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String L = ViewCompat.m5529L(view);
            if (L != null) {
                map.put(L, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo2538j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo2539k(View view, Rect rect) {
        if (ViewCompat.m5536S(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: m */
    public abstract Object mo2540m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo2541n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public ArrayList<String> mo2542o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(ViewCompat.m5529L(view));
            ViewCompat.m5517D0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo2543p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo2544q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo2545r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo2546s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        OneShotPreDrawListener.m5506a(viewGroup, new C0290c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo2547t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo2548u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo2549v(Object obj, View view);

    /* renamed from: w */
    public void mo2550w(Fragment fragment, Object obj, CancellationSignal bVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo2551x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        OneShotPreDrawListener.m5506a(view, new C0289b(arrayList, map));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public void mo2552y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String L = ViewCompat.m5529L(view2);
            arrayList4.add(L);
            if (L != null) {
                ViewCompat.m5517D0(view2, null);
                String str = (String) map.get(L);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        ViewCompat.m5517D0((View) arrayList2.get(i2), L);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C0288a aVar = new C0288a(size, arrayList2, arrayList3, arrayList, arrayList4);
        OneShotPreDrawListener.m5506a(view, aVar);
    }

    /* renamed from: z */
    public abstract void mo2553z(Object obj, View view, ArrayList<View> arrayList);
}
