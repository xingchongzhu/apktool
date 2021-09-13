package androidx.activity.result.p006f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

/* renamed from: androidx.activity.result.f.a */
public abstract class ActivityResultContract<I, O> {

    /* renamed from: androidx.activity.result.f.a$a */
    /* compiled from: ActivityResultContract */
    public static final class C0041a<T> {
        @SuppressLint({"UnknownNullness"})

        /* renamed from: a */
        private final T f156a;

        public C0041a(@SuppressLint({"UnknownNullness"}) T t) {
            this.f156a = t;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: a */
        public T mo211a() {
            return this.f156a;
        }
    }

    /* renamed from: a */
    public abstract Intent mo208a(Context context, @SuppressLint({"UnknownNullness"}) I i);

    /* renamed from: b */
    public C0041a<O> mo209b(Context context, @SuppressLint({"UnknownNullness"}) I i) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: c */
    public abstract O mo210c(int i, Intent intent);
}
