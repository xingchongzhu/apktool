package com.bumptech.glide.load.p152n.p153a0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.n.a0.k */
public class LruBitmapPool implements BitmapPool {

    /* renamed from: a */
    private static final Config f10388a = Config.ARGB_8888;

    /* renamed from: b */
    private final LruPoolStrategy f10389b;

    /* renamed from: c */
    private final Set<Config> f10390c;

    /* renamed from: d */
    private final long f10391d;

    /* renamed from: e */
    private final C1450a f10392e;

    /* renamed from: f */
    private long f10393f;

    /* renamed from: g */
    private long f10394g;

    /* renamed from: h */
    private int f10395h;

    /* renamed from: i */
    private int f10396i;

    /* renamed from: j */
    private int f10397j;

    /* renamed from: k */
    private int f10398k;

    /* renamed from: com.bumptech.glide.load.n.a0.k$a */
    /* compiled from: LruBitmapPool */
    private interface C1450a {
        /* renamed from: a */
        void mo8903a(Bitmap bitmap);

        /* renamed from: b */
        void mo8904b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.n.a0.k$b */
    /* compiled from: LruBitmapPool */
    private static final class C1451b implements C1450a {
        C1451b() {
        }

        /* renamed from: a */
        public void mo8903a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo8904b(Bitmap bitmap) {
        }
    }

    LruBitmapPool(long j, LruPoolStrategy lVar, Set<Config> set) {
        this.f10391d = j;
        this.f10393f = j;
        this.f10389b = lVar;
        this.f10390c = set;
        this.f10392e = new C1451b();
    }

    @TargetApi(26)
    /* renamed from: f */
    private static void m12704f(Config config) {
        if (VERSION.SDK_INT >= 26 && config == Config.HARDWARE) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create a mutable Bitmap with config: ");
            sb.append(config);
            sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: g */
    private static Bitmap m12705g(int i, int i2, Config config) {
        if (config == null) {
            config = f10388a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: h */
    private void m12706h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m12707i();
        }
    }

    /* renamed from: i */
    private void m12707i() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f10395h);
        sb.append(", misses=");
        sb.append(this.f10396i);
        sb.append(", puts=");
        sb.append(this.f10397j);
        sb.append(", evictions=");
        sb.append(this.f10398k);
        sb.append(", currentSize=");
        sb.append(this.f10394g);
        sb.append(", maxSize=");
        sb.append(this.f10393f);
        sb.append("\nStrategy=");
        sb.append(this.f10389b);
        Log.v("LruBitmapPool", sb.toString());
    }

    /* renamed from: j */
    private void m12708j() {
        m12714q(this.f10393f);
    }

    @TargetApi(26)
    /* renamed from: k */
    private static Set<Config> m12709k() {
        HashSet hashSet = new HashSet(Arrays.asList(Config.values()));
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            hashSet.add(null);
        }
        if (i >= 26) {
            hashSet.remove(Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    private static LruPoolStrategy m12710l() {
        if (VERSION.SDK_INT >= 19) {
            return new SizeConfigStrategy();
        }
        return new AttributeStrategy();
    }

    /* renamed from: m */
    private synchronized Bitmap m12711m(int i, int i2, Config config) {
        Bitmap c;
        m12704f(config);
        c = this.f10389b.mo8865c(i, i2, config != null ? config : f10388a);
        if (c == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.f10389b.mo8863a(i, i2, config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f10396i++;
        } else {
            this.f10395h++;
            this.f10394g -= (long) this.f10389b.mo8864b(c);
            this.f10392e.mo8903a(c);
            m12713p(c);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.f10389b.mo8863a(i, i2, config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        m12706h();
        return c;
    }

    @TargetApi(19)
    /* renamed from: o */
    private static void m12712o(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: p */
    private static void m12713p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m12712o(bitmap);
    }

    /* renamed from: q */
    private synchronized void m12714q(long j) {
        while (this.f10394g > j) {
            Bitmap e = this.f10389b.mo8867e();
            if (e == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m12707i();
                }
                this.f10394g = 0;
                return;
            }
            this.f10392e.mo8903a(e);
            this.f10394g -= (long) this.f10389b.mo8864b(e);
            this.f10398k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.f10389b.mo8868f(e));
                Log.d("LruBitmapPool", sb.toString());
            }
            m12706h();
            e.recycle();
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo8880a(int i) {
        String str = "LruBitmapPool";
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
            Log.d(str, sb.toString());
        }
        if (i >= 40 || (VERSION.SDK_INT >= 23 && i >= 20)) {
            mo8881b();
        } else if (i >= 20 || i == 15) {
            m12714q(mo8902n() / 2);
        }
    }

    /* renamed from: b */
    public void mo8881b() {
        String str = "LruBitmapPool";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "clearMemory");
        }
        m12714q(0);
    }

    /* renamed from: c */
    public Bitmap mo8882c(int i, int i2, Config config) {
        Bitmap m = m12711m(i, i2, config);
        if (m == null) {
            return m12705g(i, i2, config);
        }
        m.eraseColor(0);
        return m;
    }

    /* renamed from: d */
    public synchronized void mo8883d(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f10389b.mo8864b(bitmap)) <= this.f10393f) {
                        if (this.f10390c.contains(bitmap.getConfig())) {
                            int b = this.f10389b.mo8864b(bitmap);
                            this.f10389b.mo8866d(bitmap);
                            this.f10392e.mo8904b(bitmap);
                            this.f10397j++;
                            this.f10394g += (long) b;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Put bitmap in pool=");
                                sb.append(this.f10389b.mo8868f(bitmap));
                                Log.v("LruBitmapPool", sb.toString());
                            }
                            m12706h();
                            m12708j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reject bitmap from pool, bitmap: ");
                        sb2.append(this.f10389b.mo8868f(bitmap));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f10390c.contains(bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } finally {
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: e */
    public Bitmap mo8884e(int i, int i2, Config config) {
        Bitmap m = m12711m(i, i2, config);
        return m == null ? m12705g(i, i2, config) : m;
    }

    /* renamed from: n */
    public long mo8902n() {
        return this.f10393f;
    }

    public LruBitmapPool(long j) {
        this(j, m12710l(), m12709k());
    }
}
