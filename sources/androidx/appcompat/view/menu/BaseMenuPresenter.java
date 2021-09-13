package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.MenuPresenter.C0111a;
import androidx.appcompat.view.menu.MenuView.C0112a;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
public abstract class BaseMenuPresenter implements MenuPresenter {

    /* renamed from: a */
    protected Context f507a;

    /* renamed from: b */
    protected Context f508b;

    /* renamed from: c */
    protected MenuBuilder f509c;

    /* renamed from: d */
    protected LayoutInflater f510d;

    /* renamed from: e */
    protected LayoutInflater f511e;

    /* renamed from: f */
    private C0111a f512f;

    /* renamed from: g */
    private int f513g;

    /* renamed from: h */
    private int f514h;

    /* renamed from: i */
    protected MenuView f515i;

    /* renamed from: j */
    private int f516j;

    public BaseMenuPresenter(Context context, int i, int i2) {
        this.f507a = context;
        this.f510d = LayoutInflater.from(context);
        this.f513g = i;
        this.f514h = i2;
    }

    /* renamed from: a */
    public void mo581a(MenuBuilder gVar, boolean z) {
        C0111a aVar = this.f512f;
        if (aVar != null) {
            aVar.mo389a(gVar, z);
        }
    }

    /* renamed from: b */
    public void mo582b(Context context, MenuBuilder gVar) {
        this.f508b = context;
        this.f511e = LayoutInflater.from(context);
        this.f509c = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo583c(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f515i).addView(view, i);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=androidx.appcompat.view.menu.r, code=androidx.appcompat.view.menu.g, for r2v0, types: [androidx.appcompat.view.menu.g, androidx.appcompat.view.menu.r] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo584d(androidx.appcompat.view.menu.MenuBuilder r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f512f
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f509c
        L_0x0009:
            boolean r2 = r0.mo390b(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.BaseMenuPresenter.mo584d(androidx.appcompat.view.menu.r):boolean");
    }

    /* renamed from: e */
    public abstract void mo585e(MenuItemImpl iVar, C0112a aVar);

    /* renamed from: f */
    public void mo586f(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f515i;
        if (viewGroup != null) {
            MenuBuilder gVar = this.f509c;
            int i = 0;
            if (gVar != null) {
                gVar.mo701r();
                ArrayList E = this.f509c.mo647E();
                int size = E.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemImpl iVar = (MenuItemImpl) E.get(i3);
                    if (mo596q(i2, iVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        MenuItemImpl itemData = childAt instanceof C0112a ? ((C0112a) childAt).getItemData() : null;
                        View n = mo593n(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            n.setPressed(false);
                            n.jumpDrawablesToCurrentState();
                        }
                        if (n != childAt) {
                            mo583c(n, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo591l(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: h */
    public C0112a mo587h(ViewGroup viewGroup) {
        return (C0112a) this.f510d.inflate(this.f514h, viewGroup, false);
    }

    /* renamed from: i */
    public boolean mo588i(MenuBuilder gVar, MenuItemImpl iVar) {
        return false;
    }

    /* renamed from: j */
    public boolean mo589j(MenuBuilder gVar, MenuItemImpl iVar) {
        return false;
    }

    /* renamed from: k */
    public void mo590k(C0111a aVar) {
        this.f512f = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo591l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: m */
    public C0111a mo592m() {
        return this.f512f;
    }

    /* renamed from: n */
    public View mo593n(MenuItemImpl iVar, View view, ViewGroup viewGroup) {
        C0112a aVar;
        if (view instanceof C0112a) {
            aVar = (C0112a) view;
        } else {
            aVar = mo587h(viewGroup);
        }
        mo585e(iVar, aVar);
        return (View) aVar;
    }

    /* renamed from: o */
    public MenuView mo594o(ViewGroup viewGroup) {
        if (this.f515i == null) {
            MenuView nVar = (MenuView) this.f510d.inflate(this.f513g, viewGroup, false);
            this.f515i = nVar;
            nVar.mo508b(this.f509c);
            mo586f(true);
        }
        return this.f515i;
    }

    /* renamed from: p */
    public void mo595p(int i) {
        this.f516j = i;
    }

    /* renamed from: q */
    public abstract boolean mo596q(int i, MenuItemImpl iVar);
}
