package com.google.android.exoplayer2.source.hls;

import android.util.SparseArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;

/* renamed from: com.google.android.exoplayer2.source.hls.t */
public final class TimestampAdjusterProvider {

    /* renamed from: a */
    private final SparseArray<TimestampAdjuster> f11732a = new SparseArray<>();

    /* renamed from: a */
    public TimestampAdjuster mo14652a(int i) {
        TimestampAdjuster j0Var = (TimestampAdjuster) this.f11732a.get(i);
        if (j0Var != null) {
            return j0Var;
        }
        TimestampAdjuster j0Var2 = new TimestampAdjuster(Long.MAX_VALUE);
        this.f11732a.put(i, j0Var2);
        return j0Var2;
    }

    /* renamed from: b */
    public void mo14653b() {
        this.f11732a.clear();
    }
}
