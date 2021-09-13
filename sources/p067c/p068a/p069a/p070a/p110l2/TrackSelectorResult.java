package p067c.p068a.p069a.p070a.p110l2;

import p067c.p068a.p069a.p070a.RendererConfiguration;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.l2.o */
public final class TrackSelectorResult {

    /* renamed from: a */
    public final int f8303a;

    /* renamed from: b */
    public final RendererConfiguration[] f8304b;

    /* renamed from: c */
    public final C1174h[] f8305c;

    /* renamed from: d */
    public final Object f8306d;

    public TrackSelectorResult(RendererConfiguration[] s1VarArr, C1174h[] hVarArr, Object obj) {
        this.f8304b = s1VarArr;
        this.f8305c = (C1174h[]) hVarArr.clone();
        this.f8306d = obj;
        this.f8303a = s1VarArr.length;
    }

    /* renamed from: a */
    public boolean mo7330a(TrackSelectorResult oVar) {
        if (oVar == null || oVar.f8305c.length != this.f8305c.length) {
            return false;
        }
        for (int i = 0; i < this.f8305c.length; i++) {
            if (!mo7331b(oVar, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo7331b(TrackSelectorResult oVar, int i) {
        boolean z = false;
        if (oVar == null) {
            return false;
        }
        if (Util.m10279b(this.f8304b[i], oVar.f8304b[i]) && Util.m10279b(this.f8305c[i], oVar.f8305c[i])) {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo7332c(int i) {
        return this.f8304b[i] != null;
    }
}
