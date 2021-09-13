package p067c.p068a.p069a.p070a;

import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.a1 */
public final class MediaMetadata {

    /* renamed from: a */
    public final String f5244a;

    /* renamed from: c.a.a.a.a1$b */
    /* compiled from: MediaMetadata */
    public static final class C0750b {

        /* renamed from: a */
        private String f5245a;

        /* renamed from: a */
        public MediaMetadata mo5609a() {
            return new MediaMetadata(this.f5245a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaMetadata.class != obj.getClass()) {
            return false;
        }
        return Util.m10279b(this.f5244a, ((MediaMetadata) obj).f5244a);
    }

    public int hashCode() {
        String str = this.f5244a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    private MediaMetadata(String str) {
        this.f5244a = str;
    }
}
