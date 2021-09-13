package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.ArrayList;

/* renamed from: com.umeng.analytics.pro.l */
public class BackgroundMonitor implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static BackgroundMonitor f17148a = new BackgroundMonitor();

    /* renamed from: b */
    private final int f17149b = 3000;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f17150c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f17151d = true;

    /* renamed from: e */
    private Handler f17152e = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<BackgroundWatcher> f17153f = new ArrayList<>();

    /* renamed from: g */
    private C3147a f17154g = new C3147a();

    /* renamed from: com.umeng.analytics.pro.l$a */
    /* compiled from: BackgroundMonitor */
    class C3147a implements Runnable {
        C3147a() {
        }

        public void run() {
            boolean a = BackgroundMonitor.this.f17150c;
            String str = UMRTLog.RTLOG_TAG;
            if (!a || !BackgroundMonitor.this.f17151d) {
                UMRTLog.m22229i(str, "--->>> still foreground.");
                return;
            }
            BackgroundMonitor.this.f17150c = false;
            UMRTLog.m22229i(str, "--->>> went background.");
            for (int i = 0; i < BackgroundMonitor.this.f17153f.size(); i++) {
                ((BackgroundWatcher) BackgroundMonitor.this.f17153f.get(i)).mo18836n();
            }
        }
    }

    private BackgroundMonitor() {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        this.f17151d = true;
        C3147a aVar = this.f17154g;
        if (aVar != null) {
            this.f17152e.removeCallbacks(aVar);
            this.f17152e.postDelayed(this.f17154g, 3000);
        }
    }

    public void onActivityResumed(Activity activity) {
        this.f17151d = false;
        this.f17150c = true;
        C3147a aVar = this.f17154g;
        if (aVar != null) {
            this.f17152e.removeCallbacks(aVar);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    /* renamed from: b */
    public synchronized void mo19124b(BackgroundWatcher mVar) {
        if (mVar != null) {
            for (int i = 0; i < this.f17153f.size(); i++) {
                if (this.f17153f.get(i) == mVar) {
                    this.f17153f.remove(i);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m21999a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(f17148a);
        }
    }

    /* renamed from: a */
    public static BackgroundMonitor m21998a() {
        return f17148a;
    }

    /* renamed from: a */
    public synchronized void mo19123a(BackgroundWatcher mVar) {
        if (mVar != null) {
            this.f17153f.add(mVar);
        }
    }
}
