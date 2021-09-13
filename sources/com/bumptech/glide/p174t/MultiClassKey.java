package com.bumptech.glide.p174t;

/* renamed from: com.bumptech.glide.t.i */
public class MultiClassKey {

    /* renamed from: a */
    private Class<?> f11255a;

    /* renamed from: b */
    private Class<?> f11256b;

    /* renamed from: c */
    private Class<?> f11257c;

    public MultiClassKey() {
    }

    /* renamed from: a */
    public void mo9580a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f11255a = cls;
        this.f11256b = cls2;
        this.f11257c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MultiClassKey.class != obj.getClass()) {
            return false;
        }
        MultiClassKey iVar = (MultiClassKey) obj;
        return this.f11255a.equals(iVar.f11255a) && this.f11256b.equals(iVar.f11256b) && C1639k.m14085c(this.f11257c, iVar.f11257c);
    }

    public int hashCode() {
        int hashCode = ((this.f11255a.hashCode() * 31) + this.f11256b.hashCode()) * 31;
        Class<?> cls = this.f11257c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiClassKey{first=");
        sb.append(this.f11255a);
        sb.append(", second=");
        sb.append(this.f11256b);
        sb.append('}');
        return sb.toString();
    }

    public MultiClassKey(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mo9580a(cls, cls2, cls3);
    }
}
