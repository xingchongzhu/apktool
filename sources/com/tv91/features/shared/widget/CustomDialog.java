package com.tv91.features.shared.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.p206i.Clicks;
import com.tv91.p210r.DialogTemplateBinding;
import com.tv91.utils.C3052g;

/* renamed from: com.tv91.features.shared.widget.e */
public final class CustomDialog extends Dialog {

    /* renamed from: com.tv91.features.shared.widget.e$a */
    /* compiled from: CustomDialog */
    public static class C2317a {

        /* renamed from: a */
        private final Context f14032a;

        /* renamed from: b */
        private final int f14033b;

        /* renamed from: c */
        private String f14034c;

        /* renamed from: d */
        private String f14035d;

        /* renamed from: e */
        private int f14036e;

        /* renamed from: f */
        private View f14037f;

        /* renamed from: g */
        private String f14038g;

        /* renamed from: h */
        private String f14039h;

        /* renamed from: i */
        private String f14040i;

        /* renamed from: j */
        private Runnable f14041j;

        /* renamed from: k */
        private Runnable f14042k;

        /* renamed from: l */
        private Runnable f14043l;

        /* renamed from: m */
        private Runnable f14044m;

        /* renamed from: n */
        private Runnable f14045n;

        /* renamed from: o */
        private Runnable f14046o;

        /* renamed from: p */
        private boolean f14047p;

        /* renamed from: q */
        private boolean f14048q;

