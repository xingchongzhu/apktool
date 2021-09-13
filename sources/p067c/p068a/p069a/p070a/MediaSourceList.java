package p067c.p068a.p069a.p070a;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p067c.p068a.p069a.p070a.p071a2.AnalyticsCollector;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener;
import p067c.p068a.p069a.p070a.p075e2.DrmSessionEventListener.C0898a;
import p067c.p068a.p069a.p070a.p097j2.C1080d0;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1081a;
import p067c.p068a.p069a.p070a.p097j2.C1080d0.C1082b;
import p067c.p068a.p069a.p070a.p097j2.LoadEventInfo;
import p067c.p068a.p069a.p070a.p097j2.MaskingMediaPeriod;
import p067c.p068a.p069a.p070a.p097j2.MaskingMediaSource;
import p067c.p068a.p069a.p070a.p097j2.MediaLoadData;
import p067c.p068a.p069a.p070a.p097j2.MediaPeriod;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceEventListener;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceEventListener.C1084a;
import p067c.p068a.p069a.p070a.p097j2.ShuffleOrder;
import p067c.p068a.p069a.p070a.p097j2.ShuffleOrder.C1103a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f1 */
final class MediaSourceList {

    /* renamed from: a */
    private final List<C0907c> f5946a = new ArrayList();

    /* renamed from: b */
    private final IdentityHashMap<MediaPeriod, C0907c> f5947b = new IdentityHashMap<>();

    /* renamed from: c */
    private final Map<Object, C0907c> f5948c = new HashMap();

    /* renamed from: d */
    private final C0908d f5949d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1084a f5950e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C0898a f5951f;

    /* renamed from: g */
    private final HashMap<C0907c, C0906b> f5952g;

    /* renamed from: h */
    private final Set<C0907c> f5953h;

    /* renamed from: i */
    private ShuffleOrder f5954i = new C1103a(0);

    /* renamed from: j */
    private boolean f5955j;

    /* renamed from: k */
    private TransferListener f5956k;

    /* renamed from: c.a.a.a.f1$a */
    /* compiled from: MediaSourceList */
    private final class C0905a implements MediaSourceEventListener, DrmSessionEventListener {

        /* renamed from: a */
        private final C0907c f5957a;

        /* renamed from: b */
        private C1084a f5958b;

        /* renamed from: c */
        private C0898a f5959c;

        public C0905a(C0907c cVar) {
            this.f5958b = MediaSourceList.this.f5950e;
            this.f5959c = MediaSourceList.this.f5951f;
            this.f5957a = cVar;
        }

