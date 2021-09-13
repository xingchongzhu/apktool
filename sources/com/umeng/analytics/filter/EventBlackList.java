package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* renamed from: com.umeng.analytics.filter.a */
public class EventBlackList extends EventList {

    /* renamed from: a */
    private SmartDict f16520a;

    /* renamed from: b */
    private Object f16521b = new Object();

    public EventBlackList(String str, String str2) {
        super(str, str2);
    }

    /* access modifiers changed from: protected */
    public void eventListChange() {
        if (!TextUtils.isEmpty(this.mEventList)) {
            synchronized (this.f16521b) {
                this.f16520a = null;
                this.f16520a = new SmartDict(false, this.mEventList);
            }
        }
    }

    public boolean matchHit(String str) {
        boolean a;
        if (TextUtils.isEmpty(this.mEventList)) {
            return false;
        }
        synchronized (this.f16521b) {
            if (this.f16520a == null) {
                this.f16520a = new SmartDict(false, this.mEventList);
            }
            a = this.f16520a.mo18849a(str);
        }
        return a;
    }

    public void setMD5ClearFlag(boolean z) {
        AnalyticsConfig.CLEAR_EKV_BL = z;
    }
}
