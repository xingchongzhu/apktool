package p067c.p068a.p069a.p070a.p076f2.p085m0;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;

/* renamed from: c.a.a.a.f2.m0.i0 */
public interface TsPayloadReader {

    /* renamed from: c.a.a.a.f2.m0.i0$a */
    /* compiled from: TsPayloadReader */
    public static final class C0980a {

        /* renamed from: a */
        public final String f6691a;

        /* renamed from: b */
        public final int f6692b;

        /* renamed from: c */
        public final byte[] f6693c;

        public C0980a(String str, int i, byte[] bArr) {
            this.f6691a = str;
            this.f6692b = i;
            this.f6693c = bArr;
        }
    }

    /* renamed from: c.a.a.a.f2.m0.i0$b */
    /* compiled from: TsPayloadReader */
    public static final class C0981b {

        /* renamed from: a */
        public final int f6694a;

        /* renamed from: b */
        public final String f6695b;

        /* renamed from: c */
        public final List<C0980a> f6696c;

        /* renamed from: d */
        public final byte[] f6697d;

        public C0981b(int i, String str, List<C0980a> list, byte[] bArr) {
            List<C0980a> list2;
            this.f6694a = i;
            this.f6695b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f6696c = list2;
            this.f6697d = bArr;
        }
    }

    /* renamed from: c.a.a.a.f2.m0.i0$c */
    /* compiled from: TsPayloadReader */
    public interface C0982c {
        /* renamed from: a */
        SparseArray<TsPayloadReader> mo6340a();

        /* renamed from: b */
        TsPayloadReader mo6341b(int i, C0981b bVar);
    }

    /* renamed from: c.a.a.a.f2.m0.i0$d */
    /* compiled from: TsPayloadReader */
    public static final class C0983d {

        /* renamed from: a */
        private final String f6698a;

        /* renamed from: b */
        private final int f6699b;

        /* renamed from: c */
        private final int f6700c;

        /* renamed from: d */
        private int f6701d;

        /* renamed from: e */
        private String f6702e;

        public C0983d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* renamed from: d */
        private void m8056d() {
            if (this.f6701d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        /* renamed from: a */
        public void mo6342a() {
            int i = this.f6701d;
            this.f6701d = i == Integer.MIN_VALUE ? this.f6699b : i + this.f6700c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6698a);
            sb.append(this.f6701d);
            this.f6702e = sb.toString();
        }

        /* renamed from: b */
        public String mo6343b() {
            m8056d();
            return this.f6702e;
        }

        /* renamed from: c */
        public int mo6344c() {
            m8056d();
            return this.f6701d;
        }

        public C0983d(int i, int i2, int i3) {
            String str;
            String str2 = "";
            if (i != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("/");
                str = sb.toString();
            } else {
                str = str2;
            }
            this.f6698a = str;
            this.f6699b = i2;
            this.f6700c = i3;
            this.f6701d = Integer.MIN_VALUE;
            this.f6702e = str2;
        }
    }

    /* renamed from: a */
    void mo6326a();

    /* renamed from: b */
    void mo6327b(TimestampAdjuster j0Var, ExtractorOutput lVar, C0983d dVar);

    /* renamed from: c */
    void mo6328c(ParsableByteArray a0Var, int i) throws ParserException;
}
