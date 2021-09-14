package com.efs.sdk.base.p176a.p178b;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.efs.sdk.base.p176a.p178b.C1658a.C1660b;
import com.efs.sdk.base.p176a.p179c.p180a.C1674c;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p187h.C1713a;
import com.efs.sdk.base.p176a.p187h.C1719b;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.p188a.C1714a;
import com.efs.sdk.base.p176a.p187h.p188a.C1717d;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.b.c */
public final class C1662c extends Handler implements Runnable {

    /* renamed from: a */
    public boolean f11290a;

    /* renamed from: com.efs.sdk.base.a.b.c$a */
    static class C1663a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C1662c f11291a = new C1662c(0);
    }

    /* synthetic */ C1662c(int b) {
        this();
    }

    /* renamed from: a */
    public static C1662c m14156a() {
        return C1663a.f11291a;
    }

    public final void handleMessage(Message message) {
        if (message.what != 2) {
            StringBuilder sb = new StringBuilder("disk listener not support command: ");
            sb.append(message.what);
            C1728d.m14308a("efs.cache", sb.toString(), null);
            return;
        }
        C1717d.m14271a(this);
    }

    public final void run() {
        File f = C1713a.m14267f(C1682a.m14214a().f11299c, C1682a.m14214a().f11297a);
        if (f.exists()) {
            for (File file : C1719b.m14284d(f)) {
                if (C1658a.m14149a(file.getName())) {
                    C1658a.m14151c(file);
                }
            }
        }
        C1674c a = C1674c.m14183a();
        String str = "disk_bytes";
        String str2 = "4194304";
        String str3 = a.f11324d.f11319e.containsKey(str) ? (String) a.f11324d.f11319e.get(str) : str2;
        if (!TextUtils.isEmpty(str3)) {
            str2 = str3;
        }
        long parseLong = Long.parseLong(str2);
        long c = C1719b.m14283c(C1713a.m14267f(C1682a.m14214a().f11299c, C1682a.m14214a().f11297a)) + C1719b.m14283c(C1713a.m14265d(C1682a.m14214a().f11299c, C1682a.m14214a().f11297a));
        boolean z = c < parseLong;
        this.f11290a = z;
        if (!z) {
            StringBuilder sb = new StringBuilder("Cache Limited! curr ");
            sb.append(c);
            sb.append("byte, max ");
            sb.append(parseLong);
            sb.append(" byte.");
            C1728d.m14308a("efs.cache", sb.toString(), null);
        }
        sendEmptyMessageDelayed(2, 600000);
    }

    private C1662c() {
        super(C1714a.f11394a.getLooper());
        this.f11290a = true;
        sendEmptyMessageDelayed(2, 60000);
    }
}
