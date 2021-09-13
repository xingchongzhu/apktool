package p067c.p068a.p069a.p070a.p087g2;

import java.nio.ByteBuffer;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p072b2.MpegAudioUtil;
import p067c.p068a.p069a.p070a.p073c2.DecoderInputBuffer;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;

/* renamed from: c.a.a.a.g2.p */
final class C2Mp3TimestampTracker {

    /* renamed from: a */
    private long f7081a;

    /* renamed from: b */
    private long f7082b;

    /* renamed from: c */
    private boolean f7083c;

    C2Mp3TimestampTracker() {
    }

    /* renamed from: a */
    private long m8420a(Format u0Var) {
        return (this.f7081a * 1000000) / ((long) u0Var.f8828z);
    }

    /* renamed from: b */
    public void mo6460b() {
        this.f7081a = 0;
        this.f7082b = 0;
        this.f7083c = false;
    }

    /* renamed from: c */
    public long mo6461c(Format u0Var, DecoderInputBuffer fVar) {
        if (this.f7083c) {
            return fVar.f5746e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.m10153e(fVar.f5744c);
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            b = (b << 8) | (byteBuffer.get(i) & 255);
        }
        int m = MpegAudioUtil.m6549m(b);
        if (m == -1) {
            this.f7083c = true;
            Log.m10386h("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return fVar.f5746e;
        } else if (this.f7081a == 0) {
            long j = fVar.f5746e;
            this.f7082b = j;
            this.f7081a = ((long) m) - 529;
            return j;
        } else {
            long a = m8420a(u0Var);
            this.f7081a += (long) m;
            return this.f7082b + a;
        }
    }
}
