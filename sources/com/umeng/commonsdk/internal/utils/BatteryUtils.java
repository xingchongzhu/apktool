package com.umeng.commonsdk.internal.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.UMInternalConfig;
import com.umeng.commonsdk.internal.UMInternalData;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.c */
public class BatteryUtils {

    /* renamed from: a */
    private static final String f17558a = "BatteryUtils";

    /* renamed from: b */
    private static boolean f17559b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Context f17560c;

    /* renamed from: d */
    private BroadcastReceiver f17561d;

    /* renamed from: com.umeng.commonsdk.internal.utils.c$a */
    /* compiled from: BatteryUtils */
    private static class C3206a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final BatteryUtils f17563a = new BatteryUtils();

        private C3206a() {
        }
    }

    /* renamed from: a */
    public static BatteryUtils m22335a(Context context) {
        if (f17560c == null && context != null) {
            f17560c = context.getApplicationContext();
        }
        return C3206a.f17563a;
    }

    /* renamed from: b */
    public synchronized void mo19265b() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f17560c.registerReceiver(this.f17561d, intentFilter);
            f17559b = true;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f17560c, th);
        }
        return;
    }

    /* renamed from: c */
    public synchronized void mo19266c() {
        try {
            f17560c.unregisterReceiver(this.f17561d);
            f17559b = false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f17560c, th);
        }
        return;
    }

    private BatteryUtils() {
        this.f17561d = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String str = "ts";
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("le", intent.getIntExtra("level", 0));
                        } catch (Exception unused) {
                        }
                        try {
                            jSONObject.put("vol", intent.getIntExtra("voltage", 0));
                        } catch (Exception unused2) {
                        }
                        try {
                            jSONObject.put("temp", intent.getIntExtra("temperature", 0));
                            jSONObject.put(str, System.currentTimeMillis());
                        } catch (Exception unused3) {
                        }
                        int intExtra = intent.getIntExtra("status", 0);
                        int i = -1;
                        int i2 = 2;
                        if (intExtra != 1) {
                            if (intExtra == 2) {
                                i = 1;
                            } else if (intExtra == 4) {
                                i = 0;
                            } else if (intExtra == 5) {
                                i = 2;
                            }
                        }
                        try {
                            jSONObject.put("st", i);
                        } catch (Exception unused4) {
                        }
                        int intExtra2 = intent.getIntExtra("plugged", 0);
                        if (intExtra2 == 1) {
                            i2 = 1;
                        } else if (intExtra2 != 2) {
                            i2 = 0;
                        }
                        try {
                            jSONObject.put("ct", i2);
                            jSONObject.put(str, System.currentTimeMillis());
                        } catch (Exception unused5) {
                        }
                        ULog.m22482i(BatteryUtils.f17558a, jSONObject.toString());
                        UMWorkDispatch.sendEvent(context, UMInternalConfig.f17500h, UMInternalData.m22265a(BatteryUtils.f17560c).mo19254a(), jSONObject.toString());
                        BatteryUtils.this.mo19266c();
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(BatteryUtils.f17560c, th);
                }
            }
        };
    }

    /* renamed from: a */
    public synchronized boolean mo19264a() {
        return f17559b;
    }
}
