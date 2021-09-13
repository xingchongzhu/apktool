package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.util.EnumSet;

public class EnumSetDeserializer extends StdDeserializer<EnumSet<?>> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected JsonDeserializer<Enum<?>> _enumDeserializer;
    protected final JavaType _enumType;
    protected final NullValueProvider _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    public EnumSetDeserializer(JavaType javaType, JsonDeserializer<?> jsonDeserializer) {
        super(EnumSet.class);
        this._enumType = javaType;
        if (javaType.isEnumType()) {
            this._enumDeserializer = jsonDeserializer;
            this._unwrapSingle = null;
            this._nullProvider = null;
            this._skipNullValues = false;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Type ");
        sb.append(javaType);
        sb.append(" not Java Enum type");
        throw new IllegalArgumentException(sb.toString());
    }

    private EnumSet constructSet() {
        return EnumSet.noneOf(this._enumType.getRawClass());
    }

    /* access modifiers changed from: protected */
    public final EnumSet<?> _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        Enum enumR;
        while (true) {
            try {
                JsonToken nextToken = jsonParser.nextToken();
                if (nextToken == JsonToken.END_ARRAY) {
                    return enumSet;
                }
                if (nextToken != JsonToken.VALUE_NULL) {
                    enumR = (Enum) this._enumDeserializer.deserialize(jsonParser, deserializationContext);
                } else if (!this._skipNullValues) {
                    enumR = (Enum) this._nullProvider.getNullValue(deserializationContext);
                }
                if (enumR != null) {
                    enumSet.add(enumR);
                }
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) enumSet, enumSet.size());
            }
        }
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer jsonDeserializer;
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, EnumSet.class, Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonDeserializer<Enum<?>> jsonDeserializer2 = this._enumDeserializer;
        if (jsonDeserializer2 == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(this._enumType, beanProperty);
        } else {
            jsonDeserializer = deserializationContext.handleSecondaryContextualization(jsonDeserializer2, beanProperty, this._enumType);
        }
        return withResolved(jsonDeserializer, findContentNullProvider(deserializationContext, beanProperty, jsonDeserializer), findFormatFeature);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return constructSet();
    }

    /* access modifiers changed from: protected */
    public EnumSet<?> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        Boolean bool = this._unwrapSingle;
        if (!(bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)))) {
            return (EnumSet) deserializationContext.handleUnexpectedToken(EnumSet.class, jsonParser);
        }
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            return (EnumSet) deserializationContext.handleUnexpectedToken(this._enumType, jsonParser);
        }
        try {
            Enum enumR = (Enum) this._enumDeserializer.deserialize(jsonParser, deserializationContext);
            if (enumR != null) {
                enumSet.add(enumR);
            }
            return enumSet;
        } catch (Exception e) {
            throw JsonMappingException.wrapWithPath((Throwable) e, (Object) enumSet, enumSet.size());
        }
    }

    public boolean isCachable() {
        return this._enumType.getValueHandler() == null;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public EnumSetDeserializer withDeserializer(JsonDeserializer<?> jsonDeserializer) {
        if (this._enumDeserializer == jsonDeserializer) {
            return this;
        }
        return new EnumSetDeserializer(this, jsonDeserializer, this._nullProvider, this._unwrapSingle);
    }

    @Deprecated
    public EnumSetDeserializer withResolved(JsonDeserializer<?> jsonDeserializer, Boolean bool) {
        return withResolved(jsonDeserializer, this._nullProvider, bool);
    }

    public EnumSetDeserializer withResolved(JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        if (this._unwrapSingle == bool && this._enumDeserializer == jsonDeserializer && this._nullProvider == jsonDeserializer) {
            return this;
        }
        return new EnumSetDeserializer(this, jsonDeserializer, nullValueProvider, bool);
    }

    public EnumSet<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        EnumSet constructSet = constructSet();
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext, constructSet);
        }
        return _deserialize(jsonParser, deserializationContext, constructSet);
    }

    public EnumSet<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet<?> enumSet) throws IOException {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext, enumSet);
        }
        return _deserialize(jsonParser, deserializationContext, enumSet);
    }

    @Deprecated
    protected EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, JsonDeserializer<?> jsonDeserializer, Boolean bool) {
        this(enumSetDeserializer, jsonDeserializer, enumSetDeserializer._nullProvider, bool);
    }

    protected EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super((StdDeserializer<?>) enumSetDeserializer);
        this._enumType = enumSetDeserializer._enumType;
        this._enumDeserializer = jsonDeserializer;
        this._nullProvider = nullValueProvider;
        this._skipNullValues = NullsConstantProvider.isSkipper(nullValueProvider);
        this._unwrapSingle = bool;
    }
}
