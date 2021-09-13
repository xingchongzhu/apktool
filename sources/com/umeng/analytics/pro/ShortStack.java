package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.ao */
public class ShortStack {

    /* renamed from: a */
    private short[] f16733a;

    /* renamed from: b */
    private int f16734b = -1;

    public ShortStack(int i) {
        this.f16733a = new short[i];
    }

    /* renamed from: d */
    private void m21620d() {
        short[] sArr = this.f16733a;
        short[] sArr2 = new short[(sArr.length * 2)];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.f16733a = sArr2;
    }

    /* renamed from: a */
    public short mo18950a() {
        short[] sArr = this.f16733a;
        int i = this.f16734b;
        this.f16734b = i - 1;
        return sArr[i];
    }

    /* renamed from: b */
    public short mo18952b() {
        return this.f16733a[this.f16734b];
    }

    /* renamed from: c */
    public void mo18953c() {
        this.f16734b = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ShortStack vector:[");
        for (int i = 0; i < this.f16733a.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            if (i == this.f16734b) {
                sb.append(">>");
            }
            sb.append(this.f16733a[i]);
            if (i == this.f16734b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo18951a(short s) {
        if (this.f16733a.length == this.f16734b + 1) {
            m21620d();
        }
        short[] sArr = this.f16733a;
        int i = this.f16734b + 1;
        this.f16734b = i;
        sArr[i] = s;
    }
}
