package p067c.p068a.p134b.p136b;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.p068a.p134b.p137c.Booleans;
import p067c.p068a.p134b.p137c.Ints;
import p067c.p068a.p134b.p137c.Longs;

/* renamed from: c.a.b.b.m */
public abstract class ComparisonChain {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final ComparisonChain f9849a = new C1370a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ComparisonChain f9850b = new C1371b(-1);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ComparisonChain f9851c = new C1371b(1);

    /* renamed from: c.a.b.b.m$a */
    /* compiled from: ComparisonChain */
    static class C1370a extends ComparisonChain {
        C1370a() {
            super(null);
        }

        /* renamed from: d */
        public ComparisonChain mo8382d(int i, int i2) {
            return mo8388k(Ints.m12037d(i, i2));
        }

        /* renamed from: e */
        public ComparisonChain mo8383e(long j, long j2) {
            return mo8388k(Longs.m12046a(j, j2));
        }

        /* renamed from: f */
        public <T> ComparisonChain mo8384f(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator) {
            return mo8388k(comparator.compare(t, t2));
        }

        /* renamed from: g */
        public ComparisonChain mo8385g(boolean z, boolean z2) {
            return mo8388k(Booleans.m12032a(z, z2));
        }

        /* renamed from: h */
        public ComparisonChain mo8386h(boolean z, boolean z2) {
            return mo8388k(Booleans.m12032a(z2, z));
        }

        /* renamed from: i */
        public int mo8387i() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public ComparisonChain mo8388k(int i) {
            if (i < 0) {
                return ComparisonChain.f9850b;
            }
            return i > 0 ? ComparisonChain.f9851c : ComparisonChain.f9849a;
        }
    }

    /* renamed from: c.a.b.b.m$b */
    /* compiled from: ComparisonChain */
    private static final class C1371b extends ComparisonChain {

        /* renamed from: d */
        final int f9852d;

        C1371b(int i) {
            super(null);
            this.f9852d = i;
        }

        /* renamed from: d */
        public ComparisonChain mo8382d(int i, int i2) {
            return this;
        }

        /* renamed from: e */
        public ComparisonChain mo8383e(long j, long j2) {
            return this;
        }

        /* renamed from: f */
        public <T> ComparisonChain mo8384f(@NullableDecl T t, @NullableDecl T t2, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        /* renamed from: g */
        public ComparisonChain mo8385g(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: h */
        public ComparisonChain mo8386h(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: i */
        public int mo8387i() {
            return this.f9852d;
        }
    }

    /* synthetic */ ComparisonChain(C1370a aVar) {
        this();
    }

    /* renamed from: j */
    public static ComparisonChain m11847j() {
        return f9849a;
    }

    /* renamed from: d */
    public abstract ComparisonChain mo8382d(int i, int i2);

    /* renamed from: e */
    public abstract ComparisonChain mo8383e(long j, long j2);

    /* renamed from: f */
    public abstract <T> ComparisonChain mo8384f(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator);

    /* renamed from: g */
    public abstract ComparisonChain mo8385g(boolean z, boolean z2);

    /* renamed from: h */
    public abstract ComparisonChain mo8386h(boolean z, boolean z2);

    /* renamed from: i */
    public abstract int mo8387i();

    private ComparisonChain() {
    }
}
