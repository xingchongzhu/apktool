package com.google.android.exoplayer2.upstream;

import java.util.Arrays;
import p067c.p068a.p069a.p070a.p111m2.Assertions;
import p067c.p068a.p069a.p070a.p111m2.Util;

/* renamed from: com.google.android.exoplayer2.upstream.q */
public final class DefaultAllocator implements Allocator {

    /* renamed from: a */
    private final boolean f12366a;

    /* renamed from: b */
    private final int f12367b;

    /* renamed from: c */
    private final byte[] f12368c;

    /* renamed from: d */
    private final Allocation[] f12369d;

    /* renamed from: e */
    private int f12370e;

    /* renamed from: f */
    private int f12371f;

    /* renamed from: g */
    private int f12372g;

    /* renamed from: h */
    private Allocation[] f12373h;

    public DefaultAllocator(boolean z, int i) {
        this(z, i, 0);
    }

    /* renamed from: a */
    public synchronized void mo14918a() {
        int i = 0;
        int max = Math.max(0, Util.m10297k(this.f12370e, this.f12367b) - this.f12371f);
        int i2 = this.f12372g;
        if (max < i2) {
            if (this.f12368c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    Allocation dVar = (Allocation) Assertions.m10153e(this.f12373h[i]);
                    if (dVar.f12299a == this.f12368c) {
                        i++;
                    } else {
                        Allocation dVar2 = (Allocation) Assertions.m10153e(this.f12373h[i3]);
                        if (dVar2.f12299a != this.f12368c) {
                            i3--;
                        } else {
                            Allocation[] dVarArr = this.f12373h;
                            int i4 = i + 1;
                            dVarArr[i] = dVar2;
                            int i5 = i3 - 1;
                            dVarArr[i3] = dVar;
                            i3 = i5;
                            i = i4;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f12372g) {
                    return;
                }
            }
            Arrays.fill(this.f12373h, max, this.f12372g, null);
            this.f12372g = max;
        }
    }

    /* renamed from: b */
    public synchronized void mo14919b(Allocation dVar) {
        Allocation[] dVarArr = this.f12369d;
        dVarArr[0] = dVar;
        mo14920c(dVarArr);
    }

    /* renamed from: c */
    public synchronized void mo14920c(Allocation[] dVarArr) {
        int i = this.f12372g;
        int length = dVarArr.length + i;
        Allocation[] dVarArr2 = this.f12373h;
        if (length >= dVarArr2.length) {
            this.f12373h = (Allocation[]) Arrays.copyOf(dVarArr2, Math.max(dVarArr2.length * 2, i + dVarArr.length));
        }
        for (Allocation dVar : dVarArr) {
            Allocation[] dVarArr3 = this.f12373h;
            int i2 = this.f12372g;
            this.f12372g = i2 + 1;
            dVarArr3[i2] = dVar;
        }
        this.f12371f -= dVarArr.length;
        notifyAll();
    }

    /* renamed from: d */
    public synchronized Allocation mo14921d() {
        Allocation dVar;
        this.f12371f++;
        int i = this.f12372g;
        if (i > 0) {
            Allocation[] dVarArr = this.f12373h;
            int i2 = i - 1;
            this.f12372g = i2;
            dVar = (Allocation) Assertions.m10153e(dVarArr[i2]);
            this.f12373h[this.f12372g] = null;
        } else {
            dVar = new Allocation(new byte[this.f12367b], 0);
        }
        return dVar;
    }

    /* renamed from: e */
    public int mo14922e() {
        return this.f12367b;
    }

    /* renamed from: f */
    public synchronized int mo14961f() {
        return this.f12371f * this.f12367b;
    }

    /* renamed from: g */
    public synchronized void mo14962g() {
        if (this.f12366a) {
            mo14963h(0);
        }
    }

    /* renamed from: h */
    public synchronized void mo14963h(int i) {
        boolean z = i < this.f12370e;
        this.f12370e = i;
        if (z) {
            mo14918a();
        }
    }

    public DefaultAllocator(boolean z, int i, int i2) {
        Assertions.m10149a(i > 0);
        Assertions.m10149a(i2 >= 0);
        this.f12366a = z;
        this.f12367b = i;
        this.f12372g = i2;
        this.f12373h = new Allocation[(i2 + 100)];
        if (i2 > 0) {
            this.f12368c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f12373h[i3] = new Allocation(this.f12368c, i3 * i);
            }
        } else {
            this.f12368c = null;
        }
        this.f12369d = new Allocation[1];
    }
}
