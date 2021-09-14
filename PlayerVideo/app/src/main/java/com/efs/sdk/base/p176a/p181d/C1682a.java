package com.efs.sdk.base.p176a.p181d;

import android.content.IntentFilter;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.webkit.ValueCallback;

import com.chip.ninetyonetv.BuildConfig;
import com.efs.sdk.base.EfsReporter.Builder;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p176a.p177a.C1651a;
import com.efs.sdk.base.p176a.p179c.C1670a;
import com.efs.sdk.base.p176a.p179c.C1679b;
import com.efs.sdk.base.p176a.p179c.C1680c;
import com.efs.sdk.base.p176a.p179c.C1680c.C1681a;
import com.efs.sdk.base.p176a.p179c.p180a.C1674c;
import com.efs.sdk.base.p176a.p181d.p182a.C1684a;
import com.efs.sdk.base.p176a.p183e.C1691d;
import com.efs.sdk.base.p176a.p183e.C1694f.C1696a;
import com.efs.sdk.base.p176a.p184f.C1698b;
import com.efs.sdk.base.p176a.p185g.C1710d;
import com.efs.sdk.base.p176a.p185g.C1710d.C1712a;
import com.efs.sdk.base.p176a.p187h.C1728d;
import com.efs.sdk.base.p176a.p187h.C1729e;
import com.efs.sdk.base.p176a.p187h.C1730f;
import com.efs.sdk.base.p176a.p187h.C1731g;
import com.efs.sdk.base.p176a.p187h.C1732h;
import com.efs.sdk.base.p176a.p187h.p188a.C1714a;
import com.efs.sdk.base.p176a.p187h.p188a.C1717d;
import com.efs.sdk.base.p176a.p191i.C1734b;
import com.efs.sdk.base.p176a.p191i.C1735c;
import com.efs.sdk.base.p176a.p191i.C1738f;
import com.efs.sdk.base.p176a.p191i.C1738f.C1739a;
import com.efs.sdk.base.protocol.ILogProtocol;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.efs.sdk.base.a.d.a */
public final class C1682a implements Callback {

    /* renamed from: a */
    public static C1670a f11337a;

    /* renamed from: b */
    private int f11338b = 0;

    /* renamed from: c */
    private final int f11339c = 0;

    /* renamed from: d */
    private final int f11340d = 1;

    /* renamed from: e */
    private final int f11341e = 2;

    /* renamed from: f */
    private final int f11342f = 3;

    /* renamed from: g */
    private volatile boolean f11343g = false;

    /* renamed from: h */
    private C1684a f11344h;

    /* renamed from: i */
    private Handler f11345i;

