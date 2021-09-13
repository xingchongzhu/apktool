package com.tv91.p253y.p254i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.tv91.y.i.a */
public final class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context, boolean z) {
        super(context, z ? "Test91TV.db" : "91TV.db", null, 2);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE DownloadRecord (_id INTEGER PRIMARY KEY AUTOINCREMENT,user_id TEXT NOT NULL,movie_id INTEGER NOT NULL,movie_name TEXT,movie_channel INTEGER,movie_poster TEXT,movie_file_size INTEGER,download_id INTEGER,download_ver_id TEXT,download_url TEXT,download_expire_date INTEGER,file_path TEXT,download_status TEXT,UNIQUE (user_id, movie_id))");
        sQLiteDatabase.execSQL("CREATE TABLE FavoriteMovie (_id INTEGER PRIMARY KEY AUTOINCREMENT,user_id TEXT NOT NULL,movie_id INTEGER NOT NULL,movie_name TEXT,movie_description TEXT,movie_create_date TEXT,movie_image TEXT,movie_favorite INTEGER,UNIQUE (user_id, movie_id))");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 != i && i == 1) {
            sQLiteDatabase.execSQL("ALTER TABLE DownloadRecord ADD COLUMN movie_channel INTEGER DEFAULT -2");
        }
    }
}
