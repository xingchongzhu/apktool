package com.tv91.p251w;

import android.annotation.SuppressLint;
import android.util.Log;
import com.umeng.umcrash.UMCrash;
import p295h.p296a.Timber.C3398b;

/* renamed from: com.tv91.w.a */
public final class CrashReportTree extends C3398b {
    /* access modifiers changed from: protected */
    @SuppressLint({"LogNotTimber"})
    /* renamed from: j */
    public void mo18570j(int i, String str, String str2, Throwable th) {
        if (i != 2 && i != 3) {
            String str3 = "ERROR_REPORT_91TV";
            if (th == null) {
                Log.println(i, str3, str2);
            } else if (i == 7 || i == 6) {
                UMCrash.generateCustomLog(th, "DEFAULT");
            } else if (i == 5) {
                Log.w(str3, str2, th);
            }
        }
    }
}
