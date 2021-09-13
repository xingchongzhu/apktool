package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Validity;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.Converter.None;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;

public abstract class DatabindContext {
    private static final int MAX_ERROR_STR_LEN = 500;

    private JavaType _resolveAndValidateGeneric(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator, int i) throws JsonMappingException {
        MapperConfig config = getConfig();
        Validity validateSubClassName = polymorphicTypeValidator.validateSubClassName(config, javaType, str.substring(0, i));
        if (validateSubClassName == Validity.DENIED) {
            return (JavaType) _throwSubtypeNameNotAllowed(javaType, str, polymorphicTypeValidator);
        }
        JavaType constructFromCanonical = getTypeFactory().constructFromCanonical(str);
        if (!constructFromCanonical.isTypeOrSubTypeOf(javaType.getRawClass())) {
            return (JavaType) _throwNotASubtype(javaType, str);
        }
        Validity validity = Validity.ALLOWED;
        return (validateSubClassName == validity || polymorphicTypeValidator.validateSubType(config, javaType, constructFromCanonical) == validity) ? constructFromCanonical : (JavaType) _throwSubtypeClassNotAllowed(javaType, str, polymorphicTypeValidator);
    }

    /* access modifiers changed from: protected */
    public String _colonConcat(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String _desc(String str) {
        return str == null ? "[N/A]" : _truncate(str);
    }

    /* access modifiers changed from: protected */
    public final String _format(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    /* access modifiers changed from: protected */
    public String _quotedString(String str) {
        if (str == null) {
            return "[N/A]";
        }
        return String.format("\"%s\"", new Object[]{_truncate(str)});
    }

    /* access modifiers changed from: protected */
    public <T> T _throwNotASubtype(JavaType javaType, String str) throws JsonMappingException {
        throw invalidTypeIdException(javaType, str, "Not a subtype");
    }

    /* access modifiers changed from: protected */
    public <T> T _throwSubtypeClassNotAllowed(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        StringBuilder sb = new StringBuilder();
        sb.append("Configured `PolymorphicTypeValidator` (of type ");
        sb.append(ClassUtil.classNameOf(polymorphicTypeValidator));
        sb.append(") denied resolution");
        throw invalidTypeIdException(javaType, str, sb.toString());
    }

    /* access modifiers changed from: protected */
    public <T> T _throwSubtypeNameNotAllowed(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        StringBuilder sb = new StringBuilder();
        sb.append("Configured `PolymorphicTypeValidator` (of type ");
        sb.append(ClassUtil.classNameOf(polymorphicTypeValidator));
        sb.append(") denied resolution");
        throw invalidTypeIdException(javaType, str, sb.toString());
    }

    /* access modifiers changed from: protected */
    public final String _truncate(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 500) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 500));
        sb.append("]...[");
        sb.append(str.substring(str.length() - 500));
        return sb.toString();
    }

    public abstract boolean canOverrideAccessModifiers();

    public abstract JavaType constructSpecializedType(JavaType javaType, Class<?> cls);

    public JavaType constructType(Type type) {
        if (type == null) {
            return null;
        }
        return getTypeFactory().constructType(type);
    }

    public Converter<Object, Object> converterInstance(Annotated annotated, Object obj) throws JsonMappingException {
        Converter<Object, Object> converter = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (obj instanceof Class) {
            Class<None> cls = (Class) obj;
            if (cls == None.class || ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (Converter.class.isAssignableFrom(cls)) {
                MapperConfig config = getConfig();
                HandlerInstantiator handlerInstantiator = config.getHandlerInstantiator();
                if (handlerInstantiator != null) {
                    converter = handlerInstantiator.converterInstance(config, annotated, cls);
                }
                if (converter == null) {
                    converter = (Converter) ClassUtil.createInstance(cls, config.canOverrideAccessModifiers());
                }
                return converter;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AnnotationIntrospector returned Class ");
            sb.append(cls.getName());
            sb.append("; expected Class<Converter>");
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AnnotationIntrospector returned Converter definition of type ");
        sb2.append(obj.getClass().getName());
        sb2.append("; expected type Converter or Class<Converter> instead");
        throw new IllegalStateException(sb2.toString());
    }

    public abstract Class<?> getActiveView();

    public abstract AnnotationIntrospector getAnnotationIntrospector();

    public abstract Object getAttribute(Object obj);

    public abstract MapperConfig<?> getConfig();

    public abstract Value getDefaultPropertyFormat(Class<?> cls);

    public abstract Locale getLocale();

    public abstract TimeZone getTimeZone();

    public abstract TypeFactory getTypeFactory();

    /* access modifiers changed from: protected */
    public abstract JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2);

    public abstract boolean isEnabled(MapperFeature mapperFeature);

    public ObjectIdGenerator<?> objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo objectIdInfo) throws JsonMappingException {
        ObjectIdGenerator objectIdGenerator;
        Class generatorType = objectIdInfo.getGeneratorType();
        MapperConfig config = getConfig();
        HandlerInstantiator handlerInstantiator = config.getHandlerInstantiator();
        if (handlerInstantiator == null) {
            objectIdGenerator = null;
        } else {
            objectIdGenerator = handlerInstantiator.objectIdGeneratorInstance(config, annotated, generatorType);
        }
        if (objectIdGenerator == null) {
            objectIdGenerator = (ObjectIdGenerator) ClassUtil.createInstance(generatorType, config.canOverrideAccessModifiers());
        }
        return objectIdGenerator.forScope(objectIdInfo.getScope());
    }

    public ObjectIdResolver objectIdResolverInstance(Annotated annotated, ObjectIdInfo objectIdInfo) {
        ObjectIdResolver objectIdResolver;
        Class resolverType = objectIdInfo.getResolverType();
        MapperConfig config = getConfig();
        HandlerInstantiator handlerInstantiator = config.getHandlerInstantiator();
        if (handlerInstantiator == null) {
            objectIdResolver = null;
        } else {
            objectIdResolver = handlerInstantiator.resolverIdGeneratorInstance(config, annotated, resolverType);
        }
        return objectIdResolver == null ? (ObjectIdResolver) ClassUtil.createInstance(resolverType, config.canOverrideAccessModifiers()) : objectIdResolver;
    }

    public abstract <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException;

    public <T> T reportBadDefinition(Class<?> cls, String str) throws JsonMappingException {
        return reportBadDefinition(constructType(cls), str);
    }

    public JavaType resolveAndValidateSubType(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            return _resolveAndValidateGeneric(javaType, str, polymorphicTypeValidator, indexOf);
        }
        MapperConfig config = getConfig();
        Validity validateSubClassName = polymorphicTypeValidator.validateSubClassName(config, javaType, str);
        if (validateSubClassName == Validity.DENIED) {
            return (JavaType) _throwSubtypeNameNotAllowed(javaType, str, polymorphicTypeValidator);
        }
        try {
            Class findClass = getTypeFactory().findClass(str);
            if (!javaType.isTypeOrSuperTypeOf(findClass)) {
                return (JavaType) _throwNotASubtype(javaType, str);
            }
            JavaType constructSpecializedType = config.getTypeFactory().constructSpecializedType(javaType, findClass);
            return (validateSubClassName != Validity.INDETERMINATE || polymorphicTypeValidator.validateSubType(config, javaType, constructSpecializedType) == Validity.ALLOWED) ? constructSpecializedType : (JavaType) _throwSubtypeClassNotAllowed(javaType, str, polymorphicTypeValidator);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e) {
            throw invalidTypeIdException(javaType, str, String.format("problem: (%s) %s", new Object[]{e.getClass().getName(), ClassUtil.exceptionMessage(e)}));
        }
    }

    public JavaType resolveSubType(JavaType javaType, String str) throws JsonMappingException {
        if (str.indexOf(60) > 0) {
            JavaType constructFromCanonical = getTypeFactory().constructFromCanonical(str);
            if (constructFromCanonical.isTypeOrSubTypeOf(javaType.getRawClass())) {
                return constructFromCanonical;
            }
        } else {
            try {
                Class findClass = getTypeFactory().findClass(str);
                if (javaType.isTypeOrSuperTypeOf(findClass)) {
                    return getTypeFactory().constructSpecializedType(javaType, findClass);
                }
            } catch (ClassNotFoundException unused) {
                return null;
            } catch (Exception e) {
                throw invalidTypeIdException(javaType, str, String.format("problem: (%s) %s", new Object[]{e.getClass().getName(), ClassUtil.exceptionMessage(e)}));
            }
        }
        throw invalidTypeIdException(javaType, str, "Not a subtype");
    }

    public abstract DatabindContext setAttribute(Object obj, Object obj2);
}
