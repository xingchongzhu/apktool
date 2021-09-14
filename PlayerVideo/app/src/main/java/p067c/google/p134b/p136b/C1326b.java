package p067c.google.p134b.p136b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p067c.google.p134b.p135a.C1320g;

/* renamed from: c.a.b.b.b */
/* compiled from: AbstractIterator */
public abstract class C1326b<T> extends UnmodifiableIterator<T> {

    /* renamed from: a */
    private C1328b f9760a = C1328b.NOT_READY;
    @NullableDecl

    /* renamed from: b */
    private T f9761b;

    /* renamed from: c.a.b.b.b$a */
    /* compiled from: AbstractIterator */
    static /* synthetic */ class C1327a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9762a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                c.a.b.b.b$b[] r0 = p067c.p068a.p134b.p136b.C1326b.C1328b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9762a = r0
                c.a.b.b.b$b r1 = p067c.p068a.p134b.p136b.C1326b.C1328b.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9762a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.a.b.b.b$b r1 = p067c.p068a.p134b.p136b.C1326b.C1328b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p134b.p136b.C1326b.C1327a.<clinit>():void");
        }
    }

    /* renamed from: c.a.b.b.b$b */
    /* compiled from: AbstractIterator */
    private enum C1328b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C1326b() {
    }

    /* renamed from: c */
    private boolean m11677c() {
        this.f9760a = C1328b.FAILED;
        this.f9761b = mo8121a();
        if (this.f9760a == C1328b.DONE) {
            return false;
        }
        this.f9760a = C1328b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo8121a();

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: b */
    public final T mo8122b() {
        this.f9760a = C1328b.DONE;
        return null;
    }

    @CanIgnoreReturnValue
    public final boolean hasNext() {
        C1320g.m11655n(this.f9760a != C1328b.FAILED);
        int i = C1327a.f9762a[this.f9760a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m11677c();
        }
        return true;
    }

    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f9760a = C1328b.NOT_READY;
            T t = this.f9761b;
            this.f9761b = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
