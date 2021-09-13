package androidx.activity.result;

import android.annotation.SuppressLint;
import androidx.core.app.ActivityOptionsCompat;

/* renamed from: androidx.activity.result.c */
public abstract class ActivityResultLauncher<I> {
    /* renamed from: a */
    public void mo194a(@SuppressLint({"UnknownNullness"}) I i) {
        mo180b(i, null);
    }

    /* renamed from: b */
    public abstract void mo180b(@SuppressLint({"UnknownNullness"}) I i, ActivityOptionsCompat bVar);

    /* renamed from: c */
    public abstract void mo181c();
}
