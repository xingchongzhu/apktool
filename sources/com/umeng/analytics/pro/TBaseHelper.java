package com.umeng.analytics.pro;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.umeng.analytics.pro.ar */
public final class TBaseHelper {

    /* renamed from: a */
    private static final Comparator f16748a = new C3115a();

    /* renamed from: com.umeng.analytics.pro.ar$a */
    /* compiled from: TBaseHelper */
    private static class C3115a implements Comparator {
        private C3115a() {
        }

        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            if (obj instanceof List) {
                return TBaseHelper.m21636a((List) obj, (List) obj2);
            }
            if (obj instanceof Set) {
                return TBaseHelper.m21638a((Set) obj, (Set) obj2);
            }
            if (obj instanceof Map) {
                return TBaseHelper.m21637a((Map) obj, (Map) obj2);
            }
            if (obj instanceof byte[]) {
                return TBaseHelper.m21641a((byte[]) obj, (byte[]) obj2);
            }
            return TBaseHelper.m21632a((Comparable) obj, (Comparable) obj2);
        }
    }

    private TBaseHelper() {
    }

    /* renamed from: a */
    public static int m21628a(byte b, byte b2) {
        if (b < b2) {
            return -1;
        }
        return b2 < b ? 1 : 0;
    }

    /* renamed from: a */
    public static int m21629a(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        return d2 < d ? 1 : 0;
    }

    /* renamed from: a */
    public static int m21630a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i2 < i ? 1 : 0;
    }

    /* renamed from: a */
    public static int m21631a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j2 < j ? 1 : 0;
    }

    /* renamed from: a */
    public static int m21633a(Object obj, Object obj2) {
        if (obj instanceof Comparable) {
            return m21632a((Comparable) obj, (Comparable) obj2);
        }
        if (obj instanceof List) {
            return m21636a((List) obj, (List) obj2);
        }
        if (obj instanceof Set) {
            return m21638a((Set) obj, (Set) obj2);
        }
        if (obj instanceof Map) {
            return m21637a((Map) obj, (Map) obj2);
        }
        if (obj instanceof byte[]) {
            return m21641a((byte[]) obj, (byte[]) obj2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot compare objects of type ");
        sb.append(obj.getClass());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static int m21639a(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s2 < s ? 1 : 0;
    }

    /* renamed from: b */
    public static boolean m21646b(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    /* renamed from: c */
    public static ByteBuffer m21647c(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (m21646b(byteBuffer)) {
            return byteBuffer;
        }
        return ByteBuffer.wrap(m21644a(byteBuffer));
    }

    /* renamed from: d */
    public static ByteBuffer m21648d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(new byte[byteBuffer.remaining()]);
        if (byteBuffer.hasArray()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), wrap.array(), 0, byteBuffer.remaining());
        } else {
            byteBuffer.slice().get(wrap.array());
        }
        return wrap;
    }

    /* renamed from: a */
    public static int m21640a(boolean z, boolean z2) {
        return Boolean.valueOf(z).compareTo(Boolean.valueOf(z2));
    }

    /* renamed from: a */
    public static int m21634a(String str, String str2) {
        return str.compareTo(str2);
    }

    /* renamed from: a */
    public static int m21641a(byte[] bArr, byte[] bArr2) {
        int a = m21630a(bArr.length, bArr2.length);
        if (a != 0) {
            return a;
        }
        for (int i = 0; i < bArr.length; i++) {
            int a2 = m21628a(bArr[i], bArr2[i]);
            if (a2 != 0) {
                return a2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m21632a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* renamed from: a */
    public static int m21636a(List list, List list2) {
        int a = m21630a(list.size(), list2.size());
        if (a != 0) {
            return a;
        }
        for (int i = 0; i < list.size(); i++) {
            int compare = f16748a.compare(list.get(i), list2.get(i));
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m21638a(Set set, Set set2) {
        int a = m21630a(set.size(), set2.size());
        if (a != 0) {
            return a;
        }
        Comparator comparator = f16748a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compare = f16748a.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m21637a(Map map, Map map2) {
        int a = m21630a(map.size(), map2.size());
        if (a != 0) {
            return a;
        }
        Comparator comparator = f16748a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Entry entry2 = (Entry) it2.next();
            Comparator comparator2 = f16748a;
            int compare = comparator2.compare(entry.getKey(), entry2.getKey());
            if (compare != 0) {
                return compare;
            }
            int compare2 = comparator2.compare(entry.getValue(), entry2.getValue());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static void m21643a(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        int position = byteBuffer.position() + arrayOffset;
        int limit = arrayOffset + byteBuffer.limit();
        int i = limit - position > 128 ? position + 128 : limit;
        for (int i2 = position; i2 < i; i2++) {
            if (i2 > position) {
                sb.append(" ");
            }
            sb.append(m21642a(array[i2]));
        }
        if (limit != i) {
            sb.append("...");
        }
    }

    /* renamed from: a */
    public static String m21642a(byte b) {
        return Integer.toHexString((b | 256) & 511).toUpperCase().substring(1);
    }

    /* renamed from: a */
    public static byte[] m21644a(ByteBuffer byteBuffer) {
        if (m21646b(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        m21635a(byteBuffer, bArr, 0);
        return bArr;
    }

    /* renamed from: a */
    public static int m21635a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int remaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i, remaining);
        return remaining;
    }

    /* renamed from: a */
    public static byte[] m21645a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
