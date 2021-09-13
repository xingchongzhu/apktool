package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;

public abstract class TypeIdResolverBase implements TypeIdResolver {
    protected final JavaType _baseType;
    protected final TypeFactory _typeFactory;

    protected TypeIdResolverBase() {
        this(null, null);
    }

    public String getDescForKnownTypeIds() {
        return null;
    }

    public String idFromBaseType() {
        return idFromValueAndType(null, this._baseType.getRawClass());
    }

    public void init(JavaType javaType) {
    }

    public JavaType typeFromId(DatabindContext databindContext, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Sub-class ");
        sb.append(getClass().getName());
        sb.append(" MUST implement `typeFromId(DatabindContext,String)");
        throw new IllegalStateException(sb.toString());
    }

    protected TypeIdResolverBase(JavaType javaType, TypeFactory typeFactory) {
        this._baseType = javaType;
        this._typeFactory = typeFactory;
    }
}
