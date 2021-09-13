package p067c.p068a.p069a.p070a.p076f2.p083k0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.k0.e */
abstract class Atom {

    /* renamed from: a */
    public final int f6333a;

    /* renamed from: c.a.a.a.f2.k0.e$a */
    /* compiled from: Atom */
    static final class C0946a extends Atom {

        /* renamed from: b */
        public final long f6334b;

        /* renamed from: c */
        public final List<C0947b> f6335c = new ArrayList();

        /* renamed from: d */
        public final List<C0946a> f6336d = new ArrayList();

        public C0946a(int i, long j) {
            super(i);
            this.f6334b = j;
        }

        /* renamed from: d */
        public void mo6260d(C0946a aVar) {
            this.f6336d.add(aVar);
        }

        /* renamed from: e */
        public void mo6261e(C0947b bVar) {
            this.f6335c.add(bVar);
        }

        /* renamed from: f */
        public C0946a mo6262f(int i) {
            int size = this.f6336d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0946a aVar = (C0946a) this.f6336d.get(i2);
                if (aVar.f6333a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: g */
        public C0947b mo6263g(int i) {
            int size = this.f6335c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0947b bVar = (C0947b) this.f6335c.get(i2);
                if (bVar.f6333a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Atom.m7675a(this.f6333a));
            sb.append(" leaves: ");
            sb.append(Arrays.toString(this.f6335c.toArray()));
            sb.append(" containers: ");
            sb.append(Arrays.toString(this.f6336d.toArray()));
            return sb.toString();
        }
    }

    /* renamed from: c.a.a.a.f2.k0.e$b */
    /* compiled from: Atom */
    static final class C0947b extends Atom {

        /* renamed from: b */
        public final ParsableByteArray f6337b;

        public C0947b(int i, ParsableByteArray a0Var) {
            super(i);
            this.f6337b = a0Var;
        }
    }

    public Atom(int i) {
        this.f6333a = i;
    }

    /* renamed from: a */
    public static String m7675a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    /* renamed from: b */
    public static int m7676b(int i) {
        return i & 16777215;
    }

    /* renamed from: c */
    public static int m7677c(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return m7675a(this.f6333a);
    }
}
