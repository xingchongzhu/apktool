package p271e.p272f0;

import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import p271e.Address;
import p271e.C3370s.C3371a;
import p271e.Call;
import p271e.ConnectionPool;
import p271e.ConnectionSpec;
import p271e.Response.C3306a;
import p271e.Route;
import p271e.p272f0.p274f.RealConnection;
import p271e.p272f0.p274f.RouteDatabase;
import p271e.p272f0.p274f.StreamAllocation;

/* renamed from: e.f0.a */
public abstract class Internal {

    /* renamed from: a */
    public static Internal f18084a;

    /* renamed from: a */
    public abstract void mo19721a(C3371a aVar, String str);

    /* renamed from: b */
    public abstract void mo19722b(C3371a aVar, String str, String str2);

    /* renamed from: c */
    public abstract void mo19723c(ConnectionSpec kVar, SSLSocket sSLSocket, boolean z);

    /* renamed from: d */
    public abstract int mo19724d(C3306a aVar);

    /* renamed from: e */
    public abstract boolean mo19725e(ConnectionPool jVar, RealConnection cVar);

    /* renamed from: f */
    public abstract Socket mo19726f(ConnectionPool jVar, Address aVar, StreamAllocation gVar);

    /* renamed from: g */
    public abstract boolean mo19727g(Address aVar, Address aVar2);

    /* renamed from: h */
    public abstract RealConnection mo19728h(ConnectionPool jVar, Address aVar, StreamAllocation gVar, Route d0Var);

    /* renamed from: i */
    public abstract void mo19729i(ConnectionPool jVar, RealConnection cVar);

    /* renamed from: j */
    public abstract RouteDatabase mo19730j(ConnectionPool jVar);

    /* renamed from: k */
    public abstract IOException mo19731k(Call eVar, IOException iOException);
}
