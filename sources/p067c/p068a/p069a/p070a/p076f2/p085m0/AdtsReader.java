package p067c.p068a.p069a.p070a.p076f2.p085m0;

import com.p259uc.crashsdk.export.LogType;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.Format.C1245b;
import p067c.p068a.p069a.p070a.ParserException;
import p067c.p068a.p069a.p070a.p072b2.AacUtil;
import p067c.p068a.p069a.p070a.p072b2.AacUtil.C0824b;
import p067c.p068a.p069a.p070a.p076f2.C0916b0;
import p067c.p068a.p069a.p070a.p076f2.DummyTrackOutput;
import p067c.p068a.p069a.p070a.p076f2.ExtractorOutput;
import p067c.p068a.p069a.p070a.p076f2.p085m0.TsPayloadReader.C0983d;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Log;
import p067c.p068a.p069a.p070a.p111m2.ParsableBitArray;
import p067c.p068a.p069a.p070a.p111m2.ParsableByteArray;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.f2.m0.k */
public final class AdtsReader implements ElementaryStreamReader {

    /* renamed from: a */
    private static final byte[] f6716a = {73, 68, 51};

    /* renamed from: b */
    private final boolean f6717b;

    /* renamed from: c */
    private final ParsableBitArray f6718c;

    /* renamed from: d */
    private final ParsableByteArray f6719d;

    /* renamed from: e */
    private final String f6720e;

    /* renamed from: f */
    private String f6721f;

    /* renamed from: g */
    private C0916b0 f6722g;

    /* renamed from: h */
    private C0916b0 f6723h;

    /* renamed from: i */
    private int f6724i;

    /* renamed from: j */
    private int f6725j;

    /* renamed from: k */
    private int f6726k;

    /* renamed from: l */
    private boolean f6727l;

    /* renamed from: m */
    private boolean f6728m;

    /* renamed from: n */
    private int f6729n;

    /* renamed from: o */
    private int f6730o;

    /* renamed from: p */
    private int f6731p;

    /* renamed from: q */
    private boolean f6732q;

    /* renamed from: r */
    private long f6733r;

    /* renamed from: s */
    private int f6734s;

    /* renamed from: t */
    private long f6735t;

    /* renamed from: u */
    private C0916b0 f6736u;

    /* renamed from: v */
    private long f6737v;

