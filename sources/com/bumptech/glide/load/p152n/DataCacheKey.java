package com.bumptech.glide.load.p152n;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.n.d */
final class DataCacheKey implements Key {

    /* renamed from: b */
    private final Key f10473b;

    /* renamed from: c */
    private final Key f10474c;

    DataCacheKey(Key gVar, Key gVar2) {
        this.f10473b = gVar;
        this.f10474c = gVar2;
    }

    /* renamed from: b */
    public void mo8826b(MessageDigest messageDigest) {
        this.f10473b.mo8826b(messageDigest);
        this.f10474c.mo8826b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DataCacheKey)) {
            return false;
        }
        DataCacheKey dVar = (DataCacheKey) obj;
        if (!this.f10473b.equals(dVar.f10473b) || !this.f10474c.equals(dVar.f10474c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f10473b.hashCode() * 31) + this.f10474c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataCacheKey{sourceKey=");
        sb.append(this.f10473b);
        sb.append(", signature=");
        sb.append(this.f10474c);
        sb.append('}');
        return sb.toString();
    }
}
