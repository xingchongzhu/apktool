package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public abstract class ContainerSerializer<T> extends StdSerializer<T> {
    protected ContainerSerializer(Class<T> cls) {
        super(cls);
    }

    /* access modifiers changed from: protected */
    public abstract ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer);

    public abstract JsonSerializer<?> getContentSerializer();

    public abstract JavaType getContentType();

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean hasContentTypeAnnotation(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        return false;
    }

    public abstract boolean hasSingleElement(T t);

    public ContainerSerializer<?> withValueTypeSerializer(TypeSerializer typeSerializer) {
        return typeSerializer == null ? this : _withValueTypeSerializer(typeSerializer);
    }

    protected ContainerSerializer(JavaType javaType) {
        super(javaType);
    }

    protected ContainerSerializer(Class<?> cls, boolean z) {
        super(cls, z);
    }

    protected ContainerSerializer(ContainerSerializer<?> containerSerializer) {
        super(containerSerializer._handledType, false);
    }
}
