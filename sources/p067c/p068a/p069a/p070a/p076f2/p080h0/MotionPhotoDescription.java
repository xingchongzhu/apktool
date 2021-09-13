package p067c.p068a.p069a.p070a.p076f2.p080h0;

import java.util.List;
import p067c.p068a.p069a.p070a.p088h2.p094n.MotionPhotoMetadata;

/* renamed from: c.a.a.a.f2.h0.b */
final class MotionPhotoDescription {

    /* renamed from: a */
    public final long f6139a;

    /* renamed from: b */
    public final List<C0930a> f6140b;

    /* renamed from: c.a.a.a.f2.h0.b$a */
    /* compiled from: MotionPhotoDescription */
    public static final class C0930a {

        /* renamed from: a */
        public final String f6141a;

        /* renamed from: b */
        public final String f6142b;

        /* renamed from: c */
        public final long f6143c;

        /* renamed from: d */
        public final long f6144d;

        public C0930a(String str, String str2, long j, long j2) {
            this.f6141a = str;
            this.f6142b = str2;
            this.f6143c = j;
            this.f6144d = j2;
        }
    }

    public MotionPhotoDescription(long j, List<C0930a> list) {
        this.f6139a = j;
        this.f6140b = list;
    }

    /* renamed from: a */
    public MotionPhotoMetadata mo6215a(long j) {
        long j2;
        if (this.f6140b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f6140b.size() - 1; size >= 0; size--) {
            C0930a aVar = (C0930a) this.f6140b.get(size);
            boolean equals = "video/mp4".equals(aVar.f6141a) | z;
            if (size == 0) {
                j2 = j3 - aVar.f6144d;
                j3 = 0;
            } else {
                long j8 = j3;
                j3 -= aVar.f6143c;
                j2 = j8;
            }
            if (!equals || j3 == j2) {
                z = equals;
            } else {
                j7 = j2 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j2;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        MotionPhotoMetadata cVar = new MotionPhotoMetadata(j4, j5, this.f6139a, j6, j7);
        return cVar;
    }
}
