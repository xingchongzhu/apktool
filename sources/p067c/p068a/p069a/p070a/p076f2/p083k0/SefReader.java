package p067c.p068a.p069a.p070a.p076f2.p083k0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p076f2.ExtractorInput;
import p067c.p068a.p069a.p070a.p076f2.PositionHolder;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;
import p067c.p068a.p069a.p070a.p088h2.p094n.SlowMotionData;
import p067c.p068a.p069a.p070a.p088h2.p094n.SlowMotionData.C1061b;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p134b.p135a.Splitter;

/* renamed from: c.a.a.a.f2.k0.m */
final class SefReader {

    /* renamed from: a */
    private static final Splitter f6457a = Splitter.m11660d(':');

    /* renamed from: b */
    private static final Splitter f6458b = Splitter.m11660d('*');

    /* renamed from: c */
    private final List<C0960a> f6459c = new ArrayList();

    /* renamed from: d */
    private int f6460d = 0;

    /* renamed from: e */
    private int f6461e;

    /* renamed from: c.a.a.a.f2.k0.m$a */
    /* compiled from: SefReader */
    private static final class C0960a {

        /* renamed from: a */
        public final int f6462a;

        /* renamed from: b */
        public final long f6463b;

        /* renamed from: c */
        public final int f6464c;

        public C0960a(int i, long j, int i2) {
            this.f6462a = i;
            this.f6463b = j;
            this.f6464c = i2;
        }
    }

    /* renamed from: a */
    private void m7832a(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        ParsableByteArray a0Var = new ParsableByteArray(8);
        kVar.readFully(a0Var.mo7379d(), 0, 8);
        this.f6461e = a0Var.mo7392q() + 8;
        if (a0Var.mo7389n() != 1397048916) {
            xVar.f7015a = 0;
            return;
        }
        xVar.f7015a = kVar.mo6206q() - ((long) (this.f6461e - 12));
        this.f6460d = 2;
    }

    /* renamed from: b */
    private static int m7833b(String str) throws ParserException {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw new ParserException("Invalid SEF name");
        }
    }

    /* renamed from: d */
    private void m7834d(ExtractorInput kVar, PositionHolder xVar) throws IOException {
        long a = kVar.mo6194a();
        int i = (this.f6461e - 12) - 8;
        ParsableByteArray a0Var = new ParsableByteArray(i);
        kVar.readFully(a0Var.mo7379d(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            a0Var.mo7375Q(2);
            short s = a0Var.mo7394s();
            if (s == 2192 || s == 2816 || s == 2817 || s == 2819 || s == 2820) {
                this.f6459c.add(new C0960a(s, (a - ((long) this.f6461e)) - ((long) a0Var.mo7392q()), a0Var.mo7392q()));
            } else {
                a0Var.mo7375Q(8);
            }
        }
        if (this.f6459c.isEmpty()) {
            xVar.f7015a = 0;
            return;
        }
        this.f6460d = 3;
        xVar.f7015a = ((C0960a) this.f6459c.get(0)).f6463b;
    }

    /* renamed from: e */
    private void m7835e(ExtractorInput kVar, List<C1034b> list) throws IOException {
        long q = kVar.mo6206q();
        int a = (int) ((kVar.mo6194a() - kVar.mo6206q()) - ((long) this.f6461e));
        ParsableByteArray a0Var = new ParsableByteArray(a);
        kVar.readFully(a0Var.mo7379d(), 0, a);
        for (int i = 0; i < this.f6459c.size(); i++) {
            C0960a aVar = (C0960a) this.f6459c.get(i);
            a0Var.mo7374P((int) (aVar.f6463b - q));
            a0Var.mo7375Q(4);
            int q2 = a0Var.mo7392q();
            int b = m7833b(a0Var.mo7359A(q2));
            int i2 = aVar.f6464c - (q2 + 8);
            if (b == 2192) {
                list.add(m7836f(a0Var, i2));
            } else if (!(b == 2816 || b == 2817 || b == 2819 || b == 2820)) {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: f */
    private static SlowMotionData m7836f(ParsableByteArray a0Var, int i) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List f = f6458b.mo8108f(a0Var.mo7359A(i));
        int i2 = 0;
        while (i2 < f.size()) {
            List f2 = f6457a.mo8108f((CharSequence) f.get(i2));
            if (f2.size() == 3) {
                try {
                    C1061b bVar = new C1061b(Long.parseLong((String) f2.get(0)), Long.parseLong((String) f2.get(1)), 1 << (Integer.parseInt((String) f2.get(2)) - 1));
                    arrayList.add(bVar);
                    i2++;
                } catch (NumberFormatException e) {
                    throw new ParserException((Throwable) e);
                }
            } else {
                throw new ParserException();
            }
        }
        return new SlowMotionData(arrayList);
    }

    /* renamed from: c */
    public int mo6281c(ExtractorInput kVar, PositionHolder xVar, List<C1034b> list) throws IOException {
        int i = this.f6460d;
        long j = 0;
        if (i == 0) {
            long a = kVar.mo6194a();
            if (a != -1 && a >= 8) {
                j = a - 8;
            }
            xVar.f7015a = j;
            this.f6460d = 1;
        } else if (i == 1) {
            m7832a(kVar, xVar);
        } else if (i == 2) {
            m7834d(kVar, xVar);
        } else if (i == 3) {
            m7835e(kVar, list);
            xVar.f7015a = 0;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    /* renamed from: g */
    public void mo6282g() {
        this.f6459c.clear();
        this.f6460d = 0;
    }
}
