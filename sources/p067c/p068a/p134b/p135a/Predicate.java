package p067c.p068a.p134b.p135a;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: c.a.b.a.h */
public interface Predicate<T> {
    @CanIgnoreReturnValue
    boolean apply(@NullableDecl T t);
}
