package com.bumptech.glide.load.p156o;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.p173s.ObjectKey;
import com.bumptech.glide.p174t.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.o.d */
public class ByteBufferFileLoader implements ModelLoader<File, ByteBuffer> {

    /* renamed from: com.bumptech.glide.load.o.d$a */
    /* compiled from: ByteBufferFileLoader */
    private static final class C1515a implements DataFetcher<ByteBuffer> {

        /* renamed from: a */
        private final File f10695a;

        C1515a(File file) {
            this.f10695a = file;
        }

        /* renamed from: a */
        public Class<ByteBuffer> mo8780a() {
            return ByteBuffer.class;
        }

        /* renamed from: b */
        public void mo8785b() {
        }

        public void cancel() {
        }

        /* renamed from: e */
        public DataSource mo8789e() {
            return DataSource.LOCAL;
        }

        /* renamed from: f */
        public void mo8790f(Priority gVar, C1422a<? super ByteBuffer> aVar) {
            try {
                aVar.mo8797d(ByteBufferUtil.m14047a(this.f10695a));
            } catch (IOException e) {
                String str = "ByteBufferFileLoader";
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo8796c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.d$b */
    /* compiled from: ByteBufferFileLoader */
    public static class C1516b implements ModelLoaderFactory<File, ByteBuffer> {
        /* renamed from: b */
        public ModelLoader<File, ByteBuffer> mo9098b(MultiModelLoaderFactory rVar) {
            return new ByteBufferFileLoader();
        }
    }

    /* renamed from: c */
    public C1535a<ByteBuffer> mo9093a(File file, int i, int i2, Options iVar) {
        return new C1535a<>(new ObjectKey(file), new C1515a(file));
    }

    /* renamed from: d */
    public boolean mo9094b(File file) {
        return true;
    }
}
