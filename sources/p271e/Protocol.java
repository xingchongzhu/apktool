package p271e;

import java.io.IOException;

/* renamed from: e.x */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: h */
    private final String f18715h;

    private Protocol(String str) {
        this.f18715h = str;
    }

    /* renamed from: a */
    public static Protocol m23733a(String str) throws IOException {
        Protocol xVar = HTTP_1_0;
        if (str.equals(xVar.f18715h)) {
            return xVar;
        }
        Protocol xVar2 = HTTP_1_1;
        if (str.equals(xVar2.f18715h)) {
            return xVar2;
        }
        Protocol xVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(xVar3.f18715h)) {
            return xVar3;
        }
        Protocol xVar4 = HTTP_2;
        if (str.equals(xVar4.f18715h)) {
            return xVar4;
        }
        Protocol xVar5 = SPDY_3;
        if (str.equals(xVar5.f18715h)) {
            return xVar5;
        }
        Protocol xVar6 = QUIC;
        if (str.equals(xVar6.f18715h)) {
            return xVar6;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected protocol: ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    public String toString() {
        return this.f18715h;
    }
}
