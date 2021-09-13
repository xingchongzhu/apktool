package androidx.activity.result.p006f;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* renamed from: androidx.activity.result.f.d */
/* compiled from: ActivityResultContracts */
public final class C0043d extends ActivityResultContract<Intent, ActivityResult> {
    /* renamed from: d */
    public Intent mo208a(Context context, Intent intent) {
        return intent;
    }

    /* renamed from: e */
    public ActivityResult mo210c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