        /* renamed from: a */
        private boolean m7264a(int i, C1081a aVar) {
            C1081a aVar2;
            if (aVar != null) {
                aVar2 = MediaSourceList.m7244m(this.f5957a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int d = MediaSourceList.m7247q(this.f5957a, i);
            C1084a aVar3 = this.f5958b;
            if (aVar3.f7409a != d || !Util.m10279b(aVar3.f7410b, aVar2)) {
                this.f5958b = MediaSourceList.this.f5950e.mo6847F(d, aVar2, 0);
            }
            C0898a aVar4 = this.f5959c;
            if (aVar4.f5927a != d || !Util.m10279b(aVar4.f5928b, aVar2)) {
                this.f5959c = MediaSourceList.this.f5951f.mo6132t(d, aVar2);
            }
            return true;
        }

        /* renamed from: C */
        public void mo5614C(int i, C1081a aVar, Exception exc) {
            if (m7264a(i, aVar)) {
                this.f5959c.mo6124f(exc);
            }
        }

        /* renamed from: E */
        public void mo5616E(int i, C1081a aVar) {
            if (m7264a(i, aVar)) {
                this.f5959c.mo6120b();
            }
        }

        /* renamed from: F */
        public void mo5617F(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar) {
            if (m7264a(i, aVar)) {
                this.f5958b.mo6843B(wVar, zVar);
            }
        }

        /* renamed from: I */
        public void mo5620I(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar) {
            if (m7264a(i, aVar)) {
                this.f5958b.mo6862v(wVar, zVar);
            }
        }

        /* renamed from: Q */
        public void mo5628Q(int i, C1081a aVar) {
            if (m7264a(i, aVar)) {
                this.f5959c.mo6125g();
            }
        }

        /* renamed from: V */
        public void mo5633V(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar, IOException iOException, boolean z) {
            if (m7264a(i, aVar)) {
                this.f5958b.mo6865y(wVar, zVar, iOException, z);
            }
        }

        /* renamed from: Y */
        public void mo5636Y(int i, C1081a aVar) {
            if (m7264a(i, aVar)) {
                this.f5959c.mo6122d();
            }
        }

        /* renamed from: k */
        public void mo5652k(int i, C1081a aVar) {
            if (m7264a(i, aVar)) {
                this.f5959c.mo6121c();
            }
        }

        /* renamed from: s */
        public void mo5667s(int i, C1081a aVar, MediaLoadData zVar) {
            if (m7264a(i, aVar)) {
                this.f5958b.mo6850d(zVar);
            }
        }

        /* renamed from: t */
        public void mo5668t(int i, C1081a aVar, LoadEventInfo wVar, MediaLoadData zVar) {
            if (m7264a(i, aVar)) {
                this.f5958b.mo6859s(wVar, zVar);
            }
        }

        /* renamed from: v */
        public void mo5670v(int i, C1081a aVar, MediaLoadData zVar) {
            if (m7264a(i, aVar)) {
                this.f5958b.mo6846E(zVar);
            }
        }

        /* renamed from: y */
        public void mo5673y(int i, C1081a aVar) {
            if (m7264a(i, aVar)) {
                this.f5959c.mo6123e();
            }
        }
    }

    /* renamed from: c.a.a.a.f1$b */
    /* compiled from: MediaSourceList */
    private static final class C0906b {

        /* renamed from: a */
        public final C1080d0 f5961a;

        /* renamed from: b */
        public final C1082b f5962b;

        /* renamed from: c */
        public final MediaSourceEventListener f5963c;

        public C0906b(C1080d0 d0Var, C1082b bVar, MediaSourceEventListener e0Var) {
            this.f5961a = d0Var;
            this.f5962b = bVar;
            this.f5963c = e0Var;
        }
    }

    /* renamed from: c.a.a.a.f1$c */
    /* compiled from: MediaSourceList */
    static final class C0907c implements MediaSourceInfoHolder {

        /* renamed from: a */
        public final MaskingMediaSource f5964a;

        /* renamed from: b */
        public final Object f5965b = new Object();

        /* renamed from: c */
        public final List<C1081a> f5966c = new ArrayList();

        /* renamed from: d */
        public int f5967d;

        /* renamed from: e */
        public boolean f5968e;

        public C0907c(C1080d0 d0Var, boolean z) {
            this.f5964a = new MaskingMediaSource(d0Var, z);
        }

        /* renamed from: a */
        public Object mo6026a() {
            return this.f5965b;
        }

        /* renamed from: b */
        public Timeline mo6027b() {
            return this.f5964a.mo7030K();
        }

        /* renamed from: c */
        public void mo6154c(int i) {
            this.f5967d = i;
            this.f5968e = false;
            this.f5966c.clear();
        }
    }

    /* renamed from: c.a.a.a.f1$d */
    /* compiled from: MediaSourceList */
    public interface C0908d {
        /* renamed from: b */
        void mo6155b();
    }

    public MediaSourceList(C0908d dVar, AnalyticsCollector c1Var, Handler handler) {
        this.f5949d = dVar;
        C1084a aVar = new C1084a();
        this.f5950e = aVar;
        C0898a aVar2 = new C0898a();
        this.f5951f = aVar2;
        this.f5952g = new HashMap<>();
        this.f5953h = new HashSet();
        if (c1Var != null) {
            aVar.mo6848a(handler, c1Var);
            aVar2.mo6119a(handler, c1Var);
        }
    }

    /* renamed from: B */
    private void m7234B(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            C0907c cVar = (C0907c) this.f5946a.remove(i3);
            this.f5948c.remove(cVar.f5965b);
            m7239f(i3, -cVar.f5964a.mo7030K().mo6973p());
            cVar.f5968e = true;
            if (this.f5955j) {
                m7249u(cVar);
            }
        }
    }

