package p010b.p062p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: b.p.z */
class ViewOverlayApi14 implements ViewOverlayImpl {

    /* renamed from: a */
    protected C0734a f5136a;

    /* renamed from: b.p.z$a */
    /* compiled from: ViewOverlayApi14 */
    static class C0734a extends ViewGroup {

        /* renamed from: a */
        static Method f5137a;

        /* renamed from: b */
        ViewGroup f5138b;

        /* renamed from: c */
        View f5139c;

        /* renamed from: d */
        ArrayList<Drawable> f5140d = null;

        /* renamed from: e */
        ViewOverlayApi14 f5141e;

        /* renamed from: f */
        private boolean f5142f;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            String str = "invalidateChildInParentFast";
            try {
                Class cls2 = Integer.TYPE;
                f5137a = cls.getDeclaredMethod(str, new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C0734a(Context context, ViewGroup viewGroup, View view, ViewOverlayApi14 zVar) {
            super(context);
            this.f5138b = viewGroup;
            this.f5139c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f5141e = zVar;
        }

        /* renamed from: c */
        private void m6130c() {
            if (this.f5142f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        private void m6131d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f5140d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f5142f = true;
                    this.f5138b.removeView(this);
                }
            }
        }

        /* renamed from: e */
        private void m6132e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f5138b.getLocationOnScreen(iArr2);
            this.f5139c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo5445a(Drawable drawable) {
            m6130c();
            if (this.f5140d == null) {
                this.f5140d = new ArrayList<>();
            }
            if (!this.f5140d.contains(drawable)) {
                this.f5140d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo5446b(View view) {
            m6130c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f5138b || viewGroup.getParent() == null || !ViewCompat.m5536S(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f5138b.getLocationOnScreen(iArr2);
                    ViewCompat.m5542Y(view, iArr[0] - iArr2[0]);
                    ViewCompat.m5543Z(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f5138b.getLocationOnScreen(iArr);
            this.f5139c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f5139c.getWidth(), this.f5139c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f5140d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Drawable) this.f5140d.get(i)).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void mo5449f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f5140d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m6131d();
            }
        }

        /* renamed from: g */
        public void mo5450g(View view) {
            super.removeView(view);
            m6131d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f5138b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f5138b instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m6132e(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable drawable) {
            if (!super.verifyDrawable(drawable)) {
                ArrayList<Drawable> arrayList = this.f5140d;
                if (arrayList == null || !arrayList.contains(drawable)) {
                    return false;
                }
            }
            return true;
        }
    }

    ViewOverlayApi14(Context context, ViewGroup viewGroup, View view) {
        this.f5136a = new C0734a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    static ViewOverlayApi14 m6126e(View view) {
        ViewGroup f = m6127f(view);
        if (f == null) {
            return null;
        }
        int childCount = f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = f.getChildAt(i);
            if (childAt instanceof C0734a) {
                return ((C0734a) childAt).f5141e;
            }
        }
        return new ViewGroupOverlayApi14(f.getContext(), f, view);
    }

    /* renamed from: f */
    static ViewGroup m6127f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo5302b(Drawable drawable) {
        this.f5136a.mo5445a(drawable);
    }

    /* renamed from: d */
    public void mo5303d(Drawable drawable) {
        this.f5136a.mo5449f(drawable);
    }
}
