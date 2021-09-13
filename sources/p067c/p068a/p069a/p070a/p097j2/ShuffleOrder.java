package p067c.p068a.p069a.p070a.p097j2;

import java.util.Arrays;
import java.util.Random;

/* renamed from: c.a.a.a.j2.n0 */
public interface ShuffleOrder {

    /* renamed from: c.a.a.a.j2.n0$a */
    /* compiled from: ShuffleOrder */
    public static class C1103a implements ShuffleOrder {

        /* renamed from: a */
        private final Random f7578a;

        /* renamed from: b */
        private final int[] f7579b;

        /* renamed from: c */
        private final int[] f7580c;

        public C1103a(int i) {
            this(i, new Random());
        }

        /* renamed from: i */
        private static int[] m9186i(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int nextInt = random.nextInt(i3);
                iArr[i2] = iArr[nextInt];
                iArr[nextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        /* renamed from: a */
        public int mo6958a() {
            return this.f7579b.length;
        }

        /* renamed from: b */
        public ShuffleOrder mo6959b(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[(this.f7579b.length - i3)];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f7579b;
                if (i4 >= iArr2.length) {
                    return new C1103a(iArr, new Random(this.f7578a.nextLong()));
                }
                if (iArr2[i4] < i || iArr2[i4] >= i2) {
                    iArr[i4 - i5] = iArr2[i4] >= i ? iArr2[i4] - i3 : iArr2[i4];
                } else {
                    i5++;
                }
                i4++;
            }
        }

        /* renamed from: c */
        public int mo6960c(int i) {
            int i2 = this.f7580c[i] + 1;
            int[] iArr = this.f7579b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        /* renamed from: d */
        public ShuffleOrder mo6961d(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f7578a.nextInt(this.f7579b.length + 1);
                int i5 = i4 + 1;
                int nextInt = this.f7578a.nextInt(i5);
                iArr2[i4] = iArr2[nextInt];
                iArr2[nextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.f7579b.length + i2)];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f7579b;
                if (i3 >= iArr4.length + i2) {
                    return new C1103a(iArr3, new Random(this.f7578a.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i8 = i7 + 1;
                    iArr3[i3] = iArr4[i7];
                    if (iArr3[i3] >= i) {
                        iArr3[i3] = iArr3[i3] + i2;
                    }
                    i7 = i8;
                } else {
                    int i9 = i6 + 1;
                    iArr3[i3] = iArr2[i6];
                    i6 = i9;
                }
                i3++;
            }
        }

        /* renamed from: e */
        public int mo6962e() {
            int[] iArr = this.f7579b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        /* renamed from: f */
        public int mo6963f(int i) {
            int i2 = this.f7580c[i] - 1;
            if (i2 >= 0) {
                return this.f7579b[i2];
            }
            return -1;
        }

        /* renamed from: g */
        public int mo6964g() {
            int[] iArr = this.f7579b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        /* renamed from: h */
        public ShuffleOrder mo6965h() {
            return new C1103a(0, new Random(this.f7578a.nextLong()));
        }

        private C1103a(int i, Random random) {
            this(m9186i(i, random), random);
        }

        private C1103a(int[] iArr, Random random) {
            this.f7579b = iArr;
            this.f7578a = random;
            this.f7580c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f7580c[iArr[i]] = i;
            }
        }
    }

    /* renamed from: a */
    int mo6958a();

    /* renamed from: b */
    ShuffleOrder mo6959b(int i, int i2);

    /* renamed from: c */
    int mo6960c(int i);

    /* renamed from: d */
    ShuffleOrder mo6961d(int i, int i2);

    /* renamed from: e */
    int mo6962e();

    /* renamed from: f */
    int mo6963f(int i);

    /* renamed from: g */
    int mo6964g();

    /* renamed from: h */
    ShuffleOrder mo6965h();
}
