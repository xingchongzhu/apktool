package p271e.p272f0.p277i;

import p271e.C3370s;
import p271e.p272f0.C3310c;
import p281f.ByteString;

/* renamed from: e.f0.i.c */
public final class Header {

    /* renamed from: a */
    public static final ByteString f18243a = ByteString.m23878g(":");

    /* renamed from: b */
    public static final ByteString f18244b = ByteString.m23878g(":status");

    /* renamed from: c */
    public static final ByteString f18245c = ByteString.m23878g(":method");

    /* renamed from: d */
    public static final ByteString f18246d = ByteString.m23878g(":path");

    /* renamed from: e */
    public static final ByteString f18247e = ByteString.m23878g(":scheme");

    /* renamed from: f */
    public static final ByteString f18248f = ByteString.m23878g(":authority");

    /* renamed from: g */
    public final ByteString f18249g;

    /* renamed from: h */
    public final ByteString f18250h;

    /* renamed from: i */
    final int f18251i;

    /* renamed from: e.f0.i.c$a */
    /* compiled from: Header */
    interface C3327a {
        /* renamed from: a */
        void mo19829a(C3370s sVar);
    }

    public Header(String str, String str2) {
        this(ByteString.m23878g(str), ByteString.m23878g(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Header)) {
            return false;
        }
        Header cVar = (Header) obj;
        if (!this.f18249g.equals(cVar.f18249g) || !this.f18250h.equals(cVar.f18250h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f18249g.hashCode()) * 31) + this.f18250h.hashCode();
    }

    public String toString() {
        return C3310c.m23063q("%s: %s", this.f18249g.mo20253t(), this.f18250h.mo20253t());
    }

    public Header(ByteString fVar, String str) {
        this(fVar, ByteString.m23878g(str));
    }

    public Header(ByteString fVar, ByteString fVar2) {
        this.f18249g = fVar;
        this.f18250h = fVar2;
        this.f18251i = fVar.mo20248o() + 32 + fVar2.mo20248o();
    }
}
