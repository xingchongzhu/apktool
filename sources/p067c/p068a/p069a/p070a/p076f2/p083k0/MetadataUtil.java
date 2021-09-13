package p067c.p068a.p069a.p070a.p076f2.p083k0;

import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p076f2.GaplessInfoHolder;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.p093m.ApicFrame;
import p067c.p068a.p069a.p070a.p088h2.p093m.CommentFrame;
import p067c.p068a.p069a.p070a.p088h2.p093m.Id3Frame;
import p067c.p068a.p069a.p070a.p088h2.p093m.InternalFrame;
import p067c.p068a.p069a.p070a.p088h2.p093m.TextInformationFrame;
import p067c.p068a.p069a.p070a.p088h2.p094n.MdtaMetadataEntry;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.k0.j */
final class MetadataUtil {

    /* renamed from: a */
    static final String[] f6424a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    private static CommentFrame m7781a(int i, ParsableByteArray a0Var) {
        int n = a0Var.mo7389n();
        if (a0Var.mo7389n() == 1684108385) {
            a0Var.mo7375Q(8);
            String y = a0Var.mo7400y(n - 16);
            return new CommentFrame("und", y, y);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse comment attribute: ");
        sb.append(Atom.m7675a(i));
        Log.m10386h("MetadataUtil", sb.toString());
        return null;
    }

    /* renamed from: b */
    private static ApicFrame m7782b(ParsableByteArray a0Var) {
        int n = a0Var.mo7389n();
        String str = "MetadataUtil";
        if (a0Var.mo7389n() == 1684108385) {
            int b = Atom.m7676b(a0Var.mo7389n());
            String str2 = b == 13 ? "image/jpeg" : b == 14 ? "image/png" : null;
            if (str2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized cover art flags: ");
                sb.append(b);
                Log.m10386h(str, sb.toString());
                return null;
            }
            a0Var.mo7375Q(4);
            int i = n - 16;
            byte[] bArr = new byte[i];
            a0Var.mo7385j(bArr, 0, i);
            return new ApicFrame(str2, null, 3, bArr);
        }
        Log.m10386h(str, "Failed to parse cover art attribute");
        return null;
    }

    /* renamed from: c */
    public static C1034b m7783c(ParsableByteArray a0Var) {
        int e = a0Var.mo7380e() + a0Var.mo7389n();
        int n = a0Var.mo7389n();
        int i = (n >> 24) & 255;
        if (i == 169 || i == 253) {
            int i2 = 16777215 & n;
            if (i2 == 6516084) {
                CommentFrame a = m7781a(n, a0Var);
                a0Var.mo7374P(e);
                return a;
            } else if (i2 == 7233901 || i2 == 7631467) {
                TextInformationFrame h = m7788h(n, "TIT2", a0Var);
                a0Var.mo7374P(e);
                return h;
            } else if (i2 == 6516589 || i2 == 7828084) {
                TextInformationFrame h2 = m7788h(n, "TCOM", a0Var);
                a0Var.mo7374P(e);
                return h2;
            } else if (i2 == 6578553) {
                TextInformationFrame h3 = m7788h(n, "TDRC", a0Var);
                a0Var.mo7374P(e);
                return h3;
            } else if (i2 == 4280916) {
                TextInformationFrame h4 = m7788h(n, "TPE1", a0Var);
                a0Var.mo7374P(e);
                return h4;
            } else if (i2 == 7630703) {
                TextInformationFrame h5 = m7788h(n, "TSSE", a0Var);
                a0Var.mo7374P(e);
                return h5;
            } else if (i2 == 6384738) {
                TextInformationFrame h6 = m7788h(n, "TALB", a0Var);
                a0Var.mo7374P(e);
                return h6;
            } else if (i2 == 7108978) {
                TextInformationFrame h7 = m7788h(n, "USLT", a0Var);
                a0Var.mo7374P(e);
                return h7;
            } else if (i2 == 6776174) {
                TextInformationFrame h8 = m7788h(n, "TCON", a0Var);
                a0Var.mo7374P(e);
                return h8;
            } else if (i2 == 6779504) {
                TextInformationFrame h9 = m7788h(n, "TIT1", a0Var);
                a0Var.mo7374P(e);
                return h9;
            }
        } else if (n == 1735291493) {
            try {
                return m7787g(a0Var);
            } finally {
                a0Var.mo7374P(e);
            }
        } else if (n == 1684632427) {
            TextInformationFrame d = m7784d(n, "TPOS", a0Var);
            a0Var.mo7374P(e);
            return d;
        } else if (n == 1953655662) {
            TextInformationFrame d2 = m7784d(n, "TRCK", a0Var);
            a0Var.mo7374P(e);
            return d2;
        } else if (n == 1953329263) {
            Id3Frame i3 = m7789i(n, "TBPM", a0Var, true, false);
            a0Var.mo7374P(e);
            return i3;
        } else if (n == 1668311404) {
            Id3Frame i4 = m7789i(n, "TCMP", a0Var, true, true);
            a0Var.mo7374P(e);
            return i4;
        } else if (n == 1668249202) {
            ApicFrame b = m7782b(a0Var);
            a0Var.mo7374P(e);
            return b;
        } else if (n == 1631670868) {
            TextInformationFrame h10 = m7788h(n, "TPE2", a0Var);
            a0Var.mo7374P(e);
            return h10;
        } else if (n == 1936682605) {
            TextInformationFrame h11 = m7788h(n, "TSOT", a0Var);
            a0Var.mo7374P(e);
            return h11;
        } else if (n == 1936679276) {
            TextInformationFrame h12 = m7788h(n, "TSO2", a0Var);
            a0Var.mo7374P(e);
            return h12;
        } else if (n == 1936679282) {
            TextInformationFrame h13 = m7788h(n, "TSOA", a0Var);
            a0Var.mo7374P(e);
            return h13;
        } else if (n == 1936679265) {
            TextInformationFrame h14 = m7788h(n, "TSOP", a0Var);
            a0Var.mo7374P(e);
            return h14;
        } else if (n == 1936679791) {
            TextInformationFrame h15 = m7788h(n, "TSOC", a0Var);
            a0Var.mo7374P(e);
            return h15;
        } else if (n == 1920233063) {
            Id3Frame i5 = m7789i(n, "ITUNESADVISORY", a0Var, false, false);
            a0Var.mo7374P(e);
            return i5;
        } else if (n == 1885823344) {
            Id3Frame i6 = m7789i(n, "ITUNESGAPLESS", a0Var, false, true);
            a0Var.mo7374P(e);
            return i6;
        } else if (n == 1936683886) {
            TextInformationFrame h16 = m7788h(n, "TVSHOWSORT", a0Var);
            a0Var.mo7374P(e);
            return h16;
        } else if (n == 1953919848) {
            TextInformationFrame h17 = m7788h(n, "TVSHOW", a0Var);
            a0Var.mo7374P(e);
            return h17;
        } else if (n == 757935405) {
            Id3Frame e2 = m7785e(a0Var, e);
            a0Var.mo7374P(e);
            return e2;
        }
        String str = "MetadataUtil";
        StringBuilder sb = new StringBuilder();
        sb.append("Skipped unknown metadata entry: ");
        sb.append(Atom.m7675a(n));
        Log.m10380b(str, sb.toString());
        a0Var.mo7374P(e);
        return null;
    }

    /* renamed from: d */
    private static TextInformationFrame m7784d(int i, String str, ParsableByteArray a0Var) {
        int n = a0Var.mo7389n();
        if (a0Var.mo7389n() == 1684108385 && n >= 22) {
            a0Var.mo7375Q(10);
            int J = a0Var.mo7368J();
            if (J > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(J);
                String sb2 = sb.toString();
                int J2 = a0Var.mo7368J();
                if (J2 > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(J2);
                    sb2 = sb3.toString();
                }
                return new TextInformationFrame(str, null, sb2);
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Failed to parse index/count attribute: ");
        sb4.append(Atom.m7675a(i));
        Log.m10386h("MetadataUtil", sb4.toString());
        return null;
    }

    /* renamed from: e */
    private static Id3Frame m7785e(ParsableByteArray a0Var, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (a0Var.mo7380e() < i) {
            int e = a0Var.mo7380e();
            int n = a0Var.mo7389n();
            int n2 = a0Var.mo7389n();
            a0Var.mo7375Q(4);
            if (n2 == 1835360622) {
                str = a0Var.mo7400y(n - 12);
            } else if (n2 == 1851878757) {
                str2 = a0Var.mo7400y(n - 12);
            } else {
                if (n2 == 1684108385) {
                    i2 = e;
                    i3 = n;
                }
                a0Var.mo7375Q(n - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        a0Var.mo7374P(i2);
        a0Var.mo7375Q(16);
        return new InternalFrame(str, str2, a0Var.mo7400y(i3 - 16));
    }

    /* renamed from: f */
    public static MdtaMetadataEntry m7786f(ParsableByteArray a0Var, int i, String str) {
        while (true) {
            int e = a0Var.mo7380e();
            if (e >= i) {
                return null;
            }
            int n = a0Var.mo7389n();
            if (a0Var.mo7389n() == 1684108385) {
                int n2 = a0Var.mo7389n();
                int n3 = a0Var.mo7389n();
                int i2 = n - 16;
                byte[] bArr = new byte[i2];
                a0Var.mo7385j(bArr, 0, i2);
                return new MdtaMetadataEntry(str, bArr, n3, n2);
            }
            a0Var.mo7374P(e + n);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p067c.p068a.p069a.p070a.p088h2.p093m.TextInformationFrame m7787g(p067c.p068a.p069a.p070a.p111m2.ParsableByteArray r3) {
        /*
            int r3 = m7790j(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = f6424a
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            c.a.a.a.h2.m.m r1 = new c.a.a.a.h2.m.m
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            p067c.p068a.p069a.p070a.p111m2.Log.m10386h(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p083k0.MetadataUtil.m7787g(c.a.a.a.m2.a0):c.a.a.a.h2.m.m");
    }

    /* renamed from: h */
    private static TextInformationFrame m7788h(int i, String str, ParsableByteArray a0Var) {
        int n = a0Var.mo7389n();
        if (a0Var.mo7389n() == 1684108385) {
            a0Var.mo7375Q(8);
            return new TextInformationFrame(str, null, a0Var.mo7400y(n - 16));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse text attribute: ");
        sb.append(Atom.m7675a(i));
        Log.m10386h("MetadataUtil", sb.toString());
        return null;
    }

    /* renamed from: i */
    private static Id3Frame m7789i(int i, String str, ParsableByteArray a0Var, boolean z, boolean z2) {
        Id3Frame iVar;
        int j = m7790j(a0Var);
        if (z2) {
            j = Math.min(1, j);
        }
        if (j >= 0) {
            if (z) {
                iVar = new TextInformationFrame(str, null, Integer.toString(j));
            } else {
                iVar = new CommentFrame("und", str, Integer.toString(j));
            }
            return iVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse uint8 attribute: ");
        sb.append(Atom.m7675a(i));
        Log.m10386h("MetadataUtil", sb.toString());
        return null;
    }

    /* renamed from: j */
    private static int m7790j(ParsableByteArray a0Var) {
        a0Var.mo7375Q(4);
        if (a0Var.mo7389n() == 1684108385) {
            a0Var.mo7375Q(8);
            return a0Var.mo7362D();
        }
        Log.m10386h("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: k */
    public static void m7791k(int i, GaplessInfoHolder uVar, C1245b bVar) {
        if (i == 1 && uVar.mo6389a()) {
            bVar.mo7687M(uVar.f7008b).mo7688N(uVar.f7009c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r6 != null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[LOOP:1: B:17:0x003e->B:18:0x0040, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7792l(int r5, p067c.p068a.p069a.p070a.p088h2.Metadata r6, p067c.p068a.p069a.p070a.p088h2.Metadata r7, p067c.p068a.p069a.p070a.Format.C1245b r8, p067c.p068a.p069a.p070a.p088h2.Metadata... r9) {
        /*
            c.a.a.a.h2.a r0 = new c.a.a.a.h2.a
            r1 = 0
            c.a.a.a.h2.a$b[] r2 = new p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto L_0x000e
            if (r6 == 0) goto L_0x003c
            goto L_0x003d
        L_0x000e:
            r6 = 2
            if (r5 != r6) goto L_0x003c
            if (r7 == 0) goto L_0x003c
            r5 = 0
        L_0x0014:
            int r6 = r7.mo6552o()
            if (r5 >= r6) goto L_0x003c
            c.a.a.a.h2.a$b r6 = r7.mo6551n(r5)
            boolean r3 = r6 instanceof p067c.p068a.p069a.p070a.p088h2.p094n.MdtaMetadataEntry
            if (r3 == 0) goto L_0x0039
            c.a.a.a.h2.n.b r6 = (p067c.p068a.p069a.p070a.p088h2.p094n.MdtaMetadataEntry) r6
            java.lang.String r3 = r6.f7315a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0039
            c.a.a.a.h2.a r5 = new c.a.a.a.h2.a
            c.a.a.a.h2.a$b[] r7 = new p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L_0x003d
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x003c:
            r6 = r0
        L_0x003d:
            int r5 = r9.length
        L_0x003e:
            if (r1 >= r5) goto L_0x0049
            r7 = r9[r1]
            c.a.a.a.h2.a r6 = r6.mo6550m(r7)
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0049:
            int r5 = r6.mo6552o()
            if (r5 <= 0) goto L_0x0052
            r8.mo7698X(r6)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p069a.p070a.p076f2.p083k0.MetadataUtil.m7792l(int, c.a.a.a.h2.a, c.a.a.a.h2.a, c.a.a.a.u0$b, c.a.a.a.h2.a[]):void");
    }
}
