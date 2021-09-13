package p067c.p068a.p069a.p070a;

import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p110l2.C1174h;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.m0 */
public class DefaultLoadControl implements LoadControl {

    /* renamed from: a */
    private final DefaultAllocator f8309a;

    /* renamed from: b */
    private final long f8310b;

    /* renamed from: c */
    private final long f8311c;

    /* renamed from: d */
    private final long f8312d;

    /* renamed from: e */
    private final long f8313e;

    /* renamed from: f */
    private final int f8314f;

    /* renamed from: g */
    private final boolean f8315g;

    /* renamed from: h */
    private final long f8316h;

    /* renamed from: i */
    private final boolean f8317i;

    /* renamed from: j */
    private int f8318j;

    /* renamed from: k */
    private boolean f8319k;

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    /* renamed from: a */
    private static void m10054a(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        Assertions.m10150b(z, sb.toString());
    }

    /* renamed from: c */
    private static int m10055c(int i) {
        if (i == 0) {
            return 144310272;
        }
        if (i == 1) {
            return 13107200;
        }
        if (i == 2) {
            return 131072000;
        }
        if (i == 3 || i == 5 || i == 6) {
            return 131072;
        }
        if (i == 7) {
            return 0;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    private void m10056d(boolean z) {
        int i = this.f8314f;
        if (i == -1) {
            i = 13107200;
        }
        this.f8318j = i;
        this.f8319k = false;
        if (z) {
            this.f8309a.mo14962g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo7333b(C1227p1[] p1VarArr, C1174h[] hVarArr) {
        int i = 0;
        for (int i2 = 0; i2 < p1VarArr.length; i2++) {
            if (hVarArr[i2] != null) {
                i += m10055c(p1VarArr[i2].mo6518g());
            }
        }
        return Math.max(13107200, i);
    }

    /* renamed from: f */
    public void mo7334f() {
        m10056d(false);
    }

    /* renamed from: g */
    public void mo7335g(C1227p1[] p1VarArr, TrackGroupArray q0Var, C1174h[] hVarArr) {
        int i = this.f8314f;
        if (i == -1) {
            i = mo7333b(p1VarArr, hVarArr);
        }
        this.f8318j = i;
        this.f8309a.mo14963h(i);
    }

    /* renamed from: h */
    public boolean mo7336h() {
        return this.f8317i;
    }

    /* renamed from: i */
    public void mo7337i() {
        m10056d(true);
    }

    /* renamed from: j */
    public boolean mo7338j(long j, float f, boolean z, long j2) {
        long Y = Util.m10275Y(j, f);
        long j3 = z ? this.f8313e : this.f8312d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || Y >= j3 || (!this.f8315g && this.f8309a.mo14961f() >= this.f8318j);
    }

    /* renamed from: k */
    public boolean mo7339k(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = this.f8309a.mo14961f() >= this.f8318j;
        long j3 = this.f8310b;
        if (f > 1.0f) {
            j3 = Math.min(Util.m10268R(j3, f), this.f8311c);
        }
        if (j2 < Math.max(j3, 500000)) {
            if (!this.f8315g && z2) {
                z = false;
            }
            this.f8319k = z;
            if (!z && j2 < 500000) {
                Log.m10386h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f8311c || z2) {
            this.f8319k = false;
        }
        return this.f8319k;
    }

    /* renamed from: l */
    public Allocator mo7340l() {
        return this.f8309a;
    }

    /* renamed from: m */
    public void mo7341m() {
        m10056d(true);
    }

    /* renamed from: n */
    public long mo7342n() {
        return this.f8316h;
    }

    protected DefaultLoadControl(DefaultAllocator qVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        String str = "bufferForPlaybackMs";
        String str2 = "0";
        m10054a(i3, 0, str, str2);
        String str3 = "bufferForPlaybackAfterRebufferMs";
        m10054a(i4, 0, str3, str2);
        String str4 = "minBufferMs";
        m10054a(i, i3, str4, str);
        m10054a(i, i4, str4, str3);
        m10054a(i2, i, "maxBufferMs", str4);
        m10054a(i6, 0, "backBufferDurationMs", str2);
        this.f8309a = qVar;
        this.f8310b = C.m8860c((long) i);
        this.f8311c = C.m8860c((long) i2);
        this.f8312d = C.m8860c((long) i3);
        this.f8313e = C.m8860c((long) i4);
        this.f8314f = i5;
        if (i5 == -1) {
            i5 = 13107200;
        }
        this.f8318j = i5;
        this.f8315g = z;
        this.f8316h = C.m8860c((long) i6);
        this.f8317i = z2;
    }
}
