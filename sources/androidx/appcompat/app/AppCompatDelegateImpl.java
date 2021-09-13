package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.C0102a;
import androidx.appcompat.view.menu.MenuPresenter.C0111a;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ContentFrameLayout.C0126a;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.FitWindowsViewGroup.C0169a;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewUtils;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.p007c.ResourcesCompat.C0260b;
import androidx.lifecycle.Lifecycle.C0378c;
import androidx.lifecycle.LifecycleOwner;
import com.p259uc.crashsdk.export.LogType;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p010b.p011a.C0502a;
import p010b.p011a.C0504c;
import p010b.p011a.C0507f;
import p010b.p011a.C0508g;
import p010b.p011a.C0510i;
import p010b.p011a.C0511j;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p011a.p017n.ActionMode;
import p010b.p011a.p017n.ActionMode.C0527a;
import p010b.p011a.p017n.SupportActionModeWrapper.C0528a;
import p010b.p011a.p017n.SupportMenuInflater;
import p010b.p011a.p017n.WindowCallbackWrapper;
import p010b.p025d.SimpleArrayMap;
import p010b.p034g.p042j.ObjectsCompat;
import p010b.p034g.p043k.KeyEventDispatcher;
import p010b.p034g.p043k.KeyEventDispatcher.C0633a;
import p010b.p034g.p043k.LayoutInflaterCompat;
import p010b.p034g.p043k.OnApplyWindowInsetsListener;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.ViewPropertyAnimatorCompat;
import p010b.p034g.p043k.ViewPropertyAnimatorListenerAdapter;
import p010b.p034g.p043k.WindowInsetsCompat;

/* renamed from: androidx.appcompat.app.f */
class AppCompatDelegateImpl extends AppCompatDelegate implements C0102a, Factory2 {

    /* renamed from: d */
    private static final SimpleArrayMap<String, Integer> f283d = new SimpleArrayMap<>();

    /* renamed from: e */
    private static final boolean f284e;

    /* renamed from: f */
    private static final int[] f285f = {16842836};

    /* renamed from: g */
    private static final boolean f286g = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: h */
    private static final boolean f287h;

    /* renamed from: i */
    private static boolean f288i = true;

    /* renamed from: A */
    private boolean f289A;

    /* renamed from: B */
    ViewGroup f290B;

    /* renamed from: C */
    private TextView f291C;

    /* renamed from: D */
    private View f292D;

    /* renamed from: G */
    private boolean f293G;

    /* renamed from: H */
    private boolean f294H;

    /* renamed from: I */
    boolean f295I;

    /* renamed from: J */
    boolean f296J;

    /* renamed from: K */
    boolean f297K;

    /* renamed from: L */
    boolean f298L;

    /* renamed from: M */
    boolean f299M;

    /* renamed from: N */
    private boolean f300N;

    /* renamed from: O */
    private C0085t[] f301O;

    /* renamed from: P */
    private C0085t f302P;

    /* renamed from: Q */
    private boolean f303Q;

    /* renamed from: R */
    private boolean f304R;

    /* renamed from: S */
    private boolean f305S;

    /* renamed from: T */
    private boolean f306T;

    /* renamed from: U */
    boolean f307U;

    /* renamed from: V */
    private int f308V;

    /* renamed from: W */
    private int f309W;

    /* renamed from: X */
    private boolean f310X;

    /* renamed from: Y */
    private boolean f311Y;

    /* renamed from: Z */
    private C0080p f312Z;

    /* renamed from: a0 */
    private C0080p f313a0;

    /* renamed from: b0 */
    boolean f314b0;

    /* renamed from: c0 */
    int f315c0;

    /* renamed from: d0 */
    private final Runnable f316d0;

    /* renamed from: e0 */
    private boolean f317e0;

    /* renamed from: f0 */
    private Rect f318f0;

    /* renamed from: g0 */
    private Rect f319g0;

    /* renamed from: h0 */
    private AppCompatViewInflater f320h0;

    /* renamed from: i0 */
    private LayoutIncludeDetector f321i0;

    /* renamed from: j */
    final Object f322j;

    /* renamed from: k */
    final Context f323k;

    /* renamed from: l */
    Window f324l;

    /* renamed from: m */
    private C0078n f325m;

    /* renamed from: n */
    final AppCompatCallback f326n;

    /* renamed from: o */
    ActionBar f327o;

    /* renamed from: p */
    MenuInflater f328p;

    /* renamed from: q */
    private CharSequence f329q;

    /* renamed from: r */
    private DecorContentParent f330r;

    /* renamed from: s */
    private C0071h f331s;

    /* renamed from: t */
    private C0086u f332t;

    /* renamed from: u */
    ActionMode f333u;

    /* renamed from: v */
    ActionBarContextView f334v;

    /* renamed from: w */
    PopupWindow f335w;

    /* renamed from: x */
    Runnable f336x;

    /* renamed from: y */
    ViewPropertyAnimatorCompat f337y;

    /* renamed from: z */
    private boolean f338z;

    /* renamed from: androidx.appcompat.app.f$a */
    /* compiled from: AppCompatDelegateImpl */
    class C0063a implements UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ UncaughtExceptionHandler f339a;

