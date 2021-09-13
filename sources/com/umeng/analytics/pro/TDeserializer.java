package com.umeng.analytics.pro;

import com.umeng.analytics.pro.TCompactProtocol.C3122a;
import java.nio.ByteBuffer;

/* renamed from: com.umeng.analytics.pro.at */
public class TDeserializer {

    /* renamed from: a */
    private final TProtocol f16749a;

    /* renamed from: b */
    private final TMemoryInputTransport f16750b;

    public TDeserializer() {
        this(new C3122a());
    }

    /* renamed from: j */
    private TField m21652j(byte[] bArr, TFieldIdEnum axVar, TFieldIdEnum... axVarArr) throws TException {
        this.f16750b.mo19073a(bArr);
        int length = axVarArr.length + 1;
        TFieldIdEnum[] axVarArr2 = new TFieldIdEnum[length];
        int i = 0;
        axVarArr2[0] = axVar;
        int i2 = 0;
        while (i2 < axVarArr.length) {
            int i3 = i2 + 1;
            axVarArr2[i3] = axVarArr[i2];
            i2 = i3;
        }
        this.f16749a.mo19036j();
        TField bkVar = null;
        while (i < length) {
            bkVar = this.f16749a.mo19038l();
            if (bkVar.f16825b == 0 || bkVar.f16826c > axVarArr2[i].mo18938a()) {
                return null;
            }
            if (bkVar.f16826c != axVarArr2[i].mo18938a()) {
                TProtocolUtil.m21871a(this.f16749a, bkVar.f16825b);
                this.f16749a.mo19039m();
            } else {
                i++;
                if (i < length) {
                    this.f16749a.mo19036j();
                }
            }
        }
        return bkVar;
    }

    /* renamed from: a */
    public void mo18963a(TBase aqVar, byte[] bArr) throws TException {
        try {
            this.f16750b.mo19073a(bArr);
            aqVar.read(this.f16749a);
        } finally {
            this.f16750b.mo19075e();
            this.f16749a.mo19054B();
        }
    }

    /* renamed from: b */
    public Byte mo18965b(byte[] bArr, TFieldIdEnum axVar, TFieldIdEnum... axVarArr) throws TException {
        return (Byte) m21651a(3, bArr, axVar, axVarArr);
    }

    /* renamed from: c */
    public Double mo18966c(byte[] bArr, TFieldIdEnum axVar, TFieldIdEnum... axVarArr) throws TException {
        return (Double) m21651a(4, bArr, axVar, axVarArr);
    }

    /* renamed from: d */
    public Short mo18967d(byte[] bArr, TFieldIdEnum axVar, TFieldIdEnum... axVarArr) throws TException {
        return (Short) m21651a(6, bArr, axVar, axVarArr);
    }

    /* renamed from: e */
    public Integer mo18968e(byte[] bArr, TFieldIdEnum axVar, TFieldIdEnum... axVarArr) throws TException {
        return (Integer) m21651a(8, bArr, axVar, axVarArr);
    }

    /* renamed from: f */
    public Long mo18969f(byte[] bArr, TFieldIdEnum axVar, TFieldIdEnum... axVarArr) throws TException {
        return (Long) m21651a(10, bArr, axVar, axVarArr);
    }

    /* renamed from: g */
    public String mo18970g(byte[] bArr, TFieldIdEnum axVar, TFieldIdEnum... axVarArr) throws TException {
        return (String) m21651a(11, bArr, axVar, axVarArr);
    }

    /* renamed from: h */
    public ByteBuffer mo18971h(byte[] bArr, TFieldIdEnum axVar, TFieldIdEnum... axVarArr) throws TException {
        return (ByteBuffer) m21651a(100, bArr, axVar, axVarArr);
    }

    /* renamed from: i */
    public Short mo18972i(byte[] bArr, TFieldIdEnum axVar, TFieldIdEnum... axVarArr) throws TException {
        Short sh;
        try {
            if (m21652j(bArr, axVar, axVarArr) != null) {
                this.f16749a.mo19036j();
                sh = Short.valueOf(this.f16749a.mo19038l().f16826c);
            } else {
                sh = null;
            }
            this.f16750b.mo19075e();
            this.f16749a.mo19054B();
            return sh;
        } catch (Exception e) {
            throw new TException((Throwable) e);
        } catch (Throwable th) {
            this.f16750b.mo19075e();
            this.f16749a.mo19054B();
            throw th;
        }
    }

