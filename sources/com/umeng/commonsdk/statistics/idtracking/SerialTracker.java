package com.umeng.commonsdk.statistics.idtracking;

import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.k */
public class SerialTracker extends AbstractIdTracker {

    /* renamed from: a */
    private static final String f17749a = "serial";

    public SerialTracker() {
        super(f17749a);
    }

    /* renamed from: f */
    public String mo19365f() {
        return DeviceConfig.getSerial();
    }
}
