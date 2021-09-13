package p067c.p068a.p069a.p070a.p076f2.p085m0;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0981b;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0982c;
import p067c.p068a.p069a.p070a.p111m2.CodecSpecificDataUtil;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p134b.p136b.ImmutableList;

/* renamed from: c.a.a.a.f2.m0.l */
public final class DefaultTsPayloadReaderFactory implements C0982c {

    /* renamed from: a */
    private final int f6740a;

    /* renamed from: b */
    private final List<Format> f6741b;

    public DefaultTsPayloadReaderFactory(int i) {
        this(i, ImmutableList.m11917p());
    }

    /* renamed from: c */
    private SeiReader m8099c(C0981b bVar) {
        return new SeiReader(m8101e(bVar));
    }

    /* renamed from: d */
    private UserDataReader m8100d(C0981b bVar) {
        return new UserDataReader(m8101e(bVar));
    }

    /* renamed from: e */
    private List<Format> m8101e(C0981b bVar) {
        String str;
        int i;
        if (m8102f(32)) {
            return this.f6741b;
        }
        ParsableByteArray a0Var = new ParsableByteArray(bVar.f6697d);
        List<Format> list = this.f6741b;
        while (a0Var.mo7376a() > 0) {
            int e = a0Var.mo7380e() + a0Var.mo7362D();
            if (a0Var.mo7362D() == 134) {
                list = new ArrayList<>();
                int D = a0Var.mo7362D() & 31;
                for (int i2 = 0; i2 < D; i2++) {
                    String A = a0Var.mo7359A(3);
                    int D2 = a0Var.mo7362D();
                    boolean z = true;
                    boolean z2 = (D2 & 128) != 0;
                    if (z2) {
                        i = D2 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte D3 = (byte) a0Var.mo7362D();
                    a0Var.mo7375Q(1);
                    List list2 = null;
                    if (z2) {
                        if ((D3 & 64) == 0) {
                            z = false;
                        }
                        list2 = CodecSpecificDataUtil.m10171b(z);
                    }
                    list.add(new C1245b().mo7705e0(str).mo7696V(A).mo7680F(i).mo7694T(list2).mo7679E());
                }
            }
            a0Var.mo7374P(e);
        }
        return list;
    }

    /* renamed from: f */
    private boolean m8102f(int i) {
        return (i & this.f6740a) != 0;
    }

    /* renamed from: a */
    public SparseArray<TsPayloadReader> mo6340a() {
        return new SparseArray<>();
    }

    /* renamed from: b */
    public TsPayloadReader mo6341b(int i, C0981b bVar) {
        if (i == 2) {
            return new PesReader(new H262Reader(m8100d(bVar)));
        }
        if (i == 3 || i == 4) {
            return new PesReader(new MpegAudioReader(bVar.f6695b));
        }
        if (i == 21) {
            return new PesReader(new Id3Reader());
        }
        TsPayloadReader i0Var = null;
        if (i == 27) {
            if (!m8102f(4)) {
                i0Var = new PesReader(new H264Reader(m8099c(bVar), m8102f(1), m8102f(8)));
            }
            return i0Var;
        } else if (i == 36) {
            return new PesReader(new H265Reader(m8099c(bVar)));
        } else {
            if (i == 89) {
                return new PesReader(new DvbSubtitleReader(bVar.f6696c));
            }
            if (i != 138) {
                if (i == 172) {
                    return new PesReader(new Ac4Reader(bVar.f6695b));
                }
                if (i == 257) {
                    return new SectionReader(new PassthroughSectionPayloadReader("application/vnd.dvb.ait"));
                }
                if (i != 129) {
                    if (i != 130) {
                        if (i == 134) {
                            if (!m8102f(16)) {
                                i0Var = new SectionReader(new PassthroughSectionPayloadReader("application/x-scte35"));
                            }
                            return i0Var;
                        } else if (i != 135) {
                            switch (i) {
                                case 15:
                                    if (!m8102f(2)) {
                                        i0Var = new PesReader(new AdtsReader(false, bVar.f6695b));
                                    }
                                    return i0Var;
                                case 16:
                                    return new PesReader(new H263Reader(m8100d(bVar)));
                                case 17:
                                    if (!m8102f(2)) {
                                        i0Var = new PesReader(new LatmReader(bVar.f6695b));
                                    }
                                    return i0Var;
                                default:
                                    return null;
                            }
                        }
                    } else if (!m8102f(64)) {
                        return null;
                    }
                }
                return new PesReader(new Ac3Reader(bVar.f6695b));
            }
            return new PesReader(new DtsReader(bVar.f6695b));
        }
    }

    public DefaultTsPayloadReaderFactory(int i, List<Format> list) {
        this.f6740a = i;
        this.f6741b = list;
    }
}
