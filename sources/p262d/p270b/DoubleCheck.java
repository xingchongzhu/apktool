package p262d.p270b;

/* renamed from: d.b.a */
public final class DoubleCheck<T> {

    /* renamed from: a */
    private static final Object f17983a = new Object();

    /* renamed from: a */
    public static Object m22904a(Object obj, Object obj2) {
        if (!(obj != f17983a && !(obj instanceof MemoizedSentinel)) || obj == obj2) {
            return obj2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Scoped provider was invoked recursively returning different results: ");
        sb.append(obj);
        sb.append(" & ");
        sb.append(obj2);
        sb.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(sb.toString());
    }
}
