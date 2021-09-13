package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public abstract class ConcreteBeanPropertyBase implements BeanProperty, Serializable {
    private static final long serialVersionUID = 1;
    protected transient List<PropertyName> _aliases;
    protected final PropertyMetadata _metadata;

    protected ConcreteBeanPropertyBase(PropertyMetadata propertyMetadata) {
        if (propertyMetadata == null) {
            propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        }
        this._metadata = propertyMetadata;
    }

    public List<PropertyName> findAliases(MapperConfig<?> mapperConfig) {
        List<PropertyName> list = this._aliases;
        if (list == null) {
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector != null) {
                AnnotatedMember member = getMember();
                if (member != null) {
                    list = annotationIntrospector.findPropertyAliases(member);
                }
            }
            if (list == null) {
                list = Collections.emptyList();
            }
            this._aliases = list;
        }
        return list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.annotation.JsonFormat.Value findFormatOverrides(com.fasterxml.jackson.databind.AnnotationIntrospector r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000d
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r1.getMember()
            if (r0 == 0) goto L_0x000d
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r2.findFormat(r0)
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            if (r2 != 0) goto L_0x0012
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = com.fasterxml.jackson.databind.BeanProperty.EMPTY_FORMAT
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase.findFormatOverrides(com.fasterxml.jackson.databind.AnnotationIntrospector):com.fasterxml.jackson.annotation.JsonFormat$Value");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.annotation.JsonFormat.Value findPropertyFormat(com.fasterxml.jackson.databind.cfg.MapperConfig<?> r2, java.lang.Class<?> r3) {
        /*
            r1 = this;
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r2.getDefaultPropertyFormat(r3)
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r2.getAnnotationIntrospector()
            if (r2 == 0) goto L_0x0015
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r1.getMember()
            if (r0 == 0) goto L_0x0015
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r2.findFormat(r0)
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x001d
            if (r2 != 0) goto L_0x001c
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = com.fasterxml.jackson.databind.BeanProperty.EMPTY_FORMAT
        L_0x001c:
            return r2
        L_0x001d:
            if (r2 != 0) goto L_0x0020
            goto L_0x0024
        L_0x0020:
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r3.withOverrides(r2)
        L_0x0024:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase.findPropertyFormat(com.fasterxml.jackson.databind.cfg.MapperConfig, java.lang.Class):com.fasterxml.jackson.annotation.JsonFormat$Value");
    }

    public Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        AnnotatedMember member = getMember();
        if (member == null) {
            return mapperConfig.getDefaultPropertyInclusion(cls);
        }
        Value defaultInclusion = mapperConfig.getDefaultInclusion(cls, member.getRawType());
        if (annotationIntrospector == null) {
            return defaultInclusion;
        }
        Value findPropertyInclusion = annotationIntrospector.findPropertyInclusion(member);
        if (defaultInclusion == null) {
            return findPropertyInclusion;
        }
        return defaultInclusion.withOverrides(findPropertyInclusion);
    }

    public PropertyMetadata getMetadata() {
        return this._metadata;
    }

    public boolean isRequired() {
        return this._metadata.isRequired();
    }

    public boolean isVirtual() {
        return false;
    }

    protected ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concreteBeanPropertyBase) {
        this._metadata = concreteBeanPropertyBase._metadata;
    }
}
