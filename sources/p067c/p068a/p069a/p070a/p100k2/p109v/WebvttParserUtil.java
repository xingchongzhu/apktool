package p067c.p068a.p069a.p070a.p100k2.p109v;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.v.j */
public final class WebvttParserUtil {

    /* renamed from: a */
    private static final Pattern f8108a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static Matcher m9816a(ParsableByteArray a0Var) {
        String p;
        while (true) {
            String p2 = a0Var.mo7391p();
            if (p2 == null) {
                return null;
            }
            if (f8108a.matcher(p2).matches()) {
                do {
                    p = a0Var.mo7391p();
                    if (p == null) {
                        break;
                    }
                } while (!p.isEmpty());
            } else {
                Matcher matcher = WebvttCueParser.f8082a.matcher(p2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m9817b(ParsableByteArray a0Var) {
        String p = a0Var.mo7391p();
        return p != null && p.startsWith("WEBVTT");
    }

    /* renamed from: c */
    public static float m9818c(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: d */
    public static long m9819d(String str) throws NumberFormatException {
        String[] E0 = Util.m10246E0(str, "\\.");
        long j = 0;
        for (String parseLong : Util.m10244D0(E0[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (E0.length == 2) {
            j2 += Long.parseLong(E0[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: e */
    public static void m9820e(ParsableByteArray a0Var) throws ParserException {
        int e = a0Var.mo7380e();
        if (!m9817b(a0Var)) {
            a0Var.mo7374P(e);
            StringBuilder sb = new StringBuilder();
            sb.append("Expected WEBVTT. Got ");
            sb.append(a0Var.mo7391p());
            throw new ParserException(sb.toString());
        }
    }
}
