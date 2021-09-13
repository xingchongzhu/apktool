package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p010b.p034g.p036e.p037a.SupportMenu;

/* renamed from: androidx.appcompat.view.menu.o */
public class MenuWrapperICS extends BaseMenuWrapper implements Menu {

    /* renamed from: d */
    private final SupportMenu f662d;

    public MenuWrapperICS(Context context, SupportMenu aVar) {
        super(context);
        if (aVar != null) {
            this.f662d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return mo597c(this.f662d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f662d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo597c(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo598d(this.f662d.addSubMenu(charSequence));
    }

    public void clear() {
        mo599e();
        this.f662d.clear();
    }

    public void close() {
        this.f662d.close();
    }

    public MenuItem findItem(int i) {
        return mo597c(this.f662d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo597c(this.f662d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f662d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f662d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f662d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f662d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo600f(i);
        this.f662d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo601g(i);
        this.f662d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f662d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f662d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f662d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f662d.setQwertyMode(z);
    }

    public int size() {
        return this.f662d.size();
    }

    public MenuItem add(int i) {
        return mo597c(this.f662d.add(i));
    }

    public SubMenu addSubMenu(int i) {
        return mo598d(this.f662d.addSubMenu(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo597c(this.f662d.add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo598d(this.f662d.addSubMenu(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo597c(this.f662d.add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo598d(this.f662d.addSubMenu(i, i2, i3, i4));
    }
}
