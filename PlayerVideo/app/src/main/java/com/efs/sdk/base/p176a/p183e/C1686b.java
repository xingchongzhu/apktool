package com.efs.sdk.base.p176a.p183e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import com.efs.sdk.base.p176a.p179c.C1680c.C1681a;
import com.efs.sdk.base.p176a.p179c.p180a.C1674c;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p187h.C1713a;
import com.efs.sdk.base.p176a.p187h.C1719b;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.p188a.C1714a;
import com.efs.sdk.base.p176a.p191i.C1738f.C1739a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.e.b */
public class C1686b extends Handler {

    /* renamed from: a */
    private static final Map<String, Long> f11348a = new HashMap<String, Long>() {
        {
            put("flow_5min", Long.valueOf(300000));
            put("flow_hour", Long.valueOf(3600000));
            put("flow_day", Long.valueOf(86400000));
        }
    };

    /* renamed from: b */
    private static final Map<String, Long> f11349b = new HashMap<String, Long>() {
        {
            Long valueOf = Long.valueOf(1048576);
            put("flow_5min", valueOf);
            put("flow_hour", valueOf);
            put("flow_day", Long.valueOf(2097152));
        }
    };

    /* renamed from: c */
    private Map<String, AtomicInteger> f11350c;

    /* renamed from: d */
    private volatile SharedPreferences f11351d;

    /* renamed from: e */
    private volatile Editor f11352e;

    /* renamed from: f */
    private Context f11353f;

    /* renamed from: g */
    private String f11354g;

