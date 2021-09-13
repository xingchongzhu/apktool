package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import p282g.p283a.p287b.p291b.p292a.IdentifierManager;

/* renamed from: com.umeng.analytics.pro.ag */
class XiaomiDeviceIdSupplier implements IDeviceIdSupplier {
    XiaomiDeviceIdSupplier() {
    }

    /* renamed from: a */
    public String mo18859a(Context context) {
        try {
            if (IdentifierManager.m24022b()) {
                return IdentifierManager.m24023c(context);
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
