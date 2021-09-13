package com.efs.sdk.base.p176a.p179c.p180a;

import com.efs.sdk.base.IConfigRefreshAction;

/* renamed from: com.efs.sdk.base.a.c.a.a */
public final class C1671a implements IConfigRefreshAction {

    /* renamed from: com.efs.sdk.base.a.c.a.a$a */
    static class C1672a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C1671a f11314a = new C1671a();
    }

    /* renamed from: a */
    public static C1671a m14179a() {
        return C1672a.f11314a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b3, code lost:
        com.efs.sdk.base.p176a.p187h.C1728d.m14307a(r3, "config request succ, config is:\n ".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c0, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String refresh() {
        /*
            r10 = this;
            com.efs.sdk.base.a.c.a r0 = com.efs.sdk.base.p176a.p181d.C1682a.m14214a()
            android.content.Context r0 = r0.f11299c
            android.net.NetworkInfo r0 = com.efs.sdk.base.p176a.p187h.C1729e.m14310a(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001e
            boolean r3 = r0.isConnected()
            if (r3 == 0) goto L_0x001e
            android.net.NetworkInfo$State r0 = r0.getState()
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.CONNECTED
            if (r0 != r3) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            java.lang.String r3 = "efs.config"
            java.lang.String r4 = ""
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "Config refresh fail, network is disconnected."
            com.efs.sdk.base.p176a.p187h.C1728d.m14307a(r3, r0)
            return r4
        L_0x002b:
            com.efs.sdk.base.a.c.a.c r0 = com.efs.sdk.base.p176a.p179c.p180a.C1674c.m14183a()
            java.lang.String r0 = r0.mo9639a(r2)
            com.efs.sdk.base.a.a.c r5 = com.efs.sdk.base.p176a.p177a.C1655c.m14141a()
        L_0x0037:
            r6 = 3
            if (r1 >= r6) goto L_0x00b3
            com.efs.sdk.base.a.a.a r6 = com.efs.sdk.base.p176a.p177a.C1651a.m14131a()
            java.lang.String r7 = r5.mo9622b()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r9 = "/apm_cc"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r6 = r6.f11268a
            if (r6 == 0) goto L_0x0066
            java.lang.String r6 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "get config from server, url is "
            java.lang.String r6 = r9.concat(r6)
            java.lang.String r9 = "efs.px.api"
            com.efs.sdk.base.p176a.p187h.C1728d.m14307a(r9, r6)
        L_0x0066:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>(r2)
            java.lang.String r9 = "wpk-header"
            r6.put(r9, r7)
            com.efs.sdk.base.a.h.b.d r7 = new com.efs.sdk.base.a.h.b.d
            r7.<init>(r8)
            com.efs.sdk.base.a.h.b.d r6 = r7.mo9696a(r6)
            com.efs.sdk.base.a.a.b r7 = com.efs.sdk.base.p176a.p177a.C1653b.m14137a()
            com.efs.sdk.base.a.h.b.d r6 = r6.mo9694a(r7)
            com.efs.sdk.base.a.h.b.c r6 = r6.mo9693a()
            com.efs.sdk.base.a.h.b.b r7 = r6.f11407a
            java.lang.String r8 = "get"
            r7.f11404e = r8
            java.lang.Object r6 = r6.mo9685a()
            com.efs.sdk.base.http.HttpResponse r6 = (com.efs.sdk.base.http.HttpResponse) r6
            boolean r7 = r6.succ
            if (r7 == 0) goto L_0x0098
            java.lang.String r4 = r6.data
            goto L_0x00b3
        L_0x0098:
            java.lang.String r7 = r6.getBizCode()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00b2
            java.lang.String r6 = r6.getBizCode()
            java.lang.String r7 = "1000"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x00af
            goto L_0x00b2
        L_0x00af:
            int r1 = r1 + 1
            goto L_0x0037
        L_0x00b2:
            return r4
        L_0x00b3:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "config request succ, config is:\n "
            java.lang.String r0 = r1.concat(r0)
            com.efs.sdk.base.p176a.p187h.C1728d.m14307a(r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p176a.p179c.p180a.C1671a.refresh():java.lang.String");
    }
}
