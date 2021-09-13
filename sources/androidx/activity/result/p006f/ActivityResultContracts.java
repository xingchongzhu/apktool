package androidx.activity.result.p006f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.p006f.ActivityResultContract.C0041a;

@TargetApi(19)
/* renamed from: androidx.activity.result.f.b */
public class ActivityResultContracts extends ActivityResultContract<String, Uri> {
    /* renamed from: d */
    public Intent mo212d(Context context, String str) {
        return new Intent("android.intent.action.CREATE_DOCUMENT").setType("*/*").putExtra("android.intent.extra.TITLE", str);
    }

    /* renamed from: e */
    public final C0041a<Uri> mo209b(Context context, String str) {
        return null;
    }

    /* renamed from: f */
    public final Uri mo210c(int i, Intent intent) {
        if (intent == null || i != -1) {
            return null;
        }
        return intent.getData();
    }
}
