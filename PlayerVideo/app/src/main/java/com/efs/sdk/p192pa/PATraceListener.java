package com.efs.sdk.p192pa;

/* renamed from: com.efs.sdk.pa.PATraceListener */
public interface PATraceListener {
    void onAnrTrace();

    void onCheck(boolean z);

    void onUnexcept(Object obj);
}
