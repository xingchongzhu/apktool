package p067c.p068a.p069a.p070a.p097j2;

import java.io.IOException;
import p067c.p068a.p069a.p070a.p097j2.MediaSourceEventListener.C1084a;

/* renamed from: c.a.a.a.j2.c */
/* compiled from: lambda */
public final /* synthetic */ class C1078c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1084a f7396a;

    /* renamed from: b */
    public final /* synthetic */ MediaSourceEventListener f7397b;

    /* renamed from: c */
    public final /* synthetic */ LoadEventInfo f7398c;

    /* renamed from: d */
    public final /* synthetic */ MediaLoadData f7399d;

    /* renamed from: e */
    public final /* synthetic */ IOException f7400e;

    /* renamed from: f */
    public final /* synthetic */ boolean f7401f;

    public /* synthetic */ C1078c(C1084a aVar, MediaSourceEventListener e0Var, LoadEventInfo wVar, MediaLoadData zVar, IOException iOException, boolean z) {
        this.f7396a = aVar;
        this.f7397b = e0Var;
        this.f7398c = wVar;
        this.f7399d = zVar;
        this.f7400e = iOException;
        this.f7401f = z;
    }

    public final void run() {
        this.f7396a.mo6854l(this.f7397b, this.f7398c, this.f7399d, this.f7400e, this.f7401f);
    }
}
