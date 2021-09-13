package com.bumptech.glide.load.p152n;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import com.bumptech.glide.p174t.C1636g;
import com.bumptech.glide.p174t.C1639k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.n.x */
final class ResourceCacheKey implements Key {

    /* renamed from: b */
    private static final C1636g<Class<?>, byte[]> f10665b = new C1636g<>(50);

    /* renamed from: c */
    private final ArrayPool f10666c;

    /* renamed from: d */
    private final Key f10667d;

    /* renamed from: e */
    private final Key f10668e;

    /* renamed from: f */
    private final int f10669f;

    /* renamed from: g */
    private final int f10670g;

    /* renamed from: h */
    private final Class<?> f10671h;

    /* renamed from: i */
    private final Options f10672i;

    /* renamed from: j */
    private final Transformation<?> f10673j;

    ResourceCacheKey(ArrayPool bVar, Key gVar, Key gVar2, int i, int i2, Transformation<?> mVar, Class<?> cls, Options iVar) {
        this.f10666c = bVar;
        this.f10667d = gVar;
        this.f10668e = gVar2;
        this.f10669f = i;
        this.f10670g = i2;
        this.f10673j = mVar;
        this.f10671h = cls;
        this.f10672i = iVar;
    }

    /* renamed from: c */
    private byte[] m13013c() {
        C1636g<Class<?>, byte[]> gVar = f10665b;
        byte[] bArr = (byte[]) gVar.mo9569g(this.f10671h);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f10671h.getName().getBytes(Key.f10343a);
        gVar.mo9571k(this.f10671h, bytes);
        return bytes;
    }

    /* renamed from: b */
    public void mo8826b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f10666c.mo8860c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f10669f).putInt(this.f10670g).array();
        this.f10668e.mo8826b(messageDigest);
        this.f10667d.mo8826b(messageDigest);
        messageDigest.update(bArr);
        Transformation<?> mVar = this.f10673j;
        if (mVar != null) {
            mVar.mo8826b(messageDigest);
        }
        this.f10672i.mo8826b(messageDigest);
        messageDigest.update(m13013c());
        this.f10666c.mo8861d(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ResourceCacheKey)) {
            return false;
        }
        ResourceCacheKey xVar = (ResourceCacheKey) obj;
        if (this.f10670g != xVar.f10670g || this.f10669f != xVar.f10669f || !C1639k.m14085c(this.f10673j, xVar.f10673j) || !this.f10671h.equals(xVar.f10671h) || !this.f10667d.equals(xVar.f10667d) || !this.f10668e.equals(xVar.f10668e) || !this.f10672i.equals(xVar.f10672i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f10667d.hashCode() * 31) + this.f10668e.hashCode()) * 31) + this.f10669f) * 31) + this.f10670g;
        Transformation<?> mVar = this.f10673j;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return (((hashCode * 31) + this.f10671h.hashCode()) * 31) + this.f10672i.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResourceCacheKey{sourceKey=");
        sb.append(this.f10667d);
        sb.append(", signature=");
        sb.append(this.f10668e);
        sb.append(", width=");
        sb.append(this.f10669f);
        sb.append(", height=");
        sb.append(this.f10670g);
        sb.append(", decodedResourceClass=");
        sb.append(this.f10671h);
        sb.append(", transformation='");
        sb.append(this.f10673j);
        sb.append('\'');
        sb.append(", options=");
        sb.append(this.f10672i);
        sb.append('}');
        return sb.toString();
    }
}
