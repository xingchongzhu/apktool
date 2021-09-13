package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.MenuPresenter.C0111a;
import p010b.p034g.p043k.ViewPropertyAnimatorCompat;

/* renamed from: androidx.appcompat.widget.e0 */
public interface DecorToolbar {
    /* renamed from: a */
    void mo1397a(Menu menu, C0111a aVar);

    /* renamed from: b */
    boolean mo1398b();

    /* renamed from: c */
    void mo1399c();

    void collapseActionView();

    /* renamed from: d */
    boolean mo1401d();

    /* renamed from: e */
    boolean mo1402e();

    /* renamed from: f */
    boolean mo1403f();

    /* renamed from: g */
    boolean mo1404g();

    CharSequence getTitle();

    /* renamed from: h */
    void mo1406h();

    /* renamed from: i */
    void mo1407i(int i);

    /* renamed from: j */
    void mo1408j(ScrollingTabContainerView q0Var);

    /* renamed from: k */
    ViewGroup mo1409k();

    /* renamed from: l */
    void mo1410l(boolean z);

    /* renamed from: m */
    Context mo1411m();

    /* renamed from: n */
    boolean mo1412n();

    /* renamed from: o */
    void mo1413o(int i);

    /* renamed from: p */
    int mo1414p();

    /* renamed from: q */
    void mo1415q(int i);

    /* renamed from: r */
    int mo1416r();

    /* renamed from: s */
    ViewPropertyAnimatorCompat mo1417s(int i, long j);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setWindowCallback(Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    void mo1422t();

    /* renamed from: u */
    void mo1423u();

    /* renamed from: v */
    void mo1424v(boolean z);
}
