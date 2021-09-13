package com.p259uc.crashsdk;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

/* renamed from: com.uc.crashsdk.c */
/* compiled from: ProGuard */
final class C3085c implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f16368a = false;

    /* renamed from: b */
    private boolean f16369b = false;

    C3085c() {
    }

    /* renamed from: a */
    private void m21171a(Activity activity, int i) {
        if (1 == i) {
            C3084b.f16335ac = activity.getComponentName().flattenToShortString();
        } else {
            C3084b.f16335ac = "";
        }
        C3084b.m21102A();
        if (C3093g.m21359J()) {
            C3084b.f16334ab = C3084b.f16350i;
            synchronized (C3084b.f16333aa) {
                C3084b.f16333aa.put(activity, Integer.valueOf(i));
                m21170a(i);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m21171a(activity, 2);
    }

    public final void onActivityDestroyed(Activity activity) {
        if (C3093g.m21359J()) {
            C3084b.f16334ab = C3084b.f16350i;
            synchronized (C3084b.f16333aa) {
                C3084b.f16333aa.remove(activity);
                m21170a(2);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m21171a(activity, 2);
    }

    public final void onActivityResumed(Activity activity) {
        m21171a(activity, 1);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m21171a(activity, 1);
    }

    public final void onActivityStopped(Activity activity) {
        m21171a(activity, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21170a(int r4) {
        /*
            r3 = this;
            boolean r0 = com.p259uc.crashsdk.C3087e.m21305t()
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "crashsdk"
            java.lang.String r0 = "[LifeCycle] ignore state change while crashing"
            com.p259uc.crashsdk.p260a.C3075a.m20976a(r4, r0)
            return
        L_0x000e:
            r0 = 1
            if (r0 != r4) goto L_0x0013
            r4 = 1
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 != 0) goto L_0x003d
            java.util.WeakHashMap r1 = com.p259uc.crashsdk.C3084b.f16333aa
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0022:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L_0x0022
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r0) goto L_0x0022
            goto L_0x003e
        L_0x003d:
            r0 = r4
        L_0x003e:
            boolean r4 = r3.f16368a
            if (r4 == r0) goto L_0x0047
            com.p259uc.crashsdk.C3084b.m21142b(r0)
            r3.f16368a = r0
        L_0x0047:
            java.util.WeakHashMap r4 = com.p259uc.crashsdk.C3084b.f16333aa
            boolean r4 = r4.isEmpty()
            boolean r0 = r3.f16369b
            if (r0 == r4) goto L_0x005a
            if (r4 == 0) goto L_0x0058
            com.p259uc.crashsdk.C3084b.m21163t()
        L_0x0058:
            r3.f16369b = r4
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p259uc.crashsdk.C3085c.m21170a(int):void");
    }
}
