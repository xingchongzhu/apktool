package com.bumptech.glide.load.p156o;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.C1422a;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.bumptech.glide.p173s.ObjectKey;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.f */
public class FileLoader<Data> implements ModelLoader<File, Data> {

    /* renamed from: a */
    private final C1525d<Data> f10702a;

    /* renamed from: com.bumptech.glide.load.o.f$a */
    /* compiled from: FileLoader */
    public static class C1521a<Data> implements ModelLoaderFactory<File, Data> {

        /* renamed from: a */
        private final C1525d<Data> f10703a;

        public C1521a(C1525d<Data> dVar) {
            this.f10703a = dVar;
        }

        /* renamed from: b */
        public final ModelLoader<File, Data> mo9098b(MultiModelLoaderFactory rVar) {
            return new FileLoader(this.f10703a);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.f$b */
    /* compiled from: FileLoader */
    public static class C1522b extends C1521a<ParcelFileDescriptor> {

        /* renamed from: com.bumptech.glide.load.o.f$b$a */
        /* compiled from: FileLoader */
        class C1523a implements C1525d<ParcelFileDescriptor> {
            C1523a() {
            }

            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo9115a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void mo9116b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor mo9117c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C1522b() {
            super(new C1523a());
        }
    }

    /* renamed from: com.bumptech.glide.load.o.f$c */
    /* compiled from: FileLoader */
    private static final class C1524c<Data> implements DataFetcher<Data> {

        /* renamed from: a */
        private final File f10704a;

        /* renamed from: b */
        private final C1525d<Data> f10705b;

        /* renamed from: c */
        private Data f10706c;

        C1524c(File file, C1525d<Data> dVar) {
            this.f10704a = file;
            this.f10705b = dVar;
        }

        /* renamed from: a */
        public Class<Data> mo8780a() {
            return this.f10705b.mo9115a();
        }

        /* renamed from: b */
        public void mo8785b() {
            Data data = this.f10706c;
            if (data != null) {
                try {
                    this.f10705b.mo9116b(data);
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
        public void mo8790f(Priority gVar, C1422a<? super Data> aVar) {
            try {
                Data c = this.f10705b.mo9117c(this.f10704a);
                this.f10706c = c;
                aVar.mo8797d(c);
            } catch (FileNotFoundException e) {
                String str = "FileLoader";
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Failed to open file", e);
                }
                aVar.mo8796c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.f$d */
    /* compiled from: FileLoader */
    public interface C1525d<Data> {
        /* renamed from: a */
        Class<Data> mo9115a();

        /* renamed from: b */
        void mo9116b(Data data) throws IOException;

        /* renamed from: c */
        Data mo9117c(File file) throws FileNotFoundException;
    }

    /* renamed from: com.bumptech.glide.load.o.f$e */
    /* compiled from: FileLoader */
    public static class C1526e extends C1521a<InputStream> {

        /* renamed from: com.bumptech.glide.load.o.f$e$a */
        /* compiled from: FileLoader */
        class C1527a implements C1525d<InputStream> {
            C1527a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo9115a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo9116b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo9117c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C1526e() {
            super(new C1527a());
        }
    }

    public FileLoader(C1525d<Data> dVar) {
        this.f10702a = dVar;
    }

    /* renamed from: c */
    public C1535a<Data> mo9093a(File file, int i, int i2, Options iVar) {
        return new C1535a<>(new ObjectKey(file), new C1524c(file, this.f10702a));
    }

    /* renamed from: d */
    public boolean mo9094b(File file) {
        return true;
    }
}
