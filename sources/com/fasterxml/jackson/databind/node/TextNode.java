package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.p194io.CharTypes;
import com.fasterxml.jackson.core.p194io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.IOException;

public class TextNode extends ValueNode {
    static final TextNode EMPTY_STRING_NODE = new TextNode("");
    private static final long serialVersionUID = 2;
    protected final String _value;

    public TextNode(String str) {
        this._value = str;
    }

    @Deprecated
    protected static void appendQuoted(StringBuilder sb, String str) {
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        CharTypes.appendQuoted(sb, str);
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
    }

    public static TextNode valueOf(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return EMPTY_STRING_NODE;
        }
        return new TextNode(str);
    }

    public boolean asBoolean(boolean z) {
        String str = this._value;
        if (str != null) {
            String trim = str.trim();
            if ("true".equals(trim)) {
                return true;
            }
            if ("false".equals(trim)) {
                z = false;
            }
        }
        return z;
    }

    public double asDouble(double d) {
        return NumberInput.parseAsDouble(this._value, d);
    }

    public int asInt(int i) {
        return NumberInput.parseAsInt(this._value, i);
    }

    public long asLong(long j) {
        return NumberInput.parseAsLong(this._value, j);
    }

    public String asText() {
        return this._value;
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_STRING;
    }

    public byte[] binaryValue() throws IOException {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof TextNode)) {
            return ((TextNode) obj)._value.equals(this._value);
        }
        return false;
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        String trim = this._value.trim();
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(((trim.length() * 3) >> 2) + 4);
        try {
            base64Variant.decode(trim, byteArrayBuilder);
            return byteArrayBuilder.toByteArray();
        } catch (IllegalArgumentException e) {
            throw InvalidFormatException.from(null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", new Object[]{e.getMessage()}), trim, byte[].class);
        }
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.STRING;
    }

    public int hashCode() {
        return this._value.hashCode();
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String str = this._value;
        if (str == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeString(str);
        }
    }

    public String textValue() {
        return this._value;
    }

    public String asText(String str) {
        String str2 = this._value;
        return str2 == null ? str : str2;
    }
}
