package com.bumptech.glide.load.p156o;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.p173s.ObjectKey;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.e */
public final class DataUrlLoader<Model, Data> implements ModelLoader<Model, Data> {

    /* renamed from: a */
    private final C1517a<Data> f10696a;

    /* renamed from: com.bumptech.glide.load.o.e$a */
    /* compiled from: DataUrlLoader */
    public interface C1517a<Data> {
        /* renamed from: a */
        Class<Data> mo9108a();

        /* renamed from: b */
        void mo9109b(Data data) throws IOException;

        /* renamed from: c */
        Data mo9110c(String str) throws IllegalArgumentException;
    }

    /* renamed from: com.bumptech.glide.load.o.e$b */
    /* compiled from: DataUrlLoader */
    private static final class C1518b<Data> implements DataFetcher<Data> {

        /* renamed from: a */
        private final String f10697a;

        /* renamed from: b */
        private final C1517a<Data> f10698b;

        /* renamed from: c */
        private Data f10699c;

        C1518b(String str, C1517a<Data> aVar) {
            this.f10697a = str;
            this.f10698b = aVar;
        }

        /* renamed from: a */
        public Class<Data> mo8780a() {
            return this.f10698b.mo9108a();
        }

        /* renamed from: b */
        public void mo8785b() {
            try {
                this.f10698b.mo9109b(this.f10699c);
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        /* renamed from: e */
        public DataSource mo8789e() {
            return DataSource.LOCAL;
        }

        /* renamed from: f */
        public void mo8790f(Priority gVar, C1422a<? super Data> aVar) {
            try {
                Data c = this.f10698b.mo9110c(this.f10697a);
                this.f10699c = c;
                aVar.mo8797d(c);
            } catch (IllegalArgumentException e) {
                aVar.mo8796c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.e$c */
    /* compiled from: DataUrlLoader */
    public static final class C1519c<Model> implements ModelLoaderFactory<Model, InputStream> {

        /* renamed from: a */
        private final C1517a<InputStream> f10700a = new C1520a();

        /* renamed from: com.bumptech.glide.load.o.e$c$a */
        /* compiled from: DataUrlLoader */
        class C1520a implements C1517a<InputStream> {
            C1520a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo9108a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo9109b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo9110c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        /* renamed from: b */
        public ModelLoader<Model, InputStream> mo9098b(MultiModelLoaderFactory rVar) {
            return new DataUrlLoader(this.f10700a);
        }
    }

    public DataUrlLoader(C1517a<Data> aVar) {
        this.f10696a = aVar;
    }

    /* renamed from: a */
    public C1535a<Data> mo9093a(Model model, int i, int i2, Options iVar) {
        return new C1535a<>(new ObjectKey(model), new C1518b(model.toString(), this.f10696a));
    }

    /* renamed from: b */
    public boolean mo9094b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
