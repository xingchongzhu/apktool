package com.umeng.commonsdk.service;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.utils.UMUtils;

public class UMGlobalContext {
    private static final String TAG = "UMGlobalContext";
    private String mAppVersion;
    private String mAppkey;
    private Context mApplicationContext;
    private String mChannel;
    private String mProcessName;

    /* renamed from: com.umeng.commonsdk.service.UMGlobalContext$a */
    private static class C3211a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final UMGlobalContext f17607a = new UMGlobalContext();

        private C3211a() {
        }
    }

    public static Context getAppContext(Context context) {
        if (C3211a.f17607a.mApplicationContext == null && context != null) {
            C3211a.f17607a.mApplicationContext = context.getApplicationContext();
        }
        return C3211a.f17607a.mApplicationContext;
    }

    public static UMGlobalContext getInstance(Context context) {
        if (C3211a.f17607a.mApplicationContext == null && context != null) {
            C3211a.f17607a.mApplicationContext = context;
        }
        return C3211a.f17607a;
    }

    public String getAppVersion() {
        if (TextUtils.isEmpty(this.mAppVersion)) {
            this.mAppVersion = UMUtils.getAppVersionName(this.mApplicationContext);
        }
        return this.mAppVersion;
    }

    public String getAppkey() {
        if (TextUtils.isEmpty(this.mAppkey)) {
            this.mAppkey = UMConfigure.sAppkey;
        }
        return this.mAppkey;
    }

    public String getChannel() {
        if (TextUtils.isEmpty(this.mChannel)) {
            this.mChannel = UMConfigure.sChannel;
        }
        return this.mChannel;
    }

    public String getProcessName(Context context) {
        if (TextUtils.isEmpty(this.mProcessName)) {
            if (context != null) {
                Context context2 = C3211a.f17607a.mApplicationContext;
                if (context2 != null) {
                    this.mProcessName = UMFrUtils.getCurrentProcessName(context2);
                } else {
                    this.mProcessName = UMFrUtils.getCurrentProcessName(context);
                }
            } else {
                this.mProcessName = UMFrUtils.getCurrentProcessName(C3211a.f17607a.mApplicationContext);
            }
        }
        return this.mProcessName;
    }

    public boolean isMainProcess(Context context) {
        return UMUtils.isMainProgress(context);
    }

    public String toString() {
        if (C3211a.f17607a.mApplicationContext == null) {
            return "uninitialized.";
        }
        StringBuilder sb = new StringBuilder("[");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("appkey:");
        sb2.append(this.mAppkey);
        String str = ",";
        sb2.append(str);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("channel:");
        sb3.append(this.mChannel);
        sb3.append(str);
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("procName:");
        sb4.append(this.mProcessName);
        sb4.append("]");
        sb.append(sb4.toString());
        return sb.toString();
    }

    private UMGlobalContext() {
        this.mProcessName = "";
    }

    public static Context getAppContext() {
        return C3211a.f17607a.mApplicationContext;
    }
}
