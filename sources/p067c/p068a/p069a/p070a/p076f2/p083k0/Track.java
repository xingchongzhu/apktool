package p067c.p068a.p069a.p070a.p076f2.p083k0;

import p067c.p068a.p069a.p070a.Format;

/* renamed from: c.a.a.a.f2.k0.o */
public final class Track {

    /* renamed from: a */
    public final int f6466a;

    /* renamed from: b */
    public final int f6467b;

    /* renamed from: c */
    public final long f6468c;

    /* renamed from: d */
    public final long f6469d;

    /* renamed from: e */
    public final long f6470e;

    /* renamed from: f */
    public final Format f6471f;

    /* renamed from: g */
    public final int f6472g;

    /* renamed from: h */
    public final long[] f6473h;

    /* renamed from: i */
    public final long[] f6474i;

    /* renamed from: j */
    public final int f6475j;

    /* renamed from: k */
    private final TrackEncryptionBox[] f6476k;

    public Track(int i, int i2, long j, long j2, long j3, Format u0Var, int i3, TrackEncryptionBox[] pVarArr, int i4, long[] jArr, long[] jArr2) {
        this.f6466a = i;
        this.f6467b = i2;
        this.f6468c = j;
        this.f6469d = j2;
        this.f6470e = j3;
        this.f6471f = u0Var;
        this.f6472g = i3;
        this.f6476k = pVarArr;
        this.f6475j = i4;
        this.f6473h = jArr;
        this.f6474i = jArr2;
    }

    /* renamed from: a */
    public TrackEncryptionBox mo6283a(int i) {
        TrackEncryptionBox[] pVarArr = this.f6476k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i];
    }
}
