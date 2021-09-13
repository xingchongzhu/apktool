package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class EnumResolver implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Enum<?> _defaultValue;
    protected final Class<Enum<?>> _enumClass;
    protected final Enum<?>[] _enums;
    protected final HashMap<String, Enum<?>> _enumsById;

    protected EnumResolver(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> hashMap, Enum<?> enumR) {
        this._enumClass = cls;
        this._enums = enumArr;
        this._enumsById = hashMap;
        this._defaultValue = enumR;
    }

    public static EnumResolver constructFor(Class<Enum<?>> cls, AnnotationIntrospector annotationIntrospector) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            String[] findEnumValues = annotationIntrospector.findEnumValues(cls, enumArr, new String[enumArr.length]);
            String[][] strArr = new String[findEnumValues.length][];
            annotationIntrospector.findEnumAliases(cls, enumArr, strArr);
            HashMap hashMap = new HashMap();
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                Enum enumR = enumArr[i];
                String str = findEnumValues[i];
                if (str == null) {
                    str = enumR.name();
                }
                hashMap.put(str, enumR);
                String[] strArr2 = strArr[i];
                if (strArr2 != null) {
                    for (String str2 : strArr2) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, enumR);
                        }
                    }
                }
            }
            return new EnumResolver(cls, enumArr, hashMap, annotationIntrospector.findDefaultEnumValue(cls));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No enum constants for class ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public static EnumResolver constructUnsafe(Class<?> cls, AnnotationIntrospector annotationIntrospector) {
        return constructFor(cls, annotationIntrospector);
    }

    public static EnumResolver constructUnsafeUsingMethod(Class<?> cls, AnnotatedMember annotatedMember, AnnotationIntrospector annotationIntrospector) {
        return constructUsingMethod(cls, annotatedMember, annotationIntrospector);
    }

    public static EnumResolver constructUnsafeUsingToString(Class<?> cls, AnnotationIntrospector annotationIntrospector) {
        return constructUsingToString(cls, annotationIntrospector);
    }

    public static EnumResolver constructUsingMethod(Class<Enum<?>> cls, AnnotatedMember annotatedMember, AnnotationIntrospector annotationIntrospector) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        HashMap hashMap = new HashMap();
        int length = enumArr.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum enumR = enumArr[length];
            try {
                Object value = annotatedMember.getValue(enumR);
                if (value != null) {
                    hashMap.put(value.toString(), enumR);
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to access @JsonValue of Enum value ");
                sb.append(enumR);
                sb.append(": ");
                sb.append(e.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return new EnumResolver(cls, enumArr, hashMap, annotationIntrospector != null ? annotationIntrospector.findDefaultEnumValue(cls) : null);
    }

    @Deprecated
    public static EnumResolver constructUsingToString(Class<Enum<?>> cls) {
        return constructUsingToString(cls, null);
    }

    public CompactStringObjectMap constructLookup() {
        return CompactStringObjectMap.construct(this._enumsById);
    }

    public Enum<?> findEnum(String str) {
        return (Enum) this._enumsById.get(str);
    }

    public Enum<?> getDefaultValue() {
        return this._defaultValue;
    }

    public Enum<?> getEnum(int i) {
        if (i >= 0) {
            Enum<?>[] enumArr = this._enums;
            if (i < enumArr.length) {
                return enumArr[i];
            }
        }
        return null;
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public Collection<String> getEnumIds() {
        return this._enumsById.keySet();
    }

    public List<Enum<?>> getEnums() {
        ArrayList arrayList = new ArrayList(this._enums.length);
        for (Enum<?> add : this._enums) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public Enum<?>[] getRawEnums() {
        return this._enums;
    }

    public int lastValidIndex() {
        return this._enums.length - 1;
    }

    public static EnumResolver constructUsingToString(Class<Enum<?>> cls, AnnotationIntrospector annotationIntrospector) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        HashMap hashMap = new HashMap();
        String[][] strArr = new String[enumArr.length][];
        annotationIntrospector.findEnumAliases(cls, enumArr, strArr);
        int length = enumArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(cls, enumArr, hashMap, annotationIntrospector.findDefaultEnumValue(cls));
            }
            Enum enumR = enumArr[length];
            hashMap.put(enumR.toString(), enumR);
            String[] strArr2 = strArr[length];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (!hashMap.containsKey(str)) {
                        hashMap.put(str, enumR);
                    }
                }
            }
        }
    }
}
