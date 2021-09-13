package p067c.p068a.p069a.p070a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p067c.p068a.p069a.p070a.p075e2.DrmInitData;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaCrypto;
import p067c.p068a.p069a.p070a.p075e2.UnsupportedMediaCrypto;
import p067c.p068a.p069a.p070a.p088h2.Metadata;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.MimeTypes;
import p067c.p068a.p069a.p070a.p111m2.Util;
import p067c.p068a.p069a.p070a.p112n2.ColorInfo;

/* renamed from: c.a.a.a.u0 */
public final class Format implements Parcelable {
    public static final Creator<Format> CREATOR = new C1244a();

    /* renamed from: A */
    public final int f8797A;

    /* renamed from: B */
    public final int f8798B;

    /* renamed from: C */
    public final int f8799C;

    /* renamed from: D */
    public final int f8800D;

    /* renamed from: G */
    public final Class<? extends ExoMediaCrypto> f8801G;

    /* renamed from: H */
    private int f8802H;

    /* renamed from: a */
    public final String f8803a;

    /* renamed from: b */
    public final String f8804b;

    /* renamed from: c */
    public final String f8805c;

    /* renamed from: d */
    public final int f8806d;

    /* renamed from: e */
    public final int f8807e;

    /* renamed from: f */
    public final int f8808f;

    /* renamed from: g */
    public final int f8809g;

    /* renamed from: h */
    public final int f8810h;

    /* renamed from: i */
    public final String f8811i;

    /* renamed from: j */
    public final Metadata f8812j;

    /* renamed from: k */
    public final String f8813k;

    /* renamed from: l */
    public final String f8814l;

    /* renamed from: m */
    public final int f8815m;

    /* renamed from: n */
    public final List<byte[]> f8816n;

    /* renamed from: o */
    public final DrmInitData f8817o;

    /* renamed from: p */
    public final long f8818p;

    /* renamed from: q */
    public final int f8819q;

    /* renamed from: r */
    public final int f8820r;

    /* renamed from: s */
    public final float f8821s;

    /* renamed from: t */
    public final int f8822t;

    /* renamed from: u */
    public final float f8823u;

    /* renamed from: v */
    public final byte[] f8824v;

    /* renamed from: w */
    public final int f8825w;

    /* renamed from: x */
    public final ColorInfo f8826x;

    /* renamed from: y */
    public final int f8827y;

    /* renamed from: z */
    public final int f8828z;

    /* renamed from: c.a.a.a.u0$a */
    /* compiled from: Format */
    class C1244a implements Creator<Format> {
        C1244a() {
        }

        /* renamed from: a */
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        /* renamed from: b */
        public Format[] newArray(int i) {
            return new Format[i];
        }
    }

    /* renamed from: c.a.a.a.u0$b */
    /* compiled from: Format */
    public static final class C1245b {
        /* access modifiers changed from: private */

        /* renamed from: A */
        public int f8829A;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public int f8830B;
        /* access modifiers changed from: private */

        /* renamed from: C */
        public int f8831C;
        /* access modifiers changed from: private */

        /* renamed from: D */
        public Class<? extends ExoMediaCrypto> f8832D;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f8833a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f8834b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f8835c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f8836d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f8837e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f8838f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f8839g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f8840h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public Metadata f8841i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public String f8842j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public String f8843k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f8844l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public List<byte[]> f8845m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public DrmInitData f8846n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public long f8847o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f8848p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public int f8849q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public float f8850r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public int f8851s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public float f8852t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public byte[] f8853u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public int f8854v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public ColorInfo f8855w;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public int f8856x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public int f8857y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public int f8858z;

        /* synthetic */ C1245b(Format u0Var, C1244a aVar) {
            this(u0Var);
        }

        /* renamed from: E */
        public Format mo7679E() {
            return new Format(this, null);
        }

        /* renamed from: F */
        public C1245b mo7680F(int i) {
            this.f8831C = i;
            return this;
        }

        /* renamed from: G */
        public C1245b mo7681G(int i) {
            this.f8838f = i;
            return this;
        }

        /* renamed from: H */
        public C1245b mo7682H(int i) {
            this.f8856x = i;
            return this;
        }

        /* renamed from: I */
        public C1245b mo7683I(String str) {
            this.f8840h = str;
            return this;
        }

