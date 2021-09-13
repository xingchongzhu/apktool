package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.ActionMenuItemView.C0095b;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter.C0111a;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.MenuView.C0112a;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView.C0121a;
import androidx.core.graphics.drawable.DrawableCompat;
import java.util.ArrayList;
import p010b.p011a.C0502a;
import p010b.p011a.C0508g;
import p010b.p011a.p017n.ActionBarPolicy;
import p010b.p034g.p043k.ActionProvider;
import p010b.p034g.p043k.ActionProvider.C0617a;

/* renamed from: androidx.appcompat.widget.c */
class ActionMenuPresenter extends BaseMenuPresenter implements C0617a {

    /* renamed from: A */
    C0162c f963A;

    /* renamed from: B */
    private C0161b f964B;

    /* renamed from: C */
    final C0166f f965C = new C0166f();

    /* renamed from: D */
    int f966D;

    /* renamed from: k */
    C0163d f967k;

    /* renamed from: l */
    private Drawable f968l;

    /* renamed from: m */
    private boolean f969m;

    /* renamed from: n */
    private boolean f970n;

    /* renamed from: o */
    private boolean f971o;

    /* renamed from: p */
    private int f972p;

    /* renamed from: q */
    private int f973q;

    /* renamed from: r */
    private int f974r;

    /* renamed from: s */
    private boolean f975s;

    /* renamed from: t */
    private boolean f976t;

    /* renamed from: u */
    private boolean f977u;

    /* renamed from: v */
    private boolean f978v;

    /* renamed from: w */
    private int f979w;

    /* renamed from: x */
    private final SparseBooleanArray f980x = new SparseBooleanArray();

    /* renamed from: y */
    C0165e f981y;

    /* renamed from: z */
    C0160a f982z;

