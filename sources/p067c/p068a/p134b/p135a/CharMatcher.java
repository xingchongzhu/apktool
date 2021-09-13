package p067c.p068a.p134b.p135a;

/* renamed from: c.a.b.a.b */
public abstract class CharMatcher implements Predicate<Character> {

    /* renamed from: c.a.b.a.b$a */
    /* compiled from: CharMatcher */
    static abstract class C1315a extends CharMatcher {
        C1315a() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.mo8101b((Character) obj);
        }
    }

    /* renamed from: c.a.b.a.b$b */
    /* compiled from: CharMatcher */
    private static final class C1316b extends C1315a {

        /* renamed from: a */
        private final char f9738a;

        C1316b(char c) {
            this.f9738a = c;
        }

        /* renamed from: e */
        public boolean mo8103e(char c) {
            return c == this.f9738a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CharMatcher.is('");
            sb.append(CharMatcher.m11633g(this.f9738a));
            sb.append("')");
            return sb.toString();
        }
    }

    /* renamed from: c.a.b.a.b$c */
    /* compiled from: CharMatcher */
    static abstract class C1317c extends C1315a {

        /* renamed from: a */
        private final String f9739a;

        C1317c(String str) {
            this.f9739a = (String) C1320g.m11650i(str);
        }

        public final String toString() {
            return this.f9739a;
        }
    }

    /* renamed from: c.a.b.a.b$d */
    /* compiled from: CharMatcher */
    private static final class C1318d extends C1317c {

        /* renamed from: b */
        static final C1318d f9740b = new C1318d();

        private C1318d() {
            super("CharMatcher.none()");
        }

        /* renamed from: c */
        public int mo8102c(CharSequence charSequence, int i) {
            C1320g.m11652k(i, charSequence.length());
            return -1;
        }

        /* renamed from: e */
        public boolean mo8103e(char c) {
            return false;
        }
    }

    protected CharMatcher() {
    }

    /* renamed from: d */
    public static CharMatcher m11631d(char c) {
        return new C1316b(c);
    }

    /* renamed from: f */
    public static CharMatcher m11632f() {
        return C1318d.f9740b;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static String m11633g(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo8101b(Character ch) {
        return mo8103e(ch.charValue());
    }

    /* renamed from: c */
    public int mo8102c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C1320g.m11652k(i, length);
        while (i < length) {
            if (mo8103e(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e */
    public abstract boolean mo8103e(char c);
}
