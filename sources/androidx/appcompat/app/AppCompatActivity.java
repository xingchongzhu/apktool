package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.activity.p005d.OnContextAvailableListener;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.app.TaskStackBuilder;
import androidx.core.app.TaskStackBuilder.C0248a;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry.C0484b;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import p010b.p011a.p017n.ActionMode;
import p010b.p011a.p017n.ActionMode.C0527a;

/* renamed from: androidx.appcompat.app.c */
public class AppCompatActivity extends FragmentActivity implements AppCompatCallback, C0248a {

    /* renamed from: p */
    private AppCompatDelegate f276p;

    /* renamed from: q */
    private Resources f277q;

    /* renamed from: androidx.appcompat.app.c$a */
    /* compiled from: AppCompatActivity */
    class C0061a implements C0484b {
        C0061a() {
        }

        /* renamed from: a */
        public Bundle mo323a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.mo289B().mo343u(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.c$b */
    /* compiled from: AppCompatActivity */
    class C0062b implements OnContextAvailableListener {
        C0062b() {
        }

        /* renamed from: a */
        public void mo172a(Context context) {
            AppCompatDelegate B = AppCompatActivity.this.mo289B();
            B.mo336n();
            B.mo339q(AppCompatActivity.this.mo134d().mo3931a("androidx:appcompat"));
        }
    }

    public AppCompatActivity() {
        m244D();
    }

    /* renamed from: D */
    private void m244D() {
        mo134d().mo3934d("androidx:appcompat", new C0061a());
        mo136n(new C0062b());
    }

    /* renamed from: J */
    private boolean m245J(KeyEvent keyEvent) {
        if (VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private void m246q() {
        ViewTreeLifecycleOwner.m2808a(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.m2809a(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.m4001a(getWindow().getDecorView(), this);
    }

    /* renamed from: A */
    public void mo288A() {
        mo289B().mo337o();
    }

    /* renamed from: B */
    public AppCompatDelegate mo289B() {
        if (this.f276p == null) {
            this.f276p = AppCompatDelegate.m267g(this, this);
        }
        return this.f276p;
    }

    /* renamed from: C */
    public ActionBar mo290C() {
        return mo289B().mo335m();
    }

    /* renamed from: E */
    public void mo291E(TaskStackBuilder iVar) {
        iVar.mo2145c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo292F(int i) {
    }

    /* renamed from: G */
    public void mo293G(TaskStackBuilder iVar) {
    }

    @Deprecated
    /* renamed from: H */
    public void mo294H() {
    }

    /* renamed from: I */
    public boolean mo295I() {
        Intent k = mo307k();
        if (k == null) {
            return false;
        }
        if (mo297L(k)) {
            TaskStackBuilder e = TaskStackBuilder.m1736e(this);
            mo291E(e);
            mo293G(e);
            e.mo2147f();
            try {
                ActivityCompat.m1708k(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            mo296K(k);
        }
        return true;
    }

    /* renamed from: K */
    public void mo296K(Intent intent) {
        NavUtils.m1734e(this, intent);
    }

    /* renamed from: L */
    public boolean mo297L(Intent intent) {
        return NavUtils.m1735f(this, intent);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m246q();
        mo289B().mo329d(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo289B().mo331f(context));
    }

    public void closeOptionsMenu() {
        ActionBar C = mo290C();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (C == null || !C.mo251g()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar C = mo290C();
        if (keyCode != 82 || C == null || !C.mo260p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: f */
    public void mo301f(ActionMode bVar) {
    }

    public <T extends View> T findViewById(int i) {
        return mo289B().mo332i(i);
    }

    public MenuInflater getMenuInflater() {
        return mo289B().mo334l();
    }

    public Resources getResources() {
        if (this.f277q == null && VectorEnabledTintResources.m1072b()) {
            this.f277q = new VectorEnabledTintResources(this, super.getResources());
        }
        Resources resources = this.f277q;
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: h */
    public void mo305h(ActionMode bVar) {
    }

    public void invalidateOptionsMenu() {
        mo289B().mo337o();
    }

    /* renamed from: k */
    public Intent mo307k() {
        return NavUtils.m1730a(this);
    }

    /* renamed from: l */
    public ActionMode mo308l(C0527a aVar) {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f277q != null) {
            this.f277q.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        mo289B().mo338p(configuration);
    }

    public void onContentChanged() {
        mo294H();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo289B().mo340r();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m245J(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar C = mo290C();
        if (menuItem.getItemId() != 16908332 || C == null || (C.mo254j() & 4) == 0) {
            return false;
        }
        return mo295I();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo289B().mo341s(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo289B().mo342t();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo289B().mo344v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo289B().mo345w();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo289B().mo328E(charSequence);
    }

    public void openOptionsMenu() {
        ActionBar C = mo290C();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (C == null || !C.mo261q()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        m246q();
        mo289B().mo324A(i);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        mo289B().mo327D(i);
    }

    public void setContentView(View view) {
        m246q();
        mo289B().mo325B(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m246q();
        mo289B().mo326C(view, layoutParams);
    }
}
