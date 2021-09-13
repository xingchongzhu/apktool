package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.g */
public class MacTracker extends AbstractIdTracker {

    /* renamed from: a */
    private static final String f17736a = "mac";

    /* renamed from: b */
    private Context f17737b;

    public MacTracker(Context context) {
        super(f17736a);
        this.f17737b = context;
    }

    /* renamed from: f */
    public String mo19365f() {
        try {
            return DeviceConfig.getMac(this.f17737b);
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                e.printStackTrace();
            }
            UMCrashManager.reportCrash(this.f17737b, e);
            return null;
        }
    }
}
