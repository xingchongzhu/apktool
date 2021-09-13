package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: androidx.appcompat.view.menu.k */
abstract class MenuPopup implements ShowableListMenu, MenuPresenter, OnItemClickListener {

    /* renamed from: a */
    private Rect f648a;

    MenuPopup() {
    }

    /* renamed from: o */
    protected static int m713o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: x */
    protected static boolean m714x(MenuBuilder gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    protected static MenuAdapter m715y(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (MenuAdapter) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (MenuAdapter) listAdapter;
    }

    /* renamed from: b */
    public void mo582b(Context context, MenuBuilder gVar) {
    }

    /* renamed from: i */
    public boolean mo588i(MenuBuilder gVar, MenuItemImpl iVar) {
        return false;
    }

    /* renamed from: j */
    public boolean mo589j(MenuBuilder gVar, MenuItemImpl iVar) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo607l(MenuBuilder gVar);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo608m() {
        return true;
    }

    /* renamed from: n */
    public Rect mo852n() {
        return this.f648a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m715y(listAdapter).f568a.mo655M((MenuItem) listAdapter.getItem(i), this, mo608m() ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo611p(View view);

    /* renamed from: q */
    public void mo854q(Rect rect) {
        this.f648a = rect;
    }

    /* renamed from: r */
    public abstract void mo612r(boolean z);

    /* renamed from: s */
    public abstract void mo613s(int i);

    /* renamed from: t */
    public abstract void mo614t(int i);

    /* renamed from: u */
    public abstract void mo615u(OnDismissListener onDismissListener);

    /* renamed from: v */
    public abstract void mo616v(boolean z);

    /* renamed from: w */
    public abstract void mo617w(int i);
}
