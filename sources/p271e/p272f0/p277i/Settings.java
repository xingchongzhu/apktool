package p271e.p272f0.p277i;

import java.util.Arrays;

/* renamed from: e.f0.i.m */
public final class Settings {

    /* renamed from: a */
    private int f18405a;

    /* renamed from: b */
    private final int[] f18406b = new int[10];

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19924a() {
        this.f18405a = 0;
        Arrays.fill(this.f18406b, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo19925b(int i) {
        return this.f18406b[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo19926c() {
        if ((this.f18405a & 2) != 0) {
            return this.f18406b[1];
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo19927d() {
        if ((this.f18405a & 128) != 0) {
            return this.f18406b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo19928e(int i) {
        return (this.f18405a & 16) != 0 ? this.f18406b[4] : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo19929f(int i) {
        return (this.f18405a & 32) != 0 ? this.f18406b[5] : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo19930g(int i) {
        return ((1 << i) & this.f18405a) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo19931h(Settings mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.mo19930g(i)) {
                mo19932i(i, mVar.mo19925b(i));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Settings mo19932i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f18406b;
            if (i < iArr.length) {
                this.f18405a = (1 << i) | this.f18405a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo19933j() {
        return Integer.bitCount(this.f18405a);
    }
}
