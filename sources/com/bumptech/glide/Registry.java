package com.bumptech.glide;

import com.bumptech.glide.load.C1420d;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinder.C1423a;
import com.bumptech.glide.load.data.DataRewinderRegistry;
import com.bumptech.glide.load.p152n.DecodePath;
import com.bumptech.glide.load.p152n.LoadPath;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p156o.ModelLoader;
import com.bumptech.glide.load.p156o.ModelLoaderFactory;
import com.bumptech.glide.load.p156o.ModelLoaderRegistry;
import com.bumptech.glide.load.p158p.p164i.ResourceTranscoder;
import com.bumptech.glide.load.p158p.p164i.TranscoderRegistry;
import com.bumptech.glide.p169q.EncoderRegistry;
import com.bumptech.glide.p169q.ImageHeaderParserRegistry;
import com.bumptech.glide.p169q.LoadPathCache;
import com.bumptech.glide.p169q.ModelToResourceClassCache;
import com.bumptech.glide.p169q.ResourceDecoderRegistry;
import com.bumptech.glide.p169q.ResourceEncoderRegistry;
import com.bumptech.glide.p174t.p175l.FactoryPools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p010b.p034g.p042j.C0610e;

/* renamed from: com.bumptech.glide.i */
public class Registry {

    /* renamed from: a */
    private final ModelLoaderRegistry f10231a;

    /* renamed from: b */
    private final EncoderRegistry f10232b;

    /* renamed from: c */
    private final ResourceDecoderRegistry f10233c;

    /* renamed from: d */
    private final ResourceEncoderRegistry f10234d;

    /* renamed from: e */
    private final DataRewinderRegistry f10235e;

    /* renamed from: f */
    private final TranscoderRegistry f10236f;

    /* renamed from: g */
    private final ImageHeaderParserRegistry f10237g;

    /* renamed from: h */
    private final ModelToResourceClassCache f10238h = new ModelToResourceClassCache();

    /* renamed from: i */
    private final LoadPathCache f10239i = new LoadPathCache();

    /* renamed from: j */
    private final C0610e<List<Throwable>> f10240j;

    /* renamed from: com.bumptech.glide.i$a */
    /* compiled from: Registry */
    public static class C1412a extends RuntimeException {
        public C1412a(String str) {
            super(str);
        }
    }

    /* renamed from: com.bumptech.glide.i$b */
    /* compiled from: Registry */
    public static final class C1413b extends C1412a {
        public C1413b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: com.bumptech.glide.i$c */
    /* compiled from: Registry */
    public static class C1414c extends C1412a {
        public C1414c(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any ModelLoaders registered for model class: ");
            sb.append(obj.getClass());
            super(sb.toString());
        }

        public <M> C1414c(M m, List<ModelLoader<M, ?>> list) {
            StringBuilder sb = new StringBuilder();
            sb.append("Found ModelLoaders for model class: ");
            sb.append(list);
            sb.append(", but none that handle this specific model instance: ");
            sb.append(m);
            super(sb.toString());
        }

        public C1414c(Class<?> cls, Class<?> cls2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any ModelLoaders for model: ");
            sb.append(cls);
            sb.append(" and data: ");
            sb.append(cls2);
            super(sb.toString());
        }
    }

    /* renamed from: com.bumptech.glide.i$d */
    /* compiled from: Registry */
    public static class C1415d extends C1412a {
        public C1415d(Class<?> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find result encoder for resource class: ");
            sb.append(cls);
            sb.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
            super(sb.toString());
        }
    }

    /* renamed from: com.bumptech.glide.i$e */
    /* compiled from: Registry */
    public static class C1416e extends C1412a {
        public C1416e(Class<?> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find source encoder for data class: ");
            sb.append(cls);
            super(sb.toString());
        }
    }

