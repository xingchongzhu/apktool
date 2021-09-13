package p010b.p034g.p043k;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.Objects;

/* renamed from: b.g.k.t */
public final class OneShotPreDrawListener implements OnPreDrawListener, OnAttachStateChangeListener {

    /* renamed from: a */
    private final View f4732a;

    /* renamed from: b */
    private ViewTreeObserver f4733b;

    /* renamed from: c */
    private final Runnable f4734c;

    private OneShotPreDrawListener(View view, Runnable runnable) {
        this.f4732a = view;
        this.f4733b = view.getViewTreeObserver();
        this.f4734c = runnable;
    }

    /* renamed from: a */
    public static OneShotPreDrawListener m5506a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        OneShotPreDrawListener tVar = new OneShotPreDrawListener(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(tVar);
        view.addOnAttachStateChangeListener(tVar);
        return tVar;
    }

    /* renamed from: b */
    public void mo5146b() {
        if (this.f4733b.isAlive()) {
            this.f4733b.removeOnPreDrawListener(this);
        } else {
            this.f4732a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f4732a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo5146b();
        this.f4734c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f4733b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo5146b();
    }
}
