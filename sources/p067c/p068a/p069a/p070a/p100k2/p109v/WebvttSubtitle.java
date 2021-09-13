package p067c.p068a.p069a.p070a.p100k2.p109v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p100k2.Cue;
import p067c.p068a.p069a.p070a.p100k2.Subtitle;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.v.k */
final class WebvttSubtitle implements Subtitle {

    /* renamed from: a */
    private final List<WebvttCueInfo> f8109a;

    /* renamed from: b */
    private final long[] f8110b;

    /* renamed from: c */
    private final long[] f8111c;

    public WebvttSubtitle(List<WebvttCueInfo> list) {
        this.f8109a = Collections.unmodifiableList(new ArrayList(list));
        this.f8110b = new long[(list.size() * 2)];
        for (int i = 0; i < list.size(); i++) {
            WebvttCueInfo gVar = (WebvttCueInfo) list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f8110b;
            jArr[i2] = gVar.f8080b;
            jArr[i2 + 1] = gVar.f8081c;
        }
        long[] jArr2 = this.f8110b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f8111c = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: a */
    public int mo7060a(long j) {
        int d = Util.m10283d(this.f8111c, j, false, false);
        if (d < this.f8111c.length) {
            return d;
        }
        return -1;
    }

    /* renamed from: b */
    public long mo7061b(int i) {
        boolean z = true;
        Assertions.m10149a(i >= 0);
        if (i >= this.f8111c.length) {
            z = false;
        }
        Assertions.m10149a(z);
        return this.f8111c[i];
    }

    /* renamed from: c */
    public List<Cue> mo7062c(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f8109a.size(); i++) {
            long[] jArr = this.f8110b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                WebvttCueInfo gVar = (WebvttCueInfo) this.f8109a.get(i);
                Cue cVar = gVar.f8079a;
                if (cVar.f7711e == -3.4028235E38f) {
                    arrayList2.add(gVar);
                } else {
                    arrayList.add(cVar);
                }
            }
        }
        Collections.sort(arrayList2, C1146b.f8056a);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((WebvttCueInfo) arrayList2.get(i3)).f8079a.mo7035a().mo7043h((float) (-1 - i3), 1).mo7036a());
        }
        return arrayList;
    }

    /* renamed from: d */
    public int mo7063d() {
        return this.f8111c.length;
    }
}
