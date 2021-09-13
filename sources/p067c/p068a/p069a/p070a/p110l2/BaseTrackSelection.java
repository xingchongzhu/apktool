package p067c.p068a.p069a.p070a.p110l2;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p097j2.TrackGroup;
import p067c.p068a.p069a.p070a.p097j2.p099t0.Chunk;
import p067c.p068a.p069a.p070a.p097j2.p099t0.MediaChunk;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.l2.e */
public abstract class BaseTrackSelection implements C1174h {

    /* renamed from: a */
    protected final TrackGroup f8163a;

    /* renamed from: b */
    protected final int f8164b;

    /* renamed from: c */
    protected final int[] f8165c;

    /* renamed from: d */
    private final Format[] f8166d;

    /* renamed from: e */
    private final long[] f8167e;

    /* renamed from: f */
    private int f8168f;

    public BaseTrackSelection(TrackGroup p0Var, int... iArr) {
        int i = 0;
        Assertions.m10154f(iArr.length > 0);
        this.f8163a = (TrackGroup) Assertions.m10153e(p0Var);
        int length = iArr.length;
        this.f8164b = length;
        this.f8166d = new Format[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f8166d[i2] = p0Var.mo6977l(iArr[i2]);
        }
        Arrays.sort(this.f8166d, C1160a.f8139a);
        this.f8165c = new int[this.f8164b];
        while (true) {
            int i3 = this.f8164b;
            if (i < i3) {
                this.f8165c[i] = p0Var.mo6978m(this.f8166d[i]);
                i++;
            } else {
                this.f8167e = new long[i3];
                return;
            }
        }
    }

    /* renamed from: v */
    static /* synthetic */ int m9932v(Format u0Var, Format u0Var2) {
        return u0Var2.f8810h - u0Var.f8810h;
    }

    /* renamed from: a */
    public final boolean mo7257a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean u = mo7272u(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f8164b && !u) {
            u = i2 != i && !mo7272u(i2, elapsedRealtime);
            i2++;
        }
        if (!u) {
            return false;
        }
        long[] jArr = this.f8167e;
        jArr[i] = Math.max(jArr[i], Util.m10277a(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    /* renamed from: b */
    public /* synthetic */ boolean mo7258b(long j, Chunk bVar, List list) {
        return ExoTrackSelection.m10003d(this, j, bVar, list);
    }

    /* renamed from: c */
    public /* synthetic */ void mo7259c(boolean z) {
        ExoTrackSelection.m10001b(this, z);
    }

    /* renamed from: d */
    public void mo7244d() {
    }

    /* renamed from: e */
    public final Format mo7260e(int i) {
        return this.f8166d[i];
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseTrackSelection eVar = (BaseTrackSelection) obj;
        if (this.f8163a != eVar.f8163a || !Arrays.equals(this.f8165c, eVar.f8165c)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public void mo7245f() {
    }

    /* renamed from: g */
    public final int mo7262g(int i) {
        return this.f8165c[i];
    }

    /* renamed from: h */
    public int mo7246h(long j, List<? extends MediaChunk> list) {
        return list.size();
    }

    public int hashCode() {
        if (this.f8168f == 0) {
            this.f8168f = (System.identityHashCode(this.f8163a) * 31) + Arrays.hashCode(this.f8165c);
        }
        return this.f8168f;
    }

    /* renamed from: j */
    public final int mo7264j() {
        return this.f8165c[mo7249n()];
    }

    /* renamed from: k */
    public final TrackGroup mo7265k() {
        return this.f8163a;
    }

    /* renamed from: l */
    public final Format mo7266l() {
        return this.f8166d[mo7249n()];
    }

    public final int length() {
        return this.f8165c.length;
    }

    /* renamed from: o */
    public void mo7250o(float f) {
    }

    /* renamed from: q */
    public /* synthetic */ void mo7268q() {
        ExoTrackSelection.m10000a(this);
    }

    /* renamed from: r */
    public /* synthetic */ void mo7269r() {
        ExoTrackSelection.m10002c(this);
    }

    /* renamed from: s */
    public final int mo7270s(int i) {
        for (int i2 = 0; i2 < this.f8164b; i2++) {
            if (this.f8165c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: t */
    public final int mo7271t(Format u0Var) {
        for (int i = 0; i < this.f8164b; i++) {
            if (this.f8166d[i] == u0Var) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo7272u(int i, long j) {
        return this.f8167e[i] > j;
    }
}
