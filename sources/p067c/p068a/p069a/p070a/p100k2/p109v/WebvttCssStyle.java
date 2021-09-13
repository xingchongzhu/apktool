package p067c.p068a.p069a.p070a.p100k2.p109v;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: c.a.a.a.k2.v.f */
public final class WebvttCssStyle {

    /* renamed from: a */
    private String f8062a;

    /* renamed from: b */
    private String f8063b;

    /* renamed from: c */
    private Set<String> f8064c = Collections.emptySet();

    /* renamed from: d */
    private String f8065d;

    /* renamed from: e */
    private String f8066e;

    /* renamed from: f */
    private int f8067f;

    /* renamed from: g */
    private boolean f8068g;

    /* renamed from: h */
    private int f8069h;

    /* renamed from: i */
    private boolean f8070i;

    /* renamed from: j */
    private int f8071j;

    /* renamed from: k */
    private int f8072k;

    /* renamed from: l */
    private int f8073l;

    /* renamed from: m */
    private int f8074m;

    /* renamed from: n */
    private int f8075n;

    /* renamed from: o */
    private float f8076o;

    /* renamed from: p */
    private int f8077p;

    /* renamed from: q */
    private boolean f8078q;

    public WebvttCssStyle() {
        String str = "";
        this.f8062a = str;
        this.f8063b = str;
        this.f8065d = str;
        this.f8066e = null;
        this.f8068g = false;
        this.f8070i = false;
        this.f8071j = -1;
        this.f8072k = -1;
        this.f8073l = -1;
        this.f8074m = -1;
        this.f8075n = -1;
        this.f8077p = -1;
        this.f8078q = false;
    }

    /* renamed from: z */
    private static int m9750z(int i, String str, String str2, int i2) {
        if (!str.isEmpty()) {
            int i3 = -1;
            if (i != -1) {
                if (str.equals(str2)) {
                    i3 = i + i2;
                }
                return i3;
            }
        }
        return i;
    }

    /* renamed from: a */
    public int mo7156a() {
        if (this.f8070i) {
            return this.f8069h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public boolean mo7157b() {
        return this.f8078q;
    }

    /* renamed from: c */
    public int mo7158c() {
        if (this.f8068g) {
            return this.f8067f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: d */
    public String mo7159d() {
        return this.f8066e;
    }

    /* renamed from: e */
    public float mo7160e() {
        return this.f8076o;
    }

    /* renamed from: f */
    public int mo7161f() {
        return this.f8075n;
    }

    /* renamed from: g */
    public int mo7162g() {
        return this.f8077p;
    }

    /* renamed from: h */
    public int mo7163h(String str, String str2, Set<String> set, String str3) {
        if (this.f8062a.isEmpty() && this.f8063b.isEmpty() && this.f8064c.isEmpty() && this.f8065d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int z = m9750z(m9750z(m9750z(0, this.f8062a, str, 1073741824), this.f8063b, str2, 2), this.f8065d, str3, 4);
        if (z == -1 || !set.containsAll(this.f8064c)) {
            return 0;
        }
        return z + (this.f8064c.size() * 4);
    }

    /* renamed from: i */
    public int mo7164i() {
        int i = this.f8073l;
        if (i == -1 && this.f8074m == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.f8074m == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    /* renamed from: j */
    public boolean mo7165j() {
        return this.f8070i;
    }

    /* renamed from: k */
    public boolean mo7166k() {
        return this.f8068g;
    }

    /* renamed from: l */
    public boolean mo7167l() {
        return this.f8071j == 1;
    }

    /* renamed from: m */
    public boolean mo7168m() {
        return this.f8072k == 1;
    }

    /* renamed from: n */
    public WebvttCssStyle mo7169n(int i) {
        this.f8069h = i;
        this.f8070i = true;
        return this;
    }

    /* renamed from: o */
    public WebvttCssStyle mo7170o(boolean z) {
        this.f8073l = z ? 1 : 0;
        return this;
    }

    /* renamed from: p */
    public WebvttCssStyle mo7171p(boolean z) {
        this.f8078q = z;
        return this;
    }

    /* renamed from: q */
    public WebvttCssStyle mo7172q(int i) {
        this.f8067f = i;
        this.f8068g = true;
        return this;
    }

    /* renamed from: r */
    public WebvttCssStyle mo7173r(String str) {
        this.f8066e = Util.m10256J0(str);
        return this;
    }

    /* renamed from: s */
    public WebvttCssStyle mo7174s(boolean z) {
        this.f8074m = z ? 1 : 0;
        return this;
    }

    /* renamed from: t */
    public WebvttCssStyle mo7175t(int i) {
        this.f8077p = i;
        return this;
    }

    /* renamed from: u */
    public void mo7176u(String[] strArr) {
        this.f8064c = new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: v */
    public void mo7177v(String str) {
        this.f8062a = str;
    }

    /* renamed from: w */
    public void mo7178w(String str) {
        this.f8063b = str;
    }

    /* renamed from: x */
    public void mo7179x(String str) {
        this.f8065d = str;
    }

    /* renamed from: y */
    public WebvttCssStyle mo7180y(boolean z) {
        this.f8072k = z ? 1 : 0;
        return this;
    }
}
