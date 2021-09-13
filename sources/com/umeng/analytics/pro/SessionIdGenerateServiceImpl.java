package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.analytics.pro.w */
class SessionIdGenerateServiceImpl implements SessionIdGenerateService {

    /* renamed from: a */
    private long f17259a = AnalyticsConfig.kContinueSessionMillis;

    SessionIdGenerateServiceImpl() {
    }

    /* renamed from: a */
    public void mo19185a(long j) {
        this.f17259a = j;
    }

    /* renamed from: a */
    public long mo19183a() {
        return this.f17259a;
    }

    /* renamed from: a */
    public String mo19184a(Context context) {
        String appkey = UMUtils.getAppkey(context);
        long currentTimeMillis = System.currentTimeMillis();
        if (appkey != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis);
            sb.append(appkey);
            sb.append("02:00:00:00:00:00");
            return UMUtils.MD5(sb.toString());
        }
        throw new RuntimeException("Appkey is null or empty, Please check!");
    }

    /* renamed from: a */
    public boolean mo19187a(long j, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        if ((j == 0 || currentTimeMillis - j >= this.f17259a) && j2 > 0 && currentTimeMillis - j2 > this.f17259a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo19186a(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Editor edit = PreferenceWrapper.getDefault(context).edit();
            edit.putString("session_id", str);
            edit.putLong(SessionTracker.f17240b, 0);
            edit.putLong(SessionTracker.f17243e, currentTimeMillis);
            edit.putLong(SessionTracker.f17244f, 0);
            edit.commit();
        } catch (Exception unused) {
        }
    }
}
