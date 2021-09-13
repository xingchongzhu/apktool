package p281f;

/* renamed from: f.p */
final class SegmentPool {

    /* renamed from: a */
    static Segment f18788a;

    /* renamed from: b */
    static long f18789b;

    private SegmentPool() {
    }

    /* renamed from: a */
    static void m23975a(Segment oVar) {
        if (oVar.f18786f != null || oVar.f18787g != null) {
            throw new IllegalArgumentException();
        } else if (!oVar.f18784d) {
            synchronized (SegmentPool.class) {
                long j = f18789b;
                if (j + 8192 <= 65536) {
                    f18789b = j + 8192;
                    oVar.f18786f = f18788a;
                    oVar.f18783c = 0;
                    oVar.f18782b = 0;
                    f18788a = oVar;
                }
            }
        }
    }

    /* renamed from: b */
    static Segment m23976b() {
        synchronized (SegmentPool.class) {
            Segment oVar = f18788a;
            if (oVar == null) {
                return new Segment();
            }
            f18788a = oVar.f18786f;
            oVar.f18786f = null;
            f18789b -= 8192;
            return oVar;
        }
    }
}
