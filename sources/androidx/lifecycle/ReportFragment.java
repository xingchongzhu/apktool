package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle.C0377b;

/* renamed from: androidx.lifecycle.q */
public class ReportFragment extends Fragment {

    /* renamed from: a */
    private C0380a f2653a;

    /* renamed from: androidx.lifecycle.q$a */
    /* compiled from: ReportFragment */
    interface C0380a {
        /* renamed from: b */
        void mo3015b();

        /* renamed from: c */
        void mo3016c();

        /* renamed from: d */
        void mo3017d();
    }

    /* renamed from: androidx.lifecycle.q$b */
    /* compiled from: ReportFragment */
    static class C0381b implements ActivityLifecycleCallbacks {
        C0381b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C0381b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            ReportFragment.m2784a(activity, C0377b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            ReportFragment.m2784a(activity, C0377b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            ReportFragment.m2784a(activity, C0377b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            ReportFragment.m2784a(activity, C0377b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            ReportFragment.m2784a(activity, C0377b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            ReportFragment.m2784a(activity, C0377b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m2784a(Activity activity, C0377b bVar) {
        if (activity instanceof LifecycleRegistryOwner) {
            ((LifecycleRegistryOwner) activity).mo132b().mo3004h(bVar);
            return;
        }
        if (activity instanceof LifecycleOwner) {
            Lifecycle b = ((LifecycleOwner) activity).mo132b();
            if (b instanceof LifecycleRegistry) {
                ((LifecycleRegistry) b).mo3004h(bVar);
            }
        }
    }

    /* renamed from: b */
    private void m2785b(C0377b bVar) {
        if (VERSION.SDK_INT < 29) {
            m2784a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    private void m2786c(C0380a aVar) {
        if (aVar != null) {
            aVar.mo3016c();
        }
    }

    /* renamed from: d */
    private void m2787d(C0380a aVar) {
        if (aVar != null) {
            aVar.mo3017d();
        }
    }

    /* renamed from: e */
    private void m2788e(C0380a aVar) {
        if (aVar != null) {
            aVar.mo3015b();
        }
    }

    /* renamed from: f */
    public static void m2789f(Activity activity) {
        if (VERSION.SDK_INT >= 29) {
            C0381b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), str).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m2786c(this.f2653a);
        m2785b(C0377b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m2785b(C0377b.ON_DESTROY);
        this.f2653a = null;
    }

    public void onPause() {
        super.onPause();
        m2785b(C0377b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m2787d(this.f2653a);
        m2785b(C0377b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m2788e(this.f2653a);
        m2785b(C0377b.ON_START);
    }

    public void onStop() {
        super.onStop();
        m2785b(C0377b.ON_STOP);
    }
}
