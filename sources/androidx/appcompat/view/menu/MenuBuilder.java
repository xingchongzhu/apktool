package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p010b.p034g.p036e.p037a.SupportMenu;
import p010b.p034g.p043k.ActionProvider;
import p010b.p034g.p043k.ViewConfigurationCompat;

/* renamed from: androidx.appcompat.view.menu.g */
public class MenuBuilder implements SupportMenu {

    /* renamed from: a */
    private static final int[] f574a = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f575A;

    /* renamed from: b */
    private final Context f576b;

    /* renamed from: c */
    private final Resources f577c;

    /* renamed from: d */
    private boolean f578d;

    /* renamed from: e */
    private boolean f579e;

    /* renamed from: f */
    private C0102a f580f;

    /* renamed from: g */
    private ArrayList<MenuItemImpl> f581g;

    /* renamed from: h */
    private ArrayList<MenuItemImpl> f582h;

    /* renamed from: i */
    private boolean f583i;

    /* renamed from: j */
    private ArrayList<MenuItemImpl> f584j;

    /* renamed from: k */
    private ArrayList<MenuItemImpl> f585k;

    /* renamed from: l */
    private boolean f586l;

    /* renamed from: m */
    private int f587m = 0;

    /* renamed from: n */
    private ContextMenuInfo f588n;

    /* renamed from: o */
    CharSequence f589o;

    /* renamed from: p */
    Drawable f590p;

    /* renamed from: q */
    View f591q;

    /* renamed from: r */
    private boolean f592r = false;

    /* renamed from: s */
    private boolean f593s = false;

    /* renamed from: t */
    private boolean f594t = false;

    /* renamed from: u */
    private boolean f595u = false;

    /* renamed from: v */
    private boolean f596v = false;

    /* renamed from: w */
    private ArrayList<MenuItemImpl> f597w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<MenuPresenter>> f598x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private MenuItemImpl f599y;

    /* renamed from: z */
    private boolean f600z = false;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* compiled from: MenuBuilder */
    public interface C0102a {
        /* renamed from: a */
        boolean mo362a(MenuBuilder gVar, MenuItem menuItem);

        /* renamed from: b */
        void mo364b(MenuBuilder gVar);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    /* compiled from: MenuBuilder */
    public interface C0103b {
        /* renamed from: a */
        boolean mo507a(MenuItemImpl iVar);
    }

    public MenuBuilder(Context context) {
        this.f576b = context;
        this.f577c = context.getResources();
        this.f581g = new ArrayList<>();
        this.f582h = new ArrayList<>();
        this.f583i = true;
        this.f584j = new ArrayList<>();
        this.f585k = new ArrayList<>();
        this.f586l = true;
        m613b0(true);
    }

    /* renamed from: B */
    private static int m610B(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f574a;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: N */
    private void m611N(int i, boolean z) {
        if (i >= 0 && i < this.f581g.size()) {
            this.f581g.remove(i);
            if (z) {
                mo653K(true);
            }
        }
    }

    /* renamed from: W */
    private void m612W(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources C = mo645C();
        if (view != null) {
            this.f591q = view;
            this.f589o = null;
            this.f590p = null;
        } else {
            if (i > 0) {
                this.f589o = C.getText(i);
            } else if (charSequence != null) {
                this.f589o = charSequence;
            }
            if (i2 > 0) {
                this.f590p = ContextCompat.m1758d(mo712u(), i2);
            } else if (drawable != null) {
                this.f590p = drawable;
            }
            this.f591q = null;
        }
        mo653K(false);
    }

    /* renamed from: b0 */
    private void m613b0(boolean z) {
        boolean z2 = true;
        if (!z || this.f577c.getConfiguration().keyboard == 1 || !ViewConfigurationCompat.m5649e(ViewConfiguration.get(this.f576b), this.f576b)) {
            z2 = false;
        }
        this.f579e = z2;
    }

    /* renamed from: g */
    private MenuItemImpl m614g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        MenuItemImpl iVar = new MenuItemImpl(this, i, i2, i3, i4, charSequence, i5);
        return iVar;
    }

