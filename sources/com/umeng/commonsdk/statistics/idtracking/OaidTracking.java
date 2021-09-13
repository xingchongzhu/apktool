package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.UMConstant;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.i */
public class OaidTracking extends AbstractIdTracker {

    /* renamed from: a */
    public static final String f17740a = "umeng_sp_oaid";

    /* renamed from: b */
    public static final String f17741b = "key_umeng_sp_oaid";

    /* renamed from: c */
    public static final String f17742c = "key_umeng_sp_oaid_required_time";

    /* renamed from: d */
    private static final String f17743d = "oaid";

    /* renamed from: e */
    private Context f17744e;

    public OaidTracking(Context context) {
        super(f17743d);
        this.f17744e = context;
    }

    /* renamed from: f */
    public String mo19365f() {
        if (!FieldManager.allow(UMConstant.f17889G)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = this.f17744e.getSharedPreferences(f17740a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(f17741b, "");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
