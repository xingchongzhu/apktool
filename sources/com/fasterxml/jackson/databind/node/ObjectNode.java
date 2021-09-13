package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ObjectNode extends ContainerNode<ObjectNode> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Map<String, JsonNode> _children;

    public ObjectNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new LinkedHashMap();
    }

    /* access modifiers changed from: protected */
    public JsonNode _at(JsonPointer jsonPointer) {
        return get(jsonPointer.getMatchingProperty());
    }

    /* access modifiers changed from: protected */
    public boolean _childrenEqual(ObjectNode objectNode) {
        return this._children.equals(objectNode._children);
    }

    /* access modifiers changed from: protected */
    public ObjectNode _put(String str, JsonNode jsonNode) {
        this._children.put(str, jsonNode);
        return this;
    }

    public JsonToken asToken() {
        return JsonToken.START_OBJECT;
    }

    public Iterator<JsonNode> elements() {
        return this._children.values().iterator();
    }

    public boolean equals(Comparator<JsonNode> comparator, JsonNode jsonNode) {
        if (!(jsonNode instanceof ObjectNode)) {
            return false;
        }
        ObjectNode objectNode = (ObjectNode) jsonNode;
        Map<String, JsonNode> map = this._children;
        Map<String, JsonNode> map2 = objectNode._children;
        if (map2.size() != map.size()) {
            return false;
        }
        for (Entry entry : map.entrySet()) {
            JsonNode jsonNode2 = (JsonNode) map2.get(entry.getKey());
            if (jsonNode2 != null) {
                if (!((JsonNode) entry.getValue()).equals(comparator, jsonNode2)) {
                }
            }
            return false;
        }
        return true;
    }

    public Iterator<String> fieldNames() {
        return this._children.keySet().iterator();
    }

    public Iterator<Entry<String, JsonNode>> fields() {
        return this._children.entrySet().iterator();
    }

    public List<JsonNode> findParents(String str, List<JsonNode> list) {
        for (Entry entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(this);
            } else {
                list = ((JsonNode) entry.getValue()).findParents(str, list);
            }
        }
        return list;
    }

    public JsonNode findValue(String str) {
        for (Entry entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                return (JsonNode) entry.getValue();
            }
            JsonNode findValue = ((JsonNode) entry.getValue()).findValue(str);
            if (findValue != null) {
                return findValue;
            }
        }
        return null;
    }

    public List<JsonNode> findValues(String str, List<JsonNode> list) {
        for (Entry entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(entry.getValue());
            } else {
                list = ((JsonNode) entry.getValue()).findValues(str, list);
            }
        }
        return list;
    }

    public List<String> findValuesAsText(String str, List<String> list) {
        for (Entry entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(((JsonNode) entry.getValue()).asText());
            } else {
                list = ((JsonNode) entry.getValue()).findValuesAsText(str, list);
            }
        }
        return list;
    }

    public JsonNode get(int i) {
        return null;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.OBJECT;
    }

    public int hashCode() {
        return this._children.hashCode();
    }

    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    public final boolean isObject() {
        return true;
    }

    @Deprecated
    public JsonNode put(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        return (JsonNode) this._children.put(str, jsonNode);
    }

    @Deprecated
    public JsonNode putAll(Map<String, ? extends JsonNode> map) {
        return setAll(map);
    }

    public ArrayNode putArray(String str) {
        ArrayNode arrayNode = arrayNode();
        _put(str, arrayNode);
        return arrayNode;
    }

    public ObjectNode putNull(String str) {
        this._children.put(str, nullNode());
        return this;
    }

    public ObjectNode putObject(String str) {
        ObjectNode objectNode = objectNode();
        _put(str, objectNode);
        return objectNode;
    }

    public ObjectNode putPOJO(String str, Object obj) {
        return _put(str, pojoNode(obj));
    }

    public ObjectNode putRawValue(String str, RawValue rawValue) {
        return _put(str, rawValueNode(rawValue));
    }

    public JsonNode remove(String str) {
        return (JsonNode) this._children.remove(str);
    }

    public JsonNode replace(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        return (JsonNode) this._children.put(str, jsonNode);
    }

    public JsonNode required(String str) {
        JsonNode jsonNode = (JsonNode) this._children.get(str);
        if (jsonNode != null) {
            return jsonNode;
        }
        return (JsonNode) _reportRequiredViolation("No value for property '%s' of `ObjectNode`", str);
    }

    public ObjectNode retain(Collection<String> collection) {
        this._children.keySet().retainAll(collection);
        return this;
    }

    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        boolean z = serializerProvider != null && !serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
        jsonGenerator.writeStartObject(this);
        for (Entry entry : this._children.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (!z || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(serializerProvider)) {
                jsonGenerator.writeFieldName((String) entry.getKey());
                baseJsonNode.serialize(jsonGenerator, serializerProvider);
            }
        }
        jsonGenerator.writeEndObject();
    }

    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        boolean z = serializerProvider != null && !serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_OBJECT));
        for (Entry entry : this._children.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (!z || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(serializerProvider)) {
                jsonGenerator.writeFieldName((String) entry.getKey());
                baseJsonNode.serialize(jsonGenerator, serializerProvider);
            }
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public <T extends JsonNode> T set(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        this._children.put(str, jsonNode);
        return this;
    }

    public <T extends JsonNode> T setAll(Map<String, ? extends JsonNode> map) {
        for (Entry entry : map.entrySet()) {
            Object obj = (JsonNode) entry.getValue();
            if (obj == null) {
                obj = nullNode();
            }
            this._children.put(entry.getKey(), obj);
        }
        return this;
    }

    public int size() {
        return this._children.size();
    }

    public <T extends JsonNode> T without(String str) {
        this._children.remove(str);
        return this;
    }

    public ObjectNode deepCopy() {
        ObjectNode objectNode = new ObjectNode(this._nodeFactory);
        for (Entry entry : this._children.entrySet()) {
            objectNode._children.put(entry.getKey(), ((JsonNode) entry.getValue()).deepCopy());
        }
        return objectNode;
    }

    public ObjectNode findParent(String str) {
        for (Entry entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                return this;
            }
            JsonNode findParent = ((JsonNode) entry.getValue()).findParent(str);
            if (findParent != null) {
                return (ObjectNode) findParent;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return this._children.isEmpty();
    }

    @Deprecated
    public JsonNode putAll(ObjectNode objectNode) {
        return setAll(objectNode);
    }

    public ObjectNode remove(Collection<String> collection) {
        this._children.keySet().removeAll(collection);
        return this;
    }

    public ObjectNode removeAll() {
        this._children.clear();
        return this;
    }

    public ObjectNode retain(String... strArr) {
        return retain((Collection<String>) Arrays.asList(strArr));
    }

    public ObjectNode with(String str) {
        JsonNode jsonNode = (JsonNode) this._children.get(str);
        if (jsonNode == null) {
            ObjectNode objectNode = objectNode();
            this._children.put(str, objectNode);
            return objectNode;
        } else if (jsonNode instanceof ObjectNode) {
            return (ObjectNode) jsonNode;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Property '");
            sb.append(str);
            sb.append("' has value that is not of type ObjectNode (but ");
            sb.append(jsonNode.getClass().getName());
            sb.append(")");
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    public ArrayNode withArray(String str) {
        JsonNode jsonNode = (JsonNode) this._children.get(str);
        if (jsonNode == null) {
            ArrayNode arrayNode = arrayNode();
            this._children.put(str, arrayNode);
            return arrayNode;
        } else if (jsonNode instanceof ArrayNode) {
            return (ArrayNode) jsonNode;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Property '");
            sb.append(str);
            sb.append("' has value that is not of type ArrayNode (but ");
            sb.append(jsonNode.getClass().getName());
            sb.append(")");
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    public <T extends JsonNode> T without(Collection<String> collection) {
        this._children.keySet().removeAll(collection);
        return this;
    }

    public ObjectNode(JsonNodeFactory jsonNodeFactory, Map<String, JsonNode> map) {
        super(jsonNodeFactory);
        this._children = map;
    }

    public JsonNode get(String str) {
        return (JsonNode) this._children.get(str);
    }

    public JsonNode path(int i) {
        return MissingNode.getInstance();
    }

    public ObjectNode put(String str, short s) {
        return _put(str, numberNode(s));
    }

    public JsonNode path(String str) {
        JsonNode jsonNode = (JsonNode) this._children.get(str);
        if (jsonNode != null) {
            return jsonNode;
        }
        return MissingNode.getInstance();
    }

    public ObjectNode put(String str, Short sh) {
        JsonNode jsonNode;
        if (sh == null) {
            jsonNode = nullNode();
        } else {
            jsonNode = numberNode(sh.shortValue());
        }
        return _put(str, jsonNode);
    }

    public <T extends JsonNode> T setAll(ObjectNode objectNode) {
        this._children.putAll(objectNode._children);
        return this;
    }

    public ObjectNode put(String str, int i) {
        return _put(str, numberNode(i));
    }

    public ObjectNode put(String str, Integer num) {
        JsonNode jsonNode;
        if (num == null) {
            jsonNode = nullNode();
        } else {
            jsonNode = numberNode(num.intValue());
        }
        return _put(str, jsonNode);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ObjectNode)) {
            return _childrenEqual((ObjectNode) obj);
        }
        return false;
    }

    public ObjectNode put(String str, long j) {
        return _put(str, numberNode(j));
    }

    public ObjectNode put(String str, Long l) {
        JsonNode jsonNode;
        if (l == null) {
            jsonNode = nullNode();
        } else {
            jsonNode = numberNode(l.longValue());
        }
        return _put(str, jsonNode);
    }

    public ObjectNode put(String str, float f) {
        return _put(str, numberNode(f));
    }

    public ObjectNode put(String str, Float f) {
        JsonNode jsonNode;
        if (f == null) {
            jsonNode = nullNode();
        } else {
            jsonNode = numberNode(f.floatValue());
        }
        return _put(str, jsonNode);
    }

    public ObjectNode put(String str, double d) {
        return _put(str, numberNode(d));
    }

    public ObjectNode put(String str, Double d) {
        JsonNode jsonNode;
        if (d == null) {
            jsonNode = nullNode();
        } else {
            jsonNode = numberNode(d.doubleValue());
        }
        return _put(str, jsonNode);
    }

    public ObjectNode put(String str, BigDecimal bigDecimal) {
        JsonNode jsonNode;
        if (bigDecimal == null) {
            jsonNode = nullNode();
        } else {
            jsonNode = numberNode(bigDecimal);
        }
        return _put(str, jsonNode);
    }

    public ObjectNode put(String str, BigInteger bigInteger) {
        JsonNode jsonNode;
        if (bigInteger == null) {
            jsonNode = nullNode();
        } else {
            jsonNode = numberNode(bigInteger);
        }
        return _put(str, jsonNode);
    }

    public ObjectNode put(String str, String str2) {
        JsonNode jsonNode;
        if (str2 == null) {
            jsonNode = nullNode();
        } else {
            jsonNode = textNode(str2);
        }
        return _put(str, jsonNode);
    }

    public ObjectNode put(String str, boolean z) {
        return _put(str, booleanNode(z));
    }

    public ObjectNode put(String str, Boolean bool) {
        JsonNode jsonNode;
        if (bool == null) {
            jsonNode = nullNode();
        } else {
            jsonNode = booleanNode(bool.booleanValue());
        }
        return _put(str, jsonNode);
    }

    public ObjectNode put(String str, byte[] bArr) {
        JsonNode jsonNode;
        if (bArr == null) {
            jsonNode = nullNode();
        } else {
            jsonNode = binaryNode(bArr);
        }
        return _put(str, jsonNode);
    }
}