    /* renamed from: i */
    private void m615i(boolean z) {
        if (!this.f598x.isEmpty()) {
            mo685d0();
            Iterator it = this.f598x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter mVar = (MenuPresenter) weakReference.get();
                if (mVar == null) {
                    this.f598x.remove(weakReference);
                } else {
                    mVar.mo586f(z);
                }
            }
            mo680c0();
        }
    }

    /* renamed from: j */
    private boolean m616j(SubMenuBuilder rVar, MenuPresenter mVar) {
        boolean z = false;
        if (this.f598x.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z = mVar.mo584d(rVar);
        }
        Iterator it = this.f598x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter mVar2 = (MenuPresenter) weakReference.get();
            if (mVar2 == null) {
                this.f598x.remove(weakReference);
            } else if (!z) {
                z = mVar2.mo584d(rVar);
            }
        }
        return z;
    }

    /* renamed from: n */
    private static int m617n(ArrayList<MenuItemImpl> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((MenuItemImpl) arrayList.get(size)).mo726f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public boolean mo644A() {
        return this.f595u;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public Resources mo645C() {
        return this.f577c;
    }

    /* renamed from: D */
    public MenuBuilder mo646D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList<MenuItemImpl> mo647E() {
        if (!this.f583i) {
            return this.f582h;
        }
        this.f582h.clear();
        int size = this.f581g.size();
        for (int i = 0; i < size; i++) {
            MenuItemImpl iVar = (MenuItemImpl) this.f581g.get(i);
            if (iVar.isVisible()) {
                this.f582h.add(iVar);
            }
        }
        this.f583i = false;
        this.f586l = true;
        return this.f582h;
    }

    /* renamed from: F */
    public boolean mo648F() {
        return this.f600z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public boolean mo649G() {
        return this.f578d;
    }

    /* renamed from: H */
    public boolean mo650H() {
        return this.f579e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public void mo651I(MenuItemImpl iVar) {
        this.f586l = true;
        mo653K(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public void mo652J(MenuItemImpl iVar) {
        this.f583i = true;
        mo653K(true);
    }

    /* renamed from: K */
    public void mo653K(boolean z) {
        if (!this.f592r) {
            if (z) {
                this.f583i = true;
                this.f586l = true;
            }
            m615i(z);
            return;
        }
        this.f593s = true;
        if (z) {
            this.f594t = true;
        }
    }

    /* renamed from: L */
    public boolean mo654L(MenuItem menuItem, int i) {
        return mo655M(menuItem, null, i);
    }

    /* renamed from: M */
    public boolean mo655M(MenuItem menuItem, MenuPresenter mVar, int i) {
        MenuItemImpl iVar = (MenuItemImpl) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean k = iVar.mo748k();
        ActionProvider b = iVar.mo523b();
        boolean z = b != null && b.mo837a();
        if (iVar.mo747j()) {
            k |= iVar.expandActionView();
            if (k) {
                mo686e(true);
            }
        } else if (iVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo686e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.mo778x(new SubMenuBuilder(mo712u(), this, iVar));
            }
            SubMenuBuilder rVar = (SubMenuBuilder) iVar.getSubMenu();
            if (z) {
                b.mo840f(rVar);
            }
            k |= m616j(rVar, mVar);
            if (!k) {
                mo686e(true);
            }
        } else if ((i & 1) == 0) {
            mo686e(true);
        }
        return k;
    }

    /* renamed from: O */
    public void mo656O(MenuPresenter mVar) {
        Iterator it = this.f598x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter mVar2 = (MenuPresenter) weakReference.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f598x.remove(weakReference);
            }
        }
    }

    /* renamed from: P */
    public void mo657P(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo711t());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuBuilder) item.getSubMenu()).mo657P(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    /* renamed from: Q */
    public void mo658Q(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).mo658Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo711t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo659R(C0102a aVar) {
        this.f580f = aVar;
    }

    /* renamed from: S */
    public MenuBuilder mo660S(int i) {
        this.f587m = i;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: T */
    public void mo661T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f581g.size();
        mo685d0();
        for (int i = 0; i < size; i++) {
            MenuItemImpl iVar = (MenuItemImpl) this.f581g.get(i);
            if (iVar.getGroupId() == groupId && iVar.mo750m() && iVar.isCheckable()) {
                iVar.mo756s(iVar == menuItem);
            }
        }
        mo680c0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public MenuBuilder mo662U(int i) {
        m612W(0, null, i, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public MenuBuilder mo663V(Drawable drawable) {
        m612W(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public MenuBuilder mo664X(int i) {
        m612W(i, null, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public MenuBuilder mo665Y(CharSequence charSequence) {
        m612W(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public MenuBuilder mo666Z(View view) {
        m612W(0, null, 0, null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo667a(int i, int i2, int i3, CharSequence charSequence) {
        int B = m610B(i3);
        MenuItemImpl g = m614g(i, i2, i3, B, charSequence, this.f587m);
        ContextMenuInfo contextMenuInfo = this.f588n;
        if (contextMenuInfo != null) {
            g.mo776v(contextMenuInfo);
        }
        ArrayList<MenuItemImpl> arrayList = this.f581g;
        arrayList.add(m617n(arrayList, B), g);
        mo653K(true);
        return g;
    }

    /* renamed from: a0 */
    public void mo668a0(boolean z) {
        this.f575A = z;
    }

    public MenuItem add(CharSequence charSequence) {
        return mo667a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f576b.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            int i6 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i6 < 0 ? intent : intentArr[i6]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null) {
                int i7 = resolveInfo.specificIndex;
                if (i7 >= 0) {
                    menuItemArr[i7] = intent3;
                }
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo678b(MenuPresenter mVar) {
        mo679c(mVar, this.f576b);
    }

    /* renamed from: c */
    public void mo679c(MenuPresenter mVar, Context context) {
        this.f598x.add(new WeakReference(mVar));
        mVar.mo582b(context, this);
        this.f586l = true;
    }

    /* renamed from: c0 */
    public void mo680c0() {
        this.f592r = false;
        if (this.f593s) {
            this.f593s = false;
            mo653K(this.f594t);
        }
    }

    public void clear() {
        MenuItemImpl iVar = this.f599y;
        if (iVar != null) {
            mo687f(iVar);
        }
        this.f581g.clear();
        mo653K(true);
    }

    public void clearHeader() {
        this.f590p = null;
        this.f589o = null;
        this.f591q = null;
        mo653K(false);
    }

    public void close() {
        mo686e(true);
    }

    /* renamed from: d */
    public void mo684d() {
        C0102a aVar = this.f580f;
        if (aVar != null) {
            aVar.mo364b(this);
        }
    }

    /* renamed from: d0 */
    public void mo685d0() {
        if (!this.f592r) {
            this.f592r = true;
            this.f593s = false;
            this.f594t = false;
        }
    }

    /* renamed from: e */
    public final void mo686e(boolean z) {
        if (!this.f596v) {
            this.f596v = true;
            Iterator it = this.f598x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter mVar = (MenuPresenter) weakReference.get();
                if (mVar == null) {
                    this.f598x.remove(weakReference);
                } else {
                    mVar.mo581a(this, z);
                }
            }
            this.f596v = false;
        }
    }

    /* renamed from: f */
    public boolean mo687f(MenuItemImpl iVar) {
        boolean z = false;
        if (!this.f598x.isEmpty() && this.f599y == iVar) {
            mo685d0();
            Iterator it = this.f598x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter mVar = (MenuPresenter) weakReference.get();
                if (mVar == null) {
                    this.f598x.remove(weakReference);
                } else {
                    z = mVar.mo588i(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo680c0();
            if (z) {
                this.f599y = null;
            }
        }
        return z;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl iVar = (MenuItemImpl) this.f581g.get(i2);
            if (iVar.getItemId() == i) {
                return iVar;
            }
            if (iVar.hasSubMenu()) {
                MenuItem findItem = iVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f581g.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo690h(MenuBuilder gVar, MenuItem menuItem) {
        C0102a aVar = this.f580f;
        return aVar != null && aVar.mo362a(gVar, menuItem);
    }

    public boolean hasVisibleItems() {
        if (this.f575A) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((MenuItemImpl) this.f581g.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo697p(i, keyEvent) != null;
    }

    /* renamed from: k */
    public boolean mo693k(MenuItemImpl iVar) {
        boolean z = false;
        if (this.f598x.isEmpty()) {
            return false;
        }
        mo685d0();
        Iterator it = this.f598x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter mVar = (MenuPresenter) weakReference.get();
            if (mVar == null) {
                this.f598x.remove(weakReference);
            } else {
                z = mVar.mo589j(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        mo680c0();
        if (z) {
            this.f599y = iVar;
        }
        return z;
    }

    /* renamed from: l */
    public int mo694l(int i) {
        return mo695m(i, 0);
    }

    /* renamed from: m */
    public int mo695m(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((MenuItemImpl) this.f581g.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: o */
    public int mo696o(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((MenuItemImpl) this.f581g.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public MenuItemImpl mo697p(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<MenuItemImpl> arrayList = this.f597w;
        arrayList.clear();
        mo700q(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemImpl) arrayList.get(0);
        }
        boolean G = mo649G();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl iVar = (MenuItemImpl) arrayList.get(i2);
            if (G) {
                c = iVar.getAlphabeticShortcut();
            } else {
                c = iVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (G && c == 8 && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo654L(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItemImpl p = mo697p(i, keyEvent);
        boolean L = p != null ? mo654L(p, i2) : false;
        if ((i2 & 2) != 0) {
            mo686e(true);
        }
        return L;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo700q(List<MenuItemImpl> list, int i, KeyEvent keyEvent) {
        boolean G = mo649G();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f581g.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemImpl iVar = (MenuItemImpl) this.f581g.get(i2);
                if (iVar.hasSubMenu()) {
                    ((MenuBuilder) iVar.getSubMenu()).mo700q(list, i, keyEvent);
                }
                char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == 8 && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void mo701r() {
        ArrayList E = mo647E();
        if (this.f586l) {
            Iterator it = this.f598x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter mVar = (MenuPresenter) weakReference.get();
                if (mVar == null) {
                    this.f598x.remove(weakReference);
                } else {
                    z |= mVar.mo605g();
                }
            }
            if (z) {
                this.f584j.clear();
                this.f585k.clear();
                int size = E.size();
                for (int i = 0; i < size; i++) {
                    MenuItemImpl iVar = (MenuItemImpl) E.get(i);
                    if (iVar.mo749l()) {
                        this.f584j.add(iVar);
                    } else {
                        this.f585k.add(iVar);
                    }
                }
            } else {
                this.f584j.clear();
                this.f585k.clear();
                this.f585k.addAll(mo647E());
            }
            this.f586l = false;
        }
    }

    public void removeGroup(int i) {
        int l = mo694l(i);
        if (l >= 0) {
            int size = this.f581g.size() - l;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((MenuItemImpl) this.f581g.get(l)).getGroupId() != i) {
                    mo653K(true);
                } else {
                    m611N(l, false);
                    i2 = i3;
                }
            }
            mo653K(true);
        }
    }

    public void removeItem(int i) {
        m611N(mo696o(i), true);
    }

    /* renamed from: s */
    public ArrayList<MenuItemImpl> mo704s() {
        mo701r();
        return this.f584j;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f581g.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl iVar = (MenuItemImpl) this.f581g.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.mo773t(z2);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f600z = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f581g.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl iVar = (MenuItemImpl) this.f581g.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f581g.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl iVar = (MenuItemImpl) this.f581g.get(i2);
            if (iVar.getGroupId() == i && iVar.mo779y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo653K(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f578d = z;
        mo653K(false);
    }

    public int size() {
        return this.f581g.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo711t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context mo712u() {
        return this.f576b;
    }

    /* renamed from: v */
    public MenuItemImpl mo713v() {
        return this.f599y;
    }

    /* renamed from: w */
    public Drawable mo714w() {
        return this.f590p;
    }

    /* renamed from: x */
    public CharSequence mo715x() {
        return this.f589o;
    }

    /* renamed from: y */
    public View mo716y() {
        return this.f591q;
    }

    /* renamed from: z */
    public ArrayList<MenuItemImpl> mo717z() {
        mo701r();
        return this.f585k;
    }

    public MenuItem add(int i) {
        return mo667a(0, 0, 0, this.f577c.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f577c.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo667a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl iVar = (MenuItemImpl) mo667a(i, i2, i3, charSequence);
        SubMenuBuilder rVar = new SubMenuBuilder(this.f576b, this, iVar);
        iVar.mo778x(rVar);
        return rVar;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo667a(i, i2, i3, this.f577c.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f577c.getString(i4));
    }
}