    public AdtsReader(boolean z) {
        this(z, null);
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    /* renamed from: b */
    private void m8074b() {
        Assertions.m10153e(this.f6722g);
        Util.m10293i(this.f6736u);
        Util.m10293i(this.f6723h);
    }

    /* renamed from: g */
    private void m8075g(ParsableByteArray a0Var) {
        if (a0Var.mo7376a() != 0) {
            this.f6718c.f8462a[0] = a0Var.mo7379d()[a0Var.mo7380e()];
            this.f6718c.mo7503p(2);
            int h = this.f6718c.mo7495h(4);
            int i = this.f6730o;
            if (i == -1 || h == i) {
                if (!this.f6728m) {
                    this.f6728m = true;
                    this.f6729n = this.f6731p;
                    this.f6730o = h;
                }
                m8087t();
                return;
            }
            m8084q();
        }
    }

    /* renamed from: h */
    private boolean m8076h(ParsableByteArray a0Var, int i) {
        a0Var.mo7374P(i + 1);
        boolean z = true;
        if (!m8090w(a0Var, this.f6718c.f8462a, 1)) {
            return false;
        }
        this.f6718c.mo7503p(4);
        int h = this.f6718c.mo7495h(1);
        int i2 = this.f6729n;
        if (i2 != -1 && h != i2) {
            return false;
        }
        if (this.f6730o != -1) {
            if (!m8090w(a0Var, this.f6718c.f8462a, 1)) {
                return true;
            }
            this.f6718c.mo7503p(2);
            if (this.f6718c.mo7495h(4) != this.f6730o) {
                return false;
            }
            a0Var.mo7374P(i + 2);
        }
        if (!m8090w(a0Var, this.f6718c.f8462a, 4)) {
            return true;
        }
        this.f6718c.mo7503p(14);
        int h2 = this.f6718c.mo7495h(13);
        if (h2 < 7) {
            return false;
        }
        byte[] d = a0Var.mo7379d();
        int f = a0Var.mo7381f();
        int i3 = i + h2;
        if (i3 >= f) {
            return true;
        }
        if (d[i3] == -1) {
            int i4 = i3 + 1;
            if (i4 == f) {
                return true;
            }
            if (!m8079l(-1, d[i4]) || ((d[i4] & 8) >> 3) != h) {
                z = false;
            }
            return z;
        } else if (d[i3] != 73) {
            return false;
        } else {
            int i5 = i3 + 1;
            if (i5 == f) {
                return true;
            }
            if (d[i5] != 68) {
                return false;
            }
            int i6 = i3 + 2;
            if (i6 == f) {
                return true;
            }
            if (d[i6] != 51) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: i */
    private boolean m8077i(ParsableByteArray a0Var, byte[] bArr, int i) {
        int min = Math.min(a0Var.mo7376a(), i - this.f6725j);
        a0Var.mo7385j(bArr, this.f6725j, min);
        int i2 = this.f6725j + min;
        this.f6725j = i2;
        return i2 == i;
    }

    /* renamed from: j */
    private void m8078j(ParsableByteArray a0Var) {
        byte[] d = a0Var.mo7379d();
        int e = a0Var.mo7380e();
        int f = a0Var.mo7381f();
        while (e < f) {
            int i = e + 1;
            byte b = d[e] & 255;
            if (this.f6726k != 512 || !m8079l(-1, (byte) b) || (!this.f6728m && !m8076h(a0Var, i - 2))) {
                int i2 = this.f6726k;
                byte b2 = b | i2;
                if (b2 == 329) {
                    this.f6726k = LogType.UNEXP_OTHER;
                } else if (b2 == 511) {
                    this.f6726k = 512;
                } else if (b2 == 836) {
                    this.f6726k = 1024;
                } else if (b2 == 1075) {
                    m8088u();
                    a0Var.mo7374P(i);
                    return;
                } else if (i2 != 256) {
                    this.f6726k = LogType.UNEXP;
                    i--;
                }
                e = i;
            } else {
                this.f6731p = (b & 8) >> 3;
                boolean z = true;
                if ((b & 1) != 0) {
                    z = false;
                }
                this.f6727l = z;
                if (!this.f6728m) {
                    m8085r();
                } else {
                    m8087t();
                }
                a0Var.mo7374P(i);
                return;
            }
        }
        a0Var.mo7374P(e);
    }

    /* renamed from: l */
    private boolean m8079l(byte b, byte b2) {
        return m8080m(((b & 255) << 8) | (b2 & 255));
    }

    /* renamed from: m */
    public static boolean m8080m(int i) {
        return (i & 65526) == 65520;
    }

    @RequiresNonNull({"output"})
    /* renamed from: n */
    private void m8081n() throws ParserException {
        this.f6718c.mo7503p(0);
        if (!this.f6732q) {
            int h = this.f6718c.mo7495h(2) + 1;
            if (h != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Detected audio object type: ");
                sb.append(h);
                sb.append(", but assuming AAC LC.");
                Log.m10386h("AdtsReader", sb.toString());
                h = 2;
            }
            this.f6718c.mo7505r(5);
            byte[] a = AacUtil.m6618a(h, this.f6730o, this.f6718c.mo7495h(3));
            C0824b f = AacUtil.m6623f(a);
            Format E = new C1245b().mo7693S(this.f6721f).mo7705e0("audio/mp4a-latm").mo7683I(f.f5523c).mo7682H(f.f5522b).mo7706f0(f.f5521a).mo7694T(Collections.singletonList(a)).mo7696V(this.f6720e).mo7679E();
            this.f6733r = 1024000000 / ((long) E.f8828z);
            this.f6722g.mo6177d(E);
            this.f6732q = true;
        } else {
            this.f6718c.mo7505r(10);
        }
        this.f6718c.mo7505r(4);
        int h2 = (this.f6718c.mo7495h(13) - 2) - 5;
        if (this.f6727l) {
            h2 -= 2;
        }
        m8089v(this.f6722g, this.f6733r, 0, h2);
    }

    @RequiresNonNull({"id3Output"})
    /* renamed from: o */
    private void m8082o() {
        this.f6723h.mo6174a(this.f6719d, 10);
        this.f6719d.mo7374P(6);
        m8089v(this.f6723h, 0, 10, this.f6719d.mo7361C() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    /* renamed from: p */
    private void m8083p(ParsableByteArray a0Var) {
        int min = Math.min(a0Var.mo7376a(), this.f6734s - this.f6725j);
        this.f6736u.mo6174a(a0Var, min);
        int i = this.f6725j + min;
        this.f6725j = i;
        int i2 = this.f6734s;
        if (i == i2) {
            this.f6736u.mo6176c(this.f6735t, 1, i2, 0, null);
            this.f6735t += this.f6737v;
            m8086s();
        }
    }

    /* renamed from: q */
    private void m8084q() {
        this.f6728m = false;
        m8086s();
    }

    /* renamed from: r */
    private void m8085r() {
        this.f6724i = 1;
        this.f6725j = 0;
    }

    /* renamed from: s */
    private void m8086s() {
        this.f6724i = 0;
        this.f6725j = 0;
        this.f6726k = LogType.UNEXP;
    }

    /* renamed from: t */
    private void m8087t() {
        this.f6724i = 3;
        this.f6725j = 0;
    }

    /* renamed from: u */
    private void m8088u() {
        this.f6724i = 2;
        this.f6725j = f6716a.length;
        this.f6734s = 0;
        this.f6719d.mo7374P(0);
    }

    /* renamed from: v */
    private void m8089v(C0916b0 b0Var, long j, int i, int i2) {
        this.f6724i = 4;
        this.f6725j = i;
        this.f6736u = b0Var;
        this.f6737v = j;
        this.f6734s = i2;
    }

    /* renamed from: w */
    private boolean m8090w(ParsableByteArray a0Var, byte[] bArr, int i) {
        if (a0Var.mo7376a() < i) {
            return false;
        }
        a0Var.mo7385j(bArr, 0, i);
        return true;
    }

    /* renamed from: a */
    public void mo6331a() {
        m8084q();
    }

    /* renamed from: c */
    public void mo6332c(ParsableByteArray a0Var) throws ParserException {
        m8074b();
        while (a0Var.mo7376a() > 0) {
            int i = this.f6724i;
            if (i == 0) {
                m8078j(a0Var);
            } else if (i == 1) {
                m8075g(a0Var);
            } else if (i != 2) {
                if (i == 3) {
                    if (m8077i(a0Var, this.f6718c.f8462a, this.f6727l ? 7 : 5)) {
                        m8081n();
                    }
                } else if (i == 4) {
                    m8083p(a0Var);
                } else {
                    throw new IllegalStateException();
                }
            } else if (m8077i(a0Var, this.f6719d.mo7379d(), 10)) {
                m8082o();
            }
        }
    }

    /* renamed from: d */
    public void mo6333d() {
    }

    /* renamed from: e */
    public void mo6334e(long j, int i) {
        this.f6735t = j;
    }

    /* renamed from: f */
    public void mo6335f(ExtractorOutput lVar, C0983d dVar) {
        dVar.mo6342a();
        this.f6721f = dVar.mo6343b();
        C0916b0 q = lVar.mo6218q(dVar.mo6344c(), 1);
        this.f6722g = q;
        this.f6736u = q;
        if (this.f6717b) {
            dVar.mo6342a();
            C0916b0 q2 = lVar.mo6218q(dVar.mo6344c(), 5);
            this.f6723h = q2;
            q2.mo6177d(new C1245b().mo7693S(dVar.mo6343b()).mo7705e0("application/id3").mo7679E());
            return;
        }
        this.f6723h = new DummyTrackOutput();
    }

    /* renamed from: k */
    public long mo6345k() {
        return this.f6733r;
    }

    public AdtsReader(boolean z, String str) {
        this.f6718c = new ParsableBitArray(new byte[7]);
        this.f6719d = new ParsableByteArray(Arrays.copyOf(f6716a, 10));
        m8086s();
        this.f6729n = -1;
        this.f6730o = -1;
        this.f6733r = -9223372036854775807L;
        this.f6717b = z;
        this.f6720e = str;
    }
}
