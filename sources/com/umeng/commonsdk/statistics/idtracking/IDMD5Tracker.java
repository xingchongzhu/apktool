package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.d */
public class IDMD5Tracker extends AbstractIdTracker {

    /* renamed from: a */
    private static final String f17720a = "idmd5";

    /* renamed from: b */
    private Context f17721b;

    public IDMD5Tracker(Context context) {
        super("idmd5");
        this.f17721b = context;
    }

    /* renamed from: f */
    public String mo19365f() {
        return DeviceConfig.getDeviceIdUmengMD5(this.f17721b);
    }
}
