package com.bumptech.glide.load.data.p151o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import com.bumptech.glide.load.data.ExifOrientationStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.o.c */
public class ThumbFetcher implements DataFetcher<InputStream> {

    /* renamed from: a */
    private final Uri f10321a;

    /* renamed from: b */
    private final ThumbnailStreamOpener f10322b;

    /* renamed from: c */
    private InputStream f10323c;

    /* renamed from: com.bumptech.glide.load.data.o.c$a */
    /* compiled from: ThumbFetcher */
    static class C1429a implements ThumbnailQuery {

        /* renamed from: a */
        private static final String[] f10324a = {"_data"};

        /* renamed from: b */
        private final ContentResolver f10325b;

        C1429a(ContentResolver contentResolver) {
            this.f10325b = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo8821a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f10325b.query(Thumbnails.EXTERNAL_CONTENT_URI, f10324a, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.o.c$b */
    /* compiled from: ThumbFetcher */
    static class C1430b implements ThumbnailQuery {

        /* renamed from: a */
        private static final String[] f10326a = {"_data"};

        /* renamed from: b */
        private final ContentResolver f10327b;

        C1430b(ContentResolver contentResolver) {
            this.f10327b = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo8821a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f10327b.query(Video.Thumbnails.EXTERNAL_CONTENT_URI, f10326a, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    ThumbFetcher(Uri uri, ThumbnailStreamOpener eVar) {
        this.f10321a = uri;
        this.f10322b = eVar;
    }

    /* renamed from: c */
    private static ThumbFetcher m12573c(Context context, Uri uri, ThumbnailQuery dVar) {
        return new ThumbFetcher(uri, new ThumbnailStreamOpener(Glide.m12384c(context).mo8690j().mo8718g(), dVar, Glide.m12384c(context).mo8685e(), context.getContentResolver()));
    }

    /* renamed from: d */
    public static ThumbFetcher m12574d(Context context, Uri uri) {
        return m12573c(context, uri, new C1429a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static ThumbFetcher m12575g(Context context, Uri uri) {
        return m12573c(context, uri, new C1430b(context.getContentResolver()));
    }

    /* renamed from: h */
    private InputStream m12576h() throws FileNotFoundException {
        InputStream d = this.f10322b.mo8823d(this.f10321a);
        int a = d != null ? this.f10322b.mo8822a(this.f10321a) : -1;
        return a != -1 ? new ExifOrientationStream(d, a) : d;
    }

    /* renamed from: a */
    public Class<InputStream> mo8780a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo8785b() {
        InputStream inputStream = this.f10323c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    /* renamed from: e */
    public DataSource mo8789e() {
        return DataSource.LOCAL;
    }

    /* renamed from: f */
    public void mo8790f(Priority gVar, C1422a<? super InputStream> aVar) {
        try {
            InputStream h = m12576h();
            this.f10323c = h;
            aVar.mo8797d(h);
        } catch (FileNotFoundException e) {
            String str = "MediaStoreThumbFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to find thumbnail file", e);
            }
            aVar.mo8796c(e);
        }
    }
}
