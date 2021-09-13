package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* renamed from: com.umeng.analytics.filter.b */
public class EventWhiteList extends EventList {

    /* renamed from: a */
    private SmartDict f16522a;

    /* renamed from: b */
    private Object f16523b = new Object();

    public EventWhiteList(String str, String str2) {
        super(str, str2);
    }

    /* access modifiers changed from: protected */
    public void eventListChange() {
        if (!TextUtils.isEmpty(this.mEventList)) {
            synchronized (this.f16523b) {
                this.f16522a = null;
                this.f16522a = new SmartDict(true, this.mEventList);
            }
        }
    }

    public boolean matchHit(String str) {
        boolean a;
        if (TextUtils.isEmpty(this.mEventList)) {
            return true;
        }
        synchronized (this.f16523b) {
            if (this.f16522a == null) {
                this.f16522a = new SmartDict(true, this.mEventList);
            }
            a = this.f16522a.mo18849a(str);
        }
        return a;
    }

    public void setMD5ClearFlag(boolean z) {
        AnalyticsConfig.CLEAR_EKV_WL = z;
    }
}
