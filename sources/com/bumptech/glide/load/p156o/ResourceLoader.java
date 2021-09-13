package com.bumptech.glide.load.p156o;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.p156o.ModelLoader.C1535a;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.s */
public class ResourceLoader<Data> implements ModelLoader<Integer, Data> {

    /* renamed from: a */
    private final ModelLoader<Uri, Data> f10760a;

    /* renamed from: b */
    private final Resources f10761b;

    /* renamed from: com.bumptech.glide.load.o.s$a */
    /* compiled from: ResourceLoader */
    public static final class C1542a implements ModelLoaderFactory<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f10762a;

        public C1542a(Resources resources) {
            this.f10762a = resources;
        }

        /* renamed from: b */
        public ModelLoader<Integer, AssetFileDescriptor> mo9098b(MultiModelLoaderFactory rVar) {
            return new ResourceLoader(this.f10762a, rVar.mo9152d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.s$b */
    /* compiled from: ResourceLoader */
    public static class C1543b implements ModelLoaderFactory<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f10763a;

        public C1543b(Resources resources) {
            this.f10763a = resources;
        }

        /* renamed from: b */
        public ModelLoader<Integer, ParcelFileDescriptor> mo9098b(MultiModelLoaderFactory rVar) {
            return new ResourceLoader(this.f10763a, rVar.mo9152d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.s$c */
    /* compiled from: ResourceLoader */
    public static class C1544c implements ModelLoaderFactory<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f10764a;

        public C1544c(Resources resources) {
            this.f10764a = resources;
        }

        /* renamed from: b */
        public ModelLoader<Integer, InputStream> mo9098b(MultiModelLoaderFactory rVar) {
            return new ResourceLoader(this.f10764a, rVar.mo9152d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.s$d */
    /* compiled from: ResourceLoader */
    public static class C1545d implements ModelLoaderFactory<Integer, Uri> {

        /* renamed from: a */
        private final Resources f10765a;

        public C1545d(Resources resources) {
            this.f10765a = resources;
        }

        /* renamed from: b */
        public ModelLoader<Integer, Uri> mo9098b(MultiModelLoaderFactory rVar) {
            return new ResourceLoader(this.f10765a, UnitModelLoader.m13188c());
        }
    }

    public ResourceLoader(Resources resources, ModelLoader<Uri, Data> nVar) {
        this.f10761b = resources;
        this.f10760a = nVar;
    }

    /* renamed from: d */
    private Uri m13168d(Integer num) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("android.resource://");
            sb.append(this.f10761b.getResourcePackageName(num.intValue()));
            sb.append(JsonPointer.SEPARATOR);
            sb.append(this.f10761b.getResourceTypeName(num.intValue()));
            sb.append(JsonPointer.SEPARATOR);
            sb.append(this.f10761b.getResourceEntryName(num.intValue()));
            return Uri.parse(sb.toString());
        } catch (NotFoundException e) {
            String str = "ResourceLoader";
            if (Log.isLoggable(str, 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Received invalid resource id: ");
                sb2.append(num);
                Log.w(str, sb2.toString(), e);
            }
            return null;
        }
    }

    /* renamed from: c */
    public C1535a<Data> mo9093a(Integer num, int i, int i2, Options iVar) {
        Uri d = m13168d(num);
        if (d == null) {
            return null;
        }
        return this.f10760a.mo9093a(d, i, i2, iVar);
    }

    /* renamed from: e */
    public boolean mo9094b(Integer num) {
        return true;
    }
}
