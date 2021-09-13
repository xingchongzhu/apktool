package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.b */
public abstract class AssetPathFetcher<T> implements DataFetcher<T> {

    /* renamed from: a */
    private final String f10293a;

    /* renamed from: b */
    private final AssetManager f10294b;

    /* renamed from: c */
    private T f10295c;

    public AssetPathFetcher(AssetManager assetManager, String str) {
        this.f10294b = assetManager;
        this.f10293a = str;
    }

    /* renamed from: b */
    public void mo8785b() {
        T t = this.f10295c;
        if (t != null) {
            try {
                mo8786c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo8786c(T t) throws IOException;

    public void cancel() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract T mo8788d(AssetManager assetManager, String str) throws IOException;

    /* renamed from: e */
    public DataSource mo8789e() {
        return DataSource.LOCAL;
    }

    /* renamed from: f */
    public void mo8790f(Priority gVar, C1422a<? super T> aVar) {
        try {
            T d = mo8788d(this.f10294b, this.f10293a);
            this.f10295c = d;
            aVar.mo8797d(d);
        } catch (IOException e) {
            String str = "AssetPathFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to load data from asset manager", e);
            }
            aVar.mo8796c(e);
        }
    }
}
