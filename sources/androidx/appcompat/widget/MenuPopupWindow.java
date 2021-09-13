package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.m0 */
public class MenuPopupWindow extends ListPopupWindow implements MenuItemHoverListener {

    /* renamed from: L */
    private static Method f1122L;

    /* renamed from: M */
    private MenuItemHoverListener f1123M;

    /* renamed from: androidx.appcompat.widget.m0$a */
    /* compiled from: MenuPopupWindow */
    public static class C0181a extends DropDownListView {

        /* renamed from: o */
        final int f1124o;

        /* renamed from: p */
        final int f1125p;

        /* renamed from: q */
        private MenuItemHoverListener f1126q;

        /* renamed from: r */
        private MenuItem f1127r;

        public C0181a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1124o = 22;
                this.f1125p = 21;
                return;
            }
            this.f1124o = 21;
            this.f1125p = 22;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo1457d(int i, int i2, int i3, int i4, int i5) {
            return super.mo1457d(i, i2, i3, i4, i5);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo1460e(MotionEvent motionEvent, int i) {
            return super.mo1460e(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            MenuAdapter fVar;
            if (this.f1126q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    fVar = (MenuAdapter) adapter;
                }
                MenuItemImpl iVar = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        int i2 = pointToPosition - i;
                        if (i2 >= 0 && i2 < fVar.getCount()) {
                            iVar = fVar.getItem(i2);
                        }
                    }
                }
                MenuItem menuItem = this.f1127r;
                if (menuItem != iVar) {
                    MenuBuilder b = fVar.mo636b();
                    if (menuItem != null) {
                        this.f1126q.mo622f(b, menuItem);
                    }
                    this.f1127r = iVar;
                    if (iVar != null) {
                        this.f1126q.mo621a(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            MenuAdapter fVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1124o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1125p) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    fVar = (MenuAdapter) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    fVar = (MenuAdapter) adapter;
                }
                fVar.mo636b().mo686e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(MenuItemHoverListener l0Var) {
            this.f1126q = l0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (VERSION.SDK_INT <= 28) {
                f1122L = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: R */
    public void mo1611R(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f1089K.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: S */
    public void mo1612S(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f1089K.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: T */
    public void mo1613T(MenuItemHoverListener l0Var) {
        this.f1123M = l0Var;
    }

    /* renamed from: U */
    public void mo1614U(boolean z) {
        if (VERSION.SDK_INT <= 28) {
            Method method = f1122L;
            if (method != null) {
                try {
                    method.invoke(this.f1089K, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1089K.setTouchModal(z);
        }
    }

    /* renamed from: a */
    public void mo621a(MenuBuilder gVar, MenuItem menuItem) {
        MenuItemHoverListener l0Var = this.f1123M;
        if (l0Var != null) {
            l0Var.mo621a(gVar, menuItem);
        }
    }

    /* renamed from: f */
    public void mo622f(MenuBuilder gVar, MenuItem menuItem) {
        MenuItemHoverListener l0Var = this.f1123M;
        if (l0Var != null) {
            l0Var.mo622f(gVar, menuItem);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public DropDownListView mo1582s(Context context, boolean z) {
        C0181a aVar = new C0181a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
