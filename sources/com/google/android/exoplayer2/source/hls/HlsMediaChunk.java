package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1842b;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1844d;
import com.google.android.exoplayer2.source.hls.p195v.HlsMediaPlaylist.C1845e;
import com.google.android.exoplayer2.upstream.C1916m;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DataSpec.C1919b;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData;
import p067c.p068a.p069a.p070a.p076f2.DefaultExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.p093m.Id3Decoder;
import p067c.p068a.p069a.p070a.p088h2.p093m.PrivFrame;
import p067c.p068a.p069a.p070a.p097j2.p099t0.MediaChunk;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.TimestampAdjuster;
import p067c.p068a.p069a.p070a.p111m2.UriUtil;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p134b.p136b.ImmutableList;

/* renamed from: com.google.android.exoplayer2.source.hls.m */
final class HlsMediaChunk extends MediaChunk {

    /* renamed from: k */
    private static final AtomicInteger f11609k = new AtomicInteger();

    /* renamed from: A */
    private final ParsableByteArray f11610A;

    /* renamed from: B */
    private final boolean f11611B;

    /* renamed from: C */
    private final boolean f11612C;

    /* renamed from: D */
    private HlsMediaChunkExtractor f11613D;

    /* renamed from: E */
    private HlsSampleStreamWrapper f11614E;

    /* renamed from: F */
    private int f11615F;

    /* renamed from: G */
    private boolean f11616G;

    /* renamed from: H */
    private volatile boolean f11617H;

    /* renamed from: I */
    private boolean f11618I;

    /* renamed from: J */
    private ImmutableList<Integer> f11619J;

    /* renamed from: K */
    private boolean f11620K;

    /* renamed from: L */
    private boolean f11621L;

    /* renamed from: l */
    public final int f11622l;

    /* renamed from: m */
    public final int f11623m;

    /* renamed from: n */
    public final Uri f11624n;

    /* renamed from: o */
    public final boolean f11625o;

    /* renamed from: p */
    public final int f11626p;

    /* renamed from: q */
    private final C1916m f11627q;

    /* renamed from: r */
    private final DataSpec f11628r;

    /* renamed from: s */
    private final HlsMediaChunkExtractor f11629s;

    /* renamed from: t */
    private final boolean f11630t;

    /* renamed from: u */
    private final boolean f11631u;

    /* renamed from: v */
    private final TimestampAdjuster f11632v;

    /* renamed from: w */
    private final HlsExtractorFactory f11633w;

    /* renamed from: x */
    private final List<Format> f11634x;

    /* renamed from: y */
    private final DrmInitData f11635y;

    /* renamed from: z */
    private final Id3Decoder f11636z;

    private HlsMediaChunk(HlsExtractorFactory kVar, C1916m mVar, DataSpec pVar, Format u0Var, boolean z, C1916m mVar2, DataSpec pVar2, boolean z2, Uri uri, List<Format> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, TimestampAdjuster j0Var, DrmInitData tVar, HlsMediaChunkExtractor nVar, Id3Decoder hVar, ParsableByteArray a0Var, boolean z6) {
        DataSpec pVar3 = pVar2;
        super(mVar, pVar, u0Var, i, obj, j, j2, j3);
        this.f11611B = z;
        this.f11626p = i2;
        this.f11621L = z3;
        this.f11623m = i3;
        this.f11628r = pVar3;
        this.f11627q = mVar2;
        this.f11616G = pVar3 != null;
        this.f11612C = z2;
        this.f11624n = uri;
        this.f11630t = z5;
        this.f11632v = j0Var;
        this.f11631u = z4;
        this.f11633w = kVar;
        this.f11634x = list;
        this.f11635y = tVar;
        this.f11629s = nVar;
        this.f11636z = hVar;
        this.f11610A = a0Var;
        this.f11625o = z6;
        this.f11619J = ImmutableList.m11917p();
        this.f11622l = f11609k.getAndIncrement();
    }

