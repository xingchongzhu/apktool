package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import p282g.p283a.p287b.p293c.p294a.C3396d;

/* renamed from: com.umeng.analytics.pro.af */
public class VivoDeviceIdSupplier implements IDeviceIdSupplier {
    /* renamed from: a */
    public String mo18859a(Context context) {
        try {
            if (C3396d.m24037a(context)) {
                return C3396d.m24038b(context);
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
