package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager.widget.a */
public abstract class PagerAdapter {

    /* renamed from: a */
    private final DataSetObservable f3261a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f3262b;

    /* renamed from: a */
    public abstract void mo2902a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: b */
    public abstract void mo2903b(ViewGroup viewGroup);

    /* renamed from: c */
    public abstract int mo4064c();

    /* renamed from: d */
    public int mo4065d(Object obj) {
        return -1;
    }

    /* renamed from: e */
    public abstract CharSequence mo4066e(int i);

    /* renamed from: f */
    public float mo4067f(int i) {
        return 1.0f;
    }

    /* renamed from: g */
    public abstract Object mo2904g(ViewGroup viewGroup, int i);

    /* renamed from: h */
    public abstract boolean mo2905h(View view, Object obj);

    /* renamed from: i */
    public void mo4068i(DataSetObserver dataSetObserver) {
        this.f3261a.registerObserver(dataSetObserver);
    }

    /* renamed from: j */
    public abstract void mo2906j(Parcelable parcelable, ClassLoader classLoader);

    /* renamed from: k */
    public abstract Parcelable mo2907k();

    /* renamed from: l */
    public abstract void mo2908l(ViewGroup viewGroup, int i, Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo4069m(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f3262b = dataSetObserver;
        }
    }

    /* renamed from: n */
    public abstract void mo2909n(ViewGroup viewGroup);

    /* renamed from: o */
    public void mo4070o(DataSetObserver dataSetObserver) {
        this.f3261a.unregisterObserver(dataSetObserver);
    }
}