        public C2317a(Context context) {
            this(context, 2131951629);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void mo16892c(CustomDialog eVar, DialogTemplateBinding qVar, View view) {
            eVar.dismiss();
            if (view == qVar.f14555f) {
                Runnable runnable = this.f14041j;
                if (runnable != null) {
                    runnable.run();
                }
            } else if (view == qVar.f14554e) {
                Runnable runnable2 = this.f14042k;
                if (runnable2 != null) {
                    runnable2.run();
                }
            } else if (view == qVar.f14553d) {
                Runnable runnable3 = this.f14043l;
                if (runnable3 != null) {
                    runnable3.run();
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void mo16893e(DialogInterface dialogInterface) {
            this.f14044m.run();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void mo16894g(DialogInterface dialogInterface) {
            this.f14046o.run();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void mo16895i(DialogInterface dialogInterface) {
            this.f14045n.run();
        }

        /* renamed from: a */
        public CustomDialog mo16891a() {
            CustomDialog eVar = new CustomDialog(this.f14032a, this.f14033b);
            LayoutInflater from = LayoutInflater.from(this.f14032a);
            DialogTemplateBinding d = DialogTemplateBinding.m17785d(from);
            eVar.setContentView(d.mo5604a());
            if (!C3052g.m20586g(this.f14034c)) {
                d.f14556g.setText(this.f14034c);
            } else {
                d.f14556g.setVisibility(8);
            }
            if (!C3052g.m20586g(this.f14035d)) {
                d.f14552c.setText(this.f14035d);
                d.f14552c.setMovementMethod(new ScrollingMovementMethod());
            } else {
                d.f14552c.setVisibility(8);
            }
            FrameLayout frameLayout = d.f14551b;
            View view = this.f14037f;
            if (view != null) {
                frameLayout.addView(view);
            }
            int i = this.f14036e;
            if (i != 0) {
                frameLayout.addView(from.inflate(i, frameLayout, false));
            }
            OnClickListener a = Clicks.m17391a(new C2313a(this, eVar, d));
            if (!C3052g.m20586g(this.f14038g)) {
                d.f14555f.setText(this.f14038g);
                d.f14555f.setOnClickListener(a);
            } else {
                d.f14555f.setVisibility(8);
            }
            if (!C3052g.m20586g(this.f14039h)) {
                d.f14554e.setText(this.f14039h);
                d.f14554e.setOnClickListener(a);
            } else {
                d.f14554e.setVisibility(8);
            }
            if (!C3052g.m20586g(this.f14040i)) {
                d.f14553d.setText(this.f14040i);
                d.f14553d.setOnClickListener(a);
            } else {
                d.f14553d.setVisibility(8);
            }
            if (this.f14044m != null) {
                eVar.setOnShowListener(new C2316d(this));
            }
            if (this.f14046o != null) {
                eVar.setOnCancelListener(new C2315c(this));
            }
            if (this.f14045n != null) {
                eVar.setOnDismissListener(new C2314b(this));
            }
            eVar.setCancelable(this.f14047p);
            eVar.setCanceledOnTouchOutside(this.f14048q);
            return eVar;
        }

        /* renamed from: j */
        public C2317a mo16896j(boolean z) {
            this.f14047p = z;
            return this;
        }

        /* renamed from: k */
        public C2317a mo16897k(boolean z) {
            this.f14048q = z;
            return this;
        }

        /* renamed from: l */
        public C2317a mo16898l(View view) {
            this.f14036e = 0;
            this.f14037f = view;
            return this;
        }

        /* renamed from: m */
        public C2317a mo16899m(int i) {
            this.f14035d = this.f14032a.getText(i).toString();
            return this;
        }

        /* renamed from: n */
        public C2317a mo16900n(String str) {
            this.f14035d = str;
            return this;
        }

        /* renamed from: o */
        public C2317a mo16901o(int i) {
            return mo16902p(i, null);
        }

        /* renamed from: p */
        public C2317a mo16902p(int i, Runnable runnable) {
            this.f14040i = this.f14032a.getText(i).toString();
            this.f14043l = runnable;
            return this;
        }

        /* renamed from: q */
        public C2317a mo16903q(int i) {
            return mo16904r(i, null);
        }

        /* renamed from: r */
        public C2317a mo16904r(int i, Runnable runnable) {
            this.f14039h = this.f14032a.getText(i).toString();
            this.f14042k = runnable;
            return this;
        }

        /* renamed from: s */
        public C2317a mo16905s(Runnable runnable) {
            this.f14046o = runnable;
            return this;
        }

        /* renamed from: t */
        public C2317a mo16906t(Runnable runnable) {
            this.f14045n = runnable;
            return this;
        }

        /* renamed from: u */
        public C2317a mo16907u(Runnable runnable) {
            this.f14044m = runnable;
            return this;
        }

        /* renamed from: v */
        public C2317a mo16908v(int i) {
            return mo16909w(i, null);
        }

        /* renamed from: w */
        public C2317a mo16909w(int i, Runnable runnable) {
            this.f14038g = this.f14032a.getText(i).toString();
            this.f14041j = runnable;
            return this;
        }

        /* renamed from: x */
        public C2317a mo16910x(int i) {
            this.f14034c = this.f14032a.getText(i).toString();
            return this;
        }

        /* renamed from: y */
        public C2317a mo16911y(String str) {
            this.f14034c = str;
            return this;
        }

        /* renamed from: z */
        public void mo16912z() {
            CustomDialog a = mo16891a();
            Window window = a.getWindow();
            if (window != null) {
                LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.height = -2;
                window.setAttributes(attributes);
            }
            a.show();
        }

        public C2317a(Context context, int i) {
            this.f14047p = true;
            this.f14048q = true;
            this.f14032a = context;
            this.f14033b = i;
        }
    }

    public CustomDialog(Context context, int i) {
        super(context, i);
    }

    /* renamed from: a */
    public static void m17423a(Context context, String str) {
        new C2317a(context).mo16910x(R.string.dialog_error_title).mo16900n(str).mo16908v(R.string.dialog_button_confirm).mo16912z();
    }

    /* renamed from: b */
    public static void m17424b(Context context, Runnable runnable) {
        new C2317a(context).mo16910x(R.string.dialog_error_title).mo16899m(R.string.E_0000001).mo16909w(R.string.dialog_button_logout, runnable).mo16912z();
    }
}
