package p271e.p272f0.p277i;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p271e.p272f0.C3310c;
import p281f.BufferedSource;
import p281f.ByteString;
import p281f.C3383c;
import p281f.Okio;
import p281f.Source;

/* renamed from: e.f0.i.d */
final class Hpack {

    /* renamed from: a */
    static final Header[] f18252a;

    /* renamed from: b */
    static final Map<ByteString, Integer> f18253b = m23240b();

    /* renamed from: e.f0.i.d$a */
    /* compiled from: Hpack */
    static final class C3328a {

        /* renamed from: a */
        private final List<Header> f18254a;

        /* renamed from: b */
        private final BufferedSource f18255b;

        /* renamed from: c */
        private final int f18256c;

        /* renamed from: d */
        private int f18257d;

        /* renamed from: e */
        Header[] f18258e;

        /* renamed from: f */
        int f18259f;

        /* renamed from: g */
        int f18260g;

        /* renamed from: h */
        int f18261h;

        C3328a(int i, Source sVar) {
            this(i, i, sVar);
        }

        /* renamed from: a */
        private void m23241a() {
            int i = this.f18257d;
            int i2 = this.f18261h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m23242b();
            } else {
                m23244d(i2 - i);
            }
        }

        /* renamed from: b */
        private void m23242b() {
            Arrays.fill(this.f18258e, null);
            this.f18259f = this.f18258e.length - 1;
            this.f18260g = 0;
            this.f18261h = 0;
        }

        /* renamed from: c */
        private int m23243c(int i) {
            return this.f18259f + 1 + i;
        }

