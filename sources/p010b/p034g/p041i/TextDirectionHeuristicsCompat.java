package p010b.p034g.p041i;

import java.util.Locale;

/* renamed from: b.g.i.e */
public final class TextDirectionHeuristicsCompat {

    /* renamed from: a */
    public static final TextDirectionHeuristicCompat f4574a = new C0608e(null, false);

    /* renamed from: b */
    public static final TextDirectionHeuristicCompat f4575b = new C0608e(null, true);

    /* renamed from: c */
    public static final TextDirectionHeuristicCompat f4576c;

    /* renamed from: d */
    public static final TextDirectionHeuristicCompat f4577d;

    /* renamed from: e */
    public static final TextDirectionHeuristicCompat f4578e = new C0608e(C0604a.f4580a, false);

    /* renamed from: f */
    public static final TextDirectionHeuristicCompat f4579f = C0609f.f4585b;

    /* renamed from: b.g.i.e$a */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0604a implements C0606c {

        /* renamed from: a */
        static final C0604a f4580a = new C0604a(true);

        /* renamed from: b */
        private final boolean f4581b;

        private C0604a(boolean z) {
            this.f4581b = z;
        }

        /* renamed from: a */
        public int mo4940a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = TextDirectionHeuristicsCompat.m5161a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f4581b) {
                        return 1;
                    }
                } else if (this.f4581b) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f4581b ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: b.g.i.e$b */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0605b implements C0606c {

        /* renamed from: a */
        static final C0605b f4582a = new C0605b();

        private C0605b() {
        }

        /* renamed from: a */
        public int mo4940a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = TextDirectionHeuristicsCompat.m5162b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: b.g.i.e$c */
    /* compiled from: TextDirectionHeuristicsCompat */
    private interface C0606c {
        /* renamed from: a */
        int mo4940a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: b.g.i.e$d */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static abstract class C0607d implements TextDirectionHeuristicCompat {

        /* renamed from: a */
        private final C0606c f4583a;

        C0607d(C0606c cVar) {
            this.f4583a = cVar;
        }

        /* renamed from: c */
        private boolean m5166c(CharSequence charSequence, int i, int i2) {
            int a = this.f4583a.mo4940a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo4941b();
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo4939a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f4583a == null) {
                return mo4941b();
            } else {
                return m5166c(charSequence, i, i2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract boolean mo4941b();
    }

    /* renamed from: b.g.i.e$e */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0608e extends C0607d {

        /* renamed from: b */
        private final boolean f4584b;

        C0608e(C0606c cVar, boolean z) {
            super(cVar);
            this.f4584b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo4941b() {
            return this.f4584b;
        }
    }

    /* renamed from: b.g.i.e$f */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0609f extends C0607d {

        /* renamed from: b */
        static final C0609f f4585b = new C0609f();

        C0609f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo4941b() {
            return TextUtilsCompat.m5172b(Locale.getDefault()) == 1;
        }
    }

    static {
        C0605b bVar = C0605b.f4582a;
        f4576c = new C0608e(bVar, false);
        f4577d = new C0608e(bVar, true);
    }

    /* renamed from: a */
    static int m5161a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m5162b(int i) {
        if (i != 0) {
            if (!(i == 1 || i == 2)) {
                switch (i) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        break;
                    default:
                        return 2;
                }
            }
            return 0;
        }
        return 1;
    }
}
