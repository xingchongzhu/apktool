package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.MenuPresenter.C0111a;
import p010b.p034g.p043k.GravityCompat;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.appcompat.view.menu.l */
public class MenuPopupHelper {

    /* renamed from: a */
    private final Context f649a;

    /* renamed from: b */
    private final MenuBuilder f650b;

    /* renamed from: c */
    private final boolean f651c;

    /* renamed from: d */
    private final int f652d;

    /* renamed from: e */
    private final int f653e;

    /* renamed from: f */
    private View f654f;

    /* renamed from: g */
    private int f655g;

    /* renamed from: h */
    private boolean f656h;

    /* renamed from: i */
    private C0111a f657i;

    /* renamed from: j */
    private MenuPopup f658j;

    /* renamed from: k */
    private OnDismissListener f659k;

    /* renamed from: l */
    private final OnDismissListener f660l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* compiled from: MenuPopupHelper */
    class C0110a implements OnDismissListener {
        C0110a() {
        }

        public void onDismiss() {
            MenuPopupHelper.this.mo858e();
        }
    }

    public MenuPopupHelper(Context context, MenuBuilder gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r7v0, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v12, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [androidx.appcompat.view.menu.q]
  assigns: [androidx.appcompat.view.menu.q, androidx.appcompat.view.menu.d]
  uses: [androidx.appcompat.view.menu.q, androidx.appcompat.view.menu.k, androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.d]
  mth insns count: 49
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.MenuPopup m730a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f649a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f649a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p010b.p011a.C0505d.f3313c
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f649a
            android.view.View r3 = r14.f654f
            int r4 = r14.f652d
            int r5 = r14.f653e
            boolean r6 = r14.f651c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r8 = r14.f649a
            androidx.appcompat.view.menu.g r9 = r14.f650b
            android.view.View r10 = r14.f654f
            int r11 = r14.f652d
            int r12 = r14.f653e
            boolean r13 = r14.f651c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.f650b
            r0.mo607l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f660l
            r0.mo615u(r1)
            android.view.View r1 = r14.f654f
            r0.mo611p(r1)
            androidx.appcompat.view.menu.m$a r1 = r14.f657i
            r0.mo590k(r1)
            boolean r1 = r14.f656h
            r0.mo612r(r1)
            int r1 = r14.f655g
            r0.mo613s(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.MenuPopupHelper.m730a():androidx.appcompat.view.menu.k");
    }

    /* renamed from: l */
    private void m731l(int i, int i2, boolean z, boolean z2) {
        MenuPopup c = mo856c();
        c.mo616v(z2);
        if (z) {
            if ((GravityCompat.m5245b(this.f655g, ViewCompat.m5514C(this.f654f)) & 7) == 5) {
                i -= this.f654f.getWidth();
            }
            c.mo614t(i);
            c.mo617w(i2);
            int i3 = (int) ((this.f649a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo854q(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.mo604e();
    }

    /* renamed from: b */
    public void mo855b() {
        if (mo857d()) {
            this.f658j.dismiss();
        }
    }

    /* renamed from: c */
    public MenuPopup mo856c() {
        if (this.f658j == null) {
            this.f658j = m730a();
        }
        return this.f658j;
    }

    /* renamed from: d */
    public boolean mo857d() {
        MenuPopup kVar = this.f658j;
        return kVar != null && kVar.mo602c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo858e() {
        this.f658j = null;
        OnDismissListener onDismissListener = this.f659k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void mo859f(View view) {
        this.f654f = view;
    }

    /* renamed from: g */
    public void mo860g(boolean z) {
        this.f656h = z;
        MenuPopup kVar = this.f658j;
        if (kVar != null) {
            kVar.mo612r(z);
        }
    }

    /* renamed from: h */
    public void mo861h(int i) {
        this.f655g = i;
    }

    /* renamed from: i */
    public void mo862i(OnDismissListener onDismissListener) {
        this.f659k = onDismissListener;
    }

    /* renamed from: j */
    public void mo863j(C0111a aVar) {
        this.f657i = aVar;
        MenuPopup kVar = this.f658j;
        if (kVar != null) {
            kVar.mo590k(aVar);
        }
    }

    /* renamed from: k */
    public void mo864k() {
        if (!mo865m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean mo865m() {
        if (mo857d()) {
            return true;
        }
        if (this.f654f == null) {
            return false;
        }
        m731l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean mo866n(int i, int i2) {
        if (mo857d()) {
            return true;
        }
        if (this.f654f == null) {
            return false;
        }
        m731l(i, i2, true, true);
        return true;
    }

    public MenuPopupHelper(Context context, MenuBuilder gVar, View view, boolean z, int i, int i2) {
        this.f655g = 8388611;
        this.f660l = new C0110a();
        this.f649a = context;
        this.f650b = gVar;
        this.f654f = view;
        this.f651c = z;
        this.f652d = i;
        this.f653e = i2;
    }
}
