package com.umeng.analytics.pro;

import com.umeng.analytics.pro.TCompactProtocol.C3122a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.umeng.analytics.pro.az */
public class TSerializer {

    /* renamed from: a */
    private final ByteArrayOutputStream f16755a;

    /* renamed from: b */
    private final TIOStreamTransport f16756b;

    /* renamed from: c */
    private TProtocol f16757c;

    public TSerializer() {
        this(new C3122a());
    }

    /* renamed from: a */
    public byte[] mo18975a(TBase aqVar) throws TException {
        this.f16755a.reset();
        aqVar.write(this.f16757c);
        return this.f16755a.toByteArray();
    }

    /* renamed from: b */
    public String mo18976b(TBase aqVar) throws TException {
        return new String(mo18975a(aqVar));
    }

    public TSerializer(TProtocolFactory brVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f16755a = byteArrayOutputStream;
        TIOStreamTransport cbVar = new TIOStreamTransport((OutputStream) byteArrayOutputStream);
        this.f16756b = cbVar;
        this.f16757c = brVar.mo19053a(cbVar);
    }

    /* renamed from: a */
    public String mo18974a(TBase aqVar, String str) throws TException {
        try {
            return new String(mo18975a(aqVar), str);
        } catch (UnsupportedEncodingException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("JVM DOES NOT SUPPORT ENCODING: ");
            sb.append(str);
            throw new TException(sb.toString());
        }
    }
}
