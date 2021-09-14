package com.efs.sdk.base.p176a.p183e;

import android.content.Context;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p187h.C1713a;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.C1731g;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: com.efs.sdk.base.a.e.f */
public final class C1694f {

    /* renamed from: b */
    static FileLock f11366b;

    /* renamed from: a */
    volatile int f11367a;

    /* renamed from: com.efs.sdk.base.a.e.f$a */
    public static class C1696a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C1694f f11370a = new C1694f(0);
    }

    /* synthetic */ C1694f(int b) {
        this();
    }

    /* renamed from: a */
    public final boolean mo9665a() {
        if (this.f11367a == 2) {
            return true;
        }
        if (this.f11367a == 0) {
            m14234a(C1682a.m14214a().f11299c);
        }
        return false;
    }

    private C1694f() {
        this.f11367a = 0;
        m14234a(C1682a.m14214a().f11299c);
    }

    /* renamed from: a */
    private synchronized void m14234a(final Context context) {
        C1728d.m14308a("efs.send_log", "tryFileLock start! ", null);
        this.f11367a = 1;
        new Thread(new Runnable() {
            public final void run() {
                FileLock lock;
                String str = "efs.send_log";
                try {
                    File a = C1713a.m14260a(context);
                    if (!a.exists()) {
                        a.mkdirs();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(a.getPath());
                    sb.append(File.separator);
                    sb.append("sendlock");
                    File file = new File(sb.toString());
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    do {
                        lock = new FileOutputStream(file).getChannel().lock();
                        C1694f.f11366b = lock;
                    } while (!lock.isValid());
                    StringBuilder sb2 = new StringBuilder("tryFileLock sendlock sucess! processname: ");
                    sb2.append(C1731g.m14319b());
                    C1728d.m14308a(str, sb2.toString(), null);
                    C1694f.this.f11367a = 2;
                } catch (Exception e) {
                    StringBuilder sb3 = new StringBuilder("tryFileLock fail! ");
                    sb3.append(e.getMessage());
                    C1728d.m14308a(str, sb3.toString(), null);
                    C1694f.this.f11367a = 0;
                }
            }
        }).start();
    }
}
