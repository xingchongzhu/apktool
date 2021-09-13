package com.umeng.commonsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.CacheDBHelper;
import com.umeng.analytics.pro.CacheData;
import com.umeng.analytics.pro.Constants;
import com.umeng.analytics.pro.CoreProtocolImpl.C3149a;
import com.umeng.analytics.pro.OpenDeviceId;
import com.umeng.analytics.pro.UMCommonContent;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.UMInnerManager;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.EnvelopeManager;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.idtracking.OaidTracking;
import com.umeng.commonsdk.utils.UMConstant;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.onMessageSendListener;
import java.io.File;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.c */
public class UMInternalDataProtocol implements UMLogDataProtocol {

    /* renamed from: b */
    private static int f17522b = 1;

    /* renamed from: c */
    private static final String f17523c = "info";

    /* renamed from: d */
    private static final String f17524d = "stat";

    /* renamed from: e */
    private static Class<?> f17525e = null;

    /* renamed from: f */
    private static Method f17526f = null;

    /* renamed from: g */
    private static Method f17527g = null;

    /* renamed from: h */
    private static Method f17528h = null;

    /* renamed from: i */
    private static boolean f17529i = false;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f17530a;

    static {
        m22273c();
    }

    public UMInternalDataProtocol(Context context) {
        if (context != null) {
            this.f17530a = context.getApplicationContext();
        }
    }

