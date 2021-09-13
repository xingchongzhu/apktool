package p067c.p068a.p069a.p070a.p097j2.p098s0;

import android.net.Uri;
import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.j2.s0.a */
public final class AdPlaybackState {

    /* renamed from: a */
    public static final AdPlaybackState f7622a;

    /* renamed from: b */
    public final Object f7623b;

    /* renamed from: c */
    public final int f7624c;

    /* renamed from: d */
    public final long[] f7625d;

    /* renamed from: e */
    public final C1108a[] f7626e;

    /* renamed from: f */
    public final long f7627f;

    /* renamed from: g */
    public final long f7628g;

    /* renamed from: c.a.a.a.j2.s0.a$a */
    /* compiled from: AdPlaybackState */
    public static final class C1108a {

        /* renamed from: a */
        public final int f7629a;

        /* renamed from: b */
        public final Uri[] f7630b;

        /* renamed from: c */
        public final int[] f7631c;

        /* renamed from: d */
        public final long[] f7632d;

        public C1108a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        /* renamed from: a */
        public int mo7001a() {
            return mo7002b(-1);
        }

        /* renamed from: b */
        public int mo7002b(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f7631c;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    return i2;
                }
                i2++;
            }
            return i2;
        }

        /* renamed from: c */
        public boolean mo7003c() {
            return this.f7629a == -1 || mo7001a() < this.f7629a;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1108a.class != obj.getClass()) {
                return false;
            }
            C1108a aVar = (C1108a) obj;
            if (this.f7629a != aVar.f7629a || !Arrays.equals(this.f7630b, aVar.f7630b) || !Arrays.equals(this.f7631c, aVar.f7631c) || !Arrays.equals(this.f7632d, aVar.f7632d)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((((this.f7629a * 31) + Arrays.hashCode(this.f7630b)) * 31) + Arrays.hashCode(this.f7631c)) * 31) + Arrays.hashCode(this.f7632d);
        }

        private C1108a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            Assertions.m10149a(iArr.length == uriArr.length);
            this.f7629a = i;
            this.f7631c = iArr;
            this.f7630b = uriArr;
            this.f7632d = jArr;
        }
    }

    static {
        AdPlaybackState aVar = new AdPlaybackState(null, new long[0], null, 0, -9223372036854775807L);
        f7622a = aVar;
    }

    private AdPlaybackState(Object obj, long[] jArr, C1108a[] aVarArr, long j, long j2) {
        this.f7623b = obj;
        this.f7625d = jArr;
        this.f7627f = j;
        this.f7628g = j2;
        int length = jArr.length;
        this.f7624c = length;
        if (aVarArr == null) {
            aVarArr = new C1108a[length];
            for (int i = 0; i < this.f7624c; i++) {
                aVarArr[i] = new C1108a();
            }
        }
        this.f7626e = aVarArr;
    }

    /* renamed from: c */
    private boolean m9243c(long j, long j2, int i) {
        boolean z = false;
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = this.f7625d[i];
        if (j3 == Long.MIN_VALUE) {
            if (j2 == -9223372036854775807L || j < j2) {
                z = true;
            }
            return z;
        }
        if (j < j3) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public int mo6996a(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = 0;
        while (true) {
            long[] jArr = this.f7625d;
            if (i < jArr.length && jArr[i] != Long.MIN_VALUE && (j >= jArr[i] || !this.f7626e[i].mo7003c())) {
                i++;
            }
        }
        if (i < this.f7625d.length) {
            return i;
        }
        return -1;
    }

    /* renamed from: b */
    public int mo6997b(long j, long j2) {
        int length = this.f7625d.length - 1;
        while (length >= 0 && m9243c(j, j2, length)) {
            length--;
        }
        if (length < 0 || !this.f7626e[length].mo7003c()) {
            return -1;
        }
        return length;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState aVar = (AdPlaybackState) obj;
        if (!Util.m10279b(this.f7623b, aVar.f7623b) || this.f7624c != aVar.f7624c || this.f7627f != aVar.f7627f || this.f7628g != aVar.f7628g || !Arrays.equals(this.f7625d, aVar.f7625d) || !Arrays.equals(this.f7626e, aVar.f7626e)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = this.f7624c * 31;
        Object obj = this.f7623b;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f7627f)) * 31) + ((int) this.f7628g)) * 31) + Arrays.hashCode(this.f7625d)) * 31) + Arrays.hashCode(this.f7626e);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f7623b);
        sb.append(", adResumePositionUs=");
        sb.append(this.f7627f);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            String str2 = "])";
            if (i < this.f7626e.length) {
                sb.append("adGroup(timeUs=");
                sb.append(this.f7625d[i]);
                sb.append(", ads=[");
                int i2 = 0;
                while (true) {
                    str = ", ";
                    if (i2 >= this.f7626e[i].f7631c.length) {
                        break;
                    }
                    sb.append("ad(state=");
                    int i3 = this.f7626e[i].f7631c[i2];
                    if (i3 == 0) {
                        sb.append('_');
                    } else if (i3 == 1) {
                        sb.append('R');
                    } else if (i3 == 2) {
                        sb.append('S');
                    } else if (i3 == 3) {
                        sb.append('P');
                    } else if (i3 != 4) {
                        sb.append('?');
                    } else {
                        sb.append('!');
                    }
                    sb.append(", durationUs=");
                    sb.append(this.f7626e[i].f7632d[i2]);
                    sb.append(')');
                    if (i2 < this.f7626e[i].f7631c.length - 1) {
                        sb.append(str);
                    }
                    i2++;
                }
                sb.append(str2);
                if (i < this.f7626e.length - 1) {
                    sb.append(str);
                }
                i++;
            } else {
                sb.append(str2);
                return sb.toString();
            }
        }
    }
}
