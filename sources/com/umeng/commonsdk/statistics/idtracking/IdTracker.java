package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.TBase;
import com.umeng.analytics.pro.TDeserializer;
import com.umeng.analytics.pro.TSerializer;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.proto.IdJournal;
import com.umeng.commonsdk.statistics.proto.IdSnapshot;
import com.umeng.commonsdk.statistics.proto.IdTracking;
import com.umeng.commonsdk.utils.UMConstant;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.e */
public class IdTracker {

    /* renamed from: a */
    public static final long f17722a = 86400000;

    /* renamed from: b */
    public static IdTracker f17723b = null;

    /* renamed from: c */
    private static final String f17724c = "umeng_it.cache";

    /* renamed from: j */
    private static Object f17725j = new Object();

    /* renamed from: d */
    private File f17726d;

    /* renamed from: e */
    private IdTracking f17727e = null;

    /* renamed from: f */
    private long f17728f;

    /* renamed from: g */
    private long f17729g;

    /* renamed from: h */
    private Set<AbstractIdTracker> f17730h = new HashSet();

    /* renamed from: i */
    private C3231a f17731i = null;

    /* renamed from: com.umeng.commonsdk.statistics.idtracking.e$a */
    /* compiled from: IdTracker */
    public static class C3231a {

        /* renamed from: a */
        private Context f17732a;

        /* renamed from: b */
        private Set<String> f17733b = new HashSet();

        public C3231a(Context context) {
            this.f17732a = context;
        }

        /* renamed from: a */
        public synchronized boolean mo19374a(String str) {
            return !this.f17733b.contains(str);
        }

        /* renamed from: b */
        public synchronized void mo19376b(String str) {
            this.f17733b.add(str);
        }

        /* renamed from: c */
        public void mo19377c(String str) {
            this.f17733b.remove(str);
        }

        /* renamed from: a */
        public synchronized void mo19373a() {
            if (!this.f17733b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String append : this.f17733b) {
                    sb.append(append);
                    sb.append(',');
                }
                sb.deleteCharAt(sb.length() - 1);
                PreferenceWrapper.getDefault(this.f17732a).edit().putString("invld_id", sb.toString()).commit();
            }
        }

