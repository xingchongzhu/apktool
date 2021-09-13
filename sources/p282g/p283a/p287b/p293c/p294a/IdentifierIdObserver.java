package p282g.p283a.p287b.p293c.p294a;

import android.database.ContentObserver;
import android.util.Log;

/* renamed from: g.a.b.c.a.c */
public class IdentifierIdObserver extends ContentObserver {

    /* renamed from: a */
    private String f18829a;

    /* renamed from: b */
    private int f18830b;

    /* renamed from: c */
    private IdentifierIdClient f18831c;

    public IdentifierIdObserver(IdentifierIdClient bVar, int i, String str) {
        super(null);
        this.f18831c = bVar;
        this.f18830b = i;
        this.f18829a = str;
    }

    public void onChange(boolean z) {
        IdentifierIdClient bVar = this.f18831c;
        if (bVar != null) {
            bVar.mo20296c(this.f18830b, this.f18829a);
        } else {
            Log.e("VMS_IDLG_SDK_Observer", "mIdentifierIdClient is null");
        }
    }
}
