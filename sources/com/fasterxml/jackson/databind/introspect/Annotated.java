package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Modifier;

public abstract class Annotated {
    protected Annotated() {
    }

    @Deprecated
    public abstract Iterable<Annotation> annotations();

    public abstract boolean equals(Object obj);

    public abstract AnnotatedElement getAnnotated();

    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    /* access modifiers changed from: protected */
    public abstract int getModifiers();

    public abstract String getName();

    public abstract Class<?> getRawType();

    public abstract JavaType getType();

    public abstract boolean hasAnnotation(Class<?> cls);

    public abstract boolean hasOneOf(Class<? extends Annotation>[] clsArr);

    public abstract int hashCode();

    public boolean isPublic() {
        return Modifier.isPublic(getModifiers());
    }

    public abstract String toString();
}
