package p262d.p263a;

import p262d.p263a.p269c.GeneratedComponent;
import p262d.p263a.p269c.GeneratedComponentManager;

/* renamed from: d.a.a */
public final class EntryPoints {
    /* renamed from: a */
    public static <T> T m22887a(Object obj, Class<T> cls) {
        if (obj instanceof GeneratedComponent) {
            return cls.cast(obj);
        }
        if (obj instanceof GeneratedComponentManager) {
            return m22887a(((GeneratedComponentManager) obj).mo16498g(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), GeneratedComponent.class, GeneratedComponentManager.class}));
    }
}