    public C1682a(Builder builder) {
        f11337a = builder.getGlobalEnvStruct();
        Handler handler = new Handler(C1714a.f11394a.getLooper(), this);
        this.f11345i = handler;
        handler.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static C1670a m14214a() {
        return f11337a;
    }

    /* renamed from: b */
    private void m14216b() {
        if (this.f11344h == null) {
            this.f11344h = new C1684a();
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            f11337a.f11299c.registerReceiver(this.f11344h, intentFilter);
        } catch (Throwable th) {
            C1728d.m14308a("efs.base", "register network change receiver error", th);
            int i = this.f11338b + 1;
            this.f11338b = i;
            if (i < 3) {
                this.f11345i.sendEmptyMessageDelayed(3, 6000);
            }
        }
    }

    /* renamed from: c */
    private void m14218c(final ILogProtocol iLogProtocol) {
        if (iLogProtocol != null) {
            C1717d.m14271a(new Runnable() {
                public final void run() {
                    try {
                        iLogProtocol.insertGlobal(C1681a.f11336a.f11334a);
                        if (!"wa".equalsIgnoreCase(iLogProtocol.getLogType())) {
                            C1682a.m14217b(iLogProtocol);
                        }
                        if (C1682a.m14214a().f11301e) {
                            final C1698b f11389a = C1698b.m14237a(iLogProtocol);
                            C1717d.m14271a(new Runnable() {

                                public final void run() {
                                    C1712a.f11391a.f11388a.mo9676a(f11389a);
                                }
                            });
                        }
                    } catch (Throwable th) {
                        C1728d.m14309b("efs.base", "log send error", th);
                    }
                }
            });
        }
    }

    public final boolean handleMessage(Message message) {
        String str;
        int i = message.what;
        if (i == 0) {
            C1680c a = C1681a.f11336a;
            C1679b bVar = new C1679b();
            a.f11334a = bVar;
            bVar.mo9651a("appid", f11337a.f11297a);
            int a2 = C1731g.m14316a();
            a.f11334a.mo9651a("pid", Integer.valueOf(a2));
            a.f11334a.mo9651a("ps", C1731g.m14317a(a2));
            String a3 = C1732h.m14320a(a.f11335b);
            a.f11334a.mo9651a("wid", a3);
            String str2 = "uid";
            if (TextUtils.isEmpty(f11337a.f11304h)) {
                a.f11334a.mo9651a(str2, a3);
            } else {
                a.f11334a.mo9651a(str2, f11337a.f11304h);
            }
            C1679b bVar2 = a.f11334a;
            C1651a.m14131a();
            bVar2.mo9651a("stime", Long.valueOf(C1651a.m14134b() - Process.getElapsedCpuTime()));
            a.f11334a.mo9651a("pkg", a.f11335b.getPackageName());
            a.f11334a.mo9651a("ver", C1730f.m14314a(a.f11335b));
            a.f11334a.mo9651a("vcode", C1730f.m14315b(a.f11335b));
            a.f11334a.mo9651a("sdk_ver", BuildConfig.VERSION_NAME);
            a.f11334a.mo9651a("brand", Build.BRAND.toLowerCase());
            C1679b bVar3 = a.f11334a;
            String str3 = Build.MODEL;
            if (str3 == null) {
                str = "unknown";
            } else {
                String str4 = "-";
                str = str3.replace(" ", str4).replace("_", str4).toLowerCase();
            }
            bVar3.mo9651a("model", str);
            DisplayMetrics displayMetrics = a.f11335b.getResources().getDisplayMetrics();
            a.f11334a.mo9651a("dsp_w", Integer.valueOf(displayMetrics.widthPixels));
            a.f11334a.mo9651a("dsp_h", Integer.valueOf(displayMetrics.heightPixels));
            a.f11334a.mo9651a("fr", "android");
            a.f11334a.mo9651a("rom", VERSION.RELEASE);
            a.f11334a.mo9651a("sdk", Integer.valueOf(VERSION.SDK_INT));
            a.f11334a.mo9651a("lang", Locale.getDefault().getLanguage());
            a.f11334a.mo9651a("tzone", TimeZone.getDefault().getID());
            a.f11334a.mo9651a("net", C1729e.m14311b(a.f11335b));
            C1674c.m14183a().mo9642b();
            m14216b();
            C1738f a4 = C1739a.f11432a;
            boolean z = f11337a.f11305i;
            C1735c cVar = a4.f11428a;
            if (z) {
                cVar.f11420a = "https://errlogos.umeng.com/api/crashsdk/logcollect";
                cVar.f11421b = "4ea4e41a3993";
            } else {
                cVar.f11420a = "https://errlog.umeng.com/api/crashsdk/logcollect";
                cVar.f11421b = "28ef1713347d";
            }
            a4.f11429b = this;
            a4.f11430c.f11415a = this;
            a4.f11431d.f11415a = this;
            this.f11343g = true;
            C1691d.m14231a().sendEmptyMessageDelayed(0, f11337a.f11307k);
            C1738f a5 = C1739a.f11432a;
            if (a5.f11429b != null && f11337a.f11300d) {
                a5.f11429b.mo9654a(new C1734b("efs_core", "pvuv", a5.f11428a.f11422c));
            }
        } else if (i == 1) {
            Object obj = message.obj;
            if (obj != null && (obj instanceof ILogProtocol)) {
                m14218c((ILogProtocol) obj);
            }
        } else if (i == 3) {
            m14216b();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo9654a(ILogProtocol iLogProtocol) {
        if (!this.f11343g) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = iLogProtocol;
            this.f11345i.sendMessage(obtain);
            return;
        }
        m14218c(iLogProtocol);
    }

    /* renamed from: a */
    public static HttpResponse m14215a(String str, int i, String str2, boolean z, File file) {
        C1698b bVar = new C1698b(str, 2);
        bVar.mo9671b(1);
        bVar.f11381d = file;
        bVar.mo9669a(str2);
        bVar.mo9668a(i);
        bVar.f11379b.f11383b = z;
        bVar.mo9674d();
        C1712a.f11391a.f11388a.mo9676a(bVar);
        return bVar.f11379b.f11384c;
    }

    /* renamed from: b */
    static /* synthetic */ void m14217b(ILogProtocol iLogProtocol) {
        for (ValueCallback valueCallback : f11337a.mo9635a(9)) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("log_type", iLogProtocol.getLogType());
            hashMap.put("log_data", iLogProtocol.generateString());
            hashMap.put("link_key", iLogProtocol.getLinkKey());
            hashMap.put("link_id", iLogProtocol.getLinkId());
            Message obtain = Message.obtain(null, 9, hashMap);
            Message obtain2 = Message.obtain();
            valueCallback.onReceiveValue(new Pair(obtain, obtain2));
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
