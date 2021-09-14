package p067c.google.p134b.p137c;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.google.p134b.p135a.C1320g;

/* renamed from: c.a.b.c.c */
public final class Ints {

    /* renamed from: c.a.b.c.c$a */
    /* compiled from: Ints */
    private static class C1394a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: a */
        final int[] f9919a;

        /* renamed from: b */
        final int f9920b;

        /* renamed from: c */
        final int f9921c;

        C1394a(int[] iArr, int i, int i2) {
            this.f9919a = iArr;
            this.f9920b = i;
            this.f9921c = i2;
        }

        /* renamed from: b */
        public Integer get(int i) {
            C1320g.m11648g(i, size());
            return Integer.valueOf(this.f9919a[this.f9920b + i]);
        }

        /* renamed from: c */
        public Integer set(int i, Integer num) {
            C1320g.m11648g(i, size());
            int[] iArr = this.f9919a;
            int i2 = this.f9920b;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) C1320g.m11650i(num)).intValue();
            return Integer.valueOf(i3);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && Ints.m12040g(this.f9919a, ((Integer) obj).intValue(), this.f9920b, this.f9921c) != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int[] mo8510d() {
            return Arrays.copyOfRange(this.f9919a, this.f9920b, this.f9921c);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1394a)) {
                return super.equals(obj);
            }
            C1394a aVar = (C1394a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f9919a[this.f9920b + i] != aVar.f9919a[aVar.f9920b + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f9920b; i2 < this.f9921c; i2++) {
                i = (i * 31) + Ints.m12038e(this.f9919a[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int a = Ints.m12040g(this.f9919a, ((Integer) obj).intValue(), this.f9920b, this.f9921c);
                if (a >= 0) {
                    return a - this.f9920b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int b = Ints.m12041h(this.f9919a, ((Integer) obj).intValue(), this.f9920b, this.f9921c);
                if (b >= 0) {
                    return b - this.f9920b;
                }
            }
            return -1;
        }

        public int size() {
            return this.f9921c - this.f9920b;
        }

        public List<Integer> subList(int i, int i2) {
            C1320g.m11654m(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f9919a;
            int i3 = this.f9920b;
            return new C1394a(iArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f9919a[this.f9920b]);
            int i = this.f9920b;
            while (true) {
                i++;
                if (i < this.f9921c) {
                    sb.append(", ");
                    sb.append(this.f9919a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    /* renamed from: c */
    public static int m12036c(long j) {
        int i = (int) j;
        C1320g.m11647f(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* renamed from: d */
    public static int m12037d(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: e */
    public static int m12038e(int i) {
        return i;
    }

    /* renamed from: f */
    public static int m12039f(int[] iArr, int i) {
        return m12040g(iArr, i, 0, iArr.length);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static int m12040g(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static int m12041h(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public static int[] m12042i(Collection<? extends Number> collection) {
        if (collection instanceof C1394a) {
            return ((C1394a) collection).mo8510d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) C1320g.m11650i(array[i])).intValue();
        }
        return iArr;
    }
}
