package p067c.p068a.p069a.p070a.p097j2;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import p067c.p068a.p069a.p070a.MediaItem;
import p067c.p068a.p069a.p070a.Timeline;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener;

/* renamed from: c.a.a.a.j2.d0 */
/* compiled from: MediaSource */
public interface C1080d0 {

    /* renamed from: c.a.a.a.j2.d0$a */
    /* compiled from: MediaSource */
    public static final class C1081a extends MediaPeriodId {
        public C1081a(Object obj) {
            super(obj);
        }

        /* renamed from: c */
        public C1081a mo6840c(Object obj) {
            return new C1081a(super.mo6821a(obj));
        }

        public C1081a(Object obj, long j, int i) {
            super(obj, j, i);
        }

        public C1081a(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public C1081a(MediaPeriodId b0Var) {
            super(b0Var);
        }
    }

    /* renamed from: c.a.a.a.j2.d0$b */
    /* compiled from: MediaSource */
    public interface C1082b {
        /* renamed from: a */
        void mo5606a(C1080d0 d0Var, Timeline x1Var);
    }

    /* renamed from: a */
    MediaItem mo6827a();

    /* renamed from: b */
    void mo6828b(Handler handler, DrmSessionEventListener wVar);

    /* renamed from: c */
    void mo6829c() throws IOException;

    /* renamed from: d */
    MediaPeriod mo6830d(C1081a aVar, Allocator eVar, long j);

    /* renamed from: e */
    boolean mo6831e();

    /* renamed from: f */
    void mo6832f(MediaPeriod a0Var);

    /* renamed from: g */
    Timeline mo6833g();

    /* renamed from: h */
    void mo6834h(C1082b bVar, TransferListener e0Var);

    /* renamed from: i */
    void mo6835i(C1082b bVar);

    /* renamed from: j */
    void mo6836j(C1082b bVar);

    /* renamed from: l */
    void mo6837l(Handler handler, MediaSourceEventListener e0Var);

    /* renamed from: m */
    void mo6838m(MediaSourceEventListener e0Var);

    /* renamed from: n */
    void mo6839n(C1082b bVar);
}