    /* renamed from: b */
    public static String m22271b() {
        Class<?> cls = f17525e;
        String str = "";
        if (cls == null) {
            return str;
        }
        Method method = f17526f;
        if (method == null || f17528h == null) {
            return str;
        }
        try {
            Object invoke = method.invoke(cls, new Object[0]);
            return invoke != null ? (String) f17528h.invoke(invoke, new Object[0]) : str;
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: c */
    private static void m22273c() {
        try {
            Class<?> cls = Class.forName("com.umeng.umzid.ZIDManager");
            f17525e = cls;
            Method declaredMethod = cls.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod != null) {
                f17526f = declaredMethod;
            }
            Method declaredMethod2 = f17525e.getDeclaredMethod("getZID", new Class[]{Context.class});
            if (declaredMethod2 != null) {
                f17527g = declaredMethod2;
            }
            Method declaredMethod3 = f17525e.getDeclaredMethod("getSDKVersion", new Class[0]);
            if (declaredMethod3 != null) {
                f17528h = declaredMethod3;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m22275d() {
        CacheDBHelper a = CacheDBHelper.m21592a(this.f17530a);
        String str = Constants.f16723c;
        CacheData a2 = a.mo18941a(str);
        if (a2 != null) {
            String str2 = UMRTLog.RTLOG_TAG;
            UMRTLog.m22228e(str2, "--->>> [有状态]二级缓存记录构建成真正信封。");
            try {
                String str3 = a2.f16715a;
                String str4 = a2.f16716b;
                JSONObject a3 = new EnvelopeManager().mo19295a(this.f17530a.getApplicationContext(), new JSONObject(a2.f16717c), new JSONObject(a2.f16718d), a2.f16719e, str4, a2.f16720f);
                if (a3 == null || !a3.has("exception")) {
                    UMRTLog.m22228e(str2, "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。");
                } else {
                    UMRTLog.m22228e(str2, "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录");
                }
                a.mo18943a(str, str3);
                a.mo18945b();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    private void m22277e() {
        boolean z = f17529i;
        String str = UMConstant.f17889G;
        if (!z) {
            if (FieldManager.allow(str) && VERSION.SDK_INT > 28) {
                f17529i = true;
                m22270a(this.f17530a, new OnGetOaidListener() {
                    public void onGetOaid(String str) {
                        String str2 = UMRTLog.RTLOG_TAG;
                        UMRTLog.m22228e(str2, "--->>> OAID云控参数更新(不采集->采集)：采集完成");
                        if (TextUtils.isEmpty(str)) {
                            UMRTLog.m22228e(str2, "--->>> oaid返回null或者空串，不需要 伪冷启动。");
                            return;
                        }
                        try {
                            SharedPreferences sharedPreferences = UMInternalDataProtocol.this.f17530a.getSharedPreferences(OaidTracking.f17740a, 0);
                            if (sharedPreferences != null) {
                                Editor edit = sharedPreferences.edit();
                                edit.putString(OaidTracking.f17741b, str);
                                edit.commit();
                            }
                        } catch (Throwable unused) {
                        }
                        UMWorkDispatch.sendEvent(UMInternalDataProtocol.this.f17530a, UMInternalConfig.f17515w, UMInternalData.m22265a(UMInternalDataProtocol.this.f17530a).mo19254a(), null);
                    }
                });
            }
        } else if (!FieldManager.allow(str)) {
            f17529i = false;
        }
    }

    /* renamed from: f */
    private void m22279f() {
        if (FieldManager.allow(UMConstant.f17889G) && VERSION.SDK_INT > 28) {
            f17529i = true;
            UMConfigureImpl.registerInterruptFlag();
            UMConfigureImpl.init(this.f17530a);
            f17522b++;
            UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "--->>> 要读取 oaid，需等待读取结果.");
            UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() {
                public void onMessageSend() {
                    if (UMInternalDataProtocol.this.f17530a != null) {
                        UMWorkDispatch.sendEvent(UMInternalDataProtocol.this.f17530a, UMInternalConfig.f17516x, UMInternalData.m22265a(UMInternalDataProtocol.this.f17530a).mo19254a(), null);
                    }
                    UMConfigureImpl.removeMessageSendListener(this);
                }
            });
            m22272b(this.f17530a);
        }
    }

    /* renamed from: g */
    private void m22280g() {
        if (f17522b <= 0) {
            m22281h();
            m22276d(this.f17530a);
        }
    }

    /* renamed from: h */
    private void m22281h() {
        UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "--->>> 真实构建条件满足，开始构建业务信封。");
        if (UMUtils.isMainProgress(this.f17530a)) {
            m22278e(this.f17530a);
            UMInnerManager.m22197a(this.f17530a);
            Context context = this.f17530a;
            UMWorkDispatch.sendEvent(context, C3149a.f17208x, CoreProtocol.getInstance(context), null);
            Context context2 = this.f17530a;
            UMWorkDispatch.sendEvent(context2, UMInternalConfig.f17512t, UMInternalData.m22265a(context2).mo19254a(), null);
        }
    }

    public void removeCacheData(Object obj) {
    }

    public JSONObject setupReportData(long j) {
        return null;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d1 A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ea A[Catch:{  }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void workEvent(java.lang.Object r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "com.umeng.commonsdk.internal.utils.UMInternalUtilsAgent"
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "[internal] workEvent"
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "walle"
            com.umeng.commonsdk.statistics.common.ULog.m22482i(r4, r3)
            java.lang.String r3 = "[internal] workEvent send envelope"
            r6 = 2
            java.lang.String r7 = "MobclickRT"
            switch(r10) {
                case 32769: goto L_0x0277;
                case 32770: goto L_0x0019;
                case 32771: goto L_0x023b;
                case 32772: goto L_0x01ff;
                case 32773: goto L_0x0019;
                case 32774: goto L_0x01e2;
                case 32775: goto L_0x01bf;
                case 32776: goto L_0x01a0;
                case 32777: goto L_0x0163;
                case 32778: goto L_0x0019;
                case 32779: goto L_0x015a;
                case 32780: goto L_0x0019;
                case 32781: goto L_0x013d;
                case 32782: goto L_0x0019;
                case 32783: goto L_0x0019;
                case 32784: goto L_0x012b;
                case 32785: goto L_0x00f8;
                case 32786: goto L_0x00f1;
                case 32787: goto L_0x008d;
                case 32788: goto L_0x0047;
                case 32789: goto L_0x0019;
                case 32790: goto L_0x0038;
                case 32791: goto L_0x0022;
                case 32792: goto L_0x0019;
                case 32793: goto L_0x0019;
                case 32794: goto L_0x0019;
                case 32795: goto L_0x0019;
                case 32796: goto L_0x0019;
                case 32797: goto L_0x0019;
                case 32798: goto L_0x0019;
                case 32799: goto L_0x0019;
                case 32800: goto L_0x0019;
                case 32801: goto L_0x001b;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0299
        L_0x001b:
            android.content.Context r9 = r8.f17530a     // Catch:{  }
            com.umeng.commonsdk.debug.SelfChecker.doCheck(r9)     // Catch:{  }
            goto L_0x0299
        L_0x0022:
            java.lang.String r9 = "--->>> 正常冷启动流程，接收到云控配置加载成功通知。"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r7, r9)
            android.content.Context r9 = r8.f17530a
            m22274c(r9)
            android.content.Context r9 = r8.f17530a
            com.umeng.commonsdk.UMInnerManager.m22197a(r9)
            android.content.Context r9 = r8.f17530a
            r8.m22276d(r9)
            goto L_0x0299
        L_0x0038:
            java.lang.String r9 = "--->>> 成功接收到(OAID)读取结束通知。"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r7, r9)
            int r9 = f17522b
            int r9 = r9 - r2
            f17522b = r9
            r8.m22280g()
            goto L_0x0299
        L_0x0047:
            java.lang.String r9 = "--->>> 云控下发参数更新，触发 伪冷启动。"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r7, r9)
            com.umeng.commonsdk.statistics.EnvelopeManager.m22427a()
            r8.m22277e()
            java.lang.String r9 = "header_foreground_count"
            boolean r9 = com.umeng.commonsdk.config.FieldManager.allow(r9)
            if (r9 == 0) goto L_0x0073
            boolean r9 = com.umeng.commonsdk.framework.UMWorkDispatch.eventHasExist()
            if (r9 != 0) goto L_0x0073
            java.lang.String r9 = "--->>> 云控下发参数更新 前台计数器功能 打开，触发 5秒周期检查机制"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r7, r9)
            android.content.Context r0 = r8.f17530a
            r1 = 8213(0x2015, float:1.1509E-41)
            com.umeng.analytics.CoreProtocol r2 = com.umeng.analytics.CoreProtocol.getInstance(r0)
            r3 = 0
            r4 = 5000(0x1388, double:2.4703E-320)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEventEx(r0, r1, r2, r3, r4)
        L_0x0073:
            java.lang.String r9 = "header_first_resume"
            boolean r9 = com.umeng.commonsdk.config.FieldManager.allow(r9)
            if (r9 == 0) goto L_0x0299
            java.lang.String r9 = "--->>> 云控下发参数更新 FirstResume功能 打开，触发 trigger"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r7, r9)
            android.content.Context r9 = r8.f17530a
            com.umeng.analytics.pro.k r9 = com.umeng.analytics.pro.AutoViewPageTracker.m21976a(r9)
            android.content.Context r10 = r8.f17530a
            r9.mo19114b(r10)
            goto L_0x0299
        L_0x008d:
            java.lang.String r9 = "--->>> 触发2号仓遗留信封检查动作。"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r7, r9)     // Catch:{  }
            android.content.Context r9 = r8.f17530a     // Catch:{  }
            java.lang.String r9 = com.umeng.commonsdk.stateless.UMSLUtils.m22401a(r9, r5)     // Catch:{  }
            android.content.Context r10 = r8.f17530a     // Catch:{  }
            java.lang.String r10 = com.umeng.commonsdk.stateless.UMSLUtils.m22401a(r10, r2)     // Catch:{  }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{  }
            if (r0 != 0) goto L_0x00b6
            java.io.File r0 = new java.io.File     // Catch:{  }
            r0.<init>(r9)     // Catch:{  }
            boolean r9 = r0.exists()     // Catch:{  }
            if (r9 == 0) goto L_0x00b6
            boolean r9 = r0.isDirectory()     // Catch:{  }
            if (r9 == 0) goto L_0x00b6
            r5 = 1
        L_0x00b6:
            boolean r9 = android.text.TextUtils.isEmpty(r10)     // Catch:{  }
            if (r9 != 0) goto L_0x00ce
            java.io.File r9 = new java.io.File     // Catch:{  }
            r9.<init>(r10)     // Catch:{  }
            boolean r10 = r9.exists()     // Catch:{  }
            if (r10 == 0) goto L_0x00ce
            boolean r9 = r9.isDirectory()     // Catch:{  }
            if (r9 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r2 = r5
        L_0x00cf:
            if (r2 == 0) goto L_0x00ea
            boolean r9 = com.umeng.commonsdk.stateless.UMSLNetWorkSender.m22375a()     // Catch:{  }
            if (r9 != 0) goto L_0x00e3
            com.umeng.commonsdk.stateless.b r9 = new com.umeng.commonsdk.stateless.b     // Catch:{  }
            android.content.Context r10 = r8.f17530a     // Catch:{  }
            r9.<init>(r10)     // Catch:{  }
            com.umeng.commonsdk.stateless.UMSLNetWorkSender.m22377b()     // Catch:{  }
            goto L_0x0299
        L_0x00e3:
            java.lang.String r9 = "--->>> 触发2号仓遗留信封检查，Sender已创建，不需要处理。"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r7, r9)     // Catch:{  }
            goto L_0x0299
        L_0x00ea:
            java.lang.String r9 = "--->>> 触发2号仓遗留信封检查，没有需要处理的目录，不需要处理。"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r7, r9)     // Catch:{  }
            goto L_0x0299
        L_0x00f1:
            android.content.Context r10 = r8.f17530a
            com.umeng.commonsdk.internal.crash.UMCrashManager.buildEnvelope(r10, r9)
            goto L_0x0299
        L_0x00f8:
            java.lang.String r9 = "--->>> [有状态]接收到消费二级缓存数据通知."
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r7, r9)
            android.content.Context r9 = r8.f17530a
            com.umeng.analytics.pro.ak r9 = com.umeng.analytics.pro.CacheDBHelper.m21592a(r9)
            boolean r9 = r9.mo18947c()
            if (r9 == 0) goto L_0x010f
            java.lang.String r9 = "--->>> [有状态]已消费完毕,二级缓存数据库为空."
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r7, r9)
            return
        L_0x010f:
            r8.m22275d()
            r9 = 32785(0x8011, float:4.5942E-41)
            boolean r10 = com.umeng.commonsdk.framework.UMWorkDispatch.eventHasExist(r9)
            if (r10 != 0) goto L_0x0299
            android.content.Context r10 = r8.f17530a
            com.umeng.commonsdk.internal.b r0 = com.umeng.commonsdk.internal.UMInternalData.m22265a(r10)
            com.umeng.commonsdk.internal.c r0 = r0.mo19254a()
            r1 = 0
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r10, r9, r0, r1)
            goto L_0x0299
        L_0x012b:
            java.lang.String r9 = "--->>> 零号报文流程，接收到云控配置加载成功通知(成功收到零号报文应答)。"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r7, r9)
            r8.m22279f()
            int r9 = f17522b
            int r9 = r9 - r2
            f17522b = r9
            r8.m22280g()
            goto L_0x0299
        L_0x013d:
            android.content.Context r9 = r8.f17530a
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r10 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_ZeroEnv
            boolean r9 = com.umeng.commonsdk.framework.UMFrUtils.hasEnvelopeFile(r9, r10)
            if (r9 != 0) goto L_0x0153
            java.lang.String r9 = "--->>> 构建零号报文"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r7, r9)
            android.content.Context r9 = r8.f17530a
            r8.m22269a(r9)
            goto L_0x0299
        L_0x0153:
            java.lang.String r9 = "--->>> 零号报文信封文件已存在，尝试发送之!"
            com.umeng.commonsdk.debug.UMRTLog.m22228e(r7, r9)
            goto L_0x0299
        L_0x015a:
            com.umeng.commonsdk.vchannel.b r9 = (com.umeng.commonsdk.vchannel.Event) r9
            android.content.Context r10 = r8.f17530a
            com.umeng.commonsdk.vchannel.Sender.handleEvent(r10, r9)
            goto L_0x0299
        L_0x0163:
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{  }
            r9[r5] = r3     // Catch:{  }
            com.umeng.commonsdk.statistics.common.ULog.m22482i(r4, r9)     // Catch:{  }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{  }
            r9.<init>()     // Catch:{  }
            java.lang.String r10 = "i_sdk_v"
            java.lang.String r0 = "1.2.0"
            r9.put(r10, r0)     // Catch:{  }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{  }
            r10.<init>()     // Catch:{  }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{  }
            r0.<init>()     // Catch:{  }
            java.lang.String r1 = "inner"
            r10.put(r1, r0)     // Catch:{  }
            android.content.Context r0 = r8.f17530a     // Catch:{  }
            org.json.JSONObject r9 = com.umeng.commonsdk.framework.UMEnvelopeBuild.buildEnvelopeWithExtHeader(r0, r9, r10)     // Catch:{  }
            if (r9 == 0) goto L_0x0299
            java.lang.String r10 = "exception"
            boolean r9 = r9.has(r10)     // Catch:{  }
            if (r9 != 0) goto L_0x0299
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{  }
            java.lang.String r10 = "[internal] workEvent send envelope back, result is ok"
            r9[r5] = r10     // Catch:{  }
            com.umeng.commonsdk.statistics.common.ULog.m22482i(r4, r9)     // Catch:{  }
            goto L_0x0299
        L_0x01a0:
            android.content.Context r10 = r8.f17530a
            android.content.Context r10 = r10.getApplicationContext()
            java.lang.String r0 = "info"
            android.content.SharedPreferences r10 = r10.getSharedPreferences(r0, r5)
            if (r10 == 0) goto L_0x0299
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "stat"
            android.content.SharedPreferences$Editor r9 = r10.putString(r0, r9)
            r9.commit()
            goto L_0x0299
        L_0x01bf:
            java.lang.String r10 = "com.umeng.commonsdk.internal.utils.InfoPreferenceAgent"
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "saveUA"
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ all -> 0x0299 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r5] = r4     // Catch:{ all -> 0x0299 }
            r3[r2] = r1     // Catch:{ all -> 0x0299 }
            java.lang.reflect.Method r0 = r10.getMethod(r0, r3)     // Catch:{ all -> 0x0299 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0299 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0299 }
            android.content.Context r3 = r8.f17530a     // Catch:{ all -> 0x0299 }
            r1[r5] = r3     // Catch:{ all -> 0x0299 }
            r1[r2] = r9     // Catch:{ all -> 0x0299 }
            r0.invoke(r10, r1)     // Catch:{ all -> 0x0299 }
            goto L_0x0299
        L_0x01e2:
            java.lang.String r9 = "com.umeng.commonsdk.internal.utils.ApplicationLayerUtilAgent"
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0299 }
            java.lang.String r10 = "wifiChange"
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0299 }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r5] = r1     // Catch:{ all -> 0x0299 }
            java.lang.reflect.Method r10 = r9.getMethod(r10, r0)     // Catch:{ all -> 0x0299 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0299 }
            android.content.Context r1 = r8.f17530a     // Catch:{ all -> 0x0299 }
            r0[r5] = r1     // Catch:{ all -> 0x0299 }
            r10.invoke(r9, r0)     // Catch:{ all -> 0x0299 }
            goto L_0x0299
        L_0x01ff:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "[internal] workEvent cache station, event is "
            r3.append(r7)
            java.lang.String r7 = r9.toString()
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r10[r5] = r3
            com.umeng.commonsdk.statistics.common.ULog.m22482i(r4, r10)
            java.lang.Class r10 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "saveBaseStationStrength"
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ all -> 0x0299 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r5] = r4     // Catch:{ all -> 0x0299 }
            r3[r2] = r1     // Catch:{ all -> 0x0299 }
            java.lang.reflect.Method r0 = r10.getMethod(r0, r3)     // Catch:{ all -> 0x0299 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0299 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0299 }
            android.content.Context r3 = r8.f17530a     // Catch:{ all -> 0x0299 }
            r1[r5] = r3     // Catch:{ all -> 0x0299 }
            r1[r2] = r9     // Catch:{ all -> 0x0299 }
            r0.invoke(r10, r1)     // Catch:{ all -> 0x0299 }
            goto L_0x0299
        L_0x023b:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "[internal] workEvent cache battery, event is "
            r3.append(r7)
            java.lang.String r7 = r9.toString()
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r10[r5] = r3
            com.umeng.commonsdk.statistics.common.ULog.m22482i(r4, r10)
            java.lang.Class r10 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "saveBattery"
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ all -> 0x0299 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r5] = r4     // Catch:{ all -> 0x0299 }
            r3[r2] = r1     // Catch:{ all -> 0x0299 }
            java.lang.reflect.Method r0 = r10.getMethod(r0, r3)     // Catch:{ all -> 0x0299 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0299 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0299 }
            android.content.Context r3 = r8.f17530a     // Catch:{ all -> 0x0299 }
            r1[r5] = r3     // Catch:{ all -> 0x0299 }
            r1[r2] = r9     // Catch:{ all -> 0x0299 }
            r0.invoke(r10, r1)     // Catch:{ all -> 0x0299 }
            goto L_0x0299
        L_0x0277:
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{  }
            r9[r5] = r3     // Catch:{  }
            com.umeng.commonsdk.statistics.common.ULog.m22482i(r4, r9)     // Catch:{  }
            java.lang.String r9 = "com.umeng.commonsdk.internal.UMInternalManagerAgent"
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0299 }
            java.lang.String r10 = "sendInternalEnvelopeByStateful2"
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0299 }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r5] = r1     // Catch:{ all -> 0x0299 }
            java.lang.reflect.Method r10 = r9.getMethod(r10, r0)     // Catch:{ all -> 0x0299 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0299 }
            android.content.Context r1 = r8.f17530a     // Catch:{ all -> 0x0299 }
            r0[r5] = r1     // Catch:{ all -> 0x0299 }
            r10.invoke(r9, r0)     // Catch:{ all -> 0x0299 }
        L_0x0299:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.UMInternalDataProtocol.workEvent(java.lang.Object, int):void");
    }

    /* renamed from: a */
    public String mo19255a() {
        Class<?> cls = f17525e;
        String str = "";
        if (cls == null) {
            return str;
        }
        Method method = f17526f;
        if (method == null || f17527g == null) {
            return str;
        }
        try {
            Object invoke = method.invoke(cls, new Object[0]);
            if (invoke == null) {
                return str;
            }
            return (String) f17527g.invoke(invoke, new Object[]{this.f17530a});
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: b */
    private static void m22272b(final Context context) {
        new Thread(new Runnable() {
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r9 = this;
                    android.content.Context r0 = r2     // Catch:{ Exception -> 0x0054 }
                    java.lang.String r1 = "umeng_sp_oaid"
                    r2 = 0
                    android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch:{ Exception -> 0x0054 }
                    long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0054 }
                    android.content.Context r3 = r2     // Catch:{ Exception -> 0x0054 }
                    java.lang.String r3 = com.umeng.analytics.pro.OpenDeviceId.m22153a(r3)     // Catch:{ Exception -> 0x0054 }
                    long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0054 }
                    boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0054 }
                    if (r6 != 0) goto L_0x003d
                    if (r0 == 0) goto L_0x003d
                    android.content.SharedPreferences$Editor r6 = r0.edit()     // Catch:{ Exception -> 0x0054 }
                    java.lang.String r7 = "key_umeng_sp_oaid_required_time"
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0054 }
                    r8.<init>()     // Catch:{ Exception -> 0x0054 }
                    long r4 = r4 - r1
                    r8.append(r4)     // Catch:{ Exception -> 0x0054 }
                    java.lang.String r1 = ""
                    r8.append(r1)     // Catch:{ Exception -> 0x0054 }
                    java.lang.String r1 = r8.toString()     // Catch:{ Exception -> 0x0054 }
                    r6.putString(r7, r1)     // Catch:{ Exception -> 0x0054 }
                    r6.commit()     // Catch:{ Exception -> 0x0054 }
                L_0x003d:
                    if (r0 == 0) goto L_0x004b
                    android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{  }
                    java.lang.String r1 = "key_umeng_sp_oaid"
                    r0.putString(r1, r3)     // Catch:{  }
                    r0.commit()     // Catch:{  }
                L_0x004b:
                    int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{  }
                    r1 = 28
                    if (r0 <= r1) goto L_0x0054
                    com.umeng.commonsdk.UMConfigureImpl.removeInterruptFlag()     // Catch:{  }
                L_0x0054:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.UMInternalDataProtocol.C31961.run():void");
            }
        }).start();
    }

    /* renamed from: a */
    private void m22269a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put("app_version", UMGlobalContext.getInstance(context).getAppVersion());
            jSONObject.put(UMCommonContent.f16662x, "Android");
            JSONObject buildZeroEnvelopeWithExtHeader = UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.ZCFG_PATH);
            String str = UMRTLog.RTLOG_TAG;
            if (buildZeroEnvelopeWithExtHeader != null) {
                if (buildZeroEnvelopeWithExtHeader.has("exception")) {
                    UMRTLog.m22228e(str, "--->>> 构建零号报文失败.");
                    return;
                }
            }
            UMRTLog.m22228e(str, "--->>> 构建零号报文 成功!!!");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static void m22274c(final Context context) {
        if (FieldManager.allow(UMConstant.f17889G) && VERSION.SDK_INT > 28) {
            m22270a(context, new OnGetOaidListener() {
                public void onGetOaid(String str) {
                    String str2 = OaidTracking.f17741b;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            SharedPreferences sharedPreferences = context.getSharedPreferences(OaidTracking.f17740a, 0);
                            if (sharedPreferences != null && !sharedPreferences.getString(str2, "").equalsIgnoreCase(str)) {
                                UMRTLog.m22228e(UMRTLog.RTLOG_TAG, "--->>> 更新本地缓存OAID");
                                Editor edit = sharedPreferences.edit();
                                edit.putString(str2, str);
                                edit.commit();
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        }
    }

    /* renamed from: e */
    private static void m22278e(Context context) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append(Constants.f16732l);
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m22270a(Context context, final OnGetOaidListener onGetOaidListener) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            new Thread(new Runnable() {
                public void run() {
                    String a = OpenDeviceId.m22153a(applicationContext);
                    OnGetOaidListener onGetOaidListener = onGetOaidListener;
                    if (onGetOaidListener != null) {
                        onGetOaidListener.onGetOaid(a);
                    }
                }
            }).start();
        }
    }

    /* renamed from: a */
    private static Class<?> m22268a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private void m22276d(Context context) {
        Context applicationContext = context.getApplicationContext();
        String appkey = UMUtils.getAppkey(context);
        try {
            Class a = m22268a("com.umeng.umzid.ZIDManager");
            Method declaredMethod = a.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod != null) {
                Object invoke = declaredMethod.invoke(a, new Object[0]);
                if (invoke != null) {
                    Method declaredMethod2 = a.getDeclaredMethod("init", new Class[]{Context.class, String.class, m22268a("com.umeng.umzid.IZIDCompletionCallback")});
                    if (declaredMethod2 != null) {
                        declaredMethod2.invoke(invoke, new Object[]{applicationContext, appkey, null});
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
