package com.fasterxml.jackson.core.sym;

public final class Name3 extends Name {

    /* renamed from: q1 */
    private final int f11516q1;

    /* renamed from: q2 */
    private final int f11517q2;

    /* renamed from: q3 */
    private final int f11518q3;

    Name3(String str, int i, int i2, int i3, int i4) {
        super(str, i);
        this.f11516q1 = i2;
        this.f11517q2 = i3;
        this.f11518q3 = i4;
    }

    public boolean equals(int i) {
        return false;
    }

    public boolean equals(int i, int i2) {
        return false;
    }

    public boolean equals(int i, int i2, int i3) {
        return this.f11516q1 == i && this.f11517q2 == i2 && this.f11518q3 == i3;
    }

    public boolean equals(int[] iArr, int i) {
        return i == 3 && iArr[0] == this.f11516q1 && iArr[1] == this.f11517q2 && iArr[2] == this.f11518q3;
    }
}
