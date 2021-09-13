package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

public class NullNode extends ValueNode {
    public static final NullNode instance = new NullNode();
    private static final long serialVersionUID = 1;

    protected NullNode() {
    }

    public static NullNode getInstance() {
        return instance;
    }

    public String asText() {
        return "null";
    }

    public String asText(String str) {
        return str;
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NULL;
    }

    public boolean equals(Object obj) {
        return obj == this || (obj instanceof NullNode);
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.NULL;
    }

    public int hashCode() {
        return JsonNodeType.NULL.ordinal();
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return instance;
    }

    public JsonNode requireNonNull() {
        return (JsonNode) _reportRequiredViolation("requireNonNull() called on `NullNode`", new Object[0]);
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        serializerProvider.defaultSerializeNull(jsonGenerator);
    }
}
