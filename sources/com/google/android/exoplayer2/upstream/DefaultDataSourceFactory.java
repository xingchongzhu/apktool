package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.C1916m.C1917a;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource.C1924b;

/* renamed from: com.google.android.exoplayer2.upstream.t */
public final class DefaultDataSourceFactory implements C1917a {

    /* renamed from: a */
    private final Context f12415a;

    /* renamed from: b */
    private final TransferListener f12416b;

    /* renamed from: c */
    private final C1917a f12417c;

    public DefaultDataSourceFactory(Context context) {
        this(context, (String) null, (TransferListener) null);
    }

    /* renamed from: b */
    public DefaultDataSource mo14939a() {
        DefaultDataSource sVar = new DefaultDataSource(this.f12415a, this.f12417c.mo14939a());
        TransferListener e0Var = this.f12416b;
        if (e0Var != null) {
            sVar.mo7017k(e0Var);
        }
        return sVar;
    }

    public DefaultDataSourceFactory(Context context, String str) {
        this(context, str, (TransferListener) null);
    }

    public DefaultDataSourceFactory(Context context, String str, TransferListener e0Var) {
        this(context, e0Var, (C1917a) new C1924b().mo14972c(str));
    }

    public DefaultDataSourceFactory(Context context, TransferListener e0Var, C1917a aVar) {
        this.f12415a = context.getApplicationContext();
        this.f12416b = e0Var;
        this.f12417c = aVar;
    }
}
