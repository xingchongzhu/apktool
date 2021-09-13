package p067c.p068a.p069a.p070a.p075e2;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C1926y.C1928b;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource.C1924b;
import java.util.Map.Entry;
import p067c.p068a.p069a.p070a.MediaItem;
import p067c.p068a.p069a.p070a.MediaItem.C1264e;
import p067c.p068a.p069a.p070a.p075e2.DefaultDrmSessionManager.C0887b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p137c.Ints;

/* renamed from: c.a.a.a.e2.s */
public final class DefaultDrmSessionManagerProvider implements DrmSessionManagerProvider {

    /* renamed from: a */
    private final Object f5913a = new Object();

    /* renamed from: b */
    private C1264e f5914b;

    /* renamed from: c */
    private C0900y f5915c;

    /* renamed from: d */
    private C1928b f5916d;

    /* renamed from: e */
    private String f5917e;

    /* renamed from: b */
    private C0900y m7152b(C1264e eVar) {
        C1928b bVar = this.f5916d;
        if (bVar == null) {
            bVar = new C1924b().mo14972c(this.f5917e);
        }
        Uri uri = eVar.f9025b;
        HttpMediaDrmCallback g0Var = new HttpMediaDrmCallback(uri == null ? null : uri.toString(), eVar.f9029f, bVar);
        for (Entry entry : eVar.f9026c.entrySet()) {
            g0Var.mo6064e((String) entry.getKey(), (String) entry.getValue());
        }
        DefaultDrmSessionManager a = new C0887b().mo6092e(eVar.f9024a, FrameworkMediaDrm.f5819a).mo6089b(eVar.f9027d).mo6090c(eVar.f9028e).mo6091d(Ints.m12042i(eVar.f9030g)).mo6088a(g0Var);
        a.mo6087u(0, eVar.mo7789a());
        return a;
    }

    /* renamed from: a */
    public C0900y mo6094a(MediaItem z0Var) {
        C0900y yVar;
        Assertions.m10153e(z0Var.f8985b);
        C1264e eVar = z0Var.f8985b.f9040c;
        if (eVar == null || Util.f8398a < 18) {
            return C0900y.f5932a;
        }
        synchronized (this.f5913a) {
            if (!Util.m10279b(eVar, this.f5914b)) {
                this.f5914b = eVar;
                this.f5915c = m7152b(eVar);
            }
            yVar = (C0900y) Assertions.m10153e(this.f5915c);
        }
        return yVar;
    }
}
