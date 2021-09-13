package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.C0382a;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.HashSet;
import java.util.Set;
import p262d.p263a.EntryPoints;
import p262d.p263a.p264b.ActivityRetainedLifecycle;
import p262d.p263a.p264b.ActivityRetainedLifecycle.C3293a;
import p262d.p263a.p264b.p265c.ActivityRetainedComponent;
import p262d.p263a.p264b.p266d.ThreadUtil;
import p262d.p263a.p264b.p266d.p267b.ActivityRetainedComponentBuilder;
import p262d.p263a.p269c.GeneratedComponentManager;

/* renamed from: dagger.hilt.android.internal.managers.b */
final class ActivityRetainedComponentManager implements GeneratedComponentManager<ActivityRetainedComponent> {

    /* renamed from: a */
    private final ViewModelProvider f17993a;

    /* renamed from: b */
    private volatile ActivityRetainedComponent f17994b;

    /* renamed from: c */
    private final Object f17995c = new Object();

    /* renamed from: dagger.hilt.android.internal.managers.b$a */
    /* compiled from: ActivityRetainedComponentManager */
    class C3298a implements C0382a {

        /* renamed from: a */
        final /* synthetic */ Context f17996a;

        C3298a(Context context) {
            this.f17996a = context;
        }

        /* renamed from: a */
        public <T extends ViewModel> T mo2870a(Class<T> cls) {
            return new C3300c(((C3299b) EntryPoints.m22887a(this.f17996a, C3299b.class)).mo16917e().mo16918a());
        }
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$b */
    /* compiled from: ActivityRetainedComponentManager */
    public interface C3299b {
        /* renamed from: e */
        ActivityRetainedComponentBuilder mo16917e();
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$c */
    /* compiled from: ActivityRetainedComponentManager */
    static final class C3300c extends ViewModel {

        /* renamed from: c */
        private final ActivityRetainedComponent f17998c;

        C3300c(ActivityRetainedComponent bVar) {
            this.f17998c = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo2856d() {
            super.mo2856d();
            ((C3302e) ((C3301d) EntryPoints.m22887a(this.f17998c, C3301d.class)).mo16921b()).mo19638a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public ActivityRetainedComponent mo19637e() {
            return this.f17998c;
        }
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$d */
    /* compiled from: ActivityRetainedComponentManager */
    public interface C3301d {
        /* renamed from: b */
        ActivityRetainedLifecycle mo16921b();
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$e */
    /* compiled from: ActivityRetainedComponentManager */
    static final class C3302e implements ActivityRetainedLifecycle {

        /* renamed from: a */
        private final Set<C3293a> f17999a = new HashSet();

        /* renamed from: b */
        private boolean f18000b = false;

        C3302e() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo19638a() {
            ThreadUtil.m22890a();
            this.f18000b = true;
            for (C3293a a : this.f17999a) {
                a.mo19632a();
            }
        }
    }

    ActivityRetainedComponentManager(ComponentActivity componentActivity) {
        this.f17993a = m22916c(componentActivity, componentActivity.getApplication());
    }

    /* renamed from: a */
    private ActivityRetainedComponent m22915a() {
        return ((C3300c) this.f17993a.mo3033a(C3300c.class)).mo19637e();
    }

    /* renamed from: c */
    private ViewModelProvider m22916c(ViewModelStoreOwner uVar, Context context) {
        return new ViewModelProvider(uVar, (C0382a) new C3298a(context));
    }

    /* renamed from: b */
    public ActivityRetainedComponent mo16498g() {
        if (this.f17994b == null) {
            synchronized (this.f17995c) {
                if (this.f17994b == null) {
                    this.f17994b = m22915a();
                }
            }
        }
        return this.f17994b;
    }
}
