package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.MenuView.C0112a;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
public class MenuAdapter extends BaseAdapter {

    /* renamed from: a */
    MenuBuilder f568a;

    /* renamed from: b */
    private int f569b = -1;

    /* renamed from: c */
    private boolean f570c;

    /* renamed from: d */
    private final boolean f571d;

    /* renamed from: e */
    private final LayoutInflater f572e;

    /* renamed from: f */
    private final int f573f;

    public MenuAdapter(MenuBuilder gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f571d = z;
        this.f572e = layoutInflater;
        this.f568a = gVar;
        this.f573f = i;
        mo635a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo635a() {
        MenuItemImpl v = this.f568a.mo713v();
        if (v != null) {
            ArrayList z = this.f568a.mo717z();
            int size = z.size();
            for (int i = 0; i < size; i++) {
                if (((MenuItemImpl) z.get(i)) == v) {
                    this.f569b = i;
                    return;
                }
            }
        }
        this.f569b = -1;
    }

    /* renamed from: b */
    public MenuBuilder mo636b() {
        return this.f568a;
    }

    /* renamed from: c */
    public MenuItemImpl getItem(int i) {
        ArrayList z = this.f571d ? this.f568a.mo717z() : this.f568a.mo647E();
        int i2 = this.f569b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (MenuItemImpl) z.get(i);
    }

    /* renamed from: d */
    public void mo638d(boolean z) {
        this.f570c = z;
    }

    public int getCount() {
        ArrayList z = this.f571d ? this.f568a.mo717z() : this.f568a.mo647E();
        if (this.f569b < 0) {
            return z.size();
        }
        return z.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f572e.inflate(this.f573f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f568a.mo648F() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0112a aVar = (C0112a) view;
        if (this.f570c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo488e(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo635a();
        super.notifyDataSetChanged();
    }
}
