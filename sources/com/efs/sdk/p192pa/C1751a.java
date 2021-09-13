package com.efs.sdk.p192pa;

/* renamed from: com.efs.sdk.pa.a */
public final class C1751a implements PAANRListener {

    /* renamed from: a */
    private PAFactory f11449a;

    /* renamed from: b */
    private PATraceListener f11450b;

    public C1751a(PAFactory pAFactory) {
        this.f11449a = pAFactory;
        this.f11450b = pAFactory.getTraceListener();
        boolean enableTracer = pAFactory.getConfigManager().enableTracer();
        if (enableTracer) {
            C1765c.m14343a(this.f11449a, "patracepv", null);
        }
        PATraceListener pATraceListener = this.f11450b;
        if (pATraceListener != null) {
            pATraceListener.onCheck(enableTracer);
        }
    }

    public final void anrStack(String str) {
        if (str != null && str.length() > 200) {
            C1765c.m14343a(this.f11449a, "patrace", str);
            PATraceListener pATraceListener = this.f11450b;
            if (pATraceListener != null) {
                pATraceListener.onAnrTrace();
            }
        }
    }

    public final void unexcept(Object obj) {
        PATraceListener pATraceListener = this.f11450b;
        if (pATraceListener != null) {
            pATraceListener.onUnexcept(obj);
        }
    }
}
