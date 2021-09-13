package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;

public final class AnnotationMap implements Annotations {
    protected HashMap<Class<?>, Annotation> _annotations;

    public AnnotationMap() {
    }

    public static AnnotationMap merge(AnnotationMap annotationMap, AnnotationMap annotationMap2) {
        if (annotationMap != null) {
            HashMap<Class<?>, Annotation> hashMap = annotationMap._annotations;
            if (hashMap != null && !hashMap.isEmpty()) {
                if (annotationMap2 != null) {
                    HashMap<Class<?>, Annotation> hashMap2 = annotationMap2._annotations;
                    if (hashMap2 != null && !hashMap2.isEmpty()) {
                        HashMap hashMap3 = new HashMap();
                        for (Annotation annotation : annotationMap2._annotations.values()) {
                            hashMap3.put(annotation.annotationType(), annotation);
                        }
                        for (Annotation annotation2 : annotationMap._annotations.values()) {
                            hashMap3.put(annotation2.annotationType(), annotation2);
                        }
                        annotationMap = new AnnotationMap(hashMap3);
                    }
                }
                return annotationMap;
            }
        }
        return annotationMap2;
    }

    /* renamed from: of */
    public static AnnotationMap m14355of(Class<?> cls, Annotation annotation) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(cls, annotation);
        return new AnnotationMap(hashMap);
    }

    /* access modifiers changed from: protected */
    public final boolean _add(Annotation annotation) {
        if (this._annotations == null) {
            this._annotations = new HashMap<>();
        }
        Annotation annotation2 = (Annotation) this._annotations.put(annotation.annotationType(), annotation);
        return annotation2 == null || !annotation2.equals(annotation);
    }

    public boolean add(Annotation annotation) {
        return _add(annotation);
    }

    public boolean addIfNotPresent(Annotation annotation) {
        HashMap<Class<?>, Annotation> hashMap = this._annotations;
        if (hashMap != null && hashMap.containsKey(annotation.annotationType())) {
            return false;
        }
        _add(annotation);
        return true;
    }

    public Iterable<Annotation> annotations() {
        HashMap<Class<?>, Annotation> hashMap = this._annotations;
        if (hashMap == null || hashMap.size() == 0) {
            return Collections.emptyList();
        }
        return this._annotations.values();
    }

    public <A extends Annotation> A get(Class<A> cls) {
        HashMap<Class<?>, Annotation> hashMap = this._annotations;
        if (hashMap == null) {
            return null;
        }
        return (Annotation) hashMap.get(cls);
    }

    public boolean has(Class<?> cls) {
        HashMap<Class<?>, Annotation> hashMap = this._annotations;
        if (hashMap == null) {
            return false;
        }
        return hashMap.containsKey(cls);
    }

    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        if (this._annotations != null) {
            for (Class<? extends Annotation> containsKey : clsArr) {
                if (this._annotations.containsKey(containsKey)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        HashMap<Class<?>, Annotation> hashMap = this._annotations;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.size();
    }

    public String toString() {
        HashMap<Class<?>, Annotation> hashMap = this._annotations;
        if (hashMap == null) {
            return "[null]";
        }
        return hashMap.toString();
    }

    AnnotationMap(HashMap<Class<?>, Annotation> hashMap) {
        this._annotations = hashMap;
    }
}
