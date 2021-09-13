package com.tv91.features.shared.p206i;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.core.content.ContextCompat;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.features.shared.i.f */
public final class Editors {

    /* renamed from: com.tv91.features.shared.i.f$b */
    /* compiled from: Editors */
    private static class C2308b implements OnEditorActionListener {

        /* renamed from: a */
        private final int f14000a;

        /* renamed from: b */
        private final int f14001b;

        /* renamed from: c */
        private final Consumer<TextView> f14002c;

        /* renamed from: a */
        private void m17396a(Context context, View view) {
            InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.m1761g(context, InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
            }
        }

        /* renamed from: b */
        static /* synthetic */ void m17397b(TextView textView) {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != this.f14000a && (keyEvent == null || keyEvent.getKeyCode() != this.f14001b)) {
                return false;
            }
            m17396a(textView.getContext(), textView);
            this.f14002c.mo4887a(textView);
            return true;
        }

        private C2308b(int i, Consumer<TextView> aVar) {
            this.f14000a = i;
            this.f14001b = 66;
            if (aVar == null) {
                aVar = C2302b.f13993a;
            }
            this.f14002c = aVar;
        }
    }

    /* renamed from: a */
    public static OnEditorActionListener m17393a(Consumer<TextView> aVar) {
        return new C2308b(6, aVar);
    }

    /* renamed from: b */
    public static OnEditorActionListener m17394b(Consumer<TextView> aVar) {
        return new C2308b(3, aVar);
    }

    /* renamed from: c */
    public static OnEditorActionListener m17395c(Consumer<TextView> aVar) {
        return new C2308b(4, aVar);
    }
}
