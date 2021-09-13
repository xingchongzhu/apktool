package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.UMConstant;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.l */
public class UTDIdTracker extends AbstractIdTracker {

    /* renamed from: a */
    private static final String f17750a = "utdid";

    /* renamed from: b */
    private Context f17751b;

    public UTDIdTracker(Context context) {
        super(f17750a);
        this.f17751b = context;
    }

    /* renamed from: f */
    public String mo19365f() {
        try {
            if (FieldManager.allow(UMConstant.f17942u)) {
                return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", new Class[]{Context.class}).invoke(null, new Object[]{this.f17751b});
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
