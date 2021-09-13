package com.bumptech.glide.load.p152n;

import android.util.Log;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.p158p.p164i.ResourceTranscoder;
import com.bumptech.glide.p174t.C1638j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p010b.p034g.p042j.C0610e;

/* renamed from: com.bumptech.glide.load.n.i */
public class DecodePath<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f10550a;

    /* renamed from: b */
    private final List<? extends ResourceDecoder<DataType, ResourceType>> f10551b;

    /* renamed from: c */
    private final ResourceTranscoder<ResourceType, Transcode> f10552c;

    /* renamed from: d */
    private final C0610e<List<Throwable>> f10553d;

    /* renamed from: e */
    private final String f10554e;

    /* renamed from: com.bumptech.glide.load.n.i$a */
    /* compiled from: DecodePath */
    interface C1484a<ResourceType> {
        /* renamed from: a */
        Resource<ResourceType> mo9003a(Resource<ResourceType> vVar);
    }

    public DecodePath(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends ResourceDecoder<DataType, ResourceType>> list, ResourceTranscoder<ResourceType, Transcode> eVar, C0610e<List<Throwable>> eVar2) {
        this.f10550a = cls;
        this.f10551b = list;
        this.f10552c = eVar;
        this.f10553d = eVar2;
        StringBuilder sb = new StringBuilder();
        sb.append("Failed DecodePath{");
        sb.append(cls.getSimpleName());
        String str = "->";
        sb.append(str);
        sb.append(cls2.getSimpleName());
        sb.append(str);
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.f10554e = sb.toString();
    }

    /* renamed from: b */
    private Resource<ResourceType> m12889b(DataRewinder<DataType> eVar, int i, int i2, Options iVar) throws GlideException {
        List list = (List) C1638j.m14081d(this.f10553d.mo4946b());
        try {
            Resource<ResourceType> c = m12890c(eVar, i, i2, iVar, list);
            return c;
        } finally {
            this.f10553d.mo4945a(list);
        }
    }

    /* renamed from: c */
    private Resource<ResourceType> m12890c(DataRewinder<DataType> eVar, int i, int i2, Options iVar, List<Throwable> list) throws GlideException {
        int size = this.f10551b.size();
        Resource<ResourceType> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            ResourceDecoder kVar = (ResourceDecoder) this.f10551b.get(i3);
            try {
                if (kVar.mo8840b(eVar.mo8773a(), iVar)) {
                    vVar = kVar.mo8839a(eVar.mo8773a(), i, i2, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                String str = "DecodePath";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(kVar);
                    Log.v(str, sb.toString(), e);
                }
                list.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new GlideException(this.f10554e, (List<Throwable>) new ArrayList<Throwable>(list));
    }

    /* renamed from: a */
    public Resource<Transcode> mo9013a(DataRewinder<DataType> eVar, int i, int i2, Options iVar, C1484a<ResourceType> aVar) throws GlideException {
        return this.f10552c.mo9323a(aVar.mo9003a(m12889b(eVar, i, i2, iVar)), iVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecodePath{ dataClass=");
        sb.append(this.f10550a);
        sb.append(", decoders=");
        sb.append(this.f10551b);
        sb.append(", transcoder=");
        sb.append(this.f10552c);
        sb.append('}');
        return sb.toString();
    }
}
