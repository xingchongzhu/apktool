package p067c.p068a.p069a.p070a.p100k2.p109v;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ColorParser;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.v.c */
final class CssParser {

    /* renamed from: a */
    private static final Pattern f8057a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: b */
    private final ParsableByteArray f8058b = new ParsableByteArray();

    /* renamed from: c */
    private final StringBuilder f8059c = new StringBuilder();

    /* renamed from: a */
    private void m9731a(WebvttCssStyle fVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f8057a.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    fVar.mo7179x((String) Assertions.m10153e(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] D0 = Util.m10244D0(str, "\\.");
            String str2 = D0[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                fVar.mo7178w(str2.substring(0, indexOf2));
                fVar.mo7177v(str2.substring(indexOf2 + 1));
            } else {
                fVar.mo7178w(str2);
            }
            if (D0.length > 1) {
                fVar.mo7176u((String[]) Util.m10322w0(D0, 1, D0.length));
            }
        }
    }

    /* renamed from: b */
    private static boolean m9732b(ParsableByteArray a0Var) {
        int e = a0Var.mo7380e();
        int f = a0Var.mo7381f();
        byte[] d = a0Var.mo7379d();
        if (e + 2 <= f) {
            int i = e + 1;
            if (d[e] == 47) {
                int i2 = i + 1;
                if (d[i] == 42) {
                    while (true) {
                        int i3 = i2 + 1;
                        if (i3 >= f) {
                            a0Var.mo7375Q(f - a0Var.mo7380e());
                            return true;
                        } else if (((char) d[i2]) == '*' && ((char) d[i3]) == '/') {
                            i2 = i3 + 1;
                            f = i2;
                        } else {
                            i2 = i3;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m9733c(ParsableByteArray a0Var) {
        char j = m9739j(a0Var, a0Var.mo7380e());
        if (j != 9 && j != 10 && j != 12 && j != 13 && j != ' ') {
            return false;
        }
        a0Var.mo7375Q(1);
        return true;
    }

    /* renamed from: e */
    private static String m9734e(ParsableByteArray a0Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int e = a0Var.mo7380e();
        int f = a0Var.mo7381f();
        while (e < f && !z) {
            char c = (char) a0Var.mo7379d()[e];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                e++;
                sb.append(c);
            }
        }
        a0Var.mo7375Q(e - a0Var.mo7380e());
        return sb.toString();
    }

    /* renamed from: f */
    static String m9735f(ParsableByteArray a0Var, StringBuilder sb) {
        m9742m(a0Var);
        if (a0Var.mo7376a() == 0) {
            return null;
        }
        String e = m9734e(a0Var, sb);
        String str = "";
        if (!str.equals(e)) {
            return e;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append((char) a0Var.mo7362D());
        return sb2.toString();
    }

    /* renamed from: g */
    private static String m9736g(ParsableByteArray a0Var, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int e = a0Var.mo7380e();
            String f = m9735f(a0Var, sb);
            if (f == null) {
                return null;
            }
            if ("}".equals(f) || ";".equals(f)) {
                a0Var.mo7374P(e);
                z = true;
            } else {
                sb2.append(f);
            }
        }
        return sb2.toString();
    }

    /* renamed from: h */
    private static String m9737h(ParsableByteArray a0Var, StringBuilder sb) {
        m9742m(a0Var);
        if (a0Var.mo7376a() < 5) {
            return null;
        }
        if (!"::cue".equals(a0Var.mo7359A(5))) {
            return null;
        }
        int e = a0Var.mo7380e();
        String f = m9735f(a0Var, sb);
        if (f == null) {
            return null;
        }
        if ("{".equals(f)) {
            a0Var.mo7374P(e);
            return "";
        }
        String k = "(".equals(f) ? m9740k(a0Var) : null;
        if (!")".equals(m9735f(a0Var, sb))) {
            return null;
        }
        return k;
    }

    /* renamed from: i */
    private static void m9738i(ParsableByteArray a0Var, WebvttCssStyle fVar, StringBuilder sb) {
        m9742m(a0Var);
        String e = m9734e(a0Var, sb);
        String str = "";
        if (!str.equals(e)) {
            if (":".equals(m9735f(a0Var, sb))) {
                m9742m(a0Var);
                String g = m9736g(a0Var, sb);
                if (g != null && !str.equals(g)) {
                    int e2 = a0Var.mo7380e();
                    String f = m9735f(a0Var, sb);
                    if (!";".equals(f)) {
                        if ("}".equals(f)) {
                            a0Var.mo7374P(e2);
                        }
                    }
                    if ("color".equals(e)) {
                        fVar.mo7172q(ColorParser.m10187b(g));
                    } else if ("background-color".equals(e)) {
                        fVar.mo7169n(ColorParser.m10187b(g));
                    } else {
                        boolean z = true;
                        if ("ruby-position".equals(e)) {
                            if ("over".equals(g)) {
                                fVar.mo7175t(1);
                            } else if ("under".equals(g)) {
                                fVar.mo7175t(2);
                            }
                        } else if ("text-combine-upright".equals(e)) {
                            if (!"all".equals(g) && !g.startsWith("digits")) {
                                z = false;
                            }
                            fVar.mo7171p(z);
                        } else if ("text-decoration".equals(e)) {
                            if ("underline".equals(g)) {
                                fVar.mo7180y(true);
                            }
                        } else if ("font-family".equals(e)) {
                            fVar.mo7173r(g);
                        } else if ("font-weight".equals(e)) {
                            if ("bold".equals(g)) {
                                fVar.mo7170o(true);
                            }
                        } else if ("font-style".equals(e) && "italic".equals(g)) {
                            fVar.mo7174s(true);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private static char m9739j(ParsableByteArray a0Var, int i) {
        return (char) a0Var.mo7379d()[i];
    }

    /* renamed from: k */
    private static String m9740k(ParsableByteArray a0Var) {
        int e = a0Var.mo7380e();
        int f = a0Var.mo7381f();
        boolean z = false;
        while (e < f && !z) {
            int i = e + 1;
            z = ((char) a0Var.mo7379d()[e]) == ')';
            e = i;
        }
        return a0Var.mo7359A((e - 1) - a0Var.mo7380e()).trim();
    }

    /* renamed from: l */
    static void m9741l(ParsableByteArray a0Var) {
        do {
        } while (!TextUtils.isEmpty(a0Var.mo7391p()));
    }

    /* renamed from: m */
    static void m9742m(ParsableByteArray a0Var) {
        while (true) {
            boolean z = true;
            while (a0Var.mo7376a() > 0 && z) {
                if (!m9733c(a0Var) && !m9732b(a0Var)) {
                    z = false;
                }
            }
            return;
        }
    }

    /* renamed from: d */
    public List<WebvttCssStyle> mo7155d(ParsableByteArray a0Var) {
        String str;
        this.f8059c.setLength(0);
        int e = a0Var.mo7380e();
        m9741l(a0Var);
        this.f8058b.mo7372N(a0Var.mo7379d(), a0Var.mo7380e());
        this.f8058b.mo7374P(e);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String h = m9737h(this.f8058b, this.f8059c);
            if (h == null) {
                return arrayList;
            }
            if (!"{".equals(m9735f(this.f8058b, this.f8059c))) {
                return arrayList;
            }
            WebvttCssStyle fVar = new WebvttCssStyle();
            m9731a(fVar, h);
            Object obj = null;
            boolean z = false;
            while (true) {
                str = "}";
                if (z) {
                    break;
                }
                int e2 = this.f8058b.mo7380e();
                String f = m9735f(this.f8058b, this.f8059c);
                boolean z2 = f == null || str.equals(f);
                if (!z2) {
                    this.f8058b.mo7374P(e2);
                    m9738i(this.f8058b, fVar, this.f8059c);
                }
                obj = f;
                z = z2;
            }
            if (str.equals(obj)) {
                arrayList.add(fVar);
            }
        }
    }
}
