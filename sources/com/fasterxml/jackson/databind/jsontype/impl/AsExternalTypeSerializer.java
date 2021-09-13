package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.C1768As;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.io.IOException;

public class AsExternalTypeSerializer extends TypeSerializerBase {
    protected final String _typePropertyName;

    public AsExternalTypeSerializer(TypeIdResolver typeIdResolver, BeanProperty beanProperty, String str) {
        super(typeIdResolver, beanProperty);
        this._typePropertyName = str;
    }

    /* access modifiers changed from: protected */
    public final void _writeArrayPrefix(Object obj, JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeStartArray();
    }

    /* access modifiers changed from: protected */
    public final void _writeArraySuffix(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        jsonGenerator.writeEndArray();
        if (str != null) {
            jsonGenerator.writeStringField(this._typePropertyName, str);
        }
    }

    /* access modifiers changed from: protected */
    public final void _writeObjectPrefix(Object obj, JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeStartObject();
    }

    /* access modifiers changed from: protected */
    public final void _writeObjectSuffix(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        jsonGenerator.writeEndObject();
        if (str != null) {
            jsonGenerator.writeStringField(this._typePropertyName, str);
        }
    }

    /* access modifiers changed from: protected */
    public final void _writeScalarPrefix(Object obj, JsonGenerator jsonGenerator) throws IOException {
    }

    /* access modifiers changed from: protected */
    public final void _writeScalarSuffix(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        if (str != null) {
            jsonGenerator.writeStringField(this._typePropertyName, str);
        }
    }

    public String getPropertyName() {
        return this._typePropertyName;
    }

    public C1768As getTypeInclusion() {
        return C1768As.EXTERNAL_PROPERTY;
    }

    public AsExternalTypeSerializer forProperty(BeanProperty beanProperty) {
        return this._property == beanProperty ? this : new AsExternalTypeSerializer(this._idResolver, beanProperty, this._typePropertyName);
    }
}
