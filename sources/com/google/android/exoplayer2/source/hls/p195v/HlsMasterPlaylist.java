package com.google.android.exoplayer2.source.hls.p195v;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData;
import p067c.p068a.p069a.p070a.p096i2.StreamKey;

/* renamed from: com.google.android.exoplayer2.source.hls.v.f */
public final class HlsMasterPlaylist extends HlsPlaylist {

    /* renamed from: d */
    public static final HlsMasterPlaylist f11773d;

    /* renamed from: e */
    public final List<Uri> f11774e;

    /* renamed from: f */
    public final List<C1840b> f11775f;

    /* renamed from: g */
    public final List<C1839a> f11776g;

    /* renamed from: h */
    public final List<C1839a> f11777h;

    /* renamed from: i */
    public final List<C1839a> f11778i;

    /* renamed from: j */
    public final List<C1839a> f11779j;

    /* renamed from: k */
    public final Format f11780k;

    /* renamed from: l */
    public final List<Format> f11781l;

    /* renamed from: m */
    public final Map<String, String> f11782m;

    /* renamed from: n */
    public final List<DrmInitData> f11783n;

    /* renamed from: com.google.android.exoplayer2.source.hls.v.f$a */
    /* compiled from: HlsMasterPlaylist */
    public static final class C1839a {

        /* renamed from: a */
        public final Uri f11784a;

        /* renamed from: b */
        public final Format f11785b;

        /* renamed from: c */
        public final String f11786c;

        /* renamed from: d */
        public final String f11787d;

        public C1839a(Uri uri, Format u0Var, String str, String str2) {
            this.f11784a = uri;
            this.f11785b = u0Var;
            this.f11786c = str;
            this.f11787d = str2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.v.f$b */
    /* compiled from: HlsMasterPlaylist */
    public static final class C1840b {

        /* renamed from: a */
        public final Uri f11788a;

        /* renamed from: b */
        public final Format f11789b;

        /* renamed from: c */
        public final String f11790c;

        /* renamed from: d */
        public final String f11791d;

        /* renamed from: e */
        public final String f11792e;

        /* renamed from: f */
        public final String f11793f;

        public C1840b(Uri uri, Format u0Var, String str, String str2, String str3, String str4) {
            this.f11788a = uri;
            this.f11789b = u0Var;
            this.f11790c = str;
            this.f11791d = str2;
            this.f11792e = str3;
            this.f11793f = str4;
        }

        /* renamed from: b */
        public static C1840b m14648b(Uri uri) {
            C1840b bVar = new C1840b(uri, new C1245b().mo7693S("0").mo7685K("application/x-mpegURL").mo7679E(), null, null, null, null);
            return bVar;
        }

        /* renamed from: a */
        public C1840b mo14683a(Format u0Var) {
            C1840b bVar = new C1840b(this.f11788a, u0Var, this.f11790c, this.f11791d, this.f11792e, this.f11793f);
            return bVar;
        }
    }

    static {
        HlsMasterPlaylist fVar = new HlsMasterPlaylist("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
        f11773d = fVar;
    }

    public HlsMasterPlaylist(String str, List<String> list, List<C1840b> list2, List<C1839a> list3, List<C1839a> list4, List<C1839a> list5, List<C1839a> list6, Format u0Var, List<Format> list7, boolean z, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z);
        this.f11774e = Collections.unmodifiableList(m14645f(list2, list3, list4, list5, list6));
        this.f11775f = Collections.unmodifiableList(list2);
        this.f11776g = Collections.unmodifiableList(list3);
        this.f11777h = Collections.unmodifiableList(list4);
        this.f11778i = Collections.unmodifiableList(list5);
        this.f11779j = Collections.unmodifiableList(list6);
        this.f11780k = u0Var;
        this.f11781l = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f11782m = Collections.unmodifiableMap(map);
        this.f11783n = Collections.unmodifiableList(list8);
    }

    /* renamed from: b */
    private static void m14642b(List<C1839a> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C1839a) list.get(i)).f11784a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: d */
    private static <T> List<T> m14643d(List<T> list, int i, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size()) {
                    break;
                }
                StreamKey cVar = (StreamKey) list2.get(i3);
                if (cVar.f7382b == i && cVar.f7383c == i2) {
                    arrayList.add(obj);
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static HlsMasterPlaylist m14644e(String str) {
        String str2 = "";
        HlsMasterPlaylist fVar = new HlsMasterPlaylist(str2, Collections.emptyList(), Collections.singletonList(C1840b.m14648b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        return fVar;
    }

    /* renamed from: f */
    private static List<Uri> m14645f(List<C1840b> list, List<C1839a> list2, List<C1839a> list3, List<C1839a> list4, List<C1839a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C1840b) list.get(i)).f11788a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m14642b(list2, arrayList);
        m14642b(list3, arrayList);
        m14642b(list4, arrayList);
        m14642b(list5, arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public HlsMasterPlaylist mo6780a(List<StreamKey> list) {
        HlsMasterPlaylist fVar = new HlsMasterPlaylist(this.f11834a, this.f11835b, m14643d(this.f11775f, 0, list), Collections.emptyList(), m14643d(this.f11777h, 1, list), m14643d(this.f11778i, 2, list), Collections.emptyList(), this.f11780k, this.f11781l, this.f11836c, this.f11782m, this.f11783n);
        return fVar;
    }
}
