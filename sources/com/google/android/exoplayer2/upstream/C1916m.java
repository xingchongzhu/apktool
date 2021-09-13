package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.m */
/* compiled from: DataSource */
public interface C1916m extends DataReader {

    /* renamed from: com.google.android.exoplayer2.upstream.m$a */
    /* compiled from: DataSource */
    public interface C1917a {
        /* renamed from: a */
        C1916m mo14939a();
    }

    void close() throws IOException;

    /* renamed from: e */
    long mo7015e(DataSpec pVar) throws IOException;

    /* renamed from: g */
    Map<String, List<String>> mo7016g();

    /* renamed from: k */
    void mo7017k(TransferListener e0Var);

    /* renamed from: l */
    Uri mo7018l();
}
