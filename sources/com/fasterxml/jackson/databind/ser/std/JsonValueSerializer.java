package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonTypeInfo.C1768As;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;

@JacksonStdImpl
public class JsonValueSerializer extends StdSerializer<Object> implements ContextualSerializer, JsonFormatVisitable, SchemaAware {
    protected final AnnotatedMember _accessor;
    protected final boolean _forceTypeInformation;
    protected final BeanProperty _property;
    protected final JsonSerializer<Object> _valueSerializer;

    static class TypeSerializerRerouter extends TypeSerializer {
        protected final Object _forObject;
        protected final TypeSerializer _typeSerializer;

        public TypeSerializerRerouter(TypeSerializer typeSerializer, Object obj) {
            this._typeSerializer = typeSerializer;
            this._forObject = obj;
        }

        public TypeSerializer forProperty(BeanProperty beanProperty) {
            throw new UnsupportedOperationException();
        }

        public String getPropertyName() {
            return this._typeSerializer.getPropertyName();
        }

        public TypeIdResolver getTypeIdResolver() {
            return this._typeSerializer.getTypeIdResolver();
        }

        public C1768As getTypeInclusion() {
            return this._typeSerializer.getTypeInclusion();
        }

        @Deprecated
        public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this._typeSerializer.writeCustomTypePrefixForArray(this._forObject, jsonGenerator, str);
        }

