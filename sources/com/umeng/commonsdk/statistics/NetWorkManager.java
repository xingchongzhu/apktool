package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.TBase;
import com.umeng.analytics.pro.TBinaryProtocol.C3121a;
import com.umeng.analytics.pro.TDeserializer;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.UMInternalConfig;
import com.umeng.commonsdk.internal.UMInternalData;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.stateless.UMSLUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.IdTracker;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler.C3230a;
import com.umeng.commonsdk.statistics.internal.HeaderHelper;
import com.umeng.commonsdk.statistics.internal.IRequestStat;
import com.umeng.commonsdk.statistics.internal.NetworkHelper;
import com.umeng.commonsdk.statistics.internal.OnImprintChangedListener;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.statistics.proto.Response;
import java.io.File;

/* renamed from: com.umeng.commonsdk.statistics.c */
public class NetWorkManager {

    /* renamed from: b */
    private static final int f17657b = 1;

    /* renamed from: c */
    private static final int f17658c = 2;

    /* renamed from: d */
    private static final int f17659d = 3;

    /* renamed from: o */
    private static final String f17660o = "thtstart";

    /* renamed from: p */
    private static final String f17661p = "gkvc";

    /* renamed from: q */
    private static final String f17662q = "ekvc";

    /* renamed from: a */
    String f17663a = null;

    /* renamed from: e */
    private final int f17664e = 1;

    /* renamed from: f */
    private NetworkHelper f17665f;

    /* renamed from: g */
    private ImprintHandler f17666g;

    /* renamed from: h */
    private IdTracker f17667h = null;

    /* renamed from: i */
    private C3230a f17668i = null;

    /* renamed from: j */
    private ABTest f17669j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Defcon f17670k = null;

    /* renamed from: l */
    private long f17671l = 0;

    /* renamed from: m */
    private int f17672m = 0;

    /* renamed from: n */
    private int f17673n = 0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Context f17674r;

    public NetWorkManager(Context context) {
        this.f17674r = context;
        this.f17668i = ImprintHandler.getImprintService(context).mo19348c();
        this.f17670k = Defcon.getService(this.f17674r);
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.f17674r);
        this.f17671l = sharedPreferences.getLong(f17660o, 0);
        this.f17672m = sharedPreferences.getInt(f17661p, 0);
        this.f17673n = sharedPreferences.getInt(f17662q, 0);
        this.f17663a = UMEnvelopeBuild.imprintProperty(this.f17674r, "track_list", null);
        ImprintHandler imprintService = ImprintHandler.getImprintService(this.f17674r);
        this.f17666g = imprintService;
        imprintService.mo19342a((OnImprintChangedListener) new OnImprintChangedListener() {
            public void onImprintChanged(C3230a aVar) {
                NetWorkManager.this.f17670k.onImprintChanged(aVar);
                NetWorkManager cVar = NetWorkManager.this;
                cVar.f17663a = UMEnvelopeBuild.imprintProperty(cVar.f17674r, "track_list", null);
            }
        });
        if (!UMConfigure.needSendZcfgEnv(this.f17674r)) {
            this.f17667h = IdTracker.m22566a(this.f17674r);
        }
        NetworkHelper cVar = new NetworkHelper(this.f17674r);
        this.f17665f = cVar;
        cVar.mo19400a((IRequestStat) StatTracer.getInstance(this.f17674r));
    }

    /* renamed from: a */
    public boolean mo19296a(File file) {
        String str;
        int i;
        if (file == null) {
            return false;
        }
        try {
            byte[] byteArray = UMFrUtils.toByteArray(file.getPath());
            if (byteArray == null) {
                return false;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name)) {
                return false;
            }
            HeaderHelper a = HeaderHelper.m22599a(this.f17674r);
            a.mo19399d(name);
            boolean a2 = a.mo19395a(name);
            boolean b = a.mo19397b(name);
            boolean c = a.mo19398c(name);
            String d = UMSLUtils.m22416d(name);
            if (!TextUtils.isEmpty(d)) {
                str = UMSLUtils.m22413c(d);
            } else if (c) {
                str = UMServerURL.ZCFG_PATH;
            } else {
                str = UMServerURL.PATH_ANALYTICS;
            }
            byte[] a3 = this.f17665f.mo19402a(byteArray, a2, c, str);
            if (a3 == null) {
                i = 1;
            } else {
                i = m22433a(a3);
            }
            boolean isDebugLog = UMConfigure.isDebugLog();
            String str2 = UMRTLog.RTLOG_TAG;
            if (isDebugLog) {
                if (c && i == 2) {
                    UMRTLog.m22229i(str2, "Zero req: succeed.");
                } else if (b && i == 2) {
                    MLog.m22437d("本次启动数据: 发送成功!");
                    UMRTLog.m22229i(str2, "Send instant data: succeed.");
                } else if (!a2 || i != 2) {
                    UMRTLog.m22229i(str2, "Inner req: succeed.");
                } else {
                    MLog.m22437d("普通统计数据: 发送成功!");
                    UMRTLog.m22229i(str2, "Send analytics data: succeed.");
                }
            }
            if (i == 2) {
                IdTracker eVar = this.f17667h;
                if (eVar != null) {
                    eVar.mo19370e();
                }
                StatTracer.getInstance(this.f17674r).saveSate();
            } else if (i == 3) {
                StatTracer.getInstance(this.f17674r).saveSate();
                if (c) {
                    FieldManager.m22199a().mo19240a(this.f17674r);
                    UMRTLog.m22228e(str2, "--->>> 零号报文应答内容报错!!! ，特殊处理!，继续正常流程。");
                    Context context = this.f17674r;
                    UMWorkDispatch.sendEvent(context, UMInternalConfig.f17511s, UMInternalData.m22265a(context).mo19254a(), null);
                    return true;
                }
            }
            if (i == 2) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f17674r, th);
            return false;
        }
    }

    /* renamed from: a */
    private int m22433a(byte[] bArr) {
        Response response = new Response();
        try {
            new TDeserializer(new C3121a()).mo18963a((TBase) response, bArr);
            if (response.resp_code == 1) {
                this.f17666g.mo19347b(response.getImprint());
                this.f17666g.mo19349d();
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f17674r, th);
        }
        return response.resp_code == 1 ? 2 : 3;
    }
}
