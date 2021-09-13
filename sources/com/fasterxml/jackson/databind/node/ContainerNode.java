package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.util.RawValue;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode implements JsonNodeCreator {
    private static final long serialVersionUID = 1;
    protected final JsonNodeFactory _nodeFactory;

    protected ContainerNode(JsonNodeFactory jsonNodeFactory) {
        this._nodeFactory = jsonNodeFactory;
    }

    public final ArrayNode arrayNode() {
        return this._nodeFactory.arrayNode();
    }

    public String asText() {
        return "";
    }

    public abstract JsonToken asToken();

    public abstract JsonNode get(int i);

    public abstract JsonNode get(String str);

    public JsonNode missingNode() {
        return this._nodeFactory.missingNode();
    }

    public final ObjectNode objectNode() {
        return this._nodeFactory.objectNode();
    }

    public final ValueNode pojoNode(Object obj) {
        return this._nodeFactory.pojoNode(obj);
    }

    public final ValueNode rawValueNode(RawValue rawValue) {
        return this._nodeFactory.rawValueNode(rawValue);
    }

    public abstract T removeAll();

    public abstract int size();

    public final ArrayNode arrayNode(int i) {
        return this._nodeFactory.arrayNode(i);
    }

    public final BooleanNode booleanNode(boolean z) {
        return this._nodeFactory.booleanNode(z);
    }

    public final NullNode nullNode() {
        return this._nodeFactory.nullNode();
    }

    public final TextNode textNode(String str) {
        return this._nodeFactory.textNode(str);
    }

    protected ContainerNode() {
        this._nodeFactory = null;
    }

    public final BinaryNode binaryNode(byte[] bArr) {
        return this._nodeFactory.binaryNode(bArr);
    }

    public final BinaryNode binaryNode(byte[] bArr, int i, int i2) {
        return this._nodeFactory.binaryNode(bArr, i, i2);
    }

    public final NumericNode numberNode(byte b) {
        return this._nodeFactory.numberNode(b);
    }

    public final NumericNode numberNode(short s) {
        return this._nodeFactory.numberNode(s);
    }

    public final NumericNode numberNode(int i) {
        return this._nodeFactory.numberNode(i);
    }

    public final NumericNode numberNode(long j) {
        return this._nodeFactory.numberNode(j);
    }

    public final NumericNode numberNode(float f) {
        return this._nodeFactory.numberNode(f);
    }

    public final NumericNode numberNode(double d) {
        return this._nodeFactory.numberNode(d);
    }

    public final ValueNode numberNode(BigInteger bigInteger) {
        return this._nodeFactory.numberNode(bigInteger);
    }

    public final ValueNode numberNode(BigDecimal bigDecimal) {
        return this._nodeFactory.numberNode(bigDecimal);
    }

    public final ValueNode numberNode(Byte b) {
        return this._nodeFactory.numberNode(b);
    }

    public final ValueNode numberNode(Short sh) {
        return this._nodeFactory.numberNode(sh);
    }

    public final ValueNode numberNode(Integer num) {
        return this._nodeFactory.numberNode(num);
    }

    public final ValueNode numberNode(Long l) {
        return this._nodeFactory.numberNode(l);
    }

    public final ValueNode numberNode(Float f) {
        return this._nodeFactory.numberNode(f);
    }

    public final ValueNode numberNode(Double d) {
        return this._nodeFactory.numberNode(d);
    }
}