        @Deprecated
        public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this._typeSerializer.writeCustomTypePrefixForObject(this._forObject, jsonGenerator, str);
        }

        @Deprecated
        public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this._typeSerializer.writeCustomTypePrefixForScalar(this._forObject, jsonGenerator, str);
        }

        @Deprecated
        public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this._typeSerializer.writeCustomTypeSuffixForArray(this._forObject, jsonGenerator, str);
        }

        @Deprecated
        public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this._typeSerializer.writeCustomTypeSuffixForObject(this._forObject, jsonGenerator, str);
        }

        @Deprecated
        public void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
            this._typeSerializer.writeCustomTypeSuffixForScalar(this._forObject, jsonGenerator, str);
        }

        public WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            writableTypeId.forValue = this._forObject;
            return this._typeSerializer.writeTypePrefix(jsonGenerator, writableTypeId);
        }

        @Deprecated
        public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this._typeSerializer.writeTypePrefixForArray(this._forObject, jsonGenerator);
        }

        @Deprecated
        public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this._typeSerializer.writeTypePrefixForObject(this._forObject, jsonGenerator);
        }

        @Deprecated
        public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this._typeSerializer.writeTypePrefixForScalar(this._forObject, jsonGenerator);
        }

        public WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            return this._typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeId);
        }

        @Deprecated
        public void writeTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this._typeSerializer.writeTypeSuffixForArray(this._forObject, jsonGenerator);
        }

        @Deprecated
        public void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this._typeSerializer.writeTypeSuffixForObject(this._forObject, jsonGenerator);
        }

        @Deprecated
        public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
            this._typeSerializer.writeTypeSuffixForScalar(this._forObject, jsonGenerator);
        }

        @Deprecated
        public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
            this._typeSerializer.writeTypePrefixForArray(this._forObject, jsonGenerator, cls);
        }

        @Deprecated
        public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
            this._typeSerializer.writeTypePrefixForObject(this._forObject, jsonGenerator, cls);
        }

        @Deprecated
        public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
            this._typeSerializer.writeTypePrefixForScalar(this._forObject, jsonGenerator, cls);
        }
    }

    public JsonValueSerializer(AnnotatedMember annotatedMember, JsonSerializer<?> jsonSerializer) {
        super(annotatedMember.getType());
        this._accessor = annotatedMember;
        this._valueSerializer = jsonSerializer;
        this._property = null;
        this._forceTypeInformation = true;
    }

    private static final Class<Object> _notNullClass(Class<?> cls) {
        return cls == null ? Object.class : cls;
    }

    /* access modifiers changed from: protected */
    public boolean _acceptJsonFormatVisitorForEnum(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, Class<?> cls) throws JsonMappingException {
        JsonStringFormatVisitor expectStringFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType);
        if (expectStringFormat != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object[] enumConstants = cls.getEnumConstants();
            int length = enumConstants.length;
            int i = 0;
            while (i < length) {
                Object obj = enumConstants[i];
                try {
                    linkedHashSet.add(String.valueOf(this._accessor.getValue(obj)));
                    i++;
                } catch (Exception e) {
                    e = e;
                    while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                        e = e.getCause();
                    }
                    ClassUtil.throwIfError(e);
                    StringBuilder sb = new StringBuilder();
                    sb.append(this._accessor.getName());
                    sb.append("()");
                    throw JsonMappingException.wrapWithPath(e, obj, sb.toString());
                }
            }
            expectStringFormat.enumTypes(linkedHashSet);
        }
        return true;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
        JavaType type = this._accessor.getType();
        Class declaringClass = this._accessor.getDeclaringClass();
        if (declaringClass == null || !ClassUtil.isEnumType(declaringClass) || !_acceptJsonFormatVisitorForEnum(jsonFormatVisitorWrapper, javaType, declaringClass)) {
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = jsonFormatVisitorWrapper.getProvider().findTypedValueSerializer(type, false, this._property);
                if (jsonSerializer == null) {
                    jsonFormatVisitorWrapper.expectAnyFormat(javaType);
                    return;
                }
            }
            jsonSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, type);
        }
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            return withResolved(beanProperty, serializerProvider.handlePrimaryContextualization(jsonSerializer, beanProperty), this._forceTypeInformation);
        }
        JavaType type = this._accessor.getType();
        if (!serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING) && !type.isFinal()) {
            return this;
        }
        JsonSerializer findPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(type, beanProperty);
        return withResolved(beanProperty, findPrimaryPropertySerializer, isNaturalTypeWithStdHandling(type.getRawClass(), findPrimaryPropertySerializer));
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer instanceof SchemaAware) {
            return ((SchemaAware) jsonSerializer).getSchema(serializerProvider, null);
        }
        return JsonSchema.getDefaultSchemaNode();
    }

    /* access modifiers changed from: protected */
    public boolean isNaturalTypeWithStdHandling(Class<?> cls, JsonSerializer<?> jsonSerializer) {
        if (cls.isPrimitive()) {
            if (!(cls == Integer.TYPE || cls == Boolean.TYPE || cls == Double.TYPE)) {
                return false;
            }
        } else if (!(cls == String.class || cls == Integer.class || cls == Boolean.class || cls == Double.class)) {
            return false;
        }
        return isDefaultSerializer(jsonSerializer);
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        try {
            Object value = this._accessor.getValue(obj);
            if (value == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = serializerProvider.findTypedValueSerializer(value.getClass(), true, this._property);
            }
            jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(this._accessor.getName());
            sb.append("()");
            wrapAndThrow(serializerProvider, (Throwable) e, obj, sb.toString());
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        try {
            Object value = this._accessor.getValue(obj);
            if (value == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = serializerProvider.findValueSerializer(value.getClass(), this._property);
            } else if (this._forceTypeInformation) {
                WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(obj, JsonToken.VALUE_STRING));
                jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
                typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
                return;
            }
            jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, new TypeSerializerRerouter(typeSerializer, obj));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(this._accessor.getName());
            sb.append("()");
            wrapAndThrow(serializerProvider, (Throwable) e, obj, sb.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(@JsonValue serializer for method ");
        sb.append(this._accessor.getDeclaringClass());
        sb.append("#");
        sb.append(this._accessor.getName());
        sb.append(")");
        return sb.toString();
    }

    public JsonValueSerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, boolean z) {
        if (this._property == beanProperty && this._valueSerializer == jsonSerializer && z == this._forceTypeInformation) {
            return this;
        }
        return new JsonValueSerializer(this, beanProperty, jsonSerializer, z);
    }

    public JsonValueSerializer(JsonValueSerializer jsonValueSerializer, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, boolean z) {
        super(_notNullClass(jsonValueSerializer.handledType()));
        this._accessor = jsonValueSerializer._accessor;
        this._valueSerializer = jsonSerializer;
        this._property = beanProperty;
        this._forceTypeInformation = z;
    }
}
