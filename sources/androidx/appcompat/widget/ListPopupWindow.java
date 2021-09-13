package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.widget.PopupWindowCompat;
import java.lang.reflect.Method;
import p010b.p011a.C0502a;
import p010b.p011a.C0511j;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.appcompat.widget.k0 */
public class ListPopupWindow implements ShowableListMenu {

    /* renamed from: a */
    private static Method f1078a;

    /* renamed from: b */
    private static Method f1079b;

    /* renamed from: c */
    private static Method f1080c;

    /* renamed from: A */
    private final C0179f f1081A;

    /* renamed from: B */
    private final C0178e f1082B;

    /* renamed from: C */
    private final C0176c f1083C;

    /* renamed from: D */
    private Runnable f1084D;

    /* renamed from: G */
    final Handler f1085G;

    /* renamed from: H */
    private final Rect f1086H;

    /* renamed from: I */
    private Rect f1087I;

    /* renamed from: J */
    private boolean f1088J;

    /* renamed from: K */
    PopupWindow f1089K;

    /* renamed from: d */
    private Context f1090d;

    /* renamed from: e */
    private ListAdapter f1091e;

    /* renamed from: f */
    DropDownListView f1092f;

    /* renamed from: g */
    private int f1093g;

    /* renamed from: h */
    private int f1094h;

    /* renamed from: i */
    private int f1095i;

    /* renamed from: j */
    private int f1096j;

    /* renamed from: k */
    private int f1097k;

    /* renamed from: l */
    private boolean f1098l;

    /* renamed from: m */
    private boolean f1099m;

    /* renamed from: n */
    private boolean f1100n;

    /* renamed from: o */
    private int f1101o;

    /* renamed from: p */
    private boolean f1102p;

    /* renamed from: q */
    private boolean f1103q;

    /* renamed from: r */
    int f1104r;

    /* renamed from: s */
    private View f1105s;

    /* renamed from: t */
    private int f1106t;

    /* renamed from: u */
    private DataSetObserver f1107u;

    /* renamed from: v */
    private View f1108v;

    /* renamed from: w */
    private Drawable f1109w;

    /* renamed from: x */
    private OnItemClickListener f1110x;

    /* renamed from: y */
    private OnItemSelectedListener f1111y;

    /* renamed from: z */
    final C0180g f1112z;

    /* renamed from: androidx.appcompat.widget.k0$a */
    /* compiled from: ListPopupWindow */
    class C0174a implements Runnable {
        C0174a() {
        }

