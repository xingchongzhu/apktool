package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.C0377b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: androidx.lifecycle.p */
public @interface OnLifecycleEvent {
    C0377b value();
}
