package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class BasicClassIntrospector extends ClassIntrospector implements Serializable {
    protected static final BasicBeanDescription BOOLEAN_DESC;
    private static final Class<?> CLS_JSON_NODE = JsonNode.class;
    private static final Class<?> CLS_OBJECT;
    private static final Class<?> CLS_STRING;
    protected static final BasicBeanDescription INT_DESC;
    protected static final BasicBeanDescription LONG_DESC;
    protected static final BasicBeanDescription OBJECT_DESC;
    protected static final BasicBeanDescription STRING_DESC;
    private static final long serialVersionUID = 2;

    static {
        Class<String> cls = String.class;
        Class<Object> cls2 = Object.class;
        CLS_OBJECT = cls2;
        CLS_STRING = cls;
        STRING_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(cls), AnnotatedClassResolver.createPrimordial(cls));
        Class cls3 = Boolean.TYPE;
        BOOLEAN_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(cls3), AnnotatedClassResolver.createPrimordial(cls3));
        Class cls4 = Integer.TYPE;
        INT_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(cls4), AnnotatedClassResolver.createPrimordial(cls4));
        Class cls5 = Long.TYPE;
        LONG_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(cls5), AnnotatedClassResolver.createPrimordial(cls5));
        OBJECT_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(cls2), AnnotatedClassResolver.createPrimordial(cls2));
    }

    /* access modifiers changed from: protected */
    public BasicBeanDescription _findStdJdkCollectionDesc(MapperConfig<?> mapperConfig, JavaType javaType) {
        if (_isStdJDKCollection(javaType)) {
            return BasicBeanDescription.forOtherUse(mapperConfig, javaType, _resolveAnnotatedClass(mapperConfig, javaType, mapperConfig));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public BasicBeanDescription _findStdTypeDesc(MapperConfig<?> mapperConfig, JavaType javaType) {
        Class<Boolean> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            if (rawClass == Integer.TYPE) {
                return INT_DESC;
            }
            if (rawClass == Long.TYPE) {
                return LONG_DESC;
            }
            if (rawClass == Boolean.TYPE) {
                return BOOLEAN_DESC;
            }
        } else if (ClassUtil.isJDKClass(rawClass)) {
            if (rawClass == CLS_OBJECT) {
                return OBJECT_DESC;
            }
            if (rawClass == CLS_STRING) {
                return STRING_DESC;
            }
            if (rawClass == Integer.class) {
                return INT_DESC;
            }
            if (rawClass == Long.class) {
                return LONG_DESC;
            }
            if (rawClass == Boolean.class) {
                return BOOLEAN_DESC;
            }
        } else if (CLS_JSON_NODE.isAssignableFrom(rawClass)) {
            return BasicBeanDescription.forOtherUse(mapperConfig, javaType, AnnotatedClassResolver.createPrimordial(rawClass));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean _isStdJDKCollection(JavaType javaType) {
        if (javaType.isContainerType() && !javaType.isArrayType()) {
            Class rawClass = javaType.getRawClass();
            if (ClassUtil.isJDKClass(rawClass) && (Collection.class.isAssignableFrom(rawClass) || Map.class.isAssignableFrom(rawClass))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public AnnotatedClass _resolveAnnotatedClass(MapperConfig<?> mapperConfig, JavaType javaType, MixInResolver mixInResolver) {
        return AnnotatedClassResolver.resolve(mapperConfig, javaType, mixInResolver);
    }

    /* access modifiers changed from: protected */
    public AnnotatedClass _resolveAnnotatedWithoutSuperTypes(MapperConfig<?> mapperConfig, JavaType javaType, MixInResolver mixInResolver) {
        return AnnotatedClassResolver.resolveWithoutSuperTypes(mapperConfig, javaType, mixInResolver);
    }

    /* access modifiers changed from: protected */
    public POJOPropertiesCollector collectProperties(MapperConfig<?> mapperConfig, JavaType javaType, MixInResolver mixInResolver, boolean z, String str) {
        return constructPropertyCollector(mapperConfig, _resolveAnnotatedClass(mapperConfig, javaType, mixInResolver), javaType, z, str);
    }

    /* access modifiers changed from: protected */
    public POJOPropertiesCollector collectPropertiesWithBuilder(MapperConfig<?> mapperConfig, JavaType javaType, MixInResolver mixInResolver, boolean z) {
        String str;
        AnnotatedClass _resolveAnnotatedClass = _resolveAnnotatedClass(mapperConfig, javaType, mixInResolver);
        Value value = null;
        AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        if (annotationIntrospector != null) {
            value = annotationIntrospector.findPOJOBuilderConfig(_resolveAnnotatedClass);
        }
        if (value == null) {
            str = JsonPOJOBuilder.DEFAULT_WITH_PREFIX;
        } else {
            str = value.withPrefix;
        }
        return constructPropertyCollector(mapperConfig, _resolveAnnotatedClass, javaType, z, str);
    }

    /* access modifiers changed from: protected */
    public POJOPropertiesCollector constructPropertyCollector(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType, boolean z, String str) {
        POJOPropertiesCollector pOJOPropertiesCollector = new POJOPropertiesCollector(mapperConfig, z, javaType, annotatedClass, str);
        return pOJOPropertiesCollector;
    }

    public ClassIntrospector copy() {
        return new BasicClassIntrospector();
    }

    public BasicBeanDescription forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, MixInResolver mixInResolver) {
        BasicBeanDescription _findStdTypeDesc = _findStdTypeDesc(mapperConfig, javaType);
        return _findStdTypeDesc == null ? BasicBeanDescription.forOtherUse(mapperConfig, javaType, _resolveAnnotatedClass(mapperConfig, javaType, mixInResolver)) : _findStdTypeDesc;
    }

    public BasicBeanDescription forCreation(DeserializationConfig deserializationConfig, JavaType javaType, MixInResolver mixInResolver) {
        BasicBeanDescription _findStdTypeDesc = _findStdTypeDesc(deserializationConfig, javaType);
        if (_findStdTypeDesc != null) {
            return _findStdTypeDesc;
        }
        BasicBeanDescription _findStdJdkCollectionDesc = _findStdJdkCollectionDesc(deserializationConfig, javaType);
        if (_findStdJdkCollectionDesc != null) {
            return _findStdJdkCollectionDesc;
        }
        return BasicBeanDescription.forDeserialization(collectProperties(deserializationConfig, javaType, mixInResolver, false, "set"));
    }

    public BasicBeanDescription forDeserialization(DeserializationConfig deserializationConfig, JavaType javaType, MixInResolver mixInResolver) {
        BasicBeanDescription _findStdTypeDesc = _findStdTypeDesc(deserializationConfig, javaType);
        if (_findStdTypeDesc != null) {
            return _findStdTypeDesc;
        }
        BasicBeanDescription _findStdJdkCollectionDesc = _findStdJdkCollectionDesc(deserializationConfig, javaType);
        if (_findStdJdkCollectionDesc != null) {
            return _findStdJdkCollectionDesc;
        }
        return BasicBeanDescription.forDeserialization(collectProperties(deserializationConfig, javaType, mixInResolver, false, "set"));
    }

    public BasicBeanDescription forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, MixInResolver mixInResolver) {
        return BasicBeanDescription.forDeserialization(collectPropertiesWithBuilder(deserializationConfig, javaType, mixInResolver, false));
    }

    public BasicBeanDescription forDirectClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, MixInResolver mixInResolver) {
        BasicBeanDescription _findStdTypeDesc = _findStdTypeDesc(mapperConfig, javaType);
        return _findStdTypeDesc == null ? BasicBeanDescription.forOtherUse(mapperConfig, javaType, _resolveAnnotatedWithoutSuperTypes(mapperConfig, javaType, mixInResolver)) : _findStdTypeDesc;
    }

    public BasicBeanDescription forSerialization(SerializationConfig serializationConfig, JavaType javaType, MixInResolver mixInResolver) {
        BasicBeanDescription _findStdTypeDesc = _findStdTypeDesc(serializationConfig, javaType);
        if (_findStdTypeDesc != null) {
            return _findStdTypeDesc;
        }
        BasicBeanDescription _findStdJdkCollectionDesc = _findStdJdkCollectionDesc(serializationConfig, javaType);
        if (_findStdJdkCollectionDesc != null) {
            return _findStdJdkCollectionDesc;
        }
        return BasicBeanDescription.forSerialization(collectProperties(serializationConfig, javaType, mixInResolver, true, "set"));
    }
}