        public void run() {
            View t = ListPopupWindow.this.mo1583t();
            if (t != null && t.getWindowToken() != null) {
                ListPopupWindow.this.mo604e();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$b */
    /* compiled from: ListPopupWindow */
    class C0175b implements OnItemSelectedListener {
        C0175b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != -1) {
                DropDownListView g0Var = ListPopupWindow.this.f1092f;
                if (g0Var != null) {
                    g0Var.setListSelectionHidden(false);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$c */
    /* compiled from: ListPopupWindow */
    private class C0176c implements Runnable {
        C0176c() {
        }

        public void run() {
            ListPopupWindow.this.mo1581r();
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$d */
    /* compiled from: ListPopupWindow */
    private class C0177d extends DataSetObserver {
        C0177d() {
        }

        public void onChanged() {
            if (ListPopupWindow.this.mo602c()) {
                ListPopupWindow.this.mo604e();
            }
        }

        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$e */
    /* compiled from: ListPopupWindow */
    private class C0178e implements OnScrollListener {
        C0178e() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.mo1559A() && ListPopupWindow.this.f1089K.getContentView() != null) {
                ListPopupWindow k0Var = ListPopupWindow.this;
                k0Var.f1085G.removeCallbacks(k0Var.f1112z);
                ListPopupWindow.this.f1112z.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$f */
    /* compiled from: ListPopupWindow */
    private class C0179f implements OnTouchListener {
        C0179f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                PopupWindow popupWindow = ListPopupWindow.this.f1089K;
                if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.f1089K.getWidth() && y >= 0 && y < ListPopupWindow.this.f1089K.getHeight()) {
                    ListPopupWindow k0Var = ListPopupWindow.this;
                    k0Var.f1085G.postDelayed(k0Var.f1112z, 250);
                    return false;
                }
            }
            if (action == 1) {
                ListPopupWindow k0Var2 = ListPopupWindow.this;
                k0Var2.f1085G.removeCallbacks(k0Var2.f1112z);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$g */
    /* compiled from: ListPopupWindow */
    private class C0180g implements Runnable {
        C0180g() {
        }

        public void run() {
            DropDownListView g0Var = ListPopupWindow.this.f1092f;
            if (g0Var != null && ViewCompat.m5536S(g0Var) && ListPopupWindow.this.f1092f.getCount() > ListPopupWindow.this.f1092f.getChildCount()) {
                int childCount = ListPopupWindow.this.f1092f.getChildCount();
                ListPopupWindow k0Var = ListPopupWindow.this;
                if (childCount <= k0Var.f1104r) {
                    k0Var.f1089K.setInputMethodMode(2);
                    ListPopupWindow.this.mo604e();
                }
            }
        }
    }

    static {
        String str = "ListPopupWindow";
        if (VERSION.SDK_INT <= 28) {
            try {
                f1078a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i(str, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1080c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i(str, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (VERSION.SDK_INT <= 23) {
            try {
                f1079b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i(str, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, C0502a.f3268D);
    }

    /* renamed from: C */
    private void m1201C() {
        View view = this.f1105s;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1105s);
            }
        }
    }

    /* renamed from: N */
    private void m1202N(boolean z) {
        if (VERSION.SDK_INT <= 28) {
            Method method = f1078a;
            if (method != null) {
                try {
                    method.invoke(this.f1089K, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1089K.setIsClippedToScreen(z);
        }
    }

    /* renamed from: q */
    private int m1203q() {
        int i;
        int i2;
        int i3;
        View view;
        int i4;
        boolean z = true;
        if (this.f1092f == null) {
            Context context = this.f1090d;
            this.f1084D = new C0174a();
            DropDownListView s = mo1582s(context, !this.f1088J);
            this.f1092f = s;
            Drawable drawable = this.f1109w;
            if (drawable != null) {
                s.setSelector(drawable);
            }
            this.f1092f.setAdapter(this.f1091e);
            this.f1092f.setOnItemClickListener(this.f1110x);
            this.f1092f.setFocusable(true);
            this.f1092f.setFocusableInTouchMode(true);
            this.f1092f.setOnItemSelectedListener(new C0175b());
            this.f1092f.setOnScrollListener(this.f1082B);
            OnItemSelectedListener onItemSelectedListener = this.f1111y;
            if (onItemSelectedListener != null) {
                this.f1092f.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view2 = this.f1092f;
            View view3 = this.f1105s;
            if (view3 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LayoutParams layoutParams = new LayoutParams(-1, 0, 1.0f);
                int i5 = this.f1106t;
                if (i5 == 0) {
                    linearLayout.addView(view3);
                    linearLayout.addView(view2, layoutParams);
                } else if (i5 != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid hint position ");
                    sb.append(this.f1106t);
                    Log.e("ListPopupWindow", sb.toString());
                } else {
                    linearLayout.addView(view2, layoutParams);
                    linearLayout.addView(view3);
                }
                int i6 = this.f1094h;
                if (i6 >= 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i4 = 0;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(i6, i4), 0);
                LayoutParams layoutParams2 = (LayoutParams) view3.getLayoutParams();
                i = view3.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
                view = view2;
            }
            this.f1089K.setContentView(view);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f1089K.getContentView();
            View view4 = this.f1105s;
            if (view4 != null) {
                LayoutParams layoutParams3 = (LayoutParams) view4.getLayoutParams();
                i = view4.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f1089K.getBackground();
        if (background != null) {
            background.getPadding(this.f1086H);
            Rect rect = this.f1086H;
            int i7 = rect.top;
            i2 = rect.bottom + i7;
            if (!this.f1098l) {
                this.f1096j = -i7;
            }
        } else {
            this.f1086H.setEmpty();
            i2 = 0;
        }
        if (this.f1089K.getInputMethodMode() != 2) {
            z = false;
        }
        int u = m1204u(mo1583t(), this.f1096j, z);
        if (this.f1102p || this.f1093g == -1) {
            return u + i2;
        }
        int i8 = this.f1094h;
        if (i8 == -2) {
            int i9 = this.f1090d.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f1086H;
            i3 = MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i8 != -1) {
            i3 = MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else {
            int i10 = this.f1090d.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f1086H;
            i3 = MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), 1073741824);
        }
        int d = this.f1092f.mo1457d(i3, 0, -1, u - i, -1);
        if (d > 0) {
            i += i2 + this.f1092f.getPaddingTop() + this.f1092f.getPaddingBottom();
        }
        return d + i;
    }

    /* renamed from: u */
    private int m1204u(View view, int i, boolean z) {
        if (VERSION.SDK_INT > 23) {
            return this.f1089K.getMaxAvailableHeight(view, i, z);
        }
        Method method = f1079b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1089K, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1089K.getMaxAvailableHeight(view, i);
    }

    /* renamed from: A */
    public boolean mo1559A() {
        return this.f1089K.getInputMethodMode() == 2;
    }

    /* renamed from: B */
    public boolean mo1560B() {
        return this.f1088J;
    }

    /* renamed from: D */
    public void mo1561D(View view) {
        this.f1108v = view;
    }

    /* renamed from: E */
    public void mo1562E(int i) {
        this.f1089K.setAnimationStyle(i);
    }

    /* renamed from: F */
    public void mo1563F(int i) {
        Drawable background = this.f1089K.getBackground();
        if (background != null) {
            background.getPadding(this.f1086H);
            Rect rect = this.f1086H;
            this.f1094h = rect.left + rect.right + i;
            return;
        }
        mo1573Q(i);
    }

    /* renamed from: G */
    public void mo1564G(int i) {
        this.f1101o = i;
    }

    /* renamed from: H */
    public void mo1565H(Rect rect) {
        this.f1087I = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: I */
    public void mo1566I(int i) {
        this.f1089K.setInputMethodMode(i);
    }

    /* renamed from: J */
    public void mo1567J(boolean z) {
        this.f1088J = z;
        this.f1089K.setFocusable(z);
    }

    /* renamed from: K */
    public void mo1568K(OnDismissListener onDismissListener) {
        this.f1089K.setOnDismissListener(onDismissListener);
    }

    /* renamed from: L */
    public void mo1569L(OnItemClickListener onItemClickListener) {
        this.f1110x = onItemClickListener;
    }

    /* renamed from: M */
    public void mo1570M(boolean z) {
        this.f1100n = true;
        this.f1099m = z;
    }

    /* renamed from: O */
    public void mo1571O(int i) {
        this.f1106t = i;
    }

    /* renamed from: P */
    public void mo1572P(int i) {
        DropDownListView g0Var = this.f1092f;
        if (mo602c() && g0Var != null) {
            g0Var.setListSelectionHidden(false);
            g0Var.setSelection(i);
            if (g0Var.getChoiceMode() != 0) {
                g0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: Q */
    public void mo1573Q(int i) {
        this.f1094h = i;
    }

    /* renamed from: b */
    public void mo1574b(Drawable drawable) {
        this.f1089K.setBackgroundDrawable(drawable);
    }

    /* renamed from: c */
    public boolean mo602c() {
        return this.f1089K.isShowing();
    }

    /* renamed from: d */
    public int mo1575d() {
        return this.f1095i;
    }

    public void dismiss() {
        this.f1089K.dismiss();
        m1201C();
        this.f1089K.setContentView(null);
        this.f1092f = null;
        this.f1085G.removeCallbacks(this.f1112z);
    }

    /* renamed from: e */
    public void mo604e() {
        int q = m1203q();
        boolean A = mo1559A();
        PopupWindowCompat.m1970b(this.f1089K, this.f1097k);
        boolean z = true;
        if (!this.f1089K.isShowing()) {
            int i = this.f1094h;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo1583t().getWidth();
            }
            int i2 = this.f1093g;
            if (i2 == -1) {
                q = -1;
            } else if (i2 != -2) {
                q = i2;
            }
            this.f1089K.setWidth(i);
            this.f1089K.setHeight(q);
            m1202N(true);
            this.f1089K.setOutsideTouchable(!this.f1103q && !this.f1102p);
            this.f1089K.setTouchInterceptor(this.f1081A);
            if (this.f1100n) {
                PopupWindowCompat.m1969a(this.f1089K, this.f1099m);
            }
            if (VERSION.SDK_INT <= 28) {
                Method method = f1080c;
                if (method != null) {
                    try {
                        method.invoke(this.f1089K, new Object[]{this.f1087I});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.f1089K.setEpicenterBounds(this.f1087I);
            }
            PopupWindowCompat.m1971c(this.f1089K, mo1583t(), this.f1095i, this.f1096j, this.f1101o);
            this.f1092f.setSelection(-1);
            if (!this.f1088J || this.f1092f.isInTouchMode()) {
                mo1581r();
            }
            if (!this.f1088J) {
                this.f1085G.post(this.f1083C);
            }
        } else if (ViewCompat.m5536S(mo1583t())) {
            int i3 = this.f1094h;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo1583t().getWidth();
            }
            int i4 = this.f1093g;
            if (i4 == -1) {
                if (!A) {
                    q = -1;
                }
                if (A) {
                    this.f1089K.setWidth(this.f1094h == -1 ? -1 : 0);
                    this.f1089K.setHeight(0);
                } else {
                    this.f1089K.setWidth(this.f1094h == -1 ? -1 : 0);
                    this.f1089K.setHeight(-1);
                }
            } else if (i4 != -2) {
                q = i4;
            }
            PopupWindow popupWindow = this.f1089K;
            if (this.f1103q || this.f1102p) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1089K.update(mo1583t(), this.f1095i, this.f1096j, i3 < 0 ? -1 : i3, q < 0 ? -1 : q);
        }
    }

    /* renamed from: g */
    public Drawable mo1576g() {
        return this.f1089K.getBackground();
    }

    /* renamed from: h */
    public ListView mo606h() {
        return this.f1092f;
    }

    /* renamed from: j */
    public void mo1577j(int i) {
        this.f1096j = i;
        this.f1098l = true;
    }

    /* renamed from: l */
    public void mo1578l(int i) {
        this.f1095i = i;
    }

    /* renamed from: n */
    public int mo1579n() {
        if (!this.f1098l) {
            return 0;
        }
        return this.f1096j;
    }

    /* renamed from: p */
    public void mo1580p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1107u;
        if (dataSetObserver == null) {
            this.f1107u = new C0177d();
        } else {
            ListAdapter listAdapter2 = this.f1091e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1091e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1107u);
        }
        DropDownListView g0Var = this.f1092f;
        if (g0Var != null) {
            g0Var.setAdapter(this.f1091e);
        }
    }

    /* renamed from: r */
    public void mo1581r() {
        DropDownListView g0Var = this.f1092f;
        if (g0Var != null) {
            g0Var.setListSelectionHidden(true);
            g0Var.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public DropDownListView mo1582s(Context context, boolean z) {
        return new DropDownListView(context, z);
    }

    /* renamed from: t */
    public View mo1583t() {
        return this.f1108v;
    }

    /* renamed from: v */
    public Object mo1584v() {
        if (!mo602c()) {
            return null;
        }
        return this.f1092f.getSelectedItem();
    }

    /* renamed from: w */
    public long mo1585w() {
        if (!mo602c()) {
            return Long.MIN_VALUE;
        }
        return this.f1092f.getSelectedItemId();
    }

    /* renamed from: x */
    public int mo1586x() {
        if (!mo602c()) {
            return -1;
        }
        return this.f1092f.getSelectedItemPosition();
    }

    /* renamed from: y */
    public View mo1587y() {
        if (!mo602c()) {
            return null;
        }
        return this.f1092f.getSelectedView();
    }

    /* renamed from: z */
    public int mo1588z() {
        return this.f1094h;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1093g = -2;
        this.f1094h = -2;
        this.f1097k = 1002;
        this.f1101o = 0;
        this.f1102p = false;
        this.f1103q = false;
        this.f1104r = Integer.MAX_VALUE;
        this.f1106t = 0;
        this.f1112z = new C0180g();
        this.f1081A = new C0179f();
        this.f1082B = new C0178e();
        this.f1083C = new C0176c();
        this.f1086H = new Rect();
        this.f1090d = context;
        this.f1085G = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0511j.f3627o1, i, i2);
        this.f1095i = obtainStyledAttributes.getDimensionPixelOffset(C0511j.f3632p1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0511j.f3637q1, 0);
        this.f1096j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1098l = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow qVar = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f1089K = qVar;
        qVar.setInputMethodMode(1);
    }
}
