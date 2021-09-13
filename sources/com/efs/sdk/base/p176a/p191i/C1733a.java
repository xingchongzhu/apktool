package com.efs.sdk.base.p176a.p191i;

import android.os.Handler;
import android.os.Message;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p187h.p188a.C1714a;

/* renamed from: com.efs.sdk.base.a.i.a */
public abstract class C1733a extends Handler {

    /* renamed from: a */
    public C1682a f11415a;

    C1733a() {
        super(C1714a.f11394a.getLooper());
        sendEmptyMessageDelayed(0, 60000);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo9697a();

    public void handleMessage(Message message) {
        super.handleMessage(message);
        mo9697a();
        sendEmptyMessageDelayed(0, 60000);
    }
}
