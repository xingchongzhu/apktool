package com.umeng.analytics.process;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.UMDBUtils;
import java.io.File;

/* renamed from: com.umeng.analytics.process.b */
class UMProcessDBCreater extends SQLiteOpenHelper {
    UMProcessDBCreater(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    /* renamed from: a */
    static UMProcessDBCreater m22158a(Context context, String str) {
        String b = m22161b(context, str);
        DBConstant.f17294h.equals(str);
        return new UMProcessDBCreater(context, b, null, 1);
    }

    /* renamed from: b */
    public static String m22161b(Context context, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = DBConstant.f17294h;
        if (isEmpty) {
            str = str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(UMDBUtils.m21936b(context));
        sb.append("subprocess/");
        String sb2 = sb.toString();
        if (str2.equals(str)) {
            sb2 = UMDBUtils.m21936b(context);
        }
        File file = new File(sb2);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(DBConstant.f17291e);
        return String.format(sb3.toString(), new Object[]{str});
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m22160a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: a */
    private void m22160a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("create table if not exists __et_p(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __pn TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: a */
    public static String m22159a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(UMDBUtils.m21936b(context));
        sb.append("subprocess/");
        return sb.toString();
    }
}
