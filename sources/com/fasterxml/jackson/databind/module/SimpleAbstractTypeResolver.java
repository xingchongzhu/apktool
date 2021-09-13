package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public class SimpleAbstractTypeResolver extends AbstractTypeResolver implements Serializable {
    private static final long serialVersionUID = 1;
    protected final HashMap<ClassKey, Class<?>> _mappings = new HashMap<>();

    public <T> SimpleAbstractTypeResolver addMapping(Class<T> cls, Class<? extends T> cls2) {
        if (cls != cls2) {
            String str = "Cannot add mapping from class ";
            if (!cls.isAssignableFrom(cls2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(cls.getName());
                sb.append(" to ");
                sb.append(cls2.getName());
                sb.append(", as latter is not a subtype of former");
                throw new IllegalArgumentException(sb.toString());
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                this._mappings.put(new ClassKey(cls), cls2);
                return this;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(cls.getName());
                sb2.append(" since it is not abstract");
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            throw new IllegalArgumentException("Cannot add mapping from class to itself");
        }
    }

    public JavaType findTypeMapping(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class cls = (Class) this._mappings.get(new ClassKey(javaType.getRawClass()));
        if (cls == null) {
            return null;
        }
        return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, cls);
    }

    public JavaType resolveAbstractType(DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        return null;
    }

    @Deprecated
    public JavaType resolveAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) {
        return null;
    }
}
