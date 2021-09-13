package p067c.p068a.p069a.p070a.p076f2.p079g0;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.p076f2.DummyTrackOutput;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;

/* renamed from: c.a.a.a.f2.g0.d */
final class ScriptTagPayloadReader extends TagPayloadReader {

    /* renamed from: b */
    private long f6106b = -9223372036854775807L;

    /* renamed from: c */
    private long[] f6107c = new long[0];

    /* renamed from: d */
    private long[] f6108d = new long[0];

    public ScriptTagPayloadReader() {
        super(new DummyTrackOutput());
    }

    /* renamed from: g */
    private static Boolean m7445g(ParsableByteArray a0Var) {
        boolean z = true;
        if (a0Var.mo7362D() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: h */
    private static Object m7446h(ParsableByteArray a0Var, int i) {
        if (i == 0) {
            return m7448j(a0Var);
        }
        if (i == 1) {
            return m7445g(a0Var);
        }
        if (i == 2) {
            return m7452n(a0Var);
        }
        if (i == 3) {
            return m7450l(a0Var);
        }
        if (i == 8) {
            return m7449k(a0Var);
        }
        if (i == 10) {
            return m7451m(a0Var);
        }
        if (i != 11) {
            return null;
        }
        return m7447i(a0Var);
    }

    /* renamed from: i */
    private static Date m7447i(ParsableByteArray a0Var) {
        Date date = new Date((long) m7448j(a0Var).doubleValue());
        a0Var.mo7375Q(2);
        return date;
    }

    /* renamed from: j */
    private static Double m7448j(ParsableByteArray a0Var) {
        return Double.valueOf(Double.longBitsToDouble(a0Var.mo7398w()));
    }

    /* renamed from: k */
    private static HashMap<String, Object> m7449k(ParsableByteArray a0Var) {
        int H = a0Var.mo7366H();
        HashMap<String, Object> hashMap = new HashMap<>(H);
        for (int i = 0; i < H; i++) {
            String n = m7452n(a0Var);
            Object h = m7446h(a0Var, m7453o(a0Var));
            if (h != null) {
                hashMap.put(n, h);
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    private static HashMap<String, Object> m7450l(ParsableByteArray a0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n = m7452n(a0Var);
            int o = m7453o(a0Var);
            if (o == 9) {
                return hashMap;
            }
            Object h = m7446h(a0Var, o);
            if (h != null) {
                hashMap.put(n, h);
            }
        }
    }

    /* renamed from: m */
    private static ArrayList<Object> m7451m(ParsableByteArray a0Var) {
        int H = a0Var.mo7366H();
        ArrayList<Object> arrayList = new ArrayList<>(H);
        for (int i = 0; i < H; i++) {
            Object h = m7446h(a0Var, m7453o(a0Var));
            if (h != null) {
                arrayList.add(h);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    private static String m7452n(ParsableByteArray a0Var) {
        int J = a0Var.mo7368J();
        int e = a0Var.mo7380e();
        a0Var.mo7375Q(J);
        return new String(a0Var.mo7379d(), e, J);
    }

    /* renamed from: o */
    private static int m7453o(ParsableByteArray a0Var) {
        return a0Var.mo7362D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo6209b(ParsableByteArray a0Var) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo6210c(ParsableByteArray a0Var, long j) {
        if (m7453o(a0Var) != 2) {
            return false;
        }
        if (!"onMetaData".equals(m7452n(a0Var)) || m7453o(a0Var) != 8) {
            return false;
        }
        HashMap k = m7449k(a0Var);
        Object obj = k.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f6106b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f6107c = new long[size];
                this.f6108d = new long[size];
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f6107c = new long[0];
                        this.f6108d = new long[0];
                    } else {
                        this.f6107c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f6108d[i] = ((Double) obj5).longValue();
                        i++;
                    }
                }
                this.f6107c = new long[0];
                this.f6108d = new long[0];
            }
        }
        return false;
    }

    /* renamed from: d */
    public long mo6211d() {
        return this.f6106b;
    }

    /* renamed from: e */
    public long[] mo6212e() {
        return this.f6108d;
    }

    /* renamed from: f */
    public long[] mo6213f() {
        return this.f6107c;
    }
}
