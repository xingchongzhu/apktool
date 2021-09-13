package com.bumptech.glide.load.p152n;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.p174t.C1638j;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.n */
class EngineKey implements Key {

    /* renamed from: b */
    private final Object f10619b;

    /* renamed from: c */
    private final int f10620c;

    /* renamed from: d */
    private final int f10621d;

    /* renamed from: e */
    private final Class<?> f10622e;

    /* renamed from: f */
    private final Class<?> f10623f;

    /* renamed from: g */
    private final Key f10624g;

    /* renamed from: h */
    private final Map<Class<?>, Transformation<?>> f10625h;

    /* renamed from: i */
    private final Options f10626i;

    /* renamed from: j */
    private int f10627j;

    EngineKey(Object obj, Key gVar, int i, int i2, Map<Class<?>, Transformation<?>> map, Class<?> cls, Class<?> cls2, Options iVar) {
        this.f10619b = C1638j.m14081d(obj);
        this.f10624g = (Key) C1638j.m14082e(gVar, "Signature must not be null");
        this.f10620c = i;
        this.f10621d = i2;
        this.f10625h = (Map) C1638j.m14081d(map);
        this.f10622e = (Class) C1638j.m14082e(cls, "Resource class must not be null");
        this.f10623f = (Class) C1638j.m14082e(cls2, "Transcode class must not be null");
        this.f10626i = (Options) C1638j.m14081d(iVar);
    }

    /* renamed from: b */
    public void mo8826b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EngineKey)) {
            return false;
        }
        EngineKey nVar = (EngineKey) obj;
        if (!this.f10619b.equals(nVar.f10619b) || !this.f10624g.equals(nVar.f10624g) || this.f10621d != nVar.f10621d || this.f10620c != nVar.f10620c || !this.f10625h.equals(nVar.f10625h) || !this.f10622e.equals(nVar.f10622e) || !this.f10623f.equals(nVar.f10623f) || !this.f10626i.equals(nVar.f10626i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f10627j == 0) {
            int hashCode = this.f10619b.hashCode();
            this.f10627j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f10624g.hashCode();
            this.f10627j = hashCode2;
            int i = (hashCode2 * 31) + this.f10620c;
            this.f10627j = i;
            int i2 = (i * 31) + this.f10621d;
            this.f10627j = i2;
            int hashCode3 = (i2 * 31) + this.f10625h.hashCode();
            this.f10627j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f10622e.hashCode();
            this.f10627j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f10623f.hashCode();
            this.f10627j = hashCode5;
            this.f10627j = (hashCode5 * 31) + this.f10626i.hashCode();
        }
        return this.f10627j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EngineKey{model=");
        sb.append(this.f10619b);
        sb.append(", width=");
        sb.append(this.f10620c);
        sb.append(", height=");
        sb.append(this.f10621d);
        sb.append(", resourceClass=");
        sb.append(this.f10622e);
        sb.append(", transcodeClass=");
        sb.append(this.f10623f);
        sb.append(", signature=");
        sb.append(this.f10624g);
        sb.append(", hashCode=");
        sb.append(this.f10627j);
        sb.append(", transformations=");
        sb.append(this.f10625h);
        sb.append(", options=");
        sb.append(this.f10626i);
        sb.append('}');
        return sb.toString();
    }
}
