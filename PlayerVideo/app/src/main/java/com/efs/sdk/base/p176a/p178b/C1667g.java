package com.efs.sdk.base.p176a.p178b;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.efs.sdk.base.p176a.p178b.C1658a.C1660b;
import com.efs.sdk.base.p176a.p179c.p180a.C1674c;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p184f.C1698b;
import com.efs.sdk.base.p176a.p185g.p186a.C1704c;
import com.efs.sdk.base.p176a.p185g.p186a.C1705d;
import com.efs.sdk.base.p176a.p187h.C1713a;
import com.efs.sdk.base.p176a.p187h.C1719b;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.p188a.C1714a;
import com.efs.sdk.base.p176a.p187h.p190c.C1727b;
import com.efs.sdk.base.p176a.p191i.C1738f.C1739a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.b.g */
public final class C1667g extends Handler implements C1665e {

    /* renamed from: a */
    private final ConcurrentHashMap<String, C1668a> f11292a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private C1705d f11293b = new C1705d();

    /* renamed from: c */
    private C1704c f11294c = new C1704c();

    /* renamed from: com.efs.sdk.base.a.b.g$a */
    static class C1668a extends FileOutputStream {

        /* renamed from: a */
        long f11295a = System.currentTimeMillis();

        /* renamed from: b */
        File f11296b;

        C1668a(File file) {
            super(file);
            this.f11296b = file;
        }
    }

    C1667g() {
        super(C1714a.f11394a.getLooper());
    }

    /* renamed from: b */
    private static long m14168b(String str) {
        Map c = C1674c.m14183a().mo9643c();
        String concat = "record_accumulation_time_".concat(String.valueOf(str));
        if (!c.containsKey(concat)) {
            return 60000;
        }
        String str2 = (String) c.get(concat);
        if (TextUtils.isEmpty(str2)) {
            return 60000;
        }
        try {
            return Math.max(Long.parseLong(str2) * 1000, 1000);
        } catch (Throwable th) {
            C1728d.m14309b("efs.cache", "get cache interval error", th);
            return 60000;
        }
    }

