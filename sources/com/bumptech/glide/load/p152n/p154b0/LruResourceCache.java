package com.bumptech.glide.load.p152n.p154b0;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p152n.p154b0.MemoryCache.C1461a;
import com.bumptech.glide.p174t.C1636g;

/* renamed from: com.bumptech.glide.load.n.b0.g */
public class LruResourceCache extends C1636g<Key, Resource<?>> implements MemoryCache {

    /* renamed from: e */
    private C1461a f10425e;

    public LruResourceCache(long j) {
        super(j);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo8921a(int i) {
        if (i >= 40) {
            mo9568b();
        } else if (i >= 20 || i == 15) {
            mo9573m(mo9570h() / 2);
        }
    }

    /* renamed from: c */
    public void mo8922c(C1461a aVar) {
        this.f10425e = aVar;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Resource mo8923d(Key gVar, Resource vVar) {
        return (Resource) super.mo9571k(gVar, vVar);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ Resource mo8924e(Key gVar) {
        return (Resource) super.mo9572l(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo8925i(Resource<?> vVar) {
        if (vVar == null) {
            return super.mo8925i(null);
        }
        return vVar.mo9058c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo8926j(Key gVar, Resource<?> vVar) {
        C1461a aVar = this.f10425e;
        if (aVar != null && vVar != null) {
            aVar.mo8930a(vVar);
        }
    }
}
