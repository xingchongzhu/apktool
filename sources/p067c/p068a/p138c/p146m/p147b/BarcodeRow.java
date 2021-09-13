package p067c.p068a.p138c.p146m.p147b;

/* renamed from: c.a.c.m.b.b */
final class BarcodeRow {

    /* renamed from: a */
    private final byte[] f10104a;

    /* renamed from: b */
    private int f10105b = 0;

    BarcodeRow(int i) {
        this.f10104a = new byte[i];
    }

    /* renamed from: c */
    private void m12265c(int i, boolean z) {
        this.f10104a[i] = z ? (byte) 1 : 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8639a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f10105b;
            this.f10105b = i3 + 1;
            m12265c(i3, z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public byte[] mo8640b(int i) {
        int length = this.f10104a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f10104a[i2 / i];
        }
        return bArr;
    }
}