    /* renamed from: c */
    private void m14170c(String str) {
        String str2 = "wa";
        if (this.f11292a.containsKey(str)) {
            C1668a aVar = (C1668a) this.f11292a.get(str);
            if (aVar != null) {
                try {
                    aVar.flush();
                    C1719b.m14276a((Closeable) aVar);
                    mo9630a(aVar.f11296b);
                    this.f11292a.remove(str);
                    if (!str2.equalsIgnoreCase(str)) {
                        C1739a.f11432a.f11430c.mo9705c();
                    }
                } catch (Throwable th) {
                    this.f11292a.remove(str);
                    if (!str2.equalsIgnoreCase(str)) {
                        C1739a.f11432a.f11430c.mo9705c();
                    }
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9629a(C1698b bVar) {
        Message obtain = Message.obtain();
        obtain.obj = bVar;
        obtain.what = 0;
        sendMessage(obtain);
    }

    public final void handleMessage(Message message) {
        String str = "efs.cache";
        int i = message.what;
        if (i == 0) {
            C1698b bVar = (C1698b) message.obj;
            int i2 = 0;
            while (i2 < 3) {
                try {
                    C1668a b = m14169b(bVar);
                    String str2 = "writer is null for type ";
                    if (b == null) {
                        StringBuilder sb = new StringBuilder(str2);
                        sb.append(bVar.f11378a.f11371a);
                        C1728d.m14308a(str, sb.toString(), null);
                        return;
                    }
                    if (b.getChannel().position() + ((long) bVar.f11380c.length) > 819200) {
                        m14170c(bVar.f11378a.f11371a);
                        b = m14169b(bVar);
                        if (b == null) {
                            StringBuilder sb2 = new StringBuilder(str2);
                            sb2.append(bVar.f11378a.f11371a);
                            C1728d.m14308a(str, sb2.toString(), null);
                            return;
                        }
                    }
                    b.write(Base64.encode(bVar.f11380c, 11));
                    b.write("\n".getBytes());
                    return;
                } catch (Throwable th) {
                    C1728d.m14309b(str, "cache file error", th);
                    i2++;
                }
            }
        } else if (i == 1) {
            Object obj = message.obj;
            if (obj instanceof String) {
                m14170c(obj.toString());
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9632a(File file, C1698b bVar) {
        if (!bVar.mo9672b()) {
            mo9630a(file);
            return false;
        } else if (!file.exists()) {
            return false;
        } else {
            bVar.f11381d = file;
            bVar.mo9674d();
            bVar.mo9671b(1);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C1668a m14169b(com.efs.sdk.base.p176a.p184f.C1698b r6) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.a.b.g$a> r0 = r5.f11292a
            com.efs.sdk.base.a.f.a r1 = r6.f11378a
            java.lang.String r1 = r1.f11371a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0019
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.a.b.g$a> r0 = r5.f11292a
            com.efs.sdk.base.a.f.a r6 = r6.f11378a
            java.lang.String r6 = r6.f11371a
            java.lang.Object r6 = r0.get(r6)
            com.efs.sdk.base.a.b.g$a r6 = (com.efs.sdk.base.p176a.p178b.C1667g.C1668a) r6
            return r6
        L_0x0019:
            java.lang.String r0 = com.efs.sdk.base.p176a.p187h.C1719b.m14274a(r6)
            java.io.File r1 = new java.io.File
            com.efs.sdk.base.a.c.a r2 = com.efs.sdk.base.p176a.p181d.C1682a.m14214a()
            android.content.Context r2 = r2.f11299c
            com.efs.sdk.base.a.c.a r3 = com.efs.sdk.base.p176a.p181d.C1682a.m14214a()
            java.lang.String r3 = r3.f11297a
            java.io.File r2 = com.efs.sdk.base.p176a.p187h.C1713a.m14266e(r2, r3)
            r1.<init>(r2, r0)
            r0 = 0
            com.efs.sdk.base.a.b.g$a r2 = new com.efs.sdk.base.a.b.g$a     // Catch:{ all -> 0x0064 }
            r2.<init>(r1)     // Catch:{ all -> 0x0064 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.a.b.g$a> r0 = r5.f11292a     // Catch:{ all -> 0x0062 }
            com.efs.sdk.base.a.f.a r3 = r6.f11378a     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = r3.f11371a     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r0.putIfAbsent(r3, r2)     // Catch:{ all -> 0x0062 }
            com.efs.sdk.base.a.b.g$a r0 = (com.efs.sdk.base.p176a.p178b.C1667g.C1668a) r0     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x004d
            com.efs.sdk.base.p176a.p187h.C1719b.m14276a(r2)     // Catch:{ all -> 0x0062 }
            com.efs.sdk.base.p176a.p187h.C1719b.m14282b(r1)     // Catch:{ all -> 0x0062 }
            return r0
        L_0x004d:
            android.os.Message r0 = android.os.Message.obtain()     // Catch:{ all -> 0x0062 }
            com.efs.sdk.base.a.f.a r1 = r6.f11378a     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = r1.f11371a     // Catch:{ all -> 0x0062 }
            r0.obj = r1     // Catch:{ all -> 0x0062 }
            r3 = 1
            r0.what = r3     // Catch:{ all -> 0x0062 }
            long r3 = m14168b(r1)     // Catch:{ all -> 0x0062 }
            r5.sendMessageDelayed(r0, r3)     // Catch:{ all -> 0x0062 }
            goto L_0x006a
        L_0x0062:
            r0 = move-exception
            goto L_0x0067
        L_0x0064:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0067:
            r0.printStackTrace()
        L_0x006a:
            com.efs.sdk.base.a.f.a r6 = r6.f11378a
            java.lang.String r6 = r6.f11371a
            java.lang.String r0 = "wa"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 != 0) goto L_0x007f
            com.efs.sdk.base.a.i.f r6 = com.efs.sdk.base.p176a.p191i.C1738f.C1739a.f11432a
            com.efs.sdk.base.a.i.d r6 = r6.f11430c
            r6.mo9704b()
        L_0x007f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p176a.p178b.C1667g.m14169b(com.efs.sdk.base.a.f.b):com.efs.sdk.base.a.b.g$a");
    }

    /* renamed from: a */
    public final void mo9631a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Message obtain = Message.obtain();
            obtain.obj = str;
            obtain.what = 1;
            sendMessage(obtain);
        }
    }

    /* renamed from: a */
    public final void mo9630a(File file) {
        C1698b b = C1719b.m14281b(file.getName());
        if (b == null) {
            C1658a.m14150b(file);
            return;
        }
        if (m14167a(b, file)) {
            byte[] bArr = b.f11380c;
            if (bArr != null && bArr.length > 0) {
                C1719b.m14279a(new File(C1713a.m14267f(C1682a.m14214a().f11299c, C1682a.m14214a().f11297a), C1719b.m14274a(b)), b.f11380c);
                C1719b.m14282b(file);
                return;
            }
        }
        C1658a.m14150b(file);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private boolean m14167a(C1698b bVar, File file) {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader2);
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
                fileReader = fileReader2;
                try {
                    C1728d.m14309b("efs.cache", "local decode error", th);
                    C1719b.m14276a((Closeable) bufferedReader);
                    C1719b.m14276a((Closeable) fileReader);
                    return false;
                } catch (Throwable th2) {
                    C1719b.m14276a((Closeable) bufferedReader);
                    C1719b.m14276a((Closeable) fileReader);
                    throw th2;
                }
            }
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    String b = C1727b.m14306b(readLine.getBytes());
                    if (!TextUtils.isEmpty(b)) {
                        sb.append(b);
                        sb.append("\n");
                    }
                }
                bVar.mo9670a(sb.toString().getBytes());
                bVar.mo9674d();
                this.f11294c.mo9677a(bVar);
                this.f11293b.mo9677a(bVar);
                bVar.f11381d = file;
                C1719b.m14276a((Closeable) bufferedReader);
                C1719b.m14276a((Closeable) fileReader2);
                return true;
            } catch (Throwable th3) {
                th = th3;
                fileReader = fileReader2;
                C1728d.m14309b("efs.cache", "local decode error", th);
                C1719b.m14276a((Closeable) bufferedReader);
                C1719b.m14276a((Closeable) fileReader);
                return false;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            C1728d.m14309b("efs.cache", "local decode error", th);
            C1719b.m14276a((Closeable) bufferedReader);
            C1719b.m14276a((Closeable) fileReader);
            return false;
        }
    }
}