        /* renamed from: J */
        public C1245b mo7684J(ColorInfo kVar) {
            this.f8855w = kVar;
            return this;
        }

        /* renamed from: K */
        public C1245b mo7685K(String str) {
            this.f8842j = str;
            return this;
        }

        /* renamed from: L */
        public C1245b mo7686L(DrmInitData tVar) {
            this.f8846n = tVar;
            return this;
        }

        /* renamed from: M */
        public C1245b mo7687M(int i) {
            this.f8829A = i;
            return this;
        }

        /* renamed from: N */
        public C1245b mo7688N(int i) {
            this.f8830B = i;
            return this;
        }

        /* renamed from: O */
        public C1245b mo7689O(Class<? extends ExoMediaCrypto> cls) {
            this.f8832D = cls;
            return this;
        }

        /* renamed from: P */
        public C1245b mo7690P(float f) {
            this.f8850r = f;
            return this;
        }

        /* renamed from: Q */
        public C1245b mo7691Q(int i) {
            this.f8849q = i;
            return this;
        }

        /* renamed from: R */
        public C1245b mo7692R(int i) {
            this.f8833a = Integer.toString(i);
            return this;
        }

        /* renamed from: S */
        public C1245b mo7693S(String str) {
            this.f8833a = str;
            return this;
        }

        /* renamed from: T */
        public C1245b mo7694T(List<byte[]> list) {
            this.f8845m = list;
            return this;
        }

        /* renamed from: U */
        public C1245b mo7695U(String str) {
            this.f8834b = str;
            return this;
        }

        /* renamed from: V */
        public C1245b mo7696V(String str) {
            this.f8835c = str;
            return this;
        }

        /* renamed from: W */
        public C1245b mo7697W(int i) {
            this.f8844l = i;
            return this;
        }

        /* renamed from: X */
        public C1245b mo7698X(Metadata aVar) {
            this.f8841i = aVar;
            return this;
        }

        /* renamed from: Y */
        public C1245b mo7699Y(int i) {
            this.f8858z = i;
            return this;
        }

        /* renamed from: Z */
        public C1245b mo7700Z(int i) {
            this.f8839g = i;
            return this;
        }

        /* renamed from: a0 */
        public C1245b mo7701a0(float f) {
            this.f8852t = f;
            return this;
        }

        /* renamed from: b0 */
        public C1245b mo7702b0(byte[] bArr) {
            this.f8853u = bArr;
            return this;
        }

        /* renamed from: c0 */
        public C1245b mo7703c0(int i) {
            this.f8837e = i;
            return this;
        }

        /* renamed from: d0 */
        public C1245b mo7704d0(int i) {
            this.f8851s = i;
            return this;
        }

        /* renamed from: e0 */
        public C1245b mo7705e0(String str) {
            this.f8843k = str;
            return this;
        }

        /* renamed from: f0 */
        public C1245b mo7706f0(int i) {
            this.f8857y = i;
            return this;
        }

        /* renamed from: g0 */
        public C1245b mo7707g0(int i) {
            this.f8836d = i;
            return this;
        }

        /* renamed from: h0 */
        public C1245b mo7708h0(int i) {
            this.f8854v = i;
            return this;
        }

        /* renamed from: i0 */
        public C1245b mo7709i0(long j) {
            this.f8847o = j;
            return this;
        }

        /* renamed from: j0 */
        public C1245b mo7710j0(int i) {
            this.f8848p = i;
            return this;
        }

        public C1245b() {
            this.f8838f = -1;
            this.f8839g = -1;
            this.f8844l = -1;
            this.f8847o = Long.MAX_VALUE;
            this.f8848p = -1;
            this.f8849q = -1;
            this.f8850r = -1.0f;
            this.f8852t = 1.0f;
            this.f8854v = -1;
            this.f8856x = -1;
            this.f8857y = -1;
            this.f8858z = -1;
            this.f8831C = -1;
        }

