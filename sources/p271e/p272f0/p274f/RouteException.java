package p271e.p272f0.p274f;

import java.io.IOException;
import p271e.p272f0.C3310c;

/* renamed from: e.f0.f.e */
public final class RouteException extends RuntimeException {

    /* renamed from: a */
    private IOException f18147a;

    /* renamed from: b */
    private IOException f18148b;

    public RouteException(IOException iOException) {
        super(iOException);
        this.f18147a = iOException;
        this.f18148b = iOException;
    }

    /* renamed from: a */
    public void mo19767a(IOException iOException) {
        C3310c.m23047a(this.f18147a, iOException);
        this.f18148b = iOException;
    }

    /* renamed from: b */
    public IOException mo19768b() {
        return this.f18147a;
    }

    /* renamed from: c */
    public IOException mo19769c() {
        return this.f18148b;
    }
}
