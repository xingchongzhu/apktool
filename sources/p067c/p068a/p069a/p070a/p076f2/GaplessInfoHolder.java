package p067c.p068a.p069a.p070a.p076f2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.p093m.CommentFrame;
import p067c.p068a.p069a.p070a.p088h2.p093m.InternalFrame;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.u */
public final class GaplessInfoHolder {

    /* renamed from: a */
    private static final Pattern f7007a = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: b */
    public int f7008b = -1;

    /* renamed from: c */
    public int f7009c = -1;

    /* renamed from: b */
    private boolean m8319b(String str) {
        Matcher matcher = f7007a.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) Util.m10293i(matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) Util.m10293i(matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f7008b = parseInt;
                    this.f7009c = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo6389a() {
        return (this.f7008b == -1 || this.f7009c == -1) ? false : true;
    }

    /* renamed from: c */
    public boolean mo6390c(Metadata aVar) {
        for (int i = 0; i < aVar.mo6552o(); i++) {
            C1034b n = aVar.mo6551n(i);
            String str = "iTunSMPB";
            if (n instanceof CommentFrame) {
                CommentFrame fVar = (CommentFrame) n;
                if (str.equals(fVar.f7288c) && m8319b(fVar.f7289d)) {
                    return true;
                }
            } else if (n instanceof InternalFrame) {
                InternalFrame jVar = (InternalFrame) n;
                if ("com.apple.iTunes".equals(jVar.f7300b) && str.equals(jVar.f7301c) && m8319b(jVar.f7302d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo6391d(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f7008b = i2;
        this.f7009c = i3;
        return true;
    }
}
