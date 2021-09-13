package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.b */
public class AndroidIdTracker extends AbstractIdTracker {

    /* renamed from: a */
    private static final String f17716a = "android_id";

    /* renamed from: b */
    private Context f17717b;

    public AndroidIdTracker(Context context) {
        super(f17716a);
        this.f17717b = context;
    }

    /* renamed from: f */
    public String mo19365f() {
        return DeviceConfig.getAndroidId(this.f17717b);
    }
}
