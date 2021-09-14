package p067c.google.p138c.p139i.p140b;

import com.crashsdk.export.LogType;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: c.a.c.i.b.d */
public final class HighLevelEncoder {

    /* renamed from: a */
    static final String[] f9967a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: b */
    static final int[][] f9968b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: c */
    private static final int[][] f9969c;

    /* renamed from: d */
    static final int[][] f9970d;

    /* renamed from: e */
    private final byte[] f9971e;

    /* renamed from: c.a.c.i.b.d$a */
    /* compiled from: HighLevelEncoder */
    class C1396a implements Comparator<State> {
        C1396a() {
        }

        /* renamed from: a */
        public int compare(State fVar, State fVar2) {
            return fVar.mo8543e() - fVar2.mo8543e();
        }
    }

    static {
        Class<int> cls = int.class;
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{5, LogType.UNEXP});
        f9969c = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f9969c[0][i] = (i - 65) + 2;
        }
        f9969c[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f9969c[1][i2] = (i2 - 97) + 2;
        }
        f9969c[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f9969c[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = f9969c;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f9969c[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                f9969c[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(cls, new int[]{6, 6});
        f9970d = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f9970d;
        iArr6[0][4] = 0;
        iArr6[1][4] = 0;
        iArr6[1][0] = 28;
        iArr6[3][4] = 0;
        iArr6[2][4] = 0;
        iArr6[2][0] = 15;
    }

    public HighLevelEncoder(byte[] bArr) {
        this.f9971e = bArr;
    }

    /* renamed from: b */
    private static Collection<State> m12073b(Iterable<State> iterable) {
        LinkedList linkedList = new LinkedList();
        for (State fVar : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                State fVar2 = (State) it.next();
                if (fVar2.mo8545g(fVar)) {
                    z = false;
                    break;
                } else if (fVar.mo8545g(fVar2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(fVar);
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    private void m12074c(State fVar, int i, Collection<State> collection) {
        char c = (char) (this.f9971e[i] & 255);
        boolean z = f9969c[fVar.mo8544f()][c] > 0;
        State fVar2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f9969c[i2][c];
            if (i3 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.mo8541c(i);
                }
                if (!z || i2 == fVar.mo8544f() || i2 == 2) {
                    collection.add(fVar2.mo8546h(i2, i3));
                }
                if (!z && f9970d[fVar.mo8544f()][i2] >= 0) {
                    collection.add(fVar2.mo8547i(i2, i3));
                }
            }
        }
        if (fVar.mo8542d() > 0 || f9969c[fVar.mo8544f()][c] == 0) {
            collection.add(fVar.mo8540a(i));
        }
    }

    /* renamed from: d */
    private static void m12075d(State fVar, int i, int i2, Collection<State> collection) {
        State c = fVar.mo8541c(i);
        collection.add(c.mo8546h(4, i2));
        if (fVar.mo8544f() != 4) {
            collection.add(c.mo8547i(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(c.mo8546h(2, 16 - i2).mo8546h(2, 1));
        }
        if (fVar.mo8542d() > 0) {
            collection.add(fVar.mo8540a(i).mo8540a(i + 1));
        }
    }

    /* renamed from: e */
    private Collection<State> m12076e(Iterable<State> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (State c : iterable) {
            m12074c(c, i, linkedList);
        }
        return m12073b(linkedList);
    }

    /* renamed from: f */
    private static Collection<State> m12077f(Iterable<State> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (State d : iterable) {
            m12075d(d, i, i2, linkedList);
        }
        return m12073b(linkedList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p067c.google.p138c.p141j.BitArray mo8536a() {
        /*
            r8 = this;
            c.a.c.i.b.f r0 = p067c.p068a.p138c.p139i.p140b.State.f9975a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = 0
        L_0x0008:
            byte[] r3 = r8.f9971e
            int r4 = r3.length
            if (r2 >= r4) goto L_0x004c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0015
            byte r5 = r3[r4]
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            byte r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L_0x0038
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L_0x0034
            r6 = 46
            if (r3 == r6) goto L_0x0030
            r6 = 58
            if (r3 == r6) goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x003d
        L_0x002c:
            if (r5 != r7) goto L_0x002a
            r3 = 5
            goto L_0x003d
        L_0x0030:
            if (r5 != r7) goto L_0x002a
            r3 = 3
            goto L_0x003d
        L_0x0034:
            if (r5 != r7) goto L_0x002a
            r3 = 4
            goto L_0x003d
        L_0x0038:
            r3 = 10
            if (r5 != r3) goto L_0x002a
            r3 = 2
        L_0x003d:
            if (r3 <= 0) goto L_0x0045
            java.util.Collection r0 = m12077f(r0, r2, r3)
            r2 = r4
            goto L_0x0049
        L_0x0045:
            java.util.Collection r0 = r8.m12076e(r0, r2)
        L_0x0049:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x004c:
            c.a.c.i.b.d$a r1 = new c.a.c.i.b.d$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            c.a.c.i.b.f r0 = (p067c.p068a.p138c.p139i.p140b.State) r0
            byte[] r1 = r8.f9971e
            c.a.c.j.a r0 = r0.mo8548j(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067c.p068a.p138c.p139i.p140b.HighLevelEncoder.mo8536a():c.a.c.j.a");
    }
}
