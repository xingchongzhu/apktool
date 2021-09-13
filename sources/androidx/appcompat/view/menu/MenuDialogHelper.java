package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.C0060a;
import androidx.appcompat.view.menu.MenuPresenter.C0111a;
import p010b.p011a.C0508g;

/* renamed from: androidx.appcompat.view.menu.h */
class MenuDialogHelper implements OnKeyListener, OnClickListener, OnDismissListener, C0111a {

    /* renamed from: a */
    private MenuBuilder f601a;

    /* renamed from: b */
    private AlertDialog f602b;

    /* renamed from: c */
    ListMenuPresenter f603c;

    /* renamed from: d */
    private C0111a f604d;

    public MenuDialogHelper(MenuBuilder gVar) {
        this.f601a = gVar;
    }

    /* renamed from: a */
    public void mo389a(MenuBuilder gVar, boolean z) {
        if (z || gVar == this.f601a) {
            mo718c();
        }
        C0111a aVar = this.f604d;
        if (aVar != null) {
            aVar.mo389a(gVar, z);
        }
    }

    /* renamed from: b */
    public boolean mo390b(MenuBuilder gVar) {
        C0111a aVar = this.f604d;
        if (aVar != null) {
            return aVar.mo390b(gVar);
        }
        return false;
    }

    /* renamed from: c */
    public void mo718c() {
        AlertDialog bVar = this.f602b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: d */
    public void mo719d(IBinder iBinder) {
        MenuBuilder gVar = this.f601a;
        C0060a aVar = new C0060a(gVar.mo712u());
        ListMenuPresenter eVar = new ListMenuPresenter(aVar.getContext(), C0508g.f3414j);
        this.f603c = eVar;
        eVar.mo590k(this);
        this.f601a.mo678b(this.f603c);
        aVar.mo277a(this.f603c.mo625c(), this);
        View y = gVar.mo716y();
        if (y != null) {
            aVar.mo278b(y);
        } else {
            aVar.mo279c(gVar.mo714w()).setTitle(gVar.mo715x());
        }
        aVar.mo281d(this);
        AlertDialog create = aVar.create();
        this.f602b = create;
        create.setOnDismissListener(this);
        LayoutParams attributes = this.f602b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f602b.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f601a.mo654L((MenuItemImpl) this.f603c.mo625c().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f603c.mo581a(this.f601a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f602b.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f602b.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f601a.mo686e(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f601a.performShortcut(i, keyEvent, 0);
    }
}
