package p067c.google.p134b.p136b;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: c.a.b.b.o */
final class Hashing {
    /* renamed from: a */
    static int m11896a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        double d2 = (double) highestOneBit;
        Double.isNaN(d2);
        if (max <= ((int) (d * d2))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 <= 0) {
            i2 = 1073741824;
        }
        return i2;
    }

    /* renamed from: b */
    static int m11897b(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: c */
    static int m11898c(@NullableDecl Object obj) {
        return m11897b(obj == null ? 0 : obj.hashCode());
    }
}
