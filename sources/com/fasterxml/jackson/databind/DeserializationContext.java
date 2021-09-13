package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.Named;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class DeserializationContext extends DatabindContext implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient ArrayBuilders _arrayBuilders;
    protected transient ContextAttributes _attributes;
    protected final DeserializerCache _cache;
    protected final DeserializationConfig _config;
    protected LinkedNode<JavaType> _currentType;
    protected transient DateFormat _dateFormat;
    protected final DeserializerFactory _factory;
    protected final int _featureFlags;
    protected final InjectableValues _injectableValues;
    protected transient ObjectBuffer _objectBuffer;
    protected transient JsonParser _parser;
    protected final Class<?> _view;

    protected DeserializationContext(DeserializerFactory deserializerFactory) {
        this(deserializerFactory, (DeserializerCache) null);
    }

    /* access modifiers changed from: protected */
    public boolean _isCompatible(Class<?> cls, Object obj) {
        if (obj == null || cls.isInstance(obj)) {
            return true;
        }
        if (!cls.isPrimitive() || !ClassUtil.wrapperType(cls).isInstance(obj)) {
            return false;
        }
        return true;
    }

    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public abstract void checkUnresolvedObjectId() throws UnresolvedForwardReference;

    public Calendar constructCalendar(Date date) {
        Calendar instance = Calendar.getInstance(getTimeZone());
        instance.setTime(date);
        return instance;
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        if (javaType.hasRawClass(cls)) {
            return javaType;
        }
        return getConfig().getTypeFactory().constructSpecializedType(javaType, cls, false);
    }

    public final JavaType constructType(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this._config.constructType(cls);
    }

    public abstract JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object obj) throws JsonMappingException;

    @Deprecated
    public JsonMappingException endOfInputException(Class<?> cls) {
        JsonParser jsonParser = this._parser;
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected end-of-input when trying to deserialize a ");
        sb.append(cls.getName());
        return MismatchedInputException.from(jsonParser, cls, sb.toString());
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        return getTypeFactory().findClass(str);
    }

    public final JsonDeserializer<Object> findContextualValueDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer<Object> findValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        return findValueDeserializer != null ? handleSecondaryContextualization(findValueDeserializer, beanProperty, javaType) : findValueDeserializer;
    }

    public final Object findInjectableValue(Object obj, BeanProperty beanProperty, Object obj2) throws JsonMappingException {
        if (this._injectableValues == null) {
            reportBadDefinition(ClassUtil.classOf(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", new Object[]{obj}));
        }
        return this._injectableValues.findInjectableValue(obj, this, beanProperty, obj2);
    }

    public final KeyDeserializer findKeyDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        KeyDeserializer findKeyDeserializer = this._cache.findKeyDeserializer(this, this._factory, javaType);
        return findKeyDeserializer instanceof ContextualKeyDeserializer ? ((ContextualKeyDeserializer) findKeyDeserializer).createContextual(this, beanProperty) : findKeyDeserializer;
    }

    public final JsonDeserializer<Object> findNonContextualValueDeserializer(JavaType javaType) throws JsonMappingException {
        return this._cache.findValueDeserializer(this, this._factory, javaType);
    }

    public abstract ReadableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, ObjectIdResolver objectIdResolver);

    public final JsonDeserializer<Object> findRootValueDeserializer(JavaType javaType) throws JsonMappingException {
        JsonDeserializer findValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        if (findValueDeserializer == null) {
            return null;
        }
        JsonDeserializer<Object> handleSecondaryContextualization = handleSecondaryContextualization(findValueDeserializer, null, javaType);
        TypeDeserializer findTypeDeserializer = this._factory.findTypeDeserializer(this._config, javaType);
        return findTypeDeserializer != null ? new TypeWrappedDeserializer(findTypeDeserializer.forProperty(null), handleSecondaryContextualization) : handleSecondaryContextualization;
    }

    public final Class<?> getActiveView() {
        return this._view;
    }

    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public final ArrayBuilders getArrayBuilders() {
        if (this._arrayBuilders == null) {
            this._arrayBuilders = new ArrayBuilders();
        }
        return this._arrayBuilders;
    }

    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    public final Base64Variant getBase64Variant() {
        return this._config.getBase64Variant();
    }

    public JavaType getContextualType() {
        LinkedNode<JavaType> linkedNode = this._currentType;
        if (linkedNode == null) {
            return null;
        }
        return (JavaType) linkedNode.value();
    }

    /* access modifiers changed from: protected */
    public DateFormat getDateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    public final Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final int getDeserializationFeatures() {
        return this._featureFlags;
    }

    public DeserializerFactory getFactory() {
        return this._factory;
    }

    public Locale getLocale() {
        return this._config.getLocale();
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._config.getNodeFactory();
    }

    public final JsonParser getParser() {
        return this._parser;
    }

    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public void handleBadMerge(JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        if (!isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            JavaType constructType = constructType(jsonDeserializer.handledType());
            throw InvalidDefinitionException.from(getParser(), String.format("Invalid configuration: values of type %s cannot be merged", new Object[]{ClassUtil.getTypeDescription(constructType)}), constructType);
        }
    }

    public Object handleInstantiationProblem(Class<?> cls, Object obj, Throwable th) throws IOException {
        for (LinkedNode problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object handleInstantiationProblem = ((DeserializationProblemHandler) problemHandlers.value()).handleInstantiationProblem(this, cls, obj, th);
            if (handleInstantiationProblem != DeserializationProblemHandler.NOT_HANDLED) {
                if (_isCompatible(cls, handleInstantiationProblem)) {
                    return handleInstantiationProblem;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", new Object[]{ClassUtil.getClassDescription(cls), ClassUtil.classNameOf(handleInstantiationProblem)}));
            }
        }
        ClassUtil.throwIfIOE(th);
        if (!isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            ClassUtil.throwIfRTE(th);
        }
        throw instantiationException(cls, th);
    }

    public Object handleMissingInstantiator(Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        if (jsonParser == null) {
            jsonParser = getParser();
        }
        String _format = _format(str, objArr);
        for (LinkedNode problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object handleMissingInstantiator = ((DeserializationProblemHandler) problemHandlers.value()).handleMissingInstantiator(this, cls, valueInstantiator, jsonParser, _format);
            if (handleMissingInstantiator != DeserializationProblemHandler.NOT_HANDLED) {
                if (_isCompatible(cls, handleMissingInstantiator)) {
                    return handleMissingInstantiator;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", new Object[]{ClassUtil.getClassDescription(cls), ClassUtil.getClassDescription(handleMissingInstantiator)}));
            }
        }
        if (valueInstantiator == null) {
            return reportBadDefinition(cls, String.format("Cannot construct instance of %s: %s", new Object[]{ClassUtil.nameOf(cls), _format}));
        } else if (!valueInstantiator.canInstantiate()) {
            return reportBadDefinition(cls, String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", new Object[]{ClassUtil.nameOf(cls), _format}));
        } else {
            return reportInputMismatch(cls, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", new Object[]{ClassUtil.nameOf(cls), _format}), new Object[0]);
        }
    }

    public JavaType handleMissingTypeId(JavaType javaType, TypeIdResolver typeIdResolver, String str) throws IOException {
        LinkedNode problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            JavaType handleMissingTypeId = ((DeserializationProblemHandler) problemHandlers.value()).handleMissingTypeId(this, javaType, typeIdResolver, str);
            if (handleMissingTypeId == null) {
                problemHandlers = problemHandlers.next();
            } else if (handleMissingTypeId.hasRawClass(Void.class)) {
                return null;
            } else {
                if (handleMissingTypeId.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return handleMissingTypeId;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("problem handler tried to resolve into non-subtype: ");
                sb.append(ClassUtil.getTypeDescription(handleMissingTypeId));
                throw invalidTypeIdException(javaType, null, sb.toString());
            }
        }
        throw missingTypeIdException(javaType, str);
    }

    public JsonDeserializer<?> handlePrimaryContextualization(JsonDeserializer<?> jsonDeserializer, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        if (jsonDeserializer instanceof ContextualDeserializer) {
            this._currentType = new LinkedNode<>(javaType, this._currentType);
            try {
                jsonDeserializer = ((ContextualDeserializer) jsonDeserializer).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.next();
            }
        }
        return jsonDeserializer;
    }

    public JsonDeserializer<?> handleSecondaryContextualization(JsonDeserializer<?> jsonDeserializer, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        if (jsonDeserializer instanceof ContextualDeserializer) {
            this._currentType = new LinkedNode<>(javaType, this._currentType);
            try {
                jsonDeserializer = ((ContextualDeserializer) jsonDeserializer).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.next();
            }
        }
        return jsonDeserializer;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonParser.getCurrentToken(), jsonParser, (String) null, new Object[0]);
    }

    public boolean handleUnknownProperty(JsonParser jsonParser, JsonDeserializer<?> jsonDeserializer, Object obj, String str) throws IOException {
        Collection collection;
        for (LinkedNode problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            if (((DeserializationProblemHandler) problemHandlers.value()).handleUnknownProperty(this, jsonParser, jsonDeserializer, obj, str)) {
                return true;
            }
        }
        if (!isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            jsonParser.skipChildren();
            return true;
        }
        if (jsonDeserializer == null) {
            collection = null;
        } else {
            collection = jsonDeserializer.getKnownPropertyNames();
        }
        throw UnrecognizedPropertyException.from(this._parser, obj, str, collection);
    }

    public JavaType handleUnknownTypeId(JavaType javaType, String str, TypeIdResolver typeIdResolver, String str2) throws IOException {
        LinkedNode problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            JavaType handleUnknownTypeId = ((DeserializationProblemHandler) problemHandlers.value()).handleUnknownTypeId(this, javaType, str, typeIdResolver, str2);
            if (handleUnknownTypeId == null) {
                problemHandlers = problemHandlers.next();
            } else if (handleUnknownTypeId.hasRawClass(Void.class)) {
                return null;
            } else {
                if (handleUnknownTypeId.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return handleUnknownTypeId;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("problem handler tried to resolve into non-subtype: ");
                sb.append(ClassUtil.getTypeDescription(handleUnknownTypeId));
                throw invalidTypeIdException(javaType, str, sb.toString());
            }
        }
        if (!isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            return null;
        }
        throw invalidTypeIdException(javaType, str, str2);
    }

    public Object handleWeirdKey(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String _format = _format(str2, objArr);
        LinkedNode problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            Object handleWeirdKey = ((DeserializationProblemHandler) problemHandlers.value()).handleWeirdKey(this, cls, str, _format);
            if (handleWeirdKey == DeserializationProblemHandler.NOT_HANDLED) {
                problemHandlers = problemHandlers.next();
            } else if (handleWeirdKey == null || cls.isInstance(handleWeirdKey)) {
                return handleWeirdKey;
            } else {
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", new Object[]{ClassUtil.getClassDescription(cls), ClassUtil.getClassDescription(handleWeirdKey)}));
            }
        }
        throw weirdKeyException(cls, str, _format);
    }

    public Object handleWeirdNativeValue(JavaType javaType, Object obj, JsonParser jsonParser) throws IOException {
        LinkedNode problemHandlers = this._config.getProblemHandlers();
        Class rawClass = javaType.getRawClass();
        while (problemHandlers != null) {
            Object handleWeirdNativeValue = ((DeserializationProblemHandler) problemHandlers.value()).handleWeirdNativeValue(this, javaType, obj, jsonParser);
            if (handleWeirdNativeValue == DeserializationProblemHandler.NOT_HANDLED) {
                problemHandlers = problemHandlers.next();
            } else if (handleWeirdNativeValue == null || rawClass.isInstance(handleWeirdNativeValue)) {
                return handleWeirdNativeValue;
            } else {
                throw JsonMappingException.from(jsonParser, _format("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", ClassUtil.getClassDescription(javaType), ClassUtil.getClassDescription(handleWeirdNativeValue)));
            }
        }
        throw weirdNativeValueException(obj, rawClass);
    }

    public Object handleWeirdNumberValue(Class<?> cls, Number number, String str, Object... objArr) throws IOException {
        String _format = _format(str, objArr);
        LinkedNode problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            Object handleWeirdNumberValue = ((DeserializationProblemHandler) problemHandlers.value()).handleWeirdNumberValue(this, cls, number, _format);
            if (handleWeirdNumberValue == DeserializationProblemHandler.NOT_HANDLED) {
                problemHandlers = problemHandlers.next();
            } else if (_isCompatible(cls, handleWeirdNumberValue)) {
                return handleWeirdNumberValue;
            } else {
                throw weirdNumberException(number, cls, _format("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", ClassUtil.getClassDescription(cls), ClassUtil.getClassDescription(handleWeirdNumberValue)));
            }
        }
        throw weirdNumberException(number, cls, _format);
    }

    public Object handleWeirdStringValue(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String _format = _format(str2, objArr);
        LinkedNode problemHandlers = this._config.getProblemHandlers();
        while (problemHandlers != null) {
            Object handleWeirdStringValue = ((DeserializationProblemHandler) problemHandlers.value()).handleWeirdStringValue(this, cls, str, _format);
            if (handleWeirdStringValue == DeserializationProblemHandler.NOT_HANDLED) {
                problemHandlers = problemHandlers.next();
            } else if (_isCompatible(cls, handleWeirdStringValue)) {
                return handleWeirdStringValue;
            } else {
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", new Object[]{ClassUtil.getClassDescription(cls), ClassUtil.getClassDescription(handleWeirdStringValue)}));
            }
        }
        throw weirdStringException(str, cls, _format);
    }

    public final boolean hasDeserializationFeatures(int i) {
        return (this._featureFlags & i) == i;
    }

    public final boolean hasSomeOfFeatures(int i) {
        return (i & this._featureFlags) != 0;
    }

    public boolean hasValueDeserializerFor(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        try {
            return this._cache.hasValueDeserializerFor(this, this._factory, javaType);
        } catch (JsonMappingException e) {
            if (atomicReference != null) {
                atomicReference.set(e);
            }
            return false;
        } catch (RuntimeException e2) {
            if (atomicReference != null) {
                atomicReference.set(e2);
                return false;
            }
            throw e2;
        }
    }

    public JsonMappingException instantiationException(Class<?> cls, Throwable th) {
        String str;
        if (th == null) {
            str = "N/A";
        } else {
            str = ClassUtil.exceptionMessage(th);
            if (str == null) {
                str = ClassUtil.nameOf(th.getClass());
            }
        }
        return ValueInstantiationException.from(this._parser, String.format("Cannot construct instance of %s, problem: %s", new Object[]{ClassUtil.nameOf(cls), str}), constructType(cls), th);
    }

    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", new Object[]{str, ClassUtil.getTypeDescription(javaType)}), str2), javaType, str);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public abstract KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj) throws JsonMappingException;

    public final ObjectBuffer leaseObjectBuffer() {
        ObjectBuffer objectBuffer = this._objectBuffer;
        if (objectBuffer == null) {
            return new ObjectBuffer();
        }
        this._objectBuffer = null;
        return objectBuffer;
    }

    @Deprecated
    public JsonMappingException mappingException(String str) {
        return JsonMappingException.from(getParser(), str);
    }

    public JsonMappingException missingTypeIdException(JavaType javaType, String str) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Missing type id when trying to resolve subtype of %s", new Object[]{javaType}), str), javaType, null);
    }

    public Date parseDate(String str) throws IllegalArgumentException {
        try {
            return getDateFormat().parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", new Object[]{str, ClassUtil.exceptionMessage(e)}));
        }
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, Class<T> cls) throws IOException {
        return readPropertyValue(jsonParser, beanProperty, getTypeFactory().constructType((Type) cls));
    }

    public JsonNode readTree(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == null) {
            currentToken = jsonParser.nextToken();
            if (currentToken == null) {
                return getNodeFactory().missingNode();
            }
        }
        if (currentToken == JsonToken.VALUE_NULL) {
            return getNodeFactory().nullNode();
        }
        return (JsonNode) findRootValueDeserializer(this._config.constructType(JsonNode.class)).deserialize(jsonParser, this);
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        return readValue(jsonParser, getTypeFactory().constructType((Type) cls));
    }

    public <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, str, javaType);
    }

    @Deprecated
    public <T> T reportBadMerge(JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        handleBadMerge(jsonDeserializer);
        return null;
    }

    public <T> T reportBadPropertyDefinition(BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, String str, Object... objArr) throws JsonMappingException {
        String _format = _format(str, objArr);
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid definition for property %s (of type %s): %s", new Object[]{ClassUtil.nameOf((Named) beanPropertyDefinition), ClassUtil.nameOf(beanDescription.getBeanClass()), _format}), beanDescription, beanPropertyDefinition);
    }

    public <T> T reportBadTypeDefinition(BeanDescription beanDescription, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid type definition for type %s: %s", new Object[]{ClassUtil.nameOf(beanDescription.getBeanClass()), _format(str, objArr)}), beanDescription, (BeanPropertyDefinition) null);
    }

    public <T> T reportInputMismatch(JsonDeserializer<?> jsonDeserializer, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), jsonDeserializer.handledType(), _format(str, objArr));
    }

    @Deprecated
    public void reportMappingException(String str, Object... objArr) throws JsonMappingException {
        throw JsonMappingException.from(getParser(), _format(str, objArr));
    }

    @Deprecated
    public void reportMissingContent(String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), (JavaType) null, "No content to map due to end-of-input");
    }

    public <T> T reportPropertyInputMismatch(Class<?> cls, String str, String str2, Object... objArr) throws JsonMappingException {
        MismatchedInputException from = MismatchedInputException.from(getParser(), cls, _format(str2, objArr));
        if (str != null) {
            from.prependPath((Object) cls, str);
        }
        throw from;
    }

    public <T> T reportTrailingTokens(Class<?> cls, JsonParser jsonParser, JsonToken jsonToken) throws JsonMappingException {
        throw MismatchedInputException.from(jsonParser, cls, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", new Object[]{jsonToken, ClassUtil.nameOf(cls)}));
    }

    @Deprecated
    public void reportUnknownProperty(Object obj, String str, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Collection collection;
        if (isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            if (jsonDeserializer == null) {
                collection = null;
            } else {
                collection = jsonDeserializer.getKnownPropertyNames();
            }
            throw UnrecognizedPropertyException.from(this._parser, obj, str, collection);
        }
    }

    public <T> T reportUnresolvedObjectId(ObjectIdReader objectIdReader, Object obj) throws JsonMappingException {
        return reportInputMismatch((BeanProperty) objectIdReader.idProperty, String.format("No Object Id found for an instance of %s, to assign to property '%s'", new Object[]{ClassUtil.classNameOf(obj), objectIdReader.propertyName}), new Object[0]);
    }

    public void reportWrongTokenException(JsonDeserializer<?> jsonDeserializer, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), jsonDeserializer.handledType(), jsonToken, _format(str, objArr));
    }

    public final void returnObjectBuffer(ObjectBuffer objectBuffer) {
        if (this._objectBuffer == null || objectBuffer.initialCapacity() >= this._objectBuffer.initialCapacity()) {
            this._objectBuffer = objectBuffer;
        }
    }

    @Deprecated
    public JsonMappingException unknownTypeException(JavaType javaType, String str, String str2) {
        return MismatchedInputException.from(this._parser, javaType, _colonConcat(String.format("Could not resolve type id '%s' into a subtype of %s", new Object[]{str, ClassUtil.getTypeDescription(javaType)}), str2));
    }

    public JsonMappingException weirdKeyException(Class<?> cls, String str, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize Map key of type %s from String %s: %s", new Object[]{ClassUtil.nameOf(cls), _quotedString(str), str2}), str, cls);
    }

    public JsonMappingException weirdNativeValueException(Object obj, Class<?> cls) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", new Object[]{ClassUtil.nameOf(cls), ClassUtil.classNameOf(obj)}), obj, cls);
    }

    public JsonMappingException weirdNumberException(Number number, Class<?> cls, String str) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from number %s: %s", new Object[]{ClassUtil.nameOf(cls), String.valueOf(number), str}), number, cls);
    }

    public JsonMappingException weirdStringException(String str, Class<?> cls, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from String %s: %s", new Object[]{ClassUtil.nameOf(cls), _quotedString(str), str2}), str, cls);
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, JavaType javaType, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, javaType, _colonConcat(String.format("Unexpected token (%s), expected %s", new Object[]{jsonParser.getCurrentToken(), jsonToken}), str));
    }

    protected DeserializationContext(DeserializerFactory deserializerFactory, DeserializerCache deserializerCache) {
        Objects.requireNonNull(deserializerFactory, "Cannot pass null DeserializerFactory");
        this._factory = deserializerFactory;
        if (deserializerCache == null) {
            deserializerCache = new DeserializerCache();
        }
        this._cache = deserializerCache;
        this._featureFlags = 0;
        this._config = null;
        this._injectableValues = null;
        this._view = null;
        this._attributes = null;
    }

    public DeserializationConfig getConfig() {
        return this._config;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonToken, jsonParser, str, objArr);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._featureFlags) != 0;
    }

    @Deprecated
    public JsonMappingException mappingException(String str, Object... objArr) {
        return JsonMappingException.from(getParser(), _format(str, objArr));
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, JavaType javaType) throws IOException {
        JsonDeserializer findContextualValueDeserializer = findContextualValueDeserializer(javaType, beanProperty);
        if (findContextualValueDeserializer != null) {
            return findContextualValueDeserializer.deserialize(jsonParser, this);
        }
        return reportBadDefinition(javaType, String.format("Could not find JsonDeserializer for type %s (via property %s)", new Object[]{ClassUtil.getTypeDescription(javaType), ClassUtil.nameOf((Named) beanProperty)}));
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        JsonDeserializer findRootValueDeserializer = findRootValueDeserializer(javaType);
        if (findRootValueDeserializer == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find JsonDeserializer for type ");
            sb.append(ClassUtil.getTypeDescription(javaType));
            reportBadDefinition(javaType, sb.toString());
        }
        return findRootValueDeserializer.deserialize(jsonParser, this);
    }

    public DeserializationContext setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(javaType, jsonParser.getCurrentToken(), jsonParser, (String) null, new Object[0]);
    }

    @Deprecated
    public JsonMappingException mappingException(Class<?> cls) {
        return mappingException(cls, this._parser.getCurrentToken());
    }

    public <T> T reportInputMismatch(Class<?> cls, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), cls, _format(str, objArr));
    }

    public void reportWrongTokenException(JavaType javaType, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), javaType, jsonToken, _format(str, objArr));
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        String _format = _format(str, objArr);
        for (LinkedNode problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object handleUnexpectedToken = ((DeserializationProblemHandler) problemHandlers.value()).handleUnexpectedToken(this, javaType, jsonToken, jsonParser, _format);
            if (handleUnexpectedToken != DeserializationProblemHandler.NOT_HANDLED) {
                if (_isCompatible(javaType.getRawClass(), handleUnexpectedToken)) {
                    return handleUnexpectedToken;
                }
                reportBadDefinition(javaType, String.format("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", new Object[]{ClassUtil.getClassDescription(javaType), ClassUtil.classNameOf(handleUnexpectedToken)}));
            }
        }
        if (_format == null) {
            if (jsonToken == null) {
                _format = String.format("Unexpected end-of-input when binding data into %s", new Object[]{ClassUtil.getTypeDescription(javaType)});
            } else {
                _format = String.format("Cannot deserialize instance of %s out of %s token", new Object[]{ClassUtil.getTypeDescription(javaType), jsonToken});
            }
        }
        if (jsonToken != null && jsonToken.isScalarValue()) {
            jsonParser.getText();
        }
        reportInputMismatch(javaType, _format, new Object[0]);
        return null;
    }

    @Deprecated
    public JsonMappingException mappingException(Class<?> cls, JsonToken jsonToken) {
        return JsonMappingException.from(this._parser, String.format("Cannot deserialize instance of %s out of %s token", new Object[]{ClassUtil.nameOf(cls), jsonToken}));
    }

    public <T> T reportInputMismatch(JavaType javaType, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), javaType, _format(str, objArr));
    }

    public <T> T reportPropertyInputMismatch(JavaType javaType, String str, String str2, Object... objArr) throws JsonMappingException {
        return reportPropertyInputMismatch(javaType.getRawClass(), str, str2, objArr);
    }

    public void reportWrongTokenException(Class<?> cls, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), cls, jsonToken, _format(str, objArr));
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, Class<?> cls, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, cls, _colonConcat(String.format("Unexpected token (%s), expected %s", new Object[]{jsonParser.getCurrentToken(), jsonToken}), str));
    }

    public JsonMappingException instantiationException(Class<?> cls, String str) {
        return ValueInstantiationException.from(this._parser, String.format("Cannot construct instance of %s: %s", new Object[]{ClassUtil.nameOf(cls), str}), constructType(cls));
    }

    public <T> T reportInputMismatch(BeanProperty beanProperty, String str, Object... objArr) throws JsonMappingException {
        JavaType javaType;
        String _format = _format(str, objArr);
        if (beanProperty == null) {
            javaType = null;
        } else {
            javaType = beanProperty.getType();
        }
        MismatchedInputException from = MismatchedInputException.from(getParser(), javaType, _format);
        if (beanProperty != null) {
            AnnotatedMember member = beanProperty.getMember();
            if (member != null) {
                from.prependPath((Object) member.getDeclaringClass(), beanProperty.getName());
            }
        }
        throw from;
    }

    @Deprecated
    public void reportWrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(jsonParser, jsonToken, _format(str, objArr));
    }

    @Deprecated
    public JsonMappingException wrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str) {
        return wrongTokenException(jsonParser, (JavaType) null, jsonToken, str);
    }

    protected DeserializationContext(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory) {
        this._cache = deserializationContext._cache;
        this._factory = deserializerFactory;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._view = deserializationContext._view;
        this._parser = deserializationContext._parser;
        this._injectableValues = deserializationContext._injectableValues;
        this._attributes = deserializationContext._attributes;
    }

    protected DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = deserializationConfig.getActiveView();
        this._parser = jsonParser;
        this._injectableValues = injectableValues;
        this._attributes = deserializationConfig.getAttributes();
    }

    protected DeserializationContext(DeserializationContext deserializationContext) {
        this._cache = new DeserializerCache();
        this._factory = deserializationContext._factory;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._view = deserializationContext._view;
        this._injectableValues = null;
    }
}
