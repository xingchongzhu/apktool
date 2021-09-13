package com.bumptech.glide.load.p158p.p159d;

import android.os.Build.VERSION;
import com.bumptech.glide.load.Option;

/* renamed from: com.bumptech.glide.load.p.d.m */
public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final DownsampleStrategy f10855a = new C1585a();

    /* renamed from: b */
    public static final DownsampleStrategy f10856b = new C1586b();

    /* renamed from: c */
    public static final DownsampleStrategy f10857c = new C1589e();

    /* renamed from: d */
    public static final DownsampleStrategy f10858d = new C1587c();

    /* renamed from: e */
    public static final DownsampleStrategy f10859e;

    /* renamed from: f */
    public static final DownsampleStrategy f10860f = new C1590f();

    /* renamed from: g */
    public static final DownsampleStrategy f10861g;

    /* renamed from: h */
    public static final Option<DownsampleStrategy> f10862h;

    /* renamed from: i */
    static final boolean f10863i = (VERSION.SDK_INT >= 19);

    /* renamed from: com.bumptech.glide.load.p.d.m$a */
    /* compiled from: DownsampleStrategy */
    private static class C1585a extends DownsampleStrategy {
        C1585a() {
        }

        /* renamed from: a */
        public C1591g mo9223a(int i, int i2, int i3, int i4) {
            return C1591g.QUALITY;
        }

        /* renamed from: b */
        public float mo9224b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.m$b */
    /* compiled from: DownsampleStrategy */
    private static class C1586b extends DownsampleStrategy {
        C1586b() {
        }

        /* renamed from: a */
        public C1591g mo9223a(int i, int i2, int i3, int i4) {
            return C1591g.MEMORY;
        }

        /* renamed from: b */
        public float mo9224b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.m$c */
    /* compiled from: DownsampleStrategy */
    private static class C1587c extends DownsampleStrategy {
        C1587c() {
        }

        /* renamed from: a */
        public C1591g mo9223a(int i, int i2, int i3, int i4) {
            if (mo9224b(i, i2, i3, i4) == 1.0f) {
                return C1591g.QUALITY;
            }
            return DownsampleStrategy.f10857c.mo9223a(i, i2, i3, i4);
        }

        /* renamed from: b */
        public float mo9224b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.f10857c.mo9224b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.m$d */
    /* compiled from: DownsampleStrategy */
    private static class C1588d extends DownsampleStrategy {
        C1588d() {
        }

        /* renamed from: a */
        public C1591g mo9223a(int i, int i2, int i3, int i4) {
            return C1591g.QUALITY;
        }

        /* renamed from: b */
        public float mo9224b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.m$e */
    /* compiled from: DownsampleStrategy */
    private static class C1589e extends DownsampleStrategy {
        C1589e() {
        }

        /* renamed from: a */
        public C1591g mo9223a(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f10863i) {
                return C1591g.QUALITY;
            }
            return C1591g.MEMORY;
        }

        /* renamed from: b */
        public float mo9224b(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f10863i) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            float f = 1.0f;
            if (max != 0) {
                f = 1.0f / ((float) Integer.highestOneBit(max));
            }
            return f;
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.m$f */
    /* compiled from: DownsampleStrategy */
    private static class C1590f extends DownsampleStrategy {
        C1590f() {
        }

        /* renamed from: a */
        public C1591g mo9223a(int i, int i2, int i3, int i4) {
            return C1591g.QUALITY;
        }

        /* renamed from: b */
        public float mo9224b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.m$g */
    /* compiled from: DownsampleStrategy */
    public enum C1591g {
        MEMORY,
        QUALITY
    }

    static {
        C1588d dVar = new C1588d();
        f10859e = dVar;
        f10861g = dVar;
        f10862h = Option.m12607f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    /* renamed from: a */
    public abstract C1591g mo9223a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo9224b(int i, int i2, int i3, int i4);
}
