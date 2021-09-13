package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.common.AdvertisingId;
import com.umeng.commonsdk.utils.UMConstant;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.c */
public class IDFATracker extends AbstractIdTracker {

    /* renamed from: a */
    private static final String f17718a = "idfa";

    /* renamed from: b */
    private Context f17719b;

    public IDFATracker(Context context) {
        super(f17718a);
        this.f17719b = context;
    }

    /* renamed from: f */
    public String mo19365f() {
        String a = FieldManager.allow(UMConstant.f17944w) ? AdvertisingId.m22497a(this.f17719b) : null;
        return a == null ? "" : a;
    }
}
