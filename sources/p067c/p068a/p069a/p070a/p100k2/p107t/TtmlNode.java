package p067c.p068a.p069a.p070a.p100k2.p107t;

import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.umeng.analytics.pro.UMCommonContent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Cue.C1119b;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: c.a.a.a.k2.t.d */
final class TtmlNode {

    /* renamed from: a */
    public final String f8000a;

    /* renamed from: b */
    public final String f8001b;

    /* renamed from: c */
    public final boolean f8002c;

    /* renamed from: d */
    public final long f8003d;

    /* renamed from: e */
    public final long f8004e;

    /* renamed from: f */
    public final TtmlStyle f8005f;

    /* renamed from: g */
    private final String[] f8006g;

    /* renamed from: h */
    public final String f8007h;

    /* renamed from: i */
    public final String f8008i;

    /* renamed from: j */
    public final TtmlNode f8009j;

    /* renamed from: k */
    private final HashMap<String, Integer> f8010k;

    /* renamed from: l */
    private final HashMap<String, Integer> f8011l;

    /* renamed from: m */
    private List<TtmlNode> f8012m;

    private TtmlNode(String str, String str2, long j, long j2, TtmlStyle gVar, String[] strArr, String str3, String str4, TtmlNode dVar) {
        this.f8000a = str;
        this.f8001b = str2;
        this.f8008i = str4;
        this.f8005f = gVar;
        this.f8006g = strArr;
        this.f8002c = str2 != null;
        this.f8003d = j;
        this.f8004e = j2;
        this.f8007h = (String) Assertions.m10153e(str3);
        this.f8009j = dVar;
        this.f8010k = new HashMap<>();
        this.f8011l = new HashMap<>();
    }

