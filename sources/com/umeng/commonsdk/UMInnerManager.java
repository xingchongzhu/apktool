package com.umeng.commonsdk;

import android.content.Context;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;

/* renamed from: com.umeng.commonsdk.a */
public class UMInnerManager {

    /* renamed from: a */
    private static Class<?> f17339a;

    /* renamed from: b */
    private static Method f17340b;

    static {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.UMInnerImpl");
            f17339a = cls;
            Method declaredMethod = cls.getDeclaredMethod("initAndSendInternal", new Class[]{Context.class});
            if (declaredMethod != null) {
                f17340b = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m22197a(Context context) {
        if (context != null && UMUtils.isMainProgress(context)) {
            if (SdkVersion.SDK_TYPE != 1) {
                Class<?> cls = f17339a;
                if (cls != null) {
                    Method method = f17340b;
                    if (method != null) {
                        try {
                            method.invoke(cls, new Object[]{context});
                        } catch (Throwable unused) {
                        }
                    }
                }
            } else {
                UMConfigureInternation.sendInternal(context);
            }
        }
    }
}
