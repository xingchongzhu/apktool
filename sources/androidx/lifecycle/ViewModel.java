package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.r */
public abstract class ViewModel {

    /* renamed from: a */
    private final Map<String, Object> f2654a = new HashMap();

    /* renamed from: b */
    private volatile boolean f2655b = false;

    /* renamed from: b */
    private static void m2793b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3031a() {
        this.f2655b = true;
        Map<String, Object> map = this.f2654a;
        if (map != null) {
            synchronized (map) {
                for (Object b : this.f2654a.values()) {
                    m2793b(b);
                }
            }
        }
        mo2856d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public <T> T mo3032c(String str) {
        T t;
        Map<String, Object> map = this.f2654a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f2654a.get(str);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2856d() {
    }
}
