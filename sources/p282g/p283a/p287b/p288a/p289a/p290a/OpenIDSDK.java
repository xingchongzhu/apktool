package p282g.p283a.p287b.p288a.p289a.p290a;

import android.content.Context;
import p282g.p283a.p284a.p285a.p286a.IOpenID.C3391b;

/* renamed from: g.a.b.a.a.a.a */
public class OpenIDSDK {
    /* renamed from: a */
    public static void m24018a(Context context) {
        C3391b.f18799b = C3394b.f18806a.mo20291b(context.getApplicationContext());
        C3391b.f18798a = true;
    }

    /* renamed from: b */
    public static boolean m24019b() {
        if (C3391b.f18798a) {
            return C3391b.f18799b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: c */
    public static String m24020c(Context context) {
        if (C3391b.f18798a) {
            return C3394b.f18806a.mo20290a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