        private C1245b(Format u0Var) {
            this.f8833a = u0Var.f8803a;
            this.f8834b = u0Var.f8804b;
            this.f8835c = u0Var.f8805c;
            this.f8836d = u0Var.f8806d;
            this.f8837e = u0Var.f8807e;
            this.f8838f = u0Var.f8808f;
            this.f8839g = u0Var.f8809g;
            this.f8840h = u0Var.f8811i;
            this.f8841i = u0Var.f8812j;
            this.f8842j = u0Var.f8813k;
            this.f8843k = u0Var.f8814l;
            this.f8844l = u0Var.f8815m;
            this.f8845m = u0Var.f8816n;
            this.f8846n = u0Var.f8817o;
            this.f8847o = u0Var.f8818p;
            this.f8848p = u0Var.f8819q;
            this.f8849q = u0Var.f8820r;
            this.f8850r = u0Var.f8821s;
            this.f8851s = u0Var.f8822t;
            this.f8852t = u0Var.f8823u;
            this.f8853u = u0Var.f8824v;
            this.f8854v = u0Var.f8825w;
            this.f8855w = u0Var.f8826x;
            this.f8856x = u0Var.f8827y;
            this.f8857y = u0Var.f8828z;
            this.f8858z = u0Var.f8797A;
            this.f8829A = u0Var.f8798B;
            this.f8830B = u0Var.f8799C;
            this.f8831C = u0Var.f8800D;
            this.f8832D = u0Var.f8801G;
        }
    }