    /* renamed from: androidx.appcompat.widget.c$a */
    /* compiled from: ActionMenuPresenter */
    private class C0160a extends MenuPopupHelper {
        public C0160a(Context context, SubMenuBuilder rVar, View view) {
            super(context, rVar, view, false, C0502a.f3289l);
            if (!((MenuItemImpl) rVar.getItem()).mo749l()) {
                View view2 = ActionMenuPresenter.this.f967k;
                if (view2 == null) {
                    view2 = (View) ActionMenuPresenter.this.f515i;
                }
                mo859f(view2);
            }
            mo863j(ActionMenuPresenter.this.f965C);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo858e() {
            ActionMenuPresenter cVar = ActionMenuPresenter.this;
            cVar.f982z = null;
            cVar.f966D = 0;
            super.mo858e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    /* compiled from: ActionMenuPresenter */
    private class C0161b extends C0095b {
        C0161b() {
        }

        /* renamed from: a */
        public ShowableListMenu mo506a() {
            C0160a aVar = ActionMenuPresenter.this.f982z;
            if (aVar != null) {
                return aVar.mo856c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    /* compiled from: ActionMenuPresenter */
    private class C0162c implements Runnable {

        /* renamed from: a */
        private C0165e f985a;

        public C0162c(C0165e eVar) {
            this.f985a = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f509c != null) {
                ActionMenuPresenter.this.f509c.mo684d();
            }
            View view = (View) ActionMenuPresenter.this.f515i;
            if (!(view == null || view.getWindowToken() == null || !this.f985a.mo865m())) {
                ActionMenuPresenter.this.f981y = this.f985a;
            }
            ActionMenuPresenter.this.f963A = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    /* compiled from: ActionMenuPresenter */
    private class C0163d extends AppCompatImageView implements C0121a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        /* compiled from: ActionMenuPresenter */
        class C0164a extends ForwardingListener {

            /* renamed from: j */
            final /* synthetic */ ActionMenuPresenter f988j;

            C0164a(View view, ActionMenuPresenter cVar) {
                this.f988j = cVar;
                super(view);
            }

            /* renamed from: b */
            public ShowableListMenu mo504b() {
                C0165e eVar = ActionMenuPresenter.this.f981y;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo856c();
            }

            /* renamed from: c */
            public boolean mo505c() {
                ActionMenuPresenter.this.mo1371K();
                return true;
            }

            /* renamed from: d */
            public boolean mo1376d() {
                ActionMenuPresenter cVar = ActionMenuPresenter.this;
                if (cVar.f963A != null) {
                    return false;
                }
                cVar.mo1362B();
                return true;
            }
        }

        public C0163d(Context context) {
            super(context, null, C0502a.f3288k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.m1498a(this, getContentDescription());
            setOnTouchListener(new C0164a(this, ActionMenuPresenter.this));
        }

        /* renamed from: a */
        public boolean mo485a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo486b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo1371K();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                DrawableCompat.m1853l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    /* compiled from: ActionMenuPresenter */
    private class C0165e extends MenuPopupHelper {
        public C0165e(Context context, MenuBuilder gVar, View view, boolean z) {
            super(context, gVar, view, z, C0502a.f3289l);
            mo861h(8388613);
            mo863j(ActionMenuPresenter.this.f965C);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo858e() {
            if (ActionMenuPresenter.this.f509c != null) {
                ActionMenuPresenter.this.f509c.close();
            }
            ActionMenuPresenter.this.f981y = null;
            super.mo858e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    /* compiled from: ActionMenuPresenter */
    private class C0166f implements C0111a {
        C0166f() {
        }

        /* renamed from: a */
        public void mo389a(MenuBuilder gVar, boolean z) {
            if (gVar instanceof SubMenuBuilder) {
                gVar.mo646D().mo686e(false);
            }
            C0111a m = ActionMenuPresenter.this.mo592m();
            if (m != null) {
                m.mo389a(gVar, z);
            }
        }

        /* renamed from: b */
        public boolean mo390b(MenuBuilder gVar) {
            boolean z = false;
            if (gVar == ActionMenuPresenter.this.f509c) {
                return false;
            }
            ActionMenuPresenter.this.f966D = ((SubMenuBuilder) gVar).getItem().getItemId();
            C0111a m = ActionMenuPresenter.this.mo592m();
            if (m != null) {
                z = m.mo390b(gVar);
            }
            return z;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C0508g.f3407c, C0508g.f3406b);
    }

    /* renamed from: z */
    private View m1038z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f515i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0112a) && ((C0112a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public Drawable mo1361A() {
        C0163d dVar = this.f967k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f969m) {
            return this.f968l;
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo1362B() {
        C0162c cVar = this.f963A;
        if (cVar != null) {
            MenuView nVar = this.f515i;
            if (nVar != null) {
                ((View) nVar).removeCallbacks(cVar);
                this.f963A = null;
                return true;
            }
        }
        C0165e eVar = this.f981y;
        if (eVar == null) {
            return false;
        }
        eVar.mo855b();
        return true;
    }

    /* renamed from: C */
    public boolean mo1363C() {
        C0160a aVar = this.f982z;
        if (aVar == null) {
            return false;
        }
        aVar.mo855b();
        return true;
    }

    /* renamed from: D */
    public boolean mo1364D() {
        return this.f963A != null || mo1365E();
    }

    /* renamed from: E */
    public boolean mo1365E() {
        C0165e eVar = this.f981y;
        return eVar != null && eVar.mo857d();
    }

    /* renamed from: F */
    public void mo1366F(Configuration configuration) {
        if (!this.f975s) {
            this.f974r = ActionBarPolicy.m4231b(this.f508b).mo4194d();
        }
        MenuBuilder gVar = this.f509c;
        if (gVar != null) {
            gVar.mo653K(true);
        }
    }

    /* renamed from: G */
    public void mo1367G(boolean z) {
        this.f978v = z;
    }

    /* renamed from: H */
    public void mo1368H(ActionMenuView actionMenuView) {
        this.f515i = actionMenuView;
        actionMenuView.mo508b(this.f509c);
    }

    /* renamed from: I */
    public void mo1369I(Drawable drawable) {
        C0163d dVar = this.f967k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f969m = true;
        this.f968l = drawable;
    }

    /* renamed from: J */
    public void mo1370J(boolean z) {
        this.f970n = z;
        this.f971o = true;
    }

    /* renamed from: K */
    public boolean mo1371K() {
        if (this.f970n && !mo1365E()) {
            MenuBuilder gVar = this.f509c;
            if (gVar != null && this.f515i != null && this.f963A == null && !gVar.mo717z().isEmpty()) {
                C0165e eVar = new C0165e(this.f508b, this.f509c, this.f967k, true);
                C0162c cVar = new C0162c(eVar);
                this.f963A = cVar;
                ((View) this.f515i).post(cVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo581a(MenuBuilder gVar, boolean z) {
        mo1372y();
        super.mo581a(gVar, z);
    }

    /* renamed from: b */
    public void mo582b(Context context, MenuBuilder gVar) {
        super.mo582b(context, gVar);
        Resources resources = context.getResources();
        ActionBarPolicy b = ActionBarPolicy.m4231b(context);
        if (!this.f971o) {
            this.f970n = b.mo4198h();
        }
        if (!this.f977u) {
            this.f972p = b.mo4193c();
        }
        if (!this.f975s) {
            this.f974r = b.mo4194d();
        }
        int i = this.f972p;
        if (this.f970n) {
            if (this.f967k == null) {
                C0163d dVar = new C0163d(this.f507a);
                this.f967k = dVar;
                if (this.f969m) {
                    dVar.setImageDrawable(this.f968l);
                    this.f968l = null;
                    this.f969m = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f967k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f967k.getMeasuredWidth();
        } else {
            this.f967k = null;
        }
        this.f973q = i;
        this.f979w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: d */
    public boolean mo584d(SubMenuBuilder rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder rVar2 = rVar;
        while (rVar2.mo897e0() != this.f509c) {
            rVar2 = (SubMenuBuilder) rVar2.mo897e0();
        }
        View z2 = m1038z(rVar2.getItem());
        if (z2 == null) {
            return false;
        }
        this.f966D = rVar.getItem().getItemId();
        int size = rVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0160a aVar = new C0160a(this.f508b, rVar, z2);
        this.f982z = aVar;
        aVar.mo860g(z);
        this.f982z.mo864k();
        super.mo584d(rVar);
        return true;
    }

    /* renamed from: e */
    public void mo585e(MenuItemImpl iVar, C0112a aVar) {
        aVar.mo488e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f515i);
        if (this.f964B == null) {
            this.f964B = new C0161b();
        }
        actionMenuItemView.setPopupCallback(this.f964B);
    }

    /* renamed from: f */
    public void mo586f(boolean z) {
        super.mo586f(z);
        ((View) this.f515i).requestLayout();
        MenuBuilder gVar = this.f509c;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList s = gVar.mo704s();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                ActionProvider b = ((MenuItemImpl) s.get(i)).mo523b();
                if (b != null) {
                    b.mo4973i(this);
                }
            }
        }
        MenuBuilder gVar2 = this.f509c;
        ArrayList z3 = gVar2 != null ? gVar2.mo717z() : null;
        if (this.f970n && z3 != null) {
            int size2 = z3.size();
            if (size2 == 1) {
                z2 = !((MenuItemImpl) z3.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f967k == null) {
                this.f967k = new C0163d(this.f507a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f967k.getParent();
            if (viewGroup != this.f515i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f967k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f515i;
                actionMenuView.addView(this.f967k, actionMenuView.mo1023F());
            }
        } else {
            C0163d dVar = this.f967k;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                MenuView nVar = this.f515i;
                if (parent == nVar) {
                    ((ViewGroup) nVar).removeView(this.f967k);
                }
            }
        }
        ((ActionMenuView) this.f515i).setOverflowReserved(this.f970n);
    }

    /* renamed from: g */
    public boolean mo605g() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        ActionMenuPresenter cVar = this;
        MenuBuilder gVar = cVar.f509c;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.mo647E();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = cVar.f974r;
        int i7 = cVar.f973q;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f515i;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            MenuItemImpl iVar = (MenuItemImpl) arrayList.get(i10);
            if (iVar.mo752o()) {
                i8++;
            } else if (iVar.mo751n()) {
                i9++;
            } else {
                z = true;
            }
            if (cVar.f978v && iVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (cVar.f970n && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = cVar.f980x;
        sparseBooleanArray.clear();
        if (cVar.f976t) {
            int i12 = cVar.f979w;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            MenuItemImpl iVar2 = (MenuItemImpl) arrayList.get(i13);
            if (iVar2.mo752o()) {
                View n = cVar.mo593n(iVar2, view, viewGroup);
                if (cVar.f976t) {
                    i2 -= ActionMenuView.m830L(n, i3, i2, makeMeasureSpec, i5);
                } else {
                    n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.mo775u(true);
                i4 = i;
            } else if (iVar2.mo751n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!cVar.f976t || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View n2 = cVar.mo593n(iVar2, null, viewGroup);
                    if (cVar.f976t) {
                        int L = ActionMenuView.m830L(n2, i3, i2, makeMeasureSpec, 0);
                        i2 -= L;
                        if (L == 0) {
                            z4 = false;
                        }
                    } else {
                        n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = n2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!cVar.f976t ? i7 + i14 > 0 : i7 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i13) {
                        MenuItemImpl iVar3 = (MenuItemImpl) arrayList.get(i15);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.mo749l()) {
                                i11++;
                            }
                            iVar3.mo775u(false);
                        }
                        i15++;
                    }
                }
                if (z3) {
                    i11--;
                }
                iVar2.mo775u(z3);
            } else {
                i4 = i;
                iVar2.mo775u(false);
                i13++;
                view = null;
                cVar = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            cVar = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo591l(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f967k) {
            return false;
        }
        return super.mo591l(viewGroup, i);
    }

    /* renamed from: n */
    public View mo593n(MenuItemImpl iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.mo747j()) {
            actionView = super.mo593n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo1043o(layoutParams));
        }
        return actionView;
    }

    /* renamed from: o */
    public MenuView mo594o(ViewGroup viewGroup) {
        MenuView nVar = this.f515i;
        MenuView o = super.mo594o(viewGroup);
        if (nVar != o) {
            ((ActionMenuView) o).setPresenter(this);
        }
        return o;
    }

    /* renamed from: q */
    public boolean mo596q(int i, MenuItemImpl iVar) {
        return iVar.mo749l();
    }

    /* renamed from: y */
    public boolean mo1372y() {
        return mo1362B() | mo1363C();
    }
}
