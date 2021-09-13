package com.umeng.commonsdk.config;

import android.content.Context;
import android.util.Pair;
import com.umeng.commonsdk.config.FieldTable.C3182a;
import com.umeng.commonsdk.config.FieldTable.C3183b;
import com.umeng.commonsdk.config.FieldTable.C3184c;
import com.umeng.commonsdk.config.FieldTable.C3185d;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import java.util.ArrayList;

public class FieldManager {

    /* renamed from: a */
    private static final String f17341a = "cfgfd";

    /* renamed from: b */
    private static CollectController f17342b = CollectController.m22211b();

    /* renamed from: c */
    private static boolean f17343c = false;

    /* renamed from: d */
    private static Object f17344d = new Object();

    /* renamed from: com.umeng.commonsdk.config.FieldManager$a */
    private static class C3179a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final FieldManager f17345a = new FieldManager();

        private C3179a() {
        }
    }

    /* renamed from: a */
    public static FieldManager m22199a() {
        return C3179a.f17345a;
    }

    public static boolean allow(String str) {
        synchronized (f17344d) {
            if (!f17343c) {
                return false;
            }
            boolean a = CollectController.m22210a(str);
            return a;
        }
    }

    /* renamed from: b */
    public static boolean m22200b() {
        boolean z;
        synchronized (f17344d) {
            z = f17343c;
        }
        return z;
    }

    private FieldManager() {
    }

    /* renamed from: a */
    public void mo19240a(Context context) {
        String str = "1001@3758096383,2147483647,262143,2047";
        String[] strArr = {C3182a.class.getName(), C3183b.class.getName(), C3184c.class.getName(), C3185d.class.getName()};
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "cfgfd", str);
        synchronized (f17344d) {
            Pair a = m22198a(imprintProperty);
            if (((Long) a.first).longValue() > 1000) {
                String str2 = (String) a.second;
                if (str2 != null && str2.length() > 0) {
                    str = str2;
                }
            }
            String[] split = str.split(",");
            int length = split.length;
            if (length > 0) {
                ArrayList arrayList = new ArrayList();
                SensitiveFieldHandler gVar = new SensitiveFieldHandler();
                for (int i = 0; i < length; i++) {
                    arrayList.add(gVar);
                    ((IConfigHandler) arrayList.get(i)).mo19244a(split[i], f17342b, FieldTable.m22217b(strArr[i]));
                }
            }
            f17343c = true;
        }
    }

    /* renamed from: a */
    public void mo19241a(Context context, String str) {
        String str2 = "1001@3758096383,2147483647,262143,2047";
        String[] strArr = {C3182a.class.getName(), C3183b.class.getName(), C3184c.class.getName(), C3185d.class.getName()};
        synchronized (f17344d) {
            f17342b.mo19242a();
            if (str != null) {
                Pair a = m22198a(str);
                if (((Long) a.first).longValue() > 1000) {
                    String str3 = (String) a.second;
                    if (str3 != null && str3.length() > 0) {
                        str2 = str3;
                    }
                }
            }
            String[] split = str2.split(",");
            int length = split.length;
            if (length > 0) {
                ArrayList arrayList = new ArrayList();
                SensitiveFieldHandler gVar = new SensitiveFieldHandler();
                for (int i = 0; i < length; i++) {
                    arrayList.add(gVar);
                    ((IConfigHandler) arrayList.get(i)).mo19244a(split[i], f17342b, FieldTable.m22217b(strArr[i]));
                }
            }
            f17343c = true;
        }
    }

    /* renamed from: a */
    private static Pair<Long, String> m22198a(String str) {
        Pair<Long, String> pair = new Pair<>(Long.valueOf(-1), null);
        if (str != null && str.length() >= 2) {
            String[] split = str.split("@");
            if (split.length < 2) {
                return pair;
            }
            try {
                long parseLong = Long.parseLong(split[0]);
                return new Pair<>(Long.valueOf(parseLong), split[1]);
            } catch (Throwable unused) {
            }
        }
        return pair;
    }
}
