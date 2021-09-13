package com.bumptech.glide.load;

import com.bumptech.glide.p174t.C1638j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.h */
public final class Option<T> {

    /* renamed from: a */
    private static final C1439b<Object> f10344a = new C1438a();

    /* renamed from: b */
    private final T f10345b;

    /* renamed from: c */
    private final C1439b<T> f10346c;

    /* renamed from: d */
    private final String f10347d;

    /* renamed from: e */
    private volatile byte[] f10348e;

    /* renamed from: com.bumptech.glide.load.h$a */
    /* compiled from: Option */
    class C1438a implements C1439b<Object> {
        C1438a() {
        }

        /* renamed from: a */
        public void mo8834a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: com.bumptech.glide.load.h$b */
    /* compiled from: Option */
    public interface C1439b<T> {
        /* renamed from: a */
        void mo8834a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private Option(String str, T t, C1439b<T> bVar) {
        this.f10347d = C1638j.m14079b(str);
        this.f10345b = t;
        this.f10346c = (C1439b) C1638j.m14081d(bVar);
    }

    /* renamed from: a */
    public static <T> Option<T> m12603a(String str, T t, C1439b<T> bVar) {
        return new Option<>(str, t, bVar);
    }

    /* renamed from: b */
    private static <T> C1439b<T> m12604b() {
        return f10344a;
    }

    /* renamed from: d */
    private byte[] m12605d() {
        if (this.f10348e == null) {
            this.f10348e = this.f10347d.getBytes(Key.f10343a);
        }
        return this.f10348e;
    }

    /* renamed from: e */
    public static <T> Option<T> m12606e(String str) {
        return new Option<>(str, null, m12604b());
    }

    /* renamed from: f */
    public static <T> Option<T> m12607f(String str, T t) {
        return new Option<>(str, t, m12604b());
    }

    /* renamed from: c */
    public T mo8829c() {
        return this.f10345b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Option)) {
            return false;
        }
        return this.f10347d.equals(((Option) obj).f10347d);
    }

    /* renamed from: g */
    public void mo8831g(T t, MessageDigest messageDigest) {
        this.f10346c.mo8834a(m12605d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f10347d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Option{key='");
        sb.append(this.f10347d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
