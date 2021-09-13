package p067c.p068a.p069a.p070a.p111m2;

import java.util.concurrent.CopyOnWriteArraySet;
import p067c.p068a.p069a.p070a.p111m2.ListenerSet.C1195a;

/* renamed from: c.a.a.a.m2.a */
/* compiled from: lambda */
public final /* synthetic */ class C1184a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CopyOnWriteArraySet f8334a;

    /* renamed from: b */
    public final /* synthetic */ int f8335b;

    /* renamed from: c */
    public final /* synthetic */ C1195a f8336c;

    public /* synthetic */ C1184a(CopyOnWriteArraySet copyOnWriteArraySet, int i, C1195a aVar) {
        this.f8334a = copyOnWriteArraySet;
        this.f8335b = i;
        this.f8336c = aVar;
    }

    public final void run() {
        ListenerSet.m10365f(this.f8334a, this.f8335b, this.f8336c);
    }
}
