package p067c.p068a.p069a.p070a.p111m2;

import java.util.NoSuchElementException;

/* renamed from: c.a.a.a.m2.r */
public final class IntArrayQueue {

    /* renamed from: a */
    private int f8413a = 0;

    /* renamed from: b */
    private int f8414b = -1;

    /* renamed from: c */
    private int f8415c = 0;

    /* renamed from: d */
    private int[] f8416d;

    /* renamed from: e */
    private int f8417e;

    public IntArrayQueue() {
        int[] iArr = new int[16];
        this.f8416d = iArr;
        this.f8417e = iArr.length - 1;
    }

    /* renamed from: c */
    private void m10358c() {
        int[] iArr = this.f8416d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i = this.f8413a;
            int i2 = length2 - i;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f8416d, 0, iArr2, i2, i);
            this.f8413a = 0;
            this.f8414b = this.f8415c - 1;
            this.f8416d = iArr2;
            this.f8417e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public void mo7464a(int i) {
        if (this.f8415c == this.f8416d.length) {
            m10358c();
        }
        int i2 = (this.f8414b + 1) & this.f8417e;
        this.f8414b = i2;
        this.f8416d[i2] = i;
        this.f8415c++;
    }

    /* renamed from: b */
    public void mo7465b() {
        this.f8413a = 0;
        this.f8414b = -1;
        this.f8415c = 0;
    }

    /* renamed from: d */
    public boolean mo7466d() {
        return this.f8415c == 0;
    }

    /* renamed from: e */
    public int mo7467e() {
        int i = this.f8415c;
        if (i != 0) {
            int[] iArr = this.f8416d;
            int i2 = this.f8413a;
            int i3 = iArr[i2];
            this.f8413a = (i2 + 1) & this.f8417e;
            this.f8415c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }
}
