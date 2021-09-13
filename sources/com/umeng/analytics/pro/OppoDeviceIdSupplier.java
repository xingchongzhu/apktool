package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import p282g.p283a.p287b.p288a.p289a.p290a.OpenIDSDK;

/* renamed from: com.umeng.analytics.pro.ad */
public class OppoDeviceIdSupplier implements IDeviceIdSupplier {

    /* renamed from: a */
    private boolean f16540a = false;

    /* renamed from: a */
    public String mo18859a(Context context) {
        try {
            if (!this.f16540a) {
                OpenIDSDK.m24018a(context);
                this.f16540a = true;
            }
            if (OpenIDSDK.m24019b()) {
                return OpenIDSDK.m24020c(context);
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
