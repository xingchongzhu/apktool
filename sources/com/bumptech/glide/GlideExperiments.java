package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.e */
public class GlideExperiments {

    /* renamed from: a */
    private final Map<Class<?>, ?> f10219a;

    /* renamed from: com.bumptech.glide.e$a */
    /* compiled from: GlideExperiments */
    static final class C1410a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Map<Class<?>, ?> f10220a = new HashMap();

        C1410a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public GlideExperiments mo8712b() {
            return new GlideExperiments(this);
        }
    }

    GlideExperiments(C1410a aVar) {
        this.f10219a = Collections.unmodifiableMap(new HashMap(aVar.f10220a));
    }

    /* renamed from: a */
    public boolean mo8711a(Class<?> cls) {
        return this.f10219a.containsKey(cls);
    }
}
