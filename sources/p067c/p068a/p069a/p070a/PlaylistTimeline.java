package p067c.p068a.p069a.p070a;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p067c.p068a.p069a.p070a.p097j2.ShuffleOrder;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.n1 */
final class PlaylistTimeline extends AbstractConcatenatedTimeline {

    /* renamed from: e */
    private final int f8473e;

    /* renamed from: f */
    private final int f8474f;

    /* renamed from: g */
    private final int[] f8475g;

    /* renamed from: h */
    private final int[] f8476h;

    /* renamed from: i */
    private final Timeline[] f8477i;

    /* renamed from: j */
    private final Object[] f8478j;

    /* renamed from: k */
    private final HashMap<Object, Integer> f8479k = new HashMap<>();

    public PlaylistTimeline(Collection<? extends MediaSourceInfoHolder> collection, ShuffleOrder n0Var) {
        int i = 0;
        super(false, n0Var);
        int size = collection.size();
        this.f8475g = new int[size];
        this.f8476h = new int[size];
        this.f8477i = new Timeline[size];
        this.f8478j = new Object[size];
        int i2 = 0;
        int i3 = 0;
        for (MediaSourceInfoHolder e1Var : collection) {
            this.f8477i[i3] = e1Var.mo6027b();
            this.f8476h[i3] = i;
            this.f8475g[i3] = i2;
            i += this.f8477i[i3].mo6973p();
            i2 += this.f8477i[i3].mo6972i();
            this.f8478j[i3] = e1Var.mo6026a();
            int i4 = i3 + 1;
            this.f8479k.put(this.f8478j[i3], Integer.valueOf(i3));
            i3 = i4;
        }
        this.f8473e = i;
        this.f8474f = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int mo5984A(int i) {
        return this.f8476h[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public Timeline mo5985D(int i) {
        return this.f8477i[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public List<Timeline> mo7514E() {
        return Arrays.asList(this.f8477i);
    }

    /* renamed from: i */
    public int mo6972i() {
        return this.f8474f;
    }

    /* renamed from: p */
    public int mo6973p() {
        return this.f8473e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public int mo5995s(Object obj) {
        Integer num = (Integer) this.f8479k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public int mo5996t(int i) {
        return Util.m10289g(this.f8475g, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public int mo5997u(int i) {
        return Util.m10289g(this.f8476h, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Object mo5998x(int i) {
        return this.f8478j[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo5999z(int i) {
        return this.f8475g[i];
    }
}
