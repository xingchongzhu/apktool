package com.efs.sdk.base.p176a.p178b;

import com.efs.sdk.base.p176a.p177a.C1651a;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p184f.C1698b;
import com.efs.sdk.base.p176a.p187h.C1713a;
import com.efs.sdk.base.p176a.p187h.C1719b;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.C1731g;
import com.efs.sdk.base.p176a.p191i.C1738f.C1739a;
import java.io.File;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.efs.sdk.base.a.b.a */
public final class C1658a {

    /* renamed from: a */
    public boolean f11284a;

    /* renamed from: b */
    public boolean f11285b;

    /* renamed from: c */
    public C1661b f11286c;

    /* renamed from: d */
    public C1659a f11287d;

    /* renamed from: com.efs.sdk.base.a.b.a$a */
    public static class C1659a implements Comparator<File> {
        @Override
        public int compare(File obj, File obj2) {
            long lastModified = ((File) obj).lastModified() - ((File) obj2).lastModified();
            if (lastModified > 0) {
                return 1;
            }
            return lastModified == 0 ? 0 : -1;
        }
    }

    /* renamed from: com.efs.sdk.base.a.b.a$b */
    public static class C1660b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C1658a f11288a = new C1658a(0);
    }

    /* synthetic */ C1658a(int b) {
        this();
    }

    /* renamed from: b */
    static void m14150b(File file) {
        if (!file.getName().startsWith("wa_")) {
            C1739a.f11432a.f11430c.mo9707e();
        }
        C1719b.m14282b(file);
    }

    /* renamed from: c */
    static void m14151c(File file) {
        StringBuilder sb = new StringBuilder("file is expire: ");
        sb.append(file.getName());
        sb.append(", now is ");
        C1651a.m14131a();
        sb.append(C1651a.m14134b());
        C1728d.m14307a("efs.cache", sb.toString());
        if (!file.getName().startsWith("wa_")) {
            C1739a.f11432a.f11430c.mo9706d();
        }
        C1719b.m14282b(file);
    }

    /* renamed from: a */
    public final void mo9624a() {
        File d = C1713a.m14265d(C1682a.m14214a().f11299c, C1682a.m14214a().f11297a);
        if (d.exists() && d.isDirectory()) {
            String[] list = d.list();
            if (list != null && list.length > 0) {
                for (String str : list) {
                    if (!C1731g.m14318a(C1682a.m14214a().f11299c, str)) {
                        File file = new File(d, str);
                        List<File> d2 = C1719b.m14284d(file);
                        if (!d2.isEmpty()) {
                            for (File file2 : d2) {
                                if (m14149a(file2.getName())) {
                                    m14151c(file2);
                                } else {
                                    C1698b b = C1719b.m14281b(file2.getName());
                                    if (b == null) {
                                        m14150b(file2);
                                    } else {
                                        C1665e a = this.f11286c.mo9626a((byte) b.f11378a.f11372b);
                                        if (a == null) {
                                            m14150b(file2);
                                        } else {
                                            a.mo9630a(file2);
                                        }
                                    }
                                }
                            }
                        }
                        C1719b.m14282b(file);
                    }
                }
            }
        }
    }

    private C1658a() {
        this.f11284a = false;
        this.f11285b = true;
        this.f11286c = new C1661b();
        this.f11287d = new C1659a();
    }

    /* renamed from: a */
    static boolean m14149a(String str) {
        try {
            long parseLong = Long.parseLong(str.substring(str.lastIndexOf("_") + 1));
            C1651a.m14131a();
            if (Math.abs(C1651a.m14134b() - parseLong) >= 604800000) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final C1698b mo9623a(File file) {
        try {
            if (!file.exists()) {
                return null;
            }
            if (m14149a(file.getName())) {
                m14151c(file);
                return null;
            }
            C1698b b = C1719b.m14281b(file.getName());
            if (b == null) {
                m14150b(file);
                return null;
            }
            C1665e a = this.f11286c.mo9626a((byte) b.f11378a.f11372b);
            if (a == null) {
                m14150b(file);
                return null;
            } else if (a.mo9632a(file, b)) {
                return b;
            } else {
                m14150b(file);
                return null;
            }
        } catch (Throwable th) {
            C1728d.m14308a("efs.base", "efs.cache", th);
            m14150b(file);
            return null;
        }
    }
}
