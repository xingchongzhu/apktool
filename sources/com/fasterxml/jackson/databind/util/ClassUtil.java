package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.annotation.NoClass;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ClassUtil {
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final Iterator<?> EMPTY_ITERATOR = Collections.emptyIterator();
    private static final Annotation[] NO_ANNOTATIONS = new Annotation[0];
    private static final Ctor[] NO_CTORS = new Ctor[0];

    public static final class Ctor {
        private transient Annotation[] _annotations;
        public final Constructor<?> _ctor;
        private transient Annotation[][] _paramAnnotations;
        private int _paramCount = -1;

        public Ctor(Constructor<?> constructor) {
            this._ctor = constructor;
        }

        public Constructor<?> getConstructor() {
            return this._ctor;
        }

        public Annotation[] getDeclaredAnnotations() {
            Annotation[] annotationArr = this._annotations;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[] declaredAnnotations = this._ctor.getDeclaredAnnotations();
            this._annotations = declaredAnnotations;
            return declaredAnnotations;
        }

        public Class<?> getDeclaringClass() {
            return this._ctor.getDeclaringClass();
        }

        public int getParamCount() {
            int i = this._paramCount;
            if (i >= 0) {
                return i;
            }
            int length = this._ctor.getParameterTypes().length;
            this._paramCount = length;
            return length;
        }

        public Annotation[][] getParameterAnnotations() {
            Annotation[][] annotationArr = this._paramAnnotations;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[][] parameterAnnotations = this._ctor.getParameterAnnotations();
            this._paramAnnotations = parameterAnnotations;
            return parameterAnnotations;
        }
    }

    private static class EnumTypeLocator {
        static final EnumTypeLocator instance = new EnumTypeLocator();
        private final Field enumMapTypeField;
        private final Field enumSetTypeField;

        private EnumTypeLocator() {
            String str = "elementType";
            this.enumSetTypeField = locateField(EnumSet.class, str, Class.class);
            this.enumMapTypeField = locateField(EnumMap.class, str, Class.class);
        }

        private Object get(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }

        private static Field locateField(Class<?> cls, String str, Class<?> cls2) {
            Field field;
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i];
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    break;
                }
                i++;
            }
            if (field == null) {
                for (Field field2 : declaredFields) {
                    if (field2.getType() == cls2) {
                        if (field != null) {
                            return null;
                        }
                        field = field2;
                    }
                }
            }
            if (field != null) {
                try {
                    field.setAccessible(true);
                } catch (Throwable unused) {
                }
            }
            return field;
        }

        public Class<? extends Enum<?>> enumTypeFor(EnumSet<?> enumSet) {
            Field field = this.enumSetTypeField;
            if (field != null) {
                return (Class) get(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumSet (odd JDK platform?)");
        }

        public Class<? extends Enum<?>> enumTypeFor(EnumMap<?, ?> enumMap) {
            Field field = this.enumMapTypeField;
            if (field != null) {
                return (Class) get(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumMap (odd JDK platform?)");
        }
    }

    private static void _addRawSuperTypes(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z) {
        if (!(cls == cls2 || cls == null || cls == Object.class)) {
            if (z) {
                if (!collection.contains(cls)) {
                    collection.add(cls);
                } else {
                    return;
                }
            }
            for (Class _addRawSuperTypes : _interfaces(cls)) {
                _addRawSuperTypes(_addRawSuperTypes, cls2, collection, true);
            }
            _addRawSuperTypes(cls.getSuperclass(), cls2, collection, true);
        }
    }

    private static void _addSuperTypes(JavaType javaType, Class<?> cls, Collection<JavaType> collection, boolean z) {
        if (javaType != null) {
            Class<Object> rawClass = javaType.getRawClass();
            if (!(rawClass == cls || rawClass == Object.class)) {
                if (z) {
                    if (!collection.contains(javaType)) {
                        collection.add(javaType);
                    } else {
                        return;
                    }
                }
                for (JavaType _addSuperTypes : javaType.getInterfaces()) {
                    _addSuperTypes(_addSuperTypes, cls, collection, true);
                }
                _addSuperTypes(javaType.getSuperClass(), cls, collection, true);
            }
        }
    }

    private static Class<?>[] _interfaces(Class<?> cls) {
        return cls.getInterfaces();
    }

    public static String backticked(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('`');
        sb.append(str);
        sb.append('`');
        return sb.toString();
    }

    public static String canBeABeanType(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    @Deprecated
    public static void checkAndFixAccess(Member member) {
        checkAndFixAccess(member, false);
    }

    public static String classNameOf(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return nameOf(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static Class<?> classOf(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static void closeOnFailAndThrowAsIOE(JsonGenerator jsonGenerator, Exception exc) throws IOException {
        jsonGenerator.disable(Feature.AUTO_CLOSE_JSON_CONTENT);
        try {
            jsonGenerator.close();
        } catch (Exception e) {
            exc.addSuppressed(e);
        }
        throwIfIOE(exc);
        throwIfRTE(exc);
        throw new RuntimeException(exc);
    }

    public static <T> T createInstance(Class<T> cls, boolean z) throws IllegalArgumentException {
        Constructor findConstructor = findConstructor(cls, z);
        if (findConstructor != null) {
            try {
                return findConstructor.newInstance(new Object[0]);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to instantiate class ");
                sb.append(cls.getName());
                sb.append(", problem: ");
                sb.append(e.getMessage());
                unwrapAndThrowAsIAE(e, sb.toString());
                return null;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Class ");
            sb2.append(cls.getName());
            sb2.append(" has no default (no arg) constructor");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static Object defaultValue(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.valueOf(0);
        }
        if (cls == Long.TYPE) {
            return Long.valueOf(0);
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return Byte.valueOf(0);
        }
        if (cls == Short.TYPE) {
            return Short.valueOf(0);
        }
        if (cls == Character.TYPE) {
            return Character.valueOf(0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Class ");
        sb.append(cls.getName());
        sb.append(" is not a primitive type");
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T> Iterator<T> emptyIterator() {
        return EMPTY_ITERATOR;
    }

    public static String exceptionMessage(Throwable th) {
        if (th instanceof JsonProcessingException) {
            return ((JsonProcessingException) th).getOriginalMessage();
        }
        return th.getMessage();
    }

    public static Annotation[] findClassAnnotations(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return NO_ANNOTATIONS;
        }
        return cls.getDeclaredAnnotations();
    }

    public static <T> Constructor<T> findConstructor(Class<T> cls, boolean z) throws IllegalArgumentException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z) {
                checkAndFixAccess(declaredConstructor, z);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                StringBuilder sb = new StringBuilder();
                sb.append("Default constructor for ");
                sb.append(cls.getName());
                sb.append(" is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
                throw new IllegalArgumentException(sb.toString());
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to find default constructor of class ");
            sb2.append(cls.getName());
            sb2.append(", problem: ");
            sb2.append(e.getMessage());
            unwrapAndThrowAsIAE(e, sb2.toString());
            return null;
        }
    }

    public static Class<? extends Enum<?>> findEnumType(EnumSet<?> enumSet) {
        if (!enumSet.isEmpty()) {
            return findEnumType((Enum) enumSet.iterator().next());
        }
        return EnumTypeLocator.instance.enumTypeFor(enumSet);
    }

    public static <T extends Annotation> Enum<?> findFirstAnnotatedEnumValue(Class<Enum<?>> cls, Class<T> cls2) {
        Field[] declaredFields;
        Enum<?>[] enumArr;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum<?> enumR : (Enum[]) cls.getEnumConstants()) {
                    if (name.equals(enumR.name())) {
                        return enumR;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static List<Class<?>> findRawSuperTypes(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        _addRawSuperTypes(cls, cls2, arrayList, z);
        return arrayList;
    }

    public static List<Class<?>> findSuperClasses(Class<?> cls, Class<?> cls2, boolean z) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static List<JavaType> findSuperTypes(JavaType javaType, Class<?> cls, boolean z) {
        if (javaType == null || javaType.hasRawClass(cls) || javaType.hasRawClass(Object.class)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        _addSuperTypes(javaType, cls, arrayList, z);
        return arrayList;
    }

    public static String getClassDescription(Object obj) {
        Class cls;
        if (obj == null) {
            return "unknown";
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        return nameOf(cls);
    }

    public static Method[] getClassMethods(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (ClassNotFoundException e2) {
                    e.addSuppressed(e2);
                    throw e;
                }
            } else {
                throw e;
            }
        }
    }

    public static Ctor[] getConstructors(Class<?> cls) {
        if (cls.isInterface() || isObjectOrPrimitive(cls)) {
            return NO_CTORS;
        }
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        Ctor[] ctorArr = new Ctor[length];
        for (int i = 0; i < length; i++) {
            ctorArr[i] = new Ctor(declaredConstructors[i]);
        }
        return ctorArr;
    }

    @Deprecated
    public static Field[] getDeclaredFields(Class<?> cls) {
        return cls.getDeclaredFields();
    }

    @Deprecated
    public static Method[] getDeclaredMethods(Class<?> cls) {
        return cls.getDeclaredMethods();
    }

    public static Class<?> getDeclaringClass(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return null;
        }
        return cls.getDeclaringClass();
    }

    public static Class<?> getEnclosingClass(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Type[] getGenericInterfaces(Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    public static Type getGenericSuperclass(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static Class<?> getOuterClass(Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (hasEnclosingMethod(cls)) {
                    return null;
                }
                return getEnclosingClass(cls);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static String getPackageName(Class<?> cls) {
        Package packageR = cls.getPackage();
        if (packageR == null) {
            return null;
        }
        return packageR.getName();
    }

    public static Throwable getRootCause(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static String getTypeDescription(JavaType javaType) {
        if (javaType == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append('`');
        sb.append(javaType.toCanonical());
        sb.append('`');
        return sb.toString();
    }

    public static boolean hasClass(Object obj, Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean hasEnclosingMethod(Class<?> cls) {
        return !isObjectOrPrimitive(cls) && cls.getEnclosingMethod() != null;
    }

    @Deprecated
    public static boolean hasGetterSignature(Method method) {
        if (Modifier.isStatic(method.getModifiers())) {
            return false;
        }
        Class[] parameterTypes = method.getParameterTypes();
        if ((parameterTypes == null || parameterTypes.length == 0) && Void.TYPE != method.getReturnType()) {
            return true;
        }
        return false;
    }

    public static boolean isBogusClass(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == NoClass.class;
    }

    public static boolean isCollectionMapOrArray(Class<?> cls) {
        if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    public static boolean isConcrete(Class<?> cls) {
        return (cls.getModifiers() & 1536) == 0;
    }

    public static boolean isEnumType(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    public static boolean isJDKClass(Class<?> cls) {
        return cls.getName().startsWith("java.");
    }

    public static boolean isJacksonStdImpl(Object obj) {
        return obj == null || isJacksonStdImpl(obj.getClass());
    }

    public static String isLocalType(Class<?> cls, boolean z) {
        try {
            boolean isStatic = Modifier.isStatic(cls.getModifiers());
            if (!isStatic && hasEnclosingMethod(cls)) {
                return "local/anonymous";
            }
            if (!z && !isStatic && getEnclosingClass(cls) != null) {
                return "non-static member class";
            }
            return null;
        } catch (NullPointerException | SecurityException unused) {
        }
    }

    public static boolean isNonStaticInnerClass(Class<?> cls) {
        return !Modifier.isStatic(cls.getModifiers()) && getEnclosingClass(cls) != null;
    }

    public static boolean isObjectOrPrimitive(Class<?> cls) {
        return cls == CLS_OBJECT || cls.isPrimitive();
    }

    public static boolean isProxyType(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static String nameOf(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i > 0) {
            StringBuilder sb = new StringBuilder(simpleName);
            do {
                sb.append("[]");
                i--;
            } while (i > 0);
            simpleName = sb.toString();
        }
        return backticked(simpleName);
    }

    public static <T> T nonNull(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static String nonNullString(String str) {
        return str == null ? "" : str;
    }

    public static String nullOrToString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static Class<?> primitiveType(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static String quotedOr(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return String.format("\"%s\"", new Object[]{obj});
    }

    public static Class<?> rawClass(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    public static void throwAsIAE(Throwable th) {
        throwAsIAE(th, th.getMessage());
    }

    public static <T> T throwAsMappingException(DeserializationContext deserializationContext, IOException iOException) throws JsonMappingException {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        JsonMappingException from = JsonMappingException.from(deserializationContext, iOException.getMessage());
        from.initCause(iOException);
        throw from;
    }

    public static Throwable throwIfError(Throwable th) {
        if (!(th instanceof Error)) {
            return th;
        }
        throw ((Error) th);
    }

    public static Throwable throwIfIOE(Throwable th) throws IOException {
        if (!(th instanceof IOException)) {
            return th;
        }
        throw ((IOException) th);
    }

    public static Throwable throwIfRTE(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            return th;
        }
        throw ((RuntimeException) th);
    }

    public static Throwable throwRootCauseIfIOE(Throwable th) throws IOException {
        return throwIfIOE(getRootCause(th));
    }

    public static void unwrapAndThrowAsIAE(Throwable th) {
        throwAsIAE(getRootCause(th));
    }

    public static void verifyMustOverride(Class<?> cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", new Object[]{obj.getClass().getName(), cls.getName(), str}));
        }
    }

    public static Class<?> wrapperType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Class ");
        sb.append(cls.getName());
        sb.append(" is not a primitive type");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void checkAndFixAccess(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        if (!z) {
            try {
                if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                    return;
                }
            } catch (SecurityException e) {
                if (!accessibleObject.isAccessible()) {
                    Class declaringClass = member.getDeclaringClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot access ");
                    sb.append(member);
                    sb.append(" (from class ");
                    sb.append(declaringClass.getName());
                    sb.append("; failed to set access: ");
                    sb.append(e.getMessage());
                    throw new IllegalArgumentException(sb.toString());
                }
                return;
            }
        }
        accessibleObject.setAccessible(true);
    }

    public static boolean isConcrete(Member member) {
        return (member.getModifiers() & 1536) == 0;
    }

    public static boolean isJacksonStdImpl(Class<?> cls) {
        return cls.getAnnotation(JacksonStdImpl.class) != null;
    }

    public static void throwAsIAE(Throwable th, String str) {
        throwIfRTE(th);
        throwIfError(th);
        throw new IllegalArgumentException(str, th);
    }

    public static void unwrapAndThrowAsIAE(Throwable th, String str) {
        throwAsIAE(getRootCause(th), str);
    }

    public static Class<? extends Enum<?>> findEnumType(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return findEnumType((Enum) enumMap.keySet().iterator().next());
        }
        return EnumTypeLocator.instance.enumTypeFor(enumMap);
    }

    @Deprecated
    public static List<Class<?>> findSuperTypes(Class<?> cls, Class<?> cls2) {
        return findSuperTypes(cls, cls2, (List<Class<?>>) new ArrayList<Class<?>>(8));
    }

    @Deprecated
    public static List<Class<?>> findSuperTypes(Class<?> cls, Class<?> cls2, List<Class<?>> list) {
        _addRawSuperTypes(cls, cls2, list, false);
        return list;
    }

    public static void closeOnFailAndThrowAsIOE(JsonGenerator jsonGenerator, Closeable closeable, Exception exc) throws IOException {
        if (jsonGenerator != null) {
            jsonGenerator.disable(Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGenerator.close();
            } catch (Exception e) {
                exc.addSuppressed(e);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                exc.addSuppressed(e2);
            }
        }
        throwIfIOE(exc);
        throwIfRTE(exc);
        throw new RuntimeException(exc);
    }

    public static Class<? extends Enum<?>> findEnumType(Enum<?> enumR) {
        Class<? extends Enum<?>> cls = enumR.getClass();
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static String nameOf(Named named) {
        return named == null ? "[null]" : backticked(named.getName());
    }

    public static Class<? extends Enum<?>> findEnumType(Class<?> cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }
}
