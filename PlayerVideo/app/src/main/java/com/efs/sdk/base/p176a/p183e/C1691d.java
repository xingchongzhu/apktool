package com.efs.sdk.base.p176a.p183e;

import android.os.Handler;
import android.os.Message;
import com.efs.sdk.base.p176a.p178b.C1658a;
import com.efs.sdk.base.p176a.p178b.C1658a.C1660b;
import com.efs.sdk.base.p176a.p178b.C1666f;
import com.efs.sdk.base.p176a.p178b.C1669h;
import com.efs.sdk.base.p176a.p179c.C1680c.C1681a;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p183e.C1694f.C1696a;
import com.efs.sdk.base.p176a.p184f.C1698b;
import com.efs.sdk.base.p176a.p187h.C1713a;
import com.efs.sdk.base.p176a.p187h.C1719b;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.p188a.C1714a;
import com.efs.sdk.base.p176a.p187h.p188a.C1717d;
import com.efs.sdk.base.p176a.p191i.C1734b;
import com.efs.sdk.base.p176a.p191i.C1737e;
import com.efs.sdk.base.p176a.p191i.C1738f;
import com.efs.sdk.base.p176a.p191i.C1738f.C1739a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.e.d */
public final class C1691d extends Handler {

    /* renamed from: a */
    public int f11356a;

    /* renamed from: b */
    public C1690c f11357b;

    /* renamed from: c */
    private C1690c f11358c;

    /* renamed from: d */
    private List<String> f11359d;

    /* renamed from: e */
    private AtomicInteger f11360e;

    /* renamed from: f */
    private C1666f f11361f;

    /* renamed from: com.efs.sdk.base.a.e.d$a */
    static class C1692a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C1691d f11362a = new C1691d(0);
    }

    /* synthetic */ C1691d(byte b) {
        this();
    }

    /* renamed from: a */
    public static C1691d m14231a() {
        return C1692a.f11362a;
    }

    public final void handleMessage(Message message) {
        List<File> list;
        super.handleMessage(message);
        if (C1696a.f11370a.mo9665a()) {
            int i = message.what;
            String str = "efs.send_log";
            if (i == 0) {
                String a = C1681a.f11336a.mo9653a();
                if ("denied".equalsIgnoreCase(a) || "disconnected".equalsIgnoreCase(a)) {
                    C1728d.m14307a(str, "log cann't be send because net status is ".concat(String.valueOf(a)));
                    sendEmptyMessageDelayed(0, C1682a.m14214a().f11308l);
                } else {
                    List<C1698b> emptyList = Collections.emptyList();
                    try {
                        C1658a a2 = C1660b.f11288a;
                        int i2 = this.f11356a;
                        C1666f fVar = this.f11361f;
                        a2.mo9624a();
                        a2.mo9624a();
                        File f = C1713a.m14267f(C1682a.m14214a().f11299c, C1682a.m14214a().f11297a);
                        if (!f.exists()) {
                            list = Collections.emptyList();
                        } else {
                            List d = C1719b.m14284d(f);
                            if (a2.f11285b) {
                                C1738f a3 = C1739a.f11432a;
                                int size = d.size();
                                if (a3.f11429b != null) {
                                    if (C1682a.m14214a().f11300d) {
                                        C1734b bVar = new C1734b("efs_core", "log_lag", a3.f11428a.f11422c);
                                        bVar.put("cnt", Integer.valueOf(size));
                                        a3.f11429b.mo9654a(bVar);
                                    }
                                }
                                a2.f11285b = false;
                            }
                            Collections.sort(d, a2.f11287d);
                            List arrayList = new ArrayList(i2);
                            for (int size2 = d.size() - 1; size2 >= 0 && arrayList.size() < i2; size2--) {
                                File file = (File) d.get(size2);
                                if (file.exists() && (fVar == null || !fVar.mo9633a(file))) {
                                    arrayList.add(file);
                                }
                            }
                            list = arrayList;
                        }
                        List arrayList2 = new ArrayList(i2);
                        for (File file2 : list) {
                            C1698b a4 = a2.mo9623a(file2);
                            if (a4 == null) {
                                StringBuilder sb = new StringBuilder("file upload error, name is ");
                                sb.append(file2.getName());
                                C1728d.m14308a("efs.cache", sb.toString(), null);
                            } else {
                                arrayList2.add(a4);
                            }
                        }
                        emptyList = arrayList2;
                    } catch (Throwable unused) {
                    }
                    for (C1698b bVar2 : emptyList) {
                        String str2 = "wa";
                        if (str2.equals(bVar2.f11378a.f11371a) || C1686b.m14222a().mo9660a(bVar2.f11378a.f11371a, bVar2.mo9667a())) {
                            C1690c cVar = this.f11357b;
                            if (str2.equals(bVar2.f11378a.f11371a)) {
                                cVar = this.f11358c;
                            }
                            String uuid = UUID.randomUUID().toString();
                            this.f11359d.add(uuid);
                            if (C1717d.m14271a(new C1693e(bVar2, cVar, uuid)) == null) {
                                mo9662a(uuid, -1);
                            }
                        }
                    }
                    if (this.f11359d.size() <= 0) {
                        sendEmptyMessageDelayed(0, C1682a.m14214a().f11308l);
                    }
                }
            } else if (i == 1) {
                Object obj = message.obj;
                if (obj != null) {
                    this.f11359d.remove(obj.toString());
                }
                int incrementAndGet = message.arg1 != 0 ? this.f11360e.incrementAndGet() : 0;
                if (this.f11359d.isEmpty()) {
                    if (incrementAndGet < 5) {
                        sendEmptyMessage(0);
                        return;
                    }
                    this.f11360e.set(0);
                    sendEmptyMessageDelayed(0, C1682a.m14214a().f11307k);
                    C1728d.m14307a(str, "request error cnt gt 5, next request delay 10s");
                }
            }
        }
    }

    private C1691d() {
        super(C1714a.f11394a.getLooper());
        this.f11356a = 5;
        this.f11359d = new ArrayList();
        this.f11360e = new AtomicInteger(0);
        this.f11357b = new C1685a();
        this.f11358c = new C1737e();
        this.f11361f = new C1669h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9662a(Object obj, int i) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = obj;
        obtain.arg1 = i;
        sendMessage(obtain);
    }
}
