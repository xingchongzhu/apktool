package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.Collection;

@JacksonStdImpl
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final JsonDeserializer<Object> _delegateDeserializer;
    protected final JsonDeserializer<String> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;

    public StringCollectionDeserializer(JavaType javaType, JsonDeserializer<?> jsonDeserializer, ValueInstantiator valueInstantiator) {
        this(javaType, valueInstantiator, null, jsonDeserializer, jsonDeserializer, null);
    }

    private Collection<String> deserializeUsingCustom(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection, JsonDeserializer<String> jsonDeserializer) throws IOException {
        String str;
        while (true) {
            try {
                if (jsonParser.nextTextValue() == null) {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (currentToken != JsonToken.VALUE_NULL) {
                        str = (String) jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        str = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                } else {
                    str = (String) jsonDeserializer.deserialize(jsonParser, deserializationContext);
                }
                collection.add(str);
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) collection, collection.size());
            }
        }
    }

    private final Collection<String> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str;
        Boolean bool = this._unwrapSingle;
        if (!(bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)))) {
            return (Collection) deserializationContext.handleUnexpectedToken(this._containerType.getRawClass(), jsonParser);
        }
        JsonDeserializer<String> jsonDeserializer = this._valueDeserializer;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            if (this._skipNullValues) {
                return collection;
            }
            str = (String) this._nullProvider.getNullValue(deserializationContext);
        } else if (jsonDeserializer == null) {
            try {
                str = _parseString(jsonParser, deserializationContext);
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) collection, collection.size());
            }
        } else {
            str = (String) jsonDeserializer.deserialize(jsonParser, deserializationContext);
        }
        collection.add(str);
        return collection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createContextual(com.fasterxml.jackson.databind.DeserializationContext r6, com.fasterxml.jackson.databind.BeanProperty r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5._valueInstantiator
            r1 = 0
            if (r0 == 0) goto L_0x0031
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r0.getArrayDelegateCreator()
            if (r0 == 0) goto L_0x001a
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5._valueInstantiator
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r6.getConfig()
            com.fasterxml.jackson.databind.JavaType r0 = r0.getArrayDelegateType(r2)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r5.findDeserializer(r6, r0, r7)
            goto L_0x0032
        L_0x001a:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5._valueInstantiator
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r0.getDelegateCreator()
            if (r0 == 0) goto L_0x0031
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r5._valueInstantiator
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r6.getConfig()
            com.fasterxml.jackson.databind.JavaType r0 = r0.getDelegateType(r2)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r5.findDeserializer(r6, r0, r7)
            goto L_0x0032
        L_0x0031:
            r0 = r1
        L_0x0032:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> r2 = r5._valueDeserializer
            com.fasterxml.jackson.databind.JavaType r3 = r5._containerType
            com.fasterxml.jackson.databind.JavaType r3 = r3.getContentType()
            if (r2 != 0) goto L_0x0047
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r5.findConvertingContentDeserializer(r6, r7, r2)
            if (r2 != 0) goto L_0x004b
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r6.findContextualValueDeserializer(r3, r7)
            goto L_0x004b
        L_0x0047:
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r6.handleSecondaryContextualization(r2, r7, r3)
        L_0x004b:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            com.fasterxml.jackson.annotation.JsonFormat$Feature r4 = com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r3 = r5.findFormatFeature(r6, r7, r3, r4)
            com.fasterxml.jackson.databind.deser.NullValueProvider r6 = r5.findContentNullProvider(r6, r7, r2)
            boolean r7 = r5.isDefaultDeserializer(r2)
            if (r7 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = r2
        L_0x005f:
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r6 = r5.withResolved(r0, r1, r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public boolean isCachable() {
        return this._valueDeserializer == null && this._delegateDeserializer == null;
    }

    /* access modifiers changed from: protected */
    public StringCollectionDeserializer withResolved(JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        if (this._unwrapSingle == bool && this._nullProvider == nullValueProvider && this._valueDeserializer == jsonDeserializer2 && this._delegateDeserializer == jsonDeserializer) {
            return this;
        }
        StringCollectionDeserializer stringCollectionDeserializer = new StringCollectionDeserializer(this._containerType, this._valueInstantiator, jsonDeserializer, jsonDeserializer2, nullValueProvider, bool);
        return stringCollectionDeserializer;
    }

    protected StringCollectionDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType, nullValueProvider, bool);
        this._valueDeserializer = jsonDeserializer2;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = jsonDeserializer;
    }

    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        return deserialize(jsonParser, deserializationContext, (Collection) this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        JsonDeserializer<String> jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer != null) {
            return deserializeUsingCustom(jsonParser, deserializationContext, collection, jsonDeserializer);
        }
        while (true) {
            try {
                String nextTextValue = jsonParser.nextTextValue();
                if (nextTextValue != null) {
                    collection.add(nextTextValue);
                } else {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (currentToken != JsonToken.VALUE_NULL) {
                        str = _parseString(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        str = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                    collection.add(str);
                }
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) collection, collection.size());
            }
        }
    }
}
