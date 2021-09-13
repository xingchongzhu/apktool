package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import p262d.p263a.EntryPoints;
import p262d.p263a.p264b.p265c.ActivityRetainedComponent;
import p262d.p263a.p264b.p266d.p267b.ActivityComponentBuilder;
import p262d.p263a.p269c.GeneratedComponentManager;

/* renamed from: dagger.hilt.android.internal.managers.a */
public class ActivityComponentManager implements GeneratedComponentManager<Object> {

    /* renamed from: a */
    private volatile Object f17989a;

    /* renamed from: b */
    private final Object f17990b = new Object();

    /* renamed from: c */
    protected final Activity f17991c;

    /* renamed from: d */
    private final GeneratedComponentManager<ActivityRetainedComponent> f17992d;

    /* renamed from: dagger.hilt.android.internal.managers.a$a */
    /* compiled from: ActivityComponentManager */
    public interface C3297a {
        /* renamed from: a */
        ActivityComponentBuilder mo16920a();
    }

    public ActivityComponentManager(Activity activity) {
        this.f17991c = activity;
        this.f17992d = new ActivityRetainedComponentManager((ComponentActivity) activity);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo19635a() {
        if (this.f17991c.getApplication() instanceof GeneratedComponentManager) {
            return ((C3297a) EntryPoints.m22887a(this.f17992d, C3297a.class)).mo16920a().mo16923b(this.f17991c).mo16922a();
        }
        if (Application.class.equals(this.f17991c.getApplication().getClass())) {
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: ");
        sb.append(this.f17991c.getApplication().getClass());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: g */
    public Object mo16498g() {
        if (this.f17989a == null) {
            synchronized (this.f17990b) {
                if (this.f17989a == null) {
                    this.f17989a = mo19635a();
                }
            }
        }
        return this.f17989a;
    }
}
