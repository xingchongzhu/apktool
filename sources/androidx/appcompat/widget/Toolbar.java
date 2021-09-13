package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar.C0057a;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.C0102a;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuPresenter.C0111a;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView.C0125e;
import java.util.ArrayList;
import java.util.List;
import p010b.p011a.C0502a;
import p010b.p011a.C0511j;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p011a.p017n.CollapsibleActionView;
import p010b.p011a.p017n.SupportMenuInflater;
import p010b.p034g.p043k.GravityCompat;
import p010b.p034g.p043k.MarginLayoutParamsCompat;
import p010b.p034g.p043k.ViewCompat;
import p010b.p048i.p049a.AbsSavedState;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private ColorStateList f857A;

    /* renamed from: B */
    private boolean f858B;

    /* renamed from: C */
    private boolean f859C;

    /* renamed from: D */
    private final ArrayList<View> f860D;

    /* renamed from: G */
    private final ArrayList<View> f861G;

    /* renamed from: H */
    private final int[] f862H;

    /* renamed from: I */
    C0150f f863I;

    /* renamed from: J */
    private final C0125e f864J;

    /* renamed from: K */
    private ToolbarWidgetWrapper f865K;

    /* renamed from: L */
    private ActionMenuPresenter f866L;

    /* renamed from: M */
    private C0148d f867M;

    /* renamed from: N */
    private C0111a f868N;

    /* renamed from: O */
    private C0102a f869O;

    /* renamed from: P */
    private boolean f870P;

    /* renamed from: Q */
    private final Runnable f871Q;

    /* renamed from: a */
    private ActionMenuView f872a;

    /* renamed from: b */
    private TextView f873b;

    /* renamed from: c */
    private TextView f874c;

    /* renamed from: d */
    private ImageButton f875d;

    /* renamed from: e */
    private ImageView f876e;

    /* renamed from: f */
    private Drawable f877f;

    /* renamed from: g */
    private CharSequence f878g;

    /* renamed from: h */
    ImageButton f879h;

    /* renamed from: i */
    View f880i;

    /* renamed from: j */
    private Context f881j;

    /* renamed from: k */
    private int f882k;

    /* renamed from: l */
    private int f883l;

    /* renamed from: m */
    private int f884m;

    /* renamed from: n */
    int f885n;

    /* renamed from: o */
    private int f886o;

    /* renamed from: p */
    private int f887p;

    /* renamed from: q */
    private int f888q;

    /* renamed from: r */
    private int f889r;

    /* renamed from: s */
    private int f890s;

    /* renamed from: t */
    private RtlSpacingHelper f891t;

    /* renamed from: u */
    private int f892u;

    /* renamed from: v */
    private int f893v;

    /* renamed from: w */
    private int f894w;

    /* renamed from: x */
    private CharSequence f895x;

    /* renamed from: y */
    private CharSequence f896y;

    /* renamed from: z */
    private ColorStateList f897z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0145a implements C0125e {
        C0145a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C0150f fVar = Toolbar.this.f863I;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0146b implements Runnable {
        C0146b() {
        }

        public void run() {
            Toolbar.this.mo1171N();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0147c implements OnClickListener {
        C0147c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1175e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0148d implements MenuPresenter {

        /* renamed from: a */
        MenuBuilder f901a;

        /* renamed from: b */
        MenuItemImpl f902b;

        C0148d() {
        }

        /* renamed from: a */
        public void mo581a(MenuBuilder gVar, boolean z) {
        }

        /* renamed from: b */
        public void mo582b(Context context, MenuBuilder gVar) {
            MenuBuilder gVar2 = this.f901a;
            if (gVar2 != null) {
                MenuItemImpl iVar = this.f902b;
                if (iVar != null) {
                    gVar2.mo687f(iVar);
                }
            }
            this.f901a = gVar;
        }

        /* renamed from: d */
        public boolean mo584d(SubMenuBuilder rVar) {
            return false;
        }

        /* renamed from: f */
        public void mo586f(boolean z) {
            if (this.f902b != null) {
                MenuBuilder gVar = this.f901a;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f901a.getItem(i) == this.f902b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo588i(this.f901a, this.f902b);
                }
            }
        }

        /* renamed from: g */
        public boolean mo605g() {
            return false;
        }

        /* renamed from: i */
        public boolean mo588i(MenuBuilder gVar, MenuItemImpl iVar) {
            View view = Toolbar.this.f880i;
            if (view instanceof CollapsibleActionView) {
                ((CollapsibleActionView) view).mo848f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f880i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f879h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f880i = null;
            toolbar3.mo1172a();
            this.f902b = null;
            Toolbar.this.requestLayout();
            iVar.mo755r(false);
            return true;
        }

        /* renamed from: j */
        public boolean mo589j(MenuBuilder gVar, MenuItemImpl iVar) {
            Toolbar.this.mo1177g();
            ViewParent parent = Toolbar.this.f879h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f879h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f879h);
            }
            Toolbar.this.f880i = iVar.getActionView();
            this.f902b = iVar;
            ViewParent parent2 = Toolbar.this.f880i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f880i);
                }
                C0149e m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.f272a = 8388611 | (toolbar4.f885n & 112);
                m.f904b = 2;
                toolbar4.f880i.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f880i);
            }
            Toolbar.this.mo1166G();
            Toolbar.this.requestLayout();
            iVar.mo755r(true);
            View view = Toolbar.this.f880i;
            if (view instanceof CollapsibleActionView) {
                ((CollapsibleActionView) view).mo847c();
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0149e extends C0057a {

        /* renamed from: b */
        int f904b;

        public C0149e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f904b = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1259a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0149e(int i, int i2) {
            super(i, i2);
            this.f904b = 0;
            this.f272a = 8388627;
        }

        public C0149e(C0149e eVar) {
            super((C0057a) eVar);
            this.f904b = 0;
            this.f904b = eVar.f904b;
        }

        public C0149e(C0057a aVar) {
            super(aVar);
            this.f904b = 0;
        }

        public C0149e(MarginLayoutParams marginLayoutParams) {
            super((LayoutParams) marginLayoutParams);
            this.f904b = 0;
            mo1259a(marginLayoutParams);
        }

        public C0149e(LayoutParams layoutParams) {
            super(layoutParams);
            this.f904b = 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0150f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0151g extends AbsSavedState {
        public static final Creator<C0151g> CREATOR = new C0152a();

        /* renamed from: c */
        int f905c;

        /* renamed from: d */
        boolean f906d;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        class C0152a implements ClassLoaderCreator<C0151g> {
            C0152a() {
            }

            /* renamed from: a */
            public C0151g createFromParcel(Parcel parcel) {
                return new C0151g(parcel, null);
            }

            /* renamed from: b */
            public C0151g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0151g(parcel, classLoader);
            }

            /* renamed from: c */
            public C0151g[] newArray(int i) {
                return new C0151g[i];
            }
        }

        public C0151g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f905c = parcel.readInt();
            this.f906d = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f905c);
            parcel.writeInt(this.f906d ? 1 : 0);
        }

        public C0151g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502a.f3277M);
    }

    /* renamed from: B */
    private int m918B(View view, int i, int[] iArr, int i2) {
        C0149e eVar = (C0149e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = m933q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + eVar.rightMargin;
    }

    /* renamed from: C */
    private int m919C(View view, int i, int[] iArr, int i2) {
        C0149e eVar = (C0149e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = m933q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: D */
    private int m920D(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: E */
    private void m921E(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: F */
    private void m922F() {
        removeCallbacks(this.f871Q);
        post(this.f871Q);
    }

    /* renamed from: L */
    private boolean m923L() {
        if (!this.f870P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m924M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    private boolean m924M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m925b(List<View> list, int i) {
        boolean z = ViewCompat.m5514C(this) == 1;
        int childCount = getChildCount();
        int b = GravityCompat.m5245b(i, ViewCompat.m5514C(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0149e eVar = (C0149e) childAt.getLayoutParams();
                if (eVar.f904b == 0 && m924M(childAt) && m932p(eVar.f272a) == b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0149e eVar2 = (C0149e) childAt2.getLayoutParams();
            if (eVar2.f904b == 0 && m924M(childAt2) && m932p(eVar2.f272a) == b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m926c(View view, boolean z) {
        C0149e eVar;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (C0149e) layoutParams;
        }
        eVar.f904b = 1;
        if (!z || this.f880i == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.f861G.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new SupportMenuInflater(getContext());
    }

    /* renamed from: h */
    private void m927h() {
        if (this.f891t == null) {
            this.f891t = new RtlSpacingHelper();
        }
    }

    /* renamed from: i */
    private void m928i() {
        if (this.f876e == null) {
            this.f876e = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: j */
    private void m929j() {
        m930k();
        if (this.f872a.mo1029N() == null) {
            MenuBuilder gVar = (MenuBuilder) this.f872a.getMenu();
            if (this.f867M == null) {
                this.f867M = new C0148d();
            }
            this.f872a.setExpandedActionViewsExclusive(true);
            gVar.mo679c(this.f867M, this.f881j);
        }
    }

    /* renamed from: k */
    private void m930k() {
        if (this.f872a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f872a = actionMenuView;
            actionMenuView.setPopupTheme(this.f882k);
            this.f872a.setOnMenuItemClickListener(this.f864J);
            this.f872a.mo1030O(this.f868N, this.f869O);
            C0149e m = generateDefaultLayoutParams();
            m.f272a = 8388613 | (this.f885n & 112);
            this.f872a.setLayoutParams(m);
            m926c(this.f872a, false);
        }
    }

    /* renamed from: l */
    private void m931l() {
        if (this.f875d == null) {
            this.f875d = new AppCompatImageButton(getContext(), null, C0502a.f3276L);
            C0149e m = generateDefaultLayoutParams();
            m.f272a = 8388611 | (this.f885n & 112);
            this.f875d.setLayoutParams(m);
        }
    }

    /* renamed from: p */
    private int m932p(int i) {
        int C = ViewCompat.m5514C(this);
        int b = GravityCompat.m5245b(i, C) & 7;
        if (b != 1) {
            int i2 = 3;
            if (!(b == 3 || b == 5)) {
                if (C == 1) {
                    i2 = 5;
                }
                return i2;
            }
        }
        return b;
    }

    /* renamed from: q */
    private int m933q(View view, int i) {
        C0149e eVar = (C0149e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int r = m934r(eVar.f272a);
        if (r == 48) {
            return getPaddingTop() - i2;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = eVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = eVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: r */
    private int m934r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f894w & 112;
    }

    /* renamed from: s */
    private int m935s(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return MarginLayoutParamsCompat.m5464b(marginLayoutParams) + MarginLayoutParamsCompat.m5463a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m936t(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m937u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = (View) list.get(i3);
            C0149e eVar = (C0149e) view.getLayoutParams();
            int i5 = eVar.leftMargin - i;
            int i6 = eVar.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = Math.max(0, -i6);
            i = max3;
        }
        return i4;
    }

    /* renamed from: y */
    private boolean m938y(View view) {
        return view.getParent() == this || this.f861G.contains(view);
    }

    /* renamed from: A */
    public boolean mo1165A() {
        ActionMenuView actionMenuView = this.f872a;
        return actionMenuView != null && actionMenuView.mo1027J();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public void mo1166G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0149e) childAt.getLayoutParams()).f904b == 2 || childAt == this.f872a)) {
                removeViewAt(childCount);
                this.f861G.add(childAt);
            }
        }
    }

    /* renamed from: H */
    public void mo1167H(int i, int i2) {
        m927h();
        this.f891t.mo1700g(i, i2);
    }

    /* renamed from: I */
    public void mo1168I(MenuBuilder gVar, ActionMenuPresenter cVar) {
        if (gVar != null || this.f872a != null) {
            m930k();
            MenuBuilder N = this.f872a.mo1029N();
            if (N != gVar) {
                if (N != null) {
                    N.mo656O(this.f866L);
                    N.mo656O(this.f867M);
                }
                if (this.f867M == null) {
                    this.f867M = new C0148d();
                }
                cVar.mo1367G(true);
                if (gVar != null) {
                    gVar.mo679c(cVar, this.f881j);
                    gVar.mo679c(this.f867M, this.f881j);
                } else {
                    cVar.mo582b(this.f881j, null);
                    this.f867M.mo582b(this.f881j, null);
                    cVar.mo586f(true);
                    this.f867M.mo586f(true);
                }
                this.f872a.setPopupTheme(this.f882k);
                this.f872a.setPresenter(cVar);
                this.f866L = cVar;
            }
        }
    }

    /* renamed from: J */
    public void mo1169J(Context context, int i) {
        this.f884m = i;
        TextView textView = this.f874c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: K */
    public void mo1170K(Context context, int i) {
        this.f883l = i;
        TextView textView = this.f873b;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: N */
    public boolean mo1171N() {
        ActionMenuView actionMenuView = this.f872a;
        return actionMenuView != null && actionMenuView.mo1031P();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1172a() {
        for (int size = this.f861G.size() - 1; size >= 0; size--) {
            addView((View) this.f861G.get(size));
        }
        this.f861G.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0149e);
    }

    /* renamed from: d */
    public boolean mo1174d() {
        if (getVisibility() == 0) {
            ActionMenuView actionMenuView = this.f872a;
            if (actionMenuView != null && actionMenuView.mo1028K()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo1175e() {
        MenuItemImpl iVar;
        C0148d dVar = this.f867M;
        if (dVar == null) {
            iVar = null;
        } else {
            iVar = dVar.f902b;
        }
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public void mo1176f() {
        ActionMenuView actionMenuView = this.f872a;
        if (actionMenuView != null) {
            actionMenuView.mo1019B();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1177g() {
        if (this.f879h == null) {
            AppCompatImageButton mVar = new AppCompatImageButton(getContext(), null, C0502a.f3276L);
            this.f879h = mVar;
            mVar.setImageDrawable(this.f877f);
            this.f879h.setContentDescription(this.f878g);
            C0149e m = generateDefaultLayoutParams();
            m.f272a = 8388611 | (this.f885n & 112);
            m.f904b = 2;
            this.f879h.setLayoutParams(m);
            this.f879h.setOnClickListener(new C0147c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f879h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f879h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        RtlSpacingHelper p0Var = this.f891t;
        if (p0Var != null) {
            return p0Var.mo1694a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f893v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        RtlSpacingHelper p0Var = this.f891t;
        if (p0Var != null) {
            return p0Var.mo1695b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        RtlSpacingHelper p0Var = this.f891t;
        if (p0Var != null) {
            return p0Var.mo1696c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        RtlSpacingHelper p0Var = this.f891t;
        if (p0Var != null) {
            return p0Var.mo1697d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f892u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f872a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.mo1029N()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f893v
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (ViewCompat.m5514C(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (ViewCompat.m5514C(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f892u, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f876e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f876e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m929j();
        return this.f872a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f875d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f875d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f866L;
    }

    public Drawable getOverflowIcon() {
        m929j();
        return this.f872a.getOverflowIcon();
    }

    /* access modifiers changed from: 0000 */
    public Context getPopupContext() {
        return this.f881j;
    }

    public int getPopupTheme() {
        return this.f882k;
    }

    public CharSequence getSubtitle() {
        return this.f896y;
    }

    /* access modifiers changed from: 0000 */
    public final TextView getSubtitleTextView() {
        return this.f874c;
    }

    public CharSequence getTitle() {
        return this.f895x;
    }

    public int getTitleMarginBottom() {
        return this.f890s;
    }

    public int getTitleMarginEnd() {
        return this.f888q;
    }

    public int getTitleMarginStart() {
        return this.f887p;
    }

    public int getTitleMarginTop() {
        return this.f889r;
    }

    /* access modifiers changed from: 0000 */
    public final TextView getTitleTextView() {
        return this.f873b;
    }

    public DecorToolbar getWrapper() {
        if (this.f865K == null) {
            this.f865K = new ToolbarWidgetWrapper(this, true);
        }
        return this.f865K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0149e generateDefaultLayoutParams() {
        return new C0149e(-2, -2);
    }

    /* renamed from: n */
    public C0149e generateLayoutParams(AttributeSet attributeSet) {
        return new C0149e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0149e generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C0149e) {
            return new C0149e((C0149e) layoutParams);
        }
        if (layoutParams instanceof C0057a) {
            return new C0149e((C0057a) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0149e((MarginLayoutParams) layoutParams);
        }
        return new C0149e(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f871Q);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f859C = false;
        }
        if (!this.f859C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f859C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f859C = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x029f A[LOOP:0: B:101:0x029d->B:102:0x029f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c1 A[LOOP:1: B:104:0x02bf->B:105:0x02c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fa A[LOOP:2: B:112:0x02f8->B:113:0x02fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = p010b.p034g.p043k.ViewCompat.m5514C(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f862H
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p010b.p034g.p043k.ViewCompat.m5516D(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f875d
            boolean r13 = r0.m924M(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f875d
            int r13 = r0.m919C(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f875d
            int r13 = r0.m918B(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f879h
            boolean r15 = r0.m924M(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f879h
            int r14 = r0.m919C(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f879h
            int r13 = r0.m918B(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f872a
            boolean r15 = r0.m924M(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f872a
            int r13 = r0.m918B(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f872a
            int r14 = r0.m919C(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f880i
            boolean r13 = r0.m924M(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f880i
            int r10 = r0.m919C(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f880i
            int r2 = r0.m918B(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f876e
            boolean r13 = r0.m924M(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f876e
            int r10 = r0.m919C(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f876e
            int r2 = r0.m918B(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f873b
            boolean r13 = r0.m924M(r13)
            android.widget.TextView r14 = r0.f874c
            boolean r14 = r0.m924M(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f873b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0149e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f873b
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f874c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0149e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f874c
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r18 = r6
            r22 = r12
        L_0x0128:
            r1 = 0
            goto L_0x0290
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f873b
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f874c
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f874c
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f873b
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0149e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0149e) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f873b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f874c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0159:
            r17 = 1
            goto L_0x015e
        L_0x015c:
            r17 = 0
        L_0x015e:
            int r15 = r0.f894w
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a6
            r6 = 80
            if (r15 == r6) goto L_0x0198
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f889r
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0181
            int r6 = r15 + r12
            goto L_0x0196
        L_0x0181:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f890s
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0196:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x0198:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f890s
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b5
        L_0x01a6:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f889r
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f887p
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f873b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0149e) r1
            android.widget.TextView r2 = r0.f873b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f873b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f873b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f888q
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.f874c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0149e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f874c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f874c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f874c
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f888q
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r2 = r24
            goto L_0x0128
        L_0x0227:
            if (r17 == 0) goto L_0x022d
            int r7 = r0.f887p
            r1 = 0
            goto L_0x022f
        L_0x022d:
            r1 = 0
            r7 = 0
        L_0x022f:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x0264
            android.widget.TextView r3 = r0.f873b
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0149e) r3
            android.widget.TextView r4 = r0.f873b
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f873b
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f873b
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f888q
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x0265
        L_0x0264:
            r4 = r2
        L_0x0265:
            if (r14 == 0) goto L_0x0289
            android.widget.TextView r3 = r0.f874c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0149e) r3
            int r3 = r3.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f874c
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r5 = r0.f874c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f874c
            r6.layout(r2, r8, r3, r5)
            int r5 = r0.f888q
            int r3 = r3 + r5
            goto L_0x028a
        L_0x0289:
            r3 = r2
        L_0x028a:
            if (r17 == 0) goto L_0x0290
            int r2 = java.lang.Math.max(r4, r3)
        L_0x0290:
            java.util.ArrayList<android.view.View> r3 = r0.f860D
            r4 = 3
            r0.m925b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f860D
            int r3 = r3.size()
            r7 = 0
        L_0x029d:
            if (r7 >= r3) goto L_0x02b0
            java.util.ArrayList<android.view.View> r4 = r0.f860D
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.m918B(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x029d
        L_0x02b0:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.f860D
            r4 = 5
            r0.m925b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f860D
            int r3 = r3.size()
            r7 = 0
        L_0x02bf:
            if (r7 >= r3) goto L_0x02d0
            java.util.ArrayList<android.view.View> r4 = r0.f860D
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m919C(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02bf
        L_0x02d0:
            java.util.ArrayList<android.view.View> r3 = r0.f860D
            r4 = 1
            r0.m925b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f860D
            int r3 = r0.m937u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02eb
            goto L_0x02f2
        L_0x02eb:
            if (r3 <= r10) goto L_0x02f1
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02f2
        L_0x02f1:
            r2 = r6
        L_0x02f2:
            java.util.ArrayList<android.view.View> r3 = r0.f860D
            int r3 = r3.size()
        L_0x02f8:
            if (r1 >= r3) goto L_0x0309
            java.util.ArrayList<android.view.View> r4 = r0.f860D
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.m918B(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02f8
        L_0x0309:
            java.util.ArrayList<android.view.View> r1 = r0.f860D
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f862H;
        int i10 = 0;
        if (ViewUtils.m1084b(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m924M(this.f875d)) {
            m921E(this.f875d, i, 0, i2, 0, this.f886o);
            i5 = this.f875d.getMeasuredWidth() + m935s(this.f875d);
            i4 = Math.max(0, this.f875d.getMeasuredHeight() + m936t(this.f875d));
            i3 = View.combineMeasuredStates(0, this.f875d.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m924M(this.f879h)) {
            m921E(this.f879h, i, 0, i2, 0, this.f886o);
            i5 = this.f879h.getMeasuredWidth() + m935s(this.f879h);
            i4 = Math.max(i4, this.f879h.getMeasuredHeight() + m936t(this.f879h));
            i3 = View.combineMeasuredStates(i3, this.f879h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m924M(this.f872a)) {
            m921E(this.f872a, i, max, i2, 0, this.f886o);
            i6 = this.f872a.getMeasuredWidth() + m935s(this.f872a);
            i4 = Math.max(i4, this.f872a.getMeasuredHeight() + m936t(this.f872a));
            i3 = View.combineMeasuredStates(i3, this.f872a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m924M(this.f880i)) {
            max2 += m920D(this.f880i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f880i.getMeasuredHeight() + m936t(this.f880i));
            i3 = View.combineMeasuredStates(i3, this.f880i.getMeasuredState());
        }
        if (m924M(this.f876e)) {
            max2 += m920D(this.f876e, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f876e.getMeasuredHeight() + m936t(this.f876e));
            i3 = View.combineMeasuredStates(i3, this.f876e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0149e) childAt.getLayoutParams()).f904b == 0 && m924M(childAt)) {
                max2 += m920D(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m936t(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f889r + this.f890s;
        int i13 = this.f887p + this.f888q;
        if (m924M(this.f873b)) {
            m920D(this.f873b, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f873b.getMeasuredWidth() + m935s(this.f873b);
            i7 = this.f873b.getMeasuredHeight() + m936t(this.f873b);
            i9 = View.combineMeasuredStates(i3, this.f873b.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m924M(this.f874c)) {
            int i14 = i7 + i12;
            int i15 = i9;
            i8 = Math.max(i8, m920D(this.f874c, i, max2 + i13, i2, i14, iArr));
            i7 += this.f874c.getMeasuredHeight() + m936t(this.f874c);
            i9 = View.combineMeasuredStates(i15, this.f874c.getMeasuredState());
        } else {
            int i16 = i9;
        }
        int i17 = max2 + i8;
        int max3 = Math.max(i4, i7) + getPaddingTop() + getPaddingBottom();
        int i18 = i;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(i17 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i18, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!m923L()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0151g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0151g gVar = (C0151g) parcelable;
        super.onRestoreInstanceState(gVar.mo5193l());
        ActionMenuView actionMenuView = this.f872a;
        MenuBuilder N = actionMenuView != null ? actionMenuView.mo1029N() : null;
        int i = gVar.f905c;
        if (!(i == 0 || this.f867M == null || N == null)) {
            MenuItem findItem = N.findItem(i);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (gVar.f906d) {
            m922F();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m927h();
        RtlSpacingHelper p0Var = this.f891t;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        p0Var.mo1699f(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0151g gVar = new C0151g(super.onSaveInstanceState());
        C0148d dVar = this.f867M;
        if (dVar != null) {
            MenuItemImpl iVar = dVar.f902b;
            if (iVar != null) {
                gVar.f905c = iVar.getItemId();
            }
        }
        gVar.f906d = mo1165A();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f858B = false;
        }
        if (!this.f858B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f858B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f858B = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AppCompatResources.m4143d(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f870P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f893v) {
            this.f893v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f892u) {
            this.f892u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AppCompatResources.m4143d(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AppCompatResources.m4143d(getContext(), i));
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        m931l();
        this.f875d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0150f fVar) {
        this.f863I = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m929j();
        this.f872a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f882k != i) {
            this.f882k = i;
            if (i == 0) {
                this.f881j = getContext();
            } else {
                this.f881j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f890s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f888q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f887p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f889r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: v */
    public boolean mo1253v() {
        C0148d dVar = this.f867M;
        return (dVar == null || dVar.f902b == null) ? false : true;
    }

    /* renamed from: w */
    public boolean mo1254w() {
        ActionMenuView actionMenuView = this.f872a;
        return actionMenuView != null && actionMenuView.mo1025H();
    }

    /* renamed from: x */
    public void mo1255x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: z */
    public boolean mo1256z() {
        ActionMenuView actionMenuView = this.f872a;
        return actionMenuView != null && actionMenuView.mo1026I();
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f894w = 8388627;
        this.f860D = new ArrayList<>();
        this.f861G = new ArrayList<>();
        this.f862H = new int[2];
        this.f864J = new C0145a();
        this.f871Q = new C0146b();
        Context context2 = getContext();
        int[] iArr = C0511j.f3542W2;
        TintTypedArray v = TintTypedArray.m1406v(context2, attributeSet, iArr, i, 0);
        ViewCompat.m5569m0(this, context, iArr, attributeSet, v.mo1849r(), i, 0);
        this.f883l = v.mo1845n(C0511j.f3679y3, 0);
        this.f884m = v.mo1845n(C0511j.f3634p3, 0);
        this.f894w = v.mo1843l(C0511j.f3546X2, this.f894w);
        this.f885n = v.mo1843l(C0511j.f3550Y2, 48);
        int e = v.mo1836e(C0511j.f3649s3, 0);
        int i2 = C0511j.f3674x3;
        if (v.mo1850s(i2)) {
            e = v.mo1836e(i2, e);
        }
        this.f890s = e;
        this.f889r = e;
        this.f888q = e;
        this.f887p = e;
        int e2 = v.mo1836e(C0511j.f3664v3, -1);
        if (e2 >= 0) {
            this.f887p = e2;
        }
        int e3 = v.mo1836e(C0511j.f3659u3, -1);
        if (e3 >= 0) {
            this.f888q = e3;
        }
        int e4 = v.mo1836e(C0511j.f3669w3, -1);
        if (e4 >= 0) {
            this.f889r = e4;
        }
        int e5 = v.mo1836e(C0511j.f3654t3, -1);
        if (e5 >= 0) {
            this.f890s = e5;
        }
        this.f886o = v.mo1837f(C0511j.f3604j3, -1);
        int e6 = v.mo1836e(C0511j.f3584f3, Integer.MIN_VALUE);
        int e7 = v.mo1836e(C0511j.f3564b3, Integer.MIN_VALUE);
        int f = v.mo1837f(C0511j.f3574d3, 0);
        int f2 = v.mo1837f(C0511j.f3579e3, 0);
        m927h();
        this.f891t.mo1698e(f, f2);
        if (!(e6 == Integer.MIN_VALUE && e7 == Integer.MIN_VALUE)) {
            this.f891t.mo1700g(e6, e7);
        }
        this.f892u = v.mo1836e(C0511j.f3589g3, Integer.MIN_VALUE);
        this.f893v = v.mo1836e(C0511j.f3569c3, Integer.MIN_VALUE);
        this.f877f = v.mo1838g(C0511j.f3559a3);
        this.f878g = v.mo1847p(C0511j.f3554Z2);
        CharSequence p = v.mo1847p(C0511j.f3644r3);
        if (!TextUtils.isEmpty(p)) {
            setTitle(p);
        }
        CharSequence p2 = v.mo1847p(C0511j.f3629o3);
        if (!TextUtils.isEmpty(p2)) {
            setSubtitle(p2);
        }
        this.f881j = getContext();
        setPopupTheme(v.mo1845n(C0511j.f3624n3, 0));
        Drawable g = v.mo1838g(C0511j.f3619m3);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence p3 = v.mo1847p(C0511j.f3614l3);
        if (!TextUtils.isEmpty(p3)) {
            setNavigationContentDescription(p3);
        }
        Drawable g2 = v.mo1838g(C0511j.f3594h3);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence p4 = v.mo1847p(C0511j.f3599i3);
        if (!TextUtils.isEmpty(p4)) {
            setLogoDescription(p4);
        }
        int i3 = C0511j.f3684z3;
        if (v.mo1850s(i3)) {
            setTitleTextColor(v.mo1834c(i3));
        }
        int i4 = C0511j.f3639q3;
        if (v.mo1850s(i4)) {
            setSubtitleTextColor(v.mo1834c(i4));
        }
        int i5 = C0511j.f3609k3;
        if (v.mo1850s(i5)) {
            mo1255x(v.mo1845n(i5, 0));
        }
        v.mo1851w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1177g();
        }
        ImageButton imageButton = this.f879h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1177g();
            this.f879h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f879h;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f877f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m928i();
            if (!m938y(this.f876e)) {
                m926c(this.f876e, true);
            }
        } else {
            ImageView imageView = this.f876e;
            if (imageView != null && m938y(imageView)) {
                removeView(this.f876e);
                this.f861G.remove(this.f876e);
            }
        }
        ImageView imageView2 = this.f876e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m928i();
        }
        ImageView imageView = this.f876e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m931l();
        }
        ImageButton imageButton = this.f875d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m931l();
            if (!m938y(this.f875d)) {
                m926c(this.f875d, true);
            }
        } else {
            ImageButton imageButton = this.f875d;
            if (imageButton != null && m938y(imageButton)) {
                removeView(this.f875d);
                this.f861G.remove(this.f875d);
            }
        }
        ImageButton imageButton2 = this.f875d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f874c == null) {
                Context context = getContext();
                AppCompatTextView a0Var = new AppCompatTextView(context);
                this.f874c = a0Var;
                a0Var.setSingleLine();
                this.f874c.setEllipsize(TruncateAt.END);
                int i = this.f884m;
                if (i != 0) {
                    this.f874c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f857A;
                if (colorStateList != null) {
                    this.f874c.setTextColor(colorStateList);
                }
            }
            if (!m938y(this.f874c)) {
                m926c(this.f874c, true);
            }
        } else {
            TextView textView = this.f874c;
            if (textView != null && m938y(textView)) {
                removeView(this.f874c);
                this.f861G.remove(this.f874c);
            }
        }
        TextView textView2 = this.f874c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f896y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f857A = colorStateList;
        TextView textView = this.f874c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f873b == null) {
                Context context = getContext();
                AppCompatTextView a0Var = new AppCompatTextView(context);
                this.f873b = a0Var;
                a0Var.setSingleLine();
                this.f873b.setEllipsize(TruncateAt.END);
                int i = this.f883l;
                if (i != 0) {
                    this.f873b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f897z;
                if (colorStateList != null) {
                    this.f873b.setTextColor(colorStateList);
                }
            }
            if (!m938y(this.f873b)) {
                m926c(this.f873b, true);
            }
        } else {
            TextView textView = this.f873b;
            if (textView != null && m938y(textView)) {
                removeView(this.f873b);
                this.f861G.remove(this.f873b);
            }
        }
        TextView textView2 = this.f873b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f895x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f897z = colorStateList;
        TextView textView = this.f873b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
