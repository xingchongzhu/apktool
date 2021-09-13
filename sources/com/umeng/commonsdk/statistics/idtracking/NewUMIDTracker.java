package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.analytics.pro.UMCommonContent;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.h */
public class NewUMIDTracker extends AbstractIdTracker {

    /* renamed from: a */
    private static final String f17738a = "newumid";

    /* renamed from: b */
    private Context f17739b;

    public NewUMIDTracker(Context context) {
        super(f17738a);
        this.f17739b = context;
    }

    /* renamed from: f */
    public String mo19365f() {
        return UMEnvelopeBuild.imprintProperty(this.f17739b, UMCommonContent.f16645g, null);
    }
}
