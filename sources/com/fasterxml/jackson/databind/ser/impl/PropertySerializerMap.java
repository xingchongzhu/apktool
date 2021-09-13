package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Arrays;

public abstract class PropertySerializerMap {
    protected final boolean _resetWhenFull;

    private static final class Double extends PropertySerializerMap {
        private final JsonSerializer<Object> _serializer1;
        private final JsonSerializer<Object> _serializer2;
        private final Class<?> _type1;
        private final Class<?> _type2;

        public Double(PropertySerializerMap propertySerializerMap, Class<?> cls, JsonSerializer<Object> jsonSerializer, Class<?> cls2, JsonSerializer<Object> jsonSerializer2) {
            super(propertySerializerMap);
            this._type1 = cls;
            this._serializer1 = jsonSerializer;
            this._type2 = cls2;
            this._serializer2 = jsonSerializer2;
        }

        public PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new Multi(this, new TypeAndSerializer[]{new TypeAndSerializer(this._type1, this._serializer1), new TypeAndSerializer(this._type2, this._serializer2), new TypeAndSerializer(cls, jsonSerializer)});
        }

        public JsonSerializer<Object> serializerFor(Class<?> cls) {
            if (cls == this._type1) {
                return this._serializer1;
            }
            if (cls == this._type2) {
                return this._serializer2;
            }
            return null;
        }
    }

    private static final class Empty extends PropertySerializerMap {
        public static final Empty FOR_PROPERTIES = new Empty(false);
        public static final Empty FOR_ROOT_VALUES = new Empty(true);

        protected Empty(boolean z) {
            super(z);
        }

        public PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new Single(this, cls, jsonSerializer);
        }

        public JsonSerializer<Object> serializerFor(Class<?> cls) {
            return null;
        }
    }

    private static final class Multi extends PropertySerializerMap {
        private static final int MAX_ENTRIES = 8;
        private final TypeAndSerializer[] _entries;

        public Multi(PropertySerializerMap propertySerializerMap, TypeAndSerializer[] typeAndSerializerArr) {
            super(propertySerializerMap);
            this._entries = typeAndSerializerArr;
        }

        public PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            TypeAndSerializer[] typeAndSerializerArr = this._entries;
            int length = typeAndSerializerArr.length;
            if (length == 8) {
                return this._resetWhenFull ? new Single(this, cls, jsonSerializer) : this;
            }
            TypeAndSerializer[] typeAndSerializerArr2 = (TypeAndSerializer[]) Arrays.copyOf(typeAndSerializerArr, length + 1);
            typeAndSerializerArr2[length] = new TypeAndSerializer(cls, jsonSerializer);
            return new Multi(this, typeAndSerializerArr2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
            r1 = r0[6];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
            if (r1.type != r4) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
            return r1.serializer;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            r1 = r0[5];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
            if (r1.type != r4) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
            return r1.serializer;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
            r1 = r0[4];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
            if (r1.type != r4) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
            return r1.serializer;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
            r0 = r0[3];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
            if (r0.type != r4) goto L_0x0057;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
            return r0.serializer;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0058, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> serializerFor(java.lang.Class<?> r4) {
            /*
                r3 = this;
                com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$TypeAndSerializer[] r0 = r3._entries
                r1 = 0
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.type
                if (r2 != r4) goto L_0x000c
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.serializer
                return r4
            L_0x000c:
                r1 = 1
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.type
                if (r2 != r4) goto L_0x0016
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.serializer
                return r4
            L_0x0016:
                r1 = 2
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.type
                if (r2 != r4) goto L_0x0020
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.serializer
                return r4
            L_0x0020:
                int r1 = r0.length
                switch(r1) {
                    case 4: goto L_0x004d;
                    case 5: goto L_0x0043;
                    case 6: goto L_0x0039;
                    case 7: goto L_0x002f;
                    case 8: goto L_0x0025;
                    default: goto L_0x0024;
                }
            L_0x0024:
                goto L_0x0057
            L_0x0025:
                r1 = 7
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.type
                if (r2 != r4) goto L_0x002f
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.serializer
                return r4
            L_0x002f:
                r1 = 6
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.type
                if (r2 != r4) goto L_0x0039
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.serializer
                return r4
            L_0x0039:
                r1 = 5
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.type
                if (r2 != r4) goto L_0x0043
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.serializer
                return r4
            L_0x0043:
                r1 = 4
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.type
                if (r2 != r4) goto L_0x004d
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r1.serializer
                return r4
            L_0x004d:
                r1 = 3
                r0 = r0[r1]
                java.lang.Class<?> r1 = r0.type
                if (r1 != r4) goto L_0x0057
                com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r0.serializer
                return r4
            L_0x0057:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.Multi.serializerFor(java.lang.Class):com.fasterxml.jackson.databind.JsonSerializer");
        }
    }

    public static final class SerializerAndMapResult {
        public final PropertySerializerMap map;
        public final JsonSerializer<Object> serializer;

        public SerializerAndMapResult(JsonSerializer<Object> jsonSerializer, PropertySerializerMap propertySerializerMap) {
            this.serializer = jsonSerializer;
            this.map = propertySerializerMap;
        }
    }

    private static final class Single extends PropertySerializerMap {
        private final JsonSerializer<Object> _serializer;
        private final Class<?> _type;

        public Single(PropertySerializerMap propertySerializerMap, Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            super(propertySerializerMap);
            this._type = cls;
            this._serializer = jsonSerializer;
        }

        public PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            Double doubleR = new Double(this, this._type, this._serializer, cls, jsonSerializer);
            return doubleR;
        }

        public JsonSerializer<Object> serializerFor(Class<?> cls) {
            if (cls == this._type) {
                return this._serializer;
            }
            return null;
        }
    }

    private static final class TypeAndSerializer {
        public final JsonSerializer<Object> serializer;
        public final Class<?> type;

        public TypeAndSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            this.type = cls;
            this.serializer = jsonSerializer;
        }
    }

    protected PropertySerializerMap(boolean z) {
        this._resetWhenFull = z;
    }

    public static PropertySerializerMap emptyForProperties() {
        return Empty.FOR_PROPERTIES;
    }

    public static PropertySerializerMap emptyForRootValues() {
        return Empty.FOR_ROOT_VALUES;
    }

    @Deprecated
    public static PropertySerializerMap emptyMap() {
        return emptyForProperties();
    }

    public final SerializerAndMapResult addSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
        return new SerializerAndMapResult(jsonSerializer, newWith(cls, jsonSerializer));
    }

    public final SerializerAndMapResult findAndAddKeySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer findKeySerializer = serializerProvider.findKeySerializer(cls, beanProperty);
        return new SerializerAndMapResult(findKeySerializer, newWith(cls, findKeySerializer));
    }

    public final SerializerAndMapResult findAndAddPrimarySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer findPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(cls, beanProperty);
        return new SerializerAndMapResult(findPrimaryPropertySerializer, newWith(cls, findPrimaryPropertySerializer));
    }

    public final SerializerAndMapResult findAndAddRootValueSerializer(Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        JsonSerializer findTypedValueSerializer = serializerProvider.findTypedValueSerializer(cls, false, (BeanProperty) null);
        return new SerializerAndMapResult(findTypedValueSerializer, newWith(cls, findTypedValueSerializer));
    }

    public final SerializerAndMapResult findAndAddSecondarySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer findContentValueSerializer = serializerProvider.findContentValueSerializer(cls, beanProperty);
        return new SerializerAndMapResult(findContentValueSerializer, newWith(cls, findContentValueSerializer));
    }

    public abstract PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer);

    public abstract JsonSerializer<Object> serializerFor(Class<?> cls);

    public final SerializerAndMapResult addSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        return new SerializerAndMapResult(jsonSerializer, newWith(javaType.getRawClass(), jsonSerializer));
    }

    protected PropertySerializerMap(PropertySerializerMap propertySerializerMap) {
        this._resetWhenFull = propertySerializerMap._resetWhenFull;
    }

    public final SerializerAndMapResult findAndAddPrimarySerializer(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer findPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(javaType, beanProperty);
        return new SerializerAndMapResult(findPrimaryPropertySerializer, newWith(javaType.getRawClass(), findPrimaryPropertySerializer));
    }

    public final SerializerAndMapResult findAndAddRootValueSerializer(JavaType javaType, SerializerProvider serializerProvider) throws JsonMappingException {
        JsonSerializer findTypedValueSerializer = serializerProvider.findTypedValueSerializer(javaType, false, (BeanProperty) null);
        return new SerializerAndMapResult(findTypedValueSerializer, newWith(javaType.getRawClass(), findTypedValueSerializer));
    }

    public final SerializerAndMapResult findAndAddSecondarySerializer(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer findContentValueSerializer = serializerProvider.findContentValueSerializer(javaType, beanProperty);
        return new SerializerAndMapResult(findContentValueSerializer, newWith(javaType.getRawClass(), findContentValueSerializer));
    }
}
