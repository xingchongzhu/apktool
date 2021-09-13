package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.umeng.analytics.pro.av */
public class TEnumHelper {
    /* renamed from: a */
    public static TEnum m21666a(Class<? extends TEnum> cls, int i) {
        try {
            return (TEnum) cls.getMethod("findByValue", new Class[]{Integer.TYPE}).invoke(null, new Object[]{Integer.valueOf(i)});
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
