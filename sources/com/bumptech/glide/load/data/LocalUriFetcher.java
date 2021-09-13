package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.l */
public abstract class LocalUriFetcher<T> implements DataFetcher<T> {

    /* renamed from: a */
    private final Uri f10317a;

    /* renamed from: b */
    private final ContentResolver f10318b;

    /* renamed from: c */
    private T f10319c;

    public LocalUriFetcher(ContentResolver contentResolver, Uri uri) {
        this.f10318b = contentResolver;
        this.f10317a = uri;
    }

    /* renamed from: b */
    public void mo8785b() {
        T t = this.f10319c;
        if (t != null) {
            try {
                mo8781c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo8781c(T t) throws IOException;

    public void cancel() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract T mo8782d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    /* renamed from: e */
    public DataSource mo8789e() {
        return DataSource.LOCAL;
    }

    /* renamed from: f */
    public final void mo8790f(Priority gVar, C1422a<? super T> aVar) {
        try {
            T d = mo8782d(this.f10317a, this.f10318b);
            this.f10319c = d;
            aVar.mo8797d(d);
        } catch (FileNotFoundException e) {
            String str = "LocalUriFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to open Uri", e);
            }
            aVar.mo8796c(e);
        }
    }
}
