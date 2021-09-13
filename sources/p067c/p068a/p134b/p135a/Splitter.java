package p067c.p068a.p134b.p135a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.a.b.a.i */
public final class Splitter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharMatcher f9747a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f9748b;

    /* renamed from: c */
    private final C1324c f9749c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f9750d;

    /* renamed from: c.a.b.a.i$a */
    /* compiled from: Splitter */
    static class C1321a implements C1324c {

        /* renamed from: a */
        final /* synthetic */ CharMatcher f9751a;

        /* renamed from: c.a.b.a.i$a$a */
        /* compiled from: Splitter */
        class C1322a extends C1323b {
            C1322a(Splitter iVar, CharSequence charSequence) {
                super(iVar, charSequence);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: e */
            public int mo8111e(int i) {
                return i + 1;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: f */
            public int mo8112f(int i) {
                return C1321a.this.f9751a.mo8102c(this.f9753c, i);
            }
        }

        C1321a(CharMatcher bVar) {
            this.f9751a = bVar;
        }

        /* renamed from: b */
        public C1323b mo8109a(Splitter iVar, CharSequence charSequence) {
            return new C1322a(iVar, charSequence);
        }
    }

    /* renamed from: c.a.b.a.i$b */
    /* compiled from: Splitter */
    private static abstract class C1323b extends AbstractIterator<String> {

        /* renamed from: c */
        final CharSequence f9753c;

        /* renamed from: d */
        final CharMatcher f9754d;

        /* renamed from: e */
        final boolean f9755e;

        /* renamed from: f */
        int f9756f = 0;

        /* renamed from: g */
        int f9757g;

        protected C1323b(Splitter iVar, CharSequence charSequence) {
            this.f9754d = iVar.f9747a;
            this.f9755e = iVar.f9748b;
            this.f9757g = iVar.f9750d;
            this.f9753c = charSequence;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo8096a() {
            int i;
            int i2 = this.f9756f;
            while (true) {
                int i3 = this.f9756f;
                if (i3 == -1) {
                    return (String) mo8097b();
                }
                int f = mo8112f(i3);
                if (f == -1) {
                    f = this.f9753c.length();
                    this.f9756f = -1;
                } else {
                    this.f9756f = mo8111e(f);
                }
                int i4 = this.f9756f;
                if (i4 == i2) {
                    int i5 = i4 + 1;
                    this.f9756f = i5;
                    if (i5 > this.f9753c.length()) {
                        this.f9756f = -1;
                    }
                } else {
                    while (i2 < f && this.f9754d.mo8103e(this.f9753c.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.f9754d.mo8103e(this.f9753c.charAt(i - 1))) {
                        f = i - 1;
                    }
                    if (!this.f9755e || i2 != i) {
                        int i6 = this.f9757g;
                    } else {
                        i2 = this.f9756f;
                    }
                }
            }
            int i62 = this.f9757g;
            if (i62 == 1) {
                i = this.f9753c.length();
                this.f9756f = -1;
                while (i > i2 && this.f9754d.mo8103e(this.f9753c.charAt(i - 1))) {
                    i--;
                }
            } else {
                this.f9757g = i62 - 1;
            }
            return this.f9753c.subSequence(i2, i).toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public abstract int mo8111e(int i);

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public abstract int mo8112f(int i);
    }

    /* renamed from: c.a.b.a.i$c */
    /* compiled from: Splitter */
    private interface C1324c {
        /* renamed from: a */
        Iterator<String> mo8109a(Splitter iVar, CharSequence charSequence);
    }

    private Splitter(C1324c cVar) {
        this(cVar, false, CharMatcher.m11632f(), Integer.MAX_VALUE);
    }

    /* renamed from: d */
    public static Splitter m11660d(char c) {
        return m11661e(CharMatcher.m11631d(c));
    }

    /* renamed from: e */
    public static Splitter m11661e(CharMatcher bVar) {
        C1320g.m11650i(bVar);
        return new Splitter(new C1321a(bVar));
    }

    /* renamed from: g */
    private Iterator<String> m11662g(CharSequence charSequence) {
        return this.f9749c.mo8109a(this, charSequence);
    }

    /* renamed from: f */
    public List<String> mo8108f(CharSequence charSequence) {
        C1320g.m11650i(charSequence);
        Iterator g = m11662g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add(g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private Splitter(C1324c cVar, boolean z, CharMatcher bVar, int i) {
        this.f9749c = cVar;
        this.f9748b = z;
        this.f9747a = bVar;
        this.f9750d = i;
    }
}