    /* synthetic */ Format(C1245b bVar, C1244a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format u0Var = (Format) obj;
        int i = this.f8802H;
        if (i != 0) {
            int i2 = u0Var.f8802H;
            if (!(i2 == 0 || i == i2)) {
                return false;
            }
        }
        if (!(this.f8806d == u0Var.f8806d && this.f8807e == u0Var.f8807e && this.f8808f == u0Var.f8808f && this.f8809g == u0Var.f8809g && this.f8815m == u0Var.f8815m && this.f8818p == u0Var.f8818p && this.f8819q == u0Var.f8819q && this.f8820r == u0Var.f8820r && this.f8822t == u0Var.f8822t && this.f8825w == u0Var.f8825w && this.f8827y == u0Var.f8827y && this.f8828z == u0Var.f8828z && this.f8797A == u0Var.f8797A && this.f8798B == u0Var.f8798B && this.f8799C == u0Var.f8799C && this.f8800D == u0Var.f8800D && Float.compare(this.f8821s, u0Var.f8821s) == 0 && Float.compare(this.f8823u, u0Var.f8823u) == 0 && Util.m10279b(this.f8801G, u0Var.f8801G) && Util.m10279b(this.f8803a, u0Var.f8803a) && Util.m10279b(this.f8804b, u0Var.f8804b) && Util.m10279b(this.f8811i, u0Var.f8811i) && Util.m10279b(this.f8813k, u0Var.f8813k) && Util.m10279b(this.f8814l, u0Var.f8814l) && Util.m10279b(this.f8805c, u0Var.f8805c) && Arrays.equals(this.f8824v, u0Var.f8824v) && Util.m10279b(this.f8812j, u0Var.f8812j) && Util.m10279b(this.f8826x, u0Var.f8826x) && Util.m10279b(this.f8817o, u0Var.f8817o) && mo7671o(u0Var))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f8802H == 0) {
            String str = this.f8803a;
            int i = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f8804b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f8805c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f8806d) * 31) + this.f8807e) * 31) + this.f8808f) * 31) + this.f8809g) * 31;
            String str4 = this.f8811i;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata aVar = this.f8812j;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.f8813k;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f8814l;
            int hashCode7 = (((((((((((((((((((((((((((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f8815m) * 31) + ((int) this.f8818p)) * 31) + this.f8819q) * 31) + this.f8820r) * 31) + Float.floatToIntBits(this.f8821s)) * 31) + this.f8822t) * 31) + Float.floatToIntBits(this.f8823u)) * 31) + this.f8825w) * 31) + this.f8827y) * 31) + this.f8828z) * 31) + this.f8797A) * 31) + this.f8798B) * 31) + this.f8799C) * 31) + this.f8800D) * 31;
            Class<? extends ExoMediaCrypto> cls = this.f8801G;
            if (cls != null) {
                i = cls.hashCode();
            }
            this.f8802H = hashCode7 + i;
        }
        return this.f8802H;
    }

    /* renamed from: l */
    public C1245b mo7668l() {
        return new C1245b(this, null);
    }

    /* renamed from: m */
    public Format mo7669m(Class<? extends ExoMediaCrypto> cls) {
        return mo7668l().mo7689O(cls).mo7679E();
    }

    /* renamed from: n */
    public int mo7670n() {
        int i = this.f8819q;
        if (i == -1) {
            return -1;
        }
        int i2 = this.f8820r;
        if (i2 == -1) {
            return -1;
        }
        return i * i2;
    }

    /* renamed from: o */
    public boolean mo7671o(Format u0Var) {
        if (this.f8816n.size() != u0Var.f8816n.size()) {
            return false;
        }
        for (int i = 0; i < this.f8816n.size(); i++) {
            if (!Arrays.equals((byte[]) this.f8816n.get(i), (byte[]) u0Var.f8816n.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public Format mo7672p(Format u0Var) {
        Metadata aVar;
        if (this == u0Var) {
            return this;
        }
        int k = MimeTypes.m10405k(this.f8814l);
        String str = u0Var.f8803a;
        String str2 = u0Var.f8804b;
        if (str2 == null) {
            str2 = this.f8804b;
        }
        String str3 = this.f8805c;
        if (k == 3 || k == 1) {
            String str4 = u0Var.f8805c;
            if (str4 != null) {
                str3 = str4;
            }
        }
        int i = this.f8808f;
        if (i == -1) {
            i = u0Var.f8808f;
        }
        int i2 = this.f8809g;
        if (i2 == -1) {
            i2 = u0Var.f8809g;
        }
        String str5 = this.f8811i;
        if (str5 == null) {
            String G = Util.m10249G(u0Var.f8811i, k);
            if (Util.m10248F0(G).length == 1) {
                str5 = G;
            }
        }
        Metadata aVar2 = this.f8812j;
        if (aVar2 == null) {
            aVar = u0Var.f8812j;
        } else {
            aVar = aVar2.mo6550m(u0Var.f8812j);
        }
        float f = this.f8821s;
        if (f == -1.0f && k == 2) {
            f = u0Var.f8821s;
        }
        int i3 = this.f8806d | u0Var.f8806d;
        int i4 = this.f8807e | u0Var.f8807e;
        return mo7668l().mo7693S(str).mo7695U(str2).mo7696V(str3).mo7707g0(i3).mo7703c0(i4).mo7681G(i).mo7700Z(i2).mo7683I(str5).mo7698X(aVar).mo7686L(DrmInitData.m7155o(u0Var.f8817o, this.f8817o)).mo7690P(f).mo7679E();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Format(");
        sb.append(this.f8803a);
        String str = ", ";
        sb.append(str);
        sb.append(this.f8804b);
        sb.append(str);
        sb.append(this.f8813k);
        sb.append(str);
        sb.append(this.f8814l);
        sb.append(str);
        sb.append(this.f8811i);
        sb.append(str);
        sb.append(this.f8810h);
        sb.append(str);
        sb.append(this.f8805c);
        sb.append(", [");
        sb.append(this.f8819q);
        sb.append(str);
        sb.append(this.f8820r);
        sb.append(str);
        sb.append(this.f8821s);
        sb.append("], [");
        sb.append(this.f8827y);
        sb.append(str);
        sb.append(this.f8828z);
        sb.append("])");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8803a);
        parcel.writeString(this.f8804b);
        parcel.writeString(this.f8805c);
        parcel.writeInt(this.f8806d);
        parcel.writeInt(this.f8807e);
        parcel.writeInt(this.f8808f);
        parcel.writeInt(this.f8809g);
        parcel.writeString(this.f8811i);
        boolean z = false;
        parcel.writeParcelable(this.f8812j, 0);
        parcel.writeString(this.f8813k);
        parcel.writeString(this.f8814l);
        parcel.writeInt(this.f8815m);
        int size = this.f8816n.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.f8816n.get(i2));
        }
        parcel.writeParcelable(this.f8817o, 0);
        parcel.writeLong(this.f8818p);
        parcel.writeInt(this.f8819q);
        parcel.writeInt(this.f8820r);
        parcel.writeFloat(this.f8821s);
        parcel.writeInt(this.f8822t);
        parcel.writeFloat(this.f8823u);
        if (this.f8824v != null) {
            z = true;
        }
        Util.m10264N0(parcel, z);
        byte[] bArr = this.f8824v;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f8825w);
        parcel.writeParcelable(this.f8826x, i);
        parcel.writeInt(this.f8827y);
        parcel.writeInt(this.f8828z);
        parcel.writeInt(this.f8797A);
        parcel.writeInt(this.f8798B);
        parcel.writeInt(this.f8799C);
        parcel.writeInt(this.f8800D);
    }

    private Format(C1245b bVar) {
        this.f8803a = bVar.f8833a;
        this.f8804b = bVar.f8834b;
        this.f8805c = Util.m10314s0(bVar.f8835c);
        this.f8806d = bVar.f8836d;
        this.f8807e = bVar.f8837e;
        int A = bVar.f8838f;
        this.f8808f = A;
        int B = bVar.f8839g;
        this.f8809g = B;
        if (B != -1) {
            A = B;
        }
        this.f8810h = A;
        this.f8811i = bVar.f8840h;
        this.f8812j = bVar.f8841i;
        this.f8813k = bVar.f8842j;
        this.f8814l = bVar.f8843k;
        this.f8815m = bVar.f8844l;
        this.f8816n = bVar.f8845m == null ? Collections.emptyList() : bVar.f8845m;
        DrmInitData f = bVar.f8846n;
        this.f8817o = f;
        this.f8818p = bVar.f8847o;
        this.f8819q = bVar.f8848p;
        this.f8820r = bVar.f8849q;
        this.f8821s = bVar.f8850r;
        int i = 0;
        this.f8822t = bVar.f8851s == -1 ? 0 : bVar.f8851s;
        this.f8823u = bVar.f8852t == -1.0f ? 1.0f : bVar.f8852t;
        this.f8824v = bVar.f8853u;
        this.f8825w = bVar.f8854v;
        this.f8826x = bVar.f8855w;
        this.f8827y = bVar.f8856x;
        this.f8828z = bVar.f8857y;
        this.f8797A = bVar.f8858z;
        this.f8798B = bVar.f8829A == -1 ? 0 : bVar.f8829A;
        if (bVar.f8830B != -1) {
            i = bVar.f8830B;
        }
        this.f8799C = i;
        this.f8800D = bVar.f8831C;
        if (bVar.f8832D != null || f == null) {
            this.f8801G = bVar.f8832D;
        } else {
            this.f8801G = UnsupportedMediaCrypto.class;
        }
    }

    Format(Parcel parcel) {
        this.f8803a = parcel.readString();
        this.f8804b = parcel.readString();
        this.f8805c = parcel.readString();
        this.f8806d = parcel.readInt();
        this.f8807e = parcel.readInt();
        int readInt = parcel.readInt();
        this.f8808f = readInt;
        int readInt2 = parcel.readInt();
        this.f8809g = readInt2;
        if (readInt2 != -1) {
            readInt = readInt2;
        }
        this.f8810h = readInt;
        this.f8811i = parcel.readString();
        this.f8812j = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.f8813k = parcel.readString();
        this.f8814l = parcel.readString();
        this.f8815m = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.f8816n = new ArrayList(readInt3);
        for (int i = 0; i < readInt3; i++) {
            this.f8816n.add((byte[]) Assertions.m10153e(parcel.createByteArray()));
        }
        DrmInitData tVar = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f8817o = tVar;
        this.f8818p = parcel.readLong();
        this.f8819q = parcel.readInt();
        this.f8820r = parcel.readInt();
        this.f8821s = parcel.readFloat();
        this.f8822t = parcel.readInt();
        this.f8823u = parcel.readFloat();
        Class<UnsupportedMediaCrypto> cls = null;
        this.f8824v = Util.m10328z0(parcel) ? parcel.createByteArray() : null;
        this.f8825w = parcel.readInt();
        this.f8826x = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f8827y = parcel.readInt();
        this.f8828z = parcel.readInt();
        this.f8797A = parcel.readInt();
        this.f8798B = parcel.readInt();
        this.f8799C = parcel.readInt();
        this.f8800D = parcel.readInt();
        if (tVar != null) {
            cls = UnsupportedMediaCrypto.class;
        }
        this.f8801G = cls;
    }
}
