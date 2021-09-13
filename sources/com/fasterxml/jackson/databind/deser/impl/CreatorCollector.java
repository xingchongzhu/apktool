package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Member;
import java.util.HashMap;

public class CreatorCollector {
    protected static final int C_ARRAY_DELEGATE = 8;
    protected static final int C_BOOLEAN = 5;
    protected static final int C_DEFAULT = 0;
    protected static final int C_DELEGATE = 6;
    protected static final int C_DOUBLE = 4;
    protected static final int C_INT = 2;
    protected static final int C_LONG = 3;
    protected static final int C_PROPS = 7;
    protected static final int C_STRING = 1;
    protected static final String[] TYPE_DESCS = {"default", "from-String", "from-int", "from-long", "from-double", "from-boolean", "delegate", "property-based"};
    protected SettableBeanProperty[] _arrayDelegateArgs;
    protected final BeanDescription _beanDesc;
    protected final boolean _canFixAccess;
    protected final AnnotatedWithParams[] _creators = new AnnotatedWithParams[9];
    protected SettableBeanProperty[] _delegateArgs;
    protected int _explicitCreators = 0;
    protected final boolean _forceAccess;
    protected boolean _hasNonDefaultCreator = false;
    protected SettableBeanProperty[] _propertyBasedArgs;

    public CreatorCollector(BeanDescription beanDescription, MapperConfig<?> mapperConfig) {
        this._beanDesc = beanDescription;
        this._canFixAccess = mapperConfig.canOverrideAccessModifiers();
        this._forceAccess = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    private JavaType _computeDelegateType(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
        if (!this._hasNonDefaultCreator || annotatedWithParams == null) {
            return null;
        }
        int i = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (settableBeanPropertyArr[i2] == null) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType parameterType = annotatedWithParams.getParameterType(i);
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            AnnotatedParameter parameter = annotatedWithParams.getParameter(i);
            Object findDeserializer = annotationIntrospector.findDeserializer(parameter);
            if (findDeserializer != null) {
                parameterType = parameterType.withValueHandler(deserializationContext.deserializerInstance(parameter, findDeserializer));
            } else {
                parameterType = annotationIntrospector.refineDeserializationType(config, parameter, parameterType);
            }
        }
        return parameterType;
    }

    private <T extends AnnotatedMember> T _fixAccess(T t) {
        if (t != null && this._canFixAccess) {
            ClassUtil.checkAndFixAccess((Member) t.getAnnotated(), this._forceAccess);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    public boolean _isEnumValueOf(AnnotatedWithParams annotatedWithParams) {
        if (ClassUtil.isEnumType(annotatedWithParams.getDeclaringClass())) {
            if ("valueOf".equals(annotatedWithParams.getName())) {
                return true;
            }
        }
        return false;
    }

    public void addBooleanCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 5, z);
    }

    public void addDelegatingCreator(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr, int i) {
        if (annotatedWithParams.getParameterType(i).isCollectionLikeType()) {
            if (verifyNonDup(annotatedWithParams, 8, z)) {
                this._arrayDelegateArgs = settableBeanPropertyArr;
            }
        } else if (verifyNonDup(annotatedWithParams, 6, z)) {
            this._delegateArgs = settableBeanPropertyArr;
        }
    }

    public void addDoubleCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 4, z);
    }

    public void addIntCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 2, z);
    }

    public void addLongCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 3, z);
    }

    public void addPropertyCreator(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr) {
        if (verifyNonDup(annotatedWithParams, 7, z)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap hashMap = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i = 0; i < length; i++) {
                    String name = settableBeanPropertyArr[i].getName();
                    if (!name.isEmpty() || settableBeanPropertyArr[i].getInjectableValueId() == null) {
                        Integer num = (Integer) hashMap.put(name, Integer.valueOf(i));
                        if (num != null) {
                            throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", new Object[]{name, num, Integer.valueOf(i), ClassUtil.nameOf(this._beanDesc.getBeanClass())}));
                        }
                    }
                }
            }
            this._propertyBasedArgs = settableBeanPropertyArr;
        }
    }

    public void addStringCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 1, z);
    }

    public ValueInstantiator constructValueInstantiator(DeserializationContext deserializationContext) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType _computeDelegateType = _computeDelegateType(deserializationContext, this._creators[6], this._delegateArgs);
        JavaType _computeDelegateType2 = _computeDelegateType(deserializationContext, this._creators[8], this._arrayDelegateArgs);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(config, this._beanDesc.getType());
        AnnotatedWithParams[] annotatedWithParamsArr = this._creators;
        stdValueInstantiator.configureFromObjectSettings(annotatedWithParamsArr[0], annotatedWithParamsArr[6], _computeDelegateType, this._delegateArgs, annotatedWithParamsArr[7], this._propertyBasedArgs);
        stdValueInstantiator.configureFromArraySettings(this._creators[8], _computeDelegateType2, this._arrayDelegateArgs);
        stdValueInstantiator.configureFromStringCreator(this._creators[1]);
        stdValueInstantiator.configureFromIntCreator(this._creators[2]);
        stdValueInstantiator.configureFromLongCreator(this._creators[3]);
        stdValueInstantiator.configureFromDoubleCreator(this._creators[4]);
        stdValueInstantiator.configureFromBooleanCreator(this._creators[5]);
        return stdValueInstantiator;
    }

    public boolean hasDefaultCreator() {
        return this._creators[0] != null;
    }

    public boolean hasDelegatingCreator() {
        return this._creators[6] != null;
    }

    public boolean hasPropertyBasedCreator() {
        return this._creators[7] != null;
    }

    public void setDefaultCreator(AnnotatedWithParams annotatedWithParams) {
        this._creators[0] = (AnnotatedWithParams) _fixAccess(annotatedWithParams);
    }

    /* access modifiers changed from: protected */
    public boolean verifyNonDup(AnnotatedWithParams annotatedWithParams, int i, boolean z) {
        boolean z2;
        int i2 = 1 << i;
        this._hasNonDefaultCreator = true;
        AnnotatedWithParams annotatedWithParams2 = this._creators[i];
        if (annotatedWithParams2 != null) {
            if ((this._explicitCreators & i2) == 0) {
                z2 = !z;
            } else if (!z) {
                return false;
            } else {
                z2 = true;
            }
            if (z2 && annotatedWithParams2.getClass() == annotatedWithParams.getClass()) {
                Class rawParameterType = annotatedWithParams2.getRawParameterType(0);
                Class rawParameterType2 = annotatedWithParams.getRawParameterType(0);
                if (rawParameterType == rawParameterType2) {
                    if (_isEnumValueOf(annotatedWithParams)) {
                        return false;
                    }
                    if (!_isEnumValueOf(annotatedWithParams2)) {
                        Object[] objArr = new Object[4];
                        objArr[0] = TYPE_DESCS[i];
                        objArr[1] = z ? "explicitly marked" : "implicitly discovered";
                        objArr[2] = annotatedWithParams2;
                        objArr[3] = annotatedWithParams;
                        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", objArr));
                    }
                } else if (rawParameterType2.isAssignableFrom(rawParameterType)) {
                    return false;
                }
            }
        }
        if (z) {
            this._explicitCreators |= i2;
        }
        this._creators[i] = (AnnotatedWithParams) _fixAccess(annotatedWithParams);
        return true;
    }
}
