package p067c.google.p138c.p146m.p147b;

import java.lang.reflect.Array;

/* renamed from: c.a.c.m.b.a */
public final class BarcodeMatrix {

    /* renamed from: a */
    private final BarcodeRow[] f10100a;

    /* renamed from: b */
    private int f10101b;

    /* renamed from: c */
    private final int f10102c;

    /* renamed from: d */
    private final int f10103d;

    BarcodeMatrix(int i, int i2) {
        BarcodeRow[] bVarArr = new BarcodeRow[i];
        this.f10100a = bVarArr;
        int length = bVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f10100a[i3] = new BarcodeRow(((i2 + 4) * 17) + 1);
        }
        this.f10103d = i2 * 17;
        this.f10102c = i;
        this.f10101b = -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public BarcodeRow mo8636a() {
        return this.f10100a[this.f10101b];
    }

    /* renamed from: b */
    public byte[][] mo8637b(int i, int i2) {
        int i3 = this.f10102c * i2;
        int[] iArr = new int[2];
        iArr[1] = this.f10103d * i;
        iArr[0] = i3;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        int i4 = this.f10102c * i2;
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[(i4 - i5) - 1] = this.f10100a[i5 / i2].mo8640b(i);
        }
        return bArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo8638c() {
        this.f10101b++;
    }
}
