package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;

public class ApplicationLayerUtilAgent {
    public static void wifiChange(Context context) {
        if (FieldManager.m22200b()) {
            ApplicationLayerUtil.m22309c(context);
        }
    }
}
