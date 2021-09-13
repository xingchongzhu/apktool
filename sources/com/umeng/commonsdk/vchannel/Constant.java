package com.umeng.commonsdk.vchannel;

/* renamed from: com.umeng.commonsdk.vchannel.a */
public class Constant {

    /* renamed from: a */
    public static String f17948a = "https://pslog.umeng.com";

    /* renamed from: b */
    public static String f17949b = "https://pslog.umeng.com/";

    /* renamed from: c */
    public static String f17950c = "explog";

    /* renamed from: d */
    public static final String f17951d = "analytics";

    /* renamed from: e */
    public static final String f17952e = "ekv";

    /* renamed from: f */
    public static final String f17953f = "id";

    /* renamed from: g */
    public static final String f17954g = "ts";

    /* renamed from: h */
    public static final String f17955h = "ds";

    /* renamed from: i */
    public static final String f17956i = "pn";

    /* renamed from: j */
    public static String f17957j = "";

    static {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("SUB");
        sb.append(currentTimeMillis);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("%0");
        sb4.append(32 - sb2.length());
        sb4.append("d");
        sb3.append(String.format(sb4.toString(), new Object[]{Integer.valueOf(0)}));
        f17957j = sb3.toString();
    }
}
