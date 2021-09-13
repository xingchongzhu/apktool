package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.umeng.analytics.pro.UMCommonContent;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BeanUtil {
    public static Object getDefaultValue(JavaType javaType) {
        Class<String> rawClass = javaType.getRawClass();
        Class primitiveType = ClassUtil.primitiveType(rawClass);
        if (primitiveType != null) {
            return ClassUtil.defaultValue(primitiveType);
        }
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return Include.NON_EMPTY;
        }
        if (rawClass == String.class) {
            return "";
        }
        if (javaType.isTypeOrSubTypeOf(Date.class)) {
            return new Date(0);
        }
        if (!javaType.isTypeOrSubTypeOf(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0);
        return gregorianCalendar;
    }

    protected static boolean isCglibGetCallbacks(AnnotatedMethod annotatedMethod) {
        Class rawType = annotatedMethod.getRawType();
        if (!rawType.isArray()) {
            return false;
        }
        String packageName = ClassUtil.getPackageName(rawType.getComponentType());
        if (packageName == null || !packageName.contains(".cglib")) {
            return false;
        }
        if (packageName.startsWith("net.sf.cglib") || packageName.startsWith("org.hibernate.repackage.cglib") || packageName.startsWith("org.springframework.cglib")) {
            return true;
        }
        return false;
    }

    protected static boolean isGroovyMetaClassGetter(AnnotatedMethod annotatedMethod) {
        String packageName = ClassUtil.getPackageName(annotatedMethod.getRawType());
        return packageName != null && packageName.startsWith("groovy.lang");
    }

    protected static boolean isGroovyMetaClassSetter(AnnotatedMethod annotatedMethod) {
        String packageName = ClassUtil.getPackageName(annotatedMethod.getRawParameterType(0));
        if (packageName == null || !packageName.startsWith("groovy.lang")) {
            return false;
        }
        return true;
    }

    protected static String legacyManglePropertyName(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            char charAt2 = str.charAt(i);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb.append(str, i, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    public static String okNameForGetter(AnnotatedMethod annotatedMethod, boolean z) {
        String name = annotatedMethod.getName();
        String okNameForIsGetter = okNameForIsGetter(annotatedMethod, name, z);
        return okNameForIsGetter == null ? okNameForRegularGetter(annotatedMethod, name, z) : okNameForIsGetter;
    }

    public static String okNameForIsGetter(AnnotatedMethod annotatedMethod, String str, boolean z) {
        String str2;
        if (str.startsWith(UMCommonContent.f16607ae)) {
            Class<Boolean> rawType = annotatedMethod.getRawType();
            if (rawType == Boolean.class || rawType == Boolean.TYPE) {
                if (z) {
                    str2 = stdManglePropertyName(str, 2);
                } else {
                    str2 = legacyManglePropertyName(str, 2);
                }
                return str2;
            }
        }
        return null;
    }

    public static String okNameForMutator(AnnotatedMethod annotatedMethod, String str, boolean z) {
        String str2;
        String name = annotatedMethod.getName();
        if (!name.startsWith(str)) {
            return null;
        }
        if (z) {
            str2 = stdManglePropertyName(name, str.length());
        } else {
            str2 = legacyManglePropertyName(name, str.length());
        }
        return str2;
    }

    public static String okNameForRegularGetter(AnnotatedMethod annotatedMethod, String str, boolean z) {
        String str2;
        if (!str.startsWith("get")) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (isCglibGetCallbacks(annotatedMethod)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && isGroovyMetaClassGetter(annotatedMethod)) {
            return null;
        }
        if (z) {
            str2 = stdManglePropertyName(str, 3);
        } else {
            str2 = legacyManglePropertyName(str, 3);
        }
        return str2;
    }

    @Deprecated
    public static String okNameForSetter(AnnotatedMethod annotatedMethod, boolean z) {
        String okNameForMutator = okNameForMutator(annotatedMethod, "set", z);
        if (okNameForMutator == null || ("metaClass".equals(okNameForMutator) && isGroovyMetaClassSetter(annotatedMethod))) {
            return null;
        }
        return okNameForMutator;
    }

    public static String stdManglePropertyName(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        int i2 = i + 1;
        if (i2 < length && Character.isUpperCase(str.charAt(i2))) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        sb.append(str, i2, length);
        return sb.toString();
    }
}