    /* renamed from: f */
    private void m7239f(int i, int i2) {
        while (i < this.f5946a.size()) {
            C0907c cVar = (C0907c) this.f5946a.get(i);
            cVar.f5967d += i2;
            i++;
        }
    }

    /* renamed from: i */
    private void m7240i(C0907c cVar) {
        C0906b bVar = (C0906b) this.f5952g.get(cVar);
        if (bVar != null) {
            bVar.f5961a.mo6839n(bVar.f5962b);
        }
    }

    /* renamed from: j */
    private void m7241j() {
        Iterator it = this.f5953h.iterator();
        while (it.hasNext()) {
            C0907c cVar = (C0907c) it.next();
            if (cVar.f5966c.isEmpty()) {
                m7240i(cVar);
                it.remove();
            }
        }
    }

    /* renamed from: k */
    private void m7242k(C0907c cVar) {
        this.f5953h.add(cVar);
        C0906b bVar = (C0906b) this.f5952g.get(cVar);
        if (bVar != null) {
            bVar.f5961a.mo6835i(bVar.f5962b);
        }
    }

    /* renamed from: l */
    private static Object m7243l(Object obj) {
        return AbstractConcatenatedTimeline.m6940v(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static C1081a m7244m(C0907c cVar, C1081a aVar) {
        for (int i = 0; i < cVar.f5966c.size(); i++) {
            if (((C1081a) cVar.f5966c.get(i)).f7394d == aVar.f7394d) {
                return aVar.mo6840c(m7246o(cVar, aVar.f7391a));
            }
        }
        return null;
    }

    /* renamed from: n */
    private static Object m7245n(Object obj) {
        return AbstractConcatenatedTimeline.m6941w(obj);
    }

    /* renamed from: o */
    private static Object m7246o(C0907c cVar, Object obj) {
        return AbstractConcatenatedTimeline.m6942y(cVar.f5965b, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static int m7247q(C0907c cVar, int i) {
        return i + cVar.f5967d;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo6149t(C1080d0 d0Var, Timeline x1Var) {
        this.f5949d.mo6155b();
    }

    /* renamed from: u */
    private void m7249u(C0907c cVar) {
        if (cVar.f5968e && cVar.f5966c.isEmpty()) {
            C0906b bVar = (C0906b) Assertions.m10153e((C0906b) this.f5952g.remove(cVar));
            bVar.f5961a.mo6836j(bVar.f5962b);
            bVar.f5961a.mo6838m(bVar.f5963c);
            this.f5953h.remove(cVar);
        }
    }

    /* renamed from: x */
    private void m7250x(C0907c cVar) {
        MaskingMediaSource yVar = cVar.f5964a;
        C0748a0 a0Var = new C0748a0(this);
        C0905a aVar = new C0905a(cVar);
        this.f5952g.put(cVar, new C0906b(yVar, a0Var, aVar));
        yVar.mo6837l(Util.m10323x(), aVar);
        yVar.mo6828b(Util.m10323x(), aVar);
        yVar.mo6834h(a0Var, this.f5956k);
    }

    /* renamed from: A */
    public Timeline mo6141A(int i, int i2, ShuffleOrder n0Var) {
        Assertions.m10149a(i >= 0 && i <= i2 && i2 <= mo6147p());
        this.f5954i = n0Var;
        m7234B(i, i2);
        return mo6146h();
    }

    /* renamed from: C */
    public Timeline mo6142C(List<C0907c> list, ShuffleOrder n0Var) {
        m7234B(0, this.f5946a.size());
        return mo6144e(this.f5946a.size(), list, n0Var);
    }

    /* renamed from: D */
    public Timeline mo6143D(ShuffleOrder n0Var) {
        int p = mo6147p();
        if (n0Var.mo6958a() != p) {
            n0Var = n0Var.mo6965h().mo6961d(0, p);
        }
        this.f5954i = n0Var;
        return mo6146h();
    }

    /* renamed from: e */
    public Timeline mo6144e(int i, List<C0907c> list, ShuffleOrder n0Var) {
        if (!list.isEmpty()) {
            this.f5954i = n0Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C0907c cVar = (C0907c) list.get(i2 - i);
                if (i2 > 0) {
                    C0907c cVar2 = (C0907c) this.f5946a.get(i2 - 1);
                    cVar.mo6154c(cVar2.f5967d + cVar2.f5964a.mo7030K().mo6973p());
                } else {
                    cVar.mo6154c(0);
                }
                m7239f(i2, cVar.f5964a.mo7030K().mo6973p());
                this.f5946a.add(i2, cVar);
                this.f5948c.put(cVar.f5965b, cVar);
                if (this.f5955j) {
                    m7250x(cVar);
                    if (this.f5947b.isEmpty()) {
                        this.f5953h.add(cVar);
                    } else {
                        m7240i(cVar);
                    }
                }
            }
        }
        return mo6146h();
    }

    /* renamed from: g */
    public MediaPeriod mo6145g(C1081a aVar, Allocator eVar, long j) {
        Object n = m7245n(aVar.f7391a);
        C1081a c = aVar.mo6840c(m7243l(aVar.f7391a));
        C0907c cVar = (C0907c) Assertions.m10153e((C0907c) this.f5948c.get(n));
        m7242k(cVar);
        cVar.f5966c.add(c);
        MaskingMediaPeriod G = cVar.f5964a.mo6830d(c, eVar, j);
        this.f5947b.put(G, cVar);
        m7241j();
        return G;
    }

    /* renamed from: h */
    public Timeline mo6146h() {
        if (this.f5946a.isEmpty()) {
            return Timeline.f8949a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f5946a.size(); i2++) {
            C0907c cVar = (C0907c) this.f5946a.get(i2);
            cVar.f5967d = i;
            i += cVar.f5964a.mo7030K().mo6973p();
        }
        return new PlaylistTimeline(this.f5946a, this.f5954i);
    }

    /* renamed from: p */
    public int mo6147p() {
        return this.f5946a.size();
    }

    /* renamed from: r */
    public boolean mo6148r() {
        return this.f5955j;
    }

    /* renamed from: v */
    public Timeline mo6150v(int i, int i2, int i3, ShuffleOrder n0Var) {
        Assertions.m10149a(i >= 0 && i <= i2 && i2 <= mo6147p() && i3 >= 0);
        this.f5954i = n0Var;
        if (i == i2 || i == i3) {
            return mo6146h();
        }
        int min = Math.min(i, i3);
        int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int i4 = ((C0907c) this.f5946a.get(min)).f5967d;
        Util.m10310q0(this.f5946a, i, i2, i3);
        while (min <= max) {
            C0907c cVar = (C0907c) this.f5946a.get(min);
            cVar.f5967d = i4;
            i4 += cVar.f5964a.mo7030K().mo6973p();
            min++;
        }
        return mo6146h();
    }

    /* renamed from: w */
    public void mo6151w(TransferListener e0Var) {
        Assertions.m10154f(!this.f5955j);
        this.f5956k = e0Var;
        for (int i = 0; i < this.f5946a.size(); i++) {
            C0907c cVar = (C0907c) this.f5946a.get(i);
            m7250x(cVar);
            this.f5953h.add(cVar);
        }
        this.f5955j = true;
    }

    /* renamed from: y */
    public void mo6152y() {
        for (C0906b bVar : this.f5952g.values()) {
            try {
                bVar.f5961a.mo6836j(bVar.f5962b);
            } catch (RuntimeException e) {
                Log.m10382d("MediaSourceList", "Failed to release child source.", e);
            }
            bVar.f5961a.mo6838m(bVar.f5963c);
        }
        this.f5952g.clear();
        this.f5953h.clear();
        this.f5955j = false;
    }

    /* renamed from: z */
    public void mo6153z(MediaPeriod a0Var) {
        C0907c cVar = (C0907c) Assertions.m10153e((C0907c) this.f5947b.remove(a0Var));
        cVar.f5964a.mo6832f(a0Var);
        cVar.f5966c.remove(((MaskingMediaPeriod) a0Var).f7666a);
        if (!this.f5947b.isEmpty()) {
            m7241j();
        }
        m7249u(cVar);
    }
}
