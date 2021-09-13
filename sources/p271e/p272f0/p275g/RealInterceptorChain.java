package p271e.p272f0.p275g;

import java.io.IOException;
import java.util.List;
import p271e.C3378z;
import p271e.Call;
import p271e.Connection;
import p271e.EventListener;
import p271e.Interceptor;
import p271e.Interceptor.C3373a;
import p271e.Response;
import p271e.p272f0.p274f.RealConnection;
import p271e.p272f0.p274f.StreamAllocation;

/* renamed from: e.f0.g.g */
public final class RealInterceptorChain implements C3373a {

    /* renamed from: a */
    private final List<Interceptor> f18182a;

    /* renamed from: b */
    private final StreamAllocation f18183b;

    /* renamed from: c */
    private final HttpCodec f18184c;

    /* renamed from: d */
    private final RealConnection f18185d;

    /* renamed from: e */
    private final int f18186e;

    /* renamed from: f */
    private final C3378z f18187f;

    /* renamed from: g */
    private final Call f18188g;

    /* renamed from: h */
    private final EventListener f18189h;

    /* renamed from: i */
    private final int f18190i;

    /* renamed from: j */
    private final int f18191j;

    /* renamed from: k */
    private final int f18192k;

    /* renamed from: l */
    private int f18193l;

    public RealInterceptorChain(List<Interceptor> list, StreamAllocation gVar, HttpCodec cVar, RealConnection cVar2, int i, C3378z zVar, Call eVar, EventListener pVar, int i2, int i3, int i4) {
        this.f18182a = list;
        this.f18185d = cVar2;
        this.f18183b = gVar;
        this.f18184c = cVar;
        this.f18186e = i;
        this.f18187f = zVar;
        this.f18188g = eVar;
        this.f18189h = pVar;
        this.f18190i = i2;
        this.f18191j = i3;
        this.f18192k = i4;
    }

    /* renamed from: S */
    public C3378z mo19799S() {
        return this.f18187f;
    }

    /* renamed from: a */
    public int mo19800a() {
        return this.f18190i;
    }

    /* renamed from: b */
    public int mo19801b() {
        return this.f18191j;
    }

    /* renamed from: c */
    public int mo19802c() {
        return this.f18192k;
    }

    /* renamed from: d */
    public Response mo19803d(C3378z zVar) throws IOException {
        return mo19808i(zVar, this.f18183b, this.f18184c, this.f18185d);
    }

    /* renamed from: e */
    public Call mo19804e() {
        return this.f18188g;
    }

    /* renamed from: f */
    public Connection mo19805f() {
        return this.f18185d;
    }

    /* renamed from: g */
    public EventListener mo19806g() {
        return this.f18189h;
    }

    /* renamed from: h */
    public HttpCodec mo19807h() {
        return this.f18184c;
    }

    /* renamed from: i */
    public Response mo19808i(C3378z zVar, StreamAllocation gVar, HttpCodec cVar, RealConnection cVar2) throws IOException {
        if (this.f18186e < this.f18182a.size()) {
            this.f18193l++;
            String str = "network interceptor ";
            if (this.f18184c == null || this.f18185d.mo19762s(zVar.mo20147i())) {
                String str2 = " must call proceed() exactly once";
                if (this.f18184c == null || this.f18193l <= 1) {
                    RealInterceptorChain gVar2 = new RealInterceptorChain(this.f18182a, gVar, cVar, cVar2, this.f18186e + 1, zVar, this.f18188g, this.f18189h, this.f18190i, this.f18191j, this.f18192k);
                    Interceptor uVar = (Interceptor) this.f18182a.get(this.f18186e);
                    Response a = uVar.mo18702a(gVar2);
                    if (cVar == null || this.f18186e + 1 >= this.f18182a.size() || gVar2.f18193l == 1) {
                        String str3 = "interceptor ";
                        if (a == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str3);
                            sb.append(uVar);
                            sb.append(" returned null");
                            throw new NullPointerException(sb.toString());
                        } else if (a.mo19659B() != null) {
                            return a;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str3);
                            sb2.append(uVar);
                            sb2.append(" returned a response with no body");
                            throw new IllegalStateException(sb2.toString());
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(uVar);
                        sb3.append(str2);
                        throw new IllegalStateException(sb3.toString());
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(this.f18182a.get(this.f18186e - 1));
                    sb4.append(str2);
                    throw new IllegalStateException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(this.f18182a.get(this.f18186e - 1));
                sb5.append(" must retain the same host and port");
                throw new IllegalStateException(sb5.toString());
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: j */
    public StreamAllocation mo19809j() {
        return this.f18183b;
    }
}
