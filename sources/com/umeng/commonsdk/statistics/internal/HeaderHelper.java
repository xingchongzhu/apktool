package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.umeng.analytics.pro.UMCommonContent;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.commonsdk.statistics.internal.a */
public class HeaderHelper {

    /* renamed from: a */
    private static Context f17753a;

    /* renamed from: b */
    private String f17754b;

    /* renamed from: c */
    private String f17755c;

    /* renamed from: com.umeng.commonsdk.statistics.internal.a$a */
    /* compiled from: HeaderHelper */
    private static class C3235a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final HeaderHelper f17756a = new HeaderHelper();

        private C3235a() {
        }
    }

    /* renamed from: a */
    public static HeaderHelper m22599a(Context context) {
        if (f17753a == null && context != null) {
            f17753a = context.getApplicationContext();
        }
        return C3235a.f17756a;
    }

    /* renamed from: e */
    private void m22600e(String str) {
        String str2 = " ";
        String str3 = "/";
        try {
            String replaceAll = str.replaceAll("&=", str2).replaceAll("&&", str2).replaceAll("==", str3);
            StringBuilder sb = new StringBuilder();
            sb.append(replaceAll);
            sb.append(str3);
            sb.append("Android");
            sb.append(str3);
            sb.append(Build.DISPLAY);
            sb.append(str3);
            sb.append(Build.MODEL);
            sb.append(str3);
            sb.append(VERSION.RELEASE);
            sb.append(str2);
            sb.append(HelperUtils.getUmengMD5(UMUtils.getAppkey(f17753a)));
            this.f17754b = sb.toString();
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f17753a, th);
        }
    }

    /* renamed from: f */
    private void m22601f(String str) {
        String str2 = "=";
        try {
            String str3 = str.split("&&")[0];
            if (!TextUtils.isEmpty(str3)) {
                String[] split = str3.split("&=");
                StringBuilder sb = new StringBuilder();
                sb.append(UMCommonContent.f16590aN);
                for (String str4 : split) {
                    if (!TextUtils.isEmpty(str4)) {
                        String substring = str4.substring(0, 2);
                        if (substring.endsWith(str2)) {
                            substring = substring.replace(str2, "");
                        }
                        sb.append(substring);
                    }
                }
                this.f17755c = sb.toString();
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f17753a, th);
        }
    }

    /* renamed from: b */
    public boolean mo19397b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(UMCommonContent.f16582aF);
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo19398c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(UMCommonContent.f16578aB);
        }
        return false;
    }

    /* renamed from: d */
    public void mo19399d(String str) {
        String substring = str.substring(0, str.indexOf(95));
        m22601f(substring);
        m22600e(substring);
    }

    private HeaderHelper() {
        this.f17754b = null;
        this.f17755c = null;
    }

    /* renamed from: b */
    public String mo19396b() {
        return this.f17754b;
    }

    /* renamed from: a */
    public boolean mo19395a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(UMCommonContent.f16622at);
        }
        return false;
    }

    /* renamed from: a */
    public String mo19394a() {
        return this.f17755c;
    }
}
