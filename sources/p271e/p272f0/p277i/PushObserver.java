package p271e.p272f0.p277i;

import java.io.IOException;
import java.util.List;
import p281f.BufferedSource;

/* renamed from: e.f0.i.l */
public interface PushObserver {

    /* renamed from: a */
    public static final PushObserver f18404a = new C3353a();

    /* renamed from: e.f0.i.l$a */
    /* compiled from: PushObserver */
    class C3353a implements PushObserver {
        C3353a() {
        }

        /* renamed from: a */
        public boolean mo19920a(int i, List<Header> list) {
            return true;
        }

        /* renamed from: b */
        public boolean mo19921b(int i, List<Header> list, boolean z) {
            return true;
        }

        /* renamed from: c */
        public void mo19922c(int i, ErrorCode bVar) {
        }

        /* renamed from: d */
        public boolean mo19923d(int i, BufferedSource eVar, int i2, boolean z) throws IOException {
            eVar.mo20192a((long) i2);
            return true;
        }
    }

    /* renamed from: a */
    boolean mo19920a(int i, List<Header> list);

    /* renamed from: b */
    boolean mo19921b(int i, List<Header> list, boolean z);

    /* renamed from: c */
    void mo19922c(int i, ErrorCode bVar);

    /* renamed from: d */
    boolean mo19923d(int i, BufferedSource eVar, int i2, boolean z) throws IOException;
}
