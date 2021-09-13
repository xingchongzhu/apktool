package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController.C0049f;
import p010b.p011a.C0502a;

/* renamed from: androidx.appcompat.app.b */
public class AlertDialog extends AppCompatDialog implements DialogInterface {

    /* renamed from: c */
    final AlertController f273c = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.b$a */
    /* compiled from: AlertDialog */
    public static class C0060a {

        /* renamed from: a */
        private final C0049f f274a;

        /* renamed from: b */
        private final int f275b;

        public C0060a(Context context) {
            this(context, AlertDialog.m237g(context, 0));
        }

        /* renamed from: a */
        public C0060a mo277a(ListAdapter listAdapter, OnClickListener onClickListener) {
            C0049f fVar = this.f274a;
            fVar.f255w = listAdapter;
            fVar.f256x = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0060a mo278b(View view) {
            this.f274a.f239g = view;
            return this;
        }

        /* renamed from: c */
        public C0060a mo279c(Drawable drawable) {
            this.f274a.f236d = drawable;
            return this;
        }

        public AlertDialog create() {
            AlertDialog bVar = new AlertDialog(this.f274a.f233a, this.f275b);
            this.f274a.mo241a(bVar.f273c);
            bVar.setCancelable(this.f274a.f250r);
            if (this.f274a.f250r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f274a.f251s);
            bVar.setOnDismissListener(this.f274a.f252t);
            OnKeyListener onKeyListener = this.f274a.f253u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        /* renamed from: d */
        public C0060a mo281d(OnKeyListener onKeyListener) {
            this.f274a.f253u = onKeyListener;
            return this;
        }

        /* renamed from: e */
        public C0060a mo282e(ListAdapter listAdapter, int i, OnClickListener onClickListener) {
            C0049f fVar = this.f274a;
            fVar.f255w = listAdapter;
            fVar.f256x = onClickListener;
            fVar.f225I = i;
            fVar.f224H = true;
            return this;
        }

        public Context getContext() {
            return this.f274a.f233a;
        }

        public C0060a setNegativeButton(int i, OnClickListener onClickListener) {
            C0049f fVar = this.f274a;
            fVar.f244l = fVar.f233a.getText(i);
            this.f274a.f246n = onClickListener;
            return this;
        }

        public C0060a setPositiveButton(int i, OnClickListener onClickListener) {
            C0049f fVar = this.f274a;
            fVar.f241i = fVar.f233a.getText(i);
            this.f274a.f243k = onClickListener;
            return this;
        }

        public C0060a setTitle(CharSequence charSequence) {
            this.f274a.f238f = charSequence;
            return this;
        }

        public C0060a setView(View view) {
            C0049f fVar = this.f274a;
            fVar.f258z = view;
            fVar.f257y = 0;
            fVar.f221E = false;
            return this;
        }

        public C0060a(Context context, int i) {
            this.f274a = new C0049f(new ContextThemeWrapper(context, AlertDialog.m237g(context, i)));
            this.f275b = i;
        }
    }

    protected AlertDialog(Context context, int i) {
        super(context, m237g(context, i));
    }

    /* renamed from: g */
    static int m237g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0502a.f3292o, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView mo272e() {
        return this.f273c.mo221d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f273c.mo222e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f273c.mo223g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f273c.mo224h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f273c.mo230q(charSequence);
    }
}