    /* renamed from: b */
    private void m9659b(Map<String, TtmlStyle> map, C1119b bVar, int i, int i2, int i3) {
        TtmlStyle f = TtmlRenderUtil.m9680f(this.f8005f, this.f8006g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.mo7040e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.mo7049n(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f != null) {
            TtmlRenderUtil.m9675a(spannableStringBuilder2, i, i2, f, this.f8009j, map, i3);
            if (f.mo7137j() != Float.MAX_VALUE) {
                if (UMCommonContent.f16624av.equals(this.f8000a)) {
                    bVar.mo7047l((f.mo7137j() * -90.0f) / 100.0f);
                }
            }
            bVar.mo7050o(f.mo7139l());
        }
    }

    /* renamed from: c */
    public static TtmlNode m9660c(String str, long j, long j2, TtmlStyle gVar, String[] strArr, String str2, String str3, TtmlNode dVar) {
        TtmlNode dVar2 = new TtmlNode(str, null, j, j2, gVar, strArr, str2, str3, dVar);
        return dVar2;
    }

    /* renamed from: d */
    public static TtmlNode m9661d(String str) {
        TtmlNode dVar = new TtmlNode(null, TtmlRenderUtil.m9676b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
        return dVar;
    }

    /* renamed from: e */
    private static void m9662e(SpannableStringBuilder spannableStringBuilder) {
        DeleteTextSpan[] aVarArr;
        for (DeleteTextSpan aVar : (DeleteTextSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), DeleteTextSpan.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == 10) {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == 10) {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    /* renamed from: i */
    private void m9663i(TreeSet<Long> treeSet, boolean z) {
        boolean equals = UMCommonContent.f16624av.equals(this.f8000a);
        boolean equals2 = "div".equals(this.f8000a);
        if (z || equals || (equals2 && this.f8008i != null)) {
            long j = this.f8003d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f8004e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f8012m != null) {
            for (int i = 0; i < this.f8012m.size(); i++) {
                ((TtmlNode) this.f8012m.get(i)).m9663i(treeSet, z || equals);
            }
        }
    }

    /* renamed from: k */
    private static SpannableStringBuilder m9664k(String str, Map<String, C1119b> map) {
        if (!map.containsKey(str)) {
            C1119b bVar = new C1119b();
            bVar.mo7049n(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) Assertions.m10153e(((C1119b) map.get(str)).mo7040e());
    }

    /* renamed from: n */
    private void m9665n(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f8007h)) {
            str = this.f8007h;
        }
        if (mo7118m(j)) {
            if ("div".equals(this.f8000a) && this.f8008i != null) {
                list.add(new Pair(str, this.f8008i));
                return;
            }
        }
        for (int i = 0; i < mo7114g(); i++) {
            mo7113f(i).m9665n(j, str, list);
        }
    }

    /* renamed from: o */
    private void m9666o(long j, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2, String str, Map<String, C1119b> map3) {
        int i;
        if (mo7118m(j)) {
            String str2 = "".equals(this.f8007h) ? str : this.f8007h;
            Iterator it = this.f8011l.entrySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str3 = (String) entry.getKey();
                int intValue = this.f8010k.containsKey(str3) ? ((Integer) this.f8010k.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    m9659b(map, (C1119b) Assertions.m10153e((C1119b) map3.get(str3)), intValue, intValue2, ((TtmlRegion) Assertions.m10153e((TtmlRegion) map2.get(str2))).f8022j);
                } else {
                    Map<String, TtmlRegion> map4 = map2;
                    Map<String, C1119b> map5 = map3;
                }
            }
            Map<String, TtmlRegion> map6 = map2;
            Map<String, C1119b> map7 = map3;
            while (i < mo7114g()) {
                mo7113f(i).m9666o(j, map, map2, str2, map3);
                i++;
                Map<String, TtmlRegion> map8 = map2;
            }
        }
    }

    /* renamed from: p */
    private void m9667p(long j, boolean z, String str, Map<String, C1119b> map) {
        this.f8010k.clear();
        this.f8011l.clear();
        if (!"metadata".equals(this.f8000a)) {
            if (!"".equals(this.f8007h)) {
                str = this.f8007h;
            }
            if (!this.f8002c || !z) {
                if ("br".equals(this.f8000a) && z) {
                    m9664k(str, map).append(10);
                } else if (mo7118m(j)) {
                    for (Entry entry : map.entrySet()) {
                        this.f8010k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) Assertions.m10153e(((C1119b) entry.getValue()).mo7040e())).length()));
                    }
                    boolean equals = UMCommonContent.f16624av.equals(this.f8000a);
                    for (int i = 0; i < mo7114g(); i++) {
                        mo7113f(i).m9667p(j, z || equals, str, map);
                    }
                    if (equals) {
                        TtmlRenderUtil.m9677c(m9664k(str, map));
                    }
                    for (Entry entry2 : map.entrySet()) {
                        this.f8011l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) Assertions.m10153e(((C1119b) entry2.getValue()).mo7040e())).length()));
                    }
                }
            } else {
                m9664k(str, map).append((CharSequence) Assertions.m10153e(this.f8001b));
            }
        }
    }

    /* renamed from: a */
    public void mo7112a(TtmlNode dVar) {
        if (this.f8012m == null) {
            this.f8012m = new ArrayList();
        }
        this.f8012m.add(dVar);
    }

    /* renamed from: f */
    public TtmlNode mo7113f(int i) {
        List<TtmlNode> list = this.f8012m;
        if (list != null) {
            return (TtmlNode) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int mo7114g() {
        List<TtmlNode> list = this.f8012m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public List<Cue> mo7115h(long j, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2, Map<String, String> map3) {
        ArrayList<Pair> arrayList = new ArrayList<>();
        m9665n(j, this.f8007h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j2 = j;
        m9667p(j2, false, this.f8007h, treeMap);
        m9666o(j2, map, map2, this.f8007h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                TtmlRegion eVar = (TtmlRegion) Assertions.m10153e((TtmlRegion) map2.get(pair.first));
                arrayList2.add(new C1119b().mo7041f(BitmapFactory.decodeByteArray(decode, 0, decode.length)).mo7045j(eVar.f8014b).mo7046k(0).mo7043h(eVar.f8015c, 0).mo7044i(eVar.f8017e).mo7048m(eVar.f8018f).mo7042g(eVar.f8019g).mo7052q(eVar.f8022j).mo7036a());
            }
        }
        for (Entry entry : treeMap.entrySet()) {
            TtmlRegion eVar2 = (TtmlRegion) Assertions.m10153e((TtmlRegion) map2.get(entry.getKey()));
            C1119b bVar = (C1119b) entry.getValue();
            m9662e((SpannableStringBuilder) Assertions.m10153e(bVar.mo7040e()));
            bVar.mo7043h(eVar2.f8015c, eVar2.f8016d);
            bVar.mo7044i(eVar2.f8017e);
            bVar.mo7045j(eVar2.f8014b);
            bVar.mo7048m(eVar2.f8018f);
            bVar.mo7051p(eVar2.f8021i, eVar2.f8020h);
            bVar.mo7052q(eVar2.f8022j);
            arrayList2.add(bVar.mo7036a());
        }
        return arrayList2;
    }

    /* renamed from: j */
    public long[] mo7116j() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m9663i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            jArr[i] = ((Long) it.next()).longValue();
            i = i2;
        }
        return jArr;
    }

    /* renamed from: l */
    public String[] mo7117l() {
        return this.f8006g;
    }

    /* renamed from: m */
    public boolean mo7118m(long j) {
        long j2 = this.f8003d;
        return (j2 == -9223372036854775807L && this.f8004e == -9223372036854775807L) || (j2 <= j && this.f8004e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f8004e) || (j2 <= j && j < this.f8004e));
    }
}
