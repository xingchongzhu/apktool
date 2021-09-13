package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.bk */
public class TField {

    /* renamed from: a */
    public final String f16824a;

    /* renamed from: b */
    public final byte f16825b;

    /* renamed from: c */
    public final short f16826c;

    public TField() {
        this("", 0, 0);
    }

    /* renamed from: a */
    public boolean mo19056a(TField bkVar) {
        return this.f16825b == bkVar.f16825b && this.f16826c == bkVar.f16826c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<TField name:'");
        sb.append(this.f16824a);
        sb.append("' type:");
        sb.append(this.f16825b);
        sb.append(" field-id:");
        sb.append(this.f16826c);
        sb.append(">");
        return sb.toString();
    }

    public TField(String str, byte b, short s) {
        this.f16824a = str;
        this.f16825b = b;
        this.f16826c = s;
    }
}
