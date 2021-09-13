package com.umeng.analytics.pro;

import com.umeng.analytics.pro.TCompactProtocol.C3122a;

/* renamed from: com.umeng.analytics.pro.bs */
public class TProtocolUtil {

    /* renamed from: a */
    private static int f16848a = Integer.MAX_VALUE;

    /* renamed from: a */
    public static void m21870a(int i) {
        f16848a = i;
    }

    /* renamed from: a */
    public static void m21871a(TProtocol bpVar, byte b) throws TException {
        m21872a(bpVar, b, f16848a);
    }

    /* renamed from: a */
    public static void m21872a(TProtocol bpVar, byte b, int i) throws TException {
        if (i > 0) {
            int i2 = 0;
            switch (b) {
                case 2:
                    bpVar.mo19046t();
                    return;
                case 3:
                    bpVar.mo19047u();
                    return;
                case 4:
                    bpVar.mo19051y();
                    return;
                case 6:
                    bpVar.mo19048v();
                    return;
                case 8:
                    bpVar.mo19049w();
                    return;
                case 10:
                    bpVar.mo19050x();
                    return;
                case 11:
                    bpVar.mo19009A();
                    return;
                case 12:
                    bpVar.mo19036j();
                    while (true) {
                        byte b2 = bpVar.mo19038l().f16825b;
                        if (b2 == 0) {
                            bpVar.mo19037k();
                            return;
                        } else {
                            m21872a(bpVar, b2, i - 1);
                            bpVar.mo19039m();
                        }
                    }
                case 13:
                    TMap n = bpVar.mo19040n();
                    while (i2 < n.f16831c) {
                        int i3 = i - 1;
                        m21872a(bpVar, n.f16829a, i3);
                        m21872a(bpVar, n.f16830b, i3);
                        i2++;
                    }
                    bpVar.mo19041o();
                    return;
                case 14:
                    TSet r = bpVar.mo19044r();
                    while (i2 < r.f16850b) {
                        m21872a(bpVar, r.f16849a, i - 1);
                        i2++;
                    }
                    bpVar.mo19045s();
                    return;
                case 15:
                    TList p = bpVar.mo19042p();
                    while (i2 < p.f16828b) {
                        m21872a(bpVar, p.f16827a, i - 1);
                        i2++;
                    }
                    bpVar.mo19043q();
                    return;
                default:
                    return;
            }
        } else {
            throw new TException("Maximum skip depth exceeded");
        }
    }

    /* renamed from: a */
    public static TProtocolFactory m21869a(byte[] bArr, TProtocolFactory brVar) {
        if (bArr[0] > 16) {
            return new C3122a();
        }
        return (bArr.length <= 1 || (bArr[1] & 128) == 0) ? brVar : new C3122a();
    }
}
