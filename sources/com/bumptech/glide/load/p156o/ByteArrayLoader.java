package com.bumptech.glide.load.p156o;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.p173s.ObjectKey;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.o.b */
public class ByteArrayLoader<Data> implements ModelLoader<byte[], Data> {

    /* renamed from: a */
    private final C1511b<Data> f10690a;

    /* renamed from: com.bumptech.glide.load.o.b$a */
    /* compiled from: ByteArrayLoader */
    public static class C1509a implements ModelLoaderFactory<byte[], ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.o.b$a$a */
        /* compiled from: ByteArrayLoader */
        class C1510a implements C1511b<ByteBuffer> {
            C1510a() {
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo9101a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer mo9102b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        /* renamed from: b */
        public ModelLoader<byte[], ByteBuffer> mo9098b(MultiModelLoaderFactory rVar) {
            return new ByteArrayLoader(new C1510a());
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b$b */
    /* compiled from: ByteArrayLoader */
    public interface C1511b<Data> {
        /* renamed from: a */
        Class<Data> mo9101a();

        /* renamed from: b */
        Data mo9102b(byte[] bArr);
    }

    /* renamed from: com.bumptech.glide.load.o.b$c */
    /* compiled from: ByteArrayLoader */
    private static class C1512c<Data> implements DataFetcher<Data> {

        /* renamed from: a */
        private final byte[] f10692a;

        /* renamed from: b */
        private final C1511b<Data> f10693b;

        C1512c(byte[] bArr, C1511b<Data> bVar) {
            this.f10692a = bArr;
            this.f10693b = bVar;
        }

        /* renamed from: a */
        public Class<Data> mo8780a() {
            return this.f10693b.mo9101a();
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
        public void mo8790f(Priority gVar, C1422a<? super Data> aVar) {
            aVar.mo8797d(this.f10693b.mo9102b(this.f10692a));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b$d */
    /* compiled from: ByteArrayLoader */
    public static class C1513d implements ModelLoaderFactory<byte[], InputStream> {

        /* renamed from: com.bumptech.glide.load.o.b$d$a */
        /* compiled from: ByteArrayLoader */
        class C1514a implements C1511b<InputStream> {
            C1514a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo9101a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream mo9102b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        /* renamed from: b */
        public ModelLoader<byte[], InputStream> mo9098b(MultiModelLoaderFactory rVar) {
            return new ByteArrayLoader(new C1514a());
        }
    }

    public ByteArrayLoader(C1511b<Data> bVar) {
        this.f10690a = bVar;
    }

    /* renamed from: c */
    public C1535a<Data> mo9093a(byte[] bArr, int i, int i2, Options iVar) {
        return new C1535a<>(new ObjectKey(bArr), new C1512c(bArr, this.f10690a));
    }

    /* renamed from: d */
    public boolean mo9094b(byte[] bArr) {
        return true;
    }
}