    public Registry() {
        C0610e<List<Throwable>> e = FactoryPools.m14110e();
        this.f10240j = e;
        this.f10231a = new ModelLoaderRegistry(e);
        this.f10232b = new EncoderRegistry();
        this.f10233c = new ResourceDecoderRegistry();
        this.f10234d = new ResourceEncoderRegistry();
        this.f10235e = new DataRewinderRegistry();
        this.f10236f = new TranscoderRegistry();
        this.f10237g = new ImageHeaderParserRegistry();
        mo8729r(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    /* renamed from: f */
    private <Data, TResource, Transcode> List<DecodePath<Data, TResource, Transcode>> m12420f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f10233c.mo9440d(cls, cls2)) {
            for (Class cls5 : this.f10236f.mo9325b(cls4, cls3)) {
                DecodePath iVar = new DecodePath(cls, cls4, cls5, this.f10233c.mo9439b(cls, cls4), this.f10236f.mo9324a(cls4, cls5), this.f10240j);
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Data> Registry mo8713a(Class<Data> cls, C1420d<Data> dVar) {
        this.f10232b.mo9428a(cls, dVar);
        return this;
    }

    /* renamed from: b */
    public <TResource> Registry mo8714b(Class<TResource> cls, ResourceEncoder<TResource> lVar) {
        this.f10234d.mo9443a(cls, lVar);
        return this;
    }

    /* renamed from: c */
    public <Data, TResource> Registry mo8715c(Class<Data> cls, Class<TResource> cls2, ResourceDecoder<Data, TResource> kVar) {
        mo8717e("legacy_append", cls, cls2, kVar);
        return this;
    }

    /* renamed from: d */
    public <Model, Data> Registry mo8716d(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<Model, Data> oVar) {
        this.f10231a.mo9144a(cls, cls2, oVar);
        return this;
    }

    /* renamed from: e */
    public <Data, TResource> Registry mo8717e(String str, Class<Data> cls, Class<TResource> cls2, ResourceDecoder<Data, TResource> kVar) {
        this.f10233c.mo9438a(str, kVar, cls, cls2);
        return this;
    }

    /* renamed from: g */
    public List<ImageHeaderParser> mo8718g() {
        List<ImageHeaderParser> b = this.f10237g.mo9432b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new C1413b();
    }

    /* renamed from: h */
    public <Data, TResource, Transcode> LoadPath<Data, TResource, Transcode> mo8719h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        LoadPath<Data, TResource, Transcode> a = this.f10239i.mo9433a(cls, cls2, cls3);
        if (this.f10239i.mo9434c(a)) {
            return null;
        }
        if (a == null) {
            List f = m12420f(cls, cls2, cls3);
            if (f.isEmpty()) {
                a = null;
            } else {
                a = new LoadPath<>(cls, cls2, cls3, f, this.f10240j);
            }
            this.f10239i.mo9435d(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: i */
    public <Model> List<ModelLoader<Model, ?>> mo8720i(Model model) {
        return this.f10231a.mo9146d(model);
    }

    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> mo8721j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f10238h.mo9436a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class d : this.f10231a.mo9145c(cls)) {
                for (Class cls4 : this.f10233c.mo9440d(d, cls2)) {
                    if (!this.f10236f.mo9325b(cls4, cls3).isEmpty() && !a.contains(cls4)) {
                        a.add(cls4);
                    }
                }
            }
            this.f10238h.mo9437b(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: k */
    public <X> ResourceEncoder<X> mo8722k(Resource<X> vVar) throws C1415d {
        ResourceEncoder<X> b = this.f10234d.mo9444b(vVar.mo9060e());
        if (b != null) {
            return b;
        }
        throw new C1415d(vVar.mo9060e());
    }

    /* renamed from: l */
    public <X> DataRewinder<X> mo8723l(X x) {
        return this.f10235e.mo8798a(x);
    }

    /* renamed from: m */
    public <X> C1420d<X> mo8724m(X x) throws C1416e {
        C1420d<X> b = this.f10232b.mo9429b(x.getClass());
        if (b != null) {
            return b;
        }
        throw new C1416e(x.getClass());
    }

    /* renamed from: n */
    public boolean mo8725n(Resource<?> vVar) {
        return this.f10234d.mo9444b(vVar.mo9060e()) != null;
    }

    /* renamed from: o */
    public Registry mo8726o(ImageHeaderParser imageHeaderParser) {
        this.f10237g.mo9431a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public Registry mo8727p(C1423a<?> aVar) {
        this.f10235e.mo8799b(aVar);
        return this;
    }

    /* renamed from: q */
    public <TResource, Transcode> Registry mo8728q(Class<TResource> cls, Class<Transcode> cls2, ResourceTranscoder<TResource, Transcode> eVar) {
        this.f10236f.mo9326c(cls, cls2, eVar);
        return this;
    }

    /* renamed from: r */
    public final Registry mo8729r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        for (String add : list) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        this.f10233c.mo9441e(arrayList);
        return this;
    }
}
