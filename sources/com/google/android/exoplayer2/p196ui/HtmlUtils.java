package com.google.android.exoplayer2.p196ui;

import android.graphics.Color;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.ui.i */
final class HtmlUtils {
    /* renamed from: a */
    public static String m14831a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        sb.append(str);
        sb.append(",.");
        sb.append(str);
        sb.append(" *");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m14832b(int i) {
        double alpha = (double) Color.alpha(i);
        Double.isNaN(alpha);
        return Util.m10237A("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(alpha / 255.0d));
    }
}
