package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasicSerializerFactory extends SerializerFactory implements Serializable {
    protected static final HashMap<String, JsonSerializer<?>> _concrete;
    protected static final HashMap<String, Class<? extends JsonSerializer<?>>> _concreteLazy;
    protected final SerializerFactoryConfig _factoryConfig;

    /* renamed from: com.fasterxml.jackson.databind.ser.BasicSerializerFactory$1 */
    static /* synthetic */ class C18041 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape;
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonInclude$Include[] r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = r0
                r1 = 1
                com.fasterxml.jackson.annotation.JsonInclude$Include r2 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonInclude$Include r3 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r4 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.fasterxml.jackson.annotation.JsonFormat$Shape[] r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = r3
                com.fasterxml.jackson.annotation.JsonFormat$Shape r4 = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING     // Catch:{ NoSuchFieldError -> 0x005a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape     // Catch:{ NoSuchFieldError -> 0x006e }
                com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.C18041.<clinit>():void");
        }
    }

    static {
        HashMap<String, Class<? extends JsonSerializer<?>>> hashMap = new HashMap<>();
        HashMap<String, JsonSerializer<?>> hashMap2 = new HashMap<>();
        hashMap2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        hashMap2.put(StringBuffer.class.getName(), toStringSerializer);
        hashMap2.put(StringBuilder.class.getName(), toStringSerializer);
        hashMap2.put(Character.class.getName(), toStringSerializer);
        hashMap2.put(Character.TYPE.getName(), toStringSerializer);
        NumberSerializers.addAll(hashMap2);
        hashMap2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        hashMap2.put(Boolean.class.getName(), new BooleanSerializer(false));
        hashMap2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), CalendarSerializer.instance);
        hashMap2.put(Date.class.getName(), DateSerializer.instance);
        for (Entry entry : StdJdkSerializers.all()) {
            Object value = entry.getValue();
            if (value instanceof JsonSerializer) {
                hashMap2.put(((Class) entry.getKey()).getName(), (JsonSerializer) value);
            } else {
                hashMap.put(((Class) entry.getKey()).getName(), (Class) value);
            }
        }
        hashMap.put(TokenBuffer.class.getName(), TokenBufferSerializer.class);
        _concrete = hashMap2;
        _concreteLazy = hashMap;
    }

    protected BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        if (serializerFactoryConfig == null) {
            serializerFactoryConfig = new SerializerFactoryConfig();
        }
        this._factoryConfig = serializerFactoryConfig;
    }

    /* access modifiers changed from: protected */
    public MapSerializer _checkMapContentInclusion(SerializerProvider serializerProvider, BeanDescription beanDescription, MapSerializer mapSerializer) throws JsonMappingException {
        JavaType contentType = mapSerializer.getContentType();
        Value _findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, contentType, Map.class);
        Include contentInclusion = _findInclusionWithContent == null ? Include.USE_DEFAULTS : _findInclusionWithContent.getContentInclusion();
        boolean z = true;
        Object obj = null;
        if (contentInclusion == Include.USE_DEFAULTS || contentInclusion == Include.ALWAYS) {
            return !serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES) ? mapSerializer.withContentInclusion(null, true) : mapSerializer;
        }
        int i = C18041.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
        if (i == 1) {
            obj = BeanUtil.getDefaultValue(contentType);
            if (obj != null && obj.getClass().isArray()) {
                obj = ArrayBuilders.getArrayComparator(obj);
            }
        } else if (i != 2) {
            if (i == 3) {
                obj = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i == 4) {
                obj = serializerProvider.includeFilterInstance(null, _findInclusionWithContent.getContentFilter());
                if (obj != null) {
                    z = serializerProvider.includeFilterSuppressNulls(obj);
                }
            }
        } else if (contentType.isReferenceType()) {
            obj = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapSerializer.withContentInclusion(obj, z);
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> _findContentSerializer(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findContentSerializer = serializerProvider.getAnnotationIntrospector().findContentSerializer(annotated);
        if (findContentSerializer != null) {
            return serializerProvider.serializerInstance(annotated, findContentSerializer);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Value _findInclusionWithContent(SerializerProvider serializerProvider, BeanDescription beanDescription, JavaType javaType, Class<?> cls) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        Value defaultPropertyInclusion = config.getDefaultPropertyInclusion(cls, beanDescription.findPropertyInclusion(config.getDefaultPropertyInclusion()));
        Value defaultPropertyInclusion2 = config.getDefaultPropertyInclusion(javaType.getRawClass(), null);
        if (defaultPropertyInclusion2 == null) {
            return defaultPropertyInclusion;
        }
        int i = C18041.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[defaultPropertyInclusion2.getValueInclusion().ordinal()];
        if (i == 4) {
            return defaultPropertyInclusion.withContentFilter(defaultPropertyInclusion2.getContentFilter());
        }
        if (i != 6) {
            return defaultPropertyInclusion.withContentInclusion(defaultPropertyInclusion2.getValueInclusion());
        }
        return defaultPropertyInclusion;
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> _findKeySerializer(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findKeySerializer = serializerProvider.getAnnotationIntrospector().findKeySerializer(annotated);
        if (findKeySerializer != null) {
            return serializerProvider.serializerInstance(annotated, findKeySerializer);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildArraySerializer(SerializerProvider serializerProvider, ArrayType arrayType, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        JsonSerializer<?> jsonSerializer2 = null;
        for (Serializers findArraySerializer : customSerializers()) {
            jsonSerializer2 = findArraySerializer.findArraySerializer(config, arrayType, beanDescription, typeSerializer, jsonSerializer);
            if (jsonSerializer2 != null) {
                break;
            }
        }
        if (jsonSerializer2 == null) {
            Class<String[]> rawClass = arrayType.getRawClass();
            if (jsonSerializer == null || ClassUtil.isJacksonStdImpl((Object) jsonSerializer)) {
                if (String[].class == rawClass) {
                    jsonSerializer2 = StringArraySerializer.instance;
                } else {
                    jsonSerializer2 = StdArraySerializers.findStandardImpl(rawClass);
                }
            }
            if (jsonSerializer2 == null) {
                jsonSerializer2 = new ObjectArraySerializer<>(arrayType.getContentType(), z, typeSerializer, jsonSerializer);
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier modifyArraySerializer : this._factoryConfig.serializerModifiers()) {
                jsonSerializer2 = modifyArraySerializer.modifyArraySerializer(config, arrayType, beanDescription, jsonSerializer2);
            }
        }
        return jsonSerializer2;
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildAtomicReferenceSerializer(SerializerProvider serializerProvider, ReferenceType referenceType, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        JavaType referencedType = referenceType.getReferencedType();
        Value _findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, referencedType, AtomicReference.class);
        Include contentInclusion = _findInclusionWithContent == null ? Include.USE_DEFAULTS : _findInclusionWithContent.getContentInclusion();
        boolean z2 = true;
        Object obj = null;
        if (contentInclusion == Include.USE_DEFAULTS || contentInclusion == Include.ALWAYS) {
            z2 = false;
        } else {
            int i = C18041.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
            if (i == 1) {
                obj = BeanUtil.getDefaultValue(referencedType);
                if (obj != null && obj.getClass().isArray()) {
                    obj = ArrayBuilders.getArrayComparator(obj);
                }
            } else if (i != 2) {
                if (i == 3) {
                    obj = MapSerializer.MARKER_FOR_EMPTY;
                } else if (i == 4) {
                    obj = serializerProvider.includeFilterInstance(null, _findInclusionWithContent.getContentFilter());
                    if (obj != null) {
                        z2 = serializerProvider.includeFilterSuppressNulls(obj);
                    }
                }
            } else if (referencedType.isReferenceType()) {
                obj = MapSerializer.MARKER_FOR_EMPTY;
            }
        }
        return new AtomicReferenceSerializer(referenceType, z, typeSerializer, jsonSerializer).withContentInclusion(obj, z2);
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildCollectionSerializer(SerializerProvider serializerProvider, CollectionType collectionType, BeanDescription beanDescription, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        BeanDescription beanDescription2 = beanDescription;
        boolean z2 = z;
        TypeSerializer typeSerializer2 = typeSerializer;
        JsonSerializer<Object> jsonSerializer2 = jsonSerializer;
        Class<String> cls = String.class;
        SerializationConfig config = serializerProvider.getConfig();
        JavaType javaType = null;
        JsonSerializer jsonSerializer3 = null;
        for (Serializers findCollectionSerializer : customSerializers()) {
            jsonSerializer3 = findCollectionSerializer.findCollectionSerializer(config, collectionType, beanDescription, typeSerializer, jsonSerializer);
            if (jsonSerializer3 != null) {
                break;
            }
        }
        if (jsonSerializer3 == null) {
            jsonSerializer3 = findSerializerByAnnotations(serializerProvider, collectionType, beanDescription);
            if (jsonSerializer3 == null) {
                JsonFormat.Value findExpectedFormat = beanDescription2.findExpectedFormat(null);
                if (findExpectedFormat != null && findExpectedFormat.getShape() == Shape.OBJECT) {
                    return null;
                }
                Class rawClass = collectionType.getRawClass();
                if (EnumSet.class.isAssignableFrom(rawClass)) {
                    JavaType contentType = collectionType.getContentType();
                    if (contentType.isEnumImplType()) {
                        javaType = contentType;
                    }
                    jsonSerializer3 = buildEnumSetSerializer(javaType);
                } else {
                    Class<String> rawClass2 = collectionType.getContentType().getRawClass();
                    if (isIndexedList(rawClass)) {
                        if (rawClass2 != cls) {
                            jsonSerializer3 = buildIndexedListSerializer(collectionType.getContentType(), z2, typeSerializer2, jsonSerializer2);
                        } else if (ClassUtil.isJacksonStdImpl((Object) jsonSerializer)) {
                            jsonSerializer3 = IndexedStringListSerializer.instance;
                        }
                    } else if (rawClass2 == cls && ClassUtil.isJacksonStdImpl((Object) jsonSerializer)) {
                        jsonSerializer3 = StringCollectionSerializer.instance;
                    }
                    if (jsonSerializer3 == null) {
                        jsonSerializer3 = buildCollectionSerializer(collectionType.getContentType(), z2, typeSerializer2, jsonSerializer2);
                    }
                }
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier modifyCollectionSerializer : this._factoryConfig.serializerModifiers()) {
                jsonSerializer3 = modifyCollectionSerializer.modifyCollectionSerializer(config, collectionType, beanDescription2, jsonSerializer3);
            }
        }
        return jsonSerializer3;
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildContainerSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        BeanDescription beanDescription2;
        SerializerProvider serializerProvider2 = serializerProvider;
        BeanDescription beanDescription3 = beanDescription;
        SerializationConfig config = serializerProvider.getConfig();
        boolean z2 = (z || !javaType.useStaticType() || (javaType.isContainerType() && javaType.getContentType().isJavaLangObject())) ? z : true;
        TypeSerializer createTypeSerializer = createTypeSerializer(config, javaType.getContentType());
        boolean z3 = createTypeSerializer != null ? false : z2;
        JsonSerializer _findContentSerializer = _findContentSerializer(serializerProvider2, beanDescription.getClassInfo());
        JsonSerializer<?> jsonSerializer = null;
        if (javaType.isMapLikeType()) {
            MapLikeType mapLikeType = (MapLikeType) javaType;
            JsonSerializer _findKeySerializer = _findKeySerializer(serializerProvider2, beanDescription.getClassInfo());
            if (mapLikeType.isTrueMapType()) {
                return buildMapSerializer(serializerProvider, (MapType) mapLikeType, beanDescription, z3, _findKeySerializer, createTypeSerializer, _findContentSerializer);
            }
            for (Serializers findMapLikeSerializer : customSerializers()) {
                jsonSerializer = findMapLikeSerializer.findMapLikeSerializer(config, mapLikeType, beanDescription, _findKeySerializer, createTypeSerializer, _findContentSerializer);
                if (jsonSerializer != null) {
                    break;
                }
            }
            if (jsonSerializer == null) {
                jsonSerializer = findSerializerByAnnotations(serializerProvider, javaType, beanDescription);
            }
            if (jsonSerializer != null && this._factoryConfig.hasSerializerModifiers()) {
                for (BeanSerializerModifier modifyMapLikeSerializer : this._factoryConfig.serializerModifiers()) {
                    jsonSerializer = modifyMapLikeSerializer.modifyMapLikeSerializer(config, mapLikeType, beanDescription3, jsonSerializer);
                }
            }
            return jsonSerializer;
        } else if (javaType.isCollectionLikeType()) {
            CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
            if (collectionLikeType.isTrueCollectionType()) {
                return buildCollectionSerializer(serializerProvider, (CollectionType) collectionLikeType, beanDescription, z3, createTypeSerializer, _findContentSerializer);
            }
            Iterator it = customSerializers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    beanDescription2 = beanDescription3;
                    break;
                }
                beanDescription2 = beanDescription3;
                jsonSerializer = ((Serializers) it.next()).findCollectionLikeSerializer(config, collectionLikeType, beanDescription, createTypeSerializer, _findContentSerializer);
                if (jsonSerializer != null) {
                    break;
                }
                beanDescription3 = beanDescription2;
            }
            if (jsonSerializer == null) {
                jsonSerializer = findSerializerByAnnotations(serializerProvider, javaType, beanDescription);
            }
            if (jsonSerializer != null && this._factoryConfig.hasSerializerModifiers()) {
                for (BeanSerializerModifier modifyCollectionLikeSerializer : this._factoryConfig.serializerModifiers()) {
                    jsonSerializer = modifyCollectionLikeSerializer.modifyCollectionLikeSerializer(config, collectionLikeType, beanDescription2, jsonSerializer);
                }
            }
            return jsonSerializer;
        } else {
            BeanDescription beanDescription4 = beanDescription3;
            if (!javaType.isArrayType()) {
                return null;
            }
            return buildArraySerializer(serializerProvider, (ArrayType) javaType, beanDescription, z3, createTypeSerializer, _findContentSerializer);
        }
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildEnumSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JsonFormat.Value findExpectedFormat = beanDescription.findExpectedFormat(null);
        if (findExpectedFormat == null || findExpectedFormat.getShape() != Shape.OBJECT) {
            JsonSerializer<?> construct = EnumSerializer.construct(javaType.getRawClass(), serializationConfig, beanDescription, findExpectedFormat);
            if (this._factoryConfig.hasSerializerModifiers()) {
                for (BeanSerializerModifier modifyEnumSerializer : this._factoryConfig.serializerModifiers()) {
                    construct = modifyEnumSerializer.modifyEnumSerializer(serializationConfig, javaType, beanDescription, construct);
                }
            }
            return construct;
        }
        ((BasicBeanDescription) beanDescription).removeProperty("declaringClass");
        return null;
    }

    public JsonSerializer<?> buildEnumSetSerializer(JavaType javaType) {
        return new EnumSetSerializer(javaType);
    }

    public ContainerSerializer<?> buildIndexedListSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new IndexedListSerializer(javaType, z, typeSerializer, jsonSerializer);
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildIterableSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IterableSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildIteratorSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IteratorSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildMapEntrySerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z, JavaType javaType2, JavaType javaType3) throws JsonMappingException {
        Object obj = null;
        if (JsonFormat.Value.merge(beanDescription.findExpectedFormat(null), serializerProvider.getDefaultPropertyFormat(Entry.class)).getShape() == Shape.OBJECT) {
            return null;
        }
        MapEntrySerializer mapEntrySerializer = new MapEntrySerializer(javaType3, javaType2, javaType3, z, createTypeSerializer(serializerProvider.getConfig(), javaType3), null);
        JavaType contentType = mapEntrySerializer.getContentType();
        Value _findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, contentType, Entry.class);
        Include contentInclusion = _findInclusionWithContent == null ? Include.USE_DEFAULTS : _findInclusionWithContent.getContentInclusion();
        if (contentInclusion == Include.USE_DEFAULTS || contentInclusion == Include.ALWAYS) {
            return mapEntrySerializer;
        }
        int i = C18041.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
        boolean z2 = true;
        if (i == 1) {
            obj = BeanUtil.getDefaultValue(contentType);
            if (obj != null && obj.getClass().isArray()) {
                obj = ArrayBuilders.getArrayComparator(obj);
            }
        } else if (i != 2) {
            if (i == 3) {
                obj = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i == 4) {
                obj = serializerProvider.includeFilterInstance(null, _findInclusionWithContent.getContentFilter());
                if (obj != null) {
                    z2 = serializerProvider.includeFilterSuppressNulls(obj);
                }
            }
        } else if (contentType.isReferenceType()) {
            obj = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapEntrySerializer.withContentInclusion(obj, z2);
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> buildMapSerializer(SerializerProvider serializerProvider, MapType mapType, BeanDescription beanDescription, boolean z, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2) throws JsonMappingException {
        BeanDescription beanDescription2 = beanDescription;
        Set set = null;
        JsonFormat.Value findExpectedFormat = beanDescription2.findExpectedFormat(null);
        if (findExpectedFormat != null && findExpectedFormat.getShape() == Shape.OBJECT) {
            return null;
        }
        SerializationConfig config = serializerProvider.getConfig();
        JsonSerializer jsonSerializer3 = null;
        for (Serializers findMapSerializer : customSerializers()) {
            jsonSerializer3 = findMapSerializer.findMapSerializer(config, mapType, beanDescription, jsonSerializer, typeSerializer, jsonSerializer2);
            if (jsonSerializer3 != null) {
                break;
            }
        }
        if (jsonSerializer3 == null) {
            jsonSerializer3 = findSerializerByAnnotations(serializerProvider, mapType, beanDescription);
            if (jsonSerializer3 == null) {
                Object findFilterId = findFilterId(config, beanDescription2);
                JsonIgnoreProperties.Value defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, beanDescription.getClassInfo());
                if (defaultPropertyIgnorals != null) {
                    set = defaultPropertyIgnorals.findIgnoredForSerialization();
                }
                jsonSerializer3 = _checkMapContentInclusion(serializerProvider, beanDescription2, MapSerializer.construct(set, (JavaType) mapType, z, typeSerializer, jsonSerializer, jsonSerializer2, findFilterId));
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier modifyMapSerializer : this._factoryConfig.serializerModifiers()) {
                jsonSerializer3 = modifyMapSerializer.modifyMapSerializer(config, mapType, beanDescription2, jsonSerializer3);
            }
        }
        return jsonSerializer3;
    }

    public JsonSerializer<Object> createKeySerializer(SerializerProvider serializerProvider, JavaType javaType, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        BeanDescription introspect = config.introspect(javaType);
        JsonSerializer<Object> jsonSerializer2 = null;
        if (this._factoryConfig.hasKeySerializers()) {
            for (Serializers findSerializer : this._factoryConfig.keySerializers()) {
                jsonSerializer2 = findSerializer.findSerializer(config, javaType, introspect);
                if (jsonSerializer2 != null) {
                    break;
                }
            }
        }
        if (jsonSerializer2 == null) {
            JsonSerializer<Object> _findKeySerializer = _findKeySerializer(serializerProvider, introspect.getClassInfo());
            if (_findKeySerializer != null) {
                jsonSerializer = _findKeySerializer;
            } else if (jsonSerializer == null) {
                jsonSerializer = StdKeySerializers.getStdKeySerializer(config, javaType.getRawClass(), false);
                if (jsonSerializer == null) {
                    AnnotatedMember findJsonValueAccessor = introspect.findJsonValueAccessor();
                    if (findJsonValueAccessor != null) {
                        JsonSerializer stdKeySerializer = StdKeySerializers.getStdKeySerializer(config, findJsonValueAccessor.getRawType(), true);
                        if (config.canOverrideAccessModifiers()) {
                            ClassUtil.checkAndFixAccess(findJsonValueAccessor.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                        }
                        jsonSerializer = new JsonValueSerializer<>(findJsonValueAccessor, stdKeySerializer);
                    } else {
                        jsonSerializer = StdKeySerializers.getFallbackKeySerializer(config, javaType.getRawClass());
                    }
                }
            }
        } else {
            jsonSerializer = jsonSerializer2;
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            for (BeanSerializerModifier modifyKeySerializer : this._factoryConfig.serializerModifiers()) {
                jsonSerializer = modifyKeySerializer.modifyKeySerializer(config, javaType, introspect, jsonSerializer);
            }
        }
        return jsonSerializer;
    }

    public abstract JsonSerializer<Object> createSerializer(SerializerProvider serializerProvider, JavaType javaType) throws JsonMappingException;

    public TypeSerializer createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) {
        Collection collection;
        AnnotatedClass classInfo = serializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder findTypeResolver = serializationConfig.getAnnotationIntrospector().findTypeResolver(serializationConfig, classInfo, javaType);
        if (findTypeResolver == null) {
            findTypeResolver = serializationConfig.getDefaultTyper(javaType);
            collection = null;
        } else {
            collection = serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, classInfo);
        }
        if (findTypeResolver == null) {
            return null;
        }
        return findTypeResolver.buildTypeSerializer(serializationConfig, javaType, collection);
    }

    /* access modifiers changed from: protected */
    public abstract Iterable<Serializers> customSerializers();

    /* access modifiers changed from: protected */
    public Converter<Object, Object> findConverter(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findSerializationConverter = serializerProvider.getAnnotationIntrospector().findSerializationConverter(annotated);
        if (findSerializationConverter == null) {
            return null;
        }
        return serializerProvider.converterInstance(annotated, findSerializationConverter);
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> findConvertingSerializer(SerializerProvider serializerProvider, Annotated annotated, JsonSerializer<?> jsonSerializer) throws JsonMappingException {
        Converter findConverter = findConverter(serializerProvider, annotated);
        if (findConverter == null) {
            return jsonSerializer;
        }
        return new StdDelegatingSerializer(findConverter, findConverter.getOutputType(serializerProvider.getTypeFactory()), jsonSerializer);
    }

    /* access modifiers changed from: protected */
    public Object findFilterId(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        return serializationConfig.getAnnotationIntrospector().findFilterId(beanDescription.getClassInfo());
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> findOptionalStdSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findSerializer(serializerProvider.getConfig(), javaType, beanDescription);
    }

    public JsonSerializer<?> findReferenceSerializer(SerializerProvider serializerProvider, ReferenceType referenceType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        TypeSerializer typeSerializer = (TypeSerializer) contentType.getTypeHandler();
        SerializationConfig config = serializerProvider.getConfig();
        if (typeSerializer == null) {
            typeSerializer = createTypeSerializer(config, contentType);
        }
        TypeSerializer typeSerializer2 = typeSerializer;
        JsonSerializer jsonSerializer = (JsonSerializer) contentType.getValueHandler();
        for (Serializers findReferenceSerializer : customSerializers()) {
            JsonSerializer<?> findReferenceSerializer2 = findReferenceSerializer.findReferenceSerializer(config, referenceType, beanDescription, typeSerializer2, jsonSerializer);
            if (findReferenceSerializer2 != null) {
                return findReferenceSerializer2;
            }
        }
        if (referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            return buildAtomicReferenceSerializer(serializerProvider, referenceType, beanDescription, z, typeSerializer2, jsonSerializer);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<?> findSerializerByAddonType(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        Class rawClass = javaType.getRawClass();
        if (Iterator.class.isAssignableFrom(rawClass)) {
            JavaType[] findTypeParameters = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterator.class);
            return buildIteratorSerializer(serializationConfig, javaType, beanDescription, z, (findTypeParameters == null || findTypeParameters.length != 1) ? TypeFactory.unknownType() : findTypeParameters[0]);
        } else if (Iterable.class.isAssignableFrom(rawClass)) {
            JavaType[] findTypeParameters2 = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterable.class);
            return buildIterableSerializer(serializationConfig, javaType, beanDescription, z, (findTypeParameters2 == null || findTypeParameters2.length != 1) ? TypeFactory.unknownType() : findTypeParameters2[0]);
        } else if (CharSequence.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<?> findSerializerByAnnotations(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        if (JsonSerializable.class.isAssignableFrom(javaType.getRawClass())) {
            return SerializableSerializer.instance;
        }
        AnnotatedMember findJsonValueAccessor = beanDescription.findJsonValueAccessor();
        if (findJsonValueAccessor == null) {
            return null;
        }
        if (serializerProvider.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(findJsonValueAccessor.getMember(), serializerProvider.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new JsonValueSerializer(findJsonValueAccessor, findSerializerFromAnnotation(serializerProvider, findJsonValueAccessor));
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<?> findSerializerByLookup(JavaType javaType, SerializationConfig serializationConfig, BeanDescription beanDescription, boolean z) {
        String name = javaType.getRawClass().getName();
        JsonSerializer<?> jsonSerializer = (JsonSerializer) _concrete.get(name);
        if (jsonSerializer == null) {
            Class cls = (Class) _concreteLazy.get(name);
            if (cls != null) {
                return (JsonSerializer) ClassUtil.createInstance(cls, false);
            }
        }
        return jsonSerializer;
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<?> findSerializerByPrimaryType(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        if (javaType.isEnumType()) {
            return buildEnumSerializer(serializerProvider.getConfig(), javaType, beanDescription);
        }
        Class rawClass = javaType.getRawClass();
        JsonSerializer<?> findOptionalStdSerializer = findOptionalStdSerializer(serializerProvider, javaType, beanDescription, z);
        if (findOptionalStdSerializer != null) {
            return findOptionalStdSerializer;
        }
        if (Calendar.class.isAssignableFrom(rawClass)) {
            return CalendarSerializer.instance;
        }
        if (Date.class.isAssignableFrom(rawClass)) {
            return DateSerializer.instance;
        }
        if (Entry.class.isAssignableFrom(rawClass)) {
            JavaType findSuperType = javaType.findSuperType(Entry.class);
            return buildMapEntrySerializer(serializerProvider, javaType, beanDescription, z, findSuperType.containedTypeOrUnknown(0), findSuperType.containedTypeOrUnknown(1));
        } else if (ByteBuffer.class.isAssignableFrom(rawClass)) {
            return new ByteBufferSerializer();
        } else {
            if (InetAddress.class.isAssignableFrom(rawClass)) {
                return new InetAddressSerializer();
            }
            if (InetSocketAddress.class.isAssignableFrom(rawClass)) {
                return new InetSocketAddressSerializer();
            }
            if (TimeZone.class.isAssignableFrom(rawClass)) {
                return new TimeZoneSerializer();
            }
            if (Charset.class.isAssignableFrom(rawClass)) {
                return ToStringSerializer.instance;
            }
            if (!Number.class.isAssignableFrom(rawClass)) {
                return null;
            }
            JsonFormat.Value findExpectedFormat = beanDescription.findExpectedFormat(null);
            if (findExpectedFormat != null) {
                int i = C18041.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[findExpectedFormat.getShape().ordinal()];
                if (i == 1) {
                    return ToStringSerializer.instance;
                }
                if (i == 2 || i == 3) {
                    return null;
                }
            }
            return NumberSerializer.instance;
        }
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> findSerializerFromAnnotation(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findSerializer = serializerProvider.getAnnotationIntrospector().findSerializer(annotated);
        if (findSerializer == null) {
            return null;
        }
        return findConvertingSerializer(serializerProvider, annotated, serializerProvider.serializerInstance(annotated, findSerializer));
    }

    public SerializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    /* access modifiers changed from: protected */
    public boolean isIndexedList(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    /* access modifiers changed from: protected */
    public boolean usesStaticTyping(SerializationConfig serializationConfig, BeanDescription beanDescription, TypeSerializer typeSerializer) {
        boolean z = false;
        if (typeSerializer != null) {
            return false;
        }
        Typing findSerializationTyping = serializationConfig.getAnnotationIntrospector().findSerializationTyping(beanDescription.getClassInfo());
        if (findSerializationTyping == null || findSerializationTyping == Typing.DEFAULT_TYPING) {
            return serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
        }
        if (findSerializationTyping == Typing.STATIC) {
            z = true;
        }
        return z;
    }

    public final SerializerFactory withAdditionalKeySerializers(Serializers serializers) {
        return withConfig(this._factoryConfig.withAdditionalKeySerializers(serializers));
    }

    public final SerializerFactory withAdditionalSerializers(Serializers serializers) {
        return withConfig(this._factoryConfig.withAdditionalSerializers(serializers));
    }

    public abstract SerializerFactory withConfig(SerializerFactoryConfig serializerFactoryConfig);

    public final SerializerFactory withSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
        return withConfig(this._factoryConfig.withSerializerModifier(beanSerializerModifier));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> createKeySerializer(com.fasterxml.jackson.databind.SerializationConfig r5, com.fasterxml.jackson.databind.JavaType r6, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r7) {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.BeanDescription r0 = r5.introspect(r6)
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4._factoryConfig
            boolean r1 = r1.hasKeySerializers()
            r2 = 0
            if (r1 == 0) goto L_0x0029
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4._factoryConfig
            java.lang.Iterable r1 = r1.keySerializers()
            java.util.Iterator r1 = r1.iterator()
        L_0x0017:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0029
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.ser.Serializers r2 = (com.fasterxml.jackson.databind.ser.Serializers) r2
            com.fasterxml.jackson.databind.JsonSerializer r2 = r2.findSerializer(r5, r6, r0)
            if (r2 == 0) goto L_0x0017
        L_0x0029:
            if (r2 != 0) goto L_0x0069
            if (r7 != 0) goto L_0x006a
            java.lang.Class r7 = r6.getRawClass()
            r1 = 0
            com.fasterxml.jackson.databind.JsonSerializer r7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getStdKeySerializer(r5, r7, r1)
            if (r7 != 0) goto L_0x006a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r7 = r0.findJsonValueAccessor()
            if (r7 == 0) goto L_0x0060
            java.lang.Class r1 = r7.getRawType()
            r2 = 1
            com.fasterxml.jackson.databind.JsonSerializer r1 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getStdKeySerializer(r5, r1, r2)
            boolean r2 = r5.canOverrideAccessModifiers()
            if (r2 == 0) goto L_0x005a
            java.lang.reflect.Member r2 = r7.getMember()
            com.fasterxml.jackson.databind.MapperFeature r3 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r3 = r5.isEnabled(r3)
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(r2, r3)
        L_0x005a:
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r2 = new com.fasterxml.jackson.databind.ser.std.JsonValueSerializer
            r2.<init>(r7, r1)
            goto L_0x0069
        L_0x0060:
            java.lang.Class r7 = r6.getRawClass()
            com.fasterxml.jackson.databind.JsonSerializer r7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getFallbackKeySerializer(r5, r7)
            goto L_0x006a
        L_0x0069:
            r7 = r2
        L_0x006a:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4._factoryConfig
            boolean r1 = r1.hasSerializerModifiers()
            if (r1 == 0) goto L_0x008d
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r1 = r4._factoryConfig
            java.lang.Iterable r1 = r1.serializerModifiers()
            java.util.Iterator r1 = r1.iterator()
        L_0x007c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x008d
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.ser.BeanSerializerModifier r2 = (com.fasterxml.jackson.databind.ser.BeanSerializerModifier) r2
            com.fasterxml.jackson.databind.JsonSerializer r7 = r2.modifyKeySerializer(r5, r6, r0, r7)
            goto L_0x007c
        L_0x008d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer(com.fasterxml.jackson.databind.SerializationConfig, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public ContainerSerializer<?> buildCollectionSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new CollectionSerializer(javaType, z, typeSerializer, jsonSerializer);
    }
}
