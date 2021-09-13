package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AnnotatedClassResolver {
    private static final Class<?> CLS_ENUM = Enum.class;
    private static final Class<?> CLS_LIST = List.class;
    private static final Class<?> CLS_MAP = Map.class;
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final Annotations NO_ANNOTATIONS = AnnotationCollector.emptyAnnotations();
    private final TypeBindings _bindings;
    private final Class<?> _class;
    private final boolean _collectAnnotations;
    private final MapperConfig<?> _config;
    private final AnnotationIntrospector _intr;
    private final MixInResolver _mixInResolver;
    private final Class<?> _primaryMixin;
    private final JavaType _type;

    AnnotatedClassResolver(MapperConfig<?> mapperConfig, JavaType javaType, MixInResolver mixInResolver) {
        this._config = mapperConfig;
        this._type = javaType;
        Class<?> rawClass = javaType.getRawClass();
        this._class = rawClass;
        this._mixInResolver = mixInResolver;
        this._bindings = javaType.getBindings();
        Class<?> cls = null;
        AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this._intr = annotationIntrospector;
        if (mixInResolver != null) {
            cls = mixInResolver.findMixInClassFor(rawClass);
        }
        this._primaryMixin = cls;
        this._collectAnnotations = annotationIntrospector != null && (!ClassUtil.isJDKClass(rawClass) || !javaType.isContainerType());
    }

    private AnnotationCollector _addAnnotationsIfNotPresent(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!annotationCollector.isPresent(annotation)) {
                    annotationCollector = annotationCollector.addOrOverride(annotation);
                    if (this._intr.isAnnotationBundle(annotation)) {
                        annotationCollector = _addFromBundleIfNotPresent(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    private AnnotationCollector _addClassMixIns(AnnotationCollector annotationCollector, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            annotationCollector = _addAnnotationsIfNotPresent(annotationCollector, ClassUtil.findClassAnnotations(cls2));
            for (Class findClassAnnotations : ClassUtil.findSuperClasses(cls2, cls, false)) {
                annotationCollector = _addAnnotationsIfNotPresent(annotationCollector, ClassUtil.findClassAnnotations(findClassAnnotations));
            }
        }
        return annotationCollector;
    }

    private AnnotationCollector _addFromBundleIfNotPresent(AnnotationCollector annotationCollector, Annotation annotation) {
        Annotation[] findClassAnnotations;
        for (Annotation annotation2 : ClassUtil.findClassAnnotations(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.isPresent(annotation2)) {
                annotationCollector = annotationCollector.addOrOverride(annotation2);
                if (this._intr.isAnnotationBundle(annotation2)) {
                    annotationCollector = _addFromBundleIfNotPresent(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    private static void _addSuperInterfaces(JavaType javaType, List<JavaType> list, boolean z) {
        Class<?> rawClass = javaType.getRawClass();
        if (z) {
            if (!_contains(list, rawClass)) {
                list.add(javaType);
                if (rawClass == CLS_LIST || rawClass == CLS_MAP) {
                    return;
                }
            } else {
                return;
            }
        }
        for (JavaType _addSuperInterfaces : javaType.getInterfaces()) {
            _addSuperInterfaces(_addSuperInterfaces, list, true);
        }
    }

    private static void _addSuperTypes(JavaType javaType, List<JavaType> list, boolean z) {
        Class<?> rawClass = javaType.getRawClass();
        if (!(rawClass == CLS_OBJECT || rawClass == CLS_ENUM)) {
            if (z) {
                if (!_contains(list, rawClass)) {
                    list.add(javaType);
                } else {
                    return;
                }
            }
            for (JavaType _addSuperInterfaces : javaType.getInterfaces()) {
                _addSuperInterfaces(_addSuperInterfaces, list, true);
            }
            JavaType superClass = javaType.getSuperClass();
            if (superClass != null) {
                _addSuperTypes(superClass, list, true);
            }
        }
    }

    private static boolean _contains(List<JavaType> list, Class<?> cls) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((JavaType) list.get(i)).getRawClass() == cls) {
                return true;
            }
        }
        return false;
    }

    static AnnotatedClass createArrayType(MapperConfig<?> mapperConfig, Class<?> cls) {
        return new AnnotatedClass(cls);
    }

    static AnnotatedClass createPrimordial(Class<?> cls) {
        return new AnnotatedClass(cls);
    }

    public static AnnotatedClass resolve(MapperConfig<?> mapperConfig, JavaType javaType, MixInResolver mixInResolver) {
        if (!javaType.isArrayType() || !skippableArray(mapperConfig, javaType.getRawClass())) {
            return new AnnotatedClassResolver(mapperConfig, javaType, mixInResolver).resolveFully();
        }
        return createArrayType(mapperConfig, javaType.getRawClass());
    }

    private Annotations resolveClassAnnotations(List<JavaType> list) {
        Class<Object> cls = Object.class;
        if (this._intr == null) {
            return NO_ANNOTATIONS;
        }
        MixInResolver mixInResolver = this._mixInResolver;
        boolean z = mixInResolver != null && (!(mixInResolver instanceof SimpleMixInResolver) || ((SimpleMixInResolver) mixInResolver).hasMixIns());
        if (!z && !this._collectAnnotations) {
            return NO_ANNOTATIONS;
        }
        AnnotationCollector emptyCollector = AnnotationCollector.emptyCollector();
        Class<?> cls2 = this._primaryMixin;
        if (cls2 != null) {
            emptyCollector = _addClassMixIns(emptyCollector, this._class, cls2);
        }
        if (this._collectAnnotations) {
            emptyCollector = _addAnnotationsIfNotPresent(emptyCollector, ClassUtil.findClassAnnotations(this._class));
        }
        for (JavaType javaType : list) {
            if (z) {
                Class rawClass = javaType.getRawClass();
                emptyCollector = _addClassMixIns(emptyCollector, rawClass, this._mixInResolver.findMixInClassFor(rawClass));
            }
            if (this._collectAnnotations) {
                emptyCollector = _addAnnotationsIfNotPresent(emptyCollector, ClassUtil.findClassAnnotations(javaType.getRawClass()));
            }
        }
        if (z) {
            emptyCollector = _addClassMixIns(emptyCollector, cls, this._mixInResolver.findMixInClassFor(cls));
        }
        return emptyCollector.asAnnotations();
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, Class<?> cls) {
        return resolveWithoutSuperTypes(mapperConfig, cls, (MixInResolver) mapperConfig);
    }

    private static boolean skippableArray(MapperConfig<?> mapperConfig, Class<?> cls) {
        return mapperConfig == null || mapperConfig.findMixInClassFor(cls) == null;
    }

    /* access modifiers changed from: 0000 */
    public AnnotatedClass resolveFully() {
        ArrayList arrayList = new ArrayList(8);
        if (!this._type.hasRawClass(Object.class)) {
            if (this._type.isInterface()) {
                _addSuperInterfaces(this._type, arrayList, false);
            } else {
                _addSuperTypes(this._type, arrayList, false);
            }
        }
        AnnotatedClass annotatedClass = new AnnotatedClass(this._type, this._class, arrayList, this._primaryMixin, resolveClassAnnotations(arrayList), this._bindings, this._intr, this._mixInResolver, this._config.getTypeFactory(), this._collectAnnotations);
        return annotatedClass;
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, JavaType javaType, MixInResolver mixInResolver) {
        if (!javaType.isArrayType() || !skippableArray(mapperConfig, javaType.getRawClass())) {
            return new AnnotatedClassResolver(mapperConfig, javaType, mixInResolver).resolveWithoutSuperTypes();
        }
        return createArrayType(mapperConfig, javaType.getRawClass());
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, Class<?> cls, MixInResolver mixInResolver) {
        if (!cls.isArray() || !skippableArray(mapperConfig, cls)) {
            return new AnnotatedClassResolver(mapperConfig, cls, mixInResolver).resolveWithoutSuperTypes();
        }
        return createArrayType(mapperConfig, cls);
    }

    /* access modifiers changed from: 0000 */
    public AnnotatedClass resolveWithoutSuperTypes() {
        List emptyList = Collections.emptyList();
        AnnotatedClass annotatedClass = new AnnotatedClass(null, this._class, emptyList, this._primaryMixin, resolveClassAnnotations(emptyList), this._bindings, this._intr, this._mixInResolver, this._config.getTypeFactory(), this._collectAnnotations);
        return annotatedClass;
    }

    AnnotatedClassResolver(MapperConfig<?> mapperConfig, Class<?> cls, MixInResolver mixInResolver) {
        this._config = mapperConfig;
        Class<?> cls2 = null;
        this._type = null;
        this._class = cls;
        this._mixInResolver = mixInResolver;
        this._bindings = TypeBindings.emptyBindings();
        if (mapperConfig == null) {
            this._intr = null;
            this._primaryMixin = null;
        } else {
            this._intr = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
            if (mixInResolver != null) {
                cls2 = mixInResolver.findMixInClassFor(cls);
            }
            this._primaryMixin = cls2;
        }
        this._collectAnnotations = this._intr != null;
    }
}
