package com.umeng.analytics;

import android.content.Context;
import com.umeng.analytics.pro.CoreProtocolImpl;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMSenderStateNotify;
import org.json.JSONObject;

public class CoreProtocol implements UMLogDataProtocol, UMSenderStateNotify {

    /* renamed from: a */
    private static Context f16473a;

    /* renamed from: com.umeng.analytics.CoreProtocol$a */
    private static class C3095a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final CoreProtocol f16474a = new CoreProtocol();

        private C3095a() {
        }
    }

    public static CoreProtocol getInstance(Context context) {
        if (f16473a == null && context != null) {
            f16473a = context.getApplicationContext();
        }
        return C3095a.f16474a;
    }

    public void onConnectionAvailable() {
        CoreProtocolImpl.m22007a(f16473a).mo19134a();
    }

    public void onSenderIdle() {
        CoreProtocolImpl.m22007a(f16473a).mo19141b();
    }

    public void removeCacheData(Object obj) {
        CoreProtocolImpl.m22007a(f16473a).mo19135a(obj);
    }

    public JSONObject setupReportData(long j) {
        return CoreProtocolImpl.m22007a(f16473a).mo19133a(j);
    }

    public void workEvent(Object obj, int i) {
        CoreProtocolImpl.m22007a(f16473a).mo19136a(obj, i);
    }

    private CoreProtocol() {
    }
}
