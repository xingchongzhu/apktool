package com.tv91.p255z.p256g;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import okhttp3.C3378z;
import okhttp3.Interceptor;
import okhttp3.Response;
import p295h.p296a.Timber;

/* renamed from: com.tv91.z.g.c */
public final class RetryInterceptor implements Interceptor {

    /* renamed from: a */
    private int f16188a = 0;

    /* renamed from: b */
    private Response m20851b(C3373a aVar) throws IOException {
        long seconds = TimeUnit.MILLISECONDS.toSeconds((long) aVar.mo19801b());
        while (true) {
            int i = this.f16188a;
            String str = "Retry(%d) request as no server response for %d seconds";
            if (i < 2) {
                try {
                    return aVar.mo19803d(aVar.mo19799S());
                } catch (SocketTimeoutException unused) {
                    int i2 = this.f16188a + 1;
                    this.f16188a = i2;
                    Timber.m24039a(str, Integer.valueOf(i2), Long.valueOf(seconds));
                }
            } else {
                Timber.m24039a(str, Integer.valueOf(i), Long.valueOf(seconds));
                return aVar.mo19803d(aVar.mo19799S());
            }
        }
    }

    /* renamed from: a */
    public Response mo18702a(C3373a aVar) throws IOException {
        C3378z S = aVar.mo19799S();
        if (S.mo20146h(RequestTag.class) != null) {
            return m20851b(aVar);
        }
        return aVar.mo19803d(S);
    }
}
