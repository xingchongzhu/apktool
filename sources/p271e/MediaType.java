package p271e;

import com.fasterxml.jackson.core.JsonFactory;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: e.v */
public final class MediaType {

    /* renamed from: a */
    private static final Pattern f18645a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b */
    private static final Pattern f18646b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: c */
    private final String f18647c;

    /* renamed from: d */
    private final String f18648d;

    /* renamed from: e */
    private final String f18649e;

    /* renamed from: f */
    private final String f18650f;

    private MediaType(String str, String str2, String str3, String str4) {
        this.f18647c = str;
        this.f18648d = str2;
        this.f18649e = str3;
        this.f18650f = str4;
    }

    /* renamed from: c */
    public static MediaType m23688c(String str) {
        Matcher matcher = f18645a.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            String str2 = null;
            Matcher matcher2 = f18646b.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                String str3 = "\" for: \"";
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 != null) {
                            String str4 = "'";
                            if (group3.startsWith(str4) && group3.endsWith(str4) && group3.length() > 2) {
                                group3 = group3.substring(1, group3.length() - 1);
                            }
                        } else {
                            group3 = matcher2.group(3);
                        }
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Multiple charsets defined: \"");
                            sb.append(str2);
                            sb.append("\" and: \"");
                            sb.append(group3);
                            sb.append(str3);
                            sb.append(str);
                            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    end = matcher2.end();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    sb2.append(str.substring(end));
                    sb2.append(str3);
                    sb2.append(str);
                    sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            return new MediaType(str, lowerCase, lowerCase2, str2);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("No subtype found for: \"");
        sb3.append(str);
        sb3.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: d */
    public static MediaType m23689d(String str) {
        try {
            return m23688c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Charset mo20095a() {
        return mo20096b(null);
    }

    /* renamed from: b */
    public Charset mo20096b(Charset charset) {
        try {
            String str = this.f18650f;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && ((MediaType) obj).f18647c.equals(this.f18647c);
    }

    public int hashCode() {
        return this.f18647c.hashCode();
    }

    public String toString() {
        return this.f18647c;
    }
}
