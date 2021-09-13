package p067c.p068a.p069a.p070a.p075e2;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p067c.p068a.p069a.p070a.C;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p075e2.C0896v.C0897a;
import p067c.p068a.p069a.p070a.p075e2.DefaultDrmSession.C0880a;
import p067c.p068a.p069a.p070a.p075e2.DefaultDrmSession.C0881b;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData.C0894b;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener.C0898a;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0866b;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0867c;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p136b.C1381r0;
import p067c.p068a.p134b.p136b.ImmutableList;
import p067c.p068a.p134b.p136b.ImmutableSet;
import p067c.p068a.p134b.p136b.UnmodifiableIterator;

/* renamed from: c.a.a.a.e2.r */
public class DefaultDrmSessionManager implements C0900y {

    /* renamed from: c */
    private final UUID f5878c;

    /* renamed from: d */
    private final C0867c f5879d;

    /* renamed from: e */
    private final MediaDrmCallback f5880e;

    /* renamed from: f */
    private final HashMap<String, String> f5881f;

    /* renamed from: g */
    private final boolean f5882g;

    /* renamed from: h */
    private final int[] f5883h;

    /* renamed from: i */
    private final boolean f5884i;

    /* renamed from: j */
    private final C0891f f5885j;

    /* renamed from: k */
    private final LoadErrorHandlingPolicy f5886k;

    /* renamed from: l */
    private final C0892g f5887l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final long f5888m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final List<DefaultDrmSession> f5889n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final List<DefaultDrmSession> f5890o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Set<DefaultDrmSession> f5891p;

    /* renamed from: q */
    private int f5892q;

    /* renamed from: r */
    private ExoMediaDrm f5893r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public DefaultDrmSession f5894s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public DefaultDrmSession f5895t;

    /* renamed from: u */
    private Looper f5896u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Handler f5897v;

    /* renamed from: w */
    private int f5898w;

    /* renamed from: x */
    private byte[] f5899x;

    /* renamed from: y */
    volatile C0889d f5900y;

    /* renamed from: c.a.a.a.e2.r$b */
    /* compiled from: DefaultDrmSessionManager */
    public static final class C0887b {

        /* renamed from: a */
        private final HashMap<String, String> f5901a = new HashMap<>();

        /* renamed from: b */
        private UUID f5902b = C.f7373d;

        /* renamed from: c */
        private C0867c f5903c = FrameworkMediaDrm.f5819a;

        /* renamed from: d */
        private boolean f5904d;

        /* renamed from: e */
        private int[] f5905e = new int[0];

        /* renamed from: f */
        private boolean f5906f;

        /* renamed from: g */
        private LoadErrorHandlingPolicy f5907g = new DefaultLoadErrorHandlingPolicy();

        /* renamed from: h */
        private long f5908h = 300000;

        /* renamed from: a */
        public DefaultDrmSessionManager mo6088a(MediaDrmCallback i0Var) {
            DefaultDrmSessionManager rVar = new DefaultDrmSessionManager(this.f5902b, this.f5903c, i0Var, this.f5901a, this.f5904d, this.f5905e, this.f5906f, this.f5907g, this.f5908h);
            return rVar;
        }

        /* renamed from: b */
        public C0887b mo6089b(boolean z) {
            this.f5904d = z;
            return this;
        }

        /* renamed from: c */
        public C0887b mo6090c(boolean z) {
            this.f5906f = z;
            return this;
        }

        /* renamed from: d */
        public C0887b mo6091d(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (!(i == 2 || i == 1)) {
                    z = false;
                }
                Assertions.m10149a(z);
            }
            this.f5905e = (int[]) iArr.clone();
            return this;
        }

