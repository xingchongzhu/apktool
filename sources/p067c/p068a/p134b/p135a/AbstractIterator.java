package p067c.p068a.p134b.p135a;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: c.a.b.a.a */
abstract class AbstractIterator<T> implements Iterator<T> {

    /* renamed from: a */
    private C1314b f9730a = C1314b.NOT_READY;
    @NullableDecl

    /* renamed from: b */
    private T f9731b;

    /* renamed from: c.a.b.a.a$a */
    /* compiled from: AbstractIterator */
    static /* synthetic */ class C1313a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9732a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                c.a.b.a.a$b[] r0 = p067c.p068a.p134b.p135a.AbstractIterator.C1314b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9732a = r0
                c.a.b.a.a$b r1 = p067c.p068a.p134b.p135a.AbstractIterator.C1314b.READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9732a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.a.b.a.a$b r1 = p067c.p068a.p134b.p135a.AbstractIterator.C1314b.DONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p134b.p135a.AbstractIterator.C1313a.<clinit>():void");
        }
    }

    /* renamed from: c.a.b.a.a$b */
    /* compiled from: AbstractIterator */
    private enum C1314b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractIterator() {
    }

    /* renamed from: c */
    private boolean m11627c() {
        this.f9730a = C1314b.FAILED;
        this.f9731b = mo8096a();
        if (this.f9730a == C1314b.DONE) {
            return false;
        }
        this.f9730a = C1314b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo8096a();

    /* access modifiers changed from: protected */
    @NullableDecl
    @CanIgnoreReturnValue
    /* renamed from: b */
    public final T mo8097b() {
        this.f9730a = C1314b.DONE;
        return null;
    }

    public final boolean hasNext() {
        C1320g.m11655n(this.f9730a != C1314b.FAILED);
        int i = C1313a.f9732a[this.f9730a.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return m11627c();
        }
        return false;
    }

    public final T next() {
        if (hasNext()) {
            this.f9730a = C1314b.NOT_READY;
            T t = this.f9731b;
            this.f9731b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
