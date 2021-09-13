package androidx.activity.result.p006f;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.p006f.ActivityResultContract.C0041a;
import androidx.core.content.ContextCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p010b.p025d.ArrayMap;

/* renamed from: androidx.activity.result.f.c */
/* compiled from: ActivityResultContracts */
public final class C0042c extends ActivityResultContract<String[], Map<String, Boolean>> {
    /* renamed from: e */
    static Intent m174e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    /* renamed from: d */
    public Intent mo208a(Context context, String[] strArr) {
        return m174e(strArr);
    }

    /* renamed from: f */
    public C0041a<Map<String, Boolean>> mo209b(Context context, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new C0041a<>(Collections.emptyMap());
        }
        ArrayMap aVar = new ArrayMap();
        boolean z = true;
        for (String str : strArr) {
            boolean z2 = ContextCompat.m1755a(context, str) == 0;
            aVar.put(str, Boolean.valueOf(z2));
            if (!z2) {
                z = false;
            }
        }
        if (z) {
            return new C0041a<>(aVar);
        }
        return null;
    }

    /* renamed from: g */
    public Map<String, Boolean> mo210c(int i, Intent intent) {
        if (i != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        int length = stringArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return hashMap;
    }
}
