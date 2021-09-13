package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public abstract class SettableBeanProperty extends ConcreteBeanPropertyBase implements Serializable {
    protected static final JsonDeserializer<Object> MISSING_VALUE_DESERIALIZER = new FailingDeserializer("No _valueDeserializer assigned");
    protected final transient Annotations _contextAnnotations;
    protected String _managedReferenceName;
    protected final NullValueProvider _nullProvider;
    protected ObjectIdInfo _objectIdInfo;
    protected final PropertyName _propName;
    protected int _propertyIndex;
    protected final JavaType _type;
    protected final JsonDeserializer<Object> _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;
    protected ViewMatcher _viewMatcher;
    protected final PropertyName _wrapperName;

    public static abstract class Delegating extends SettableBeanProperty {
        protected final SettableBeanProperty delegate;

        protected Delegating(SettableBeanProperty settableBeanProperty) {
            super(settableBeanProperty);
            this.delegate = settableBeanProperty;
        }

        /* access modifiers changed from: protected */
        public SettableBeanProperty _with(SettableBeanProperty settableBeanProperty) {
            if (settableBeanProperty == this.delegate) {
                return this;
            }
            return withDelegate(settableBeanProperty);
        }

        public void assignIndex(int i) {
            this.delegate.assignIndex(i);
        }

        public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            this.delegate.deserializeAndSet(jsonParser, deserializationContext, obj);
        }

        public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            return this.delegate.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
        }

        public void fixAccess(DeserializationConfig deserializationConfig) {
            this.delegate.fixAccess(deserializationConfig);
        }

        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return this.delegate.getAnnotation(cls);
        }

        public int getCreatorIndex() {
            return this.delegate.getCreatorIndex();
        }

        /* access modifiers changed from: protected */
        public Class<?> getDeclaringClass() {
            return this.delegate.getDeclaringClass();
        }

        public SettableBeanProperty getDelegate() {
            return this.delegate;
        }

        public Object getInjectableValueId() {
            return this.delegate.getInjectableValueId();
        }

        public String getManagedReferenceName() {
            return this.delegate.getManagedReferenceName();
        }

        public AnnotatedMember getMember() {
            return this.delegate.getMember();
        }

        public ObjectIdInfo getObjectIdInfo() {
            return this.delegate.getObjectIdInfo();
        }

        public int getPropertyIndex() {
            return this.delegate.getPropertyIndex();
        }

        public JsonDeserializer<Object> getValueDeserializer() {
            return this.delegate.getValueDeserializer();
        }

        public TypeDeserializer getValueTypeDeserializer() {
            return this.delegate.getValueTypeDeserializer();
        }

        public boolean hasValueDeserializer() {
            return this.delegate.hasValueDeserializer();
        }

        public boolean hasValueTypeDeserializer() {
            return this.delegate.hasValueTypeDeserializer();
        }

        public boolean hasViews() {
            return this.delegate.hasViews();
        }

        public boolean isInjectionOnly() {
            return this.delegate.isInjectionOnly();
        }

        public void set(Object obj, Object obj2) throws IOException {
            this.delegate.set(obj, obj2);
        }

        public Object setAndReturn(Object obj, Object obj2) throws IOException {
            return this.delegate.setAndReturn(obj, obj2);
        }

        public boolean visibleInView(Class<?> cls) {
            return this.delegate.visibleInView(cls);
        }

        /* access modifiers changed from: protected */
        public abstract SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty);

        public SettableBeanProperty withName(PropertyName propertyName) {
            return _with(this.delegate.withName(propertyName));
        }

        public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
            return _with(this.delegate.withNullProvider(nullValueProvider));
        }

        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
            return _with(this.delegate.withValueDeserializer(jsonDeserializer));
        }
    }

    protected SettableBeanProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations) {
        this(beanPropertyDefinition.getFullName(), javaType, beanPropertyDefinition.getWrapperName(), typeDeserializer, annotations, beanPropertyDefinition.getMetadata());
    }

    /* access modifiers changed from: protected */
    public void _throwAsIOE(JsonParser jsonParser, Exception exc, Object obj) throws IOException {
        if (exc instanceof IllegalArgumentException) {
            String classNameOf = ClassUtil.classNameOf(obj);
            StringBuilder sb = new StringBuilder("Problem deserializing property '");
            sb.append(getName());
            sb.append("' (expected type: ");
            sb.append(getType());
            sb.append("; actual type: ");
            sb.append(classNameOf);
            sb.append(")");
            String exceptionMessage = ClassUtil.exceptionMessage(exc);
            if (exceptionMessage != null) {
                sb.append(", problem: ");
                sb.append(exceptionMessage);
            } else {
                sb.append(" (no error message provided)");
            }
            throw JsonMappingException.from(jsonParser, sb.toString(), (Throwable) exc);
        }
        _throwAsIOE(jsonParser, exc);
    }

    public void assignIndex(int i) {
        if (this._propertyIndex == -1) {
            this._propertyIndex = i;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Property '");
        sb.append(getName());
        sb.append("' already had index (");
        sb.append(this._propertyIndex);
        sb.append("), trying to assign ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
        if (isRequired()) {
            jsonObjectFormatVisitor.property(this);
        } else {
            jsonObjectFormatVisitor.optionalProperty(this);
        }
    }

    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            return this._nullProvider.getNullValue(deserializationContext);
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            return this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
        }
        Object deserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
        if (deserialize == null) {
            deserialize = this._nullProvider.getNullValue(deserializationContext);
        }
        return deserialize;
    }

    public abstract void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    public abstract Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    public final Object deserializeWith(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (!jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            if (this._valueTypeDeserializer != null) {
                deserializationContext.reportBadDefinition(getType(), String.format("Cannot merge polymorphic property '%s'", new Object[]{getName()}));
            }
            Object deserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext, obj);
            if (deserialize == null) {
                if (NullsConstantProvider.isSkipper(this._nullProvider)) {
                    return obj;
                }
                deserialize = this._nullProvider.getNullValue(deserializationContext);
            }
            return deserialize;
        } else if (NullsConstantProvider.isSkipper(this._nullProvider)) {
            return obj;
        } else {
            return this._nullProvider.getNullValue(deserializationContext);
        }
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
    }

    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return this._contextAnnotations.get(cls);
    }

    public int getCreatorIndex() {
        throw new IllegalStateException(String.format("Internal error: no creator index for property '%s' (of type %s)", new Object[]{getName(), getClass().getName()}));
    }

    /* access modifiers changed from: protected */
    public Class<?> getDeclaringClass() {
        return getMember().getDeclaringClass();
    }

    public PropertyName getFullName() {
        return this._propName;
    }

    public Object getInjectableValueId() {
        return null;
    }

    public String getManagedReferenceName() {
        return this._managedReferenceName;
    }

    public abstract AnnotatedMember getMember();

    public final String getName() {
        return this._propName.getSimpleName();
    }

    public NullValueProvider getNullValueProvider() {
        return this._nullProvider;
    }

    public ObjectIdInfo getObjectIdInfo() {
        return this._objectIdInfo;
    }

    public int getPropertyIndex() {
        return this._propertyIndex;
    }

    public JavaType getType() {
        return this._type;
    }

    public JsonDeserializer<Object> getValueDeserializer() {
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer == MISSING_VALUE_DESERIALIZER) {
            return null;
        }
        return jsonDeserializer;
    }

    public TypeDeserializer getValueTypeDeserializer() {
        return this._valueTypeDeserializer;
    }

    public PropertyName getWrapperName() {
        return this._wrapperName;
    }

    public boolean hasValueDeserializer() {
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        return (jsonDeserializer == null || jsonDeserializer == MISSING_VALUE_DESERIALIZER) ? false : true;
    }

    public boolean hasValueTypeDeserializer() {
        return this._valueTypeDeserializer != null;
    }

    public boolean hasViews() {
        return this._viewMatcher != null;
    }

    public boolean isIgnorable() {
        return false;
    }

    public boolean isInjectionOnly() {
        return false;
    }

    public void markAsIgnorable() {
    }

    public abstract void set(Object obj, Object obj2) throws IOException;

    public abstract Object setAndReturn(Object obj, Object obj2) throws IOException;

    public void setManagedReferenceName(String str) {
        this._managedReferenceName = str;
    }

    public void setObjectIdInfo(ObjectIdInfo objectIdInfo) {
        this._objectIdInfo = objectIdInfo;
    }

    public void setViews(Class<?>[] clsArr) {
        if (clsArr == null) {
            this._viewMatcher = null;
        } else {
            this._viewMatcher = ViewMatcher.construct(clsArr);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[property '");
        sb.append(getName());
        sb.append("']");
        return sb.toString();
    }

    public boolean visibleInView(Class<?> cls) {
        ViewMatcher viewMatcher = this._viewMatcher;
        return viewMatcher == null || viewMatcher.isVisibleForView(cls);
    }

    public abstract SettableBeanProperty withName(PropertyName propertyName);

    public abstract SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider);

    public SettableBeanProperty withSimpleName(String str) {
        PropertyName propertyName;
        PropertyName propertyName2 = this._propName;
        if (propertyName2 == null) {
            propertyName = new PropertyName(str);
        } else {
            propertyName = propertyName2.withSimpleName(str);
        }
        return propertyName == this._propName ? this : withName(propertyName);
    }

    public abstract SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer);

    protected SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, TypeDeserializer typeDeserializer, Annotations annotations, PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
        this._propertyIndex = -1;
        if (propertyName == null) {
            this._propName = PropertyName.NO_NAME;
        } else {
            this._propName = propertyName.internSimpleName();
        }
        this._type = javaType;
        this._wrapperName = propertyName2;
        this._contextAnnotations = annotations;
        this._viewMatcher = null;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(this);
        }
        this._valueTypeDeserializer = typeDeserializer;
        JsonDeserializer<Object> jsonDeserializer = MISSING_VALUE_DESERIALIZER;
        this._valueDeserializer = jsonDeserializer;
        this._nullProvider = jsonDeserializer;
    }

    /* access modifiers changed from: protected */
    public IOException _throwAsIOE(JsonParser jsonParser, Exception exc) throws IOException {
        ClassUtil.throwIfIOE(exc);
        ClassUtil.throwIfRTE(exc);
        Throwable rootCause = ClassUtil.getRootCause(exc);
        throw JsonMappingException.from(jsonParser, ClassUtil.exceptionMessage(rootCause), rootCause);
    }

    protected SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyMetadata propertyMetadata, JsonDeserializer<Object> jsonDeserializer) {
        super(propertyMetadata);
        this._propertyIndex = -1;
        if (propertyName == null) {
            this._propName = PropertyName.NO_NAME;
        } else {
            this._propName = propertyName.internSimpleName();
        }
        this._type = javaType;
        this._wrapperName = null;
        this._contextAnnotations = null;
        this._viewMatcher = null;
        this._valueTypeDeserializer = null;
        this._valueDeserializer = jsonDeserializer;
        this._nullProvider = jsonDeserializer;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public IOException _throwAsIOE(Exception exc) throws IOException {
        return _throwAsIOE((JsonParser) null, exc);
    }

    /* access modifiers changed from: protected */
    public void _throwAsIOE(Exception exc, Object obj) throws IOException {
        _throwAsIOE(null, exc, obj);
    }

    protected SettableBeanProperty(SettableBeanProperty settableBeanProperty) {
        super((ConcreteBeanPropertyBase) settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = settableBeanProperty._propName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueDeserializer = settableBeanProperty._valueDeserializer;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = settableBeanProperty._nullProvider;
    }

    protected SettableBeanProperty(SettableBeanProperty settableBeanProperty, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super((ConcreteBeanPropertyBase) settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = settableBeanProperty._propName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        if (jsonDeserializer == null) {
            this._valueDeserializer = MISSING_VALUE_DESERIALIZER;
        } else {
            this._valueDeserializer = jsonDeserializer;
        }
        this._viewMatcher = settableBeanProperty._viewMatcher;
        if (nullValueProvider == MISSING_VALUE_DESERIALIZER) {
            nullValueProvider = this._valueDeserializer;
        }
        this._nullProvider = nullValueProvider;
    }

    protected SettableBeanProperty(SettableBeanProperty settableBeanProperty, PropertyName propertyName) {
        super((ConcreteBeanPropertyBase) settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = propertyName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueDeserializer = settableBeanProperty._valueDeserializer;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = settableBeanProperty._nullProvider;
    }
}
