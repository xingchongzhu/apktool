package com.efs.sdk.base.p176a.p179c.p180a;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.IConfigRefreshAction;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.p176a.p181d.C1682a;
import com.efs.sdk.base.p176a.p183e.C1694f.C1696a;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.p188a.C1714a;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.efs.sdk.base.a.c.a.c */
public final class C1674c implements Callback {

    /* renamed from: a */
    public static final Random f11321a = new Random();

    /* renamed from: b */
    public IConfigRefreshAction f11322b;

    /* renamed from: c */
    public boolean f11323c;

    /* renamed from: d */
    public C1673b f11324d;

    /* renamed from: e */
    public Map<IConfigCallback, String[]> f11325e;

    /* renamed from: f */
    private Handler f11326f;

    /* renamed from: g */
    private C1678e f11327g;

    /* renamed from: h */
    private long f11328h;

    /* renamed from: com.efs.sdk.base.a.c.a.c$a */
    static class C1676a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C1674c f11330a = new C1674c(0);
    }

    /* synthetic */ C1674c(byte b) {
        this();
    }

    /* renamed from: e */
    private void m14187e() {
        String str = "efs.config";
        if (!C1696a.f11370a.mo9665a()) {
            C1728d.m14307a(str, "has no permission to refresh config from remote");
        } else if (!this.f11323c) {
            C1728d.m14307a(str, "disable refresh config from remote");
        } else {
            String refresh = m14189g().refresh();
            C1728d.m14307a(str, "efs config is ".concat(String.valueOf(refresh)));
            if (!TextUtils.isEmpty(refresh)) {
                mo9641a(refresh);
            }
        }
    }

    /* renamed from: f */
    private void m14188f() {
        boolean z;
        try {
            z = this.f11327g.mo9647a(this.f11324d);
        } catch (Throwable unused) {
            z = false;
        }
        if (!z) {
            this.f11326f.sendEmptyMessageDelayed(3, 3000);
        }
    }

    /* renamed from: g */
    private IConfigRefreshAction m14189g() {
        IConfigRefreshAction iConfigRefreshAction = this.f11322b;
        return iConfigRefreshAction == null ? C1671a.m14179a() : iConfigRefreshAction;
    }

    /* renamed from: h */
    private boolean m14190h() {
        C1678e.m14205b();
        long j = 0;
        try {
            C1678e eVar = this.f11327g;
            eVar.mo9648c();
            if (eVar.f11332a != null) {
                j = eVar.f11332a.getLong("last_refresh_time", 0);
            }
        } catch (Throwable unused) {
        }
        return System.currentTimeMillis() - j >= 28800000;
    }

    /* renamed from: i */
    private void m14191i() {
        try {
            for (ValueCallback valueCallback : C1682a.f11337a.mo9635a(1)) {
                Message obtain = Message.obtain(null, 1, new JSONObject(this.f11324d.f11319e).toString());
                Message obtain2 = Message.obtain();
                valueCallback.onReceiveValue(new Pair(obtain, obtain2));
                obtain.recycle();
                obtain2.recycle();
            }
            for (IEfsReporterObserver onConfigChange : C1682a.f11337a.f11311o) {
                onConfigChange.onConfigChange();
            }
        } catch (Throwable th) {
            C1728d.m14309b("efs.base", "efs.config", th);
        }
    }

    /* renamed from: c */
    public final Map<String, String> mo9643c() {
        return new HashMap(this.f11324d.f11319e);
    }

    /* renamed from: d */
    public final void mo9644d() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                try {
                    for (IConfigCallback iConfigCallback : C1674c.this.f11325e.keySet()) {
                        String[] strArr = (String[]) C1674c.this.f11325e.get(iConfigCallback);
                        HashMap hashMap = new HashMap();
                        if (!(strArr == null || strArr.length == 0)) {
                            for (String str : strArr) {
                                if (C1674c.this.f11324d.f11319e.containsKey(str)) {
                                    hashMap.put(str, C1674c.this.mo9643c().get(str));
                                    StringBuilder sb = new StringBuilder("--->>> configCallback key is ");
                                    sb.append(str);
                                    sb.append(" ## value is ");
                                    sb.append((String) C1674c.this.mo9643c().get(str));
                                    C1728d.m14307a("efs.config", sb.toString());
                                }
                            }
                        }
                        iConfigCallback.onChange(hashMap);
                    }
                    C1674c.this.f11325e.clear();
                } catch (Throwable unused) {
                }
            }
        });
    }

    public final boolean handleMessage(Message message) {
        C1673b bVar;
        int i = message.what;
        String str = "efs.config";
        if (i == 0) {
            boolean a = C1678e.m14204a();
            C1728d.m14307a(str, "--->>> 删除旧的配置文件 ".concat(String.valueOf(a)));
            if (a) {
                this.f11326f.sendEmptyMessage(1);
            } else {
                C1678e eVar = this.f11327g;
                eVar.mo9648c();
                if (eVar.f11332a == null) {
                    bVar = null;
                } else {
                    C1673b a2 = C1673b.m14181a();
                    a2.f11315a = eVar.f11332a.getInt("cver", -1);
                    Set<String> keySet = eVar.f11332a.getAll().keySet();
                    HashMap hashMap = new HashMap();
                    for (String str2 : keySet) {
                        String string = eVar.f11332a.getString(str2, "");
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(str2, string);
                        }
                    }
                    a2.mo9638a(hashMap);
                    bVar = a2;
                }
                if (bVar == null) {
                    C1728d.m14307a(str, "--->>> 首次启动本地无配置或加载失败 ");
                } else if (m14185a(bVar)) {
                    C1728d.m14307a(str, "--->>> 一致 ");
                } else {
                    this.f11324d = bVar;
                    String str3 = "load config from storage";
                    if (-1 != bVar.f11315a) {
                        m14191i();
                        mo9644d();
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(" and notify observer");
                        str3 = sb.toString();
                    }
                    C1728d.m14307a(str, str3);
                }
            }
        } else if (i == 1) {
            int i2 = message.arg1;
            if (i2 <= this.f11324d.f11315a) {
                StringBuilder sb2 = new StringBuilder("current config version is ");
                sb2.append(i2);
                String str4 = ", no need to refresh";
                sb2.append(str4);
                C1728d.m14307a(str, sb2.toString());
                StringBuilder sb3 = new StringBuilder("current config version(");
                sb3.append(this.f11324d.f11315a);
                sb3.append(") is ");
                sb3.append(i2);
                sb3.append(str4);
                C1728d.m14307a(str, sb3.toString());
            } else {
                m14187e();
            }
        } else if (i != 2) {
            if (i == 3) {
                m14188f();
            }
        } else if (C1696a.f11370a.mo9665a()) {
            if (!m14190h()) {
                C1728d.m14307a(str, "No update is required, less than 8h since the last update");
            } else {
                m14187e();
            }
        }
        return true;
    }

    private C1674c() {
        this.f11323c = true;
        this.f11325e = new HashMap();
        this.f11326f = new Handler(C1714a.f11394a.getLooper(), this);
        this.f11327g = new C1678e();
        this.f11324d = C1673b.m14181a();
        this.f11328h = C1682a.f11337a.f11306j;
    }

    /* renamed from: a */
    public static C1674c m14183a() {
        return C1676a.f11330a;
    }

    /* renamed from: b */
    public final void mo9642b() {
        this.f11326f.sendEmptyMessage(0);
        this.f11326f.sendEmptyMessageDelayed(2, this.f11328h);
    }

    /* renamed from: a */
    public final void mo9640a(int i) {
        if (i <= this.f11324d.f11315a) {
            StringBuilder sb = new StringBuilder("current config version is ");
            sb.append(i);
            sb.append(", no need to refresh");
            C1728d.m14307a("efs.config", sb.toString());
            return;
        }
        Message obtain = Message.obtain();
        obtain.arg1 = i;
        obtain.what = 1;
        this.f11326f.sendMessage(obtain);
    }

    /* renamed from: a */
    public final String mo9639a(boolean z) {
        if (z) {
            StringBuilder sb = new StringBuilder("https://");
            sb.append(this.f11324d.f11317c);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11324d.f11316b);
        sb2.append(this.f11324d.f11317c);
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo9641a(String str) {
        C1673b a = C1673b.m14181a();
        if (!C1677d.m14202a(str, a)) {
            this.f11326f.sendEmptyMessageDelayed(1, 3000);
        } else if (!m14185a(a)) {
            this.f11324d = a;
            m14188f();
            m14191i();
            mo9644d();
        }
    }

    /* renamed from: a */
    private boolean m14185a(C1673b bVar) {
        if (this.f11324d.f11315a >= bVar.f11315a) {
            return true;
        }
        StringBuilder sb = new StringBuilder("current config version (");
        sb.append(this.f11324d.f11315a);
        sb.append(") is older than another (");
        sb.append(bVar.f11315a);
        sb.append(")");
        C1728d.m14307a("efs.config", sb.toString());
        return false;
    }
}
