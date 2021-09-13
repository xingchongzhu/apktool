package com.umeng.analytics.pro;

import java.util.BitSet;

/* renamed from: com.umeng.analytics.pro.bv */
public final class TTupleProtocol extends TCompactProtocol {

    /* renamed from: com.umeng.analytics.pro.bv$a */
    /* compiled from: TTupleProtocol */
    public static class C3124a implements TProtocolFactory {
        /* renamed from: a */
        public TProtocol mo19053a(TTransport cdVar) {
            return new TTupleProtocol(cdVar);
        }
    }

    public TTupleProtocol(TTransport cdVar) {
        super(cdVar);
    }

    /* renamed from: D */
    public Class<? extends IScheme> mo19062D() {
        return TupleScheme.class;
    }

    /* renamed from: a */
    public void mo19064a(BitSet bitSet, int i) throws TException {
        for (byte a : m21874b(bitSet, i)) {
            mo19011a(a);
        }
    }

    /* renamed from: b */
    public BitSet mo19065b(int i) throws TException {
        double d = (double) i;
        Double.isNaN(d);
        int ceil = (int) Math.ceil(d / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i2 = 0; i2 < ceil; i2++) {
            bArr[i2] = mo19047u();
        }
        return m21873a(bArr);
    }

    /* renamed from: a */
    public static BitSet m21873a(byte[] bArr) {
        BitSet bitSet = new BitSet();
        for (int i = 0; i < bArr.length * 8; i++) {
            if ((bArr[(bArr.length - (i / 8)) - 1] & (1 << (i % 8))) > 0) {
                bitSet.set(i);
            }
        }
        return bitSet;
    }

    /* renamed from: b */
    public static byte[] m21874b(BitSet bitSet, int i) {
        double d = (double) i;
        Double.isNaN(d);
        int ceil = (int) Math.ceil(d / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i2 = 0; i2 < bitSet.length(); i2++) {
            if (bitSet.get(i2)) {
                int i3 = (ceil - (i2 / 8)) - 1;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        return bArr;
    }
}
