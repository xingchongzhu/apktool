package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.C1768As;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;

public class AsWrapperTypeDeserializer extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    public AsWrapperTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2) {
        super(javaType, typeIdResolver, str, z, javaType2);
    }

    /* access modifiers changed from: protected */
    public Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.canReadTypeId()) {
            Object typeId = jsonParser.getTypeId();
            if (typeId != null) {
                return _deserializeWithNativeTypeId(jsonParser, deserializationContext, typeId);
            }
        }
        JsonToken currentToken = jsonParser.currentToken();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (currentToken == jsonToken) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (nextToken != jsonToken2) {
                JavaType baseType = baseType();
                StringBuilder sb = new StringBuilder();
                sb.append("need JSON String that contains type id (for subtype of ");
                sb.append(baseTypeName());
                sb.append(")");
                deserializationContext.reportWrongTokenException(baseType, jsonToken2, sb.toString(), new Object[0]);
            }
        } else if (currentToken != JsonToken.FIELD_NAME) {
            JavaType baseType2 = baseType();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("need JSON Object to contain As.WRAPPER_OBJECT type information for class ");
            sb2.append(baseTypeName());
            deserializationContext.reportWrongTokenException(baseType2, jsonToken, sb2.toString(), new Object[0]);
        }
        String text = jsonParser.getText();
        JsonDeserializer _findDeserializer = _findDeserializer(deserializationContext, text);
        jsonParser.nextToken();
        if (this._typeIdVisible && jsonParser.hasToken(jsonToken)) {
            TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) null, false);
            tokenBuffer.writeStartObject();
            tokenBuffer.writeFieldName(this._typePropertyName);
            tokenBuffer.writeString(text);
            jsonParser.clearCurrentToken();
            jsonParser = JsonParserSequence.createFlattened(false, tokenBuffer.asParser(jsonParser), jsonParser);
            jsonParser.nextToken();
        }
        Object deserialize = _findDeserializer.deserialize(jsonParser, deserializationContext);
        JsonToken nextToken2 = jsonParser.nextToken();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (nextToken2 != jsonToken3) {
            deserializationContext.reportWrongTokenException(baseType(), jsonToken3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        }
        return deserialize;
    }

    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsWrapperTypeDeserializer(this, beanProperty);
    }

    public C1768As getTypeInclusion() {
        return C1768As.WRAPPER_OBJECT;
    }

    protected AsWrapperTypeDeserializer(AsWrapperTypeDeserializer asWrapperTypeDeserializer, BeanProperty beanProperty) {
        super(asWrapperTypeDeserializer, beanProperty);
    }
}
