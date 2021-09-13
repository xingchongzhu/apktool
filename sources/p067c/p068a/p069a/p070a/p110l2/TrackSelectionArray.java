package p067c.p068a.p069a.p070a.p110l2;

import java.util.Arrays;

/* renamed from: c.a.a.a.l2.l */
public final class TrackSelectionArray {

    /* renamed from: a */
    public final int f8284a;

    /* renamed from: b */
    private final TrackSelection[] f8285b;

    /* renamed from: c */
    private int f8286c;

    public TrackSelectionArray(TrackSelection... kVarArr) {
        this.f8285b = kVarArr;
        this.f8284a = kVarArr.length;
    }

    /* renamed from: a */
    public TrackSelection mo7321a(int i) {
        return this.f8285b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackSelectionArray.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8285b, ((TrackSelectionArray) obj).f8285b);
    }

    public int hashCode() {
        if (this.f8286c == 0) {
            this.f8286c = 527 + Arrays.hashCode(this.f8285b);
        }
        return this.f8286c;
    }
}
