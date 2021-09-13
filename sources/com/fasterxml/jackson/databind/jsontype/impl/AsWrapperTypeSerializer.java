package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.C1768As;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;

public class AsWrapperTypeSerializer extends TypeSerializerBase {
    public AsWrapperTypeSerializer(TypeIdResolver typeIdResolver, BeanProperty beanProperty) {
        super(typeIdResolver, beanProperty);
    }

    /* access modifiers changed from: protected */
    public String _validTypeId(String str) {
        return ClassUtil.nonNullString(str);
    }

    /* access modifiers changed from: protected */
    public final void _writeTypeId(JsonGenerator jsonGenerator, String str) throws IOException {
        if (str != null) {
            jsonGenerator.writeTypeId(str);
        }
    }

    public C1768As getTypeInclusion() {
        return C1768As.WRAPPER_OBJECT;
    }

    public AsWrapperTypeSerializer forProperty(BeanProperty beanProperty) {
        return this._property == beanProperty ? this : new AsWrapperTypeSerializer(this._idResolver, beanProperty);
    }
}
