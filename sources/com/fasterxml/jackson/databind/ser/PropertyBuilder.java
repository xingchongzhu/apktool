package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.BeanUtil;

public class PropertyBuilder {
    private static final Object NO_DEFAULT_MARKER = Boolean.FALSE;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final BeanDescription _beanDesc;
    protected final SerializationConfig _config;
    protected Object _defaultBean;
    protected final Value _defaultInclusion;
    protected final boolean _useRealPropertyDefaults;

    /* renamed from: com.fasterxml.jackson.databind.ser.PropertyBuilder$1 */
    static /* synthetic */ class C18051 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonInclude$Include[] r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = r0
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.PropertyBuilder.C18051.<clinit>():void");
        }
    }

    public PropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        this._config = serializationConfig;
        this._beanDesc = beanDescription;
        Value merge = Value.merge(beanDescription.findPropertyInclusion(Value.empty()), serializationConfig.getDefaultPropertyInclusion(beanDescription.getBeanClass(), Value.empty()));
        this._defaultInclusion = Value.merge(serializationConfig.getDefaultPropertyInclusion(), merge);
        this._useRealPropertyDefaults = merge.getValueInclusion() == Include.NON_DEFAULT;
        this._annotationIntrospector = serializationConfig.getAnnotationIntrospector();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Exception, code=java.lang.Throwable, for r3v0, types: [java.lang.Throwable, java.lang.Exception] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object _throwWrapped(java.lang.Throwable r3, java.lang.String r4, java.lang.Object r5) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.Throwable r0 = r3.getCause()
            if (r0 == 0) goto L_0x000b
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x0000
        L_0x000b:
            com.fasterxml.jackson.databind.util.ClassUtil.throwIfError(r3)
            com.fasterxml.jackson.databind.util.ClassUtil.throwIfRTE(r3)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to get property '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "' of default "
            r0.append(r4)
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = " instance"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            goto L_0x003e
        L_0x003d:
            throw r3
        L_0x003e:
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped(java.lang.Exception, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.ser.BeanPropertyWriter buildWriter(com.fasterxml.jackson.databind.SerializerProvider r16, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r17, com.fasterxml.jackson.databind.JavaType r18, com.fasterxml.jackson.databind.JsonSerializer<?> r19, com.fasterxml.jackson.databind.jsontype.TypeSerializer r20, com.fasterxml.jackson.databind.jsontype.TypeSerializer r21, com.fasterxml.jackson.databind.introspect.AnnotatedMember r22, boolean r23) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r15 = this;
            r1 = r15
            r2 = r16
            r4 = r17
            r7 = r18
            r0 = r21
            r14 = r22
            r3 = 0
            r5 = r23
            com.fasterxml.jackson.databind.JavaType r5 = r15.findSerializationType(r14, r5, r7)     // Catch:{ JsonMappingException -> 0x0153 }
            if (r0 == 0) goto L_0x0043
            if (r5 != 0) goto L_0x0017
            r5 = r7
        L_0x0017:
            com.fasterxml.jackson.databind.JavaType r6 = r5.getContentType()
            if (r6 != 0) goto L_0x003a
            com.fasterxml.jackson.databind.BeanDescription r6 = r1._beanDesc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "serialization type "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r9 = " has no content"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r2.reportBadPropertyDefinition(r6, r4, r8, r9)
        L_0x003a:
            com.fasterxml.jackson.databind.JavaType r0 = r5.withContentTypeHandler(r0)
            r0.getContentType()
            r10 = r0
            goto L_0x0044
        L_0x0043:
            r10 = r5
        L_0x0044:
            r5 = 0
            if (r10 != 0) goto L_0x0049
            r0 = r7
            goto L_0x004a
        L_0x0049:
            r0 = r10
        L_0x004a:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r6 = r17.getAccessor()
            if (r6 != 0) goto L_0x005d
            com.fasterxml.jackson.databind.BeanDescription r0 = r1._beanDesc
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = "could not determine property type"
            java.lang.Object r0 = r2.reportBadPropertyDefinition(r0, r4, r5, r3)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r0
            return r0
        L_0x005d:
            java.lang.Class r6 = r6.getRawType()
            com.fasterxml.jackson.databind.SerializationConfig r8 = r1._config
            java.lang.Class r9 = r0.getRawClass()
            com.fasterxml.jackson.annotation.JsonInclude$Value r11 = r1._defaultInclusion
            com.fasterxml.jackson.annotation.JsonInclude$Value r6 = r8.getDefaultInclusion(r9, r6, r11)
            com.fasterxml.jackson.annotation.JsonInclude$Value r8 = r17.findInclusion()
            com.fasterxml.jackson.annotation.JsonInclude$Value r6 = r6.withOverrides(r8)
            com.fasterxml.jackson.annotation.JsonInclude$Include r8 = r6.getValueInclusion()
            com.fasterxml.jackson.annotation.JsonInclude$Include r9 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            if (r8 != r9) goto L_0x007f
            com.fasterxml.jackson.annotation.JsonInclude$Include r8 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS
        L_0x007f:
            int[] r9 = com.fasterxml.jackson.databind.ser.PropertyBuilder.C18051.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include
            int r8 = r8.ordinal()
            r8 = r9[r8]
            r9 = 1
            if (r8 == r9) goto L_0x00d1
            r11 = 2
            if (r8 == r11) goto L_0x00c5
            r11 = 3
            if (r8 == r11) goto L_0x00c1
            r11 = 4
            if (r8 == r11) goto L_0x00af
            r6 = 5
            if (r8 == r6) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r3 = 1
        L_0x0098:
            boolean r0 = r0.isContainerType()
            if (r0 == 0) goto L_0x00ab
            com.fasterxml.jackson.databind.SerializationConfig r0 = r1._config
            com.fasterxml.jackson.databind.SerializationFeature r6 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS
            boolean r0 = r0.isEnabled(r6)
            if (r0 != 0) goto L_0x00ab
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY
            goto L_0x00be
        L_0x00ab:
            r11 = r3
            r12 = r5
            goto L_0x0114
        L_0x00af:
            java.lang.Class r0 = r6.getValueFilter()
            java.lang.Object r0 = r2.includeFilterInstance(r4, r0)
            if (r0 != 0) goto L_0x00ba
            goto L_0x00c3
        L_0x00ba:
            boolean r3 = r2.includeFilterSuppressNulls(r0)
        L_0x00be:
            r12 = r0
            r11 = r3
            goto L_0x0114
        L_0x00c1:
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY
        L_0x00c3:
            r12 = r0
            goto L_0x00cf
        L_0x00c5:
            boolean r0 = r0.isReferenceType()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY
            goto L_0x00c3
        L_0x00ce:
            r12 = r5
        L_0x00cf:
            r11 = 1
            goto L_0x0114
        L_0x00d1:
            boolean r6 = r1._useRealPropertyDefaults
            if (r6 == 0) goto L_0x00fd
            java.lang.Object r6 = r15.getDefaultBean()
            if (r6 == 0) goto L_0x00fd
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS
            boolean r0 = r2.isEnabled(r0)
            if (r0 == 0) goto L_0x00ee
            com.fasterxml.jackson.databind.SerializationConfig r0 = r1._config
            com.fasterxml.jackson.databind.MapperFeature r8 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r0 = r0.isEnabled(r8)
            r14.fixAccess(r0)
        L_0x00ee:
            java.lang.Object r5 = r14.getValue(r6)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x0102
        L_0x00f3:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = r17.getName()
            r15._throwWrapped(r8, r0, r6)
            goto L_0x0102
        L_0x00fd:
            java.lang.Object r5 = com.fasterxml.jackson.databind.util.BeanUtil.getDefaultValue(r0)
            r3 = 1
        L_0x0102:
            if (r5 != 0) goto L_0x0105
            goto L_0x00ce
        L_0x0105:
            java.lang.Class r0 = r5.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = com.fasterxml.jackson.databind.util.ArrayBuilders.getArrayComparator(r5)
            goto L_0x00be
        L_0x0114:
            java.lang.Class[] r0 = r17.findViews()
            if (r0 != 0) goto L_0x0120
            com.fasterxml.jackson.databind.BeanDescription r0 = r1._beanDesc
            java.lang.Class[] r0 = r0.findDefaultViews()
        L_0x0120:
            r13 = r0
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter
            com.fasterxml.jackson.databind.BeanDescription r3 = r1._beanDesc
            com.fasterxml.jackson.databind.util.Annotations r6 = r3.getClassAnnotations()
            r3 = r0
            r4 = r17
            r5 = r22
            r7 = r18
            r8 = r19
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r1._annotationIntrospector
            java.lang.Object r3 = r3.findNullSerializer(r14)
            if (r3 == 0) goto L_0x0146
            com.fasterxml.jackson.databind.JsonSerializer r2 = r2.serializerInstance(r14, r3)
            r0.assignNullSerializer(r2)
        L_0x0146:
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r1._annotationIntrospector
            com.fasterxml.jackson.databind.util.NameTransformer r2 = r2.findUnwrappingNameTransformer(r14)
            if (r2 == 0) goto L_0x0152
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = r0.unwrappingWriter(r2)
        L_0x0152:
            return r0
        L_0x0153:
            r0 = move-exception
            r5 = r0
            if (r4 != 0) goto L_0x0162
            java.lang.String r0 = com.fasterxml.jackson.databind.util.ClassUtil.exceptionMessage(r5)
            java.lang.Object r0 = r2.reportBadDefinition(r7, r0)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r0
            return r0
        L_0x0162:
            com.fasterxml.jackson.databind.BeanDescription r0 = r1._beanDesc
            java.lang.String r5 = com.fasterxml.jackson.databind.util.ClassUtil.exceptionMessage(r5)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object r0 = r2.reportBadPropertyDefinition(r0, r4, r5, r3)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.introspect.AnnotatedMember, boolean):com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
    }

    /* access modifiers changed from: protected */
    public JavaType findSerializationType(Annotated annotated, boolean z, JavaType javaType) throws JsonMappingException {
        JavaType refineSerializationType = this._annotationIntrospector.refineSerializationType(this._config, annotated, javaType);
        boolean z2 = true;
        if (refineSerializationType != javaType) {
            Class rawClass = refineSerializationType.getRawClass();
            Class rawClass2 = javaType.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Illegal concrete-type annotation for method '");
                sb.append(annotated.getName());
                sb.append("': class ");
                sb.append(rawClass.getName());
                sb.append(" not a super-type of (declared) class ");
                sb.append(rawClass2.getName());
                throw new IllegalArgumentException(sb.toString());
            }
            javaType = refineSerializationType;
            z = true;
        }
        Typing findSerializationTyping = this._annotationIntrospector.findSerializationTyping(annotated);
        if (!(findSerializationTyping == null || findSerializationTyping == Typing.DEFAULT_TYPING)) {
            if (findSerializationTyping != Typing.STATIC) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            return javaType.withStaticTyping();
        }
        return null;
    }

    public Annotations getClassAnnotations() {
        return this._beanDesc.getClassAnnotations();
    }

    /* access modifiers changed from: protected */
    public Object getDefaultBean() {
        Object obj = this._defaultBean;
        if (obj == null) {
            obj = this._beanDesc.instantiateBean(this._config.canOverrideAccessModifiers());
            if (obj == null) {
                obj = NO_DEFAULT_MARKER;
            }
            this._defaultBean = obj;
        }
        if (obj == NO_DEFAULT_MARKER) {
            return null;
        }
        return this._defaultBean;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public Object getDefaultValue(JavaType javaType) {
        return BeanUtil.getDefaultValue(javaType);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public Object getPropertyDefaultValue(String str, AnnotatedMember annotatedMember, JavaType javaType) {
        Object defaultBean = getDefaultBean();
        if (defaultBean == null) {
            return getDefaultValue(javaType);
        }
        try {
            return annotatedMember.getValue(defaultBean);
        } catch (Exception e) {
            return _throwWrapped(e, str, defaultBean);
        }
    }
}