        C0063a(UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f339a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m379a(Throwable th) {
            if (!(th instanceof NotFoundException)) {
                return false;
            }
            String message = th.getMessage();
            if (message == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m379a(th)) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getMessage());
                sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                NotFoundException notFoundException = new NotFoundException(sb.toString());
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f339a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f339a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.f$b */
    /* compiled from: AppCompatDelegateImpl */
    class C0064b implements Runnable {
        C0064b() {
        }

        public void run() {
            AppCompatDelegateImpl fVar = AppCompatDelegateImpl.this;
            if ((fVar.f315c0 & 1) != 0) {
                fVar.mo359U(0);
            }
            AppCompatDelegateImpl fVar2 = AppCompatDelegateImpl.this;
            if ((fVar2.f315c0 & 4096) != 0) {
                fVar2.mo359U(108);
            }
            AppCompatDelegateImpl fVar3 = AppCompatDelegateImpl.this;
            fVar3.f314b0 = false;
            fVar3.f315c0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.f$c */
    /* compiled from: AppCompatDelegateImpl */
    class C0065c implements OnApplyWindowInsetsListener {
        C0065c() {
        }

        /* renamed from: a */
        public WindowInsetsCompat mo382a(View view, WindowInsetsCompat e0Var) {
            int i = e0Var.mo4995i();
            int L0 = AppCompatDelegateImpl.this.mo353L0(e0Var, null);
            if (i != L0) {
                e0Var = e0Var.mo4998m(e0Var.mo4992g(), L0, e0Var.mo4993h(), e0Var.mo4991f());
            }
            return ViewCompat.m5545a0(view, e0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.f$d */
    /* compiled from: AppCompatDelegateImpl */
    class C0066d implements C0169a {
        C0066d() {
        }

        /* renamed from: a */
        public void mo383a(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.mo353L0(null, rect);
        }
    }

    /* renamed from: androidx.appcompat.app.f$e */
    /* compiled from: AppCompatDelegateImpl */
    class C0067e implements C0126a {
        C0067e() {
        }

        /* renamed from: a */
        public void mo384a() {
        }

        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.mo357S();
        }
    }

    /* renamed from: androidx.appcompat.app.f$f */
    /* compiled from: AppCompatDelegateImpl */
    class C0068f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        /* compiled from: AppCompatDelegateImpl */
        class C0069a extends ViewPropertyAnimatorListenerAdapter {
            C0069a() {
            }

            /* renamed from: b */
            public void mo387b(View view) {
                AppCompatDelegateImpl.this.f334v.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f337y.mo4963f(null);
                AppCompatDelegateImpl.this.f337y = null;
            }

            /* renamed from: c */
            public void mo388c(View view) {
                AppCompatDelegateImpl.this.f334v.setVisibility(0);
            }
        }

        C0068f() {
        }

        public void run() {
            AppCompatDelegateImpl fVar = AppCompatDelegateImpl.this;
            fVar.f335w.showAtLocation(fVar.f334v, 55, 0, 0);
            AppCompatDelegateImpl.this.mo360V();
            if (AppCompatDelegateImpl.this.mo347D0()) {
                AppCompatDelegateImpl.this.f334v.setAlpha(0.0f);
                AppCompatDelegateImpl fVar2 = AppCompatDelegateImpl.this;
                fVar2.f337y = ViewCompat.m5550d(fVar2.f334v).mo4958a(1.0f);
                AppCompatDelegateImpl.this.f337y.mo4963f(new C0069a());
                return;
            }
            AppCompatDelegateImpl.this.f334v.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f334v.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.f$g */
    /* compiled from: AppCompatDelegateImpl */
    class C0070g extends ViewPropertyAnimatorListenerAdapter {
        C0070g() {
        }

        /* renamed from: b */
        public void mo387b(View view) {
            AppCompatDelegateImpl.this.f334v.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f337y.mo4963f(null);
            AppCompatDelegateImpl.this.f337y = null;
        }

        /* renamed from: c */
        public void mo388c(View view) {
            AppCompatDelegateImpl.this.f334v.setVisibility(0);
            AppCompatDelegateImpl.this.f334v.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.f334v.getParent() instanceof View) {
                ViewCompat.m5567l0((View) AppCompatDelegateImpl.this.f334v.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$h */
    /* compiled from: AppCompatDelegateImpl */
    private final class C0071h implements C0111a {
        C0071h() {
        }

        /* renamed from: a */
        public void mo389a(MenuBuilder gVar, boolean z) {
            AppCompatDelegateImpl.this.mo352L(gVar);
        }

        /* renamed from: b */
        public boolean mo390b(MenuBuilder gVar) {
            Callback f0 = AppCompatDelegateImpl.this.mo367f0();
            if (f0 != null) {
                f0.onMenuOpened(108, gVar);
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.f$i */
    /* compiled from: AppCompatDelegateImpl */
    class C0072i implements C0527a {

        /* renamed from: a */
        private C0527a f348a;

        /* renamed from: androidx.appcompat.app.f$i$a */
        /* compiled from: AppCompatDelegateImpl */
        class C0073a extends ViewPropertyAnimatorListenerAdapter {
            C0073a() {
            }

            /* renamed from: b */
            public void mo387b(View view) {
                AppCompatDelegateImpl.this.f334v.setVisibility(8);
                AppCompatDelegateImpl fVar = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = fVar.f335w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f334v.getParent() instanceof View) {
                    ViewCompat.m5567l0((View) AppCompatDelegateImpl.this.f334v.getParent());
                }
                AppCompatDelegateImpl.this.f334v.mo943k();
                AppCompatDelegateImpl.this.f337y.mo4963f(null);
                AppCompatDelegateImpl fVar2 = AppCompatDelegateImpl.this;
                fVar2.f337y = null;
                ViewCompat.m5567l0(fVar2.f290B);
            }
        }

        public C0072i(C0527a aVar) {
            this.f348a = aVar;
        }

        /* renamed from: a */
        public boolean mo391a(ActionMode bVar, Menu menu) {
            ViewCompat.m5567l0(AppCompatDelegateImpl.this.f290B);
            return this.f348a.mo391a(bVar, menu);
        }

        /* renamed from: b */
        public void mo392b(ActionMode bVar) {
            this.f348a.mo392b(bVar);
            AppCompatDelegateImpl fVar = AppCompatDelegateImpl.this;
            if (fVar.f335w != null) {
                fVar.f324l.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f336x);
            }
            AppCompatDelegateImpl fVar2 = AppCompatDelegateImpl.this;
            if (fVar2.f334v != null) {
                fVar2.mo360V();
                AppCompatDelegateImpl fVar3 = AppCompatDelegateImpl.this;
                fVar3.f337y = ViewCompat.m5550d(fVar3.f334v).mo4958a(0.0f);
                AppCompatDelegateImpl.this.f337y.mo4963f(new C0073a());
            }
            AppCompatDelegateImpl fVar4 = AppCompatDelegateImpl.this;
            AppCompatCallback dVar = fVar4.f326n;
            if (dVar != null) {
                dVar.mo305h(fVar4.f333u);
            }
            AppCompatDelegateImpl fVar5 = AppCompatDelegateImpl.this;
            fVar5.f333u = null;
            ViewCompat.m5567l0(fVar5.f290B);
        }

        /* renamed from: c */
        public boolean mo393c(ActionMode bVar, MenuItem menuItem) {
            return this.f348a.mo393c(bVar, menuItem);
        }

        /* renamed from: d */
        public boolean mo394d(ActionMode bVar, Menu menu) {
            return this.f348a.mo394d(bVar, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.f$j */
    /* compiled from: AppCompatDelegateImpl */
    static class C0074j {
        /* renamed from: a */
        static Context m394a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        static void m395b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$k */
    /* compiled from: AppCompatDelegateImpl */
    static class C0075k {
        /* renamed from: a */
        static boolean m396a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* renamed from: androidx.appcompat.app.f$l */
    /* compiled from: AppCompatDelegateImpl */
    static class C0076l {
        /* renamed from: a */
        static void m397a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$m */
    /* compiled from: AppCompatDelegateImpl */
    static class C0077m {
        /* renamed from: a */
        static void m398a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$n */
    /* compiled from: AppCompatDelegateImpl */
    class C0078n extends WindowCallbackWrapper {
        C0078n(Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final android.view.ActionMode mo395b(android.view.ActionMode.Callback callback) {
            C0528a aVar = new C0528a(AppCompatDelegateImpl.this.f323k, callback);
            ActionMode F0 = AppCompatDelegateImpl.this.mo349F0(aVar);
            if (F0 != null) {
                return aVar.mo4228e(F0);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo358T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.mo374r0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.mo376u0(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.mo377v0(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder gVar = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.mo668a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.mo668a0(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0085t d0 = AppCompatDelegateImpl.this.mo365d0(0, true);
            if (d0 != null) {
                MenuBuilder gVar = d0.f369j;
                if (gVar != null) {
                    super.onProvideKeyboardShortcuts(list, gVar, i);
                    return;
                }
            }
            super.onProvideKeyboardShortcuts(list, menu, i);
        }

        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
            if (VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.mo368m0()) {
                return mo395b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.mo368m0() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo395b(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.f$o */
    /* compiled from: AppCompatDelegateImpl */
    private class C0079o extends C0080p {

        /* renamed from: c */
        private final PowerManager f352c;

        C0079o(Context context) {
            super();
            this.f352c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public IntentFilter mo406b() {
            if (VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo407c() {
            if (VERSION.SDK_INT < 21 || !C0075k.m396a(this.f352c)) {
                return 1;
            }
            return 2;
        }

        /* renamed from: d */
        public void mo408d() {
            AppCompatDelegateImpl.this.mo348F();
        }
    }

    /* renamed from: androidx.appcompat.app.f$p */
    /* compiled from: AppCompatDelegateImpl */
    abstract class C0080p {

        /* renamed from: a */
        private BroadcastReceiver f354a;

        /* renamed from: androidx.appcompat.app.f$p$a */
        /* compiled from: AppCompatDelegateImpl */
        class C0081a extends BroadcastReceiver {
            C0081a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0080p.this.mo408d();
            }
        }

        C0080p() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo409a() {
            BroadcastReceiver broadcastReceiver = this.f354a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f323k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f354a = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract IntentFilter mo406b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract int mo407c();

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract void mo408d();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo410e() {
            mo409a();
            IntentFilter b = mo406b();
            if (b != null && b.countActions() != 0) {
                if (this.f354a == null) {
                    this.f354a = new C0081a();
                }
                AppCompatDelegateImpl.this.f323k.registerReceiver(this.f354a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$q */
    /* compiled from: AppCompatDelegateImpl */
    private class C0082q extends C0080p {

        /* renamed from: c */
        private final TwilightManager f357c;

        C0082q(TwilightManager lVar) {
            super();
            this.f357c = lVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public IntentFilter mo406b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo407c() {
            return this.f357c.mo452d() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo408d() {
            AppCompatDelegateImpl.this.mo348F();
        }
    }

    /* renamed from: androidx.appcompat.app.f$r */
    /* compiled from: AppCompatDelegateImpl */
    private static class C0083r {
        /* renamed from: a */
        static void m411a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.f$s */
    /* compiled from: AppCompatDelegateImpl */
    private class C0084s extends ContentFrameLayout {
        public C0084s(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m412c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo358T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m412c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.mo354N(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(AppCompatResources.m4143d(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.f$t */
    /* compiled from: AppCompatDelegateImpl */
    protected static final class C0085t {

        /* renamed from: a */
        int f360a;

        /* renamed from: b */
        int f361b;

        /* renamed from: c */
        int f362c;

        /* renamed from: d */
        int f363d;

        /* renamed from: e */
        int f364e;

        /* renamed from: f */
        int f365f;

        /* renamed from: g */
        ViewGroup f366g;

        /* renamed from: h */
        View f367h;

        /* renamed from: i */
        View f368i;

        /* renamed from: j */
        MenuBuilder f369j;

        /* renamed from: k */
        ListMenuPresenter f370k;

        /* renamed from: l */
        Context f371l;

        /* renamed from: m */
        boolean f372m;

        /* renamed from: n */
        boolean f373n;

        /* renamed from: o */
        boolean f374o;

        /* renamed from: p */
        public boolean f375p;

        /* renamed from: q */
        boolean f376q = false;

        /* renamed from: r */
        boolean f377r;

        /* renamed from: s */
        Bundle f378s;

        C0085t(int i) {
            this.f360a = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public MenuView mo415a(C0111a aVar) {
            if (this.f369j == null) {
                return null;
            }
            if (this.f370k == null) {
                ListMenuPresenter eVar = new ListMenuPresenter(this.f371l, C0508g.f3414j);
                this.f370k = eVar;
                eVar.mo590k(aVar);
                this.f369j.mo678b(this.f370k);
            }
            return this.f370k.mo626e(this.f366g);
        }

        /* renamed from: b */
        public boolean mo416b() {
            boolean z = false;
            if (this.f367h == null) {
                return false;
            }
            if (this.f368i != null) {
                return true;
            }
            if (this.f370k.mo625c().getCount() > 0) {
                z = true;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo417c(MenuBuilder gVar) {
            MenuBuilder gVar2 = this.f369j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo656O(this.f370k);
                }
                this.f369j = gVar;
                if (gVar != null) {
                    ListMenuPresenter eVar = this.f370k;
                    if (eVar != null) {
                        gVar.mo678b(eVar);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo418d(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0502a.f3278a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C0502a.f3269E, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C0510i.f3438b, true);
            }
            p010b.p011a.p017n.ContextThemeWrapper dVar = new p010b.p011a.p017n.ContextThemeWrapper(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f371l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C0511j.f3681z0);
            this.f361b = obtainStyledAttributes.getResourceId(C0511j.f3451C0, 0);
            this.f365f = obtainStyledAttributes.getResourceId(C0511j.f3446B0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.f$u */
    /* compiled from: AppCompatDelegateImpl */
    private final class C0086u implements C0111a {
        C0086u() {
        }

        /* renamed from: a */
        public void mo389a(MenuBuilder gVar, boolean z) {
            MenuBuilder D = gVar.mo646D();
            boolean z2 = D != gVar;
            AppCompatDelegateImpl fVar = AppCompatDelegateImpl.this;
            if (z2) {
                gVar = D;
            }
            C0085t Y = fVar.mo361Y(gVar);
            if (Y == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.mo351K(Y.f360a, Y, D);
                AppCompatDelegateImpl.this.mo355O(Y, true);
                return;
            }
            AppCompatDelegateImpl.this.mo355O(Y, z);
        }

        /* renamed from: b */
        public boolean mo390b(MenuBuilder gVar) {
            if (gVar == gVar.mo646D()) {
                AppCompatDelegateImpl fVar = AppCompatDelegateImpl.this;
                if (fVar.f295I) {
                    Callback f0 = fVar.mo367f0();
                    if (f0 != null && !AppCompatDelegateImpl.this.f307U) {
                        f0.onMenuOpened(108, gVar);
                    }
                }
            }
            return true;
        }
    }

    static {
        int i = VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i < 21;
        f284e = z2;
        if (i >= 17) {
            z = true;
        }
        f287h = z;
        if (z2 && !f288i) {
            Thread.setDefaultUncaughtExceptionHandler(new C0063a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    AppCompatDelegateImpl(Activity activity, AppCompatCallback dVar) {
        this(activity, null, dVar, activity);
    }

    /* renamed from: A0 */
    private boolean m295A0(C0085t tVar, KeyEvent keyEvent) {
        if (this.f307U) {
            return false;
        }
        if (tVar.f372m) {
            return true;
        }
        C0085t tVar2 = this.f302P;
        if (!(tVar2 == null || tVar2 == tVar)) {
            mo355O(tVar2, false);
        }
        Callback f0 = mo367f0();
        if (f0 != null) {
            tVar.f368i = f0.onCreatePanelView(tVar.f360a);
        }
        int i = tVar.f360a;
        boolean z = i == 0 || i == 108;
        if (z) {
            DecorContentParent d0Var = this.f330r;
            if (d0Var != null) {
                d0Var.mo961c();
            }
        }
        if (tVar.f368i == null) {
            if (z) {
                mo379y0();
            }
            MenuBuilder gVar = tVar.f369j;
            if (gVar == null || tVar.f377r) {
                if (gVar == null && (!m319j0(tVar) || tVar.f369j == null)) {
                    return false;
                }
                if (z && this.f330r != null) {
                    if (this.f331s == null) {
                        this.f331s = new C0071h();
                    }
                    this.f330r.mo959a(tVar.f369j, this.f331s);
                }
                tVar.f369j.mo685d0();
                if (!f0.onCreatePanelMenu(tVar.f360a, tVar.f369j)) {
                    tVar.mo417c(null);
                    if (z) {
                        DecorContentParent d0Var2 = this.f330r;
                        if (d0Var2 != null) {
                            d0Var2.mo959a(null, this.f331s);
                        }
                    }
                    return false;
                }
                tVar.f377r = false;
            }
            tVar.f369j.mo685d0();
            Bundle bundle = tVar.f378s;
            if (bundle != null) {
                tVar.f369j.mo657P(bundle);
                tVar.f378s = null;
            }
            if (!f0.onPreparePanel(0, tVar.f368i, tVar.f369j)) {
                if (z) {
                    DecorContentParent d0Var3 = this.f330r;
                    if (d0Var3 != null) {
                        d0Var3.mo959a(null, this.f331s);
                    }
                }
                tVar.f369j.mo680c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.f375p = z2;
            tVar.f369j.setQwertyMode(z2);
            tVar.f369j.mo680c0();
        }
        tVar.f372m = true;
        tVar.f373n = false;
        this.f302P = tVar;
        return true;
    }

    /* renamed from: B0 */
    private void m296B0(boolean z) {
        DecorContentParent d0Var = this.f330r;
        if (d0Var == null || !d0Var.mo968g() || (ViewConfiguration.get(this.f323k).hasPermanentMenuKey() && !this.f330r.mo963d())) {
            C0085t d0 = mo365d0(0, true);
            d0.f376q = true;
            mo355O(d0, false);
            m324x0(d0, null);
            return;
        }
        Callback f0 = mo367f0();
        if (this.f330r.mo960b() && z) {
            this.f330r.mo965e();
            if (!this.f307U) {
                f0.onPanelClosed(108, mo365d0(0, true).f369j);
            }
        } else if (f0 != null && !this.f307U) {
            if (this.f314b0 && (this.f315c0 & 1) != 0) {
                this.f324l.getDecorView().removeCallbacks(this.f316d0);
                this.f316d0.run();
            }
            C0085t d02 = mo365d0(0, true);
            MenuBuilder gVar = d02.f369j;
            if (gVar != null && !d02.f377r && f0.onPreparePanel(0, d02.f368i, gVar)) {
                f0.onMenuOpened(108, d02.f369j);
                this.f330r.mo966f();
            }
        }
    }

    /* renamed from: C0 */
    private int m297C0(int i) {
        String str = "AppCompatDelegate";
        if (i == 8) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i == 9) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        return i;
    }

    /* renamed from: E0 */
    private boolean m298E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f324l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ViewCompat.m5536S((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: G */
    private boolean m299G(boolean z) {
        if (this.f307U) {
            return false;
        }
        int J = m304J();
        boolean J0 = m305J0(mo369n0(this.f323k, J), z);
        if (J == 0) {
            m315c0(this.f323k).mo410e();
        } else {
            C0080p pVar = this.f312Z;
            if (pVar != null) {
                pVar.mo409a();
            }
        }
        if (J == 3) {
            m314b0(this.f323k).mo410e();
        } else {
            C0080p pVar2 = this.f313a0;
            if (pVar2 != null) {
                pVar2.mo409a();
            }
        }
        return J0;
    }

    /* renamed from: H */
    private void m300H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f290B.findViewById(16908290);
        View decorView = this.f324l.getDecorView();
        contentFrameLayout.mo1059b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f323k.obtainStyledAttributes(C0511j.f3681z0);
        obtainStyledAttributes.getValue(C0511j.f3496L0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0511j.f3500M0, contentFrameLayout.getMinWidthMinor());
        int i = C0511j.f3486J0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C0511j.f3491K0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C0511j.f3476H0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C0511j.f3481I0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: H0 */
    private void m301H0() {
        if (this.f289A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: I */
    private void m302I(Window window) {
        String str = "AppCompat has already installed itself into the Window";
        if (this.f324l == null) {
            Callback callback = window.getCallback();
            if (!(callback instanceof C0078n)) {
                C0078n nVar = new C0078n(callback);
                this.f325m = nVar;
                window.setCallback(nVar);
                TintTypedArray u = TintTypedArray.m1405u(this.f323k, null, f285f);
                Drawable h = u.mo1839h(0);
                if (h != null) {
                    window.setBackgroundDrawable(h);
                }
                u.mo1851w();
                this.f324l = window;
                return;
            }
            throw new IllegalStateException(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: I0 */
    private AppCompatActivity m303I0() {
        Context context = this.f323k;
        while (context != null) {
            if (!(context instanceof AppCompatActivity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (AppCompatActivity) context;
            }
        }
        return null;
    }

    /* renamed from: J */
    private int m304J() {
        int i = this.f308V;
        return i != -100 ? i : AppCompatDelegate.m269j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m305J0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f323k
            r1 = 0
            android.content.res.Configuration r0 = r6.m309P(r0, r7, r1)
            boolean r2 = r6.m321l0()
            android.content.Context r3 = r6.f323k
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.f304R
            if (r8 == 0) goto L_0x0047
            boolean r8 = f286g
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.f305S
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f322j
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f322j
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.ActivityCompat.m1709l(r8)
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.m306K0(r0, r2, r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.f322j
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.app.c r8 = (androidx.appcompat.app.AppCompatActivity) r8
            r8.mo292F(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m305J0(int, boolean):boolean");
    }

    /* renamed from: K0 */
    private void m306K0(int i, boolean z, Configuration configuration) {
        Resources resources = this.f323k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, null);
        int i2 = VERSION.SDK_INT;
        if (i2 < 26) {
            ResourcesFlusher.m453a(resources);
        }
        int i3 = this.f309W;
        if (i3 != 0) {
            this.f323k.setTheme(i3);
            if (i2 >= 23) {
                this.f323k.getTheme().applyStyle(this.f309W, true);
            }
        }
        if (z) {
            Object obj = this.f322j;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof LifecycleOwner) {
                    if (((LifecycleOwner) activity).mo132b().mo3000b().mo3003a(C0378c.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f306T) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: M */
    private void m307M() {
        C0080p pVar = this.f312Z;
        if (pVar != null) {
            pVar.mo409a();
        }
        C0080p pVar2 = this.f313a0;
        if (pVar2 != null) {
            pVar2.mo409a();
        }
    }

    /* renamed from: M0 */
    private void m308M0(View view) {
        int i;
        if ((ViewCompat.m5530M(view) & 8192) != 0) {
            i = ContextCompat.m1756b(this.f323k, C0504c.abc_decor_view_status_guard_light);
        } else {
            i = ContextCompat.m1756b(this.f323k, C0504c.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(i);
    }

    /* renamed from: P */
    private Configuration m309P(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: Q */
    private ViewGroup m310Q() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f323k.obtainStyledAttributes(C0511j.f3681z0);
        int i = C0511j.f3461E0;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C0511j.f3504N0, false)) {
                mo346z(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo346z(108);
            }
            if (obtainStyledAttributes.getBoolean(C0511j.f3466F0, false)) {
                mo346z(109);
            }
            if (obtainStyledAttributes.getBoolean(C0511j.f3471G0, false)) {
                mo346z(10);
            }
            this.f298L = obtainStyledAttributes.getBoolean(C0511j.f3441A0, false);
            obtainStyledAttributes.recycle();
            m312X();
            this.f324l.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f323k);
            if (this.f299M) {
                viewGroup = this.f297K ? (ViewGroup) from.inflate(C0508g.f3419o, null) : (ViewGroup) from.inflate(C0508g.f3418n, null);
            } else if (this.f298L) {
                viewGroup = (ViewGroup) from.inflate(C0508g.f3410f, null);
                this.f296J = false;
                this.f295I = false;
            } else if (this.f295I) {
                TypedValue typedValue = new TypedValue();
                this.f323k.getTheme().resolveAttribute(C0502a.f3283f, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new p010b.p011a.p017n.ContextThemeWrapper(this.f323k, typedValue.resourceId);
                } else {
                    context = this.f323k;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C0508g.f3420p, null);
                DecorContentParent d0Var = (DecorContentParent) viewGroup.findViewById(C0507f.f3394p);
                this.f330r = d0Var;
                d0Var.setWindowCallback(mo367f0());
                if (this.f296J) {
                    this.f330r.mo978k(109);
                }
                if (this.f293G) {
                    this.f330r.mo978k(2);
                }
                if (this.f294H) {
                    this.f330r.mo978k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (VERSION.SDK_INT >= 21) {
                    ViewCompat.m5595z0(viewGroup, new C0065c());
                } else if (viewGroup instanceof FitWindowsViewGroup) {
                    ((FitWindowsViewGroup) viewGroup).setOnFitSystemWindowsListener(new C0066d());
                }
                if (this.f330r == null) {
                    this.f291C = (TextView) viewGroup.findViewById(C0507f.f3375M);
                }
                ViewUtils.m1085c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0507f.f3380b);
                ViewGroup viewGroup2 = (ViewGroup) this.f324l.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f324l.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0067e());
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f295I);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f296J);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f298L);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f297K);
            sb.append(", windowNoTitle: ");
            sb.append(this.f299M);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: W */
    private void m311W() {
        if (!this.f289A) {
            this.f290B = m310Q();
            CharSequence e0 = mo366e0();
            if (!TextUtils.isEmpty(e0)) {
                DecorContentParent d0Var = this.f330r;
                if (d0Var != null) {
                    d0Var.setWindowTitle(e0);
                } else if (mo379y0() != null) {
                    mo379y0().mo264t(e0);
                } else {
                    TextView textView = this.f291C;
                    if (textView != null) {
                        textView.setText(e0);
                    }
                }
            }
            m300H();
            mo378w0(this.f290B);
            this.f289A = true;
            C0085t d0 = mo365d0(0, false);
            if (this.f307U) {
                return;
            }
            if (d0 == null || d0.f369j == null) {
                m320k0(108);
            }
        }
    }

    /* renamed from: X */
    private void m312X() {
        if (this.f324l == null) {
            Object obj = this.f322j;
            if (obj instanceof Activity) {
                m302I(((Activity) obj).getWindow());
            }
        }
        if (this.f324l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: Z */
    private static Configuration m313Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = VERSION.SDK_INT;
            if (i5 >= 24) {
                C0076l.m397a(configuration, configuration2, configuration3);
            } else if (!ObjectsCompat.m5175a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & LogType.UNEXP_OTHER;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & LogType.UNEXP_OTHER)) {
                configuration3.screenLayout |= i25 & LogType.UNEXP_OTHER;
            }
            if (i5 >= 26) {
                C0077m.m398a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            if (i5 >= 17) {
                C0074j.m395b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    /* renamed from: b0 */
    private C0080p m314b0(Context context) {
        if (this.f313a0 == null) {
            this.f313a0 = new C0079o(context);
        }
        return this.f313a0;
    }

    /* renamed from: c0 */
    private C0080p m315c0(Context context) {
        if (this.f312Z == null) {
            this.f312Z = new C0082q(TwilightManager.m460a(context));
        }
        return this.f312Z;
    }

    /* renamed from: g0 */
    private void m316g0() {
        m311W();
        if (this.f295I && this.f327o == null) {
            Object obj = this.f322j;
            if (obj instanceof Activity) {
                this.f327o = new WindowDecorActionBar((Activity) this.f322j, this.f296J);
            } else if (obj instanceof Dialog) {
                this.f327o = new WindowDecorActionBar((Dialog) this.f322j);
            }
            ActionBar aVar = this.f327o;
            if (aVar != null) {
                aVar.mo262r(this.f317e0);
            }
        }
    }

    /* renamed from: h0 */
    private boolean m317h0(C0085t tVar) {
        View view = tVar.f368i;
        boolean z = true;
        if (view != null) {
            tVar.f367h = view;
            return true;
        } else if (tVar.f369j == null) {
            return false;
        } else {
            if (this.f332t == null) {
                this.f332t = new C0086u();
            }
            View view2 = (View) tVar.mo415a(this.f332t);
            tVar.f367h = view2;
            if (view2 == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: i0 */
    private boolean m318i0(C0085t tVar) {
        tVar.mo418d(mo363a0());
        tVar.f366g = new C0084s(tVar.f371l);
        tVar.f362c = 81;
        return true;
    }

    /* renamed from: j0 */
    private boolean m319j0(C0085t tVar) {
        Context context = this.f323k;
        int i = tVar.f360a;
        if ((i == 0 || i == 108) && this.f330r != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C0502a.f3283f, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0502a.f3284g, typedValue, true);
            } else {
                theme.resolveAttribute(C0502a.f3284g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                Context dVar = new p010b.p011a.p017n.ContextThemeWrapper(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        MenuBuilder gVar = new MenuBuilder(context);
        gVar.mo659R(this);
        tVar.mo417c(gVar);
        return true;
    }

    /* renamed from: k0 */
    private void m320k0(int i) {
        this.f315c0 = (1 << i) | this.f315c0;
        if (!this.f314b0) {
            ViewCompat.m5557g0(this.f324l.getDecorView(), this.f316d0);
            this.f314b0 = true;
        }
    }

    /* renamed from: l0 */
    private boolean m321l0() {
        if (!this.f311Y && (this.f322j instanceof Activity)) {
            PackageManager packageManager = this.f323k.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i = VERSION.SDK_INT;
                int i2 = i >= 29 ? 269221888 : i >= 24 ? 786432 : 0;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f323k, this.f322j.getClass()), i2);
                this.f310X = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f310X = false;
            }
        }
        this.f311Y = true;
        return this.f310X;
    }

    /* renamed from: q0 */
    private boolean m322q0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0085t d0 = mo365d0(i, true);
            if (!d0.f374o) {
                return m295A0(d0, keyEvent);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m323t0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            b.a.n.b r0 = r4.f333u
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.f$t r2 = r4.mo365d0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.d0 r5 = r4.f330r
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.mo968g()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f323k
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.d0 r5 = r4.f330r
            boolean r5 = r5.mo960b()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f307U
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.m295A0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.d0 r5 = r4.f330r
            boolean r0 = r5.mo966f()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.d0 r5 = r4.f330r
            boolean r0 = r5.mo965e()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f374o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f373n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f372m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f377r
            if (r5 == 0) goto L_0x005b
            r2.f372m = r1
            boolean r5 = r4.m295A0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.m324x0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = 0
            goto L_0x0068
        L_0x0064:
            r4.mo355O(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f323k
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m323t0(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: x0 */
    private void m324x0(C0085t tVar, KeyEvent keyEvent) {
        int i;
        if (!tVar.f374o && !this.f307U) {
            if (tVar.f360a == 0) {
                if ((this.f323k.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Callback f0 = mo367f0();
            if (f0 == null || f0.onMenuOpened(tVar.f360a, tVar.f369j)) {
                WindowManager windowManager = (WindowManager) this.f323k.getSystemService("window");
                if (windowManager != null && m295A0(tVar, keyEvent)) {
                    ViewGroup viewGroup = tVar.f366g;
                    if (viewGroup == null || tVar.f376q) {
                        if (viewGroup == null) {
                            if (!m318i0(tVar) || tVar.f366g == null) {
                                return;
                            }
                        } else if (tVar.f376q && viewGroup.getChildCount() > 0) {
                            tVar.f366g.removeAllViews();
                        }
                        if (!m317h0(tVar) || !tVar.mo416b()) {
                            tVar.f376q = true;
                        } else {
                            LayoutParams layoutParams = tVar.f367h.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(-2, -2);
                            }
                            tVar.f366g.setBackgroundResource(tVar.f361b);
                            ViewParent parent = tVar.f367h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(tVar.f367h);
                            }
                            tVar.f366g.addView(tVar.f367h, layoutParams);
                            if (!tVar.f367h.hasFocus()) {
                                tVar.f367h.requestFocus();
                            }
                        }
                    } else {
                        View view = tVar.f368i;
                        if (view != null) {
                            LayoutParams layoutParams2 = view.getLayoutParams();
                            if (layoutParams2 != null && layoutParams2.width == -1) {
                                i = -1;
                                tVar.f373n = false;
                                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, tVar.f363d, tVar.f364e, 1002, 8519680, -3);
                                layoutParams3.gravity = tVar.f362c;
                                layoutParams3.windowAnimations = tVar.f365f;
                                windowManager.addView(tVar.f366g, layoutParams3);
                                tVar.f374o = true;
                                return;
                            }
                        }
                    }
                    i = -2;
                    tVar.f373n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, tVar.f363d, tVar.f364e, 1002, 8519680, -3);
                    layoutParams32.gravity = tVar.f362c;
                    layoutParams32.windowAnimations = tVar.f365f;
                    windowManager.addView(tVar.f366g, layoutParams32);
                    tVar.f374o = true;
                    return;
                }
                return;
            }
            mo355O(tVar, true);
        }
    }

    /* renamed from: z0 */
    private boolean m325z0(C0085t tVar, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if (tVar.f372m || m295A0(tVar, keyEvent)) {
            MenuBuilder gVar = tVar.f369j;
            if (gVar != null) {
                z = gVar.performShortcut(i, keyEvent, i2);
            }
        }
        if (z && (i2 & 1) == 0 && this.f330r == null) {
            mo355O(tVar, true);
        }
        return z;
    }

    /* renamed from: A */
    public void mo324A(int i) {
        m311W();
        ViewGroup viewGroup = (ViewGroup) this.f290B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f323k).inflate(i, viewGroup);
        this.f325m.mo4247a().onContentChanged();
    }

    /* renamed from: B */
    public void mo325B(View view) {
        m311W();
        ViewGroup viewGroup = (ViewGroup) this.f290B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f325m.mo4247a().onContentChanged();
    }

    /* renamed from: C */
    public void mo326C(View view, LayoutParams layoutParams) {
        m311W();
        ViewGroup viewGroup = (ViewGroup) this.f290B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f325m.mo4247a().onContentChanged();
    }

    /* renamed from: D */
    public void mo327D(int i) {
        this.f309W = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D0 */
    public final boolean mo347D0() {
        if (this.f289A) {
            ViewGroup viewGroup = this.f290B;
            if (viewGroup != null && ViewCompat.m5537T(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void mo328E(CharSequence charSequence) {
        this.f329q = charSequence;
        DecorContentParent d0Var = this.f330r;
        if (d0Var != null) {
            d0Var.setWindowTitle(charSequence);
        } else if (mo379y0() != null) {
            mo379y0().mo264t(charSequence);
        } else {
            TextView textView = this.f291C;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: F */
    public boolean mo348F() {
        return m299G(true);
    }

    /* renamed from: F0 */
    public ActionMode mo349F0(C0527a aVar) {
        if (aVar != null) {
            ActionMode bVar = this.f333u;
            if (bVar != null) {
                bVar.mo470c();
            }
            C0072i iVar = new C0072i(aVar);
            ActionBar m = mo335m();
            if (m != null) {
                ActionMode u = m.mo265u(iVar);
                this.f333u = u;
                if (u != null) {
                    AppCompatCallback dVar = this.f326n;
                    if (dVar != null) {
                        dVar.mo301f(u);
                    }
                }
            }
            if (this.f333u == null) {
                this.f333u = mo350G0(iVar);
            }
            return this.f333u;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0166  */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p010b.p011a.p017n.ActionMode mo350G0(p010b.p011a.p017n.ActionMode.C0527a r8) {
        /*
            r7 = this;
            r7.mo360V()
            b.a.n.b r0 = r7.f333u
            if (r0 == 0) goto L_0x000a
            r0.mo470c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.C0072i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.f$i r0 = new androidx.appcompat.app.f$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.d r0 = r7.f326n
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f307U
            if (r2 != 0) goto L_0x0022
            b.a.n.b r0 = r0.mo308l(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f333u = r0
            goto L_0x0162
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f334v
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f298L
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f323k
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p010b.p011a.C0502a.f3283f
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f323k
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            b.a.n.d r4 = new b.a.n.d
            android.content.Context r6 = r7.f323k
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f323k
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f334v = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p010b.p011a.C0502a.f3286i
            r5.<init>(r4, r1, r6)
            r7.f335w = r5
            r6 = 2
            androidx.core.widget.PopupWindowCompat.m1970b(r5, r6)
            android.widget.PopupWindow r5 = r7.f335w
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f334v
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f335w
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p010b.p011a.C0502a.f3279b
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f334v
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f335w
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.f$f r0 = new androidx.appcompat.app.f$f
            r0.<init>()
            r7.f336x = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f290B
            int r4 = p010b.p011a.C0507f.f3386h
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo363a0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo1267a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f334v = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f334v
            if (r0 == 0) goto L_0x0162
            r7.mo360V()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f334v
            r0.mo943k()
            b.a.n.e r0 = new b.a.n.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f334v
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f334v
            android.widget.PopupWindow r6 = r7.f335w
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo472e()
            boolean r8 = r8.mo394d(r0, r3)
            if (r8 == 0) goto L_0x0160
            r0.mo476k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f334v
            r8.mo941h(r0)
            r7.f333u = r0
            boolean r8 = r7.mo347D0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f334v
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f334v
            b.g.k.a0 r8 = p010b.p034g.p043k.ViewCompat.m5550d(r8)
            b.g.k.a0 r8 = r8.mo4958a(r0)
            r7.f337y = r8
            androidx.appcompat.app.f$g r0 = new androidx.appcompat.app.f$g
            r0.<init>()
            r8.mo4963f(r0)
            goto L_0x0150
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f334v
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f334v
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f334v
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f334v
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0150
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f334v
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p010b.p034g.p043k.ViewCompat.m5567l0(r8)
        L_0x0150:
            android.widget.PopupWindow r8 = r7.f335w
            if (r8 == 0) goto L_0x0162
            android.view.Window r8 = r7.f324l
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f336x
            r8.post(r0)
            goto L_0x0162
        L_0x0160:
            r7.f333u = r1
        L_0x0162:
            b.a.n.b r8 = r7.f333u
            if (r8 == 0) goto L_0x016d
            androidx.appcompat.app.d r0 = r7.f326n
            if (r0 == 0) goto L_0x016d
            r0.mo301f(r8)
        L_0x016d:
            b.a.n.b r8 = r7.f333u
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo350G0(b.a.n.b$a):b.a.n.b");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public void mo351K(int i, C0085t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i >= 0) {
                C0085t[] tVarArr = this.f301O;
                if (i < tVarArr.length) {
                    tVar = tVarArr[i];
                }
            }
            if (tVar != null) {
                menu = tVar.f369j;
            }
        }
        if ((tVar == null || tVar.f374o) && !this.f307U) {
            this.f325m.mo4247a().onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public void mo352L(MenuBuilder gVar) {
        if (!this.f300N) {
            this.f300N = true;
            this.f330r.mo979l();
            Callback f0 = mo367f0();
            if (f0 != null && !this.f307U) {
                f0.onPanelClosed(108, gVar);
            }
            this.f300N = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L0 */
    public final int mo353L0(WindowInsetsCompat e0Var, Rect rect) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3 = 0;
        int i4 = e0Var != null ? e0Var.mo4995i() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f334v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof MarginLayoutParams)) {
            z = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f334v.getLayoutParams();
            boolean z3 = true;
            if (this.f334v.isShown()) {
                if (this.f318f0 == null) {
                    this.f318f0 = new Rect();
                    this.f319g0 = new Rect();
                }
                Rect rect2 = this.f318f0;
                Rect rect3 = this.f319g0;
                if (e0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(e0Var.mo4992g(), e0Var.mo4995i(), e0Var.mo4993h(), e0Var.mo4991f());
                }
                ViewUtils.m1083a(this.f290B, rect2, rect3);
                int i5 = rect2.top;
                int i6 = rect2.left;
                int i7 = rect2.right;
                WindowInsetsCompat J = ViewCompat.m5527J(this.f290B);
                if (J == null) {
                    i = 0;
                } else {
                    i = J.mo4992g();
                }
                if (J == null) {
                    i2 = 0;
                } else {
                    i2 = J.mo4993h();
                }
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z2 = true;
                }
                if (i5 <= 0 || this.f292D != null) {
                    View view = this.f292D;
                    if (view != null) {
                        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) view.getLayoutParams();
                        int i8 = marginLayoutParams2.height;
                        int i9 = marginLayoutParams.topMargin;
                        if (!(i8 == i9 && marginLayoutParams2.leftMargin == i && marginLayoutParams2.rightMargin == i2)) {
                            marginLayoutParams2.height = i9;
                            marginLayoutParams2.leftMargin = i;
                            marginLayoutParams2.rightMargin = i2;
                            this.f292D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f323k);
                    this.f292D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i;
                    layoutParams.rightMargin = i2;
                    this.f290B.addView(this.f292D, -1, layoutParams);
                }
                View view3 = this.f292D;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m308M0(this.f292D);
                }
                if (!this.f297K && z3) {
                    i4 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f334v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f292D;
        if (view4 != null) {
            if (!z) {
                i3 = 8;
            }
            view4.setVisibility(i3);
        }
        return i4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public void mo354N(int i) {
        mo355O(mo365d0(i, true), true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public void mo355O(C0085t tVar, boolean z) {
        if (z && tVar.f360a == 0) {
            DecorContentParent d0Var = this.f330r;
            if (d0Var != null && d0Var.mo960b()) {
                mo352L(tVar.f369j);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f323k.getSystemService("window");
        if (windowManager != null && tVar.f374o) {
            ViewGroup viewGroup = tVar.f366g;
            if (viewGroup != null) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo351K(tVar.f360a, tVar, null);
                }
            }
        }
        tVar.f372m = false;
        tVar.f373n = false;
        tVar.f374o = false;
        tVar.f367h = null;
        tVar.f376q = true;
        if (this.f302P == tVar) {
            this.f302P = null;
        }
    }

    /* renamed from: R */
    public View mo356R(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f320h0 == null) {
            String string = this.f323k.obtainStyledAttributes(C0511j.f3681z0).getString(C0511j.f3456D0);
            if (string == null) {
                this.f320h0 = new AppCompatViewInflater();
            } else {
                try {
                    this.f320h0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    Log.i("AppCompatDelegate", sb.toString(), th);
                    this.f320h0 = new AppCompatViewInflater();
                }
            }
        }
        boolean z3 = f284e;
        if (z3) {
            if (this.f321i0 == null) {
                this.f321i0 = new LayoutIncludeDetector();
            }
            if (this.f321i0.mo450a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z2 = m298E0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z2 = true;
                }
                z = z2;
            }
        } else {
            z = false;
        }
        return this.f320h0.mo448q(view, str, context, attributeSet, z, z3, true, VectorEnabledTintResources.m1072b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: S */
    public void mo357S() {
        DecorContentParent d0Var = this.f330r;
        if (d0Var != null) {
            d0Var.mo979l();
        }
        if (this.f335w != null) {
            this.f324l.getDecorView().removeCallbacks(this.f336x);
            if (this.f335w.isShowing()) {
                try {
                    this.f335w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f335w = null;
        }
        mo360V();
        C0085t d0 = mo365d0(0, false);
        if (d0 != null) {
            MenuBuilder gVar = d0.f369j;
            if (gVar != null) {
                gVar.close();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: T */
    public boolean mo358T(KeyEvent keyEvent) {
        Object obj = this.f322j;
        boolean z = true;
        if ((obj instanceof C0633a) || (obj instanceof AppCompatDialog)) {
            View decorView = this.f324l.getDecorView();
            if (decorView != null && KeyEventDispatcher.m5328d(decorView, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getKeyCode() == 82 && this.f325m.mo4247a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo373p0(keyCode, keyEvent) : mo375s0(keyCode, keyEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U */
    public void mo359U(int i) {
        C0085t d0 = mo365d0(i, true);
        if (d0.f369j != null) {
            Bundle bundle = new Bundle();
            d0.f369j.mo658Q(bundle);
            if (bundle.size() > 0) {
                d0.f378s = bundle;
            }
            d0.f369j.mo685d0();
            d0.f369j.clear();
        }
        d0.f377r = true;
        d0.f376q = true;
        if ((i == 108 || i == 0) && this.f330r != null) {
            C0085t d02 = mo365d0(0, false);
            if (d02 != null) {
                d02.f372m = false;
                m295A0(d02, null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public void mo360V() {
        ViewPropertyAnimatorCompat a0Var = this.f337y;
        if (a0Var != null) {
            a0Var.mo4959b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y */
    public C0085t mo361Y(Menu menu) {
        C0085t[] tVarArr = this.f301O;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0085t tVar = tVarArr[i];
            if (tVar != null && tVar.f369j == menu) {
                return tVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo362a(MenuBuilder gVar, MenuItem menuItem) {
        Callback f0 = mo367f0();
        if (f0 != null && !this.f307U) {
            C0085t Y = mo361Y(gVar.mo646D());
            if (Y != null) {
                return f0.onMenuItemSelected(Y.f360a, menuItem);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a0 */
    public final Context mo363a0() {
        ActionBar m = mo335m();
        Context k = m != null ? m.mo255k() : null;
        return k == null ? this.f323k : k;
    }

    /* renamed from: b */
    public void mo364b(MenuBuilder gVar) {
        m296B0(true);
    }

    /* renamed from: d */
    public void mo329d(View view, LayoutParams layoutParams) {
        m311W();
        ((ViewGroup) this.f290B.findViewById(16908290)).addView(view, layoutParams);
        this.f325m.mo4247a().onContentChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public C0085t mo365d0(int i, boolean z) {
        C0085t[] tVarArr = this.f301O;
        if (tVarArr == null || tVarArr.length <= i) {
            C0085t[] tVarArr2 = new C0085t[(i + 1)];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.f301O = tVarArr2;
            tVarArr = tVarArr2;
        }
        C0085t tVar = tVarArr[i];
        if (tVar != null) {
            return tVar;
        }
        C0085t tVar2 = new C0085t(i);
        tVarArr[i] = tVar2;
        return tVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e0 */
    public final CharSequence mo366e0() {
        Object obj = this.f322j;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f329q;
    }

    /* renamed from: f */
    public Context mo331f(Context context) {
        boolean z = true;
        this.f304R = true;
        int n0 = mo369n0(context, m304J());
        Configuration configuration = null;
        if (f287h && (context instanceof ContextThemeWrapper)) {
            try {
                C0083r.m411a((ContextThemeWrapper) context, m309P(context, n0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof p010b.p011a.p017n.ContextThemeWrapper) {
            try {
                ((p010b.p011a.p017n.ContextThemeWrapper) context).mo4202a(m309P(context, n0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f286g) {
            return super.mo331f(context);
        }
        if (VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = C0074j.m394a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = m313Z(configuration3, configuration4);
            }
        }
        Configuration P = m309P(context, n0, configuration);
        p010b.p011a.p017n.ContextThemeWrapper dVar = new p010b.p011a.p017n.ContextThemeWrapper(context, C0510i.Theme_AppCompat_Empty);
        dVar.mo4202a(P);
        boolean z2 = false;
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            C0260b.m1822a(dVar.getTheme());
        }
        return super.mo331f(dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f0 */
    public final Callback mo367f0() {
        return this.f324l.getCallback();
    }

    /* renamed from: i */
    public <T extends View> T mo332i(int i) {
        m311W();
        return this.f324l.findViewById(i);
    }

    /* renamed from: k */
    public int mo333k() {
        return this.f308V;
    }

    /* renamed from: l */
    public MenuInflater mo334l() {
        if (this.f328p == null) {
            m316g0();
            ActionBar aVar = this.f327o;
            this.f328p = new SupportMenuInflater(aVar != null ? aVar.mo255k() : this.f323k);
        }
        return this.f328p;
    }

    /* renamed from: m */
    public ActionBar mo335m() {
        m316g0();
        return this.f327o;
    }

    /* renamed from: m0 */
    public boolean mo368m0() {
        return this.f338z;
    }

    /* renamed from: n */
    public void mo336n() {
        LayoutInflater from = LayoutInflater.from(this.f323k);
        if (from.getFactory() == null) {
            LayoutInflaterCompat.m5429b(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n0 */
    public int mo369n0(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return m314b0(context).mo407c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                return m315c0(context).mo407c();
            } else {
                return -1;
            }
        }
        return i;
    }

    /* renamed from: o */
    public void mo337o() {
        ActionBar m = mo335m();
        if (m == null || !m.mo256l()) {
            m320k0(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o0 */
    public boolean mo370o0() {
        ActionMode bVar = this.f333u;
        if (bVar != null) {
            bVar.mo470c();
            return true;
        }
        ActionBar m = mo335m();
        if (m == null || !m.mo252h()) {
            return false;
        }
        return true;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo356R(view, str, context, attributeSet);
    }

    /* renamed from: p */
    public void mo338p(Configuration configuration) {
        if (this.f295I && this.f289A) {
            ActionBar m = mo335m();
            if (m != null) {
                m.mo257m(configuration);
            }
        }
        AppCompatDrawableManager.m1158b().mo1501g(this.f323k);
        m299G(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p0 */
    public boolean mo373p0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f303Q = z;
        } else if (i == 82) {
            m322q0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public void mo339q(Bundle bundle) {
        this.f304R = true;
        m299G(false);
        m312X();
        Object obj = this.f322j;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = NavUtils.m1732c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar y0 = mo379y0();
                if (y0 == null) {
                    this.f317e0 = true;
                } else {
                    y0.mo262r(true);
                }
            }
            AppCompatDelegate.m266c(this);
        }
        this.f305S = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo340r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f322j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.AppCompatDelegate.m270x(r3)
        L_0x0009:
            boolean r0 = r3.f314b0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f324l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f316d0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.f306T = r0
            r0 = 1
            r3.f307U = r0
            int r0 = r3.f308V
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f322j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            b.d.g<java.lang.String, java.lang.Integer> r0 = f283d
            java.lang.Object r1 = r3.f322j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f308V
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            b.d.g<java.lang.String, java.lang.Integer> r0 = f283d
            java.lang.Object r1 = r3.f322j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            androidx.appcompat.app.a r0 = r3.f327o
            if (r0 == 0) goto L_0x005e
            r0.mo258n()
        L_0x005e:
            r3.m307M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo340r():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r0 */
    public boolean mo374r0(int i, KeyEvent keyEvent) {
        ActionBar m = mo335m();
        if (m != null && m.mo259o(i, keyEvent)) {
            return true;
        }
        C0085t tVar = this.f302P;
        if (tVar == null || !m325z0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f302P == null) {
                C0085t d0 = mo365d0(0, true);
                m295A0(d0, keyEvent);
                boolean z0 = m325z0(d0, keyEvent.getKeyCode(), keyEvent, 1);
                d0.f372m = false;
                if (z0) {
                    return true;
                }
            }
            return false;
        }
        C0085t tVar2 = this.f302P;
        if (tVar2 != null) {
            tVar2.f373n = true;
        }
        return true;
    }

    /* renamed from: s */
    public void mo341s(Bundle bundle) {
        m311W();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s0 */
    public boolean mo375s0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f303Q;
            this.f303Q = false;
            C0085t d0 = mo365d0(0, false);
            if (d0 != null && d0.f374o) {
                if (!z) {
                    mo355O(d0, true);
                }
                return true;
            } else if (mo370o0()) {
                return true;
            }
        } else if (i == 82) {
            m323t0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public void mo342t() {
        ActionBar m = mo335m();
        if (m != null) {
            m.mo263s(true);
        }
    }

    /* renamed from: u */
    public void mo343u(Bundle bundle) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u0 */
    public void mo376u0(int i) {
        if (i == 108) {
            ActionBar m = mo335m();
            if (m != null) {
                m.mo253i(true);
            }
        }
    }

    /* renamed from: v */
    public void mo344v() {
        this.f306T = true;
        mo348F();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v0 */
    public void mo377v0(int i) {
        if (i == 108) {
            ActionBar m = mo335m();
            if (m != null) {
                m.mo253i(false);
            }
        } else if (i == 0) {
            C0085t d0 = mo365d0(i, true);
            if (d0.f374o) {
                mo355O(d0, false);
            }
        }
    }

    /* renamed from: w */
    public void mo345w() {
        this.f306T = false;
        ActionBar m = mo335m();
        if (m != null) {
            m.mo263s(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w0 */
    public void mo378w0(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y0 */
    public final ActionBar mo379y0() {
        return this.f327o;
    }

    /* renamed from: z */
    public boolean mo346z(int i) {
        int C0 = m297C0(i);
        if (this.f299M && C0 == 108) {
            return false;
        }
        if (this.f295I && C0 == 1) {
            this.f295I = false;
        }
        if (C0 == 1) {
            m301H0();
            this.f299M = true;
            return true;
        } else if (C0 == 2) {
            m301H0();
            this.f293G = true;
            return true;
        } else if (C0 == 5) {
            m301H0();
            this.f294H = true;
            return true;
        } else if (C0 == 10) {
            m301H0();
            this.f297K = true;
            return true;
        } else if (C0 == 108) {
            m301H0();
            this.f295I = true;
            return true;
        } else if (C0 != 109) {
            return this.f324l.requestFeature(C0);
        } else {
            m301H0();
            this.f296J = true;
            return true;
        }
    }

    AppCompatDelegateImpl(Dialog dialog, AppCompatCallback dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private AppCompatDelegateImpl(Context context, Window window, AppCompatCallback dVar, Object obj) {
        this.f337y = null;
        this.f338z = true;
        this.f308V = -100;
        this.f316d0 = new C0064b();
        this.f323k = context;
        this.f326n = dVar;
        this.f322j = obj;
        if (this.f308V == -100 && (obj instanceof Dialog)) {
            AppCompatActivity I0 = m303I0();
            if (I0 != null) {
                this.f308V = I0.mo289B().mo333k();
            }
        }
        if (this.f308V == -100) {
            SimpleArrayMap<String, Integer> gVar = f283d;
            Integer num = (Integer) gVar.get(obj.getClass().getName());
            if (num != null) {
                this.f308V = num.intValue();
                gVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            m302I(window);
        }
        AppCompatDrawableManager.m1160h();
    }
}
