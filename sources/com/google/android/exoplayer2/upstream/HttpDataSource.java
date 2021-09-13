package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.upstream.x */
public final /* synthetic */ class HttpDataSource {
    /* renamed from: a */
    public static /* synthetic */ boolean m15176a(String str) {
        String J0 = Util.m10256J0(str);
        return !TextUtils.isEmpty(J0) && (!J0.contains("text") || J0.contains("text/vtt")) && !J0.contains("html") && !J0.contains("xml");
    }
}
