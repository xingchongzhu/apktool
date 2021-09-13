package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.MenuPresenter.C0111a;
import androidx.appcompat.view.menu.MenuView.C0112a;
import java.util.ArrayList;
import p010b.p011a.C0508g;

/* renamed from: androidx.appcompat.view.menu.e */
public class ListMenuPresenter implements MenuPresenter, OnItemClickListener {

    /* renamed from: a */
    Context f557a;

    /* renamed from: b */
    LayoutInflater f558b;

    /* renamed from: c */
    MenuBuilder f559c;

    /* renamed from: d */
    ExpandedMenuView f560d;

    /* renamed from: e */
    int f561e;

    /* renamed from: f */
    int f562f;

    /* renamed from: g */
    int f563g;

    /* renamed from: h */
    private C0111a f564h;

    /* renamed from: i */
    C0101a f565i;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* compiled from: ListMenuPresenter */
    private class C0101a extends BaseAdapter {

        /* renamed from: a */
        private int f566a = -1;

        public C0101a() {
            mo628a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo628a() {
            MenuItemImpl v = ListMenuPresenter.this.f559c.mo713v();
            if (v != null) {
                ArrayList z = ListMenuPresenter.this.f559c.mo717z();
                int size = z.size();
                for (int i = 0; i < size; i++) {
                    if (((MenuItemImpl) z.get(i)) == v) {
                        this.f566a = i;
                        return;
                    }
                }
            }
            this.f566a = -1;
        }

        /* renamed from: b */
        public MenuItemImpl getItem(int i) {
            ArrayList z = ListMenuPresenter.this.f559c.mo717z();
            int i2 = i + ListMenuPresenter.this.f561e;
            int i3 = this.f566a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return (MenuItemImpl) z.get(i2);
        }

        public int getCount() {
            int size = ListMenuPresenter.this.f559c.mo717z().size() - ListMenuPresenter.this.f561e;
            return this.f566a < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                ListMenuPresenter eVar = ListMenuPresenter.this;
                view = eVar.f558b.inflate(eVar.f563g, viewGroup, false);
            }
            ((C0112a) view).mo488e(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo628a();
            super.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(Context context, int i) {
        this(i, 0);
        this.f557a = context;
        this.f558b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public void mo581a(MenuBuilder gVar, boolean z) {
        C0111a aVar = this.f564h;
        if (aVar != null) {
            aVar.mo389a(gVar, z);
        }
    }

    /* renamed from: b */
    public void mo582b(Context context, MenuBuilder gVar) {
        if (this.f562f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f562f);
            this.f557a = contextThemeWrapper;
            this.f558b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f557a != null) {
            this.f557a = context;
            if (this.f558b == null) {
                this.f558b = LayoutInflater.from(context);
            }
        }
        this.f559c = gVar;
        C0101a aVar = this.f565i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public ListAdapter mo625c() {
        if (this.f565i == null) {
            this.f565i = new C0101a();
        }
        return this.f565i;
    }

    /* renamed from: d */
    public boolean mo584d(SubMenuBuilder rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new MenuDialogHelper(rVar).mo719d(null);
        C0111a aVar = this.f564h;
        if (aVar != null) {
            aVar.mo390b(rVar);
        }
        return true;
    }

    /* renamed from: e */
    public MenuView mo626e(ViewGroup viewGroup) {
        if (this.f560d == null) {
            this.f560d = (ExpandedMenuView) this.f558b.inflate(C0508g.f3411g, viewGroup, false);
            if (this.f565i == null) {
                this.f565i = new C0101a();
            }
            this.f560d.setAdapter(this.f565i);
            this.f560d.setOnItemClickListener(this);
        }
        return this.f560d;
    }

    /* renamed from: f */
    public void mo586f(boolean z) {
        C0101a aVar = this.f565i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    public boolean mo605g() {
        return false;
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
        this.f564h = aVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f559c.mo655M(this.f565i.getItem(i), this, 0);
    }

    public ListMenuPresenter(int i, int i2) {
        this.f563g = i;
        this.f562f = i2;
    }
}
