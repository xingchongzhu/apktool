package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle.C0378c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import p010b.p025d.SimpleArrayMap;
import p010b.p034g.p043k.KeyEventDispatcher;
import p010b.p034g.p043k.KeyEventDispatcher.C0633a;

/* renamed from: androidx.core.app.f */
public class ComponentActivity extends Activity implements LifecycleOwner, C0633a {

    /* renamed from: a */
    private SimpleArrayMap<Class<?>, ?> f1978a = new SimpleArrayMap<>();

    /* renamed from: b */
    private LifecycleRegistry f1979b = new LifecycleRegistry(this);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !KeyEventDispatcher.m5328d(decorView, keyEvent)) {
            return KeyEventDispatcher.m5329e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !KeyEventDispatcher.m5328d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo432e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.m2789f(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f1979b.mo3005j(C0378c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
