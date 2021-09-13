package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.analytics.pro.bc */
public class FieldMetaData implements Serializable {

    /* renamed from: d */
    private static Map<Class<? extends TBase>, Map<? extends TFieldIdEnum, FieldMetaData>> f16763d = new HashMap();

    /* renamed from: a */
    public final String f16764a;

    /* renamed from: b */
    public final byte f16765b;

    /* renamed from: c */
    public final FieldValueMetaData f16766c;

    public FieldMetaData(String str, byte b, FieldValueMetaData bdVar) {
        this.f16764a = str;
        this.f16765b = b;
        this.f16766c = bdVar;
    }

    /* renamed from: a */
    public static void m21706a(Class<? extends TBase> cls, Map<? extends TFieldIdEnum, FieldMetaData> map) {
        f16763d.put(cls, map);
    }

    /* renamed from: a */
    public static Map<? extends TFieldIdEnum, FieldMetaData> m21705a(Class<? extends TBase> cls) {
        String str = ", message: ";
        if (!f16763d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("InstantiationException for TBase class: ");
                sb.append(cls.getName());
                sb.append(str);
                sb.append(e.getMessage());
                throw new RuntimeException(sb.toString());
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("IllegalAccessException for TBase class: ");
                sb2.append(cls.getName());
                sb2.append(str);
                sb2.append(e2.getMessage());
                throw new RuntimeException(sb2.toString());
            }
        }
        return (Map) f16763d.get(cls);
    }
}
