package com.bumptech.glide.load;

import com.bumptech.glide.p174t.CachedHashCodeArrayMap;
import java.security.MessageDigest;
import p010b.p025d.ArrayMap;

/* renamed from: com.bumptech.glide.load.i */
public final class Options implements Key {

    /* renamed from: b */
    private final ArrayMap<Option<?>, Object> f10349b = new CachedHashCodeArrayMap();

    /* renamed from: f */
    private static <T> void m12612f(Option<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.mo8831g(obj, messageDigest);
    }

    /* renamed from: b */
    public void mo8826b(MessageDigest messageDigest) {
        for (int i = 0; i < this.f10349b.size(); i++) {
            m12612f((Option) this.f10349b.mo4508i(i), this.f10349b.mo4513m(i), messageDigest);
        }
    }

    /* renamed from: c */
    public <T> T mo8835c(Option<T> hVar) {
        return this.f10349b.containsKey(hVar) ? this.f10349b.get(hVar) : hVar.mo8829c();
    }

    /* renamed from: d */
    public void mo8836d(Options iVar) {
        this.f10349b.mo4510j(iVar.f10349b);
    }

    /* renamed from: e */
    public <T> Options mo8837e(Option<T> hVar, T t) {
        this.f10349b.put(hVar, t);
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Options)) {
            return false;
        }
        return this.f10349b.equals(((Options) obj).f10349b);
    }

    public int hashCode() {
        return this.f10349b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Options{values=");
        sb.append(this.f10349b);
        sb.append('}');
        return sb.toString();
    }
}
