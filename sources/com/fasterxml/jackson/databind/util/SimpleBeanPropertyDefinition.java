package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collections;
import java.util.Iterator;

public class SimpleBeanPropertyDefinition extends BeanPropertyDefinition {
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final PropertyName _fullName;
    protected final Value _inclusion;
    protected final AnnotatedMember _member;
    protected final PropertyMetadata _metadata;

    protected SimpleBeanPropertyDefinition(AnnotationIntrospector annotationIntrospector, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, Value value) {
        this._annotationIntrospector = annotationIntrospector;
        this._member = annotatedMember;
        this._fullName = propertyName;
        if (propertyMetadata == null) {
            propertyMetadata = PropertyMetadata.STD_OPTIONAL;
        }
        this._metadata = propertyMetadata;
        this._inclusion = value;
    }

    public static SimpleBeanPropertyDefinition construct(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember) {
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = new SimpleBeanPropertyDefinition(mapperConfig.getAnnotationIntrospector(), annotatedMember, PropertyName.construct(annotatedMember.getName()), null, BeanPropertyDefinition.EMPTY_INCLUDE);
        return simpleBeanPropertyDefinition;
    }

    public Value findInclusion() {
        return this._inclusion;
    }

    public AnnotatedParameter getConstructorParameter() {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember instanceof AnnotatedParameter) {
            return (AnnotatedParameter) annotatedMember;
        }
        return null;
    }

    public Iterator<AnnotatedParameter> getConstructorParameters() {
        AnnotatedParameter constructorParameter = getConstructorParameter();
        if (constructorParameter == null) {
            return ClassUtil.emptyIterator();
        }
        return Collections.singleton(constructorParameter).iterator();
    }

    public AnnotatedField getField() {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember instanceof AnnotatedField) {
            return (AnnotatedField) annotatedMember;
        }
        return null;
    }

    public PropertyName getFullName() {
        return this._fullName;
    }

    public AnnotatedMethod getGetter() {
        AnnotatedMember annotatedMember = this._member;
        if (!(annotatedMember instanceof AnnotatedMethod) || ((AnnotatedMethod) annotatedMember).getParameterCount() != 0) {
            return null;
        }
        return (AnnotatedMethod) this._member;
    }

    public String getInternalName() {
        return getName();
    }

    public PropertyMetadata getMetadata() {
        return this._metadata;
    }

    public String getName() {
        return this._fullName.getSimpleName();
    }

    public AnnotatedMember getPrimaryMember() {
        return this._member;
    }

    public JavaType getPrimaryType() {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember == null) {
            return TypeFactory.unknownType();
        }
        return annotatedMember.getType();
    }

    public Class<?> getRawPrimaryType() {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember == null) {
            return Object.class;
        }
        return annotatedMember.getRawType();
    }

    public AnnotatedMethod getSetter() {
        AnnotatedMember annotatedMember = this._member;
        if (!(annotatedMember instanceof AnnotatedMethod) || ((AnnotatedMethod) annotatedMember).getParameterCount() != 1) {
            return null;
        }
        return (AnnotatedMethod) this._member;
    }

    public PropertyName getWrapperName() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector != null) {
            AnnotatedMember annotatedMember = this._member;
            if (annotatedMember != null) {
                return annotationIntrospector.findWrapperName(annotatedMember);
            }
        }
        return null;
    }

    public boolean hasConstructorParameter() {
        return this._member instanceof AnnotatedParameter;
    }

    public boolean hasField() {
        return this._member instanceof AnnotatedField;
    }

    public boolean hasGetter() {
        return getGetter() != null;
    }

    public boolean hasName(PropertyName propertyName) {
        return this._fullName.equals(propertyName);
    }

    public boolean hasSetter() {
        return getSetter() != null;
    }

    public boolean isExplicitlyIncluded() {
        return false;
    }

    public boolean isExplicitlyNamed() {
        return false;
    }

    public BeanPropertyDefinition withInclusion(Value value) {
        if (this._inclusion == value) {
            return this;
        }
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = new SimpleBeanPropertyDefinition(this._annotationIntrospector, this._member, this._fullName, this._metadata, value);
        return simpleBeanPropertyDefinition;
    }

    public BeanPropertyDefinition withMetadata(PropertyMetadata propertyMetadata) {
        if (propertyMetadata.equals(this._metadata)) {
            return this;
        }
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = new SimpleBeanPropertyDefinition(this._annotationIntrospector, this._member, this._fullName, propertyMetadata, this._inclusion);
        return simpleBeanPropertyDefinition;
    }

    public BeanPropertyDefinition withName(PropertyName propertyName) {
        if (this._fullName.equals(propertyName)) {
            return this;
        }
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = new SimpleBeanPropertyDefinition(this._annotationIntrospector, this._member, propertyName, this._metadata, this._inclusion);
        return simpleBeanPropertyDefinition;
    }

    public BeanPropertyDefinition withSimpleName(String str) {
        if (this._fullName.hasSimpleName(str) && !this._fullName.hasNamespace()) {
            return this;
        }
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = new SimpleBeanPropertyDefinition(this._annotationIntrospector, this._member, new PropertyName(str), this._metadata, this._inclusion);
        return simpleBeanPropertyDefinition;
    }

    public static SimpleBeanPropertyDefinition construct(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName) {
        return construct(mapperConfig, annotatedMember, propertyName, (PropertyMetadata) null, BeanPropertyDefinition.EMPTY_INCLUDE);
    }

    public static SimpleBeanPropertyDefinition construct(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, Include include) {
        Value value;
        if (include == null || include == Include.USE_DEFAULTS) {
            value = BeanPropertyDefinition.EMPTY_INCLUDE;
        } else {
            value = Value.construct(include, null);
        }
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = new SimpleBeanPropertyDefinition(mapperConfig.getAnnotationIntrospector(), annotatedMember, propertyName, propertyMetadata, value);
        return simpleBeanPropertyDefinition;
    }

    public static SimpleBeanPropertyDefinition construct(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, Value value) {
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = new SimpleBeanPropertyDefinition(mapperConfig.getAnnotationIntrospector(), annotatedMember, propertyName, propertyMetadata, value);
        return simpleBeanPropertyDefinition;
    }
}
