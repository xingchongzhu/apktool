package p010b.p034g.p043k;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.g.k.f */
public class KeyEventDispatcher {

    /* renamed from: a */
    private static boolean f4656a = false;

    /* renamed from: b */
    private static Method f4657b = null;

    /* renamed from: c */
    private static boolean f4658c = false;

    /* renamed from: d */
    private static Field f4659d;

    /* renamed from: b.g.k.f$a */
    /* compiled from: KeyEventDispatcher */
    public interface C0633a {
        /* renamed from: e */
        boolean mo432e(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m5325a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f4656a) {
            try {
                f4657b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f4656a = true;
        }
        Method method = f4657b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m5326b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m5325a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.m5560i(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m5327c(Dialog dialog, KeyEvent keyEvent) {
        OnKeyListener f = m5330f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.m5560i(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m5328d(View view, KeyEvent keyEvent) {
        return ViewCompat.m5562j(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m5329e(C0633a aVar, View view, Callback callback, KeyEvent keyEvent) {
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 28) {
            return aVar.mo432e(keyEvent);
        }
        if (callback instanceof Activity) {
            return m5326b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m5327c((Dialog) callback, keyEvent);
        }
        if ((view != null && ViewCompat.m5560i(view, keyEvent)) || aVar.mo432e(keyEvent)) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    private static OnKeyListener m5330f(Dialog dialog) {
        if (!f4658c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f4659d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4658c = true;
        }
        Field field = f4659d;
        if (field != null) {
            try {
                return (OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
            }
        }
        return null;
    }
}
