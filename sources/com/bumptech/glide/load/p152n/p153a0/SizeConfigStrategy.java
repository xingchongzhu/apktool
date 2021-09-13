package com.bumptech.glide.load.p152n.p153a0;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.bumptech.glide.p174t.C1639k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.n.a0.n */
public class SizeConfigStrategy implements LruPoolStrategy {

    /* renamed from: a */
    private static final Config[] f10399a;

    /* renamed from: b */
    private static final Config[] f10400b;

    /* renamed from: c */
    private static final Config[] f10401c = {Config.RGB_565};

    /* renamed from: d */
    private static final Config[] f10402d = {Config.ARGB_4444};

    /* renamed from: e */
    private static final Config[] f10403e = {Config.ALPHA_8};

    /* renamed from: f */
    private final C1454c f10404f = new C1454c();

    /* renamed from: g */
    private final GroupedLinkedMap<C1453b, Bitmap> f10405g = new GroupedLinkedMap<>();

    /* renamed from: h */
    private final Map<Config, NavigableMap<Integer, Integer>> f10406h = new HashMap();

    /* renamed from: com.bumptech.glide.load.n.a0.n$a */
    /* compiled from: SizeConfigStrategy */
    static /* synthetic */ class C1452a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10407a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10407a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10407a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10407a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10407a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p152n.p153a0.SizeConfigStrategy.C1452a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a0.n$b */
    /* compiled from: SizeConfigStrategy */
    static final class C1453b implements Poolable {

        /* renamed from: a */
        private final C1454c f10408a;

        /* renamed from: b */
        int f10409b;

        /* renamed from: c */
        private Config f10410c;

        public C1453b(C1454c cVar) {
            this.f10408a = cVar;
        }

        /* renamed from: a */
        public void mo8870a() {
            this.f10408a.mo8879c(this);
        }

        /* renamed from: b */
        public void mo8906b(int i, Config config) {
            this.f10409b = i;
            this.f10410c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1453b)) {
                return false;
            }
            C1453b bVar = (C1453b) obj;
            if (this.f10409b != bVar.f10409b || !C1639k.m14085c(this.f10410c, bVar.f10410c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.f10409b * 31;
            Config config = this.f10410c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return SizeConfigStrategy.m12734i(this.f10409b, this.f10410c);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a0.n$c */
    /* compiled from: SizeConfigStrategy */
    static class C1454c extends BaseKeyPool<C1453b> {
        C1454c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C1453b mo8875a() {
            return new C1453b(this);
        }

        /* renamed from: e */
        public C1453b mo8911e(int i, Config config) {
            C1453b bVar = (C1453b) mo8878b();
            bVar.mo8906b(i, config);
            return bVar;
        }
    }

    static {
        Config[] configArr = {Config.ARGB_8888, null};
        if (VERSION.SDK_INT >= 26) {
            configArr = (Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Config.RGBA_F16;
        }
        f10399a = configArr;
        f10400b = configArr;
    }

    /* renamed from: g */
    private void m12732g(Integer num, Bitmap bitmap) {
        NavigableMap k = m12736k(bitmap.getConfig());
        Integer num2 = (Integer) k.get(num);
        if (num2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to decrement empty size, size: ");
            sb.append(num);
            sb.append(", removed: ");
            sb.append(mo8868f(bitmap));
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num2.intValue() == 1) {
            k.remove(num);
        } else {
            k.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: h */
    private C1453b m12733h(int i, Config config) {
        C1453b e = this.f10404f.mo8911e(i, config);
        Config[] j = m12735j(config);
        int length = j.length;
        int i2 = 0;
        while (i2 < length) {
            Config config2 = j[i2];
            Integer num = (Integer) m12736k(config2).ceilingKey(Integer.valueOf(i));
            if (num == null || num.intValue() > i * 8) {
                i2++;
            } else {
                if (num.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e;
                        }
                    } else if (config2.equals(config)) {
                        return e;
                    }
                }
                this.f10404f.mo8879c(e);
                return this.f10404f.mo8911e(num.intValue(), config2);
            }
        }
        return e;
    }

    /* renamed from: i */
    static String m12734i(int i, Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("](");
        sb.append(config);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: j */
    private static Config[] m12735j(Config config) {
        if (VERSION.SDK_INT >= 26 && Config.RGBA_F16.equals(config)) {
            return f10400b;
        }
        int i = C1452a.f10407a[config.ordinal()];
        if (i == 1) {
            return f10399a;
        }
        if (i == 2) {
            return f10401c;
        }
        if (i == 3) {
            return f10402d;
        }
        if (i == 4) {
            return f10403e;
        }
        return new Config[]{config};
    }

    /* renamed from: k */
    private NavigableMap<Integer, Integer> m12736k(Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f10406h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f10406h.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public String mo8863a(int i, int i2, Config config) {
        return m12734i(C1639k.m14088f(i, i2, config), config);
    }

    /* renamed from: b */
    public int mo8864b(Bitmap bitmap) {
        return C1639k.m14089g(bitmap);
    }

    /* renamed from: c */
    public Bitmap mo8865c(int i, int i2, Config config) {
        C1453b h = m12733h(C1639k.m14088f(i, i2, config), config);
        Bitmap bitmap = (Bitmap) this.f10405g.mo8887a(h);
        if (bitmap != null) {
            m12732g(Integer.valueOf(h.f10409b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* renamed from: d */
    public void mo8866d(Bitmap bitmap) {
        C1453b e = this.f10404f.mo8911e(C1639k.m14089g(bitmap), bitmap.getConfig());
        this.f10405g.mo8888d(e, bitmap);
        NavigableMap k = m12736k(bitmap.getConfig());
        Integer num = (Integer) k.get(Integer.valueOf(e.f10409b));
        Integer valueOf = Integer.valueOf(e.f10409b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        k.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: e */
    public Bitmap mo8867e() {
        Bitmap bitmap = (Bitmap) this.f10405g.mo8889f();
        if (bitmap != null) {
            m12732g(Integer.valueOf(C1639k.m14089g(bitmap)), bitmap);
        }
        return bitmap;
    }

    /* renamed from: f */
    public String mo8868f(Bitmap bitmap) {
        return m12734i(C1639k.m14089g(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f10405g);
        sb.append(", sortedSizes=(");
        for (Entry entry : this.f10406h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f10406h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