    public TDeserializer(TProtocolFactory brVar) {
        TMemoryInputTransport ccVar = new TMemoryInputTransport();
        this.f16750b = ccVar;
        this.f16749a = brVar.mo19053a(ccVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("JVM DOES NOT SUPPORT ENCODING: ");
        r3.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        throw new com.umeng.analytics.pro.TException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r1.f16749a.mo19054B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18962a(com.umeng.analytics.pro.TBase r2, java.lang.String r3, java.lang.String r4) throws com.umeng.analytics.pro.TException {
        /*
            r1 = this;
            byte[] r3 = r3.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x000f }
            r1.mo18963a(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x000f }
            com.umeng.analytics.pro.bp r2 = r1.f16749a
            r2.mo19054B()
            return
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            com.umeng.analytics.pro.aw r2 = new com.umeng.analytics.pro.aw     // Catch:{ all -> 0x000d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x000d }
            r3.<init>()     // Catch:{ all -> 0x000d }
            java.lang.String r0 = "JVM DOES NOT SUPPORT ENCODING: "
            r3.append(r0)     // Catch:{ all -> 0x000d }
            r3.append(r4)     // Catch:{ all -> 0x000d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x000d }
            r2.<init>(r3)     // Catch:{ all -> 0x000d }
            throw r2     // Catch:{ all -> 0x000d }
        L_0x0026:
            com.umeng.analytics.pro.bp r3 = r1.f16749a
            r3.mo19054B()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.TDeserializer.mo18962a(com.umeng.analytics.pro.aq, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo18964a(TBase aqVar, byte[] bArr, TFieldIdEnum axVar, TFieldIdEnum... axVarArr) throws TException {
        try {
            if (m21652j(bArr, axVar, axVarArr) != null) {
                aqVar.read(this.f16749a);
            }
            this.f16750b.mo19075e();
            this.f16749a.mo19054B();
        } catch (Exception e) {
            throw new TException((Throwable) e);
        } catch (Throwable th) {
            this.f16750b.mo19075e();
            this.f16749a.mo19054B();
            throw th;
        }
    }

    /* renamed from: a */
    public Boolean mo18960a(byte[] bArr, TFieldIdEnum axVar, TFieldIdEnum... axVarArr) throws TException {
        return (Boolean) m21651a(2, bArr, axVar, axVarArr);
    }

    /* renamed from: a */
    private Object m21651a(byte b, byte[] bArr, TFieldIdEnum axVar, TFieldIdEnum... axVarArr) throws TException {
        Object obj;
        try {
            TField j = m21652j(bArr, axVar, axVarArr);
            if (j != null) {
                if (b != 2) {
                    if (b != 3) {
                        if (b != 4) {
                            if (b != 6) {
                                if (b != 8) {
                                    if (b != 100) {
                                        if (b != 10) {
                                            if (b == 11) {
                                                if (j.f16825b == 11) {
                                                    obj = this.f16749a.mo19052z();
                                                    this.f16750b.mo19075e();
                                                    this.f16749a.mo19054B();
                                                    return obj;
                                                }
                                            }
                                        } else if (j.f16825b == 10) {
                                            obj = Long.valueOf(this.f16749a.mo19050x());
                                            this.f16750b.mo19075e();
                                            this.f16749a.mo19054B();
                                            return obj;
                                        }
                                    } else if (j.f16825b == 11) {
                                        obj = this.f16749a.mo19009A();
                                        this.f16750b.mo19075e();
                                        this.f16749a.mo19054B();
                                        return obj;
                                    }
                                } else if (j.f16825b == 8) {
                                    obj = Integer.valueOf(this.f16749a.mo19049w());
                                    this.f16750b.mo19075e();
                                    this.f16749a.mo19054B();
                                    return obj;
                                }
                            } else if (j.f16825b == 6) {
                                obj = Short.valueOf(this.f16749a.mo19048v());
                                this.f16750b.mo19075e();
                                this.f16749a.mo19054B();
                                return obj;
                            }
                        } else if (j.f16825b == 4) {
                            obj = Double.valueOf(this.f16749a.mo19051y());
                            this.f16750b.mo19075e();
                            this.f16749a.mo19054B();
                            return obj;
                        }
                    } else if (j.f16825b == 3) {
                        obj = Byte.valueOf(this.f16749a.mo19047u());
                        this.f16750b.mo19075e();
                        this.f16749a.mo19054B();
                        return obj;
                    }
                } else if (j.f16825b == 2) {
                    obj = Boolean.valueOf(this.f16749a.mo19046t());
                    this.f16750b.mo19075e();
                    this.f16749a.mo19054B();
                    return obj;
                }
            }
            obj = null;
            this.f16750b.mo19075e();
            this.f16749a.mo19054B();
            return obj;
        } catch (Exception e) {
            throw new TException((Throwable) e);
        } catch (Throwable th) {
            this.f16750b.mo19075e();
            this.f16749a.mo19054B();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo18961a(TBase aqVar, String str) throws TException {
        mo18963a(aqVar, str.getBytes());
    }
}
