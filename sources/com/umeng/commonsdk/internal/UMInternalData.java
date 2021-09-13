package com.umeng.commonsdk.internal;

import android.content.Context;

/* renamed from: com.umeng.commonsdk.internal.b */
public class UMInternalData {

    /* renamed from: b */
    private static UMInternalData f17519b;

    /* renamed from: a */
    private Context f17520a;

    /* renamed from: c */
    private UMInternalDataProtocol f17521c;

    private UMInternalData(Context context) {
        this.f17520a = context;
        this.f17521c = new UMInternalDataProtocol(context);
    }

    /* renamed from: a */
    public static synchronized UMInternalData m22265a(Context context) {
        UMInternalData bVar;
        synchronized (UMInternalData.class) {
            if (f17519b == null) {
                f17519b = new UMInternalData(context.getApplicationContext());
            }
            bVar = f17519b;
        }
        return bVar;
    }

    /* renamed from: a */
    public UMInternalDataProtocol mo19254a() {
        return this.f17521c;
    }
}
