package com.bumptech.glide.load.p152n;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.p174t.C1638j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p010b.p034g.p042j.C0610e;

/* renamed from: com.bumptech.glide.load.n.t */
public class LoadPath<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<Data> f10646a;

    /* renamed from: b */
    private final C0610e<List<Throwable>> f10647b;

    /* renamed from: c */
    private final List<? extends DecodePath<Data, ResourceType, Transcode>> f10648c;

    /* renamed from: d */
    private final String f10649d;

    public LoadPath(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<DecodePath<Data, ResourceType, Transcode>> list, C0610e<List<Throwable>> eVar) {
        this.f10646a = cls;
        this.f10647b = eVar;
        this.f10648c = (List) C1638j.m14080c(list);
        StringBuilder sb = new StringBuilder();
        sb.append("Failed LoadPath{");
        sb.append(cls.getSimpleName());
        String str = "->";
        sb.append(str);
        sb.append(cls2.getSimpleName());
        sb.append(str);
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.f10649d = sb.toString();
    }

    /* renamed from: b */
    private Resource<Transcode> m12992b(DataRewinder<Data> eVar, Options iVar, int i, int i2, C1484a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        List<Throwable> list2 = list;
        int size = this.f10648c.size();
        Resource<Transcode> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                vVar = ((DecodePath) this.f10648c.get(i3)).mo9013a(eVar, i, i2, iVar, aVar);
            } catch (GlideException e) {
                list2.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new GlideException(this.f10649d, (List<Throwable>) new ArrayList<Throwable>(list2));
    }

    /* renamed from: a */
    public Resource<Transcode> mo9083a(DataRewinder<Data> eVar, Options iVar, int i, int i2, C1484a<ResourceType> aVar) throws GlideException {
        List list = (List) C1638j.m14081d(this.f10647b.mo4946b());
        try {
            Resource<Transcode> b = m12992b(eVar, iVar, i, i2, aVar, list);
            return b;
        } finally {
            this.f10647b.mo4945a(list);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadPath{decodePaths=");
        sb.append(Arrays.toString(this.f10648c.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
