package com.google.android.exoplayer2.upstream;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.BandwidthMeter.C1911a;
import com.google.android.exoplayer2.upstream.BandwidthMeter.C1911a.C1912a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Clock;
import p067c.p068a.p069a.p070a.p111m2.SlidingPercentile;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p136b.ImmutableList;
import p067c.p068a.p134b.p136b.ImmutableListMultimap;
import p067c.p068a.p134b.p136b.ImmutableListMultimap.C1386a;
import p067c.p068a.p134b.p136b.ImmutableMap;

/* renamed from: com.google.android.exoplayer2.upstream.r */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {

    /* renamed from: a */
    public static final ImmutableListMultimap<String, Integer> f12374a = m15110j();

    /* renamed from: b */
    public static final ImmutableList<Long> f12375b;

    /* renamed from: c */
    public static final ImmutableList<Long> f12376c = ImmutableList.m11920s(Long.valueOf(218000), Long.valueOf(159000), Long.valueOf(145000), Long.valueOf(130000), Long.valueOf(112000));

    /* renamed from: d */
    public static final ImmutableList<Long> f12377d;

    /* renamed from: e */
    public static final ImmutableList<Long> f12378e;

    /* renamed from: f */
    public static final ImmutableList<Long> f12379f;

    /* renamed from: g */
    private static DefaultBandwidthMeter f12380g;

    /* renamed from: h */
    private final Context f12381h;

    /* renamed from: i */
    private final ImmutableMap<Integer, Long> f12382i;

    /* renamed from: j */
    private final C1912a f12383j;

    /* renamed from: k */
    private final SlidingPercentile f12384k;

    /* renamed from: l */
    private final Clock f12385l;

    /* renamed from: m */
    private int f12386m;

    /* renamed from: n */
    private long f12387n;

    /* renamed from: o */
    private long f12388o;

    /* renamed from: p */
    private int f12389p;

    /* renamed from: q */
    private long f12390q;

    /* renamed from: r */
    private long f12391r;

    /* renamed from: s */
    private long f12392s;

    /* renamed from: t */
    private long f12393t;

    /* renamed from: u */
    private boolean f12394u;

    /* renamed from: v */
    private int f12395v;

    /* renamed from: com.google.android.exoplayer2.upstream.r$b */
    /* compiled from: DefaultBandwidthMeter */
    public static final class C1921b {

        /* renamed from: a */
        private final Context f12396a;

        /* renamed from: b */
        private Map<Integer, Long> f12397b;

        /* renamed from: c */
        private int f12398c;

        /* renamed from: d */
        private Clock f12399d;

        /* renamed from: e */
        private boolean f12400e;

        public C1921b(Context context) {
            Context context2;
            if (context == null) {
                context2 = null;
            } else {
                context2 = context.getApplicationContext();
            }
            this.f12396a = context2;
            this.f12397b = m15125c(Util.m10253I(context));
            this.f12398c = 2000;
            this.f12399d = Clock.f8368a;
            this.f12400e = true;
        }

        /* renamed from: b */
        private static ImmutableList<Integer> m15124b(String str) {
            ImmutableList<Integer> n = DefaultBandwidthMeter.f12374a.mo8456n(str);
            return n.isEmpty() ? ImmutableList.m11920s(Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2)) : n;
        }

        /* renamed from: c */
        private static Map<Integer, Long> m15125c(String str) {
            ImmutableList b = m15124b(str);
            HashMap hashMap = new HashMap(6);
            hashMap.put(Integer.valueOf(0), Long.valueOf(1000000));
            Integer valueOf = Integer.valueOf(2);
            ImmutableList<Long> rVar = DefaultBandwidthMeter.f12375b;
            hashMap.put(valueOf, (Long) rVar.get(((Integer) b.get(0)).intValue()));
            hashMap.put(Integer.valueOf(3), (Long) DefaultBandwidthMeter.f12376c.get(((Integer) b.get(1)).intValue()));
            hashMap.put(Integer.valueOf(4), (Long) DefaultBandwidthMeter.f12377d.get(((Integer) b.get(2)).intValue()));
            hashMap.put(Integer.valueOf(5), (Long) DefaultBandwidthMeter.f12378e.get(((Integer) b.get(3)).intValue()));
            hashMap.put(Integer.valueOf(9), (Long) DefaultBandwidthMeter.f12379f.get(((Integer) b.get(4)).intValue()));
            hashMap.put(Integer.valueOf(7), (Long) rVar.get(((Integer) b.get(0)).intValue()));
            return hashMap;
        }

        /* renamed from: a */
        public DefaultBandwidthMeter mo14964a() {
            DefaultBandwidthMeter rVar = new DefaultBandwidthMeter(this.f12396a, this.f12397b, this.f12398c, this.f12399d, this.f12400e);
            return rVar;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.r$c */
    /* compiled from: DefaultBandwidthMeter */
    private static class C1922c extends BroadcastReceiver {

        /* renamed from: a */
        private static C1922c f12401a;

        /* renamed from: b */
        private final Handler f12402b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        private final ArrayList<WeakReference<DefaultBandwidthMeter>> f12403c = new ArrayList<>();

        private C1922c() {
        }

        /* renamed from: a */
        public static synchronized C1922c m15127a(Context context) {
            C1922c cVar;
            synchronized (C1922c.class) {
                if (f12401a == null) {
                    f12401a = new C1922c();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(f12401a, intentFilter);
                }
                cVar = f12401a;
            }
            return cVar;
        }

        /* renamed from: e */
        private void m15129e() {
            for (int size = this.f12403c.size() - 1; size >= 0; size--) {
                if (((DefaultBandwidthMeter) ((WeakReference) this.f12403c.get(size)).get()) == null) {
                    this.f12403c.remove(size);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m15128b(DefaultBandwidthMeter rVar) {
            rVar.m15115o();
        }

        /* renamed from: d */
        public synchronized void mo14966d(DefaultBandwidthMeter rVar) {
            m15129e();
            this.f12403c.add(new WeakReference(rVar));
            this.f12402b.post(new C1897b(this, rVar));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                m15129e();
                for (int i = 0; i < this.f12403c.size(); i++) {
                    DefaultBandwidthMeter rVar = (DefaultBandwidthMeter) ((WeakReference) this.f12403c.get(i)).get();
                    if (rVar != null) {
                        m15128b(rVar);
                    }
                }
            }
        }
    }

    static {
        Long valueOf = Long.valueOf(6100000);
        Long valueOf2 = Long.valueOf(3800000);
        Long valueOf3 = Long.valueOf(2100000);
        Long valueOf4 = Long.valueOf(1300000);
        f12375b = ImmutableList.m11920s(valueOf, valueOf2, valueOf3, valueOf4, Long.valueOf(590000));
        f12377d = ImmutableList.m11920s(Long.valueOf(2200000), valueOf4, Long.valueOf(930000), Long.valueOf(730000), Long.valueOf(530000));
        Long valueOf5 = Long.valueOf(4800000);
        Long valueOf6 = Long.valueOf(2700000);
        Long valueOf7 = Long.valueOf(1800000);
        f12378e = ImmutableList.m11920s(valueOf5, valueOf6, valueOf7, Long.valueOf(1200000), Long.valueOf(630000));
        f12379f = ImmutableList.m11920s(Long.valueOf(12000000), Long.valueOf(8800000), Long.valueOf(5900000), Long.valueOf(3500000), valueOf7);
    }

    /* renamed from: j */
    private static ImmutableListMultimap<String, Integer> m15110j() {
        C1386a l = ImmutableListMultimap.m11947l();
        Integer valueOf = Integer.valueOf(1);
        Integer valueOf2 = Integer.valueOf(0);
        Object valueOf3 = Integer.valueOf(2);
        Integer valueOf4 = Integer.valueOf(3);
        Integer valueOf5 = Integer.valueOf(4);
        l.mo8460g("AD", valueOf, valueOf3, valueOf2, valueOf2, valueOf3);
        l.mo8460g("AE", valueOf, valueOf5, valueOf5, valueOf5, valueOf);
        l.mo8460g("AF", valueOf5, valueOf5, valueOf4, valueOf5, valueOf3);
        l.mo8460g("AG", valueOf3, valueOf3, valueOf, valueOf, valueOf3);
        l.mo8460g("AI", valueOf, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("AL", valueOf, valueOf, valueOf2, valueOf, valueOf3);
        l.mo8460g("AM", valueOf3, valueOf3, valueOf, valueOf3, valueOf3);
        l.mo8460g("AO", valueOf4, valueOf5, valueOf5, valueOf3, valueOf3);
        l.mo8460g("AR", valueOf3, valueOf5, valueOf3, valueOf3, valueOf3);
        l.mo8460g("AS", valueOf3, valueOf3, valueOf5, valueOf4, valueOf3);
        l.mo8460g("AT", valueOf2, valueOf4, valueOf2, valueOf2, valueOf3);
        l.mo8460g("AU", valueOf2, valueOf3, valueOf2, valueOf, valueOf);
        l.mo8460g("AW", valueOf, valueOf3, valueOf2, valueOf5, valueOf3);
        l.mo8460g("AX", valueOf2, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("AZ", valueOf4, valueOf4, valueOf4, valueOf5, valueOf3);
        l.mo8460g("BA", valueOf, valueOf, valueOf2, valueOf, valueOf3);
        l.mo8460g("BB", valueOf2, valueOf3, valueOf2, valueOf2, valueOf3);
        l.mo8460g("BD", valueOf3, valueOf2, valueOf4, valueOf4, valueOf3);
        l.mo8460g("BE", valueOf2, valueOf, valueOf3, valueOf4, valueOf3);
        l.mo8460g("BF", valueOf5, valueOf5, valueOf5, valueOf3, valueOf3);
        l.mo8460g("BG", valueOf2, valueOf, valueOf2, valueOf2, valueOf3);
        l.mo8460g("BH", valueOf, valueOf2, valueOf3, valueOf5, valueOf3);
        l.mo8460g("BI", valueOf5, valueOf5, valueOf5, valueOf5, valueOf3);
        l.mo8460g("BJ", valueOf5, valueOf5, valueOf4, valueOf5, valueOf3);
        l.mo8460g("BL", valueOf, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("BM", valueOf, valueOf3, valueOf2, valueOf2, valueOf3);
        l.mo8460g("BN", valueOf5, valueOf2, valueOf, valueOf, valueOf3);
        l.mo8460g("BO", valueOf3, valueOf4, valueOf4, valueOf3, valueOf3);
        l.mo8460g("BQ", valueOf, valueOf3, valueOf, valueOf3, valueOf3);
        l.mo8460g("BR", valueOf3, valueOf5, valueOf3, valueOf, valueOf3);
        l.mo8460g("BS", valueOf4, valueOf3, valueOf3, valueOf4, valueOf3);
        l.mo8460g("BT", valueOf4, valueOf2, valueOf4, valueOf3, valueOf3);
        l.mo8460g("BW", valueOf4, valueOf5, valueOf3, valueOf3, valueOf3);
        l.mo8460g("BY", valueOf, valueOf2, valueOf3, valueOf, valueOf3);
        l.mo8460g("BZ", valueOf3, valueOf3, valueOf3, valueOf, valueOf3);
        l.mo8460g("CA", valueOf2, valueOf4, valueOf, valueOf3, valueOf4);
        l.mo8460g("CD", valueOf5, valueOf4, valueOf3, valueOf3, valueOf3);
        l.mo8460g("CF", valueOf5, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("CG", valueOf4, valueOf5, valueOf, valueOf, valueOf3);
        l.mo8460g("CH", valueOf2, valueOf, valueOf2, valueOf2, valueOf2);
        l.mo8460g("CI", valueOf4, valueOf4, valueOf4, valueOf4, valueOf3);
        l.mo8460g("CK", valueOf4, valueOf3, valueOf, valueOf2, valueOf3);
        l.mo8460g("CL", valueOf, valueOf, valueOf3, valueOf4, valueOf3);
        l.mo8460g("CM", valueOf4, valueOf5, valueOf4, valueOf3, valueOf3);
        l.mo8460g("CN", valueOf3, valueOf3, valueOf3, valueOf, valueOf4);
        l.mo8460g("CO", valueOf3, valueOf5, valueOf4, valueOf3, valueOf3);
        l.mo8460g("CR", valueOf3, valueOf4, valueOf5, valueOf5, valueOf3);
        l.mo8460g("CU", valueOf5, valueOf5, valueOf3, valueOf, valueOf3);
        l.mo8460g("CV", valueOf3, valueOf4, valueOf4, valueOf4, valueOf3);
        l.mo8460g("CW", valueOf, valueOf3, valueOf2, valueOf2, valueOf3);
        l.mo8460g("CY", valueOf, valueOf3, valueOf2, valueOf2, valueOf3);
        l.mo8460g("CZ", valueOf2, valueOf, valueOf2, valueOf2, valueOf3);
        l.mo8460g("DE", valueOf2, valueOf, valueOf, valueOf3, valueOf2);
        l.mo8460g("DJ", valueOf5, valueOf, valueOf5, valueOf5, valueOf3);
        l.mo8460g("DK", valueOf2, valueOf2, valueOf, valueOf2, valueOf3);
        l.mo8460g("DM", valueOf, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("DO", valueOf4, valueOf5, valueOf5, valueOf5, valueOf3);
        l.mo8460g("DZ", valueOf4, valueOf3, valueOf5, valueOf5, valueOf3);
        l.mo8460g("EC", valueOf3, valueOf5, valueOf4, valueOf3, valueOf3);
        l.mo8460g("EE", valueOf2, valueOf2, valueOf2, valueOf2, valueOf3);
        l.mo8460g("EG", valueOf4, valueOf5, valueOf3, valueOf, valueOf3);
        l.mo8460g("EH", valueOf3, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("ER", valueOf5, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("ES", valueOf2, valueOf, valueOf3, valueOf, valueOf3);
        l.mo8460g("ET", valueOf5, valueOf5, valueOf5, valueOf, valueOf3);
        l.mo8460g("FI", valueOf2, valueOf2, valueOf, valueOf2, valueOf2);
        l.mo8460g("FJ", valueOf4, valueOf2, valueOf4, valueOf4, valueOf3);
        l.mo8460g("FK", valueOf3, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("FM", valueOf5, valueOf3, valueOf5, valueOf4, valueOf3);
        l.mo8460g("FO", valueOf2, valueOf3, valueOf2, valueOf2, valueOf3);
        l.mo8460g("FR", valueOf, valueOf2, valueOf3, valueOf, valueOf3);
        l.mo8460g("GA", valueOf4, valueOf4, valueOf, valueOf2, valueOf3);
        l.mo8460g("GB", valueOf2, valueOf2, valueOf, valueOf3, valueOf3);
        l.mo8460g("GD", valueOf, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("GE", valueOf, valueOf2, valueOf, valueOf4, valueOf3);
        l.mo8460g("GF", valueOf3, valueOf3, valueOf3, valueOf5, valueOf3);
        l.mo8460g("GG", valueOf2, valueOf3, valueOf2, valueOf2, valueOf3);
        l.mo8460g("GH", valueOf4, valueOf3, valueOf4, valueOf3, valueOf3);
        l.mo8460g("GI", valueOf2, valueOf3, valueOf2, valueOf2, valueOf3);
        l.mo8460g("GL", valueOf, valueOf3, valueOf3, valueOf, valueOf3);
        l.mo8460g("GM", valueOf5, valueOf4, valueOf3, valueOf5, valueOf3);
        l.mo8460g("GN", valueOf5, valueOf4, valueOf5, valueOf3, valueOf3);
        l.mo8460g("GP", valueOf3, valueOf3, valueOf4, valueOf5, valueOf3);
        l.mo8460g("GQ", valueOf5, valueOf3, valueOf4, valueOf5, valueOf3);
        l.mo8460g("GR", valueOf, valueOf, valueOf2, valueOf, valueOf3);
        l.mo8460g("GT", valueOf4, valueOf3, valueOf4, valueOf3, valueOf3);
        l.mo8460g("GU", valueOf, valueOf3, valueOf5, valueOf5, valueOf3);
        l.mo8460g("GW", valueOf4, valueOf5, valueOf5, valueOf4, valueOf3);
        l.mo8460g("GY", valueOf4, valueOf4, valueOf, valueOf2, valueOf3);
        l.mo8460g("HK", valueOf2, valueOf3, valueOf4, valueOf5, valueOf3);
        l.mo8460g("HN", valueOf4, valueOf2, valueOf4, valueOf4, valueOf3);
        l.mo8460g("HR", valueOf, valueOf, valueOf2, valueOf, valueOf3);
        l.mo8460g("HT", valueOf5, valueOf4, valueOf5, valueOf5, valueOf3);
        l.mo8460g("HU", valueOf2, valueOf, valueOf2, valueOf2, valueOf3);
        l.mo8460g("ID", valueOf4, valueOf3, valueOf3, valueOf4, valueOf3);
        l.mo8460g("IE", valueOf2, valueOf2, valueOf, valueOf, valueOf3);
        l.mo8460g("IL", valueOf, valueOf2, valueOf3, valueOf4, valueOf3);
        l.mo8460g("IM", valueOf2, valueOf3, valueOf2, valueOf, valueOf3);
        l.mo8460g("IN", valueOf3, valueOf, valueOf4, valueOf4, valueOf3);
        l.mo8460g("IO", valueOf5, valueOf3, valueOf3, valueOf5, valueOf3);
        l.mo8460g("IQ", valueOf4, valueOf3, valueOf5, valueOf4, valueOf3);
        l.mo8460g("IR", valueOf5, valueOf3, valueOf4, valueOf5, valueOf3);
        l.mo8460g("IS", valueOf2, valueOf3, valueOf2, valueOf2, valueOf3);
        l.mo8460g("IT", valueOf2, valueOf2, valueOf, valueOf, valueOf3);
        l.mo8460g("JE", valueOf3, valueOf3, valueOf2, valueOf3, valueOf3);
        l.mo8460g("JM", valueOf4, valueOf4, valueOf5, valueOf5, valueOf3);
        l.mo8460g("JO", valueOf, valueOf3, valueOf, valueOf, valueOf3);
        l.mo8460g("JP", valueOf2, valueOf3, valueOf2, valueOf, valueOf4);
        l.mo8460g("KE", valueOf4, valueOf5, valueOf3, valueOf3, valueOf3);
        l.mo8460g("KG", valueOf, valueOf2, valueOf3, valueOf3, valueOf3);
        l.mo8460g("KH", valueOf3, valueOf2, valueOf5, valueOf4, valueOf3);
        l.mo8460g("KI", valueOf5, valueOf3, valueOf4, valueOf, valueOf3);
        l.mo8460g("KM", valueOf5, valueOf3, valueOf3, valueOf4, valueOf3);
        l.mo8460g("KN", valueOf, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("KP", valueOf5, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("KR", valueOf2, valueOf3, valueOf, valueOf, valueOf);
        l.mo8460g("KW", valueOf3, valueOf4, valueOf, valueOf, valueOf);
        l.mo8460g("KY", valueOf, valueOf3, valueOf2, valueOf2, valueOf3);
        l.mo8460g("KZ", valueOf, valueOf3, valueOf3, valueOf4, valueOf3);
        l.mo8460g("LA", valueOf3, valueOf3, valueOf, valueOf, valueOf3);
        l.mo8460g("LB", valueOf4, valueOf3, valueOf2, valueOf2, valueOf3);
        l.mo8460g("LC", valueOf, valueOf, valueOf2, valueOf2, valueOf3);
        l.mo8460g("LI", valueOf2, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("LK", valueOf3, valueOf2, valueOf3, valueOf4, valueOf3);
        l.mo8460g("LR", valueOf4, valueOf5, valueOf4, valueOf3, valueOf3);
        l.mo8460g("LS", valueOf4, valueOf4, valueOf3, valueOf4, valueOf3);
        l.mo8460g("LT", valueOf2, valueOf2, valueOf2, valueOf2, valueOf3);
        l.mo8460g("LU", valueOf2, valueOf2, valueOf2, valueOf2, valueOf3);
        l.mo8460g("LV", valueOf2, valueOf2, valueOf2, valueOf2, valueOf3);
        l.mo8460g("LY", valueOf5, valueOf3, valueOf5, valueOf4, valueOf3);
        l.mo8460g("MA", valueOf3, valueOf, valueOf3, valueOf, valueOf3);
        l.mo8460g("MC", valueOf2, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("MD", valueOf, valueOf3, valueOf2, valueOf2, valueOf3);
        l.mo8460g("ME", valueOf, valueOf3, valueOf, valueOf3, valueOf3);
        l.mo8460g("MF", valueOf, valueOf3, valueOf, valueOf2, valueOf3);
        l.mo8460g("MG", valueOf4, valueOf5, valueOf4, valueOf4, valueOf3);
        l.mo8460g("MH", valueOf5, valueOf3, valueOf3, valueOf5, valueOf3);
        l.mo8460g("MK", valueOf, valueOf2, valueOf2, valueOf2, valueOf3);
        l.mo8460g("ML", valueOf5, valueOf5, valueOf, valueOf, valueOf3);
        l.mo8460g("MM", valueOf3, valueOf4, valueOf3, valueOf3, valueOf3);
        l.mo8460g("MN", valueOf3, valueOf5, valueOf, valueOf, valueOf3);
        l.mo8460g("MO", valueOf2, valueOf3, valueOf5, valueOf5, valueOf3);
        l.mo8460g("MP", valueOf2, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("MQ", valueOf3, valueOf3, valueOf3, valueOf4, valueOf3);
        l.mo8460g("MR", valueOf4, valueOf2, valueOf5, valueOf3, valueOf3);
        l.mo8460g("MS", valueOf, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("MT", valueOf2, valueOf3, valueOf2, valueOf, valueOf3);
        l.mo8460g("MU", valueOf4, valueOf, valueOf3, valueOf4, valueOf3);
        l.mo8460g("MV", valueOf5, valueOf4, valueOf, valueOf5, valueOf3);
        l.mo8460g("MW", valueOf5, valueOf, valueOf, valueOf2, valueOf3);
        l.mo8460g("MX", valueOf3, valueOf5, valueOf4, valueOf4, valueOf3);
        l.mo8460g("MY", valueOf3, valueOf2, valueOf4, valueOf4, valueOf3);
        l.mo8460g("MZ", valueOf4, valueOf4, valueOf3, valueOf4, valueOf3);
        l.mo8460g("NA", valueOf5, valueOf4, valueOf3, valueOf3, valueOf3);
        l.mo8460g("NC", valueOf3, valueOf2, valueOf5, valueOf5, valueOf3);
        l.mo8460g("NE", valueOf5, valueOf5, valueOf5, valueOf5, valueOf3);
        l.mo8460g("NF", valueOf3, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("NG", valueOf4, valueOf4, valueOf3, valueOf3, valueOf3);
        l.mo8460g("NI", valueOf4, valueOf, valueOf5, valueOf5, valueOf3);
        l.mo8460g("NL", valueOf2, valueOf3, valueOf5, valueOf3, valueOf2);
        l.mo8460g("NO", valueOf2, valueOf, valueOf, valueOf2, valueOf3);
        l.mo8460g("NP", valueOf3, valueOf2, valueOf5, valueOf4, valueOf3);
        l.mo8460g("NR", valueOf5, valueOf3, valueOf4, valueOf, valueOf3);
        l.mo8460g("NU", valueOf5, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("NZ", valueOf2, valueOf3, valueOf, valueOf3, valueOf5);
        l.mo8460g("OM", valueOf3, valueOf3, valueOf2, valueOf3, valueOf3);
        l.mo8460g("PA", valueOf, valueOf4, valueOf4, valueOf5, valueOf3);
        l.mo8460g("PE", valueOf3, valueOf5, valueOf5, valueOf5, valueOf3);
        l.mo8460g("PF", valueOf3, valueOf3, valueOf, valueOf, valueOf3);
        l.mo8460g("PG", valueOf5, valueOf4, valueOf4, valueOf3, valueOf3);
        l.mo8460g("PH", valueOf4, valueOf2, valueOf4, valueOf5, valueOf5);
        l.mo8460g("PK", valueOf4, valueOf3, valueOf4, valueOf4, valueOf3);
        l.mo8460g("PL", valueOf, valueOf2, valueOf3, valueOf3, valueOf3);
        l.mo8460g("PM", valueOf2, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("PR", valueOf, valueOf3, valueOf3, valueOf4, valueOf5);
        l.mo8460g("PS", valueOf4, valueOf4, valueOf3, valueOf3, valueOf3);
        l.mo8460g("PT", valueOf, valueOf, valueOf2, valueOf2, valueOf3);
        l.mo8460g("PW", valueOf, valueOf3, valueOf4, valueOf2, valueOf3);
        l.mo8460g("PY", valueOf3, valueOf2, valueOf4, valueOf4, valueOf3);
        l.mo8460g("QA", valueOf3, valueOf4, valueOf, valueOf3, valueOf3);
        l.mo8460g("RE", valueOf, valueOf2, valueOf3, valueOf, valueOf3);
        l.mo8460g("RO", valueOf, valueOf, valueOf, valueOf3, valueOf3);
        l.mo8460g("RS", valueOf, valueOf3, valueOf2, valueOf2, valueOf3);
        l.mo8460g("RU", valueOf2, valueOf, valueOf2, valueOf, valueOf3);
        l.mo8460g("RW", valueOf5, valueOf4, valueOf4, valueOf5, valueOf3);
        l.mo8460g("SA", valueOf3, valueOf3, valueOf3, valueOf, valueOf3);
        l.mo8460g("SB", valueOf5, valueOf3, valueOf5, valueOf3, valueOf3);
        l.mo8460g("SC", valueOf5, valueOf3, valueOf2, valueOf, valueOf3);
        l.mo8460g("SD", valueOf5, valueOf5, valueOf5, valueOf4, valueOf3);
        l.mo8460g("SE", valueOf2, valueOf2, valueOf2, valueOf2, valueOf3);
        l.mo8460g("SG", valueOf2, valueOf2, valueOf4, valueOf4, valueOf5);
        l.mo8460g("SH", valueOf5, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("SI", valueOf2, valueOf, valueOf2, valueOf2, valueOf3);
        l.mo8460g("SJ", valueOf3, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("SK", valueOf2, valueOf, valueOf2, valueOf2, valueOf3);
        l.mo8460g("SL", valueOf5, valueOf4, valueOf4, valueOf, valueOf3);
        l.mo8460g("SM", valueOf2, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("SN", valueOf5, valueOf5, valueOf5, valueOf4, valueOf3);
        l.mo8460g("SO", valueOf4, valueOf5, valueOf5, valueOf5, valueOf3);
        l.mo8460g("SR", valueOf4, valueOf3, valueOf4, valueOf, valueOf3);
        l.mo8460g("SS", valueOf5, valueOf, valueOf5, valueOf3, valueOf3);
        l.mo8460g("ST", valueOf3, valueOf3, valueOf, valueOf3, valueOf3);
        l.mo8460g("SV", valueOf3, valueOf, valueOf5, valueOf5, valueOf3);
        l.mo8460g("SX", valueOf3, valueOf3, valueOf, valueOf2, valueOf3);
        l.mo8460g("SY", valueOf5, valueOf4, valueOf3, valueOf3, valueOf3);
        l.mo8460g("SZ", valueOf4, valueOf5, valueOf4, valueOf5, valueOf3);
        l.mo8460g("TC", valueOf, valueOf3, valueOf, valueOf2, valueOf3);
        l.mo8460g("TD", valueOf5, valueOf5, valueOf5, valueOf5, valueOf3);
        l.mo8460g("TG", valueOf4, valueOf3, valueOf, valueOf2, valueOf3);
        l.mo8460g("TH", valueOf, valueOf4, valueOf5, valueOf4, valueOf2);
        l.mo8460g("TJ", valueOf5, valueOf5, valueOf5, valueOf5, valueOf3);
        l.mo8460g("TL", valueOf5, valueOf, valueOf5, valueOf5, valueOf3);
        l.mo8460g("TM", valueOf5, valueOf3, valueOf, valueOf3, valueOf3);
        l.mo8460g("TN", valueOf3, valueOf, valueOf, valueOf, valueOf3);
        l.mo8460g("TO", valueOf4, valueOf4, valueOf5, valueOf3, valueOf3);
        l.mo8460g("TR", valueOf, valueOf3, valueOf, valueOf, valueOf3);
        l.mo8460g("TT", valueOf, valueOf4, valueOf, valueOf4, valueOf3);
        l.mo8460g("TV", valueOf4, valueOf3, valueOf3, valueOf5, valueOf3);
        l.mo8460g("TW", valueOf2, valueOf2, valueOf2, valueOf2, valueOf);
        l.mo8460g("TZ", valueOf4, valueOf4, valueOf4, valueOf3, valueOf3);
        l.mo8460g("UA", valueOf2, valueOf4, valueOf2, valueOf2, valueOf3);
        l.mo8460g("UG", valueOf4, valueOf3, valueOf3, valueOf4, valueOf3);
        l.mo8460g("US", valueOf2, valueOf, valueOf4, valueOf4, valueOf4);
        l.mo8460g("UY", valueOf3, valueOf, valueOf, valueOf, valueOf3);
        l.mo8460g("UZ", valueOf3, valueOf2, valueOf4, valueOf3, valueOf3);
        l.mo8460g("VC", valueOf3, valueOf3, valueOf3, valueOf3, valueOf3);
        l.mo8460g("VE", valueOf5, valueOf5, valueOf5, valueOf5, valueOf3);
        l.mo8460g("VG", valueOf3, valueOf3, valueOf, valueOf3, valueOf3);
        l.mo8460g("VI", valueOf, valueOf3, valueOf3, valueOf5, valueOf3);
        l.mo8460g("VN", valueOf2, valueOf, valueOf5, valueOf5, valueOf3);
        l.mo8460g("VU", valueOf5, valueOf, valueOf4, valueOf, valueOf3);
        l.mo8460g("WS", valueOf4, valueOf, valueOf5, valueOf3, valueOf3);
        l.mo8460g("XK", valueOf, valueOf, valueOf, valueOf2, valueOf3);
        l.mo8460g("YE", valueOf5, valueOf5, valueOf5, valueOf5, valueOf3);
        l.mo8460g("YT", valueOf4, valueOf3, valueOf, valueOf4, valueOf3);
        l.mo8460g("ZA", valueOf3, valueOf4, valueOf3, valueOf3, valueOf3);
        l.mo8460g("ZM", valueOf4, valueOf3, valueOf3, valueOf4, valueOf3);
        l.mo8460g("ZW", valueOf4, valueOf4, valueOf4, valueOf4, valueOf3);
        return l.mo8458e();
    }

    /* renamed from: k */
    private long m15111k(int i) {
        Long l = (Long) this.f12382i.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) this.f12382i.get(Integer.valueOf(0));
        }
        if (l == null) {
            l = Long.valueOf(1000000);
        }
        return l.longValue();
    }

    /* renamed from: l */
    public static synchronized DefaultBandwidthMeter m15112l(Context context) {
        DefaultBandwidthMeter rVar;
        synchronized (DefaultBandwidthMeter.class) {
            if (f12380g == null) {
                f12380g = new C1921b(context).mo14964a();
            }
            rVar = f12380g;
        }
        return rVar;
    }

    /* renamed from: m */
    private static boolean m15113m(DataSpec pVar, boolean z) {
        return z && !pVar.mo14947d(8);
    }

    /* renamed from: n */
    private void m15114n(int i, long j, long j2) {
        if (i != 0 || j != 0 || j2 != this.f12393t) {
            this.f12393t = j2;
            this.f12383j.mo14932b(i, j, j2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m15115o() {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.f12394u     // Catch:{ all -> 0x0058 }
            r1 = 0
            if (r0 == 0) goto L_0x0009
            int r0 = r10.f12395v     // Catch:{ all -> 0x0058 }
            goto L_0x0013
        L_0x0009:
            android.content.Context r0 = r10.f12381h     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0013
        L_0x000f:
            int r0 = p067c.p068a.p069a.p070a.p111m2.Util.m10270T(r0)     // Catch:{ all -> 0x0058 }
        L_0x0013:
            int r2 = r10.f12389p     // Catch:{ all -> 0x0058 }
            if (r2 != r0) goto L_0x0019
            monitor-exit(r10)
            return
        L_0x0019:
            r10.f12389p = r0     // Catch:{ all -> 0x0058 }
            r2 = 1
            if (r0 == r2) goto L_0x0056
            if (r0 == 0) goto L_0x0056
            r2 = 8
            if (r0 != r2) goto L_0x0025
            goto L_0x0056
        L_0x0025:
            long r2 = r10.m15111k(r0)     // Catch:{ all -> 0x0058 }
            r10.f12392s = r2     // Catch:{ all -> 0x0058 }
            c.a.a.a.m2.g r0 = r10.f12385l     // Catch:{ all -> 0x0058 }
            long r2 = r0.mo7425c()     // Catch:{ all -> 0x0058 }
            int r0 = r10.f12386m     // Catch:{ all -> 0x0058 }
            if (r0 <= 0) goto L_0x003c
            long r0 = r10.f12387n     // Catch:{ all -> 0x0058 }
            long r0 = r2 - r0
            int r1 = (int) r0     // Catch:{ all -> 0x0058 }
            r5 = r1
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            long r6 = r10.f12388o     // Catch:{ all -> 0x0058 }
            long r8 = r10.f12392s     // Catch:{ all -> 0x0058 }
            r4 = r10
            r4.m15114n(r5, r6, r8)     // Catch:{ all -> 0x0058 }
            r10.f12387n = r2     // Catch:{ all -> 0x0058 }
            r0 = 0
            r10.f12388o = r0     // Catch:{ all -> 0x0058 }
            r10.f12391r = r0     // Catch:{ all -> 0x0058 }
            r10.f12390q = r0     // Catch:{ all -> 0x0058 }
            c.a.a.a.m2.e0 r0 = r10.f12384k     // Catch:{ all -> 0x0058 }
            r0.mo7419g()     // Catch:{ all -> 0x0058 }
            monitor-exit(r10)
            return
        L_0x0056:
            monitor-exit(r10)
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.DefaultBandwidthMeter.m15115o():void");
    }

    /* renamed from: a */
    public TransferListener mo14927a() {
        return this;
    }

    /* renamed from: b */
    public void mo14928b(C1911a aVar) {
        this.f12383j.mo14933d(aVar);
    }

    /* renamed from: c */
    public synchronized long mo14929c() {
        return this.f12392s;
    }

    /* renamed from: d */
    public synchronized void mo14923d(C1916m mVar, DataSpec pVar, boolean z) {
        if (m15113m(pVar, z)) {
            Assertions.m10154f(this.f12386m > 0);
            long c = this.f12385l.mo7425c();
            int i = (int) (c - this.f12387n);
            this.f12390q += (long) i;
            long j = this.f12391r;
            long j2 = this.f12388o;
            this.f12391r = j + j2;
            if (i > 0) {
                this.f12384k.mo7417a((int) Math.sqrt((double) j2), (((float) j2) * 8000.0f) / ((float) i));
                if (this.f12390q >= 2000 || this.f12391r >= 524288) {
                    this.f12392s = (long) this.f12384k.mo7418d(0.5f);
                }
                m15114n(i, this.f12388o, this.f12392s);
                this.f12387n = c;
                this.f12388o = 0;
            }
            this.f12386m--;
        }
    }

    /* renamed from: e */
    public synchronized void mo14924e(C1916m mVar, DataSpec pVar, boolean z, int i) {
        if (m15113m(pVar, z)) {
            this.f12388o += (long) i;
        }
    }

    /* renamed from: f */
    public synchronized void mo14925f(C1916m mVar, DataSpec pVar, boolean z) {
        if (m15113m(pVar, z)) {
            if (this.f12386m == 0) {
                this.f12387n = this.f12385l.mo7425c();
            }
            this.f12386m++;
        }
    }

    /* renamed from: g */
    public void mo14930g(Handler handler, C1911a aVar) {
        Assertions.m10153e(handler);
        Assertions.m10153e(aVar);
        this.f12383j.mo14931a(handler, aVar);
    }

    /* renamed from: h */
    public void mo14926h(C1916m mVar, DataSpec pVar, boolean z) {
    }

    @Deprecated
    public DefaultBandwidthMeter() {
        this(null, ImmutableMap.m11963j(), 2000, Clock.f8368a, false);
    }

    private DefaultBandwidthMeter(Context context, Map<Integer, Long> map, int i, Clock gVar, boolean z) {
        Context context2;
        int i2;
        if (context == null) {
            context2 = null;
        } else {
            context2 = context.getApplicationContext();
        }
        this.f12381h = context2;
        this.f12382i = ImmutableMap.m11962c(map);
        this.f12383j = new C1912a();
        this.f12384k = new SlidingPercentile(i);
        this.f12385l = gVar;
        if (context == null) {
            i2 = 0;
        } else {
            i2 = Util.m10270T(context);
        }
        this.f12389p = i2;
        this.f12392s = m15111k(i2);
        if (context != null && z) {
            C1922c.m15127a(context).mo14966d(this);
        }
    }
}
