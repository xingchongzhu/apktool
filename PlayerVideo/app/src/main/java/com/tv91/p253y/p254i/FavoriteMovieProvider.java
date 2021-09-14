package com.tv91.p253y.p254i;

import android.database.Cursor;
import android.provider.BaseColumns;
import com.tv91.model.Movie;
import com.tv91.model.Movie.Builder;
import com.umeng.analytics.pro.Constants;
import p295h.p296a.Timber;

/* renamed from: com.tv91.y.i.c */
public final class FavoriteMovieProvider implements BaseColumns {

    /* renamed from: a */
    private static final String[] f16106a = {Constants.f16724d, "user_id", "movie_id", "movie_name", "movie_description", "movie_create_date", "movie_image", "movie_favorite"};

    /* renamed from: b */
    private final DBHelper f16107b;

    public FavoriteMovieProvider(DBHelper aVar) {
        this.f16107b = aVar;
    }

    /* renamed from: a */
    private Movie m20715a(Cursor cursor) {
        return new Builder().mo16981id(cursor.getInt(cursor.getColumnIndex("movie_id"))).name(cursor.getString(cursor.getColumnIndex("movie_name"))).description(cursor.getString(cursor.getColumnIndex("movie_description"))).createTime(cursor.getString(cursor.getColumnIndex("movie_create_date"))).image(cursor.getString(cursor.getColumnIndex("movie_image"))).favorite(cursor.getInt(cursor.getColumnIndex("movie_favorite")) != 0).build();
    }

    /* renamed from: b */
    public Movie mo18629b(String str, int i) {
        Timber.m24039a("query favorite movie by user id and movie id", new Object[0]);
        Cursor query = this.f16107b.getReadableDatabase().query("FavoriteMovie", f16106a, "user_id = ? AND movie_id = ?", new String[]{str, String.valueOf(i)}, null, null, null, null);
        Movie a = query.moveToNext() ? m20715a(query) : null;
        query.close();
        return a;
    }
}
