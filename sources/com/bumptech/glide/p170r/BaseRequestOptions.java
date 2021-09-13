package com.bumptech.glide.p170r;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.p152n.DiskCacheStrategy;
import com.bumptech.glide.load.p158p.p159d.CenterCrop;
import com.bumptech.glide.load.p158p.p159d.CenterInside;
import com.bumptech.glide.load.p158p.p159d.CircleCrop;
import com.bumptech.glide.load.p158p.p159d.DownsampleStrategy;
import com.bumptech.glide.load.p158p.p159d.DrawableTransformation;
import com.bumptech.glide.load.p158p.p159d.FitCenter;
import com.bumptech.glide.load.p158p.p163h.GifDrawable;
import com.bumptech.glide.load.p158p.p163h.GifDrawableTransformation;
import com.bumptech.glide.p170r.BaseRequestOptions;
import com.bumptech.glide.p173s.EmptySignature;
import com.bumptech.glide.p174t.C1638j;
import com.bumptech.glide.p174t.C1639k;
import com.bumptech.glide.p174t.CachedHashCodeArrayMap;
import com.p259uc.crashsdk.export.LogType;
import java.util.Map;

/* renamed from: com.bumptech.glide.r.a */
public abstract class BaseRequestOptions<T extends BaseRequestOptions<T>> implements Cloneable {

    /* renamed from: a */
    private int f11129a;

    /* renamed from: b */
    private float f11130b = 1.0f;

    /* renamed from: c */
    private DiskCacheStrategy f11131c = DiskCacheStrategy.f10559e;

    /* renamed from: d */
    private Priority f11132d = Priority.NORMAL;

    /* renamed from: e */
    private Drawable f11133e;

    /* renamed from: f */
    private int f11134f;

    /* renamed from: g */
    private Drawable f11135g;

    /* renamed from: h */
    private int f11136h;

    /* renamed from: i */
    private boolean f11137i = true;

    /* renamed from: j */
    private int f11138j = -1;

    /* renamed from: k */
    private int f11139k = -1;

    /* renamed from: l */
    private Key f11140l = EmptySignature.m14044c();

    /* renamed from: m */
    private boolean f11141m;

    /* renamed from: n */
    private boolean f11142n = true;

    /* renamed from: o */
    private Drawable f11143o;

    /* renamed from: p */
    private int f11144p;

    /* renamed from: q */
    private Options f11145q = new Options();

    /* renamed from: r */
    private Map<Class<?>, Transformation<?>> f11146r = new CachedHashCodeArrayMap();

    /* renamed from: s */
    private Class<?> f11147s = Object.class;

    /* renamed from: t */
    private boolean f11148t;

    /* renamed from: u */
    private Theme f11149u;

    /* renamed from: v */
    private boolean f11150v;

    /* renamed from: w */
    private boolean f11151w;

    /* renamed from: x */
    private boolean f11152x;

    /* renamed from: y */
    private boolean f11153y = true;

    /* renamed from: z */
    private boolean f11154z;

    /* renamed from: F */
    private boolean m13838F(int i) {
        return m13839G(this.f11129a, i);
    }

