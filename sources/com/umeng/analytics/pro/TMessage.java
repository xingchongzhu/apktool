package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.bn */
public final class TMessage {

    /* renamed from: a */
    public final String f16832a;

    /* renamed from: b */
    public final byte f16833b;

    /* renamed from: c */
    public final int f16834c;

    public TMessage() {
        this("", 0, 0);
    }

    /* renamed from: a */
    public boolean mo19058a(TMessage bnVar) {
        return this.f16832a.equals(bnVar.f16832a) && this.f16833b == bnVar.f16833b && this.f16834c == bnVar.f16834c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TMessage) {
            return mo19058a((TMessage) obj);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<TMessage name:'");
        sb.append(this.f16832a);
        sb.append("' type: ");
        sb.append(this.f16833b);
        sb.append(" seqid:");
        sb.append(this.f16834c);
        sb.append(">");
        return sb.toString();
    }

    public TMessage(String str, byte b, int i) {
        this.f16832a = str;
        this.f16833b = b;
        this.f16834c = i;
    }
}
