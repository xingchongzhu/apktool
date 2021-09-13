package com.efs.sdk.base.http;

import com.efs.sdk.base.p176a.p187h.p188a.C1715b;
import com.efs.sdk.base.p176a.p187h.p189b.C1720a;
import java.util.ArrayList;
import java.util.List;

public class HttpEnv {
    private List<C1715b<HttpResponse>> mHttpListenerList;
    private IHttpUtil mHttpUtil;

    static class SingletonHolder {
        /* access modifiers changed from: private */
        public static final HttpEnv INSTANCE = new HttpEnv();

        private SingletonHolder() {
        }
    }

    public static HttpEnv getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void addListener(AbsHttpListener absHttpListener) {
        this.mHttpListenerList.add(absHttpListener);
    }

    public List<C1715b<HttpResponse>> getHttpListenerList() {
        return new ArrayList(this.mHttpListenerList);
    }

    public IHttpUtil getHttpUtil() {
        return this.mHttpUtil;
    }

    public void removeListener(AbsHttpListener absHttpListener) {
        this.mHttpListenerList.remove(absHttpListener);
    }

    public void setHttpUtil(IHttpUtil iHttpUtil) {
        this.mHttpUtil = iHttpUtil;
    }

    private HttpEnv() {
        this.mHttpUtil = C1720a.m14286a();
        this.mHttpListenerList = new ArrayList(1);
    }
}
