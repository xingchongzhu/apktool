package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.f */
public class ImeiTracker extends AbstractIdTracker {

    /* renamed from: a */
    private static final String f17734a = "imei";

    /* renamed from: b */
    private Context f17735b;

    public ImeiTracker(Context context) {
        super(f17734a);
        this.f17735b = context;
    }

    /* renamed from: f */
    public String mo19365f() {
        return DeviceConfig.getImeiNew(this.f17735b);
    }
}
