package p271e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: e.e0 */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: g */
    final String f18083g;

    private TlsVersion(String str) {
        this.f18083g = str;
    }

    /* renamed from: a */
    public static TlsVersion m23022a(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    c = 0;
                    break;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    c = 1;
                    break;
                }
                break;
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    c = 2;
                    break;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    c = 3;
                    break;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return TLS_1_1;
            case 1:
                return TLS_1_2;
            case 2:
                return TLS_1_3;
            case 3:
                return SSL_3_0;
            case 4:
                return TLS_1_0;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected TLS version: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    static List<TlsVersion> m23023b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(m23022a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
