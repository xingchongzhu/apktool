package p282g.p283a.p287b.p293c.p294a;

import android.content.Context;

/* renamed from: g.a.b.c.a.a */
public class DataBaseOperation {

    /* renamed from: a */
    private Context f18813a;

    public DataBaseOperation(Context context) {
        this.f18813a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo20295a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0041
            r1 = 1
            if (r8 == r1) goto L_0x002b
            r1 = 2
            if (r8 == r1) goto L_0x0015
            r9 = 4
            if (r8 == r9) goto L_0x000e
            r2 = r0
            goto L_0x0048
        L_0x000e:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x0047
        L_0x0015:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            r8.append(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x0047
        L_0x002b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            r8.append(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x0047
        L_0x0041:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r8 = android.net.Uri.parse(r8)
        L_0x0047:
            r2 = r8
        L_0x0048:
            android.content.Context r8 = r7.f18813a
            android.content.ContentResolver r1 = r8.getContentResolver()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            if (r8 == 0) goto L_0x006d
            boolean r9 = r8.moveToNext()
            if (r9 == 0) goto L_0x0069
            java.lang.String r9 = "value"
            int r9 = r8.getColumnIndex(r9)
            java.lang.String r9 = r8.getString(r9)
            r0 = r9
        L_0x0069:
            r8.close()
            goto L_0x0074
        L_0x006d:
            java.lang.String r8 = "VMS_IDLG_SDK_DB"
            java.lang.String r9 = "return cursor is null,return"
            android.util.Log.d(r8, r9)
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p282g.p283a.p287b.p293c.p294a.DataBaseOperation.mo20295a(int, java.lang.String):java.lang.String");
    }
}
