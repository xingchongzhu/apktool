package p067c.p068a.p069a.p070a.p076f2;

import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.f2.y */
public interface SeekMap {

    /* renamed from: c.a.a.a.f2.y$a */
    /* compiled from: SeekMap */
    public static final class C1002a {

        /* renamed from: a */
        public final SeekPoint f7016a;

        /* renamed from: b */
        public final SeekPoint f7017b;

        public C1002a(SeekPoint zVar) {
            this(zVar, zVar);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1002a.class != obj.getClass()) {
                return false;
            }
            C1002a aVar = (C1002a) obj;
            if (!this.f7016a.equals(aVar.f7016a) || !this.f7017b.equals(aVar.f7017b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f7016a.hashCode() * 31) + this.f7017b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f7016a);
            if (this.f7016a.equals(this.f7017b)) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(", ");
                sb2.append(this.f7017b);
                str = sb2.toString();
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public C1002a(SeekPoint zVar, SeekPoint zVar2) {
            this.f7016a = (SeekPoint) Assertions.m10153e(zVar);
            this.f7017b = (SeekPoint) Assertions.m10153e(zVar2);
        }
    }

    /* renamed from: c.a.a.a.f2.y$b */
    /* compiled from: SeekMap */
    public static class C1003b implements SeekMap {

        /* renamed from: a */
        private final long f7018a;

        /* renamed from: b */
        private final C1002a f7019b;

        public C1003b(long j) {
            this(j, 0);
        }

        /* renamed from: f */
        public boolean mo6167f() {
            return false;
        }

        /* renamed from: h */
        public C1002a mo6168h(long j) {
            return this.f7019b;
        }

        /* renamed from: j */
        public long mo6169j() {
            return this.f7018a;
        }

        public C1003b(long j, long j2) {
            this.f7018a = j;
            this.f7019b = new C1002a(j2 == 0 ? SeekPoint.f7020a : new SeekPoint(0, j2));
        }
    }

    /* renamed from: f */
    boolean mo6167f();

    /* renamed from: h */
    C1002a mo6168h(long j);

    /* renamed from: j */
    long mo6169j();
}
