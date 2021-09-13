package com.bumptech.glide.p170r.p171j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import com.bumptech.glide.C1411h;
import com.bumptech.glide.p170r.Request;
import com.bumptech.glide.p174t.C1638j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: com.bumptech.glide.r.j.i */
public abstract class ViewTarget<T extends View, Z> extends BaseTarget<Z> {

    /* renamed from: a */
    private static boolean f11216a;

    /* renamed from: b */
    private static int f11217b = C1411h.glide_custom_view_target_tag;

    /* renamed from: c */
    protected final T f11218c;

    /* renamed from: d */
    private final C1627a f11219d;

    /* renamed from: e */
    private OnAttachStateChangeListener f11220e;

    /* renamed from: f */
    private boolean f11221f;

    /* renamed from: g */
    private boolean f11222g;

    /* renamed from: com.bumptech.glide.r.j.i$a */
    /* compiled from: ViewTarget */
    static final class C1627a {

        /* renamed from: a */
        static Integer f11223a;

        /* renamed from: b */
        private final View f11224b;

        /* renamed from: c */
        private final List<SizeReadyCallback> f11225c = new ArrayList();

        /* renamed from: d */
        boolean f11226d;

        /* renamed from: e */
        private C1628a f11227e;

        /* renamed from: com.bumptech.glide.r.j.i$a$a */
        /* compiled from: ViewTarget */
        private static final class C1628a implements OnPreDrawListener {

            /* renamed from: a */
            private final WeakReference<C1627a> f11228a;

            C1628a(C1627a aVar) {
                this.f11228a = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                String str = "ViewTarget";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                    Log.v(str, sb.toString());
                }
                C1627a aVar = (C1627a) this.f11228a.get();
                if (aVar != null) {
                    aVar.mo9534a();
                }
                return true;
            }
        }

        C1627a(View view) {
            this.f11224b = view;
        }

        /* renamed from: c */
        private static int m14028c(Context context) {
            if (f11223a == null) {
                Display defaultDisplay = ((WindowManager) C1638j.m14081d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f11223a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f11223a.intValue();
        }

        /* renamed from: e */
        private int m14029e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f11226d && this.f11224b.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f11224b.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            String str = "ViewTarget";
            if (Log.isLoggable(str, 4)) {
                Log.i(str, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m14028c(this.f11224b.getContext());
        }

        /* renamed from: f */
        private int m14030f() {
            int paddingTop = this.f11224b.getPaddingTop() + this.f11224b.getPaddingBottom();
            LayoutParams layoutParams = this.f11224b.getLayoutParams();
            return m14029e(this.f11224b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        private int m14031g() {
            int paddingLeft = this.f11224b.getPaddingLeft() + this.f11224b.getPaddingRight();
            LayoutParams layoutParams = this.f11224b.getLayoutParams();
            return m14029e(this.f11224b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        private boolean m14032h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        private boolean m14033i(int i, int i2) {
            return m14032h(i) && m14032h(i2);
        }

        /* renamed from: j */
        private void m14034j(int i, int i2) {
            Iterator it = new ArrayList(this.f11225c).iterator();
            while (it.hasNext()) {
                ((SizeReadyCallback) it.next()).mo9520h(i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9534a() {
            if (!this.f11225c.isEmpty()) {
                int g = m14031g();
                int f = m14030f();
                if (m14033i(g, f)) {
                    m14034j(g, f);
                    mo9535b();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo9535b() {
            ViewTreeObserver viewTreeObserver = this.f11224b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f11227e);
            }
            this.f11227e = null;
            this.f11225c.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo9536d(SizeReadyCallback gVar) {
            int g = m14031g();
            int f = m14030f();
            if (m14033i(g, f)) {
                gVar.mo9520h(g, f);
                return;
            }
            if (!this.f11225c.contains(gVar)) {
                this.f11225c.add(gVar);
            }
            if (this.f11227e == null) {
                ViewTreeObserver viewTreeObserver = this.f11224b.getViewTreeObserver();
                C1628a aVar = new C1628a(this);
                this.f11227e = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo9537k(SizeReadyCallback gVar) {
            this.f11225c.remove(gVar);
        }
    }

    public ViewTarget(T t) {
        this.f11218c = (View) C1638j.m14081d(t);
        this.f11219d = new C1627a(t);
    }

    /* renamed from: l */
    private Object m14018l() {
        return this.f11218c.getTag(f11217b);
    }

    /* renamed from: m */
    private void m14019m() {
        OnAttachStateChangeListener onAttachStateChangeListener = this.f11220e;
        if (onAttachStateChangeListener != null && !this.f11222g) {
            this.f11218c.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f11222g = true;
        }
    }

    /* renamed from: n */
    private void m14020n() {
        OnAttachStateChangeListener onAttachStateChangeListener = this.f11220e;
        if (onAttachStateChangeListener != null && this.f11222g) {
            this.f11218c.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f11222g = false;
        }
    }

    /* renamed from: o */
    private void m14021o(Object obj) {
        f11216a = true;
        this.f11218c.setTag(f11217b, obj);
    }

    /* renamed from: a */
    public Request mo9526a() {
        Object l = m14018l();
        if (l == null) {
            return null;
        }
        if (l instanceof Request) {
            return (Request) l;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: c */
    public void mo9527c(SizeReadyCallback gVar) {
        this.f11219d.mo9537k(gVar);
    }

    /* renamed from: g */
    public void mo9523g(Drawable drawable) {
        super.mo9523g(drawable);
        m14019m();
    }

    /* renamed from: h */
    public void mo9314h(Drawable drawable) {
        super.mo9314h(drawable);
        this.f11219d.mo9535b();
        if (!this.f11221f) {
            m14020n();
        }
    }

    /* renamed from: i */
    public void mo9528i(SizeReadyCallback gVar) {
        this.f11219d.mo9536d(gVar);
    }

    /* renamed from: j */
    public void mo9529j(Request cVar) {
        m14021o(cVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target for: ");
        sb.append(this.f11218c);
        return sb.toString();
    }
}
