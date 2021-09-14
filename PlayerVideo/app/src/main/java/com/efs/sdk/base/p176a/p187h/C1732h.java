package com.efs.sdk.base.p176a.p187h;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.UUID;

/* renamed from: com.efs.sdk.base.a.h.h */
public class C1732h {

    /* renamed from: a */
    private static volatile String f11414a = "";

    /* renamed from: a */
    public static String m14320a(Context context) {
        if (TextUtils.isEmpty(f11414a)) {
            synchronized (C1732h.class) {
                if (TextUtils.isEmpty(f11414a)) {
                    String b = m14321b(context);
                    f11414a = b;
                    if (TextUtils.isEmpty(b)) {
                        f11414a = m14322c(context);
                    }
                }
            }
        }
        return f11414a;
    }

    /* renamed from: b */
    private static String m14321b(Context context) {
        try {
            File file = new File(C1713a.m14260a(context), "efsid");
            if (file.exists()) {
                return C1719b.m14275a(file);
            }
            return null;
        } catch (Exception e) {
            C1728d.m14309b("efs.base", "get uuid error", e);
            return null;
        }
    }

    /* renamed from: c */
    private static String m14322c(Context context) {
        String str = "efsid";
        String str2 = "";
        int i = 0;
        while (i < 3) {
            try {
                str2 = UUID.randomUUID().toString();
                if (TextUtils.isEmpty(str2)) {
                    i++;
                }
            } catch (Throwable unused) {
            }
        }
        try {
            File a = C1713a.m14260a(context);
            StringBuilder sb = new StringBuilder(str);
            sb.append(Process.myPid());
            File file = new File(a, sb.toString());
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            C1719b.m14278a(file, str2);
            if (file.renameTo(new File(a, str))) {
                file.delete();
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("save uuid '");
            sb2.append(str2);
            sb2.append("' error");
            C1728d.m14309b("efs.base", sb2.toString(), e);
        }
        return str2;
    }
}
