package p067c.p068a.p069a.p070a.p072b2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: c.a.a.a.b2.j */
/* compiled from: lambda */
public final /* synthetic */ class C0822j implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f5518a;

    public /* synthetic */ C0822j(Handler handler) {
        this.f5518a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f5518a.post(runnable);
    }
}
