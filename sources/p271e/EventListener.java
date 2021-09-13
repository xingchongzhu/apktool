package p271e;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* renamed from: e.p */
public abstract class EventListener {

    /* renamed from: a */
    public static final EventListener f18613a = new C3366a();

    /* renamed from: e.p$a */
    /* compiled from: EventListener */
    class C3366a extends EventListener {
        C3366a() {
        }
    }

    /* renamed from: e.p$b */
    /* compiled from: EventListener */
    class C3367b implements C3368c {
        C3367b() {
        }

        /* renamed from: a */
        public EventListener mo20041a(Call eVar) {
            return EventListener.this;
        }
    }

    /* renamed from: e.p$c */
    /* compiled from: EventListener */
    public interface C3368c {
        /* renamed from: a */
        EventListener mo20041a(Call eVar);
    }

    /* renamed from: k */
    static C3368c m23581k(EventListener pVar) {
        return new C3367b();
    }

    /* renamed from: a */
    public void mo20021a(Call eVar) {
    }

    /* renamed from: b */
    public void mo20022b(Call eVar, IOException iOException) {
    }

    /* renamed from: c */
    public void mo20023c(Call eVar) {
    }

    /* renamed from: d */
    public void mo20024d(Call eVar, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol xVar) {
    }

    /* renamed from: e */
    public void mo20025e(Call eVar, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol xVar, IOException iOException) {
    }

    /* renamed from: f */
    public void mo20026f(Call eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    /* renamed from: g */
    public void mo20027g(Call eVar, Connection iVar) {
    }

    /* renamed from: h */
    public void mo20028h(Call eVar, Connection iVar) {
    }

    /* renamed from: i */
    public void mo20029i(Call eVar, String str, List<InetAddress> list) {
    }

    /* renamed from: j */
    public void mo20030j(Call eVar, String str) {
    }

    /* renamed from: l */
    public void mo20031l(Call eVar, long j) {
    }

    /* renamed from: m */
    public void mo20032m(Call eVar) {
    }

    /* renamed from: n */
    public void mo20033n(Call eVar, C3378z zVar) {
    }

    /* renamed from: o */
    public void mo20034o(Call eVar) {
    }

    /* renamed from: p */
    public void mo20035p(Call eVar, long j) {
    }

    /* renamed from: q */
    public void mo20036q(Call eVar) {
    }

    /* renamed from: r */
    public void mo20037r(Call eVar, Response b0Var) {
    }

    /* renamed from: s */
    public void mo20038s(Call eVar) {
    }

    /* renamed from: t */
    public void mo20039t(Call eVar, Handshake rVar) {
    }

    /* renamed from: u */
    public void mo20040u(Call eVar) {
    }
}
