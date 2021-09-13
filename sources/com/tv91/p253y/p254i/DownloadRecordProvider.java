package com.tv91.p253y.p254i;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import com.tv91.model.Channel;
import com.tv91.model.DownloadInfo;
import com.tv91.model.DownloadRecord;
import com.tv91.model.DownloadRecord.C2335a;
import com.tv91.model.Movie;
import com.tv91.model.User.Builder;
import com.umeng.analytics.pro.Constants;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p295h.p296a.Timber;

/* renamed from: com.tv91.y.i.b */
public final class DownloadRecordProvider implements BaseColumns {

    /* renamed from: a */
    static final String[] f16104a = {Constants.f16724d, "user_id", "movie_id", "movie_name", "movie_channel", "movie_poster", "movie_file_size", "file_path", "download_id", "download_ver_id", "download_url", "download_expire_date", "download_status"};

    /* renamed from: b */
    private final DBHelper f16105b;

    public DownloadRecordProvider(DBHelper aVar) {
        this.f16105b = aVar;
    }

    /* renamed from: b */
    private DownloadRecord m20709b(Cursor cursor) {
        DownloadRecord aVar = new DownloadRecord((long) cursor.getInt(cursor.getColumnIndex(Constants.f16724d)), new Builder().mo17022id(cursor.getString(cursor.getColumnIndex("user_id"))).build(), new Movie.Builder().mo16981id(cursor.getInt(cursor.getColumnIndex("movie_id"))).name(cursor.getString(cursor.getColumnIndex("movie_name"))).channel(new Channel(cursor.getInt(cursor.getColumnIndex("movie_channel")), "")).poster(cursor.getString(cursor.getColumnIndex("movie_poster"))).fileSize(cursor.getLong(cursor.getColumnIndex("movie_file_size"))).build(), new DownloadInfo(cursor.getInt(cursor.getColumnIndex("download_id")), cursor.getString(cursor.getColumnIndex("download_ver_id")), cursor.getString(cursor.getColumnIndex("download_url")), new Date(cursor.getLong(cursor.getColumnIndex("download_expire_date")))), cursor.getString(cursor.getColumnIndex("file_path")), C2335a.m17632a(cursor.getString(cursor.getColumnIndex("download_status"))));
        return aVar;
    }

    /* renamed from: a */
    public void mo18624a(DownloadRecord aVar) throws SQLException {
        Timber.m24039a("insert or update download record", new Object[0]);
        ContentValues contentValues = new ContentValues(f16104a.length);
        contentValues.put("user_id", aVar.f14100b.f14097id);
        contentValues.put("movie_id", Integer.valueOf(aVar.f14101c.f14083id));
        contentValues.put("movie_channel", Integer.valueOf(aVar.f14101c.channel.key));
        contentValues.put("movie_name", aVar.f14101c.name);
        contentValues.put("movie_poster", aVar.f14101c.poster);
        contentValues.put("movie_file_size", Long.valueOf(aVar.f14101c.fileSize));
        contentValues.put("download_id", Integer.valueOf(aVar.f14102d.f14080id));
        contentValues.put("download_ver_id", aVar.f14102d.verifyId);
        contentValues.put("download_url", aVar.f14102d.url);
        contentValues.put("download_expire_date", Long.valueOf(aVar.f14102d.expireDate.getTime()));
        contentValues.put("file_path", aVar.f14103e);
        contentValues.put("download_status", aVar.f14104f.toString());
        SQLiteDatabase writableDatabase = this.f16105b.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            if (writableDatabase.replaceOrThrow("DownloadRecord", null, contentValues) != -1) {
                writableDatabase.setTransactionSuccessful();
            }
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            Timber.m24042d(e, "insert or update download record failed", new Object[0]);
            throw e;
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: c */
    public DownloadRecord mo18625c(String str, int i) {
        Timber.m24039a("query download records by user with [user id: %s, movie id: %d]", str, Integer.valueOf(i));
        Cursor query = this.f16105b.getReadableDatabase().query("DownloadRecord", f16104a, "user_id = ? AND movie_id = ?", new String[]{str, String.valueOf(i)}, null, null, null, null);
        DownloadRecord b = query.moveToNext() ? m20709b(query) : null;
        query.close();
        return b;
    }

    /* renamed from: d */
    public List<DownloadRecord> mo18626d() {
        Timber.m24039a("query all download records", new Object[0]);
        SQLiteDatabase readableDatabase = this.f16105b.getReadableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor query = readableDatabase.query("DownloadRecord", f16104a, null, null, null, null, null, null);
        while (query.moveToNext()) {
            arrayList.add(m20709b(query));
        }
        query.close();
        return arrayList;
    }

    /* renamed from: e */
    public List<DownloadRecord> mo18627e(String str) {
        Timber.m24039a("query download records by user with id: %s", str);
        SQLiteDatabase readableDatabase = this.f16105b.getReadableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor query = readableDatabase.query("DownloadRecord", f16104a, "user_id = ? AND download_status != ?", new String[]{str, C2335a.DELETED.toString()}, null, null, "movie_id ASC", null);
        while (query.moveToNext()) {
            arrayList.add(m20709b(query));
        }
        query.close();
        return arrayList;
    }

    /* renamed from: f */
    public void mo18628f(DownloadRecord aVar) throws SQLException {
        Timber.m24039a("update download record: %s", aVar.f14104f);
        ContentValues contentValues = new ContentValues();
        contentValues.put("movie_name", aVar.f14101c.name);
        contentValues.put("movie_channel", Integer.valueOf(aVar.f14101c.channel.key));
        contentValues.put("movie_poster", aVar.f14101c.poster);
        contentValues.put("movie_file_size", Long.valueOf(aVar.f14101c.fileSize));
        contentValues.put("download_id", Integer.valueOf(aVar.f14102d.f14080id));
        contentValues.put("download_ver_id", aVar.f14102d.verifyId);
        contentValues.put("download_url", aVar.f14102d.url);
        contentValues.put("download_expire_date", Long.valueOf(aVar.f14102d.expireDate.getTime()));
        contentValues.put("file_path", aVar.f14103e);
        contentValues.put("download_status", aVar.f14104f.toString());
        SQLiteDatabase writableDatabase = this.f16105b.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            if (((long) writableDatabase.update("DownloadRecord", contentValues, "user_id = ? AND movie_id = ?", new String[]{aVar.f14100b.f14097id, String.valueOf(aVar.f14101c.f14083id)})) != -1) {
                writableDatabase.setTransactionSuccessful();
            }
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            Timber.m24042d(e, "update download record failed", new Object[0]);
            throw e;
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }
}
