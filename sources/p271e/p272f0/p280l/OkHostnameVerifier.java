package p271e.p272f0.p280l;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p271e.p272f0.C3310c;

/* renamed from: e.f0.l.d */
public final class OkHostnameVerifier implements HostnameVerifier {

    /* renamed from: a */
    public static final OkHostnameVerifier f18438a = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    /* renamed from: a */
    public static List<String> m23514a(X509Certificate x509Certificate) {
        List b = m23515b(x509Certificate, 7);
        List b2 = m23515b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b.size() + b2.size());
        arrayList.addAll(b);
        arrayList.addAll(b2);
        return arrayList;
    }

    /* renamed from: b */
    private static List<String> m23515b(X509Certificate x509Certificate, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List list : subjectAlternativeNames) {
                if (list != null) {
                    if (list.size() >= 2) {
                        Integer num = (Integer) list.get(0);
                        if (num != null) {
                            if (num.intValue() == i) {
                                String str = (String) list.get(1);
                                if (str != null) {
                                    arrayList.add(str);
                                }
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: e */
    private boolean m23516e(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (String d : m23515b(x509Certificate, 2)) {
            if (mo19968d(lowerCase, d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m23517f(String str, X509Certificate x509Certificate) {
        List b = m23515b(x509Certificate, 7);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase((String) b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo19967c(String str, X509Certificate x509Certificate) {
        if (C3310c.m23046I(str)) {
            return m23517f(str, x509Certificate);
        }
        return m23516e(str, x509Certificate);
    }

    /* renamed from: d */
    public boolean mo19968d(String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            String str3 = ".";
            if (!str.startsWith(str3)) {
                String str4 = "..";
                if (!str.endsWith(str4) && str2 != null && str2.length() != 0 && !str2.startsWith(str3) && !str2.endsWith(str4)) {
                    if (!str.endsWith(str3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append('.');
                        str = sb.toString();
                    }
                    if (!str2.endsWith(str3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append('.');
                        str2 = sb2.toString();
                    }
                    String lowerCase = str2.toLowerCase(Locale.US);
                    if (!lowerCase.contains("*")) {
                        return str.equals(lowerCase);
                    }
                    String str5 = "*.";
                    if (!lowerCase.startsWith(str5) || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || str5.equals(lowerCase)) {
                        return false;
                    }
                    String substring = lowerCase.substring(1);
                    if (!str.endsWith(substring)) {
                        return false;
                    }
                    int length = str.length() - substring.length();
                    if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return mo19967c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
