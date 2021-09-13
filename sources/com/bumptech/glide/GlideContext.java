package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.Glide.C1405a;
import com.bumptech.glide.load.p152n.Engine;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import com.bumptech.glide.p170r.RequestListener;
import com.bumptech.glide.p170r.RequestOptions;
import com.bumptech.glide.p170r.p171j.ImageViewTargetFactory;
import com.bumptech.glide.p170r.p171j.ViewTarget;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.d */
public class GlideContext extends ContextWrapper {

    /* renamed from: a */
    static final TransitionOptions<?, ?> f10208a = new GenericTransitionOptions();

    /* renamed from: b */
    private final ArrayPool f10209b;

    /* renamed from: c */
    private final Registry f10210c;

    /* renamed from: d */
    private final ImageViewTargetFactory f10211d;

    /* renamed from: e */
    private final C1405a f10212e;

    /* renamed from: f */
    private final List<RequestListener<Object>> f10213f;

    /* renamed from: g */
    private final Map<Class<?>, TransitionOptions<?, ?>> f10214g;

    /* renamed from: h */
    private final Engine f10215h;

    /* renamed from: i */
    private final GlideExperiments f10216i;

    /* renamed from: j */
    private final int f10217j;

    /* renamed from: k */
    private RequestOptions f10218k;

    public GlideContext(Context context, ArrayPool bVar, Registry iVar, ImageViewTargetFactory fVar, C1405a aVar, Map<Class<?>, TransitionOptions<?, ?>> map, List<RequestListener<Object>> list, Engine kVar, GlideExperiments eVar, int i) {
        super(context.getApplicationContext());
        this.f10209b = bVar;
        this.f10210c = iVar;
        this.f10211d = fVar;
        this.f10212e = aVar;
        this.f10213f = list;
        this.f10214g = map;
        this.f10215h = kVar;
        this.f10216i = eVar;
        this.f10217j = i;
    }

    /* renamed from: a */
    public <X> ViewTarget<ImageView, X> mo8702a(ImageView imageView, Class<X> cls) {
        return this.f10211d.mo9532a(imageView, cls);
    }

    /* renamed from: b */
    public ArrayPool mo8703b() {
        return this.f10209b;
    }

    /* renamed from: c */
    public List<RequestListener<Object>> mo8704c() {
        return this.f10213f;
    }

    /* renamed from: d */
    public synchronized RequestOptions mo8705d() {
        if (this.f10218k == null) {
            this.f10218k = (RequestOptions) this.f10212e.mo8699a().mo9455L();
        }
        return this.f10218k;
    }

    /* renamed from: e */
    public <T> TransitionOptions<?, T> mo8706e(Class<T> cls) {
        TransitionOptions<?, T> lVar = (TransitionOptions) this.f10214g.get(cls);
        if (lVar == null) {
            for (Entry entry : this.f10214g.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (TransitionOptions) entry.getValue();
                }
            }
        }
        return lVar == null ? f10208a : lVar;
    }

    /* renamed from: f */
    public Engine mo8707f() {
        return this.f10215h;
    }

    /* renamed from: g */
    public GlideExperiments mo8708g() {
        return this.f10216i;
    }

    /* renamed from: h */
    public int mo8709h() {
        return this.f10217j;
    }

    /* renamed from: i */
    public Registry mo8710i() {
        return this.f10210c;
    }
}
