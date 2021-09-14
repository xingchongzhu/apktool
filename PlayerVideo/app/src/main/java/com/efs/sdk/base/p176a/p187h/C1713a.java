package com.efs.sdk.base.p176a.p187h;

import android.content.Context;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.h.a */
public class C1713a {

    /* renamed from: a */
    private static String f11392a = "efs";

    /* renamed from: b */
    private static File f11393b;

    /* renamed from: a */
    public static void m14262a(String str) {
        f11392a = str;
    }

    /* renamed from: b */
    public static File m14263b(Context context, String str) {
        return new File(m14268g(context, str), "efs_config");
    }

    /* renamed from: c */
    public static File m14264c(Context context, String str) {
        return new File(m14268g(context, str), "efs_flow");
    }

    /* renamed from: d */
    public static File m14265d(Context context, String str) {
        File file = new File(m14268g(context, str), "ready");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: e */
    public static File m14266e(Context context, String str) {
        File file = new File(m14265d(context, str), String.valueOf(C1731g.m14316a()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: f */
    public static File m14267f(Context context, String str) {
        File file = new File(m14268g(context, str), "upload");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: g */
    private static File m14268g(Context context, String str) {
        if (f11393b == null) {
            synchronized (C1713a.class) {
                if (f11393b == null) {
                    f11393b = m14260a(context);
                }
            }
        }
        File file = new File(f11393b, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static File m14260a(Context context) {
        File dir = context.getDir(f11392a, 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    /* renamed from: a */
    public static File m14261a(Context context, String str) {
        return new File(m14268g(context, str), "efs_cst");
    }
}
