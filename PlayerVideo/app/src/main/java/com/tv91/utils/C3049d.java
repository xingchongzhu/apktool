package com.tv91.utils;

import java.util.AbstractMap.SimpleEntry;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.tv91.utils.d */
/* compiled from: Maps */
public final class C3049d {
    /* renamed from: a */
    public static <K, V> Entry<K, V> m20566a(K k, V v) {
        return new SimpleEntry(k, v);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <K extends Enum<K>, V> EnumMap<K, V> m20567b(Class<K> cls, Entry<K, V>... entryArr) {
        EnumMap<K, V> enumMap = new EnumMap<>(cls);
        for (Entry<K, V> entry : entryArr) {
            enumMap.put((Enum) entry.getKey(), entry.getValue());
        }
        return enumMap;
    }

    @SafeVarargs
    /* renamed from: c */
    public static <K, V> Map<K, V> m20568c(Entry<K, V>... entryArr) {
        if (entryArr.length == 1) {
            return Collections.singletonMap(entryArr[0].getKey(), entryArr[0].getValue());
        }
        HashMap hashMap = new HashMap(entryArr.length);
        for (Entry<K, V> entry : entryArr) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }
}
