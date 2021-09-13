package p010b.p026e.p027a.p029b;

import android.view.View;

/* renamed from: b.e.a.b.a */
public class Debug {
    /* renamed from: a */
    public static String m4527a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
