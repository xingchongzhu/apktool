package p067c.p068a.p069a.p070a.p111m2;

import java.util.concurrent.ThreadFactory;

/* renamed from: c.a.a.a.m2.e */
/* compiled from: lambda */
public final /* synthetic */ class C1188e implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f8350a;

    public /* synthetic */ C1188e(String str) {
        this.f8350a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return Util.m10304n0(this.f8350a, runnable);
    }
}
