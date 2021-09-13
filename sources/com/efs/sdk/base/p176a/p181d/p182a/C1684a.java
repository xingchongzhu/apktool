package com.efs.sdk.base.p176a.p181d.p182a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.efs.sdk.base.p176a.p179c.C1680c;
import com.efs.sdk.base.p176a.p179c.C1680c.C1681a;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.C1729e;
import com.efs.sdk.base.p176a.p187h.p188a.C1717d;

/* renamed from: com.efs.sdk.base.a.d.a.a */
public final class C1684a extends BroadcastReceiver implements Runnable {
    public final void onReceive(Context context, Intent intent) {
        C1717d.m14271a(this);
    }

    public final void run() {
        C1680c a = C1681a.f11336a;
        String b = C1729e.m14311b(C1682a.m14214a().f11299c);
        C1728d.m14308a("efs.info.manager", "network change: ".concat(String.valueOf(b)), null);
        a.f11334a.mo9651a("net", b);
    }
}