        /* renamed from: b */
        public synchronized void mo19375b() {
            String string = PreferenceWrapper.getDefault(this.f17732a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string)) {
                String[] split = string.split(",");
                if (split != null) {
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f17733b.add(str);
                        }
                    }
                }
            }
        }
    }

    IdTracker(Context context) {
        this.f17726d = new File(context.getFilesDir(), f17724c);
        this.f17729g = 86400000;
        C3231a aVar = new C3231a(context);
        this.f17731i = aVar;
        aVar.mo19375b();
    }

    /* renamed from: a */
    public static synchronized void m22567a() {
        synchronized (IdTracker.class) {
            IdTracker eVar = f17723b;
            if (eVar != null) {
                eVar.mo19370e();
                f17723b = null;
            }
        }
    }

    /* renamed from: h */
    private synchronized void m22571h() {
        IdTracking cVar = new IdTracking();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (AbstractIdTracker aVar : this.f17730h) {
            if (aVar.mo19362c()) {
                if (aVar.mo19363d() != null) {
                    hashMap.put(aVar.mo19361b(), aVar.mo19363d());
                }
                if (aVar.mo19364e() != null && !aVar.mo19364e().isEmpty()) {
                    arrayList.addAll(aVar.mo19364e());
                }
            }
        }
        cVar.mo19502a((List<IdJournal>) arrayList);
        cVar.mo19503a((Map<String, IdSnapshot>) hashMap);
        synchronized (this) {
            this.f17727e = cVar;
        }
    }

    /* renamed from: i */
    private IdTracking m22572i() {
        InputStream inputStream;
        synchronized (f17725j) {
            if (!this.f17726d.exists()) {
                return null;
            }
            try {
                inputStream = new FileInputStream(this.f17726d);
                try {
                    byte[] readStreamToByteArray = HelperUtils.readStreamToByteArray(inputStream);
                    IdTracking cVar = new IdTracking();
                    new TDeserializer().mo18963a((TBase) cVar, readStreamToByteArray);
                    HelperUtils.safeClose(inputStream);
                    return cVar;
                } catch (Exception e) {
                    e = e;
                    try {
                        e.printStackTrace();
                        HelperUtils.safeClose(inputStream);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        HelperUtils.safeClose(inputStream);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                inputStream = null;
                e.printStackTrace();
                HelperUtils.safeClose(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                HelperUtils.safeClose(inputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo19367b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f17728f >= this.f17729g) {
            boolean z = false;
            for (AbstractIdTracker aVar : this.f17730h) {
                if (aVar.mo19362c()) {
                    if (aVar.mo19360a()) {
                        z = true;
                        if (!aVar.mo19362c()) {
                            this.f17731i.mo19376b(aVar.mo19361b());
                        }
                    }
                }
            }
            if (z) {
                m22571h();
                this.f17731i.mo19373a();
                mo19372g();
            }
            this.f17728f = currentTimeMillis;
        }
    }

    /* renamed from: c */
    public synchronized IdTracking mo19368c() {
        return this.f17727e;
    }

    /* renamed from: d */
    public String mo19369d() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo19370e() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.umeng.commonsdk.statistics.idtracking.e r0 = f17723b     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            java.util.Set<com.umeng.commonsdk.statistics.idtracking.a> r0 = r5.f17730h     // Catch:{ all -> 0x0044 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0044 }
            r1 = 0
            r2 = 0
        L_0x000f:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x0038
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0044 }
            com.umeng.commonsdk.statistics.idtracking.a r3 = (com.umeng.commonsdk.statistics.idtracking.AbstractIdTracker) r3     // Catch:{ all -> 0x0044 }
            boolean r4 = r3.mo19362c()     // Catch:{ all -> 0x0044 }
            if (r4 != 0) goto L_0x0022
            goto L_0x000f
        L_0x0022:
            java.util.List r4 = r3.mo19364e()     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x000f
            java.util.List r4 = r3.mo19364e()     // Catch:{ all -> 0x0044 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0044 }
            if (r4 != 0) goto L_0x000f
            r2 = 0
            r3.mo19359a(r2)     // Catch:{ all -> 0x0044 }
            r2 = 1
            goto L_0x000f
        L_0x0038:
            if (r2 == 0) goto L_0x0042
            com.umeng.commonsdk.statistics.proto.c r0 = r5.f17727e     // Catch:{ all -> 0x0044 }
            r0.mo19508b(r1)     // Catch:{ all -> 0x0044 }
            r5.mo19372g()     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r5)
            return
        L_0x0044:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x0048
        L_0x0047:
            throw r0
        L_0x0048:
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.IdTracker.mo19370e():void");
    }

    /* renamed from: f */
    public synchronized void mo19371f() {
        IdTracking i = m22572i();
        if (i != null) {
            m22568a(i);
            ArrayList<AbstractIdTracker> arrayList = new ArrayList<>(this.f17730h.size());
            synchronized (this) {
                this.f17727e = i;
                for (AbstractIdTracker aVar : this.f17730h) {
                    aVar.mo19358a(this.f17727e);
                    if (!aVar.mo19362c()) {
                        arrayList.add(aVar);
                    }
                }
                for (AbstractIdTracker remove : arrayList) {
                    this.f17730h.remove(remove);
                }
            }
            m22571h();
        }
    }

    /* renamed from: g */
    public synchronized void mo19372g() {
        IdTracking cVar = this.f17727e;
        if (cVar != null) {
            m22570b(cVar);
        }
    }

    /* renamed from: a */
    public static synchronized IdTracker m22566a(Context context) {
        IdTracker eVar;
        synchronized (IdTracker.class) {
            if (f17723b == null) {
                IdTracker eVar2 = new IdTracker(context);
                f17723b = eVar2;
                eVar2.m22569a((AbstractIdTracker) new ImeiTracker(context));
                f17723b.m22569a((AbstractIdTracker) new AndroidIdTracker(context));
                f17723b.m22569a((AbstractIdTracker) new UTDIdTracker(context));
                f17723b.m22569a((AbstractIdTracker) new IDMD5Tracker(context));
                f17723b.m22569a((AbstractIdTracker) new IDFATracker(context));
                f17723b.m22569a((AbstractIdTracker) new MacTracker(context));
                f17723b.m22569a((AbstractIdTracker) new SerialTracker());
                if (FieldManager.allow(UMConstant.f17889G)) {
                    f17723b.m22569a((AbstractIdTracker) new OaidTracking(context));
                }
                OldUMIDTracker jVar = new OldUMIDTracker(context);
                if (jVar.mo19378g()) {
                    f17723b.m22569a((AbstractIdTracker) jVar);
                    f17723b.m22569a((AbstractIdTracker) new NewUMIDTracker(context));
                    jVar.mo19380i();
                }
                f17723b.mo19371f();
            }
            eVar = f17723b;
        }
        return eVar;
    }

    /* renamed from: b */
    private void m22570b(IdTracking cVar) {
        byte[] a;
        synchronized (f17725j) {
            if (cVar != null) {
                try {
                    synchronized (this) {
                        m22568a(cVar);
                        a = new TSerializer().mo18975a(cVar);
                    }
                    if (a != null) {
                        HelperUtils.writeFile(this.f17726d, a);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m22569a(AbstractIdTracker aVar) {
        if (this.f17731i.mo19374a(aVar.mo19361b())) {
            return this.f17730h.add(aVar);
        }
        if (AnalyticsConstants.UM_DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("invalid domain: ");
            sb.append(aVar.mo19361b());
            MLog.m22461w(sb.toString());
        }
        return false;
    }

    /* renamed from: a */
    public void mo19366a(long j) {
        this.f17729g = j;
    }

    /* renamed from: a */
    private void m22568a(IdTracking cVar) {
        if (cVar != null) {
            Map<String, IdSnapshot> map = cVar.f17824a;
            if (map != null) {
                String str = "mac";
                if (map.containsKey(str) && !FieldManager.allow(UMConstant.f17929h)) {
                    cVar.f17824a.remove(str);
                }
                String str2 = "imei";
                if (cVar.f17824a.containsKey(str2) && !FieldManager.allow(UMConstant.f17928g)) {
                    cVar.f17824a.remove(str2);
                }
                String str3 = "android_id";
                if (cVar.f17824a.containsKey(str3) && !FieldManager.allow(UMConstant.f17930i)) {
                    cVar.f17824a.remove(str3);
                }
                String str4 = "serial";
                if (cVar.f17824a.containsKey(str4) && !FieldManager.allow(UMConstant.f17931j)) {
                    cVar.f17824a.remove(str4);
                }
                String str5 = "idfa";
                if (cVar.f17824a.containsKey(str5) && !FieldManager.allow(UMConstant.f17944w)) {
                    cVar.f17824a.remove(str5);
                }
                String str6 = "oaid";
                if (cVar.f17824a.containsKey(str6) && !FieldManager.allow(UMConstant.f17889G)) {
                    cVar.f17824a.remove(str6);
                }
            }
        }
    }
}