    /* renamed from: G */
    private static boolean m13839G(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: P */
    private T m13840P(DownsampleStrategy mVar, Transformation<Bitmap> mVar2) {
        return m13841Y(mVar, mVar2, false);
    }

    /* renamed from: Y */
    private T m13841Y(DownsampleStrategy mVar, Transformation<Bitmap> mVar2, boolean z) {
        T t;
        if (z) {
            t = mo9477h0(mVar, mVar2);
        } else {
            t = mo9459Q(mVar, mVar2);
        }
        t.f11153y = true;
        return t;
    }

    /* renamed from: Z */
    private T m13842Z() {
        return this;
    }

    /* renamed from: A */
    public final boolean mo9446A() {
        return this.f11151w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final boolean mo9447B() {
        return this.f11150v;
    }

    /* renamed from: C */
    public final boolean mo9448C() {
        return this.f11137i;
    }

    /* renamed from: D */
    public final boolean mo9449D() {
        return m13838F(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public boolean mo9450E() {
        return this.f11153y;
    }

    /* renamed from: H */
    public final boolean mo9451H() {
        return this.f11142n;
    }

    /* renamed from: I */
    public final boolean mo9452I() {
        return this.f11141m;
    }

    /* renamed from: J */
    public final boolean mo9453J() {
        return m13838F(2048);
    }

    /* renamed from: K */
    public final boolean mo9454K() {
        return C1639k.m14102t(this.f11139k, this.f11138j);
    }

    /* renamed from: L */
    public T mo9455L() {
        this.f11148t = true;
        return m13842Z();
    }

    /* renamed from: M */
    public T mo9456M() {
        return mo9459Q(DownsampleStrategy.f10859e, new CenterCrop());
    }

    /* renamed from: N */
    public T mo9457N() {
        return m13840P(DownsampleStrategy.f10858d, new CenterInside());
    }

    /* renamed from: O */
    public T mo9458O() {
        return m13840P(DownsampleStrategy.f10857c, new FitCenter());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public final T mo9459Q(DownsampleStrategy mVar, Transformation<Bitmap> mVar2) {
        if (this.f11150v) {
            return clone().mo9459Q(mVar, mVar2);
        }
        mo9474g(mVar);
        return mo9475g0(mVar2, false);
    }

    /* renamed from: R */
    public T mo9460R(int i, int i2) {
        if (this.f11150v) {
            return clone().mo9460R(i, i2);
        }
        this.f11139k = i;
        this.f11138j = i2;
        this.f11129a |= 512;
        return mo9463a0();
    }

    /* renamed from: W */
    public T mo9461W(int i) {
        if (this.f11150v) {
            return clone().mo9461W(i);
        }
        this.f11136h = i;
        int i2 = this.f11129a | 128;
        this.f11129a = i2;
        this.f11135g = null;
        this.f11129a = i2 & -65;
        return mo9463a0();
    }

    /* renamed from: X */
    public T mo9462X(Priority gVar) {
        if (this.f11150v) {
            return clone().mo9462X(gVar);
        }
        this.f11132d = (Priority) C1638j.m14081d(gVar);
        this.f11129a |= 8;
        return mo9463a0();
    }

    /* renamed from: a */
    public T mo8730a(BaseRequestOptions<?> aVar) {
        if (this.f11150v) {
            return clone().mo8730a(aVar);
        }
        if (m13839G(aVar.f11129a, 2)) {
            this.f11130b = aVar.f11130b;
        }
        if (m13839G(aVar.f11129a, 262144)) {
            this.f11151w = aVar.f11151w;
        }
        if (m13839G(aVar.f11129a, LogType.ANR)) {
            this.f11154z = aVar.f11154z;
        }
        if (m13839G(aVar.f11129a, 4)) {
            this.f11131c = aVar.f11131c;
        }
        if (m13839G(aVar.f11129a, 8)) {
            this.f11132d = aVar.f11132d;
        }
        if (m13839G(aVar.f11129a, 16)) {
            this.f11133e = aVar.f11133e;
            this.f11134f = 0;
            this.f11129a &= -33;
        }
        if (m13839G(aVar.f11129a, 32)) {
            this.f11134f = aVar.f11134f;
            this.f11133e = null;
            this.f11129a &= -17;
        }
        if (m13839G(aVar.f11129a, 64)) {
            this.f11135g = aVar.f11135g;
            this.f11136h = 0;
            this.f11129a &= -129;
        }
        if (m13839G(aVar.f11129a, 128)) {
            this.f11136h = aVar.f11136h;
            this.f11135g = null;
            this.f11129a &= -65;
        }
        if (m13839G(aVar.f11129a, LogType.UNEXP)) {
            this.f11137i = aVar.f11137i;
        }
        if (m13839G(aVar.f11129a, 512)) {
            this.f11139k = aVar.f11139k;
            this.f11138j = aVar.f11138j;
        }
        if (m13839G(aVar.f11129a, 1024)) {
            this.f11140l = aVar.f11140l;
        }
        if (m13839G(aVar.f11129a, 4096)) {
            this.f11147s = aVar.f11147s;
        }
        if (m13839G(aVar.f11129a, 8192)) {
            this.f11143o = aVar.f11143o;
            this.f11144p = 0;
            this.f11129a &= -16385;
        }
        if (m13839G(aVar.f11129a, 16384)) {
            this.f11144p = aVar.f11144p;
            this.f11143o = null;
            this.f11129a &= -8193;
        }
        if (m13839G(aVar.f11129a, 32768)) {
            this.f11149u = aVar.f11149u;
        }
        if (m13839G(aVar.f11129a, 65536)) {
            this.f11142n = aVar.f11142n;
        }
        if (m13839G(aVar.f11129a, 131072)) {
            this.f11141m = aVar.f11141m;
        }
        if (m13839G(aVar.f11129a, 2048)) {
            this.f11146r.putAll(aVar.f11146r);
            this.f11153y = aVar.f11153y;
        }
        if (m13839G(aVar.f11129a, 524288)) {
            this.f11152x = aVar.f11152x;
        }
        if (!this.f11142n) {
            this.f11146r.clear();
            int i = this.f11129a & -2049;
            this.f11129a = i;
            this.f11141m = false;
            this.f11129a = i & -131073;
            this.f11153y = true;
        }
        this.f11129a |= aVar.f11129a;
        this.f11145q.mo8836d(aVar.f11145q);
        return mo9463a0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public final T mo9463a0() {
        if (!this.f11148t) {
            return m13842Z();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: b */
    public T mo9464b() {
        if (!this.f11148t || this.f11150v) {
            this.f11150v = true;
            return mo9455L();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: b0 */
    public <Y> T mo9465b0(Option<Y> hVar, Y y) {
        if (this.f11150v) {
            return clone().mo9465b0(hVar, y);
        }
        C1638j.m14081d(hVar);
        C1638j.m14081d(y);
        this.f11145q.mo8837e(hVar, y);
        return mo9463a0();
    }

    /* renamed from: c */
    public T mo9466c() {
        return mo9477h0(DownsampleStrategy.f10858d, new CircleCrop());
    }

    /* renamed from: c0 */
    public T mo9467c0(Key gVar) {
        if (this.f11150v) {
            return clone().mo9467c0(gVar);
        }
        this.f11140l = (Key) C1638j.m14081d(gVar);
        this.f11129a |= 1024;
        return mo9463a0();
    }

    /* renamed from: d */
    public T clone() {
        try {
            T t = (BaseRequestOptions) super.clone();
            Options iVar = new Options();
            t.f11145q = iVar;
            iVar.mo8836d(this.f11145q);
            CachedHashCodeArrayMap bVar = new CachedHashCodeArrayMap();
            t.f11146r = bVar;
            bVar.putAll(this.f11146r);
            t.f11148t = false;
            t.f11150v = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d0 */
    public T mo9468d0(float f) {
        if (this.f11150v) {
            return clone().mo9468d0(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f11130b = f;
        this.f11129a |= 2;
        return mo9463a0();
    }

    /* renamed from: e */
    public T mo9469e(Class<?> cls) {
        if (this.f11150v) {
            return clone().mo9469e(cls);
        }
        this.f11147s = (Class) C1638j.m14081d(cls);
        this.f11129a |= 4096;
        return mo9463a0();
    }

    /* renamed from: e0 */
    public T mo9470e0(boolean z) {
        if (this.f11150v) {
            return clone().mo9470e0(true);
        }
        this.f11137i = !z;
        this.f11129a |= LogType.UNEXP;
        return mo9463a0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BaseRequestOptions)) {
            return false;
        }
        BaseRequestOptions aVar = (BaseRequestOptions) obj;
        if (Float.compare(aVar.f11130b, this.f11130b) == 0 && this.f11134f == aVar.f11134f && C1639k.m14085c(this.f11133e, aVar.f11133e) && this.f11136h == aVar.f11136h && C1639k.m14085c(this.f11135g, aVar.f11135g) && this.f11144p == aVar.f11144p && C1639k.m14085c(this.f11143o, aVar.f11143o) && this.f11137i == aVar.f11137i && this.f11138j == aVar.f11138j && this.f11139k == aVar.f11139k && this.f11141m == aVar.f11141m && this.f11142n == aVar.f11142n && this.f11151w == aVar.f11151w && this.f11152x == aVar.f11152x && this.f11131c.equals(aVar.f11131c) && this.f11132d == aVar.f11132d && this.f11145q.equals(aVar.f11145q) && this.f11146r.equals(aVar.f11146r) && this.f11147s.equals(aVar.f11147s) && C1639k.m14085c(this.f11140l, aVar.f11140l) && C1639k.m14085c(this.f11149u, aVar.f11149u)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public T mo9472f(DiskCacheStrategy jVar) {
        if (this.f11150v) {
            return clone().mo9472f(jVar);
        }
        this.f11131c = (DiskCacheStrategy) C1638j.m14081d(jVar);
        this.f11129a |= 4;
        return mo9463a0();
    }

    /* renamed from: f0 */
    public T mo9473f0(Transformation<Bitmap> mVar) {
        return mo9475g0(mVar, true);
    }

    /* renamed from: g */
    public T mo9474g(DownsampleStrategy mVar) {
        return mo9465b0(DownsampleStrategy.f10862h, C1638j.m14081d(mVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g0 */
    public T mo9475g0(Transformation<Bitmap> mVar, boolean z) {
        if (this.f11150v) {
            return clone().mo9475g0(mVar, z);
        }
        DrawableTransformation pVar = new DrawableTransformation(mVar, z);
        mo9480i0(Bitmap.class, mVar, z);
        mo9480i0(Drawable.class, pVar, z);
        mo9480i0(BitmapDrawable.class, pVar.mo9231c(), z);
        mo9480i0(GifDrawable.class, new GifDrawableTransformation(mVar), z);
        return mo9463a0();
    }

    /* renamed from: h */
    public T mo9476h(int i) {
        if (this.f11150v) {
            return clone().mo9476h(i);
        }
        this.f11134f = i;
        int i2 = this.f11129a | 32;
        this.f11129a = i2;
        this.f11133e = null;
        this.f11129a = i2 & -17;
        return mo9463a0();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h0 */
    public final T mo9477h0(DownsampleStrategy mVar, Transformation<Bitmap> mVar2) {
        if (this.f11150v) {
            return clone().mo9477h0(mVar, mVar2);
        }
        mo9474g(mVar);
        return mo9473f0(mVar2);
    }

    public int hashCode() {
        return C1639k.m14097o(this.f11149u, C1639k.m14097o(this.f11140l, C1639k.m14097o(this.f11147s, C1639k.m14097o(this.f11146r, C1639k.m14097o(this.f11145q, C1639k.m14097o(this.f11132d, C1639k.m14097o(this.f11131c, C1639k.m14098p(this.f11152x, C1639k.m14098p(this.f11151w, C1639k.m14098p(this.f11142n, C1639k.m14098p(this.f11141m, C1639k.m14096n(this.f11139k, C1639k.m14096n(this.f11138j, C1639k.m14098p(this.f11137i, C1639k.m14097o(this.f11143o, C1639k.m14096n(this.f11144p, C1639k.m14097o(this.f11135g, C1639k.m14096n(this.f11136h, C1639k.m14097o(this.f11133e, C1639k.m14096n(this.f11134f, C1639k.m14093k(this.f11130b)))))))))))))))))))));
    }

    /* renamed from: i */
    public final DiskCacheStrategy mo9479i() {
        return this.f11131c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i0 */
    public <Y> T mo9480i0(Class<Y> cls, Transformation<Y> mVar, boolean z) {
        if (this.f11150v) {
            return clone().mo9480i0(cls, mVar, z);
        }
        C1638j.m14081d(cls);
        C1638j.m14081d(mVar);
        this.f11146r.put(cls, mVar);
        int i = this.f11129a | 2048;
        this.f11129a = i;
        this.f11142n = true;
        int i2 = i | 65536;
        this.f11129a = i2;
        this.f11153y = false;
        if (z) {
            this.f11129a = i2 | 131072;
            this.f11141m = true;
        }
        return mo9463a0();
    }

    /* renamed from: j */
    public final int mo9481j() {
        return this.f11134f;
    }

    /* renamed from: j0 */
    public T mo9482j0(boolean z) {
        if (this.f11150v) {
            return clone().mo9482j0(z);
        }
        this.f11154z = z;
        this.f11129a |= LogType.ANR;
        return mo9463a0();
    }

    /* renamed from: k */
    public final Drawable mo9483k() {
        return this.f11133e;
    }

    /* renamed from: l */
    public final Drawable mo9484l() {
        return this.f11143o;
    }

    /* renamed from: m */
    public final int mo9485m() {
        return this.f11144p;
    }

    /* renamed from: n */
    public final boolean mo9486n() {
        return this.f11152x;
    }

    /* renamed from: o */
    public final Options mo9487o() {
        return this.f11145q;
    }

    /* renamed from: p */
    public final int mo9488p() {
        return this.f11138j;
    }

    /* renamed from: q */
    public final int mo9489q() {
        return this.f11139k;
    }

    /* renamed from: r */
    public final Drawable mo9490r() {
        return this.f11135g;
    }

    /* renamed from: s */
    public final int mo9491s() {
        return this.f11136h;
    }

    /* renamed from: t */
    public final Priority mo9492t() {
        return this.f11132d;
    }

    /* renamed from: u */
    public final Class<?> mo9493u() {
        return this.f11147s;
    }

    /* renamed from: v */
    public final Key mo9494v() {
        return this.f11140l;
    }

    /* renamed from: w */
    public final float mo9495w() {
        return this.f11130b;
    }

    /* renamed from: x */
    public final Theme mo9496x() {
        return this.f11149u;
    }

    /* renamed from: y */
    public final Map<Class<?>, Transformation<?>> mo9497y() {
        return this.f11146r;
    }

    /* renamed from: z */
    public final boolean mo9498z() {
        return this.f11154z;
    }
}
