package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo.C1768As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.C1769Id;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonFactory.Feature;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.StreamWriteFeature;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.p194io.CharacterEscapes;
import com.fasterxml.jackson.core.p194io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.Module.SetupContext;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.umeng.analytics.pro.UMCommonContent;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class ObjectMapper extends ObjectCodec implements Versioned, Serializable {
    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    protected static final BaseSettings DEFAULT_BASE;
    private static final long serialVersionUID = 2;
    protected final ConfigOverrides _configOverrides;
    protected DeserializationConfig _deserializationConfig;
    protected DefaultDeserializationContext _deserializationContext;
    protected InjectableValues _injectableValues;
    protected final JsonFactory _jsonFactory;
    protected SimpleMixInResolver _mixIns;
    protected Set<Object> _registeredModuleTypes;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    protected SerializationConfig _serializationConfig;
    protected SerializerFactory _serializerFactory;
    protected DefaultSerializerProvider _serializerProvider;
    protected SubtypeResolver _subtypeResolver;
    protected TypeFactory _typeFactory;

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$3 */
    static /* synthetic */ class C17743 {

        /* renamed from: $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping */
        static final /* synthetic */ int[] f11525x3ef634e7;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping[] r0 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11525x3ef634e7 = r0
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11525x3ef634e7     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11525x3ef634e7     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.NON_FINAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11525x3ef634e7     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.EVERYTHING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11525x3ef634e7     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping r1 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper.C17743.<clinit>():void");
        }
    }

    public static class DefaultTypeResolverBuilder extends StdTypeResolverBuilder implements Serializable {
        private static final long serialVersionUID = 1;
        protected final DefaultTyping _appliesFor;
        protected final PolymorphicTypeValidator _subtypeValidator;

        @Deprecated
        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping) {
            this(defaultTyping, LaissezFaireSubTypeValidator.instance);
        }

        private static <T> T _requireNonNull(T t, String str) {
            Objects.requireNonNull(t, str);
            return t;
        }

        public static DefaultTypeResolverBuilder construct(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            return new DefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator);
        }

        public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeDeserializer(deserializationConfig, javaType, collection);
            }
            return null;
        }

        public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeSerializer(serializationConfig, javaType, collection);
            }
            return null;
        }

        public PolymorphicTypeValidator subTypeValidator(MapperConfig<?> mapperConfig) {
            return this._subtypeValidator;
        }

        public boolean useForType(JavaType javaType) {
            Class<TreeNode> cls = TreeNode.class;
            boolean z = false;
            if (javaType.isPrimitive()) {
                return false;
            }
            int i = C17743.f11525x3ef634e7[this._appliesFor.ordinal()];
            if (i == 1) {
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
            } else if (i != 2) {
                if (i == 3) {
                    while (javaType.isArrayType()) {
                        javaType = javaType.getContentType();
                    }
                    while (javaType.isReferenceType()) {
                        javaType = javaType.getReferencedType();
                    }
                    if (!javaType.isFinal() && !cls.isAssignableFrom(javaType.getRawClass())) {
                        z = true;
                    }
                    return z;
                } else if (i != 4) {
                    return javaType.isJavaLangObject();
                } else {
                    return true;
                }
            }
            while (javaType.isReferenceType()) {
                javaType = javaType.getReferencedType();
            }
            if (javaType.isJavaLangObject() || (!javaType.isConcrete() && !cls.isAssignableFrom(javaType.getRawClass()))) {
                z = true;
            }
            return z;
        }

        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            this._appliesFor = (DefaultTyping) _requireNonNull(defaultTyping, "Can not pass `null` DefaultTyping");
            this._subtypeValidator = (PolymorphicTypeValidator) _requireNonNull(polymorphicTypeValidator, "Can not pass `null` PolymorphicTypeValidator");
        }
    }

    public enum DefaultTyping {
        JAVA_LANG_OBJECT,
        OBJECT_AND_NON_CONCRETE,
        NON_CONCRETE_AND_ARRAYS,
        NON_FINAL,
        EVERYTHING
    }

    static {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        DEFAULT_ANNOTATION_INTROSPECTOR = jacksonAnnotationIntrospector;
        BaseSettings baseSettings = new BaseSettings(null, jacksonAnnotationIntrospector, null, TypeFactory.defaultInstance(), null, StdDateFormat.instance, null, Locale.getDefault(), null, Base64Variants.getDefaultVariant(), LaissezFaireSubTypeValidator.instance);
        DEFAULT_BASE = baseSettings;
    }

    public ObjectMapper() {
        this(null, null, null);
    }

    private final void _writeCloseable(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
            ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, closeable, e);
        }
    }

    private final void _writeCloseableValue(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            ClassUtil.closeOnFailAndThrowAsIOE(null, closeable, e);
        }
    }

    public static List<Module> findModules() {
        return findModules(null);
    }

    private static <T> ServiceLoader<T> secureGetServiceLoader(final Class<T> cls, final ClassLoader classLoader) {
        if (System.getSecurityManager() != null) {
            return (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction<ServiceLoader<T>>() {
                public ServiceLoader<T> run() {
                    ClassLoader classLoader = classLoader;
                    return classLoader == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader);
                }
            });
        }
        return classLoader == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader);
    }

    /* access modifiers changed from: protected */
    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", new Object[]{str}));
        }
    }

    /* access modifiers changed from: protected */
    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() != cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed copy(): ");
            sb.append(getClass().getName());
            sb.append(" (version: ");
            sb.append(version());
            sb.append(") does not override copy(); it has to");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final void _configAndWriteValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        getSerializationConfig().initialize(jsonGenerator);
        _writeValueAndClose(jsonGenerator, obj);
    }

    /* access modifiers changed from: protected */
    public TypeResolverBuilder<?> _constructDefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
        return DefaultTypeResolverBuilder.construct(defaultTyping, polymorphicTypeValidator);
    }

    /* access modifiers changed from: protected */
    public Object _convert(Object obj, JavaType javaType) throws IllegalArgumentException {
        Object obj2;
        TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            tokenBuffer = tokenBuffer.forceUseOfBigDecimal(true);
        }
        try {
            _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE)).serializeValue(tokenBuffer, obj);
            JsonParser asParser = tokenBuffer.asParser();
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            JsonToken _initForReading = _initForReading(asParser, javaType);
            if (_initForReading == JsonToken.VALUE_NULL) {
                DefaultDeserializationContext createDeserializationContext = createDeserializationContext(asParser, deserializationConfig);
                obj2 = _findRootDeserializer(createDeserializationContext, javaType).getNullValue(createDeserializationContext);
            } else {
                if (_initForReading != JsonToken.END_ARRAY) {
                    if (_initForReading != JsonToken.END_OBJECT) {
                        DefaultDeserializationContext createDeserializationContext2 = createDeserializationContext(asParser, deserializationConfig);
                        obj2 = _findRootDeserializer(createDeserializationContext2, javaType).deserialize(asParser, createDeserializationContext2);
                    }
                }
                obj2 = null;
            }
            asParser.close();
            return obj2;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        JsonDeserializer<Object> jsonDeserializer = (JsonDeserializer) this._rootDeserializers.get(javaType);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (findRootValueDeserializer == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot find a deserializer for type ");
            sb.append(javaType);
            return (JsonDeserializer) deserializationContext.reportBadDefinition(javaType, sb.toString());
        }
        this._rootDeserializers.put(javaType, findRootValueDeserializer);
        return findRootValueDeserializer;
    }

    /* access modifiers changed from: protected */
    public JsonToken _initForReading(JsonParser jsonParser, JavaType javaType) throws IOException {
        this._deserializationConfig.initialize(jsonParser);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null) {
            currentToken = jsonParser.nextToken();
            if (currentToken == null) {
                throw MismatchedInputException.from(jsonParser, javaType, "No content to map due to end-of-input");
            }
        }
        return currentToken;
    }

    /* access modifiers changed from: protected */
    public ObjectReader _newReader(DeserializationConfig deserializationConfig) {
        return new ObjectReader(this, deserializationConfig);
    }

    /* access modifiers changed from: protected */
    public ObjectWriter _newWriter(SerializationConfig serializationConfig) {
        return new ObjectWriter(this, serializationConfig);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r10 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        r11.addSuppressed(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object _readMapAndClose(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.JavaType r11) throws java.io.IOException {
        /*
            r9 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r9._initForReading(r10, r11)     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.databind.DeserializationConfig r7 = r9.getDeserializationConfig()     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r8 = r9.createDeserializationContext(r10, r7)     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x0050 }
            if (r0 != r1) goto L_0x0019
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r9._findRootDeserializer(r8, r11)     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.getNullValue(r8)     // Catch:{ all -> 0x0050 }
            goto L_0x003f
        L_0x0019:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ all -> 0x0050 }
            if (r0 == r1) goto L_0x003e
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ all -> 0x0050 }
            if (r0 != r1) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            com.fasterxml.jackson.databind.JsonDeserializer r6 = r9._findRootDeserializer(r8, r11)     // Catch:{ all -> 0x0050 }
            boolean r0 = r7.useRootWrapping()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0036
            r1 = r9
            r2 = r10
            r3 = r8
            r4 = r7
            r5 = r11
            java.lang.Object r0 = r1._unwrapAndDeserialize(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0050 }
            goto L_0x003a
        L_0x0036:
            java.lang.Object r0 = r6.deserialize(r10, r8)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            r8.checkUnresolvedObjectId()     // Catch:{ all -> 0x0050 }
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            com.fasterxml.jackson.databind.DeserializationFeature r1 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x0050 }
            boolean r1 = r7.isEnabled(r1)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004a
            r9._verifyNoTrailingTokens(r10, r8, r11)     // Catch:{ all -> 0x0050 }
        L_0x004a:
            if (r10 == 0) goto L_0x004f
            r10.close()
        L_0x004f:
            return r0
        L_0x0050:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            if (r10 == 0) goto L_0x005d
            r10.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r10 = move-exception
            r11.addSuppressed(r10)
        L_0x005d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._readMapAndClose(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.JavaType):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        if (r10 != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0074, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        r0.addSuppressed(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonNode _readTreeAndClose(com.fasterxml.jackson.core.JsonParser r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.Class<com.fasterxml.jackson.databind.JsonNode> r0 = com.fasterxml.jackson.databind.JsonNode.class
            com.fasterxml.jackson.databind.JavaType r0 = r9.constructType(r0)     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r9.getDeserializationConfig()     // Catch:{ all -> 0x006b }
            r4.initialize(r10)     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.core.JsonToken r1 = r10.getCurrentToken()     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0025
            com.fasterxml.jackson.core.JsonToken r1 = r10.nextToken()     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0025
            com.fasterxml.jackson.databind.node.JsonNodeFactory r0 = r4.getNodeFactory()     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.databind.JsonNode r0 = r0.missingNode()     // Catch:{ all -> 0x006b }
            r10.close()
            return r0
        L_0x0025:
            com.fasterxml.jackson.databind.DeserializationFeature r2 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x006b }
            boolean r7 = r4.isEnabled(r2)     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x006b }
            if (r1 != r2) goto L_0x0042
            com.fasterxml.jackson.databind.node.JsonNodeFactory r1 = r4.getNodeFactory()     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.databind.node.NullNode r1 = r1.nullNode()     // Catch:{ all -> 0x006b }
            if (r7 != 0) goto L_0x003d
            r10.close()
            return r1
        L_0x003d:
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r2 = r9.createDeserializationContext(r10, r4)     // Catch:{ all -> 0x006b }
            goto L_0x0062
        L_0x0042:
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r8 = r9.createDeserializationContext(r10, r4)     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.databind.JsonDeserializer r6 = r9._findRootDeserializer(r8, r0)     // Catch:{ all -> 0x006b }
            boolean r1 = r4.useRootWrapping()     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x005b
            r1 = r9
            r2 = r10
            r3 = r8
            r5 = r0
            java.lang.Object r1 = r1._unwrapAndDeserialize(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.databind.JsonNode r1 = (com.fasterxml.jackson.databind.JsonNode) r1     // Catch:{ all -> 0x006b }
            goto L_0x0061
        L_0x005b:
            java.lang.Object r1 = r6.deserialize(r10, r8)     // Catch:{ all -> 0x006b }
            com.fasterxml.jackson.databind.JsonNode r1 = (com.fasterxml.jackson.databind.JsonNode) r1     // Catch:{ all -> 0x006b }
        L_0x0061:
            r2 = r8
        L_0x0062:
            if (r7 == 0) goto L_0x0067
            r9._verifyNoTrailingTokens(r10, r2, r0)     // Catch:{ all -> 0x006b }
        L_0x0067:
            r10.close()
            return r1
        L_0x006b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            if (r10 == 0) goto L_0x0078
            r10.close()     // Catch:{ all -> 0x0074 }
            goto L_0x0078
        L_0x0074:
            r10 = move-exception
            r0.addSuppressed(r10)
        L_0x0078:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._readTreeAndClose(com.fasterxml.jackson.core.JsonParser):com.fasterxml.jackson.databind.JsonNode");
    }

    /* access modifiers changed from: protected */
    public Object _readValue(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) throws IOException {
        Object obj;
        JsonToken _initForReading = _initForReading(jsonParser, javaType);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
        if (_initForReading == JsonToken.VALUE_NULL) {
            obj = _findRootDeserializer(createDeserializationContext, javaType).getNullValue(createDeserializationContext);
        } else if (_initForReading == JsonToken.END_ARRAY || _initForReading == JsonToken.END_OBJECT) {
            obj = null;
        } else {
            JsonDeserializer _findRootDeserializer = _findRootDeserializer(createDeserializationContext, javaType);
            obj = deserializationConfig.useRootWrapping() ? _unwrapAndDeserialize(jsonParser, createDeserializationContext, deserializationConfig, javaType, _findRootDeserializer) : _findRootDeserializer.deserialize(jsonParser, createDeserializationContext);
        }
        jsonParser.clearCurrentToken();
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, createDeserializationContext, javaType);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.createInstance(serializationConfig, this._serializerFactory);
    }

    /* access modifiers changed from: protected */
    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer) throws IOException {
        String simpleName = deserializationConfig.findRootName(javaType).getSimpleName();
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (currentToken != jsonToken) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        JsonToken nextToken = jsonParser.nextToken();
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (nextToken != jsonToken2) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken2, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        String currentName = jsonParser.getCurrentName();
        if (!simpleName.equals(currentName)) {
            deserializationContext.reportPropertyInputMismatch(javaType, currentName, "Root name '%s' does not match expected ('%s') for type %s", currentName, simpleName, javaType);
        }
        jsonParser.nextToken();
        Object deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        JsonToken nextToken2 = jsonParser.nextToken();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (nextToken2 != jsonToken3) {
            deserializationContext.reportWrongTokenException(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, deserializationContext, javaType);
        }
        return deserialize;
    }

    /* access modifiers changed from: protected */
    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        JsonToken nextToken = jsonParser.nextToken();
        if (nextToken != null) {
            deserializationContext.reportTrailingTokens(ClassUtil.rawClass(javaType), jsonParser, nextToken);
        }
    }

    /* access modifiers changed from: protected */
    public void _verifySchemaType(FormatSchema formatSchema) {
        if (formatSchema != null && !this._jsonFactory.canUseSchema(formatSchema)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot use FormatSchema of type ");
            sb.append(formatSchema.getClass().getName());
            sb.append(" for format ");
            sb.append(this._jsonFactory.getFormatName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void _writeValueAndClose(JsonGenerator jsonGenerator, Object obj) throws IOException {
        SerializationConfig serializationConfig = getSerializationConfig();
        if (!serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
                jsonGenerator.close();
            } catch (Exception e) {
                ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, e);
            }
        } else {
            _writeCloseable(jsonGenerator, obj, serializationConfig);
        }
    }

    public void acceptJsonFormatVisitor(Class<?> cls, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) throws JsonMappingException {
        acceptJsonFormatVisitor(this._typeFactory.constructType((Type) cls), jsonFormatVisitorWrapper);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator) {
        return activateDefaultTyping(polymorphicTypeValidator, DefaultTyping.OBJECT_AND_NON_CONCRETE);
    }

    public ObjectMapper activateDefaultTypingAsProperty(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, String str) {
        return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, getPolymorphicTypeValidator()).init(C1769Id.CLASS, null).inclusion(C1768As.PROPERTY).typeProperty(str));
    }

    public ObjectMapper addHandler(DeserializationProblemHandler deserializationProblemHandler) {
        this._deserializationConfig = this._deserializationConfig.withHandler(deserializationProblemHandler);
        return this;
    }

    public ObjectMapper addMixIn(Class<?> cls, Class<?> cls2) {
        this._mixIns.addLocalDefinition(cls, cls2);
        return this;
    }

    @Deprecated
    public final void addMixInAnnotations(Class<?> cls, Class<?> cls2) {
        addMixIn(cls, cls2);
    }

    public boolean canDeserialize(JavaType javaType) {
        return createDeserializationContext(null, getDeserializationConfig()).hasValueDeserializerFor(javaType, null);
    }

    public boolean canSerialize(Class<?> cls) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, null);
    }

    public ObjectMapper clearProblemHandlers() {
        this._deserializationConfig = this._deserializationConfig.withNoProblemHandlers();
        return this;
    }

    public MutableConfigOverride configOverride(Class<?> cls) {
        return this._configOverrides.findOrCreateOverride(cls);
    }

    public ObjectMapper configure(MapperFeature mapperFeature, boolean z) {
        MapperConfigBase mapperConfigBase;
        MapperConfigBase mapperConfigBase2;
        if (z) {
            mapperConfigBase = this._serializationConfig.with(new MapperFeature[]{mapperFeature});
        } else {
            mapperConfigBase = this._serializationConfig.without(new MapperFeature[]{mapperFeature});
        }
        this._serializationConfig = (SerializationConfig) mapperConfigBase;
        if (z) {
            mapperConfigBase2 = this._deserializationConfig.with(new MapperFeature[]{mapperFeature});
        } else {
            mapperConfigBase2 = this._deserializationConfig.without(new MapperFeature[]{mapperFeature});
        }
        this._deserializationConfig = (DeserializationConfig) mapperConfigBase2;
        return this;
    }

    public JavaType constructType(Type type) {
        _assertNotNull(UMCommonContent.f16582aF, type);
        return this._typeFactory.constructType(type);
    }

    public <T> T convertValue(Object obj, Class<T> cls) throws IllegalArgumentException {
        return _convert(obj, this._typeFactory.constructType((Type) cls));
    }

    public ObjectMapper copy() {
        _checkInvalidCopy(ObjectMapper.class);
        return new ObjectMapper(this);
    }

    /* access modifiers changed from: protected */
    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._deserializationContext.createInstance(deserializationConfig, jsonParser, this._injectableValues);
    }

    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        _assertNotNull("out", outputStream);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(outputStream, JsonEncoding.UTF8);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        JsonParser createNonBlockingByteArrayParser = this._jsonFactory.createNonBlockingByteArrayParser();
        this._deserializationConfig.initialize(createNonBlockingByteArrayParser);
        return createNonBlockingByteArrayParser;
    }

    public JsonParser createParser(File file) throws IOException {
        _assertNotNull("src", file);
        JsonParser createParser = this._jsonFactory.createParser(file);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public ObjectMapper deactivateDefaultTyping() {
        return setDefaultTyping(null);
    }

    /* access modifiers changed from: protected */
    public ClassIntrospector defaultClassIntrospector() {
        return new BasicClassIntrospector();
    }

    public ObjectMapper disable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.without(mapperFeatureArr);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.without(mapperFeatureArr);
        return this;
    }

    @Deprecated
    public ObjectMapper disableDefaultTyping() {
        return setDefaultTyping(null);
    }

    public ObjectMapper enable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(mapperFeatureArr);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(mapperFeatureArr);
        return this;
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping() {
        return activateDefaultTyping(getPolymorphicTypeValidator());
    }

    @Deprecated
    public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping defaultTyping, String str) {
        return activateDefaultTypingAsProperty(getPolymorphicTypeValidator(), defaultTyping, str);
    }

    public ObjectMapper findAndRegisterModules() {
        return registerModules((Iterable<? extends Module>) findModules());
    }

    public Class<?> findMixInClassFor(Class<?> cls) {
        return this._mixIns.findMixInClassFor(cls);
    }

    @Deprecated
    public JsonSchema generateJsonSchema(Class<?> cls) throws JsonMappingException {
        return _serializerProvider(getSerializationConfig()).generateJsonSchema(cls);
    }

    public DateFormat getDateFormat() {
        return this._serializationConfig.getDateFormat();
    }

    public DeserializationConfig getDeserializationConfig() {
        return this._deserializationConfig;
    }

    public DeserializationContext getDeserializationContext() {
        return this._deserializationContext;
    }

    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public InjectableValues getInjectableValues() {
        return this._injectableValues;
    }

    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    public JsonNodeFactory getNodeFactory() {
        return this._deserializationConfig.getNodeFactory();
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        return this._deserializationConfig.getBaseSettings().getPolymorphicTypeValidator();
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._serializationConfig.getPropertyNamingStrategy();
    }

    public Set<Object> getRegisteredModuleIds() {
        Set<Object> set = this._registeredModuleTypes;
        return set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
    }

    public SerializationConfig getSerializationConfig() {
        return this._serializationConfig;
    }

    public SerializerFactory getSerializerFactory() {
        return this._serializerFactory;
    }

    public SerializerProvider getSerializerProvider() {
        return this._serializerProvider;
    }

    public SerializerProvider getSerializerProviderInstance() {
        return _serializerProvider(this._serializationConfig);
    }

    public SubtypeResolver getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public VisibilityChecker<?> getVisibilityChecker() {
        return this._serializationConfig.getDefaultVisibilityChecker();
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._serializationConfig.isEnabled(mapperFeature);
    }

    public int mixInCount() {
        return this._mixIns.localSize();
    }

    public <T extends TreeNode> T readTree(JsonParser jsonParser) throws IOException, JsonProcessingException {
        _assertNotNull(UMCommonContent.f16624av, jsonParser);
        DeserializationConfig deserializationConfig = getDeserializationConfig();
        if (jsonParser.getCurrentToken() == null && jsonParser.nextToken() == null) {
            return null;
        }
        T t = (JsonNode) _readValue(deserializationConfig, jsonParser, constructType(JsonNode.class));
        if (t == null) {
            t = getNodeFactory().nullNode();
        }
        return t;
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull(UMCommonContent.f16624av, jsonParser);
        return _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType((Type) cls));
    }

    public ObjectReader reader() {
        return _newReader(getDeserializationConfig()).with(this._injectableValues);
    }

    public ObjectReader readerFor(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, this._injectableValues);
    }

    public ObjectReader readerForArrayOf(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructArrayType(cls), null, null, this._injectableValues);
    }

    public ObjectReader readerForListOf(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructCollectionType(List.class, cls), null, null, this._injectableValues);
    }

    public ObjectReader readerForMapOf(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructMapType(Map.class, String.class, cls), null, null, this._injectableValues);
    }

    public ObjectReader readerForUpdating(Object obj) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType((Type) obj.getClass()), obj, null, this._injectableValues);
    }

    public ObjectReader readerWithView(Class<?> cls) {
        return _newReader(getDeserializationConfig().withView(cls));
    }

    public ObjectMapper registerModule(Module module) {
        _assertNotNull(UMCommonContent.f16643e, module);
        if (module.getModuleName() == null) {
            throw new IllegalArgumentException("Module without defined name");
        } else if (module.version() != null) {
            for (Module registerModule : module.getDependencies()) {
                registerModule(registerModule);
            }
            if (isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS)) {
                Object typeId = module.getTypeId();
                if (typeId != null) {
                    if (this._registeredModuleTypes == null) {
                        this._registeredModuleTypes = new LinkedHashSet();
                    }
                    if (!this._registeredModuleTypes.add(typeId)) {
                        return this;
                    }
                }
            }
            module.setupModule(new SetupContext() {
                public void addAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
                    DeserializerFactory withAbstractTypeResolver = ObjectMapper.this._deserializationContext._factory.withAbstractTypeResolver(abstractTypeResolver);
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._deserializationContext = objectMapper._deserializationContext.with(withAbstractTypeResolver);
                }

                public void addBeanDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
                    DeserializerFactory withDeserializerModifier = ObjectMapper.this._deserializationContext._factory.withDeserializerModifier(beanDeserializerModifier);
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._deserializationContext = objectMapper._deserializationContext.with(withDeserializerModifier);
                }

                public void addBeanSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._serializerFactory = objectMapper._serializerFactory.withSerializerModifier(beanSerializerModifier);
                }

                public void addDeserializationProblemHandler(DeserializationProblemHandler deserializationProblemHandler) {
                    ObjectMapper.this.addHandler(deserializationProblemHandler);
                }

                public void addDeserializers(Deserializers deserializers) {
                    DeserializerFactory withAdditionalDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalDeserializers(deserializers);
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._deserializationContext = objectMapper._deserializationContext.with(withAdditionalDeserializers);
                }

                public void addKeyDeserializers(KeyDeserializers keyDeserializers) {
                    DeserializerFactory withAdditionalKeyDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalKeyDeserializers(keyDeserializers);
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._deserializationContext = objectMapper._deserializationContext.with(withAdditionalKeyDeserializers);
                }

                public void addKeySerializers(Serializers serializers) {
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalKeySerializers(serializers);
                }

                public void addSerializers(Serializers serializers) {
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalSerializers(serializers);
                }

                public void addTypeModifier(TypeModifier typeModifier) {
                    ObjectMapper.this.setTypeFactory(ObjectMapper.this._typeFactory.withModifier(typeModifier));
                }

                public void addValueInstantiators(ValueInstantiators valueInstantiators) {
                    DeserializerFactory withValueInstantiators = ObjectMapper.this._deserializationContext._factory.withValueInstantiators(valueInstantiators);
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._deserializationContext = objectMapper._deserializationContext.with(withValueInstantiators);
                }

                public void appendAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._deserializationConfig = (DeserializationConfig) objectMapper._deserializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
                    ObjectMapper objectMapper2 = ObjectMapper.this;
                    objectMapper2._serializationConfig = (SerializationConfig) objectMapper2._serializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
                }

                public MutableConfigOverride configOverride(Class<?> cls) {
                    return ObjectMapper.this.configOverride(cls);
                }

                public Version getMapperVersion() {
                    return ObjectMapper.this.version();
                }

                public <C extends ObjectCodec> C getOwner() {
                    return ObjectMapper.this;
                }

                public TypeFactory getTypeFactory() {
                    return ObjectMapper.this._typeFactory;
                }

                public void insertAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._deserializationConfig = (DeserializationConfig) objectMapper._deserializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
                    ObjectMapper objectMapper2 = ObjectMapper.this;
                    objectMapper2._serializationConfig = (SerializationConfig) objectMapper2._serializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
                }

                public boolean isEnabled(MapperFeature mapperFeature) {
                    return ObjectMapper.this.isEnabled(mapperFeature);
                }

                public void registerSubtypes(Class<?>... clsArr) {
                    ObjectMapper.this.registerSubtypes(clsArr);
                }

                public void setClassIntrospector(ClassIntrospector classIntrospector) {
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._deserializationConfig = (DeserializationConfig) objectMapper._deserializationConfig.with(classIntrospector);
                    ObjectMapper objectMapper2 = ObjectMapper.this;
                    objectMapper2._serializationConfig = (SerializationConfig) objectMapper2._serializationConfig.with(classIntrospector);
                }

                public void setMixInAnnotations(Class<?> cls, Class<?> cls2) {
                    ObjectMapper.this.addMixIn(cls, cls2);
                }

                public void setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
                    ObjectMapper.this.setPropertyNamingStrategy(propertyNamingStrategy);
                }

                public boolean isEnabled(DeserializationFeature deserializationFeature) {
                    return ObjectMapper.this.isEnabled(deserializationFeature);
                }

                public void registerSubtypes(NamedType... namedTypeArr) {
                    ObjectMapper.this.registerSubtypes(namedTypeArr);
                }

                public boolean isEnabled(SerializationFeature serializationFeature) {
                    return ObjectMapper.this.isEnabled(serializationFeature);
                }

                public void registerSubtypes(Collection<Class<?>> collection) {
                    ObjectMapper.this.registerSubtypes(collection);
                }

                public boolean isEnabled(Feature feature) {
                    return ObjectMapper.this.isEnabled(feature);
                }

                public boolean isEnabled(JsonParser.Feature feature) {
                    return ObjectMapper.this.isEnabled(feature);
                }

                public boolean isEnabled(JsonGenerator.Feature feature) {
                    return ObjectMapper.this.isEnabled(feature);
                }
            });
            return this;
        } else {
            throw new IllegalArgumentException("Module without defined version");
        }
    }

    public ObjectMapper registerModules(Module... moduleArr) {
        for (Module registerModule : moduleArr) {
            registerModule(registerModule);
        }
        return this;
    }

    public void registerSubtypes(Class<?>... clsArr) {
        getSubtypeResolver().registerSubtypes(clsArr);
    }

    public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(annotationIntrospector);
        return this;
    }

    public ObjectMapper setAnnotationIntrospectors(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(annotationIntrospector2);
        return this;
    }

    public ObjectMapper setBase64Variant(Base64Variant base64Variant) {
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(base64Variant);
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(base64Variant);
        return this;
    }

    public ObjectMapper setConfig(DeserializationConfig deserializationConfig) {
        _assertNotNull("config", deserializationConfig);
        this._deserializationConfig = deserializationConfig;
        return this;
    }

    public ObjectMapper setDateFormat(DateFormat dateFormat) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(dateFormat);
        this._serializationConfig = this._serializationConfig.with(dateFormat);
        return this;
    }

    public ObjectMapper setDefaultLeniency(Boolean bool) {
        this._configOverrides.setDefaultLeniency(bool);
        return this;
    }

    public ObjectMapper setDefaultMergeable(Boolean bool) {
        this._configOverrides.setDefaultMergeable(bool);
        return this;
    }

    public ObjectMapper setDefaultPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._serializationConfig = this._serializationConfig.withDefaultPrettyPrinter(prettyPrinter);
        return this;
    }

    public ObjectMapper setDefaultPropertyInclusion(Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    public ObjectMapper setDefaultSetterInfo(JsonSetter.Value value) {
        this._configOverrides.setDefaultSetterInfo(value);
        return this;
    }

    public ObjectMapper setDefaultTyping(TypeResolverBuilder<?> typeResolverBuilder) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(typeResolverBuilder);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(typeResolverBuilder);
        return this;
    }

    public ObjectMapper setDefaultVisibility(JsonAutoDetect.Value value) {
        this._configOverrides.setDefaultVisibility(Std.construct(value));
        return this;
    }

    public ObjectMapper setFilterProvider(FilterProvider filterProvider) {
        this._serializationConfig = this._serializationConfig.withFilters(filterProvider);
        return this;
    }

    @Deprecated
    public void setFilters(FilterProvider filterProvider) {
        this._serializationConfig = this._serializationConfig.withFilters(filterProvider);
    }

    public Object setHandlerInstantiator(HandlerInstantiator handlerInstantiator) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(handlerInstantiator);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(handlerInstantiator);
        return this;
    }

    public ObjectMapper setInjectableValues(InjectableValues injectableValues) {
        this._injectableValues = injectableValues;
        return this;
    }

    public ObjectMapper setLocale(Locale locale) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(locale);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(locale);
        return this;
    }

    @Deprecated
    public void setMixInAnnotations(Map<Class<?>, Class<?>> map) {
        setMixIns(map);
    }

    public ObjectMapper setMixInResolver(MixInResolver mixInResolver) {
        SimpleMixInResolver withOverrides = this._mixIns.withOverrides(mixInResolver);
        if (withOverrides != this._mixIns) {
            this._mixIns = withOverrides;
            this._deserializationConfig = new DeserializationConfig(this._deserializationConfig, withOverrides);
            this._serializationConfig = new SerializationConfig(this._serializationConfig, withOverrides);
        }
        return this;
    }

    public ObjectMapper setMixIns(Map<Class<?>, Class<?>> map) {
        this._mixIns.setLocalDefinitions(map);
        return this;
    }

    public ObjectMapper setNodeFactory(JsonNodeFactory jsonNodeFactory) {
        this._deserializationConfig = this._deserializationConfig.with(jsonNodeFactory);
        return this;
    }

    public ObjectMapper setPolymorphicTypeValidator(PolymorphicTypeValidator polymorphicTypeValidator) {
        this._deserializationConfig = this._deserializationConfig._withBase(this._deserializationConfig.getBaseSettings().with(polymorphicTypeValidator));
        return this;
    }

    @Deprecated
    public ObjectMapper setPropertyInclusion(Value value) {
        return setDefaultPropertyInclusion(value);
    }

    public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(propertyNamingStrategy);
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(propertyNamingStrategy);
        return this;
    }

    public ObjectMapper setSerializationInclusion(Include include) {
        setPropertyInclusion(Value.construct(include, include));
        return this;
    }

    public ObjectMapper setSerializerFactory(SerializerFactory serializerFactory) {
        this._serializerFactory = serializerFactory;
        return this;
    }

    public ObjectMapper setSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        this._serializerProvider = defaultSerializerProvider;
        return this;
    }

    public ObjectMapper setSubtypeResolver(SubtypeResolver subtypeResolver) {
        this._subtypeResolver = subtypeResolver;
        this._deserializationConfig = this._deserializationConfig.with(subtypeResolver);
        this._serializationConfig = this._serializationConfig.with(subtypeResolver);
        return this;
    }

    public ObjectMapper setTimeZone(TimeZone timeZone) {
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(timeZone);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(timeZone);
        return this;
    }

    public ObjectMapper setTypeFactory(TypeFactory typeFactory) {
        this._typeFactory = typeFactory;
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(typeFactory);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(typeFactory);
        return this;
    }

    public ObjectMapper setVisibility(VisibilityChecker<?> visibilityChecker) {
        this._configOverrides.setDefaultVisibility(visibilityChecker);
        return this;
    }

    @Deprecated
    public void setVisibilityChecker(VisibilityChecker<?> visibilityChecker) {
        setVisibility(visibilityChecker);
    }

    public JsonFactory tokenStreamFactory() {
        return this._jsonFactory;
    }

    public JsonParser treeAsTokens(TreeNode treeNode) {
        _assertNotNull("n", treeNode);
        return new TreeTraversingParser((JsonNode) treeNode, this);
    }

    public <T> T treeToValue(TreeNode treeNode, Class<T> cls) throws JsonProcessingException {
        if (treeNode == null) {
            return null;
        }
        try {
            if (TreeNode.class.isAssignableFrom(cls) && cls.isAssignableFrom(treeNode.getClass())) {
                return treeNode;
            }
            JsonToken asToken = treeNode.asToken();
            if (asToken == JsonToken.VALUE_NULL) {
                return null;
            }
            if (asToken == JsonToken.VALUE_EMBEDDED_OBJECT && (treeNode instanceof POJONode)) {
                T pojo = ((POJONode) treeNode).getPojo();
                if (pojo == null || cls.isInstance(pojo)) {
                    return pojo;
                }
            }
            return readValue(treeAsTokens(treeNode), cls);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    public <T> T updateValue(T t, Object obj) throws JsonMappingException {
        if (t == null || obj == null) {
            return t;
        }
        TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            tokenBuffer = tokenBuffer.forceUseOfBigDecimal(true);
        }
        try {
            _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE)).serializeValue(tokenBuffer, obj);
            JsonParser asParser = tokenBuffer.asParser();
            T readValue = readerForUpdating(t).readValue(asParser);
            asParser.close();
            return readValue;
        } catch (IOException e) {
            if (e instanceof JsonMappingException) {
                throw ((JsonMappingException) e);
            }
            throw JsonMappingException.fromUnexpectedIOE(e);
        }
    }

    public <T extends JsonNode> T valueToTree(Object obj) throws IllegalArgumentException {
        if (obj == null) {
            return getNodeFactory().nullNode();
        }
        TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            tokenBuffer = tokenBuffer.forceUseOfBigDecimal(true);
        }
        try {
            writeValue((JsonGenerator) tokenBuffer, obj);
            JsonParser asParser = tokenBuffer.asParser();
            T t = (JsonNode) readTree(asParser);
            asParser.close();
            return t;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode) throws IOException, JsonProcessingException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, treeNode);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException, JsonGenerationException, JsonMappingException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.getPrettyPrinter() == null) {
            jsonGenerator.setPrettyPrinter(serializationConfig.constructDefaultPrettyPrinter());
        }
        if (!serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
                return;
            }
            return;
        }
        _writeCloseableValue(jsonGenerator, obj, serializationConfig);
    }

    public byte[] writeValueAsBytes(Object obj) throws JsonProcessingException {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(this._jsonFactory._getBufferRecycler());
        try {
            _writeValueAndClose(createGenerator((OutputStream) byteArrayBuilder, JsonEncoding.UTF8), obj);
            byte[] byteArray = byteArrayBuilder.toByteArray();
            byteArrayBuilder.release();
            return byteArray;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public String writeValueAsString(Object obj) throws JsonProcessingException {
        SegmentedStringWriter segmentedStringWriter = new SegmentedStringWriter(this._jsonFactory._getBufferRecycler());
        try {
            _writeValueAndClose(createGenerator((Writer) segmentedStringWriter), obj);
            return segmentedStringWriter.getAndClear();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectWriter writer() {
        return _newWriter(getSerializationConfig());
    }

    public ObjectWriter writerFor(Class<?> cls) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (cls == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType((Type) cls);
        }
        return _newWriter(serializationConfig, javaType, null);
    }

    public ObjectWriter writerWithDefaultPrettyPrinter() {
        SerializationConfig serializationConfig = getSerializationConfig();
        return _newWriter(serializationConfig, null, serializationConfig.getDefaultPrettyPrinter());
    }

    @Deprecated
    public ObjectWriter writerWithType(Class<?> cls) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (cls == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType((Type) cls);
        }
        return _newWriter(serializationConfig, javaType, null);
    }

    public ObjectWriter writerWithView(Class<?> cls) {
        return _newWriter(getSerializationConfig().withView(cls));
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this(jsonFactory, null, null);
    }

    public static List<Module> findModules(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator it = secureGetServiceLoader(Module.class, classLoader).iterator();
        while (it.hasNext()) {
            arrayList.add((Module) it.next());
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public ObjectReader _newReader(DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        ObjectReader objectReader = new ObjectReader(this, deserializationConfig, javaType, obj, formatSchema, injectableValues);
        return objectReader;
    }

    /* access modifiers changed from: protected */
    public ObjectWriter _newWriter(SerializationConfig serializationConfig, FormatSchema formatSchema) {
        return new ObjectWriter(this, serializationConfig, formatSchema);
    }

    public void acceptJsonFormatVisitor(JavaType javaType, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) throws JsonMappingException {
        if (javaType != null) {
            _serializerProvider(getSerializationConfig()).acceptJsonFormatVisitor(javaType, jsonFormatVisitorWrapper);
            return;
        }
        throw new IllegalArgumentException("type must be provided");
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping) {
        return activateDefaultTyping(polymorphicTypeValidator, defaultTyping, C1768As.WRAPPER_ARRAY);
    }

    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, atomicReference);
    }

    public <T> T convertValue(Object obj, TypeReference<T> typeReference) throws IllegalArgumentException {
        return _convert(obj, this._typeFactory.constructType(typeReference));
    }

    public ArrayNode createArrayNode() {
        return this._deserializationConfig.getNodeFactory().arrayNode();
    }

    public ObjectNode createObjectNode() {
        return this._deserializationConfig.getNodeFactory().objectNode();
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping) {
        return enableDefaultTyping(defaultTyping, C1768As.WRAPPER_ARRAY);
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._serializationConfig.isEnabled(serializationFeature);
    }

    public JsonNode missingNode() {
        return this._deserializationConfig.getNodeFactory().missingNode();
    }

    public JsonNode nullNode() {
        return this._deserializationConfig.getNodeFactory().nullNode();
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature) {
        return _newReader(getDeserializationConfig().with(deserializationFeature));
    }

    public ObjectReader readerFor(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType((Type) cls), null, null, this._injectableValues);
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        getSubtypeResolver().registerSubtypes(namedTypeArr);
    }

    public ObjectMapper setDefaultPropertyInclusion(Include include) {
        this._configOverrides.setDefaultInclusion(Value.construct(include, include));
        return this;
    }

    public ObjectMapper setVisibility(PropertyAccessor propertyAccessor, Visibility visibility) {
        this._configOverrides.setDefaultVisibility(this._configOverrides.getDefaultVisibility().withVisibility(propertyAccessor, visibility));
        return this;
    }

    public ObjectWriter writer(SerializationFeature serializationFeature) {
        return _newWriter(getSerializationConfig().with(serializationFeature));
    }

    protected ObjectMapper(ObjectMapper objectMapper) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        JsonFactory copy = objectMapper._jsonFactory.copy();
        this._jsonFactory = copy;
        copy.setCodec(this);
        this._subtypeResolver = objectMapper._subtypeResolver.copy();
        this._typeFactory = objectMapper._typeFactory;
        this._injectableValues = objectMapper._injectableValues;
        ConfigOverrides copy2 = objectMapper._configOverrides.copy();
        this._configOverrides = copy2;
        this._mixIns = objectMapper._mixIns.copy();
        RootNameLookup rootNameLookup = new RootNameLookup();
        ConfigOverrides configOverrides = copy2;
        SerializationConfig serializationConfig = new SerializationConfig(objectMapper._serializationConfig, this._subtypeResolver, this._mixIns, rootNameLookup, configOverrides);
        this._serializationConfig = serializationConfig;
        DeserializationConfig deserializationConfig = new DeserializationConfig(objectMapper._deserializationConfig, this._subtypeResolver, this._mixIns, rootNameLookup, configOverrides);
        this._deserializationConfig = deserializationConfig;
        this._serializerProvider = objectMapper._serializerProvider.copy();
        this._deserializationContext = objectMapper._deserializationContext.copy();
        this._serializerFactory = objectMapper._serializerFactory;
        Set<Object> set = objectMapper._registeredModuleTypes;
        if (set == null) {
            this._registeredModuleTypes = null;
        } else {
            this._registeredModuleTypes = new LinkedHashSet(set);
        }
    }

    /* access modifiers changed from: protected */
    public ObjectWriter _newWriter(SerializationConfig serializationConfig, JavaType javaType, PrettyPrinter prettyPrinter) {
        return new ObjectWriter(this, serializationConfig, javaType, prettyPrinter);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, C1768As as) {
        if (as != C1768As.EXTERNAL_PROPERTY) {
            return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator).init(C1769Id.CLASS, null).inclusion(as));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot use includeAs of ");
        sb.append(as);
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> T convertValue(Object obj, JavaType javaType) throws IllegalArgumentException {
        return _convert(obj, javaType);
    }

    public ObjectMapper disable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature);
        return this;
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping, C1768As as) {
        return activateDefaultTyping(getPolymorphicTypeValidator(), defaultTyping, as);
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._deserializationConfig.isEnabled(deserializationFeature);
    }

    public <T> T readValue(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull(UMCommonContent.f16624av, jsonParser);
        return _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType(typeReference));
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _newReader(getDeserializationConfig().with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader readerFor(TypeReference<?> typeReference) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(typeReference), null, null, this._injectableValues);
    }

    public ObjectMapper registerModules(Iterable<? extends Module> iterable) {
        _assertNotNull("modules", iterable);
        for (Module registerModule : iterable) {
            registerModule(registerModule);
        }
        return this;
    }

    public void registerSubtypes(Collection<Class<?>> collection) {
        getSubtypeResolver().registerSubtypes(collection);
    }

    public ObjectMapper setConfig(SerializationConfig serializationConfig) {
        _assertNotNull("config", serializationConfig);
        this._serializationConfig = serializationConfig;
        return this;
    }

    public ObjectWriter writer(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _newWriter(getSerializationConfig().with(serializationFeature, serializationFeatureArr));
    }

    public boolean canDeserialize(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        return createDeserializationContext(null, getDeserializationConfig()).hasValueDeserializerFor(javaType, atomicReference);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("out", outputStream);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(outputStream, jsonEncoding);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public JsonParser createParser(URL url) throws IOException {
        _assertNotNull("src", url);
        JsonParser createParser = this._jsonFactory.createParser(url);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public ObjectMapper disable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature, serializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature, serializationFeatureArr);
        return this;
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._deserializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser, ResolvedType resolvedType) throws IOException, JsonProcessingException {
        return readValues(jsonParser, (JavaType) resolvedType);
    }

    public ObjectReader reader(JsonNodeFactory jsonNodeFactory) {
        return _newReader(getDeserializationConfig()).with(jsonNodeFactory);
    }

    public ObjectWriter writer(DateFormat dateFormat) {
        return _newWriter(getSerializationConfig().with(dateFormat));
    }

    public ObjectWriter writerFor(TypeReference<?> typeReference) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (typeReference == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType(typeReference);
        }
        return _newWriter(serializationConfig, javaType, null);
    }

    @Deprecated
    public ObjectWriter writerWithType(TypeReference<?> typeReference) {
        JavaType javaType;
        SerializationConfig serializationConfig = getSerializationConfig();
        if (typeReference == null) {
            javaType = null;
        } else {
            javaType = this._typeFactory.constructType(typeReference);
        }
        return _newWriter(serializationConfig, javaType, null);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public JsonToken _initForReading(JsonParser jsonParser) throws IOException {
        return _initForReading(jsonParser, null);
    }

    public ObjectMapper configure(SerializationFeature serializationFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.with(serializationFeature) : this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature);
        return this;
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._serializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public final <T> T readValue(JsonParser jsonParser, ResolvedType resolvedType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull(UMCommonContent.f16624av, jsonParser);
        return _readValue(getDeserializationConfig(), jsonParser, (JavaType) resolvedType);
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser, JavaType javaType) throws IOException, JsonProcessingException {
        _assertNotNull(UMCommonContent.f16624av, jsonParser);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, getDeserializationConfig());
        MappingIterator mappingIterator = new MappingIterator(javaType, jsonParser, createDeserializationContext, _findRootDeserializer(createDeserializationContext, javaType), false, null);
        return mappingIterator;
    }

    public ObjectReader reader(FormatSchema formatSchema) {
        _verifySchemaType(formatSchema);
        return _newReader(getDeserializationConfig(), null, null, formatSchema, this._injectableValues);
    }

    public ObjectWriter writer(PrettyPrinter prettyPrinter) {
        if (prettyPrinter == null) {
            prettyPrinter = ObjectWriter.NULL_PRETTY_PRINTER;
        }
        return _newWriter(getSerializationConfig(), null, prettyPrinter);
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public boolean isEnabled(Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public void writeTree(JsonGenerator jsonGenerator, JsonNode jsonNode) throws IOException, JsonProcessingException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, jsonNode);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public ObjectMapper configure(DeserializationFeature deserializationFeature, boolean z) {
        this._deserializationConfig = z ? this._deserializationConfig.with(deserializationFeature) : this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        _assertNotNull("w", writer);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(writer);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public JsonParser createParser(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        JsonParser createParser = this._jsonFactory.createParser(inputStream);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public ObjectMapper disable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature disable : featureArr) {
            this._jsonFactory.disable(disable);
        }
        return this;
    }

    public ObjectMapper enable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature enable : featureArr) {
            this._jsonFactory.enable(enable);
        }
        return this;
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return isEnabled(streamReadFeature.mappedFeature());
    }

    public JsonNode readTree(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return _readTreeAndClose(this._jsonFactory.createParser(inputStream));
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull(UMCommonContent.f16624av, jsonParser);
        return _readValue(getDeserializationConfig(), jsonParser, javaType);
    }

    public ObjectReader reader(InjectableValues injectableValues) {
        return _newReader(getDeserializationConfig(), null, null, null, injectableValues);
    }

    public ObjectWriter writer(FilterProvider filterProvider) {
        return _newWriter(getSerializationConfig().withFilters(filterProvider));
    }

    public ObjectWriter writerFor(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }

    @Deprecated
    public ObjectWriter writerWithType(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return isEnabled(streamWriteFeature.mappedFeature());
    }

    public ObjectReader reader(Base64Variant base64Variant) {
        return _newReader((DeserializationConfig) getDeserializationConfig().with(base64Variant));
    }

    public ObjectWriter writer(FormatSchema formatSchema) {
        _verifySchemaType(formatSchema);
        return _newWriter(getSerializationConfig(), formatSchema);
    }

    public ObjectMapper configure(JsonParser.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public ObjectMapper disable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature disable : featureArr) {
            this._jsonFactory.disable(disable);
        }
        return this;
    }

    public ObjectMapper enable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature enable : featureArr) {
            this._jsonFactory.enable(enable);
        }
        return this;
    }

    public JsonNode readTree(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return _readTreeAndClose(this._jsonFactory.createParser(reader));
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", file);
        return _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType((Type) cls));
    }

    public ObjectReader reader(ContextAttributes contextAttributes) {
        return _newReader(getDeserializationConfig().with(contextAttributes));
    }

    public ObjectMapper configure(JsonGenerator.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("outputFile", file);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(file, jsonEncoding);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public JsonParser createParser(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        JsonParser createParser = this._jsonFactory.createParser(reader);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException, JsonProcessingException {
        return readValues(jsonParser, this._typeFactory.constructType((Type) cls));
    }

    @Deprecated
    public ObjectReader reader(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, this._injectableValues);
    }

    public ObjectWriter writer(Base64Variant base64Variant) {
        return _newWriter((SerializationConfig) getSerializationConfig().with(base64Variant));
    }

    public JsonNode readTree(String str) throws JsonProcessingException, JsonMappingException {
        _assertNotNull("content", str);
        try {
            return _readTreeAndClose(this._jsonFactory.createParser(str));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public <T> T readValue(File file, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", file);
        return _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType(typeReference));
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException, JsonProcessingException {
        return readValues(jsonParser, this._typeFactory.constructType(typeReference));
    }

    @Deprecated
    public ObjectReader reader(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType((Type) cls), null, null, this._injectableValues);
    }

    public void writeValue(File file, Object obj) throws IOException, JsonGenerationException, JsonMappingException {
        _writeValueAndClose(createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter writer(CharacterEscapes characterEscapes) {
        return _newWriter(getSerializationConfig()).with(characterEscapes);
    }

    @Deprecated
    public ObjectReader reader(TypeReference<?> typeReference) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(typeReference), null, null, this._injectableValues);
    }

    public void writeValue(OutputStream outputStream, Object obj) throws IOException, JsonGenerationException, JsonMappingException {
        _writeValueAndClose(createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public ObjectWriter writer(ContextAttributes contextAttributes) {
        return _newWriter(getSerializationConfig().with(contextAttributes));
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        _assertNotNull("out", dataOutput);
        JsonGenerator createGenerator = this._jsonFactory.createGenerator(dataOutput);
        this._serializationConfig.initialize(createGenerator);
        return createGenerator;
    }

    public JsonParser createParser(byte[] bArr) throws IOException {
        _assertNotNull("content", bArr);
        JsonParser createParser = this._jsonFactory.createParser(bArr);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public <T> T readValue(File file, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", file);
        return _readMapAndClose(this._jsonFactory.createParser(file), javaType);
    }

    public void writeValue(DataOutput dataOutput, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(dataOutput), obj);
    }

    public void writeValue(Writer writer, Object obj) throws IOException, JsonGenerationException, JsonMappingException {
        _writeValueAndClose(createGenerator(writer), obj);
    }

    public JsonNode readTree(byte[] bArr) throws IOException {
        _assertNotNull("content", bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr));
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", url);
        return _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType((Type) cls));
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull("content", bArr);
        JsonParser createParser = this._jsonFactory.createParser(bArr, i, i2);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public JsonNode readTree(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull("content", bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr, i, i2));
    }

    public <T> T readValue(URL url, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", url);
        return _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType(typeReference));
    }

    public JsonParser createParser(String str) throws IOException {
        _assertNotNull("content", str);
        JsonParser createParser = this._jsonFactory.createParser(str);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public JsonNode readTree(File file) throws IOException, JsonProcessingException {
        _assertNotNull("file", file);
        return _readTreeAndClose(this._jsonFactory.createParser(file));
    }

    public <T> T readValue(URL url, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", url);
        return _readMapAndClose(this._jsonFactory.createParser(url), javaType);
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this._jsonFactory = new MappingJsonFactory(this);
        } else {
            this._jsonFactory = jsonFactory;
            if (jsonFactory.getCodec() == null) {
                jsonFactory.setCodec(this);
            }
        }
        this._subtypeResolver = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._typeFactory = TypeFactory.defaultInstance();
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver(null);
        this._mixIns = simpleMixInResolver;
        BaseSettings withClassIntrospector = DEFAULT_BASE.withClassIntrospector(defaultClassIntrospector());
        ConfigOverrides configOverrides = new ConfigOverrides();
        this._configOverrides = configOverrides;
        BaseSettings baseSettings = withClassIntrospector;
        SimpleMixInResolver simpleMixInResolver2 = simpleMixInResolver;
        RootNameLookup rootNameLookup2 = rootNameLookup;
        ConfigOverrides configOverrides2 = configOverrides;
        SerializationConfig serializationConfig = new SerializationConfig(baseSettings, this._subtypeResolver, simpleMixInResolver2, rootNameLookup2, configOverrides2);
        this._serializationConfig = serializationConfig;
        DeserializationConfig deserializationConfig = new DeserializationConfig(baseSettings, this._subtypeResolver, simpleMixInResolver2, rootNameLookup2, configOverrides2);
        this._deserializationConfig = deserializationConfig;
        boolean requiresPropertyOrdering = this._jsonFactory.requiresPropertyOrdering();
        SerializationConfig serializationConfig2 = this._serializationConfig;
        MapperFeature mapperFeature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        if (serializationConfig2.isEnabled(mapperFeature) ^ requiresPropertyOrdering) {
            configure(mapperFeature, requiresPropertyOrdering);
        }
        if (defaultSerializerProvider == null) {
            defaultSerializerProvider = new Impl();
        }
        this._serializerProvider = defaultSerializerProvider;
        if (defaultDeserializationContext == null) {
            defaultDeserializationContext = new DefaultDeserializationContext.Impl((DeserializerFactory) BeanDeserializerFactory.instance);
        }
        this._deserializationContext = defaultDeserializationContext;
        this._serializerFactory = BeanSerializerFactory.instance;
    }

    public JsonNode readTree(URL url) throws IOException {
        _assertNotNull("source", url);
        return _readTreeAndClose(this._jsonFactory.createParser(url));
    }

    public <T> T readValue(String str, Class<T> cls) throws JsonProcessingException, JsonMappingException {
        _assertNotNull("content", str);
        return readValue(str, this._typeFactory.constructType((Type) cls));
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        _assertNotNull("content", cArr);
        JsonParser createParser = this._jsonFactory.createParser(cArr);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public <T> T readValue(String str, TypeReference<T> typeReference) throws JsonProcessingException, JsonMappingException {
        _assertNotNull("content", str);
        return readValue(str, this._typeFactory.constructType(typeReference));
    }

    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        _assertNotNull("content", cArr);
        JsonParser createParser = this._jsonFactory.createParser(cArr, i, i2);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public <T> T readValue(String str, JavaType javaType) throws JsonProcessingException, JsonMappingException {
        _assertNotNull("content", str);
        try {
            return _readMapAndClose(this._jsonFactory.createParser(str), javaType);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        _assertNotNull("content", dataInput);
        JsonParser createParser = this._jsonFactory.createParser(dataInput);
        this._deserializationConfig.initialize(createParser);
        return createParser;
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", reader);
        return _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(Reader reader, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", reader);
        return _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType(typeReference));
    }

    public <T> T readValue(Reader reader, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", reader);
        return _readMapAndClose(this._jsonFactory.createParser(reader), javaType);
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", inputStream);
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(InputStream inputStream, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", inputStream);
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType(typeReference));
    }

    public <T> T readValue(InputStream inputStream, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", inputStream);
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), javaType);
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, Class<T> cls) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(byte[] bArr, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType(typeReference));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, TypeReference<T> typeReference) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType(typeReference));
    }

    public <T> T readValue(byte[] bArr, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr), javaType);
    }

    public <T> T readValue(byte[] bArr, int i, int i2, JavaType javaType) throws IOException, JsonParseException, JsonMappingException {
        _assertNotNull("src", bArr);
        return _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), javaType);
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        _assertNotNull("src", dataInput);
        return _readMapAndClose(this._jsonFactory.createParser(dataInput), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(DataInput dataInput, JavaType javaType) throws IOException {
        _assertNotNull("src", dataInput);
        return _readMapAndClose(this._jsonFactory.createParser(dataInput), javaType);
    }
}