    /* renamed from: com.efs.sdk.base.a.e.b$a */
    static class C1689a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C1686b f11355a = new C1686b(0);
    }

    /* synthetic */ C1686b(byte b) {
        this();
    }

    /* renamed from: a */
    public static C1686b m14222a() {
        return C1689a.f11355a;
    }

    /* renamed from: b */
    private void m14226b() {
        try {
            m14227c();
        } catch (Throwable th) {
            C1728d.m14309b("efs.flow", "init sharedpreferences error", th);
        }
    }

    /* renamed from: c */
    private void m14227c() {
        if (this.f11351d == null) {
            synchronized (C1686b.class) {
                if (this.f11351d == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f11354g.toLowerCase());
                    sb.append("_flow");
                    this.f11351d = SharedPreferencesUtils.getSharedPreferences(this.f11353f, sb.toString());
                }
            }
        }
        if (this.f11352e == null) {
            synchronized (C1686b.class) {
                if (this.f11352e == null) {
                    this.f11352e = this.f11351d.edit();
                }
            }
        }
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i = message.what;
        String str = "curr_time_";
        String str2 = "efs.flow";
        if (i == 0) {
            m14226b();
            if (this.f11351d == null) {
                C1728d.m14308a(str2, "sharedpreferences is null, cann't get last flow stat", null);
            } else if (this.f11352e == null) {
                C1728d.m14308a(str2, "sharedpreferences editor is null, cann't refresh flow stat", null);
            } else {
                String valueOf = String.valueOf(message.obj);
                long j = (long) message.arg1;
                String a = C1681a.f11336a.mo9653a();
                for (String str3 : f11348a.keySet()) {
                    String concat = str.concat(String.valueOf(str3));
                    if (!this.f11351d.contains(concat)) {
                        this.f11352e.putLong(concat, System.currentTimeMillis());
                    }
                    for (String str4 : m14223a(str3, valueOf, a)) {
                        this.f11352e.putLong(str4, this.f11351d.getLong(str4, 0) + j);
                    }
                }
                this.f11352e.apply();
            }
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder("flow stat listener not support action '");
            sb.append(message.what);
            sb.append("'");
            C1728d.m14308a(str2, sb.toString(), null);
        } else {
            String valueOf2 = String.valueOf(message.obj);
            long j2 = (long) message.arg1;
            m14226b();
            if (this.f11351d == null) {
                C1728d.m14308a(str2, "sharedpreferences is null, cann't get last refresh timestamp", null);
            } else if (this.f11352e == null) {
                C1728d.m14308a(str2, "sharedpreferences editor is null, cann't refresh timestamp", null);
            } else {
                String concat2 = str.concat(valueOf2);
                if (Math.abs(System.currentTimeMillis() - this.f11351d.getLong(concat2, System.currentTimeMillis())) >= j2) {
                    for (String str5 : this.f11351d.getAll().keySet()) {
                        if (str5.startsWith(valueOf2)) {
                            this.f11352e.putLong(str5, 0);
                        }
                    }
                    this.f11352e.putLong(concat2, System.currentTimeMillis());
                    this.f11352e.apply();
                    this.f11350c.clear();
                }
            }
        }
    }

    private C1686b() {
        super(C1714a.f11394a.getLooper());
        this.f11350c = new ConcurrentHashMap(5);
        this.f11353f = C1682a.m14214a().f11299c;
        this.f11354g = C1682a.m14214a().f11297a;
        m14226b();
        File c = C1713a.m14264c(C1682a.m14214a().f11299c, C1682a.m14214a().f11297a);
        if (c.exists()) {
            C1719b.m14282b(c);
        }
    }

    /* renamed from: a */
    private boolean m14225a(String str, long j, String str2, String str3, long j2) {
        String str4 = str;
        long j3 = j2;
        m14226b();
        boolean z = false;
        String str5 = "efs.flow";
        if (this.f11351d == null) {
            C1728d.m14308a(str5, "sharedpreferences is null, cann't get last flow stat", null);
            return false;
        }
        List a = m14223a(str4, str2, str3);
        Map c = C1674c.m14183a().mo9643c();
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            String str6 = (String) it.next();
            if (Math.abs(System.currentTimeMillis() - this.f11351d.getLong("curr_time_".concat(String.valueOf(str)), System.currentTimeMillis())) > j) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = str4;
                obtain.arg1 = Long.valueOf(j).intValue();
                sendMessage(obtain);
            }
            long a2 = m14221a(c, str4, str6);
            long j4 = this.f11351d.getLong(str6, 0);
            if (j4 + j3 > a2) {
                StringBuilder sb = new StringBuilder("flow limit, key: ");
                sb.append(str6);
                sb.append(", max: ");
                sb.append(a2);
                sb.append(", now: ");
                sb.append(j4);
                sb.append(", size: ");
                sb.append(j3);
                C1728d.m14307a(str5, sb.toString());
                m14224a(str6);
                break;
            }
        }
        return z;
    }

    /* renamed from: a */
    private void m14224a(String str) {
        if (!this.f11350c.containsKey(str) || this.f11350c.get(str) == null || ((AtomicInteger) this.f11350c.get(str)).get() <= 10) {
            C1739a.f11432a.mo9710a(C1674c.m14183a().f11324d.f11315a, str);
            if (str.equals("flow_day")) {
                C1739a.f11432a.mo9709a(C1674c.m14183a().f11324d.f11315a);
            }
            if (!this.f11350c.containsKey(str)) {
                this.f11350c.put(str, new AtomicInteger());
            }
            ((AtomicInteger) this.f11350c.get(str)).incrementAndGet();
        }
    }

    /* renamed from: a */
    private static long m14221a(Map<String, String> map, String str, String str2) {
        long longValue = ((Long) f11349b.get(str)).longValue();
        if (map == null || !map.containsKey(str2) || TextUtils.isEmpty((CharSequence) map.get(str2))) {
            return longValue;
        }
        try {
            return Long.parseLong((String) map.get(str2));
        } catch (Throwable th) {
            C1728d.m14308a("efs.flow", "get max flow error", th);
            return longValue;
        }
    }

    /* renamed from: a */
    private static List<String> m14223a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        String str4 = "_";
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str4);
            sb.append(str2);
            arrayList.add(sb.toString());
        }
        if (!TextUtils.isEmpty(str3) && !"unknown".equalsIgnoreCase(str3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(str4);
            sb2.append(str3);
            arrayList.add(sb2.toString());
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(str4);
            sb3.append(str2);
            sb3.append(str4);
            sb3.append(str3);
            arrayList.add(sb3.toString());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo9660a(String str, long j) {
        String a = C1681a.f11336a.mo9653a();
        boolean z = true;
        for (Entry entry : f11348a.entrySet()) {
            z = m14225a((String) entry.getKey(), ((Long) entry.getValue()).longValue(), str, a, j);
            if (!z) {
                break;
            }
        }
        return z;
    }
}
