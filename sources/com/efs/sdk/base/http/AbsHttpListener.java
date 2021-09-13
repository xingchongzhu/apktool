package com.efs.sdk.base.http;

import com.efs.sdk.base.p176a.p187h.p188a.C1715b;

public abstract class AbsHttpListener implements C1715b<HttpResponse> {
    public abstract void onError(HttpResponse httpResponse);

    public abstract void onSuccess(HttpResponse httpResponse);

    public void result(HttpResponse httpResponse) {
        if (httpResponse == null || !httpResponse.succ) {
            onError(httpResponse);
        } else {
            onSuccess(httpResponse);
        }
    }
}
