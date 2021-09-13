package com.bumptech.glide.p173s;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.p174t.C1638j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.s.b */
public final class ObjectKey implements Key {

    /* renamed from: b */
    private final Object f11232b;

    public ObjectKey(Object obj) {
        this.f11232b = C1638j.m14081d(obj);
    }

    /* renamed from: b */
    public void mo8826b(MessageDigest messageDigest) {
        messageDigest.update(this.f11232b.toString().getBytes(Key.f10343a));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ObjectKey)) {
            return false;
        }
        return this.f11232b.equals(((ObjectKey) obj).f11232b);
    }

    public int hashCode() {
        return this.f11232b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectKey{object=");
        sb.append(this.f11232b);
        sb.append('}');
        return sb.toString();
    }
}
