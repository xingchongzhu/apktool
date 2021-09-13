package p010b.p034g.p043k;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets.Builder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p010b.p034g.p035d.Insets;
import p010b.p034g.p042j.ObjectsCompat;
import p010b.p034g.p042j.Preconditions;

/* renamed from: b.g.k.e0 */
public class WindowInsetsCompat {

    /* renamed from: a */
    public static final WindowInsetsCompat f4622a;

    /* renamed from: b */
    private final C0631l f4623b;

    /* renamed from: b.g.k.e0$a */
    /* compiled from: WindowInsetsCompat */
    static class C0620a {

        /* renamed from: a */
        private static Field f4624a;

        /* renamed from: b */
        private static Field f4625b;

        /* renamed from: c */
        private static Field f4626c;

        /* renamed from: d */
        private static boolean f4627d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f4624a = declaredField;
                declaredField.setAccessible(true);
                Class cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f4625b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f4626c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets from AttachInfo ");
                sb.append(e.getMessage());
                Log.w("WindowInsetsCompat", sb.toString(), e);
            }
        }

        /* renamed from: a */
        public static WindowInsetsCompat m5266a(View view) {
            if (f4627d && view.isAttachedToWindow()) {
                try {
                    Object obj = f4624a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f4625b.get(obj);
                        Rect rect2 = (Rect) f4626c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            WindowInsetsCompat a = new C0621b().mo5005b(Insets.m4973c(rect)).mo5006c(Insets.m4973c(rect2)).mo5004a();
                            a.mo5001p(a);
                            a.mo4988d(view.getRootView());
                            return a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get insets from AttachInfo. ");
                    sb.append(e.getMessage());
                    Log.w("WindowInsetsCompat", sb.toString(), e);
                }
            }
            return null;
        }
    }

    /* renamed from: b.g.k.e0$b */
    /* compiled from: WindowInsetsCompat */
    public static final class C0621b {

        /* renamed from: a */
        private final C0625f f4628a;

        public C0621b() {
            int i = VERSION.SDK_INT;
            if (i >= 30) {
                this.f4628a = new C0624e();
            } else if (i >= 29) {
                this.f4628a = new C0623d();
            } else if (i >= 20) {
                this.f4628a = new C0622c();
            } else {
                this.f4628a = new C0625f();
            }
        }

        /* renamed from: a */
        public WindowInsetsCompat mo5004a() {
            return this.f4628a.mo5007b();
        }

        @Deprecated
        /* renamed from: b */
        public C0621b mo5005b(Insets bVar) {
            this.f4628a.mo5008d(bVar);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C0621b mo5006c(Insets bVar) {
            this.f4628a.mo5009f(bVar);
            return this;
        }

        public C0621b(WindowInsetsCompat e0Var) {
            int i = VERSION.SDK_INT;
            if (i >= 30) {
                this.f4628a = new C0624e(e0Var);
            } else if (i >= 29) {
                this.f4628a = new C0623d(e0Var);
            } else if (i >= 20) {
                this.f4628a = new C0622c(e0Var);
            } else {
                this.f4628a = new C0625f(e0Var);
            }
        }
    }

    /* renamed from: b.g.k.e0$c */
    /* compiled from: WindowInsetsCompat */
    private static class C0622c extends C0625f {

        /* renamed from: c */
        private static Field f4629c = null;

        /* renamed from: d */
        private static boolean f4630d = false;

        /* renamed from: e */
        private static Constructor<WindowInsets> f4631e = null;

        /* renamed from: f */
        private static boolean f4632f = false;

        /* renamed from: g */
        private WindowInsets f4633g;

        /* renamed from: h */
        private Insets f4634h;

        C0622c() {
            this.f4633g = m5270h();
        }

        /* renamed from: h */
        private static WindowInsets m5270h() {
            String str = "WindowInsetsCompat";
            if (!f4630d) {
                try {
                    f4629c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i(str, "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f4630d = true;
            }
            Field field = f4629c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i(str, "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f4632f) {
                try {
                    f4631e = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e3) {
                    Log.i(str, "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f4632f = true;
            }
            Constructor<WindowInsets> constructor = f4631e;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e4) {
                    Log.i(str, "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public WindowInsetsCompat mo5007b() {
            mo5013a();
            WindowInsetsCompat s = WindowInsetsCompat.m5247s(this.f4633g);
            s.mo4999n(this.f4637b);
            s.mo5002q(this.f4634h);
            return s;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo5008d(Insets bVar) {
            this.f4634h = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo5009f(Insets bVar) {
            WindowInsets windowInsets = this.f4633g;
            if (windowInsets != null) {
                this.f4633g = windowInsets.replaceSystemWindowInsets(bVar.f4456b, bVar.f4457c, bVar.f4458d, bVar.f4459e);
            }
        }

        C0622c(WindowInsetsCompat e0Var) {
            this.f4633g = e0Var.mo5003r();
        }
    }

    /* renamed from: b.g.k.e0$d */
    /* compiled from: WindowInsetsCompat */
    private static class C0623d extends C0625f {

        /* renamed from: c */
        final Builder f4635c;

        C0623d() {
            this.f4635c = new Builder();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public WindowInsetsCompat mo5007b() {
            mo5013a();
            WindowInsetsCompat s = WindowInsetsCompat.m5247s(this.f4635c.build());
            s.mo4999n(this.f4637b);
            return s;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5010c(Insets bVar) {
            this.f4635c.setMandatorySystemGestureInsets(bVar.mo4843e());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo5008d(Insets bVar) {
            this.f4635c.setStableInsets(bVar.mo4843e());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo5011e(Insets bVar) {
            this.f4635c.setSystemGestureInsets(bVar.mo4843e());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo5009f(Insets bVar) {
            this.f4635c.setSystemWindowInsets(bVar.mo4843e());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo5012g(Insets bVar) {
            this.f4635c.setTappableElementInsets(bVar.mo4843e());
        }

        C0623d(WindowInsetsCompat e0Var) {
            Builder builder;
            WindowInsets r = e0Var.mo5003r();
            if (r != null) {
                builder = new Builder(r);
            } else {
                builder = new Builder();
            }
            this.f4635c = builder;
        }
    }

    /* renamed from: b.g.k.e0$e */
    /* compiled from: WindowInsetsCompat */
    private static class C0624e extends C0623d {
        C0624e() {
        }

        C0624e(WindowInsetsCompat e0Var) {
            super(e0Var);
        }
    }

    /* renamed from: b.g.k.e0$f */
    /* compiled from: WindowInsetsCompat */
    private static class C0625f {

        /* renamed from: a */
        private final WindowInsetsCompat f4636a;

        /* renamed from: b */
        Insets[] f4637b;

        C0625f() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo5013a() {
            Insets[] bVarArr = this.f4637b;
            if (bVarArr != null) {
                Insets bVar = bVarArr[C0632m.m5324a(1)];
                Insets bVar2 = this.f4637b[C0632m.m5324a(2)];
                if (bVar != null && bVar2 != null) {
                    mo5009f(Insets.m4971a(bVar, bVar2));
                } else if (bVar != null) {
                    mo5009f(bVar);
                } else if (bVar2 != null) {
                    mo5009f(bVar2);
                }
                Insets bVar3 = this.f4637b[C0632m.m5324a(16)];
                if (bVar3 != null) {
                    mo5011e(bVar3);
                }
                Insets bVar4 = this.f4637b[C0632m.m5324a(32)];
                if (bVar4 != null) {
                    mo5010c(bVar4);
                }
                Insets bVar5 = this.f4637b[C0632m.m5324a(64)];
                if (bVar5 != null) {
                    mo5012g(bVar5);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public WindowInsetsCompat mo5007b() {
            mo5013a();
            return this.f4636a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5010c(Insets bVar) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo5008d(Insets bVar) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo5011e(Insets bVar) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo5009f(Insets bVar) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo5012g(Insets bVar) {
        }

        C0625f(WindowInsetsCompat e0Var) {
            this.f4636a = e0Var;
        }
    }

    /* renamed from: b.g.k.e0$g */
    /* compiled from: WindowInsetsCompat */
    private static class C0626g extends C0631l {

        /* renamed from: c */
        private static boolean f4638c = false;

        /* renamed from: d */
        private static Method f4639d;

        /* renamed from: e */
        private static Class<?> f4640e;

        /* renamed from: f */
        private static Class<?> f4641f;

        /* renamed from: g */
        private static Field f4642g;

        /* renamed from: h */
        private static Field f4643h;

        /* renamed from: i */
        final WindowInsets f4644i;

        /* renamed from: j */
        private Insets[] f4645j;

        /* renamed from: k */
        private Insets f4646k;

        /* renamed from: l */
        private WindowInsetsCompat f4647l;

        /* renamed from: m */
        Insets f4648m;

        C0626g(WindowInsetsCompat e0Var, WindowInsets windowInsets) {
            super(e0Var);
            this.f4646k = null;
            this.f4644i = windowInsets;
        }

        /* renamed from: q */
        private Insets m5287q(View view) {
            String str = "WindowInsetsCompat";
            if (VERSION.SDK_INT < 30) {
                if (!f4638c) {
                    m5288r();
                }
                Method method = f4639d;
                Insets bVar = null;
                if (!(method == null || f4641f == null || f4642g == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w(str, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f4642g.get(f4643h.get(invoke));
                        if (rect != null) {
                            bVar = Insets.m4973c(rect);
                        }
                        return bVar;
                    } catch (ReflectiveOperationException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to get visible insets. (Reflection error). ");
                        sb.append(e.getMessage());
                        Log.e(str, sb.toString(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: r */
        private static void m5288r() {
            try {
                f4639d = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f4640e = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f4641f = cls;
                f4642g = cls.getDeclaredField("mVisibleInsets");
                f4643h = f4640e.getDeclaredField("mAttachInfo");
                f4642g.setAccessible(true);
                f4643h.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets. (Reflection error). ");
                sb.append(e.getMessage());
                Log.e("WindowInsetsCompat", sb.toString(), e);
            }
            f4638c = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo5014d(View view) {
            Insets q = m5287q(view);
            if (q == null) {
                q = Insets.f4455a;
            }
            mo5021n(q);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo5015e(WindowInsetsCompat e0Var) {
            e0Var.mo5001p(this.f4647l);
            e0Var.mo5000o(this.f4648m);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f4648m, ((C0626g) obj).f4648m);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public final Insets mo5017i() {
            if (this.f4646k == null) {
                this.f4646k = Insets.m4972b(this.f4644i.getSystemWindowInsetLeft(), this.f4644i.getSystemWindowInsetTop(), this.f4644i.getSystemWindowInsetRight(), this.f4644i.getSystemWindowInsetBottom());
            }
            return this.f4646k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public WindowInsetsCompat mo5018j(int i, int i2, int i3, int i4) {
            C0621b bVar = new C0621b(WindowInsetsCompat.m5247s(this.f4644i));
            bVar.mo5006c(WindowInsetsCompat.m5246k(mo5017i(), i, i2, i3, i4));
            bVar.mo5005b(WindowInsetsCompat.m5246k(mo5025h(), i, i2, i3, i4));
            return bVar.mo5004a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public boolean mo5019l() {
            return this.f4644i.isRound();
        }

        /* renamed from: m */
        public void mo5020m(Insets[] bVarArr) {
            this.f4645j = bVarArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public void mo5021n(Insets bVar) {
            this.f4648m = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public void mo5022o(WindowInsetsCompat e0Var) {
            this.f4647l = e0Var;
        }

        C0626g(WindowInsetsCompat e0Var, C0626g gVar) {
            this(e0Var, new WindowInsets(gVar.f4644i));
        }
    }

    /* renamed from: b.g.k.e0$h */
    /* compiled from: WindowInsetsCompat */
    private static class C0627h extends C0626g {

        /* renamed from: n */
        private Insets f4649n = null;

        C0627h(WindowInsetsCompat e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public WindowInsetsCompat mo5023b() {
            return WindowInsetsCompat.m5247s(this.f4644i.consumeStableInsets());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public WindowInsetsCompat mo5024c() {
            return WindowInsetsCompat.m5247s(this.f4644i.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public final Insets mo5025h() {
            if (this.f4649n == null) {
                this.f4649n = Insets.m4972b(this.f4644i.getStableInsetLeft(), this.f4644i.getStableInsetTop(), this.f4644i.getStableInsetRight(), this.f4644i.getStableInsetBottom());
            }
            return this.f4649n;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public boolean mo5026k() {
            return this.f4644i.isConsumed();
        }

        /* renamed from: p */
        public void mo5027p(Insets bVar) {
            this.f4649n = bVar;
        }

        C0627h(WindowInsetsCompat e0Var, C0627h hVar) {
            super(e0Var, (C0626g) hVar);
            this.f4649n = hVar.f4649n;
        }
    }

    /* renamed from: b.g.k.e0$i */
    /* compiled from: WindowInsetsCompat */
    private static class C0628i extends C0627h {
        C0628i(WindowInsetsCompat e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public WindowInsetsCompat mo5028a() {
            return WindowInsetsCompat.m5247s(this.f4644i.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0628i)) {
                return false;
            }
            C0628i iVar = (C0628i) obj;
            if (!Objects.equals(this.f4644i, iVar.f4644i) || !Objects.equals(this.f4648m, iVar.f4648m)) {
                z = false;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public DisplayCutoutCompat mo5029f() {
            return DisplayCutoutCompat.m5242a(this.f4644i.getDisplayCutout());
        }

        public int hashCode() {
            return this.f4644i.hashCode();
        }

        C0628i(WindowInsetsCompat e0Var, C0628i iVar) {
            super(e0Var, (C0627h) iVar);
        }
    }

    /* renamed from: b.g.k.e0$j */
    /* compiled from: WindowInsetsCompat */
    private static class C0629j extends C0628i {

        /* renamed from: o */
        private Insets f4650o = null;

        /* renamed from: p */
        private Insets f4651p = null;

        /* renamed from: q */
        private Insets f4652q = null;

        C0629j(WindowInsetsCompat e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public Insets mo5031g() {
            if (this.f4651p == null) {
                this.f4651p = Insets.m4974d(this.f4644i.getMandatorySystemGestureInsets());
            }
            return this.f4651p;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public WindowInsetsCompat mo5018j(int i, int i2, int i3, int i4) {
            return WindowInsetsCompat.m5247s(this.f4644i.inset(i, i2, i3, i4));
        }

        /* renamed from: p */
        public void mo5027p(Insets bVar) {
        }

        C0629j(WindowInsetsCompat e0Var, C0629j jVar) {
            super(e0Var, (C0628i) jVar);
        }
    }

    /* renamed from: b.g.k.e0$k */
    /* compiled from: WindowInsetsCompat */
    private static class C0630k extends C0629j {

        /* renamed from: r */
        static final WindowInsetsCompat f4653r = WindowInsetsCompat.m5247s(WindowInsets.CONSUMED);

        C0630k(WindowInsetsCompat e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo5014d(View view) {
        }

        C0630k(WindowInsetsCompat e0Var, C0630k kVar) {
            super(e0Var, (C0629j) kVar);
        }
    }

    /* renamed from: b.g.k.e0$l */
    /* compiled from: WindowInsetsCompat */
    private static class C0631l {

        /* renamed from: a */
        static final WindowInsetsCompat f4654a = new C0621b().mo5004a().mo4985a().mo4986b().mo4987c();

        /* renamed from: b */
        final WindowInsetsCompat f4655b;

        C0631l(WindowInsetsCompat e0Var) {
            this.f4655b = e0Var;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public WindowInsetsCompat mo5028a() {
            return this.f4655b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public WindowInsetsCompat mo5023b() {
            return this.f4655b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public WindowInsetsCompat mo5024c() {
            return this.f4655b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo5014d(View view) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo5015e(WindowInsetsCompat e0Var) {
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0631l)) {
                return false;
            }
            C0631l lVar = (C0631l) obj;
            if (mo5019l() != lVar.mo5019l() || mo5026k() != lVar.mo5026k() || !ObjectsCompat.m5175a(mo5017i(), lVar.mo5017i()) || !ObjectsCompat.m5175a(mo5025h(), lVar.mo5025h()) || !ObjectsCompat.m5175a(mo5029f(), lVar.mo5029f())) {
                z = false;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public DisplayCutoutCompat mo5029f() {
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public Insets mo5031g() {
            return mo5017i();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public Insets mo5025h() {
            return Insets.f4455a;
        }

        public int hashCode() {
            return ObjectsCompat.m5176b(Boolean.valueOf(mo5019l()), Boolean.valueOf(mo5026k()), mo5017i(), mo5025h(), mo5029f());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public Insets mo5017i() {
            return Insets.f4455a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public WindowInsetsCompat mo5018j(int i, int i2, int i3, int i4) {
            return f4654a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public boolean mo5026k() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public boolean mo5019l() {
            return false;
        }

        /* renamed from: m */
        public void mo5020m(Insets[] bVarArr) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public void mo5021n(Insets bVar) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public void mo5022o(WindowInsetsCompat e0Var) {
        }

        /* renamed from: p */
        public void mo5027p(Insets bVar) {
        }
    }

    /* renamed from: b.g.k.e0$m */
    /* compiled from: WindowInsetsCompat */
    public static final class C0632m {
        /* renamed from: a */
        static int m5324a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("type needs to be >= FIRST and <= LAST, type=");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static {
        if (VERSION.SDK_INT >= 30) {
            f4622a = C0630k.f4653r;
        } else {
            f4622a = C0631l.f4654a;
        }
    }

    private WindowInsetsCompat(WindowInsets windowInsets) {
        int i = VERSION.SDK_INT;
        if (i >= 30) {
            this.f4623b = new C0630k(this, windowInsets);
        } else if (i >= 29) {
            this.f4623b = new C0629j(this, windowInsets);
        } else if (i >= 28) {
            this.f4623b = new C0628i(this, windowInsets);
        } else if (i >= 21) {
            this.f4623b = new C0627h(this, windowInsets);
        } else if (i >= 20) {
            this.f4623b = new C0626g(this, windowInsets);
        } else {
            this.f4623b = new C0631l(this);
        }
    }

    /* renamed from: k */
    static Insets m5246k(Insets bVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bVar.f4456b - i);
        int max2 = Math.max(0, bVar.f4457c - i2);
        int max3 = Math.max(0, bVar.f4458d - i3);
        int max4 = Math.max(0, bVar.f4459e - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return bVar;
        }
        return Insets.m4972b(max, max2, max3, max4);
    }

    /* renamed from: s */
    public static WindowInsetsCompat m5247s(WindowInsets windowInsets) {
        return m5248t(windowInsets, null);
    }

    /* renamed from: t */
    public static WindowInsetsCompat m5248t(WindowInsets windowInsets, View view) {
        WindowInsetsCompat e0Var = new WindowInsetsCompat((WindowInsets) Preconditions.m5188e(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            e0Var.mo5001p(ViewCompat.m5527J(view));
            e0Var.mo4988d(view.getRootView());
        }
        return e0Var;
    }

    @Deprecated
    /* renamed from: a */
    public WindowInsetsCompat mo4985a() {
        return this.f4623b.mo5028a();
    }

    @Deprecated
    /* renamed from: b */
    public WindowInsetsCompat mo4986b() {
        return this.f4623b.mo5023b();
    }

    @Deprecated
    /* renamed from: c */
    public WindowInsetsCompat mo4987c() {
        return this.f4623b.mo5024c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4988d(View view) {
        this.f4623b.mo5014d(view);
    }

    @Deprecated
    /* renamed from: e */
    public Insets mo4989e() {
        return this.f4623b.mo5031g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return ObjectsCompat.m5175a(this.f4623b, ((WindowInsetsCompat) obj).f4623b);
    }

    @Deprecated
    /* renamed from: f */
    public int mo4991f() {
        return this.f4623b.mo5017i().f4459e;
    }

    @Deprecated
    /* renamed from: g */
    public int mo4992g() {
        return this.f4623b.mo5017i().f4456b;
    }

    @Deprecated
    /* renamed from: h */
    public int mo4993h() {
        return this.f4623b.mo5017i().f4458d;
    }

    public int hashCode() {
        C0631l lVar = this.f4623b;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int mo4995i() {
        return this.f4623b.mo5017i().f4457c;
    }

    /* renamed from: j */
    public WindowInsetsCompat mo4996j(int i, int i2, int i3, int i4) {
        return this.f4623b.mo5018j(i, i2, i3, i4);
    }

    /* renamed from: l */
    public boolean mo4997l() {
        return this.f4623b.mo5026k();
    }

    @Deprecated
    /* renamed from: m */
    public WindowInsetsCompat mo4998m(int i, int i2, int i3, int i4) {
        return new C0621b(this).mo5006c(Insets.m4972b(i, i2, i3, i4)).mo5004a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo4999n(Insets[] bVarArr) {
        this.f4623b.mo5020m(bVarArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo5000o(Insets bVar) {
        this.f4623b.mo5021n(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo5001p(WindowInsetsCompat e0Var) {
        this.f4623b.mo5022o(e0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo5002q(Insets bVar) {
        this.f4623b.mo5027p(bVar);
    }

    /* renamed from: r */
    public WindowInsets mo5003r() {
        C0631l lVar = this.f4623b;
        if (lVar instanceof C0626g) {
            return ((C0626g) lVar).f4644i;
        }
        return null;
    }

    public WindowInsetsCompat(WindowInsetsCompat e0Var) {
        if (e0Var != null) {
            C0631l lVar = e0Var.f4623b;
            int i = VERSION.SDK_INT;
            if (i >= 30 && (lVar instanceof C0630k)) {
                this.f4623b = new C0630k(this, (C0630k) lVar);
            } else if (i >= 29 && (lVar instanceof C0629j)) {
                this.f4623b = new C0629j(this, (C0629j) lVar);
            } else if (i >= 28 && (lVar instanceof C0628i)) {
                this.f4623b = new C0628i(this, (C0628i) lVar);
            } else if (i >= 21 && (lVar instanceof C0627h)) {
                this.f4623b = new C0627h(this, (C0627h) lVar);
            } else if (i < 20 || !(lVar instanceof C0626g)) {
                this.f4623b = new C0631l(this);
            } else {
                this.f4623b = new C0626g(this, (C0626g) lVar);
            }
            lVar.mo5015e(this);
            return;
        }
        this.f4623b = new C0631l(this);
    }
}
