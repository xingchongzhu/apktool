package com.efs.sdk.p192pa.p193a;

import android.os.SystemClock;
import android.util.Printer;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.efs.sdk.pa.a.e */
final class C1760e implements Printer {

    /* renamed from: a */
    Vector<C1759d> f11485a = new Vector<>();

    /* renamed from: b */
    private boolean f11486b = false;

    /* renamed from: c */
    private String f11487c = null;

    /* renamed from: d */
    private long f11488d = -1;

    /* renamed from: e */
    private long f11489e = -1;

    /* renamed from: f */
    private long f11490f;

    C1760e() {
    }

    public final void println(String str) {
        if (str.startsWith(">")) {
            this.f11488d = SystemClock.elapsedRealtime();
            this.f11489e = SystemClock.currentThreadTimeMillis();
            this.f11487c = str;
            this.f11486b = true;
            Iterator it = this.f11485a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        if (this.f11486b && str.startsWith("<")) {
            this.f11486b = false;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11488d;
            if (elapsedRealtime > this.f11490f) {
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.f11489e;
                Iterator it2 = this.f11485a.iterator();
                while (it2.hasNext()) {
                    ((C1759d) it2.next()).mo9829a(this.f11487c, elapsedRealtime, currentThreadTimeMillis);
                }
            }
        }
    }
}