    /* renamed from: h */
    private static C1916m m14424h(C1916m mVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return mVar;
        }
        Assertions.m10153e(bArr2);
        return new Aes128DataSource(mVar, bArr, bArr2);
    }

    /* renamed from: i */
    public static HlsMediaChunk m14425i(HlsExtractorFactory kVar, C1916m mVar, Format u0Var, long j, HlsMediaPlaylist gVar, C1828e eVar, Uri uri, List<Format> list, int i, Object obj, boolean z, TimestampAdjusterProvider tVar, HlsMediaChunk mVar2, byte[] bArr, byte[] bArr2) {
        boolean z2;
        boolean z3;
        DataSpec pVar;
        C1916m mVar3;
        boolean z4;
        ParsableByteArray a0Var;
        Id3Decoder hVar;
        HlsMediaChunkExtractor nVar;
        int i2;
        HlsMediaChunkExtractor nVar2;
        C1916m mVar4 = mVar;
        HlsMediaPlaylist gVar2 = gVar;
        C1828e eVar2 = eVar;
        HlsMediaChunk mVar5 = mVar2;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        C1845e eVar3 = eVar2.f11602a;
        DataSpec a = new C1919b().mo14959i(UriUtil.m10226d(gVar2.f11834a, eVar3.f11818a)).mo14958h(eVar3.f11826i).mo14957g(eVar3.f11827j).mo14952b(eVar2.f11605d ? 8 : 0).mo14951a();
        boolean z5 = bArr3 != null;
        C1916m h = m14424h(mVar4, bArr3, z5 ? m14427k((String) Assertions.m10153e(eVar3.f11825h)) : null);
        C1844d dVar = eVar3.f11819b;
        if (dVar != null) {
            boolean z6 = bArr4 != null;
            byte[] k = z6 ? m14427k((String) Assertions.m10153e(dVar.f11825h)) : null;
            boolean z7 = z6;
            z2 = z5;
            pVar = new DataSpec(UriUtil.m10226d(gVar2.f11834a, dVar.f11818a), dVar.f11826i, dVar.f11827j);
            mVar3 = m14424h(mVar4, bArr4, k);
            z3 = z7;
        } else {
            z2 = z5;
            mVar3 = null;
            pVar = null;
            z3 = false;
        }
        long j2 = j + eVar3.f11822e;
        long j3 = j2 + eVar3.f11820c;
        int i3 = gVar2.f11798h + eVar3.f11821d;
        if (mVar5 != null) {
            boolean z8 = uri.equals(mVar5.f11624n) && mVar5.f11618I;
            Id3Decoder hVar2 = mVar5.f11636z;
            ParsableByteArray a0Var2 = mVar5.f11610A;
            int i4 = i3;
            boolean z9 = !(z8 || (m14428o(eVar2, gVar2) && j2 >= mVar5.f7646h));
            if (!z8 || mVar5.f11620K) {
                i2 = i4;
            } else {
                i2 = i4;
                if (mVar5.f11623m == i2) {
                    nVar2 = mVar5.f11613D;
                    z4 = z9;
                    nVar = nVar2;
                    hVar = hVar2;
                    a0Var = a0Var2;
                }
            }
            nVar2 = null;
            z4 = z9;
            nVar = nVar2;
            hVar = hVar2;
            a0Var = a0Var2;
        } else {
            Uri uri2 = uri;
            i2 = i3;
            hVar = new Id3Decoder();
            a0Var = new ParsableByteArray(10);
            nVar = null;
            z4 = false;
        }
        HlsMediaChunk mVar6 = new HlsMediaChunk(kVar, h, a, u0Var, z2, mVar3, pVar, z3, uri, list, i, obj, j2, j3, eVar2.f11603b, eVar2.f11604c, !eVar2.f11605d, i2, eVar3.f11828k, z, tVar.mo14652a(i2), eVar3.f11823f, nVar, hVar, a0Var, z4);
        return mVar6;
    }

    @RequiresNonNull({"output"})
    /* renamed from: j */
    private void m14426j(C1916m mVar, DataSpec pVar, boolean z) throws IOException {
        DataSpec pVar2;
        DefaultExtractorInput u;
        long q;
        long j;
        boolean z2 = false;
        if (z) {
            if (this.f11615F != 0) {
                z2 = true;
            }
            pVar2 = pVar;
        } else {
            pVar2 = pVar.mo14948e((long) this.f11615F);
        }
        try {
            u = m14432u(mVar, pVar2);
            if (z2) {
                u.mo6200i(this.f11615F);
            }
            do {
                if (!this.f11617H) {
                }
                break;
            } while (this.f11613D.mo14566a(u));
            break;
            q = u.mo6206q();
            j = pVar.f12351g;
        } catch (EOFException e) {
            if ((this.f7642d.f8807e & 16384) != 0) {
                this.f11613D.mo14569d();
                q = u.mo6206q();
                j = pVar.f12351g;
            } else {
                throw e;
            }
        } catch (Throwable th) {
            Util.m10299l(mVar);
            throw th;
        }
        this.f11615F = (int) (q - j);
        Util.m10299l(mVar);
    }

    /* renamed from: k */
    private static byte[] m14427k(String str) {
        if (Util.m10256J0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    /* renamed from: o */
    private static boolean m14428o(C1828e eVar, HlsMediaPlaylist gVar) {
        C1845e eVar2 = eVar.f11602a;
        if (!(eVar2 instanceof C1842b)) {
            return gVar.f11836c;
        }
        return ((C1842b) eVar2).f11811l || (eVar.f11604c == 0 && gVar.f11836c);
    }

    @RequiresNonNull({"output"})
    /* renamed from: r */
    private void m14429r() throws IOException {
        try {
            this.f11632v.mo7452h(this.f11630t, this.f7645g);
            m14426j(this.f7647i, this.f7640b, this.f11611B);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    @RequiresNonNull({"output"})
    /* renamed from: s */
    private void m14430s() throws IOException {
        if (this.f11616G) {
            Assertions.m10153e(this.f11627q);
            Assertions.m10153e(this.f11628r);
            m14426j(this.f11627q, this.f11628r, this.f11612C);
            this.f11615F = 0;
            this.f11616G = false;
        }
    }

    /* renamed from: t */
    private long m14431t(ExtractorInput kVar) throws IOException {
        kVar.mo6199h();
        try {
            this.f11610A.mo7370L(10);
            kVar.mo6204o(this.f11610A.mo7379d(), 0, 10);
            if (this.f11610A.mo7365G() != 4801587) {
                return -9223372036854775807L;
            }
            this.f11610A.mo7375Q(3);
            int C = this.f11610A.mo7361C();
            int i = C + 10;
            if (i > this.f11610A.mo7377b()) {
                byte[] d = this.f11610A.mo7379d();
                this.f11610A.mo7370L(i);
                System.arraycopy(d, 0, this.f11610A.mo7379d(), 0, 10);
            }
            kVar.mo6204o(this.f11610A.mo7379d(), 10, C);
            Metadata d2 = this.f11636z.mo6665d(this.f11610A.mo7379d(), C);
            if (d2 == null) {
                return -9223372036854775807L;
            }
            int o = d2.mo6552o();
            for (int i2 = 0; i2 < o; i2++) {
                C1034b n = d2.mo6551n(i2);
                if (n instanceof PrivFrame) {
                    PrivFrame lVar = (PrivFrame) n;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(lVar.f7308b)) {
                        System.arraycopy(lVar.f7309c, 0, this.f11610A.mo7379d(), 0, 8);
                        this.f11610A.mo7374P(0);
                        this.f11610A.mo7373O(8);
                        return this.f11610A.mo7398w() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    @RequiresNonNull({"output"})
    @EnsuresNonNull({"extractor"})
    /* renamed from: u */
    private DefaultExtractorInput m14432u(C1916m mVar, DataSpec pVar) throws IOException {
        HlsMediaChunkExtractor nVar;
        long j;
        DataSpec pVar2 = pVar;
        C1916m mVar2 = mVar;
        DefaultExtractorInput gVar = new DefaultExtractorInput(mVar2, pVar2.f12351g, mVar.mo7015e(pVar));
        if (this.f11613D == null) {
            long t = m14431t(gVar);
            gVar.mo6199h();
            HlsMediaChunkExtractor nVar2 = this.f11629s;
            if (nVar2 != null) {
                nVar = nVar2.mo14571f();
            } else {
                nVar = this.f11633w.mo14573a(pVar2.f12345a, this.f7642d, this.f11634x, this.f11632v, mVar.mo7016g(), gVar);
            }
            this.f11613D = nVar;
            if (nVar.mo14568c()) {
                HlsSampleStreamWrapper qVar = this.f11614E;
                if (t != -9223372036854775807L) {
                    j = this.f11632v.mo7447b(t);
                } else {
                    j = this.f7645g;
                }
                qVar.mo14625m0(j);
            } else {
                this.f11614E.mo14625m0(0);
            }
            this.f11614E.mo14615Y();
            this.f11613D.mo14567b(this.f11614E);
        }
        this.f11614E.mo14623j0(this.f11635y);
        return gVar;
    }

    /* renamed from: a */
    public void mo6893a() throws IOException {
        Assertions.m10153e(this.f11614E);
        if (this.f11613D == null) {
            HlsMediaChunkExtractor nVar = this.f11629s;
            if (nVar != null && nVar.mo14570e()) {
                this.f11613D = this.f11629s;
                this.f11616G = false;
            }
        }
        m14430s();
        if (!this.f11617H) {
            if (!this.f11631u) {
                m14429r();
            }
            this.f11618I = !this.f11617H;
        }
    }

    /* renamed from: c */
    public void mo6895c() {
        this.f11617H = true;
    }

    /* renamed from: l */
    public int mo14595l(int i) {
        Assertions.m10154f(!this.f11625o);
        if (i >= this.f11619J.size()) {
            return 0;
        }
        return ((Integer) this.f11619J.get(i)).intValue();
    }

    /* renamed from: m */
    public void mo14596m(HlsSampleStreamWrapper qVar, ImmutableList<Integer> rVar) {
        this.f11614E = qVar;
        this.f11619J = rVar;
    }

    /* renamed from: n */
    public void mo14597n() {
        this.f11620K = true;
    }

    /* renamed from: p */
    public boolean mo14598p() {
        return this.f11618I;
    }

    /* renamed from: q */
    public boolean mo14599q() {
        return this.f11621L;
    }

    /* renamed from: v */
    public void mo14600v() {
        this.f11621L = true;
    }
}
