package androidx.recyclerview.widget;

import java.util.List;

/* renamed from: androidx.recyclerview.widget.i */
class OpReorderer {

    /* renamed from: a */
    final C0471a f3130a;

    /* renamed from: androidx.recyclerview.widget.i$a */
    /* compiled from: OpReorderer */
    interface C0471a {
        /* renamed from: a */
        void mo3745a(C0451b bVar);

        /* renamed from: b */
        C0451b mo3746b(int i, int i2, int i3, Object obj);
    }

    OpReorderer(C0471a aVar) {
        this.f3130a = aVar;
    }

    /* renamed from: a */
    private int m3822a(List<C0451b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C0451b) list.get(size)).f2998a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m3823c(List<C0451b> list, int i, C0451b bVar, int i2, C0451b bVar2) {
        int i3 = bVar.f3001d;
        int i4 = bVar2.f2999b;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = bVar.f2999b;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            bVar.f2999b = i6 + bVar2.f3001d;
        }
        int i7 = bVar2.f2999b;
        if (i7 <= i3) {
            bVar.f3001d = i3 + bVar2.f3001d;
        }
        bVar2.f2999b = i7 + i5;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* renamed from: d */
    private void m3824d(List<C0451b> list, int i, int i2) {
        C0451b bVar = (C0451b) list.get(i);
        C0451b bVar2 = (C0451b) list.get(i2);
        int i3 = bVar2.f2998a;
        if (i3 == 1) {
            m3823c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            mo3856e(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            mo3857f(list, i, bVar, i2, bVar2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3855b(List<C0451b> list) {
        while (true) {
            int a = m3822a(list);
            if (a != -1) {
                m3824d(list, a, a + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3856e(java.util.List<androidx.recyclerview.widget.AdapterHelper.C0451b> r10, int r11, androidx.recyclerview.widget.AdapterHelper.C0451b r12, int r13, androidx.recyclerview.widget.AdapterHelper.C0451b r14) {
        /*
            r9 = this;
            int r0 = r12.f2999b
            int r1 = r12.f3001d
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L_0x0016
            int r4 = r14.f2999b
            if (r4 != r0) goto L_0x0014
            int r4 = r14.f3001d
            int r0 = r1 - r0
            if (r4 != r0) goto L_0x0014
            r0 = 0
            goto L_0x0022
        L_0x0014:
            r0 = 0
            goto L_0x0025
        L_0x0016:
            int r4 = r14.f2999b
            int r5 = r1 + 1
            if (r4 != r5) goto L_0x0024
            int r4 = r14.f3001d
            int r0 = r0 - r1
            if (r4 != r0) goto L_0x0024
            r0 = 1
        L_0x0022:
            r2 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            int r4 = r14.f2999b
            r5 = 2
            if (r1 >= r4) goto L_0x002e
            int r4 = r4 - r3
            r14.f2999b = r4
            goto L_0x0047
        L_0x002e:
            int r6 = r14.f3001d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x0047
            int r6 = r6 - r3
            r14.f3001d = r6
            r12.f2998a = r5
            r12.f3001d = r3
            int r11 = r14.f3001d
            if (r11 != 0) goto L_0x0046
            r10.remove(r13)
            androidx.recyclerview.widget.i$a r10 = r9.f3130a
            r10.mo3745a(r14)
        L_0x0046:
            return
        L_0x0047:
            int r1 = r12.f2999b
            int r4 = r14.f2999b
            r6 = 0
            if (r1 > r4) goto L_0x0052
            int r4 = r4 + r3
            r14.f2999b = r4
            goto L_0x0068
        L_0x0052:
            int r7 = r14.f3001d
            int r8 = r4 + r7
            if (r1 >= r8) goto L_0x0068
            int r4 = r4 + r7
            int r4 = r4 - r1
            androidx.recyclerview.widget.i$a r7 = r9.f3130a
            int r1 = r1 + r3
            androidx.recyclerview.widget.a$b r6 = r7.mo3746b(r5, r1, r4, r6)
            int r1 = r12.f2999b
            int r3 = r14.f2999b
            int r1 = r1 - r3
            r14.f3001d = r1
        L_0x0068:
            if (r2 == 0) goto L_0x0076
            r10.set(r11, r14)
            r10.remove(r13)
            androidx.recyclerview.widget.i$a r10 = r9.f3130a
            r10.mo3745a(r12)
            return
        L_0x0076:
            if (r0 == 0) goto L_0x00a7
            if (r6 == 0) goto L_0x0090
            int r0 = r12.f2999b
            int r1 = r6.f2999b
            if (r0 <= r1) goto L_0x0085
            int r1 = r6.f3001d
            int r0 = r0 - r1
            r12.f2999b = r0
        L_0x0085:
            int r0 = r12.f3001d
            int r1 = r6.f2999b
            if (r0 <= r1) goto L_0x0090
            int r1 = r6.f3001d
            int r0 = r0 - r1
            r12.f3001d = r0
        L_0x0090:
            int r0 = r12.f2999b
            int r1 = r14.f2999b
            if (r0 <= r1) goto L_0x009b
            int r1 = r14.f3001d
            int r0 = r0 - r1
            r12.f2999b = r0
        L_0x009b:
            int r0 = r12.f3001d
            int r1 = r14.f2999b
            if (r0 <= r1) goto L_0x00d5
            int r1 = r14.f3001d
            int r0 = r0 - r1
            r12.f3001d = r0
            goto L_0x00d5
        L_0x00a7:
            if (r6 == 0) goto L_0x00bf
            int r0 = r12.f2999b
            int r1 = r6.f2999b
            if (r0 < r1) goto L_0x00b4
            int r1 = r6.f3001d
            int r0 = r0 - r1
            r12.f2999b = r0
        L_0x00b4:
            int r0 = r12.f3001d
            int r1 = r6.f2999b
            if (r0 < r1) goto L_0x00bf
            int r1 = r6.f3001d
            int r0 = r0 - r1
            r12.f3001d = r0
        L_0x00bf:
            int r0 = r12.f2999b
            int r1 = r14.f2999b
            if (r0 < r1) goto L_0x00ca
            int r1 = r14.f3001d
            int r0 = r0 - r1
            r12.f2999b = r0
        L_0x00ca:
            int r0 = r12.f3001d
            int r1 = r14.f2999b
            if (r0 < r1) goto L_0x00d5
            int r1 = r14.f3001d
            int r0 = r0 - r1
            r12.f3001d = r0
        L_0x00d5:
            r10.set(r11, r14)
            int r14 = r12.f2999b
            int r0 = r12.f3001d
            if (r14 == r0) goto L_0x00e2
            r10.set(r13, r12)
            goto L_0x00e5
        L_0x00e2:
            r10.remove(r13)
        L_0x00e5:
            if (r6 == 0) goto L_0x00ea
            r10.add(r11, r6)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.OpReorderer.mo3856e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3857f(java.util.List<androidx.recyclerview.widget.AdapterHelper.C0451b> r9, int r10, androidx.recyclerview.widget.AdapterHelper.C0451b r11, int r12, androidx.recyclerview.widget.AdapterHelper.C0451b r13) {
        /*
            r8 = this;
            int r0 = r11.f3001d
            int r1 = r13.f2999b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f2999b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f3001d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f3001d = r5
            androidx.recyclerview.widget.i$a r0 = r8.f3130a
            int r1 = r11.f2999b
            java.lang.Object r5 = r13.f3000c
            androidx.recyclerview.widget.a$b r0 = r0.mo3746b(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f2999b
            int r5 = r13.f2999b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f2999b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f3001d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.i$a r3 = r8.f3130a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f3000c
            androidx.recyclerview.widget.a$b r3 = r3.mo3746b(r2, r1, r5, r4)
            int r1 = r13.f3001d
            int r1 = r1 - r5
            r13.f3001d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f3001d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.i$a r11 = r8.f3130a
            r11.mo3745a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.OpReorderer.mo3857f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