        /* renamed from: d */
        private int m23244d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f18258e.length;
                while (true) {
                    length--;
                    i2 = this.f18259f;
                    if (length < i2 || i <= 0) {
                        Header[] cVarArr = this.f18258e;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f18260g);
                        this.f18259f += i3;
                    } else {
                        Header[] cVarArr2 = this.f18258e;
                        i -= cVarArr2[length].f18251i;
                        this.f18261h -= cVarArr2[length].f18251i;
                        this.f18260g--;
                        i3++;
                    }
                }
                Header[] cVarArr3 = this.f18258e;
                System.arraycopy(cVarArr3, i2 + 1, cVarArr3, i2 + 1 + i3, this.f18260g);
                this.f18259f += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private ByteString m23245f(int i) throws IOException {
            if (m23247h(i)) {
                return Hpack.f18252a[i].f18249g;
            }
            int c = m23243c(i - Hpack.f18252a.length);
            if (c >= 0) {
                Header[] cVarArr = this.f18258e;
                if (c < cVarArr.length) {
                    return cVarArr[c].f18249g;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* renamed from: g */
        private void m23246g(int i, Header cVar) {
            this.f18254a.add(cVar);
            int i2 = cVar.f18251i;
            if (i != -1) {
                i2 -= this.f18258e[m23243c(i)].f18251i;
            }
            int i3 = this.f18257d;
            if (i2 > i3) {
                m23242b();
                return;
            }
            int d = m23244d((this.f18261h + i2) - i3);
            if (i == -1) {
                int i4 = this.f18260g + 1;
                Header[] cVarArr = this.f18258e;
                if (i4 > cVarArr.length) {
                    Header[] cVarArr2 = new Header[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f18259f = this.f18258e.length - 1;
                    this.f18258e = cVarArr2;
                }
                int i5 = this.f18259f;
                this.f18259f = i5 - 1;
                this.f18258e[i5] = cVar;
                this.f18260g++;
            } else {
                this.f18258e[i + m23243c(i) + d] = cVar;
            }
            this.f18261h += i2;
        }

        /* renamed from: h */
        private boolean m23247h(int i) {
            return i >= 0 && i <= Hpack.f18252a.length - 1;
        }

        /* renamed from: i */
        private int m23248i() throws IOException {
            return this.f18255b.readByte() & 255;
        }

        /* renamed from: l */
        private void m23249l(int i) throws IOException {
            if (m23247h(i)) {
                this.f18254a.add(Hpack.f18252a[i]);
                return;
            }
            int c = m23243c(i - Hpack.f18252a.length);
            if (c >= 0) {
                Header[] cVarArr = this.f18258e;
                if (c < cVarArr.length) {
                    this.f18254a.add(cVarArr[c]);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* renamed from: n */
        private void m23250n(int i) throws IOException {
            m23246g(-1, new Header(m23245f(i), mo19831j()));
        }

        /* renamed from: o */
        private void m23251o() throws IOException {
            m23246g(-1, new Header(Hpack.m23239a(mo19831j()), mo19831j()));
        }

        /* renamed from: p */
        private void m23252p(int i) throws IOException {
            this.f18254a.add(new Header(m23245f(i), mo19831j()));
        }

        /* renamed from: q */
        private void m23253q() throws IOException {
            this.f18254a.add(new Header(Hpack.m23239a(mo19831j()), mo19831j()));
        }

        /* renamed from: e */
        public List<Header> mo19830e() {
            ArrayList arrayList = new ArrayList(this.f18254a);
            this.f18254a.clear();
            return arrayList;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public ByteString mo19831j() throws IOException {
            int i = m23248i();
            boolean z = (i & 128) == 128;
            int m = mo19833m(i, 127);
            if (z) {
                return ByteString.m23879j(Huffman.m23423f().mo19917c(this.f18255b.mo20219o((long) m)));
            }
            return this.f18255b.mo20194b((long) m);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo19832k() throws IOException {
            while (!this.f18255b.mo20217m()) {
                byte readByte = this.f18255b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m23249l(mo19833m(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m23251o();
                } else if ((readByte & 64) == 64) {
                    m23250n(mo19833m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m = mo19833m(readByte, 31);
                    this.f18257d = m;
                    if (m < 0 || m > this.f18256c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid dynamic table size update ");
                        sb.append(this.f18257d);
                        throw new IOException(sb.toString());
                    }
                    m23241a();
                } else if (readByte == 16 || readByte == 0) {
                    m23253q();
                } else {
                    m23252p(mo19833m(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public int mo19833m(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = m23248i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        C3328a(int i, int i2, Source sVar) {
            this.f18254a = new ArrayList();
            Header[] cVarArr = new Header[8];
            this.f18258e = cVarArr;
            this.f18259f = cVarArr.length - 1;
            this.f18260g = 0;
            this.f18261h = 0;
            this.f18256c = i;
            this.f18257d = i2;
            this.f18255b = Okio.m23920c(sVar);
        }
    }

    /* renamed from: e.f0.i.d$b */
    /* compiled from: Hpack */
    static final class C3329b {

        /* renamed from: a */
        private final C3383c f18262a;

        /* renamed from: b */
        private final boolean f18263b;

        /* renamed from: c */
        private int f18264c;

        /* renamed from: d */
        private boolean f18265d;

        /* renamed from: e */
        int f18266e;

        /* renamed from: f */
        int f18267f;

        /* renamed from: g */
        Header[] f18268g;

        /* renamed from: h */
        int f18269h;

        /* renamed from: i */
        int f18270i;

        /* renamed from: j */
        int f18271j;

        C3329b(C3383c cVar) {
            this(4096, true, cVar);
        }

        /* renamed from: a */
        private void m23258a() {
            int i = this.f18267f;
            int i2 = this.f18271j;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m23259b();
            } else {
                m23260c(i2 - i);
            }
        }

        /* renamed from: b */
        private void m23259b() {
            Arrays.fill(this.f18268g, null);
            this.f18269h = this.f18268g.length - 1;
            this.f18270i = 0;
            this.f18271j = 0;
        }

        /* renamed from: c */
        private int m23260c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f18268g.length;
                while (true) {
                    length--;
                    i2 = this.f18269h;
                    if (length < i2 || i <= 0) {
                        Header[] cVarArr = this.f18268g;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f18270i);
                        Header[] cVarArr2 = this.f18268g;
                        int i4 = this.f18269h;
                        Arrays.fill(cVarArr2, i4 + 1, i4 + 1 + i3, null);
                        this.f18269h += i3;
                    } else {
                        Header[] cVarArr3 = this.f18268g;
                        i -= cVarArr3[length].f18251i;
                        this.f18271j -= cVarArr3[length].f18251i;
                        this.f18270i--;
                        i3++;
                    }
                }
                Header[] cVarArr4 = this.f18268g;
                System.arraycopy(cVarArr4, i2 + 1, cVarArr4, i2 + 1 + i3, this.f18270i);
                Header[] cVarArr22 = this.f18268g;
                int i42 = this.f18269h;
                Arrays.fill(cVarArr22, i42 + 1, i42 + 1 + i3, null);
                this.f18269h += i3;
            }
            return i3;
        }

        /* renamed from: d */
        private void m23261d(Header cVar) {
            int i = cVar.f18251i;
            int i2 = this.f18267f;
            if (i > i2) {
                m23259b();
                return;
            }
            m23260c((this.f18271j + i) - i2);
            int i3 = this.f18270i + 1;
            Header[] cVarArr = this.f18268g;
            if (i3 > cVarArr.length) {
                Header[] cVarArr2 = new Header[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f18269h = this.f18268g.length - 1;
                this.f18268g = cVarArr2;
            }
            int i4 = this.f18269h;
            this.f18269h = i4 - 1;
            this.f18268g[i4] = cVar;
            this.f18270i++;
            this.f18271j += i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo19834e(int i) {
            this.f18266e = i;
            int min = Math.min(i, 16384);
            int i2 = this.f18267f;
            if (i2 != min) {
                if (min < i2) {
                    this.f18264c = Math.min(this.f18264c, min);
                }
                this.f18265d = true;
                this.f18267f = min;
                m23258a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo19835f(ByteString fVar) throws IOException {
            if (!this.f18263b || Huffman.m23423f().mo19919e(fVar) >= fVar.mo20248o()) {
                mo19837h(fVar.mo20248o(), 127, 0);
                this.f18262a.mo20190Y(fVar);
                return;
            }
            C3383c cVar = new C3383c();
            Huffman.m23423f().mo19918d(fVar, cVar);
            ByteString L = cVar.mo20181L();
            mo19837h(L.mo20248o(), 127, 128);
            this.f18262a.mo20190Y(L);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo19836g(List<Header> list) throws IOException {
            int i;
            int i2;
            if (this.f18265d) {
                int i3 = this.f18264c;
                if (i3 < this.f18267f) {
                    mo19837h(i3, 31, 32);
                }
                this.f18265d = false;
                this.f18264c = Integer.MAX_VALUE;
                mo19837h(this.f18267f, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Header cVar = (Header) list.get(i4);
                ByteString r = cVar.f18249g.mo20251r();
                ByteString fVar = cVar.f18250h;
                Integer num = (Integer) Hpack.f18253b.get(r);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        Header[] cVarArr = Hpack.f18252a;
                        if (C3310c.m23062p(cVarArr[i2 - 1].f18250h, fVar)) {
                            i = i2;
                        } else if (C3310c.m23062p(cVarArr[i2].f18250h, fVar)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f18269h + 1;
                    int length = this.f18268g.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (C3310c.m23062p(this.f18268g[i5].f18249g, r)) {
                            if (C3310c.m23062p(this.f18268g[i5].f18250h, fVar)) {
                                i2 = Hpack.f18252a.length + (i5 - this.f18269h);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f18269h) + Hpack.f18252a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    mo19837h(i2, 127, 128);
                } else if (i == -1) {
                    this.f18262a.mo20218n(64);
                    mo19835f(r);
                    mo19835f(fVar);
                    m23261d(cVar);
                } else if (!r.mo20249p(Header.f18243a) || Header.f18248f.equals(r)) {
                    mo19837h(i, 63, 64);
                    mo19835f(fVar);
                    m23261d(cVar);
                } else {
                    mo19837h(i, 15, 0);
                    mo19835f(fVar);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo19837h(int i, int i2, int i3) {
            if (i < i2) {
                this.f18262a.mo20218n(i | i3);
                return;
            }
            this.f18262a.mo20218n(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f18262a.mo20218n(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f18262a.mo20218n(i4);
        }

        C3329b(int i, boolean z, C3383c cVar) {
            this.f18264c = Integer.MAX_VALUE;
            Header[] cVarArr = new Header[8];
            this.f18268g = cVarArr;
            this.f18269h = cVarArr.length - 1;
            this.f18270i = 0;
            this.f18271j = 0;
            this.f18266e = i;
            this.f18267f = i;
            this.f18263b = z;
            this.f18262a = cVar;
        }
    }

    static {
        String str = "";
        ByteString fVar = Header.f18245c;
        ByteString fVar2 = Header.f18246d;
        ByteString fVar3 = Header.f18247e;
        ByteString fVar4 = Header.f18244b;
        f18252a = new Header[]{new Header(Header.f18248f, str), new Header(fVar, "GET"), new Header(fVar, "POST"), new Header(fVar2, "/"), new Header(fVar2, "/index.html"), new Header(fVar3, "http"), new Header(fVar3, "https"), new Header(fVar4, "200"), new Header(fVar4, "204"), new Header(fVar4, "206"), new Header(fVar4, "304"), new Header(fVar4, "400"), new Header(fVar4, "404"), new Header(fVar4, "500"), new Header("accept-charset", str), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", str), new Header("accept-ranges", str), new Header("accept", str), new Header("access-control-allow-origin", str), new Header("age", str), new Header("allow", str), new Header("authorization", str), new Header("cache-control", str), new Header("content-disposition", str), new Header("content-encoding", str), new Header("content-language", str), new Header("content-length", str), new Header("content-location", str), new Header("content-range", str), new Header("content-type", str), new Header("cookie", str), new Header("date", str), new Header("etag", str), new Header("expect", str), new Header("expires", str), new Header("from", str), new Header("host", str), new Header("if-match", str), new Header("if-modified-since", str), new Header("if-none-match", str), new Header("if-range", str), new Header("if-unmodified-since", str), new Header("last-modified", str), new Header("link", str), new Header("location", str), new Header("max-forwards", str), new Header("proxy-authenticate", str), new Header("proxy-authorization", str), new Header("range", str), new Header("referer", str), new Header("refresh", str), new Header("retry-after", str), new Header("server", str), new Header("set-cookie", str), new Header("strict-transport-security", str), new Header("transfer-encoding", str), new Header("user-agent", str), new Header("vary", str), new Header("via", str), new Header("www-authenticate", str)};
    }

    /* renamed from: a */
    static ByteString m23239a(ByteString fVar) throws IOException {
        int o = fVar.mo20248o();
        int i = 0;
        while (i < o) {
            byte h = fVar.mo20241h(i);
            if (h < 65 || h > 90) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(fVar.mo20253t());
                throw new IOException(sb.toString());
            }
        }
        return fVar;
    }

    /* renamed from: b */
    private static Map<ByteString, Integer> m23240b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f18252a.length);
        int i = 0;
        while (true) {
            Header[] cVarArr = f18252a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i].f18249g)) {
                linkedHashMap.put(cVarArr[i].f18249g, Integer.valueOf(i));
            }
            i++;
        }
    }
}