        /* renamed from: e */
        public C0887b mo6092e(UUID uuid, C0867c cVar) {
            this.f5902b = (UUID) Assertions.m10153e(uuid);
            this.f5903c = (C0867c) Assertions.m10153e(cVar);
            return this;
        }
    }

    /* renamed from: c.a.a.a.e2.r$c */
    /* compiled from: DefaultDrmSessionManager */
    private class C0888c implements C0866b {
        private C0888c() {
        }

        /* renamed from: a */
        public void mo6052a(ExoMediaDrm d0Var, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((C0889d) Assertions.m10153e(DefaultDrmSessionManager.this.f5900y)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: c.a.a.a.e2.r$d */
    /* compiled from: DefaultDrmSessionManager */
    private class C0889d extends Handler {
        public C0889d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                Iterator it = DefaultDrmSessionManager.this.f5889n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DefaultDrmSession qVar = (DefaultDrmSession) it.next();
                    if (qVar.mo6070n(bArr)) {
                        qVar.mo6071u(message.what);
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: c.a.a.a.e2.r$e */
    /* compiled from: DefaultDrmSessionManager */
    public static final class C0890e extends Exception {
        private C0890e(UUID uuid) {
            StringBuilder sb = new StringBuilder();
            sb.append("Media does not support uuid: ");
            sb.append(uuid);
            super(sb.toString());
        }
    }

    /* renamed from: c.a.a.a.e2.r$f */
    /* compiled from: DefaultDrmSessionManager */
    private class C0891f implements C0880a {
        private C0891f() {
        }

        /* renamed from: a */
        public void mo6074a(DefaultDrmSession qVar) {
            if (!DefaultDrmSessionManager.this.f5890o.contains(qVar)) {
                DefaultDrmSessionManager.this.f5890o.add(qVar);
                if (DefaultDrmSessionManager.this.f5890o.size() == 1) {
                    qVar.mo6069A();
                }
            }
        }

        /* renamed from: b */
        public void mo6075b(Exception exc) {
            for (DefaultDrmSession w : DefaultDrmSessionManager.this.f5890o) {
                w.mo6073w(exc);
            }
            DefaultDrmSessionManager.this.f5890o.clear();
        }

        /* renamed from: c */
        public void mo6076c() {
            for (DefaultDrmSession v : DefaultDrmSessionManager.this.f5890o) {
                v.mo6072v();
            }
            DefaultDrmSessionManager.this.f5890o.clear();
        }
    }

    /* renamed from: c.a.a.a.e2.r$g */
    /* compiled from: DefaultDrmSessionManager */
    private class C0892g implements C0881b {
        private C0892g() {
        }

        /* renamed from: a */
        public void mo6077a(DefaultDrmSession qVar, int i) {
            if (i == 1 && DefaultDrmSessionManager.this.f5888m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f5891p.add(qVar);
                ((Handler) Assertions.m10153e(DefaultDrmSessionManager.this.f5897v)).postAtTime(new C0864d(qVar), qVar, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f5888m);
            } else if (i == 0) {
                DefaultDrmSessionManager.this.f5889n.remove(qVar);
                if (DefaultDrmSessionManager.this.f5894s == qVar) {
                    DefaultDrmSessionManager.this.f5894s = null;
                }
                if (DefaultDrmSessionManager.this.f5895t == qVar) {
                    DefaultDrmSessionManager.this.f5895t = null;
                }
                if (DefaultDrmSessionManager.this.f5890o.size() > 1 && DefaultDrmSessionManager.this.f5890o.get(0) == qVar) {
                    ((DefaultDrmSession) DefaultDrmSessionManager.this.f5890o.get(1)).mo6069A();
                }
                DefaultDrmSessionManager.this.f5890o.remove(qVar);
                if (DefaultDrmSessionManager.this.f5888m != -9223372036854775807L) {
                    ((Handler) Assertions.m10153e(DefaultDrmSessionManager.this.f5897v)).removeCallbacksAndMessages(qVar);
                    DefaultDrmSessionManager.this.f5891p.remove(qVar);
                }
            }
        }

        /* renamed from: b */
        public void mo6078b(DefaultDrmSession qVar, int i) {
            if (DefaultDrmSessionManager.this.f5888m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f5891p.remove(qVar);
                ((Handler) Assertions.m10153e(DefaultDrmSessionManager.this.f5897v)).removeCallbacksAndMessages(qVar);
            }
        }
    }

    /* renamed from: n */
    private boolean m7128n(DrmInitData tVar) {
        boolean z = true;
        if (this.f5899x != null) {
            return true;
        }
        if (m7131q(tVar, this.f5878c, true).isEmpty()) {
            if (tVar.f5921d != 1 || !tVar.mo6101p(0).mo6113n(C.f7371b)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(this.f5878c);
            Log.m10386h("DefaultDrmSessionMgr", sb.toString());
        }
        String str = tVar.f5920c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            if (Util.f8398a < 25) {
                z = false;
            }
            return z;
        } else if ("cbc1".equals(str) || "cens".equals(str)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: o */
    private DefaultDrmSession m7129o(List<C0894b> list, boolean z, C0898a aVar) {
        Assertions.m10153e(this.f5893r);
        List<C0894b> list2 = list;
        DefaultDrmSession qVar = new DefaultDrmSession(this.f5878c, this.f5893r, this.f5885j, this.f5887l, list2, this.f5898w, this.f5884i | z, z, this.f5899x, this.f5881f, this.f5880e, (Looper) Assertions.m10153e(this.f5896u), this.f5886k);
        qVar.mo6042b(aVar);
        if (this.f5888m != -9223372036854775807L) {
            qVar.mo6042b(null);
        }
        return qVar;
    }

    /* renamed from: p */
    private DefaultDrmSession m7130p(List<C0894b> list, boolean z, C0898a aVar) {
        DefaultDrmSession o = m7129o(list, z, aVar);
        if (o.getState() != 1) {
            return o;
        }
        if ((Util.f8398a >= 19 && !(((C0897a) Assertions.m10153e(o.mo6047g())).getCause() instanceof ResourceBusyException)) || this.f5891p.isEmpty()) {
            return o;
        }
        UnmodifiableIterator h = ImmutableSet.m11996k(this.f5891p).iterator();
        while (h.hasNext()) {
            ((C0896v) h.next()).mo6044d(null);
        }
        o.mo6044d(aVar);
        if (this.f5888m != -9223372036854775807L) {
            o.mo6044d(null);
        }
        return m7129o(list, z, aVar);
    }

    /* renamed from: q */
    private static List<C0894b> m7131q(DrmInitData tVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(tVar.f5921d);
        for (int i = 0; i < tVar.f5921d; i++) {
            C0894b p = tVar.mo6101p(i);
            if ((p.mo6113n(uuid) || (C.f7372c.equals(uuid) && p.mo6113n(C.f7371b))) && (p.f5926e != null || z)) {
                arrayList.add(p);
            }
        }
        return arrayList;
    }

    /* renamed from: r */
    private void m7132r(Looper looper) {
        Looper looper2 = this.f5896u;
        if (looper2 == null) {
            this.f5896u = looper;
            this.f5897v = new Handler(looper);
            return;
        }
        Assertions.m10154f(looper2 == looper);
    }

    /* renamed from: s */
    private C0896v m7133s(int i) {
        ExoMediaDrm d0Var = (ExoMediaDrm) Assertions.m10153e(this.f5893r);
        if ((FrameworkMediaCrypto.class.equals(d0Var.mo6030b()) && FrameworkMediaCrypto.f5813a) || Util.m10306o0(this.f5883h, i) == -1 || UnsupportedMediaCrypto.class.equals(d0Var.mo6030b())) {
            return null;
        }
        DefaultDrmSession qVar = this.f5894s;
        if (qVar == null) {
            DefaultDrmSession p = m7130p(ImmutableList.m11917p(), true, null);
            this.f5889n.add(p);
            this.f5894s = p;
        } else {
            qVar.mo6042b(null);
        }
        return this.f5894s;
    }

    /* renamed from: t */
    private void m7134t(Looper looper) {
        if (this.f5900y == null) {
            this.f5900y = new C0889d(looper);
        }
    }

    /* renamed from: a */
    public final void mo6083a() {
        int i = this.f5892q - 1;
        this.f5892q = i;
        if (i == 0) {
            if (this.f5888m != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f5889n);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((DefaultDrmSession) arrayList.get(i2)).mo6044d(null);
                }
            }
            ((ExoMediaDrm) Assertions.m10153e(this.f5893r)).mo6029a();
            this.f5893r = null;
        }
    }

    /* renamed from: b */
    public C0896v mo6084b(Looper looper, C0898a aVar, Format u0Var) {
        List list;
        m7132r(looper);
        m7134t(looper);
        DrmInitData tVar = u0Var.f8817o;
        if (tVar == null) {
            return m7133s(MimeTypes.m10405k(u0Var.f8814l));
        }
        DefaultDrmSession qVar = null;
        if (this.f5899x == null) {
            list = m7131q((DrmInitData) Assertions.m10153e(tVar), this.f5878c, false);
            if (list.isEmpty()) {
                C0890e eVar = new C0890e(this.f5878c);
                if (aVar != null) {
                    aVar.mo6124f(eVar);
                }
                return new ErrorStateDrmSession(new C0897a(eVar));
            }
        } else {
            list = null;
        }
        if (this.f5882g) {
            Iterator it = this.f5889n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession qVar2 = (DefaultDrmSession) it.next();
                if (Util.m10279b(qVar2.f5847a, list)) {
                    qVar = qVar2;
                    break;
                }
            }
        } else {
            qVar = this.f5895t;
        }
        if (qVar == null) {
            qVar = m7130p(list, false, aVar);
            if (!this.f5882g) {
                this.f5895t = qVar;
            }
            this.f5889n.add(qVar);
        } else {
            qVar.mo6042b(aVar);
        }
        return qVar;
    }

    /* renamed from: c */
    public Class<? extends ExoMediaCrypto> mo6085c(Format u0Var) {
        Class<UnsupportedMediaCrypto> b = ((ExoMediaDrm) Assertions.m10153e(this.f5893r)).mo6030b();
        DrmInitData tVar = u0Var.f8817o;
        if (tVar == null) {
            if (Util.m10306o0(this.f5883h, MimeTypes.m10405k(u0Var.f8814l)) == -1) {
                b = null;
            }
            return b;
        }
        if (!m7128n(tVar)) {
            b = UnsupportedMediaCrypto.class;
        }
        return b;
    }

    /* renamed from: d */
    public final void mo6086d() {
        int i = this.f5892q;
        this.f5892q = i + 1;
        if (i == 0) {
            Assertions.m10154f(this.f5893r == null);
            ExoMediaDrm a = this.f5879d.mo6053a(this.f5878c);
            this.f5893r = a;
            a.mo6034f(new C0888c());
        }
    }

    /* renamed from: u */
    public void mo6087u(int i, byte[] bArr) {
        Assertions.m10154f(this.f5889n.isEmpty());
        if (i == 1 || i == 3) {
            Assertions.m10153e(bArr);
        }
        this.f5898w = i;
        this.f5899x = bArr;
    }

    private DefaultDrmSessionManager(UUID uuid, C0867c cVar, MediaDrmCallback i0Var, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, LoadErrorHandlingPolicy a0Var, long j) {
        Assertions.m10153e(uuid);
        Assertions.m10150b(!C.f7371b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f5878c = uuid;
        this.f5879d = cVar;
        this.f5880e = i0Var;
        this.f5881f = hashMap;
        this.f5882g = z;
        this.f5883h = iArr;
        this.f5884i = z2;
        this.f5886k = a0Var;
        this.f5885j = new C0891f();
        this.f5887l = new C0892g();
        this.f5898w = 0;
        this.f5889n = new ArrayList();
        this.f5890o = new ArrayList();
        this.f5891p = C1381r0.m11942f();
        this.f5888m = j;
    }
}
